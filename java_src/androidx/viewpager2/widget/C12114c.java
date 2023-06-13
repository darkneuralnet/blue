package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;
/* renamed from: androidx.viewpager2.widget.c */
/* loaded from: classes.dex */
public final class C12114c extends RecyclerView.AbstractC11863t {

    /* renamed from: a */
    public ViewPager2.AbstractC12103i f56146a;

    /* renamed from: b */
    public final ViewPager2 f56147b;

    /* renamed from: c */
    public final RecyclerView f56148c;

    /* renamed from: d */
    public final LinearLayoutManager f56149d;

    /* renamed from: e */
    public int f56150e;

    /* renamed from: f */
    public int f56151f;

    /* renamed from: g */
    public C12115a f56152g;

    /* renamed from: h */
    public int f56153h;

    /* renamed from: i */
    public int f56154i;

    /* renamed from: j */
    public boolean f56155j;

    /* renamed from: k */
    public boolean f56156k;

    /* renamed from: l */
    public boolean f56157l;

    /* renamed from: m */
    public boolean f56158m;

    /* renamed from: androidx.viewpager2.widget.c$a */
    /* loaded from: classes.dex */
    public static final class C12115a {

        /* renamed from: a */
        public int f56159a;

        /* renamed from: b */
        public float f56160b;

        /* renamed from: c */
        public int f56161c;

        /* renamed from: a */
        public void m65626a() {
            this.f56159a = -1;
            this.f56160b = 0.0f;
            this.f56161c = 0;
        }
    }

    public C12114c(ViewPager2 viewPager2) {
        this.f56147b = viewPager2;
        RecyclerView recyclerView = viewPager2.f56112k;
        this.f56148c = recyclerView;
        this.f56149d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f56152g = new C12115a();
        m65630l();
    }

    /* renamed from: a */
    public final void m65641a(int i, float f, int i2) {
        ViewPager2.AbstractC12103i abstractC12103i = this.f56146a;
        if (abstractC12103i != null) {
            abstractC12103i.mo48695b(i, f, i2);
        }
    }

    /* renamed from: b */
    public final void m65640b(int i) {
        ViewPager2.AbstractC12103i abstractC12103i = this.f56146a;
        if (abstractC12103i != null) {
            abstractC12103i.mo224c(i);
        }
    }

    /* renamed from: c */
    public final void m65639c(int i) {
        if ((this.f56150e == 3 && this.f56151f == 0) || this.f56151f == i) {
            return;
        }
        this.f56151f = i;
        ViewPager2.AbstractC12103i abstractC12103i = this.f56146a;
        if (abstractC12103i != null) {
            abstractC12103i.mo48696a(i);
        }
    }

    /* renamed from: d */
    public final int m65638d() {
        return this.f56149d.m66707r2();
    }

    /* renamed from: e */
    public double m65637e() {
        m65627o();
        C12115a c12115a = this.f56152g;
        return c12115a.f56159a + c12115a.f56160b;
    }

    /* renamed from: f */
    public int m65636f() {
        return this.f56151f;
    }

    /* renamed from: g */
    public boolean m65635g() {
        return this.f56158m;
    }

    /* renamed from: h */
    public boolean m65634h() {
        return this.f56151f == 0;
    }

    /* renamed from: i */
    public final boolean m65633i() {
        int i = this.f56150e;
        return i == 1 || i == 4;
    }

    /* renamed from: j */
    public void m65632j() {
        this.f56157l = true;
    }

    /* renamed from: k */
    public void m65631k(int i, boolean z) {
        int i2;
        if (z) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        this.f56150e = i2;
        boolean z2 = false;
        this.f56158m = false;
        if (this.f56154i != i) {
            z2 = true;
        }
        this.f56154i = i;
        m65639c(2);
        if (z2) {
            m65640b(i);
        }
    }

    /* renamed from: l */
    public final void m65630l() {
        this.f56150e = 0;
        this.f56151f = 0;
        this.f56152g.m65626a();
        this.f56153h = -1;
        this.f56154i = -1;
        this.f56155j = false;
        this.f56156k = false;
        this.f56158m = false;
        this.f56157l = false;
    }

    /* renamed from: m */
    public void m65629m(ViewPager2.AbstractC12103i abstractC12103i) {
        this.f56146a = abstractC12103i;
    }

    /* renamed from: n */
    public final void m65628n(boolean z) {
        int i;
        this.f56158m = z;
        if (z) {
            i = 4;
        } else {
            i = 1;
        }
        this.f56150e = i;
        int i2 = this.f56154i;
        if (i2 != -1) {
            this.f56153h = i2;
            this.f56154i = -1;
        } else if (this.f56153h == -1) {
            this.f56153h = m65638d();
        }
        m65639c(1);
    }

    /* renamed from: o */
    public final void m65627o() {
        boolean z;
        int top;
        float f;
        C12115a c12115a = this.f56152g;
        int m66707r2 = this.f56149d.m66707r2();
        c12115a.f56159a = m66707r2;
        if (m66707r2 == -1) {
            c12115a.m65626a();
            return;
        }
        View mo66607W = this.f56149d.mo66607W(m66707r2);
        if (mo66607W == null) {
            c12115a.m65626a();
            return;
        }
        int m66571u0 = this.f56149d.m66571u0(mo66607W);
        int m66559z0 = this.f56149d.m66559z0(mo66607W);
        int m66647C0 = this.f56149d.m66647C0(mo66607W);
        int m66599b0 = this.f56149d.m66599b0(mo66607W);
        ViewGroup.LayoutParams layoutParams = mo66607W.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            m66571u0 += marginLayoutParams.leftMargin;
            m66559z0 += marginLayoutParams.rightMargin;
            m66647C0 += marginLayoutParams.topMargin;
            m66599b0 += marginLayoutParams.bottomMargin;
        }
        int height = mo66607W.getHeight() + m66647C0 + m66599b0;
        int width = mo66607W.getWidth() + m66571u0 + m66559z0;
        if (this.f56149d.m66744F2() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            top = (mo66607W.getLeft() - m66571u0) - this.f56148c.getPaddingLeft();
            if (this.f56147b.m65693k()) {
                top = -top;
            }
            height = width;
        } else {
            top = (mo66607W.getTop() - m66647C0) - this.f56148c.getPaddingTop();
        }
        int i = -top;
        c12115a.f56161c = i;
        if (i < 0) {
            if (new C4516Ke(this.f56149d).m98632d()) {
                throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
            }
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(c12115a.f56161c)));
        }
        if (height == 0) {
            f = 0.0f;
        } else {
            f = i / height;
        }
        c12115a.f56160b = f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11863t
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        boolean z = true;
        if ((this.f56150e != 1 || this.f56151f != 1) && i == 1) {
            m65628n(false);
        } else if (m65633i() && i == 2) {
            if (this.f56156k) {
                m65639c(2);
                this.f56155j = true;
            }
        } else {
            if (m65633i() && i == 0) {
                m65627o();
                if (!this.f56156k) {
                    int i2 = this.f56152g.f56159a;
                    if (i2 != -1) {
                        m65641a(i2, 0.0f, 0);
                    }
                } else {
                    C12115a c12115a = this.f56152g;
                    if (c12115a.f56161c == 0) {
                        int i3 = this.f56153h;
                        int i4 = c12115a.f56159a;
                        if (i3 != i4) {
                            m65640b(i4);
                        }
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    m65639c(0);
                    m65630l();
                }
            }
            if (this.f56150e == 2 && i == 0 && this.f56157l) {
                m65627o();
                C12115a c12115a2 = this.f56152g;
                if (c12115a2.f56161c == 0) {
                    int i5 = this.f56154i;
                    int i6 = c12115a2.f56159a;
                    if (i5 != i6) {
                        if (i6 == -1) {
                            i6 = 0;
                        }
                        m65640b(i6);
                    }
                    m65639c(0);
                    m65630l();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r5 == r3.f56147b.m65693k()) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11863t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        this.f56156k = true;
        m65627o();
        if (this.f56155j) {
            this.f56155j = false;
            if (i2 <= 0) {
                if (i2 == 0) {
                    if (i < 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                z = false;
                if (z) {
                    C12115a c12115a = this.f56152g;
                    if (c12115a.f56161c != 0) {
                        i3 = c12115a.f56159a + 1;
                        this.f56154i = i3;
                        if (this.f56153h != i3) {
                            m65640b(i3);
                        }
                    }
                }
                i3 = this.f56152g.f56159a;
                this.f56154i = i3;
                if (this.f56153h != i3) {
                }
            }
            z = true;
            if (z) {
            }
            i3 = this.f56152g.f56159a;
            this.f56154i = i3;
            if (this.f56153h != i3) {
            }
        } else if (this.f56150e == 0) {
            int i4 = this.f56152g.f56159a;
            if (i4 == -1) {
                i4 = 0;
            }
            m65640b(i4);
        }
        C12115a c12115a2 = this.f56152g;
        int i5 = c12115a2.f56159a;
        if (i5 == -1) {
            i5 = 0;
        }
        m65641a(i5, c12115a2.f56160b, c12115a2.f56161c);
        C12115a c12115a3 = this.f56152g;
        int i6 = c12115a3.f56159a;
        int i7 = this.f56154i;
        if ((i6 == i7 || i7 == -1) && c12115a3.f56161c == 0 && this.f56151f != 1) {
            m65639c(0);
            m65630l();
        }
    }
}
