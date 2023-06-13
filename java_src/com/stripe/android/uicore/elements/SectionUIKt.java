package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.StripeThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001aC\u0010\b\u001a\u00020\u00052\n\b\u0001\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\u000b\u001a\u00020\u00052\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aK\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, m28432d2 = {"", "title", "", "error", "Lkotlin/Function0;", "", "contentOutsideCard", "contentInCard", "Section", "(Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LEt0;II)V", "titleText", "SectionTitle", "(Ljava/lang/Integer;LEt0;I)V", "LgV2;", "modifier", "", "isSelected", "Lpm0;", "backgroundColor", "LeZ;", "border", "content", "SectionCard-T042LqI", "(LgV2;ZJLeZ;Lkotlin/jvm/functions/Function2;LEt0;II)V", "SectionCard", "SectionError", "(Ljava/lang/String;LEt0;I)V", "stripe-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSectionUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SectionUI.kt\ncom/stripe/android/uicore/elements/SectionUIKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,101:1\n154#2:102\n154#2:136\n154#2:142\n164#2:143\n154#2:144\n74#3,6:103\n80#3:135\n84#3:141\n75#4:109\n76#4,11:111\n89#4:140\n76#5:110\n460#6,13:122\n473#6,3:137\n*S KotlinDebug\n*F\n+ 1 SectionUI.kt\ncom/stripe/android/uicore/elements/SectionUIKt\n*L\n33#1:102\n37#1:136\n55#1:142\n78#1:143\n78#1:144\n33#1:103,6\n33#1:135\n33#1:141\n33#1:109\n33#1:111,11\n33#1:140\n33#1:110\n33#1:122,13\n33#1:137,3\n*E\n"})
/* loaded from: classes7.dex */
public final class SectionUIKt {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Section(Integer num, String str, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> contentInCard, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Object obj;
        int i6;
        int i7;
        int i8;
        Function2<InterfaceC32720Et0, Integer, Unit> function22;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function23;
        InterfaceC36874Wm5 mo89512w;
        Intrinsics.checkNotNullParameter(contentInCard, "contentInCard");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1101936519);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89539n(num)) {
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
            if (mo89518u.mo89539n(str)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = function2;
            if (mo89518u.mo89539n(obj)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (mo89518u.mo89539n(contentInCard)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i3;
            if ((i8 & 5851) != 1170 && mo89518u.mo89575b()) {
                mo89518u.mo89548k();
                function23 = obj;
            } else {
                if (i9 == 0) {
                    function22 = ComposableSingletons$SectionUIKt.INSTANCE.m116733getLambda1$stripe_ui_core_release();
                } else {
                    function22 = obj;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-1101936519, i8, -1, "com.stripe.android.uicore.elements.Section (SectionUI.kt:26)");
                }
                InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
                float f = 8;
                InterfaceC41563gV2 m94180m = ND3.m94180m(c20912a, 0.0f, C43705k61.m29303g(f), 0.0f, 0.0f, 13, null);
                mo89518u.mo89638F(-483455358);
                InterfaceC51579xO2 m91546a = C34997Om0.m91546a(C25777lo.f96729a.m26802g(), InterfaceC4360K9.f19170a.m99136j(), mo89518u, 0);
                mo89518u.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m94180m);
                Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function24 = function22;
                if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                    C52468yt0.m2335c();
                }
                mo89518u.mo89557h();
                if (!mo89518u.mo89521t()) {
                    mo89518u.mo89617M(m113415a);
                } else {
                    mo89518u.mo89566e();
                }
                mo89518u.mo89620L();
                InterfaceC32720Et0 m64192a = C38680bf6.m64192a(mo89518u);
                C38680bf6.m64191b(m64192a, m91546a, c0757a.m113412d());
                C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
                C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
                C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
                mo89518u.mo89530q();
                m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
                mo89518u.mo89638F(2058660585);
                mo89518u.mo89638F(-1163856341);
                C35465Qm0 c35465Qm0 = C35465Qm0.f30887a;
                mo89518u.mo89638F(683500611);
                SectionTitle(num, mo89518u, i8 & 14);
                m116748SectionCardT042LqI(ND3.m94180m(c20912a, 0.0f, 0.0f, 0.0f, C43705k61.m29303g(f), 7, null), false, 0L, null, contentInCard, mo89518u, ((i8 << 3) & 57344) | 6, 14);
                mo89518u.mo89638F(-1504762604);
                if (str != null) {
                    SectionError(str, mo89518u, (i8 >> 3) & 14);
                }
                mo89518u.mo89605Q();
                function24.invoke(mo89518u, Integer.valueOf((i8 >> 6) & 14));
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                mo89518u.mo89563f();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                function23 = function24;
            }
            mo89512w = mo89518u.mo89512w();
            if (mo89512w == null) {
                mo89512w.mo20405a(new SectionUIKt$Section$2(num, str, function23, contentInCard, i, i2));
                return;
            }
            return;
        }
        obj = function2;
        if ((i2 & 8) == 0) {
        }
        i8 = i3;
        if ((i8 & 5851) != 1170) {
        }
        if (i9 == 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        InterfaceC41563gV2.C20912a c20912a2 = InterfaceC41563gV2.f82354b0;
        float f2 = 8;
        InterfaceC41563gV2 m94180m2 = ND3.m94180m(c20912a2, 0.0f, C43705k61.m29303g(f2), 0.0f, 0.0f, 13, null);
        mo89518u.mo89638F(-483455358);
        InterfaceC51579xO2 m91546a2 = C34997Om0.m91546a(C25777lo.f96729a.m26802g(), InterfaceC4360K9.f19170a.m99136j(), mo89518u, 0);
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a2 = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a2 = c0757a2.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(m94180m2);
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function242 = function22;
        if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
        }
        mo89518u.mo89557h();
        if (!mo89518u.mo89521t()) {
        }
        mo89518u.mo89620L();
        InterfaceC32720Et0 m64192a2 = C38680bf6.m64192a(mo89518u);
        C38680bf6.m64191b(m64192a2, m91546a2, c0757a2.m113412d());
        C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a2.m113414b());
        C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a2.m113413c());
        C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a2.m113410f());
        mo89518u.mo89530q();
        m115273a2.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-1163856341);
        C35465Qm0 c35465Qm02 = C35465Qm0.f30887a;
        mo89518u.mo89638F(683500611);
        SectionTitle(num, mo89518u, i8 & 14);
        m116748SectionCardT042LqI(ND3.m94180m(c20912a2, 0.0f, 0.0f, 0.0f, C43705k61.m29303g(f2), 7, null), false, 0L, null, contentInCard, mo89518u, ((i8 << 3) & 57344) | 6, 14);
        mo89518u.mo89638F(-1504762604);
        if (str != null) {
        }
        mo89518u.mo89605Q();
        function242.invoke(mo89518u, Integer.valueOf((i8 >> 6) & 14));
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        if (C35528Qt0.m87827O()) {
        }
        function23 = function242;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0164  */
    /* renamed from: SectionCard-T042LqI  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m116748SectionCardT042LqI(InterfaceC41563gV2 interfaceC41563gV2, boolean z, long j, C20064eZ c20064eZ, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        Object obj;
        int i3;
        int i4;
        boolean z2;
        int i5;
        long j2;
        Object obj2;
        int i6;
        Object obj3;
        C20064eZ borderStroke;
        boolean z3;
        float m29303g;
        long j3;
        C20064eZ c20064eZ2;
        InterfaceC36874Wm5 mo89512w;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-2033022061);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            obj = interfaceC41563gV2;
        } else if ((i & 14) == 0) {
            obj = interfaceC41563gV2;
            if (mo89518u.mo89539n(obj)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            obj = interfaceC41563gV2;
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            z2 = z;
            if (mo89518u.mo89536o(z2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    j2 = j;
                    if (mo89518u.mo89524s(j2)) {
                        i8 = 256;
                        i3 |= i8;
                    }
                } else {
                    j2 = j;
                }
                i8 = 128;
                i3 |= i8;
            } else {
                j2 = j;
            }
            if ((i & 7168) != 0) {
                if ((i2 & 8) == 0) {
                    obj2 = c20064eZ;
                    if (mo89518u.mo89539n(obj2)) {
                        i7 = 2048;
                        i3 |= i7;
                    }
                } else {
                    obj2 = c20064eZ;
                }
                i7 = 1024;
                i3 |= i7;
            } else {
                obj2 = c20064eZ;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 57344) == 0) {
                if (mo89518u.mo89539n(content)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((46811 & i3) != 9362 && mo89518u.mo89575b()) {
                mo89518u.mo89548k();
                obj3 = obj;
                j3 = j2;
                c20064eZ2 = obj2;
            } else {
                mo89518u.mo89626J();
                if ((i & 1) == 0 && !mo89518u.mo89545l()) {
                    mo89518u.mo89548k();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    obj3 = obj;
                } else {
                    if (i9 == 0) {
                        obj3 = InterfaceC41563gV2.f82354b0;
                    } else {
                        obj3 = obj;
                    }
                    if (i10 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 4) != 0) {
                        j2 = StripeThemeKt.getStripeColors(TM2.f35372a, mo89518u, TM2.f35373b).m116695getComponent0d7_KjU();
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        borderStroke = StripeThemeKt.getBorderStroke(TM2.f35372a, z2, mo89518u, TM2.f35373b | (i3 & 112));
                        z3 = z2;
                        int i11 = i3;
                        long j4 = j2;
                        mo89518u.mo89650B();
                        if (C35528Qt0.m87827O()) {
                            C35528Qt0.m87816Z(-2033022061, i11, -1, "com.stripe.android.uicore.elements.SectionCard (SectionUI.kt:67)");
                        }
                        if (z3) {
                            m29303g = C43705k61.m29303g((float) 1.5d);
                        } else {
                            m29303g = C43705k61.m29303g(0);
                        }
                        int i12 = 1572864 | (i11 & 14) | (i11 & 896) | ((i11 << 3) & 57344);
                        C35168Pf0.m90018a(obj3, TM2.f35372a.m83730b(mo89518u, TM2.f35373b).m109565d(), j4, 0L, borderStroke, m29303g, C43575jt0.m29791b(mo89518u, 9386550, true, new SectionUIKt$SectionCard$1(content, i11)), mo89518u, i12, 8);
                        if (C35528Qt0.m87827O()) {
                            C35528Qt0.m87817Y();
                        }
                        z2 = z3;
                        j3 = j4;
                        c20064eZ2 = borderStroke;
                    }
                }
                z3 = z2;
                borderStroke = obj2;
                int i112 = i3;
                long j42 = j2;
                mo89518u.mo89650B();
                if (C35528Qt0.m87827O()) {
                }
                if (z3) {
                }
                int i122 = 1572864 | (i112 & 14) | (i112 & 896) | ((i112 << 3) & 57344);
                C35168Pf0.m90018a(obj3, TM2.f35372a.m83730b(mo89518u, TM2.f35373b).m109565d(), j42, 0L, borderStroke, m29303g, C43575jt0.m29791b(mo89518u, 9386550, true, new SectionUIKt$SectionCard$1(content, i112)), mo89518u, i122, 8);
                if (C35528Qt0.m87827O()) {
                }
                z2 = z3;
                j3 = j42;
                c20064eZ2 = borderStroke;
            }
            mo89512w = mo89518u.mo89512w();
            if (mo89512w == null) {
                mo89512w.mo20405a(new SectionUIKt$SectionCard$2(obj3, z2, j3, c20064eZ2, content, i, i2));
                return;
            }
            return;
        }
        z2 = z;
        if ((i & 896) != 0) {
        }
        if ((i & 7168) != 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((46811 & i3) != 9362) {
        }
        mo89518u.mo89626J();
        if ((i & 1) == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        z3 = z2;
        borderStroke = obj2;
        int i1122 = i3;
        long j422 = j2;
        mo89518u.mo89650B();
        if (C35528Qt0.m87827O()) {
        }
        if (z3) {
        }
        int i1222 = 1572864 | (i1122 & 14) | (i1122 & 896) | ((i1122 << 3) & 57344);
        C35168Pf0.m90018a(obj3, TM2.f35372a.m83730b(mo89518u, TM2.f35373b).m109565d(), j422, 0L, borderStroke, m29303g, C43575jt0.m29791b(mo89518u, 9386550, true, new SectionUIKt$SectionCard$1(content, i1122)), mo89518u, i1222, 8);
        if (C35528Qt0.m87827O()) {
        }
        z2 = z3;
        j3 = j422;
        c20064eZ2 = borderStroke;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
        }
    }

    public static final void SectionError(String error, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        InterfaceC32720Et0 interfaceC32720Et02;
        int i3;
        Intrinsics.checkNotNullParameter(error, "error");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-985456758);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(error)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            interfaceC32720Et02 = mo89518u;
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-985456758, i2, -1, "com.stripe.android.uicore.elements.SectionError (SectionUI.kt:92)");
            }
            TM2 tm2 = TM2.f35372a;
            int i4 = TM2.f35373b;
            interfaceC32720Et02 = mo89518u;
            C38909c26.m62000e(error, C41198fs5.m40621a(InterfaceC41563gV2.f82354b0, true, SectionUIKt$SectionError$1.INSTANCE), tm2.m83731a(mo89518u, i4).m94906d(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, tm2.m83729c(mo89518u, i4).m104958j(), interfaceC32720Et02, i2 & 14, 0, 32760);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new SectionUIKt$SectionError$2(error, i));
        }
    }

    public static final void SectionTitle(Integer num, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int i3;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1654170730);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(num)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1654170730, i2, -1, "com.stripe.android.uicore.elements.SectionTitle (SectionUI.kt:49)");
            }
            if (num != null) {
                num.intValue();
                H6TextKt.H6Text(C40946fS5.m41310c(num.intValue(), mo89518u, i2 & 14), C41198fs5.m40621a(ND3.m94180m(InterfaceC41563gV2.f82354b0, 0.0f, 0.0f, 0.0f, C43705k61.m29303g(4), 7, null), true, SectionUIKt$SectionTitle$1$1.INSTANCE), mo89518u, 0, 0);
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new SectionUIKt$SectionTitle$2(num, i));
        }
    }
}
