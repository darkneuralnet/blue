package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.nestedstructures.FlightSheetRideRating;
import co.bird.android.model.persistence.nestedstructures.FlightSheetRideRatingTag;
import co.bird.android.persistence.common.impl.Converters;
import com.facebook.share.internal.C17296a;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u0002H\u0007J\u0012\u0010\u0006\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007J\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003*\u00020\u0002H\u0007J\u0019\u0010\t\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00070\u0003H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u001c\u0010\u0011\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u001c\u0010\u0012\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010¨\u0006\u0015"}, m28432d2 = {"LBR;", "", "", "", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRating;", "b", "c", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatingTag;", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;)Ljava/lang/String;", "Lwi2;", "Lwi2;", "deserializer", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "Ljava/lang/reflect/Type;", "flightSheetRideRatingListType", "flightSheetRideRatingTagListType", "<init>", "()V", "co.bird.android.lib.persistence.bird-rating-history.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: BR */
/* loaded from: classes4.dex */
public final class C0608BR {

    /* renamed from: a */
    public static final C0608BR f2311a = new C0608BR();

    /* renamed from: b */
    public static final C51174wi2 f2312b = Converters.f66822a.m55283a();

    /* renamed from: c */
    public static final Type f2313c = new C0609a().getType();

    /* renamed from: d */
    public static final Type f2314d = new C0610b().getType();

    @Metadata(m28433d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m28432d2 = {"BR$a", "LFb6;", "", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRating;", "co.bird.android.lib.persistence.bird-rating-history.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: BR$a */
    /* loaded from: classes4.dex */
    public static final class C0609a extends C32798Fb6<List<? extends FlightSheetRideRating>> {
    }

    @Metadata(m28433d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m28432d2 = {"BR$b", "LFb6;", "", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatingTag;", "co.bird.android.lib.persistence.bird-rating-history.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: BR$b */
    /* loaded from: classes4.dex */
    public static final class C0610b extends C32798Fb6<List<? extends FlightSheetRideRatingTag>> {
    }

    private C0608BR() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final List<FlightSheetRideRatingTag> m114040a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        C51174wi2 c51174wi2 = f2312b;
        Type flightSheetRideRatingTagListType = f2314d;
        Intrinsics.checkNotNullExpressionValue(flightSheetRideRatingTagListType, "flightSheetRideRatingTagListType");
        return (List) c51174wi2.m6460b(str, flightSheetRideRatingTagListType);
    }

    @JvmStatic
    /* renamed from: b */
    public static final List<FlightSheetRideRating> m114039b(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        C51174wi2 c51174wi2 = f2312b;
        Type flightSheetRideRatingListType = f2313c;
        Intrinsics.checkNotNullExpressionValue(flightSheetRideRatingListType, "flightSheetRideRatingListType");
        return (List) c51174wi2.m6460b(str, flightSheetRideRatingListType);
    }

    @JvmStatic
    /* renamed from: c */
    public static final String m114038c(List<FlightSheetRideRating> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return f2312b.m6453i(list);
    }

    @JvmStatic
    @JvmName(name = "toJsonFlightSheetRideRatingTag")
    /* renamed from: d */
    public static final String m114037d(List<FlightSheetRideRatingTag> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return f2312b.m6453i(list);
    }
}
