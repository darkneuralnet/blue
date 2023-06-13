package p000;

import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* renamed from: eT8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40365eT8 {

    /* renamed from: c */
    public static final C40365eT8 f78425c = new C40365eT8();

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, InterfaceC52825zU8<?>> f78427b = new ConcurrentHashMap();

    /* renamed from: a */
    public final InterfaceC40976fV8 f78426a = new C41506gO8();

    private C40365eT8() {
    }

    /* renamed from: a */
    public static C40365eT8 m42854a() {
        return f78425c;
    }

    /* renamed from: b */
    public final <T> InterfaceC52825zU8<T> m42853b(Class<T> cls) {
        C52124yI8.m3689f(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
        InterfaceC52825zU8<T> interfaceC52825zU8 = (InterfaceC52825zU8<T>) this.f78427b.get(cls);
        if (interfaceC52825zU8 == null) {
            InterfaceC52825zU8<T> zza = this.f78426a.zza(cls);
            C52124yI8.m3689f(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
            C52124yI8.m3689f(zza, "schema");
            InterfaceC52825zU8<T> interfaceC52825zU82 = (InterfaceC52825zU8<T>) this.f78427b.putIfAbsent(cls, zza);
            if (interfaceC52825zU82 != null) {
                return interfaceC52825zU82;
            }
            return zza;
        }
        return interfaceC52825zU8;
    }

    /* renamed from: c */
    public final <T> InterfaceC52825zU8<T> m42852c(T t) {
        return m42853b(t.getClass());
    }
}
