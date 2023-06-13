package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.nestedstructures.ZoneDetails;
import co.bird.android.model.persistence.nestedstructures.ZoneStatus;
import co.bird.android.model.persistence.nestedstructures.ZoneSummary;
import co.bird.android.persistence.common.impl.Converters;
import com.facebook.share.internal.C17296a;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u0003H\u0007J\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0003*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0007J\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t*\u0004\u0018\u00010\u0003H\u0007R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"LLI6;", "", "Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;", "", "c", "g", "Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;", "b", "f", "", "Lco/bird/android/model/persistence/nestedstructures/ZoneDetails;", DateTokenConverter.CONVERTER_KEY, "e", "Lwi2;", "Lwi2;", "deserializer", "Ljava/lang/reflect/Type;", C17296a.f69688o, "()Ljava/lang/reflect/Type;", "zoneDetailsToken", "<init>", "()V", "co.bird.android.lib.persistence.zone.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nZoneFlightSheetConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZoneFlightSheetConverters.kt\nco/bird/android/persistence/zone/impl/converters/ZoneFlightSheetConverters\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,32:1\n1#2:33\n*E\n"})
/* renamed from: LI6 */
/* loaded from: classes4.dex */
public final class LI6 {

    /* renamed from: a */
    public static final LI6 f21085a = new LI6();

    /* renamed from: b */
    public static final C51174wi2 f21086b = Converters.f66822a.m55283a();

    private LI6() {
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m97353b(ZoneStatus zoneStatus) {
        if (zoneStatus != null) {
            return f21086b.m6453i(zoneStatus);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: c */
    public static final String m97352c(ZoneSummary zoneSummary) {
        if (zoneSummary != null) {
            return f21086b.m6453i(zoneSummary);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: d */
    public static final String m97351d(List<ZoneDetails> list) {
        if (list != null) {
            return f21086b.m6453i(list);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: e */
    public static final List<ZoneDetails> m97350e(String str) {
        if (str != null) {
            return (List) f21086b.m6460b(str, f21085a.m97354a());
        }
        return null;
    }

    @JvmStatic
    /* renamed from: f */
    public static final ZoneStatus m97349f(String str) {
        if (str != null) {
            return (ZoneStatus) f21086b.m6459c(str, Reflection.getOrCreateKotlinClass(ZoneStatus.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: g */
    public static final ZoneSummary m97348g(String str) {
        if (str != null) {
            return (ZoneSummary) f21086b.m6459c(str, Reflection.getOrCreateKotlinClass(ZoneSummary.class));
        }
        return null;
    }

    /* renamed from: a */
    public final Type m97354a() {
        return f21086b.m6461a(Reflection.getOrCreateKotlinClass(List.class), Reflection.getOrCreateKotlinClass(ZoneDetails.class));
    }
}
