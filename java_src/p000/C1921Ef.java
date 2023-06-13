package p000;

import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import p000.C1577Df;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a*\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002\u001a*\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002\u001a,\u0010\r\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002\u001a\u001c\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002\u001aD\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u000f2\u0016\u0010\u0010\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002\u001a(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0000\u001a(\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0000\u001a\b\u0010\u001d\u001a\u00020\u0000H\u0000\"\u0014\u0010 \u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, m28432d2 = {"LDf;", "LDE3;", "defaultParagraphStyle", "", "LDf$b;", "m", "", "start", "end", "LGN5;", "k", "j", "", "i", "n", "T", "ranges", "h", "baseStart", "baseEnd", "targetStart", "targetEnd", "", "f", "lStart", "lEnd", "rStart", "rEnd", "l", "g", C17296a.f69688o, "LDf;", "EmptyAnnotatedString", "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1126:1\n33#2,6:1127\n33#2,4:1136\n38#2:1142\n151#2,3:1144\n33#2,4:1147\n154#2,2:1151\n38#2:1153\n156#2:1154\n33#2,4:1158\n38#2:1164\n151#2,3:1166\n33#2,4:1169\n154#2,2:1173\n38#2:1175\n156#2:1176\n33#2,4:1180\n38#2:1186\n151#2,3:1188\n33#2,4:1191\n154#2,2:1195\n38#2:1197\n156#2:1198\n151#2,3:1199\n33#2,4:1202\n154#2,2:1206\n38#2:1208\n156#2:1209\n33#2,4:1214\n38#2:1220\n151#2,5:1222\n38#2:1227\n156#2:1228\n35#3,3:1133\n38#3,2:1140\n40#3:1143\n35#3,3:1155\n38#3,2:1162\n40#3:1165\n35#3,3:1177\n38#3,2:1184\n40#3:1187\n35#3,3:1211\n38#3,2:1218\n40#3:1221\n1#4:1210\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n676#1:1127,6\n712#1:1136,4\n712#1:1142\n713#1:1144,3\n713#1:1147,4\n713#1:1151,2\n713#1:1153\n713#1:1154\n739#1:1158,4\n739#1:1164\n740#1:1166,3\n740#1:1169,4\n740#1:1173,2\n740#1:1175\n740#1:1176\n766#1:1180,4\n766#1:1186\n767#1:1188,3\n767#1:1191,4\n767#1:1195,2\n767#1:1197\n767#1:1198\n803#1:1199,3\n803#1:1202,4\n803#1:1206,2\n803#1:1208\n803#1:1209\n1049#1:1214,4\n1049#1:1220\n1049#1:1222,5\n1049#1:1227\n1049#1:1228\n712#1:1133,3\n712#1:1140,2\n712#1:1143\n739#1:1155,3\n739#1:1162,2\n739#1:1165\n766#1:1177,3\n766#1:1184,2\n766#1:1187\n1049#1:1211,3\n1049#1:1218,2\n1049#1:1221\n*E\n"})
/* renamed from: Ef */
/* loaded from: classes.dex */
public final class C1921Ef {

    /* renamed from: a */
    public static final C1577Df f7920a = new C1577Df("", null, null, 6, null);

    /* renamed from: f */
    public static final boolean m108607f(int i, int i2, int i3, int i4) {
        if (i > i3 || i4 > i2) {
            return false;
        }
        if (i2 == i4) {
            if ((i3 == i4) != (i == i2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public static final C1577Df m108606g() {
        return f7920a;
    }

    /* renamed from: h */
    public static final <T> List<C1577Df.C1580b<T>> m108605h(List<? extends C1577Df.C1580b<? extends T>> list, int i, int i2) {
        boolean z;
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1577Df.C1580b<? extends T> c1580b = list.get(i3);
                C1577Df.C1580b<? extends T> c1580b2 = c1580b;
                if (m108601l(i, i2, c1580b2.m110027f(), c1580b2.m110029d())) {
                    arrayList.add(c1580b);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                C1577Df.C1580b c1580b3 = (C1577Df.C1580b) arrayList.get(i4);
                arrayList2.add(new C1577Df.C1580b(c1580b3.m110028e(), Math.max(i, c1580b3.m110027f()) - i, Math.min(i2, c1580b3.m110029d()) - i, c1580b3.m110026g()));
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            return arrayList2;
        }
        throw new IllegalArgumentException(("start (" + i + ") should be less than or equal to end (" + i2 + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    /* renamed from: i */
    public static final List<C1577Df.C1580b<? extends Object>> m108604i(C1577Df c1577Df, int i, int i2) {
        List<C1577Df.C1580b<? extends Object>> m110060b;
        int coerceIn;
        int coerceIn2;
        if (i == i2 || (m110060b = c1577Df.m110060b()) == null) {
            return null;
        }
        if (i == 0 && i2 >= c1577Df.m110052j().length()) {
            return m110060b;
        }
        ArrayList arrayList = new ArrayList(m110060b.size());
        int size = m110060b.size();
        for (int i3 = 0; i3 < size; i3++) {
            C1577Df.C1580b<? extends Object> c1580b = m110060b.get(i3);
            C1577Df.C1580b<? extends Object> c1580b2 = c1580b;
            if (m108601l(i, i2, c1580b2.m110027f(), c1580b2.m110029d())) {
                arrayList.add(c1580b);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            C1577Df.C1580b c1580b3 = (C1577Df.C1580b) arrayList.get(i4);
            String m110026g = c1580b3.m110026g();
            Object m110028e = c1580b3.m110028e();
            coerceIn = RangesKt___RangesKt.coerceIn(c1580b3.m110027f(), i, i2);
            coerceIn2 = RangesKt___RangesKt.coerceIn(c1580b3.m110029d(), i, i2);
            arrayList2.add(new C1577Df.C1580b(m110028e, coerceIn - i, coerceIn2 - i, m110026g));
        }
        return arrayList2;
    }

    /* renamed from: j */
    public static final List<C1577Df.C1580b<DE3>> m108603j(C1577Df c1577Df, int i, int i2) {
        List<C1577Df.C1580b<DE3>> m110057e;
        int coerceIn;
        int coerceIn2;
        if (i == i2 || (m110057e = c1577Df.m110057e()) == null) {
            return null;
        }
        if (i == 0 && i2 >= c1577Df.m110052j().length()) {
            return m110057e;
        }
        ArrayList arrayList = new ArrayList(m110057e.size());
        int size = m110057e.size();
        for (int i3 = 0; i3 < size; i3++) {
            C1577Df.C1580b<DE3> c1580b = m110057e.get(i3);
            C1577Df.C1580b<DE3> c1580b2 = c1580b;
            if (m108601l(i, i2, c1580b2.m110027f(), c1580b2.m110029d())) {
                arrayList.add(c1580b);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            C1577Df.C1580b c1580b3 = (C1577Df.C1580b) arrayList.get(i4);
            Object m110028e = c1580b3.m110028e();
            coerceIn = RangesKt___RangesKt.coerceIn(c1580b3.m110027f(), i, i2);
            coerceIn2 = RangesKt___RangesKt.coerceIn(c1580b3.m110029d(), i, i2);
            arrayList2.add(new C1577Df.C1580b(m110028e, coerceIn - i, coerceIn2 - i));
        }
        return arrayList2;
    }

    /* renamed from: k */
    public static final List<C1577Df.C1580b<GN5>> m108602k(C1577Df c1577Df, int i, int i2) {
        List<C1577Df.C1580b<GN5>> m110055g;
        int coerceIn;
        int coerceIn2;
        if (i == i2 || (m110055g = c1577Df.m110055g()) == null) {
            return null;
        }
        if (i == 0 && i2 >= c1577Df.m110052j().length()) {
            return m110055g;
        }
        ArrayList arrayList = new ArrayList(m110055g.size());
        int size = m110055g.size();
        for (int i3 = 0; i3 < size; i3++) {
            C1577Df.C1580b<GN5> c1580b = m110055g.get(i3);
            C1577Df.C1580b<GN5> c1580b2 = c1580b;
            if (m108601l(i, i2, c1580b2.m110027f(), c1580b2.m110029d())) {
                arrayList.add(c1580b);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            C1577Df.C1580b c1580b3 = (C1577Df.C1580b) arrayList.get(i4);
            Object m110028e = c1580b3.m110028e();
            coerceIn = RangesKt___RangesKt.coerceIn(c1580b3.m110027f(), i, i2);
            coerceIn2 = RangesKt___RangesKt.coerceIn(c1580b3.m110029d(), i, i2);
            arrayList2.add(new C1577Df.C1580b(m110028e, coerceIn - i, coerceIn2 - i));
        }
        return arrayList2;
    }

    /* renamed from: l */
    public static final boolean m108601l(int i, int i2, int i3, int i4) {
        if (Math.max(i, i3) >= Math.min(i2, i4) && !m108607f(i, i2, i3, i4) && !m108607f(i3, i4, i, i2)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public static final List<C1577Df.C1580b<DE3>> m108600m(C1577Df c1577Df, DE3 defaultParagraphStyle) {
        Intrinsics.checkNotNullParameter(c1577Df, "<this>");
        Intrinsics.checkNotNullParameter(defaultParagraphStyle, "defaultParagraphStyle");
        int length = c1577Df.m110052j().length();
        List<C1577Df.C1580b<DE3>> m110057e = c1577Df.m110057e();
        if (m110057e == null) {
            m110057e = CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = m110057e.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            C1577Df.C1580b<DE3> c1580b = m110057e.get(i);
            DE3 m110032a = c1580b.m110032a();
            int m110031b = c1580b.m110031b();
            int m110030c = c1580b.m110030c();
            if (m110031b != i2) {
                arrayList.add(new C1577Df.C1580b(defaultParagraphStyle, i2, m110031b));
            }
            arrayList.add(new C1577Df.C1580b(defaultParagraphStyle.m110647o(m110032a), m110031b, m110030c));
            i++;
            i2 = m110030c;
        }
        if (i2 != length) {
            arrayList.add(new C1577Df.C1580b(defaultParagraphStyle, i2, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C1577Df.C1580b(defaultParagraphStyle, 0, 0));
        }
        return arrayList;
    }

    /* renamed from: n */
    public static final C1577Df m108599n(C1577Df c1577Df, int i, int i2) {
        String str;
        if (i != i2) {
            str = c1577Df.m110052j().substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            str = "";
        }
        return new C1577Df(str, m108602k(c1577Df, i, i2), null, null, 12, null);
    }
}
