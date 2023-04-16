package annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinanciero implements CreacionInformeFinanciero{

    @Override
    public String getInformeFinanciero() {
        return "Presentacion de informe financiero 1.";
    }
}
