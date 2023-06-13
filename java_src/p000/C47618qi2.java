package p000;

import com.amazonaws.util.DateUtils;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
/* renamed from: qi2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47618qi2 implements InterfaceC49325tb1<C47618qi2> {

    /* renamed from: e */
    public static final InterfaceC34919Od3<Object> f105643e = new InterfaceC34919Od3() { // from class: ni2
        @Override // p000.InterfaceC45768nb1
        public final void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) {
            C47618qi2.m17218l(obj, interfaceC35153Pd3);
        }
    };

    /* renamed from: f */
    public static final InterfaceC33338Hj6<String> f105644f = new InterfaceC33338Hj6() { // from class: oi2
        @Override // p000.InterfaceC45768nb1
        public final void encode(Object obj, InterfaceC33572Ij6 interfaceC33572Ij6) {
            interfaceC33572Ij6.mo8615a((String) obj);
        }
    };

    /* renamed from: g */
    public static final InterfaceC33338Hj6<Boolean> f105645g = new InterfaceC33338Hj6() { // from class: pi2
        @Override // p000.InterfaceC45768nb1
        public final void encode(Object obj, InterfaceC33572Ij6 interfaceC33572Ij6) {
            C47618qi2.m17216n((Boolean) obj, interfaceC33572Ij6);
        }
    };

    /* renamed from: h */
    public static final C27655b f105646h = new C27655b(null);

    /* renamed from: a */
    public final Map<Class<?>, InterfaceC34919Od3<?>> f105647a = new HashMap();

    /* renamed from: b */
    public final Map<Class<?>, InterfaceC33338Hj6<?>> f105648b = new HashMap();

    /* renamed from: c */
    public InterfaceC34919Od3<Object> f105649c = f105643e;

    /* renamed from: d */
    public boolean f105650d = false;

    /* renamed from: qi2$a */
    /* loaded from: classes6.dex */
    public class C27654a implements HS0 {
        public C27654a() {
        }

        @Override // p000.HS0
        /* renamed from: a */
        public void mo17213a(Object obj, Writer writer) throws IOException {
            C31930Bj2 c31930Bj2 = new C31930Bj2(writer, C47618qi2.this.f105647a, C47618qi2.this.f105648b, C47618qi2.this.f105649c, C47618qi2.this.f105650d);
            c31930Bj2.m113641i(obj, false);
            c31930Bj2.m113632r();
        }

        @Override // p000.HS0
        public String encode(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                mo17213a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* renamed from: qi2$b */
    /* loaded from: classes6.dex */
    public static final class C27655b implements InterfaceC33338Hj6<Date> {

        /* renamed from: a */
        public static final DateFormat f105652a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateUtils.ISO8601_DATE_PATTERN, Locale.US);
            f105652a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private C27655b() {
        }

        @Override // p000.InterfaceC45768nb1
        /* renamed from: a */
        public void encode(Date date, InterfaceC33572Ij6 interfaceC33572Ij6) throws IOException {
            interfaceC33572Ij6.mo8615a(f105652a.format(date));
        }

        public /* synthetic */ C27655b(C27654a c27654a) {
            this();
        }
    }

    public C47618qi2() {
        m17214p(String.class, f105644f);
        m17214p(Boolean.class, f105645g);
        m17214p(Date.class, f105646h);
    }

    /* renamed from: l */
    public static /* synthetic */ void m17218l(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* renamed from: n */
    public static /* synthetic */ void m17216n(Boolean bool, InterfaceC33572Ij6 interfaceC33572Ij6) throws IOException {
        interfaceC33572Ij6.mo8614b(bool.booleanValue());
    }

    /* renamed from: i */
    public HS0 m17221i() {
        return new C27654a();
    }

    /* renamed from: j */
    public C47618qi2 m17220j(InterfaceC32990Fx0 interfaceC32990Fx0) {
        interfaceC32990Fx0.configure(this);
        return this;
    }

    /* renamed from: k */
    public C47618qi2 m17219k(boolean z) {
        this.f105650d = z;
        return this;
    }

    @Override // p000.InterfaceC49325tb1
    /* renamed from: o */
    public <T> C47618qi2 mo12026a(Class<T> cls, InterfaceC34919Od3<? super T> interfaceC34919Od3) {
        this.f105647a.put(cls, interfaceC34919Od3);
        this.f105648b.remove(cls);
        return this;
    }

    /* renamed from: p */
    public <T> C47618qi2 m17214p(Class<T> cls, InterfaceC33338Hj6<? super T> interfaceC33338Hj6) {
        this.f105648b.put(cls, interfaceC33338Hj6);
        this.f105647a.remove(cls);
        return this;
    }
}
