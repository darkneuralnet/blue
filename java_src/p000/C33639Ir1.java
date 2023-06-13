package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.FleetReportPage;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m28432d2 = {"LIr1;", "", "", "fleetId", "", "Lco/bird/android/model/constant/FleetReportPage;", "fleetReportPages", "selectedPage", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lco/bird/android/model/constant/FleetReportPage;", DateTokenConverter.CONVERTER_KEY, "()Lco/bird/android/model/constant/FleetReportPage;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/constant/FleetReportPage;)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ir1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33639Ir1 {

    /* renamed from: a */
    public final String f16320a;

    /* renamed from: b */
    public final List<FleetReportPage> f16321b;

    /* renamed from: c */
    public final FleetReportPage f16322c;

    public C33639Ir1() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C33639Ir1 copy$default(C33639Ir1 c33639Ir1, String str, List list, FleetReportPage fleetReportPage, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c33639Ir1.f16320a;
        }
        if ((i & 2) != 0) {
            list = c33639Ir1.f16321b;
        }
        if ((i & 4) != 0) {
            fleetReportPage = c33639Ir1.f16322c;
        }
        return c33639Ir1.m101598a(str, list, fleetReportPage);
    }

    /* renamed from: a */
    public final C33639Ir1 m101598a(String str, List<? extends FleetReportPage> fleetReportPages, FleetReportPage fleetReportPage) {
        Intrinsics.checkNotNullParameter(fleetReportPages, "fleetReportPages");
        return new C33639Ir1(str, fleetReportPages, fleetReportPage);
    }

    /* renamed from: b */
    public final String m101597b() {
        return this.f16320a;
    }

    /* renamed from: c */
    public final List<FleetReportPage> m101596c() {
        return this.f16321b;
    }

    /* renamed from: d */
    public final FleetReportPage m101595d() {
        return this.f16322c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C33639Ir1) {
            C33639Ir1 c33639Ir1 = (C33639Ir1) obj;
            return Intrinsics.areEqual(this.f16320a, c33639Ir1.f16320a) && Intrinsics.areEqual(this.f16321b, c33639Ir1.f16321b) && this.f16322c == c33639Ir1.f16322c;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f16320a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f16321b.hashCode()) * 31;
        FleetReportPage fleetReportPage = this.f16322c;
        return hashCode + (fleetReportPage != null ? fleetReportPage.hashCode() : 0);
    }

    public String toString() {
        String str = this.f16320a;
        List<FleetReportPage> list = this.f16321b;
        FleetReportPage fleetReportPage = this.f16322c;
        return "FleetTabState(fleetId=" + str + ", fleetReportPages=" + list + ", selectedPage=" + fleetReportPage + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33639Ir1(String str, List<? extends FleetReportPage> fleetReportPages, FleetReportPage fleetReportPage) {
        Intrinsics.checkNotNullParameter(fleetReportPages, "fleetReportPages");
        this.f16320a = str;
        this.f16321b = fleetReportPages;
        this.f16322c = fleetReportPage;
    }

    public /* synthetic */ C33639Ir1(String str, List list, FleetReportPage fleetReportPage, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : fleetReportPage);
    }
}
