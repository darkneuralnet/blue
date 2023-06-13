package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.FleetReportPage;
import co.bird.android.model.persistence.FleetReportPeriod;
import co.bird.android.model.persistence.FleetReportSection;
import co.bird.android.model.persistence.FleetTargetScoreboard;
import co.bird.android.persistence.common.impl.Converters;
import com.facebook.share.internal.C17296a;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007J\f\u0010\u0005\u001a\u00020\u0002*\u00020\u0003H\u0007J\u0012\u0010\b\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0012\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u0003H\u0007J\u0012\u0010\u000b\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\n0\u0006H\u0007J\u0012\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0006*\u00020\u0003H\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\rH\u0007J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010\u0003H\u0007R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u001b"}, m28432d2 = {"Lyp1;", "", "Lco/bird/android/model/persistence/FleetReportPeriod;", "", "j", DateTokenConverter.CONVERTER_KEY, "", "Lco/bird/android/model/persistence/FleetTargetScoreboard;", "g", "h", "Lco/bird/android/model/persistence/FleetReportSection;", "e", "f", "Lco/bird/android/model/constant/FleetReportPage;", "i", "c", "Lwi2;", "b", "Lwi2;", "deserializer", "Ljava/lang/reflect/Type;", "()Ljava/lang/reflect/Type;", "fleetTargetScoreboardType", C17296a.f69688o, "fleetReportSectionType", "<init>", "()V", "co.bird.android.lib.persistence.fleet-report.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFleetReportConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetReportConverters.kt\nco/bird/android/persistence/fleetreport/impl/converters/FleetReportConverters\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n1#2:55\n*E\n"})
/* renamed from: yp1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52429yp1 {

    /* renamed from: a */
    public static final C52429yp1 f120226a = new C52429yp1();

    /* renamed from: b */
    public static final C51174wi2 f120227b = Converters.f66822a.m55283a();

    private C52429yp1() {
    }

    @JvmStatic
    /* renamed from: c */
    public static final FleetReportPage m2530c(String str) {
        if (str != null) {
            return (FleetReportPage) f120227b.m6459c(str, Reflection.getOrCreateKotlinClass(FleetReportPage.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: d */
    public static final FleetReportPeriod m2529d(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (FleetReportPeriod) f120227b.m6459c(str, Reflection.getOrCreateKotlinClass(FleetReportPeriod.class));
    }

    @JvmStatic
    /* renamed from: e */
    public static final String m2528e(List<FleetReportSection> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return f120227b.m6453i(list);
    }

    @JvmStatic
    /* renamed from: f */
    public static final List<FleetReportSection> m2527f(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (List) f120227b.m6460b(str, f120226a.m2532a());
    }

    @JvmStatic
    /* renamed from: g */
    public static final String m2526g(List<FleetTargetScoreboard> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return f120227b.m6453i(list);
    }

    @JvmStatic
    /* renamed from: h */
    public static final List<FleetTargetScoreboard> m2525h(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (List) f120227b.m6460b(str, f120226a.m2531b());
    }

    @JvmStatic
    /* renamed from: i */
    public static final String m2524i(FleetReportPage fleetReportPage) {
        if (fleetReportPage != null) {
            return f120227b.m6453i(fleetReportPage);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: j */
    public static final String m2523j(FleetReportPeriod fleetReportPeriod) {
        Intrinsics.checkNotNullParameter(fleetReportPeriod, "<this>");
        return f120227b.m6453i(fleetReportPeriod);
    }

    /* renamed from: a */
    public final Type m2532a() {
        return f120227b.m6461a(Reflection.getOrCreateKotlinClass(List.class), Reflection.getOrCreateKotlinClass(FleetReportSection.class));
    }

    /* renamed from: b */
    public final Type m2531b() {
        return f120227b.m6461a(Reflection.getOrCreateKotlinClass(List.class), Reflection.getOrCreateKotlinClass(FleetTargetScoreboard.class));
    }
}
