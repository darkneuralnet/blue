package p000;

import android.net.NetworkInfo;
import java.io.IOException;
import okhttp3.CacheControl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p000.C42732iT3;
import p000.PI4;
/* renamed from: K73 */
/* loaded from: classes6.dex */
public class K73 extends PI4 {

    /* renamed from: a */
    public final InterfaceC38351b61 f19109a;

    /* renamed from: b */
    public final C44486lQ5 f19110b;

    /* renamed from: K73$a */
    /* loaded from: classes6.dex */
    public static class C4346a extends IOException {
        public C4346a(String str) {
            super(str);
        }
    }

    /* renamed from: K73$b */
    /* loaded from: classes6.dex */
    public static final class C4347b extends IOException {

        /* renamed from: b */
        public final int f19111b;

        /* renamed from: c */
        public final int f19112c;

        public C4347b(int i, int i2) {
            super("HTTP " + i);
            this.f19111b = i;
            this.f19112c = i2;
        }
    }

    public K73(InterfaceC38351b61 interfaceC38351b61, C44486lQ5 c44486lQ5) {
        this.f19109a = interfaceC38351b61;
        this.f19110b = c44486lQ5;
    }

    /* renamed from: j */
    public static Request m99210j(C47378qI4 c47378qI4, int i) {
        CacheControl cacheControl;
        if (i != 0) {
            if (J73.m101118a(i)) {
                cacheControl = CacheControl.FORCE_CACHE;
            } else {
                CacheControl.Builder builder = new CacheControl.Builder();
                if (!J73.m101117b(i)) {
                    builder.noCache();
                }
                if (!J73.m101116c(i)) {
                    builder.noStore();
                }
                cacheControl = builder.build();
            }
        } else {
            cacheControl = null;
        }
        Request.Builder url = new Request.Builder().url(c47378qI4.f105059d.toString());
        if (cacheControl != null) {
            url.cacheControl(cacheControl);
        }
        return url.build();
    }

    @Override // p000.PI4
    /* renamed from: c */
    public boolean mo11130c(C47378qI4 c47378qI4) {
        String scheme = c47378qI4.f105059d.getScheme();
        if (!"http".equals(scheme) && !"https".equals(scheme)) {
            return false;
        }
        return true;
    }

    @Override // p000.PI4
    /* renamed from: e */
    public int mo90495e() {
        return 2;
    }

    @Override // p000.PI4
    /* renamed from: f */
    public PI4.C6313a mo11129f(C47378qI4 c47378qI4, int i) throws IOException {
        C42732iT3.EnumC23266e enumC23266e;
        Response mo64973a = this.f19109a.mo64973a(m99210j(c47378qI4, i));
        ResponseBody body = mo64973a.body();
        if (mo64973a.isSuccessful()) {
            if (mo64973a.cacheResponse() == null) {
                enumC23266e = C42732iT3.EnumC23266e.NETWORK;
            } else {
                enumC23266e = C42732iT3.EnumC23266e.DISK;
            }
            if (enumC23266e == C42732iT3.EnumC23266e.DISK && body.contentLength() == 0) {
                body.close();
                throw new C4346a("Received response with 0 content-length header.");
            }
            if (enumC23266e == C42732iT3.EnumC23266e.NETWORK && body.contentLength() > 0) {
                this.f19110b.m27306f(body.contentLength());
            }
            return new PI4.C6313a(body.source(), enumC23266e);
        }
        body.close();
        throw new C4347b(mo64973a.code(), c47378qI4.f105058c);
    }

    @Override // p000.PI4
    /* renamed from: h */
    public boolean mo90493h(boolean z, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    @Override // p000.PI4
    /* renamed from: i */
    public boolean mo90492i() {
        return true;
    }
}
