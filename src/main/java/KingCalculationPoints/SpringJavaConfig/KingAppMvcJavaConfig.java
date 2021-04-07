package KingCalculationPoints.SpringJavaConfig;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

import javax.sql.DataSource;

@Configuration
@ComponentScan("KingCalculationPoints")
@EnableWebMvc
public class KingAppMvcJavaConfig implements WebMvcConfigurer {

    private final ApplicationContext applicationContext;

    @Autowired
    public KingAppMvcJavaConfig(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    // Настраиваем шабланизатор
    @Bean
    public SpringResourceTemplateResolver templateResolver() {
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setApplicationContext(applicationContext);
        templateResolver.setPrefix("/WEB-INF/views/");
        templateResolver.setSuffix(".html");
        return templateResolver;
    }

    @Bean
    public SpringTemplateEngine templateEngine() {
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver());
        templateEngine.setEnableSpringELCompiler(true);
        return templateEngine;
    }

    // Вместо станд шабланизатора задаем Спрингу шабланизатор Таймлиф
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
        resolver.setTemplateEngine(templateEngine());
        registry.viewResolver(resolver);
    }

    // Здесь настраиваем доступ к SQL, что бы не настраивать эти данные в Java-классах
    // Конфиг подключения к базе надо вынести во внешний файл
    @Bean
    public DataSource setDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/kingcalcpointswebapp_db");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgresql");

        return dataSource;
    }

    // Настройка Spring Template заменяет все многострочные обращения через JDBC и многочисленные обертки try/catch
    @Bean
    public JdbcTemplate getJdbсTemplate() {
        return new JdbcTemplate(setDataSource());
    }
}
