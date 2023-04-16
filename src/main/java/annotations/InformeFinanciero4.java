package annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinanciero4 implements CreacionInformeFinanciero{
    @Override
    public String getInformeFinanciero() {

        return "Presentacion de informe de cierre 4";
    }
}
