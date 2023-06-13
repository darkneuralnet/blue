package p000;

import android.graphics.Matrix;
import android.view.View;
/* renamed from: ju6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C43591ju6 extends C42998iu6 {
    @Override // p000.C38830bu6, p000.C44184ku6
    /* renamed from: c */
    public float mo28185c(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // p000.C40626eu6, p000.C44184ku6
    /* renamed from: e */
    public void mo28183e(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // p000.C41812gu6, p000.C44184ku6
    /* renamed from: f */
    public void mo28182f(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p000.C38830bu6, p000.C44184ku6
    /* renamed from: g */
    public void mo28181g(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // p000.C42998iu6, p000.C44184ku6
    /* renamed from: h */
    public void mo28180h(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // p000.C40626eu6, p000.C44184ku6
    /* renamed from: i */
    public void mo28179i(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p000.C40626eu6, p000.C44184ku6
    /* renamed from: j */
    public void mo28178j(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
