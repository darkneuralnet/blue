package p000;

import ch.qos.logback.core.pattern.parser.Parser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: iw7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43019iw7 implements Iterable, InterfaceC37164Xs7 {

    /* renamed from: b */
    public final String f91746b;

    public C43019iw7(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f91746b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43019iw7)) {
            return false;
        }
        return this.f91746b.equals(((C43019iw7) obj).f91746b);
    }

    public final int hashCode() {
        return this.f91746b.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C48938sv7(this);
    }

    @Override // p000.InterfaceC37164Xs7
    /* renamed from: j */
    public final Iterator mo381j() {
        return new C32034Bu7(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016f  */
    @Override // p000.InterfaceC37164Xs7
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC37164Xs7 mo380o(String str, C38159am8 c38159am8, List list) {
        String str2;
        String str3;
        String str4;
        String str5;
        char c;
        String str6;
        String str7;
        String str8;
        String str9;
        int i;
        C43019iw7 c43019iw7;
        int i2;
        double doubleValue;
        double doubleValue2;
        double m62183a;
        String zzi;
        C43019iw7 c43019iw72;
        Matcher matcher;
        double d;
        double min;
        double length;
        double min2;
        long j;
        int i3;
        int i4;
        C38159am8 c38159am82;
        int i5;
        int length2;
        String str10;
        String str11;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || Parser.REPLACE_CONVERTER_WORD.equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str)) {
            str2 = "toLocaleUpperCase";
            str3 = "toUpperCase";
        } else {
            str3 = "toUpperCase";
            str2 = "toLocaleUpperCase";
            if (!str3.equals(str) && !str2.equals(str)) {
                str4 = "hasOwnProperty";
                if (!"trim".equals(str)) {
                    throw new IllegalArgumentException(String.format("%s is not a String function", str));
                }
                switch (str.hashCode()) {
                    case -1789698943:
                        String str12 = "charAt";
                        String str13 = str4;
                        str5 = "toString";
                        boolean equals = str.equals(str13);
                        str6 = str13;
                        str10 = str12;
                        if (equals) {
                            c = 2;
                            str7 = str13;
                            str8 = str12;
                            break;
                        }
                        c = 65535;
                        str7 = str6;
                        str8 = str10;
                        break;
                    case -1776922004:
                        String str14 = "charAt";
                        str5 = "toString";
                        if (str.equals(str5)) {
                            c = 14;
                            str7 = str4;
                            str8 = str14;
                            break;
                        } else {
                            str6 = str4;
                            str10 = str14;
                            c = 65535;
                            str7 = str6;
                            str8 = str10;
                            break;
                        }
                    case -1464939364:
                        String str15 = "charAt";
                        str11 = str15;
                        if (str.equals("toLocaleLowerCase")) {
                            c = '\f';
                            str9 = str15;
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str6 = str4;
                        str5 = "toString";
                        str10 = str11;
                        c = 65535;
                        str7 = str6;
                        str8 = str10;
                        break;
                    case -1361633751:
                        String str16 = "charAt";
                        boolean equals2 = str.equals(str16);
                        str11 = str16;
                        if (equals2) {
                            str7 = str4;
                            str5 = "toString";
                            c = 0;
                            str8 = str16;
                            break;
                        }
                        str6 = str4;
                        str5 = "toString";
                        str10 = str11;
                        c = 65535;
                        str7 = str6;
                        str8 = str10;
                        break;
                    case -1354795244:
                        if (str.equals("concat")) {
                            str8 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            c = 1;
                            break;
                        }
                        str11 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str10 = str11;
                        c = 65535;
                        str7 = str6;
                        str8 = str10;
                        break;
                    case -1137582698:
                        if (str.equals("toLowerCase")) {
                            c = '\r';
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str11 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str10 = str11;
                        c = 65535;
                        str7 = str6;
                        str8 = str10;
                        break;
                    case -906336856:
                        if (str.equals("search")) {
                            c = 7;
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str11 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str10 = str11;
                        c = 65535;
                        str7 = str6;
                        str8 = str10;
                        break;
                    case -726908483:
                        if (str.equals(str2)) {
                            c = 11;
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str11 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str10 = str11;
                        c = 65535;
                        str7 = str6;
                        str8 = str10;
                        break;
                    case -467511597:
                        if (str.equals("lastIndexOf")) {
                            c = 4;
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str11 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str10 = str11;
                        c = 65535;
                        str7 = str6;
                        str8 = str10;
                        break;
                    case -399551817:
                        if (str.equals(str3)) {
                            c = 15;
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str11 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str10 = str11;
                        c = 65535;
                        str7 = str6;
                        str8 = str10;
                        break;
                    case 3568674:
                        if (str.equals("trim")) {
                            c = 16;
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str11 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str10 = str11;
                        c = 65535;
                        str7 = str6;
                        str8 = str10;
                        break;
                    case 103668165:
                        if (str.equals("match")) {
                            c = 5;
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str11 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str10 = str11;
                        c = 65535;
                        str7 = str6;
                        str8 = str10;
                        break;
                    case 109526418:
                        if (str.equals("slice")) {
                            c = '\b';
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str11 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str10 = str11;
                        c = 65535;
                        str7 = str6;
                        str8 = str10;
                        break;
                    case 109648666:
                        if (str.equals("split")) {
                            c = '\t';
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str11 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str10 = str11;
                        c = 65535;
                        str7 = str6;
                        str8 = str10;
                        break;
                    case 530542161:
                        if (str.equals("substring")) {
                            c = '\n';
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str11 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str10 = str11;
                        c = 65535;
                        str7 = str6;
                        str8 = str10;
                        break;
                    case 1094496948:
                        if (str.equals(Parser.REPLACE_CONVERTER_WORD)) {
                            c = 6;
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str11 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str10 = str11;
                        c = 65535;
                        str7 = str6;
                        str8 = str10;
                        break;
                    case 1943291465:
                        if (str.equals("indexOf")) {
                            c = 3;
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str11 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str10 = str11;
                        c = 65535;
                        str7 = str6;
                        str8 = str10;
                        break;
                    default:
                        str11 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str10 = str11;
                        c = 65535;
                        str7 = str6;
                        str8 = str10;
                        break;
                }
                String str17 = "undefined";
                String str18 = str7;
                String str19 = str8;
                switch (c) {
                    case 0:
                        C38822bt8.m62174j(str19, 1, list);
                        if (!list.isEmpty()) {
                            i = (int) C38822bt8.m62183a(c38159am8.m70757b((InterfaceC37164Xs7) list.get(0)).zzh().doubleValue());
                        } else {
                            i = 0;
                        }
                        String str20 = this.f91746b;
                        if (i >= 0 && i < str20.length()) {
                            return new C43019iw7(String.valueOf(str20.charAt(i)));
                        }
                        return InterfaceC37164Xs7.f44132o0;
                    case 1:
                        c43019iw7 = this;
                        if (!list.isEmpty()) {
                            StringBuilder sb = new StringBuilder(c43019iw7.f91746b);
                            for (int i6 = 0; i6 < list.size(); i6++) {
                                sb.append(c38159am8.m70757b((InterfaceC37164Xs7) list.get(i6)).zzi());
                            }
                            return new C43019iw7(sb.toString());
                        }
                        return c43019iw7;
                    case 2:
                        C38822bt8.m62176h(str18, 1, list);
                        String str21 = this.f91746b;
                        InterfaceC37164Xs7 m70757b = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0));
                        if ("length".equals(m70757b.zzi())) {
                            return InterfaceC37164Xs7.f44130m0;
                        }
                        double doubleValue3 = m70757b.zzh().doubleValue();
                        if (doubleValue3 == Math.floor(doubleValue3) && (i2 = (int) doubleValue3) >= 0 && i2 < str21.length()) {
                            return InterfaceC37164Xs7.f44130m0;
                        }
                        return InterfaceC37164Xs7.f44131n0;
                    case 3:
                        C38822bt8.m62174j("indexOf", 2, list);
                        String str22 = this.f91746b;
                        if (list.size() > 0) {
                            str17 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0)).zzi();
                        }
                        String str23 = str17;
                        if (list.size() < 2) {
                            doubleValue = 0.0d;
                        } else {
                            doubleValue = c38159am8.m70757b((InterfaceC37164Xs7) list.get(1)).zzh().doubleValue();
                        }
                        return new C44105km7(Double.valueOf(str22.indexOf(str23, (int) C38822bt8.m62183a(doubleValue))));
                    case 4:
                        C38822bt8.m62174j("lastIndexOf", 2, list);
                        String str24 = this.f91746b;
                        if (list.size() > 0) {
                            str17 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0)).zzi();
                        }
                        String str25 = str17;
                        if (list.size() < 2) {
                            doubleValue2 = Double.NaN;
                        } else {
                            doubleValue2 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(1)).zzh().doubleValue();
                        }
                        if (Double.isNaN(doubleValue2)) {
                            m62183a = Double.POSITIVE_INFINITY;
                        } else {
                            m62183a = C38822bt8.m62183a(doubleValue2);
                        }
                        return new C44105km7(Double.valueOf(str24.lastIndexOf(str25, (int) m62183a)));
                    case 5:
                        C38822bt8.m62174j("match", 1, list);
                        String str26 = this.f91746b;
                        if (list.size() <= 0) {
                            zzi = "";
                        } else {
                            zzi = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0)).zzi();
                        }
                        Matcher matcher2 = Pattern.compile(zzi).matcher(str26);
                        if (matcher2.find()) {
                            return new C50596vj7(Arrays.asList(new C43019iw7(matcher2.group())));
                        }
                        return InterfaceC37164Xs7.f44126i0;
                    case 6:
                        c43019iw7 = this;
                        C38822bt8.m62174j(Parser.REPLACE_CONVERTER_WORD, 2, list);
                        InterfaceC37164Xs7 interfaceC37164Xs7 = InterfaceC37164Xs7.f44125h0;
                        if (!list.isEmpty()) {
                            str17 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0)).zzi();
                            if (list.size() > 1) {
                                interfaceC37164Xs7 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(1));
                            }
                        }
                        String str27 = str17;
                        String str28 = c43019iw7.f91746b;
                        int indexOf = str28.indexOf(str27);
                        if (indexOf >= 0) {
                            if (interfaceC37164Xs7 instanceof AbstractC40557en7) {
                                interfaceC37164Xs7 = ((AbstractC40557en7) interfaceC37164Xs7).mo4521d(c38159am8, Arrays.asList(new C43019iw7(str27), new C44105km7(Double.valueOf(indexOf)), c43019iw7));
                            }
                            c43019iw72 = new C43019iw7(str28.substring(0, indexOf) + interfaceC37164Xs7.zzi() + str28.substring(indexOf + str27.length()));
                            return c43019iw72;
                        }
                        return c43019iw7;
                    case 7:
                        C38822bt8.m62174j("search", 1, list);
                        if (!list.isEmpty()) {
                            str17 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0)).zzi();
                        }
                        if (Pattern.compile(str17).matcher(this.f91746b).find()) {
                            return new C44105km7(Double.valueOf(matcher.start()));
                        }
                        return new C44105km7(Double.valueOf(-1.0d));
                    case '\b':
                        C38822bt8.m62174j("slice", 2, list);
                        String str29 = this.f91746b;
                        if (!list.isEmpty()) {
                            d = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0)).zzh().doubleValue();
                        } else {
                            d = 0.0d;
                        }
                        double m62183a2 = C38822bt8.m62183a(d);
                        if (m62183a2 < 0.0d) {
                            min = Math.max(str29.length() + m62183a2, 0.0d);
                        } else {
                            min = Math.min(m62183a2, str29.length());
                        }
                        if (list.size() > 1) {
                            length = c38159am8.m70757b((InterfaceC37164Xs7) list.get(1)).zzh().doubleValue();
                        } else {
                            length = str29.length();
                        }
                        double m62183a3 = C38822bt8.m62183a(length);
                        if (m62183a3 < 0.0d) {
                            min2 = Math.max(str29.length() + m62183a3, 0.0d);
                        } else {
                            min2 = Math.min(m62183a3, str29.length());
                        }
                        int i7 = (int) min;
                        return new C43019iw7(str29.substring(i7, Math.max(0, ((int) min2) - i7) + i7));
                    case '\t':
                        C38822bt8.m62174j("split", 2, list);
                        String str30 = this.f91746b;
                        if (str30.length() == 0) {
                            return new C50596vj7(Arrays.asList(this));
                        }
                        ArrayList arrayList = new ArrayList();
                        if (list.isEmpty()) {
                            arrayList.add(this);
                        } else {
                            String zzi2 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0)).zzi();
                            if (list.size() > 1) {
                                j = C38822bt8.m62180d(c38159am8.m70757b((InterfaceC37164Xs7) list.get(1)).zzh().doubleValue());
                            } else {
                                j = 2147483647L;
                            }
                            if (j == 0) {
                                return new C50596vj7();
                            }
                            String[] split = str30.split(Pattern.quote(zzi2), ((int) j) + 1);
                            int length3 = split.length;
                            if (zzi2.isEmpty() && length3 > 0) {
                                boolean isEmpty = split[0].isEmpty();
                                i3 = length3 - 1;
                                i4 = isEmpty;
                                if (!split[i3].isEmpty()) {
                                    i3 = length3;
                                    i4 = isEmpty;
                                }
                            } else {
                                i3 = length3;
                                i4 = 0;
                            }
                            if (length3 > j) {
                                i3--;
                            }
                            while (i4 < i3) {
                                arrayList.add(new C43019iw7(split[i4]));
                                i4++;
                            }
                        }
                        return new C50596vj7(arrayList);
                    case '\n':
                        C38822bt8.m62174j("substring", 2, list);
                        String str31 = this.f91746b;
                        if (!list.isEmpty()) {
                            c38159am82 = c38159am8;
                            i5 = (int) C38822bt8.m62183a(c38159am82.m70757b((InterfaceC37164Xs7) list.get(0)).zzh().doubleValue());
                        } else {
                            c38159am82 = c38159am8;
                            i5 = 0;
                        }
                        if (list.size() > 1) {
                            length2 = (int) C38822bt8.m62183a(c38159am82.m70757b((InterfaceC37164Xs7) list.get(1)).zzh().doubleValue());
                        } else {
                            length2 = str31.length();
                        }
                        int min3 = Math.min(Math.max(i5, 0), str31.length());
                        int min4 = Math.min(Math.max(length2, 0), str31.length());
                        c43019iw72 = new C43019iw7(str31.substring(Math.min(min3, min4), Math.max(min3, min4)));
                        return c43019iw72;
                    case 11:
                        C38822bt8.m62176h(str2, 0, list);
                        return new C43019iw7(this.f91746b.toUpperCase());
                    case '\f':
                        C38822bt8.m62176h("toLocaleLowerCase", 0, list);
                        return new C43019iw7(this.f91746b.toLowerCase());
                    case '\r':
                        C38822bt8.m62176h("toLowerCase", 0, list);
                        return new C43019iw7(this.f91746b.toLowerCase(Locale.ENGLISH));
                    case 14:
                        c43019iw7 = this;
                        C38822bt8.m62176h(str5, 0, list);
                        return c43019iw7;
                    case 15:
                        C38822bt8.m62176h(str3, 0, list);
                        return new C43019iw7(this.f91746b.toUpperCase(Locale.ENGLISH));
                    case 16:
                        C38822bt8.m62176h(str3, 0, list);
                        return new C43019iw7(this.f91746b.trim());
                    default:
                        throw new IllegalArgumentException("Command not supported");
                }
            }
        }
        str4 = "hasOwnProperty";
        switch (str.hashCode()) {
            case -1789698943:
                break;
            case -1776922004:
                break;
            case -1464939364:
                break;
            case -1361633751:
                break;
            case -1354795244:
                break;
            case -1137582698:
                break;
            case -906336856:
                break;
            case -726908483:
                break;
            case -467511597:
                break;
            case -399551817:
                break;
            case 3568674:
                break;
            case 103668165:
                break;
            case 109526418:
                break;
            case 109648666:
                break;
            case 530542161:
                break;
            case 1094496948:
                break;
            case 1943291465:
                break;
        }
        String str172 = "undefined";
        String str182 = str7;
        String str192 = str8;
        switch (c) {
        }
    }

    public final String toString() {
        String str = this.f91746b;
        return "\"" + str + "\"";
    }

    @Override // p000.InterfaceC37164Xs7
    public final InterfaceC37164Xs7 zzd() {
        return new C43019iw7(this.f91746b);
    }

    @Override // p000.InterfaceC37164Xs7
    public final Boolean zzg() {
        return Boolean.valueOf(!this.f91746b.isEmpty());
    }

    @Override // p000.InterfaceC37164Xs7
    public final Double zzh() {
        if (this.f91746b.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.f91746b);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // p000.InterfaceC37164Xs7
    public final String zzi() {
        return this.f91746b;
    }
}
