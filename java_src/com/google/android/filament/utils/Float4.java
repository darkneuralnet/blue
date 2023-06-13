package com.google.android.filament.utils;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bO\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\t\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\nB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0002\u0010\u000bB-\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J1\u0010U\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\t\u0010V\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010W\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\nJ\u0011\u0010W\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\tH\u0086\nJ\u0011\u0010W\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\nJ\u0011\u0010W\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\nJ\u0013\u0010X\u001a\u00020Y2\b\u0010Z\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0011\u0010[\u001a\u00020\u00032\u0006\u0010\\\u001a\u00020]H\u0086\u0002J\u0019\u0010[\u001a\u00020\u00052\u0006\u0010^\u001a\u00020]2\u0006\u0010_\u001a\u00020]H\u0086\u0002J!\u0010[\u001a\u00020\t2\u0006\u0010^\u001a\u00020]2\u0006\u0010_\u001a\u00020]2\u0006\u0010`\u001a\u00020]H\u0086\u0002J)\u0010[\u001a\u00020\u00002\u0006\u0010^\u001a\u00020]2\u0006\u0010_\u001a\u00020]2\u0006\u0010`\u001a\u00020]2\u0006\u0010a\u001a\u00020]H\u0086\u0002J\u0011\u0010[\u001a\u00020\u00032\u0006\u0010\\\u001a\u00020bH\u0086\u0002J\u0019\u0010[\u001a\u00020\u00052\u0006\u0010^\u001a\u00020b2\u0006\u0010_\u001a\u00020bH\u0086\u0002J!\u0010[\u001a\u00020\t2\u0006\u0010^\u001a\u00020b2\u0006\u0010_\u001a\u00020b2\u0006\u0010`\u001a\u00020bH\u0086\u0002J)\u0010[\u001a\u00020\u00002\u0006\u0010^\u001a\u00020b2\u0006\u0010_\u001a\u00020b2\u0006\u0010`\u001a\u00020b2\u0006\u0010a\u001a\u00020bH\u0086\u0002J\t\u0010c\u001a\u00020bHÖ\u0001J\t\u0010d\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010e\u001a\u00020\u00032\u0006\u0010\\\u001a\u00020bH\u0086\nJ\u0011\u0010f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\nJ\u0011\u0010f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\tH\u0086\nJ\u0011\u0010f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\nJ\u0011\u0010f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\nJ\u0011\u0010g\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\nJ\u0011\u0010g\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\tH\u0086\nJ\u0011\u0010g\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\nJ\u0011\u0010g\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\nJ1\u0010h\u001a\u00020i2\u0006\u0010^\u001a\u00020]2\u0006\u0010_\u001a\u00020]2\u0006\u0010`\u001a\u00020]2\u0006\u0010a\u001a\u00020]2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J)\u0010h\u001a\u00020i2\u0006\u0010^\u001a\u00020]2\u0006\u0010_\u001a\u00020]2\u0006\u0010`\u001a\u00020]2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J!\u0010h\u001a\u00020i2\u0006\u0010^\u001a\u00020]2\u0006\u0010_\u001a\u00020]2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J\u0019\u0010h\u001a\u00020i2\u0006\u0010\\\u001a\u00020]2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J\u0019\u0010h\u001a\u00020i2\u0006\u0010\\\u001a\u00020b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J!\u0010h\u001a\u00020i2\u0006\u0010^\u001a\u00020b2\u0006\u0010_\u001a\u00020b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J)\u0010h\u001a\u00020i2\u0006\u0010^\u001a\u00020b2\u0006\u0010_\u001a\u00020b2\u0006\u0010`\u001a\u00020b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J1\u0010h\u001a\u00020i2\u0006\u0010^\u001a\u00020b2\u0006\u0010_\u001a\u00020b2\u0006\u0010`\u001a\u00020b2\u0006\u0010a\u001a\u00020b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J\u0011\u0010j\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\nJ\u0011\u0010j\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\tH\u0086\nJ\u0011\u0010j\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\nJ\u0011\u0010j\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\nJ\u0006\u0010k\u001a\u00020lJ\t\u0010m\u001a\u00020nHÖ\u0001J \u0010o\u001a\u00020\u00002\u0012\u0010p\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030qH\u0086\bø\u0001\u0000J\t\u0010r\u001a\u00020\u0000H\u0086\u0002R&\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0004R&\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0004R&\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u0004R&\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0004R&\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010\u0004R&\u0010 \u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0004R&\u0010#\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R&\u0010(\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R&\u0010-\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u0010\u000bR&\u00101\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010\u0012\"\u0004\b3\u0010\u0004R&\u00104\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b5\u0010%\"\u0004\b6\u0010'R&\u00107\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b8\u0010*\"\u0004\b9\u0010,R&\u0010:\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010/\"\u0004\b<\u0010\u000bR&\u0010=\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010\u0012\"\u0004\b?\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0012\"\u0004\bA\u0010\u0004R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0012\"\u0004\bC\u0010\u0004R&\u0010D\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010%\"\u0004\bF\u0010'R&\u0010G\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010*\"\u0004\bI\u0010,R&\u0010J\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010/\"\u0004\bL\u0010\u000bR\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0012\"\u0004\bN\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0012\"\u0004\bP\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006s"}, m28432d2 = {"Lcom/google/android/filament/utils/Float4;", "", "v", "", "(F)V", "Lcom/google/android/filament/utils/Float2;", "z", "w", "(Lcom/google/android/filament/utils/Float2;FF)V", "Lcom/google/android/filament/utils/Float3;", "(Lcom/google/android/filament/utils/Float3;F)V", "(Lcom/google/android/filament/utils/Float4;)V", "x", "y", "(FFFF)V", "value", C17296a.f69688o, "getA", "()F", "setA", "b", "getB", "setB", "g", "getG", "setG", "p", "getP", "setP", "q", "getQ", "setQ", "r", "getR", "setR", "rg", "getRg", "()Lcom/google/android/filament/utils/Float2;", "setRg", "(Lcom/google/android/filament/utils/Float2;)V", "rgb", "getRgb", "()Lcom/google/android/filament/utils/Float3;", "setRgb", "(Lcom/google/android/filament/utils/Float3;)V", "rgba", "getRgba", "()Lcom/google/android/filament/utils/Float4;", "setRgba", "s", "getS", "setS", "st", "getSt", "setSt", "stp", "getStp", "setStp", "stpq", "getStpq", "setStpq", "t", "getT", "setT", "getW", "setW", "getX", "setX", "xy", "getXy", "setXy", "xyz", "getXyz", "setXyz", "xyzw", "getXyzw", "setXyzw", "getY", "setY", "getZ", "setZ", "component1", "component2", "component3", "component4", "copy", "dec", "div", "equals", "", LegacyRepairType.OTHER_KEY, "get", "index", "Lcom/google/android/filament/utils/VectorComponent;", "index1", "index2", "index3", "index4", "", "hashCode", "inc", "invoke", "minus", "plus", "set", "", "times", "toFloatArray", "", "toString", "", "transform", "block", "Lkotlin/Function1;", "unaryMinus", "filament-utils-android_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes5.dex */
public final class Float4 {

    /* renamed from: w */
    private float f70138w;

    /* renamed from: x */
    private float f70139x;

    /* renamed from: y */
    private float f70140y;

    /* renamed from: z */
    private float f70141z;

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
            try {
                iArr[VectorComponent.W.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[VectorComponent.A.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[VectorComponent.Q.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Float4() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public static /* synthetic */ Float4 copy$default(Float4 float4, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = float4.f70139x;
        }
        if ((i & 2) != 0) {
            f2 = float4.f70140y;
        }
        if ((i & 4) != 0) {
            f3 = float4.f70141z;
        }
        if ((i & 8) != 0) {
            f4 = float4.f70138w;
        }
        return float4.copy(f, f2, f3, f4);
    }

    public final float component1() {
        return this.f70139x;
    }

    public final float component2() {
        return this.f70140y;
    }

    public final float component3() {
        return this.f70141z;
    }

    public final float component4() {
        return this.f70138w;
    }

    public final Float4 copy(float f, float f2, float f3, float f4) {
        return new Float4(f, f2, f3, f4);
    }

    public final Float4 dec() {
        float f = this.f70139x;
        this.f70139x = f - 1.0f;
        float f2 = this.f70140y;
        this.f70140y = f2 - 1.0f;
        float f3 = this.f70141z;
        this.f70141z = f3 - 1.0f;
        float f4 = this.f70138w;
        this.f70138w = (-1.0f) + f4;
        return new Float4(f, f2, f3, f4);
    }

    public final Float4 div(float f) {
        return new Float4(getX() / f, getY() / f, getZ() / f, getW() / f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Float4) {
            Float4 float4 = (Float4) obj;
            return Float.compare(this.f70139x, float4.f70139x) == 0 && Float.compare(this.f70140y, float4.f70140y) == 0 && Float.compare(this.f70141z, float4.f70141z) == 0 && Float.compare(this.f70138w, float4.f70138w) == 0;
        }
        return false;
    }

    public final float get(VectorComponent index) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (WhenMappings.$EnumSwitchMapping$0[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return this.f70139x;
            case 4:
            case 5:
            case 6:
                return this.f70140y;
            case 7:
            case 8:
            case 9:
                return this.f70141z;
            case 10:
            case 11:
            case 12:
                return this.f70138w;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final float getA() {
        return getW();
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

    public final float getQ() {
        return getW();
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

    public final Float4 getRgba() {
        return new Float4(getX(), getY(), getZ(), getW());
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

    public final Float4 getStpq() {
        return new Float4(getX(), getY(), getZ(), getW());
    }

    public final float getT() {
        return getY();
    }

    public final float getW() {
        return this.f70138w;
    }

    public final float getX() {
        return this.f70139x;
    }

    public final Float2 getXy() {
        return new Float2(getX(), getY());
    }

    public final Float3 getXyz() {
        return new Float3(getX(), getY(), getZ());
    }

    public final Float4 getXyzw() {
        return new Float4(getX(), getY(), getZ(), getW());
    }

    public final float getY() {
        return this.f70140y;
    }

    public final float getZ() {
        return this.f70141z;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f70139x) * 31) + Float.hashCode(this.f70140y)) * 31) + Float.hashCode(this.f70141z)) * 31) + Float.hashCode(this.f70138w);
    }

    public final Float4 inc() {
        float f = this.f70139x;
        this.f70139x = f + 1.0f;
        float f2 = this.f70140y;
        this.f70140y = f2 + 1.0f;
        float f3 = this.f70141z;
        this.f70141z = f3 + 1.0f;
        float f4 = this.f70138w;
        this.f70138w = 1.0f + f4;
        return new Float4(f, f2, f3, f4);
    }

    public final float invoke(int i) {
        return get(i - 1);
    }

    public final Float4 minus(float f) {
        return new Float4(getX() - f, getY() - f, getZ() - f, getW() - f);
    }

    public final Float4 plus(float f) {
        return new Float4(getX() + f, getY() + f, getZ() + f, getW() + f);
    }

    public final void set(int i, float f) {
        if (i == 0) {
            this.f70139x = f;
        } else if (i == 1) {
            this.f70140y = f;
        } else if (i == 2) {
            this.f70141z = f;
        } else if (i == 3) {
            this.f70138w = f;
        } else {
            throw new IllegalArgumentException("index must be in 0..3");
        }
    }

    public final void setA(float f) {
        setW(f);
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

    public final void setQ(float f) {
        setW(f);
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

    public final void setRgba(Float4 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
        setW(value.getW());
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

    public final void setStpq(Float4 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
        setW(value.getW());
    }

    public final void setT(float f) {
        setY(f);
    }

    public final void setW(float f) {
        this.f70138w = f;
    }

    public final void setX(float f) {
        this.f70139x = f;
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

    public final void setXyzw(Float4 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
        setW(value.getW());
    }

    public final void setY(float f) {
        this.f70140y = f;
    }

    public final void setZ(float f) {
        this.f70141z = f;
    }

    public final Float4 times(float f) {
        return new Float4(getX() * f, getY() * f, getZ() * f, getW() * f);
    }

    public final float[] toFloatArray() {
        return new float[]{this.f70139x, this.f70140y, this.f70141z, this.f70138w};
    }

    public String toString() {
        return "Float4(x=" + this.f70139x + ", y=" + this.f70140y + ", z=" + this.f70141z + ", w=" + this.f70138w + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final Float4 transform(Function1<? super Float, Float> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        setX(block.invoke(Float.valueOf(getX())).floatValue());
        setY(block.invoke(Float.valueOf(getY())).floatValue());
        setZ(block.invoke(Float.valueOf(getZ())).floatValue());
        setW(block.invoke(Float.valueOf(getW())).floatValue());
        return this;
    }

    public final Float4 unaryMinus() {
        return new Float4(-this.f70139x, -this.f70140y, -this.f70141z, -this.f70138w);
    }

    public Float4(float f, float f2, float f3, float f4) {
        this.f70139x = f;
        this.f70140y = f2;
        this.f70141z = f3;
        this.f70138w = f4;
    }

    public final Float4 div(Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4(getX() / v.getX(), getY() / v.getY(), getZ(), getW());
    }

    public final Float4 minus(Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4(getX() - v.getX(), getY() - v.getY(), getZ(), getW());
    }

    public final Float4 plus(Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4(getX() + v.getX(), getY() + v.getY(), getZ(), getW());
    }

    public final Float4 times(Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4(getX() * v.getX(), getY() * v.getY(), getZ(), getW());
    }

    public final Float4 div(Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4(getX() / v.getX(), getY() / v.getY(), getZ() / v.getZ(), getW());
    }

    public final Float4 minus(Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4(getX() - v.getX(), getY() - v.getY(), getZ() - v.getZ(), getW());
    }

    public final Float4 plus(Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4(getX() + v.getX(), getY() + v.getY(), getZ() + v.getZ(), getW());
    }

    public final Float4 times(Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4(getX() * v.getX(), getY() * v.getY(), getZ() * v.getZ(), getW());
    }

    public final Float4 div(Float4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4(getX() / v.getX(), getY() / v.getY(), getZ() / v.getZ(), getW() / v.getW());
    }

    public final Float4 minus(Float4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4(getX() - v.getX(), getY() - v.getY(), getZ() - v.getZ(), getW() - v.getW());
    }

    public final Float4 plus(Float4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4(getX() + v.getX(), getY() + v.getY(), getZ() + v.getZ(), getW() + v.getW());
    }

    public final Float4 times(Float4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4(getX() * v.getX(), getY() * v.getY(), getZ() * v.getZ(), getW() * v.getW());
    }

    public final Float2 get(VectorComponent index1, VectorComponent index2) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        return new Float2(get(index1), get(index2));
    }

    public final void set(int i, int i2, float f) {
        set(i, f);
        set(i2, f);
    }

    public /* synthetic */ Float4(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4);
    }

    public final Float3 get(VectorComponent index1, VectorComponent index2, VectorComponent index3) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        return new Float3(get(index1), get(index2), get(index3));
    }

    public Float4(float f) {
        this(f, f, f, f);
    }

    public final Float4 get(VectorComponent index1, VectorComponent index2, VectorComponent index3, VectorComponent index4) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        Intrinsics.checkNotNullParameter(index4, "index4");
        return new Float4(get(index1), get(index2), get(index3), get(index4));
    }

    public final void set(int i, int i2, int i3, float f) {
        set(i, f);
        set(i2, f);
        set(i3, f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Float4(Float2 v, float f, float f2) {
        this(v.getX(), v.getY(), f, f2);
        Intrinsics.checkNotNullParameter(v, "v");
    }

    public final float get(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return this.f70138w;
                    }
                    throw new IllegalArgumentException("index must be in 0..3");
                }
                return this.f70141z;
            }
            return this.f70140y;
        }
        return this.f70139x;
    }

    public /* synthetic */ Float4(Float2 float2, float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(float2, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Float4(Float3 v, float f) {
        this(v.getX(), v.getY(), v.getZ(), f);
        Intrinsics.checkNotNullParameter(v, "v");
    }

    public final void set(int i, int i2, int i3, int i4, float f) {
        set(i, f);
        set(i2, f);
        set(i3, f);
        set(i4, f);
    }

    public /* synthetic */ Float4(Float3 float3, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(float3, (i & 2) != 0 ? 0.0f : f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Float4(Float4 v) {
        this(v.f70139x, v.f70140y, v.f70141z, v.f70138w);
        Intrinsics.checkNotNullParameter(v, "v");
    }

    public final Float2 get(int i, int i2) {
        return new Float2(get(i), get(i2));
    }

    public final Float3 get(int i, int i2, int i3) {
        return new Float3(get(i), get(i2), get(i3));
    }

    public final void set(VectorComponent index, float f) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (WhenMappings.$EnumSwitchMapping$0[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.f70139x = f;
                return;
            case 4:
            case 5:
            case 6:
                this.f70140y = f;
                return;
            case 7:
            case 8:
            case 9:
                this.f70141z = f;
                return;
            case 10:
            case 11:
            case 12:
                this.f70138w = f;
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final Float4 get(int i, int i2, int i3, int i4) {
        return new Float4(get(i), get(i2), get(i3), get(i4));
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

    public final void set(VectorComponent index1, VectorComponent index2, VectorComponent index3, VectorComponent index4, float f) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        Intrinsics.checkNotNullParameter(index4, "index4");
        set(index1, f);
        set(index2, f);
        set(index3, f);
        set(index4, f);
    }
}
