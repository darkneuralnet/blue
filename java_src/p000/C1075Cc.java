package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.BatteryManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u0014\u0010\u0013\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\n¨\u0006\u0016"}, m28432d2 = {"LCc;", "LBc;", "", C17296a.f69688o, "e", "b", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "getDeviceId", "()Ljava/lang/String;", "deviceId", DateTokenConverter.CONVERTER_KEY, RequestHeadersFactory.MODEL, "getDevice", "device", "f", "appVersion", "c", "appVersionCode", "<init>", "(Landroid/content/Context;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Cc */
/* loaded from: classes4.dex */
public final class C1075Cc implements InterfaceC0650Bc {

    /* renamed from: a */
    public final Context f4316a;

    public C1075Cc(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f4316a = applicationContext;
    }

    @Override // p000.InterfaceC0650Bc
    /* renamed from: a */
    public String mo112058a() {
        Object systemService = this.f4316a.getSystemService(PaymentMethod.BillingDetails.PARAM_PHONE);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
        if (networkOperatorName == null) {
            return "unknown";
        }
        return networkOperatorName;
    }

    @Override // p000.InterfaceC0650Bc
    /* renamed from: b */
    public String mo112057b() {
        Object systemService = this.f4316a.getSystemService("batterymanager");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
        return String.valueOf(((BatteryManager) systemService).getIntProperty(4));
    }

    @Override // p000.InterfaceC0650Bc
    /* renamed from: c */
    public String mo112056c() {
        try {
            String num = Integer.toString(this.f4316a.getPackageManager().getPackageInfo(this.f4316a.getPackageName(), 0).versionCode);
            Intrinsics.checkNotNullExpressionValue(num, "{\n        val manager = …info.versionCode)\n      }");
            return num;
        } catch (PackageManager.NameNotFoundException unused) {
            return "unknown";
        }
    }

    @Override // p000.InterfaceC0650Bc
    /* renamed from: d */
    public String mo112055d() {
        String str = Build.MODEL;
        return str == null ? "unknown" : str;
    }

    @Override // p000.InterfaceC0650Bc
    /* renamed from: e */
    public String mo112054e() {
        Object systemService = this.f4316a.getSystemService(PaymentMethod.BillingDetails.PARAM_PHONE);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        if (NA0.m94303a(this.f4316a, "android.permission.READ_PHONE_STATE") != 0) {
            return "unknown";
        }
        switch (telephonyManager.getNetworkType()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return "3G";
            case 13:
                return "4G";
            default:
                return "unknown";
        }
    }

    @Override // p000.InterfaceC0650Bc
    /* renamed from: f */
    public String mo112053f() {
        try {
            String str = this.f4316a.getPackageManager().getPackageInfo(this.f4316a.getPackageName(), 0).versionName;
            Intrinsics.checkNotNullExpressionValue(str, "{\n        val manager = … info.versionName\n      }");
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "unknown";
        }
    }

    @Override // p000.InterfaceC0650Bc
    public String getDevice() {
        String str = Build.DEVICE;
        return str == null ? "unknown" : str;
    }

    @Override // p000.InterfaceC0650Bc
    @SuppressLint({"HardwareIds"})
    public String getDeviceId() {
        String string = Settings.Secure.getString(this.f4316a.getContentResolver(), "android_id");
        return string == null ? "unknown" : string;
    }
}
