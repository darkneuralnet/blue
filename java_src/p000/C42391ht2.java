package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.concurrent.Callable;
/* renamed from: ht2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C42391ht2 {
    private C42391ht2() {
    }

    /* renamed from: f */
    public static Callable<InputStream> m35654f(final Context context, final Uri uri) {
        String path = uri.getPath();
        String substring = path.substring(1, path.lastIndexOf(47));
        if (!substring.equals("raw") && !substring.equals("drawable")) {
            throw new IllegalArgumentException("Unknown resource resourceType '" + substring + "' in uri '" + uri + "'. Resource will not be loaded");
        }
        return new Callable() { // from class: dt2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InputStream m35641s;
                m35641s = C42391ht2.m35641s(context, uri);
                return m35641s;
            }
        };
    }

    /* renamed from: g */
    public static boolean m35653g(AssetManager assetManager, String str) throws IOException {
        String[] list;
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf != -1) {
            String substring = str.substring(lastIndexOf + 1);
            list = assetManager.list(str.substring(0, lastIndexOf));
            str = substring;
        } else {
            list = assetManager.list("");
        }
        if (list != null) {
            for (String str2 : list) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    public static Callable<InputStream> m35652h(final Context context, final Uri uri) {
        return new Callable() { // from class: ct2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InputStream m35640t;
                m35640t = C42391ht2.m35640t(context, uri);
                return m35640t;
            }
        };
    }

    /* renamed from: i */
    public static Callable<InputStream> m35651i(Uri uri) {
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int indexOf = schemeSpecificPart.indexOf(44);
        if (indexOf >= 0) {
            final boolean contains = schemeSpecificPart.substring(0, indexOf).contains(";base64");
            final String substring = schemeSpecificPart.substring(indexOf + 1);
            return new Callable() { // from class: gt2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InputStream m35639u;
                    m35639u = C42391ht2.m35639u(contains, substring);
                    return m35639u;
                }
            };
        }
        throw new IllegalArgumentException("Malformed data uri - does not contain a ','");
    }

    /* renamed from: j */
    public static Callable<InputStream> m35650j(Context context, Uri uri) {
        final String str;
        final AssetManager assets = context.getAssets();
        if (uri.getAuthority() == null) {
            str = uri.getPath();
        } else if (uri.getPath().isEmpty()) {
            str = uri.getAuthority();
        } else {
            str = uri.getAuthority() + uri.getPath();
        }
        final String m35635y = m35635y(str);
        return new Callable() { // from class: et2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InputStream m35638v;
                m35638v = C42391ht2.m35638v(assets, m35635y, str);
                return m35638v;
            }
        };
    }

    /* renamed from: k */
    public static Callable<InputStream> m35649k(Context context, Uri uri) {
        return m35648l(context, uri, null);
    }

    /* renamed from: l */
    public static Callable<InputStream> m35648l(Context context, Uri uri, Map<String, String> map) {
        DZ3.m110173d(uri, "Parameter \"sourceUri\" was null.");
        DZ3.m110173d(context, "Parameter \"context\" was null.");
        if (m35643q(uri).booleanValue()) {
            return m35650j(context, uri);
        }
        if (m35646n(uri).booleanValue()) {
            return m35654f(context, uri);
        }
        if (m35645o(uri).booleanValue()) {
            return m35652h(context, uri);
        }
        if (m35642r(uri)) {
            return m35651i(uri);
        }
        return m35636x(uri, map);
    }

    /* renamed from: m */
    public static String m35647m(String str) {
        if (str.startsWith("model/gltf-binary")) {
            return "glb";
        }
        if (str.startsWith("model/gltf+json")) {
            return "gltf";
        }
        return null;
    }

    /* renamed from: n */
    public static Boolean m35646n(Uri uri) {
        DZ3.m110173d(uri, "Parameter \"sourceUri\" was null.");
        return Boolean.valueOf(TextUtils.equals("android.resource", uri.getScheme()));
    }

    /* renamed from: o */
    public static Boolean m35645o(Uri uri) {
        DZ3.m110173d(uri, "Parameter \"sourceUri\" was null.");
        return Boolean.valueOf(TextUtils.equals("content", uri.getScheme()));
    }

    /* renamed from: p */
    public static boolean m35644p(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null && scheme.equals(MessageExtension.FIELD_DATA)) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public static Boolean m35643q(Uri uri) {
        boolean z;
        DZ3.m110173d(uri, "Parameter \"sourceUri\" was null.");
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme) && !"file".equals(scheme)) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: r */
    public static boolean m35642r(Uri uri) {
        if (!m35644p(uri) || m35647m(uri.getSchemeSpecificPart()) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public static /* synthetic */ InputStream m35641s(Context context, Uri uri) throws Exception {
        return context.getContentResolver().openInputStream(uri);
    }

    /* renamed from: t */
    public static /* synthetic */ InputStream m35640t(Context context, Uri uri) throws Exception {
        return context.getContentResolver().openInputStream(uri);
    }

    /* renamed from: u */
    public static /* synthetic */ InputStream m35639u(boolean z, String str) throws Exception {
        byte[] bytes;
        if (z) {
            bytes = Base64.decode(str, 0);
        } else {
            bytes = str.getBytes();
        }
        return new ByteArrayInputStream(bytes);
    }

    /* renamed from: v */
    public static /* synthetic */ InputStream m35638v(AssetManager assetManager, String str, String str2) throws Exception {
        if (m35653g(assetManager, str)) {
            return assetManager.open(str);
        }
        return new FileInputStream(new File(str2));
    }

    /* renamed from: x */
    public static Callable<InputStream> m35636x(Uri uri, Map<String, String> map) {
        try {
            final URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri.toString()).openConnection());
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    uRLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
            }
            return new Callable() { // from class: ft2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InputStream inputStream;
                    inputStream = uRLConnection.getInputStream();
                    return inputStream;
                }
            };
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Unable to parse url: '" + uri + "'", e);
        } catch (IOException e2) {
            throw new AssertionError("Error opening url connection: '" + uri + "'", e2);
        }
    }

    /* renamed from: y */
    public static String m35635y(String str) {
        if (str.startsWith("/android_asset/")) {
            return str.substring(15);
        }
        return str;
    }
}
