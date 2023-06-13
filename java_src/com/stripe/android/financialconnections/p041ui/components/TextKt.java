package com.stripe.android.financialconnections.p041ui.components;

import android.text.Annotation;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.financialconnections.p041ui.TextResource;
import com.stripe.android.financialconnections.p041ui.theme.FinancialConnectionsTheme;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C1577Df;
import p000.InterfaceC32720Et0;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aS\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a1\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000e\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u00020\u0019H\u0002\u001a/\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00002\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0002H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, m28432d2 = {"Lcom/stripe/android/financialconnections/ui/TextResource;", Entry.TYPE_TEXT, "Lkotlin/Function1;", "", "", "onClickableTextClick", "LG26;", "defaultStyle", "LgV2;", "modifier", "", "Lcom/stripe/android/financialconnections/ui/components/StringAnnotation;", "LGN5;", "annotationStyles", "AnnotatedText", "(Lcom/stripe/android/financialconnections/ui/TextResource;Lkotlin/jvm/functions/Function1;LG26;LgV2;Ljava/util/Map;LEt0;II)V", "Li26;", "LCe3;", "offset", "LDf;", "resource", "LDf$b;", "clickedAnnotation-d-4ec7I", "(Li26;JLDf;)LDf$b;", "clickedAnnotation", "", "Landroid/text/Annotation;", "toAnnotation", "spanStyleForAnnotation", "annotatedStringResource", "(Lcom/stripe/android/financialconnections/ui/TextResource;Lkotlin/jvm/functions/Function1;LEt0;II)LDf;", "financial-connections_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Text.kt\ncom/stripe/android/financialconnections/ui/components/TextKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SpannedString.kt\nandroidx/core/text/SpannedStringKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,144:1\n25#2:145\n25#2:152\n83#2,3:159\n36#2:168\n1057#3,6:146\n1057#3,6:153\n1057#3,6:162\n1057#3,6:169\n34#4:175\n13579#5:176\n13580#5:178\n1#6:177\n76#7:179\n102#7,2:180\n76#7:182\n102#7,2:183\n*S KotlinDebug\n*F\n+ 1 Text.kt\ncom/stripe/android/financialconnections/ui/components/TextKt\n*L\n42#1:145\n57#1:152\n58#1:159,3\n82#1:168\n42#1:146,6\n57#1:153,6\n58#1:162,6\n82#1:169,6\n123#1:175\n124#1:176\n124#1:178\n42#1:179\n42#1:180,2\n57#1:182\n57#1:183,2\n*E\n"})
/* renamed from: com.stripe.android.financialconnections.ui.components.TextKt */
/* loaded from: classes7.dex */
public final class TextKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0183 A[LOOP:0: B:77:0x0181->B:78:0x0183, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x021f  */
    /* JADX WARN: Type inference failed for: r3v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnnotatedText(TextResource text, Function1<? super String, Unit> onClickableTextClick, G26 defaultStyle, InterfaceC41563gV2 interfaceC41563gV2, Map<StringAnnotation, GN5> map, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        InterfaceC41563gV2.C20912a c20912a;
        int i7;
        int i8;
        GN5 m105174a;
        Map<StringAnnotation, GN5> mapOf;
        Map<StringAnnotation, GN5> map2;
        Object mo89635G;
        InterfaceC32720Et0.C2012a c2012a;
        int i9;
        Object mo89635G2;
        InterfaceC41563gV2.C20912a c20912a2;
        int i10;
        boolean z;
        Object mo89635G3;
        InterfaceC41563gV2.C20912a c20912a3;
        boolean mo89539n;
        Object mo89635G4;
        InterfaceC32720Et0 interfaceC32720Et02;
        InterfaceC41563gV2 interfaceC41563gV22;
        Map<StringAnnotation, GN5> map3;
        InterfaceC36874Wm5 mo89512w;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClickableTextClick, "onClickableTextClick");
        Intrinsics.checkNotNullParameter(defaultStyle, "defaultStyle");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-512193108);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (mo89518u.mo89539n(onClickableTextClick)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (mo89518u.mo89539n(defaultStyle)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            c20912a = interfaceC41563gV2;
            if (mo89518u.mo89539n(c20912a)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
            i8 = i2 & 16;
            if (i8 != 0) {
                i3 |= 8192;
            }
            if (i8 != 16 && (46811 & i3) == 9362 && mo89518u.mo89575b()) {
                mo89518u.mo89548k();
                map3 = map;
                interfaceC41563gV22 = c20912a;
                interfaceC32720Et02 = mo89518u;
            } else {
                mo89518u.mo89626J();
                if ((i & 1) == 0 && !mo89518u.mo89545l()) {
                    mo89518u.mo89548k();
                    if (i8 != 0) {
                        i3 &= -57345;
                    }
                } else {
                    if (i11 != 0) {
                        c20912a = InterfaceC41563gV2.f82354b0;
                    }
                    if (i8 != 0) {
                        StringAnnotation stringAnnotation = StringAnnotation.CLICKABLE;
                        FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
                        m105174a = r16.m105174a((r35 & 1) != 0 ? r16.m105168g() : financialConnectionsTheme.getColors(mo89518u, 6).m116469getTextBrand0d7_KjU(), (r35 & 2) != 0 ? r16.f11830b : 0L, (r35 & 4) != 0 ? r16.f11831c : null, (r35 & 8) != 0 ? r16.f11832d : null, (r35 & 16) != 0 ? r16.f11833e : null, (r35 & 32) != 0 ? r16.f11834f : null, (r35 & 64) != 0 ? r16.f11835g : null, (r35 & 128) != 0 ? r16.f11836h : 0L, (r35 & 256) != 0 ? r16.f11837i : null, (r35 & 512) != 0 ? r16.f11838j : null, (r35 & 1024) != 0 ? r16.f11839k : null, (r35 & 2048) != 0 ? r16.f11840l : 0L, (r35 & 4096) != 0 ? r16.f11841m : null, (r35 & 8192) != 0 ? financialConnectionsTheme.getTypography(mo89518u, 6).getBodyEmphasized().m105925L().f11842n : null);
                        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(stringAnnotation, m105174a));
                        i3 &= -57345;
                        map2 = mapOf;
                        InterfaceC41563gV2 interfaceC41563gV23 = c20912a;
                        int i12 = i3;
                        mo89518u.mo89650B();
                        if (C35528Qt0.m87827O()) {
                            C35528Qt0.m87816Z(-512193108, i12, -1, "com.stripe.android.financialconnections.ui.components.AnnotatedText (Text.kt:29)");
                        }
                        long m116473getTextPrimary0d7_KjU = FinancialConnectionsTheme.INSTANCE.getColors(mo89518u, 6).m116473getTextPrimary0d7_KjU();
                        mo89518u.mo89638F(-492369756);
                        mo89635G = mo89518u.mo89635G();
                        c2012a = InterfaceC32720Et0.f8257a;
                        if (mo89635G == c2012a.m108267a()) {
                            mo89635G = LM5.m97025e(null, null, 2, null);
                            mo89518u.mo89503z(mo89635G);
                        }
                        mo89518u.mo89605Q();
                        EX2 ex2 = (EX2) mo89635G;
                        i9 = 0;
                        C1577Df annotatedStringResource = annotatedStringResource(text, new TextKt$AnnotatedText$resource$1(map2, m116473getTextPrimary0d7_KjU, ex2), mo89518u, i12 & 14, 0);
                        mo89518u.mo89638F(-492369756);
                        mo89635G2 = mo89518u.mo89635G();
                        if (mo89635G2 == c2012a.m108267a()) {
                            mo89635G2 = LM5.m97025e(null, null, 2, null);
                            mo89518u.mo89503z(mo89635G2);
                        }
                        mo89518u.mo89605Q();
                        EX2 ex22 = (EX2) mo89635G2;
                        c20912a2 = InterfaceC41563gV2.f82354b0;
                        Object[] objArr = {ex22, annotatedStringResource, ex2, onClickableTextClick};
                        mo89518u.mo89638F(-568225417);
                        z = false;
                        for (i10 = 4; i9 < i10; i10 = 4) {
                            z |= mo89518u.mo89539n(objArr[i9]);
                            i9++;
                        }
                        mo89635G3 = mo89518u.mo89635G();
                        if (z && mo89635G3 != InterfaceC32720Et0.f8257a.m108267a()) {
                            c20912a3 = c20912a2;
                        } else {
                            c20912a3 = c20912a2;
                            TextKt$AnnotatedText$pressIndicator$1$1 textKt$AnnotatedText$pressIndicator$1$1 = new TextKt$AnnotatedText$pressIndicator$1$1(annotatedStringResource, ex22, ex2, onClickableTextClick, null);
                            mo89518u.mo89503z(textKt$AnnotatedText$pressIndicator$1$1);
                            mo89635G3 = textKt$AnnotatedText$pressIndicator$1$1;
                        }
                        mo89518u.mo89605Q();
                        InterfaceC41563gV2 mo39266t0 = interfaceC41563gV23.mo39266t0(C52840zW5.m1270c(c20912a3, onClickableTextClick, (Function2) mo89635G3));
                        int m24540a = C45449n26.f99264a.m24540a();
                        mo89518u.mo89638F(1157296644);
                        mo89539n = mo89518u.mo89539n(ex22);
                        mo89635G4 = mo89518u.mo89635G();
                        if (!mo89539n || mo89635G4 == InterfaceC32720Et0.f8257a.m108267a()) {
                            mo89635G4 = new TextKt$AnnotatedText$1$1(ex22);
                            mo89518u.mo89503z(mo89635G4);
                        }
                        mo89518u.mo89605Q();
                        Map<StringAnnotation, GN5> map4 = map2;
                        interfaceC32720Et02 = mo89518u;
                        C8222UE.m81805a(annotatedStringResource, mo39266t0, defaultStyle, mo89635G4, m24540a, true, Integer.MAX_VALUE, null, interfaceC32720Et02, (i12 & 896) | 1794048, 128);
                        if (C35528Qt0.m87827O()) {
                            C35528Qt0.m87817Y();
                        }
                        interfaceC41563gV22 = interfaceC41563gV23;
                        map3 = map4;
                    }
                }
                map2 = map;
                InterfaceC41563gV2 interfaceC41563gV232 = c20912a;
                int i122 = i3;
                mo89518u.mo89650B();
                if (C35528Qt0.m87827O()) {
                }
                long m116473getTextPrimary0d7_KjU2 = FinancialConnectionsTheme.INSTANCE.getColors(mo89518u, 6).m116473getTextPrimary0d7_KjU();
                mo89518u.mo89638F(-492369756);
                mo89635G = mo89518u.mo89635G();
                c2012a = InterfaceC32720Et0.f8257a;
                if (mo89635G == c2012a.m108267a()) {
                }
                mo89518u.mo89605Q();
                EX2 ex23 = (EX2) mo89635G;
                i9 = 0;
                C1577Df annotatedStringResource2 = annotatedStringResource(text, new TextKt$AnnotatedText$resource$1(map2, m116473getTextPrimary0d7_KjU2, ex23), mo89518u, i122 & 14, 0);
                mo89518u.mo89638F(-492369756);
                mo89635G2 = mo89518u.mo89635G();
                if (mo89635G2 == c2012a.m108267a()) {
                }
                mo89518u.mo89605Q();
                EX2 ex222 = (EX2) mo89635G2;
                c20912a2 = InterfaceC41563gV2.f82354b0;
                Object[] objArr2 = {ex222, annotatedStringResource2, ex23, onClickableTextClick};
                mo89518u.mo89638F(-568225417);
                z = false;
                while (i9 < i10) {
                }
                mo89635G3 = mo89518u.mo89635G();
                if (z) {
                }
                c20912a3 = c20912a2;
                TextKt$AnnotatedText$pressIndicator$1$1 textKt$AnnotatedText$pressIndicator$1$12 = new TextKt$AnnotatedText$pressIndicator$1$1(annotatedStringResource2, ex222, ex23, onClickableTextClick, null);
                mo89518u.mo89503z(textKt$AnnotatedText$pressIndicator$1$12);
                mo89635G3 = textKt$AnnotatedText$pressIndicator$1$12;
                mo89518u.mo89605Q();
                InterfaceC41563gV2 mo39266t02 = interfaceC41563gV232.mo39266t0(C52840zW5.m1270c(c20912a3, onClickableTextClick, (Function2) mo89635G3));
                int m24540a2 = C45449n26.f99264a.m24540a();
                mo89518u.mo89638F(1157296644);
                mo89539n = mo89518u.mo89539n(ex222);
                mo89635G4 = mo89518u.mo89635G();
                if (!mo89539n) {
                }
                mo89635G4 = new TextKt$AnnotatedText$1$1(ex222);
                mo89518u.mo89503z(mo89635G4);
                mo89518u.mo89605Q();
                Map<StringAnnotation, GN5> map42 = map2;
                interfaceC32720Et02 = mo89518u;
                C8222UE.m81805a(annotatedStringResource2, mo39266t02, defaultStyle, mo89635G4, m24540a2, true, Integer.MAX_VALUE, null, interfaceC32720Et02, (i122 & 896) | 1794048, 128);
                if (C35528Qt0.m87827O()) {
                }
                interfaceC41563gV22 = interfaceC41563gV232;
                map3 = map42;
            }
            mo89512w = interfaceC32720Et02.mo89512w();
            if (mo89512w == null) {
                mo89512w.mo20405a(new TextKt$AnnotatedText$2(text, onClickableTextClick, defaultStyle, interfaceC41563gV22, map3, i, i2));
                return;
            }
            return;
        }
        c20912a = interfaceC41563gV2;
        i8 = i2 & 16;
        if (i8 != 0) {
        }
        if (i8 != 16) {
        }
        mo89518u.mo89626J();
        if ((i & 1) == 0) {
        }
        if (i11 != 0) {
        }
        if (i8 != 0) {
        }
        map2 = map;
        InterfaceC41563gV2 interfaceC41563gV2322 = c20912a;
        int i1222 = i3;
        mo89518u.mo89650B();
        if (C35528Qt0.m87827O()) {
        }
        long m116473getTextPrimary0d7_KjU22 = FinancialConnectionsTheme.INSTANCE.getColors(mo89518u, 6).m116473getTextPrimary0d7_KjU();
        mo89518u.mo89638F(-492369756);
        mo89635G = mo89518u.mo89635G();
        c2012a = InterfaceC32720Et0.f8257a;
        if (mo89635G == c2012a.m108267a()) {
        }
        mo89518u.mo89605Q();
        EX2 ex232 = (EX2) mo89635G;
        i9 = 0;
        C1577Df annotatedStringResource22 = annotatedStringResource(text, new TextKt$AnnotatedText$resource$1(map2, m116473getTextPrimary0d7_KjU22, ex232), mo89518u, i1222 & 14, 0);
        mo89518u.mo89638F(-492369756);
        mo89635G2 = mo89518u.mo89635G();
        if (mo89635G2 == c2012a.m108267a()) {
        }
        mo89518u.mo89605Q();
        EX2 ex2222 = (EX2) mo89635G2;
        c20912a2 = InterfaceC41563gV2.f82354b0;
        Object[] objArr22 = {ex2222, annotatedStringResource22, ex232, onClickableTextClick};
        mo89518u.mo89638F(-568225417);
        z = false;
        while (i9 < i10) {
        }
        mo89635G3 = mo89518u.mo89635G();
        if (z) {
        }
        c20912a3 = c20912a2;
        TextKt$AnnotatedText$pressIndicator$1$1 textKt$AnnotatedText$pressIndicator$1$122 = new TextKt$AnnotatedText$pressIndicator$1$1(annotatedStringResource22, ex2222, ex232, onClickableTextClick, null);
        mo89518u.mo89503z(textKt$AnnotatedText$pressIndicator$1$122);
        mo89635G3 = textKt$AnnotatedText$pressIndicator$1$122;
        mo89518u.mo89605Q();
        InterfaceC41563gV2 mo39266t022 = interfaceC41563gV2322.mo39266t0(C52840zW5.m1270c(c20912a3, onClickableTextClick, (Function2) mo89635G3));
        int m24540a22 = C45449n26.f99264a.m24540a();
        mo89518u.mo89638F(1157296644);
        mo89539n = mo89518u.mo89539n(ex2222);
        mo89635G4 = mo89518u.mo89635G();
        if (!mo89539n) {
        }
        mo89635G4 = new TextKt$AnnotatedText$1$1(ex2222);
        mo89518u.mo89503z(mo89635G4);
        mo89518u.mo89605Q();
        Map<StringAnnotation, GN5> map422 = map2;
        interfaceC32720Et02 = mo89518u;
        C8222UE.m81805a(annotatedStringResource22, mo39266t022, defaultStyle, mo89635G4, m24540a22, true, Integer.MAX_VALUE, null, interfaceC32720Et02, (i1222 & 896) | 1794048, 128);
        if (C35528Qt0.m87827O()) {
        }
        interfaceC41563gV22 = interfaceC41563gV2322;
        map3 = map422;
        mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AnnotatedText$lambda$1(EX2<String> ex2) {
        return ex2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C42484i26 AnnotatedText$lambda$4(EX2<C42484i26> ex2) {
        return ex2.getValue();
    }

    private static final C1577Df annotatedStringResource(TextResource textResource, Function1<? super Annotation, GN5> function1, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        interfaceC32720Et0.mo89638F(134522096);
        if ((i2 & 2) != 0) {
            function1 = TextKt$annotatedStringResource$1.INSTANCE;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(134522096, i, -1, "com.stripe.android.financialconnections.ui.components.annotatedStringResource (Text.kt:114)");
        }
        SpannedString spannedString = new SpannedString(textResource.toText(interfaceC32720Et0, i & 14));
        C1577Df.C1578a c1578a = new C1577Df.C1578a(0, 1, null);
        String spannedString2 = spannedString.toString();
        Intrinsics.checkNotNullExpressionValue(spannedString2, "spannedString.toString()");
        c1578a.m110038i(spannedString2);
        Object[] spans = spannedString.getSpans(0, spannedString.length(), Object.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(start, end, T::class.java)");
        for (Object obj : spans) {
            int spanStart = spannedString.getSpanStart(obj);
            int spanEnd = spannedString.getSpanEnd(obj);
            Annotation annotation = toAnnotation(obj);
            if (annotation != null) {
                String key = annotation.getKey();
                Intrinsics.checkNotNullExpressionValue(key, "it.key");
                String value = annotation.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "it.value");
                c1578a.m110046a(key, value, spanStart, spanEnd);
                GN5 invoke = function1.invoke(annotation);
                if (invoke != null) {
                    c1578a.m110044c(invoke, spanStart, spanEnd);
                }
            }
        }
        C1577Df m110035l = c1578a.m110035l();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m110035l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: clickedAnnotation-d-4ec7I  reason: not valid java name */
    public static final C1577Df.C1580b<String> m116434clickedAnnotationd4ec7I(C42484i26 c42484i26, long j, C1577Df c1577Df) {
        Object firstOrNull;
        int m34585w = c42484i26.m34585w(j);
        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) c1577Df.m110053i(StringAnnotation.CLICKABLE.getValue(), m34585w, m34585w));
        return (C1577Df.C1580b) firstOrNull;
    }

    private static final Annotation toAnnotation(Object obj) {
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 0) {
                return null;
            }
            if (style != 1) {
                return style != 2 ? null : null;
            }
            return new Annotation(StringAnnotation.BOLD.getValue(), "");
        } else if (obj instanceof URLSpan) {
            return new Annotation(StringAnnotation.CLICKABLE.getValue(), ((URLSpan) obj).getURL());
        } else {
            if (!(obj instanceof Annotation)) {
                return null;
            }
            return (Annotation) obj;
        }
    }
}
