package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Polygon;
import co.bird.android.model.persistence.nestedstructures.ZoneAnnotation;
import co.bird.android.model.persistence.nestedstructures.ZoneOverlay;
import co.bird.android.persistence.common.impl.Converters;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\tH\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\t*\u0004\u0018\u00010\u0003H\u0007R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\r¨\u0006\u0011"}, m28432d2 = {"LBI6;", "", "Lco/bird/android/model/Polygon;", "", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;", "c", "f", "Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;", "b", "e", "Lwi2;", "Lwi2;", "deserializer", "<init>", "()V", "co.bird.android.lib.persistence.zone.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nZoneConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZoneConverters.kt\nco/bird/android/persistence/zone/impl/converters/ZoneConverters\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n1#2:32\n*E\n"})
/* renamed from: BI6 */
/* loaded from: classes4.dex */
public final class BI6 {

    /* renamed from: a */
    public static final BI6 f2187a = new BI6();

    /* renamed from: b */
    public static final C51174wi2 f2188b = Converters.f66822a.m55283a();

    private BI6() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m114116a(Polygon polygon) {
        if (polygon != null) {
            return f2188b.m6453i(polygon);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m114115b(ZoneAnnotation zoneAnnotation) {
        if (zoneAnnotation != null) {
            return f2188b.m6453i(zoneAnnotation);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: c */
    public static final String m114114c(ZoneOverlay zoneOverlay) {
        if (zoneOverlay != null) {
            return f2188b.m6453i(zoneOverlay);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: d */
    public static final Polygon m114113d(String str) {
        if (str != null) {
            return (Polygon) f2188b.m6459c(str, Reflection.getOrCreateKotlinClass(Polygon.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: e */
    public static final ZoneAnnotation m114112e(String str) {
        if (str != null) {
            return (ZoneAnnotation) f2188b.m6459c(str, Reflection.getOrCreateKotlinClass(ZoneAnnotation.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: f */
    public static final ZoneOverlay m114111f(String str) {
        if (str != null) {
            return (ZoneOverlay) f2188b.m6459c(str, Reflection.getOrCreateKotlinClass(ZoneOverlay.class));
        }
        return null;
    }
}
