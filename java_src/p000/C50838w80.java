package p000;

import com.facebook.share.internal.C17296a;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDateTime;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0001¨\u0006\u0005"}, m28432d2 = {"Lorg/joda/time/LocalDateTime;", "Ljava/util/Calendar;", "b", "", C17296a.f69688o, "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: w80  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50838w80 {
    /* renamed from: a */
    public static final int m7367a(Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        Calendar calendar2 = Calendar.getInstance();
        int i = calendar2.get(1) - calendar.get(1);
        if (calendar2.get(6) < calendar.get(6)) {
            return i - 1;
        }
        return i;
    }

    /* renamed from: b */
    public static final Calendar m7366b(LocalDateTime localDateTime) {
        Intrinsics.checkNotNullParameter(localDateTime, "<this>");
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, localDateTime.getYear());
        calendar.set(2, localDateTime.getMonthOfYear() - 1);
        calendar.set(5, localDateTime.getDayOfMonth());
        Intrinsics.checkNotNullExpressionValue(calendar, "calendar");
        return calendar;
    }
}
