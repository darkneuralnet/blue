package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import java.util.concurrent.atomic.AtomicInteger;
import p000.C42732iT3;
import p000.C47378qI4;
/* renamed from: FI4 */
/* loaded from: classes6.dex */
public class FI4 {

    /* renamed from: m */
    public static final AtomicInteger f9143m = new AtomicInteger();

    /* renamed from: a */
    public final C42732iT3 f9144a;

    /* renamed from: b */
    public final C47378qI4.C27574b f9145b;

    /* renamed from: c */
    public boolean f9146c;

    /* renamed from: d */
    public boolean f9147d;

    /* renamed from: e */
    public boolean f9148e;

    /* renamed from: f */
    public int f9149f;

    /* renamed from: g */
    public int f9150g;

    /* renamed from: h */
    public int f9151h;

    /* renamed from: i */
    public int f9152i;

    /* renamed from: j */
    public Drawable f9153j;

    /* renamed from: k */
    public Drawable f9154k;

    /* renamed from: l */
    public Object f9155l;

    public FI4(C42732iT3 c42732iT3, Uri uri, int i) {
        this.f9148e = true;
        if (!c42732iT3.f87371n) {
            this.f9144a = c42732iT3;
            this.f9145b = new C47378qI4.C27574b(uri, i, c42732iT3.f87368k);
            return;
        }
        throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
    }

    /* renamed from: a */
    public FI4 m107346a() {
        this.f9145b.m17642b(17);
        return this;
    }

    /* renamed from: b */
    public FI4 m107345b() {
        this.f9155l = null;
        return this;
    }

    /* renamed from: c */
    public final C47378qI4 m107344c(long j) {
        int andIncrement = f9143m.getAndIncrement();
        C47378qI4 m17643a = this.f9145b.m17643a();
        m17643a.f105056a = andIncrement;
        m17643a.f105057b = j;
        boolean z = this.f9144a.f87370m;
        if (z) {
            C32861Fi6.m106692t("Main", AnalyticsRequestV2.PARAM_CREATED, m17643a.m17644g(), m17643a.toString());
        }
        C47378qI4 m33873p = this.f9144a.m33873p(m17643a);
        if (m33873p != m17643a) {
            m33873p.f105056a = andIncrement;
            m33873p.f105057b = j;
            if (z) {
                String m17647d = m33873p.m17647d();
                C32861Fi6.m106692t("Main", "changed", m17647d, "into " + m33873p);
            }
        }
        return m33873p;
    }

    /* renamed from: d */
    public FI4 m107343d() {
        this.f9147d = true;
        return this;
    }

    /* renamed from: e */
    public final Drawable m107342e() {
        int i = this.f9149f;
        if (i != 0) {
            return this.f9144a.f87361d.getDrawable(i);
        }
        return this.f9153j;
    }

    /* renamed from: f */
    public void m107341f(MY5 my5) {
        Bitmap m33876m;
        long nanoTime = System.nanoTime();
        C32861Fi6.m106709c();
        if (my5 != null) {
            if (!this.f9147d) {
                Drawable drawable = null;
                if (!this.f9145b.m17641c()) {
                    this.f9144a.m33887b(my5);
                    if (this.f9148e) {
                        drawable = m107342e();
                    }
                    my5.onPrepareLoad(drawable);
                    return;
                }
                C47378qI4 m107344c = m107344c(nanoTime);
                String m106706f = C32861Fi6.m106706f(m107344c);
                if (TP2.m83671a(this.f9151h) && (m33876m = this.f9144a.m33876m(m106706f)) != null) {
                    this.f9144a.m33887b(my5);
                    my5.onBitmapLoaded(m33876m, C42732iT3.EnumC23266e.MEMORY);
                    return;
                }
                if (this.f9148e) {
                    drawable = m107342e();
                }
                my5.onPrepareLoad(drawable);
                this.f9144a.m33882g(new OY5(this.f9144a, my5, m107344c, this.f9151h, this.f9152i, this.f9154k, m106706f, this.f9155l, this.f9150g));
                return;
            }
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
        throw new IllegalArgumentException("Target must not be null.");
    }

    /* renamed from: g */
    public void m107340g(ImageView imageView) {
        m107339h(imageView, null);
    }

    /* renamed from: h */
    public void m107339h(ImageView imageView, I80 i80) {
        Bitmap m33876m;
        long nanoTime = System.nanoTime();
        C32861Fi6.m106709c();
        if (imageView != null) {
            if (!this.f9145b.m17641c()) {
                this.f9144a.m33886c(imageView);
                if (this.f9148e) {
                    C43325jT3.m30580d(imageView, m107342e());
                    return;
                }
                return;
            }
            if (this.f9147d) {
                if (!this.f9145b.m17640d()) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width != 0 && height != 0) {
                        this.f9145b.m17639e(width, height);
                    } else {
                        if (this.f9148e) {
                            C43325jT3.m30580d(imageView, m107342e());
                        }
                        this.f9144a.m33884e(imageView, new ViewTreeObserver$OnPreDrawListenerC43969kZ0(this, imageView, i80));
                        return;
                    }
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            C47378qI4 m107344c = m107344c(nanoTime);
            String m106706f = C32861Fi6.m106706f(m107344c);
            if (TP2.m83671a(this.f9151h) && (m33876m = this.f9144a.m33876m(m106706f)) != null) {
                this.f9144a.m33886c(imageView);
                C42732iT3 c42732iT3 = this.f9144a;
                Context context = c42732iT3.f87361d;
                C42732iT3.EnumC23266e enumC23266e = C42732iT3.EnumC23266e.MEMORY;
                C43325jT3.m30581c(imageView, context, m33876m, enumC23266e, this.f9146c, c42732iT3.f87369l);
                if (this.f9144a.f87370m) {
                    String m17644g = m107344c.m17644g();
                    C32861Fi6.m106692t("Main", "completed", m17644g, "from " + enumC23266e);
                }
                if (i80 != null) {
                    i80.onSuccess();
                    return;
                }
                return;
            }
            if (this.f9148e) {
                C43325jT3.m30580d(imageView, m107342e());
            }
            this.f9144a.m33882g(new C51075wY1(this.f9144a, imageView, m107344c, this.f9151h, this.f9152i, this.f9150g, this.f9154k, m106706f, this.f9155l, i80, this.f9146c));
            return;
        }
        throw new IllegalArgumentException("Target must not be null.");
    }

    /* renamed from: i */
    public FI4 m107338i() {
        this.f9146c = true;
        return this;
    }

    /* renamed from: j */
    public FI4 m107337j() {
        if (this.f9149f == 0) {
            if (this.f9153j == null) {
                this.f9148e = false;
                return this;
            }
            throw new IllegalStateException("Placeholder image already set.");
        }
        throw new IllegalStateException("Placeholder resource already set.");
    }

    /* renamed from: k */
    public FI4 m107336k(int i, int i2) {
        this.f9145b.m17639e(i, i2);
        return this;
    }

    /* renamed from: l */
    public FI4 m107335l(InterfaceC47298q96 interfaceC47298q96) {
        this.f9145b.m17638f(interfaceC47298q96);
        return this;
    }

    /* renamed from: m */
    public FI4 m107334m() {
        this.f9147d = false;
        return this;
    }

    public FI4() {
        this.f9148e = true;
        this.f9144a = null;
        this.f9145b = new C47378qI4.C27574b(null, 0, null);
    }
}
