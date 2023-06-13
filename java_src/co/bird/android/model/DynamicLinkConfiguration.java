package co.bird.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/DynamicLinkConfiguration;", "", "giftDomain", "", "bundleId", "appStoreId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppStoreId", "()Ljava/lang/String;", "getBundleId", "getGiftDomain", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class DynamicLinkConfiguration {
    private final String appStoreId;
    private final String bundleId;
    private final String giftDomain;

    public DynamicLinkConfiguration(String giftDomain, String bundleId, String appStoreId) {
        Intrinsics.checkNotNullParameter(giftDomain, "giftDomain");
        Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        Intrinsics.checkNotNullParameter(appStoreId, "appStoreId");
        this.giftDomain = giftDomain;
        this.bundleId = bundleId;
        this.appStoreId = appStoreId;
    }

    public static /* synthetic */ DynamicLinkConfiguration copy$default(DynamicLinkConfiguration dynamicLinkConfiguration, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dynamicLinkConfiguration.giftDomain;
        }
        if ((i & 2) != 0) {
            str2 = dynamicLinkConfiguration.bundleId;
        }
        if ((i & 4) != 0) {
            str3 = dynamicLinkConfiguration.appStoreId;
        }
        return dynamicLinkConfiguration.copy(str, str2, str3);
    }

    public final String component1() {
        return this.giftDomain;
    }

    public final String component2() {
        return this.bundleId;
    }

    public final String component3() {
        return this.appStoreId;
    }

    public final DynamicLinkConfiguration copy(String giftDomain, String bundleId, String appStoreId) {
        Intrinsics.checkNotNullParameter(giftDomain, "giftDomain");
        Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        Intrinsics.checkNotNullParameter(appStoreId, "appStoreId");
        return new DynamicLinkConfiguration(giftDomain, bundleId, appStoreId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DynamicLinkConfiguration) {
            DynamicLinkConfiguration dynamicLinkConfiguration = (DynamicLinkConfiguration) obj;
            return Intrinsics.areEqual(this.giftDomain, dynamicLinkConfiguration.giftDomain) && Intrinsics.areEqual(this.bundleId, dynamicLinkConfiguration.bundleId) && Intrinsics.areEqual(this.appStoreId, dynamicLinkConfiguration.appStoreId);
        }
        return false;
    }

    public final String getAppStoreId() {
        return this.appStoreId;
    }

    public final String getBundleId() {
        return this.bundleId;
    }

    public final String getGiftDomain() {
        return this.giftDomain;
    }

    public int hashCode() {
        return (((this.giftDomain.hashCode() * 31) + this.bundleId.hashCode()) * 31) + this.appStoreId.hashCode();
    }

    public String toString() {
        String str = this.giftDomain;
        String str2 = this.bundleId;
        String str3 = this.appStoreId;
        return "DynamicLinkConfiguration(giftDomain=" + str + ", bundleId=" + str2 + ", appStoreId=" + str3 + ")";
    }
}
