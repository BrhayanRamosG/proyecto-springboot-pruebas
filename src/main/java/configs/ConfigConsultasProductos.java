package configs;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@EnableConfigurationProperties
@PropertySource("classpath:productos.consultas.properties")
@ConfigurationProperties(prefix = "productos.query")
public @Getter @Setter class ConfigConsultasProductos {
    private String productos;
    private String producto;
}
