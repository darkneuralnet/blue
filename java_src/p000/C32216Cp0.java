package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import co.bird.android.model.Detail;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.Locale;
@KeepForSdk
/* renamed from: Cp0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C32216Cp0 {

    /* renamed from: a */
    public static final GmsLogger f4746a = new GmsLogger("CommonUtils", "");

    private C32216Cp0() {
    }

    @KeepForSdk
    /* renamed from: a */
    public static String m111503a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            f4746a.m51614e("CommonUtils", "Exception thrown when trying to get app version ".concat(e.toString()));
            return "";
        }
    }

    @KeepForSdk
    /* renamed from: b */
    public static String m111502b(Locale locale) {
        if (PlatformVersion.isAtLeastLollipop()) {
            return locale.toLanguageTag();
        }
        StringBuilder sb = new StringBuilder(locale.getLanguage());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb.append(Detail.EMPTY_CHAR);
            sb.append(locale.getCountry());
        }
        if (!TextUtils.isEmpty(locale.getVariant())) {
            sb.append(Detail.EMPTY_CHAR);
            sb.append(locale.getVariant());
        }
        return sb.toString();
    }
}
