package hibernate.utils.options;

import hibernate.model.Entretenimiento;
import hibernate.model.Gasto;
import hibernate.model.Pasajero;
import org.hibernate.Session;

public class Exercise4aOption extends Option {
    public void execute(Session session) {
        Pasajero pasajero = new Pasajero("Din Djarin");
        Entretenimiento entretenimiento = new Entretenimiento("Bounty hunting");
        Gasto gasto = new Gasto(pasajero, entretenimiento, 100);
        session.save(pasajero);
        session.save(entretenimiento);
        session.save(gasto);
    }
}
