package p000;

import com.google.crypto.tink.internal.TinkBugException;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
import p000.C40022dt5;
/* renamed from: AX2 */
/* loaded from: classes6.dex */
public final class AX2 {

    /* renamed from: b */
    public static final AX2 f683b = new AX2();

    /* renamed from: a */
    public final AtomicReference<C40022dt5> f684a = new AtomicReference<>(new C40022dt5.C19884b().m43539e());

    /* renamed from: a */
    public static AX2 m115675a() {
        return f683b;
    }

    /* renamed from: b */
    public <SerializationT extends InterfaceC38226at5> AbstractC38726bk2 m115674b(SerializationT serializationt, C34570Mq5 c34570Mq5) throws GeneralSecurityException {
        return this.f684a.get().m43544e(serializationt, c34570Mq5);
    }

    /* renamed from: c */
    public AbstractC38726bk2 m115673c(G94 g94, C34570Mq5 c34570Mq5) {
        if (c34570Mq5 != null) {
            try {
                try {
                    return m115674b(g94, c34570Mq5);
                } catch (GeneralSecurityException e) {
                    throw new TinkBugException("Creating a LegacyProtoKey failed", e);
                }
            } catch (GeneralSecurityException unused) {
                return new C41758gp2(g94, c34570Mq5);
            }
        }
        throw new NullPointerException("access cannot be null");
    }

    /* renamed from: d */
    public synchronized <SerializationT extends InterfaceC38226at5> void m115672d(AbstractC31705Ak2<SerializationT> abstractC31705Ak2) throws GeneralSecurityException {
        this.f684a.set(new C40022dt5.C19884b(this.f684a.get()).m43538f(abstractC31705Ak2).m43539e());
    }

    /* renamed from: e */
    public synchronized <KeyT extends AbstractC38726bk2, SerializationT extends InterfaceC38226at5> void m115671e(AbstractC33109Gk2<KeyT, SerializationT> abstractC33109Gk2) throws GeneralSecurityException {
        this.f684a.set(new C40022dt5.C19884b(this.f684a.get()).m43537g(abstractC33109Gk2).m43539e());
    }

    /* renamed from: f */
    public synchronized <SerializationT extends InterfaceC38226at5> void m115670f(KE3<SerializationT> ke3) throws GeneralSecurityException {
        this.f684a.set(new C40022dt5.C19884b(this.f684a.get()).m43536h(ke3).m43539e());
    }

    /* renamed from: g */
    public synchronized <ParametersT extends JE3, SerializationT extends InterfaceC38226at5> void m115669g(LE3<ParametersT, SerializationT> le3) throws GeneralSecurityException {
        this.f684a.set(new C40022dt5.C19884b(this.f684a.get()).m43535i(le3).m43539e());
    }
}
