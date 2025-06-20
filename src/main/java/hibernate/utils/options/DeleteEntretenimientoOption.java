package hibernate.utils.options;

import hibernate.model.Entretenimiento;
import org.hibernate.Session;

public class DeleteEntretenimientoOption extends Option {
    public void execute(Session session) {
        Entretenimiento entretenimiento = session.load(Entretenimiento.class, 4L);
        session.delete(entretenimiento);
    }
}
