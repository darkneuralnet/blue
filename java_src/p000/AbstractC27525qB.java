package p000;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.KotlinVersion;
import p000.AbstractC26856oB;
import p000.C41135fm2;
import p000.C46819pM2;
/* renamed from: qB */
/* loaded from: classes2.dex */
public abstract class AbstractC27525qB implements InterfaceC46680p71, AbstractC26856oB.InterfaceC26858b, InterfaceC32173Ck2 {

    /* renamed from: A */
    public Paint f104834A;

    /* renamed from: B */
    public float f104835B;

    /* renamed from: C */
    public BlurMaskFilter f104836C;

    /* renamed from: a */
    public final Path f104837a = new Path();

    /* renamed from: b */
    public final Matrix f104838b = new Matrix();

    /* renamed from: c */
    public final Matrix f104839c = new Matrix();

    /* renamed from: d */
    public final Paint f104840d = new C35224Pl2(1);

    /* renamed from: e */
    public final Paint f104841e = new C35224Pl2(1, PorterDuff.Mode.DST_IN);

    /* renamed from: f */
    public final Paint f104842f = new C35224Pl2(1, PorterDuff.Mode.DST_OUT);

    /* renamed from: g */
    public final Paint f104843g;

    /* renamed from: h */
    public final Paint f104844h;

    /* renamed from: i */
    public final RectF f104845i;

    /* renamed from: j */
    public final RectF f104846j;

    /* renamed from: k */
    public final RectF f104847k;

    /* renamed from: l */
    public final RectF f104848l;

    /* renamed from: m */
    public final RectF f104849m;

    /* renamed from: n */
    public final String f104850n;

    /* renamed from: o */
    public final Matrix f104851o;

    /* renamed from: p */
    public final RD2 f104852p;

    /* renamed from: q */
    public final C41135fm2 f104853q;

    /* renamed from: r */
    public C47412qM2 f104854r;

    /* renamed from: s */
    public C46551ou1 f104855s;

    /* renamed from: t */
    public AbstractC27525qB f104856t;

    /* renamed from: u */
    public AbstractC27525qB f104857u;

    /* renamed from: v */
    public List<AbstractC27525qB> f104858v;

    /* renamed from: w */
    public final List<AbstractC26856oB<?, ?>> f104859w;

    /* renamed from: x */
    public final C44926m96 f104860x;

    /* renamed from: y */
    public boolean f104861y;

    /* renamed from: z */
    public boolean f104862z;

    /* renamed from: qB$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C27526a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f104863a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f104864b;

        static {
            int[] iArr = new int[C46819pM2.EnumC27274a.values().length];
            f104864b = iArr;
            try {
                iArr[C46819pM2.EnumC27274a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f104864b[C46819pM2.EnumC27274a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f104864b[C46819pM2.EnumC27274a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f104864b[C46819pM2.EnumC27274a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[C41135fm2.EnumC20517a.values().length];
            f104863a = iArr2;
            try {
                iArr2[C41135fm2.EnumC20517a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f104863a[C41135fm2.EnumC20517a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f104863a[C41135fm2.EnumC20517a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f104863a[C41135fm2.EnumC20517a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f104863a[C41135fm2.EnumC20517a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f104863a[C41135fm2.EnumC20517a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f104863a[C41135fm2.EnumC20517a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public AbstractC27525qB(RD2 rd2, C41135fm2 c41135fm2) {
        C35224Pl2 c35224Pl2 = new C35224Pl2(1);
        this.f104843g = c35224Pl2;
        this.f104844h = new C35224Pl2(PorterDuff.Mode.CLEAR);
        this.f104845i = new RectF();
        this.f104846j = new RectF();
        this.f104847k = new RectF();
        this.f104848l = new RectF();
        this.f104849m = new RectF();
        this.f104851o = new Matrix();
        this.f104859w = new ArrayList();
        this.f104861y = true;
        this.f104835B = 0.0f;
        this.f104852p = rd2;
        this.f104853q = c41135fm2;
        this.f104850n = c41135fm2.m40869i() + "#draw";
        if (c41135fm2.m40870h() == C41135fm2.EnumC20518b.INVERT) {
            c35224Pl2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            c35224Pl2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        C44926m96 m108628b = c41135fm2.m40855w().m108628b();
        this.f104860x = m108628b;
        m108628b.m26236b(this);
        if (c41135fm2.m40871g() != null && !c41135fm2.m40871g().isEmpty()) {
            C47412qM2 c47412qM2 = new C47412qM2(c41135fm2.m40871g());
            this.f104854r = c47412qM2;
            for (AbstractC26856oB<C45409my5, Path> abstractC26856oB : c47412qM2.m17594a()) {
                abstractC26856oB.m21665a(this);
            }
            for (AbstractC26856oB<Integer, Integer> abstractC26856oB2 : this.f104854r.m17592c()) {
                m17981i(abstractC26856oB2);
                abstractC26856oB2.m21665a(this);
            }
        }
        m17983N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void m17991E() {
        m17984M(this.f104855s.m20303p() == 1.0f);
    }

    /* renamed from: u */
    public static AbstractC27525qB m17970u(C40620eu0 c40620eu0, C41135fm2 c41135fm2, RD2 rd2, C47924rD2 c47924rD2) {
        switch (C27526a.f104863a[c41135fm2.m40872f().ordinal()]) {
            case 1:
                return new C49559ty5(rd2, c41135fm2, c40620eu0, c47924rD2);
            case 2:
                return new C40620eu0(rd2, c41135fm2, c47924rD2.m16209o(c41135fm2.m40865m()), c47924rD2);
            case 3:
                return new C47424qN5(rd2, c41135fm2);
            case 4:
                return new C52252yX1(rd2, c41135fm2);
            case 5:
                return new C44604ld3(rd2, c41135fm2);
            case 6:
                return new C39520d26(rd2, c41135fm2);
            default:
                C32524Dx2.m109586c("Unknown layer type " + c41135fm2.m40872f());
                return null;
        }
    }

    /* renamed from: A */
    public boolean m17995A() {
        return this.f104856t != null;
    }

    /* renamed from: B */
    public final void m17994B(RectF rectF, Matrix matrix) {
        this.f104847k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (!m17967z()) {
            return;
        }
        int size = this.f104854r.m17593b().size();
        for (int i = 0; i < size; i++) {
            C46819pM2 c46819pM2 = this.f104854r.m17593b().get(i);
            Path mo21658h = this.f104854r.m17594a().get(i).mo21658h();
            if (mo21658h != null) {
                this.f104837a.set(mo21658h);
                this.f104837a.transform(matrix);
                int i2 = C27526a.f104864b[c46819pM2.m19427a().ordinal()];
                if (i2 != 1 && i2 != 2) {
                    if ((i2 == 3 || i2 == 4) && c46819pM2.m19424d()) {
                        return;
                    }
                    this.f104837a.computeBounds(this.f104849m, false);
                    if (i == 0) {
                        this.f104847k.set(this.f104849m);
                    } else {
                        RectF rectF2 = this.f104847k;
                        rectF2.set(Math.min(rectF2.left, this.f104849m.left), Math.min(this.f104847k.top, this.f104849m.top), Math.max(this.f104847k.right, this.f104849m.right), Math.max(this.f104847k.bottom, this.f104849m.bottom));
                    }
                } else {
                    return;
                }
            }
        }
        if (!rectF.intersect(this.f104847k)) {
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* renamed from: C */
    public final void m17993C(RectF rectF, Matrix matrix) {
        if (!m17995A() || this.f104853q.m40870h() == C41135fm2.EnumC20518b.INVERT) {
            return;
        }
        this.f104848l.set(0.0f, 0.0f, 0.0f, 0.0f);
        this.f104856t.mo3375a(this.f104848l, matrix, true);
        if (!rectF.intersect(this.f104848l)) {
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* renamed from: D */
    public final void m17992D() {
        this.f104852p.invalidateSelf();
    }

    /* renamed from: F */
    public final void m17990F(float f) {
        this.f104852p.m87126I().m16210n().m21091a(this.f104853q.m40869i(), f);
    }

    /* renamed from: G */
    public void m17989G(AbstractC26856oB<?, ?> abstractC26856oB) {
        this.f104859w.remove(abstractC26856oB);
    }

    /* renamed from: H */
    public void mo11137H(C31939Bk2 c31939Bk2, int i, List<C31939Bk2> list, C31939Bk2 c31939Bk22) {
    }

    /* renamed from: I */
    public void m17988I(AbstractC27525qB abstractC27525qB) {
        this.f104856t = abstractC27525qB;
    }

    /* renamed from: J */
    public void mo17987J(boolean z) {
        if (z && this.f104834A == null) {
            this.f104834A = new C35224Pl2();
        }
        this.f104862z = z;
    }

    /* renamed from: K */
    public void m17986K(AbstractC27525qB abstractC27525qB) {
        this.f104857u = abstractC27525qB;
    }

    /* renamed from: L */
    public void mo17985L(float f) {
        this.f104860x.m26228j(f);
        if (this.f104854r != null) {
            for (int i = 0; i < this.f104854r.m17594a().size(); i++) {
                this.f104854r.m17594a().get(i).mo21654m(f);
            }
        }
        C46551ou1 c46551ou1 = this.f104855s;
        if (c46551ou1 != null) {
            c46551ou1.mo21654m(f);
        }
        AbstractC27525qB abstractC27525qB = this.f104856t;
        if (abstractC27525qB != null) {
            abstractC27525qB.mo17985L(f);
        }
        for (int i2 = 0; i2 < this.f104859w.size(); i2++) {
            this.f104859w.get(i2).mo21654m(f);
        }
    }

    /* renamed from: M */
    public final void m17984M(boolean z) {
        if (z != this.f104861y) {
            this.f104861y = z;
            m17992D();
        }
    }

    /* renamed from: N */
    public final void m17983N() {
        boolean z = true;
        if (!this.f104853q.m40873e().isEmpty()) {
            C46551ou1 c46551ou1 = new C46551ou1(this.f104853q.m40873e());
            this.f104855s = c46551ou1;
            c46551ou1.m21655l();
            this.f104855s.m21665a(new AbstractC26856oB.InterfaceC26858b() { // from class: pB
                @Override // p000.AbstractC26856oB.InterfaceC26858b
                /* renamed from: e */
                public final void mo4989e() {
                    AbstractC27525qB.this.m17991E();
                }
            });
            if (this.f104855s.mo21658h().floatValue() != 1.0f) {
                z = false;
            }
            m17984M(z);
            m17981i(this.f104855s);
            return;
        }
        m17984M(true);
    }

    @Override // p000.InterfaceC46680p71
    /* renamed from: a */
    public void mo3375a(RectF rectF, Matrix matrix, boolean z) {
        this.f104845i.set(0.0f, 0.0f, 0.0f, 0.0f);
        m17972r();
        this.f104851o.set(matrix);
        if (z) {
            List<AbstractC27525qB> list = this.f104858v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f104851o.preConcat(this.f104858v.get(size).f104860x.m26232f());
                }
            } else {
                AbstractC27525qB abstractC27525qB = this.f104857u;
                if (abstractC27525qB != null) {
                    this.f104851o.preConcat(abstractC27525qB.f104860x.m26232f());
                }
            }
        }
        this.f104851o.preConcat(this.f104860x.m26232f());
    }

    @Override // p000.InterfaceC32173Ck2
    /* renamed from: c */
    public void mo14523c(C31939Bk2 c31939Bk2, int i, List<C31939Bk2> list, C31939Bk2 c31939Bk22) {
        AbstractC27525qB abstractC27525qB = this.f104856t;
        if (abstractC27525qB != null) {
            C31939Bk2 m113549a = c31939Bk22.m113549a(abstractC27525qB.getName());
            if (c31939Bk2.m113547c(this.f104856t.getName(), i)) {
                list.add(m113549a.m113541i(this.f104856t));
            }
            if (c31939Bk2.m113542h(getName(), i)) {
                this.f104856t.mo11137H(c31939Bk2, c31939Bk2.m113545e(this.f104856t.getName(), i) + i, list, m113549a);
            }
        }
        if (!c31939Bk2.m113543g(getName(), i)) {
            return;
        }
        if (!"__container".equals(getName())) {
            c31939Bk22 = c31939Bk22.m113549a(getName());
            if (c31939Bk2.m113547c(getName(), i)) {
                list.add(c31939Bk22.m113541i(this));
            }
        }
        if (c31939Bk2.m113542h(getName(), i)) {
            mo11137H(c31939Bk2, i + c31939Bk2.m113545e(getName(), i), list, c31939Bk22);
        }
    }

    @Override // p000.InterfaceC46680p71
    /* renamed from: d */
    public void mo14522d(Canvas canvas, Matrix matrix, int i) {
        int i2;
        Paint paint;
        Integer mo21658h;
        C32416Dl2.m109978a(this.f104850n);
        if (this.f104861y && !this.f104853q.m40854x()) {
            m17972r();
            C32416Dl2.m109978a("Layer#parentMatrix");
            this.f104838b.reset();
            this.f104838b.set(matrix);
            for (int size = this.f104858v.size() - 1; size >= 0; size--) {
                this.f104838b.preConcat(this.f104858v.get(size).f104860x.m26232f());
            }
            C32416Dl2.m109977b("Layer#parentMatrix");
            AbstractC26856oB<?, Integer> m26230h = this.f104860x.m26230h();
            if (m26230h != null && (mo21658h = m26230h.mo21658h()) != null) {
                i2 = mo21658h.intValue();
            } else {
                i2 = 100;
            }
            int i3 = (int) ((((i / 255.0f) * i2) / 100.0f) * 255.0f);
            if (!m17995A() && !m17967z()) {
                this.f104838b.preConcat(this.f104860x.m26232f());
                C32416Dl2.m109978a("Layer#drawLayer");
                mo3373t(canvas, this.f104838b, i3);
                C32416Dl2.m109977b("Layer#drawLayer");
                m17990F(C32416Dl2.m109977b(this.f104850n));
                return;
            }
            C32416Dl2.m109978a("Layer#computeBounds");
            mo3375a(this.f104845i, this.f104838b, false);
            m17993C(this.f104845i, matrix);
            this.f104838b.preConcat(this.f104860x.m26232f());
            m17994B(this.f104845i, this.f104838b);
            this.f104846j.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
            canvas.getMatrix(this.f104839c);
            if (!this.f104839c.isIdentity()) {
                Matrix matrix2 = this.f104839c;
                matrix2.invert(matrix2);
                this.f104839c.mapRect(this.f104846j);
            }
            if (!this.f104845i.intersect(this.f104846j)) {
                this.f104845i.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            C32416Dl2.m109977b("Layer#computeBounds");
            if (this.f104845i.width() >= 1.0f && this.f104845i.height() >= 1.0f) {
                C32416Dl2.m109978a("Layer#saveLayer");
                this.f104840d.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                C33095Gi6.m104859m(canvas, this.f104845i, this.f104840d);
                C32416Dl2.m109977b("Layer#saveLayer");
                m17971s(canvas);
                C32416Dl2.m109978a("Layer#drawLayer");
                mo3373t(canvas, this.f104838b, i3);
                C32416Dl2.m109977b("Layer#drawLayer");
                if (m17967z()) {
                    m17975o(canvas, this.f104838b);
                }
                if (m17995A()) {
                    C32416Dl2.m109978a("Layer#drawMatte");
                    C32416Dl2.m109978a("Layer#saveLayer");
                    C33095Gi6.m104858n(canvas, this.f104845i, this.f104843g, 19);
                    C32416Dl2.m109977b("Layer#saveLayer");
                    m17971s(canvas);
                    this.f104856t.mo14522d(canvas, matrix, i3);
                    C32416Dl2.m109978a("Layer#restoreLayer");
                    canvas.restore();
                    C32416Dl2.m109977b("Layer#restoreLayer");
                    C32416Dl2.m109977b("Layer#drawMatte");
                }
                C32416Dl2.m109978a("Layer#restoreLayer");
                canvas.restore();
                C32416Dl2.m109977b("Layer#restoreLayer");
            }
            if (this.f104862z && (paint = this.f104834A) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.f104834A.setColor(-251901);
                this.f104834A.setStrokeWidth(4.0f);
                canvas.drawRect(this.f104845i, this.f104834A);
                this.f104834A.setStyle(Paint.Style.FILL);
                this.f104834A.setColor(1357638635);
                canvas.drawRect(this.f104845i, this.f104834A);
            }
            m17990F(C32416Dl2.m109977b(this.f104850n));
            return;
        }
        C32416Dl2.m109977b(this.f104850n);
    }

    @Override // p000.AbstractC26856oB.InterfaceC26858b
    /* renamed from: e */
    public void mo4989e() {
        m17992D();
    }

    @Override // p000.InterfaceC36752Vz0
    /* renamed from: f */
    public void mo4988f(List<InterfaceC36752Vz0> list, List<InterfaceC36752Vz0> list2) {
    }

    @Override // p000.InterfaceC36752Vz0
    public String getName() {
        return this.f104853q.m40869i();
    }

    /* renamed from: h */
    public <T> void mo3374h(T t, C41410gE2<T> c41410gE2) {
        this.f104860x.m26235c(t, c41410gE2);
    }

    /* renamed from: i */
    public void m17981i(AbstractC26856oB<?, ?> abstractC26856oB) {
        if (abstractC26856oB == null) {
            return;
        }
        this.f104859w.add(abstractC26856oB);
    }

    /* renamed from: j */
    public final void m17980j(Canvas canvas, Matrix matrix, AbstractC26856oB<C45409my5, Path> abstractC26856oB, AbstractC26856oB<Integer, Integer> abstractC26856oB2) {
        this.f104837a.set(abstractC26856oB.mo21658h());
        this.f104837a.transform(matrix);
        this.f104840d.setAlpha((int) (abstractC26856oB2.mo21658h().intValue() * 2.55f));
        canvas.drawPath(this.f104837a, this.f104840d);
    }

    /* renamed from: k */
    public final void m17979k(Canvas canvas, Matrix matrix, AbstractC26856oB<C45409my5, Path> abstractC26856oB, AbstractC26856oB<Integer, Integer> abstractC26856oB2) {
        C33095Gi6.m104859m(canvas, this.f104845i, this.f104841e);
        this.f104837a.set(abstractC26856oB.mo21658h());
        this.f104837a.transform(matrix);
        this.f104840d.setAlpha((int) (abstractC26856oB2.mo21658h().intValue() * 2.55f));
        canvas.drawPath(this.f104837a, this.f104840d);
        canvas.restore();
    }

    /* renamed from: l */
    public final void m17978l(Canvas canvas, Matrix matrix, AbstractC26856oB<C45409my5, Path> abstractC26856oB, AbstractC26856oB<Integer, Integer> abstractC26856oB2) {
        C33095Gi6.m104859m(canvas, this.f104845i, this.f104840d);
        canvas.drawRect(this.f104845i, this.f104840d);
        this.f104837a.set(abstractC26856oB.mo21658h());
        this.f104837a.transform(matrix);
        this.f104840d.setAlpha((int) (abstractC26856oB2.mo21658h().intValue() * 2.55f));
        canvas.drawPath(this.f104837a, this.f104842f);
        canvas.restore();
    }

    /* renamed from: m */
    public final void m17977m(Canvas canvas, Matrix matrix, AbstractC26856oB<C45409my5, Path> abstractC26856oB, AbstractC26856oB<Integer, Integer> abstractC26856oB2) {
        C33095Gi6.m104859m(canvas, this.f104845i, this.f104841e);
        canvas.drawRect(this.f104845i, this.f104840d);
        this.f104842f.setAlpha((int) (abstractC26856oB2.mo21658h().intValue() * 2.55f));
        this.f104837a.set(abstractC26856oB.mo21658h());
        this.f104837a.transform(matrix);
        canvas.drawPath(this.f104837a, this.f104842f);
        canvas.restore();
    }

    /* renamed from: n */
    public final void m17976n(Canvas canvas, Matrix matrix, AbstractC26856oB<C45409my5, Path> abstractC26856oB, AbstractC26856oB<Integer, Integer> abstractC26856oB2) {
        C33095Gi6.m104859m(canvas, this.f104845i, this.f104842f);
        canvas.drawRect(this.f104845i, this.f104840d);
        this.f104842f.setAlpha((int) (abstractC26856oB2.mo21658h().intValue() * 2.55f));
        this.f104837a.set(abstractC26856oB.mo21658h());
        this.f104837a.transform(matrix);
        canvas.drawPath(this.f104837a, this.f104842f);
        canvas.restore();
    }

    /* renamed from: o */
    public final void m17975o(Canvas canvas, Matrix matrix) {
        C32416Dl2.m109978a("Layer#saveLayer");
        C33095Gi6.m104858n(canvas, this.f104845i, this.f104841e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            m17971s(canvas);
        }
        C32416Dl2.m109977b("Layer#saveLayer");
        for (int i = 0; i < this.f104854r.m17593b().size(); i++) {
            C46819pM2 c46819pM2 = this.f104854r.m17593b().get(i);
            AbstractC26856oB<C45409my5, Path> abstractC26856oB = this.f104854r.m17594a().get(i);
            AbstractC26856oB<Integer, Integer> abstractC26856oB2 = this.f104854r.m17592c().get(i);
            int i2 = C27526a.f104864b[c46819pM2.m19427a().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            if (c46819pM2.m19424d()) {
                                m17978l(canvas, matrix, abstractC26856oB, abstractC26856oB2);
                            } else {
                                m17980j(canvas, matrix, abstractC26856oB, abstractC26856oB2);
                            }
                        }
                    } else if (c46819pM2.m19424d()) {
                        m17977m(canvas, matrix, abstractC26856oB, abstractC26856oB2);
                    } else {
                        m17979k(canvas, matrix, abstractC26856oB, abstractC26856oB2);
                    }
                } else {
                    if (i == 0) {
                        this.f104840d.setColor(-16777216);
                        this.f104840d.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                        canvas.drawRect(this.f104845i, this.f104840d);
                    }
                    if (c46819pM2.m19424d()) {
                        m17976n(canvas, matrix, abstractC26856oB, abstractC26856oB2);
                    } else {
                        m17974p(canvas, matrix, abstractC26856oB);
                    }
                }
            } else if (m17973q()) {
                this.f104840d.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                canvas.drawRect(this.f104845i, this.f104840d);
            }
        }
        C32416Dl2.m109978a("Layer#restoreLayer");
        canvas.restore();
        C32416Dl2.m109977b("Layer#restoreLayer");
    }

    /* renamed from: p */
    public final void m17974p(Canvas canvas, Matrix matrix, AbstractC26856oB<C45409my5, Path> abstractC26856oB) {
        this.f104837a.set(abstractC26856oB.mo21658h());
        this.f104837a.transform(matrix);
        canvas.drawPath(this.f104837a, this.f104842f);
    }

    /* renamed from: q */
    public final boolean m17973q() {
        if (this.f104854r.m17594a().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.f104854r.m17593b().size(); i++) {
            if (this.f104854r.m17593b().get(i).m19427a() != C46819pM2.EnumC27274a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    public final void m17972r() {
        if (this.f104858v != null) {
            return;
        }
        if (this.f104857u == null) {
            this.f104858v = Collections.emptyList();
            return;
        }
        this.f104858v = new ArrayList();
        for (AbstractC27525qB abstractC27525qB = this.f104857u; abstractC27525qB != null; abstractC27525qB = abstractC27525qB.f104857u) {
            this.f104858v.add(abstractC27525qB);
        }
    }

    /* renamed from: s */
    public final void m17971s(Canvas canvas) {
        C32416Dl2.m109978a("Layer#clearLayer");
        RectF rectF = this.f104845i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f104844h);
        C32416Dl2.m109977b("Layer#clearLayer");
    }

    /* renamed from: t */
    public abstract void mo3373t(Canvas canvas, Matrix matrix, int i);

    /* renamed from: v */
    public C5309MY mo11136v() {
        return this.f104853q.m40877a();
    }

    /* renamed from: w */
    public BlurMaskFilter m17969w(float f) {
        if (this.f104835B == f) {
            return this.f104836C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.f104836C = blurMaskFilter;
        this.f104835B = f;
        return blurMaskFilter;
    }

    /* renamed from: x */
    public U71 mo11135x() {
        return this.f104853q.m40875c();
    }

    /* renamed from: y */
    public C41135fm2 m17968y() {
        return this.f104853q;
    }

    /* renamed from: z */
    public boolean m17967z() {
        C47412qM2 c47412qM2 = this.f104854r;
        return (c47412qM2 == null || c47412qM2.m17594a().isEmpty()) ? false : true;
    }
}
