import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PremiumFlight extends Flight {
   // Diseño de la lógica comercial para los pasajeros VIP.Pregunta 7
    public PremiumFlight(String id){super(id);}
    @Override
    public boolean addPassenger(Passenger passenger) {

        Set<Passenger> vipPassengers = new HashSet<>();
        passengers.add(passenger);
        for(Passenger _passenger:passengers){
            if(_passenger.isVip()){
                vipPassengers.add(_passenger);
            }
        }
        if(vipPassengers.size()==1){
            return true;
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