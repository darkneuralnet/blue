package com.google.android.filament.utils;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0002\u0010\u0005B\u0019\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u001d\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\t\u0010(\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010)\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\nJ\u0011\u0010)\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\nJ\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0011\u0010-\u001a\u00020\u00032\u0006\u0010.\u001a\u00020/H\u0086\u0002J\u0019\u0010-\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/H\u0086\u0002J\u0011\u0010-\u001a\u00020\u00032\u0006\u0010.\u001a\u000202H\u0086\u0002J\u0019\u0010-\u001a\u00020\u00002\u0006\u00100\u001a\u0002022\u0006\u00101\u001a\u000202H\u0086\u0002J\t\u00103\u001a\u000202HÖ\u0001J\t\u00104\u001a\u00020\u0000H\u0086\u0002J\u0011\u00105\u001a\u00020\u00032\u0006\u0010.\u001a\u000202H\u0086\nJ\u0011\u00106\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\nJ\u0011\u00106\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\nJ\u0011\u00107\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\nJ\u0011\u00107\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\nJ!\u00108\u001a\u0002092\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J\u0019\u00108\u001a\u0002092\u0006\u0010.\u001a\u00020/2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J\u0019\u00108\u001a\u0002092\u0006\u0010.\u001a\u0002022\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J!\u00108\u001a\u0002092\u0006\u00100\u001a\u0002022\u0006\u00101\u001a\u0002022\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J\u0011\u0010:\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\nJ\u0011\u0010:\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\nJ\u0006\u0010;\u001a\u00020<J\t\u0010=\u001a\u00020>HÖ\u0001J \u0010?\u001a\u00020\u00002\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030AH\u0086\bø\u0001\u0000J\t\u0010B\u001a\u00020\u0000H\u0086\u0002R&\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0004R&\u0010\u000e\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u0004R&\u0010\u0011\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0005R&\u0010\u0015\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u0004R&\u0010\u0018\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0005R&\u0010\u001b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u0004R&\u0010 \u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0013\"\u0004\b\"\u0010\u0005R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006C"}, m28432d2 = {"Lcom/google/android/filament/utils/Float2;", "", "v", "", "(F)V", "(Lcom/google/android/filament/utils/Float2;)V", "x", "y", "(FF)V", "value", "g", "getG", "()F", "setG", "r", "getR", "setR", "rg", "getRg", "()Lcom/google/android/filament/utils/Float2;", "setRg", "s", "getS", "setS", "st", "getSt", "setSt", "t", "getT", "setT", "getX", "setX", "xy", "getXy", "setXy", "getY", "setY", "component1", "component2", "copy", "dec", "div", "equals", "", LegacyRepairType.OTHER_KEY, "get", "index", "Lcom/google/android/filament/utils/VectorComponent;", "index1", "index2", "", "hashCode", "inc", "invoke", "minus", "plus", "set", "", "times", "toFloatArray", "", "toString", "", "transform", "block", "Lkotlin/Function1;", "unaryMinus", "filament-utils-android_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes5.dex */
public final class Float2 {

    /* renamed from: x */
    private float f70133x;

    /* renamed from: y */
    private float f70134y;

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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Float2() {
        this(0.0f, 0.0f, 3, null);
    }

    public static /* synthetic */ Float2 copy$default(Float2 float2, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = float2.f70133x;
        }
        if ((i & 2) != 0) {
            f2 = float2.f70134y;
        }
        return float2.copy(f, f2);
    }

    public final float component1() {
        return this.f70133x;
    }

    public final float component2() {
        return this.f70134y;
    }

    public final Float2 copy(float f, float f2) {
        return new Float2(f, f2);
    }

    public final Float2 dec() {
        float f = this.f70133x;
        this.f70133x = f - 1.0f;
        float f2 = this.f70134y;
        this.f70134y = (-1.0f) + f2;
        return new Float2(f, f2);
    }

    public final Float2 div(float f) {
        return new Float2(getX() / f, getY() / f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Float2) {
            Float2 float2 = (Float2) obj;
            return Float.compare(this.f70133x, float2.f70133x) == 0 && Float.compare(this.f70134y, float2.f70134y) == 0;
        }
        return false;
    }

    public final float get(VectorComponent index) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (WhenMappings.$EnumSwitchMapping$0[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return this.f70133x;
            case 4:
            case 5:
            case 6:
                return this.f70134y;
            default:
                throw new IllegalArgumentException("index must be X, Y, R, G, S or T");
        }
    }

    public final float getG() {
        return getY();
    }

    public final float getR() {
        return getX();
    }

    public final Float2 getRg() {
        return new Float2(getX(), getY());
    }

    public final float getS() {
        return getX();
    }

    public final Float2 getSt() {
        return new Float2(getX(), getY());
    }

    public final float getT() {
        return getY();
    }

    public final float getX() {
        return this.f70133x;
    }

    public final Float2 getXy() {
        return new Float2(getX(), getY());
    }

    public final float getY() {
        return this.f70134y;
    }

    public int hashCode() {
        return (Float.hashCode(this.f70133x) * 31) + Float.hashCode(this.f70134y);
    }

    public final Float2 inc() {
        float f = this.f70133x;
        this.f70133x = f + 1.0f;
        float f2 = this.f70134y;
        this.f70134y = 1.0f + f2;
        return new Float2(f, f2);
    }

    public final float invoke(int i) {
        return get(i - 1);
    }

    public final Float2 minus(float f) {
        return new Float2(getX() - f, getY() - f);
    }

    public final Float2 plus(float f) {
        return new Float2(getX() + f, getY() + f);
    }

    public final void set(int i, float f) {
        if (i == 0) {
            this.f70133x = f;
        } else if (i == 1) {
            this.f70134y = f;
        } else {
            throw new IllegalArgumentException("index must be in 0..1");
        }
    }

    public final void setG(float f) {
        setY(f);
    }

    public final void setR(float f) {
        setX(f);
    }

    public final void setRg(Float2 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
    }

    public final void setS(float f) {
        setX(f);
    }

    public final void setSt(Float2 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
    }

    public final void setT(float f) {
        setY(f);
    }

    public final void setX(float f) {
        this.f70133x = f;
    }

    public final void setXy(Float2 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
    }

    public final void setY(float f) {
        this.f70134y = f;
    }

    public final Float2 times(float f) {
        return new Float2(getX() * f, getY() * f);
    }

    public final float[] toFloatArray() {
        return new float[]{this.f70133x, this.f70134y};
    }

    public String toString() {
        return "Float2(x=" + this.f70133x + ", y=" + this.f70134y + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final Float2 transform(Function1<? super Float, Float> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        setX(block.invoke(Float.valueOf(getX())).floatValue());
        setY(block.invoke(Float.valueOf(getY())).floatValue());
        return this;
    }

    public final Float2 unaryMinus() {
        return new Float2(-this.f70133x, -this.f70134y);
    }

    public Float2(float f, float f2) {
        this.f70133x = f;
        this.f70134y = f2;
    }

    public final Float2 div(Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float2(getX() / v.getX(), getY() / v.getY());
    }

    public final Float2 minus(Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float2(getX() - v.getX(), getY() - v.getY());
    }

    public final Float2 plus(Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float2(getX() + v.getX(), getY() + v.getY());
    }

    public final Float2 times(Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float2(getX() * v.getX(), getY() * v.getY());
    }

    public /* synthetic */ Float2(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }

    public Float2(float f) {
        this(f, f);
    }

    public final void set(int i, int i2, float f) {
        set(i, f);
        set(i2, f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Float2(Float2 v) {
        this(v.f70133x, v.f70134y);
        Intrinsics.checkNotNullParameter(v, "v");
    }

    public final Float2 get(VectorComponent index1, VectorComponent index2) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        return new Float2(get(index1), get(index2));
    }

    public final float get(int i) {
        if (i != 0) {
            if (i == 1) {
                return this.f70134y;
            }
            throw new IllegalArgumentException("index must be in 0..1");
        }
        return this.f70133x;
    }

    public final void set(VectorComponent index, float f) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (WhenMappings.$EnumSwitchMapping$0[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.f70133x = f;
                return;
            case 4:
            case 5:
            case 6:
                this.f70134y = f;
                return;
            default:
                throw new IllegalArgumentException("index must be X, Y, R, G, S or T");
        }
    }

    public final Float2 get(int i, int i2) {
        return new Float2(get(i), get(i2));
    }

    public final void set(VectorComponent index1, VectorComponent index2, float f) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        set(index1, f);
        set(index2, f);
    }
}
