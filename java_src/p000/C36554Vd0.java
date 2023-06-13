package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.api.response.CannotAccessReportResponse;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0005\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m28432d2 = {"LVd0;", "", "", "Lco/bird/api/response/CannotAccessReportResponse;", "reports", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/util/List;", "c", "()Ljava/util/List;", "", "b", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Throwable;)V", "error", "<init>", "(Ljava/util/List;)V", "co.bird.android.feature.cannotaccess"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Vd0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36554Vd0 {

    /* renamed from: a */
    public final List<CannotAccessReportResponse> f39352a;

    /* renamed from: b */
    public Throwable f39353b;

    public C36554Vd0() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C36554Vd0 copy$default(C36554Vd0 c36554Vd0, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = c36554Vd0.f39352a;
        }
        return c36554Vd0.m79643a(list);
    }

    /* renamed from: a */
    public final C36554Vd0 m79643a(List<CannotAccessReportResponse> reports) {
        Intrinsics.checkNotNullParameter(reports, "reports");
        return new C36554Vd0(reports);
    }

    /* renamed from: b */
    public final Throwable m79642b() {
        return this.f39353b;
    }

    /* renamed from: c */
    public final List<CannotAccessReportResponse> m79641c() {
        return this.f39352a;
    }

    /* renamed from: d */
    public final void m79640d(Throwable th) {
        this.f39353b = th;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C36554Vd0) && Intrinsics.areEqual(this.f39352a, ((C36554Vd0) obj).f39352a);
    }

    public int hashCode() {
        return this.f39352a.hashCode();
    }

    public String toString() {
        List<CannotAccessReportResponse> list = this.f39352a;
        return "CannotAccessReportsState(reports=" + list + ")";
    }

    public C36554Vd0(List<CannotAccessReportResponse> reports) {
        Intrinsics.checkNotNullParameter(reports, "reports");
        this.f39352a = reports;
    }

    public /* synthetic */ C36554Vd0(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
