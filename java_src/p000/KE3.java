package p000;

import p000.InterfaceC38226at5;
/* renamed from: KE3 */
/* loaded from: classes6.dex */
public abstract class KE3<SerializationT extends InterfaceC38226at5> {

    /* renamed from: a */
    public final Q70 f19304a;

    /* renamed from: b */
    public final Class<SerializationT> f19305b;

    /* renamed from: KE3$a */
    /* loaded from: classes6.dex */
    public class C4382a extends KE3<SerializationT> {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC4383b f19306c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4382a(Q70 q70, Class cls, InterfaceC4383b interfaceC4383b) {
            super(q70, cls, null);
            this.f19306c = interfaceC4383b;
        }
    }

    /* renamed from: KE3$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC4383b<SerializationT extends InterfaceC38226at5> {
    }

    public /* synthetic */ KE3(Q70 q70, Class cls, C4382a c4382a) {
        this(q70, cls);
    }

    /* renamed from: a */
    public static <SerializationT extends InterfaceC38226at5> KE3<SerializationT> m99059a(InterfaceC4383b<SerializationT> interfaceC4383b, Q70 q70, Class<SerializationT> cls) {
        return new C4382a(q70, cls, interfaceC4383b);
    }

    /* renamed from: b */
    public final Q70 m99058b() {
        return this.f19304a;
    }

    /* renamed from: c */
    public final Class<SerializationT> m99057c() {
        return this.f19305b;
    }

    public KE3(Q70 q70, Class<SerializationT> cls) {
        this.f19304a = q70;
        this.f19305b = cls;
    }
}
