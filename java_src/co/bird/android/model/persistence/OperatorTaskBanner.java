package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/model/persistence/OperatorTaskBanner;", "", "title", "", "titleColor", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "backgroundColor", "(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)V", "getBackgroundColor", "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "getTitle", "()Ljava/lang/String;", "getTitleColor", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorTaskBanner {
    private final ThemedColors backgroundColor;
    private final String title;
    private final ThemedColors titleColor;

    public OperatorTaskBanner(String title, ThemedColors titleColor, ThemedColors backgroundColor) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleColor, "titleColor");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.title = title;
        this.titleColor = titleColor;
        this.backgroundColor = backgroundColor;
    }

    public static /* synthetic */ OperatorTaskBanner copy$default(OperatorTaskBanner operatorTaskBanner, String str, ThemedColors themedColors, ThemedColors themedColors2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = operatorTaskBanner.title;
        }
        if ((i & 2) != 0) {
            themedColors = operatorTaskBanner.titleColor;
        }
        if ((i & 4) != 0) {
            themedColors2 = operatorTaskBanner.backgroundColor;
        }
        return operatorTaskBanner.copy(str, themedColors, themedColors2);
    }

    public final String component1() {
        return this.title;
    }

    public final ThemedColors component2() {
        return this.titleColor;
    }

    public final ThemedColors component3() {
        return this.backgroundColor;
    }

    public final OperatorTaskBanner copy(String title, ThemedColors titleColor, ThemedColors backgroundColor) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleColor, "titleColor");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new OperatorTaskBanner(title, titleColor, backgroundColor);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorTaskBanner) {
            OperatorTaskBanner operatorTaskBanner = (OperatorTaskBanner) obj;
            return Intrinsics.areEqual(this.title, operatorTaskBanner.title) && Intrinsics.areEqual(this.titleColor, operatorTaskBanner.titleColor) && Intrinsics.areEqual(this.backgroundColor, operatorTaskBanner.backgroundColor);
        }
        return false;
    }

    public final ThemedColors getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ThemedColors getTitleColor() {
        return this.titleColor;
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.titleColor.hashCode()) * 31) + this.backgroundColor.hashCode();
    }

    public String toString() {
        String str = this.title;
        ThemedColors themedColors = this.titleColor;
        ThemedColors themedColors2 = this.backgroundColor;
        return "OperatorTaskBanner(title=" + str + ", titleColor=" + themedColors + ", backgroundColor=" + themedColors2 + ")";
    }
}
