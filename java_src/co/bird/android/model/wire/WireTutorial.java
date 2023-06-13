package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00120\u0010HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008d\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0010HÆ\u0001J\u0013\u00100\u001a\u00020\u00052\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0007HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00064"}, m28432d2 = {"Lco/bird/android/model/wire/WireTutorial;", "", "id", "", "skippable", "", "viewCount", "", "header", "title", "asset", "Lco/bird/android/model/wire/WireLegacyAsset;", "menuTitle", "menuAsset", "buttonText", "birdModels", "", "pages", "Lco/bird/android/model/wire/WireTutorialPage;", "(Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireLegacyAsset;Ljava/lang/String;Lco/bird/android/model/wire/WireLegacyAsset;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getAsset", "()Lco/bird/android/model/wire/WireLegacyAsset;", "getBirdModels", "()Ljava/util/List;", "getButtonText", "()Ljava/lang/String;", "getHeader", "getId", "getMenuAsset", "getMenuTitle", "getPages", "getSkippable", "()Z", "getTitle", "getViewCount", "()I", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireTutorial {
    @JsonProperty("asset")
    @InterfaceC41208ft5("asset")
    private final WireLegacyAsset asset;
    @JsonProperty("bird_models")
    @InterfaceC41208ft5("bird_models")
    private final List<String> birdModels;
    @JsonProperty("button_text")
    @InterfaceC41208ft5("button_text")
    private final String buttonText;
    @JsonProperty("header")
    @InterfaceC41208ft5("header")
    private final String header;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66772id;
    @JsonProperty("menu_asset")
    @InterfaceC41208ft5("menu_asset")
    private final WireLegacyAsset menuAsset;
    @JsonProperty("menu_title")
    @InterfaceC41208ft5("menu_title")
    private final String menuTitle;
    @JsonProperty("pages")
    @InterfaceC41208ft5("pages")
    private final List<WireTutorialPage> pages;
    @JsonProperty("skippable")
    @InterfaceC41208ft5("skippable")
    private final boolean skippable;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("view_count")
    @InterfaceC41208ft5("view_count")
    private final int viewCount;

    public WireTutorial(String id, boolean z, int i, String header, String str, WireLegacyAsset wireLegacyAsset, String str2, WireLegacyAsset wireLegacyAsset2, String str3, List<String> birdModels, List<WireTutorialPage> pages) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(birdModels, "birdModels");
        Intrinsics.checkNotNullParameter(pages, "pages");
        this.f66772id = id;
        this.skippable = z;
        this.viewCount = i;
        this.header = header;
        this.title = str;
        this.asset = wireLegacyAsset;
        this.menuTitle = str2;
        this.menuAsset = wireLegacyAsset2;
        this.buttonText = str3;
        this.birdModels = birdModels;
        this.pages = pages;
    }

    public final String component1() {
        return this.f66772id;
    }

    public final List<String> component10() {
        return this.birdModels;
    }

    public final List<WireTutorialPage> component11() {
        return this.pages;
    }

    public final boolean component2() {
        return this.skippable;
    }

    public final int component3() {
        return this.viewCount;
    }

    public final String component4() {
        return this.header;
    }

    public final String component5() {
        return this.title;
    }

    public final WireLegacyAsset component6() {
        return this.asset;
    }

    public final String component7() {
        return this.menuTitle;
    }

    public final WireLegacyAsset component8() {
        return this.menuAsset;
    }

    public final String component9() {
        return this.buttonText;
    }

    public final WireTutorial copy(String id, boolean z, int i, String header, String str, WireLegacyAsset wireLegacyAsset, String str2, WireLegacyAsset wireLegacyAsset2, String str3, List<String> birdModels, List<WireTutorialPage> pages) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(birdModels, "birdModels");
        Intrinsics.checkNotNullParameter(pages, "pages");
        return new WireTutorial(id, z, i, header, str, wireLegacyAsset, str2, wireLegacyAsset2, str3, birdModels, pages);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireTutorial) {
            WireTutorial wireTutorial = (WireTutorial) obj;
            return Intrinsics.areEqual(this.f66772id, wireTutorial.f66772id) && this.skippable == wireTutorial.skippable && this.viewCount == wireTutorial.viewCount && Intrinsics.areEqual(this.header, wireTutorial.header) && Intrinsics.areEqual(this.title, wireTutorial.title) && Intrinsics.areEqual(this.asset, wireTutorial.asset) && Intrinsics.areEqual(this.menuTitle, wireTutorial.menuTitle) && Intrinsics.areEqual(this.menuAsset, wireTutorial.menuAsset) && Intrinsics.areEqual(this.buttonText, wireTutorial.buttonText) && Intrinsics.areEqual(this.birdModels, wireTutorial.birdModels) && Intrinsics.areEqual(this.pages, wireTutorial.pages);
        }
        return false;
    }

    public final WireLegacyAsset getAsset() {
        return this.asset;
    }

    public final List<String> getBirdModels() {
        return this.birdModels;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getId() {
        return this.f66772id;
    }

    public final WireLegacyAsset getMenuAsset() {
        return this.menuAsset;
    }

    public final String getMenuTitle() {
        return this.menuTitle;
    }

    public final List<WireTutorialPage> getPages() {
        return this.pages;
    }

    public final boolean getSkippable() {
        return this.skippable;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getViewCount() {
        return this.viewCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f66772id.hashCode() * 31;
        boolean z = this.skippable;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((((hashCode + i) * 31) + Integer.hashCode(this.viewCount)) * 31) + this.header.hashCode()) * 31;
        String str = this.title;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        WireLegacyAsset wireLegacyAsset = this.asset;
        int hashCode4 = (hashCode3 + (wireLegacyAsset == null ? 0 : wireLegacyAsset.hashCode())) * 31;
        String str2 = this.menuTitle;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        WireLegacyAsset wireLegacyAsset2 = this.menuAsset;
        int hashCode6 = (hashCode5 + (wireLegacyAsset2 == null ? 0 : wireLegacyAsset2.hashCode())) * 31;
        String str3 = this.buttonText;
        return ((((hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.birdModels.hashCode()) * 31) + this.pages.hashCode();
    }

    public String toString() {
        String str = this.f66772id;
        boolean z = this.skippable;
        int i = this.viewCount;
        String str2 = this.header;
        String str3 = this.title;
        WireLegacyAsset wireLegacyAsset = this.asset;
        String str4 = this.menuTitle;
        WireLegacyAsset wireLegacyAsset2 = this.menuAsset;
        String str5 = this.buttonText;
        List<String> list = this.birdModels;
        List<WireTutorialPage> list2 = this.pages;
        return "WireTutorial(id=" + str + ", skippable=" + z + ", viewCount=" + i + ", header=" + str2 + ", title=" + str3 + ", asset=" + wireLegacyAsset + ", menuTitle=" + str4 + ", menuAsset=" + wireLegacyAsset2 + ", buttonText=" + str5 + ", birdModels=" + list + ", pages=" + list2 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WireTutorial(String str, boolean z, int i, String str2, String str3, WireLegacyAsset wireLegacyAsset, String str4, WireLegacyAsset wireLegacyAsset2, String str5, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, i, str2, r8, r9, r10, r11, r12, r13, list2);
        List list3;
        List emptyList;
        String str6 = (i2 & 16) != 0 ? null : str3;
        WireLegacyAsset wireLegacyAsset3 = (i2 & 32) != 0 ? null : wireLegacyAsset;
        String str7 = (i2 & 64) != 0 ? null : str4;
        WireLegacyAsset wireLegacyAsset4 = (i2 & 128) != 0 ? null : wireLegacyAsset2;
        String str8 = (i2 & 256) != 0 ? null : str5;
        if ((i2 & 512) != 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            list3 = emptyList;
        } else {
            list3 = list;
        }
    }
}
