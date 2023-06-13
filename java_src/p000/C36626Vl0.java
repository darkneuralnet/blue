package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.ColoredBackgroundable;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m28432d2 = {"LVl0;", "Lco/bird/android/model/ColoredBackgroundable;", "", "header", "", "canCollapse", "collapsedInitially", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "backgroundColor", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "b", "Z", "()Z", "c", "e", "(Z)V", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "getBackgroundColor", "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "<init>", "(Ljava/lang/String;ZZLco/bird/android/model/persistence/nestedstructures/ThemedColors;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Vl0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36626Vl0 implements ColoredBackgroundable {

    /* renamed from: a */
    public final String f39695a;

    /* renamed from: b */
    public final boolean f39696b;

    /* renamed from: c */
    public boolean f39697c;

    /* renamed from: d */
    public final ThemedColors f39698d;

    public C36626Vl0(String header, boolean z, boolean z2, ThemedColors themedColors) {
        Intrinsics.checkNotNullParameter(header, "header");
        this.f39695a = header;
        this.f39696b = z;
        this.f39697c = z2;
        this.f39698d = themedColors;
    }

    public static /* synthetic */ C36626Vl0 copy$default(C36626Vl0 c36626Vl0, String str, boolean z, boolean z2, ThemedColors themedColors, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c36626Vl0.f39695a;
        }
        if ((i & 2) != 0) {
            z = c36626Vl0.f39696b;
        }
        if ((i & 4) != 0) {
            z2 = c36626Vl0.f39697c;
        }
        if ((i & 8) != 0) {
            themedColors = c36626Vl0.f39698d;
        }
        return c36626Vl0.m79463a(str, z, z2, themedColors);
    }

    /* renamed from: a */
    public final C36626Vl0 m79463a(String header, boolean z, boolean z2, ThemedColors themedColors) {
        Intrinsics.checkNotNullParameter(header, "header");
        return new C36626Vl0(header, z, z2, themedColors);
    }

    /* renamed from: b */
    public final boolean m79462b() {
        return this.f39696b;
    }

    /* renamed from: c */
    public final boolean m79461c() {
        return this.f39697c;
    }

    /* renamed from: d */
    public final String m79460d() {
        return this.f39695a;
    }

    /* renamed from: e */
    public final void m79459e(boolean z) {
        this.f39697c = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C36626Vl0) {
            C36626Vl0 c36626Vl0 = (C36626Vl0) obj;
            return Intrinsics.areEqual(this.f39695a, c36626Vl0.f39695a) && this.f39696b == c36626Vl0.f39696b && this.f39697c == c36626Vl0.f39697c && Intrinsics.areEqual(this.f39698d, c36626Vl0.f39698d);
        }
        return false;
    }

    @Override // co.bird.android.model.ColoredBackgroundable
    public ThemedColors getBackgroundColor() {
        return this.f39698d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f39695a.hashCode() * 31;
        boolean z = this.f39696b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f39697c;
        int i3 = (i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        ThemedColors themedColors = this.f39698d;
        return i3 + (themedColors == null ? 0 : themedColors.hashCode());
    }

    public String toString() {
        String str = this.f39695a;
        boolean z = this.f39696b;
        boolean z2 = this.f39697c;
        ThemedColors themedColors = this.f39698d;
        return "CollapsableHeaderViewModel(header=" + str + ", canCollapse=" + z + ", collapsedInitially=" + z2 + ", backgroundColor=" + themedColors + ")";
    }

    public /* synthetic */ C36626Vl0(String str, boolean z, boolean z2, ThemedColors themedColors, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : themedColors);
    }
}
