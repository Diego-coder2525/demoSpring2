package annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration // denotar que es el archivo de configuracion
@ComponentScan("annotations") // <-- Paquete a escanear
@PropertySource("classpath:datos") // importar propiedades desde archivo externo
public class EmpleadosConfig {
    // definir bean para infoFinDtoCom
    @Bean // <-- nombre del metodo sera el id del bean
    public CreacionInformeFinanciero informeFinancieroDtoCompras(){
        return new InformeFinancieroDtoCompras();
    }

    // definir bean para dirFin e inyectar dependencias
    @Bean
    public Empleados directorFinanciero(){
        return new DirectorFinanciero(informeFinancieroDtoCompras());
    }
}
