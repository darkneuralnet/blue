package p000;

import android.content.Context;
import android.util.Pair;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import zendesk.core.Constants;
/* renamed from: F73 */
/* loaded from: classes2.dex */
public class F73 {

    /* renamed from: a */
    public final C52017y73 f8766a;

    /* renamed from: b */
    public final YD2 f8767b;

    public F73(C52017y73 c52017y73, YD2 yd2) {
        this.f8766a = c52017y73;
        this.f8767b = yd2;
    }

    /* renamed from: a */
    public final C47924rD2 m107735a(Context context, String str, String str2) {
        C52017y73 c52017y73;
        Pair<EnumC44089kl1, InputStream> m4118a;
        C38428bE2<C47924rD2> m115972o;
        if (str2 == null || (c52017y73 = this.f8766a) == null || (m4118a = c52017y73.m4118a(str)) == null) {
            return null;
        }
        EnumC44089kl1 enumC44089kl1 = (EnumC44089kl1) m4118a.first;
        InputStream inputStream = (InputStream) m4118a.second;
        if (enumC44089kl1 == EnumC44089kl1.ZIP) {
            m115972o = AD2.m115962y(context, new ZipInputStream(inputStream), str2);
        } else {
            m115972o = AD2.m115972o(inputStream, str2);
        }
        if (m115972o.m64804b() != null) {
            return m115972o.m64804b();
        }
        return null;
    }

    /* renamed from: b */
    public final C38428bE2<C47924rD2> m107734b(Context context, String str, String str2) {
        boolean z;
        C32524Dx2.m109588a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                SD2 mo74934a = this.f8767b.mo74934a(str);
                if (mo74934a.isSuccessful()) {
                    C38428bE2<C47924rD2> m107732d = m107732d(context, str, mo74934a.mo76910f2(), mo74934a.mo76912Z1(), str2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Completed fetch from network. Success: ");
                    if (m107732d.m64804b() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sb.append(z);
                    C32524Dx2.m109588a(sb.toString());
                    try {
                        mo74934a.close();
                    } catch (IOException e) {
                        C32524Dx2.m109585d("LottieFetchResult close failed ", e);
                    }
                    return m107732d;
                }
                C38428bE2<C47924rD2> c38428bE2 = new C38428bE2<>(new IllegalArgumentException(mo74934a.mo76909j()));
                try {
                    mo74934a.close();
                } catch (IOException e2) {
                    C32524Dx2.m109585d("LottieFetchResult close failed ", e2);
                }
                return c38428bE2;
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e3) {
                        C32524Dx2.m109585d("LottieFetchResult close failed ", e3);
                    }
                }
                throw th;
            }
        } catch (Exception e4) {
            C38428bE2<C47924rD2> c38428bE22 = new C38428bE2<>(e4);
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e5) {
                    C32524Dx2.m109585d("LottieFetchResult close failed ", e5);
                }
            }
            return c38428bE22;
        }
    }

    /* renamed from: c */
    public C38428bE2<C47924rD2> m107733c(Context context, String str, String str2) {
        C47924rD2 m107735a = m107735a(context, str, str2);
        if (m107735a != null) {
            return new C38428bE2<>(m107735a);
        }
        C32524Dx2.m109588a("Animation for " + str + " not found in cache. Fetching from network.");
        return m107734b(context, str, str2);
    }

    /* renamed from: d */
    public final C38428bE2<C47924rD2> m107732d(Context context, String str, InputStream inputStream, String str2, String str3) throws IOException {
        C38428bE2<C47924rD2> m107730f;
        EnumC44089kl1 enumC44089kl1;
        C52017y73 c52017y73;
        if (str2 == null) {
            str2 = Constants.APPLICATION_JSON;
        }
        if (!str2.contains("application/zip") && !str2.contains("application/x-zip") && !str2.contains("application/x-zip-compressed") && !str.split("\\?")[0].endsWith(".lottie")) {
            C32524Dx2.m109588a("Received json response.");
            enumC44089kl1 = EnumC44089kl1.JSON;
            m107730f = m107731e(str, inputStream, str3);
        } else {
            C32524Dx2.m109588a("Handling zip response.");
            EnumC44089kl1 enumC44089kl12 = EnumC44089kl1.ZIP;
            m107730f = m107730f(context, str, inputStream, str3);
            enumC44089kl1 = enumC44089kl12;
        }
        if (str3 != null && m107730f.m64804b() != null && (c52017y73 = this.f8766a) != null) {
            c52017y73.m4114e(str, enumC44089kl1);
        }
        return m107730f;
    }

    /* renamed from: e */
    public final C38428bE2<C47924rD2> m107731e(String str, InputStream inputStream, String str2) throws IOException {
        C52017y73 c52017y73;
        if (str2 != null && (c52017y73 = this.f8766a) != null) {
            return AD2.m115972o(new FileInputStream(c52017y73.m4113f(str, inputStream, EnumC44089kl1.JSON).getAbsolutePath()), str);
        }
        return AD2.m115972o(inputStream, null);
    }

    /* renamed from: f */
    public final C38428bE2<C47924rD2> m107730f(Context context, String str, InputStream inputStream, String str2) throws IOException {
        C52017y73 c52017y73;
        if (str2 != null && (c52017y73 = this.f8766a) != null) {
            return AD2.m115962y(context, new ZipInputStream(new FileInputStream(c52017y73.m4113f(str, inputStream, EnumC44089kl1.ZIP))), str);
        }
        return AD2.m115962y(context, new ZipInputStream(inputStream), null);
    }
}
