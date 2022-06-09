package 单一职责模式;

public class SingleResponsibility2 {

    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        AirVehicle airVehicle = new AirVehicle();
        roadVehicle.run("单车");
        roadVehicle.run("汽车");
        airVehicle.run("飞机");
    }


    static class RoadVehicle {

        public void run(String vehicle) {
            System.out.println(vehicle + "在公路上运行");
        }
    }

    static class AirVehicle {

        public void run(String vehicle) {
            System.out.println(vehicle + "在天空上运行");
        }
    }
}
