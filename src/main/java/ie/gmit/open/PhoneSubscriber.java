//Evan Garvey
//SoftwareEng with Test
//Design Principals lab
//This class have been changed to follow the open-closed principal
package ie.gmit.open;

import java.util.List;

public class PhoneSubscriber extends Subscriber {

    private int baseRate;

    public double calculateBill() {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(subscriberId);
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return totalDuration*baseRate/100;
    }


    public int getBaseRate() {
        return baseRate;
    }

    /**
     * @param baseRate the baseRate to set
     */
    public void setBaseRate(int baseRate) {
        this.baseRate = baseRate;
    }

}