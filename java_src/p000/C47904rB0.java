package p000;

import com.amazonaws.services.p026s3.model.InstructionFileId;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.TimeZone;
import java.util.TreeMap;
/* renamed from: rB0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C47904rB0 {

    /* renamed from: d */
    public static TimeZone f106653d;

    /* renamed from: a */
    public static TreeMap<String, Integer> f106650a = new TreeMap<>(new C27872a());

    /* renamed from: b */
    public static TreeMap<String, Integer> f106651b = new TreeMap<>(new C27872a());

    /* renamed from: c */
    public static HashSet<String> f106652c = new HashSet<>();

    /* renamed from: e */
    public static TreeMap<String, TimeZone> f106654e = new TreeMap<>();

    /* renamed from: rB0$a */
    /* loaded from: classes6.dex */
    public static class C27872a implements Comparator<String> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(String str, String str2) {
            return str.compareToIgnoreCase(str2);
        }
    }

    static {
        String[] availableIDs;
        Locale[] availableLocales;
        f106652c.add("à");
        f106652c.add("at");
        f106652c.add("MEZ");
        f106652c.add("Uhr");
        f106652c.add("h");
        f106652c.add("pm");
        f106652c.add("PM");
        f106652c.add("am");
        f106652c.add("AM");
        f106652c.add("min");
        f106652c.add("um");
        f106652c.add("o'clock");
        for (String str : TimeZone.getAvailableIDs()) {
            f106654e.put(str, TimeZone.getTimeZone(str));
        }
        for (Locale locale : DateFormatSymbols.getAvailableLocales()) {
            if (!"ja".equals(locale.getLanguage()) && !"ko".equals(locale.getLanguage()) && !"zh".equals(locale.getLanguage())) {
                DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
                String[] months = dateFormatSymbols.getMonths();
                for (int i = 0; i < months.length; i++) {
                    if (months[i].length() != 0) {
                        m16279d(f106650a, months[i], Integer.valueOf(i));
                    }
                }
                String[] shortMonths = dateFormatSymbols.getShortMonths();
                for (int i2 = 0; i2 < shortMonths.length; i2++) {
                    String str2 = shortMonths[i2];
                    if (str2.length() != 0 && !Character.isDigit(str2.charAt(str2.length() - 1))) {
                        m16279d(f106650a, shortMonths[i2], Integer.valueOf(i2));
                        m16279d(f106650a, shortMonths[i2].replace(InstructionFileId.DOT, ""), Integer.valueOf(i2));
                    }
                }
                String[] weekdays = dateFormatSymbols.getWeekdays();
                for (int i3 = 0; i3 < weekdays.length; i3++) {
                    String str3 = weekdays[i3];
                    if (str3.length() != 0) {
                        m16279d(f106651b, str3, Integer.valueOf(i3));
                        m16279d(f106651b, str3.replace(InstructionFileId.DOT, ""), Integer.valueOf(i3));
                    }
                }
                String[] shortWeekdays = dateFormatSymbols.getShortWeekdays();
                for (int i4 = 0; i4 < shortWeekdays.length; i4++) {
                    String str4 = shortWeekdays[i4];
                    if (str4.length() != 0) {
                        m16279d(f106651b, str4, Integer.valueOf(i4));
                        m16279d(f106651b, str4.replace(InstructionFileId.DOT, ""), Integer.valueOf(i4));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static Date m16282a(StringTokenizer stringTokenizer, Calendar calendar, String str) {
        if (str == null) {
            if (!stringTokenizer.hasMoreTokens()) {
                return calendar.getTime();
            }
            str = stringTokenizer.nextToken();
        }
        return m16281b(stringTokenizer, calendar, str);
    }

    /* renamed from: b */
    public static Date m16281b(StringTokenizer stringTokenizer, Calendar calendar, String str) {
        calendar.set(11, Integer.parseInt(m16272k(stringTokenizer, str, calendar)));
        if (!stringTokenizer.hasMoreTokens()) {
            return calendar.getTime();
        }
        String m16272k = m16272k(stringTokenizer, stringTokenizer.nextToken(), calendar);
        if (m16272k == null) {
            return calendar.getTime();
        }
        calendar.set(12, Integer.parseInt(m16272k));
        if (!stringTokenizer.hasMoreTokens()) {
            return calendar.getTime();
        }
        String m16272k2 = m16272k(stringTokenizer, stringTokenizer.nextToken(), calendar);
        if (m16272k2 == null) {
            return calendar.getTime();
        }
        calendar.set(13, Integer.parseInt(m16272k2));
        if (!stringTokenizer.hasMoreTokens()) {
            return calendar.getTime();
        }
        String m16272k3 = m16272k(stringTokenizer, stringTokenizer.nextToken(), calendar);
        if (m16272k3 == null) {
            return calendar.getTime();
        }
        String m16272k4 = m16272k(stringTokenizer, m16272k3, calendar);
        if (m16272k4.length() == 4 && Character.isDigit(m16272k4.charAt(0))) {
            calendar.set(1, m16275h(m16272k4));
        }
        return calendar.getTime();
    }

    /* renamed from: c */
    public static Date m16280c(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        if (obj instanceof Number) {
            return new Date(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            StringTokenizer stringTokenizer = new StringTokenizer(((String) obj).replace("p.m.", "pm").replace("a.m.", "am"), " -/:,.+年月日曜時分秒");
            if (!stringTokenizer.hasMoreTokens()) {
                return null;
            }
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.length() == 4 && Character.isDigit(nextToken.charAt(0))) {
                return m16276g(stringTokenizer, nextToken);
            }
            if (f106651b.containsKey(nextToken)) {
                if (!stringTokenizer.hasMoreTokens()) {
                    return null;
                }
                nextToken = stringTokenizer.nextToken();
            }
            if (f106650a.containsKey(nextToken)) {
                return m16277f(stringTokenizer, nextToken);
            }
            if (!Character.isDigit(nextToken.charAt(0))) {
                return null;
            }
            return m16278e(stringTokenizer, nextToken);
        }
        throw new RuntimeException("Primitive: Can not convert " + obj.getClass().getName() + " to int");
    }

    /* renamed from: d */
    public static void m16279d(TreeMap<String, Integer> treeMap, String str, Integer num) {
        treeMap.put(str, num);
        treeMap.put(str.replace("é", "e").replace("û", "u"), num);
    }

    /* renamed from: e */
    public static Date m16278e(StringTokenizer stringTokenizer, String str) {
        GregorianCalendar m16274i = m16274i();
        m16274i.set(5, Integer.parseInt(str));
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        m16274i.set(2, m16273j(stringTokenizer.nextToken()).intValue());
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        m16274i.set(1, m16275h(stringTokenizer.nextToken()));
        return m16282a(stringTokenizer, m16274i, null);
    }

    /* renamed from: f */
    public static Date m16277f(StringTokenizer stringTokenizer, String str) {
        GregorianCalendar m16274i = m16274i();
        Integer num = f106650a.get(str);
        if (num != null) {
            m16274i.set(2, num.intValue());
            if (!stringTokenizer.hasMoreTokens()) {
                return null;
            }
            m16274i.set(5, Integer.parseInt(stringTokenizer.nextToken()));
            if (!stringTokenizer.hasMoreTokens()) {
                return null;
            }
            String nextToken = stringTokenizer.nextToken();
            if (Character.isLetter(nextToken.charAt(0))) {
                if (!stringTokenizer.hasMoreTokens()) {
                    return null;
                }
                nextToken = stringTokenizer.nextToken();
            }
            if (nextToken.length() == 4) {
                m16274i.set(1, m16275h(nextToken));
            } else if (nextToken.length() == 2) {
                return m16281b(stringTokenizer, m16274i, nextToken);
            }
            return m16282a(stringTokenizer, m16274i, null);
        }
        throw new NullPointerException("can not parse " + str + " as month");
    }

    /* renamed from: g */
    public static Date m16276g(StringTokenizer stringTokenizer, String str) {
        GregorianCalendar m16274i = m16274i();
        m16274i.set(1, Integer.parseInt(str));
        if (!stringTokenizer.hasMoreTokens()) {
            return m16274i.getTime();
        }
        m16274i.set(2, m16273j(stringTokenizer.nextToken()).intValue());
        if (!stringTokenizer.hasMoreTokens()) {
            return m16274i.getTime();
        }
        String nextToken = stringTokenizer.nextToken();
        if (Character.isDigit(nextToken.charAt(0))) {
            if (nextToken.length() == 5 && nextToken.charAt(2) == 'T') {
                m16274i.set(5, Integer.parseInt(nextToken.substring(0, 2)));
                return m16282a(stringTokenizer, m16274i, nextToken.substring(3));
            }
            m16274i.set(5, Integer.parseInt(nextToken));
            return m16282a(stringTokenizer, m16274i, null);
        }
        return m16274i.getTime();
    }

    /* renamed from: h */
    public static int m16275h(String str) {
        int parseInt = Integer.parseInt(str);
        return parseInt < 100 ? parseInt > 30 ? parseInt + CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE : parseInt + 1900 : parseInt;
    }

    /* renamed from: i */
    public static GregorianCalendar m16274i() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, 0, 0, 0, 0, 0);
        TimeZone timeZone = f106653d;
        if (timeZone != null) {
            gregorianCalendar.setTimeZone(timeZone);
        }
        TimeZone timeZone2 = gregorianCalendar.getTimeZone();
        if (timeZone2 == null) {
            timeZone2 = TimeZone.getDefault();
        }
        gregorianCalendar.setTimeInMillis(-timeZone2.getRawOffset());
        return gregorianCalendar;
    }

    /* renamed from: j */
    public static Integer m16273j(String str) {
        if (Character.isDigit(str.charAt(0))) {
            return Integer.valueOf(Integer.parseInt(str) - 1);
        }
        Integer num = f106650a.get(str);
        if (num != null) {
            return Integer.valueOf(num.intValue());
        }
        throw new NullPointerException("can not parse " + str + " as month");
    }

    /* renamed from: k */
    public static String m16272k(StringTokenizer stringTokenizer, String str, Calendar calendar) {
        while (true) {
            TimeZone timeZone = f106654e.get(str);
            if (timeZone != null) {
                calendar.setTimeZone(timeZone);
                if (!stringTokenizer.hasMoreTokens()) {
                    return null;
                }
                str = stringTokenizer.nextToken();
            } else if (f106652c.contains(str)) {
                if (str.equalsIgnoreCase("pm")) {
                    calendar.add(9, 1);
                }
                if (str.equalsIgnoreCase("am")) {
                    calendar.add(9, 0);
                }
                if (!stringTokenizer.hasMoreTokens()) {
                    return null;
                }
                str = stringTokenizer.nextToken();
            } else {
                return str;
            }
        }
    }
}
