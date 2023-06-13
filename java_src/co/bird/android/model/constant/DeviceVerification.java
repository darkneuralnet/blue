package co.bird.android.model.constant;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/model/constant/DeviceVerification;", "", "service", "", "httpMethod", "Lco/bird/android/model/constant/HttpMethod;", "path", "(Ljava/lang/String;Lco/bird/android/model/constant/HttpMethod;Ljava/lang/String;)V", "getHttpMethod", "()Lco/bird/android/model/constant/HttpMethod;", "getPath", "()Ljava/lang/String;", "getService", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class DeviceVerification {
    private final HttpMethod httpMethod;
    private final String path;
    private final String service;

    public DeviceVerification(String service, HttpMethod httpMethod, String path) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        Intrinsics.checkNotNullParameter(path, "path");
        this.service = service;
        this.httpMethod = httpMethod;
        this.path = path;
    }

    public static /* synthetic */ DeviceVerification copy$default(DeviceVerification deviceVerification, String str, HttpMethod httpMethod, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceVerification.service;
        }
        if ((i & 2) != 0) {
            httpMethod = deviceVerification.httpMethod;
        }
        if ((i & 4) != 0) {
            str2 = deviceVerification.path;
        }
        return deviceVerification.copy(str, httpMethod, str2);
    }

    public final String component1() {
        return this.service;
    }

    public final HttpMethod component2() {
        return this.httpMethod;
    }

    public final String component3() {
        return this.path;
    }

    public final DeviceVerification copy(String service, HttpMethod httpMethod, String path) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        Intrinsics.checkNotNullParameter(path, "path");
        return new DeviceVerification(service, httpMethod, path);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceVerification) {
            DeviceVerification deviceVerification = (DeviceVerification) obj;
            return Intrinsics.areEqual(this.service, deviceVerification.service) && this.httpMethod == deviceVerification.httpMethod && Intrinsics.areEqual(this.path, deviceVerification.path);
        }
        return false;
    }

    public final HttpMethod getHttpMethod() {
        return this.httpMethod;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getService() {
        return this.service;
    }

    public int hashCode() {
        return (((this.service.hashCode() * 31) + this.httpMethod.hashCode()) * 31) + this.path.hashCode();
    }

    public String toString() {
        String str = this.service;
        HttpMethod httpMethod = this.httpMethod;
        String str2 = this.path;
        return "DeviceVerification(service=" + str + ", httpMethod=" + httpMethod + ", path=" + str2 + ")";
    }
}
