package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.RepairCategory;
import co.bird.android.model.wire.WireQuickLink;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m28432d2 = {"Lo66;", "", "Lco/bird/android/model/wire/WireQuickLink;", C17296a.f69688o, "Lco/bird/android/model/RepairCategory;", "b", "LH6;", "c", "trainingGuide", "category", "section", DateTokenConverter.CONVERTER_KEY, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/wire/WireQuickLink;", "g", "()Lco/bird/android/model/wire/WireQuickLink;", "Lco/bird/android/model/RepairCategory;", "e", "()Lco/bird/android/model/RepairCategory;", "LH6;", "f", "()LH6;", "<init>", "(Lco/bird/android/model/wire/WireQuickLink;Lco/bird/android/model/RepairCategory;LH6;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: o66  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46082o66 {

    /* renamed from: a */
    public final WireQuickLink f101391a;

    /* renamed from: b */
    public final RepairCategory f101392b;

    /* renamed from: c */
    public final C3023H6 f101393c;

    public C46082o66(WireQuickLink trainingGuide, RepairCategory repairCategory, C3023H6 c3023h6) {
        Intrinsics.checkNotNullParameter(trainingGuide, "trainingGuide");
        this.f101391a = trainingGuide;
        this.f101392b = repairCategory;
        this.f101393c = c3023h6;
    }

    public static /* synthetic */ C46082o66 copy$default(C46082o66 c46082o66, WireQuickLink wireQuickLink, RepairCategory repairCategory, C3023H6 c3023h6, int i, Object obj) {
        if ((i & 1) != 0) {
            wireQuickLink = c46082o66.f101391a;
        }
        if ((i & 2) != 0) {
            repairCategory = c46082o66.f101392b;
        }
        if ((i & 4) != 0) {
            c3023h6 = c46082o66.f101393c;
        }
        return c46082o66.m21768d(wireQuickLink, repairCategory, c3023h6);
    }

    /* renamed from: a */
    public final WireQuickLink m21771a() {
        return this.f101391a;
    }

    /* renamed from: b */
    public final RepairCategory m21770b() {
        return this.f101392b;
    }

    /* renamed from: c */
    public final C3023H6 m21769c() {
        return this.f101393c;
    }

    /* renamed from: d */
    public final C46082o66 m21768d(WireQuickLink trainingGuide, RepairCategory repairCategory, C3023H6 c3023h6) {
        Intrinsics.checkNotNullParameter(trainingGuide, "trainingGuide");
        return new C46082o66(trainingGuide, repairCategory, c3023h6);
    }

    /* renamed from: e */
    public final RepairCategory m21767e() {
        return this.f101392b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C46082o66) {
            C46082o66 c46082o66 = (C46082o66) obj;
            return Intrinsics.areEqual(this.f101391a, c46082o66.f101391a) && Intrinsics.areEqual(this.f101392b, c46082o66.f101392b) && Intrinsics.areEqual(this.f101393c, c46082o66.f101393c);
        }
        return false;
    }

    /* renamed from: f */
    public final C3023H6 m21766f() {
        return this.f101393c;
    }

    /* renamed from: g */
    public final WireQuickLink m21765g() {
        return this.f101391a;
    }

    public int hashCode() {
        int hashCode = this.f101391a.hashCode() * 31;
        RepairCategory repairCategory = this.f101392b;
        int hashCode2 = (hashCode + (repairCategory == null ? 0 : repairCategory.hashCode())) * 31;
        C3023H6 c3023h6 = this.f101393c;
        return hashCode2 + (c3023h6 != null ? c3023h6.hashCode() : 0);
    }

    public String toString() {
        WireQuickLink wireQuickLink = this.f101391a;
        RepairCategory repairCategory = this.f101392b;
        C3023H6 c3023h6 = this.f101393c;
        return "TrainingGuideViewModel(trainingGuide=" + wireQuickLink + ", category=" + repairCategory + ", section=" + c3023h6 + ")";
    }
}
