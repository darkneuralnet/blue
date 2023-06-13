package p000;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: ji6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C43471ji6 {

    /* renamed from: a */
    public static AtomicReference<C46062o46> f93222a = new AtomicReference<>();

    private C43471ji6() {
    }

    /* renamed from: a */
    public static long m30060a(long j) {
        Calendar m30049l = m30049l();
        m30049l.setTimeInMillis(j);
        return m30056e(m30049l).getTimeInMillis();
    }

    @TargetApi(24)
    /* renamed from: b */
    public static DateFormat m30059b(Locale locale) {
        return m30057d("MMMd", locale);
    }

    @TargetApi(24)
    /* renamed from: c */
    public static DateFormat m30058c(Locale locale) {
        return m30057d("MMMEd", locale);
    }

    @TargetApi(24)
    /* renamed from: d */
    public static DateFormat m30057d(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(m30050k());
        return instanceForSkeleton;
    }

    /* renamed from: e */
    public static Calendar m30056e(Calendar calendar) {
        Calendar m30048m = m30048m(calendar);
        Calendar m30049l = m30049l();
        m30049l.set(m30048m.get(1), m30048m.get(2), m30048m.get(5));
        return m30049l;
    }

    /* renamed from: f */
    public static SimpleDateFormat m30055f() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toPattern().replaceAll("\\s+", ""), Locale.getDefault());
        simpleDateFormat.setTimeZone(m30052i());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    /* renamed from: g */
    public static String m30054g(Resources resources, SimpleDateFormat simpleDateFormat) {
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(C40534el4.mtrl_picker_text_input_year_abbr);
        String string2 = resources.getString(C40534el4.mtrl_picker_text_input_month_abbr);
        String string3 = resources.getString(C40534el4.mtrl_picker_text_input_day_abbr);
        if (pattern.replaceAll("[^y]", "").length() == 1) {
            pattern = pattern.replace("y", "yyyy");
        }
        return pattern.replace(DateTokenConverter.CONVERTER_KEY, string3).replace("M", string2).replace("y", string);
    }

    /* renamed from: h */
    public static C46062o46 m30053h() {
        C46062o46 c46062o46 = f93222a.get();
        if (c46062o46 == null) {
            return C46062o46.m21844c();
        }
        return c46062o46;
    }

    /* renamed from: i */
    public static TimeZone m30052i() {
        return TimeZone.getTimeZone("UTC");
    }

    /* renamed from: j */
    public static Calendar m30051j() {
        Calendar m21846a = m30053h().m21846a();
        m21846a.set(11, 0);
        m21846a.set(12, 0);
        m21846a.set(13, 0);
        m21846a.set(14, 0);
        m21846a.setTimeZone(m30052i());
        return m21846a;
    }

    @TargetApi(24)
    /* renamed from: k */
    public static android.icu.util.TimeZone m30050k() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    /* renamed from: l */
    public static Calendar m30049l() {
        return m30048m(null);
    }

    /* renamed from: m */
    public static Calendar m30048m(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(m30052i());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    @TargetApi(24)
    /* renamed from: n */
    public static DateFormat m30047n(Locale locale) {
        return m30057d("yMMMd", locale);
    }

    @TargetApi(24)
    /* renamed from: o */
    public static DateFormat m30046o(Locale locale) {
        return m30057d("yMMMEd", locale);
    }
}
