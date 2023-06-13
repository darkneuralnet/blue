package p000;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
/* renamed from: x1 */
/* loaded from: classes6.dex */
public class C30017x1 {

    /* renamed from: a */
    public final Map<String, C50620vm1> f116974a = new HashMap();

    /* renamed from: b */
    public final Context f116975b;

    /* renamed from: c */
    public final X94<InterfaceC12447ba> f116976c;

    public C30017x1(Context context, X94<InterfaceC12447ba> x94) {
        this.f116975b = context;
        this.f116976c = x94;
    }

    /* renamed from: a */
    public C50620vm1 m5983a(String str) {
        return new C50620vm1(this.f116975b, this.f116976c, str);
    }

    /* renamed from: b */
    public synchronized C50620vm1 m5982b(String str) {
        if (!this.f116974a.containsKey(str)) {
            this.f116974a.put(str, m5983a(str));
        }
        return this.f116974a.get(str);
    }
}
