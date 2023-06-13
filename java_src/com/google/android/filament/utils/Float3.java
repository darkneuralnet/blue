package com.google.android.filament.utils;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0002\u0010\bB#\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J'\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\t\u0010?\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010@\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\nJ\u0011\u0010@\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\nJ\u0011\u0010@\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\nJ\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0011\u0010D\u001a\u00020\u00032\u0006\u0010E\u001a\u00020FH\u0086\u0002J\u0019\u0010D\u001a\u00020\u00052\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020FH\u0086\u0002J!\u0010D\u001a\u00020\u00002\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020F2\u0006\u0010I\u001a\u00020FH\u0086\u0002J\u0011\u0010D\u001a\u00020\u00032\u0006\u0010E\u001a\u00020JH\u0086\u0002J\u0019\u0010D\u001a\u00020\u00052\u0006\u0010G\u001a\u00020J2\u0006\u0010H\u001a\u00020JH\u0086\u0002J!\u0010D\u001a\u00020\u00002\u0006\u0010G\u001a\u00020J2\u0006\u0010H\u001a\u00020J2\u0006\u0010I\u001a\u00020JH\u0086\u0002J\t\u0010K\u001a\u00020JHÖ\u0001J\t\u0010L\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010M\u001a\u00020\u00032\u0006\u0010E\u001a\u00020JH\u0086\nJ\u0011\u0010N\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\nJ\u0011\u0010N\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\nJ\u0011\u0010N\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\nJ\u0011\u0010O\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\nJ\u0011\u0010O\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\nJ\u0011\u0010O\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\nJ)\u0010P\u001a\u00020Q2\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020F2\u0006\u0010I\u001a\u00020F2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J!\u0010P\u001a\u00020Q2\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020F2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J\u0019\u0010P\u001a\u00020Q2\u0006\u0010E\u001a\u00020F2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J\u0019\u0010P\u001a\u00020Q2\u0006\u0010E\u001a\u00020J2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J!\u0010P\u001a\u00020Q2\u0006\u0010G\u001a\u00020J2\u0006\u0010H\u001a\u00020J2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J)\u0010P\u001a\u00020Q2\u0006\u0010G\u001a\u00020J2\u0006\u0010H\u001a\u00020J2\u0006\u0010I\u001a\u00020J2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J\u0011\u0010R\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\nJ\u0011\u0010R\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\nJ\u0011\u0010R\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\nJ\u0006\u0010S\u001a\u00020TJ\t\u0010U\u001a\u00020VHÖ\u0001J \u0010W\u001a\u00020\u00002\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030YH\u0086\bø\u0001\u0000J\t\u0010Z\u001a\u00020\u0000H\u0086\u0002R&\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0004R&\u0010\u0011\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0004R&\u0010\u0014\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0004R&\u0010\u0017\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0004R&\u0010\u001a\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR&\u0010\u001f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\bR&\u0010#\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010\u000f\"\u0004\b%\u0010\u0004R&\u0010&\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001eR&\u0010)\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010!\"\u0004\b+\u0010\bR&\u0010,\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010\u000f\"\u0004\b.\u0010\u0004R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u000f\"\u0004\b0\u0010\u0004R&\u00101\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010\u001c\"\u0004\b3\u0010\u001eR&\u00104\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b5\u0010!\"\u0004\b6\u0010\bR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u000f\"\u0004\b8\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u000f\"\u0004\b:\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006["}, m28432d2 = {"Lcom/google/android/filament/utils/Float3;", "", "v", "", "(F)V", "Lcom/google/android/filament/utils/Float2;", "z", "(Lcom/google/android/filament/utils/Float2;F)V", "(Lcom/google/android/filament/utils/Float3;)V", "x", "y", "(FFF)V", "value", "b", "getB", "()F", "setB", "g", "getG", "setG", "p", "getP", "setP", "r", "getR", "setR", "rg", "getRg", "()Lcom/google/android/filament/utils/Float2;", "setRg", "(Lcom/google/android/filament/utils/Float2;)V", "rgb", "getRgb", "()Lcom/google/android/filament/utils/Float3;", "setRgb", "s", "getS", "setS", "st", "getSt", "setSt", "stp", "getStp", "setStp", "t", "getT", "setT", "getX", "setX", "xy", "getXy", "setXy", "xyz", "getXyz", "setXyz", "getY", "setY", "getZ", "setZ", "component1", "component2", "component3", "copy", "dec", "div", "equals", "", LegacyRepairType.OTHER_KEY, "get", "index", "Lcom/google/android/filament/utils/VectorComponent;", "index1", "index2", "index3", "", "hashCode", "inc", "invoke", "minus", "plus", "set", "", "times", "toFloatArray", "", "toString", "", "transform", "block", "Lkotlin/Function1;", "unaryMinus", "filament-utils-android_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes5.dex */
public final class Float3 {

    /* renamed from: x */
    private float f70135x;

    /* renamed from: y */
    private float f70136y;

    /* renamed from: z */
    private float f70137z;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes5.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VectorComponent.values().length];
            try {
                iArr[VectorComponent.X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VectorComponent.R.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VectorComponent.S.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VectorComponent.Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VectorComponent.G.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VectorComponent.T.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VectorComponent.Z.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VectorComponent.B.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VectorComponent.P.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Float3() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    public static /* synthetic */ Float3 copy$default(Float3 float3, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = float3.f70135x;
        }
        if ((i & 2) != 0) {
            f2 = float3.f70136y;
        }
        if ((i & 4) != 0) {
            f3 = float3.f70137z;
        }
        return float3.copy(f, f2, f3);
    }

    public final float component1() {
        return this.f70135x;
    }

    public final float component2() {
        return this.f70136y;
    }

    public final float component3() {
        return this.f70137z;
    }

    public final Float3 copy(float f, float f2, float f3) {
        return new Float3(f, f2, f3);
    }

    public final Float3 dec() {
        float f = this.f70135x;
        this.f70135x = f - 1.0f;
        float f2 = this.f70136y;
        this.f70136y = f2 - 1.0f;
        float f3 = this.f70137z;
        this.f70137z = (-1.0f) + f3;
        return new Float3(f, f2, f3);
    }

    public final Float3 div(float f) {
        return new Float3(getX() / f, getY() / f, getZ() / f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Float3) {
            Float3 float3 = (Float3) obj;
            return Float.compare(this.f70135x, float3.f70135x) == 0 && Float.compare(this.f70136y, float3.f70136y) == 0 && Float.compare(this.f70137z, float3.f70137z) == 0;
        }
        return false;
    }

    public final float get(VectorComponent index) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (WhenMappings.$EnumSwitchMapping$0[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return this.f70135x;
            case 4:
            case 5:
            case 6:
                return this.f70136y;
            case 7:
            case 8:
            case 9:
                return this.f70137z;
            default:
                throw new IllegalArgumentException("index must be X, Y, Z, R, G, B, S, T or P");
        }
    }

    public final float getB() {
        return getZ();
    }

    public final float getG() {
        return getY();
    }

    public final float getP() {
        return getZ();
    }

    public final float getR() {
        return getX();
    }

    public final Float2 getRg() {
        return new Float2(getX(), getY());
    }

    public final Float3 getRgb() {
        return new Float3(getX(), getY(), getZ());
    }

    public final float getS() {
        return getX();
    }

    public final Float2 getSt() {
        return new Float2(getX(), getY());
    }

    public final Float3 getStp() {
        return new Float3(getX(), getY(), getZ());
    }

    public final float getT() {
        return getY();
    }

    public final float getX() {
        return this.f70135x;
    }

    public final Float2 getXy() {
        return new Float2(getX(), getY());
    }

    public final Float3 getXyz() {
        return new Float3(getX(), getY(), getZ());
    }

    public final float getY() {
        return this.f70136y;
    }

    public final float getZ() {
        return this.f70137z;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f70135x) * 31) + Float.hashCode(this.f70136y)) * 31) + Float.hashCode(this.f70137z);
    }

    public final Float3 inc() {
        float f = this.f70135x;
        this.f70135x = f + 1.0f;
        float f2 = this.f70136y;
        this.f70136y = f2 + 1.0f;
        float f3 = this.f70137z;
        this.f70137z = 1.0f + f3;
        return new Float3(f, f2, f3);
    }

    public final float invoke(int i) {
        return get(i - 1);
    }

    public final Float3 minus(float f) {
        return new Float3(getX() - f, getY() - f, getZ() - f);
    }

    public final Float3 plus(float f) {
        return new Float3(getX() + f, getY() + f, getZ() + f);
    }

    public final void set(int i, float f) {
        if (i == 0) {
            this.f70135x = f;
        } else if (i == 1) {
            this.f70136y = f;
        } else if (i == 2) {
            this.f70137z = f;
        } else {
            throw new IllegalArgumentException("index must be in 0..2");
        }
    }

    public final void setB(float f) {
        setZ(f);
    }

    public final void setG(float f) {
        setY(f);
    }

    public final void setP(float f) {
        setZ(f);
    }

    public final void setR(float f) {
        setX(f);
    }

    public final void setRg(Float2 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
    }

    public final void setRgb(Float3 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
    }

    public final void setS(float f) {
        setX(f);
    }

    public final void setSt(Float2 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
    }

    public final void setStp(Float3 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
    }

    public final void setT(float f) {
        setY(f);
    }

    public final void setX(float f) {
        this.f70135x = f;
    }

    public final void setXy(Float2 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
    }

    public final void setXyz(Float3 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
    }

    public final void setY(float f) {
        this.f70136y = f;
    }

    public final void setZ(float f) {
        this.f70137z = f;
    }

    public final Float3 times(float f) {
        return new Float3(getX() * f, getY() * f, getZ() * f);
    }

    public final float[] toFloatArray() {
        return new float[]{this.f70135x, this.f70136y, this.f70137z};
    }

    public String toString() {
        return "Float3(x=" + this.f70135x + ", y=" + this.f70136y + ", z=" + this.f70137z + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final Float3 transform(Function1<? super Float, Float> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        setX(block.invoke(Float.valueOf(getX())).floatValue());
        setY(block.invoke(Float.valueOf(getY())).floatValue());
        setZ(block.invoke(Float.valueOf(getZ())).floatValue());
        return this;
    }

    public final Float3 unaryMinus() {
        return new Float3(-this.f70135x, -this.f70136y, -this.f70137z);
    }

    public Float3(float f, float f2, float f3) {
        this.f70135x = f;
        this.f70136y = f2;
        this.f70137z = f3;
    }

    public final Float3 div(Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float3(getX() / v.getX(), getY() / v.getY(), getZ());
    }

    public final Float3 minus(Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float3(getX() - v.getX(), getY() - v.getY(), getZ());
    }

    public final Float3 plus(Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float3(getX() + v.getX(), getY() + v.getY(), getZ());
    }

    public final Float3 times(Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float3(getX() * v.getX(), getY() * v.getY(), getZ());
    }

    public /* synthetic */ Float3(float f, float f2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3);
    }

    public final Float3 div(Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float3(getX() / v.getX(), getY() / v.getY(), getZ() / v.getZ());
    }

    public final Float3 minus(Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float3(getX() - v.getX(), getY() - v.getY(), getZ() - v.getZ());
    }

    public final Float3 plus(Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float3(getX() + v.getX(), getY() + v.getY(), getZ() + v.getZ());
    }

    public final Float3 times(Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float3(getX() * v.getX(), getY() * v.getY(), getZ() * v.getZ());
    }

    public Float3(float f) {
        this(f, f, f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Float3(Float2 v, float f) {
        this(v.getX(), v.getY(), f);
        Intrinsics.checkNotNullParameter(v, "v");
    }

    public final void set(int i, int i2, float f) {
        set(i, f);
        set(i2, f);
    }

    public /* synthetic */ Float3(Float2 float2, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(float2, (i & 2) != 0 ? 0.0f : f);
    }

    public final Float2 get(VectorComponent index1, VectorComponent index2) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        return new Float2(get(index1), get(index2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Float3(Float3 v) {
        this(v.f70135x, v.f70136y, v.f70137z);
        Intrinsics.checkNotNullParameter(v, "v");
    }

    public final Float3 get(VectorComponent index1, VectorComponent index2, VectorComponent index3) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        return new Float3(get(index1), get(index2), get(index3));
    }

    public final void set(int i, int i2, int i3, float f) {
        set(i, f);
        set(i2, f);
        set(i3, f);
    }

    public final float get(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return this.f70137z;
                }
                throw new IllegalArgumentException("index must be in 0..2");
            }
            return this.f70136y;
        }
        return this.f70135x;
    }

    public final void set(VectorComponent index, float f) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (WhenMappings.$EnumSwitchMapping$0[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.f70135x = f;
                return;
            case 4:
            case 5:
            case 6:
                this.f70136y = f;
                return;
            case 7:
            case 8:
            case 9:
                this.f70137z = f;
                return;
            default:
                throw new IllegalArgumentException("index must be X, Y, Z, R, G, B, S, T or P");
        }
    }

    public final Float2 get(int i, int i2) {
        return new Float2(get(i), get(i2));
    }

    public final Float3 get(int i, int i2, int i3) {
        return new Float3(get(i), get(i2), get(i3));
    }

    public final void set(VectorComponent index1, VectorComponent index2, float f) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        set(index1, f);
        set(index2, f);
    }

    public final void set(VectorComponent index1, VectorComponent index2, VectorComponent index3, float f) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        set(index1, f);
        set(index2, f);
        set(index3, f);
    }
}
