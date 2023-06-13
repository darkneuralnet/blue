package co.bird.android.persistence.common.impl;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Point;
import co.bird.android.model.Polygon;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.constant.DeserializerKind;
import co.bird.android.model.persistence.FleetMarker;
import co.bird.android.model.persistence.nestedstructures.Coordinate;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import co.bird.gson.android.factories.EnumTypeAdapterFactory;
import co.bird.gson.android.typeadapters.DateTimeTypeAdapter;
import co.bird.gson.android.typeadapters.PointTypeAdapter;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.module.kotlin.KotlinModule;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.full.KClasses;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
@Metadata(m28433d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b.\u0010/J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\tH\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\t*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\fH\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\f*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u000fH\u0007J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\u0003H\u0007J\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0003*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012H\u0007J\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0015H\u0007J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0015*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0018H\u0007J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0018*\u0004\u0018\u00010\u0003H\u0007R\u001c\u0010\u001f\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0017\u0010'\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010)R\u0014\u0010-\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010,¨\u00060"}, m28432d2 = {"Lco/bird/android/persistence/common/impl/Converters;", "", "Lorg/joda/time/DateTime;", "", "e", "f", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "n", "r", "Lco/bird/android/model/constant/ClientIcon;", "j", "c", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "m", "h", "Lco/bird/android/model/Point;", "i", "p", "", "o", "q", "Lco/bird/android/model/persistence/FleetMarker;", "k", "g", "Lco/bird/android/model/persistence/nestedstructures/Coordinate;", "l", DateTokenConverter.CONVERTER_KEY, "LoE1;", "kotlin.jvm.PlatformType", "b", "LoE1;", "gson", "Liq5;", "Liq5;", "mapper", "Lwi2;", "Lwi2;", C17296a.f69688o, "()Lwi2;", "deserializer", "Lorg/joda/time/format/DateTimeFormatter;", "Lorg/joda/time/format/DateTimeFormatter;", "formatter", "Ljava/lang/reflect/Type;", "()Ljava/lang/reflect/Type;", "stringListToken", "<init>", "()V", "co.bird.android.lib.persistence.common"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Converters.kt\nco/bird/android/persistence/common/impl/Converters\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n1#2:145\n*E\n"})
/* loaded from: classes4.dex */
public final class Converters {

    /* renamed from: a */
    public static final Converters f66822a = new Converters();

    /* renamed from: b */
    public static final C46153oE1 f66823b;

    /* renamed from: c */
    public static final C42957iq5 f66824c;

    /* renamed from: d */
    public static final C51174wi2 f66825d;

    /* renamed from: e */
    public static final DateTimeFormatter f66826e;

    static {
        Map mapOf;
        C46153oE1 gson = new C46746pE1().m19803g(new InterfaceC32096Cb6() { // from class: co.bird.android.persistence.common.impl.Converters$gson$1
            @Override // p000.InterfaceC32096Cb6
            /* renamed from: d */
            public <T> AbstractC31862Bb6<T> mo46766d(C46153oE1 gson2, C32798Fb6<T> type) {
                Intrinsics.checkNotNullParameter(gson2, "gson");
                Intrinsics.checkNotNullParameter(type, "type");
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(type.getRawType());
                if (!orCreateKotlinClass.isSealed()) {
                    List<KClass<?>> superclasses = KClasses.getSuperclasses(orCreateKotlinClass);
                    boolean z = false;
                    if (!(superclasses instanceof Collection) || !superclasses.isEmpty()) {
                        Iterator<T> it = superclasses.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            } else if (((KClass) it.next()).isSealed()) {
                                z = true;
                                break;
                            }
                        }
                    }
                    if (!z) {
                        AbstractC31862Bb6<T> m21551r = gson2.m21551r(this, type);
                        Intrinsics.checkNotNullExpressionValue(m21551r, "{\n        gson.getDelega…apter(this, type)\n      }");
                        return m21551r;
                    }
                }
                return new C45329mq5(orCreateKotlinClass, gson2, this);
            }
        }).m19803g(new EnumTypeAdapterFactory()).m19804f(BigDecimal.class, new C3456IG()).m19804f(DateTime.class, new DateTimeTypeAdapter()).m19804f(Polygon.class, new IX3()).m19804f(Point.class, new PointTypeAdapter()).m19808b();
        f66823b = gson;
        C42957iq5 c42957iq5 = new C42957iq5();
        SimpleModule simpleModule = new SimpleModule();
        simpleModule.addSerializer(BigDecimal.class, new C3113HG());
        simpleModule.addSerializer(DateTime.class, new C45694nT0());
        simpleModule.addSerializer(Point.class, new VW3());
        simpleModule.addSerializer(Polygon.class, new HX3());
        simpleModule.addDeserializer(BigDecimal.class, new NumberDeserializers.BigDecimalDeserializer());
        simpleModule.addDeserializer(DateTime.class, new C44508lT0());
        simpleModule.addDeserializer(Point.class, new IW3());
        simpleModule.addDeserializer(Polygon.class, new GX3());
        c42957iq5.registerModule(simpleModule);
        c42957iq5.registerModule(new KotlinModule(0, false, false, false, null, false, 63, null));
        f66824c = c42957iq5;
        DeserializerKind deserializerKind = DeserializerKind.GSON;
        Intrinsics.checkNotNullExpressionValue(gson, "gson");
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(deserializerKind, new C47932rE1(gson)), TuplesKt.m28425to(DeserializerKind.JACKSON, new C48201rh2(c42957iq5)));
        f66825d = new C51174wi2(mapOf);
        DateTimeFormatter dateTime = ISODateTimeFormat.dateTime();
        Intrinsics.checkNotNullExpressionValue(dateTime, "dateTime()");
        f66826e = dateTime;
    }

    private Converters() {
    }

    @JvmStatic
    /* renamed from: c */
    public static final ClientIcon m55281c(String str) {
        if (str != null) {
            return (ClientIcon) f66825d.m6459c(str, Reflection.getOrCreateKotlinClass(ClientIcon.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: d */
    public static final Coordinate m55280d(String str) {
        if (str != null) {
            return (Coordinate) f66825d.m6459c(str, Reflection.getOrCreateKotlinClass(Coordinate.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: e */
    public static final String m55279e(DateTime dateTime) {
        if (dateTime != null) {
            return f66826e.print(dateTime);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: f */
    public static final DateTime m55278f(String str) {
        if (str != null) {
            return f66826e.parseDateTime(str);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: g */
    public static final FleetMarker m55277g(String str) {
        if (str != null) {
            return (FleetMarker) f66825d.m6459c(str, Reflection.getOrCreateKotlinClass(FleetMarker.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: h */
    public static final Geolocation m55276h(String str) {
        if (str != null) {
            return (Geolocation) f66825d.m6459c(str, Reflection.getOrCreateKotlinClass(Geolocation.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: i */
    public static final String m55275i(Point point) {
        if (point != null) {
            return f66825d.m6453i(point);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: j */
    public static final String m55274j(ClientIcon clientIcon) {
        if (clientIcon != null) {
            return f66825d.m6453i(clientIcon);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: k */
    public static final String m55273k(FleetMarker fleetMarker) {
        if (fleetMarker != null) {
            return f66825d.m6453i(fleetMarker);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: l */
    public static final String m55272l(Coordinate coordinate) {
        if (coordinate != null) {
            return f66825d.m6453i(coordinate);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: m */
    public static final String m55271m(Geolocation geolocation) {
        if (geolocation != null) {
            return f66825d.m6453i(geolocation);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: n */
    public static final String m55270n(ThemedColors themedColors) {
        if (themedColors != null) {
            return f66825d.m6453i(themedColors);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: o */
    public static final String m55269o(List<String> list) {
        if (list != null) {
            return f66825d.m6453i(list);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: p */
    public static final Point m55268p(String str) {
        if (str != null) {
            return (Point) f66825d.m6460b(str, Point.class);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: q */
    public static final List<String> m55267q(String str) {
        if (str != null) {
            return (List) f66825d.m6460b(str, f66822a.m55282b());
        }
        return null;
    }

    @JvmStatic
    /* renamed from: r */
    public static final ThemedColors m55266r(String str) {
        if (str != null) {
            return (ThemedColors) f66825d.m6459c(str, Reflection.getOrCreateKotlinClass(ThemedColors.class));
        }
        return null;
    }

    /* renamed from: a */
    public final C51174wi2 m55283a() {
        return f66825d;
    }

    /* renamed from: b */
    public final Type m55282b() {
        return f66825d.m6461a(Reflection.getOrCreateKotlinClass(List.class), Reflection.getOrCreateKotlinClass(String.class));
    }
}
