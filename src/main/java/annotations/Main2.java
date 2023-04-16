package annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
    public static void main(String[] args){
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");

        //Leer el class de configuracion
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmpleadosConfig.class);


        //Empleados Juan = context.getBean("comercialExperimentado", Empleados.class);
        //Empleados Antonio = context.getBean("comercialExperimentado", Empleados.class);
        DirectorFinanciero Maria = context.getBean("directorFinanciero",DirectorFinanciero.class);
        System.out.println(Maria.getInforme());
        System.out.println(Maria.getTareas());
        System.out.println(Maria.getEmail());
        System.out.println(Maria.getNombreEmpresa());

        context.close();
    }
}
