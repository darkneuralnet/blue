package co.bird.android.model;

import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/model/AreaRefreshButton;", "Lco/bird/android/model/AreaBottomSheetButton;", Entry.TYPE_TEXT, "", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class AreaRefreshButton extends AreaBottomSheetButton {
    private final String text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AreaRefreshButton(String text) {
        super(null);
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
    }

    public static /* synthetic */ AreaRefreshButton copy$default(AreaRefreshButton areaRefreshButton, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = areaRefreshButton.text;
        }
        return areaRefreshButton.copy(str);
    }

    public final String component1() {
        return this.text;
    }

    public final AreaRefreshButton copy(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new AreaRefreshButton(text);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AreaRefreshButton) && Intrinsics.areEqual(this.text, ((AreaRefreshButton) obj).text);
    }

    @Override // co.bird.android.model.AreaBottomSheetButton
    public String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode();
    }

    public String toString() {
        String str = this.text;
        return "AreaRefreshButton(text=" + str + ")";
    }
}
