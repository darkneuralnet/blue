package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/AnnouncementPage;", "", "title", "", "message", "titleAsset", "Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;)V", "getMessage", "()Ljava/lang/String;", "getTitle", "getTitleAsset", "()Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class AnnouncementPage {
    @JsonProperty("message")
    @InterfaceC41208ft5("message")
    private final String message;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("title_asset")
    @InterfaceC41208ft5("title_asset")
    private final LegacyAsset titleAsset;

    public AnnouncementPage() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ AnnouncementPage copy$default(AnnouncementPage announcementPage, String str, String str2, LegacyAsset legacyAsset, int i, Object obj) {
        if ((i & 1) != 0) {
            str = announcementPage.title;
        }
        if ((i & 2) != 0) {
            str2 = announcementPage.message;
        }
        if ((i & 4) != 0) {
            legacyAsset = announcementPage.titleAsset;
        }
        return announcementPage.copy(str, str2, legacyAsset);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.message;
    }

    public final LegacyAsset component3() {
        return this.titleAsset;
    }

    public final AnnouncementPage copy(String str, String str2, LegacyAsset legacyAsset) {
        return new AnnouncementPage(str, str2, legacyAsset);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnnouncementPage) {
            AnnouncementPage announcementPage = (AnnouncementPage) obj;
            return Intrinsics.areEqual(this.title, announcementPage.title) && Intrinsics.areEqual(this.message, announcementPage.message) && Intrinsics.areEqual(this.titleAsset, announcementPage.titleAsset);
        }
        return false;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTitle() {
        return this.title;
    }

    public final LegacyAsset getTitleAsset() {
        return this.titleAsset;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        LegacyAsset legacyAsset = this.titleAsset;
        return hashCode2 + (legacyAsset != null ? legacyAsset.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.message;
        LegacyAsset legacyAsset = this.titleAsset;
        return "AnnouncementPage(title=" + str + ", message=" + str2 + ", titleAsset=" + legacyAsset + ")";
    }

    public AnnouncementPage(String str, String str2, LegacyAsset legacyAsset) {
        this.title = str;
        this.message = str2;
        this.titleAsset = legacyAsset;
    }

    public /* synthetic */ AnnouncementPage(String str, String str2, LegacyAsset legacyAsset, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : legacyAsset);
    }
}
