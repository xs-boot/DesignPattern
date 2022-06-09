package 单一职责模式;

public class SingleResponsibility3 {

    public static void main(String[] args) {
        Vehicle roadVehicle = new Vehicle();
        //远程添加代码
        roadVehicle.runRoad("单车");
        roadVehicle.runWater("军舰");
        roadVehicle.runAir("飞机");
        roadVehicle.runAir("飞机");
        roadVehicle.runAir("飞机");
        roadVehicle.runAir("飞机");
        roadVehicle.runAir("飞机");

    }


    // 这种修改方式没有对原来的类做大的修改，知识增加方法
    // 没有在类的级别上遵守单一职责原则，但是在方法上遵守了单一职责原则
    static class Vehicle {

        public void runRoad(String vehicle) {
            System.out.println(vehicle + "在公路上运行");
        }

        public void runWater(String vehicle) {
            System.out.println(vehicle + "在水上运行");
        }

        public void runAir(String vehicle) {
            System.out.println(vehicle + "在天空上运行");
        }
    }
}
