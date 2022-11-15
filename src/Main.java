import com.sun.scenario.effect.impl.prism.PrTexture;
import javafx.scene.input.KeyCharacterCombination;
import javafx.scene.input.KeyCombination;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Main {
    static final Robot robot;
    public static int i = 1;
    static {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }



    public Main() throws AWTException {

    }
    public static void giveItem() throws InterruptedException {

        robot.keyPress(KeyEvent.VK_G);robot.keyRelease(KeyEvent.VK_G);
        robot.keyPress(KeyEvent.VK_I);robot.keyRelease(KeyEvent.VK_I);
        robot.keyPress(KeyEvent.VK_V);robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_E);robot.keyRelease(KeyEvent.VK_E);

        robot.keyPress(KeyEvent.VK_I);robot.keyRelease(KeyEvent.VK_I);
        robot.keyPress(KeyEvent.VK_T);robot.keyRelease(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_E);robot.keyRelease(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_M);robot.keyRelease(KeyEvent.VK_M);
        robot.keyPress(KeyEvent.VK_SPACE);robot.keyRelease(KeyEvent.VK_SPACE);
        robot.keyPress(KeyEvent.VK_C);robot.keyRelease(KeyEvent.VK_C);

        switch (i) {
            case 1:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                i++;
                break;
            case 2:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                i++;
                break;
            case 3:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                i++;
                break;
            case 4:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                i++;
                break;
            case 5:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                i++;
                break;
            case 6:
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                i++;
                break;
            case 7:
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                i++;
                break;
            case 8:
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                i++;
                break;
            case 9:
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                i++;
                break;
            case 10:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                i++;
                break;
            case 11:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                i++;
                break;
            case 12:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                i++;
                break;
            case 13:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                i++;
                break;
            case 14:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                i++;
                break;
            case 15:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                i++;
                break;
            case 16:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                i++;
                break;
            case 17:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                i++;
                break;
            case 18:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                i++;
                break;
            case 19:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                i++;
                break;
            case 20:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                i++;
                break;
            case 21:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                i++;
                break;
            case 22:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                i++;
                break;
            case 23:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                i++;
                break;
            case 24:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                i++;
                break;
            case 25:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                i++;
                break;
            case 26:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                i++;
                break;
            case 27:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                i++;
                break;
            case 28:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                i++;
                break;
            case 29:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                i++;
                break;
            case 30:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                i++;
                break;
            case 31:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                i++;
                break;
            case 32:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                i++;
                break;
            case 33:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                i++;
                break;
            case 34:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                i++;
                break;
            case 35:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                i++;
                break;
            case 36:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                i++;
                break;
            case 37:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                i++;
                break;
            case 38:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                i++;
                break;
            case 39:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                i++;
                break;
            case 40:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                i++;
                break;
            case 41:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                i++;
                break;
            case 42:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                i++;
                break;
            case 43:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                i++;
                break;
            case 44:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                i++;
                break;
            case 45:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                i++;
                break;
            case 46:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                i++;
                break;
            case 47:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                i++;
                break;
            case 48:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                i++;
                break;
            case 49:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                i++;
                break;
            case 50:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                i++;
                break;
            case 51:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                i++;
                break;
            case 52:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                i++;
                break;
            case 53:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                i++;
                break;
            case 54:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                i++;
                break;
            case 55:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                i++;
                break;
            case 56:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                i++;
                break;
            case 57:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                i++;
                break;
            case 58:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                i++;
                break;
            case 59:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                i++;
                break;
            case 60:
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                i++;
                break;
            case 61:
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                i++;
                break;
            case 62:
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                i++;
                break;
            case 63:
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                i++;
                break;
            case 64:
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                i++;
                break;
            case 65:
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                i++;
                break;
            case 66:
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                i++;
                break;
            case 67:
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                i++;
                break;
            case 68:
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                i++;
                break;
            case 69:
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                i++;
                break;
            case 70:
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                i++;
                break;
            case 71:
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                i++;
                break;
            case 72:
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                i++;
                break;
            case 73:
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                i++;
                break;
            case 74:
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                i++;
                break;
            case 75:
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                i++;
                break;
            case 76:
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                i++;
                break;
            case 77:
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                i++;
                break;
            case 78:
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                i++;
                break;
            case 79:
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                i++;
                break;
            case 80:
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                i++;
                break;
            case 81:
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                i++;
                break;
            case 82:
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                i++;
                break;
            case 83:
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                i++;
                break;
            case 84:
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                i++;
                break;
            case 85:
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                i++;
                break;
            case 86:
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                i++;
                break;
            case 87:
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                i++;
                break;
            case 88:
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                i++;
                break;
            case 89:
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                i++;
                break;
            case 90:
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                i++;
                break;
            case 91:
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                i++;
                break;
            case 92:
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                i++;
                break;
            case 93:
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                i++;
                break;
            case 94:
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                i++;
                break;
            case 95:
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                i++;
                break;
            case 96:
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                i++;
                break;
            case 97:
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                i++;
                break;
            case 98:
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                i++;
                break;
            case 99:
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                i++;
                break;
            case 100:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                i++;
                break;
            case 101:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                i++;
                break;
            case 102:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                i++;
                break;
            case 103:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                i++;
                break;
            case 104:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                i++;
                break;
            case 105:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                i++;
                break;
            case 106:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                i++;
                break;
            case 107:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                i++;
                break;
            case 108:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                i++;
                break;
            case 109:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                i++;
                break;
            case 110:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                i++;
                break;
            case 111:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                i++;
                break;
            case 112:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                i++;
                break;
            case 113:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                i++;
                break;
            case 114:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                i++;
                break;
            case 115:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                i++;
                break;
            case 116:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                i++;
                break;
            case 117:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                i++;
                break;
            case 118:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                i++;
                break;
            case 119:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                i++;
                break;
            case 120:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                i++;
                break;
            case 121:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                i++;
                break;
            case 122:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                i++;
                break;
            case 123:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                i++;
                break;
            case 124:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                i++;
                break;
            case 125:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                i++;
                break;
            case 126:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                i++;
                break;
            case 127:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                i++;
                break;
            case 128:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                i++;
                break;
            case 129:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                i++;
                break;
            case 130:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                i++;
                break;
            case 131:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                i++;
                break;
            case 132:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                i++;
                break;
            case 133:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                i++;
                break;
            case 134:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                i++;
                break;
            case 135:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                i++;
                break;
            case 136:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                i++;
                break;
            case 137:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                i++;
                break;
            case 138:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                i++;
                break;
            case 139:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                i++;
                break;
            case 140:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                i++;
                break;
            case 141:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                i++;
                break;
            case 142:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                i++;
                break;
            case 143:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                i++;
                break;
            case 144:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                i++;
                break;
            case 145:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                i++;
                break;
            case 146:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                i++;
                break;
            case 147:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                i++;
                break;
            case 148:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                i++;
                break;
            case 149:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                i++;
                break;
            case 150:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                i++;
                break;
            case 151:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                i++;
                break;
            case 152:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                i++;
                break;
            case 153:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                i++;
                break;
            case 154:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                i++;
                break;
            case 155:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                i++;
                break;
            case 156:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                i++;
                break;
            case 157:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                i++;
                break;
            case 158:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                i++;
                break;
            case 159:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                i++;
                break;
            case 160:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                i++;
                break;
            case 161:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                i++;
                break;
            case 162:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                i++;
                break;
            case 163:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                i++;
                break;
            case 164:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                i++;
                break;
            case 165:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                i++;
                break;
            case 166:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                i++;
                break;
            case 167:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                i++;
                break;
            case 168:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                i++;
                break;
            case 169:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                i++;
                break;
            case 170:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                i++;
                break;
            case 171:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                i++;
                break;
            case 172:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                i++;
                break;
            case 173:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                i++;
                break;
            case 174:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                i++;
                break;
            case 175:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                i++;
                break;
            case 176:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                i++;
                break;
            case 177:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                i++;
                break;
            case 178:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                i++;
                break;
            case 179:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                i++;
                break;
            case 180:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                i++;
                break;
            case 181:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                i++;
                break;
            case 182:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                i++;
                break;
            case 183:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                i++;
                break;
            case 184:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                i++;
                break;
            case 185:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                i++;
                break;
            case 186:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                i++;
                break;
            case 187:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                i++;
                break;
            case 188:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                i++;
                break;
            case 189:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                i++;
                break;
            case 190:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                i++;
                break;
            case 191:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                i++;
                break;
            case 192:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                i++;
                break;
            case 193:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                i++;
                break;
            case 194:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                i++;
                break;
            case 195:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                i++;
                break;
            case 196:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                i++;
                break;
            case 197:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                i++;
                break;
            case 198:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                i++;
                break;
            case 199:
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                i++;
                break;
            case 200:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                i++;
                break;
            case 201:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                i++;
                break;
            case 202:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                i++;
                break;
            case 203:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                i++;
                break;
            case 204:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                i++;
                break;
            case 205:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                i++;
                break;
            case 206:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                i++;
                break;
            case 207:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                i++;
                break;
            case 208:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                i++;
                break;
            case 209:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                i++;
                break;
            case 210:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                i++;
                break;
            case 211:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                i++;
                break;
            case 212:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                i++;
                break;
            case 213:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                i++;
                break;
            case 214:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                i++;
                break;
            case 215:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                i++;
                break;
            case 216:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                i++;
                break;
            case 217:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                i++;
                break;
            case 218:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                i++;
                break;
            case 219:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                i++;
                break;
            case 220:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                i++;
                break;
            case 221:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                i++;
                break;
            case 222:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                i++;
                break;
            case 223:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                i++;
                break;
            case 224:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                i++;
                break;
            case 225:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                i++;
                break;
            case 226:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                i++;
                break;
            case 227:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                i++;
                break;
            case 228:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                i++;
                break;
            case 229:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                i++;
                break;
            case 230:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                i++;
                break;
            case 231:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                i++;
                break;
            case 232:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                i++;
                break;
            case 233:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                i++;
                break;
            case 234:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                i++;
                break;
            case 235:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                i++;
                break;
            case 236:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                i++;
                break;
            case 237:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                i++;
                break;
            case 238:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                i++;
                break;
            case 239:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                i++;
                break;
            case 240:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                i++;
                break;
            case 241:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                i++;
                break;
            case 242:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                i++;
                break;
            case 243:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                i++;
                break;
            case 244:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                i++;
                break;
            case 245:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                i++;
                break;
            case 246:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                i++;
                break;
            case 247:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                i++;
                break;
            case 248:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                i++;
                break;
            case 249:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                i++;
                break;
            case 250:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                i++;
                break;
            case 251:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                i++;
                break;
            case 252:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                i++;
                break;
            case 253:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                i++;
                break;
            case 254:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                i++;
                break;
            case 255:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                i++;
                break;
            case 256:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                i++;
                break;
            case 257:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                i++;
                break;
            case 258:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                i++;
                break;
            case 259:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                i++;
                break;
            case 260:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                i++;
                break;
            case 261:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                i++;
                break;
            case 262:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                i++;
                break;
            case 263:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                  i++;
                break;
            case 264:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                 i++;
                break;
            case 265:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                     i++;
                break;
            case 266:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                    i++;
                break;
            case 267:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                     i++;
                break;
            case 268:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                     i++;
                break;

            case 269:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                     i++;
                break;
            case 270:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                     i++;
                break;
            case 271:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                    i++;
                break;
            case 272:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                     i++;
                break;
            case 273:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                      i++;
                break;
            case 274:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                       i++;
                break;
            case 275:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                i++;
                break;
            case 276:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                i++;
                break;
            case 277:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                i++;
                break;
            case 278:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                i++;
                break;
            case 279:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                i++;
                break;
            case 280:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                i++;
                break;
            case 281:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                i++;
                break;
            case 282:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                i++;
                break;
            case 283:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                i++;
                break;
            case 284:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                i++;
                break;
            case 285:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                i++;
                break;
            case 286:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                i++;
                break;
            case 287:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                i++;
                break;
            case 288:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                i++;
                break;
            case 289:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                i++;
                break;
            case 290:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                i++;
                break;
            case 291:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                i++;
                break;
            case 292:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                i++;
                break;
            case 293:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                i++;
                break;
            case 294:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                i++;
                break;
            case 295:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_6);
                i++;
                break;
            case 296:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_7);
                i++;
                break;
            case 297:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_8);
                i++;
                break;
            case 298:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_9);
                i++; 
                break;
            case 299:
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                break;
            case 300:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 301:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                break;
            case 302:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                break;
            case 303:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                break;
            case 304:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                break;
            case 305:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 306:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 307:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 308:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 309:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 310:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 311:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 312:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 313:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 314:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 315:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 316:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 317:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 318:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 319:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 320:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 321:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 322:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 323:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 324:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 325:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 326:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 327:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 328:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 329:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 330:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 331:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 332:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 333:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 334:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 335:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 336:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 337:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 338:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 339:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 340:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 341:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 342:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 343:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 344:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 345:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 346:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 347:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 348:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 349:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 350:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 351:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 352:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 353:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 354:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 355:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 356:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 357:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 358:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 359:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 360:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 361:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 362:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 363:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 364:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 365:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 366:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 367:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 368:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 369:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 370:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 371:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 372:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 373:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 374:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 375:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 376:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 377:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 378:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 379:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 380:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 381:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 382:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 383:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 384:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 385:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 386:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 387:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 388:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 389:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 390:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 391:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 392:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 393:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 394:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 395:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 396:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 397:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 398:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 399:
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 400:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 401:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 402:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 403:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 404:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 405:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 406:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 407:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 408:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 409:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 410:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 411:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 412:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 413:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 414:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 415:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 416:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 417:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 418:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 419:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_1);robot.keyRelease(KeyEvent.VK_1);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 420:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 421:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 422:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 423:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 424:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 425:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 426:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 427:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 428:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 429:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_2);robot.keyRelease(KeyEvent.VK_2);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 430:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 431:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 432:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 433:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 434:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 435:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 436:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 437:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 438:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 439:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_3);robot.keyRelease(KeyEvent.VK_3);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 440:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 441:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 442:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 443:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 444:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 445:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 446:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 447:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 448:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 449:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 450:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 451:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 452:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 453:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 454:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 455:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 456:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 457:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 458:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 459:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 460:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 461:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 462:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 463:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 464:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 465:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 466:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 467:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 468:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 469:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_6);robot.keyRelease(KeyEvent.VK_6);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 470:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 471:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 472:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 473:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 474:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 475:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 476:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 477:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 478:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 479:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_7);robot.keyRelease(KeyEvent.VK_7);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 480:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 481:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 482:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 483:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 484:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 485:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 486:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 487:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 488:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 489:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_8);robot.keyRelease(KeyEvent.VK_8);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 490:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 491:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 492:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 493:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 494:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 495:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 496:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 497:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 498:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 499:
                robot.keyPress(KeyEvent.VK_4);robot.keyRelease(KeyEvent.VK_4);
                robot.keyPress(KeyEvent.VK_9);robot.keyRelease(KeyEvent.VK_9);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 500:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 501:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 502:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 503:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 504:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 505:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 506:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 507:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 508:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 509:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 510:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 511:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 512:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 513:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 514:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 515:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 516:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 517:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 518:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 519:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 520:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 521:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 522:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 523:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 524:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 525:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 526:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 527:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 528:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 529:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 530:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 531:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 532:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 533:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 534:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 535:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 536:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 537:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 538:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 539:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 540:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 541:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 542:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 543:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 544:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 545:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 546:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 547:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 548:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 549:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 550:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 551:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 552:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
            case 553:
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_5);robot.keyRelease(KeyEvent.VK_5);
                robot.keyPress(KeyEvent.VK_0);robot.keyRelease(KeyEvent.VK_0);
                break;
        }
        robot.keyPress(KeyEvent.VK_SPACE);robot.keyRelease(KeyEvent.VK_SPACE);
    }

    public static void main(String[] args) throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        for(int i = 1; i<554; i++) {
            giveItem();
            TimeUnit.MILLISECONDS.sleep(40);
            robot.keyPress(KeyEvent.VK_ENTER);robot.keyRelease(KeyEvent.VK_ENTER);
        }
    }
}
                                                                                                        