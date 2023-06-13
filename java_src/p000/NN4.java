package p000;

import com.amazonaws.services.p026s3.internal.Constants;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
/* renamed from: NN4 */
/* loaded from: classes7.dex */
public class NN4 implements InterfaceC48782sg1 {

    /* renamed from: a */
    public Throwable f24496a;

    /* renamed from: b */
    public HM4 f24497b;

    public NN4(Throwable th) {
        this.f24496a = th;
    }

    /* renamed from: g */
    public static NN4 m93985g(HM4 hm4) {
        return new NN4(hm4);
    }

    /* renamed from: h */
    public static NN4 m93984h(Throwable th) {
        return new NN4(th);
    }

    @Override // p000.InterfaceC48782sg1
    /* renamed from: a */
    public String mo9893a() {
        HM4 hm4 = this.f24497b;
        if (hm4 != null && hm4.m103937h().request() != null && this.f24497b.m103937h().request().url() != null) {
            return this.f24497b.m103937h().request().url().toString();
        }
        return "";
    }

    @Override // p000.InterfaceC48782sg1
    /* renamed from: b */
    public String mo9892b() {
        HM4 hm4 = this.f24497b;
        if (hm4 != null && hm4.m103940e() != null) {
            return this.f24497b.m103940e().contentType().toString();
        }
        return "";
    }

    @Override // p000.InterfaceC48782sg1
    /* renamed from: c */
    public String mo9891c() {
        Throwable th = this.f24496a;
        if (th != null) {
            return th.getMessage();
        }
        StringBuilder sb = new StringBuilder();
        HM4 hm4 = this.f24497b;
        if (hm4 != null) {
            if (C44504lS5.m27273b(hm4.m103938g())) {
                sb.append(this.f24497b.m103938g());
            } else {
                sb.append(this.f24497b.m103943b());
            }
        }
        return sb.toString();
    }

    @Override // p000.InterfaceC48782sg1
    /* renamed from: d */
    public boolean mo9890d() {
        HM4 hm4;
        return (this.f24496a != null || (hm4 = this.f24497b) == null || hm4.m103939f()) ? false : true;
    }

    @Override // p000.InterfaceC48782sg1
    /* renamed from: e */
    public String mo9889e() {
        HM4 hm4 = this.f24497b;
        if (hm4 != null && hm4.m103940e() != null) {
            try {
                return new String(this.f24497b.m103940e().bytes(), Constants.DEFAULT_ENCODING);
            } catch (UnsupportedEncodingException unused) {
                throw new AssertionError("UTF-8 must be supported");
            } catch (IOException unused2) {
            }
        }
        return "";
    }

    @Override // p000.InterfaceC48782sg1
    /* renamed from: f */
    public boolean mo9888f() {
        Throwable th = this.f24496a;
        return th != null && (th instanceof IOException);
    }

    @Override // p000.InterfaceC48782sg1
    public int getStatus() {
        HM4 hm4 = this.f24497b;
        if (hm4 != null) {
            return hm4.m103943b();
        }
        return -1;
    }

    public NN4(HM4 hm4) {
        this.f24497b = hm4;
    }
}
