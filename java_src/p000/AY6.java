package p000;

import android.annotation.SuppressLint;
import java.util.HashMap;
import java.util.Map;
/* renamed from: AY6 */
/* loaded from: classes6.dex */
public final class AY6 {

    /* renamed from: a */
    public final int f781a;

    /* renamed from: b */
    public final Map f782b = new HashMap();

    @SuppressLint({"UseSparseArrays"})
    public AY6(int i) {
        this.f781a = i;
    }

    /* renamed from: a */
    public final synchronized void m115556a(long j) {
        this.f782b.remove(Long.valueOf(j));
    }

    /* renamed from: b */
    public final synchronized boolean m115555b(Object obj, long j) {
        if (this.f782b.size() == this.f781a) {
            C38297b07 c38297b07 = C38297b07.f56786b;
            c38297b07.m65126c(this, "Buffer is full. Drop frame " + j, new Object[0]);
            return false;
        }
        this.f782b.put(Long.valueOf(j), obj);
        return true;
    }
}
