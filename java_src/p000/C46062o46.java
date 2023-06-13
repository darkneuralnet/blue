package p000;

import java.util.Calendar;
import java.util.TimeZone;
/* renamed from: o46  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C46062o46 {

    /* renamed from: c */
    public static final C46062o46 f101320c = new C46062o46(null, null);

    /* renamed from: a */
    public final Long f101321a;

    /* renamed from: b */
    public final TimeZone f101322b;

    public C46062o46(Long l, TimeZone timeZone) {
        this.f101321a = l;
        this.f101322b = timeZone;
    }

    /* renamed from: c */
    public static C46062o46 m21844c() {
        return f101320c;
    }

    /* renamed from: a */
    public Calendar m21846a() {
        return m21845b(this.f101322b);
    }

    /* renamed from: b */
    public Calendar m21845b(TimeZone timeZone) {
        Calendar calendar;
        if (timeZone == null) {
            calendar = Calendar.getInstance();
        } else {
            calendar = Calendar.getInstance(timeZone);
        }
        Long l = this.f101321a;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}
