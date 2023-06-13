package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.amazonaws.http.HttpHeader;
import com.amazonaws.services.p026s3.Headers;
import com.google.firebase.encoders.EncodingException;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.model.PaymentMethod;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p000.AbstractC33575Ik0;
import p000.AbstractC45989nx2;
import p000.AbstractC47768qx2;
import p000.B73;
import p000.C35177Pg0;
import zendesk.core.Constants;
/* renamed from: Pg0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35177Pg0 implements S96 {

    /* renamed from: a */
    public final HS0 f28875a;

    /* renamed from: b */
    public final ConnectivityManager f28876b;

    /* renamed from: c */
    public final Context f28877c;

    /* renamed from: d */
    public final URL f28878d;

    /* renamed from: e */
    public final InterfaceC38734bl0 f28879e;

    /* renamed from: f */
    public final InterfaceC38734bl0 f28880f;

    /* renamed from: g */
    public final int f28881g;

    /* renamed from: Pg0$a */
    /* loaded from: classes5.dex */
    public static final class C6448a {

        /* renamed from: a */
        public final URL f28882a;

        /* renamed from: b */
        public final AbstractC6301PF f28883b;

        /* renamed from: c */
        public final String f28884c;

        public C6448a(URL url, AbstractC6301PF abstractC6301PF, String str) {
            this.f28882a = url;
            this.f28883b = abstractC6301PF;
            this.f28884c = str;
        }

        /* renamed from: a */
        public C6448a m89943a(URL url) {
            return new C6448a(url, this.f28883b, this.f28884c);
        }
    }

    /* renamed from: Pg0$b */
    /* loaded from: classes5.dex */
    public static final class C6449b {

        /* renamed from: a */
        public final int f28885a;

        /* renamed from: b */
        public final URL f28886b;

        /* renamed from: c */
        public final long f28887c;

        public C6449b(int i, URL url, long j) {
            this.f28885a = i;
            this.f28886b = url;
            this.f28887c = j;
        }
    }

    public C35177Pg0(Context context, InterfaceC38734bl0 interfaceC38734bl0, InterfaceC38734bl0 interfaceC38734bl02, int i) {
        this.f28875a = AbstractC6301PF.m90548b();
        this.f28877c = context;
        this.f28876b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f28878d = m89944n(W70.f40427c);
        this.f28879e = interfaceC38734bl02;
        this.f28880f = interfaceC38734bl0;
        this.f28881g = i;
    }

    /* renamed from: f */
    public static int m89952f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return B73.EnumC0530b.UNKNOWN_MOBILE_SUBTYPE.m114343b();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return B73.EnumC0530b.COMBINED.m114343b();
        }
        if (B73.EnumC0530b.m114344a(subtype) == null) {
            return 0;
        }
        return subtype;
    }

    /* renamed from: g */
    public static int m89951g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return B73.EnumC0531c.NONE.m114341b();
        }
        return networkInfo.getType();
    }

    /* renamed from: h */
    public static int m89950h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            C35800Rx2.m86170d("CctTransportBackend", "Unable to find version code for package", e);
            return -1;
        }
    }

    /* renamed from: j */
    public static TelephonyManager m89948j(Context context) {
        return (TelephonyManager) context.getSystemService(PaymentMethod.BillingDetails.PARAM_PHONE);
    }

    /* renamed from: k */
    public static long m89947k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* renamed from: l */
    public static /* synthetic */ C6448a m89946l(C6448a c6448a, C6449b c6449b) {
        URL url = c6449b.f28886b;
        if (url != null) {
            C35800Rx2.m86172b("CctTransportBackend", "Following redirect to: %s", url);
            return c6448a.m89943a(c6449b.f28886b);
        }
        return null;
    }

    /* renamed from: m */
    public static InputStream m89945m(InputStream inputStream, String str) throws IOException {
        if ("gzip".equals(str)) {
            return new GZIPInputStream(inputStream);
        }
        return inputStream;
    }

    /* renamed from: n */
    public static URL m89944n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    @Override // p000.S96
    /* renamed from: a */
    public AbstractC9547Xv mo85875a(AbstractC9206Wv abstractC9206Wv) {
        AbstractC6301PF m89949i = m89949i(abstractC9206Wv);
        URL url = this.f28878d;
        String str = null;
        if (abstractC9206Wv.mo35674c() != null) {
            try {
                W70 m78816c = W70.m78816c(abstractC9206Wv.mo35674c());
                if (m78816c.m78815d() != null) {
                    str = m78816c.m78815d();
                }
                if (m78816c.m78814e() != null) {
                    url = m89944n(m78816c.m78814e());
                }
            } catch (IllegalArgumentException unused) {
                return AbstractC9547Xv.m76112a();
            }
        }
        try {
            C6449b c6449b = (C6449b) LN4.m96990a(5, new C6448a(url, m89949i, str), new InterfaceC50266vA1() { // from class: Ng0
                @Override // p000.InterfaceC50266vA1
                public final Object apply(Object obj) {
                    C35177Pg0.C6449b m89953e;
                    m89953e = C35177Pg0.this.m89953e((C35177Pg0.C6448a) obj);
                    return m89953e;
                }
            }, new RN4() { // from class: Og0
                @Override // p000.RN4
                /* renamed from: a */
                public final Object mo86798a(Object obj, Object obj2) {
                    C35177Pg0.C6448a m89946l;
                    m89946l = C35177Pg0.m89946l((C35177Pg0.C6448a) obj, (C35177Pg0.C6449b) obj2);
                    return m89946l;
                }
            });
            int i = c6449b.f28885a;
            if (i == 200) {
                return AbstractC9547Xv.m76110e(c6449b.f28887c);
            }
            if (i < 500 && i != 404) {
                if (i == 400) {
                    return AbstractC9547Xv.m76111d();
                }
                return AbstractC9547Xv.m76112a();
            }
            return AbstractC9547Xv.m76109f();
        } catch (IOException e) {
            C35800Rx2.m86170d("CctTransportBackend", "Could not make request to the backend", e);
            return AbstractC9547Xv.m76109f();
        }
    }

    @Override // p000.S96
    /* renamed from: b */
    public AbstractC33774Jg1 mo85874b(AbstractC33774Jg1 abstractC33774Jg1) {
        NetworkInfo activeNetworkInfo = this.f28876b.getActiveNetworkInfo();
        return abstractC33774Jg1.m100036l().m100035a("sdk-version", Build.VERSION.SDK_INT).m100033c(RequestHeadersFactory.MODEL, Build.MODEL).m100033c("hardware", Build.HARDWARE).m100033c("device", Build.DEVICE).m100033c("product", Build.PRODUCT).m100033c("os-uild", Build.ID).m100033c("manufacturer", Build.MANUFACTURER).m100033c("fingerprint", Build.FINGERPRINT).m100034b("tz-offset", m89947k()).m100035a("net-type", m89951g(activeNetworkInfo)).m100035a("mobile-subtype", m89952f(activeNetworkInfo)).m100033c("country", Locale.getDefault().getCountry()).m100033c("locale", Locale.getDefault().getLanguage()).m100033c("mcc_mnc", m89948j(this.f28877c).getSimOperator()).m100033c("application_build", Integer.toString(m89950h(this.f28877c))).mo181d();
    }

    /* renamed from: e */
    public final C6449b m89953e(C6448a c6448a) throws IOException {
        C35800Rx2.m86168f("CctTransportBackend", "Making request to: %s", c6448a.f28882a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) c6448a.f28882a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f28881g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.9"));
        httpURLConnection.setRequestProperty(Headers.CONTENT_ENCODING, "gzip");
        httpURLConnection.setRequestProperty("Content-Type", Constants.APPLICATION_JSON);
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = c6448a.f28884c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.f28875a.mo17213a(c6448a.f28883b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                C35800Rx2.m86168f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                C35800Rx2.m86172b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                C35800Rx2.m86172b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField(Headers.CONTENT_ENCODING));
                if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                    if (responseCode != 200) {
                        return new C6449b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream m89945m = m89945m(inputStream, httpURLConnection.getHeaderField(Headers.CONTENT_ENCODING));
                        C6449b c6449b = new C6449b(responseCode, null, AbstractC28071rx2.m14985b(new BufferedReader(new InputStreamReader(m89945m))).mo14984c());
                        if (m89945m != null) {
                            m89945m.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        return c6449b;
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                return new C6449b(responseCode, new URL(httpURLConnection.getHeaderField(HttpHeader.LOCATION)), 0L);
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (EncodingException e) {
            e = e;
            C35800Rx2.m86170d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C6449b(400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            C35800Rx2.m86170d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C6449b(500, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            C35800Rx2.m86170d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C6449b(500, null, 0L);
        } catch (IOException e4) {
            e = e4;
            C35800Rx2.m86170d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C6449b(400, null, 0L);
        }
    }

    /* renamed from: i */
    public final AbstractC6301PF m89949i(AbstractC9206Wv abstractC9206Wv) {
        AbstractC45989nx2.AbstractC26744a m22146j;
        HashMap hashMap = new HashMap();
        for (AbstractC33774Jg1 abstractC33774Jg1 : abstractC9206Wv.mo35675b()) {
            String mo183j = abstractC33774Jg1.mo183j();
            if (!hashMap.containsKey(mo183j)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(abstractC33774Jg1);
                hashMap.put(mo183j, arrayList);
            } else {
                ((List) hashMap.get(mo183j)).add(abstractC33774Jg1);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            AbstractC33774Jg1 abstractC33774Jg12 = (AbstractC33774Jg1) ((List) entry.getValue()).get(0);
            AbstractC47768qx2.AbstractC27743a mo16739b = AbstractC47768qx2.m16748a().mo16735f(EnumC50513vb4.DEFAULT).mo16734g(this.f28880f.mo64040a()).mo16733h(this.f28879e.mo64040a()).mo16739b(AbstractC33575Ik0.m101742a().mo13551c(AbstractC33575Ik0.EnumC3749b.ANDROID_FIREBASE).mo13552b(AbstractC13605cc.m61180a().mo44902m(Integer.valueOf(abstractC33774Jg12.m100039g("sdk-version"))).mo44905j(abstractC33774Jg12.m100040b(RequestHeadersFactory.MODEL)).mo44909f(abstractC33774Jg12.m100040b("hardware")).mo44911d(abstractC33774Jg12.m100040b("device")).mo44903l(abstractC33774Jg12.m100040b("product")).mo44904k(abstractC33774Jg12.m100040b("os-uild")).mo44907h(abstractC33774Jg12.m100040b("manufacturer")).mo44910e(abstractC33774Jg12.m100040b("fingerprint")).mo44912c(abstractC33774Jg12.m100040b("country")).mo44908g(abstractC33774Jg12.m100040b("locale")).mo44906i(abstractC33774Jg12.m100040b("mcc_mnc")).mo44913b(abstractC33774Jg12.m100040b("application_build")).mo44914a()).mo13553a());
            try {
                mo16739b.m16732i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                mo16739b.m16731j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (AbstractC33774Jg1 abstractC33774Jg13 : (List) entry.getValue()) {
                C43989kb1 mo185e = abstractC33774Jg13.mo185e();
                C35142Pc1 m28810b = mo185e.m28810b();
                if (m28810b.equals(C35142Pc1.m90060b("proto"))) {
                    m22146j = AbstractC45989nx2.m22146j(mo185e.m28811a());
                } else if (m28810b.equals(C35142Pc1.m90060b("json"))) {
                    m22146j = AbstractC45989nx2.m22147i(new String(mo185e.m28811a(), Charset.forName(com.amazonaws.services.p026s3.internal.Constants.DEFAULT_ENCODING)));
                } else {
                    C35800Rx2.m86167g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", m28810b);
                }
                m22146j.mo22143c(abstractC33774Jg13.mo184f()).mo22142d(abstractC33774Jg13.mo182k()).mo22138h(abstractC33774Jg13.m100038h("tz-offset")).mo22141e(B73.m114345a().mo87842c(B73.EnumC0531c.m114342a(abstractC33774Jg13.m100039g("net-type"))).mo87843b(B73.EnumC0530b.m114344a(abstractC33774Jg13.m100039g("mobile-subtype"))).mo87844a());
                if (abstractC33774Jg13.mo186d() != null) {
                    m22146j.mo22144b(abstractC33774Jg13.mo186d());
                }
                arrayList3.add(m22146j.mo22145a());
            }
            mo16739b.mo16738c(arrayList3);
            arrayList2.add(mo16739b.mo16740a());
        }
        return AbstractC6301PF.m90549a(arrayList2);
    }

    public C35177Pg0(Context context, InterfaceC38734bl0 interfaceC38734bl0, InterfaceC38734bl0 interfaceC38734bl02) {
        this(context, interfaceC38734bl0, interfaceC38734bl02, 130000);
    }
}
