package p000;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.braze.p028ui.inappmessage.views.InAppMessageHtmlBaseView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.DW5;
import p000.X56;
/* renamed from: MX0 */
/* loaded from: classes5.dex */
public class MX0 implements HO1 {

    /* renamed from: p */
    public static final String f23201p = C43664k20.m29433n(MX0.class);

    /* renamed from: a */
    public final View f23202a;

    /* renamed from: b */
    public final InterfaceC50985wO1 f23203b;

    /* renamed from: c */
    public final GO1 f23204c;

    /* renamed from: d */
    public final Animation f23205d;

    /* renamed from: e */
    public final Animation f23206e;

    /* renamed from: f */
    public final X10 f23207f;

    /* renamed from: g */
    public final C43377jZ1 f23208g;

    /* renamed from: h */
    public boolean f23209h;

    /* renamed from: i */
    public Runnable f23210i;

    /* renamed from: j */
    public final View f23211j;

    /* renamed from: k */
    public View f23212k;

    /* renamed from: l */
    public List<View> f23213l;

    /* renamed from: m */
    public View f23214m;

    /* renamed from: n */
    public Map<Integer, Integer> f23215n;

    /* renamed from: o */
    public ViewGroup f23216o;

    /* renamed from: MX0$a */
    /* loaded from: classes5.dex */
    public class View$OnLayoutChangeListenerC5303a implements View.OnLayoutChangeListener {

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f23217b;

        public View$OnLayoutChangeListenerC5303a(ViewGroup viewGroup) {
            this.f23217b = viewGroup;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f23217b.removeOnLayoutChangeListener(this);
            String str = MX0.f23201p;
            C43664k20.m29438i(str, "Detected (bottom - top) of " + (i4 - i2) + " in OnLayoutChangeListener");
            this.f23217b.removeView(MX0.this.f23202a);
            MX0 mx0 = MX0.this;
            mx0.m95201l(this.f23217b, mx0.f23203b, mx0.f23202a, mx0.f23204c);
        }
    }

    /* renamed from: MX0$b */
    /* loaded from: classes5.dex */
    public class C5304b implements DW5.InterfaceC1509c {
        public C5304b() {
        }

        @Override // p000.DW5.InterfaceC1509c
        /* renamed from: a */
        public void mo95186a(View view, Object obj) {
            MX0.this.f23203b.mo6949K(false);
            C42478i20.m35358s().m35357t(true);
        }

        @Override // p000.DW5.InterfaceC1509c
        /* renamed from: b */
        public boolean mo95185b(Object obj) {
            return true;
        }
    }

    /* renamed from: MX0$c */
    /* loaded from: classes5.dex */
    public class C5305c implements X56.InterfaceC9296a {
        public C5305c() {
        }

        @Override // p000.X56.InterfaceC9296a
        /* renamed from: a */
        public void mo77414a() {
            MX0 mx0 = MX0.this;
            mx0.f23202a.removeCallbacks(mx0.f23210i);
        }

        @Override // p000.X56.InterfaceC9296a
        /* renamed from: b */
        public void mo77413b() {
            if (MX0.this.f23203b.mo6944Z() == I41.AUTO_DISMISS) {
                MX0.this.m95202k();
            }
        }
    }

    /* renamed from: MX0$d  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class animationAnimation$AnimationListenerC5306d implements Animation.AnimationListener {
        public animationAnimation$AnimationListenerC5306d() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (MX0.this.f23203b.mo6944Z() == I41.AUTO_DISMISS) {
                MX0.this.m95202k();
            }
            C43664k20.m29438i(MX0.f23201p, "In-app message animated into view.");
            MX0 mx0 = MX0.this;
            mx0.m95191v(mx0.f23203b, mx0.f23202a, mx0.f23204c);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: MX0$e  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class animationAnimation$AnimationListenerC5307e implements Animation.AnimationListener {
        public animationAnimation$AnimationListenerC5307e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            MX0.this.f23202a.clearAnimation();
            MX0.this.f23202a.setVisibility(8);
            MX0.this.m95198o();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: MX0$f */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C5308f {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23223a;

        static {
            int[] iArr = new int[EnumC52810zT2.values().length];
            f23223a = iArr;
            try {
                iArr[EnumC52810zT2.MODAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23223a[EnumC52810zT2.FULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MX0(View view, InterfaceC50985wO1 interfaceC50985wO1, GO1 go1, X10 x10, Animation animation, Animation animation2, View view2) {
        this.f23214m = null;
        this.f23215n = new HashMap();
        this.f23202a = view;
        this.f23203b = interfaceC50985wO1;
        this.f23204c = go1;
        this.f23207f = x10;
        this.f23205d = animation;
        this.f23206e = animation2;
        this.f23209h = false;
        if (view2 != null) {
            this.f23211j = view2;
        } else {
            this.f23211j = view;
        }
        if (interfaceC50985wO1 instanceof BZ1) {
            X56 x56 = new X56(view, m95193t());
            x56.m77415g(m95192u());
            this.f23211j.setOnTouchListener(x56);
        }
        this.f23211j.setOnClickListener(m95195r());
        this.f23208g = new C43377jZ1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m95218A(View view) {
        AO1 ao1 = (AO1) this.f23203b;
        if (ao1.mo14016M().isEmpty()) {
            C43664k20.m29438i(f23201p, "Cannot create button click listener since this in-app message does not have message buttons.");
            return;
        }
        for (int i = 0; i < this.f23213l.size(); i++) {
            if (view.getId() == this.f23213l.get(i).getId()) {
                this.f23204c.mo105042a(this.f23208g, ao1.mo14016M().get(i), ao1);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m95217B(View view) {
        InterfaceC50985wO1 interfaceC50985wO1 = this.f23203b;
        if (interfaceC50985wO1 instanceof AO1) {
            if (((AO1) interfaceC50985wO1).mo14016M().isEmpty()) {
                this.f23204c.mo105036g(this.f23208g, this.f23202a, this.f23203b);
                return;
            }
            return;
        }
        this.f23204c.mo105036g(this.f23208g, this.f23202a, interfaceC50985wO1);
    }

    /* renamed from: C */
    public static /* synthetic */ void m95216C(View view) {
        C42478i20.m35358s().m35357t(true);
    }

    /* renamed from: D */
    public static void m95215D(ViewGroup viewGroup, Map<Integer, Integer> map) {
        if (viewGroup == null) {
            C43664k20.m29421z(f23201p, "In-app message ViewGroup was null. Not resetting in-app message accessibility for exclusive mode.");
            return;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                int id = childAt.getId();
                if (map.containsKey(Integer.valueOf(id))) {
                    C38790bq6.m62539H0(childAt, map.get(Integer.valueOf(id)).intValue());
                } else {
                    C38790bq6.m62539H0(childAt, 0);
                }
            }
        }
    }

    /* renamed from: E */
    public static void m95214E(ViewGroup viewGroup, Map<Integer, Integer> map) {
        if (viewGroup == null) {
            C43664k20.m29421z(f23201p, "In-app message ViewGroup was null. Not preparing in-app message accessibility for exclusive mode.");
            return;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                map.put(Integer.valueOf(childAt.getId()), Integer.valueOf(childAt.getImportantForAccessibility()));
                C38790bq6.m62539H0(childAt, 4);
            }
        }
    }

    /* renamed from: y */
    public static /* synthetic */ void m95188y() {
        C42478i20.m35358s().m35357t(true);
    }

    /* renamed from: z */
    public static /* synthetic */ DB6 m95187z(View view, View view2, DB6 db6) {
        if (db6 == null) {
            return db6;
        }
        EO1 eo1 = (EO1) view;
        if (!eo1.hasAppliedWindowInsets()) {
            C43664k20.m29424w(f23201p, "Calling applyWindowInsets on in-app message view.");
            eo1.applyWindowInsets(db6);
        } else {
            C43664k20.m29438i(f23201p, "Not reapplying window insets to in-app message view.");
        }
        return db6;
    }

    /* renamed from: F */
    public void m95213F(boolean z) {
        Animation animation;
        if (z) {
            animation = this.f23205d;
        } else {
            animation = this.f23206e;
        }
        animation.setAnimationListener(m95197p(z));
        this.f23202a.clearAnimation();
        this.f23202a.setAnimation(animation);
        animation.startNow();
        this.f23202a.invalidate();
    }

    @Override // p000.HO1
    /* renamed from: a */
    public View mo95212a() {
        return this.f23202a;
    }

    @Override // p000.HO1
    /* renamed from: b */
    public InterfaceC50985wO1 mo95211b() {
        return this.f23203b;
    }

    @Override // p000.HO1
    /* renamed from: c */
    public void mo95210c(Activity activity) {
        String str = f23201p;
        C43664k20.m29424w(str, "Opening in-app message view wrapper");
        ViewGroup m95189x = m95189x(activity);
        int height = m95189x.getHeight();
        if (this.f23207f.isInAppMessageAccessibilityExclusiveModeEnabled()) {
            this.f23216o = m95189x;
            this.f23215n.clear();
            m95214E(this.f23216o, this.f23215n);
        }
        this.f23214m = activity.getCurrentFocus();
        if (height == 0) {
            m95189x.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC5303a(m95189x));
            return;
        }
        C43664k20.m29438i(str, "Detected root view height of " + height);
        m95201l(m95189x, this.f23203b, this.f23202a, this.f23204c);
    }

    @Override // p000.HO1
    public void close() {
        if (this.f23207f.isInAppMessageAccessibilityExclusiveModeEnabled()) {
            m95215D(this.f23216o, this.f23215n);
        }
        this.f23202a.removeCallbacks(this.f23210i);
        this.f23204c.mo105041b(this.f23202a, this.f23203b);
        if (this.f23203b.mo6937l0()) {
            this.f23209h = true;
            m95213F(false);
            return;
        }
        m95198o();
    }

    @Override // p000.HO1
    /* renamed from: d */
    public boolean mo95209d() {
        return this.f23209h;
    }

    /* renamed from: k */
    public void m95202k() {
        if (this.f23210i == null) {
            Runnable runnable = new Runnable() { // from class: KX0
                @Override // java.lang.Runnable
                public final void run() {
                    MX0.m95188y();
                }
            };
            this.f23210i = runnable;
            this.f23202a.postDelayed(runnable, this.f23203b.mo6942e0());
        }
    }

    /* renamed from: l */
    public void m95201l(ViewGroup viewGroup, InterfaceC50985wO1 interfaceC50985wO1, final View view, GO1 go1) {
        go1.mo105037f(view, interfaceC50985wO1);
        String str = f23201p;
        C43664k20.m29438i(str, "Adding In-app message view to parent view group.");
        viewGroup.addView(view, m95190w(interfaceC50985wO1));
        if (view instanceof EO1) {
            C38790bq6.m62458s0(viewGroup);
            C38790bq6.m62531L0(viewGroup, new InterfaceC36332Ue3() { // from class: HX0
                @Override // p000.InterfaceC36332Ue3
                /* renamed from: a */
                public final DB6 mo7930a(View view2, DB6 db6) {
                    DB6 m95187z;
                    m95187z = MX0.m95187z(view, view2, db6);
                    return m95187z;
                }
            });
        }
        if (interfaceC50985wO1.mo6951H()) {
            C43664k20.m29438i(str, "In-app message view will animate into the visible area.");
            m95213F(true);
            return;
        }
        C43664k20.m29438i(str, "In-app message view will be placed instantly into the visible area.");
        if (interfaceC50985wO1.mo6944Z() == I41.AUTO_DISMISS) {
            m95202k();
        }
        m95191v(interfaceC50985wO1, view, go1);
    }

    /* renamed from: m */
    public void m95200m() {
        m95199n("In app message displayed.");
    }

    /* renamed from: n */
    public void m95199n(String str) {
        View view = this.f23202a;
        if (view instanceof BO1) {
            String message = this.f23203b.getMessage();
            InterfaceC50985wO1 interfaceC50985wO1 = this.f23203b;
            if (interfaceC50985wO1 instanceof AO1) {
                String mo14021E = ((AO1) interfaceC50985wO1).mo14021E();
                View view2 = this.f23202a;
                view2.announceForAccessibility(mo14021E + " . " + message);
                return;
            }
            this.f23202a.announceForAccessibility(message);
        } else if (view instanceof InAppMessageHtmlBaseView) {
            view.announceForAccessibility(str);
        }
    }

    /* renamed from: o */
    public void m95198o() {
        String str = f23201p;
        C43664k20.m29438i(str, "Closing in-app message view");
        C36938Wt6.m77734j(this.f23202a);
        View view = this.f23202a;
        if (view instanceof InAppMessageHtmlBaseView) {
            ((InAppMessageHtmlBaseView) view).finishWebViewDisplay();
        }
        if (this.f23214m != null) {
            C43664k20.m29438i(str, "Returning focus to view after closing message. View: " + this.f23214m);
            this.f23214m.requestFocus();
        }
        this.f23204c.mo105040c(this.f23203b);
    }

    /* renamed from: p */
    public Animation.AnimationListener m95197p(boolean z) {
        if (z) {
            return new animationAnimation$AnimationListenerC5306d();
        }
        return new animationAnimation$AnimationListenerC5307e();
    }

    /* renamed from: q */
    public View.OnClickListener m95196q() {
        return new View.OnClickListener() { // from class: JX0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MX0.this.m95218A(view);
            }
        };
    }

    /* renamed from: r */
    public View.OnClickListener m95195r() {
        return new View.OnClickListener() { // from class: LX0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MX0.this.m95217B(view);
            }
        };
    }

    /* renamed from: s */
    public View.OnClickListener m95194s() {
        return new View.OnClickListener() { // from class: IX0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MX0.m95216C(view);
            }
        };
    }

    /* renamed from: t */
    public DW5.InterfaceC1509c m95193t() {
        return new C5304b();
    }

    /* renamed from: u */
    public X56.InterfaceC9296a m95192u() {
        return new C5305c();
    }

    /* renamed from: v */
    public void m95191v(InterfaceC50985wO1 interfaceC50985wO1, View view, GO1 go1) {
        if (C36938Wt6.m77736h(view)) {
            int i = C5308f.f23223a[interfaceC50985wO1.mo5008h0().ordinal()];
            if (i != 1 && i != 2) {
                C36938Wt6.m77732l(view);
            }
        } else {
            C36938Wt6.m77732l(view);
        }
        m95200m();
        go1.mo105039d(view, interfaceC50985wO1);
    }

    /* renamed from: w */
    public ViewGroup.LayoutParams m95190w(InterfaceC50985wO1 interfaceC50985wO1) {
        int i;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (interfaceC50985wO1 instanceof BZ1) {
            if (((BZ1) interfaceC50985wO1).m113865x0() == EnumC40227eE5.TOP) {
                i = 48;
            } else {
                i = 80;
            }
            layoutParams.gravity = i;
        }
        return layoutParams;
    }

    /* renamed from: x */
    public ViewGroup m95189x(Activity activity) {
        return (ViewGroup) activity.getWindow().getDecorView().findViewById(16908290);
    }

    public MX0(View view, InterfaceC50985wO1 interfaceC50985wO1, GO1 go1, X10 x10, Animation animation, Animation animation2, View view2, List<View> list, View view3) {
        this(view, interfaceC50985wO1, go1, x10, animation, animation2, view2);
        if (view3 != null) {
            this.f23212k = view3;
            view3.setOnClickListener(m95194s());
        }
        if (list != null) {
            this.f23213l = list;
            for (View view4 : list) {
                view4.setOnClickListener(m95196q());
            }
        }
    }
}
