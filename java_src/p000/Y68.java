package p000;

import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* renamed from: Y68 */
/* loaded from: classes5.dex */
public final class Y68 {

    /* renamed from: c */
    public static final Y68 f44561c = new Y68();

    /* renamed from: a */
    public final N88 f44562a;

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, InterfaceC51439x88<?>> f44563b = new ConcurrentHashMap();

    private Y68() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        N88 n88 = null;
        for (int i = 0; i <= 0; i++) {
            n88 = m75691c(strArr[0]);
            if (n88 != null) {
                break;
            }
        }
        this.f44562a = n88 == null ? new FZ7() : n88;
    }

    /* renamed from: a */
    public static Y68 m75693a() {
        return f44561c;
    }

    /* renamed from: c */
    public static N88 m75691c(String str) {
        try {
            return (N88) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final <T> InterfaceC51439x88<T> m75692b(Class<T> cls) {
        C37975aT7.m71328e(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
        InterfaceC51439x88<T> interfaceC51439x88 = (InterfaceC51439x88<T>) this.f44563b.get(cls);
        if (interfaceC51439x88 == null) {
            InterfaceC51439x88<T> mo94319a = this.f44562a.mo94319a(cls);
            C37975aT7.m71328e(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
            C37975aT7.m71328e(mo94319a, "schema");
            InterfaceC51439x88<T> interfaceC51439x882 = (InterfaceC51439x88<T>) this.f44563b.putIfAbsent(cls, mo94319a);
            return interfaceC51439x882 != null ? interfaceC51439x882 : mo94319a;
        }
        return interfaceC51439x88;
    }

    /* renamed from: d */
    public final <T> InterfaceC51439x88<T> m75690d(T t) {
        return m75692b(t.getClass());
    }
}
