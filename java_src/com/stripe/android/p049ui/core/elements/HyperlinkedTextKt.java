package com.stripe.android.p049ui.core.elements;

import com.stripe.android.financialconnections.domain.Entry;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C1577Df;
import p000.InterfaceC32720Et0;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, m28432d2 = {"", Entry.TYPE_TEXT, "LgV2;", "modifier", "Lpm0;", "color", "LG26;", "style", "", "HyperlinkedText-cf5BqRc", "(Ljava/lang/String;LgV2;JLG26;LEt0;II)V", "HyperlinkedText", "", "Lcom/stripe/android/ui/core/elements/LinkAnnotation;", "extractLinkAnnotations", "Ljava/util/regex/Pattern;", "urlPattern", "Ljava/util/regex/Pattern;", "payments-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHyperlinkedText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HyperlinkedText.kt\ncom/stripe/android/ui/core/elements/HyperlinkedTextKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,101:1\n76#2:102\n76#2:103\n25#3:104\n36#3:111\n36#3:121\n1057#4,6:105\n1057#4,3:112\n1060#4,3:118\n1057#4,6:122\n916#5:115\n1855#6,2:116\n*S KotlinDebug\n*F\n+ 1 HyperlinkedText.kt\ncom/stripe/android/ui/core/elements/HyperlinkedTextKt\n*L\n25#1:102\n27#1:103\n28#1:104\n32#1:111\n62#1:121\n28#1:105,6\n32#1:112,3\n32#1:118,3\n62#1:122,6\n33#1:115\n35#1:116,2\n*E\n"})
/* renamed from: com.stripe.android.ui.core.elements.HyperlinkedTextKt */
/* loaded from: classes7.dex */
public final class HyperlinkedTextKt {
    private static final Pattern urlPattern;

    static {
        Pattern compile = Pattern.compile("(https?://[a-z0-9.-]+\\.[a-z]{2,3}(?:/\\S*?(?=\\.*(?:\\s|$)))?)", 42);
        Intrinsics.checkNotNullExpressionValue(compile, "compile(\n    \"(https?://…ILINE or Pattern.DOTALL\n)");
        urlPattern = compile;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0141 A[LOOP:0: B:82:0x013b->B:84:0x0141, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c7  */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* renamed from: HyperlinkedText-cf5BqRc  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m116663HyperlinkedTextcf5BqRc(String text, InterfaceC41563gV2 interfaceC41563gV2, long j, G26 g26, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        int i5;
        int i6;
        long j2;
        int i7;
        G26 g262;
        InterfaceC41563gV2.C20912a c20912a;
        int i8;
        long j3;
        G26 g263;
        Object mo89635G;
        InterfaceC32720Et0.C2012a c2012a;
        boolean mo89539n;
        Object mo89635G2;
        boolean mo89539n2;
        Object mo89635G3;
        long j4;
        int i9;
        Intrinsics.checkNotNullParameter(text, "text");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1671475014);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89539n(text)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = interfaceC41563gV2;
            if (mo89518u.mo89539n(obj)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
            i6 = i2 & 4;
            if (i6 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                j2 = j;
                if (mo89518u.mo89524s(j2)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i3 |= i7;
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        g262 = g26;
                        if (mo89518u.mo89539n(g262)) {
                            i9 = 2048;
                            i3 |= i9;
                        }
                    } else {
                        g262 = g26;
                    }
                    i9 = 1024;
                    i3 |= i9;
                } else {
                    g262 = g26;
                }
                if ((i3 & 5851) != 1170 && mo89518u.mo89575b()) {
                    mo89518u.mo89548k();
                    c20912a = obj;
                    j4 = j2;
                } else {
                    mo89518u.mo89626J();
                    if ((i & 1) == 0 && !mo89518u.mo89545l()) {
                        mo89518u.mo89548k();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        c20912a = obj;
                        j3 = j2;
                        i8 = i3;
                    } else {
                        if (i10 != 0) {
                            c20912a = InterfaceC41563gV2.f82354b0;
                        } else {
                            c20912a = obj;
                        }
                        if (i6 != 0) {
                            j2 = C47063pm0.f104050b.m18726g();
                        }
                        if ((i2 & 8) != 0) {
                            j3 = j2;
                            i8 = i3 & (-7169);
                            g263 = (G26) mo89518u.mo89572c(C38909c26.m61999f());
                            mo89518u.mo89650B();
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87816Z(1671475014, i8, -1, "com.stripe.android.ui.core.elements.HyperlinkedText (HyperlinkedText.kt:20)");
                            }
                            InterfaceC32366Df6 interfaceC32366Df6 = (InterfaceC32366Df6) mo89518u.mo89572c(C42399hu0.m35603p());
                            mo89518u.mo89638F(-492369756);
                            mo89635G = mo89518u.mo89635G();
                            c2012a = InterfaceC32720Et0.f8257a;
                            if (mo89635G == c2012a.m108267a()) {
                                mo89635G = LM5.m97025e(null, null, 2, null);
                                mo89518u.mo89503z(mo89635G);
                            }
                            mo89518u.mo89605Q();
                            EX2 ex2 = (EX2) mo89635G;
                            mo89518u.mo89638F(1157296644);
                            mo89539n = mo89518u.mo89539n(text);
                            mo89635G2 = mo89518u.mo89635G();
                            if (!mo89539n || mo89635G2 == c2012a.m108267a()) {
                                C1577Df.C1578a c1578a = new C1577Df.C1578a(0, 1, null);
                                c1578a.m110038i(text);
                                for (LinkAnnotation linkAnnotation : extractLinkAnnotations(text)) {
                                    c1578a.m110046a("URL", linkAnnotation.getUrl(), linkAnnotation.getStart(), linkAnnotation.getEnd());
                                }
                                mo89635G2 = c1578a.m110035l();
                                mo89518u.mo89503z(mo89635G2);
                            }
                            mo89518u.mo89605Q();
                            C1577Df c1577Df = (C1577Df) mo89635G2;
                            InterfaceC41563gV2 m1270c = C52840zW5.m1270c(c20912a, Unit.INSTANCE, new HyperlinkedTextKt$HyperlinkedText$1(ex2, c1577Df, interfaceC32366Df6, null));
                            mo89518u.mo89638F(1157296644);
                            mo89539n2 = mo89518u.mo89539n(ex2);
                            mo89635G3 = mo89518u.mo89635G();
                            if (!mo89539n2 || mo89635G3 == InterfaceC32720Et0.f8257a.m108267a()) {
                                mo89635G3 = new HyperlinkedTextKt$HyperlinkedText$2$1(ex2);
                                mo89518u.mo89503z(mo89635G3);
                            }
                            mo89518u.mo89605Q();
                            C38909c26.m62003b(c1577Df, m1270c, j3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, mo89635G3, g263, mo89518u, i8 & 896, (i8 << 9) & 3670016, 32760);
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87817Y();
                            }
                            g262 = g263;
                            j4 = j3;
                        } else {
                            i8 = i3;
                            j3 = j2;
                        }
                    }
                    g263 = g262;
                    mo89518u.mo89650B();
                    if (C35528Qt0.m87827O()) {
                    }
                    InterfaceC32366Df6 interfaceC32366Df62 = (InterfaceC32366Df6) mo89518u.mo89572c(C42399hu0.m35603p());
                    mo89518u.mo89638F(-492369756);
                    mo89635G = mo89518u.mo89635G();
                    c2012a = InterfaceC32720Et0.f8257a;
                    if (mo89635G == c2012a.m108267a()) {
                    }
                    mo89518u.mo89605Q();
                    EX2 ex22 = (EX2) mo89635G;
                    mo89518u.mo89638F(1157296644);
                    mo89539n = mo89518u.mo89539n(text);
                    mo89635G2 = mo89518u.mo89635G();
                    if (!mo89539n) {
                    }
                    C1577Df.C1578a c1578a2 = new C1577Df.C1578a(0, 1, null);
                    c1578a2.m110038i(text);
                    while (r10.hasNext()) {
                    }
                    mo89635G2 = c1578a2.m110035l();
                    mo89518u.mo89503z(mo89635G2);
                    mo89518u.mo89605Q();
                    C1577Df c1577Df2 = (C1577Df) mo89635G2;
                    InterfaceC41563gV2 m1270c2 = C52840zW5.m1270c(c20912a, Unit.INSTANCE, new HyperlinkedTextKt$HyperlinkedText$1(ex22, c1577Df2, interfaceC32366Df62, null));
                    mo89518u.mo89638F(1157296644);
                    mo89539n2 = mo89518u.mo89539n(ex22);
                    mo89635G3 = mo89518u.mo89635G();
                    if (!mo89539n2) {
                    }
                    mo89635G3 = new HyperlinkedTextKt$HyperlinkedText$2$1(ex22);
                    mo89518u.mo89503z(mo89635G3);
                    mo89518u.mo89605Q();
                    C38909c26.m62003b(c1577Df2, m1270c2, j3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, mo89635G3, g263, mo89518u, i8 & 896, (i8 << 9) & 3670016, 32760);
                    if (C35528Qt0.m87827O()) {
                    }
                    g262 = g263;
                    j4 = j3;
                }
                InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
                if (mo89512w != null) {
                    mo89512w.mo20405a(new HyperlinkedTextKt$HyperlinkedText$3(text, c20912a, j4, g262, i, i2));
                    return;
                }
                return;
            }
            j2 = j;
            if ((i & 7168) == 0) {
            }
            if ((i3 & 5851) != 1170) {
            }
            mo89518u.mo89626J();
            if ((i & 1) == 0) {
            }
            if (i10 != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
        }
        obj = interfaceC41563gV2;
        i6 = i2 & 4;
        if (i6 == 0) {
        }
        j2 = j;
        if ((i & 7168) == 0) {
        }
        if ((i3 & 5851) != 1170) {
        }
        mo89518u.mo89626J();
        if ((i & 1) == 0) {
        }
        if (i10 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<LinkAnnotation> extractLinkAnnotations(String str) {
        boolean startsWith$default;
        boolean startsWith$default2;
        Matcher matcher = urlPattern.matcher(str);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            int start = matcher.start(1);
            int end = matcher.end();
            String substring = str.substring(start, end);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(substring, "http://", false, 2, null);
            if (!startsWith$default) {
                startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(substring, "https://", false, 2, null);
                if (!startsWith$default2) {
                    substring = "https://" + substring;
                }
            }
            arrayList.add(new LinkAnnotation(substring, start, end));
        }
        return arrayList;
    }
}
