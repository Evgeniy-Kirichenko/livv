package An;

class AntWH {
    public static void main(String[] args) {
        new Frame().creatWin(new FrameWorkWjrGUI(100, 200, 200, 500));
    }
}

////////////////////////////////////
//Фреймовк GUI
class FrameWorkWjrGUI {
    int x, y, w, h;

    public FrameWorkWjrGUI(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    void wisible() {
        System.out.println("Появилось окно");
    }
}

interface Interface {
    public void creatWin(FrameWorkWjrGUI gui);
}

/////////////////////////////////
class Frame implements Interface {

    public void creatWin(FrameWorkWjrGUI gui) {
        gui.wisible();

    }
}
