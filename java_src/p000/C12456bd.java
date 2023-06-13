package p000;

import android.graphics.Matrix;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\b"}, m28432d2 = {"LhN2;", "Landroid/graphics/Matrix;", "matrix", "", "b", "([FLandroid/graphics/Matrix;)V", C17296a.f69688o, "(Landroid/graphics/Matrix;[F)V", "ui-graphics_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidMatrixConversions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidMatrixConversions.android.kt\nandroidx/compose/ui/graphics/AndroidMatrixConversions_androidKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,112:1\n39#2:113\n39#2:114\n39#2:115\n39#2:116\n39#2:117\n39#2:118\n39#2:119\n*S KotlinDebug\n*F\n+ 1 AndroidMatrixConversions.android.kt\nandroidx/compose/ui/graphics/AndroidMatrixConversions_androidKt\n*L\n58#1:113\n59#1:114\n60#1:115\n61#1:116\n62#1:117\n63#1:118\n64#1:119\n*E\n"})
/* renamed from: bd */
/* loaded from: classes.dex */
public final class C12456bd {
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m64271a(Matrix setFrom, float[] matrix) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        Intrinsics.checkNotNullParameter(setFrom, "$this$setFrom");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        float f = matrix[2];
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (matrix[6] == 0.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                if (matrix[10] == 1.0f) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    if (matrix[14] == 0.0f) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        if (matrix[8] == 0.0f) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (z6) {
                            if (matrix[9] == 0.0f) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                                if (matrix[11] == 0.0f) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                if (z8) {
                                    z2 = true;
                                    if (!z2) {
                                        float f2 = matrix[0];
                                        float f3 = matrix[1];
                                        float f4 = matrix[3];
                                        float f5 = matrix[4];
                                        float f6 = matrix[5];
                                        float f7 = matrix[6];
                                        float f8 = matrix[7];
                                        float f9 = matrix[8];
                                        float f10 = matrix[12];
                                        float f11 = matrix[13];
                                        float f12 = matrix[15];
                                        matrix[0] = f2;
                                        matrix[1] = f5;
                                        matrix[2] = f10;
                                        matrix[3] = f3;
                                        matrix[4] = f6;
                                        matrix[5] = f11;
                                        matrix[6] = f4;
                                        matrix[7] = f8;
                                        matrix[8] = f12;
                                        setFrom.setValues(matrix);
                                        matrix[0] = f2;
                                        matrix[1] = f3;
                                        matrix[2] = f;
                                        matrix[3] = f4;
                                        matrix[4] = f5;
                                        matrix[5] = f6;
                                        matrix[6] = f7;
                                        matrix[7] = f8;
                                        matrix[8] = f9;
                                        return;
                                    }
                                    throw new IllegalArgumentException("Android does not support arbitrary transforms".toString());
                                }
                            }
                        }
                    }
                }
            }
        }
        z2 = false;
        if (!z2) {
        }
    }

    /* renamed from: b */
    public static final void m64270b(float[] setFrom, Matrix matrix) {
        Intrinsics.checkNotNullParameter(setFrom, "$this$setFrom");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        matrix.getValues(setFrom);
        float f = setFrom[0];
        float f2 = setFrom[1];
        float f3 = setFrom[2];
        float f4 = setFrom[3];
        float f5 = setFrom[4];
        float f6 = setFrom[5];
        float f7 = setFrom[6];
        float f8 = setFrom[7];
        float f9 = setFrom[8];
        setFrom[0] = f;
        setFrom[1] = f4;
        setFrom[2] = 0.0f;
        setFrom[3] = f7;
        setFrom[4] = f2;
        setFrom[5] = f5;
        setFrom[6] = 0.0f;
        setFrom[7] = f8;
        setFrom[8] = 0.0f;
        setFrom[9] = 0.0f;
        setFrom[10] = 1.0f;
        setFrom[11] = 0.0f;
        setFrom[12] = f3;
        setFrom[13] = f6;
        setFrom[14] = 0.0f;
        setFrom[15] = f9;
    }
}
