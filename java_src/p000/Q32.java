package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.InspectionCategory;
import co.bird.android.model.InspectionNotice;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b,\u0010-J:\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\"\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010#\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010!R\u0011\u0010$\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010!R\u0013\u0010%\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010!R\u0011\u0010'\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b&\u0010\u001fR\u0013\u0010+\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006."}, m28432d2 = {"LQ32;", "", "Lco/bird/android/model/InspectionCategory;", "category", "LH6;", "subItemSection", "", "passed", "expanded", C17296a.f69688o, "(Lco/bird/android/model/InspectionCategory;LH6;Ljava/lang/Boolean;Z)LQ32;", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Lco/bird/android/model/InspectionCategory;", "getCategory", "()Lco/bird/android/model/InspectionCategory;", "b", "LH6;", "j", "()LH6;", "c", "Ljava/lang/Boolean;", "i", "()Ljava/lang/Boolean;", DateTokenConverter.CONVERTER_KEY, "Z", "e", "()Z", "f", "()Ljava/lang/String;", "id", "display", "description", "assetUrl", "g", "mutable", "Lco/bird/android/model/InspectionNotice;", "h", "()Lco/bird/android/model/InspectionNotice;", "notice", "<init>", "(Lco/bird/android/model/InspectionCategory;LH6;Ljava/lang/Boolean;Z)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Q32 */
/* loaded from: classes3.dex */
public final class Q32 {

    /* renamed from: a */
    public final InspectionCategory f29748a;

    /* renamed from: b */
    public final C3023H6 f29749b;

    /* renamed from: c */
    public final Boolean f29750c;

    /* renamed from: d */
    public final boolean f29751d;

    public Q32(InspectionCategory category, C3023H6 subItemSection, Boolean bool, boolean z) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(subItemSection, "subItemSection");
        this.f29748a = category;
        this.f29749b = subItemSection;
        this.f29750c = bool;
        this.f29751d = z;
    }

    public static /* synthetic */ Q32 copy$default(Q32 q32, InspectionCategory inspectionCategory, C3023H6 c3023h6, Boolean bool, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            inspectionCategory = q32.f29748a;
        }
        if ((i & 2) != 0) {
            c3023h6 = q32.f29749b;
        }
        if ((i & 4) != 0) {
            bool = q32.f29750c;
        }
        if ((i & 8) != 0) {
            z = q32.f29751d;
        }
        return q32.m89007a(inspectionCategory, c3023h6, bool, z);
    }

    /* renamed from: a */
    public final Q32 m89007a(InspectionCategory category, C3023H6 subItemSection, Boolean bool, boolean z) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(subItemSection, "subItemSection");
        return new Q32(category, subItemSection, bool, z);
    }

    /* renamed from: b */
    public final String m89006b() {
        return this.f29748a.getAssetUrl();
    }

    /* renamed from: c */
    public final String m89005c() {
        return this.f29748a.getDescription();
    }

    /* renamed from: d */
    public final String m89004d() {
        return this.f29748a.getDisplay();
    }

    /* renamed from: e */
    public final boolean m89003e() {
        return this.f29751d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Q32) {
            Q32 q32 = (Q32) obj;
            return Intrinsics.areEqual(this.f29748a, q32.f29748a) && Intrinsics.areEqual(this.f29749b, q32.f29749b) && Intrinsics.areEqual(this.f29750c, q32.f29750c) && this.f29751d == q32.f29751d;
        }
        return false;
    }

    /* renamed from: f */
    public final String m89002f() {
        return this.f29748a.getId();
    }

    /* renamed from: g */
    public final boolean m89001g() {
        return this.f29748a.getMutable();
    }

    /* renamed from: h */
    public final InspectionNotice m89000h() {
        return this.f29748a.getNotice();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f29748a.hashCode() * 31) + this.f29749b.hashCode()) * 31;
        Boolean bool = this.f29750c;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        boolean z = this.f29751d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    /* renamed from: i */
    public final Boolean m88999i() {
        return this.f29750c;
    }

    /* renamed from: j */
    public final C3023H6 m88998j() {
        return this.f29749b;
    }

    public String toString() {
        InspectionCategory inspectionCategory = this.f29748a;
        C3023H6 c3023h6 = this.f29749b;
        Boolean bool = this.f29750c;
        boolean z = this.f29751d;
        return "InspectionCategoryViewModel(category=" + inspectionCategory + ", subItemSection=" + c3023h6 + ", passed=" + bool + ", expanded=" + z + ")";
    }
}
