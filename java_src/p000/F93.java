package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.NonRepair;
import co.bird.android.model.NonRepairReason;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m28432d2 = {"LF93;", "", "Lco/bird/android/model/NonRepair;", "nonRepair", "Lco/bird/android/model/NonRepairReason;", "selectedReason", "selectedSubreason", "", "submitEnabled", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Lco/bird/android/model/NonRepair;", "b", "()Lco/bird/android/model/NonRepair;", "Lco/bird/android/model/NonRepairReason;", "c", "()Lco/bird/android/model/NonRepairReason;", DateTokenConverter.CONVERTER_KEY, "Z", "e", "()Z", "<init>", "(Lco/bird/android/model/NonRepair;Lco/bird/android/model/NonRepairReason;Lco/bird/android/model/NonRepairReason;Z)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: F93 */
/* loaded from: classes3.dex */
public final class F93 {

    /* renamed from: a */
    public final NonRepair f8913a;

    /* renamed from: b */
    public final NonRepairReason f8914b;

    /* renamed from: c */
    public final NonRepairReason f8915c;

    /* renamed from: d */
    public final boolean f8916d;

    public F93() {
        this(null, null, null, false, 15, null);
    }

    public static /* synthetic */ F93 copy$default(F93 f93, NonRepair nonRepair, NonRepairReason nonRepairReason, NonRepairReason nonRepairReason2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            nonRepair = f93.f8913a;
        }
        if ((i & 2) != 0) {
            nonRepairReason = f93.f8914b;
        }
        if ((i & 4) != 0) {
            nonRepairReason2 = f93.f8915c;
        }
        if ((i & 8) != 0) {
            z = f93.f8916d;
        }
        return f93.m107556a(nonRepair, nonRepairReason, nonRepairReason2, z);
    }

    /* renamed from: a */
    public final F93 m107556a(NonRepair nonRepair, NonRepairReason nonRepairReason, NonRepairReason nonRepairReason2, boolean z) {
        return new F93(nonRepair, nonRepairReason, nonRepairReason2, z);
    }

    /* renamed from: b */
    public final NonRepair m107555b() {
        return this.f8913a;
    }

    /* renamed from: c */
    public final NonRepairReason m107554c() {
        return this.f8914b;
    }

    /* renamed from: d */
    public final NonRepairReason m107553d() {
        return this.f8915c;
    }

    /* renamed from: e */
    public final boolean m107552e() {
        return this.f8916d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof F93) {
            F93 f93 = (F93) obj;
            return Intrinsics.areEqual(this.f8913a, f93.f8913a) && Intrinsics.areEqual(this.f8914b, f93.f8914b) && Intrinsics.areEqual(this.f8915c, f93.f8915c) && this.f8916d == f93.f8916d;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        NonRepair nonRepair = this.f8913a;
        int hashCode = (nonRepair == null ? 0 : nonRepair.hashCode()) * 31;
        NonRepairReason nonRepairReason = this.f8914b;
        int hashCode2 = (hashCode + (nonRepairReason == null ? 0 : nonRepairReason.hashCode())) * 31;
        NonRepairReason nonRepairReason2 = this.f8915c;
        int hashCode3 = (hashCode2 + (nonRepairReason2 != null ? nonRepairReason2.hashCode() : 0)) * 31;
        boolean z = this.f8916d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode3 + i;
    }

    public String toString() {
        NonRepair nonRepair = this.f8913a;
        NonRepairReason nonRepairReason = this.f8914b;
        NonRepairReason nonRepairReason2 = this.f8915c;
        boolean z = this.f8916d;
        return "NonRepairSurveyState(nonRepair=" + nonRepair + ", selectedReason=" + nonRepairReason + ", selectedSubreason=" + nonRepairReason2 + ", submitEnabled=" + z + ")";
    }

    public F93(NonRepair nonRepair, NonRepairReason nonRepairReason, NonRepairReason nonRepairReason2, boolean z) {
        this.f8913a = nonRepair;
        this.f8914b = nonRepairReason;
        this.f8915c = nonRepairReason2;
        this.f8916d = z;
    }

    public /* synthetic */ F93(NonRepair nonRepair, NonRepairReason nonRepairReason, NonRepairReason nonRepairReason2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : nonRepair, (i & 2) != 0 ? null : nonRepairReason, (i & 4) != 0 ? null : nonRepairReason2, (i & 8) != 0 ? false : z);
    }
}
