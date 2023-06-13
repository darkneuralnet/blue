package p000;

import p000.InterfaceC38226at5;
import p000.JE3;
/* renamed from: LE3 */
/* loaded from: classes6.dex */
public abstract class LE3<ParametersT extends JE3, SerializationT extends InterfaceC38226at5> {

    /* renamed from: a */
    public final Class<ParametersT> f20945a;

    /* renamed from: b */
    public final Class<SerializationT> f20946b;

    /* renamed from: LE3$a */
    /* loaded from: classes6.dex */
    public class C4762a extends LE3<ParametersT, SerializationT> {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC4763b f20947c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4762a(Class cls, Class cls2, InterfaceC4763b interfaceC4763b) {
            super(cls, cls2, null);
            this.f20947c = interfaceC4763b;
        }
    }

    /* renamed from: LE3$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC4763b<ParametersT extends JE3, SerializationT extends InterfaceC38226at5> {
    }

    public /* synthetic */ LE3(Class cls, Class cls2, C4762a c4762a) {
        this(cls, cls2);
    }

    /* renamed from: a */
    public static <ParametersT extends JE3, SerializationT extends InterfaceC38226at5> LE3<ParametersT, SerializationT> m97512a(InterfaceC4763b<ParametersT, SerializationT> interfaceC4763b, Class<ParametersT> cls, Class<SerializationT> cls2) {
        return new C4762a(cls, cls2, interfaceC4763b);
    }

    /* renamed from: b */
    public Class<ParametersT> m97511b() {
        return this.f20945a;
    }

    /* renamed from: c */
    public Class<SerializationT> m97510c() {
        return this.f20946b;
    }

    public LE3(Class<ParametersT> cls, Class<SerializationT> cls2) {
        this.f20945a = cls;
        this.f20946b = cls2;
    }
}
