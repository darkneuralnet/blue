package p000;

import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.C18238v;
import com.google.crypto.tink.shaded.protobuf.InterfaceC18156L;
import com.google.crypto.tink.shaded.protobuf.InterfaceC18157M;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* renamed from: M94 */
/* loaded from: classes6.dex */
public final class M94 {

    /* renamed from: c */
    public static final M94 f22743c = new M94();

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, InterfaceC18157M<?>> f22745b = new ConcurrentHashMap();

    /* renamed from: a */
    public final InterfaceC34300Lm5 f22744a = new RJ2();

    private M94() {
    }

    /* renamed from: a */
    public static M94 m95655a() {
        return f22743c;
    }

    /* renamed from: b */
    public <T> void m95654b(T t, InterfaceC18156L interfaceC18156L, C18219m c18219m) throws IOException {
        m95651e(t).mo47986i(t, interfaceC18156L, c18219m);
    }

    /* renamed from: c */
    public InterfaceC18157M<?> m95653c(Class<?> cls, InterfaceC18157M<?> interfaceC18157M) {
        C18238v.m47422b(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
        C18238v.m47422b(interfaceC18157M, "schema");
        return this.f22745b.putIfAbsent(cls, interfaceC18157M);
    }

    /* renamed from: d */
    public <T> InterfaceC18157M<T> m95652d(Class<T> cls) {
        C18238v.m47422b(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
        InterfaceC18157M<T> interfaceC18157M = (InterfaceC18157M<T>) this.f22745b.get(cls);
        if (interfaceC18157M == null) {
            InterfaceC18157M<T> mo86970a = this.f22744a.mo86970a(cls);
            InterfaceC18157M<T> interfaceC18157M2 = (InterfaceC18157M<T>) m95653c(cls, mo86970a);
            if (interfaceC18157M2 != null) {
                return interfaceC18157M2;
            }
            return mo86970a;
        }
        return interfaceC18157M;
    }

    /* renamed from: e */
    public <T> InterfaceC18157M<T> m95651e(T t) {
        return m95652d(t.getClass());
    }
}
