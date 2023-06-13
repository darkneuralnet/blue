package p000;

import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* renamed from: rl8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48247rl8 {

    /* renamed from: c */
    public static final C48247rl8 f107575c = new C48247rl8();

    /* renamed from: b */
    public final ConcurrentMap f107577b = new ConcurrentHashMap();

    /* renamed from: a */
    public final InterfaceC35257Po8 f107576a = new C36121Tg8();

    private C48247rl8() {
    }

    /* renamed from: a */
    public static C48247rl8 m15451a() {
        return f107575c;
    }

    /* renamed from: b */
    public final InterfaceC32449Do8 m15450b(Class cls) {
        C32791Fa8.m106926c(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
        InterfaceC32449Do8 interfaceC32449Do8 = (InterfaceC32449Do8) this.f107577b.get(cls);
        if (interfaceC32449Do8 == null) {
            interfaceC32449Do8 = this.f107576a.zza(cls);
            C32791Fa8.m106926c(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
            C32791Fa8.m106926c(interfaceC32449Do8, "schema");
            InterfaceC32449Do8 interfaceC32449Do82 = (InterfaceC32449Do8) this.f107577b.putIfAbsent(cls, interfaceC32449Do8);
            if (interfaceC32449Do82 != null) {
                return interfaceC32449Do82;
            }
        }
        return interfaceC32449Do8;
    }
}
