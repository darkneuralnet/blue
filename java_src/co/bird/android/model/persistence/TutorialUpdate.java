package co.bird.android.model.persistence;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ConfigurableTutorialContext;
import co.bird.android.model.persistence.nestedstructures.LegacyAsset;
import co.bird.android.model.persistence.nestedstructures.TutorialPage;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0017J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010HÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00120\u0010HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J½\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010<\u001a\u00020\u00072\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001d¨\u0006A"}, m28432d2 = {"Lco/bird/android/model/persistence/TutorialUpdate;", "", "id", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Lco/bird/android/model/constant/ConfigurableTutorialContext;", "skippable", "", "header", "title", "asset", "Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;", "menuTitle", "menuAsset", "buttonText", "birdModels", "", "pages", "Lco/bird/android/model/persistence/nestedstructures/TutorialPage;", "groupHeader", "groupTitle", "groupMessage", "groupButtonText", "(Ljava/lang/String;Lco/bird/android/model/constant/ConfigurableTutorialContext;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAsset", "()Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;", "getBirdModels", "()Ljava/util/List;", "getButtonText", "()Ljava/lang/String;", "getContext", "()Lco/bird/android/model/constant/ConfigurableTutorialContext;", "getGroupButtonText", "getGroupHeader", "getGroupMessage", "getGroupTitle", "getHeader", "getId", "getMenuAsset", "getMenuTitle", "getPages", "getSkippable", "()Z", "getTitle", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TutorialUpdate {
    private final LegacyAsset asset;
    private final List<String> birdModels;
    private final String buttonText;
    private final ConfigurableTutorialContext context;
    private final String groupButtonText;
    private final String groupHeader;
    private final String groupMessage;
    private final String groupTitle;
    private final String header;

    /* renamed from: id */
    private final String f66690id;
    private final LegacyAsset menuAsset;
    private final String menuTitle;
    private final List<TutorialPage> pages;
    private final boolean skippable;
    private final String title;

    public TutorialUpdate(String id, ConfigurableTutorialContext context, boolean z, String header, String str, LegacyAsset legacyAsset, String str2, LegacyAsset legacyAsset2, String str3, List<String> birdModels, List<TutorialPage> pages, String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(birdModels, "birdModels");
        Intrinsics.checkNotNullParameter(pages, "pages");
        this.f66690id = id;
        this.context = context;
        this.skippable = z;
        this.header = header;
        this.title = str;
        this.asset = legacyAsset;
        this.menuTitle = str2;
        this.menuAsset = legacyAsset2;
        this.buttonText = str3;
        this.birdModels = birdModels;
        this.pages = pages;
        this.groupHeader = str4;
        this.groupTitle = str5;
        this.groupMessage = str6;
        this.groupButtonText = str7;
    }

    public final String component1() {
        return this.f66690id;
    }

    public final List<String> component10() {
        return this.birdModels;
    }

    public final List<TutorialPage> component11() {
        return this.pages;
    }

    public final String component12() {
        return this.groupHeader;
    }

    public final String component13() {
        return this.groupTitle;
    }

    public final String component14() {
        return this.groupMessage;
    }

    public final String component15() {
        return this.groupButtonText;
    }

    public final ConfigurableTutorialContext component2() {
        return this.context;
    }

    public final boolean component3() {
        return this.skippable;
    }

    public final String component4() {
        return this.header;
    }

    public final String component5() {
        return this.title;
    }

    public final LegacyAsset component6() {
        return this.asset;
    }

    public final String component7() {
        return this.menuTitle;
    }

    public final LegacyAsset component8() {
        return this.menuAsset;
    }

    public final String component9() {
        return this.buttonText;
    }

    public final TutorialUpdate copy(String id, ConfigurableTutorialContext context, boolean z, String header, String str, LegacyAsset legacyAsset, String str2, LegacyAsset legacyAsset2, String str3, List<String> birdModels, List<TutorialPage> pages, String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(birdModels, "birdModels");
        Intrinsics.checkNotNullParameter(pages, "pages");
        return new TutorialUpdate(id, context, z, header, str, legacyAsset, str2, legacyAsset2, str3, birdModels, pages, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TutorialUpdate) {
            TutorialUpdate tutorialUpdate = (TutorialUpdate) obj;
            return Intrinsics.areEqual(this.f66690id, tutorialUpdate.f66690id) && this.context == tutorialUpdate.context && this.skippable == tutorialUpdate.skippable && Intrinsics.areEqual(this.header, tutorialUpdate.header) && Intrinsics.areEqual(this.title, tutorialUpdate.title) && Intrinsics.areEqual(this.asset, tutorialUpdate.asset) && Intrinsics.areEqual(this.menuTitle, tutorialUpdate.menuTitle) && Intrinsics.areEqual(this.menuAsset, tutorialUpdate.menuAsset) && Intrinsics.areEqual(this.buttonText, tutorialUpdate.buttonText) && Intrinsics.areEqual(this.birdModels, tutorialUpdate.birdModels) && Intrinsics.areEqual(this.pages, tutorialUpdate.pages) && Intrinsics.areEqual(this.groupHeader, tutorialUpdate.groupHeader) && Intrinsics.areEqual(this.groupTitle, tutorialUpdate.groupTitle) && Intrinsics.areEqual(this.groupMessage, tutorialUpdate.groupMessage) && Intrinsics.areEqual(this.groupButtonText, tutorialUpdate.groupButtonText);
        }
        return false;
    }

    public final LegacyAsset getAsset() {
        return this.asset;
    }

    public final List<String> getBirdModels() {
        return this.birdModels;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final ConfigurableTutorialContext getContext() {
        return this.context;
    }

    public final String getGroupButtonText() {
        return this.groupButtonText;
    }

    public final String getGroupHeader() {
        return this.groupHeader;
    }

    public final String getGroupMessage() {
        return this.groupMessage;
    }

    public final String getGroupTitle() {
        return this.groupTitle;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getId() {
        return this.f66690id;
    }

    public final LegacyAsset getMenuAsset() {
        return this.menuAsset;
    }

    public final String getMenuTitle() {
        return this.menuTitle;
    }

    public final List<TutorialPage> getPages() {
        return this.pages;
    }

    public final boolean getSkippable() {
        return this.skippable;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f66690id.hashCode() * 31) + this.context.hashCode()) * 31;
        boolean z = this.skippable;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((hashCode + i) * 31) + this.header.hashCode()) * 31;
        String str = this.title;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        LegacyAsset legacyAsset = this.asset;
        int hashCode4 = (hashCode3 + (legacyAsset == null ? 0 : legacyAsset.hashCode())) * 31;
        String str2 = this.menuTitle;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LegacyAsset legacyAsset2 = this.menuAsset;
        int hashCode6 = (hashCode5 + (legacyAsset2 == null ? 0 : legacyAsset2.hashCode())) * 31;
        String str3 = this.buttonText;
        int hashCode7 = (((((hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.birdModels.hashCode()) * 31) + this.pages.hashCode()) * 31;
        String str4 = this.groupHeader;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.groupTitle;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.groupMessage;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.groupButtonText;
        return hashCode10 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66690id;
        ConfigurableTutorialContext configurableTutorialContext = this.context;
        boolean z = this.skippable;
        String str2 = this.header;
        String str3 = this.title;
        LegacyAsset legacyAsset = this.asset;
        String str4 = this.menuTitle;
        LegacyAsset legacyAsset2 = this.menuAsset;
        String str5 = this.buttonText;
        List<String> list = this.birdModels;
        List<TutorialPage> list2 = this.pages;
        String str6 = this.groupHeader;
        String str7 = this.groupTitle;
        String str8 = this.groupMessage;
        String str9 = this.groupButtonText;
        return "TutorialUpdate(id=" + str + ", context=" + configurableTutorialContext + ", skippable=" + z + ", header=" + str2 + ", title=" + str3 + ", asset=" + legacyAsset + ", menuTitle=" + str4 + ", menuAsset=" + legacyAsset2 + ", buttonText=" + str5 + ", birdModels=" + list + ", pages=" + list2 + ", groupHeader=" + str6 + ", groupTitle=" + str7 + ", groupMessage=" + str8 + ", groupButtonText=" + str9 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TutorialUpdate(String str, ConfigurableTutorialContext configurableTutorialContext, boolean z, String str2, String str3, LegacyAsset legacyAsset, String str4, LegacyAsset legacyAsset2, String str5, List list, List list2, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, configurableTutorialContext, z, str2, r8, r9, r10, r11, r12, r13, list2, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : str7, (i & 8192) != 0 ? null : str8, (i & 16384) != 0 ? null : str9);
        List list3;
        List emptyList;
        String str10 = (i & 16) != 0 ? null : str3;
        LegacyAsset legacyAsset3 = (i & 32) != 0 ? null : legacyAsset;
        String str11 = (i & 64) != 0 ? null : str4;
        LegacyAsset legacyAsset4 = (i & 128) != 0 ? null : legacyAsset2;
        String str12 = (i & 256) != 0 ? null : str5;
        if ((i & 512) != 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            list3 = emptyList;
        } else {
            list3 = list;
        }
    }
}
