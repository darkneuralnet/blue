package p000;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import ch.qos.logback.core.CoreConstants;
/* renamed from: ZV2 */
/* loaded from: classes6.dex */
public class ZV2 {

    /* renamed from: a */
    public long f48688a;

    /* renamed from: b */
    public long f48689b;

    /* renamed from: c */
    public TimeInterpolator f48690c;

    /* renamed from: d */
    public int f48691d;

    /* renamed from: e */
    public int f48692e;

    public ZV2(long j, long j2) {
        this.f48690c = null;
        this.f48691d = 0;
        this.f48692e = 1;
        this.f48688a = j;
        this.f48689b = j2;
    }

    /* renamed from: b */
    public static ZV2 m73010b(ValueAnimator valueAnimator) {
        ZV2 zv2 = new ZV2(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m73006f(valueAnimator));
        zv2.f48691d = valueAnimator.getRepeatCount();
        zv2.f48692e = valueAnimator.getRepeatMode();
        return zv2;
    }

    /* renamed from: f */
    public static TimeInterpolator m73006f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
            if (interpolator instanceof AccelerateInterpolator) {
                return C27325pf.f103881c;
            }
            if (interpolator instanceof DecelerateInterpolator) {
                return C27325pf.f103882d;
            }
            return interpolator;
        }
        return C27325pf.f103880b;
    }

    /* renamed from: a */
    public void m73011a(Animator animator) {
        animator.setStartDelay(m73009c());
        animator.setDuration(m73008d());
        animator.setInterpolator(m73007e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(m73005g());
            valueAnimator.setRepeatMode(m73004h());
        }
    }

    /* renamed from: c */
    public long m73009c() {
        return this.f48688a;
    }

    /* renamed from: d */
    public long m73008d() {
        return this.f48689b;
    }

    /* renamed from: e */
    public TimeInterpolator m73007e() {
        TimeInterpolator timeInterpolator = this.f48690c;
        return timeInterpolator != null ? timeInterpolator : C27325pf.f103880b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZV2)) {
            return false;
        }
        ZV2 zv2 = (ZV2) obj;
        if (m73009c() != zv2.m73009c() || m73008d() != zv2.m73008d() || m73005g() != zv2.m73005g() || m73004h() != zv2.m73004h()) {
            return false;
        }
        return m73007e().getClass().equals(zv2.m73007e().getClass());
    }

    /* renamed from: g */
    public int m73005g() {
        return this.f48691d;
    }

    /* renamed from: h */
    public int m73004h() {
        return this.f48692e;
    }

    public int hashCode() {
        return (((((((((int) (m73009c() ^ (m73009c() >>> 32))) * 31) + ((int) (m73008d() ^ (m73008d() >>> 32)))) * 31) + m73007e().getClass().hashCode()) * 31) + m73005g()) * 31) + m73004h();
    }

    public String toString() {
        return '\n' + getClass().getName() + CoreConstants.CURLY_LEFT + Integer.toHexString(System.identityHashCode(this)) + " delay: " + m73009c() + " duration: " + m73008d() + " interpolator: " + m73007e().getClass() + " repeatCount: " + m73005g() + " repeatMode: " + m73004h() + "}\n";
    }

    public ZV2(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f48691d = 0;
        this.f48692e = 1;
        this.f48688a = j;
        this.f48689b = j2;
        this.f48690c = timeInterpolator;
    }
}
