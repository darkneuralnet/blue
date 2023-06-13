package p000;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import p000.IS0;
import p000.WU2;
/* renamed from: dT0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39765dT0<Model, Data> implements WU2<Model, Data> {

    /* renamed from: a */
    public final InterfaceC19772a<Data> f76701a;

    /* renamed from: dT0$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC19772a<Data> {
        /* renamed from: a */
        Class<Data> mo44239a();

        /* renamed from: b */
        void mo44238b(Data data) throws IOException;

        Data decode(String str) throws IllegalArgumentException;
    }

    /* renamed from: dT0$b */
    /* loaded from: classes5.dex */
    public static final class C19773b<Data> implements IS0<Data> {

        /* renamed from: b */
        public final String f76702b;

        /* renamed from: c */
        public final InterfaceC19772a<Data> f76703c;

        /* renamed from: d */
        public Data f76704d;

        public C19773b(String str, InterfaceC19772a<Data> interfaceC19772a) {
            this.f76702b = str;
            this.f76703c = interfaceC19772a;
        }

        @Override // p000.IS0
        /* renamed from: a */
        public Class<Data> mo6834a() {
            return this.f76703c.mo44239a();
        }

        @Override // p000.IS0
        /* renamed from: b */
        public ZS0 mo19947b() {
            return ZS0.LOCAL;
        }

        @Override // p000.IS0
        public void cancel() {
        }

        @Override // p000.IS0
        public void cleanup() {
            try {
                this.f76703c.mo44238b(this.f76704d);
            } catch (IOException unused) {
            }
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, Data] */
        @Override // p000.IS0
        /* renamed from: e */
        public void mo19946e(P24 p24, IS0.InterfaceC3534a<? super Data> interfaceC3534a) {
            try {
                Data decode = this.f76703c.decode(this.f76702b);
                this.f76704d = decode;
                interfaceC3534a.mo77098c(decode);
            } catch (IllegalArgumentException e) {
                interfaceC3534a.mo77097d(e);
            }
        }
    }

    /* renamed from: dT0$c */
    /* loaded from: classes5.dex */
    public static final class C19774c<Model> implements XU2<Model, InputStream> {

        /* renamed from: a */
        public final InterfaceC19772a<InputStream> f76705a = new C19775a();

        /* renamed from: dT0$c$a */
        /* loaded from: classes5.dex */
        public class C19775a implements InterfaceC19772a<InputStream> {
            public C19775a() {
            }

            @Override // p000.C39765dT0.InterfaceC19772a
            /* renamed from: a */
            public Class<InputStream> mo44239a() {
                return InputStream.class;
            }

            @Override // p000.C39765dT0.InterfaceC19772a
            /* renamed from: c */
            public void mo44238b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // p000.C39765dT0.InterfaceC19772a
            /* renamed from: d */
            public InputStream decode(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf != -1) {
                        if (str.substring(0, indexOf).endsWith(";base64")) {
                            return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                        }
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
        }

        @Override // p000.XU2
        /* renamed from: b */
        public WU2<Model, InputStream> mo19945b(QW2 qw2) {
            return new C39765dT0(this.f76705a);
        }
    }

    public C39765dT0(InterfaceC19772a<Data> interfaceC19772a) {
        this.f76701a = interfaceC19772a;
    }

    @Override // p000.WU2
    /* renamed from: a */
    public boolean mo19952a(Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // p000.WU2
    /* renamed from: b */
    public WU2.C9060a<Data> mo19951b(Model model, int i, int i2, C48964sy3 c48964sy3) {
        return new WU2.C9060a<>(new C35387Qd3(model), new C19773b(model.toString(), this.f76701a));
    }
}
