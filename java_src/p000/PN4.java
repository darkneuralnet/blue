package p000;

import ch.qos.logback.core.CoreConstants;
import p000.InterfaceC37319Yk0;
/* renamed from: PN4 */
/* loaded from: classes6.dex */
public class PN4 {

    /* renamed from: b */
    public long f28370b = 0;

    /* renamed from: c */
    public long f28371c = -1;

    /* renamed from: a */
    public final InterfaceC37319Yk0 f28369a = new InterfaceC37319Yk0.C9955a();

    /* renamed from: b */
    public static int m90357b(int i) {
        return (i == 400 || i == 403 || i == 404) ? 1 : 0;
    }

    /* renamed from: a */
    public boolean m90358a() {
        return this.f28371c <= this.f28369a.currentTimeMillis();
    }

    /* renamed from: c */
    public void m90356c() {
        this.f28370b = 0L;
        this.f28371c = -1L;
    }

    /* renamed from: d */
    public void m90355d(int i) {
        this.f28370b++;
        if (m90357b(i) == 1) {
            this.f28371c = this.f28369a.currentTimeMillis() + CoreConstants.MILLIS_IN_ONE_DAY;
            return;
        }
        this.f28371c = this.f28369a.currentTimeMillis() + Math.min((long) (Math.pow(2.0d, this.f28370b * ((Math.random() * 0.5d) + 1.0d)) * 1000.0d), 14400000L);
    }
}
