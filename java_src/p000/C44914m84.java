package p000;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;
@VisibleForTesting
/* renamed from: m84  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C44914m84 {

    /* renamed from: a */
    public Map<String, String> f97401a = new HashMap();

    /* renamed from: a */
    public final Map<String, String> m26293a(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : this.f97401a.entrySet()) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf(entry.getKey());
            if (valueOf2.length() != 0) {
                str2 = valueOf.concat(valueOf2);
            } else {
                str2 = new String(valueOf);
            }
            hashMap.put(str2, entry.getValue());
        }
        return hashMap;
    }

    public String toString() {
        return AbstractC47966rH8.zzb(this.f97401a);
    }
}
