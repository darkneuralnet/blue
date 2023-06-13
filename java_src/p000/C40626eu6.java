package p000;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
/* renamed from: eu6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C40626eu6 extends C38830bu6 {

    /* renamed from: g */
    public static boolean f79107g = true;

    /* renamed from: h */
    public static boolean f79108h = true;

    /* renamed from: i */
    public static boolean f79109i = true;

    @Override // p000.C44184ku6
    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public void mo28183e(View view, Matrix matrix) {
        if (f79107g) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f79107g = false;
            }
        }
    }

    @Override // p000.C44184ku6
    @SuppressLint({"NewApi"})
    /* renamed from: i */
    public void mo28179i(View view, Matrix matrix) {
        if (f79108h) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f79108h = false;
            }
        }
    }

    @Override // p000.C44184ku6
    @SuppressLint({"NewApi"})
    /* renamed from: j */
    public void mo28178j(View view, Matrix matrix) {
        if (f79109i) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f79109i = false;
            }
        }
    }
}
