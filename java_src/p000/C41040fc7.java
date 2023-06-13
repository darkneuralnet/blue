package p000;

import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* renamed from: fc7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41040fc7 {

    /* renamed from: c */
    public static final C41040fc7 f80363c = new C41040fc7();

    /* renamed from: b */
    public final ConcurrentMap f80365b = new ConcurrentHashMap();

    /* renamed from: a */
    public final InterfaceC43412jc7 f80364a = new C33969Kb7();

    private C41040fc7() {
    }

    /* renamed from: a */
    public static C41040fc7 m41106a() {
        return f80363c;
    }

    /* renamed from: b */
    public final InterfaceC42819ic7 m41105b(Class cls) {
        C46960pb7.m19079c(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
        InterfaceC42819ic7 interfaceC42819ic7 = (InterfaceC42819ic7) this.f80365b.get(cls);
        if (interfaceC42819ic7 == null) {
            interfaceC42819ic7 = this.f80364a.mo30198a(cls);
            C46960pb7.m19079c(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
            C46960pb7.m19079c(interfaceC42819ic7, "schema");
            InterfaceC42819ic7 interfaceC42819ic72 = (InterfaceC42819ic7) this.f80365b.putIfAbsent(cls, interfaceC42819ic7);
            if (interfaceC42819ic72 != null) {
                return interfaceC42819ic72;
            }
        }
        return interfaceC42819ic7;
    }
}
