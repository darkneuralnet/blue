package p000;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
/* renamed from: H56 */
/* loaded from: classes.dex */
public class H56 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: l */
    public static H56 f12827l;

    /* renamed from: m */
    public static H56 f12828m;

    /* renamed from: b */
    public final View f12829b;

    /* renamed from: c */
    public final CharSequence f12830c;

    /* renamed from: d */
    public final int f12831d;

    /* renamed from: e */
    public final Runnable f12832e = new Runnable() { // from class: F56
        @Override // java.lang.Runnable
        public final void run() {
            H56.this.m104419e();
        }
    };

    /* renamed from: f */
    public final Runnable f12833f = new Runnable() { // from class: G56
        @Override // java.lang.Runnable
        public final void run() {
            H56.this.m104420d();
        }
    };

    /* renamed from: g */
    public int f12834g;

    /* renamed from: h */
    public int f12835h;

    /* renamed from: i */
    public J56 f12836i;

    /* renamed from: j */
    public boolean f12837j;

    /* renamed from: k */
    public boolean f12838k;

    public H56(View view, CharSequence charSequence) {
        this.f12829b = view;
        this.f12830c = charSequence;
        this.f12831d = C34571Mq6.m94686c(ViewConfiguration.get(view.getContext()));
        m104421c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m104419e() {
        m104415i(false);
    }

    /* renamed from: g */
    public static void m104417g(H56 h56) {
        H56 h562 = f12827l;
        if (h562 != null) {
            h562.m104422b();
        }
        f12827l = h56;
        if (h56 != null) {
            h56.m104418f();
        }
    }

    /* renamed from: h */
    public static void m104416h(View view, CharSequence charSequence) {
        H56 h56 = f12827l;
        if (h56 != null && h56.f12829b == view) {
            m104417g(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            H56 h562 = f12828m;
            if (h562 != null && h562.f12829b == view) {
                h562.m104420d();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new H56(view, charSequence);
    }

    /* renamed from: b */
    public final void m104422b() {
        this.f12829b.removeCallbacks(this.f12832e);
    }

    /* renamed from: c */
    public final void m104421c() {
        this.f12838k = true;
    }

    /* renamed from: d */
    public void m104420d() {
        if (f12828m == this) {
            f12828m = null;
            J56 j56 = this.f12836i;
            if (j56 != null) {
                j56.m101172c();
                this.f12836i = null;
                m104421c();
                this.f12829b.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f12827l == this) {
            m104417g(null);
        }
        this.f12829b.removeCallbacks(this.f12833f);
    }

    /* renamed from: f */
    public final void m104418f() {
        this.f12829b.postDelayed(this.f12832e, ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: i */
    public void m104415i(boolean z) {
        long longPressTimeout;
        long j;
        long j2;
        if (!C38790bq6.m62506Y(this.f12829b)) {
            return;
        }
        m104417g(null);
        H56 h56 = f12828m;
        if (h56 != null) {
            h56.m104420d();
        }
        f12828m = this;
        this.f12837j = z;
        J56 j56 = new J56(this.f12829b.getContext());
        this.f12836i = j56;
        j56.m101170e(this.f12829b, this.f12834g, this.f12835h, this.f12837j, this.f12830c);
        this.f12829b.addOnAttachStateChangeListener(this);
        if (this.f12837j) {
            j2 = 2500;
        } else {
            if ((C38790bq6.m62520R(this.f12829b) & 1) == 1) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 15000;
            }
            j2 = j - longPressTimeout;
        }
        this.f12829b.removeCallbacks(this.f12833f);
        this.f12829b.postDelayed(this.f12833f, j2);
    }

    /* renamed from: j */
    public final boolean m104414j(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (!this.f12838k && Math.abs(x - this.f12834g) <= this.f12831d && Math.abs(y - this.f12835h) <= this.f12831d) {
            return false;
        }
        this.f12834g = x;
        this.f12835h = y;
        this.f12838k = false;
        return true;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f12836i != null && this.f12837j) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f12829b.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m104421c();
                m104420d();
            }
        } else if (this.f12829b.isEnabled() && this.f12836i == null && m104414j(motionEvent)) {
            m104417g(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f12834g = view.getWidth() / 2;
        this.f12835h = view.getHeight() / 2;
        m104415i(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m104420d();
    }
}
