package KingCalculationPoints.SpringJavaConfig;

import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class KingAppMvcDispatcherServletInitialization extends AbstractAnnotationConfigDispatcherServletInitializer {
        // Метод не нужен, возвращаем null
        @Override
        protected Class<?>[] getRootConfigClasses() {
            return null;
        }

//      <!-- файл настроек -->
        @Override
        protected Class<?>[] getServletConfigClasses() {
            return new Class[] {KingAppMvcJavaConfig.class};
        }

//    <!-- диспатчер принимает ВСЕ "/" запросы от пользователя -->
//    <url-pattern>/</url-pattern>
        @Override
        protected String[] getServletMappings() {
            return new String[] {"/"};
        }

//    Сервлет-фильтр-кастыль для методов CRUD в html5
//    перенаправляет на @PatchMapping методы Spring
        @Override
        public void onStartup(ServletContext aServletContext) throws ServletException {
            super.onStartup(aServletContext);
            registerHiddenFieldFilter(aServletContext);
        }

        // hiddenHttpMethodFilter - готовый фильтр из Спринга
        private void registerHiddenFieldFilter(ServletContext aContext) {
            aContext.addFilter("hiddenHttpMethodFilter",
                    new HiddenHttpMethodFilter()).addMappingForUrlPatterns(null ,true, "/*");
        }

}
