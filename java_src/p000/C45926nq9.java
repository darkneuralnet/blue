package p000;

import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* renamed from: nq9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45926nq9 {

    /* renamed from: c */
    public static final C45926nq9 f100899c = new C45926nq9();

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, InterfaceC38803br9<?>> f100901b = new ConcurrentHashMap();

    /* renamed from: a */
    public final InterfaceC40599er9 f100900a = new C47102pp9();

    private C45926nq9() {
    }

    /* renamed from: a */
    public static C45926nq9 m22329a() {
        return f100899c;
    }

    /* renamed from: b */
    public final <T> InterfaceC38803br9<T> m22328b(Class<T> cls) {
        Fn9.m106449f(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
        InterfaceC38803br9<T> interfaceC38803br9 = (InterfaceC38803br9<T>) this.f100901b.get(cls);
        if (interfaceC38803br9 == null) {
            interfaceC38803br9 = this.f100900a.zza(cls);
            Fn9.m106449f(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
            Fn9.m106449f(interfaceC38803br9, "schema");
            InterfaceC38803br9 putIfAbsent = this.f100901b.putIfAbsent(cls, interfaceC38803br9);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
        }
        return interfaceC38803br9;
    }
}
