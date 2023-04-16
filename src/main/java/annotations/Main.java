package annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");

        Empleados Juan = context.getBean("comercialExperimentado", Empleados.class);
        System.out.println(Juan.getTareas());
        System.out.println(Juan.getInforme());

        context.close();
    }
}
