package p000;

import android.annotation.SuppressLint;
import android.view.View;
/* renamed from: bu6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C38830bu6 extends C44184ku6 {

    /* renamed from: f */
    public static boolean f59754f = true;

    @Override // p000.C44184ku6
    /* renamed from: a */
    public void mo28187a(View view) {
    }

    @Override // p000.C44184ku6
    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public float mo28185c(View view) {
        float transitionAlpha;
        if (f59754f) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f59754f = false;
            }
        }
        return view.getAlpha();
    }

    @Override // p000.C44184ku6
    /* renamed from: d */
    public void mo28184d(View view) {
    }

    @Override // p000.C44184ku6
    @SuppressLint({"NewApi"})
    /* renamed from: g */
    public void mo28181g(View view, float f) {
        if (f59754f) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f59754f = false;
            }
        }
        view.setAlpha(f);
    }
}
