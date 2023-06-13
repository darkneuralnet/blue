package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import com.bumptech.glide.C17104c;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
/* renamed from: rI4  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C47971rI4<TranscodeType> extends AbstractC4760LD<C47971rI4<TranscodeType>> {

    /* renamed from: T */
    public static final YI4 f106824T = new YI4().m97554k(B41.f1617c).m97546o0(P24.LOW).m97533x0(true);

    /* renamed from: B */
    public final Context f106825B;

    /* renamed from: C */
    public final UI4 f106826C;

    /* renamed from: D */
    public final Class<TranscodeType> f106827D;

    /* renamed from: E */
    public final ComponentCallbacks2C17096a f106828E;

    /* renamed from: F */
    public final C17104c f106829F;

    /* renamed from: G */
    public K96<?, ? super TranscodeType> f106830G;

    /* renamed from: H */
    public Object f106831H;

    /* renamed from: I */
    public List<TI4<TranscodeType>> f106832I;

    /* renamed from: J */
    public C47971rI4<TranscodeType> f106833J;

    /* renamed from: K */
    public C47971rI4<TranscodeType> f106834K;

    /* renamed from: P */
    public Float f106835P;

    /* renamed from: Q */
    public boolean f106836Q = true;

    /* renamed from: R */
    public boolean f106837R;

    /* renamed from: S */
    public boolean f106838S;

    /* renamed from: rI4$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C27897a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f106839a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f106840b;

        static {
            int[] iArr = new int[P24.values().length];
            f106840b = iArr;
            try {
                iArr[P24.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f106840b[P24.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f106840b[P24.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f106840b[P24.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f106839a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f106839a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f106839a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f106839a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f106839a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f106839a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f106839a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f106839a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    @SuppressLint({"CheckResult"})
    public C47971rI4(ComponentCallbacks2C17096a componentCallbacks2C17096a, UI4 ui4, Class<TranscodeType> cls, Context context) {
        this.f106828E = componentCallbacks2C17096a;
        this.f106826C = ui4;
        this.f106827D = cls;
        this.f106825B = context;
        this.f106830G = ui4.m81657g(cls);
        this.f106829F = componentCallbacks2C17096a.m53149i();
        m16100M0(ui4.m81659e());
        mo16086d(ui4.m81658f());
    }

    /* renamed from: F0 */
    public C47971rI4<TranscodeType> m16107F0(TI4<TranscodeType> ti4) {
        if (m97574S()) {
            return mo16081h().m16107F0(ti4);
        }
        if (ti4 != null) {
            if (this.f106832I == null) {
                this.f106832I = new ArrayList();
            }
            this.f106832I.add(ti4);
        }
        return m97538t0();
    }

    @Override // p000.AbstractC4760LD
    /* renamed from: G0 */
    public C47971rI4<TranscodeType> mo16086d(AbstractC4760LD<?> abstractC4760LD) {
        C52865zZ3.m1111d(abstractC4760LD);
        return (C47971rI4) super.mo16086d(abstractC4760LD);
    }

    /* renamed from: H0 */
    public final InterfaceC45599nI4 m16105H0(LY5<TranscodeType> ly5, TI4<TranscodeType> ti4, AbstractC4760LD<?> abstractC4760LD, Executor executor) {
        return m16104I0(new Object(), ly5, ti4, null, this.f106830G, abstractC4760LD.m97582H(), abstractC4760LD.m97586C(), abstractC4760LD.m97588B(), abstractC4760LD, executor);
    }

    /* renamed from: I0 */
    public final InterfaceC45599nI4 m16104I0(Object obj, LY5<TranscodeType> ly5, TI4<TranscodeType> ti4, EI4 ei4, K96<?, ? super TranscodeType> k96, P24 p24, int i, int i2, AbstractC4760LD<?> abstractC4760LD, Executor executor) {
        C46411og1 c46411og1;
        C46411og1 c46411og12;
        if (this.f106834K != null) {
            c46411og12 = new C46411og1(obj, ei4);
            c46411og1 = c46411og12;
        } else {
            c46411og1 = null;
            c46411og12 = ei4;
        }
        InterfaceC45599nI4 m16103J0 = m16103J0(obj, ly5, ti4, c46411og12, k96, p24, i, i2, abstractC4760LD, executor);
        if (c46411og1 == null) {
            return m16103J0;
        }
        int m97586C = this.f106834K.m97586C();
        int m97588B = this.f106834K.m97588B();
        if (C47029pi6.m18906t(i, i2) && !this.f106834K.m97565c0()) {
            m97586C = abstractC4760LD.m97586C();
            m97588B = abstractC4760LD.m97588B();
        }
        C47971rI4<TranscodeType> c47971rI4 = this.f106834K;
        C46411og1 c46411og13 = c46411og1;
        c46411og13.m20665n(m16103J0, c47971rI4.m16104I0(obj, ly5, ti4, c46411og13, c47971rI4.f106830G, c47971rI4.m97582H(), m97586C, m97588B, this.f106834K, executor));
        return c46411og13;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [LD] */
    /* renamed from: J0 */
    public final InterfaceC45599nI4 m16103J0(Object obj, LY5<TranscodeType> ly5, TI4<TranscodeType> ti4, EI4 ei4, K96<?, ? super TranscodeType> k96, P24 p24, int i, int i2, AbstractC4760LD<?> abstractC4760LD, Executor executor) {
        K96<?, ? super TranscodeType> k962;
        P24 m16101L0;
        C47971rI4<TranscodeType> c47971rI4 = this.f106833J;
        if (c47971rI4 != null) {
            if (!this.f106838S) {
                K96<?, ? super TranscodeType> k963 = c47971rI4.f106830G;
                if (c47971rI4.f106836Q) {
                    k962 = k96;
                } else {
                    k962 = k963;
                }
                if (c47971rI4.m97572V()) {
                    m16101L0 = this.f106833J.m97582H();
                } else {
                    m16101L0 = m16101L0(p24);
                }
                P24 p242 = m16101L0;
                int m97586C = this.f106833J.m97586C();
                int m97588B = this.f106833J.m97588B();
                if (C47029pi6.m18906t(i, i2) && !this.f106833J.m97565c0()) {
                    m97586C = abstractC4760LD.m97586C();
                    m97588B = abstractC4760LD.m97588B();
                }
                Z36 z36 = new Z36(obj, ei4);
                InterfaceC45599nI4 m16087c1 = m16087c1(obj, ly5, ti4, abstractC4760LD, z36, k96, p24, i, i2, executor);
                this.f106838S = true;
                C47971rI4<TranscodeType> c47971rI42 = this.f106833J;
                InterfaceC45599nI4 m16104I0 = c47971rI42.m16104I0(obj, ly5, ti4, z36, k962, p242, m97586C, m97588B, c47971rI42, executor);
                this.f106838S = false;
                z36.m73792m(m16087c1, m16104I0);
                return z36;
            }
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        } else if (this.f106835P != null) {
            Z36 z362 = new Z36(obj, ei4);
            z362.m73792m(m16087c1(obj, ly5, ti4, abstractC4760LD, z362, k96, p24, i, i2, executor), m16087c1(obj, ly5, ti4, abstractC4760LD.clone().m97534w0(this.f106835P.floatValue()), z362, k96, m16101L0(p24), i, i2, executor));
            return z362;
        } else {
            return m16087c1(obj, ly5, ti4, abstractC4760LD, ei4, k96, p24, i, i2, executor);
        }
    }

    @Override // p000.AbstractC4760LD
    /* renamed from: K0 */
    public C47971rI4<TranscodeType> mo16081h() {
        C47971rI4<TranscodeType> c47971rI4 = (C47971rI4) super.clone();
        c47971rI4.f106830G = (K96<?, ? super TranscodeType>) c47971rI4.f106830G.clone();
        if (c47971rI4.f106832I != null) {
            c47971rI4.f106832I = new ArrayList(c47971rI4.f106832I);
        }
        C47971rI4<TranscodeType> c47971rI42 = c47971rI4.f106833J;
        if (c47971rI42 != null) {
            c47971rI4.f106833J = c47971rI42.mo16081h();
        }
        C47971rI4<TranscodeType> c47971rI43 = c47971rI4.f106834K;
        if (c47971rI43 != null) {
            c47971rI4.f106834K = c47971rI43.mo16081h();
        }
        return c47971rI4;
    }

    /* renamed from: L0 */
    public final P24 m16101L0(P24 p24) {
        int i = C27897a.f106840b[p24.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    throw new IllegalArgumentException("unknown priority: " + m97582H());
                }
                return P24.IMMEDIATE;
            }
            return P24.HIGH;
        }
        return P24.NORMAL;
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: M0 */
    public final void m16100M0(List<TI4<Object>> list) {
        for (TI4<Object> ti4 : list) {
            m16107F0(ti4);
        }
    }

    /* renamed from: O0 */
    public <Y extends LY5<TranscodeType>> Y m16099O0(Y y) {
        return (Y) m16097Q0(y, null, C33783Jh1.m100020b());
    }

    /* renamed from: P0 */
    public final <Y extends LY5<TranscodeType>> Y m16098P0(Y y, TI4<TranscodeType> ti4, AbstractC4760LD<?> abstractC4760LD, Executor executor) {
        C52865zZ3.m1111d(y);
        if (this.f106837R) {
            InterfaceC45599nI4 m16105H0 = m16105H0(y, ti4, abstractC4760LD, executor);
            InterfaceC45599nI4 request = y.getRequest();
            if (m16105H0.mo20674e(request) && !m16095S0(abstractC4760LD, request)) {
                if (!((InterfaceC45599nI4) C52865zZ3.m1111d(request)).isRunning()) {
                    request.mo20670i();
                }
                return y;
            }
            this.f106826C.m81660d(y);
            y.setRequest(m16105H0);
            this.f106826C.m81647q(y, m16105H0);
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    /* renamed from: Q0 */
    public <Y extends LY5<TranscodeType>> Y m16097Q0(Y y, TI4<TranscodeType> ti4, Executor executor) {
        return (Y) m16098P0(y, ti4, this, executor);
    }

    /* renamed from: R0 */
    public AbstractC33662It6<ImageView, TranscodeType> m16096R0(ImageView imageView) {
        C47971rI4<TranscodeType> c47971rI4;
        C47029pi6.m18924b();
        C52865zZ3.m1111d(imageView);
        if (!m97566b0() && m97568Z() && imageView.getScaleType() != null) {
            switch (C27897a.f106839a[imageView.getScaleType().ordinal()]) {
                case 1:
                    c47971rI4 = clone().m97562e0();
                    break;
                case 2:
                    c47971rI4 = clone().m97560f0();
                    break;
                case 3:
                case 4:
                case 5:
                    c47971rI4 = clone().m97558g0();
                    break;
                case 6:
                    c47971rI4 = clone().m97560f0();
                    break;
            }
            return (AbstractC33662It6) m16098P0(this.f106829F.m53133a(imageView, this.f106827D), null, c47971rI4, C33783Jh1.m100020b());
        }
        c47971rI4 = this;
        return (AbstractC33662It6) m16098P0(this.f106829F.m53133a(imageView, this.f106827D), null, c47971rI4, C33783Jh1.m100020b());
    }

    /* renamed from: S0 */
    public final boolean m16095S0(AbstractC4760LD<?> abstractC4760LD, InterfaceC45599nI4 interfaceC45599nI4) {
        return !abstractC4760LD.m97573U() && interfaceC45599nI4.isComplete();
    }

    /* renamed from: T0 */
    public C47971rI4<TranscodeType> m16094T0(TI4<TranscodeType> ti4) {
        if (m97574S()) {
            return mo16081h().m16094T0(ti4);
        }
        this.f106832I = null;
        return m16107F0(ti4);
    }

    /* renamed from: U0 */
    public C47971rI4<TranscodeType> m16093U0(Uri uri) {
        return m16088b1(uri);
    }

    /* renamed from: V0 */
    public C47971rI4<TranscodeType> m16092V0(File file) {
        return m16088b1(file);
    }

    /* renamed from: X0 */
    public C47971rI4<TranscodeType> m16091X0(Integer num) {
        return m16088b1(num).mo16086d(YI4.m75261J0(C1568Dd.m110092c(this.f106825B)));
    }

    /* renamed from: Z0 */
    public C47971rI4<TranscodeType> m16090Z0(Object obj) {
        return m16088b1(obj);
    }

    /* renamed from: a1 */
    public C47971rI4<TranscodeType> m16089a1(String str) {
        return m16088b1(str);
    }

    /* renamed from: b1 */
    public final C47971rI4<TranscodeType> m16088b1(Object obj) {
        if (m97574S()) {
            return mo16081h().m16088b1(obj);
        }
        this.f106831H = obj;
        this.f106837R = true;
        return m97538t0();
    }

    /* renamed from: c1 */
    public final InterfaceC45599nI4 m16087c1(Object obj, LY5<TranscodeType> ly5, TI4<TranscodeType> ti4, AbstractC4760LD<?> abstractC4760LD, EI4 ei4, K96<?, ? super TranscodeType> k96, P24 p24, int i, int i2, Executor executor) {
        Context context = this.f106825B;
        C17104c c17104c = this.f106829F;
        return C44944mB5.m26168x(context, c17104c, obj, this.f106831H, this.f106827D, abstractC4760LD, i, i2, p24, ly5, ti4, this.f106832I, ei4, c17104c.m53128f(), k96.m99116e(), executor);
    }

    /* renamed from: d1 */
    public GA1<TranscodeType> m16085d1() {
        return m16084e1(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: e1 */
    public GA1<TranscodeType> m16084e1(int i, int i2) {
        OI4 oi4 = new OI4(i, i2);
        return (GA1) m16097Q0(oi4, oi4, C33783Jh1.m100021a());
    }

    @Override // p000.AbstractC4760LD
    public boolean equals(Object obj) {
        if (!(obj instanceof C47971rI4)) {
            return false;
        }
        C47971rI4 c47971rI4 = (C47971rI4) obj;
        if (!super.equals(c47971rI4) || !Objects.equals(this.f106827D, c47971rI4.f106827D) || !this.f106830G.equals(c47971rI4.f106830G) || !Objects.equals(this.f106831H, c47971rI4.f106831H) || !Objects.equals(this.f106832I, c47971rI4.f106832I) || !Objects.equals(this.f106833J, c47971rI4.f106833J) || !Objects.equals(this.f106834K, c47971rI4.f106834K) || !Objects.equals(this.f106835P, c47971rI4.f106835P) || this.f106836Q != c47971rI4.f106836Q || this.f106837R != c47971rI4.f106837R) {
            return false;
        }
        return true;
    }

    @Deprecated
    /* renamed from: f1 */
    public C47971rI4<TranscodeType> m16083f1(float f) {
        if (m97574S()) {
            return mo16081h().m16083f1(f);
        }
        if (f >= 0.0f && f <= 1.0f) {
            this.f106835P = Float.valueOf(f);
            return m97538t0();
        }
        throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }

    /* renamed from: g1 */
    public C47971rI4<TranscodeType> m16082g1(K96<?, ? super TranscodeType> k96) {
        if (m97574S()) {
            return mo16081h().m16082g1(k96);
        }
        this.f106830G = (K96) C52865zZ3.m1111d(k96);
        this.f106836Q = false;
        return m97538t0();
    }

    @Override // p000.AbstractC4760LD
    public int hashCode() {
        return C47029pi6.m18910p(this.f106837R, C47029pi6.m18910p(this.f106836Q, C47029pi6.m18911o(this.f106835P, C47029pi6.m18911o(this.f106834K, C47029pi6.m18911o(this.f106833J, C47029pi6.m18911o(this.f106832I, C47029pi6.m18911o(this.f106831H, C47029pi6.m18911o(this.f106830G, C47029pi6.m18911o(this.f106827D, super.hashCode())))))))));
    }
}
