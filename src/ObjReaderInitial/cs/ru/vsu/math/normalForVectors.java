package ObjReaderInitial.cs.ru.vsu.math;

public class normalForVectors {
    public static float[] find(float v1[], float v2[]) {
        float[] normal = new float[3];
        normal[0] = v1[1] * v2[2] - v1[2] * v2[1];
        normal[1] = v1[2] * v2[0] - v1[0] * v2[2];
        normal[2] = v1[0] * v2[1] - v1[1] * v2[0];
        return normal;
    }
}
