package p000;

import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* renamed from: Ml8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34528Ml8 {

    /* renamed from: c */
    public static final C34528Ml8 f23510c = new C34528Ml8();

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, InterfaceC45895nn8<?>> f23512b = new ConcurrentHashMap();

    /* renamed from: a */
    public final InterfaceC53009zn8 f23511a = new C32386Dh8();

    private C34528Ml8() {
    }

    /* renamed from: a */
    public static C34528Ml8 m94915a() {
        return f23510c;
    }

    /* renamed from: b */
    public final <T> InterfaceC45895nn8<T> m94914b(Class<T> cls) {
        C41051fd8.m41089f(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
        InterfaceC45895nn8<T> interfaceC45895nn8 = (InterfaceC45895nn8<T>) this.f23512b.get(cls);
        if (interfaceC45895nn8 == null) {
            interfaceC45895nn8 = this.f23511a.zza(cls);
            C41051fd8.m41089f(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
            C41051fd8.m41089f(interfaceC45895nn8, "schema");
            InterfaceC45895nn8 putIfAbsent = this.f23512b.putIfAbsent(cls, interfaceC45895nn8);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
        }
        return interfaceC45895nn8;
    }
}
