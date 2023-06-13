package co.bird.android.feature.webview;

import androidx.annotation.Keep;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
/* JADX INFO: Access modifiers changed from: package-private */
@Keep
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0083\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b$\u0010%J\u0016\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003JQ\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÖ\u0003R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0010\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0017\u0010\u0011\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0017\u0010\u0012\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u0017\u0010\u0013\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001b\u001a\u0004\b#\u0010\u001d¨\u0006&"}, m28432d2 = {"Lco/bird/android/feature/webview/RequestContext;", "Ly20;", "", "", "", "params", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "authorization", "acceptLanguage", "platform", "appVersion", NamedConstantsKt.APP_NAME, "deviceId", "roleId", "copy", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getAuthorization", "()Ljava/lang/String;", "getAcceptLanguage", "getPlatform", "getAppVersion", "getAppName", "getDeviceId", "getRoleId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "webview_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class RequestContext extends AbstractC51964y20 {
    private final String acceptLanguage;
    private final String appName;
    private final String appVersion;
    private final String authorization;
    private final String deviceId;
    private final String platform;
    private final String roleId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestContext(String str, String acceptLanguage, String platform, String appVersion, String appName, String deviceId, String roleId) {
        super(null);
        Intrinsics.checkNotNullParameter(acceptLanguage, "acceptLanguage");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(roleId, "roleId");
        this.authorization = str;
        this.acceptLanguage = acceptLanguage;
        this.platform = platform;
        this.appVersion = appVersion;
        this.appName = appName;
        this.deviceId = deviceId;
        this.roleId = roleId;
    }

    public static /* synthetic */ RequestContext copy$default(RequestContext requestContext, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = requestContext.authorization;
        }
        if ((i & 2) != 0) {
            str2 = requestContext.acceptLanguage;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = requestContext.platform;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = requestContext.appVersion;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = requestContext.appName;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = requestContext.deviceId;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = requestContext.roleId;
        }
        return requestContext.copy(str, str8, str9, str10, str11, str12, str7);
    }

    public final String component1() {
        return this.authorization;
    }

    public final String component2() {
        return this.acceptLanguage;
    }

    public final String component3() {
        return this.platform;
    }

    public final String component4() {
        return this.appVersion;
    }

    public final String component5() {
        return this.appName;
    }

    public final String component6() {
        return this.deviceId;
    }

    public final String component7() {
        return this.roleId;
    }

    public final RequestContext copy(String str, String acceptLanguage, String platform, String appVersion, String appName, String deviceId, String roleId) {
        Intrinsics.checkNotNullParameter(acceptLanguage, "acceptLanguage");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(roleId, "roleId");
        return new RequestContext(str, acceptLanguage, platform, appVersion, appName, deviceId, roleId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RequestContext) {
            RequestContext requestContext = (RequestContext) obj;
            return Intrinsics.areEqual(this.authorization, requestContext.authorization) && Intrinsics.areEqual(this.acceptLanguage, requestContext.acceptLanguage) && Intrinsics.areEqual(this.platform, requestContext.platform) && Intrinsics.areEqual(this.appVersion, requestContext.appVersion) && Intrinsics.areEqual(this.appName, requestContext.appName) && Intrinsics.areEqual(this.deviceId, requestContext.deviceId) && Intrinsics.areEqual(this.roleId, requestContext.roleId);
        }
        return false;
    }

    public final String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getAuthorization() {
        return this.authorization;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getRoleId() {
        return this.roleId;
    }

    public int hashCode() {
        String str = this.authorization;
        return ((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.acceptLanguage.hashCode()) * 31) + this.platform.hashCode()) * 31) + this.appVersion.hashCode()) * 31) + this.appName.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + this.roleId.hashCode();
    }

    @Override // p000.AbstractC51964y20
    public Map<String, Object> params() {
        Map<String, Object> mapOf;
        Pair[] pairArr = new Pair[7];
        String str = this.authorization;
        if (str == null) {
            str = "";
        }
        pairArr[0] = TuplesKt.m28425to("authorization", str);
        pairArr[1] = TuplesKt.m28425to("accept_language", this.acceptLanguage);
        pairArr[2] = TuplesKt.m28425to("platform", this.platform);
        pairArr[3] = TuplesKt.m28425to(AnalyticsFields.APP_VERSION, this.appVersion);
        pairArr[4] = TuplesKt.m28425to(AnalyticsFields.APP_NAME, this.appName);
        pairArr[5] = TuplesKt.m28425to("device_id", this.deviceId);
        pairArr[6] = TuplesKt.m28425to("role_id", this.roleId);
        mapOf = MapsKt__MapsKt.mapOf(pairArr);
        return mapOf;
    }

    public String toString() {
        String str = this.authorization;
        String str2 = this.acceptLanguage;
        String str3 = this.platform;
        String str4 = this.appVersion;
        String str5 = this.appName;
        String str6 = this.deviceId;
        String str7 = this.roleId;
        return "RequestContext(authorization=" + str + ", acceptLanguage=" + str2 + ", platform=" + str3 + ", appVersion=" + str4 + ", appName=" + str5 + ", deviceId=" + str6 + ", roleId=" + str7 + ")";
    }
}
