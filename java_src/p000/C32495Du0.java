package p000;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import com.github.jinatonic.confetti.ConfettiView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: Du0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C32495Du0 {

    /* renamed from: A */
    public Float f6473A;

    /* renamed from: B */
    public int f6474B;

    /* renamed from: C */
    public int f6475C;

    /* renamed from: D */
    public float f6476D;

    /* renamed from: E */
    public float f6477E;

    /* renamed from: F */
    public float f6478F;

    /* renamed from: G */
    public float f6479G;

    /* renamed from: H */
    public Float f6480H;

    /* renamed from: I */
    public Float f6481I;

    /* renamed from: J */
    public long f6482J;

    /* renamed from: a */
    public final Random f6483a;

    /* renamed from: b */
    public final InterfaceC33197Gu0 f6484b;

    /* renamed from: c */
    public final C32729Eu0 f6485c;

    /* renamed from: d */
    public final ViewGroup f6486d;

    /* renamed from: e */
    public final ConfettiView f6487e;

    /* renamed from: f */
    public final Queue<AbstractC32963Fu0> f6488f;

    /* renamed from: g */
    public final List<AbstractC32963Fu0> f6489g;

    /* renamed from: h */
    public ValueAnimator f6490h;

    /* renamed from: i */
    public long f6491i;

    /* renamed from: j */
    public int f6492j;

    /* renamed from: k */
    public long f6493k;

    /* renamed from: l */
    public float f6494l;

    /* renamed from: m */
    public float f6495m;

    /* renamed from: n */
    public Interpolator f6496n;

    /* renamed from: o */
    public Rect f6497o;

    /* renamed from: p */
    public float f6498p;

    /* renamed from: q */
    public float f6499q;

    /* renamed from: r */
    public float f6500r;

    /* renamed from: s */
    public float f6501s;

    /* renamed from: t */
    public float f6502t;

    /* renamed from: u */
    public float f6503u;

    /* renamed from: v */
    public float f6504v;

    /* renamed from: w */
    public float f6505w;

    /* renamed from: x */
    public Float f6506x;

    /* renamed from: y */
    public Float f6507y;

    /* renamed from: z */
    public Float f6508z;

    /* renamed from: Du0$a */
    /* loaded from: classes5.dex */
    public class View$OnAttachStateChangeListenerC1635a implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC1635a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            C32495Du0.this.m109774y();
        }
    }

    /* renamed from: Du0$b */
    /* loaded from: classes5.dex */
    public class C1636b implements ValueAnimator.AnimatorUpdateListener {
        public C1636b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            long currentPlayTime = valueAnimator.getCurrentPlayTime();
            C32495Du0.this.m109786m(currentPlayTime);
            C32495Du0.this.m109773z(currentPlayTime);
            if (C32495Du0.this.f6489g.size() == 0 && currentPlayTime >= C32495Du0.this.f6493k) {
                C32495Du0.this.m109774y();
            } else {
                C32495Du0.this.f6487e.invalidate();
            }
        }
    }

    public C32495Du0(Context context, InterfaceC33197Gu0 interfaceC33197Gu0, C32729Eu0 c32729Eu0, ViewGroup viewGroup) {
        this(interfaceC33197Gu0, c32729Eu0, viewGroup, ConfettiView.m52059b(context));
    }

    /* renamed from: f */
    public final void m109793f(AbstractC32963Fu0 abstractC32963Fu0) {
        this.f6489g.add(abstractC32963Fu0);
    }

    /* renamed from: g */
    public final void m109792g(int i, long j) {
        for (int i2 = 0; i2 < i; i2++) {
            AbstractC32963Fu0 poll = this.f6488f.poll();
            if (poll == null) {
                poll = this.f6484b.mo15319a(this.f6483a);
            }
            poll.m106266p();
            m109788k(poll, this.f6485c, this.f6483a, j);
            poll.m106267o(this.f6497o);
            m109793f(poll);
        }
    }

    /* renamed from: h */
    public C32495Du0 m109791h() {
        m109789j();
        m109790i();
        m109792g(this.f6492j, 0L);
        m109775x();
        return this;
    }

    /* renamed from: i */
    public final void m109790i() {
        ViewParent parent = this.f6487e.getParent();
        if (parent != null) {
            if (parent != this.f6486d) {
                ((ViewGroup) parent).removeView(this.f6487e);
                this.f6486d.addView(this.f6487e);
            }
        } else {
            this.f6486d.addView(this.f6487e);
        }
        this.f6487e.m52058c();
    }

    /* renamed from: j */
    public final void m109789j() {
        ValueAnimator valueAnimator = this.f6490h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f6491i = 0L;
        Iterator<AbstractC32963Fu0> it = this.f6489g.iterator();
        while (it.hasNext()) {
            m109785n(it.next());
            it.remove();
        }
    }

    /* renamed from: k */
    public void m109788k(AbstractC32963Fu0 abstractC32963Fu0, C32729Eu0 c32729Eu0, Random random, long j) {
        Float valueOf;
        Float valueOf2;
        abstractC32963Fu0.m106262t(j);
        abstractC32963Fu0.m106257y(c32729Eu0.m108219a(random.nextFloat()));
        abstractC32963Fu0.m106256z(c32729Eu0.m108218b(random.nextFloat()));
        abstractC32963Fu0.m106259w(m109787l(this.f6498p, this.f6499q, random));
        abstractC32963Fu0.m106258x(m109787l(this.f6500r, this.f6501s, random));
        abstractC32963Fu0.m106265q(m109787l(this.f6502t, this.f6503u, random));
        abstractC32963Fu0.m106264r(m109787l(this.f6504v, this.f6505w, random));
        Float f = this.f6506x;
        Float f2 = null;
        if (f == null) {
            valueOf = null;
        } else {
            valueOf = Float.valueOf(m109787l(f.floatValue(), this.f6507y.floatValue(), random));
        }
        abstractC32963Fu0.m106280D(valueOf);
        Float f3 = this.f6508z;
        if (f3 == null) {
            valueOf2 = null;
        } else {
            valueOf2 = Float.valueOf(m109787l(f3.floatValue(), this.f6473A.floatValue(), random));
        }
        abstractC32963Fu0.m106279E(valueOf2);
        abstractC32963Fu0.m106261u(m109787l(this.f6474B, this.f6475C, random));
        abstractC32963Fu0.m106260v(m109787l(this.f6476D, this.f6477E, random));
        abstractC32963Fu0.m106283A(m109787l(this.f6478F, this.f6479G, random));
        Float f4 = this.f6480H;
        if (f4 != null) {
            f2 = Float.valueOf(m109787l(f4.floatValue(), this.f6481I.floatValue(), random));
        }
        abstractC32963Fu0.m106281C(f2);
        abstractC32963Fu0.m106282B(this.f6482J);
        abstractC32963Fu0.m106263s(this.f6496n);
    }

    /* renamed from: l */
    public final float m109787l(float f, float f2, Random random) {
        return f + (f2 * ((random.nextFloat() * 2.0f) - 1.0f));
    }

    /* renamed from: m */
    public final void m109786m(long j) {
        if (j < this.f6493k) {
            long j2 = this.f6491i;
            if (j2 == 0) {
                this.f6491i = j;
                return;
            }
            int nextFloat = (int) (this.f6483a.nextFloat() * this.f6494l * ((float) (j - j2)));
            if (nextFloat > 0) {
                this.f6491i = ((float) this.f6491i) + (this.f6495m * nextFloat);
                m109792g(nextFloat, j);
            }
        }
    }

    /* renamed from: n */
    public final void m109785n(AbstractC32963Fu0 abstractC32963Fu0) {
        this.f6488f.add(abstractC32963Fu0);
    }

    /* renamed from: o */
    public C32495Du0 m109784o(long j) {
        this.f6493k = j;
        return this;
    }

    /* renamed from: p */
    public C32495Du0 m109783p(float f) {
        float f2 = f / 1000.0f;
        this.f6494l = f2;
        this.f6495m = 1.0f / f2;
        return this;
    }

    /* renamed from: q */
    public C32495Du0 m109782q(int i, int i2) {
        this.f6474B = i;
        this.f6475C = i2;
        return this;
    }

    /* renamed from: r */
    public C32495Du0 m109781r(int i) {
        this.f6492j = i;
        return this;
    }

    /* renamed from: s */
    public C32495Du0 m109780s(float f, float f2) {
        this.f6478F = f / 1000000.0f;
        this.f6479G = f2 / 1000000.0f;
        return this;
    }

    /* renamed from: t */
    public C32495Du0 m109779t(float f) {
        return m109778u(f, 0.0f);
    }

    /* renamed from: u */
    public C32495Du0 m109778u(float f, float f2) {
        this.f6480H = Float.valueOf(f / 1000.0f);
        this.f6481I = Float.valueOf(f2 / 1000.0f);
        return this;
    }

    /* renamed from: v */
    public C32495Du0 m109777v(float f, float f2) {
        this.f6498p = f / 1000.0f;
        this.f6499q = f2 / 1000.0f;
        return this;
    }

    /* renamed from: w */
    public C32495Du0 m109776w(float f, float f2) {
        this.f6500r = f / 1000.0f;
        this.f6501s = f2 / 1000.0f;
        return this;
    }

    /* renamed from: x */
    public final void m109775x() {
        ValueAnimator duration = ValueAnimator.ofInt(0).setDuration(LongCompanionObject.MAX_VALUE);
        this.f6490h = duration;
        duration.addUpdateListener(new C1636b());
        this.f6490h.start();
    }

    /* renamed from: y */
    public void m109774y() {
        ValueAnimator valueAnimator = this.f6490h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f6487e.m52057d();
    }

    /* renamed from: z */
    public final void m109773z(long j) {
        Iterator<AbstractC32963Fu0> it = this.f6489g.iterator();
        while (it.hasNext()) {
            AbstractC32963Fu0 next = it.next();
            if (!next.m106278a(j)) {
                it.remove();
                m109785n(next);
            }
        }
    }

    public C32495Du0(InterfaceC33197Gu0 interfaceC33197Gu0, C32729Eu0 c32729Eu0, ViewGroup viewGroup, ConfettiView confettiView) {
        this.f6483a = new Random();
        this.f6488f = new LinkedList();
        ArrayList arrayList = new ArrayList(300);
        this.f6489g = arrayList;
        this.f6484b = interfaceC33197Gu0;
        this.f6485c = c32729Eu0;
        this.f6486d = viewGroup;
        this.f6487e = confettiView;
        confettiView.m52060a(arrayList);
        confettiView.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC1635a());
        this.f6482J = -1L;
        this.f6497o = new Rect(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
    }
}
