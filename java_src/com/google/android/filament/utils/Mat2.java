package com.google.android.filament.utils;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__IndentKt;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u0000 *2\u00020\u0001:\u0001*B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0002\u0010\u0003B\u0019\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0086\u0002J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0011\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aH\u0086\u0002J\u0019\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0086\u0002J\u0011\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001cH\u0086\u0002J\u0019\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001cH\u0086\u0002J\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0000H\u0086\u0002J\u0019\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001cH\u0086\u0002J!\u0010\u001f\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0014H\u0086\u0002J\u0011\u0010!\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0086\u0002J\u0011\u0010\"\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0086\u0002J\u0019\u0010#\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0005H\u0086\u0002J!\u0010#\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0014H\u0086\u0002J\u0011\u0010$\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0086\u0002J\u0011\u0010$\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010$\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0086\u0002J\u0006\u0010%\u001a\u00020&J\b\u0010'\u001a\u00020(H\u0016J\t\u0010)\u001a\u00020\u0000H\u0086\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b¨\u0006+"}, m28432d2 = {"Lcom/google/android/filament/utils/Mat2;", "", "m", "(Lcom/google/android/filament/utils/Mat2;)V", "x", "Lcom/google/android/filament/utils/Float2;", "y", "(Lcom/google/android/filament/utils/Float2;Lcom/google/android/filament/utils/Float2;)V", "getX", "()Lcom/google/android/filament/utils/Float2;", "setX", "(Lcom/google/android/filament/utils/Float2;)V", "getY", "setY", "component1", "component2", "copy", "dec", "div", "v", "", "equals", "", LegacyRepairType.OTHER_KEY, "get", "column", "Lcom/google/android/filament/utils/MatrixColumn;", "row", "", "hashCode", "inc", "invoke", "", "minus", "plus", "set", "times", "toFloatArray", "", "toString", "", "unaryMinus", "Companion", "filament-utils-android_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\ncom/google/android/filament/utils/Mat2\n+ 2 Vector.kt\ncom/google/android/filament/utils/Float2\n*L\n1#1,682:1\n61#2,3:683\n123#2:686\n124#2:687\n125#2:688\n126#2:689\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\ncom/google/android/filament/utils/Mat2\n*L\n66#1:683,3\n76#1:686\n77#1:687\n78#1:688\n79#1:689\n*E\n"})
/* loaded from: classes5.dex */
public final class Mat2 {
    public static final Companion Companion = new Companion(null);

    /* renamed from: x */
    private Float2 f70143x;

    /* renamed from: y */
    private Float2 f70144y;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0012\u0010\u0005\u001a\u00020\u00042\n\u0010\u0006\u001a\u00020\u0007\"\u00020\b¨\u0006\t"}, m28432d2 = {"Lcom/google/android/filament/utils/Mat2$Companion;", "", "()V", "identity", "Lcom/google/android/filament/utils/Mat2;", "of", C17296a.f69688o, "", "", "filament-utils-android_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Mat2 identity() {
            return new Mat2(null, null, 3, null);
        }

        /* renamed from: of */
        public final Mat2 m51925of(float... a) {
            boolean z;
            Intrinsics.checkNotNullParameter(a, "a");
            if (a.length >= 4) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new Mat2(new Float2(a[0], a[2]), new Float2(a[1], a[3]));
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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Mat2() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ Mat2 copy$default(Mat2 mat2, Float2 float2, Float2 float22, int i, Object obj) {
        if ((i & 1) != 0) {
            float2 = mat2.f70143x;
        }
        if ((i & 2) != 0) {
            float22 = mat2.f70144y;
        }
        return mat2.copy(float2, float22);
    }

    public final Float2 component1() {
        return this.f70143x;
    }

    public final Float2 component2() {
        return this.f70144y;
    }

    public final Mat2 copy(Float2 x, Float2 y) {
        Intrinsics.checkNotNullParameter(x, "x");
        Intrinsics.checkNotNullParameter(y, "y");
        return new Mat2(x, y);
    }

    public final Mat2 dec() {
        Float2 float2 = this.f70143x;
        this.f70143x = float2.dec();
        Float2 float22 = this.f70144y;
        this.f70144y = float22.dec();
        return new Mat2(float2, float22);
    }

    public final Mat2 div(float f) {
        Float2 float2 = this.f70143x;
        Float2 float22 = new Float2(float2.getX() / f, float2.getY() / f);
        Float2 float23 = this.f70144y;
        return new Mat2(float22, new Float2(float23.getX() / f, float23.getY() / f));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Mat2) {
            Mat2 mat2 = (Mat2) obj;
            return Intrinsics.areEqual(this.f70143x, mat2.f70143x) && Intrinsics.areEqual(this.f70144y, mat2.f70144y);
        }
        return false;
    }

    public final Float2 get(int i) {
        if (i != 0) {
            if (i == 1) {
                return this.f70144y;
            }
            throw new IllegalArgumentException("column must be in 0..1");
        }
        return this.f70143x;
    }

    public final Float2 getX() {
        return this.f70143x;
    }

    public final Float2 getY() {
        return this.f70144y;
    }

    public int hashCode() {
        return (this.f70143x.hashCode() * 31) + this.f70144y.hashCode();
    }

    public final Mat2 inc() {
        Float2 float2 = this.f70143x;
        this.f70143x = float2.inc();
        Float2 float22 = this.f70144y;
        this.f70144y = float22.inc();
        return new Mat2(float2, float22);
    }

    public final float invoke(int i, int i2) {
        return get(i2 - 1).get(i - 1);
    }

    public final Mat2 minus(float f) {
        Float2 float2 = this.f70143x;
        Float2 float22 = new Float2(float2.getX() - f, float2.getY() - f);
        Float2 float23 = this.f70144y;
        return new Mat2(float22, new Float2(float23.getX() - f, float23.getY() - f));
    }

    public final Mat2 plus(float f) {
        Float2 float2 = this.f70143x;
        Float2 float22 = new Float2(float2.getX() + f, float2.getY() + f);
        Float2 float23 = this.f70144y;
        return new Mat2(float22, new Float2(float23.getX() + f, float23.getY() + f));
    }

    public final void set(int i, Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        Float2 float2 = get(i);
        float2.setX(v.getX());
        float2.setY(v.getY());
    }

    public final void setX(Float2 float2) {
        Intrinsics.checkNotNullParameter(float2, "<set-?>");
        this.f70143x = float2;
    }

    public final void setY(Float2 float2) {
        Intrinsics.checkNotNullParameter(float2, "<set-?>");
        this.f70144y = float2;
    }

    public final Mat2 times(float f) {
        Float2 float2 = this.f70143x;
        Float2 float22 = new Float2(float2.getX() * f, float2.getY() * f);
        Float2 float23 = this.f70144y;
        return new Mat2(float22, new Float2(float23.getX() * f, float23.getY() * f));
    }

    public final float[] toFloatArray() {
        return new float[]{this.f70143x.getX(), this.f70144y.getX(), this.f70143x.getY(), this.f70144y.getY()};
    }

    public String toString() {
        String trimIndent;
        trimIndent = StringsKt__IndentKt.trimIndent("\n            |" + this.f70143x.getX() + ' ' + this.f70144y.getX() + "|\n            |" + this.f70143x.getY() + ' ' + this.f70144y.getY() + "|\n            ");
        return trimIndent;
    }

    public final Mat2 unaryMinus() {
        return new Mat2(this.f70143x.unaryMinus(), this.f70144y.unaryMinus());
    }

    public Mat2(Float2 x, Float2 y) {
        Intrinsics.checkNotNullParameter(x, "x");
        Intrinsics.checkNotNullParameter(y, "y");
        this.f70143x = x;
        this.f70144y = y;
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

    public /* synthetic */ Mat2(Float2 float2, Float2 float22, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Float2(1.0f, 0.0f, 2, null) : float2, (i & 2) != 0 ? new Float2(0.0f, 1.0f, 1, null) : float22);
    }

    public final Float2 get(MatrixColumn column) {
        Intrinsics.checkNotNullParameter(column, "column");
        int i = WhenMappings.$EnumSwitchMapping$0[column.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return this.f70144y;
            }
            throw new IllegalArgumentException("column must be X or Y");
        }
        return this.f70143x;
    }

    public final Mat2 times(Mat2 m) {
        Intrinsics.checkNotNullParameter(m, "m");
        return new Mat2(new Float2((this.f70143x.getX() * m.f70143x.getX()) + (this.f70144y.getX() * m.f70143x.getY()), (this.f70143x.getY() * m.f70143x.getX()) + (this.f70144y.getY() * m.f70143x.getY())), new Float2((this.f70143x.getX() * m.f70144y.getX()) + (this.f70144y.getX() * m.f70144y.getY()), (this.f70143x.getY() * m.f70144y.getX()) + (this.f70144y.getY() * m.f70144y.getY())));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Mat2(Mat2 m) {
        this(Float2.copy$default(m.f70143x, 0.0f, 0.0f, 3, null), Float2.copy$default(m.f70144y, 0.0f, 0.0f, 3, null));
        Intrinsics.checkNotNullParameter(m, "m");
    }

    public final float get(MatrixColumn column, int i) {
        Intrinsics.checkNotNullParameter(column, "column");
        return get(column).get(i);
    }

    public final Float2 times(Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float2((this.f70143x.getX() * v.getX()) + (this.f70144y.getX() * v.getY()), (this.f70143x.getY() * v.getX()) + (this.f70144y.getY() * v.getY()));
    }
}
