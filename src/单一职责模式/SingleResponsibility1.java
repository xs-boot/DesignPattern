package 单一职责模式;

public class SingleResponsibility1 {

    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("单车");
        roadVehicle.run("汽车");
        roadVehicle.run("飞机");
    }


    static class RoadVehicle {

        public void run(String vehicle) {
            System.out.println(vehicle + "在公路上运行");
        }
    }
}
