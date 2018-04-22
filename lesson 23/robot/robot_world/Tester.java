

public class Tester {
    
    public static void main(String[] args) throws Exception {
        
        RobotWorld rw = new RobotWorld("/home/saken/Desktop/CSCI_152/lesson 23/robot/robot_world/map1.txt");
        rw.printCurrentWorldMap();
        
        rw.moveForward();
        rw.printCurrentWorldMap();
        
        rw.rotateClockwise();
        rw.printCurrentWorldMap();
        
        for (int i = 0; i < 5; i++) {
        	rw.moveForward();
        	rw.printCurrentWorldMap();
        }
        rw.rotateClockwise();
        for (int i = 0; i < 6; i++) {
            rw.moveForward();
            rw.printCurrentWorldMap();
        }
        rw.rotateClockwise();
        for (int i = 0; i < 4; i++) {
            rw.moveForward();
            rw.printCurrentWorldMap();
        }
        rw.rotateClockwise();
        for (int i = 0; i < 3; i++) {
            rw.moveForward();
            rw.printCurrentWorldMap();
        }
        rw.rotateClockwise();
        for (int i = 0; i < 3; i++) {
            rw.moveForward();
            rw.printCurrentWorldMap();
        }
    }
}
