package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.FacebookException;
import com.facebook.share.internal.C17296a;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000.CG6;
import p000.NX1;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u001e#\u0007\u001aB\t\b\u0002¢\u0006\u0004\b*\u0010+J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0002J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J(\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J2\u0010\u0018\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u0006H\u0002J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0002J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\t\u001a\u00020\bH\u0002R\u001e\u0010\"\u001a\u0004\u0018\u00010\u001d8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001b0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010(¨\u0006,"}, m28432d2 = {"LsX1;", "", "LNX1;", "request", "", "e", "", "c", "LsX1$d;", "key", "allowCachedRedirects", "f", "g", "LCG6;", "workQueue", "Ljava/lang/Runnable;", "workItem", "h", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "Landroid/graphics/Bitmap;", "bitmap", "isCachedRedirect", "j", "k", DateTokenConverter.CONVERTER_KEY, "LsX1$c;", "l", "Landroid/os/Handler;", C17296a.f69688o, "Landroid/os/Handler;", "i", "()Landroid/os/Handler;", "handler", "b", "LCG6;", "downloadQueue", "cacheReadQueue", "", "Ljava/util/Map;", "pendingRequests", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: sX1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48695sX1 {

    /* renamed from: a */
    public static Handler f108906a;

    /* renamed from: e */
    public static final C48695sX1 f108910e = new C48695sX1();

    /* renamed from: b */
    public static final CG6 f108907b = new CG6(8, null, 2, null);

    /* renamed from: c */
    public static final CG6 f108908c = new CG6(2, null, 2, null);

    /* renamed from: d */
    public static final Map<C28333d, C28332c> f108909d = new HashMap();

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, m28432d2 = {"LsX1$a;", "Ljava/lang/Runnable;", "", "run", "LsX1$d;", "b", "LsX1$d;", "key", "", "c", "Z", "allowCachedRedirects", "<init>", "(LsX1$d;Z)V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: sX1$a */
    /* loaded from: classes5.dex */
    public static final class RunnableC28330a implements Runnable {

        /* renamed from: b */
        public final C28333d f108911b;

        /* renamed from: c */
        public final boolean f108912c;

        public RunnableC28330a(C28333d key, boolean z) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f108911b = key;
            this.f108912c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                if (TD0.m84203d(this)) {
                    return;
                }
                C48695sX1.f108910e.m14100k(this.f108911b, this.f108912c);
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m28432d2 = {"LsX1$b;", "Ljava/lang/Runnable;", "", "run", "LsX1$d;", "b", "LsX1$d;", "key", "<init>", "(LsX1$d;)V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: sX1$b */
    /* loaded from: classes5.dex */
    public static final class RunnableC28331b implements Runnable {

        /* renamed from: b */
        public final C28333d f108913b;

        public RunnableC28331b(C28333d key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f108913b = key;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                if (TD0.m84203d(this)) {
                    return;
                }
                C48695sX1.f108910e.m14107d(this.f108913b);
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0015R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0016\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0003\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m28432d2 = {"LsX1$c;", "", "LCG6$b;", C17296a.f69688o, "LCG6$b;", "b", "()LCG6$b;", "f", "(LCG6$b;)V", "workItem", "", "Z", "c", "()Z", DateTokenConverter.CONVERTER_KEY, "(Z)V", "isCancelled", "LNX1;", "LNX1;", "()LNX1;", "e", "(LNX1;)V", "request", "<init>", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: sX1$c */
    /* loaded from: classes5.dex */
    public static final class C28332c {

        /* renamed from: a */
        public CG6.InterfaceC0976b f108914a;

        /* renamed from: b */
        public boolean f108915b;

        /* renamed from: c */
        public NX1 f108916c;

        public C28332c(NX1 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f108916c = request;
        }

        /* renamed from: a */
        public final NX1 m14098a() {
            return this.f108916c;
        }

        /* renamed from: b */
        public final CG6.InterfaceC0976b m14097b() {
            return this.f108914a;
        }

        /* renamed from: c */
        public final boolean m14096c() {
            return this.f108915b;
        }

        /* renamed from: d */
        public final void m14095d(boolean z) {
            this.f108915b = z;
        }

        /* renamed from: e */
        public final void m14094e(NX1 nx1) {
            Intrinsics.checkNotNullParameter(nx1, "<set-?>");
            this.f108916c = nx1;
        }

        /* renamed from: f */
        public final void m14093f(CG6.InterfaceC0976b interfaceC0976b) {
            this.f108914a = interfaceC0976b;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0013\u001a\u00020\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000f\u001a\u0004\b\b\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, m28432d2 = {"LsX1$d;", "", "", "hashCode", "o", "", "equals", "Landroid/net/Uri;", C17296a.f69688o, "Landroid/net/Uri;", "b", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "uri", "Ljava/lang/Object;", "()Ljava/lang/Object;", "setTag", "(Ljava/lang/Object;)V", "tag", "<init>", "(Landroid/net/Uri;Ljava/lang/Object;)V", "c", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: sX1$d */
    /* loaded from: classes5.dex */
    public static final class C28333d {

        /* renamed from: c */
        public static final C28334a f108917c = new C28334a(null);

        /* renamed from: a */
        public Uri f108918a;

        /* renamed from: b */
        public Object f108919b;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"LsX1$d$a;", "", "", "HASH_MULTIPLIER", "I", "HASH_SEED", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
        /* renamed from: sX1$d$a */
        /* loaded from: classes5.dex */
        public static final class C28334a {
            private C28334a() {
            }

            public /* synthetic */ C28334a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C28333d(Uri uri, Object tag) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.f108918a = uri;
            this.f108919b = tag;
        }

        /* renamed from: a */
        public final Object m14092a() {
            return this.f108919b;
        }

        /* renamed from: b */
        public final Uri m14091b() {
            return this.f108918a;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C28333d)) {
                return false;
            }
            C28333d c28333d = (C28333d) obj;
            if (c28333d.f108918a != this.f108918a || c28333d.f108919b != this.f108919b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((1073 + this.f108918a.hashCode()) * 37) + this.f108919b.hashCode();
        }
    }

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "run"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: sX1$e */
    /* loaded from: classes5.dex */
    public static final class RunnableC28335e implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ NX1 f108920b;

        /* renamed from: c */
        public final /* synthetic */ Exception f108921c;

        /* renamed from: d */
        public final /* synthetic */ boolean f108922d;

        /* renamed from: e */
        public final /* synthetic */ Bitmap f108923e;

        /* renamed from: f */
        public final /* synthetic */ NX1.InterfaceC5601b f108924f;

        public RunnableC28335e(NX1 nx1, Exception exc, boolean z, Bitmap bitmap, NX1.InterfaceC5601b interfaceC5601b) {
            this.f108920b = nx1;
            this.f108921c = exc;
            this.f108922d = z;
            this.f108923e = bitmap;
            this.f108924f = interfaceC5601b;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                if (TD0.m84203d(this)) {
                    return;
                }
                this.f108924f.mo52436a(new QX1(this.f108920b, this.f108921c, this.f108922d, this.f108923e));
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    private C48695sX1() {
    }

    @JvmStatic
    /* renamed from: c */
    public static final boolean m14108c(NX1 request) {
        boolean z;
        Intrinsics.checkNotNullParameter(request, "request");
        C28333d c28333d = new C28333d(request.m93806c(), request.m93807b());
        Map<C28333d, C28332c> map = f108909d;
        synchronized (map) {
            C28332c c28332c = map.get(c28333d);
            if (c28332c != null) {
                CG6.InterfaceC0976b m14097b = c28332c.m14097b();
                z = true;
                if (m14097b != null && m14097b.cancel()) {
                    map.remove(c28333d);
                } else {
                    c28332c.m14095d(true);
                }
            } else {
                z = false;
            }
            Unit unit = Unit.INSTANCE;
        }
        return z;
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m14106e(NX1 nx1) {
        if (nx1 == null) {
            return;
        }
        C28333d c28333d = new C28333d(nx1.m93806c(), nx1.m93807b());
        Map<C28333d, C28332c> map = f108909d;
        synchronized (map) {
            C28332c c28332c = map.get(c28333d);
            if (c28332c != null) {
                c28332c.m14094e(nx1);
                c28332c.m14095d(false);
                CG6.InterfaceC0976b m14097b = c28332c.m14097b();
                if (m14097b != null) {
                    m14097b.mo112475a();
                    Unit unit = Unit.INSTANCE;
                }
            } else {
                f108910e.m14105f(nx1, c28333d, nx1.m93804e());
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [int] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m14107d(C28333d c28333d) {
        HttpURLConnection httpURLConnection;
        ?? r4;
        FacebookException facebookException;
        URLConnection uRLConnection;
        InputStream m86640c;
        Bitmap decodeStream;
        FacebookException facebookException2;
        Closeable closeable = null;
        InputStream inputStream = null;
        closeable = null;
        Bitmap bitmap = null;
        boolean z = true;
        try {
            uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(c28333d.m14091b().toString()).openConnection());
        } catch (IOException e) {
            e = e;
            httpURLConnection = null;
            r4 = 0;
        } catch (Throwable th) {
            th = th;
            httpURLConnection = null;
        }
        if (uRLConnection != null) {
            httpURLConnection = (HttpURLConnection) uRLConnection;
            try {
                try {
                    httpURLConnection.setInstanceFollowRedirects(false);
                    r4 = httpURLConnection.getResponseCode();
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
            } catch (IOException e3) {
                e = e3;
                C52364yi6.m2839g(r4);
                C52364yi6.m2825n(httpURLConnection);
                facebookException = e;
                if (!z) {
                }
            } catch (Throwable th3) {
                th = th3;
                closeable = r4;
                C52364yi6.m2839g(closeable);
                C52364yi6.m2825n(httpURLConnection);
                throw th;
            }
            if (r4 != 200) {
                if (r4 != 301 && r4 != 302) {
                    m86640c = httpURLConnection.getErrorStream();
                    StringBuilder sb = new StringBuilder();
                    if (m86640c != null) {
                        InputStreamReader inputStreamReader = new InputStreamReader(m86640c);
                        char[] cArr = new char[128];
                        while (true) {
                            int read = inputStreamReader.read(cArr, 0, 128);
                            if (read <= 0) {
                                break;
                            }
                            sb.append(cArr, 0, read);
                        }
                        C52364yi6.m2839g(inputStreamReader);
                    } else {
                        sb.append("Unexpected error while downloading an image.");
                        Intrinsics.checkNotNullExpressionValue(sb, "errorMessageBuilder.appe…e downloading an image.\")");
                    }
                    facebookException2 = new FacebookException(sb.toString());
                    decodeStream = null;
                } else {
                    try {
                        String headerField = httpURLConnection.getHeaderField("location");
                        if (!C52364yi6.m2860R(headerField)) {
                            Uri redirectUri = Uri.parse(headerField);
                            C35408Qf6.m88270a(c28333d.m14091b(), redirectUri);
                            C28332c m14099l = m14099l(c28333d);
                            if (m14099l != null && !m14099l.m14096c()) {
                                NX1 m14098a = m14099l.m14098a();
                                Intrinsics.checkNotNullExpressionValue(redirectUri, "redirectUri");
                                m14105f(m14098a, new C28333d(redirectUri, c28333d.m14092a()), false);
                            }
                        }
                        z = false;
                        decodeStream = null;
                        facebookException2 = null;
                        C52364yi6.m2839g(inputStream);
                        C52364yi6.m2825n(httpURLConnection);
                        bitmap = decodeStream;
                        facebookException = facebookException2;
                    } catch (IOException e4) {
                        e = e4;
                        z = false;
                        r4 = 0;
                        C52364yi6.m2839g(r4);
                        C52364yi6.m2825n(httpURLConnection);
                        facebookException = e;
                        if (!z) {
                        }
                    }
                    if (!z) {
                        m14101j(c28333d, facebookException, bitmap, false);
                        return;
                    }
                    return;
                }
            } else {
                m86640c = RX1.m86640c(httpURLConnection);
                decodeStream = BitmapFactory.decodeStream(m86640c);
                facebookException2 = null;
            }
            inputStream = m86640c;
            C52364yi6.m2839g(inputStream);
            C52364yi6.m2825n(httpURLConnection);
            bitmap = decodeStream;
            facebookException = facebookException2;
            if (!z) {
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
    }

    /* renamed from: f */
    public final void m14105f(NX1 nx1, C28333d c28333d, boolean z) {
        m14103h(nx1, c28333d, f108908c, new RunnableC28330a(c28333d, z));
    }

    /* renamed from: g */
    public final void m14104g(NX1 nx1, C28333d c28333d) {
        m14103h(nx1, c28333d, f108907b, new RunnableC28331b(c28333d));
    }

    /* renamed from: h */
    public final void m14103h(NX1 nx1, C28333d c28333d, CG6 cg6, Runnable runnable) {
        Map<C28333d, C28332c> map = f108909d;
        synchronized (map) {
            C28332c c28332c = new C28332c(nx1);
            map.put(c28333d, c28332c);
            c28332c.m14093f(CG6.m112481g(cg6, runnable, false, 2, null));
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: i */
    public final synchronized Handler m14102i() {
        if (f108906a == null) {
            f108906a = new Handler(Looper.getMainLooper());
        }
        return f108906a;
    }

    /* renamed from: j */
    public final void m14101j(C28333d c28333d, Exception exc, Bitmap bitmap, boolean z) {
        NX1.InterfaceC5601b interfaceC5601b;
        Handler m14102i;
        C28332c m14099l = m14099l(c28333d);
        if (m14099l != null && !m14099l.m14096c()) {
            NX1 m14098a = m14099l.m14098a();
            if (m14098a != null) {
                interfaceC5601b = m14098a.m93808a();
            } else {
                interfaceC5601b = null;
            }
            NX1.InterfaceC5601b interfaceC5601b2 = interfaceC5601b;
            if (interfaceC5601b2 != null && (m14102i = m14102i()) != null) {
                m14102i.post(new RunnableC28335e(m14098a, exc, z, bitmap, interfaceC5601b2));
            }
        }
    }

    /* renamed from: k */
    public final void m14100k(C28333d c28333d, boolean z) {
        InputStream inputStream;
        Uri m88268c;
        NX1 nx1 = null;
        boolean z2 = false;
        if (z && (m88268c = C35408Qf6.m88268c(c28333d.m14091b())) != null) {
            inputStream = RX1.m86641b(m88268c);
            if (inputStream != null) {
                z2 = true;
            }
        } else {
            inputStream = null;
        }
        if (!z2) {
            inputStream = RX1.m86641b(c28333d.m14091b());
        }
        if (inputStream != null) {
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
            C52364yi6.m2839g(inputStream);
            m14101j(c28333d, null, decodeStream, z2);
            return;
        }
        C28332c m14099l = m14099l(c28333d);
        if (m14099l != null) {
            nx1 = m14099l.m14098a();
        }
        if (m14099l != null && !m14099l.m14096c() && nx1 != null) {
            m14104g(nx1, c28333d);
        }
    }

    /* renamed from: l */
    public final C28332c m14099l(C28333d c28333d) {
        C28332c remove;
        Map<C28333d, C28332c> map = f108909d;
        synchronized (map) {
            remove = map.remove(c28333d);
        }
        return remove;
    }
}
