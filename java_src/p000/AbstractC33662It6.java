package p000;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Deprecated
/* renamed from: It6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC33662It6<T extends View, Z> extends AbstractC28661tE<Z> {

    /* renamed from: h */
    public static boolean f16386h;

    /* renamed from: i */
    public static int f16387i = C32859Fi4.glide_custom_view_target_tag;

    /* renamed from: c */
    public final T f16388c;

    /* renamed from: d */
    public final C3791a f16389d;

    /* renamed from: e */
    public View.OnAttachStateChangeListener f16390e;

    /* renamed from: f */
    public boolean f16391f;

    /* renamed from: g */
    public boolean f16392g;

    /* renamed from: It6$a */
    /* loaded from: classes5.dex */
    public static final class C3791a {

        /* renamed from: e */
        public static Integer f16393e;

        /* renamed from: a */
        public final View f16394a;

        /* renamed from: b */
        public final List<FB5> f16395b = new ArrayList();

        /* renamed from: c */
        public boolean f16396c;

        /* renamed from: d */
        public ViewTreeObserver$OnPreDrawListenerC3792a f16397d;

        /* renamed from: It6$a$a */
        /* loaded from: classes5.dex */
        public static final class ViewTreeObserver$OnPreDrawListenerC3792a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: b */
            public final WeakReference<C3791a> f16398b;

            public ViewTreeObserver$OnPreDrawListenerC3792a(C3791a c3791a) {
                this.f16398b = new WeakReference<>(c3791a);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                C3791a c3791a = this.f16398b.get();
                if (c3791a != null) {
                    c3791a.m101556a();
                    return true;
                }
                return true;
            }
        }

        public C3791a(View view) {
            this.f16394a = view;
        }

        /* renamed from: c */
        public static int m101554c(Context context) {
            if (f16393e == null) {
                Display defaultDisplay = ((WindowManager) C52865zZ3.m1111d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f16393e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f16393e.intValue();
        }

        /* renamed from: a */
        public void m101556a() {
            if (this.f16395b.isEmpty()) {
                return;
            }
            int m101550g = m101550g();
            int m101551f = m101551f();
            if (!m101548i(m101550g, m101551f)) {
                return;
            }
            m101547j(m101550g, m101551f);
            m101555b();
        }

        /* renamed from: b */
        public void m101555b() {
            ViewTreeObserver viewTreeObserver = this.f16394a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f16397d);
            }
            this.f16397d = null;
            this.f16395b.clear();
        }

        /* renamed from: d */
        public void m101553d(FB5 fb5) {
            int m101550g = m101550g();
            int m101551f = m101551f();
            if (m101548i(m101550g, m101551f)) {
                fb5.mo26185d(m101550g, m101551f);
                return;
            }
            if (!this.f16395b.contains(fb5)) {
                this.f16395b.add(fb5);
            }
            if (this.f16397d == null) {
                ViewTreeObserver viewTreeObserver = this.f16394a.getViewTreeObserver();
                ViewTreeObserver$OnPreDrawListenerC3792a viewTreeObserver$OnPreDrawListenerC3792a = new ViewTreeObserver$OnPreDrawListenerC3792a(this);
                this.f16397d = viewTreeObserver$OnPreDrawListenerC3792a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC3792a);
            }
        }

        /* renamed from: e */
        public final int m101552e(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f16396c && this.f16394a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f16394a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m101554c(this.f16394a.getContext());
        }

        /* renamed from: f */
        public final int m101551f() {
            int i;
            int paddingTop = this.f16394a.getPaddingTop() + this.f16394a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f16394a.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.height;
            } else {
                i = 0;
            }
            return m101552e(this.f16394a.getHeight(), i, paddingTop);
        }

        /* renamed from: g */
        public final int m101550g() {
            int i;
            int paddingLeft = this.f16394a.getPaddingLeft() + this.f16394a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f16394a.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.width;
            } else {
                i = 0;
            }
            return m101552e(this.f16394a.getWidth(), i, paddingLeft);
        }

        /* renamed from: h */
        public final boolean m101549h(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        /* renamed from: i */
        public final boolean m101548i(int i, int i2) {
            return m101549h(i) && m101549h(i2);
        }

        /* renamed from: j */
        public final void m101547j(int i, int i2) {
            Iterator it = new ArrayList(this.f16395b).iterator();
            while (it.hasNext()) {
                ((FB5) it.next()).mo26185d(i, i2);
            }
        }

        /* renamed from: k */
        public void m101546k(FB5 fb5) {
            this.f16395b.remove(fb5);
        }
    }

    public AbstractC33662It6(T t) {
        this.f16388c = (T) C52865zZ3.m1111d(t);
        this.f16389d = new C3791a(t);
    }

    /* renamed from: c */
    public final Object m101560c() {
        return this.f16388c.getTag(f16387i);
    }

    /* renamed from: d */
    public final void m101559d() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f16390e;
        if (onAttachStateChangeListener != null && !this.f16392g) {
            this.f16388c.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f16392g = true;
        }
    }

    /* renamed from: e */
    public final void m101558e() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f16390e;
        if (onAttachStateChangeListener != null && this.f16392g) {
            this.f16388c.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f16392g = false;
        }
    }

    /* renamed from: f */
    public final void m101557f(Object obj) {
        f16386h = true;
        this.f16388c.setTag(f16387i, obj);
    }

    @Override // p000.AbstractC28661tE, p000.LY5
    public InterfaceC45599nI4 getRequest() {
        Object m101560c = m101560c();
        if (m101560c != null) {
            if (m101560c instanceof InterfaceC45599nI4) {
                return (InterfaceC45599nI4) m101560c;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // p000.LY5
    public void getSize(FB5 fb5) {
        this.f16389d.m101553d(fb5);
    }

    public T getView() {
        return this.f16388c;
    }

    @Override // p000.AbstractC28661tE, p000.LY5
    public void onLoadCleared(Drawable drawable) {
        super.onLoadCleared(drawable);
        this.f16389d.m101555b();
        if (!this.f16391f) {
            m101558e();
        }
    }

    @Override // p000.AbstractC28661tE, p000.LY5
    public void onLoadStarted(Drawable drawable) {
        super.onLoadStarted(drawable);
        m101559d();
    }

    @Override // p000.LY5
    public void removeCallback(FB5 fb5) {
        this.f16389d.m101546k(fb5);
    }

    @Override // p000.AbstractC28661tE, p000.LY5
    public void setRequest(InterfaceC45599nI4 interfaceC45599nI4) {
        m101557f(interfaceC45599nI4);
    }

    public String toString() {
        return "Target for: " + this.f16388c;
    }
}
