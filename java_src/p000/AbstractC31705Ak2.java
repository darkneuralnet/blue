package p000;

import java.security.GeneralSecurityException;
import p000.InterfaceC38226at5;
/* renamed from: Ak2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31705Ak2<SerializationT extends InterfaceC38226at5> {

    /* renamed from: a */
    public final Q70 f1004a;

    /* renamed from: b */
    public final Class<SerializationT> f1005b;

    /* renamed from: Ak2$a */
    /* loaded from: classes6.dex */
    public class C0199a extends AbstractC31705Ak2<SerializationT> {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC0200b f1006c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0199a(Q70 q70, Class cls, InterfaceC0200b interfaceC0200b) {
            super(q70, cls, null);
            this.f1006c = interfaceC0200b;
        }

        @Override // p000.AbstractC31705Ak2
        /* renamed from: d */
        public AbstractC38726bk2 mo115324d(SerializationT serializationt, C34570Mq5 c34570Mq5) throws GeneralSecurityException {
            return this.f1006c.mo114336a(serializationt, c34570Mq5);
        }
    }

    /* renamed from: Ak2$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC0200b<SerializationT extends InterfaceC38226at5> {
        /* renamed from: a */
        AbstractC38726bk2 mo114336a(SerializationT serializationt, C34570Mq5 c34570Mq5) throws GeneralSecurityException;
    }

    public /* synthetic */ AbstractC31705Ak2(Q70 q70, Class cls, C0199a c0199a) {
        this(q70, cls);
    }

    /* renamed from: a */
    public static <SerializationT extends InterfaceC38226at5> AbstractC31705Ak2<SerializationT> m115327a(InterfaceC0200b<SerializationT> interfaceC0200b, Q70 q70, Class<SerializationT> cls) {
        return new C0199a(q70, cls, interfaceC0200b);
    }

    /* renamed from: b */
    public final Q70 m115326b() {
        return this.f1004a;
    }

    /* renamed from: c */
    public final Class<SerializationT> m115325c() {
        return this.f1005b;
    }

    /* renamed from: d */
    public abstract AbstractC38726bk2 mo115324d(SerializationT serializationt, C34570Mq5 c34570Mq5) throws GeneralSecurityException;

    public AbstractC31705Ak2(Q70 q70, Class<SerializationT> cls) {
        this.f1004a = q70;
        this.f1005b = cls;
    }
}
