package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0006\u0010\u0004\u001a\u00020\u0000\u001a\u0012\u0010\t\u001a\u00020\b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006\u001a\u001e\u0010\f\u001a\u00020\u0005*\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007\u001a\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006\u001a>\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u000eH\u0007\u001a\n\u0010\u0016\u001a\u00020\b*\u00020\u0000\u001a\n\u0010\u0017\u001a\u00020\u0000*\u00020\b\"\u001c\u0010\u001a\u001a\n \u0018*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019¨\u0006\u001b"}, m28432d2 = {"", "i", "", "j", "h", "", "La20;", "dateFormat", "Ljava/util/Date;", "k", "Ljava/util/TimeZone;", "timeZone", DateTokenConverter.CONVERTER_KEY, "f", "", "year", "month", "day", "hours", "minutes", "seconds", C17296a.f69688o, "b", "g", "kotlin.jvm.PlatformType", "Ljava/util/TimeZone;", "UTC_TIME_ZONE", "android-sdk-base_release"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: oT0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C46287oT0 {

    /* renamed from: a */
    public static final TimeZone f102036a = TimeZone.getTimeZone("UTC");

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: oT0$a */
    /* loaded from: classes2.dex */
    public static final class C26992a extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f102037g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26992a(String str) {
            super(0);
            this.f102037g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Exception parsing date " + this.f102037g + ". Returning null";
        }
    }

    /* renamed from: a */
    public static final Date m21035a(int i, int i2, int i3, int i4, int i5, int i6) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(i, i2, i3, i4, i5, i6);
        gregorianCalendar.setTimeZone(f102036a);
        Date time = gregorianCalendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "calendar.time");
        return time;
    }

    /* renamed from: b */
    public static final Date m21034b(long j) {
        return new Date(j * 1000);
    }

    /* renamed from: d */
    public static final String m21032d(Date date, EnumC37717a20 dateFormat, TimeZone timeZone) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Intrinsics.checkNotNullParameter(dateFormat, "dateFormat");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat.getFormat(), Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        String format = simpleDateFormat.format(date);
        Intrinsics.checkNotNullExpressionValue(format, "simpleDateFormat.format(this)");
        return format;
    }

    /* renamed from: e */
    public static /* synthetic */ String m21031e(Date date, EnumC37717a20 enumC37717a20, TimeZone UTC_TIME_ZONE, int i, Object obj) {
        if ((i & 2) != 0) {
            UTC_TIME_ZONE = f102036a;
            Intrinsics.checkNotNullExpressionValue(UTC_TIME_ZONE, "UTC_TIME_ZONE");
        }
        return m21032d(date, enumC37717a20, UTC_TIME_ZONE);
    }

    /* renamed from: f */
    public static final String m21030f(EnumC37717a20 dateFormat) {
        Intrinsics.checkNotNullParameter(dateFormat, "dateFormat");
        Date m21034b = m21034b(m21027i());
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkNotNullExpressionValue(timeZone, "getDefault()");
        return m21032d(m21034b, dateFormat, timeZone);
    }

    /* renamed from: g */
    public static final long m21029g(Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        return TimeUnit.MILLISECONDS.toSeconds(date.getTime());
    }

    /* renamed from: h */
    public static final long m21028h() {
        return System.currentTimeMillis();
    }

    /* renamed from: i */
    public static final long m21027i() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    /* renamed from: j */
    public static final double m21026j() {
        return System.currentTimeMillis() / 1000.0d;
    }

    /* renamed from: k */
    public static final Date m21025k(String str, EnumC37717a20 dateFormat) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(dateFormat, "dateFormat");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat.getFormat(), Locale.US);
        simpleDateFormat.setTimeZone(f102036a);
        try {
            Date parse = simpleDateFormat.parse(str);
            Intrinsics.checkNotNull(parse);
            return parse;
        } catch (Exception e) {
            C43664k20 c43664k20 = C43664k20.f93782a;
            C43664k20.m29441f(c43664k20, c43664k20.m29432o("DateTimeUtils"), C43664k20.EnumC25082a.E, e, false, new C26992a(str), 8, null);
            throw e;
        }
    }
}
