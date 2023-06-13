package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ5\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\t\u0010\n\u001a\u00020\u0007HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u001b"}, m28432d2 = {"Lf66;", "", "Lorg/joda/time/DateTime;", "traceStartTime", "Lb66;", "trace", "", "", "attributes", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lorg/joda/time/DateTime;", DateTokenConverter.CONVERTER_KEY, "()Lorg/joda/time/DateTime;", "b", "Lb66;", "c", "()Lb66;", "Ljava/util/Map;", "()Ljava/util/Map;", "<init>", "(Lorg/joda/time/DateTime;Lb66;Ljava/util/Map;)V", "analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: f66  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40745f66 {

    /* renamed from: a */
    public final DateTime f79476a;

    /* renamed from: b */
    public final InterfaceC38356b66 f79477b;

    /* renamed from: c */
    public final Map<String, String> f79478c;

    public C40745f66(DateTime traceStartTime, InterfaceC38356b66 trace, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(traceStartTime, "traceStartTime");
        Intrinsics.checkNotNullParameter(trace, "trace");
        this.f79476a = traceStartTime;
        this.f79477b = trace;
        this.f79478c = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C40745f66 copy$default(C40745f66 c40745f66, DateTime dateTime, InterfaceC38356b66 interfaceC38356b66, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            dateTime = c40745f66.f79476a;
        }
        if ((i & 2) != 0) {
            interfaceC38356b66 = c40745f66.f79477b;
        }
        if ((i & 4) != 0) {
            map = c40745f66.f79478c;
        }
        return c40745f66.m42024a(dateTime, interfaceC38356b66, map);
    }

    /* renamed from: a */
    public final C40745f66 m42024a(DateTime traceStartTime, InterfaceC38356b66 trace, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(traceStartTime, "traceStartTime");
        Intrinsics.checkNotNullParameter(trace, "trace");
        return new C40745f66(traceStartTime, trace, map);
    }

    /* renamed from: b */
    public final Map<String, String> m42023b() {
        return this.f79478c;
    }

    /* renamed from: c */
    public final InterfaceC38356b66 m42022c() {
        return this.f79477b;
    }

    /* renamed from: d */
    public final DateTime m42021d() {
        return this.f79476a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C40745f66) {
            C40745f66 c40745f66 = (C40745f66) obj;
            return Intrinsics.areEqual(this.f79476a, c40745f66.f79476a) && Intrinsics.areEqual(this.f79477b, c40745f66.f79477b) && Intrinsics.areEqual(this.f79478c, c40745f66.f79478c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.f79476a.hashCode() * 31) + this.f79477b.hashCode()) * 31;
        Map<String, String> map = this.f79478c;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        DateTime dateTime = this.f79476a;
        InterfaceC38356b66 interfaceC38356b66 = this.f79477b;
        Map<String, String> map = this.f79478c;
        return "TraceEntry(traceStartTime=" + dateTime + ", trace=" + interfaceC38356b66 + ", attributes=" + map + ")";
    }

    public /* synthetic */ C40745f66(DateTime dateTime, InterfaceC38356b66 interfaceC38356b66, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dateTime, interfaceC38356b66, (i & 4) != 0 ? null : map);
    }
}
