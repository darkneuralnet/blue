package p000;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: PJ6 */
/* loaded from: classes6.dex */
public final class PJ6 {

    /* renamed from: a */
    public final Map<String, Object> f28260a = new HashMap();

    /* renamed from: b */
    public final AtomicBoolean f28261b = new AtomicBoolean(false);

    /* renamed from: a */
    public final synchronized boolean m90483a() {
        if (!this.f28261b.get()) {
            m90482b();
        }
        Object obj = this.f28260a.get("assetOnlyUpdates");
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    /* renamed from: b */
    public final synchronized void m90482b() {
        this.f28260a.put("assetOnlyUpdates", Boolean.FALSE);
    }
}
