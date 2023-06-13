package p000;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
/* renamed from: iu6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C42998iu6 extends C41812gu6 {

    /* renamed from: k */
    public static boolean f91672k = true;

    @Override // p000.C44184ku6
    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public void mo28180h(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo28180h(view, i);
        } else if (f91672k) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f91672k = false;
            }
        }
    }
}
