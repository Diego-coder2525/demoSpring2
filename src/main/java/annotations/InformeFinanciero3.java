package annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinanciero3 implements CreacionInformeFinanciero{
    @Override
    public String getInformeFinanciero() {
        return "Presentacion de informe favorable 3";
    }
}
