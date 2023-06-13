package p000;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import co.bird.android.model.Detail;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
/* renamed from: RD2 */
/* loaded from: classes2.dex */
public class RD2 extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: A */
    public final Matrix f31697A;

    /* renamed from: B */
    public Bitmap f31698B;

    /* renamed from: C */
    public Canvas f31699C;

    /* renamed from: D */
    public Rect f31700D;

    /* renamed from: E */
    public RectF f31701E;

    /* renamed from: F */
    public Paint f31702F;

    /* renamed from: G */
    public Rect f31703G;

    /* renamed from: H */
    public Rect f31704H;

    /* renamed from: I */
    public RectF f31705I;

    /* renamed from: J */
    public RectF f31706J;

    /* renamed from: K */
    public Matrix f31707K;

    /* renamed from: P */
    public Matrix f31708P;

    /* renamed from: Q */
    public boolean f31709Q;

    /* renamed from: b */
    public C47924rD2 f31710b;

    /* renamed from: c */
    public final Choreographer$FrameCallbackC40817fE2 f31711c;

    /* renamed from: d */
    public boolean f31712d;

    /* renamed from: e */
    public boolean f31713e;

    /* renamed from: f */
    public boolean f31714f;

    /* renamed from: g */
    public EnumC7091c f31715g;

    /* renamed from: h */
    public final ArrayList<InterfaceC7090b> f31716h;

    /* renamed from: i */
    public final ValueAnimator.AnimatorUpdateListener f31717i;

    /* renamed from: j */
    public HW1 f31718j;

    /* renamed from: k */
    public String f31719k;

    /* renamed from: l */
    public C42420hw1 f31720l;

    /* renamed from: m */
    public Map<String, Typeface> f31721m;

    /* renamed from: n */
    public String f31722n;

    /* renamed from: o */
    public C41827gw1 f31723o;

    /* renamed from: p */
    public U06 f31724p;

    /* renamed from: q */
    public boolean f31725q;

    /* renamed from: r */
    public boolean f31726r;

    /* renamed from: s */
    public boolean f31727s;

    /* renamed from: t */
    public C40620eu0 f31728t;

    /* renamed from: u */
    public int f31729u;

    /* renamed from: v */
    public boolean f31730v;

    /* renamed from: w */
    public boolean f31731w;

    /* renamed from: x */
    public boolean f31732x;

    /* renamed from: y */
    public EnumC47760qw4 f31733y;

    /* renamed from: z */
    public boolean f31734z;

    /* renamed from: RD2$a */
    /* loaded from: classes2.dex */
    public class C7089a implements ValueAnimator.AnimatorUpdateListener {
        public C7089a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (RD2.this.f31728t != null) {
                RD2.this.f31728t.mo17985L(RD2.this.f31711c.m41684n());
            }
        }
    }

    /* renamed from: RD2$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC7090b {
        /* renamed from: a */
        void mo87033a(C47924rD2 c47924rD2);
    }

    /* renamed from: RD2$c */
    /* loaded from: classes2.dex */
    public enum EnumC7091c {
        NONE,
        PLAY,
        RESUME
    }

    public RD2() {
        Choreographer$FrameCallbackC40817fE2 choreographer$FrameCallbackC40817fE2 = new Choreographer$FrameCallbackC40817fE2();
        this.f31711c = choreographer$FrameCallbackC40817fE2;
        this.f31712d = true;
        this.f31713e = false;
        this.f31714f = false;
        this.f31715g = EnumC7091c.NONE;
        this.f31716h = new ArrayList<>();
        C7089a c7089a = new C7089a();
        this.f31717i = c7089a;
        this.f31726r = false;
        this.f31727s = true;
        this.f31729u = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f31733y = EnumC47760qw4.AUTOMATIC;
        this.f31734z = false;
        this.f31697A = new Matrix();
        this.f31709Q = false;
        choreographer$FrameCallbackC40817fE2.addUpdateListener(c7089a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public /* synthetic */ void m87080d0(C31939Bk2 c31939Bk2, Object obj, C41410gE2 c41410gE2, C47924rD2 c47924rD2) {
        m87047t(c31939Bk2, obj, c41410gE2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public /* synthetic */ void m87077e0(C47924rD2 c47924rD2) {
        m87046t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public /* synthetic */ void m87074f0(C47924rD2 c47924rD2) {
        m87040w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public /* synthetic */ void m87072g0(int i, C47924rD2 c47924rD2) {
        m87133E0(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public /* synthetic */ void m87070h0(int i, C47924rD2 c47924rD2) {
        m87123J0(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public /* synthetic */ void m87068i0(String str, C47924rD2 c47924rD2) {
        m87121K0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public /* synthetic */ void m87066j0(float f, C47924rD2 c47924rD2) {
        m87119L0(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public /* synthetic */ void m87064k0(int i, int i2, C47924rD2 c47924rD2) {
        m87117M0(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public /* synthetic */ void m87062l0(String str, C47924rD2 c47924rD2) {
        m87115N0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public /* synthetic */ void m87060m0(String str, String str2, boolean z, C47924rD2 c47924rD2) {
        m87113O0(str, str2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public /* synthetic */ void m87058n0(float f, float f2, C47924rD2 c47924rD2) {
        m87111P0(f, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0 */
    public /* synthetic */ void m87056o0(int i, C47924rD2 c47924rD2) {
        m87109Q0(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p0 */
    public /* synthetic */ void m87054p0(String str, C47924rD2 c47924rD2) {
        m87107R0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q0 */
    public /* synthetic */ void m87052q0(float f, C47924rD2 c47924rD2) {
        m87105S0(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public /* synthetic */ void m87050r0(float f, C47924rD2 c47924rD2) {
        m87099V0(f);
    }

    /* renamed from: A */
    public final void m87142A(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    /* renamed from: A0 */
    public boolean m87141A0(C47924rD2 c47924rD2) {
        if (this.f31710b == c47924rD2) {
            return false;
        }
        this.f31709Q = true;
        m87039x();
        this.f31710b = c47924rD2;
        m87043v();
        this.f31711c.m41694H(c47924rD2);
        m87099V0(this.f31711c.getAnimatedFraction());
        Iterator it = new ArrayList(this.f31716h).iterator();
        while (it.hasNext()) {
            InterfaceC7090b interfaceC7090b = (InterfaceC7090b) it.next();
            if (interfaceC7090b != null) {
                interfaceC7090b.mo87033a(c47924rD2);
            }
            it.remove();
        }
        this.f31716h.clear();
        c47924rD2.m16202v(this.f31730v);
        m87037y();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    /* renamed from: B */
    public final void m87140B(Canvas canvas) {
        C40620eu0 c40620eu0 = this.f31728t;
        C47924rD2 c47924rD2 = this.f31710b;
        if (c40620eu0 != null && c47924rD2 != null) {
            this.f31697A.reset();
            Rect bounds = getBounds();
            if (!bounds.isEmpty()) {
                this.f31697A.preScale(bounds.width() / c47924rD2.m16222b().width(), bounds.height() / c47924rD2.m16222b().height());
                this.f31697A.preTranslate(bounds.left, bounds.top);
            }
            c40620eu0.mo14522d(canvas, this.f31697A, this.f31729u);
        }
    }

    /* renamed from: B0 */
    public void m87139B0(String str) {
        this.f31722n = str;
        C42420hw1 m87122K = m87122K();
        if (m87122K != null) {
            m87122K.m35461c(str);
        }
    }

    /* renamed from: C */
    public void m87138C(boolean z) {
        if (this.f31725q == z) {
            return;
        }
        this.f31725q = z;
        if (this.f31710b != null) {
            m87043v();
        }
    }

    /* renamed from: C0 */
    public void m87137C0(C41827gw1 c41827gw1) {
        this.f31723o = c41827gw1;
        C42420hw1 c42420hw1 = this.f31720l;
        if (c42420hw1 != null) {
            c42420hw1.m35460d(c41827gw1);
        }
    }

    /* renamed from: D */
    public boolean m87136D() {
        return this.f31725q;
    }

    /* renamed from: D0 */
    public void m87135D0(Map<String, Typeface> map) {
        if (map == this.f31721m) {
            return;
        }
        this.f31721m = map;
        invalidateSelf();
    }

    /* renamed from: E */
    public void m87134E() {
        this.f31716h.clear();
        this.f31711c.m41685m();
        if (!isVisible()) {
            this.f31715g = EnumC7091c.NONE;
        }
    }

    /* renamed from: E0 */
    public void m87133E0(final int i) {
        if (this.f31710b == null) {
            this.f31716h.add(new InterfaceC7090b() { // from class: ED2
                @Override // p000.RD2.InterfaceC7090b
                /* renamed from: a */
                public final void mo87033a(C47924rD2 c47924rD2) {
                    RD2.this.m87072g0(i, c47924rD2);
                }
            });
        } else {
            this.f31711c.m41693I(i);
        }
    }

    /* renamed from: F */
    public final void m87132F(int i, int i2) {
        Bitmap bitmap = this.f31698B;
        if (bitmap != null && bitmap.getWidth() >= i && this.f31698B.getHeight() >= i2) {
            if (this.f31698B.getWidth() > i || this.f31698B.getHeight() > i2) {
                Bitmap createBitmap = Bitmap.createBitmap(this.f31698B, 0, 0, i, i2);
                this.f31698B = createBitmap;
                this.f31699C.setBitmap(createBitmap);
                this.f31709Q = true;
                return;
            }
            return;
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        this.f31698B = createBitmap2;
        this.f31699C.setBitmap(createBitmap2);
        this.f31709Q = true;
    }

    /* renamed from: F0 */
    public void m87131F0(boolean z) {
        this.f31713e = z;
    }

    /* renamed from: G */
    public final void m87130G() {
        if (this.f31699C != null) {
            return;
        }
        this.f31699C = new Canvas();
        this.f31706J = new RectF();
        this.f31707K = new Matrix();
        this.f31708P = new Matrix();
        this.f31700D = new Rect();
        this.f31701E = new RectF();
        this.f31702F = new C35224Pl2();
        this.f31703G = new Rect();
        this.f31704H = new Rect();
        this.f31705I = new RectF();
    }

    /* renamed from: G0 */
    public void m87129G0(GW1 gw1) {
        HW1 hw1 = this.f31718j;
        if (hw1 != null) {
            hw1.m103799d(gw1);
        }
    }

    /* renamed from: H */
    public Bitmap m87128H(String str) {
        HW1 m87118M = m87118M();
        if (m87118M != null) {
            return m87118M.m103802a(str);
        }
        return null;
    }

    /* renamed from: H0 */
    public void m87127H0(String str) {
        this.f31719k = str;
    }

    /* renamed from: I */
    public C47924rD2 m87126I() {
        return this.f31710b;
    }

    /* renamed from: I0 */
    public void m87125I0(boolean z) {
        this.f31726r = z;
    }

    /* renamed from: J */
    public final Context m87124J() {
        Drawable.Callback callback = getCallback();
        if (callback == null || !(callback instanceof View)) {
            return null;
        }
        return ((View) callback).getContext();
    }

    /* renamed from: J0 */
    public void m87123J0(final int i) {
        if (this.f31710b == null) {
            this.f31716h.add(new InterfaceC7090b() { // from class: LD2
                @Override // p000.RD2.InterfaceC7090b
                /* renamed from: a */
                public final void mo87033a(C47924rD2 c47924rD2) {
                    RD2.this.m87070h0(i, c47924rD2);
                }
            });
        } else {
            this.f31711c.m41692J(i + 0.99f);
        }
    }

    /* renamed from: K */
    public final C42420hw1 m87122K() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f31720l == null) {
            C42420hw1 c42420hw1 = new C42420hw1(getCallback(), this.f31723o);
            this.f31720l = c42420hw1;
            String str = this.f31722n;
            if (str != null) {
                c42420hw1.m35461c(str);
            }
        }
        return this.f31720l;
    }

    /* renamed from: K0 */
    public void m87121K0(final String str) {
        C47924rD2 c47924rD2 = this.f31710b;
        if (c47924rD2 == null) {
            this.f31716h.add(new InterfaceC7090b() { // from class: ND2
                @Override // p000.RD2.InterfaceC7090b
                /* renamed from: a */
                public final void mo87033a(C47924rD2 c47924rD22) {
                    RD2.this.m87068i0(str, c47924rD22);
                }
            });
            return;
        }
        C42075hM2 m16212l = c47924rD2.m16212l(str);
        if (m16212l != null) {
            m87123J0((int) (m16212l.f85035b + m16212l.f85036c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + InstructionFileId.DOT);
    }

    /* renamed from: L */
    public int m87120L() {
        return (int) this.f31711c.m41683o();
    }

    /* renamed from: L0 */
    public void m87119L0(final float f) {
        C47924rD2 c47924rD2 = this.f31710b;
        if (c47924rD2 == null) {
            this.f31716h.add(new InterfaceC7090b() { // from class: QD2
                @Override // p000.RD2.InterfaceC7090b
                /* renamed from: a */
                public final void mo87033a(C47924rD2 c47924rD22) {
                    RD2.this.m87066j0(f, c47924rD22);
                }
            });
        } else {
            this.f31711c.m41692J(C48077rU2.m15911i(c47924rD2.m16208p(), this.f31710b.m16218f(), f));
        }
    }

    /* renamed from: M */
    public final HW1 m87118M() {
        HW1 hw1 = this.f31718j;
        if (hw1 != null && !hw1.m103801b(m87124J())) {
            this.f31718j = null;
        }
        if (this.f31718j == null) {
            this.f31718j = new HW1(getCallback(), this.f31719k, null, this.f31710b.m16214j());
        }
        return this.f31718j;
    }

    /* renamed from: M0 */
    public void m87117M0(final int i, final int i2) {
        if (this.f31710b == null) {
            this.f31716h.add(new InterfaceC7090b() { // from class: FD2
                @Override // p000.RD2.InterfaceC7090b
                /* renamed from: a */
                public final void mo87033a(C47924rD2 c47924rD2) {
                    RD2.this.m87064k0(i, i2, c47924rD2);
                }
            });
        } else {
            this.f31711c.m41691M(i, i2 + 0.99f);
        }
    }

    /* renamed from: N */
    public String m87116N() {
        return this.f31719k;
    }

    /* renamed from: N0 */
    public void m87115N0(final String str) {
        C47924rD2 c47924rD2 = this.f31710b;
        if (c47924rD2 == null) {
            this.f31716h.add(new InterfaceC7090b() { // from class: GD2
                @Override // p000.RD2.InterfaceC7090b
                /* renamed from: a */
                public final void mo87033a(C47924rD2 c47924rD22) {
                    RD2.this.m87062l0(str, c47924rD22);
                }
            });
            return;
        }
        C42075hM2 m16212l = c47924rD2.m16212l(str);
        if (m16212l != null) {
            int i = (int) m16212l.f85035b;
            m87117M0(i, ((int) m16212l.f85036c) + i);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + InstructionFileId.DOT);
    }

    /* renamed from: O */
    public UD2 m87114O(String str) {
        C47924rD2 c47924rD2 = this.f31710b;
        if (c47924rD2 == null) {
            return null;
        }
        return c47924rD2.m16214j().get(str);
    }

    /* renamed from: O0 */
    public void m87113O0(final String str, final String str2, final boolean z) {
        float f;
        C47924rD2 c47924rD2 = this.f31710b;
        if (c47924rD2 == null) {
            this.f31716h.add(new InterfaceC7090b() { // from class: OD2
                @Override // p000.RD2.InterfaceC7090b
                /* renamed from: a */
                public final void mo87033a(C47924rD2 c47924rD22) {
                    RD2.this.m87060m0(str, str2, z, c47924rD22);
                }
            });
            return;
        }
        C42075hM2 m16212l = c47924rD2.m16212l(str);
        if (m16212l != null) {
            int i = (int) m16212l.f85035b;
            C42075hM2 m16212l2 = this.f31710b.m16212l(str2);
            if (m16212l2 != null) {
                float f2 = m16212l2.f85035b;
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                m87117M0(i, (int) (f2 + f));
                return;
            }
            throw new IllegalArgumentException("Cannot find marker with name " + str2 + InstructionFileId.DOT);
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + InstructionFileId.DOT);
    }

    /* renamed from: P */
    public boolean m87112P() {
        return this.f31726r;
    }

    /* renamed from: P0 */
    public void m87111P0(final float f, final float f2) {
        C47924rD2 c47924rD2 = this.f31710b;
        if (c47924rD2 == null) {
            this.f31716h.add(new InterfaceC7090b() { // from class: ID2
                @Override // p000.RD2.InterfaceC7090b
                /* renamed from: a */
                public final void mo87033a(C47924rD2 c47924rD22) {
                    RD2.this.m87058n0(f, f2, c47924rD22);
                }
            });
        } else {
            m87117M0((int) C48077rU2.m15911i(c47924rD2.m16208p(), this.f31710b.m16218f(), f), (int) C48077rU2.m15911i(this.f31710b.m16208p(), this.f31710b.m16218f(), f2));
        }
    }

    /* renamed from: Q */
    public float m87110Q() {
        return this.f31711c.m41681q();
    }

    /* renamed from: Q0 */
    public void m87109Q0(final int i) {
        if (this.f31710b == null) {
            this.f31716h.add(new InterfaceC7090b() { // from class: JD2
                @Override // p000.RD2.InterfaceC7090b
                /* renamed from: a */
                public final void mo87033a(C47924rD2 c47924rD2) {
                    RD2.this.m87056o0(i, c47924rD2);
                }
            });
        } else {
            this.f31711c.m41690N(i);
        }
    }

    /* renamed from: R */
    public float m87108R() {
        return this.f31711c.m41680r();
    }

    /* renamed from: R0 */
    public void m87107R0(final String str) {
        C47924rD2 c47924rD2 = this.f31710b;
        if (c47924rD2 == null) {
            this.f31716h.add(new InterfaceC7090b() { // from class: PD2
                @Override // p000.RD2.InterfaceC7090b
                /* renamed from: a */
                public final void mo87033a(C47924rD2 c47924rD22) {
                    RD2.this.m87054p0(str, c47924rD22);
                }
            });
            return;
        }
        C42075hM2 m16212l = c47924rD2.m16212l(str);
        if (m16212l != null) {
            m87109Q0((int) m16212l.f85035b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + InstructionFileId.DOT);
    }

    /* renamed from: S */
    public float m87106S() {
        return this.f31711c.m41684n();
    }

    /* renamed from: S0 */
    public void m87105S0(final float f) {
        C47924rD2 c47924rD2 = this.f31710b;
        if (c47924rD2 == null) {
            this.f31716h.add(new InterfaceC7090b() { // from class: KD2
                @Override // p000.RD2.InterfaceC7090b
                /* renamed from: a */
                public final void mo87033a(C47924rD2 c47924rD22) {
                    RD2.this.m87052q0(f, c47924rD22);
                }
            });
        } else {
            m87109Q0((int) C48077rU2.m15911i(c47924rD2.m16208p(), this.f31710b.m16218f(), f));
        }
    }

    /* renamed from: T */
    public EnumC47760qw4 m87104T() {
        return this.f31734z ? EnumC47760qw4.SOFTWARE : EnumC47760qw4.HARDWARE;
    }

    /* renamed from: T0 */
    public void m87103T0(boolean z) {
        if (this.f31731w == z) {
            return;
        }
        this.f31731w = z;
        C40620eu0 c40620eu0 = this.f31728t;
        if (c40620eu0 != null) {
            c40620eu0.mo17987J(z);
        }
    }

    /* renamed from: U */
    public int m87102U() {
        return this.f31711c.getRepeatCount();
    }

    /* renamed from: U0 */
    public void m87101U0(boolean z) {
        this.f31730v = z;
        C47924rD2 c47924rD2 = this.f31710b;
        if (c47924rD2 != null) {
            c47924rD2.m16202v(z);
        }
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: V */
    public int m87100V() {
        return this.f31711c.getRepeatMode();
    }

    /* renamed from: V0 */
    public void m87099V0(final float f) {
        if (this.f31710b == null) {
            this.f31716h.add(new InterfaceC7090b() { // from class: CD2
                @Override // p000.RD2.InterfaceC7090b
                /* renamed from: a */
                public final void mo87033a(C47924rD2 c47924rD2) {
                    RD2.this.m87050r0(f, c47924rD2);
                }
            });
            return;
        }
        C32416Dl2.m109978a("Drawable#setProgress");
        this.f31711c.m41693I(this.f31710b.m16216h(f));
        C32416Dl2.m109977b("Drawable#setProgress");
    }

    /* renamed from: W */
    public float m87098W() {
        return this.f31711c.m41679t();
    }

    /* renamed from: W0 */
    public void m87097W0(EnumC47760qw4 enumC47760qw4) {
        this.f31733y = enumC47760qw4;
        m87037y();
    }

    /* renamed from: X */
    public U06 m87096X() {
        return this.f31724p;
    }

    /* renamed from: X0 */
    public void m87095X0(int i) {
        this.f31711c.setRepeatCount(i);
    }

    /* renamed from: Y */
    public Typeface m87094Y(C41234fw1 c41234fw1) {
        Map<String, Typeface> map = this.f31721m;
        if (map != null) {
            String m40436a = c41234fw1.m40436a();
            if (map.containsKey(m40436a)) {
                return map.get(m40436a);
            }
            String m40435b = c41234fw1.m40435b();
            if (map.containsKey(m40435b)) {
                return map.get(m40435b);
            }
            String str = c41234fw1.m40436a() + Detail.EMPTY_CHAR + c41234fw1.m40434c();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        C42420hw1 m87122K = m87122K();
        if (m87122K != null) {
            return m87122K.m35462b(c41234fw1);
        }
        return null;
    }

    /* renamed from: Y0 */
    public void m87093Y0(int i) {
        this.f31711c.setRepeatMode(i);
    }

    /* renamed from: Z */
    public final boolean m87092Z() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        if (!(parent instanceof ViewGroup)) {
            return false;
        }
        return !((ViewGroup) parent).getClipChildren();
    }

    /* renamed from: Z0 */
    public void m87091Z0(boolean z) {
        this.f31714f = z;
    }

    /* renamed from: a0 */
    public boolean m87089a0() {
        Choreographer$FrameCallbackC40817fE2 choreographer$FrameCallbackC40817fE2 = this.f31711c;
        if (choreographer$FrameCallbackC40817fE2 == null) {
            return false;
        }
        return choreographer$FrameCallbackC40817fE2.isRunning();
    }

    /* renamed from: a1 */
    public void m87088a1(float f) {
        this.f31711c.m41689O(f);
    }

    /* renamed from: b0 */
    public boolean m87086b0() {
        if (isVisible()) {
            return this.f31711c.isRunning();
        }
        EnumC7091c enumC7091c = this.f31715g;
        if (enumC7091c != EnumC7091c.PLAY && enumC7091c != EnumC7091c.RESUME) {
            return false;
        }
        return true;
    }

    /* renamed from: b1 */
    public void m87085b1(Boolean bool) {
        this.f31712d = bool.booleanValue();
    }

    /* renamed from: c0 */
    public boolean m87083c0() {
        return this.f31732x;
    }

    /* renamed from: c1 */
    public void m87082c1(U06 u06) {
        this.f31724p = u06;
    }

    /* renamed from: d1 */
    public void m87079d1(boolean z) {
        this.f31711c.m41688P(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C32416Dl2.m109978a("Drawable#draw");
        if (this.f31714f) {
            try {
                if (this.f31734z) {
                    m87044u0(canvas, this.f31728t);
                } else {
                    m87140B(canvas);
                }
            } catch (Throwable th) {
                C32524Dx2.m109587b("Lottie crashed in draw!", th);
            }
        } else if (this.f31734z) {
            m87044u0(canvas, this.f31728t);
        } else {
            m87140B(canvas);
        }
        this.f31709Q = false;
        C32416Dl2.m109977b("Drawable#draw");
    }

    /* renamed from: e1 */
    public boolean m87076e1() {
        return this.f31721m == null && this.f31724p == null && this.f31710b.m16221c().size() > 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f31729u;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        C47924rD2 c47924rD2 = this.f31710b;
        if (c47924rD2 == null) {
            return -1;
        }
        return c47924rD2.m16222b().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        C47924rD2 c47924rD2 = this.f31710b;
        if (c47924rD2 == null) {
            return -1;
        }
        return c47924rD2.m16222b().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f31709Q) {
            return;
        }
        this.f31709Q = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return m87089a0();
    }

    /* renamed from: r */
    public void m87051r(Animator.AnimatorListener animatorListener) {
        this.f31711c.addListener(animatorListener);
    }

    /* renamed from: s */
    public void m87049s(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f31711c.addUpdateListener(animatorUpdateListener);
    }

    /* renamed from: s0 */
    public void m87048s0() {
        this.f31716h.clear();
        this.f31711c.m41677y();
        if (!isVisible()) {
            this.f31715g = EnumC7091c.NONE;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f31729u = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        C32524Dx2.m109586c("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean z3 = !isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            EnumC7091c enumC7091c = this.f31715g;
            if (enumC7091c == EnumC7091c.PLAY) {
                m87046t0();
            } else if (enumC7091c == EnumC7091c.RESUME) {
                m87040w0();
            }
        } else if (this.f31711c.isRunning()) {
            m87048s0();
            this.f31715g = EnumC7091c.RESUME;
        } else if (!z3) {
            this.f31715g = EnumC7091c.NONE;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        m87046t0();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        m87134E();
    }

    /* renamed from: t */
    public <T> void m87047t(final C31939Bk2 c31939Bk2, final T t, final C41410gE2<T> c41410gE2) {
        C40620eu0 c40620eu0 = this.f31728t;
        if (c40620eu0 == null) {
            this.f31716h.add(new InterfaceC7090b() { // from class: HD2
                @Override // p000.RD2.InterfaceC7090b
                /* renamed from: a */
                public final void mo87033a(C47924rD2 c47924rD2) {
                    RD2.this.m87080d0(c31939Bk2, t, c41410gE2, c47924rD2);
                }
            });
            return;
        }
        boolean z = true;
        if (c31939Bk2 == C31939Bk2.f2802c) {
            c40620eu0.mo3374h(t, c41410gE2);
        } else if (c31939Bk2.m113546d() != null) {
            c31939Bk2.m113546d().mo3374h(t, c41410gE2);
        } else {
            List<C31939Bk2> m87042v0 = m87042v0(c31939Bk2);
            for (int i = 0; i < m87042v0.size(); i++) {
                m87042v0.get(i).m113546d().mo3374h(t, c41410gE2);
            }
            z = true ^ m87042v0.isEmpty();
        }
        if (z) {
            invalidateSelf();
            if (t == InterfaceC37835aE2.f50101E) {
                m87099V0(m87106S());
            }
        }
    }

    /* renamed from: t0 */
    public void m87046t0() {
        float m87110Q;
        if (this.f31728t == null) {
            this.f31716h.add(new InterfaceC7090b() { // from class: DD2
                @Override // p000.RD2.InterfaceC7090b
                /* renamed from: a */
                public final void mo87033a(C47924rD2 c47924rD2) {
                    RD2.this.m87077e0(c47924rD2);
                }
            });
            return;
        }
        m87037y();
        if (m87045u() || m87102U() == 0) {
            if (isVisible()) {
                this.f31711c.m41676z();
                this.f31715g = EnumC7091c.NONE;
            } else {
                this.f31715g = EnumC7091c.PLAY;
            }
        }
        if (!m87045u()) {
            if (m87098W() < 0.0f) {
                m87110Q = m87108R();
            } else {
                m87110Q = m87110Q();
            }
            m87133E0((int) m87110Q);
            this.f31711c.m41685m();
            if (!isVisible()) {
                this.f31715g = EnumC7091c.NONE;
            }
        }
    }

    /* renamed from: u */
    public final boolean m87045u() {
        return this.f31712d || this.f31713e;
    }

    /* renamed from: u0 */
    public final void m87044u0(Canvas canvas, C40620eu0 c40620eu0) {
        if (this.f31710b != null && c40620eu0 != null) {
            m87130G();
            canvas.getMatrix(this.f31707K);
            canvas.getClipBounds(this.f31700D);
            m87035z(this.f31700D, this.f31701E);
            this.f31707K.mapRect(this.f31701E);
            m87142A(this.f31701E, this.f31700D);
            if (this.f31727s) {
                this.f31706J.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
            } else {
                c40620eu0.mo3375a(this.f31706J, null, false);
            }
            this.f31707K.mapRect(this.f31706J);
            Rect bounds = getBounds();
            float width = bounds.width() / getIntrinsicWidth();
            float height = bounds.height() / getIntrinsicHeight();
            m87038x0(this.f31706J, width, height);
            if (!m87092Z()) {
                RectF rectF = this.f31706J;
                Rect rect = this.f31700D;
                rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
            }
            int ceil = (int) Math.ceil(this.f31706J.width());
            int ceil2 = (int) Math.ceil(this.f31706J.height());
            if (ceil != 0 && ceil2 != 0) {
                m87132F(ceil, ceil2);
                if (this.f31709Q) {
                    this.f31697A.set(this.f31707K);
                    this.f31697A.preScale(width, height);
                    Matrix matrix = this.f31697A;
                    RectF rectF2 = this.f31706J;
                    matrix.postTranslate(-rectF2.left, -rectF2.top);
                    this.f31698B.eraseColor(0);
                    c40620eu0.mo14522d(this.f31699C, this.f31697A, this.f31729u);
                    this.f31707K.invert(this.f31708P);
                    this.f31708P.mapRect(this.f31705I, this.f31706J);
                    m87142A(this.f31705I, this.f31704H);
                }
                this.f31703G.set(0, 0, ceil, ceil2);
                canvas.drawBitmap(this.f31698B, this.f31703G, this.f31704H, this.f31702F);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    /* renamed from: v */
    public final void m87043v() {
        C47924rD2 c47924rD2 = this.f31710b;
        if (c47924rD2 == null) {
            return;
        }
        C40620eu0 c40620eu0 = new C40620eu0(this, C42914im2.m33500b(c47924rD2), c47924rD2.m16213k(), c47924rD2);
        this.f31728t = c40620eu0;
        if (this.f31731w) {
            c40620eu0.mo17987J(true);
        }
        this.f31728t.m42417O(this.f31727s);
    }

    /* renamed from: v0 */
    public List<C31939Bk2> m87042v0(C31939Bk2 c31939Bk2) {
        if (this.f31728t == null) {
            C32524Dx2.m109586c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f31728t.mo14523c(c31939Bk2, 0, arrayList, new C31939Bk2(new String[0]));
        return arrayList;
    }

    /* renamed from: w */
    public void m87041w() {
        this.f31716h.clear();
        this.f31711c.cancel();
        if (!isVisible()) {
            this.f31715g = EnumC7091c.NONE;
        }
    }

    /* renamed from: w0 */
    public void m87040w0() {
        float m87110Q;
        if (this.f31728t == null) {
            this.f31716h.add(new InterfaceC7090b() { // from class: MD2
                @Override // p000.RD2.InterfaceC7090b
                /* renamed from: a */
                public final void mo87033a(C47924rD2 c47924rD2) {
                    RD2.this.m87074f0(c47924rD2);
                }
            });
            return;
        }
        m87037y();
        if (m87045u() || m87102U() == 0) {
            if (isVisible()) {
                this.f31711c.m41696D();
                this.f31715g = EnumC7091c.NONE;
            } else {
                this.f31715g = EnumC7091c.RESUME;
            }
        }
        if (!m87045u()) {
            if (m87098W() < 0.0f) {
                m87110Q = m87108R();
            } else {
                m87110Q = m87110Q();
            }
            m87133E0((int) m87110Q);
            this.f31711c.m41685m();
            if (!isVisible()) {
                this.f31715g = EnumC7091c.NONE;
            }
        }
    }

    /* renamed from: x */
    public void m87039x() {
        if (this.f31711c.isRunning()) {
            this.f31711c.cancel();
            if (!isVisible()) {
                this.f31715g = EnumC7091c.NONE;
            }
        }
        this.f31710b = null;
        this.f31728t = null;
        this.f31718j = null;
        this.f31711c.m41686l();
        invalidateSelf();
    }

    /* renamed from: x0 */
    public final void m87038x0(RectF rectF, float f, float f2) {
        rectF.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
    }

    /* renamed from: y */
    public final void m87037y() {
        C47924rD2 c47924rD2 = this.f31710b;
        if (c47924rD2 == null) {
            return;
        }
        this.f31734z = this.f31733y.m16773b(Build.VERSION.SDK_INT, c47924rD2.m16207q(), c47924rD2.m16211m());
    }

    /* renamed from: y0 */
    public void m87036y0(boolean z) {
        this.f31732x = z;
    }

    /* renamed from: z */
    public final void m87035z(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: z0 */
    public void m87034z0(boolean z) {
        if (z != this.f31727s) {
            this.f31727s = z;
            C40620eu0 c40620eu0 = this.f31728t;
            if (c40620eu0 != null) {
                c40620eu0.m42417O(z);
            }
            invalidateSelf();
        }
    }
}
