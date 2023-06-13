package p000;

import com.google.protobuf.C18544t;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* renamed from: L94 */
/* loaded from: classes6.dex */
public final class L94 {

    /* renamed from: c */
    public static final L94 f20813c = new L94();

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, InterfaceC33832Jm5<?>> f20815b = new ConcurrentHashMap();

    /* renamed from: a */
    public final InterfaceC34066Km5 f20814a = new SJ2();

    private L94() {
    }

    /* renamed from: a */
    public static L94 m97649a() {
        return f20813c;
    }

    /* renamed from: b */
    public InterfaceC33832Jm5<?> m97648b(Class<?> cls, InterfaceC33832Jm5<?> interfaceC33832Jm5) {
        C18544t.m45999b(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
        C18544t.m45999b(interfaceC33832Jm5, "schema");
        return this.f20815b.putIfAbsent(cls, interfaceC33832Jm5);
    }

    /* renamed from: c */
    public <T> InterfaceC33832Jm5<T> m97647c(Class<T> cls) {
        C18544t.m45999b(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
        InterfaceC33832Jm5<T> interfaceC33832Jm5 = (InterfaceC33832Jm5<T>) this.f20815b.get(cls);
        if (interfaceC33832Jm5 == null) {
            InterfaceC33832Jm5<T> mo85744a = this.f20814a.mo85744a(cls);
            InterfaceC33832Jm5<T> interfaceC33832Jm52 = (InterfaceC33832Jm5<T>) m97648b(cls, mo85744a);
            if (interfaceC33832Jm52 != null) {
                return interfaceC33832Jm52;
            }
            return mo85744a;
        }
        return interfaceC33832Jm5;
    }

    /* renamed from: d */
    public <T> InterfaceC33832Jm5<T> m97646d(T t) {
        return m97647c(t.getClass());
    }
}
