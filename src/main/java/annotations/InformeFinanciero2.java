package annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinanciero2 implements CreacionInformeFinanciero{
    @Override
    public String getInformeFinanciero() {
        return "Presentacion de informe catastrofico 2";
    }
}
