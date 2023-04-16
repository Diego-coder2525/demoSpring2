package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// No tiene que coincidir el id con el nombre de la clase --> @Component("ComercialExperimentado")
// Se puede prescindir de especificar el id, y el id se establece como el nombre
// de la clase con la primera letra en minuscula --> comercialExperimentado
// No se puede trabajar con postconstruct y predestroy en --> @Scope("prototype")
@Component
public class ComercialExperimentado implements Empleados{

    //Autowired, inyeccion con campos --> concepto de Reflexion
    @Autowired
    @Qualifier("informeFinanciero2") // Bing id que debe utilizar al haber varios candidatos
    private CreacionInformeFinanciero nuevoInforme;


    // Autowired con constructor --> busca en el proyecto clase que implemente CreacionInformeFinanciero(interfaz),
    // devuelve o inyecta en esta clase la informacion del metodo sobreescrito
    // Se debe especificar el autowired cuando solo hay un constructor
    /*@Autowired
    public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
        this.nuevoInforme = nuevoInforme;
    }*/

    // Autowired con metodos
    /*
    @Autowired
    public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
        this.nuevoInforme = nuevoInforme;
    }*/



    @Override
    public String getTareas() {
        return "Vender, vender y vender";
    }

    @Override
    public String getInforme() {
        return nuevoInforme.getInformeFinanciero();
    }


    //PUEDEN SER PUBLIC PRIVATE O PROTECTED,
    //SIN ARGUMENTOS, DEVUELVEN CUALQUIER TIPO PERO DIFICIL DE CAPTURAR ------->

    //Despues de creacion de bean
    @PostConstruct
    public void init(){
        System.out.println("Ejecutado tras creacion!");
    }
    //Despues apagado
    @PreDestroy
    public void destroy(){
        System.out.println("Ejecutado antes de destruccion!");
    }
    // <---------------

}
