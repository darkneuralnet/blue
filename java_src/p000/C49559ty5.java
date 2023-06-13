package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;
/* renamed from: ty5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C49559ty5 extends AbstractC27525qB {

    /* renamed from: D */
    public final C43151jA0 f111430D;

    /* renamed from: E */
    public final C40620eu0 f111431E;

    public C49559ty5(RD2 rd2, C41135fm2 c41135fm2, C40620eu0 c40620eu0, C47924rD2 c47924rD2) {
        super(rd2, c41135fm2);
        this.f111431E = c40620eu0;
        C43151jA0 c43151jA0 = new C43151jA0(rd2, this, new C47781qy5("__container", c41135fm2.m40864n(), false), c47924rD2);
        this.f111430D = c43151jA0;
        c43151jA0.mo4988f(Collections.emptyList(), Collections.emptyList());
    }

    @Override // p000.AbstractC27525qB
    /* renamed from: H */
    public void mo11137H(C31939Bk2 c31939Bk2, int i, List<C31939Bk2> list, C31939Bk2 c31939Bk22) {
        this.f111430D.mo14523c(c31939Bk2, i, list, c31939Bk22);
    }

    @Override // p000.AbstractC27525qB, p000.InterfaceC46680p71
    /* renamed from: a */
    public void mo3375a(RectF rectF, Matrix matrix, boolean z) {
        super.mo3375a(rectF, matrix, z);
        this.f111430D.mo3375a(rectF, this.f104851o, z);
    }

    @Override // p000.AbstractC27525qB
    /* renamed from: t */
    public void mo3373t(Canvas canvas, Matrix matrix, int i) {
        this.f111430D.mo14522d(canvas, matrix, i);
    }

    @Override // p000.AbstractC27525qB
    /* renamed from: v */
    public C5309MY mo11136v() {
        C5309MY mo11136v = super.mo11136v();
        if (mo11136v != null) {
            return mo11136v;
        }
        return this.f111431E.mo11136v();
    }

    @Override // p000.AbstractC27525qB
    /* renamed from: x */
    public U71 mo11135x() {
        U71 mo11135x = super.mo11135x();
        if (mo11135x != null) {
            return mo11135x;
        }
        return this.f111431E.mo11135x();
    }
}
