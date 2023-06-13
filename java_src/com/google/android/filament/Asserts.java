package com.google.android.filament;
/* loaded from: classes5.dex */
final class Asserts {
    private Asserts() {
    }

    public static double[] assertDouble4(double[] dArr) {
        if (dArr == null) {
            return new double[4];
        }
        if (dArr.length >= 4) {
            return dArr;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 4");
    }

    public static void assertDouble4In(double[] dArr) {
        if (dArr.length >= 4) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 4");
    }

    public static float[] assertFloat3(float[] fArr) {
        if (fArr == null) {
            return new float[3];
        }
        if (fArr.length >= 3) {
            return fArr;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 3");
    }

    public static void assertFloat3In(float[] fArr) {
        if (fArr.length >= 3) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 3");
    }

    public static float[] assertFloat4(float[] fArr) {
        if (fArr == null) {
            return new float[4];
        }
        if (fArr.length >= 4) {
            return fArr;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 4");
    }

    public static void assertFloat4In(float[] fArr) {
        if (fArr.length >= 4) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 4");
    }

    public static float[] assertMat3f(float[] fArr) {
        if (fArr == null) {
            return new float[9];
        }
        if (fArr.length >= 9) {
            return fArr;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 9");
    }

    public static void assertMat3fIn(float[] fArr) {
        if (fArr.length >= 9) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 9");
    }

    public static double[] assertMat4(double[] dArr) {
        if (dArr == null) {
            return new double[16];
        }
        if (dArr.length >= 16) {
            return dArr;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
    }

    public static void assertMat4In(double[] dArr) {
        if (dArr.length >= 16) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
    }

    public static double[] assertMat4d(double[] dArr) {
        if (dArr == null) {
            return new double[16];
        }
        if (dArr.length >= 16) {
            return dArr;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
    }

    public static void assertMat4dIn(double[] dArr) {
        if (dArr.length >= 16) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
    }

    public static float[] assertMat4f(float[] fArr) {
        if (fArr == null) {
            return new float[16];
        }
        if (fArr.length >= 16) {
            return fArr;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
    }

    public static void assertMat4fIn(float[] fArr) {
        if (fArr.length >= 16) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
    }
}
