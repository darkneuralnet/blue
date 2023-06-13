package p000;

import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* renamed from: R29 */
/* loaded from: classes5.dex */
public final class R29 {

    /* renamed from: c */
    public static final R29 f31422c = new R29();

    /* renamed from: b */
    public final ConcurrentMap f31424b = new ConcurrentHashMap();

    /* renamed from: a */
    public final O39 f31423a = new TZ8();

    private R29() {
    }

    /* renamed from: a */
    public static R29 m87386a() {
        return f31422c;
    }

    /* renamed from: b */
    public final F39 m87385b(Class cls) {
        XV8.m76917c(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
        F39 f39 = (F39) this.f31424b.get(cls);
        if (f39 == null) {
            f39 = this.f31423a.zza(cls);
            XV8.m76917c(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
            XV8.m76917c(f39, "schema");
            F39 f392 = (F39) this.f31424b.putIfAbsent(cls, f39);
            if (f392 != null) {
                return f392;
            }
        }
        return f39;
    }
}
