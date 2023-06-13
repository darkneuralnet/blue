package p000;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.View;
import android.view.Window;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.C17216a;
import com.facebook.share.internal.C17296a;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0007J\b\u0010\r\u001a\u00020\fH\u0007J\b\u0010\u000e\u001a\u00020\u0005H\u0007J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¨\u0006\u0015"}, m28432d2 = {"LWi;", "", "", "b", C17296a.f69688o, "", "value", "", "g", "", "bytes", "c", "", "f", DateTokenConverter.CONVERTER_KEY, "Landroid/app/Activity;", "activity", "Landroid/view/View;", "e", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: Wi */
/* loaded from: classes5.dex */
public final class C9155Wi {

    /* renamed from: a */
    public static final C9155Wi f41547a = new C9155Wi();

    private C9155Wi() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m77979a() {
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m77978b() {
    }

    @JvmStatic
    /* renamed from: c */
    public static final String m77977c(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bytes) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            stringBuffer.append(format);
        }
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "sb.toString()");
        return stringBuffer2;
    }

    @JvmStatic
    /* renamed from: d */
    public static final String m77976d() {
        Context context = C17216a.m52741e();
        try {
            Intrinsics.checkNotNullExpressionValue(context, "context");
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            Intrinsics.checkNotNullExpressionValue(str, "packageInfo.versionName");
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    @JvmStatic
    /* renamed from: e */
    public static final View m77975e(Activity activity) {
        if (TD0.m84203d(C9155Wi.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            View decorView = window.getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
            return decorView.getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            TD0.m84205b(th, C9155Wi.class);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
        if (r0 == false) goto L17;
     */
    @JvmStatic
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m77974f() {
        boolean startsWith$default;
        boolean startsWith$default2;
        boolean contains$default;
        boolean contains$default2;
        boolean contains$default3;
        boolean contains$default4;
        boolean startsWith$default3;
        boolean startsWith$default4;
        String str = Build.FINGERPRINT;
        Intrinsics.checkNotNullExpressionValue(str, "Build.FINGERPRINT");
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, "generic", false, 2, null);
        if (!startsWith$default) {
            Intrinsics.checkNotNullExpressionValue(str, "Build.FINGERPRINT");
            startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(str, "unknown", false, 2, null);
            if (!startsWith$default2) {
                String str2 = Build.MODEL;
                Intrinsics.checkNotNullExpressionValue(str2, "Build.MODEL");
                contains$default = StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) "google_sdk", false, 2, (Object) null);
                if (!contains$default) {
                    Intrinsics.checkNotNullExpressionValue(str2, "Build.MODEL");
                    contains$default2 = StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) "Emulator", false, 2, (Object) null);
                    if (!contains$default2) {
                        Intrinsics.checkNotNullExpressionValue(str2, "Build.MODEL");
                        contains$default3 = StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) "Android SDK built for x86", false, 2, (Object) null);
                        if (!contains$default3) {
                            String str3 = Build.MANUFACTURER;
                            Intrinsics.checkNotNullExpressionValue(str3, "Build.MANUFACTURER");
                            contains$default4 = StringsKt__StringsKt.contains$default((CharSequence) str3, (CharSequence) "Genymotion", false, 2, (Object) null);
                            if (!contains$default4) {
                                String str4 = Build.BRAND;
                                Intrinsics.checkNotNullExpressionValue(str4, "Build.BRAND");
                                startsWith$default3 = StringsKt__StringsJVMKt.startsWith$default(str4, "generic", false, 2, null);
                                if (startsWith$default3) {
                                    String str5 = Build.DEVICE;
                                    Intrinsics.checkNotNullExpressionValue(str5, "Build.DEVICE");
                                    startsWith$default4 = StringsKt__StringsJVMKt.startsWith$default(str5, "generic", false, 2, null);
                                }
                                if (!Intrinsics.areEqual("google_sdk", Build.PRODUCT)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    @JvmStatic
    /* renamed from: g */
    public static final double m77973g(String str) {
        try {
            Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(str);
            if (!matcher.find()) {
                return 0.0d;
            }
            return NumberFormat.getNumberInstance(C52364yi6.m2809v()).parse(matcher.group(0)).doubleValue();
        } catch (ParseException unused) {
            return 0.0d;
        }
    }
}
