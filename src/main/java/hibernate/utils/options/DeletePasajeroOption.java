package hibernate.utils.options;

import hibernate.model.Pasajero;
import org.hibernate.Session;

public class DeletePasajeroOption extends Option {
    public void execute(Session session) {
        Pasajero pasajero = session.load(Pasajero.class, 8L);
        session.delete(pasajero);
    }
}
