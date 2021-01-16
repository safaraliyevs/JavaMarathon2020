package day11.Task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDelivreredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDelivreredOrders;
    }

    public void incrementPickedOrders() {
        countPickedOrders++;

    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countPickedOrders=" + countPickedOrders +
                ", countDelivreredOrders=" + countDelivreredOrders +
                '}';
    }

    public void incrementDeliveredOrders() {
        countDelivreredOrders++;
    }

}
