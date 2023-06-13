package com.google.android.filament.utils;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__IndentKt;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u0000 .2\u00020\u0001:\u0001.B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0002\u0010\u0003B#\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018H\u0086\u0002J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0011\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001eH\u0086\u0002J\u0019\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0086\u0002J\u0011\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020 H\u0086\u0002J\u0019\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 H\u0086\u0002J\t\u0010!\u001a\u00020 HÖ\u0001J\t\u0010\"\u001a\u00020\u0000H\u0086\u0002J\u0019\u0010#\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020 H\u0086\u0002J!\u0010#\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0018H\u0086\u0002J\u0011\u0010%\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018H\u0086\u0002J\u0011\u0010&\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018H\u0086\u0002J\u0019\u0010'\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0005H\u0086\u0002J!\u0010'\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0018H\u0086\u0002J\u0011\u0010(\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005H\u0086\u0002J\u0011\u0010(\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010(\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018H\u0086\u0002J\u0006\u0010)\u001a\u00020*J\b\u0010+\u001a\u00020,H\u0016J\t\u0010-\u001a\u00020\u0000H\u0086\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\f¨\u0006/"}, m28432d2 = {"Lcom/google/android/filament/utils/Mat3;", "", "m", "(Lcom/google/android/filament/utils/Mat3;)V", "x", "Lcom/google/android/filament/utils/Float3;", "y", "z", "(Lcom/google/android/filament/utils/Float3;Lcom/google/android/filament/utils/Float3;Lcom/google/android/filament/utils/Float3;)V", "getX", "()Lcom/google/android/filament/utils/Float3;", "setX", "(Lcom/google/android/filament/utils/Float3;)V", "getY", "setY", "getZ", "setZ", "component1", "component2", "component3", "copy", "dec", "div", "v", "", "equals", "", LegacyRepairType.OTHER_KEY, "get", "column", "Lcom/google/android/filament/utils/MatrixColumn;", "row", "", "hashCode", "inc", "invoke", "", "minus", "plus", "set", "times", "toFloatArray", "", "toString", "", "unaryMinus", "Companion", "filament-utils-android_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\ncom/google/android/filament/utils/Mat3\n+ 2 Vector.kt\ncom/google/android/filament/utils/Float3\n*L\n1#1,682:1\n208#2,4:683\n290#2:687\n291#2:688\n292#2:689\n293#2:690\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\ncom/google/android/filament/utils/Mat3\n*L\n151#1:683,4\n161#1:687\n162#1:688\n163#1:689\n164#1:690\n*E\n"})
/* loaded from: classes5.dex */
public final class Mat3 {
    public static final Companion Companion = new Companion(null);

    /* renamed from: x */
    private Float3 f70145x;

    /* renamed from: y */
    private Float3 f70146y;

    /* renamed from: z */
    private Float3 f70147z;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0012\u0010\u0005\u001a\u00020\u00042\n\u0010\u0006\u001a\u00020\u0007\"\u00020\b¨\u0006\t"}, m28432d2 = {"Lcom/google/android/filament/utils/Mat3$Companion;", "", "()V", "identity", "Lcom/google/android/filament/utils/Mat3;", "of", C17296a.f69688o, "", "", "filament-utils-android_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Mat3 identity() {
            return new Mat3(null, null, null, 7, null);
        }

        /* renamed from: of */
        public final Mat3 m51924of(float... a) {
            boolean z;
            Intrinsics.checkNotNullParameter(a, "a");
            if (a.length >= 9) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new Mat3(new Float3(a[0], a[3], a[6]), new Float3(a[1], a[4], a[7]), new Float3(a[2], a[5], a[8]));
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes5.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MatrixColumn.values().length];
            try {
                iArr[MatrixColumn.X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MatrixColumn.Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MatrixColumn.Z.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Mat3() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Mat3 copy$default(Mat3 mat3, Float3 float3, Float3 float32, Float3 float33, int i, Object obj) {
        if ((i & 1) != 0) {
            float3 = mat3.f70145x;
        }
        if ((i & 2) != 0) {
            float32 = mat3.f70146y;
        }
        if ((i & 4) != 0) {
            float33 = mat3.f70147z;
        }
        return mat3.copy(float3, float32, float33);
    }

    public final Float3 component1() {
        return this.f70145x;
    }

    public final Float3 component2() {
        return this.f70146y;
    }

    public final Float3 component3() {
        return this.f70147z;
    }

    public final Mat3 copy(Float3 x, Float3 y, Float3 z) {
        Intrinsics.checkNotNullParameter(x, "x");
        Intrinsics.checkNotNullParameter(y, "y");
        Intrinsics.checkNotNullParameter(z, "z");
        return new Mat3(x, y, z);
    }

    public final Mat3 dec() {
        Float3 float3 = this.f70145x;
        this.f70145x = float3.dec();
        Float3 float32 = this.f70146y;
        this.f70146y = float32.dec();
        Float3 float33 = this.f70147z;
        this.f70147z = float33.dec();
        return new Mat3(float3, float32, float33);
    }

    public final Mat3 div(float f) {
        Float3 float3 = this.f70145x;
        Float3 float32 = new Float3(float3.getX() / f, float3.getY() / f, float3.getZ() / f);
        Float3 float33 = this.f70146y;
        Float3 float34 = new Float3(float33.getX() / f, float33.getY() / f, float33.getZ() / f);
        Float3 float35 = this.f70147z;
        return new Mat3(float32, float34, new Float3(float35.getX() / f, float35.getY() / f, float35.getZ() / f));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Mat3) {
            Mat3 mat3 = (Mat3) obj;
            return Intrinsics.areEqual(this.f70145x, mat3.f70145x) && Intrinsics.areEqual(this.f70146y, mat3.f70146y) && Intrinsics.areEqual(this.f70147z, mat3.f70147z);
        }
        return false;
    }

    public final Float3 get(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return this.f70147z;
                }
                throw new IllegalArgumentException("column must be in 0..2");
            }
            return this.f70146y;
        }
        return this.f70145x;
    }

    public final Float3 getX() {
        return this.f70145x;
    }

    public final Float3 getY() {
        return this.f70146y;
    }

    public final Float3 getZ() {
        return this.f70147z;
    }

    public int hashCode() {
        return (((this.f70145x.hashCode() * 31) + this.f70146y.hashCode()) * 31) + this.f70147z.hashCode();
    }

    public final Mat3 inc() {
        Float3 float3 = this.f70145x;
        this.f70145x = float3.inc();
        Float3 float32 = this.f70146y;
        this.f70146y = float32.inc();
        Float3 float33 = this.f70147z;
        this.f70147z = float33.inc();
        return new Mat3(float3, float32, float33);
    }

    public final float invoke(int i, int i2) {
        return get(i2 - 1).get(i - 1);
    }

    public final Mat3 minus(float f) {
        Float3 float3 = this.f70145x;
        Float3 float32 = new Float3(float3.getX() - f, float3.getY() - f, float3.getZ() - f);
        Float3 float33 = this.f70146y;
        Float3 float34 = new Float3(float33.getX() - f, float33.getY() - f, float33.getZ() - f);
        Float3 float35 = this.f70147z;
        return new Mat3(float32, float34, new Float3(float35.getX() - f, float35.getY() - f, float35.getZ() - f));
    }

    public final Mat3 plus(float f) {
        Float3 float3 = this.f70145x;
        Float3 float32 = new Float3(float3.getX() + f, float3.getY() + f, float3.getZ() + f);
        Float3 float33 = this.f70146y;
        Float3 float34 = new Float3(float33.getX() + f, float33.getY() + f, float33.getZ() + f);
        Float3 float35 = this.f70147z;
        return new Mat3(float32, float34, new Float3(float35.getX() + f, float35.getY() + f, float35.getZ() + f));
    }

    public final void set(int i, Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        Float3 float3 = get(i);
        float3.setX(v.getX());
        float3.setY(v.getY());
        float3.setZ(v.getZ());
    }

    public final void setX(Float3 float3) {
        Intrinsics.checkNotNullParameter(float3, "<set-?>");
        this.f70145x = float3;
    }

    public final void setY(Float3 float3) {
        Intrinsics.checkNotNullParameter(float3, "<set-?>");
        this.f70146y = float3;
    }

    public final void setZ(Float3 float3) {
        Intrinsics.checkNotNullParameter(float3, "<set-?>");
        this.f70147z = float3;
    }

    public final Mat3 times(float f) {
        Float3 float3 = this.f70145x;
        Float3 float32 = new Float3(float3.getX() * f, float3.getY() * f, float3.getZ() * f);
        Float3 float33 = this.f70146y;
        Float3 float34 = new Float3(float33.getX() * f, float33.getY() * f, float33.getZ() * f);
        Float3 float35 = this.f70147z;
        return new Mat3(float32, float34, new Float3(float35.getX() * f, float35.getY() * f, float35.getZ() * f));
    }

    public final float[] toFloatArray() {
        return new float[]{this.f70145x.getX(), this.f70146y.getX(), this.f70147z.getX(), this.f70145x.getY(), this.f70146y.getY(), this.f70147z.getY(), this.f70145x.getZ(), this.f70146y.getZ(), this.f70147z.getZ()};
    }

    public String toString() {
        String trimIndent;
        trimIndent = StringsKt__IndentKt.trimIndent("\n            |" + this.f70145x.getX() + ' ' + this.f70146y.getX() + ' ' + this.f70147z.getX() + "|\n            |" + this.f70145x.getY() + ' ' + this.f70146y.getY() + ' ' + this.f70147z.getY() + "|\n            |" + this.f70145x.getZ() + ' ' + this.f70146y.getZ() + ' ' + this.f70147z.getZ() + "|\n            ");
        return trimIndent;
    }

    public final Mat3 unaryMinus() {
        return new Mat3(this.f70145x.unaryMinus(), this.f70146y.unaryMinus(), this.f70147z.unaryMinus());
    }

    public Mat3(Float3 x, Float3 y, Float3 z) {
        Intrinsics.checkNotNullParameter(x, "x");
        Intrinsics.checkNotNullParameter(y, "y");
        Intrinsics.checkNotNullParameter(z, "z");
        this.f70145x = x;
        this.f70146y = y;
        this.f70147z = z;
    }

    public final void invoke(int i, int i2, float f) {
        set(i2 - 1, i - 1, f);
    }

    public final float get(int i, int i2) {
        return get(i).get(i2);
    }

    public final void set(int i, int i2, float f) {
        get(i).set(i2, f);
    }

    public /* synthetic */ Mat3(Float3 float3, Float3 float32, Float3 float33, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Float3(1.0f, 0.0f, 0.0f, 6, null) : float3, (i & 2) != 0 ? new Float3(0.0f, 1.0f, 0.0f, 5, null) : float32, (i & 4) != 0 ? new Float3(0.0f, 0.0f, 1.0f, 3, null) : float33);
    }

    public final Float3 get(MatrixColumn column) {
        Intrinsics.checkNotNullParameter(column, "column");
        int i = WhenMappings.$EnumSwitchMapping$0[column.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return this.f70147z;
                }
                throw new IllegalArgumentException("column must be X, Y or Z");
            }
            return this.f70146y;
        }
        return this.f70145x;
    }

    public final Mat3 times(Mat3 m) {
        Intrinsics.checkNotNullParameter(m, "m");
        return new Mat3(new Float3((this.f70145x.getX() * m.f70145x.getX()) + (this.f70146y.getX() * m.f70145x.getY()) + (this.f70147z.getX() * m.f70145x.getZ()), (this.f70145x.getY() * m.f70145x.getX()) + (this.f70146y.getY() * m.f70145x.getY()) + (this.f70147z.getY() * m.f70145x.getZ()), (this.f70145x.getZ() * m.f70145x.getX()) + (this.f70146y.getZ() * m.f70145x.getY()) + (this.f70147z.getZ() * m.f70145x.getZ())), new Float3((this.f70145x.getX() * m.f70146y.getX()) + (this.f70146y.getX() * m.f70146y.getY()) + (this.f70147z.getX() * m.f70146y.getZ()), (this.f70145x.getY() * m.f70146y.getX()) + (this.f70146y.getY() * m.f70146y.getY()) + (this.f70147z.getY() * m.f70146y.getZ()), (this.f70145x.getZ() * m.f70146y.getX()) + (this.f70146y.getZ() * m.f70146y.getY()) + (this.f70147z.getZ() * m.f70146y.getZ())), new Float3((this.f70145x.getX() * m.f70147z.getX()) + (this.f70146y.getX() * m.f70147z.getY()) + (this.f70147z.getX() * m.f70147z.getZ()), (this.f70145x.getY() * m.f70147z.getX()) + (this.f70146y.getY() * m.f70147z.getY()) + (this.f70147z.getY() * m.f70147z.getZ()), (this.f70145x.getZ() * m.f70147z.getX()) + (this.f70146y.getZ() * m.f70147z.getY()) + (this.f70147z.getZ() * m.f70147z.getZ())));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Mat3(Mat3 m) {
        this(Float3.copy$default(m.f70145x, 0.0f, 0.0f, 0.0f, 7, null), Float3.copy$default(m.f70146y, 0.0f, 0.0f, 0.0f, 7, null), Float3.copy$default(m.f70147z, 0.0f, 0.0f, 0.0f, 7, null));
        Intrinsics.checkNotNullParameter(m, "m");
    }

    public final float get(MatrixColumn column, int i) {
        Intrinsics.checkNotNullParameter(column, "column");
        return get(column).get(i);
    }

    public final Float3 times(Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float3((this.f70145x.getX() * v.getX()) + (this.f70146y.getX() * v.getY()) + (this.f70147z.getX() * v.getZ()), (this.f70145x.getY() * v.getX()) + (this.f70146y.getY() * v.getY()) + (this.f70147z.getY() * v.getZ()), (this.f70145x.getZ() * v.getX()) + (this.f70146y.getZ() * v.getY()) + (this.f70147z.getZ() * v.getZ()));
    }
}
