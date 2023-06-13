package com.google.android.filament.utils;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__IndentKt;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u0000 O2\u00020\u0001:\u0001OB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u000f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0002\u0010\tB-\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b¢\u0006\u0002\u0010\u000fJ\t\u0010/\u001a\u00020\u000bHÆ\u0003J\t\u00100\u001a\u00020\u000bHÆ\u0003J\t\u00101\u001a\u00020\u000bHÆ\u0003J\t\u00102\u001a\u00020\u000bHÆ\u0003J1\u00103\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001J\t\u00104\u001a\u00020\u0000H\u0086\u0002J\u0011\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u000207H\u0086\u0002J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0011\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020=H\u0086\u0002J\u0019\u0010;\u001a\u0002072\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0086\u0002J\u0011\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020?H\u0086\u0002J\u0019\u0010;\u001a\u0002072\u0006\u0010<\u001a\u00020?2\u0006\u0010>\u001a\u00020?H\u0086\u0002J\t\u0010@\u001a\u00020?HÖ\u0001J\t\u0010A\u001a\u00020\u0000H\u0086\u0002J\u0019\u0010B\u001a\u0002072\u0006\u0010>\u001a\u00020?2\u0006\u0010<\u001a\u00020?H\u0086\u0002J!\u0010B\u001a\u00020C2\u0006\u0010>\u001a\u00020?2\u0006\u0010<\u001a\u00020?2\u0006\u00106\u001a\u000207H\u0086\u0002J\u0011\u0010D\u001a\u00020\u00002\u0006\u00106\u001a\u000207H\u0086\u0002J\u0011\u0010E\u001a\u00020\u00002\u0006\u00106\u001a\u000207H\u0086\u0002J\u0019\u0010F\u001a\u00020C2\u0006\u0010<\u001a\u00020?2\u0006\u00106\u001a\u00020\u000bH\u0086\u0002J!\u0010F\u001a\u00020C2\u0006\u0010<\u001a\u00020?2\u0006\u0010>\u001a\u00020?2\u0006\u00106\u001a\u000207H\u0086\u0002J\u0011\u0010G\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u000bH\u0086\u0002J\u0011\u0010G\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010G\u001a\u00020\u00002\u0006\u00106\u001a\u000207H\u0086\u0002J\u0006\u0010H\u001a\u00020IJ\u0006\u0010J\u001a\u00020KJ\b\u0010L\u001a\u00020MH\u0016J\t\u0010N\u001a\u00020\u0000H\u0086\u0002R&\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012R\u0012\u0010\u001b\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0012R\u0012\u0010\u001d\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0012R&\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u0012\u0010!\u001a\u00020\"8Æ\u0002¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001a\u0010\u000e\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010&\"\u0004\b*\u0010(R\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\u001a\u0010\r\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(¨\u0006P"}, m28432d2 = {"Lcom/google/android/filament/utils/Mat4;", "", "right", "Lcom/google/android/filament/utils/Float3;", "up", "forward", "position", "(Lcom/google/android/filament/utils/Float3;Lcom/google/android/filament/utils/Float3;Lcom/google/android/filament/utils/Float3;Lcom/google/android/filament/utils/Float3;)V", "m", "(Lcom/google/android/filament/utils/Mat4;)V", "x", "Lcom/google/android/filament/utils/Float4;", "y", "z", "w", "(Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;)V", "value", "getForward", "()Lcom/google/android/filament/utils/Float3;", "setForward", "(Lcom/google/android/filament/utils/Float3;)V", "getPosition", "setPosition", "getRight", "setRight", "rotation", "getRotation", "scale", "getScale", "translation", "getTranslation", "getUp", "setUp", "upperLeft", "Lcom/google/android/filament/utils/Mat3;", "getUpperLeft", "()Lcom/google/android/filament/utils/Mat3;", "getW", "()Lcom/google/android/filament/utils/Float4;", "setW", "(Lcom/google/android/filament/utils/Float4;)V", "getX", "setX", "getY", "setY", "getZ", "setZ", "component1", "component2", "component3", "component4", "copy", "dec", "div", "v", "", "equals", "", LegacyRepairType.OTHER_KEY, "get", "column", "Lcom/google/android/filament/utils/MatrixColumn;", "row", "", "hashCode", "inc", "invoke", "", "minus", "plus", "set", "times", "toFloatArray", "", "toQuaternion", "Lcom/google/android/filament/utils/Quaternion;", "toString", "", "unaryMinus", "Companion", "filament-utils-android_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\ncom/google/android/filament/utils/Mat4\n+ 2 Vector.kt\ncom/google/android/filament/utils/Float4\n+ 3 Vector.kt\ncom/google/android/filament/utils/VectorKt\n+ 4 Scalar.kt\ncom/google/android/filament/utils/ScalarKt\n*L\n1#1,682:1\n229#1:706\n234#1:708\n239#1:710\n394#2:683\n396#2,4:684\n394#2:688\n396#2,4:689\n394#2:693\n396#2,4:694\n394#2:698\n396#2,4:699\n394#2:703\n394#2:705\n394#2:707\n394#2:709\n394#2:711\n394#2:715\n419#2,5:716\n533#2:721\n534#2:722\n535#2:723\n536#2:724\n656#3:704\n37#4:712\n37#4:713\n37#4:714\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\ncom/google/android/filament/utils/Mat4\n*L\n255#1:706\n256#1:708\n257#1:710\n229#1:683\n231#1:684,4\n234#1:688\n236#1:689,4\n239#1:693\n241#1:694,4\n244#1:698\n246#1:699,4\n250#1:703\n252#1:705\n255#1:707\n256#1:709\n257#1:711\n268#1:715\n291#1:716,5\n301#1:721\n302#1:722\n303#1:723\n304#1:724\n250#1:704\n260#1:712\n261#1:713\n263#1:714\n*E\n"})
/* loaded from: classes5.dex */
public final class Mat4 {
    public static final Companion Companion = new Companion(null);

    /* renamed from: w */
    private Float4 f70148w;

    /* renamed from: x */
    private Float4 f70149x;

    /* renamed from: y */
    private Float4 f70150y;

    /* renamed from: z */
    private Float4 f70151z;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0012\u0010\u0005\u001a\u00020\u00042\n\u0010\u0006\u001a\u00020\u0007\"\u00020\b¨\u0006\t"}, m28432d2 = {"Lcom/google/android/filament/utils/Mat4$Companion;", "", "()V", "identity", "Lcom/google/android/filament/utils/Mat4;", "of", C17296a.f69688o, "", "", "filament-utils-android_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Mat4 identity() {
            return new Mat4((Float4) null, (Float4) null, (Float4) null, (Float4) null, 15, (DefaultConstructorMarker) null);
        }

        /* renamed from: of */
        public final Mat4 m51923of(float... a) {
            boolean z;
            Intrinsics.checkNotNullParameter(a, "a");
            if (a.length >= 16) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new Mat4(new Float4(a[0], a[4], a[8], a[12]), new Float4(a[1], a[5], a[9], a[13]), new Float4(a[2], a[6], a[10], a[14]), new Float4(a[3], a[7], a[11], a[15]));
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
            try {
                iArr[MatrixColumn.W.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Mat4() {
        this((Float4) null, (Float4) null, (Float4) null, (Float4) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Mat4 copy$default(Mat4 mat4, Float4 float4, Float4 float42, Float4 float43, Float4 float44, int i, Object obj) {
        if ((i & 1) != 0) {
            float4 = mat4.f70149x;
        }
        if ((i & 2) != 0) {
            float42 = mat4.f70150y;
        }
        if ((i & 4) != 0) {
            float43 = mat4.f70151z;
        }
        if ((i & 8) != 0) {
            float44 = mat4.f70148w;
        }
        return mat4.copy(float4, float42, float43, float44);
    }

    public final Float4 component1() {
        return this.f70149x;
    }

    public final Float4 component2() {
        return this.f70150y;
    }

    public final Float4 component3() {
        return this.f70151z;
    }

    public final Float4 component4() {
        return this.f70148w;
    }

    public final Mat4 copy(Float4 x, Float4 y, Float4 z, Float4 w) {
        Intrinsics.checkNotNullParameter(x, "x");
        Intrinsics.checkNotNullParameter(y, "y");
        Intrinsics.checkNotNullParameter(z, "z");
        Intrinsics.checkNotNullParameter(w, "w");
        return new Mat4(x, y, z, w);
    }

    public final Mat4 dec() {
        Float4 float4 = this.f70149x;
        this.f70149x = float4.dec();
        Float4 float42 = this.f70150y;
        this.f70150y = float42.dec();
        Float4 float43 = this.f70151z;
        this.f70151z = float43.dec();
        Float4 float44 = this.f70148w;
        this.f70148w = float44.dec();
        return new Mat4(float4, float42, float43, float44);
    }

    public final Mat4 div(float f) {
        Float4 float4 = this.f70149x;
        Float4 float42 = new Float4(float4.getX() / f, float4.getY() / f, float4.getZ() / f, float4.getW() / f);
        Float4 float43 = this.f70150y;
        Float4 float44 = new Float4(float43.getX() / f, float43.getY() / f, float43.getZ() / f, float43.getW() / f);
        Float4 float45 = this.f70151z;
        Float4 float46 = new Float4(float45.getX() / f, float45.getY() / f, float45.getZ() / f, float45.getW() / f);
        Float4 float47 = this.f70148w;
        return new Mat4(float42, float44, float46, new Float4(float47.getX() / f, float47.getY() / f, float47.getZ() / f, float47.getW() / f));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Mat4) {
            Mat4 mat4 = (Mat4) obj;
            return Intrinsics.areEqual(this.f70149x, mat4.f70149x) && Intrinsics.areEqual(this.f70150y, mat4.f70150y) && Intrinsics.areEqual(this.f70151z, mat4.f70151z) && Intrinsics.areEqual(this.f70148w, mat4.f70148w);
        }
        return false;
    }

    public final Float4 get(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return this.f70148w;
                    }
                    throw new IllegalArgumentException("column must be in 0..3");
                }
                return this.f70151z;
            }
            return this.f70150y;
        }
        return this.f70149x;
    }

    public final Float3 getForward() {
        Float4 z = getZ();
        return new Float3(z.getX(), z.getY(), z.getZ());
    }

    public final Float3 getPosition() {
        Float4 w = getW();
        return new Float3(w.getX(), w.getY(), w.getZ());
    }

    public final Float3 getRight() {
        Float4 x = getX();
        return new Float3(x.getX(), x.getY(), x.getZ());
    }

    public final Float3 getRotation() {
        Float4 x = getX();
        Float3 normalize = VectorKt.normalize(new Float3(x.getX(), x.getY(), x.getZ()));
        Float4 y = getY();
        Float3 normalize2 = VectorKt.normalize(new Float3(y.getX(), y.getY(), y.getZ()));
        Float4 z = getZ();
        Float3 normalize3 = VectorKt.normalize(new Float3(z.getX(), z.getY(), z.getZ()));
        if (normalize3.getY() <= -1.0f) {
            return new Float3(-90.0f, 0.0f, ((float) Math.atan2(normalize.getZ(), normalize2.getZ())) * 57.295776f);
        }
        if (normalize3.getY() >= 1.0f) {
            return new Float3(90.0f, 0.0f, ((float) Math.atan2(-normalize.getZ(), -normalize2.getZ())) * 57.295776f);
        }
        return new Float3((-((float) Math.asin(normalize3.getY()))) * 57.295776f, (-((float) Math.atan2(normalize3.getX(), normalize3.getZ()))) * 57.295776f, ((float) Math.atan2(normalize.getY(), normalize2.getY())) * 57.295776f);
    }

    public final Float3 getScale() {
        Float4 x = getX();
        Float3 float3 = new Float3(x.getX(), x.getY(), x.getZ());
        Float4 y = getY();
        Float3 float32 = new Float3(y.getX(), y.getY(), y.getZ());
        Float4 z = getZ();
        Float3 float33 = new Float3(z.getX(), z.getY(), z.getZ());
        return new Float3((float) Math.sqrt((float3.getX() * float3.getX()) + (float3.getY() * float3.getY()) + (float3.getZ() * float3.getZ())), (float) Math.sqrt((float32.getX() * float32.getX()) + (float32.getY() * float32.getY()) + (float32.getZ() * float32.getZ())), (float) Math.sqrt((float33.getX() * float33.getX()) + (float33.getY() * float33.getY()) + (float33.getZ() * float33.getZ())));
    }

    public final Float3 getTranslation() {
        Float4 w = getW();
        return new Float3(w.getX(), w.getY(), w.getZ());
    }

    public final Float3 getUp() {
        Float4 y = getY();
        return new Float3(y.getX(), y.getY(), y.getZ());
    }

    public final Mat3 getUpperLeft() {
        Float4 x = getX();
        Float3 float3 = new Float3(x.getX(), x.getY(), x.getZ());
        Float4 y = getY();
        Float3 float32 = new Float3(y.getX(), y.getY(), y.getZ());
        Float4 z = getZ();
        return new Mat3(float3, float32, new Float3(z.getX(), z.getY(), z.getZ()));
    }

    public final Float4 getW() {
        return this.f70148w;
    }

    public final Float4 getX() {
        return this.f70149x;
    }

    public final Float4 getY() {
        return this.f70150y;
    }

    public final Float4 getZ() {
        return this.f70151z;
    }

    public int hashCode() {
        return (((((this.f70149x.hashCode() * 31) + this.f70150y.hashCode()) * 31) + this.f70151z.hashCode()) * 31) + this.f70148w.hashCode();
    }

    public final Mat4 inc() {
        Float4 float4 = this.f70149x;
        this.f70149x = float4.inc();
        Float4 float42 = this.f70150y;
        this.f70150y = float42.inc();
        Float4 float43 = this.f70151z;
        this.f70151z = float43.inc();
        Float4 float44 = this.f70148w;
        this.f70148w = float44.inc();
        return new Mat4(float4, float42, float43, float44);
    }

    public final float invoke(int i, int i2) {
        return get(i2 - 1).get(i - 1);
    }

    public final Mat4 minus(float f) {
        Float4 float4 = this.f70149x;
        Float4 float42 = new Float4(float4.getX() - f, float4.getY() - f, float4.getZ() - f, float4.getW() - f);
        Float4 float43 = this.f70150y;
        Float4 float44 = new Float4(float43.getX() - f, float43.getY() - f, float43.getZ() - f, float43.getW() - f);
        Float4 float45 = this.f70151z;
        Float4 float46 = new Float4(float45.getX() - f, float45.getY() - f, float45.getZ() - f, float45.getW() - f);
        Float4 float47 = this.f70148w;
        return new Mat4(float42, float44, float46, new Float4(float47.getX() - f, float47.getY() - f, float47.getZ() - f, float47.getW() - f));
    }

    public final Mat4 plus(float f) {
        Float4 float4 = this.f70149x;
        Float4 float42 = new Float4(float4.getX() + f, float4.getY() + f, float4.getZ() + f, float4.getW() + f);
        Float4 float43 = this.f70150y;
        Float4 float44 = new Float4(float43.getX() + f, float43.getY() + f, float43.getZ() + f, float43.getW() + f);
        Float4 float45 = this.f70151z;
        Float4 float46 = new Float4(float45.getX() + f, float45.getY() + f, float45.getZ() + f, float45.getW() + f);
        Float4 float47 = this.f70148w;
        return new Mat4(float42, float44, float46, new Float4(float47.getX() + f, float47.getY() + f, float47.getZ() + f, float47.getW() + f));
    }

    public final void set(int i, Float4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        Float4 float4 = get(i);
        float4.setX(v.getX());
        float4.setY(v.getY());
        float4.setZ(v.getZ());
        float4.setW(v.getW());
    }

    public final void setForward(Float3 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Float4 z = getZ();
        z.setX(value.getX());
        z.setY(value.getY());
        z.setZ(value.getZ());
    }

    public final void setPosition(Float3 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Float4 w = getW();
        w.setX(value.getX());
        w.setY(value.getY());
        w.setZ(value.getZ());
    }

    public final void setRight(Float3 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Float4 x = getX();
        x.setX(value.getX());
        x.setY(value.getY());
        x.setZ(value.getZ());
    }

    public final void setUp(Float3 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Float4 y = getY();
        y.setX(value.getX());
        y.setY(value.getY());
        y.setZ(value.getZ());
    }

    public final void setW(Float4 float4) {
        Intrinsics.checkNotNullParameter(float4, "<set-?>");
        this.f70148w = float4;
    }

    public final void setX(Float4 float4) {
        Intrinsics.checkNotNullParameter(float4, "<set-?>");
        this.f70149x = float4;
    }

    public final void setY(Float4 float4) {
        Intrinsics.checkNotNullParameter(float4, "<set-?>");
        this.f70150y = float4;
    }

    public final void setZ(Float4 float4) {
        Intrinsics.checkNotNullParameter(float4, "<set-?>");
        this.f70151z = float4;
    }

    public final Mat4 times(float f) {
        Float4 float4 = this.f70149x;
        Float4 float42 = new Float4(float4.getX() * f, float4.getY() * f, float4.getZ() * f, float4.getW() * f);
        Float4 float43 = this.f70150y;
        Float4 float44 = new Float4(float43.getX() * f, float43.getY() * f, float43.getZ() * f, float43.getW() * f);
        Float4 float45 = this.f70151z;
        Float4 float46 = new Float4(float45.getX() * f, float45.getY() * f, float45.getZ() * f, float45.getW() * f);
        Float4 float47 = this.f70148w;
        return new Mat4(float42, float44, float46, new Float4(float47.getX() * f, float47.getY() * f, float47.getZ() * f, float47.getW() * f));
    }

    public final float[] toFloatArray() {
        return new float[]{this.f70149x.getX(), this.f70150y.getX(), this.f70151z.getX(), this.f70148w.getX(), this.f70149x.getY(), this.f70150y.getY(), this.f70151z.getY(), this.f70148w.getY(), this.f70149x.getZ(), this.f70150y.getZ(), this.f70151z.getZ(), this.f70148w.getZ(), this.f70149x.getW(), this.f70150y.getW(), this.f70151z.getW(), this.f70148w.getW()};
    }

    public final Quaternion toQuaternion() {
        return MatrixKt.quaternion(this);
    }

    public String toString() {
        String trimIndent;
        trimIndent = StringsKt__IndentKt.trimIndent("\n            |" + this.f70149x.getX() + ' ' + this.f70150y.getX() + ' ' + this.f70151z.getX() + ' ' + this.f70148w.getX() + "|\n            |" + this.f70149x.getY() + ' ' + this.f70150y.getY() + ' ' + this.f70151z.getY() + ' ' + this.f70148w.getY() + "|\n            |" + this.f70149x.getZ() + ' ' + this.f70150y.getZ() + ' ' + this.f70151z.getZ() + ' ' + this.f70148w.getZ() + "|\n            |" + this.f70149x.getW() + ' ' + this.f70150y.getW() + ' ' + this.f70151z.getW() + ' ' + this.f70148w.getW() + "|\n            ");
        return trimIndent;
    }

    public final Mat4 unaryMinus() {
        return new Mat4(this.f70149x.unaryMinus(), this.f70150y.unaryMinus(), this.f70151z.unaryMinus(), this.f70148w.unaryMinus());
    }

    public Mat4(Float4 x, Float4 y, Float4 z, Float4 w) {
        Intrinsics.checkNotNullParameter(x, "x");
        Intrinsics.checkNotNullParameter(y, "y");
        Intrinsics.checkNotNullParameter(z, "z");
        Intrinsics.checkNotNullParameter(w, "w");
        this.f70149x = x;
        this.f70150y = y;
        this.f70151z = z;
        this.f70148w = w;
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

    public /* synthetic */ Mat4(Float4 float4, Float4 float42, Float4 float43, Float4 float44, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Float4(1.0f, 0.0f, 0.0f, 0.0f, 14, null) : float4, (i & 2) != 0 ? new Float4(0.0f, 1.0f, 0.0f, 0.0f, 13, null) : float42, (i & 4) != 0 ? new Float4(0.0f, 0.0f, 1.0f, 0.0f, 11, null) : float43, (i & 8) != 0 ? new Float4(0.0f, 0.0f, 0.0f, 1.0f, 7, null) : float44);
    }

    public final Float4 get(MatrixColumn column) {
        Intrinsics.checkNotNullParameter(column, "column");
        int i = WhenMappings.$EnumSwitchMapping$0[column.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return this.f70148w;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return this.f70151z;
            }
            return this.f70150y;
        }
        return this.f70149x;
    }

    public final Mat4 times(Mat4 m) {
        Intrinsics.checkNotNullParameter(m, "m");
        return new Mat4(new Float4((this.f70149x.getX() * m.f70149x.getX()) + (this.f70150y.getX() * m.f70149x.getY()) + (this.f70151z.getX() * m.f70149x.getZ()) + (this.f70148w.getX() * m.f70149x.getW()), (this.f70149x.getY() * m.f70149x.getX()) + (this.f70150y.getY() * m.f70149x.getY()) + (this.f70151z.getY() * m.f70149x.getZ()) + (this.f70148w.getY() * m.f70149x.getW()), (this.f70149x.getZ() * m.f70149x.getX()) + (this.f70150y.getZ() * m.f70149x.getY()) + (this.f70151z.getZ() * m.f70149x.getZ()) + (this.f70148w.getZ() * m.f70149x.getW()), (this.f70149x.getW() * m.f70149x.getX()) + (this.f70150y.getW() * m.f70149x.getY()) + (this.f70151z.getW() * m.f70149x.getZ()) + (this.f70148w.getW() * m.f70149x.getW())), new Float4((this.f70149x.getX() * m.f70150y.getX()) + (this.f70150y.getX() * m.f70150y.getY()) + (this.f70151z.getX() * m.f70150y.getZ()) + (this.f70148w.getX() * m.f70150y.getW()), (this.f70149x.getY() * m.f70150y.getX()) + (this.f70150y.getY() * m.f70150y.getY()) + (this.f70151z.getY() * m.f70150y.getZ()) + (this.f70148w.getY() * m.f70150y.getW()), (this.f70149x.getZ() * m.f70150y.getX()) + (this.f70150y.getZ() * m.f70150y.getY()) + (this.f70151z.getZ() * m.f70150y.getZ()) + (this.f70148w.getZ() * m.f70150y.getW()), (this.f70149x.getW() * m.f70150y.getX()) + (this.f70150y.getW() * m.f70150y.getY()) + (this.f70151z.getW() * m.f70150y.getZ()) + (this.f70148w.getW() * m.f70150y.getW())), new Float4((this.f70149x.getX() * m.f70151z.getX()) + (this.f70150y.getX() * m.f70151z.getY()) + (this.f70151z.getX() * m.f70151z.getZ()) + (this.f70148w.getX() * m.f70151z.getW()), (this.f70149x.getY() * m.f70151z.getX()) + (this.f70150y.getY() * m.f70151z.getY()) + (this.f70151z.getY() * m.f70151z.getZ()) + (this.f70148w.getY() * m.f70151z.getW()), (this.f70149x.getZ() * m.f70151z.getX()) + (this.f70150y.getZ() * m.f70151z.getY()) + (this.f70151z.getZ() * m.f70151z.getZ()) + (this.f70148w.getZ() * m.f70151z.getW()), (this.f70149x.getW() * m.f70151z.getX()) + (this.f70150y.getW() * m.f70151z.getY()) + (this.f70151z.getW() * m.f70151z.getZ()) + (this.f70148w.getW() * m.f70151z.getW())), new Float4((this.f70149x.getX() * m.f70148w.getX()) + (this.f70150y.getX() * m.f70148w.getY()) + (this.f70151z.getX() * m.f70148w.getZ()) + (this.f70148w.getX() * m.f70148w.getW()), (this.f70149x.getY() * m.f70148w.getX()) + (this.f70150y.getY() * m.f70148w.getY()) + (this.f70151z.getY() * m.f70148w.getZ()) + (this.f70148w.getY() * m.f70148w.getW()), (this.f70149x.getZ() * m.f70148w.getX()) + (this.f70150y.getZ() * m.f70148w.getY()) + (this.f70151z.getZ() * m.f70148w.getZ()) + (this.f70148w.getZ() * m.f70148w.getW()), (this.f70149x.getW() * m.f70148w.getX()) + (this.f70150y.getW() * m.f70148w.getY()) + (this.f70151z.getW() * m.f70148w.getZ()) + (this.f70148w.getW() * m.f70148w.getW())));
    }

    public /* synthetic */ Mat4(Float3 float3, Float3 float32, Float3 float33, Float3 float34, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(float3, float32, float33, (i & 8) != 0 ? new Float3(0.0f, 0.0f, 0.0f, 7, null) : float34);
    }

    public final float get(MatrixColumn column, int i) {
        Intrinsics.checkNotNullParameter(column, "column");
        return get(column).get(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Mat4(Float3 right, Float3 up, Float3 forward, Float3 position) {
        this(new Float4(right, 0.0f, 2, (DefaultConstructorMarker) null), new Float4(up, 0.0f, 2, (DefaultConstructorMarker) null), new Float4(forward, 0.0f, 2, (DefaultConstructorMarker) null), new Float4(position, 1.0f));
        Intrinsics.checkNotNullParameter(right, "right");
        Intrinsics.checkNotNullParameter(up, "up");
        Intrinsics.checkNotNullParameter(forward, "forward");
        Intrinsics.checkNotNullParameter(position, "position");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Mat4(Mat4 m) {
        this(Float4.copy$default(m.f70149x, 0.0f, 0.0f, 0.0f, 0.0f, 15, null), Float4.copy$default(m.f70150y, 0.0f, 0.0f, 0.0f, 0.0f, 15, null), Float4.copy$default(m.f70151z, 0.0f, 0.0f, 0.0f, 0.0f, 15, null), Float4.copy$default(m.f70148w, 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
        Intrinsics.checkNotNullParameter(m, "m");
    }

    public final Float4 times(Float4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4((this.f70149x.getX() * v.getX()) + (this.f70150y.getX() * v.getY()) + (this.f70151z.getX() * v.getZ()) + (this.f70148w.getX() * v.getW()), (this.f70149x.getY() * v.getX()) + (this.f70150y.getY() * v.getY()) + (this.f70151z.getY() * v.getZ()) + (this.f70148w.getY() * v.getW()), (this.f70149x.getZ() * v.getX()) + (this.f70150y.getZ() * v.getY()) + (this.f70151z.getZ() * v.getZ()) + (this.f70148w.getZ() * v.getW()), (this.f70149x.getW() * v.getX()) + (this.f70150y.getW() * v.getY()) + (this.f70151z.getW() * v.getZ()) + (this.f70148w.getW() * v.getW()));
    }
}
