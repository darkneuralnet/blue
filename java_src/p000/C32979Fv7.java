package p000;

import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* renamed from: Fv7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32979Fv7 {

    /* renamed from: c */
    public static final C32979Fv7 f10518c = new C32979Fv7();

    /* renamed from: b */
    public final ConcurrentMap f10520b = new ConcurrentHashMap();

    /* renamed from: a */
    public final InterfaceC35085Ov7 f10519a = new C36948Wu7();

    private C32979Fv7() {
    }

    /* renamed from: a */
    public static C32979Fv7 m106247a() {
        return f10518c;
    }

    /* renamed from: b */
    public final InterfaceC34851Nv7 m106246b(Class cls) {
        C46557ou7.m20292f(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
        InterfaceC34851Nv7 interfaceC34851Nv7 = (InterfaceC34851Nv7) this.f10520b.get(cls);
        if (interfaceC34851Nv7 == null) {
            interfaceC34851Nv7 = this.f10519a.zza(cls);
            C46557ou7.m20292f(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
            C46557ou7.m20292f(interfaceC34851Nv7, "schema");
            InterfaceC34851Nv7 interfaceC34851Nv72 = (InterfaceC34851Nv7) this.f10520b.putIfAbsent(cls, interfaceC34851Nv7);
            if (interfaceC34851Nv72 != null) {
                return interfaceC34851Nv72;
            }
        }
        return interfaceC34851Nv7;
    }
}
