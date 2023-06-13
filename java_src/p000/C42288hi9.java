package p000;

import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* renamed from: hi9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42288hi9 {

    /* renamed from: c */
    public static final C42288hi9 f85782c = new C42288hi9();

    /* renamed from: b */
    public final ConcurrentMap f85784b = new ConcurrentHashMap();

    /* renamed from: a */
    public final Mi9 f85783a = new C41665gf9();

    private C42288hi9() {
    }

    /* renamed from: a */
    public static C42288hi9 m36060a() {
        return f85782c;
    }

    /* renamed from: b */
    public final Ei9 m36059b(Class cls) {
        C44007kc9.m28734f(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
        Ei9 ei9 = (Ei9) this.f85784b.get(cls);
        if (ei9 == null) {
            ei9 = this.f85783a.zza(cls);
            C44007kc9.m28734f(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
            C44007kc9.m28734f(ei9, "schema");
            Ei9 ei92 = (Ei9) this.f85784b.putIfAbsent(cls, ei9);
            if (ei92 != null) {
                return ei92;
            }
        }
        return ei9;
    }
}
