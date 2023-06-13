package p000;

import java.util.Locale;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: km1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C44099km1 {

    /* renamed from: a */
    public static final C25230a[] f94889a = {new C25230a(99, 99, -1, -1), new C25230a(35, 36, -1, -1), new C25230a(71, 72, -1, -1), new C25230a(96, 96, -1, -1), new C25230a(85, 86, -1, -1), new C25230a(90, 96, -1, -1), new C25230a(80, 81, -1, -1), new C25230a(6, 6, -1, -1), new C25230a(20, 20, -1, -1), new C25230a(19, 19, -1, -1), new C25230a(32, 34, -1, -1), new C25230a(96, 96, -1, -1), new C25230a(30, 31, -1, -1), new C25230a(96, 96, -1, -1), new C25230a(96, 96, -1, -1), new C25230a(50, 52, -1, -1), new C25230a(83, 83, -1, -1), new C25230a(60, 62, -1, -1), new C25230a(46, 47, -1, -1), new C25230a(66, 67, 73, -1), new C25230a(40, 42, -1, -1), new C25230a(70, 71, -1, -1), new C25230a(1, 2, -1, -1), new C25230a(20, 21, -1, -1), new C25230a(3, 4, -1, -1), new C25230a(96, 96, -1, -1), new C25230a(48, 49, -1, -1), new C25230a(55, 56, -1, -1), new C25230a(63, 65, -1, -1), new C25230a(96, 96, -1, -1), new C25230a(38, 39, -1, -1), new C25230a(55, 56, -1, -1), new C25230a(27, 28, -1, -1), new C25230a(58, 58, -1, -1), new C25230a(68, 69, -1, -1), new C25230a(3, 4, -1, -1), new C25230a(7, 8, -1, -1), new C25230a(87, 88, 86, -1), new C25230a(88, 89, 96, -1), new C25230a(10, 14, 0, 6), new C25230a(43, 45, -1, -1), new C25230a(73, 74, -1, -1), new C25230a(97, 97, -1, -1), new C25230a(15, 19, -1, -1), new C25230a(6, 6, 0, 9), new C25230a(96, 96, -1, -1), new C25230a(2, 2, -1, -1), new C25230a(29, 29, -1, -1), new C25230a(57, 57, -1, -1), new C25230a(37, 38, -1, -1), new C25230a(75, 79, 87, 88), new C25230a(84, 84, -1, -1), new C25230a(22, 24, 20, -1), new C25230a(6, 9, -1, -1), new C25230a(5, 5, -1, -1), new C25230a(98, 99, -1, -1), new C25230a(53, 54, -1, -1), new C25230a(24, 26, -1, -1), new C25230a(82, 83, -1, -1)};

    /* renamed from: b */
    public static final Pattern f94890b = Pattern.compile("[^,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]+(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* renamed from: c */
    public static final Pattern f94891c = Pattern.compile("(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)(?:-(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?))*(?=[,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* renamed from: d */
    public static final Pattern f94892d = Pattern.compile("(?:(ak|alaska)|(al|alabama)|(ar|arkansas)|(as|american[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+samoa)|(az|arizona)|(ca|california)|(co|colorado)|(ct|connecticut)|(dc|district[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+columbia)|(de|delaware)|(fl|florida)|(fm|federated[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+states[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+micronesia)|(ga|georgia)|(gu|guam)|(hi|hawaii)|(ia|iowa)|(id|idaho)|(il|illinois)|(in|indiana)|(ks|kansas)|(ky|kentucky)|(la|louisiana)|(ma|massachusetts)|(md|maryland)|(me|maine)|(mh|marshall[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(mi|michigan)|(mn|minnesota)|(mo|missouri)|(mp|northern[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+mariana[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(ms|mississippi)|(mt|montana)|(nc|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+carolina)|(nd|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+dakota)|(ne|nebraska)|(nh|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+hampshire)|(nj|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+jersey)|(nm|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+mexico)|(nv|nevada)|(ny|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+york)|(oh|ohio)|(ok|oklahoma)|(or|oregon)|(pa|pennsylvania)|(pr|puerto[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+rico)|(pw|palau)|(ri|rhode[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+island)|(sc|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+carolina)|(sd|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+dakota)|(tn|tennessee)|(tx|texas)|(ut|utah)|(va|virginia)|(vi|virgin[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(vt|vermont)|(wa|washington)|(wi|wisconsin)|(wv|west[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+virginia)|(wy|wyoming))(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* renamed from: e */
    public static final Pattern f94893e = Pattern.compile("(?:alley|annex|arcade|ave[.]?|avenue|alameda|bayou|beach|bend|bluffs?|bottom|boulevard|branch|bridge|brooks?|burgs?|bypass|broadway|camino|camp|canyon|cape|causeway|centers?|circles?|cliffs?|club|common|corners?|course|courts?|coves?|creek|crescent|crest|crossing|crossroad|curve|circulo|dale|dam|divide|drives?|estates?|expressway|extensions?|falls?|ferry|fields?|flats?|fords?|forest|forges?|forks?|fort|freeway|gardens?|gateway|glens?|greens?|groves?|harbors?|haven|heights|highway|hills?|hollow|inlet|islands?|isle|junctions?|keys?|knolls?|lakes?|land|landing|lane|lights?|loaf|locks?|lodge|loop|mall|manors?|meadows?|mews|mills?|mission|motorway|mount|mountains?|neck|orchard|oval|overpass|parks?|parkways?|pass|passage|path|pike|pines?|plains?|plaza|points?|ports?|prairie|privada|radial|ramp|ranch|rapids?|rd[.]?|rest|ridges?|river|roads?|route|row|rue|run|shoals?|shores?|skyway|springs?|spurs?|squares?|station|stravenue|stream|st[.]?|streets?|summit|speedway|terrace|throughway|trace|track|trafficway|trail|tunnel|turnpike|underpass|unions?|valleys?|viaduct|views?|villages?|ville|vista|walks?|wall|ways?|wells?|xing|xrd)(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* renamed from: f */
    public static final Pattern f94894f = Pattern.compile("([0-9]+)(st|nd|rd|th)", 2);

    /* renamed from: g */
    public static final Pattern f94895g = Pattern.compile("(?:[0-9]{5}(?:-[0-9]{4})?)(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* renamed from: km1$a */
    /* loaded from: classes.dex */
    public static class C25230a {

        /* renamed from: a */
        public int f94896a;

        /* renamed from: b */
        public int f94897b;

        /* renamed from: c */
        public int f94898c;

        /* renamed from: d */
        public int f94899d;

        public C25230a(int i, int i2, int i3, int i4) {
            this.f94896a = i;
            this.f94897b = i2;
            this.f94898c = i3;
            this.f94899d = i4;
        }

        /* renamed from: a */
        public boolean m28467a(String str) {
            int parseInt = Integer.parseInt(str.substring(0, 2));
            if ((this.f94896a > parseInt || parseInt > this.f94897b) && parseInt != this.f94898c && parseInt != this.f94899d) {
                return false;
            }
            return true;
        }
    }

    private C44099km1() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
        return -r13;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m28474a(String str, MatchResult matchResult) {
        int length;
        MatchResult m28468g;
        int end = matchResult.end();
        Matcher matcher = f94890b.matcher(str);
        String str2 = "";
        int i = -1;
        int i2 = -1;
        int i3 = 1;
        int i4 = 1;
        boolean z = true;
        boolean z2 = false;
        while (true) {
            if (end < str.length()) {
                if (!matcher.find(end)) {
                    length = str.length();
                    break;
                } else if (matcher.end() - matcher.start() > 25) {
                    length = matcher.end();
                    break;
                } else {
                    while (end < matcher.start()) {
                        int i5 = end + 1;
                        if ("\n\u000b\f\r\u0085\u2028\u2029".indexOf(str.charAt(end)) != -1) {
                            i3++;
                        }
                        end = i5;
                    }
                    if (i3 > 5 || (i4 = i4 + 1) > 14) {
                        break;
                    }
                    if (m28469f(str, end) != null) {
                        if (z && i3 > 1) {
                            return -end;
                        }
                        if (i == -1) {
                            i = end;
                        }
                    } else {
                        if (m28471d(matcher.group(0))) {
                            z2 = true;
                        } else if (i4 == 5 && !z2) {
                            end = matcher.end();
                            break;
                        } else if (z2 && i4 > 4 && (m28468g = m28468g(str, end)) != null) {
                            if (str2.equals("et") && m28468g.group(0).equals("al")) {
                                end = m28468g.end();
                                break;
                            }
                            Matcher matcher2 = f94890b.matcher(str);
                            if (matcher2.find(m28468g.end())) {
                                if (m28470e(matcher2.group(0), m28468g)) {
                                    return matcher2.end();
                                }
                            } else {
                                i2 = m28468g.end();
                            }
                        }
                        z = false;
                    }
                    str2 = matcher.group(0);
                    end = matcher.end();
                }
            } else {
                break;
            }
        }
        if (i2 > 0) {
            return i2;
        }
        if (i <= 0) {
            i = end;
        }
        return -i;
    }

    /* renamed from: b */
    public static boolean m28473b(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (Character.isDigit(str.charAt(i2))) {
                i++;
            }
        }
        if (i > 5) {
            return false;
        }
        Matcher matcher = f94894f.matcher(str);
        if (!matcher.find()) {
            return true;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        if (parseInt == 0) {
            return false;
        }
        String lowerCase = matcher.group(2).toLowerCase(Locale.getDefault());
        int i3 = parseInt % 10;
        String str2 = "th";
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    return lowerCase.equals("th");
                }
                if (parseInt % 100 != 13) {
                    str2 = "rd";
                }
                return lowerCase.equals(str2);
            }
            if (parseInt % 100 != 12) {
                str2 = "nd";
            }
            return lowerCase.equals(str2);
        }
        if (parseInt % 100 != 11) {
            str2 = "st";
        }
        return lowerCase.equals(str2);
    }

    /* renamed from: c */
    public static String m28472c(String str) {
        Matcher matcher = f94891c.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            if (m28473b(matcher.group(0))) {
                int start = matcher.start();
                int m28474a = m28474a(str, matcher);
                if (m28474a > 0) {
                    return str.substring(start, m28474a);
                }
                i = -m28474a;
            } else {
                i = matcher.end();
            }
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m28471d(String str) {
        return f94893e.matcher(str).matches();
    }

    /* renamed from: e */
    public static boolean m28470e(String str, MatchResult matchResult) {
        if (matchResult == null) {
            return false;
        }
        int groupCount = matchResult.groupCount();
        while (true) {
            if (groupCount <= 0) {
                break;
            }
            int i = groupCount - 1;
            if (matchResult.group(groupCount) != null) {
                groupCount = i;
                break;
            }
            groupCount = i;
        }
        if (!f94895g.matcher(str).matches() || !f94889a[groupCount].m28467a(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static MatchResult m28469f(String str, int i) {
        if (i > 0 && ":,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029".indexOf(str.charAt(i - 1)) == -1) {
            return null;
        }
        Matcher region = f94891c.matcher(str).region(i, str.length());
        if (region.lookingAt()) {
            MatchResult matchResult = region.toMatchResult();
            if (m28473b(matchResult.group(0))) {
                return matchResult;
            }
        }
        return null;
    }

    /* renamed from: g */
    public static MatchResult m28468g(String str, int i) {
        if (i > 0 && ",*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029".indexOf(str.charAt(i - 1)) == -1) {
            return null;
        }
        Matcher region = f94892d.matcher(str).region(i, str.length());
        if (!region.lookingAt()) {
            return null;
        }
        return region.toMatchResult();
    }
}
