package com.google.android.filament.utils;
/* loaded from: classes5.dex */
public class Manipulator {
    private static final Mode[] sModeValues = Mode.values();
    private final long mNativeObject;

    /* loaded from: classes5.dex */
    public static class Builder {
        private final BuilderFinalizer mFinalizer;
        private final long mNativeBuilder;

        /* loaded from: classes5.dex */
        public static class BuilderFinalizer {
            private final long mNativeObject;

            public BuilderFinalizer(long j) {
                this.mNativeObject = j;
            }

            public void finalize() {
                try {
                    super.finalize();
                } catch (Throwable unused) {
                }
                Manipulator.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder() {
            long nCreateBuilder = Manipulator.nCreateBuilder();
            this.mNativeBuilder = nCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(nCreateBuilder);
        }

        public Manipulator build(Mode mode) {
            long nBuilderBuild = Manipulator.nBuilderBuild(this.mNativeBuilder, mode.ordinal());
            if (nBuilderBuild != 0) {
                return new Manipulator(nBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create Manipulator");
        }

        public Builder farPlane(float f) {
            Manipulator.nBuilderFarPlane(this.mNativeBuilder, f);
            return this;
        }

        public Builder flightMaxMoveSpeed(float f) {
            Manipulator.nBuilderFlightMaxMoveSpeed(this.mNativeBuilder, f);
            return this;
        }

        public Builder flightMoveDamping(float f) {
            Manipulator.nBuilderFlightMoveDamping(this.mNativeBuilder, f);
            return this;
        }

        public Builder flightPanSpeed(float f, float f2) {
            Manipulator.nBuilderFlightPanSpeed(this.mNativeBuilder, f, f2);
            return this;
        }

        public Builder flightSpeedSteps(int i) {
            Manipulator.nBuilderFlightSpeedSteps(this.mNativeBuilder, i);
            return this;
        }

        public Builder flightStartOrientation(float f, float f2) {
            Manipulator.nBuilderFlightStartOrientation(this.mNativeBuilder, f, f2);
            return this;
        }

        public Builder flightStartPosition(float f, float f2, float f3) {
            Manipulator.nBuilderFlightStartPosition(this.mNativeBuilder, f, f2, f3);
            return this;
        }

        public Builder fovDegrees(float f) {
            Manipulator.nBuilderFovDegrees(this.mNativeBuilder, f);
            return this;
        }

        public Builder fovDirection(Fov fov) {
            Manipulator.nBuilderFovDirection(this.mNativeBuilder, fov.ordinal());
            return this;
        }

        public Builder groundPlane(float f, float f2, float f3, float f4) {
            Manipulator.nBuilderGroundPlane(this.mNativeBuilder, f, f2, f3, f4);
            return this;
        }

        public Builder mapExtent(float f, float f2) {
            Manipulator.nBuilderMapExtent(this.mNativeBuilder, f, f2);
            return this;
        }

        public Builder mapMinDistance(float f) {
            Manipulator.nBuilderMapMinDistance(this.mNativeBuilder, f);
            return this;
        }

        public Builder orbitHomePosition(float f, float f2, float f3) {
            Manipulator.nBuilderOrbitHomePosition(this.mNativeBuilder, f, f2, f3);
            return this;
        }

        public Builder orbitSpeed(float f, float f2) {
            Manipulator.nBuilderOrbitSpeed(this.mNativeBuilder, f, f2);
            return this;
        }

        public Builder targetPosition(float f, float f2, float f3) {
            Manipulator.nBuilderTargetPosition(this.mNativeBuilder, f, f2, f3);
            return this;
        }

        public Builder upVector(float f, float f2, float f3) {
            Manipulator.nBuilderUpVector(this.mNativeBuilder, f, f2, f3);
            return this;
        }

        public Builder viewport(int i, int i2) {
            Manipulator.nBuilderViewport(this.mNativeBuilder, i, i2);
            return this;
        }

        public Builder zoomSpeed(float f) {
            Manipulator.nBuilderZoomSpeed(this.mNativeBuilder, f);
            return this;
        }
    }

    /* loaded from: classes5.dex */
    public enum Fov {
        VERTICAL,
        HORIZONTAL
    }

    /* loaded from: classes5.dex */
    public enum Key {
        FORWARD,
        LEFT,
        BACKWARD,
        RIGHT,
        UP,
        DOWN
    }

    /* loaded from: classes5.dex */
    public enum Mode {
        ORBIT,
        MAP,
        FREE_FLIGHT
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFarPlane(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFlightMaxMoveSpeed(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFlightMoveDamping(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFlightPanSpeed(long j, float f, float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFlightSpeedSteps(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFlightStartOrientation(long j, float f, float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFlightStartPosition(long j, float f, float f2, float f3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFovDegrees(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFovDirection(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderGroundPlane(long j, float f, float f2, float f3, float f4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderMapExtent(long j, float f, float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderMapMinDistance(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderOrbitHomePosition(long j, float f, float f2, float f3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderOrbitSpeed(long j, float f, float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderTargetPosition(long j, float f, float f2, float f3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderUpVector(long j, float f, float f2, float f3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderViewport(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderZoomSpeed(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);

    private static native void nDestroyManipulator(long j);

    private static native long nGetCurrentBookmark(long j);

    private static native long nGetHomeBookmark(long j);

    private static native void nGetLookAtDouble(long j, double[] dArr, double[] dArr2, double[] dArr3);

    private static native void nGetLookAtFloat(long j, float[] fArr, float[] fArr2, float[] fArr3);

    private static native int nGetMode(long j);

    private static native void nGrabBegin(long j, int i, int i2, boolean z);

    private static native void nGrabEnd(long j);

    private static native void nGrabUpdate(long j, int i, int i2);

    private static native void nJumpToBookmark(long j, long j2);

    private static native void nKeyDown(long j, int i);

    private static native void nKeyUp(long j, int i);

    private static native void nRaycast(long j, int i, int i2, float[] fArr);

    private static native void nScroll(long j, int i, int i2, float f);

    private static native void nSetViewport(long j, int i, int i2);

    private static native void nUpdate(long j, float f);

    public void finalize() {
        try {
            super.finalize();
        } catch (Throwable unused) {
        }
        nDestroyManipulator(this.mNativeObject);
    }

    public Bookmark getCurrentBookmark() {
        return new Bookmark(nGetCurrentBookmark(this.mNativeObject));
    }

    public Bookmark getHomeBookmark() {
        return new Bookmark(nGetHomeBookmark(this.mNativeObject));
    }

    public void getLookAt(float[] fArr, float[] fArr2, float[] fArr3) {
        nGetLookAtFloat(this.mNativeObject, fArr, fArr2, fArr3);
    }

    public Mode getMode() {
        return sModeValues[nGetMode(this.mNativeObject)];
    }

    public void grabBegin(int i, int i2, boolean z) {
        nGrabBegin(this.mNativeObject, i, i2, z);
    }

    public void grabEnd() {
        nGrabEnd(this.mNativeObject);
    }

    public void grabUpdate(int i, int i2) {
        nGrabUpdate(this.mNativeObject, i, i2);
    }

    public void jumpToBookmark(Bookmark bookmark) {
        nJumpToBookmark(this.mNativeObject, bookmark.getNativeObject());
    }

    public void keyDown(Key key) {
        nKeyDown(this.mNativeObject, key.ordinal());
    }

    public void keyUp(Key key) {
        nKeyUp(this.mNativeObject, key.ordinal());
    }

    public float[] raycast(int i, int i2) {
        float[] fArr = new float[3];
        nRaycast(this.mNativeObject, i, i2, fArr);
        return fArr;
    }

    public void scroll(int i, int i2, float f) {
        nScroll(this.mNativeObject, i, i2, f);
    }

    public void setViewport(int i, int i2) {
        nSetViewport(this.mNativeObject, i, i2);
    }

    public void update(float f) {
        nUpdate(this.mNativeObject, f);
    }

    private Manipulator(long j) {
        this.mNativeObject = j;
    }

    public void getLookAt(double[] dArr, double[] dArr2, double[] dArr3) {
        nGetLookAtDouble(this.mNativeObject, dArr, dArr2, dArr3);
    }
}
