package p000;

import ch.qos.logback.core.net.SyslogConstants;
import co.bird.android.model.GeometryCollection;
import java.io.IOException;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import kotlin.KotlinVersion;
import org.locationtech.jts.p060io.ParseException;
/* renamed from: jw6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C43611jw6 {

    /* renamed from: g */
    public static FB0 f93570g = AB0.m116035d();

    /* renamed from: a */
    public C38409bC1 f93571a;

    /* renamed from: b */
    public FB0 f93572b;

    /* renamed from: c */
    public C40414eZ3 f93573c;

    /* renamed from: d */
    public boolean f93574d;

    /* renamed from: e */
    public boolean f93575e;

    /* renamed from: f */
    public boolean f93576f;

    public C43611jw6() {
        this(new C38409bC1());
    }

    /* renamed from: H */
    public static String m29708H(StreamTokenizer streamTokenizer) {
        int i = streamTokenizer.ttype;
        if (i != -3) {
            if (i != -2) {
                if (i != -1) {
                    if (i != 10) {
                        return "'" + ((char) streamTokenizer.ttype) + "'";
                    }
                    return "End-of-Line";
                }
                return "End-of-Stream";
            }
            return "<NUMBER>";
        }
        return "'" + streamTokenizer.sval + "'";
    }

    /* renamed from: c */
    public static StreamTokenizer m29705c(Reader reader) {
        StreamTokenizer streamTokenizer = new StreamTokenizer(reader);
        streamTokenizer.resetSyntax();
        streamTokenizer.wordChars(97, 122);
        streamTokenizer.wordChars(65, 90);
        streamTokenizer.wordChars(SyslogConstants.LOG_LOCAL4, KotlinVersion.MAX_COMPONENT_VALUE);
        streamTokenizer.wordChars(48, 57);
        streamTokenizer.wordChars(45, 45);
        streamTokenizer.wordChars(43, 43);
        streamTokenizer.wordChars(46, 46);
        streamTokenizer.whitespaceChars(0, 32);
        streamTokenizer.commentChar(35);
        return streamTokenizer;
    }

    /* renamed from: d */
    public static void m29704d(List<C52053yB0> list, int i, boolean z) {
        if (list.size() == 0) {
            return;
        }
        if (z && !m29694n(list)) {
            list.add(list.get(0).mo3888e());
        }
        while (list.size() < i) {
            list.add(list.get(list.size() - 1).mo3888e());
        }
    }

    /* renamed from: i */
    public static String m29699i(StreamTokenizer streamTokenizer) throws IOException, ParseException {
        String m29695m = m29695m(streamTokenizer);
        if (!m29695m.equals(",") && !m29695m.equals(")")) {
            throw m29689s(streamTokenizer, ", or )");
        }
        return m29695m;
    }

    /* renamed from: j */
    public static String m29698j(StreamTokenizer streamTokenizer) throws IOException, ParseException {
        String m29695m = m29695m(streamTokenizer);
        if (m29695m.equalsIgnoreCase("Z")) {
            m29695m = m29695m(streamTokenizer);
        } else if (m29695m.equalsIgnoreCase("M")) {
            m29695m = m29695m(streamTokenizer);
        } else if (m29695m.equalsIgnoreCase("ZM")) {
            m29695m = m29695m(streamTokenizer);
        }
        if (!m29695m.equals("EMPTY") && !m29695m.equals("(")) {
            throw m29689s(streamTokenizer, "EMPTY or (");
        }
        return m29695m;
    }

    /* renamed from: l */
    public static EnumSet<EnumC31832Ay3> m29696l(StreamTokenizer streamTokenizer) throws IOException, ParseException {
        EnumSet<EnumC31832Ay3> of = EnumSet.of(EnumC31832Ay3.X, EnumC31832Ay3.Y);
        String upperCase = m29690r(streamTokenizer).toUpperCase(Locale.ROOT);
        if (upperCase.equalsIgnoreCase("Z")) {
            streamTokenizer.nextToken();
            of.add(EnumC31832Ay3.Z);
        } else if (upperCase.equalsIgnoreCase("M")) {
            streamTokenizer.nextToken();
            of.add(EnumC31832Ay3.M);
        } else if (upperCase.equalsIgnoreCase("ZM")) {
            streamTokenizer.nextToken();
            of.add(EnumC31832Ay3.Z);
            of.add(EnumC31832Ay3.M);
        }
        return of;
    }

    /* renamed from: m */
    public static String m29695m(StreamTokenizer streamTokenizer) throws IOException, ParseException {
        int nextToken = streamTokenizer.nextToken();
        if (nextToken != -3) {
            if (nextToken != 44) {
                if (nextToken != 40) {
                    if (nextToken == 41) {
                        return ")";
                    }
                    throw m29689s(streamTokenizer, "word");
                }
                return "(";
            }
            return ",";
        }
        String str = streamTokenizer.sval;
        if (str.equalsIgnoreCase("EMPTY")) {
            return "EMPTY";
        }
        return str;
    }

    /* renamed from: n */
    public static boolean m29694n(List<C52053yB0> list) {
        if (list.size() == 0) {
            return true;
        }
        if (list.size() != 1 && list.get(0).m3886g(list.get(list.size() - 1))) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public static boolean m29693o(StreamTokenizer streamTokenizer) throws IOException {
        int nextToken = streamTokenizer.nextToken();
        streamTokenizer.pushBack();
        if (nextToken == -3) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static boolean m29692p(StreamTokenizer streamTokenizer) throws IOException {
        int nextToken = streamTokenizer.nextToken();
        streamTokenizer.pushBack();
        if (nextToken == 40) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public static String m29690r(StreamTokenizer streamTokenizer) throws IOException, ParseException {
        String m29695m = m29695m(streamTokenizer);
        streamTokenizer.pushBack();
        return m29695m;
    }

    /* renamed from: s */
    public static ParseException m29689s(StreamTokenizer streamTokenizer, String str) {
        if (streamTokenizer.ttype == -2) {
            C4596Ko.m98279f("Unexpected NUMBER token");
        }
        if (streamTokenizer.ttype == 10) {
            C4596Ko.m98279f("Unexpected EOL token");
        }
        String m29708H = m29708H(streamTokenizer);
        return m29688t(streamTokenizer, "Expected " + str + " but found " + m29708H);
    }

    /* renamed from: t */
    public static ParseException m29688t(StreamTokenizer streamTokenizer, String str) {
        return new ParseException(str + " (line " + streamTokenizer.lineno() + ")");
    }

    /* renamed from: A */
    public final C34108Kr2 m29715A(StreamTokenizer streamTokenizer, EnumSet<EnumC31832Ay3> enumSet) throws IOException, ParseException {
        return this.f93571a.m64846i(m29702f(streamTokenizer, enumSet, 3, true));
    }

    /* renamed from: B */
    public final DW2 m29714B(StreamTokenizer streamTokenizer, EnumSet<EnumC31832Ay3> enumSet) throws IOException, ParseException {
        if (m29698j(streamTokenizer).equals("EMPTY")) {
            return this.f93571a.m64844k();
        }
        ArrayList arrayList = new ArrayList();
        do {
            arrayList.add(m29682z(streamTokenizer, enumSet));
        } while (m29699i(streamTokenizer).equals(","));
        return this.f93571a.m64843l((C32002Br2[]) arrayList.toArray(new C32002Br2[arrayList.size()]));
    }

    /* renamed from: C */
    public final VW2 m29713C(StreamTokenizer streamTokenizer, EnumSet<EnumC31832Ay3> enumSet) throws IOException, ParseException {
        String m29690r;
        if (m29698j(streamTokenizer).equals("EMPTY")) {
            return this.f93571a.m64840o(new FW3[0]);
        }
        if (this.f93575e && (m29690r = m29690r(streamTokenizer)) != "(" && m29690r != "EMPTY") {
            return this.f93571a.m64841n(m29701g(streamTokenizer, enumSet));
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(m29711E(streamTokenizer, enumSet));
        String m29699i = m29699i(streamTokenizer);
        while (m29699i.equals(",")) {
            arrayList.add(m29711E(streamTokenizer, enumSet));
            m29699i = m29699i(streamTokenizer);
        }
        return this.f93571a.m64840o((FW3[]) arrayList.toArray(new FW3[arrayList.size()]));
    }

    /* renamed from: D */
    public final WW2 m29712D(StreamTokenizer streamTokenizer, EnumSet<EnumC31832Ay3> enumSet) throws IOException, ParseException {
        if (m29698j(streamTokenizer).equals("EMPTY")) {
            return this.f93571a.m64838q();
        }
        ArrayList arrayList = new ArrayList();
        do {
            arrayList.add(m29710F(streamTokenizer, enumSet));
        } while (m29699i(streamTokenizer).equals(","));
        return this.f93571a.m64837r((CX3[]) arrayList.toArray(new CX3[arrayList.size()]));
    }

    /* renamed from: E */
    public final FW3 m29711E(StreamTokenizer streamTokenizer, EnumSet<EnumC31832Ay3> enumSet) throws IOException, ParseException {
        return this.f93571a.m64834u(m29702f(streamTokenizer, enumSet, 1, false));
    }

    /* renamed from: F */
    public final CX3 m29710F(StreamTokenizer streamTokenizer, EnumSet<EnumC31832Ay3> enumSet) throws IOException, ParseException {
        if (m29698j(streamTokenizer).equals("EMPTY")) {
            return this.f93571a.m64832w(m29706b(enumSet));
        }
        ArrayList arrayList = new ArrayList();
        C34108Kr2 m29715A = m29715A(streamTokenizer, enumSet);
        String m29699i = m29699i(streamTokenizer);
        while (m29699i.equals(",")) {
            arrayList.add(m29715A(streamTokenizer, enumSet));
            m29699i = m29699i(streamTokenizer);
        }
        return this.f93571a.m64830y(m29715A, (C34108Kr2[]) arrayList.toArray(new C34108Kr2[arrayList.size()]));
    }

    /* renamed from: G */
    public final int m29709G(EnumSet<EnumC31832Ay3> enumSet) {
        int i;
        if (enumSet.contains(EnumC31832Ay3.Z)) {
            i = 3;
        } else {
            i = 2;
        }
        if (enumSet.contains(EnumC31832Ay3.M)) {
            i++;
        }
        if (i == 2 && this.f93574d) {
            return i + 1;
        }
        return i;
    }

    /* renamed from: a */
    public final C52053yB0 m29707a(EnumSet<EnumC31832Ay3> enumSet) {
        boolean contains = enumSet.contains(EnumC31832Ay3.Z);
        boolean contains2 = enumSet.contains(EnumC31832Ay3.M);
        if (contains && contains2) {
            return new KB0();
        }
        if (contains2) {
            return new JB0();
        }
        if (!contains && !this.f93574d) {
            return new IB0();
        }
        return new C52053yB0();
    }

    /* renamed from: b */
    public final EB0 m29706b(EnumSet<EnumC31832Ay3> enumSet) throws IOException, ParseException {
        return this.f93572b.mo107447a(0, m29709G(enumSet), enumSet.contains(EnumC31832Ay3.M) ? 1 : 0);
    }

    /* renamed from: e */
    public final C52053yB0 m29703e(StreamTokenizer streamTokenizer, EnumSet<EnumC31832Ay3> enumSet, boolean z) throws IOException, ParseException {
        Object[] objArr;
        if (z && m29692p(streamTokenizer)) {
            streamTokenizer.nextToken();
            objArr = 1;
        } else {
            objArr = null;
        }
        EnumC31832Ay3 enumC31832Ay3 = EnumC31832Ay3.Z;
        boolean contains = enumSet.contains(enumC31832Ay3);
        C52053yB0 m29707a = m29707a(enumSet);
        m29707a.mo3878p(0, this.f93573c.m42761e(m29697k(streamTokenizer)));
        m29707a.mo3878p(1, this.f93573c.m42761e(m29697k(streamTokenizer)));
        if (enumSet.contains(enumC31832Ay3)) {
            m29707a.mo3878p(2, m29697k(streamTokenizer));
        }
        if (enumSet.contains(EnumC31832Ay3.M)) {
            m29707a.mo3878p((contains ? 1 : 0) + 2, m29697k(streamTokenizer));
        }
        if (enumSet.size() == 2 && this.f93574d && m29693o(streamTokenizer)) {
            m29707a.mo3878p(2, m29697k(streamTokenizer));
        }
        if (objArr != null) {
            m29700h(streamTokenizer);
        }
        return m29707a;
    }

    /* renamed from: f */
    public final EB0 m29702f(StreamTokenizer streamTokenizer, EnumSet<EnumC31832Ay3> enumSet, int i, boolean z) throws IOException, ParseException {
        if (m29698j(streamTokenizer).equals("EMPTY")) {
            return m29706b(enumSet);
        }
        ArrayList arrayList = new ArrayList();
        do {
            arrayList.add(m29703e(streamTokenizer, enumSet, false));
        } while (m29699i(streamTokenizer).equals(","));
        if (this.f93576f) {
            m29704d(arrayList, i, z);
        }
        return this.f93572b.mo107445c((C52053yB0[]) arrayList.toArray(new C52053yB0[0]));
    }

    /* renamed from: g */
    public final EB0 m29701g(StreamTokenizer streamTokenizer, EnumSet<EnumC31832Ay3> enumSet) throws IOException, ParseException {
        ArrayList arrayList = new ArrayList();
        do {
            arrayList.add(m29703e(streamTokenizer, enumSet, true));
        } while (m29699i(streamTokenizer).equals(","));
        return this.f93572b.mo107445c((C52053yB0[]) arrayList.toArray(new C52053yB0[0]));
    }

    /* renamed from: h */
    public final String m29700h(StreamTokenizer streamTokenizer) throws IOException, ParseException {
        String m29695m = m29695m(streamTokenizer);
        if (m29695m.equals(")")) {
            return m29695m;
        }
        throw m29689s(streamTokenizer, ")");
    }

    /* renamed from: k */
    public final double m29697k(StreamTokenizer streamTokenizer) throws IOException, ParseException {
        if (streamTokenizer.nextToken() == -3) {
            if (streamTokenizer.sval.equalsIgnoreCase("NaN")) {
                return Double.NaN;
            }
            try {
                return Double.parseDouble(streamTokenizer.sval);
            } catch (NumberFormatException unused) {
                throw m29688t(streamTokenizer, "Invalid number: " + streamTokenizer.sval);
            }
        }
        throw m29689s(streamTokenizer, "number");
    }

    /* renamed from: q */
    public final boolean m29691q(StreamTokenizer streamTokenizer, String str, String str2) throws ParseException {
        boolean z = false;
        if (!str.startsWith(str2)) {
            return false;
        }
        String substring = str.substring(str2.length());
        if (substring.length() <= 2 && (substring.length() == 0 || substring.equals("Z") || substring.equals("M") || substring.equals("ZM"))) {
            z = true;
        }
        if (z) {
            return true;
        }
        throw m29688t(streamTokenizer, "Invalid dimension modifiers: " + str);
    }

    /* renamed from: u */
    public WB1 m29687u(Reader reader) throws ParseException {
        try {
            return m29684x(m29705c(reader));
        } catch (IOException e) {
            throw new ParseException(e.toString());
        }
    }

    /* renamed from: v */
    public WB1 m29686v(String str) throws ParseException {
        StringReader stringReader = new StringReader(str);
        try {
            return m29687u(stringReader);
        } finally {
            stringReader.close();
        }
    }

    /* renamed from: w */
    public final XB1 m29685w(StreamTokenizer streamTokenizer, EnumSet<EnumC31832Ay3> enumSet) throws IOException, ParseException {
        if (m29698j(streamTokenizer).equals("EMPTY")) {
            return this.f93571a.m64852c();
        }
        ArrayList arrayList = new ArrayList();
        do {
            arrayList.add(m29684x(streamTokenizer));
        } while (m29699i(streamTokenizer).equals(","));
        return this.f93571a.m64851d((WB1[]) arrayList.toArray(new WB1[arrayList.size()]));
    }

    /* renamed from: x */
    public final WB1 m29684x(StreamTokenizer streamTokenizer) throws IOException, ParseException {
        EnumSet<EnumC31832Ay3> of = EnumSet.of(EnumC31832Ay3.X, EnumC31832Ay3.Y);
        String upperCase = m29695m(streamTokenizer).toUpperCase(Locale.ROOT);
        if (upperCase.endsWith("ZM")) {
            of.add(EnumC31832Ay3.Z);
            of.add(EnumC31832Ay3.M);
        } else if (upperCase.endsWith("Z")) {
            of.add(EnumC31832Ay3.Z);
        } else if (upperCase.endsWith("M")) {
            of.add(EnumC31832Ay3.M);
        }
        return m29683y(streamTokenizer, upperCase, of);
    }

    /* renamed from: y */
    public final WB1 m29683y(StreamTokenizer streamTokenizer, String str, EnumSet<EnumC31832Ay3> enumSet) throws IOException, ParseException {
        int i;
        if (enumSet.size() == 2) {
            enumSet = m29696l(streamTokenizer);
        }
        try {
            FB0 fb0 = this.f93572b;
            int m29709G = m29709G(enumSet);
            if (enumSet.contains(EnumC31832Ay3.M)) {
                i = 1;
            } else {
                i = 0;
            }
            fb0.mo107447a(0, m29709G, i);
        } catch (Exception unused) {
            this.f93571a = new C38409bC1(this.f93571a.m64860B(), this.f93571a.m64859C(), f93570g);
        }
        if (m29691q(streamTokenizer, str, "POINT")) {
            return m29711E(streamTokenizer, enumSet);
        }
        if (m29691q(streamTokenizer, str, "LINESTRING")) {
            return m29682z(streamTokenizer, enumSet);
        }
        if (m29691q(streamTokenizer, str, "LINEARRING")) {
            return m29715A(streamTokenizer, enumSet);
        }
        if (m29691q(streamTokenizer, str, "POLYGON")) {
            return m29710F(streamTokenizer, enumSet);
        }
        if (m29691q(streamTokenizer, str, "MULTIPOINT")) {
            return m29713C(streamTokenizer, enumSet);
        }
        if (m29691q(streamTokenizer, str, "MULTILINESTRING")) {
            return m29714B(streamTokenizer, enumSet);
        }
        if (m29691q(streamTokenizer, str, "MULTIPOLYGON")) {
            return m29712D(streamTokenizer, enumSet);
        }
        if (m29691q(streamTokenizer, str, GeometryCollection.GeoCollID)) {
            return m29685w(streamTokenizer, enumSet);
        }
        throw m29688t(streamTokenizer, "Unknown geometry type: " + str);
    }

    /* renamed from: z */
    public final C32002Br2 m29682z(StreamTokenizer streamTokenizer, EnumSet<EnumC31832Ay3> enumSet) throws IOException, ParseException {
        return this.f93571a.m64849f(m29702f(streamTokenizer, enumSet, 2, false));
    }

    public C43611jw6(C38409bC1 c38409bC1) {
        this.f93574d = true;
        this.f93575e = true;
        this.f93576f = false;
        this.f93571a = c38409bC1;
        this.f93572b = c38409bC1.m64829z();
        this.f93573c = c38409bC1.m64860B();
    }
}
