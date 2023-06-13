package com.google.android.filament.utils;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 L2\u00020\u0001:\u0001LB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u000f\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0000¢\u0006\u0002\u0010\nB-\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eJ\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J1\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0011\u0010.\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\nJ\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0011\u00102\u001a\u00020\u00052\u0006\u00103\u001a\u000204H\u0086\u0002J!\u00102\u001a\u00020\u00032\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u0002042\u0006\u00107\u001a\u000204H\u0086\u0002J)\u00102\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u0002042\u0006\u00107\u001a\u0002042\u0006\u00108\u001a\u000204H\u0086\u0002J\u0011\u00102\u001a\u00020\u00052\u0006\u00103\u001a\u000209H\u0086\u0002J!\u00102\u001a\u00020\u00032\u0006\u00105\u001a\u0002092\u0006\u00106\u001a\u0002092\u0006\u00107\u001a\u000209H\u0086\u0002J)\u00102\u001a\u00020\u00002\u0006\u00105\u001a\u0002092\u0006\u00106\u001a\u0002092\u0006\u00107\u001a\u0002092\u0006\u00108\u001a\u000209H\u0086\u0002J\t\u0010:\u001a\u000209HÖ\u0001J\u0011\u0010;\u001a\u00020\u00052\u0006\u00103\u001a\u000209H\u0086\nJ\u0011\u0010<\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0086\nJ\u0011\u0010<\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\nJ\u0011\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0086\nJ\u0011\u0010=\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\nJ1\u0010>\u001a\u00020?2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u0002042\u0006\u00107\u001a\u0002042\u0006\u00108\u001a\u0002042\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J)\u0010>\u001a\u00020?2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u0002042\u0006\u00107\u001a\u0002042\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J!\u0010>\u001a\u00020?2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u0002042\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J\u0019\u0010>\u001a\u00020?2\u0006\u00103\u001a\u0002042\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J\u0019\u0010>\u001a\u00020?2\u0006\u00103\u001a\u0002092\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J!\u0010>\u001a\u00020?2\u0006\u00105\u001a\u0002092\u0006\u00106\u001a\u0002092\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J)\u0010>\u001a\u00020?2\u0006\u00105\u001a\u0002092\u0006\u00106\u001a\u0002092\u0006\u00107\u001a\u0002092\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J1\u0010>\u001a\u00020?2\u0006\u00105\u001a\u0002092\u0006\u00106\u001a\u0002092\u0006\u00107\u001a\u0002092\u0006\u00108\u001a\u0002092\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J\u0011\u0010@\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\nJ\u0011\u0010@\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0086\nJ\u0011\u0010@\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\nJ\u0006\u0010A\u001a\u00020\u0003J\u0006\u0010B\u001a\u00020CJ\u0006\u0010D\u001a\u00020EJ\t\u0010F\u001a\u00020GHÖ\u0001J \u0010H\u001a\u00020\u00002\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050JH\u0086\bø\u0001\u0000J\t\u0010K\u001a\u00020\u0000H\u0086\u0002R&\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R&\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R&\u0010!\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00078Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010\bR\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0017\"\u0004\b&\u0010\u0019R\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0017\"\u0004\b(\u0010\u0019\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006M"}, m28432d2 = {"Lcom/google/android/filament/utils/Quaternion;", "", "v", "Lcom/google/android/filament/utils/Float3;", "w", "", "(Lcom/google/android/filament/utils/Float3;F)V", "Lcom/google/android/filament/utils/Float4;", "(Lcom/google/android/filament/utils/Float4;)V", "q", "(Lcom/google/android/filament/utils/Quaternion;)V", "x", "y", "z", "(FFFF)V", "value", "imaginary", "getImaginary", "()Lcom/google/android/filament/utils/Float3;", "setImaginary", "(Lcom/google/android/filament/utils/Float3;)V", "real", "getReal", "()F", "setReal", "(F)V", "getW", "setW", "getX", "setX", "xyz", "getXyz", "setXyz", "xyzw", "getXyzw", "()Lcom/google/android/filament/utils/Float4;", "setXyzw", "getY", "setY", "getZ", "setZ", "component1", "component2", "component3", "component4", "copy", "div", "equals", "", LegacyRepairType.OTHER_KEY, "get", "index", "Lcom/google/android/filament/utils/QuaternionComponent;", "index1", "index2", "index3", "index4", "", "hashCode", "invoke", "minus", "plus", "set", "", "times", "toEulerAngles", "toFloatArray", "", "toMatrix", "Lcom/google/android/filament/utils/Mat4;", "toString", "", "transform", "block", "Lkotlin/Function1;", "unaryMinus", "Companion", "filament-utils-android_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nQuaternion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Quaternion.kt\ncom/google/android/filament/utils/Quaternion\n*L\n1#1,343:1\n95#1:344\n230#1,5:345\n95#1:350\n*S KotlinDebug\n*F\n+ 1 Quaternion.kt\ncom/google/android/filament/utils/Quaternion\n*L\n103#1:344\n226#1:345,5\n226#1:350\n*E\n"})
/* loaded from: classes5.dex */
public final class Quaternion {
    public static final Companion Companion = new Companion(null);

    /* renamed from: w */
    private float f70156w;

    /* renamed from: x */
    private float f70157x;

    /* renamed from: y */
    private float f70158y;

    /* renamed from: z */
    private float f70159z;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006J$\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b¨\u0006\u000f"}, m28432d2 = {"Lcom/google/android/filament/utils/Quaternion$Companion;", "", "()V", "fromAxisAngle", "Lcom/google/android/filament/utils/Quaternion;", "axis", "Lcom/google/android/filament/utils/Float3;", "angle", "", "fromEuler", DateTokenConverter.CONVERTER_KEY, "fromEulerZYX", "yaw", "pitch", "roll", "filament-utils-android_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nQuaternion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Quaternion.kt\ncom/google/android/filament/utils/Quaternion$Companion\n+ 2 Scalar.kt\ncom/google/android/filament/utils/ScalarKt\n+ 3 Vector.kt\ncom/google/android/filament/utils/VectorKt\n+ 4 Vector.kt\ncom/google/android/filament/utils/Float3\n*L\n1#1,343:1\n39#2:344\n39#2:348\n652#3:345\n715#3:346\n306#4:347\n307#4,3:349\n*S KotlinDebug\n*F\n+ 1 Quaternion.kt\ncom/google/android/filament/utils/Quaternion$Companion\n*L\n50#1:344\n63#1:348\n51#1:345\n63#1:346\n63#1:347\n63#1:349,3\n*E\n"})
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Quaternion fromEulerZYX$default(Companion companion, float f, float f2, float f3, int i, Object obj) {
            if ((i & 1) != 0) {
                f = 0.0f;
            }
            if ((i & 2) != 0) {
                f2 = 0.0f;
            }
            if ((i & 4) != 0) {
                f3 = 0.0f;
            }
            return companion.fromEulerZYX(f, f2, f3);
        }

        public final Quaternion fromAxisAngle(Float3 axis, float f) {
            Intrinsics.checkNotNullParameter(axis, "axis");
            double d = f * 0.017453292f * 0.5f;
            float sin = (float) Math.sin(d);
            Float3 normalize = VectorKt.normalize(axis);
            return new Quaternion(new Float3(normalize.getX() * sin, normalize.getY() * sin, sin * normalize.getZ()), (float) Math.cos(d));
        }

        public final Quaternion fromEuler(Float3 d) {
            Intrinsics.checkNotNullParameter(d, "d");
            Float3 copy$default = Float3.copy$default(d, 0.0f, 0.0f, 0.0f, 7, null);
            copy$default.setX(copy$default.getX() * 0.017453292f);
            copy$default.setY(copy$default.getY() * 0.017453292f);
            copy$default.setZ(copy$default.getZ() * 0.017453292f);
            return fromEulerZYX(copy$default.getZ(), copy$default.getY(), copy$default.getX());
        }

        public final Quaternion fromEulerZYX(float f, float f2, float f3) {
            double d = f * 0.5f;
            float cos = (float) Math.cos(d);
            float sin = (float) Math.sin(d);
            double d2 = f2 * 0.5f;
            float cos2 = (float) Math.cos(d2);
            float sin2 = (float) Math.sin(d2);
            double d3 = f3 * 0.5f;
            float cos3 = (float) Math.cos(d3);
            float sin3 = (float) Math.sin(d3);
            float f4 = sin3 * cos2;
            float f5 = cos3 * sin2;
            float f6 = cos3 * cos2;
            float f7 = sin3 * sin2;
            return new Quaternion((f4 * cos) - (f5 * sin), (f5 * cos) + (f4 * sin), (f6 * sin) - (f7 * cos), (f6 * cos) + (f7 * sin));
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes5.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QuaternionComponent.values().length];
            try {
                iArr[QuaternionComponent.X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QuaternionComponent.Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QuaternionComponent.Z.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[QuaternionComponent.W.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Quaternion() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public static /* synthetic */ Quaternion copy$default(Quaternion quaternion, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = quaternion.f70157x;
        }
        if ((i & 2) != 0) {
            f2 = quaternion.f70158y;
        }
        if ((i & 4) != 0) {
            f3 = quaternion.f70159z;
        }
        if ((i & 8) != 0) {
            f4 = quaternion.f70156w;
        }
        return quaternion.copy(f, f2, f3, f4);
    }

    public final float component1() {
        return this.f70157x;
    }

    public final float component2() {
        return this.f70158y;
    }

    public final float component3() {
        return this.f70159z;
    }

    public final float component4() {
        return this.f70156w;
    }

    public final Quaternion copy(float f, float f2, float f3, float f4) {
        return new Quaternion(f, f2, f3, f4);
    }

    public final Quaternion div(float f) {
        return new Quaternion(getX() / f, getY() / f, getZ() / f, getW() / f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Quaternion) {
            Quaternion quaternion = (Quaternion) obj;
            return Float.compare(this.f70157x, quaternion.f70157x) == 0 && Float.compare(this.f70158y, quaternion.f70158y) == 0 && Float.compare(this.f70159z, quaternion.f70159z) == 0 && Float.compare(this.f70156w, quaternion.f70156w) == 0;
        }
        return false;
    }

    public final float get(QuaternionComponent index) {
        Intrinsics.checkNotNullParameter(index, "index");
        int i = WhenMappings.$EnumSwitchMapping$0[index.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return this.f70156w;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return this.f70159z;
            }
            return this.f70158y;
        }
        return this.f70157x;
    }

    public final Float3 getImaginary() {
        return new Float3(getX(), getY(), getZ());
    }

    public final float getReal() {
        return getW();
    }

    public final float getW() {
        return this.f70156w;
    }

    public final float getX() {
        return this.f70157x;
    }

    public final Float3 getXyz() {
        return new Float3(getX(), getY(), getZ());
    }

    public final Float4 getXyzw() {
        return new Float4(getX(), getY(), getZ(), getW());
    }

    public final float getY() {
        return this.f70158y;
    }

    public final float getZ() {
        return this.f70159z;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f70157x) * 31) + Float.hashCode(this.f70158y)) * 31) + Float.hashCode(this.f70159z)) * 31) + Float.hashCode(this.f70156w);
    }

    public final float invoke(int i) {
        return get(i - 1);
    }

    public final Quaternion minus(float f) {
        return new Quaternion(getX() - f, getY() - f, getZ() - f, getW() - f);
    }

    public final Quaternion plus(float f) {
        return new Quaternion(getX() + f, getY() + f, getZ() + f, getW() + f);
    }

    public final void set(int i, float f) {
        if (i == 0) {
            this.f70157x = f;
        } else if (i == 1) {
            this.f70158y = f;
        } else if (i == 2) {
            this.f70159z = f;
        } else if (i == 3) {
            this.f70156w = f;
        } else {
            throw new IllegalArgumentException("index must be in 0..3");
        }
    }

    public final void setImaginary(Float3 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
    }

    public final void setReal(float f) {
        setW(f);
    }

    public final void setW(float f) {
        this.f70156w = f;
    }

    public final void setX(float f) {
        this.f70157x = f;
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
        this.f70158y = f;
    }

    public final void setZ(float f) {
        this.f70159z = f;
    }

    public final Quaternion times(float f) {
        return new Quaternion(getX() * f, getY() * f, getZ() * f, getW() * f);
    }

    public final Float3 toEulerAngles() {
        return QuaternionKt.eulerAngles(this);
    }

    public final float[] toFloatArray() {
        return new float[]{this.f70157x, this.f70158y, this.f70159z, this.f70156w};
    }

    public final Mat4 toMatrix() {
        return MatrixKt.rotation(this);
    }

    public String toString() {
        return "Quaternion(x=" + this.f70157x + ", y=" + this.f70158y + ", z=" + this.f70159z + ", w=" + this.f70156w + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final Quaternion transform(Function1<? super Float, Float> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        setX(block.invoke(Float.valueOf(getX())).floatValue());
        setY(block.invoke(Float.valueOf(getY())).floatValue());
        setZ(block.invoke(Float.valueOf(getZ())).floatValue());
        setW(block.invoke(Float.valueOf(getW())).floatValue());
        return this;
    }

    public final Quaternion unaryMinus() {
        return new Quaternion(-this.f70157x, -this.f70158y, -this.f70159z, -this.f70156w);
    }

    public Quaternion(float f, float f2, float f3, float f4) {
        this.f70157x = f;
        this.f70158y = f2;
        this.f70159z = f3;
        this.f70156w = f4;
    }

    public final Quaternion minus(Quaternion q) {
        Intrinsics.checkNotNullParameter(q, "q");
        return new Quaternion(getX() - q.getX(), getY() - q.getY(), getZ() - q.getZ(), getW() - q.getW());
    }

    public final Quaternion plus(Quaternion q) {
        Intrinsics.checkNotNullParameter(q, "q");
        return new Quaternion(getX() + q.getX(), getY() + q.getY(), getZ() + q.getZ(), getW() + q.getW());
    }

    public final Float3 times(Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        Quaternion quaternion = new Quaternion(v, 0.0f);
        Quaternion quaternion2 = new Quaternion((((getW() * quaternion.getX()) + (getX() * quaternion.getW())) + (getY() * quaternion.getZ())) - (getZ() * quaternion.getY()), ((getW() * quaternion.getY()) - (getX() * quaternion.getZ())) + (getY() * quaternion.getW()) + (getZ() * quaternion.getX()), (((getW() * quaternion.getZ()) + (getX() * quaternion.getY())) - (getY() * quaternion.getX())) + (getZ() * quaternion.getW()), (((getW() * quaternion.getW()) - (getX() * quaternion.getX())) - (getY() * quaternion.getY())) - (getZ() * quaternion.getZ()));
        Quaternion inverse = QuaternionKt.inverse(this);
        Quaternion quaternion3 = new Quaternion((((quaternion2.getW() * inverse.getX()) + (quaternion2.getX() * inverse.getW())) + (quaternion2.getY() * inverse.getZ())) - (quaternion2.getZ() * inverse.getY()), ((quaternion2.getW() * inverse.getY()) - (quaternion2.getX() * inverse.getZ())) + (quaternion2.getY() * inverse.getW()) + (quaternion2.getZ() * inverse.getX()), (((quaternion2.getW() * inverse.getZ()) + (quaternion2.getX() * inverse.getY())) - (quaternion2.getY() * inverse.getX())) + (quaternion2.getZ() * inverse.getW()), (((quaternion2.getW() * inverse.getW()) - (quaternion2.getX() * inverse.getX())) - (quaternion2.getY() * inverse.getY())) - (quaternion2.getZ() * inverse.getZ()));
        return new Float3(quaternion3.getX(), quaternion3.getY(), quaternion3.getZ());
    }

    public final Float3 get(QuaternionComponent index1, QuaternionComponent index2, QuaternionComponent index3) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        return new Float3(get(index1), get(index2), get(index3));
    }

    public final void set(int i, int i2, float f) {
        set(i, f);
        set(i2, f);
    }

    public /* synthetic */ Quaternion(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4);
    }

    public final Quaternion get(QuaternionComponent index1, QuaternionComponent index2, QuaternionComponent index3, QuaternionComponent index4) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        Intrinsics.checkNotNullParameter(index4, "index4");
        return new Quaternion(get(index1), get(index2), get(index3), get(index4));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Quaternion(Float3 v, float f) {
        this(v.getX(), v.getY(), v.getZ(), f);
        Intrinsics.checkNotNullParameter(v, "v");
    }

    public final float get(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return this.f70156w;
                    }
                    throw new IllegalArgumentException("index must be in 0..3");
                }
                return this.f70159z;
            }
            return this.f70158y;
        }
        return this.f70157x;
    }

    public final void set(int i, int i2, int i3, float f) {
        set(i, f);
        set(i2, f);
        set(i3, f);
    }

    public /* synthetic */ Quaternion(Float3 float3, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(float3, (i & 2) != 0 ? 0.0f : f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Quaternion(Float4 v) {
        this(v.getX(), v.getY(), v.getZ(), v.getW());
        Intrinsics.checkNotNullParameter(v, "v");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Quaternion(Quaternion q) {
        this(q.f70157x, q.f70158y, q.f70159z, q.f70156w);
        Intrinsics.checkNotNullParameter(q, "q");
    }

    public final void set(int i, int i2, int i3, int i4, float f) {
        set(i, f);
        set(i2, f);
        set(i3, f);
        set(i4, f);
    }

    public final Float3 get(int i, int i2, int i3) {
        return new Float3(get(i), get(i2), get(i3));
    }

    public final Quaternion get(int i, int i2, int i3, int i4) {
        return new Quaternion(get(i), get(i2), get(i3), get(i4));
    }

    public final void set(QuaternionComponent index, float f) {
        Intrinsics.checkNotNullParameter(index, "index");
        int i = WhenMappings.$EnumSwitchMapping$0[index.ordinal()];
        if (i == 1) {
            this.f70157x = f;
        } else if (i == 2) {
            this.f70158y = f;
        } else if (i == 3) {
            this.f70159z = f;
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        } else {
            this.f70156w = f;
        }
    }

    public final Quaternion times(Quaternion q) {
        Intrinsics.checkNotNullParameter(q, "q");
        return new Quaternion((((getW() * q.getX()) + (getX() * q.getW())) + (getY() * q.getZ())) - (getZ() * q.getY()), ((getW() * q.getY()) - (getX() * q.getZ())) + (getY() * q.getW()) + (getZ() * q.getX()), (((getW() * q.getZ()) + (getX() * q.getY())) - (getY() * q.getX())) + (getZ() * q.getW()), (((getW() * q.getW()) - (getX() * q.getX())) - (getY() * q.getY())) - (getZ() * q.getZ()));
    }

    public final void set(QuaternionComponent index1, QuaternionComponent index2, float f) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        set(index1, f);
        set(index2, f);
    }

    public final void set(QuaternionComponent index1, QuaternionComponent index2, QuaternionComponent index3, float f) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        set(index1, f);
        set(index2, f);
        set(index3, f);
    }

    public final void set(QuaternionComponent index1, QuaternionComponent index2, QuaternionComponent index3, QuaternionComponent index4, float f) {
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
