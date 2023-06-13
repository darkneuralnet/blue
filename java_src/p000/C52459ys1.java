package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.FlightSheetContext;
import co.bird.android.model.persistence.nestedstructures.FlightSheetActions;
import co.bird.android.model.persistence.nestedstructures.FlightSheetBanner;
import co.bird.android.model.persistence.nestedstructures.FlightSheetCommands;
import co.bird.android.model.persistence.nestedstructures.FlightSheetInfoSection;
import co.bird.android.model.persistence.nestedstructures.FlightSheetRideHistory;
import co.bird.android.model.persistence.nestedstructures.FlightSheetRideRatings;
import co.bird.android.model.persistence.nestedstructures.FlightSheetVehicleSummary;
import co.bird.android.model.persistence.nestedstructures.TaskOrderInfo;
import co.bird.android.persistence.common.impl.Converters;
import com.facebook.share.internal.C17296a;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\tH\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\t*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\fH\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\f*\u0004\u0018\u00010\u0003H\u0007J\u0012\u0010\u0011\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0007J\u0012\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\u0003H\u0007J\u0012\u0010\u0014\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00130\u000fH\u0007J\u0014\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000f*\u00020\u0003H\u0007J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0016H\u0007J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0016*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0019H\u0007J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0019*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u001cH\u0007J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001c*\u0004\u0018\u00010\u0003H\u0007R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010%¨\u0006*"}, m28432d2 = {"Lys1;", "", "Lco/bird/android/model/constant/FlightSheetContext;", "", "m", "g", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;", "n", "e", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;", "r", "l", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;", "o", "f", "", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetActions;", DateTokenConverter.CONVERTER_KEY, "c", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;", "h", "i", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;", "p", "j", "Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;", "s", "t", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;", "q", "k", "Lwi2;", "b", "Lwi2;", "deserializer", "Ljava/lang/reflect/Type;", C17296a.f69688o, "()Ljava/lang/reflect/Type;", "actionSectionsToken", "infoSectionsToken", "<init>", "()V", "co.bird.android.lib.persistence.flight-sheet.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFlightSheetConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetConverters.kt\nco/bird/android/persistence/flightsheet/impl/converters/FlightSheetConverters\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
/* renamed from: ys1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52459ys1 {

    /* renamed from: a */
    public static final C52459ys1 f120351a = new C52459ys1();

    /* renamed from: b */
    public static final C51174wi2 f120352b = Converters.f66822a.m55283a();

    private C52459ys1() {
    }

    @JvmStatic
    /* renamed from: c */
    public static final List<FlightSheetActions> m2376c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (List) f120352b.m6460b(str, f120351a.m2378a());
    }

    @JvmStatic
    /* renamed from: d */
    public static final String m2375d(List<FlightSheetActions> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return f120352b.m6453i(list);
    }

    @JvmStatic
    /* renamed from: e */
    public static final FlightSheetBanner m2374e(String str) {
        if (str != null) {
            return (FlightSheetBanner) f120352b.m6459c(str, Reflection.getOrCreateKotlinClass(FlightSheetBanner.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: f */
    public static final FlightSheetCommands m2373f(String str) {
        if (str != null) {
            return (FlightSheetCommands) f120352b.m6459c(str, Reflection.getOrCreateKotlinClass(FlightSheetCommands.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: g */
    public static final FlightSheetContext m2372g(String str) {
        if (str != null) {
            return FlightSheetContext.Companion.fromString(str);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: h */
    public static final String m2371h(List<FlightSheetInfoSection> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return f120352b.m6453i(list);
    }

    @JvmStatic
    /* renamed from: i */
    public static final List<FlightSheetInfoSection> m2370i(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (List) f120352b.m6460b(str, f120351a.m2377b());
    }

    @JvmStatic
    /* renamed from: j */
    public static final FlightSheetRideHistory m2369j(String str) {
        if (str != null) {
            return (FlightSheetRideHistory) f120352b.m6459c(str, Reflection.getOrCreateKotlinClass(FlightSheetRideHistory.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: k */
    public static final FlightSheetRideRatings m2368k(String str) {
        if (str != null) {
            return (FlightSheetRideRatings) f120352b.m6459c(str, Reflection.getOrCreateKotlinClass(FlightSheetRideRatings.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: l */
    public static final FlightSheetVehicleSummary m2367l(String str) {
        if (str != null) {
            return (FlightSheetVehicleSummary) f120352b.m6459c(str, Reflection.getOrCreateKotlinClass(FlightSheetVehicleSummary.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: m */
    public static final String m2366m(FlightSheetContext flightSheetContext) {
        return String.valueOf(flightSheetContext);
    }

    @JvmStatic
    /* renamed from: n */
    public static final String m2365n(FlightSheetBanner flightSheetBanner) {
        if (flightSheetBanner != null) {
            return f120352b.m6453i(flightSheetBanner);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: o */
    public static final String m2364o(FlightSheetCommands flightSheetCommands) {
        if (flightSheetCommands != null) {
            return f120352b.m6453i(flightSheetCommands);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: p */
    public static final String m2363p(FlightSheetRideHistory flightSheetRideHistory) {
        if (flightSheetRideHistory != null) {
            return f120352b.m6453i(flightSheetRideHistory);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: q */
    public static final String m2362q(FlightSheetRideRatings flightSheetRideRatings) {
        if (flightSheetRideRatings != null) {
            return f120352b.m6453i(flightSheetRideRatings);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: r */
    public static final String m2361r(FlightSheetVehicleSummary flightSheetVehicleSummary) {
        if (flightSheetVehicleSummary != null) {
            return f120352b.m6453i(flightSheetVehicleSummary);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: s */
    public static final String m2360s(TaskOrderInfo taskOrderInfo) {
        if (taskOrderInfo != null) {
            return f120352b.m6453i(taskOrderInfo);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: t */
    public static final TaskOrderInfo m2359t(String str) {
        if (str != null) {
            return (TaskOrderInfo) f120352b.m6459c(str, Reflection.getOrCreateKotlinClass(TaskOrderInfo.class));
        }
        return null;
    }

    /* renamed from: a */
    public final Type m2378a() {
        return f120352b.m6461a(Reflection.getOrCreateKotlinClass(List.class), Reflection.getOrCreateKotlinClass(FlightSheetActions.class));
    }

    /* renamed from: b */
    public final Type m2377b() {
        return f120352b.m6461a(Reflection.getOrCreateKotlinClass(List.class), Reflection.getOrCreateKotlinClass(FlightSheetInfoSection.class));
    }
}
