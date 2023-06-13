package p000;

import android.app.Activity;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;
import p000.C34872Ny1;
/* renamed from: Oy1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C35106Oy1 {

    /* renamed from: e */
    public static final C10776ad f27620e = C10776ad.m71007e();

    /* renamed from: a */
    public final Activity f27621a;

    /* renamed from: b */
    public final C34638My1 f27622b;

    /* renamed from: c */
    public final Map<Fragment, C34872Ny1.C5752a> f27623c;

    /* renamed from: d */
    public boolean f27624d;

    public C35106Oy1(Activity activity) {
        this(activity, new C34638My1(), new HashMap());
    }

    /* renamed from: a */
    public static boolean m91138a() {
        return true;
    }

    /* renamed from: b */
    public final C43628jy3<C34872Ny1.C5752a> m91137b() {
        if (!this.f27624d) {
            f27620e.m71011a("No recording has been started.");
            return C43628jy3.m29585a();
        }
        SparseIntArray[] m94537b = this.f27622b.m94537b();
        if (m94537b == null) {
            f27620e.m71011a("FrameMetricsAggregator.mMetrics is uninitialized.");
            return C43628jy3.m29585a();
        } else if (m94537b[0] == null) {
            f27620e.m71011a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return C43628jy3.m29585a();
        } else {
            return C43628jy3.m29581e(C34872Ny1.m93159a(m94537b));
        }
    }

    /* renamed from: c */
    public void m91136c() {
        if (this.f27624d) {
            f27620e.m71010b("FrameMetricsAggregator is already recording %s", this.f27621a.getClass().getSimpleName());
            return;
        }
        this.f27622b.m94538a(this.f27621a);
        this.f27624d = true;
    }

    /* renamed from: d */
    public void m91135d(Fragment fragment) {
        if (!this.f27624d) {
            f27620e.m71011a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
        } else if (this.f27623c.containsKey(fragment)) {
            f27620e.m71010b("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
        } else {
            C43628jy3<C34872Ny1.C5752a> m91137b = m91137b();
            if (!m91137b.m29582d()) {
                f27620e.m71010b("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
            } else {
                this.f27623c.put(fragment, m91137b.m29583c());
            }
        }
    }

    /* renamed from: e */
    public C43628jy3<C34872Ny1.C5752a> m91134e() {
        if (!this.f27624d) {
            f27620e.m71011a("Cannot stop because no recording was started");
            return C43628jy3.m29585a();
        }
        if (!this.f27623c.isEmpty()) {
            f27620e.m71011a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
            this.f27623c.clear();
        }
        C43628jy3<C34872Ny1.C5752a> m91137b = m91137b();
        try {
            this.f27622b.m94536c(this.f27621a);
        } catch (IllegalArgumentException | NullPointerException e) {
            if ((e instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                throw e;
            }
            f27620e.m71001k("View not hardware accelerated. Unable to collect FrameMetrics. %s", e.toString());
            m91137b = C43628jy3.m29585a();
        }
        this.f27622b.m94535d();
        this.f27624d = false;
        return m91137b;
    }

    /* renamed from: f */
    public C43628jy3<C34872Ny1.C5752a> m91133f(Fragment fragment) {
        if (!this.f27624d) {
            f27620e.m71011a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            return C43628jy3.m29585a();
        } else if (!this.f27623c.containsKey(fragment)) {
            f27620e.m71010b("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
            return C43628jy3.m29585a();
        } else {
            C34872Ny1.C5752a remove = this.f27623c.remove(fragment);
            C43628jy3<C34872Ny1.C5752a> m91137b = m91137b();
            if (!m91137b.m29582d()) {
                f27620e.m71010b("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
                return C43628jy3.m29585a();
            }
            return C43628jy3.m29581e(m91137b.m29583c().m93158a(remove));
        }
    }

    @VisibleForTesting
    public C35106Oy1(Activity activity, C34638My1 c34638My1, Map<Fragment, C34872Ny1.C5752a> map) {
        this.f27624d = false;
        this.f27621a = activity;
        this.f27622b = c34638My1;
        this.f27623c = map;
    }
}
