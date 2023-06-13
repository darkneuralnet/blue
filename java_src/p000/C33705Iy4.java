package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.RepairCategory;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m28432d2 = {"LIy4;", "", "Lco/bird/android/model/RepairCategory;", C17296a.f69688o, "LH6;", "b", "", "c", "category", "section", "selectable", DateTokenConverter.CONVERTER_KEY, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Lco/bird/android/model/RepairCategory;", "e", "()Lco/bird/android/model/RepairCategory;", "LH6;", "f", "()LH6;", "Z", "g", "()Z", "<init>", "(Lco/bird/android/model/RepairCategory;LH6;Z)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Iy4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33705Iy4 {

    /* renamed from: a */
    public final RepairCategory f16530a;

    /* renamed from: b */
    public final C3023H6 f16531b;

    /* renamed from: c */
    public final boolean f16532c;

    public C33705Iy4(RepairCategory category, C3023H6 section, boolean z) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(section, "section");
        this.f16530a = category;
        this.f16531b = section;
        this.f16532c = z;
    }

    public static /* synthetic */ C33705Iy4 copy$default(C33705Iy4 c33705Iy4, RepairCategory repairCategory, C3023H6 c3023h6, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            repairCategory = c33705Iy4.f16530a;
        }
        if ((i & 2) != 0) {
            c3023h6 = c33705Iy4.f16531b;
        }
        if ((i & 4) != 0) {
            z = c33705Iy4.f16532c;
        }
        return c33705Iy4.m101431d(repairCategory, c3023h6, z);
    }

    /* renamed from: a */
    public final RepairCategory m101434a() {
        return this.f16530a;
    }

    /* renamed from: b */
    public final C3023H6 m101433b() {
        return this.f16531b;
    }

    /* renamed from: c */
    public final boolean m101432c() {
        return this.f16532c;
    }

    /* renamed from: d */
    public final C33705Iy4 m101431d(RepairCategory category, C3023H6 section, boolean z) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(section, "section");
        return new C33705Iy4(category, section, z);
    }

    /* renamed from: e */
    public final RepairCategory m101430e() {
        return this.f16530a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C33705Iy4) {
            C33705Iy4 c33705Iy4 = (C33705Iy4) obj;
            return Intrinsics.areEqual(this.f16530a, c33705Iy4.f16530a) && Intrinsics.areEqual(this.f16531b, c33705Iy4.f16531b) && this.f16532c == c33705Iy4.f16532c;
        }
        return false;
    }

    /* renamed from: f */
    public final C3023H6 m101429f() {
        return this.f16531b;
    }

    /* renamed from: g */
    public final boolean m101428g() {
        return this.f16532c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f16530a.hashCode() * 31) + this.f16531b.hashCode()) * 31;
        boolean z = this.f16532c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        RepairCategory repairCategory = this.f16530a;
        C3023H6 c3023h6 = this.f16531b;
        boolean z = this.f16532c;
        return "RepairCategoryViewModel(category=" + repairCategory + ", section=" + c3023h6 + ", selectable=" + z + ")";
    }
}
