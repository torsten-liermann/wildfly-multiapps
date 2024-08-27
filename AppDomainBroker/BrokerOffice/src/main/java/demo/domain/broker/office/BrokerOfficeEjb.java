package demo.domain.broker.office;

import jakarta.ejb.Stateless;

@Stateless
public class BrokerOfficeEjb {
    public String hello() {
        return "Hello, Broker Office Ejb";
    }
}
