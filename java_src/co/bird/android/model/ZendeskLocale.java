package co.bird.android.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/model/ZendeskLocale;", "", "locale", "", "default", "", "(Ljava/lang/String;Z)V", "getDefault", "()Z", "getLocale", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ZendeskLocale {
    @JsonProperty("default")
    @InterfaceC41208ft5("default")

    /* renamed from: default  reason: not valid java name */
    private final boolean f122577default;
    @JsonProperty("locale")
    @InterfaceC41208ft5("locale")
    private final String locale;

    public ZendeskLocale() {
        this(null, false, 3, null);
    }

    public static /* synthetic */ ZendeskLocale copy$default(ZendeskLocale zendeskLocale, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zendeskLocale.locale;
        }
        if ((i & 2) != 0) {
            z = zendeskLocale.f122577default;
        }
        return zendeskLocale.copy(str, z);
    }

    public final String component1() {
        return this.locale;
    }

    public final boolean component2() {
        return this.f122577default;
    }

    public final ZendeskLocale copy(String locale, boolean z) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        return new ZendeskLocale(locale, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZendeskLocale) {
            ZendeskLocale zendeskLocale = (ZendeskLocale) obj;
            return Intrinsics.areEqual(this.locale, zendeskLocale.locale) && this.f122577default == zendeskLocale.f122577default;
        }
        return false;
    }

    public final boolean getDefault() {
        return this.f122577default;
    }

    public final String getLocale() {
        return this.locale;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.locale.hashCode() * 31;
        boolean z = this.f122577default;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.locale;
        boolean z = this.f122577default;
        return "ZendeskLocale(locale=" + str + ", default=" + z + ")";
    }

    public ZendeskLocale(String locale, boolean z) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.locale = locale;
        this.f122577default = z;
    }

    public /* synthetic */ ZendeskLocale(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z);
    }
}
