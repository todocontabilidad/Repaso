package Funciones;

public class CubeAnimation {

    static float A, B, C;
    static float cubeWidth = 20;
    static int width = 160, height = 44;
    static float[] zBuffer = new float[160 * 44];
    static char[] buffer = new char[160 * 44];
    static int backgroundASCIICode = '.';
    static int distanceFromCam = 100;
    static float horizontalOffset;
    static float K1 = 40;
    static float incrementSpeed = (float) 0.05;  // Adjust the speed of rotation
    static float x, y, z;
    static float ooz;
    static int xp, yp;
    static int idx;

    static float[][] rotationMatrix = new float[3][3];

    static {
        // Initialize rotation matrix (identity matrix for now)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                rotationMatrix[i][j] = (i == j) ? 1.0f : 0.0f;
            }
        }
    }

    static void updateRotationMatrix() {
        // Update the rotation matrix based on angles A, B, C
        rotationMatrix[0][0] = (float) (Math.cos(A) * Math.cos(C) - Math.sin(A) * Math.sin(B) * Math.sin(C));
        rotationMatrix[0][1] = (float) (-Math.sin(A) * Math.cos(B));
        rotationMatrix[0][2] = (float) (Math.cos(A) * Math.sin(C) + Math.sin(A) * Math.sin(B) * Math.cos(C));

        rotationMatrix[1][0] = (float) (Math.sin(A) * Math.cos(C) + Math.cos(A) * Math.sin(B) * Math.sin(C));
        rotationMatrix[1][1] = (float) (Math.cos(A) * Math.cos(B));
        rotationMatrix[1][2] = (float) (Math.sin(A) * Math.sin(C) - Math.cos(A) * Math.sin(B) * Math.cos(C));

        rotationMatrix[2][0] = (float) (-Math.cos(B) * Math.sin(C));
        rotationMatrix[2][1] = (float) Math.sin(B);
        rotationMatrix[2][2] = (float) ((float) Math.cos(B) * Math.cos(C));
    }

    static float calculateX(int i, int j, int k) {
        return rotationMatrix[0][0] * i + rotationMatrix[0][1] * j + rotationMatrix[0][2] * k;
    }

    static float calculateY(int i, int j, int k) {
        return rotationMatrix[1][0] * i + rotationMatrix[1][1] * j + rotationMatrix[1][2] * k;
    }

    static float calculateZ(int i, int j, int k) {
        return rotationMatrix[2][0] * i + rotationMatrix[2][1] * j + rotationMatrix[2][2] * k;
    }

    static void calculateForSurface(float cubeX, float cubeY, float cubeZ, char ch) {
        x = calculateX((int) cubeX, (int) cubeY, (int) cubeZ);
        y = calculateY((int) cubeX, (int) cubeY, (int) cubeZ);
        z = calculateZ((int) cubeX, (int) cubeY, (int) cubeZ) + distanceFromCam;

        ooz = 1 / z;

        xp = (int) (width / 2 + horizontalOffset + K1 * ooz * x * 2);
        yp = (int) (height / 2 + K1 * ooz * y);

        idx = xp + yp * width;
        if (idx >= 0 && idx < width * height) {
            if (ooz > zBuffer[idx]) {
                zBuffer[idx] = ooz;
                buffer[idx] = ch;
            }
        }
    }

    static void drawCube(char character) {
        for (float cubeX = -cubeWidth; cubeX < cubeWidth; cubeX += incrementSpeed) {
            for (float cubeY = -cubeWidth; cubeY < cubeWidth; cubeY += incrementSpeed) {
                calculateForSurface(cubeX, cubeY, -cubeWidth, character);
            }
        }
    }

    static void clearConsole() {
        // Code to clear console in Java (not as straightforward as C)
        for (int i = 0; i < 50; ++i) System.out.println();
    }

    static void printBuffer() {
        for (int k = 0; k < width * height; k++) {
            System.out.print((k % width != 0) ? buffer[k] : '\n');
        }
    }

    public static void main(String[] args) {
        while (true) {
            clearConsole();
            for (int i = 0; i < width * height; i++) {
                buffer[i] = (char) backgroundASCIICode;
                zBuffer[i] = 0;
            }

            updateRotationMatrix();

            drawCube('@');

            printBuffer();
            A += 0.02;  // Adjust the rotation speed

            try {
                Thread.sleep(50);  // Adjust the delay for smoother animation
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}