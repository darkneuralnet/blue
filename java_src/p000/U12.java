package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.ColoredBackgroundable;
import co.bird.android.model.FlightSheetButton;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ9\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001d"}, m28432d2 = {"LU12;", "Lco/bird/android/model/ColoredBackgroundable;", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "backgroundColor", "", "title", "subtitle", "Lco/bird/android/model/FlightSheetButton;", "button", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "getBackgroundColor", "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "b", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "c", "Lco/bird/android/model/FlightSheetButton;", "()Lco/bird/android/model/FlightSheetButton;", "<init>", "(Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/FlightSheetButton;)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: U12 */
/* loaded from: classes3.dex */
public final class U12 implements ColoredBackgroundable {

    /* renamed from: a */
    public final ThemedColors f36701a;

    /* renamed from: b */
    public final String f36702b;

    /* renamed from: c */
    public final String f36703c;

    /* renamed from: d */
    public final FlightSheetButton f36704d;

    public U12(ThemedColors themedColors, String str, String str2, FlightSheetButton flightSheetButton) {
        this.f36701a = themedColors;
        this.f36702b = str;
        this.f36703c = str2;
        this.f36704d = flightSheetButton;
    }

    public static /* synthetic */ U12 copy$default(U12 u12, ThemedColors themedColors, String str, String str2, FlightSheetButton flightSheetButton, int i, Object obj) {
        if ((i & 1) != 0) {
            themedColors = u12.f36701a;
        }
        if ((i & 2) != 0) {
            str = u12.f36702b;
        }
        if ((i & 4) != 0) {
            str2 = u12.f36703c;
        }
        if ((i & 8) != 0) {
            flightSheetButton = u12.f36704d;
        }
        return u12.m82111a(themedColors, str, str2, flightSheetButton);
    }

    /* renamed from: a */
    public final U12 m82111a(ThemedColors themedColors, String str, String str2, FlightSheetButton flightSheetButton) {
        return new U12(themedColors, str, str2, flightSheetButton);
    }

    /* renamed from: b */
    public final FlightSheetButton m82110b() {
        return this.f36704d;
    }

    /* renamed from: c */
    public final String m82109c() {
        return this.f36703c;
    }

    /* renamed from: d */
    public final String m82108d() {
        return this.f36702b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof U12) {
            U12 u12 = (U12) obj;
            return Intrinsics.areEqual(this.f36701a, u12.f36701a) && Intrinsics.areEqual(this.f36702b, u12.f36702b) && Intrinsics.areEqual(this.f36703c, u12.f36703c) && Intrinsics.areEqual(this.f36704d, u12.f36704d);
        }
        return false;
    }

    @Override // co.bird.android.model.ColoredBackgroundable
    public ThemedColors getBackgroundColor() {
        return this.f36701a;
    }

    public int hashCode() {
        ThemedColors themedColors = this.f36701a;
        int hashCode = (themedColors == null ? 0 : themedColors.hashCode()) * 31;
        String str = this.f36702b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f36703c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        FlightSheetButton flightSheetButton = this.f36704d;
        return hashCode3 + (flightSheetButton != null ? flightSheetButton.hashCode() : 0);
    }

    public String toString() {
        ThemedColors themedColors = this.f36701a;
        String str = this.f36702b;
        String str2 = this.f36703c;
        FlightSheetButton flightSheetButton = this.f36704d;
        return "InfoSectionActionViewModel(backgroundColor=" + themedColors + ", title=" + str + ", subtitle=" + str2 + ", button=" + flightSheetButton + ")";
    }
}
