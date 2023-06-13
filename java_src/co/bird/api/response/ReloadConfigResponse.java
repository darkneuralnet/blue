package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006!"}, m28432d2 = {"Lco/bird/api/response/ReloadConfigResponse;", "", "currency", "", "preload", "Lco/bird/api/response/PreloadConfig;", "autoReload", "Lco/bird/api/response/AutoReloadConfig;", "autoReloadFromPreload", "Lco/bird/api/response/AutoReloadFromPreloadConfig;", "reloadTermsArticle", "(Ljava/lang/String;Lco/bird/api/response/PreloadConfig;Lco/bird/api/response/AutoReloadConfig;Lco/bird/api/response/AutoReloadFromPreloadConfig;Ljava/lang/String;)V", "getAutoReload", "()Lco/bird/api/response/AutoReloadConfig;", "getAutoReloadFromPreload", "()Lco/bird/api/response/AutoReloadFromPreloadConfig;", "getCurrency", "()Ljava/lang/String;", "getPreload", "()Lco/bird/api/response/PreloadConfig;", "getReloadTermsArticle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ReloadConfigResponse {
    private final AutoReloadConfig autoReload;
    private final AutoReloadFromPreloadConfig autoReloadFromPreload;
    private final String currency;
    private final PreloadConfig preload;
    private final String reloadTermsArticle;

    public ReloadConfigResponse(String currency, PreloadConfig preload, AutoReloadConfig autoReload, AutoReloadFromPreloadConfig autoReloadFromPreload, String str) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(preload, "preload");
        Intrinsics.checkNotNullParameter(autoReload, "autoReload");
        Intrinsics.checkNotNullParameter(autoReloadFromPreload, "autoReloadFromPreload");
        this.currency = currency;
        this.preload = preload;
        this.autoReload = autoReload;
        this.autoReloadFromPreload = autoReloadFromPreload;
        this.reloadTermsArticle = str;
    }

    public static /* synthetic */ ReloadConfigResponse copy$default(ReloadConfigResponse reloadConfigResponse, String str, PreloadConfig preloadConfig, AutoReloadConfig autoReloadConfig, AutoReloadFromPreloadConfig autoReloadFromPreloadConfig, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reloadConfigResponse.currency;
        }
        if ((i & 2) != 0) {
            preloadConfig = reloadConfigResponse.preload;
        }
        PreloadConfig preloadConfig2 = preloadConfig;
        if ((i & 4) != 0) {
            autoReloadConfig = reloadConfigResponse.autoReload;
        }
        AutoReloadConfig autoReloadConfig2 = autoReloadConfig;
        if ((i & 8) != 0) {
            autoReloadFromPreloadConfig = reloadConfigResponse.autoReloadFromPreload;
        }
        AutoReloadFromPreloadConfig autoReloadFromPreloadConfig2 = autoReloadFromPreloadConfig;
        if ((i & 16) != 0) {
            str2 = reloadConfigResponse.reloadTermsArticle;
        }
        return reloadConfigResponse.copy(str, preloadConfig2, autoReloadConfig2, autoReloadFromPreloadConfig2, str2);
    }

    public final String component1() {
        return this.currency;
    }

    public final PreloadConfig component2() {
        return this.preload;
    }

    public final AutoReloadConfig component3() {
        return this.autoReload;
    }

    public final AutoReloadFromPreloadConfig component4() {
        return this.autoReloadFromPreload;
    }

    public final String component5() {
        return this.reloadTermsArticle;
    }

    public final ReloadConfigResponse copy(String currency, PreloadConfig preload, AutoReloadConfig autoReload, AutoReloadFromPreloadConfig autoReloadFromPreload, String str) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(preload, "preload");
        Intrinsics.checkNotNullParameter(autoReload, "autoReload");
        Intrinsics.checkNotNullParameter(autoReloadFromPreload, "autoReloadFromPreload");
        return new ReloadConfigResponse(currency, preload, autoReload, autoReloadFromPreload, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReloadConfigResponse) {
            ReloadConfigResponse reloadConfigResponse = (ReloadConfigResponse) obj;
            return Intrinsics.areEqual(this.currency, reloadConfigResponse.currency) && Intrinsics.areEqual(this.preload, reloadConfigResponse.preload) && Intrinsics.areEqual(this.autoReload, reloadConfigResponse.autoReload) && Intrinsics.areEqual(this.autoReloadFromPreload, reloadConfigResponse.autoReloadFromPreload) && Intrinsics.areEqual(this.reloadTermsArticle, reloadConfigResponse.reloadTermsArticle);
        }
        return false;
    }

    public final AutoReloadConfig getAutoReload() {
        return this.autoReload;
    }

    public final AutoReloadFromPreloadConfig getAutoReloadFromPreload() {
        return this.autoReloadFromPreload;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final PreloadConfig getPreload() {
        return this.preload;
    }

    public final String getReloadTermsArticle() {
        return this.reloadTermsArticle;
    }

    public int hashCode() {
        int hashCode = ((((((this.currency.hashCode() * 31) + this.preload.hashCode()) * 31) + this.autoReload.hashCode()) * 31) + this.autoReloadFromPreload.hashCode()) * 31;
        String str = this.reloadTermsArticle;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.currency;
        PreloadConfig preloadConfig = this.preload;
        AutoReloadConfig autoReloadConfig = this.autoReload;
        AutoReloadFromPreloadConfig autoReloadFromPreloadConfig = this.autoReloadFromPreload;
        String str2 = this.reloadTermsArticle;
        return "ReloadConfigResponse(currency=" + str + ", preload=" + preloadConfig + ", autoReload=" + autoReloadConfig + ", autoReloadFromPreload=" + autoReloadFromPreloadConfig + ", reloadTermsArticle=" + str2 + ")";
    }
}
