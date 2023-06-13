package p000;

import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* renamed from: sW7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48692sW7 {

    /* renamed from: c */
    public static final C48692sW7 f108901c = new C48692sW7();

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, LY7<?>> f108903b = new ConcurrentHashMap();

    /* renamed from: a */
    public final InterfaceC51072wX7 f108902a = new AO7();

    private C48692sW7() {
    }

    /* renamed from: a */
    public static C48692sW7 m14115a() {
        return f108901c;
    }

    /* renamed from: b */
    public final <T> LY7<T> m14114b(Class<T> cls) {
        C44389lF7.m27615e(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
        LY7<T> ly7 = (LY7<T>) this.f108903b.get(cls);
        if (ly7 == null) {
            LY7<T> mo6684a = this.f108902a.mo6684a(cls);
            C44389lF7.m27615e(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
            C44389lF7.m27615e(mo6684a, "schema");
            LY7<T> ly72 = (LY7<T>) this.f108903b.putIfAbsent(cls, mo6684a);
            if (ly72 != null) {
                return ly72;
            }
            return mo6684a;
        }
        return ly7;
    }

    /* renamed from: c */
    public final <T> LY7<T> m14113c(T t) {
        return m14114b(t.getClass());
    }
}
