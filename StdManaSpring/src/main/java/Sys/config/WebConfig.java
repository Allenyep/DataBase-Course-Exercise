package Sys.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/*
 * Created by tanjian on 16/9/14.
 * 配置类
 */
@Configuration
@EnableWebMvc
@ComponentScan("Sys.web")
public class WebConfig extends WebMvcConfigurerAdapter {
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/views/");
        resolver.setSuffix(".html");
        resolver.setExposeContextBeansAsAttributes(true);
        return resolver;
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    /*配置C3P0数据库连接池*/
   /* @Bean
    public ComboPooledDataSource dataSource() throws PropertyVetoException {
        ComboPooledDataSource ds=new ComboPooledDataSource();
        ds.setDriverClass("com.mysql.jdbc.Driver");
        ds.setJdbcUrl("jdbc:mysql://");
        ds.setUser("");
        ds.setPassword("");
        ds.setInitialPoolSize(5);
        ds.setMaxPoolSize(10);
        ds.setMinPoolSize(3);
        ds.setMaxIdleTime(600);
        return ds;
    }*/
/*
    *//*配置Hibernate4*//*
    @Bean
    public LocalSessionFactoryBean sessionFactoryBean(DataSource dataSource){
        LocalSessionFactoryBean sfb=new LocalSessionFactoryBean();
        sfb.setDataSource(dataSource);
        sfb.setPackagesToScan(new String[]{"spittr.data"});
        Properties props=new Properties();
        props.setProperty("dialect","org.hibernate.dialect.MySQLInnoDBDialect");
        props.setProperty("show_sql","true");
        sfb.setHibernateProperties(props);
        return sfb;
    }*/
}
