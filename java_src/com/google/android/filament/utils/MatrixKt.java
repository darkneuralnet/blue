package com.google.android.filament.utils;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u000e\u0010\u0000\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006\u001a \u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006\u001a\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003\u001a6\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e\u001a&\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e\u001a\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u001a\u0016\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u000e\u001a\u000e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a\u001a.\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u000e2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u001a\u000e\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0006\u001a\u000e\u0010$\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010&\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0006\u001a\u000e\u0010&\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010'\u001a\u00020(2\u0006\u0010\u0002\u001a\u00020(\u001a\u000e\u0010'\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u000e\u0010'\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006)"}, m28432d2 = {"inverse", "Lcom/google/android/filament/utils/Mat3;", "m", "Lcom/google/android/filament/utils/Mat4;", "lookAt", "eye", "Lcom/google/android/filament/utils/Float3;", "target", "up", "lookTowards", "forward", "normal", "ortho", "l", "", "r", "b", "t", "n", "f", "perspective", "fov", "ratio", "near", "far", "quaternion", "Lcom/google/android/filament/utils/Quaternion;", "rotation", DateTokenConverter.CONVERTER_KEY, "order", "Lcom/google/android/filament/utils/RotationsOrder;", "axis", "angle", "yaw", "pitch", "roll", "scale", "s", "translation", "transpose", "Lcom/google/android/filament/utils/Mat2;", "filament-utils-android_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\ncom/google/android/filament/utils/MatrixKt\n+ 2 Matrix.kt\ncom/google/android/filament/utils/Mat4\n+ 3 Vector.kt\ncom/google/android/filament/utils/Float4\n+ 4 Vector.kt\ncom/google/android/filament/utils/VectorKt\n+ 5 Vector.kt\ncom/google/android/filament/utils/Float3\n+ 6 Scalar.kt\ncom/google/android/filament/utils/ScalarKt\n*L\n1#1,682:1\n250#2:683\n252#2:686\n229#2:688\n234#2,6:690\n229#2:703\n234#2,6:706\n394#3:684\n394#3:687\n394#3:689\n394#3:704\n656#4:685\n715#4:696\n657#4:705\n653#4:712\n664#4:714\n664#4:715\n306#5:697\n307#5,3:699\n301#5:713\n39#6:698\n39#6:702\n39#6:716\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\ncom/google/android/filament/utils/MatrixKt\n*L\n471#1:683\n474#1:686\n476#1:688\n476#1:690,6\n654#1:703\n654#1:706,6\n471#1:684\n474#1:687\n476#1:689\n654#1:704\n471#1:685\n496#1:696\n654#1:705\n654#1:712\n662#1:714\n663#1:715\n496#1:697\n496#1:699,3\n657#1:713\n496#1:698\n566#1:702\n668#1:716\n*E\n"})
/* loaded from: classes5.dex */
public final class MatrixKt {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes5.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RotationsOrder.values().length];
            try {
                iArr[RotationsOrder.XZY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RotationsOrder.XYZ.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RotationsOrder.YXZ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RotationsOrder.YZX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RotationsOrder.ZYX.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RotationsOrder.ZXY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Mat3 inverse(Mat3 m) {
        Intrinsics.checkNotNullParameter(m, "m");
        float x = m.getX().getX();
        float y = m.getX().getY();
        float z = m.getX().getZ();
        float x2 = m.getY().getX();
        float y2 = m.getY().getY();
        float z2 = m.getY().getZ();
        float x3 = m.getZ().getX();
        float y3 = m.getZ().getY();
        float z3 = m.getZ().getZ();
        float f = (y2 * z3) - (z2 * y3);
        float f2 = (z2 * x3) - (x2 * z3);
        float f3 = (x2 * y3) - (y2 * x3);
        float f4 = (x * f) + (y * f2) + (z * f3);
        return Mat3.Companion.m51924of(f / f4, f2 / f4, f3 / f4, ((z * y3) - (y * z3)) / f4, ((z3 * x) - (z * x3)) / f4, ((x3 * y) - (y3 * x)) / f4, ((y * z2) - (z * y2)) / f4, ((z * x2) - (z2 * x)) / f4, ((x * y2) - (y * x2)) / f4);
    }

    public static final Mat4 lookAt(Float3 eye, Float3 target, Float3 up) {
        Intrinsics.checkNotNullParameter(eye, "eye");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(up, "up");
        return lookTowards(eye, new Float3(target.getX() - eye.getX(), target.getY() - eye.getY(), target.getZ() - eye.getZ()), up);
    }

    public static /* synthetic */ Mat4 lookAt$default(Float3 float3, Float3 float32, Float3 float33, int i, Object obj) {
        if ((i & 4) != 0) {
            float33 = new Float3(0.0f, 0.0f, 1.0f, 3, null);
        }
        return lookAt(float3, float32, float33);
    }

    public static final Mat4 lookTowards(Float3 eye, Float3 forward, Float3 up) {
        Intrinsics.checkNotNullParameter(eye, "eye");
        Intrinsics.checkNotNullParameter(forward, "forward");
        Intrinsics.checkNotNullParameter(up, "up");
        Float3 normalize = VectorKt.normalize(forward);
        Float3 normalize2 = VectorKt.normalize(new Float3((normalize.getY() * up.getZ()) - (normalize.getZ() * up.getY()), (normalize.getZ() * up.getX()) - (normalize.getX() * up.getZ()), (normalize.getX() * up.getY()) - (normalize.getY() * up.getX())));
        return new Mat4(new Float4(normalize2, 0.0f, 2, (DefaultConstructorMarker) null), new Float4(VectorKt.normalize(new Float3((normalize2.getY() * normalize.getZ()) - (normalize2.getZ() * normalize.getY()), (normalize2.getZ() * normalize.getX()) - (normalize2.getX() * normalize.getZ()), (normalize2.getX() * normalize.getY()) - (normalize2.getY() * normalize.getX()))), 0.0f, 2, (DefaultConstructorMarker) null), new Float4(normalize.unaryMinus(), 0.0f, 2, (DefaultConstructorMarker) null), new Float4(eye, 1.0f));
    }

    public static /* synthetic */ Mat4 lookTowards$default(Float3 float3, Float3 float32, Float3 float33, int i, Object obj) {
        if ((i & 4) != 0) {
            float33 = new Float3(0.0f, 0.0f, 1.0f, 3, null);
        }
        return lookTowards(float3, float32, float33);
    }

    public static final Mat4 normal(Mat4 m) {
        Intrinsics.checkNotNullParameter(m, "m");
        Float4 x = m.getX();
        Float3 float3 = new Float3(x.getX(), x.getY(), x.getZ());
        float x2 = (float3.getX() * float3.getX()) + (float3.getY() * float3.getY()) + (float3.getZ() * float3.getZ());
        Float4 y = m.getY();
        Float3 float32 = new Float3(y.getX(), y.getY(), y.getZ());
        float x3 = (float32.getX() * float32.getX()) + (float32.getY() * float32.getY()) + (float32.getZ() * float32.getZ());
        Float4 z = m.getZ();
        Float3 float33 = new Float3(z.getX(), z.getY(), z.getZ());
        Float3 float34 = new Float3(x2, x3, (float33.getX() * float33.getX()) + (float33.getY() * float33.getY()) + (float33.getZ() * float33.getZ()));
        return scale(new Float3(1.0f / float34.getX(), 1.0f / float34.getY(), 1.0f / float34.getZ())).times(m);
    }

    public static final Mat4 ortho(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f4 - f3;
        float f8 = f6 - f5;
        return new Mat4(new Float4(2.0f / (f2 - 1.0f), 0.0f, 0.0f, 0.0f, 14, null), new Float4(0.0f, 2.0f / f7, 0.0f, 0.0f, 13, null), new Float4(0.0f, 0.0f, (-2.0f) / f8, 0.0f, 11, null), new Float4((-(f2 + f)) / (f2 - f), (-(f4 + f3)) / f7, (-(f6 + f5)) / f8, 1.0f));
    }

    public static final Mat4 perspective(float f, float f2, float f3, float f4) {
        float tan = 1.0f / ((float) Math.tan((0.017453292f * f) * 0.5f));
        float f5 = f4 - f3;
        return new Mat4(new Float4(tan / f2, 0.0f, 0.0f, 0.0f, 14, null), new Float4(0.0f, tan, 0.0f, 0.0f, 13, null), new Float4(0.0f, 0.0f, (f4 + f3) / f5, 1.0f, 3, null), new Float4(0.0f, 0.0f, -(((2.0f * f4) * f3) / f5), 0.0f, 11, null));
    }

    public static final Quaternion quaternion(Mat4 m) {
        Quaternion quaternion;
        Intrinsics.checkNotNullParameter(m, "m");
        float x = m.getX().getX() + m.getY().getY() + m.getZ().getZ();
        if (x > 0.0f) {
            float sqrt = ((float) Math.sqrt(x + 1.0f)) * 2.0f;
            quaternion = new Quaternion((m.getY().getZ() - m.getZ().getY()) / sqrt, (m.getZ().getX() - m.getX().getZ()) / sqrt, (m.getX().getY() - m.getY().getX()) / sqrt, sqrt * 0.25f);
        } else if (m.getX().getX() > m.getY().getY() && m.getX().getX() > m.getZ().getZ()) {
            float sqrt2 = ((float) Math.sqrt(((m.getX().getX() + 1.0f) - m.getY().getY()) - m.getZ().getZ())) * 2.0f;
            quaternion = new Quaternion(0.25f * sqrt2, (m.getY().getX() + m.getX().getY()) / sqrt2, (m.getZ().getX() + m.getX().getZ()) / sqrt2, (m.getY().getZ() - m.getZ().getY()) / sqrt2);
        } else if (m.getY().getY() > m.getZ().getZ()) {
            float sqrt3 = ((float) Math.sqrt(((m.getY().getY() + 1.0f) - m.getX().getX()) - m.getZ().getZ())) * 2.0f;
            quaternion = new Quaternion((m.getY().getX() + m.getX().getY()) / sqrt3, 0.25f * sqrt3, (m.getZ().getY() + m.getY().getZ()) / sqrt3, (m.getZ().getX() - m.getX().getZ()) / sqrt3);
        } else {
            float sqrt4 = ((float) Math.sqrt(((m.getZ().getZ() + 1.0f) - m.getX().getX()) - m.getY().getY())) * 2.0f;
            quaternion = new Quaternion((m.getZ().getX() + m.getX().getZ()) / sqrt4, (m.getZ().getY() + m.getY().getZ()) / sqrt4, 0.25f * sqrt4, (m.getX().getY() - m.getY().getX()) / sqrt4);
        }
        return QuaternionKt.normalize(quaternion);
    }

    public static final Mat4 rotation(Mat4 m) {
        Intrinsics.checkNotNullParameter(m, "m");
        Float4 x = m.getX();
        Float3 normalize = VectorKt.normalize(new Float3(x.getX(), x.getY(), x.getZ()));
        Float4 y = m.getY();
        Float3 normalize2 = VectorKt.normalize(new Float3(y.getX(), y.getY(), y.getZ()));
        Float4 z = m.getZ();
        return new Mat4(normalize, normalize2, VectorKt.normalize(new Float3(z.getX(), z.getY(), z.getZ())), (Float3) null, 8, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Mat4 rotation$default(Float3 float3, RotationsOrder rotationsOrder, int i, Object obj) {
        if ((i & 2) != 0) {
            rotationsOrder = RotationsOrder.ZYX;
        }
        return rotation(float3, rotationsOrder);
    }

    public static final Mat4 scale(Float3 s) {
        Intrinsics.checkNotNullParameter(s, "s");
        return new Mat4(new Float4(s.getX(), 0.0f, 0.0f, 0.0f, 14, null), new Float4(0.0f, s.getY(), 0.0f, 0.0f, 13, null), new Float4(0.0f, 0.0f, s.getZ(), 0.0f, 11, null), (Float4) null, 8, (DefaultConstructorMarker) null);
    }

    public static final Mat4 translation(Float3 t) {
        Intrinsics.checkNotNullParameter(t, "t");
        return new Mat4((Float4) null, (Float4) null, (Float4) null, new Float4(t, 1.0f), 7, (DefaultConstructorMarker) null);
    }

    public static final Mat2 transpose(Mat2 m) {
        Intrinsics.checkNotNullParameter(m, "m");
        return new Mat2(new Float2(m.getX().getX(), m.getY().getX()), new Float2(m.getX().getY(), m.getY().getY()));
    }

    public static /* synthetic */ Mat4 rotation$default(float f, float f2, float f3, RotationsOrder rotationsOrder, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            rotationsOrder = RotationsOrder.ZYX;
        }
        return rotation(f, f2, f3, rotationsOrder);
    }

    public static final Mat4 scale(Mat4 m) {
        Intrinsics.checkNotNullParameter(m, "m");
        Float4 x = m.getX();
        Float3 float3 = new Float3(x.getX(), x.getY(), x.getZ());
        Float4 y = m.getY();
        Float3 float32 = new Float3(y.getX(), y.getY(), y.getZ());
        Float4 z = m.getZ();
        Float3 float33 = new Float3(z.getX(), z.getY(), z.getZ());
        return scale(new Float3((float) Math.sqrt((float3.getX() * float3.getX()) + (float3.getY() * float3.getY()) + (float3.getZ() * float3.getZ())), (float) Math.sqrt((float32.getX() * float32.getX()) + (float32.getY() * float32.getY()) + (float32.getZ() * float32.getZ())), (float) Math.sqrt((float33.getX() * float33.getX()) + (float33.getY() * float33.getY()) + (float33.getZ() * float33.getZ()))));
    }

    public static final Mat4 translation(Mat4 m) {
        Intrinsics.checkNotNullParameter(m, "m");
        Float4 w = m.getW();
        return translation(new Float3(w.getX(), w.getY(), w.getZ()));
    }

    public static final Mat3 transpose(Mat3 m) {
        Intrinsics.checkNotNullParameter(m, "m");
        return new Mat3(new Float3(m.getX().getX(), m.getY().getX(), m.getZ().getX()), new Float3(m.getX().getY(), m.getY().getY(), m.getZ().getY()), new Float3(m.getX().getZ(), m.getY().getZ(), m.getZ().getZ()));
    }

    public static final Mat4 transpose(Mat4 m) {
        Intrinsics.checkNotNullParameter(m, "m");
        return new Mat4(new Float4(m.getX().getX(), m.getY().getX(), m.getZ().getX(), m.getW().getX()), new Float4(m.getX().getY(), m.getY().getY(), m.getZ().getY(), m.getW().getY()), new Float4(m.getX().getZ(), m.getY().getZ(), m.getZ().getZ(), m.getW().getZ()), new Float4(m.getX().getW(), m.getY().getW(), m.getZ().getW(), m.getW().getW()));
    }

    public static final Mat4 inverse(Mat4 m) {
        Intrinsics.checkNotNullParameter(m, "m");
        Mat4 mat4 = new Mat4((Float4) null, (Float4) null, (Float4) null, (Float4) null, 15, (DefaultConstructorMarker) null);
        float z = m.getZ().getZ() * m.getW().getW();
        float z2 = m.getW().getZ() * m.getZ().getW();
        float z3 = m.getY().getZ() * m.getW().getW();
        float z4 = m.getW().getZ() * m.getY().getW();
        float z5 = m.getY().getZ() * m.getZ().getW();
        float z6 = m.getZ().getZ() * m.getY().getW();
        float z7 = m.getX().getZ() * m.getW().getW();
        float z8 = m.getW().getZ() * m.getX().getW();
        float z9 = m.getX().getZ() * m.getZ().getW();
        float z10 = m.getZ().getZ() * m.getX().getW();
        float z11 = m.getX().getZ() * m.getY().getW();
        float z12 = m.getY().getZ() * m.getX().getW();
        mat4.getX().setX((m.getY().getY() * z) + (m.getZ().getY() * z4) + (m.getW().getY() * z5));
        Float4 x = mat4.getX();
        x.setX(x.getX() - (((m.getY().getY() * z2) + (m.getZ().getY() * z3)) + (m.getW().getY() * z6)));
        mat4.getX().setY((m.getX().getY() * z2) + (m.getZ().getY() * z7) + (m.getW().getY() * z10));
        Float4 x2 = mat4.getX();
        x2.setY(x2.getY() - (((m.getX().getY() * z) + (m.getZ().getY() * z8)) + (m.getW().getY() * z9)));
        mat4.getX().setZ((m.getX().getY() * z3) + (m.getY().getY() * z8) + (m.getW().getY() * z11));
        Float4 x3 = mat4.getX();
        x3.setZ(x3.getZ() - (((m.getX().getY() * z4) + (m.getY().getY() * z7)) + (m.getW().getY() * z12)));
        mat4.getX().setW((m.getX().getY() * z6) + (m.getY().getY() * z9) + (m.getZ().getY() * z12));
        Float4 x4 = mat4.getX();
        x4.setW(x4.getW() - (((m.getX().getY() * z5) + (m.getY().getY() * z10)) + (m.getZ().getY() * z11)));
        mat4.getY().setX((m.getY().getX() * z2) + (m.getZ().getX() * z3) + (m.getW().getX() * z6));
        Float4 y = mat4.getY();
        y.setX(y.getX() - (((m.getY().getX() * z) + (m.getZ().getX() * z4)) + (m.getW().getX() * z5)));
        mat4.getY().setY((z * m.getX().getX()) + (m.getZ().getX() * z8) + (m.getW().getX() * z9));
        Float4 y2 = mat4.getY();
        y2.setY(y2.getY() - (((z2 * m.getX().getX()) + (m.getZ().getX() * z7)) + (m.getW().getX() * z10)));
        mat4.getY().setZ((z4 * m.getX().getX()) + (z7 * m.getY().getX()) + (m.getW().getX() * z12));
        Float4 y3 = mat4.getY();
        y3.setZ(y3.getZ() - (((z3 * m.getX().getX()) + (z8 * m.getY().getX())) + (m.getW().getX() * z11)));
        mat4.getY().setW((z5 * m.getX().getX()) + (z10 * m.getY().getX()) + (z11 * m.getZ().getX()));
        Float4 y4 = mat4.getY();
        y4.setW(y4.getW() - (((z6 * m.getX().getX()) + (z9 * m.getY().getX())) + (z12 * m.getZ().getX())));
        float x5 = m.getZ().getX() * m.getW().getY();
        float x6 = m.getW().getX() * m.getZ().getY();
        float x7 = m.getY().getX() * m.getW().getY();
        float x8 = m.getW().getX() * m.getY().getY();
        float x9 = m.getY().getX() * m.getZ().getY();
        float x10 = m.getZ().getX() * m.getY().getY();
        float x11 = m.getX().getX() * m.getW().getY();
        float x12 = m.getW().getX() * m.getX().getY();
        float x13 = m.getX().getX() * m.getZ().getY();
        float x14 = m.getZ().getX() * m.getX().getY();
        float x15 = m.getX().getX() * m.getY().getY();
        float x16 = m.getY().getX() * m.getX().getY();
        mat4.getZ().setX((m.getY().getW() * x5) + (m.getZ().getW() * x8) + (m.getW().getW() * x9));
        Float4 z13 = mat4.getZ();
        z13.setX(z13.getX() - (((m.getY().getW() * x6) + (m.getZ().getW() * x7)) + (m.getW().getW() * x10)));
        mat4.getZ().setY((m.getX().getW() * x6) + (m.getZ().getW() * x11) + (m.getW().getW() * x14));
        Float4 z14 = mat4.getZ();
        z14.setY(z14.getY() - (((m.getX().getW() * x5) + (m.getZ().getW() * x12)) + (m.getW().getW() * x13)));
        mat4.getZ().setZ((m.getX().getW() * x7) + (m.getY().getW() * x12) + (m.getW().getW() * x15));
        Float4 z15 = mat4.getZ();
        z15.setZ(z15.getZ() - (((m.getX().getW() * x8) + (m.getY().getW() * x11)) + (m.getW().getW() * x16)));
        mat4.getZ().setW((m.getX().getW() * x10) + (m.getY().getW() * x13) + (m.getZ().getW() * x16));
        Float4 z16 = mat4.getZ();
        z16.setW(z16.getW() - (((m.getX().getW() * x9) + (m.getY().getW() * x14)) + (m.getZ().getW() * x15)));
        mat4.getW().setX((m.getZ().getZ() * x7) + (m.getW().getZ() * x10) + (m.getY().getZ() * x6));
        Float4 w = mat4.getW();
        w.setX(w.getX() - (((m.getW().getZ() * x9) + (m.getY().getZ() * x5)) + (m.getZ().getZ() * x8)));
        mat4.getW().setY((m.getW().getZ() * x13) + (x5 * m.getX().getZ()) + (m.getZ().getZ() * x12));
        Float4 w2 = mat4.getW();
        w2.setY(w2.getY() - (((m.getZ().getZ() * x11) + (m.getW().getZ() * x14)) + (x6 * m.getX().getZ())));
        mat4.getW().setZ((x11 * m.getY().getZ()) + (m.getW().getZ() * x16) + (x8 * m.getX().getZ()));
        Float4 w3 = mat4.getW();
        w3.setZ(w3.getZ() - (((m.getW().getZ() * x15) + (x7 * m.getX().getZ())) + (x12 * m.getY().getZ())));
        mat4.getW().setW((x15 * m.getZ().getZ()) + (x9 * m.getX().getZ()) + (x14 * m.getY().getZ()));
        Float4 w4 = mat4.getW();
        w4.setW(w4.getW() - (((x13 * m.getY().getZ()) + (x16 * m.getZ().getZ())) + (x10 * m.getX().getZ())));
        return mat4.div((m.getX().getX() * mat4.getX().getX()) + (m.getY().getX() * mat4.getX().getY()) + (m.getZ().getX() * mat4.getX().getZ()) + (m.getW().getX() * mat4.getX().getW()));
    }

    public static final Mat4 rotation(float f, float f2, float f3, RotationsOrder order) {
        Intrinsics.checkNotNullParameter(order, "order");
        double d = f;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        double d2 = f2;
        float cos2 = (float) Math.cos(d2);
        float sin2 = (float) Math.sin(d2);
        double d3 = f3;
        float cos3 = (float) Math.cos(d3);
        float sin3 = (float) Math.sin(d3);
        switch (WhenMappings.$EnumSwitchMapping$0[order.ordinal()]) {
            case 1:
                float f4 = cos * cos3;
                float f5 = cos3 * sin;
                return Mat4.Companion.m51923of(cos2 * cos3, -sin2, cos2 * sin3, 0.0f, (sin * sin3) + (f4 * sin2), cos * cos2, ((cos * sin2) * sin3) - f5, 0.0f, (f5 * sin2) - (cos * sin3), cos2 * sin, f4 + (sin * sin2 * sin3), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            case 2:
                float f6 = -cos2;
                float f7 = cos3 * sin;
                float f8 = cos3 * cos;
                return Mat4.Companion.m51923of(cos2 * cos3, f6 * sin3, sin2, 0.0f, (cos * sin3) + (f7 * sin2), f8 - ((sin * sin2) * sin3), f6 * sin, 0.0f, (sin * sin3) - (f8 * sin2), f7 + (sin2 * cos * sin3), cos * cos2, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            case 3:
                float f9 = cos * cos3;
                float f10 = cos3 * sin;
                return Mat4.Companion.m51923of(f9 + (sin * sin2 * sin3), (f10 * sin2) - (cos * sin3), cos2 * sin, 0.0f, cos2 * sin3, cos3 * cos2, -sin2, 0.0f, ((cos * sin2) * sin3) - f10, (f9 * sin2) + (sin * sin3), cos * cos2, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            case 4:
                float f11 = cos * cos3;
                float f12 = cos3 * sin;
                float f13 = -cos2;
                return Mat4.Companion.m51923of(cos * cos2, (sin * sin3) - (f11 * sin2), f12 + (cos * sin2 * sin3), 0.0f, sin2, cos3 * cos2, f13 * sin3, 0.0f, f13 * sin, (cos * sin3) + (f12 * sin2), f11 - ((sin * sin2) * sin3), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            case 5:
                float f14 = cos3 * sin;
                float f15 = cos * cos3;
                return Mat4.Companion.m51923of(cos * cos2, ((cos * sin2) * sin3) - f14, (sin * sin3) + (f15 * sin2), 0.0f, cos2 * sin, f15 + (sin * sin2 * sin3), (f14 * sin2) - (cos * sin3), 0.0f, -sin2, sin3 * cos2, cos2 * cos3, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            case 6:
                float f16 = cos * cos3;
                float f17 = -cos2;
                float f18 = cos3 * sin;
                return Mat4.Companion.m51923of(f16 - ((sin * sin2) * sin3), f17 * sin, (cos * sin3) + (f18 * sin2), 0.0f, f18 + (cos * sin2 * sin3), cos * cos2, (sin * sin3) - (f16 * sin2), 0.0f, f17 * sin3, sin2, cos2 * cos3, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Mat4 rotation(Float3 axis, float f) {
        Intrinsics.checkNotNullParameter(axis, "axis");
        float x = axis.getX();
        float y = axis.getY();
        float z = axis.getZ();
        double d = f * 0.017453292f;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f2 = 1.0f - cos;
        float f3 = x * y * f2;
        float f4 = z * sin;
        float f5 = x * z * f2;
        float f6 = y * sin;
        float f7 = y * z * f2;
        float f8 = x * sin;
        return Mat4.Companion.m51923of((x * x * f2) + cos, f3 - f4, f5 + f6, 0.0f, f3 + f4, (y * y * f2) + cos, f7 - f8, 0.0f, f5 - f6, f7 + f8, (z * z * f2) + cos, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    public static final Mat4 rotation(Quaternion quaternion) {
        Intrinsics.checkNotNullParameter(quaternion, "quaternion");
        Quaternion normalize = QuaternionKt.normalize(quaternion);
        return new Mat4(new Float4(1.0f - (((normalize.getY() * normalize.getY()) + (normalize.getZ() * normalize.getZ())) * 2.0f), ((normalize.getX() * normalize.getY()) + (normalize.getZ() * normalize.getW())) * 2.0f, ((normalize.getX() * normalize.getZ()) - (normalize.getY() * normalize.getW())) * 2.0f, 0.0f, 8, null), new Float4(((normalize.getX() * normalize.getY()) - (normalize.getZ() * normalize.getW())) * 2.0f, 1.0f - (((normalize.getX() * normalize.getX()) + (normalize.getZ() * normalize.getZ())) * 2.0f), ((normalize.getY() * normalize.getZ()) + (normalize.getX() * normalize.getW())) * 2.0f, 0.0f, 8, null), new Float4(((normalize.getX() * normalize.getZ()) + (normalize.getY() * normalize.getW())) * 2.0f, ((normalize.getY() * normalize.getZ()) - (normalize.getX() * normalize.getW())) * 2.0f, 1.0f - (((normalize.getX() * normalize.getX()) + (normalize.getY() * normalize.getY())) * 2.0f), 0.0f, 8, null), (Float4) null, 8, (DefaultConstructorMarker) null);
    }

    public static final Mat4 rotation(Float3 d, RotationsOrder order) {
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(order, "order");
        Float3 copy$default = Float3.copy$default(d, 0.0f, 0.0f, 0.0f, 7, null);
        copy$default.setX(copy$default.getX() * 0.017453292f);
        copy$default.setY(copy$default.getY() * 0.017453292f);
        copy$default.setZ(copy$default.getZ() * 0.017453292f);
        switch (WhenMappings.$EnumSwitchMapping$0[order.ordinal()]) {
            case 1:
                return rotation$default(copy$default.getX(), copy$default.getZ(), copy$default.getY(), null, 8, null);
            case 2:
                return rotation$default(copy$default.getX(), copy$default.getY(), copy$default.getZ(), null, 8, null);
            case 3:
                return rotation$default(copy$default.getY(), copy$default.getX(), copy$default.getZ(), null, 8, null);
            case 4:
                return rotation$default(copy$default.getY(), copy$default.getZ(), copy$default.getX(), null, 8, null);
            case 5:
                return rotation$default(copy$default.getZ(), copy$default.getY(), copy$default.getX(), null, 8, null);
            case 6:
                return rotation$default(copy$default.getZ(), copy$default.getX(), copy$default.getY(), null, 8, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
