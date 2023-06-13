package p000;

import p000.AbstractC38726bk2;
import p000.InterfaceC38226at5;
/* renamed from: Gk2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33109Gk2<KeyT extends AbstractC38726bk2, SerializationT extends InterfaceC38226at5> {

    /* renamed from: a */
    public final Class<KeyT> f12350a;

    /* renamed from: b */
    public final Class<SerializationT> f12351b;

    /* renamed from: Gk2$a */
    /* loaded from: classes6.dex */
    public class C2930a extends AbstractC33109Gk2<KeyT, SerializationT> {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC2931b f12352c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2930a(Class cls, Class cls2, InterfaceC2931b interfaceC2931b) {
            super(cls, cls2, null);
            this.f12352c = interfaceC2931b;
        }
    }

    /* renamed from: Gk2$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC2931b<KeyT extends AbstractC38726bk2, SerializationT extends InterfaceC38226at5> {
    }

    public /* synthetic */ AbstractC33109Gk2(Class cls, Class cls2, C2930a c2930a) {
        this(cls, cls2);
    }

    /* renamed from: a */
    public static <KeyT extends AbstractC38726bk2, SerializationT extends InterfaceC38226at5> AbstractC33109Gk2<KeyT, SerializationT> m104817a(InterfaceC2931b<KeyT, SerializationT> interfaceC2931b, Class<KeyT> cls, Class<SerializationT> cls2) {
        return new C2930a(cls, cls2, interfaceC2931b);
    }

    /* renamed from: b */
    public Class<KeyT> m104816b() {
        return this.f12350a;
    }

    /* renamed from: c */
    public Class<SerializationT> m104815c() {
        return this.f12351b;
    }

    public AbstractC33109Gk2(Class<KeyT> cls, Class<SerializationT> cls2) {
        this.f12350a = cls;
        this.f12351b = cls2;
    }
}
