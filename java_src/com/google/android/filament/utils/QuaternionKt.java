package com.google.android.filament.utils;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u000e\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001\u001a\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0086\b\u001a\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u000e\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0011\u0010\f\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\r\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u001e\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\b\u001a\u001e\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\b\u001a\u000e\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a(\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b\u001a\u0015\u0010\u0014\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0015\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0016\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0017\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n¨\u0006\u0018"}, m28432d2 = {"abs", "Lcom/google/android/filament/utils/Quaternion;", "q", "conjugate", "cross", C17296a.f69688o, "b", "dot", "", "eulerAngles", "Lcom/google/android/filament/utils/Float3;", "inverse", "length", "length2", "lerp", "t", "nlerp", "normalize", "slerp", "valueEps", "div", "minus", "plus", "times", "filament-utils-android_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nQuaternion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Quaternion.kt\ncom/google/android/filament/utils/QuaternionKt\n+ 2 Quaternion.kt\ncom/google/android/filament/utils/Quaternion\n+ 3 Scalar.kt\ncom/google/android/filament/utils/ScalarKt\n*L\n1#1,343:1\n257#1:344\n259#1:345\n259#1:351\n259#1:352\n253#1:354\n253#1:356\n230#2,5:346\n228#2:355\n228#2:357\n31#3:353\n37#3:358\n37#3:359\n37#3:360\n*S KotlinDebug\n*F\n+ 1 Quaternion.kt\ncom/google/android/filament/utils/QuaternionKt\n*L\n265#1:344\n272#1:345\n297#1:351\n303#1:352\n315#1:354\n319#1:356\n277#1:346,5\n315#1:355\n319#1:357\n304#1:353\n335#1:358\n338#1:359\n340#1:360\n*E\n"})
/* loaded from: classes5.dex */
public final class QuaternionKt {
    public static final Quaternion abs(Quaternion q) {
        Intrinsics.checkNotNullParameter(q, "q");
        return new Quaternion(Math.abs(q.getX()), Math.abs(q.getY()), Math.abs(q.getZ()), Math.abs(q.getW()));
    }

    public static final Quaternion conjugate(Quaternion q) {
        Intrinsics.checkNotNullParameter(q, "q");
        return new Quaternion(-q.getX(), -q.getY(), -q.getZ(), q.getW());
    }

    public static final Quaternion cross(Quaternion a, Quaternion b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        Quaternion quaternion = new Quaternion((((a.getW() * b.getX()) + (a.getX() * b.getW())) + (a.getY() * b.getZ())) - (a.getZ() * b.getY()), ((a.getW() * b.getY()) - (a.getX() * b.getZ())) + (a.getY() * b.getW()) + (a.getZ() * b.getX()), (((a.getW() * b.getZ()) + (a.getX() * b.getY())) - (a.getY() * b.getX())) + (a.getZ() * b.getW()), (((a.getW() * b.getW()) - (a.getX() * b.getX())) - (a.getY() * b.getY())) - (a.getZ() * b.getZ()));
        return new Quaternion(quaternion.getX(), quaternion.getY(), quaternion.getZ(), 0.0f);
    }

    public static final Quaternion div(float f, Quaternion q) {
        Intrinsics.checkNotNullParameter(q, "q");
        return new Quaternion(f / q.getX(), f / q.getY(), f / q.getZ(), f / q.getW());
    }

    public static final float dot(Quaternion a, Quaternion b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return (a.getX() * b.getX()) + (a.getY() * b.getY()) + (a.getZ() * b.getZ()) + (a.getW() * b.getW());
    }

    public static final Float3 eulerAngles(Quaternion q) {
        Intrinsics.checkNotNullParameter(q, "q");
        Quaternion normalize = normalize(q);
        return new Float3(((float) Math.atan2(((normalize.getY() * normalize.getZ()) + (normalize.getW() * normalize.getX())) * 2.0f, (((normalize.getW() * normalize.getW()) - (normalize.getX() * normalize.getX())) - (normalize.getY() * normalize.getY())) + (normalize.getZ() * normalize.getZ()))) * 57.295776f, ((float) Math.asin(((normalize.getX() * normalize.getZ()) - (normalize.getW() * normalize.getY())) * (-2.0f))) * 57.295776f, ((float) Math.atan2(((normalize.getX() * normalize.getY()) + (normalize.getW() * normalize.getZ())) * 2.0f, (((normalize.getW() * normalize.getW()) + (normalize.getX() * normalize.getX())) - (normalize.getY() * normalize.getY())) - (normalize.getZ() * normalize.getZ()))) * 57.295776f);
    }

    public static final Quaternion inverse(Quaternion q) {
        Intrinsics.checkNotNullParameter(q, "q");
        float x = 1.0f / ((((q.getX() * q.getX()) + (q.getY() * q.getY())) + (q.getZ() * q.getZ())) + (q.getW() * q.getW()));
        return new Quaternion((-q.getX()) * x, (-q.getY()) * x, (-q.getZ()) * x, q.getW() * x);
    }

    public static final float length(Quaternion q) {
        Intrinsics.checkNotNullParameter(q, "q");
        return (float) Math.sqrt((q.getX() * q.getX()) + (q.getY() * q.getY()) + (q.getZ() * q.getZ()) + (q.getW() * q.getW()));
    }

    public static final float length2(Quaternion q) {
        Intrinsics.checkNotNullParameter(q, "q");
        return (q.getX() * q.getX()) + (q.getY() * q.getY()) + (q.getZ() * q.getZ()) + (q.getW() * q.getW());
    }

    public static final Quaternion lerp(Quaternion a, Quaternion b, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        float f2 = 1 - f;
        Quaternion quaternion = new Quaternion(a.getX() * f2, a.getY() * f2, a.getZ() * f2, f2 * a.getW());
        Quaternion quaternion2 = new Quaternion(b.getX() * f, b.getY() * f, b.getZ() * f, f * b.getW());
        return new Quaternion(quaternion.getX() + quaternion2.getX(), quaternion.getY() + quaternion2.getY(), quaternion.getZ() + quaternion2.getZ(), quaternion.getW() + quaternion2.getW());
    }

    public static final Quaternion minus(float f, Quaternion q) {
        Intrinsics.checkNotNullParameter(q, "q");
        return new Quaternion(f - q.getX(), f - q.getY(), f - q.getZ(), f - q.getW());
    }

    public static final Quaternion nlerp(Quaternion a, Quaternion b, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return normalize(lerp(a, b, f));
    }

    public static final Quaternion normalize(Quaternion q) {
        Intrinsics.checkNotNullParameter(q, "q");
        float sqrt = 1.0f / ((float) Math.sqrt((((q.getX() * q.getX()) + (q.getY() * q.getY())) + (q.getZ() * q.getZ())) + (q.getW() * q.getW())));
        return new Quaternion(q.getX() * sqrt, q.getY() * sqrt, q.getZ() * sqrt, q.getW() * sqrt);
    }

    public static final Quaternion plus(float f, Quaternion q) {
        Intrinsics.checkNotNullParameter(q, "q");
        return new Quaternion(q.getX() + f, q.getY() + f, q.getZ() + f, f + q.getW());
    }

    public static final Quaternion slerp(Quaternion a, Quaternion b, float f, float f2) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        float x = (a.getX() * b.getX()) + (a.getY() * b.getY()) + (a.getZ() * b.getZ()) + (a.getW() * b.getW());
        float abs = Math.abs(x);
        if (1.0f - abs < f2) {
            if (x < 0.0f) {
                a = a.unaryMinus();
            }
            return normalize(lerp(a, b, f));
        }
        float sqrt = abs / ((float) Math.sqrt(((((a.getX() * a.getX()) + (a.getY() * a.getY())) + (a.getZ() * a.getZ())) + (a.getW() * a.getW())) * ((((b.getX() * b.getX()) + (b.getY() * b.getY())) + (b.getZ() * b.getZ())) + (b.getW() * b.getW()))));
        if (sqrt < -1.0f) {
            sqrt = -1.0f;
        } else if (sqrt > 1.0f) {
            sqrt = 1.0f;
        }
        float acos = (float) Math.acos(sqrt);
        float f3 = (1.0f - f) * acos;
        float f4 = acos * f;
        float sin = (float) Math.sin(acos);
        if (sin < f2) {
            return normalize(lerp(a, b, f));
        }
        float f5 = 1.0f / sin;
        float sin2 = ((float) Math.sin(f3)) * f5;
        float sin3 = ((float) Math.sin(f4)) * f5;
        Quaternion quaternion = new Quaternion(a.getX() * sin2, a.getY() * sin2, a.getZ() * sin2, sin2 * a.getW());
        if (x < 0.0f) {
            sin3 = -sin3;
        }
        Quaternion quaternion2 = new Quaternion(b.getX() * sin3, b.getY() * sin3, b.getZ() * sin3, sin3 * b.getW());
        return normalize(new Quaternion(quaternion.getX() + quaternion2.getX(), quaternion.getY() + quaternion2.getY(), quaternion.getZ() + quaternion2.getZ(), quaternion.getW() + quaternion2.getW()));
    }

    public static /* synthetic */ Quaternion slerp$default(Quaternion quaternion, Quaternion quaternion2, float f, float f2, int i, Object obj) {
        if ((i & 8) != 0) {
            f2 = 1.0E-10f;
        }
        return slerp(quaternion, quaternion2, f, f2);
    }

    public static final Quaternion times(float f, Quaternion q) {
        Intrinsics.checkNotNullParameter(q, "q");
        return new Quaternion(q.getX() * f, q.getY() * f, q.getZ() * f, f * q.getW());
    }
}
