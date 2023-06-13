package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/model/wire/WireTutorialQuizNote;", "", Entry.TYPE_TEXT, "", "bold", "", "asset", "Lco/bird/android/model/wire/WireLegacyAsset;", "(Ljava/lang/String;ZLco/bird/android/model/wire/WireLegacyAsset;)V", "getAsset", "()Lco/bird/android/model/wire/WireLegacyAsset;", "getBold", "()Z", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireTutorialQuizNote {
    @JsonProperty("asset")
    @InterfaceC41208ft5("asset")
    private final WireLegacyAsset asset;
    @JsonProperty("bold")
    @InterfaceC41208ft5("bold")
    private final boolean bold;
    @JsonProperty(Entry.TYPE_TEXT)
    @InterfaceC41208ft5(Entry.TYPE_TEXT)
    private final String text;

    public WireTutorialQuizNote(String text, boolean z, WireLegacyAsset wireLegacyAsset) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.bold = z;
        this.asset = wireLegacyAsset;
    }

    public static /* synthetic */ WireTutorialQuizNote copy$default(WireTutorialQuizNote wireTutorialQuizNote, String str, boolean z, WireLegacyAsset wireLegacyAsset, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireTutorialQuizNote.text;
        }
        if ((i & 2) != 0) {
            z = wireTutorialQuizNote.bold;
        }
        if ((i & 4) != 0) {
            wireLegacyAsset = wireTutorialQuizNote.asset;
        }
        return wireTutorialQuizNote.copy(str, z, wireLegacyAsset);
    }

    public final String component1() {
        return this.text;
    }

    public final boolean component2() {
        return this.bold;
    }

    public final WireLegacyAsset component3() {
        return this.asset;
    }

    public final WireTutorialQuizNote copy(String text, boolean z, WireLegacyAsset wireLegacyAsset) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new WireTutorialQuizNote(text, z, wireLegacyAsset);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireTutorialQuizNote) {
            WireTutorialQuizNote wireTutorialQuizNote = (WireTutorialQuizNote) obj;
            return Intrinsics.areEqual(this.text, wireTutorialQuizNote.text) && this.bold == wireTutorialQuizNote.bold && Intrinsics.areEqual(this.asset, wireTutorialQuizNote.asset);
        }
        return false;
    }

    public final WireLegacyAsset getAsset() {
        return this.asset;
    }

    public final boolean getBold() {
        return this.bold;
    }

    public final String getText() {
        return this.text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        boolean z = this.bold;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        WireLegacyAsset wireLegacyAsset = this.asset;
        return i2 + (wireLegacyAsset == null ? 0 : wireLegacyAsset.hashCode());
    }

    public String toString() {
        String str = this.text;
        boolean z = this.bold;
        WireLegacyAsset wireLegacyAsset = this.asset;
        return "WireTutorialQuizNote(text=" + str + ", bold=" + z + ", asset=" + wireLegacyAsset + ")";
    }

    public /* synthetic */ WireTutorialQuizNote(String str, boolean z, WireLegacyAsset wireLegacyAsset, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : wireLegacyAsset);
    }
}
