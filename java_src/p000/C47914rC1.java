package p000;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
/* renamed from: rC1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C47914rC1 {
    private C47914rC1() {
    }

    /* renamed from: a */
    public static InterfaceC45542nC1 m16267a(View view, ViewGroup viewGroup, Matrix matrix) {
        if (Build.VERSION.SDK_INT == 28) {
            return C46728pC1.m19830b(view, viewGroup, matrix);
        }
        return C47321qC1.m17915b(view, viewGroup, matrix);
    }

    /* renamed from: b */
    public static void m16266b(View view) {
        if (Build.VERSION.SDK_INT == 28) {
            C46728pC1.m19826f(view);
        } else {
            C47321qC1.m17911f(view);
        }
    }
}
