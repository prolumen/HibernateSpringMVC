package persistence;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class SringHibernateUtil {
    SessionFactory sessionFactory = new MetadataSources(
            new StandardServiceRegistryBuilder()
                    .configure("hibernate.cfg.xml").build())
            .buildMetadata().buildSessionFactory();

    StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();

    public void setServiceRegistryBuilder(StandardServiceRegistryBuilder serviceRegistryBuilder) {
        this.serviceRegistryBuilder = serviceRegistryBuilder;
            serviceRegistryBuilder.applySetting("hibernate.connection.url", "jdbc:mysql://127.0.0.1:3306/my_db" +
            "?verifyServerCertificate=false" +
            "&useSSL=false" +
            "&requireSSL=false" +
            "&useLegacyDatetimeCode=false" +
            "&amp" +
            "&serverTimezone=UTC");
            serviceRegistryBuilder.applySetting("hibernate.connection.username", "student");
            serviceRegistryBuilder.applySetting("hibernate.connection.password", "password");
            serviceRegistryBuilder.applySetting("dialect", "org.hibernate.dialect.MySQLDialect");
            serviceRegistryBuilder.applySetting("format_sql", "true");
            serviceRegistryBuilder.applySetting("show_sql", "true");

    }
}
