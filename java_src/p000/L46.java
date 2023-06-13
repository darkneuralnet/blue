package p000;

import ch.qos.logback.core.CoreConstants;
import io.reactivex.AbstractC23437E;
import java.util.concurrent.TimeUnit;
/* renamed from: L46 */
/* loaded from: classes6.dex */
public class L46 {

    /* renamed from: a */
    public final long f20724a;

    /* renamed from: b */
    public final TimeUnit f20725b;

    /* renamed from: c */
    public final AbstractC23437E f20726c;

    public L46(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        this.f20724a = j;
        this.f20725b = timeUnit;
        this.f20726c = abstractC23437E;
    }

    public String toString() {
        return "{value=" + this.f20724a + ", timeUnit=" + this.f20725b + CoreConstants.CURLY_RIGHT;
    }
}
