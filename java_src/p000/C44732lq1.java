package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.FleetReport;
import co.bird.android.model.persistence.FleetReportPeriod;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0003\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b \u0010!J/\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R$\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u0013\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\""}, m28432d2 = {"Llq1;", "", "Lco/bird/android/model/persistence/FleetReport;", "report", "", "Lco/bird/android/model/persistence/FleetReportPeriod;", "periods", "", "loading", C17296a.f69688o, "", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/persistence/FleetReport;", "e", "()Lco/bird/android/model/persistence/FleetReport;", "b", "Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "c", "I", "()I", "", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "f", "(Ljava/lang/Throwable;)V", "error", "<init>", "(Lco/bird/android/model/persistence/FleetReport;Ljava/util/List;I)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: lq1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44732lq1 {

    /* renamed from: a */
    public final FleetReport f96787a;

    /* renamed from: b */
    public final List<FleetReportPeriod> f96788b;

    /* renamed from: c */
    public final int f96789c;

    /* renamed from: d */
    public Throwable f96790d;

    public C44732lq1() {
        this(null, null, 0, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C44732lq1 copy$default(C44732lq1 c44732lq1, FleetReport fleetReport, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            fleetReport = c44732lq1.f96787a;
        }
        if ((i2 & 2) != 0) {
            list = c44732lq1.f96788b;
        }
        if ((i2 & 4) != 0) {
            i = c44732lq1.f96789c;
        }
        return c44732lq1.m26753a(fleetReport, list, i);
    }

    /* renamed from: a */
    public final C44732lq1 m26753a(FleetReport fleetReport, List<FleetReportPeriod> periods, int i) {
        Intrinsics.checkNotNullParameter(periods, "periods");
        return new C44732lq1(fleetReport, periods, i);
    }

    /* renamed from: b */
    public final Throwable m26752b() {
        return this.f96790d;
    }

    /* renamed from: c */
    public final int m26751c() {
        return this.f96789c;
    }

    /* renamed from: d */
    public final List<FleetReportPeriod> m26750d() {
        return this.f96788b;
    }

    /* renamed from: e */
    public final FleetReport m26749e() {
        return this.f96787a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C44732lq1) {
            C44732lq1 c44732lq1 = (C44732lq1) obj;
            return Intrinsics.areEqual(this.f96787a, c44732lq1.f96787a) && Intrinsics.areEqual(this.f96788b, c44732lq1.f96788b) && this.f96789c == c44732lq1.f96789c;
        }
        return false;
    }

    /* renamed from: f */
    public final void m26748f(Throwable th) {
        this.f96790d = th;
    }

    public int hashCode() {
        FleetReport fleetReport = this.f96787a;
        return ((((fleetReport == null ? 0 : fleetReport.hashCode()) * 31) + this.f96788b.hashCode()) * 31) + Integer.hashCode(this.f96789c);
    }

    public String toString() {
        FleetReport fleetReport = this.f96787a;
        List<FleetReportPeriod> list = this.f96788b;
        int i = this.f96789c;
        return "FleetReportState(report=" + fleetReport + ", periods=" + list + ", loading=" + i + ")";
    }

    public C44732lq1(FleetReport fleetReport, List<FleetReportPeriod> periods, int i) {
        Intrinsics.checkNotNullParameter(periods, "periods");
        this.f96787a = fleetReport;
        this.f96788b = periods;
        this.f96789c = i;
    }

    public /* synthetic */ C44732lq1(FleetReport fleetReport, List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : fleetReport, (i2 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? 0 : i);
    }
}
