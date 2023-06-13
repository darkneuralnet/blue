package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.AssetManagerType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m28432d2 = {"LxB0;", "", "<init>", "()V", C17296a.f69688o, "local-asset_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: xB0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C51460xB0 {

    /* renamed from: a */
    public static final C30057a f117170a = new C30057a(null);

    /* renamed from: b */
    public static final DateTimeFormatter f117171b;

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007J\f\u0010\t\u001a\u00020\b*\u00020\u0002H\u0007J\f\u0010\n\u001a\u00020\u0002*\u00020\bH\u0007R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"LxB0$a;", "", "", "value", "Lorg/joda/time/DateTime;", "e", "date", "b", "Lco/bird/android/model/constant/AssetManagerType;", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "Lorg/joda/time/format/DateTimeFormatter;", "formatter", "Lorg/joda/time/format/DateTimeFormatter;", "c", "()Lorg/joda/time/format/DateTimeFormatter;", "<init>", "()V", "local-asset_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Converters.kt\nco/bird/android/manager/localasset/persistence/Converters$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"})
    /* renamed from: xB0$a */
    /* loaded from: classes4.dex */
    public static final class C30057a {
        public /* synthetic */ C30057a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final String m5744a(AssetManagerType assetManagerType) {
            Intrinsics.checkNotNullParameter(assetManagerType, "<this>");
            String lowerCase = assetManagerType.name().toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
            return lowerCase;
        }

        @JvmStatic
        /* renamed from: b */
        public final String m5743b(DateTime dateTime) {
            if (dateTime != null) {
                return C51460xB0.f117170a.m5742c().print(dateTime);
            }
            return null;
        }

        /* renamed from: c */
        public final DateTimeFormatter m5742c() {
            return C51460xB0.f117171b;
        }

        @JvmStatic
        /* renamed from: d */
        public final AssetManagerType m5741d(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            String upperCase = str.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase()");
            return AssetManagerType.valueOf(upperCase);
        }

        @JvmStatic
        /* renamed from: e */
        public final DateTime m5740e(String str) {
            if (str != null) {
                return C51460xB0.f117170a.m5742c().parseDateTime(str);
            }
            return null;
        }

        private C30057a() {
        }
    }

    static {
        DateTimeFormatter dateTime = ISODateTimeFormat.dateTime();
        Intrinsics.checkNotNullExpressionValue(dateTime, "dateTime()");
        f117171b = dateTime;
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m5748a(AssetManagerType assetManagerType) {
        return f117170a.m5744a(assetManagerType);
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m5747b(DateTime dateTime) {
        return f117170a.m5743b(dateTime);
    }

    @JvmStatic
    /* renamed from: c */
    public static final AssetManagerType m5746c(String str) {
        return f117170a.m5741d(str);
    }

    @JvmStatic
    /* renamed from: d */
    public static final DateTime m5745d(String str) {
        return f117170a.m5740e(str);
    }
}
