package com.google.android.filament;
/* loaded from: classes5.dex */
public class LightManager {
    public static final float EFFICIENCY_FLUORESCENT = 0.0878f;
    public static final float EFFICIENCY_HALOGEN = 0.0707f;
    public static final float EFFICIENCY_INCANDESCENT = 0.022f;
    public static final float EFFICIENCY_LED = 0.1171f;
    private static final Type[] sTypeValues = Type.values();
    private long mNativeObject;

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
                LightManager.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder(Type type) {
            long nCreateBuilder = LightManager.nCreateBuilder(type.ordinal());
            this.mNativeBuilder = nCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(nCreateBuilder);
        }

        public void build(Engine engine, @Entity int i) {
            if (LightManager.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject(), i)) {
                return;
            }
            throw new IllegalStateException("Couldn't create Light component for entity " + i + ", see log.");
        }

        public Builder castLight(boolean z) {
            LightManager.nBuilderCastLight(this.mNativeBuilder, z);
            return this;
        }

        public Builder castShadows(boolean z) {
            LightManager.nBuilderCastShadows(this.mNativeBuilder, z);
            return this;
        }

        public Builder color(float f, float f2, float f3) {
            LightManager.nBuilderColor(this.mNativeBuilder, f, f2, f3);
            return this;
        }

        public Builder direction(float f, float f2, float f3) {
            LightManager.nBuilderDirection(this.mNativeBuilder, f, f2, f3);
            return this;
        }

        public Builder falloff(float f) {
            LightManager.nBuilderFalloff(this.mNativeBuilder, f);
            return this;
        }

        public Builder intensity(float f) {
            LightManager.nBuilderIntensity(this.mNativeBuilder, f);
            return this;
        }

        public Builder intensityCandela(float f) {
            LightManager.nBuilderIntensityCandela(this.mNativeBuilder, f);
            return this;
        }

        public Builder lightChannel(int i, boolean z) {
            LightManager.nBuilderLightChannel(this.mNativeBuilder, i, z);
            return this;
        }

        public Builder position(float f, float f2, float f3) {
            LightManager.nBuilderPosition(this.mNativeBuilder, f, f2, f3);
            return this;
        }

        public Builder shadowOptions(ShadowOptions shadowOptions) {
            LightManager.nBuilderShadowOptions(this.mNativeBuilder, shadowOptions.mapSize, shadowOptions.shadowCascades, shadowOptions.cascadeSplitPositions, shadowOptions.constantBias, shadowOptions.normalBias, shadowOptions.shadowFar, shadowOptions.shadowNearHint, shadowOptions.shadowFarHint, shadowOptions.stable, shadowOptions.lispsm, shadowOptions.polygonOffsetConstant, shadowOptions.polygonOffsetSlope, shadowOptions.screenSpaceContactShadows, shadowOptions.stepCount, shadowOptions.maxShadowDistance, shadowOptions.elvsm, shadowOptions.blurWidth, shadowOptions.shadowBulbRadius);
            return this;
        }

        public Builder spotLightCone(float f, float f2) {
            LightManager.nBuilderSpotLightCone(this.mNativeBuilder, f, f2);
            return this;
        }

        public Builder sunAngularRadius(float f) {
            LightManager.nBuilderAngularRadius(this.mNativeBuilder, f);
            return this;
        }

        public Builder sunHaloFalloff(float f) {
            LightManager.nBuilderHaloFalloff(this.mNativeBuilder, f);
            return this;
        }

        public Builder sunHaloSize(float f) {
            LightManager.nBuilderHaloSize(this.mNativeBuilder, f);
            return this;
        }

        public Builder intensity(float f, float f2) {
            LightManager.nBuilderIntensity(this.mNativeBuilder, f, f2);
            return this;
        }
    }

    /* loaded from: classes5.dex */
    public static class ShadowCascades {
        public static void computeLogSplits(float[] fArr, int i, float f, float f2) {
            int i2 = i - 1;
            if (fArr.length >= i2) {
                LightManager.nComputeLogSplits(fArr, i, f, f2);
                return;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("splitPositions array length must be at least %d", Integer.valueOf(i2)));
        }

        public static void computePracticalSplits(float[] fArr, int i, float f, float f2, float f3) {
            int i2 = i - 1;
            if (fArr.length >= i2) {
                LightManager.nComputePracticalSplits(fArr, i, f, f2, f3);
                return;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("splitPositions array length must be at least %d", Integer.valueOf(i2)));
        }

        public static void computeUniformSplits(float[] fArr, int i) {
            int i2 = i - 1;
            if (fArr.length >= i2) {
                LightManager.nComputeUniformSplits(fArr, i);
                return;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("splitPositions array length must be at least %d", Integer.valueOf(i2)));
        }
    }

    /* loaded from: classes5.dex */
    public static class ShadowOptions {
        public int mapSize = 1024;
        public int shadowCascades = 1;
        public float[] cascadeSplitPositions = {0.125f, 0.25f, 0.5f};
        public float constantBias = 0.001f;
        public float normalBias = 1.0f;
        public float shadowFar = 0.0f;
        public float shadowNearHint = 1.0f;
        public float shadowFarHint = 100.0f;
        public boolean stable = false;
        public boolean lispsm = false;
        float polygonOffsetConstant = 0.5f;
        float polygonOffsetSlope = 2.0f;
        public boolean screenSpaceContactShadows = false;
        public int stepCount = 8;
        public float maxShadowDistance = 0.3f;
        public boolean elvsm = false;
        public float blurWidth = 0.0f;
        public float shadowBulbRadius = 0.02f;
    }

    /* loaded from: classes5.dex */
    public enum Type {
        SUN,
        DIRECTIONAL,
        POINT,
        FOCUSED_SPOT,
        SPOT
    }

    public LightManager(long j) {
        this.mNativeObject = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderAngularRadius(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean nBuilderBuild(long j, long j2, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderCastLight(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderCastShadows(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderColor(long j, float f, float f2, float f3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderDirection(long j, float f, float f2, float f3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFalloff(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderHaloFalloff(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderHaloSize(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderIntensity(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderIntensity(long j, float f, float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderIntensityCandela(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderLightChannel(long j, int i, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderPosition(long j, float f, float f2, float f3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderShadowOptions(long j, int i, int i2, float[] fArr, float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, boolean z3, int i3, float f8, boolean z4, float f9, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSpotLightCone(long j, float f, float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nComputeLogSplits(float[] fArr, int i, float f, float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nComputePracticalSplits(float[] fArr, int i, float f, float f2, float f3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nComputeUniformSplits(float[] fArr, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder(int i);

    private static native void nDestroy(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);

    private static native void nGetColor(long j, int i, float[] fArr);

    private static native int nGetComponentCount(long j);

    private static native void nGetDirection(long j, int i, float[] fArr);

    private static native float nGetFalloff(long j, int i);

    private static native float nGetInnerConeAngle(long j, int i);

    private static native int nGetInstance(long j, int i);

    private static native float nGetIntensity(long j, int i);

    private static native boolean nGetLightChannel(long j, int i, int i2);

    private static native float nGetOuterConeAngle(long j, int i);

    private static native void nGetPosition(long j, int i, float[] fArr);

    private static native float nGetSunAngularRadius(long j, int i);

    private static native float nGetSunHaloFalloff(long j, int i);

    private static native float nGetSunHaloSize(long j, int i);

    private static native int nGetType(long j, int i);

    private static native boolean nHasComponent(long j, int i);

    private static native boolean nIsShadowCaster(long j, int i);

    private static native void nSetColor(long j, int i, float f, float f2, float f3);

    private static native void nSetDirection(long j, int i, float f, float f2, float f3);

    private static native void nSetFalloff(long j, int i, float f);

    private static native void nSetIntensity(long j, int i, float f);

    private static native void nSetIntensity(long j, int i, float f, float f2);

    private static native void nSetIntensityCandela(long j, int i, float f);

    private static native void nSetLightChannel(long j, int i, int i2, boolean z);

    private static native void nSetPosition(long j, int i, float f, float f2, float f3);

    private static native void nSetShadowCaster(long j, int i, boolean z);

    private static native void nSetSpotLightCone(long j, int i, float f, float f2);

    private static native void nSetSunAngularRadius(long j, int i, float f);

    private static native void nSetSunHaloFalloff(long j, int i, float f);

    private static native void nSetSunHaloSize(long j, int i, float f);

    public void destroy(@Entity int i) {
        nDestroy(this.mNativeObject, i);
    }

    public float[] getColor(@EntityInstance int i, float[] fArr) {
        float[] assertFloat3 = Asserts.assertFloat3(fArr);
        nGetColor(this.mNativeObject, i, assertFloat3);
        return assertFloat3;
    }

    public int getComponentCount() {
        return nGetComponentCount(this.mNativeObject);
    }

    public float[] getDirection(@EntityInstance int i, float[] fArr) {
        float[] assertFloat3 = Asserts.assertFloat3(fArr);
        nGetDirection(this.mNativeObject, i, assertFloat3);
        return assertFloat3;
    }

    public float getFalloff(@EntityInstance int i) {
        return nGetFalloff(this.mNativeObject, i);
    }

    public float getInnerConeAngle(@EntityInstance int i) {
        return nGetInnerConeAngle(this.mNativeObject, i);
    }

    @EntityInstance
    public int getInstance(@Entity int i) {
        return nGetInstance(this.mNativeObject, i);
    }

    public float getIntensity(@EntityInstance int i) {
        return nGetIntensity(this.mNativeObject, i);
    }

    public boolean getLightChannel(@EntityInstance int i, int i2) {
        return nGetLightChannel(this.mNativeObject, i, i2);
    }

    public long getNativeObject() {
        return this.mNativeObject;
    }

    public float getOuterConeAngle(@EntityInstance int i) {
        return nGetOuterConeAngle(this.mNativeObject, i);
    }

    public float[] getPosition(@EntityInstance int i, float[] fArr) {
        float[] assertFloat3 = Asserts.assertFloat3(fArr);
        nGetPosition(this.mNativeObject, i, assertFloat3);
        return assertFloat3;
    }

    public float getSunAngularRadius(@EntityInstance int i) {
        return nGetSunAngularRadius(this.mNativeObject, i);
    }

    public float getSunHaloFalloff(@EntityInstance int i) {
        return nGetSunHaloFalloff(this.mNativeObject, i);
    }

    public float getSunHaloSize(@EntityInstance int i) {
        return nGetSunHaloSize(this.mNativeObject, i);
    }

    public Type getType(@EntityInstance int i) {
        return sTypeValues[nGetType(this.mNativeObject, i)];
    }

    public boolean hasComponent(@Entity int i) {
        return nHasComponent(this.mNativeObject, i);
    }

    public boolean isDirectional(@EntityInstance int i) {
        Type type = getType(i);
        if (type != Type.DIRECTIONAL && type != Type.SUN) {
            return false;
        }
        return true;
    }

    public boolean isPointLight(@EntityInstance int i) {
        return getType(i) == Type.POINT;
    }

    public boolean isShadowCaster(@EntityInstance int i) {
        return nIsShadowCaster(this.mNativeObject, i);
    }

    public boolean isSpotLight(@EntityInstance int i) {
        Type type = getType(i);
        if (type != Type.SPOT && type != Type.FOCUSED_SPOT) {
            return false;
        }
        return true;
    }

    public void setColor(@EntityInstance int i, float f, float f2, float f3) {
        nSetColor(this.mNativeObject, i, f, f2, f3);
    }

    public void setDirection(@EntityInstance int i, float f, float f2, float f3) {
        nSetDirection(this.mNativeObject, i, f, f2, f3);
    }

    public void setFalloff(@EntityInstance int i, float f) {
        nSetFalloff(this.mNativeObject, i, f);
    }

    public void setIntensity(@EntityInstance int i, float f) {
        nSetIntensity(this.mNativeObject, i, f);
    }

    public void setIntensityCandela(@EntityInstance int i, float f) {
        nSetIntensityCandela(this.mNativeObject, i, f);
    }

    public void setLightChannel(@EntityInstance int i, int i2, boolean z) {
        nSetLightChannel(this.mNativeObject, i, i2, z);
    }

    public void setPosition(@EntityInstance int i, float f, float f2, float f3) {
        nSetPosition(this.mNativeObject, i, f, f2, f3);
    }

    public void setShadowCaster(@EntityInstance int i, boolean z) {
        nSetShadowCaster(this.mNativeObject, i, z);
    }

    public void setSpotLightCone(@EntityInstance int i, float f, float f2) {
        nSetSpotLightCone(this.mNativeObject, i, f, f2);
    }

    public void setSunAngularRadius(@EntityInstance int i, float f) {
        nSetSunAngularRadius(this.mNativeObject, i, f);
    }

    public void setSunHaloFalloff(@EntityInstance int i, float f) {
        nSetSunHaloFalloff(this.mNativeObject, i, f);
    }

    public void setSunHaloSize(@EntityInstance int i, float f) {
        nSetSunHaloSize(this.mNativeObject, i, f);
    }

    public void setIntensity(@EntityInstance int i, float f, float f2) {
        nSetIntensity(this.mNativeObject, i, f, f2);
    }
}
