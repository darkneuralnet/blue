package p000;

import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import p000.Q94;
/* renamed from: Q94 */
/* loaded from: classes6.dex */
public class Q94 {

    /* renamed from: a */
    public final Map<Class<?>, InterfaceC34919Od3<?>> f29893a;

    /* renamed from: b */
    public final Map<Class<?>, InterfaceC33338Hj6<?>> f29894b;

    /* renamed from: c */
    public final InterfaceC34919Od3<Object> f29895c;

    /* renamed from: Q94$a */
    /* loaded from: classes6.dex */
    public static final class C6688a implements InterfaceC49325tb1<C6688a> {

        /* renamed from: d */
        public static final InterfaceC34919Od3<Object> f29896d = new InterfaceC34919Od3() { // from class: P94
            @Override // p000.InterfaceC45768nb1
            public final void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) {
                Q94.C6688a.m88858e(obj, interfaceC35153Pd3);
            }
        };

        /* renamed from: a */
        public final Map<Class<?>, InterfaceC34919Od3<?>> f29897a = new HashMap();

        /* renamed from: b */
        public final Map<Class<?>, InterfaceC33338Hj6<?>> f29898b = new HashMap();

        /* renamed from: c */
        public InterfaceC34919Od3<Object> f29899c = f29896d;

        /* renamed from: e */
        public static /* synthetic */ void m88858e(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        /* renamed from: c */
        public Q94 m88860c() {
            return new Q94(new HashMap(this.f29897a), new HashMap(this.f29898b), this.f29899c);
        }

        /* renamed from: d */
        public C6688a m88859d(InterfaceC32990Fx0 interfaceC32990Fx0) {
            interfaceC32990Fx0.configure(this);
            return this;
        }

        @Override // p000.InterfaceC49325tb1
        /* renamed from: f */
        public <U> C6688a mo12026a(Class<U> cls, InterfaceC34919Od3<? super U> interfaceC34919Od3) {
            this.f29897a.put(cls, interfaceC34919Od3);
            this.f29898b.remove(cls);
            return this;
        }
    }

    public Q94(Map<Class<?>, InterfaceC34919Od3<?>> map, Map<Class<?>, InterfaceC33338Hj6<?>> map2, InterfaceC34919Od3<Object> interfaceC34919Od3) {
        this.f29893a = map;
        this.f29894b = map2;
        this.f29895c = interfaceC34919Od3;
    }

    /* renamed from: a */
    public static C6688a m88864a() {
        return new C6688a();
    }

    /* renamed from: b */
    public void m88863b(Object obj, OutputStream outputStream) throws IOException {
        new O94(outputStream, this.f29893a, this.f29894b, this.f29895c).m92694s(obj);
    }

    /* renamed from: c */
    public byte[] m88862c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m88863b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
