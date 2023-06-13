package p000;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
import java.util.Map;
@KeepForSdk
/* renamed from: Kn2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34072Kn2<K, V> {

    /* renamed from: a */
    public final Map f20222a = new HashMap();

    @KeepForSdk
    /* renamed from: a */
    public abstract V mo11764a(K k);

    @KeepForSdk
    /* renamed from: b */
    public V m98291b(K k) {
        synchronized (this.f20222a) {
            if (this.f20222a.containsKey(k)) {
                return (V) this.f20222a.get(k);
            }
            V mo11764a = mo11764a(k);
            this.f20222a.put(k, mo11764a);
            return mo11764a;
        }
    }
}
