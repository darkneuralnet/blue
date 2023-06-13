package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.nestedstructures.Facet;
import co.bird.android.model.persistence.nestedstructures.FleetListAction;
import co.bird.android.model.persistence.nestedstructures.FleetListComplication;
import co.bird.android.model.persistence.nestedstructures.FleetListMessage;
import co.bird.android.model.persistence.nestedstructures.FleetStatusChart;
import co.bird.android.model.persistence.nestedstructures.FleetStatusContent;
import co.bird.android.persistence.common.impl.Converters;
import com.facebook.share.internal.C17296a;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007J\f\u0010\u0005\u001a\u00020\u0002*\u00020\u0003H\u0007J\f\u0010\u0007\u001a\u00020\u0003*\u00020\u0006H\u0007J\f\u0010\b\u001a\u00020\u0006*\u00020\u0003H\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\tH\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\t*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\fH\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\f*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u000fH\u0007J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\u0003H\u0007J\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0003*\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0007J\u0016\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012*\u0004\u0018\u00010\u0003H\u0007J\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0003*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0007J\u001c\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016*\u0004\u0018\u00010\u0003H\u0007R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010 ¨\u0006%"}, m28432d2 = {"Lvq1;", "", "Lco/bird/android/model/persistence/nestedstructures/FleetStatusContent;", "", "n", "i", "Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;", "m", "h", "Lco/bird/android/model/persistence/nestedstructures/FleetListMessage;", "l", "g", "Lco/bird/android/model/persistence/nestedstructures/FleetListComplication;", "k", "f", "Lco/bird/android/model/persistence/nestedstructures/FleetListAction;", "j", "e", "", "Lco/bird/android/model/persistence/nestedstructures/Facet;", "o", "c", "", "", "p", DateTokenConverter.CONVERTER_KEY, "Lwi2;", "b", "Lwi2;", "deserializer", "Ljava/lang/reflect/Type;", C17296a.f69688o, "()Ljava/lang/reflect/Type;", "facetListToken", "facetMapToken", "<init>", "()V", "co.bird.android.lib.persistence.fleet-status.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFleetStatusConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetStatusConverters.kt\nco/bird/android/persistence/fleetstatus/impl/converters/FleetStatusConverters\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
/* renamed from: vq1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50660vq1 {

    /* renamed from: a */
    public static final C50660vq1 f114779a = new C50660vq1();

    /* renamed from: b */
    public static final C51174wi2 f114780b = Converters.f66822a.m55283a();

    private C50660vq1() {
    }

    @JvmStatic
    /* renamed from: c */
    public static final List<Facet> m7948c(String str) {
        if (str != null) {
            return (List) f114780b.m6460b(str, f114779a.m7950a());
        }
        return null;
    }

    @JvmStatic
    /* renamed from: d */
    public static final Map<String, Integer> m7947d(String str) {
        if (str != null) {
            return (Map) f114780b.m6460b(str, f114779a.m7949b());
        }
        return null;
    }

    @JvmStatic
    /* renamed from: e */
    public static final FleetListAction m7946e(String str) {
        if (str != null) {
            return (FleetListAction) f114780b.m6459c(str, Reflection.getOrCreateKotlinClass(FleetListAction.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: f */
    public static final FleetListComplication m7945f(String str) {
        if (str != null) {
            return (FleetListComplication) f114780b.m6459c(str, Reflection.getOrCreateKotlinClass(FleetListComplication.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: g */
    public static final FleetListMessage m7944g(String str) {
        if (str != null) {
            return (FleetListMessage) f114780b.m6459c(str, Reflection.getOrCreateKotlinClass(FleetListMessage.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: h */
    public static final FleetStatusChart m7943h(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (FleetStatusChart) f114780b.m6459c(str, Reflection.getOrCreateKotlinClass(FleetStatusChart.class));
    }

    @JvmStatic
    /* renamed from: i */
    public static final FleetStatusContent m7942i(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (FleetStatusContent) f114780b.m6459c(str, Reflection.getOrCreateKotlinClass(FleetStatusContent.class));
    }

    @JvmStatic
    /* renamed from: j */
    public static final String m7941j(FleetListAction fleetListAction) {
        if (fleetListAction != null) {
            return f114780b.m6453i(fleetListAction);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: k */
    public static final String m7940k(FleetListComplication fleetListComplication) {
        if (fleetListComplication != null) {
            return f114780b.m6453i(fleetListComplication);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: l */
    public static final String m7939l(FleetListMessage fleetListMessage) {
        if (fleetListMessage != null) {
            return f114780b.m6453i(fleetListMessage);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: m */
    public static final String m7938m(FleetStatusChart fleetStatusChart) {
        Intrinsics.checkNotNullParameter(fleetStatusChart, "<this>");
        return f114780b.m6453i(fleetStatusChart).toString();
    }

    @JvmStatic
    /* renamed from: n */
    public static final String m7937n(FleetStatusContent fleetStatusContent) {
        Intrinsics.checkNotNullParameter(fleetStatusContent, "<this>");
        return f114780b.m6453i(fleetStatusContent);
    }

    @JvmStatic
    /* renamed from: o */
    public static final String m7936o(List<Facet> list) {
        if (list != null) {
            return f114780b.m6453i(list);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: p */
    public static final String m7935p(Map<String, Integer> map) {
        if (map != null) {
            return f114780b.m6453i(map);
        }
        return null;
    }

    /* renamed from: a */
    public final Type m7950a() {
        return Converters.f66822a.m55283a().m6461a(Reflection.getOrCreateKotlinClass(List.class), Reflection.getOrCreateKotlinClass(Facet.class));
    }

    /* renamed from: b */
    public final Type m7949b() {
        return Converters.f66822a.m55283a().m6461a(Reflection.getOrCreateKotlinClass(Map.class), Reflection.getOrCreateKotlinClass(String.class), Reflection.getOrCreateKotlinClass(Integer.class));
    }
}
