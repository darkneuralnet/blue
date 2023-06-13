package p000;

import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\t\u001a\u00020\b2\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003R0\u0010\r\u001a\u001e\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u0010"}, m28432d2 = {"LWA1;", "", "", "Lcom/facebook/internal/gatekeeper/AppID;", "appId", "", "LVA1;", "gateKeeperList", "", "b", C17296a.f69688o, "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "gateKeepers", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: WA1 */
/* loaded from: classes5.dex */
public final class WA1 {

    /* renamed from: a */
    public final ConcurrentHashMap<String, ConcurrentHashMap<String, VA1>> f40508a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public final List<VA1> m78774a(String appId) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        ConcurrentHashMap<String, VA1> concurrentHashMap = this.f40508a.get(appId);
        if (concurrentHashMap != null) {
            ArrayList arrayList = new ArrayList(concurrentHashMap.size());
            for (Map.Entry<String, VA1> entry : concurrentHashMap.entrySet()) {
                arrayList.add(entry.getValue());
            }
            return arrayList;
        }
        return null;
    }

    /* renamed from: b */
    public final void m78773b(String appId, List<VA1> gateKeeperList) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(gateKeeperList, "gateKeeperList");
        ConcurrentHashMap<String, VA1> concurrentHashMap = new ConcurrentHashMap<>();
        for (VA1 va1 : gateKeeperList) {
            concurrentHashMap.put(va1.m80266a(), va1);
        }
        this.f40508a.put(appId, concurrentHashMap);
    }
}
