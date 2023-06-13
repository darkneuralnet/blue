package p000;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.C17216a;
import com.facebook.FacebookActivity;
import com.facebook.FacebookSdkNotInitializedException;
import com.facebook.share.internal.C17296a;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J$\u0010\n\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J$\u0010\u000b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J$\u0010\f\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\u001a\u0010\r\u001a\u00020\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\b\u0010\u000f\u001a\u00020\u0005H\u0007J\b\u0010\u0010\u001a\u00020\u0003H\u0007J\b\u0010\u0011\u001a\u00020\u0003H\u0007J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0007J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0018\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0007J\u001a\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0007R\u0014\u0010\u001e\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001d¨\u0006!"}, m28432d2 = {"Lsj6;", "", "arg", "", "name", "", "m", "T", "", "container", "k", C17296a.f69688o, "l", "n", "j", "o", "b", "c", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "h", "", "shouldThrow", "i", "f", "g", "redirectURI", "e", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "TAG", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: sj6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48817sj6 {

    /* renamed from: a */
    public static final String f109157a;

    /* renamed from: b */
    public static final C48817sj6 f109158b = new C48817sj6();

    static {
        String name = C48817sj6.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "Validate::class.java.name");
        f109157a = name;
    }

    private C48817sj6() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final <T> void m13777a(Collection<? extends T> container, String name) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        m13765m(container, name);
        for (T t : container) {
            if (t == null) {
                throw new NullPointerException("Container '" + name + "' cannot contain null values");
            }
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m13776b() {
        String m52740f = C17216a.m52740f();
        if (m52740f != null) {
            return m52740f;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.".toString());
    }

    @JvmStatic
    /* renamed from: c */
    public static final String m13775c() {
        String m52733m = C17216a.m52733m();
        if (m52733m != null) {
            return m52733m;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token.".toString());
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m13774d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        m13765m(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        String m13776b = m13776b();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            String str = "com.facebook.app.FacebookContentProvider" + m13776b;
            if (packageManager.resolveContentProvider(str, 0) == null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.", Arrays.copyOf(new Object[]{str}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                throw new IllegalStateException(format.toString());
            }
        }
    }

    @JvmStatic
    /* renamed from: e */
    public static final boolean m13773e(Context context, String str) {
        List<ResolveInfo> list;
        Intrinsics.checkNotNullParameter(context, "context");
        m13765m(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(str));
            list = packageManager.queryIntentActivities(intent, 64);
        } else {
            list = null;
        }
        if (list == null) {
            return false;
        }
        boolean z = false;
        for (ResolveInfo resolveInfo : list) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!Intrinsics.areEqual(activityInfo.name, "com.facebook.CustomTabActivity") || !Intrinsics.areEqual(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z = true;
        }
        return z;
    }

    @JvmStatic
    /* renamed from: f */
    public static final void m13772f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        m13771g(context, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    @JvmStatic
    @SuppressLint({"WrongConstant"})
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m13771g(Context context, boolean z) {
        ActivityInfo activityInfo;
        Intrinsics.checkNotNullParameter(context, "context");
        m13765m(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                activityInfo = packageManager.getActivityInfo(new ComponentName(context, FacebookActivity.f69341e), 1);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (activityInfo != null) {
                if (!z) {
                    Log.w(f109157a, "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
                    return;
                }
                throw new IllegalStateException("FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.".toString());
            }
            return;
        }
        activityInfo = null;
        if (activityInfo != null) {
        }
    }

    @JvmStatic
    /* renamed from: h */
    public static final void m13770h(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        m13769i(context, true);
    }

    @JvmStatic
    /* renamed from: i */
    public static final void m13769i(Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        m13765m(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
            if (!z) {
                Log.w(f109157a, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
                return;
            }
            throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.".toString());
        }
    }

    @JvmStatic
    /* renamed from: j */
    public static final void m13768j(String arg, String name) {
        boolean z;
        Intrinsics.checkNotNullParameter(arg, "arg");
        Intrinsics.checkNotNullParameter(name, "name");
        if (arg.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(("Argument '" + name + "' cannot be empty").toString());
    }

    @JvmStatic
    /* renamed from: k */
    public static final <T> void m13767k(Collection<? extends T> container, String name) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        if (!container.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException(("Container '" + name + "' cannot be empty").toString());
    }

    @JvmStatic
    /* renamed from: l */
    public static final <T> void m13766l(Collection<? extends T> container, String name) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        m13777a(container, name);
        m13767k(container, name);
    }

    @JvmStatic
    /* renamed from: m */
    public static final void m13765m(Object obj, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (obj != null) {
            return;
        }
        throw new NullPointerException("Argument '" + name + "' cannot be null");
    }

    @JvmStatic
    /* renamed from: n */
    public static final void m13764n(String str, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (!C52364yi6.m2860R(str)) {
            return;
        }
        throw new IllegalArgumentException(("Argument '" + name + "' cannot be null or empty").toString());
    }

    @JvmStatic
    /* renamed from: o */
    public static final void m13763o() {
        if (C17216a.m52722x()) {
            return;
        }
        throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
    }
}
