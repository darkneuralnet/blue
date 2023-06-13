package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Minutes;
import org.joda.time.ReadableInstant;
import org.joda.time.Seconds;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000\u001a\u0016\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000\u001a\u0012\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000\u001a\u001e\u0010\f\u001a\u00020\u000b*\u0004\u0018\u00010\u00002\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t\u001a\u0012\u0010\r\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007\u001a \u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000f\u001a\u00020\u0000\u001a\n\u0010\u0011\u001a\u00020\u000b*\u00020\u0000\u001a\n\u0010\u0013\u001a\u00020\u0012*\u00020\u0000\u001a\n\u0010\u0014\u001a\u00020\u0012*\u00020\u0000¨\u0006\u0015"}, m28432d2 = {"Lorg/joda/time/DateTime;", "e", "date1", "date2", "f", "", "i", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "appendAgo", "", "c", DateTokenConverter.CONVERTER_KEY, "earlierTime", "laterTime", C17296a.f69688o, "b", "", "h", "g", "localization_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: pT0 */
/* loaded from: classes3.dex */
public final class C46880pT0 {
    /* renamed from: a */
    public static final String m19261a(Context context, DateTime dateTime, DateTime laterTime) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(laterTime, "laterTime");
        if (dateTime == null) {
            String string = context.getString(C45871nl4.time_elapsed_greater_than_a_month);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…sed_greater_than_a_month)");
            return string;
        }
        long millis = laterTime.getMillis() - dateTime.getMillis();
        if (millis < TimeUnit.MINUTES.toMillis(1L)) {
            String string2 = context.getString(C45871nl4.time_elapsed_seconds, Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(millis)));
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…conds(timeElapsedMillis))");
            return string2;
        } else if (millis < TimeUnit.HOURS.toMillis(1L)) {
            String string3 = context.getString(C45871nl4.time_elapsed_minutes, Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(millis)));
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.stri…nutes(timeElapsedMillis))");
            return string3;
        } else if (millis < TimeUnit.DAYS.toMillis(1L)) {
            String string4 = context.getString(C45871nl4.time_elapsed_hours, Long.valueOf(TimeUnit.MILLISECONDS.toHours(millis)));
            Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.stri…Hours(timeElapsedMillis))");
            return string4;
        } else {
            String string5 = context.getString(C45871nl4.time_elapsed_days, Long.valueOf(TimeUnit.MILLISECONDS.toDays(millis)));
            Intrinsics.checkNotNullExpressionValue(string5, "context.getString(R.stri…oDays(timeElapsedMillis))");
            return string5;
        }
    }

    /* renamed from: b */
    public static final String m19260b(DateTime dateTime) {
        int i;
        Intrinsics.checkNotNullParameter(dateTime, "<this>");
        DateTime now = DateTime.now();
        if (dateTime.compareTo((ReadableInstant) now) < 0) {
            return "0:00";
        }
        Seconds secondsBetween = Seconds.secondsBetween(now, dateTime);
        Minutes standardMinutes = secondsBetween.toStandardMinutes();
        StringBuilder sb = new StringBuilder();
        sb.append(standardMinutes.getMinutes());
        sb.append(":");
        if (secondsBetween.getSeconds() % 60 < 10) {
            i = 0;
        } else {
            i = "";
        }
        sb.append(i);
        sb.append(secondsBetween.getSeconds() % 60);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder()\n    .app…nds % 60)\n    .toString()");
        return sb2;
    }

    /* renamed from: c */
    public static final String m19259c(DateTime dateTime, Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        String m19261a = m19261a(context, dateTime, now);
        if (z) {
            String string = context.getString(C45871nl4.time_elapsed_ago, m19261a);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…elapsed_ago, timeElapsed)");
            return string;
        }
        return m19261a;
    }

    /* renamed from: d */
    public static final String m19258d(DateTime dateTime, Context context) {
        Intrinsics.checkNotNullParameter(dateTime, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return m19261a(context, DateTime.now(), dateTime);
    }

    /* renamed from: e */
    public static final DateTime m19257e(DateTime dateTime) {
        Intrinsics.checkNotNullParameter(dateTime, "<this>");
        DateTime dateTime2 = dateTime.toDateTime(DateTimeZone.getDefault());
        Intrinsics.checkNotNullExpressionValue(dateTime2, "toDateTime((DateTimeZone.getDefault()))");
        return dateTime2;
    }

    /* renamed from: f */
    public static final DateTime m19256f(DateTime date1, DateTime date2) {
        Intrinsics.checkNotNullParameter(date1, "date1");
        Intrinsics.checkNotNullParameter(date2, "date2");
        if (date1.compareTo((ReadableInstant) date2) < 0) {
            return date2;
        }
        return date1;
    }

    /* renamed from: g */
    public static final int m19255g(DateTime dateTime) {
        Intrinsics.checkNotNullParameter(dateTime, "<this>");
        return Minutes.minutesBetween(dateTime, DateTime.now()).getMinutes();
    }

    public static /* synthetic */ String getElapsedTime$default(DateTime dateTime, Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return m19259c(dateTime, context, z);
    }

    /* renamed from: h */
    public static final int m19254h(DateTime dateTime) {
        Intrinsics.checkNotNullParameter(dateTime, "<this>");
        return Seconds.secondsBetween(dateTime, DateTime.now()).getSeconds();
    }

    /* renamed from: i */
    public static final double m19253i(DateTime dateTime, DateTime date2) {
        Intrinsics.checkNotNullParameter(dateTime, "<this>");
        Intrinsics.checkNotNullParameter(date2, "date2");
        return (dateTime.getMillis() - date2.getMillis()) / 1000.0d;
    }
}
