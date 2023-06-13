package p000;

import android.content.Context;
import android.text.format.DateUtils;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Detail;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethod;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.ReadableInstant;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
@Metadata(m28433d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bU\u0010VJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002J!\u0010\f\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010J \u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0013J*\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u0006J\u0016\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\nJ \u0010\"\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\n2\b\b\u0002\u0010!\u001a\u00020\u0006J \u0010$\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020\u0006J\u000e\u0010'\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%J\u000e\u0010*\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(J\u000e\u0010-\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+J\u0018\u00101\u001a\u00020\u00022\u0006\u0010/\u001a\u00020.2\b\b\u0002\u00100\u001a\u00020\u0002J\u000e\u00103\u001a\u00020\u00022\u0006\u00102\u001a\u00020.J\u000e\u00105\u001a\u00020\u00022\u0006\u00104\u001a\u00020\u000eJ\n\u00107\u001a\u00020\u0006*\u000206J \u00109\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010,\u001a\u00020+2\b\b\u0002\u00108\u001a\u00020\u0006J(\u0010<\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\b\b\u0002\u00108\u001a\u00020\u0006J\u000e\u0010=\u001a\u00020\u00022\u0006\u0010/\u001a\u00020.J\u000e\u0010>\u001a\u00020\u00022\u0006\u0010/\u001a\u00020.J8\u0010D\u001a\u00020\u00022\b\u0010?\u001a\u0004\u0018\u00010\u00022\b\u0010@\u001a\u0004\u0018\u00010\u00022\b\u0010A\u001a\u0004\u0018\u00010\u00022\b\u0010B\u001a\u0004\u0018\u00010\u00022\b\u0010C\u001a\u0004\u0018\u00010\u0002R\u0014\u0010G\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010FR\u0014\u0010J\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010IR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010IR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010MR\u001c\u0010Q\u001a\n O*\u0004\u0018\u00010H0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010IR\u001c\u0010R\u001a\n O*\u0004\u0018\u00010H0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010IR\u001c\u0010S\u001a\n O*\u0004\u0018\u00010H0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010IR\u0014\u0010T\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010I¨\u0006X²\u0006\u0014\u0010W\u001a\n O*\u0004\u0018\u00010\u00020\u00028\nX\u008a\u0084\u0002"}, m28432d2 = {"Lxx1;", "", "", "priceString", "c", "", "", "o", "", "percent", "", "numFractionDigits", "q", "(Ljava/lang/Float;I)Ljava/lang/String;", "", "price", "Ljava/util/Currency;", "currency", "n", "LUx1;", "option", DateTokenConverter.CONVERTER_KEY, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "meters", "minimumDisplayValue", "rounded", "h", "i", "seconds", "j", "minute", "abbreviate", "k", "percentOnly", C17296a.f69688o, "Lorg/joda/time/ReadableInstant;", "instant", "t", "Lorg/joda/time/LocalTime;", "localTime", "p", "Lorg/joda/time/LocalDate;", "localDate", "r", "Lorg/joda/time/DateTime;", "dateTime", "separator", "s", "date", "v", "time", "u", "Ljava/util/Locale;", "w", "allowDayStrings", "e", "fromDate", "toDate", "g", "l", "m", PaymentMethod.BillingDetails.PARAM_ADDRESS, "city", TransferTable.COLUMN_STATE, "country", "zip", "b", "Ljava/text/SimpleDateFormat;", "Ljava/text/SimpleDateFormat;", "HOUR_MINUTE", "Lorg/joda/time/format/DateTimeFormatter;", "Lorg/joda/time/format/DateTimeFormatter;", "HOUR_FORMATTER", "DATE_FORMATTER", "", "Ljava/util/Set;", "COUNTRIES_USING_IMPERIAL_DISTANCES", "kotlin.jvm.PlatformType", "f", "DATE_FORMATTER_NO_YEAR", "DATE_FORMATTER_WITH_YEAR", "DAY_OF_WEEK_FORMATTER", "isoDateTimerFormatter", "<init>", "()V", "formattedDate", "localization_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: xx1 */
/* loaded from: classes3.dex */
public final class C51916xx1 {

    /* renamed from: a */
    public static final C51916xx1 f118396a = new C51916xx1();

    /* renamed from: b */
    public static final SimpleDateFormat f118397b = new SimpleDateFormat("h:mm a", Locale.getDefault());

    /* renamed from: c */
    public static final DateTimeFormatter f118398c;

    /* renamed from: d */
    public static final DateTimeFormatter f118399d;

    /* renamed from: e */
    public static final Set<String> f118400e;

    /* renamed from: f */
    public static final DateTimeFormatter f118401f;

    /* renamed from: g */
    public static final DateTimeFormatter f118402g;

    /* renamed from: h */
    public static final DateTimeFormatter f118403h;

    /* renamed from: i */
    public static final DateTimeFormatter f118404i;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xx1$a */
    /* loaded from: classes3.dex */
    public static final class C30354a extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ LocalDate f118405g;

        /* renamed from: h */
        public final /* synthetic */ LocalDate f118406h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30354a(LocalDate localDate, LocalDate localDate2) {
            super(0);
            this.f118405g = localDate;
            this.f118406h = localDate2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return (this.f118405g.getYear() == this.f118406h.getYear() ? C51916xx1.f118401f : C51916xx1.f118402g).withLocale(Locale.getDefault()).print(this.f118405g);
        }
    }

    static {
        Set<String> of;
        DateTimeFormatter forStyle = DateTimeFormat.forStyle("-S");
        Intrinsics.checkNotNullExpressionValue(forStyle, "forStyle(\"-S\")");
        f118398c = forStyle;
        DateTimeFormatter forStyle2 = DateTimeFormat.forStyle("S-");
        Intrinsics.checkNotNullExpressionValue(forStyle2, "forStyle(\"S-\")");
        f118399d = forStyle2;
        of = SetsKt__SetsKt.setOf((Object[]) new String[]{"US", "AS", "GU", "MP", "VI", "PR", "GB", "VG", "KY", "FK", "TC", "BS", "DM", "GD", "LC", "VC", "KN", "AG", "BZ", "WS"});
        f118400e = of;
        f118401f = DateTimeFormat.forPattern("MMM d");
        f118402g = DateTimeFormat.forPattern("MMM d, Y");
        f118403h = DateTimeFormat.forPattern("EEEE");
        DateTimeFormatter dateTime = ISODateTimeFormat.dateTime();
        Intrinsics.checkNotNullExpressionValue(dateTime, "dateTime()");
        f118404i = dateTime;
    }

    private C51916xx1() {
    }

    public static /* synthetic */ String battery$default(C51916xx1 c51916xx1, Context context, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return c51916xx1.m4411a(context, i, z);
    }

    public static /* synthetic */ String currency$default(C51916xx1 c51916xx1, long j, Currency currency, EnumC36501Ux1 enumC36501Ux1, int i, Object obj) {
        if ((i & 4) != 0) {
            enumC36501Ux1 = EnumC36501Ux1.SHOW_ALWAYS;
        }
        return c51916xx1.m4408d(j, currency, enumC36501Ux1);
    }

    public static /* synthetic */ String date$default(C51916xx1 c51916xx1, Context context, LocalDate localDate, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return c51916xx1.m4407e(context, localDate, z);
    }

    public static /* synthetic */ String dateRange$default(C51916xx1 c51916xx1, Context context, DateTime dateTime, DateTime dateTime2, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return c51916xx1.m4405g(context, dateTime, dateTime2, z);
    }

    public static /* synthetic */ String distance$default(C51916xx1 c51916xx1, Context context, double d, double d2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            d2 = 0.0d;
        }
        double d3 = d2;
        if ((i & 8) != 0) {
            z = false;
        }
        return c51916xx1.m4404h(context, d, d3, z);
    }

    public static /* synthetic */ String durationMinute$default(C51916xx1 c51916xx1, Context context, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        return c51916xx1.m4401k(context, i, z);
    }

    /* renamed from: f */
    public static final String m4406f(Lazy<String> lazy) {
        return lazy.getValue();
    }

    public static /* synthetic */ String percentage$default(C51916xx1 c51916xx1, Float f, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return c51916xx1.m4395q(f, i);
    }

    public static /* synthetic */ String shortDateAndTimeOfDay$default(C51916xx1 c51916xx1, DateTime dateTime, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = " · ";
        }
        return c51916xx1.m4393s(dateTime, str);
    }

    /* renamed from: a */
    public final String m4411a(Context context, int i, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (i < 0) {
            i = 0;
        }
        String percentage$default = percentage$default(this, Float.valueOf(i / 100.0f), 0, 2, null);
        if (!z) {
            String string = context.getString(C45871nl4.battery_percentage, percentage$default);
            Intrinsics.checkNotNullExpressionValue(string, "{\n      context.getStrin…, percentageString)\n    }");
            return string;
        }
        return percentage$default;
    }

    /* renamed from: b */
    public final String m4410b(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(str);
            sb.append(CoreConstants.COMMA_CHAR);
            sb.append(' ');
        }
        if (str2 != null) {
            sb.append(str2);
        }
        if (str3 != null) {
            if (str2 != null) {
                sb.append(CoreConstants.COMMA_CHAR);
                sb.append(' ');
            }
            sb.append(str3);
        }
        if (str4 != null) {
            if ((str2 != null && str3 == null) || (str2 == null && str3 != null)) {
                sb.append(CoreConstants.COMMA_CHAR);
                sb.append(' ');
                sb.append(str4);
            } else if (str2 == null && str3 == null) {
                sb.append(str4);
            }
        }
        if (str5 != null) {
            sb.append(' ');
            sb.append(str5);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "builder.toString()");
        return sb2;
    }

    /* renamed from: c */
    public final String m4409c(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (!Character.isDigit(charAt) && charAt != '.') {
                if (m4397o(charAt)) {
                    sb.append(CoreConstants.DASH_CHAR);
                }
            } else {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "cleaned.toString()");
        return sb2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x006b, code lost:
        if (r14 == (-1)) goto L14;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m4408d(long j, Currency currency, EnumC36501Ux1 option) {
        boolean z;
        boolean z2;
        int indexOfAny$default;
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(option, "option");
        NumberFormat format = NumberFormat.getCurrencyInstance();
        format.setCurrency(currency);
        boolean z3 = true;
        if (j < 0) {
            z = true;
        } else {
            z = false;
        }
        if (Intrinsics.areEqual(Locale.getDefault().getCountry(), Locale.US.getCountry()) && z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            j = Math.abs(j);
        }
        BigDecimal bigDecimal = new BigDecimal(m4398n(j, currency));
        Intrinsics.checkNotNullExpressionValue(format, "format");
        C52509yx1.m2222e(format, option.mo80587b(bigDecimal, currency), currency);
        String formatttedString = format.format(bigDecimal);
        if (z) {
            Intrinsics.checkNotNullExpressionValue(formatttedString, "formatttedString");
            indexOfAny$default = StringsKt__StringsKt.indexOfAny$default((CharSequence) formatttedString, new char[]{CoreConstants.DASH_CHAR, CoreConstants.LEFT_PARENTHESIS_CHAR}, 0, false, 6, (Object) null);
        }
        z3 = false;
        if (z2) {
            return Detail.EMPTY_CHAR + formatttedString;
        } else if (z3) {
            if (C52509yx1.m2225b()) {
                return formatttedString + Detail.EMPTY_CHAR;
            }
            return Detail.EMPTY_CHAR + formatttedString;
        } else {
            Intrinsics.checkNotNullExpressionValue(formatttedString, "formatttedString");
            return formatttedString;
        }
    }

    /* renamed from: e */
    public final String m4407e(Context context, LocalDate localDate, boolean z) {
        Lazy lazy;
        String m4406f;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        LocalDate localDate2 = DateTime.now().toLocalDate();
        LocalDate localDate3 = DateTime.now().minusDays(1).toLocalDate();
        lazy = LazyKt__LazyJVMKt.lazy(new C30354a(localDate, localDate2));
        if (!z) {
            String m4406f2 = m4406f(lazy);
            Intrinsics.checkNotNullExpressionValue(m4406f2, "{\n       formattedDate\n    }");
            return m4406f2;
        }
        if (Intrinsics.areEqual(localDate, localDate2)) {
            m4406f = context.getString(C45871nl4.today);
        } else if (Intrinsics.areEqual(localDate, localDate3)) {
            m4406f = context.getString(C45871nl4.yesterday);
        } else {
            m4406f = m4406f(lazy);
        }
        Intrinsics.checkNotNullExpressionValue(m4406f, "{\n      when (localDate)…rmattedDate\n      }\n    }");
        return m4406f;
    }

    /* renamed from: g */
    public final String m4405g(Context context, DateTime fromDate, DateTime toDate, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fromDate, "fromDate");
        Intrinsics.checkNotNullParameter(toDate, "toDate");
        StringBuffer stringBuffer = new StringBuffer();
        LocalDate localDate = fromDate.toLocalDateTime().toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate, "fromDate.toLocalDateTime().toLocalDate()");
        String m4407e = m4407e(context, localDate, z);
        LocalDate localDate2 = toDate.toLocalDateTime().toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate2, "toDate.toLocalDateTime().toLocalDate()");
        String m4407e2 = m4407e(context, localDate2, z);
        if (!Intrinsics.areEqual(m4407e, m4407e2)) {
            stringBuffer.append(m4407e);
            stringBuffer.append(" - ");
            stringBuffer.append(m4407e2);
            String stringBuffer2 = stringBuffer.toString();
            Intrinsics.checkNotNullExpressionValue(stringBuffer2, "{\n      sb.append(fromDa…(toDate).toString()\n    }");
            return stringBuffer2;
        }
        return m4407e;
    }

    /* renamed from: h */
    public final String m4404h(Context context, double d, double d2, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (d < 0.0d) {
            d = 0.0d;
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        if (z) {
            numberInstance.setMinimumFractionDigits(0);
            numberInstance.setMaximumFractionDigits(0);
        } else {
            numberInstance.setMinimumFractionDigits(1);
            numberInstance.setMaximumFractionDigits(1);
        }
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        if (m4389w(locale)) {
            String string = context.getString(C45871nl4.distance_in_miles, numberInstance.format(Math.max(d / 1609.34d, d2)));
            Intrinsics.checkNotNullExpressionValue(string, "{\n      val miles = Math…in_miles, distance)\n    }");
            return string;
        }
        String string2 = context.getString(C45871nl4.distance_in_kilometers, numberInstance.format(Math.max(d / 1000.0d, d2)));
        Intrinsics.checkNotNullExpressionValue(string2, "{\n      val km = Math.ma…lometers, distance)\n    }");
        return string2;
    }

    /* renamed from: i */
    public final String m4403i(Context context, double d) {
        String string;
        Intrinsics.checkNotNullParameter(context, "context");
        double d2 = 0.0d;
        if (d >= 0.0d) {
            d2 = d;
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMinimumFractionDigits(1);
        numberInstance.setMaximumFractionDigits(1);
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        if (m4389w(locale)) {
            double d3 = d2 / 1609.34d;
            if (d3 >= 0.1d) {
                string = context.getString(C45871nl4.distance_in_miles, numberInstance.format(d3));
            } else {
                numberInstance.setMinimumFractionDigits(0);
                numberInstance.setMaximumFractionDigits(0);
                string = context.getString(C45871nl4.distance_in_feet, numberInstance.format(d3 * 5280));
            }
            Intrinsics.checkNotNullExpressionValue(string, "{\n      val miles = nonN…, distance)\n      }\n    }");
        } else {
            if (d >= 100.0d) {
                string = context.getString(C45871nl4.distance_in_kilometers, numberInstance.format(d2 / 1000.0d));
            } else {
                numberInstance.setMinimumFractionDigits(0);
                numberInstance.setMaximumFractionDigits(0);
                string = context.getString(C45871nl4.distance_in_meters, numberInstance.format(d));
            }
            Intrinsics.checkNotNullExpressionValue(string, "{\n      if (meters >= 10…, distance)\n      }\n    }");
        }
        return string;
    }

    /* renamed from: j */
    public final String m4402j(int i) {
        String formatElapsedTime = DateUtils.formatElapsedTime(i < 0 ? 0L : i);
        Intrinsics.checkNotNullExpressionValue(formatElapsedTime, "formatElapsedTime(if (se…0L else seconds.toLong())");
        return formatElapsedTime;
    }

    /* renamed from: k */
    public final String m4401k(Context context, int i, boolean z) {
        String string;
        Intrinsics.checkNotNullParameter(context, "context");
        if (i > 1) {
            if (z) {
                string = context.getString(C45871nl4.minutes, Integer.valueOf(i));
            } else {
                string = context.getString(C45871nl4.minutes_unabbr, Integer.valueOf(i));
            }
            Intrinsics.checkNotNullExpressionValue(string, "{\n      if (abbreviate) …br, minute)\n      }\n    }");
        } else {
            if (z) {
                string = context.getString(C45871nl4.minute, Integer.valueOf(i));
            } else {
                string = context.getString(C45871nl4.minute_unabbr, Integer.valueOf(i));
            }
            Intrinsics.checkNotNullExpressionValue(string, "{\n      if (abbreviate) …br, minute)\n      }\n    }");
        }
        return string;
    }

    /* renamed from: l */
    public final String m4400l(DateTime dateTime) {
        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        String print = DateTimeFormat.forPattern("MMMM d, yyyy").print(dateTime);
        Intrinsics.checkNotNullExpressionValue(print, "forPattern(MONTH_DAY_YEAR).print(dateTime)");
        return print;
    }

    /* renamed from: m */
    public final String m4399m(DateTime dateTime) {
        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        String format = f118397b.format(dateTime.toDate());
        Intrinsics.checkNotNullExpressionValue(format, "HOUR_MINUTE.format(dateTime.toDate())");
        return format;
    }

    /* renamed from: n */
    public final String m4398n(long j, Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        int defaultFractionDigits = currency.getDefaultFractionDigits();
        int length = String.valueOf(j).length();
        StringBuilder sb = new StringBuilder();
        if (defaultFractionDigits == 0) {
            for (int i = 0; i < length; i++) {
                sb.append('#');
            }
            DecimalFormat decimalFormat = new DecimalFormat(sb.toString());
            decimalFormat.setCurrency(currency);
            decimalFormat.setGroupingUsed(false);
            String format = decimalFormat.format(j);
            Intrinsics.checkNotNullExpressionValue(format, "noDecimalCurrencyFormat.format(price)");
            return format;
        }
        int i2 = length - defaultFractionDigits;
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append('#');
        }
        if (length <= defaultFractionDigits) {
            sb.append('0');
        }
        sb.append(CoreConstants.DOT);
        for (int i4 = 0; i4 < defaultFractionDigits; i4++) {
            sb.append('0');
        }
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator(CoreConstants.DOT);
        DecimalFormat decimalFormat2 = new DecimalFormat(sb.toString(), decimalFormatSymbols);
        decimalFormat2.setCurrency(currency);
        decimalFormat2.setGroupingUsed(false);
        String format2 = decimalFormat2.format(j / Math.pow(10.0d, defaultFractionDigits));
        Intrinsics.checkNotNullExpressionValue(format2, "decimalFormat.format(decimalPrice)");
        return m4409c(format2);
    }

    /* renamed from: o */
    public final boolean m4397o(char c) {
        if (c == '-' || c == 8722 || c == 65112 || c == 65123 || c == 65037) {
            return true;
        }
        return 8208 <= c && c < 8214;
    }

    /* renamed from: p */
    public final String m4396p(LocalTime localTime) {
        Intrinsics.checkNotNullParameter(localTime, "localTime");
        String print = f118398c.print(localTime);
        Intrinsics.checkNotNullExpressionValue(print, "HOUR_FORMATTER.print(localTime)");
        return print;
    }

    /* renamed from: q */
    public final String m4395q(Float f, int i) {
        float f2;
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        percentInstance.setMinimumFractionDigits(i);
        percentInstance.setMaximumFractionDigits(i);
        if (f != null) {
            f2 = f.floatValue();
        } else {
            f2 = 0.0f;
        }
        String format = percentInstance.format(Float.valueOf(f2));
        Intrinsics.checkNotNullExpressionValue(format, "format.format(percent ?: 0.0f)");
        return format;
    }

    /* renamed from: r */
    public final String m4394r(LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        String print = f118399d.print(localDate);
        Intrinsics.checkNotNullExpressionValue(print, "DATE_FORMATTER.print(localDate)");
        return print;
    }

    /* renamed from: s */
    public final String m4393s(DateTime dateTime, String separator) {
        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        Intrinsics.checkNotNullParameter(separator, "separator");
        String m4394r = m4394r(new LocalDate(dateTime.getMillis()));
        String m4396p = m4396p(new LocalTime(dateTime.getMillis()));
        return m4394r + separator + m4396p;
    }

    /* renamed from: t */
    public final String m4392t(ReadableInstant instant) {
        Intrinsics.checkNotNullParameter(instant, "instant");
        String print = f118398c.print(instant);
        Intrinsics.checkNotNullExpressionValue(print, "HOUR_FORMATTER.print(instant)");
        return print;
    }

    /* renamed from: u */
    public final String m4391u(long j) {
        return DateUtils.getRelativeTimeSpanString(j, System.currentTimeMillis(), 60000L).toString();
    }

    /* renamed from: v */
    public final String m4390v(DateTime date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return m4391u(date.getMillis());
    }

    /* renamed from: w */
    public final boolean m4389w(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "<this>");
        return f118400e.contains(locale.getCountry());
    }
}
