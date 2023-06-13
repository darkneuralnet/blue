package p000;

import android.annotation.SuppressLint;
import android.view.View;
/* renamed from: gu6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C41812gu6 extends C40626eu6 {

    /* renamed from: j */
    public static boolean f84428j = true;

    @Override // p000.C44184ku6
    @SuppressLint({"NewApi"})
    /* renamed from: f */
    public void mo28182f(View view, int i, int i2, int i3, int i4) {
        if (f84428j) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f84428j = false;
            }
        }
    }
}
