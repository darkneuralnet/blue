package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p000.C41135fm2;
/* renamed from: eu0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C40620eu0 extends AbstractC27525qB {

    /* renamed from: D */
    public AbstractC26856oB<Float, Float> f79088D;

    /* renamed from: E */
    public final List<AbstractC27525qB> f79089E;

    /* renamed from: F */
    public final RectF f79090F;

    /* renamed from: G */
    public final RectF f79091G;

    /* renamed from: H */
    public final Paint f79092H;

    /* renamed from: I */
    public boolean f79093I;

    /* renamed from: eu0$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C20137a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f79094a;

        static {
            int[] iArr = new int[C41135fm2.EnumC20518b.values().length];
            f79094a = iArr;
            try {
                iArr[C41135fm2.EnumC20518b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f79094a[C41135fm2.EnumC20518b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C40620eu0(RD2 rd2, C41135fm2 c41135fm2, List<C41135fm2> list, C47924rD2 c47924rD2) {
        super(rd2, c41135fm2);
        int i;
        AbstractC27525qB abstractC27525qB;
        this.f79089E = new ArrayList();
        this.f79090F = new RectF();
        this.f79091G = new RectF();
        this.f79092H = new Paint();
        this.f79093I = true;
        C27640qe m40857u = c41135fm2.m40857u();
        if (m40857u != null) {
            AbstractC26856oB<Float, Float> mo951a = m40857u.mo951a();
            this.f79088D = mo951a;
            m17981i(mo951a);
            this.f79088D.m21665a(this);
        } else {
            this.f79088D = null;
        }
        C46602oz2 c46602oz2 = new C46602oz2(c47924rD2.m16213k().size());
        int size = list.size() - 1;
        AbstractC27525qB abstractC27525qB2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            C41135fm2 c41135fm22 = list.get(size);
            AbstractC27525qB m17970u = AbstractC27525qB.m17970u(this, c41135fm22, rd2, c47924rD2);
            if (m17970u != null) {
                c46602oz2.m20191n(m17970u.m17968y().m40874d(), m17970u);
                if (abstractC27525qB2 != null) {
                    abstractC27525qB2.m17988I(m17970u);
                    abstractC27525qB2 = null;
                } else {
                    this.f79089E.add(0, m17970u);
                    int i2 = C20137a.f79094a[c41135fm22.m40870h().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        abstractC27525qB2 = m17970u;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < c46602oz2.size(); i++) {
            AbstractC27525qB abstractC27525qB3 = (AbstractC27525qB) c46602oz2.m20196h(c46602oz2.m20192m(i));
            if (abstractC27525qB3 != null && (abstractC27525qB = (AbstractC27525qB) c46602oz2.m20196h(abstractC27525qB3.m17968y().m40868j())) != null) {
                abstractC27525qB3.m17986K(abstractC27525qB);
            }
        }
    }

    @Override // p000.AbstractC27525qB
    /* renamed from: H */
    public void mo11137H(C31939Bk2 c31939Bk2, int i, List<C31939Bk2> list, C31939Bk2 c31939Bk22) {
        for (int i2 = 0; i2 < this.f79089E.size(); i2++) {
            this.f79089E.get(i2).mo14523c(c31939Bk2, i, list, c31939Bk22);
        }
    }

    @Override // p000.AbstractC27525qB
    /* renamed from: J */
    public void mo17987J(boolean z) {
        super.mo17987J(z);
        for (AbstractC27525qB abstractC27525qB : this.f79089E) {
            abstractC27525qB.mo17987J(z);
        }
    }

    @Override // p000.AbstractC27525qB
    /* renamed from: L */
    public void mo17985L(float f) {
        super.mo17985L(f);
        if (this.f79088D != null) {
            f = ((this.f79088D.mo21658h().floatValue() * this.f104853q.m40876b().m16215i()) - this.f104853q.m40876b().m16208p()) / (this.f104852p.m87126I().m16219e() + 0.01f);
        }
        if (this.f79088D == null) {
            f -= this.f104853q.m40860r();
        }
        if (this.f104853q.m40856v() != 0.0f && !"__container".equals(this.f104853q.m40869i())) {
            f /= this.f104853q.m40856v();
        }
        for (int size = this.f79089E.size() - 1; size >= 0; size--) {
            this.f79089E.get(size).mo17985L(f);
        }
    }

    /* renamed from: O */
    public void m42417O(boolean z) {
        this.f79093I = z;
    }

    @Override // p000.AbstractC27525qB, p000.InterfaceC46680p71
    /* renamed from: a */
    public void mo3375a(RectF rectF, Matrix matrix, boolean z) {
        super.mo3375a(rectF, matrix, z);
        for (int size = this.f79089E.size() - 1; size >= 0; size--) {
            this.f79090F.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f79089E.get(size).mo3375a(this.f79090F, this.f104851o, true);
            rectF.union(this.f79090F);
        }
    }

    @Override // p000.AbstractC27525qB, p000.InterfaceC32173Ck2
    /* renamed from: h */
    public <T> void mo3374h(T t, C41410gE2<T> c41410gE2) {
        super.mo3374h(t, c41410gE2);
        if (t == InterfaceC37835aE2.f50101E) {
            if (c41410gE2 == null) {
                AbstractC26856oB<Float, Float> abstractC26856oB = this.f79088D;
                if (abstractC26856oB != null) {
                    abstractC26856oB.m21653n(null);
                    return;
                }
                return;
            }
            C32168Cj6 c32168Cj6 = new C32168Cj6(c41410gE2);
            this.f79088D = c32168Cj6;
            c32168Cj6.m21665a(this);
            m17981i(this.f79088D);
        }
    }

    @Override // p000.AbstractC27525qB
    /* renamed from: t */
    public void mo3373t(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        C32416Dl2.m109978a("CompositionLayer#draw");
        this.f79091G.set(0.0f, 0.0f, this.f104853q.m40866l(), this.f104853q.m40867k());
        matrix.mapRect(this.f79091G);
        if (this.f104852p.m87083c0() && this.f79089E.size() > 1 && i != 255) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f79092H.setAlpha(i);
            C33095Gi6.m104859m(canvas, this.f79091G, this.f79092H);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.f79089E.size() - 1; size >= 0; size--) {
            if (!this.f79093I && "__container".equals(this.f104853q.m40869i())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 && !this.f79091G.isEmpty()) {
                z3 = canvas.clipRect(this.f79091G);
            } else {
                z3 = true;
            }
            if (z3) {
                this.f79089E.get(size).mo14522d(canvas, matrix, i);
            }
        }
        canvas.restore();
        C32416Dl2.m109977b("CompositionLayer#draw");
    }
}
