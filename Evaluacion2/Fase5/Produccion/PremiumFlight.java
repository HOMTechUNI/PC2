import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PremiumFlight extends Flight {
   // Diseño de la lógica comercial para los pasajeros VIP.Pregunta 7
    public PremiumFlight(String id){super(id);}
    Set<Passenger> vipPassengers = new HashSet<>();
    @Override
    public boolean addPassenger(Passenger passenger) {
        if(passenger.isVip()) {
            passengers.add(passenger);
            for (Passenger _passenger : passengers) {
                if (_passenger.isVip() && (vipPassengers.size() <= 1)) {
                    return vipPassengers.add(_passenger);
                }
            }
        }
        return false;
    }

    @Override
    public boolean removePassenger(Passenger passenger) {
        if (!passenger.isVip()) {
            return passengers.remove(passenger);
        }
        return false;
    }
}