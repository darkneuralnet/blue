package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/model/persistence/OperatorOrderViewSection;", "", "title", "", "idx", "", "(Ljava/lang/String;I)V", "getIdx", "()I", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorOrderViewSection {
    private final int idx;
    private final String title;

    public OperatorOrderViewSection(String title, int i) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.idx = i;
    }

    public static /* synthetic */ OperatorOrderViewSection copy$default(OperatorOrderViewSection operatorOrderViewSection, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = operatorOrderViewSection.title;
        }
        if ((i2 & 2) != 0) {
            i = operatorOrderViewSection.idx;
        }
        return operatorOrderViewSection.copy(str, i);
    }

    public final String component1() {
        return this.title;
    }

    public final int component2() {
        return this.idx;
    }

    public final OperatorOrderViewSection copy(String title, int i) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new OperatorOrderViewSection(title, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorOrderViewSection) {
            OperatorOrderViewSection operatorOrderViewSection = (OperatorOrderViewSection) obj;
            return Intrinsics.areEqual(this.title, operatorOrderViewSection.title) && this.idx == operatorOrderViewSection.idx;
        }
        return false;
    }

    public final int getIdx() {
        return this.idx;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + Integer.hashCode(this.idx);
    }

    public String toString() {
        String str = this.title;
        int i = this.idx;
        return "OperatorOrderViewSection(title=" + str + ", idx=" + i + ")";
    }
}
