package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/BountyReason;", "", "key", "", Entry.TYPE_TEXT, "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BountyReason {
    @JsonProperty("key")
    @InterfaceC41208ft5("key")
    private final String key;
    @JsonProperty(Entry.TYPE_TEXT)
    @InterfaceC41208ft5(Entry.TYPE_TEXT)
    private final String text;

    public BountyReason() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ BountyReason copy$default(BountyReason bountyReason, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bountyReason.key;
        }
        if ((i & 2) != 0) {
            str2 = bountyReason.text;
        }
        return bountyReason.copy(str, str2);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.text;
    }

    public final BountyReason copy(String key, String text) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(text, "text");
        return new BountyReason(key, text);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BountyReason) {
            BountyReason bountyReason = (BountyReason) obj;
            return Intrinsics.areEqual(this.key, bountyReason.key) && Intrinsics.areEqual(this.text, bountyReason.text);
        }
        return false;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (this.key.hashCode() * 31) + this.text.hashCode();
    }

    public String toString() {
        String str = this.key;
        String str2 = this.text;
        return "BountyReason(key=" + str + ", text=" + str2 + ")";
    }

    public BountyReason(String key, String text) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(text, "text");
        this.key = key;
        this.text = text;
    }

    public /* synthetic */ BountyReason(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
