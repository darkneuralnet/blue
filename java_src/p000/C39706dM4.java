package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.List;
/* renamed from: dM4  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C39706dM4 implements InterfaceC38502bM4<Uri, Drawable> {

    /* renamed from: b */
    public static final C43035iy3<Resources.Theme> f76500b = C43035iy3.m31549e("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* renamed from: a */
    public final Context f76501a;

    public C39706dM4(Context context) {
        this.f76501a = context.getApplicationContext();
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: c */
    public VL4<Drawable> mo1781b(Uri uri, int i, int i2, C48964sy3 c48964sy3) {
        boolean z;
        Drawable m86016a;
        String authority = uri.getAuthority();
        Context m44353d = m44353d(uri, authority);
        int m44350g = m44350g(m44353d, uri);
        Resources.Theme theme = (Resources.Theme) c48964sy3.m13300c(f76500b);
        if (!m44353d.getPackageName().equals(authority) && theme != null) {
            z = false;
        } else {
            z = true;
        }
        C52865zZ3.m1114a(z, "Can't get a theme from another package");
        if (theme == null) {
            m86016a = S61.m86015b(this.f76501a, m44353d, m44350g);
        } else {
            m86016a = S61.m86016a(this.f76501a, m44350g, theme);
        }
        return Z83.m73666f(m86016a);
    }

    /* renamed from: d */
    public final Context m44353d(Uri uri, String str) {
        if (str.equals(this.f76501a.getPackageName())) {
            return this.f76501a;
        }
        try {
            return this.f76501a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.f76501a.getPackageName())) {
                return this.f76501a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
        }
    }

    /* renamed from: e */
    public final int m44352e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e);
        }
    }

    /* renamed from: f */
    public final int m44351f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    /* renamed from: g */
    public final int m44350g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return m44351f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return m44352e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: h */
    public boolean mo1782a(Uri uri, C48964sy3 c48964sy3) {
        return uri.getScheme().equals("android.resource");
    }
}
