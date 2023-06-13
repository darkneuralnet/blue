package com.stripe.android.financialconnections.features.institutionpicker;

import com.google.p034ar.core.ImageMetadata;
import com.stripe.android.financialconnections.C18634R;
import com.stripe.android.financialconnections.p041ui.CompositionLocalKt;
import com.stripe.android.financialconnections.p041ui.theme.ColorKt;
import com.stripe.android.financialconnections.p041ui.theme.FinancialConnectionsTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.C48841sm0;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a%\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001aI\u0010\u0013\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0014\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, m28432d2 = {"Lkotlin/Function0;", "", "onManualEntryClick", "", "manualEntryEnabled", "SearchFooter", "(Lkotlin/jvm/functions/Function0;ZLEt0;I)V", "", "title", "Lpm0;", "titleColor", "", "icon", "iconColor", "iconBackgroundColor", "LgV2;", "modifier", "SearchFooterRow-tjc1scY", "(Ljava/lang/String;JIJJLgV2;LEt0;II)V", "SearchFooterRow", "SearchFooterTest", "(LEt0;I)V", "financial-connections_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSearchFooter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchFooter.kt\ncom/stripe/android/financialconnections/features/institutionpicker/SearchFooterKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,115:1\n154#2:116\n154#2:150\n154#2:163\n154#2:197\n154#2:198\n154#2:199\n154#2:200\n74#3,6:117\n80#3:149\n84#3:162\n73#3,7:201\n80#3:234\n84#3:239\n75#4:123\n76#4,11:125\n89#4:161\n75#4:170\n76#4,11:172\n75#4:208\n76#4,11:210\n89#4:238\n89#4:243\n76#5:124\n76#5:171\n76#5:209\n460#6,13:136\n36#6:151\n473#6,3:158\n460#6,13:183\n460#6,13:221\n473#6,3:235\n473#6,3:240\n1057#7,6:152\n75#8,6:164\n81#8:196\n85#8:244\n*S KotlinDebug\n*F\n+ 1 SearchFooter.kt\ncom/stripe/android/financialconnections/features/institutionpicker/SearchFooterKt\n*L\n39#1:116\n47#1:150\n82#1:163\n89#1:197\n90#1:198\n92#1:199\n94#1:200\n36#1:117,6\n36#1:149\n36#1:162\n95#1:201,7\n95#1:234\n95#1:239\n36#1:123\n36#1:125,11\n36#1:161\n78#1:170\n78#1:172,11\n95#1:208\n95#1:210,11\n95#1:238\n78#1:243\n36#1:124\n78#1:171\n95#1:209\n36#1:136,13\n62#1:151\n36#1:158,3\n78#1:183,13\n95#1:221,13\n95#1:235,3\n78#1:240,3\n62#1:152,6\n78#1:164,6\n78#1:196\n78#1:244\n*E\n"})
/* loaded from: classes7.dex */
public final class SearchFooterKt {
    public static final void SearchFooter(Function0<Unit> function0, boolean z, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        G26 m105921d;
        InterfaceC32720Et0 interfaceC32720Et02;
        int i3;
        int i4;
        Function0<Unit> onManualEntryClick = function0;
        boolean z2 = z;
        Intrinsics.checkNotNullParameter(onManualEntryClick, "onManualEntryClick");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1102776978);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(onManualEntryClick)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89536o(z2)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            interfaceC32720Et02 = mo89518u;
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1102776978, i2, -1, "com.stripe.android.financialconnections.features.institutionpicker.SearchFooter (SearchFooter.kt:31)");
            }
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
            float f = 16;
            InterfaceC41563gV2 m94184i = ND3.m94184i(C13342bw.m62124d(c20912a, financialConnectionsTheme.getColors(mo89518u, 6).m116460getBackgroundContainer0d7_KjU(), null, 2, null), C43705k61.m29303g(f));
            mo89518u.mo89638F(-483455358);
            InterfaceC51579xO2 m91546a = C34997Om0.m91546a(C25777lo.f96729a.m26802g(), InterfaceC4360K9.f19170a.m99136j(), mo89518u, 0);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m94184i);
            if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                C52468yt0.m2335c();
            }
            mo89518u.mo89557h();
            if (mo89518u.mo89521t()) {
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
            mo89518u.mo89638F(-1117762716);
            String m41310c = C40946fS5.m41310c(C18634R.string.stripe_institutionpicker_footer_title, mo89518u, 0);
            m105921d = r29.m105921d((r42 & 1) != 0 ? r29.f10827a.m105168g() : financialConnectionsTheme.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU(), (r42 & 2) != 0 ? r29.f10827a.m105164k() : 0L, (r42 & 4) != 0 ? r29.f10827a.m105161n() : null, (r42 & 8) != 0 ? r29.f10827a.m105163l() : null, (r42 & 16) != 0 ? r29.f10827a.m105162m() : null, (r42 & 32) != 0 ? r29.f10827a.m105166i() : null, (r42 & 64) != 0 ? r29.f10827a.m105165j() : null, (r42 & 128) != 0 ? r29.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? r29.f10827a.m105170e() : null, (r42 & 512) != 0 ? r29.f10827a.m105154u() : null, (r42 & 1024) != 0 ? r29.f10827a.m105159p() : null, (r42 & 2048) != 0 ? r29.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? r29.f10827a.m105156s() : null, (r42 & 8192) != 0 ? r29.f10827a.m105157r() : null, (r42 & 16384) != 0 ? r29.f10828b.m110652j() : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r29.f10828b.m110650l() : null, (r42 & 65536) != 0 ? r29.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? financialConnectionsTheme.getTypography(mo89518u, 6).getKicker().f10828b.m110649m() : null);
            interfaceC32720Et02 = mo89518u;
            C38909c26.m62000e(m41310c, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, m105921d, mo89518u, 0, 0, 32766);
            C39504d10.m44736a(BB5.m114246w(c20912a, C43705k61.m29303g(f)), interfaceC32720Et02, 6);
            m116392SearchFooterRowtjc1scY(C40946fS5.m41310c(C18634R.string.stripe_institutionpicker_footer_item_spelling, interfaceC32720Et02, 0), financialConnectionsTheme.getColors(interfaceC32720Et02, 6).m116473getTextPrimary0d7_KjU(), C18634R.C18635drawable.stripe_ic_check, financialConnectionsTheme.getColors(interfaceC32720Et02, 6).m116474getTextSecondary0d7_KjU(), financialConnectionsTheme.getColors(interfaceC32720Et02, 6).m116462getBorderDefault0d7_KjU(), null, interfaceC32720Et02, 0, 32);
            if (z) {
                String m41310c2 = C40946fS5.m41310c(C18634R.string.stripe_institutionpicker_footer_item_manualentry, interfaceC32720Et02, 0);
                long m116469getTextBrand0d7_KjU = financialConnectionsTheme.getColors(interfaceC32720Et02, 6).m116469getTextBrand0d7_KjU();
                int i5 = C18634R.C18635drawable.stripe_ic_edit;
                long info100 = ColorKt.getInfo100();
                long m116463getBorderFocus0d7_KjU = financialConnectionsTheme.getColors(interfaceC32720Et02, 6).m116463getBorderFocus0d7_KjU();
                interfaceC32720Et02.mo89638F(1157296644);
                onManualEntryClick = function0;
                boolean mo89539n = interfaceC32720Et02.mo89539n(onManualEntryClick);
                Object mo89635G = interfaceC32720Et02.mo89635G();
                if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                    mo89635G = new SearchFooterKt$SearchFooter$1$1$1(onManualEntryClick);
                    interfaceC32720Et02.mo89503z(mo89635G);
                }
                interfaceC32720Et02.mo89605Q();
                z2 = z;
                m116392SearchFooterRowtjc1scY(m41310c2, m116469getTextBrand0d7_KjU, i5, info100, m116463getBorderFocus0d7_KjU, C38131ak0.m70814e(c20912a, false, null, null, (Function0) mo89635G, 7, null), interfaceC32720Et02, 3072, 0);
            } else {
                onManualEntryClick = function0;
                z2 = z;
            }
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89563f();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89605Q();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new SearchFooterKt$SearchFooter$2(onManualEntryClick, z2, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* renamed from: SearchFooterRow-tjc1scY  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m116392SearchFooterRowtjc1scY(String str, long j, int i, long j2, long j3, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Object obj;
        int i10;
        InterfaceC41563gV2 interfaceC41563gV22;
        InterfaceC36874Wm5 mo89512w;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1169703520);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            if (mo89518u.mo89539n(str)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            if (mo89518u.mo89524s(j)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            if (mo89518u.mo89527r(i)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 7168) == 0) {
            if (mo89518u.mo89524s(j2)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i4 |= i8;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((57344 & i2) == 0) {
            if (mo89518u.mo89524s(j3)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i4 |= i9;
        }
        int i11 = i3 & 32;
        if (i11 != 0) {
            i4 |= ImageMetadata.EDGE_MODE;
        } else if ((458752 & i2) == 0) {
            obj = interfaceC41563gV2;
            if (mo89518u.mo89539n(obj)) {
                i10 = DateUtils.FORMAT_NUMERIC_DATE;
            } else {
                i10 = 65536;
            }
            i4 |= i10;
            if ((374491 & i4) != 74898 && mo89518u.mo89575b()) {
                mo89518u.mo89548k();
            } else {
                if (i11 == 0) {
                    interfaceC41563gV22 = InterfaceC41563gV2.f82354b0;
                } else {
                    interfaceC41563gV22 = obj;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-1169703520, i4, -1, "com.stripe.android.financialconnections.features.institutionpicker.SearchFooterRow (SearchFooter.kt:69)");
                }
                InterfaceC4360K9.C4361a c4361a = InterfaceC4360K9.f19170a;
                InterfaceC4360K9.InterfaceC4363c m99138h = c4361a.m99138h();
                float f = 8;
                InterfaceC41563gV2 interfaceC41563gV23 = interfaceC41563gV22;
                InterfaceC41563gV2 m94182k = ND3.m94182k(BB5.m114255n(interfaceC41563gV22, 0.0f, 1, null), 0.0f, C43705k61.m29303g(f), 1, null);
                mo89518u.mo89638F(693286680);
                C25777lo c25777lo = C25777lo.f96729a;
                InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(c25777lo.m26803f(), m99138h, mo89518u, 48);
                mo89518u.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m94182k);
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
                C38680bf6.m64191b(m64192a, m74813a, c0757a.m113412d());
                C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
                C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
                C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
                mo89518u.mo89530q();
                m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
                mo89518u.mo89638F(2058660585);
                mo89518u.mo89638F(-678309503);
                C38066ad5 c38066ad5 = C38066ad5.f50835a;
                mo89518u.mo89638F(-318774852);
                AbstractC45562nE3 m19793d = C46748pE3.m19793d(i, mo89518u, (i4 >> 6) & 14);
                C48841sm0 m13699b = C48841sm0.C28383a.m13699b(C48841sm0.f109227b, j2, 0, 2, null);
                InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
                C51659xX1.m5069a(m19793d, null, ND3.m94184i(C13342bw.m62124d(C35447Qk0.m88106a(BB5.m114246w(c20912a, C43705k61.m29303g(32)), C39242cc5.m61172d(C43705k61.m29303g(6))), j3, null, 2, null), C43705k61.m29303g(f)), null, null, 0.0f, m13699b, mo89518u, 56, 56);
                DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(f)), mo89518u, 6);
                mo89518u.mo89638F(-483455358);
                InterfaceC51579xO2 m91546a = C34997Om0.m91546a(c25777lo.m26802g(), c4361a.m99136j(), mo89518u, 0);
                mo89518u.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                Function0<InterfaceC32018Bt0> m113415a2 = c0757a.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(c20912a);
                if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                    C52468yt0.m2335c();
                }
                mo89518u.mo89557h();
                if (!mo89518u.mo89521t()) {
                    mo89518u.mo89617M(m113415a2);
                } else {
                    mo89518u.mo89566e();
                }
                mo89518u.mo89620L();
                InterfaceC32720Et0 m64192a2 = C38680bf6.m64192a(mo89518u);
                C38680bf6.m64191b(m64192a2, m91546a, c0757a.m113412d());
                C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a.m113414b());
                C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a.m113413c());
                C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a.m113410f());
                mo89518u.mo89530q();
                m115273a2.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
                mo89518u.mo89638F(2058660585);
                mo89518u.mo89638F(-1163856341);
                C35465Qm0 c35465Qm0 = C35465Qm0.f30887a;
                mo89518u.mo89638F(-1502182010);
                C38909c26.m62000e(str, null, j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, FinancialConnectionsTheme.INSTANCE.getTypography(mo89518u, 6).getCaptionTightEmphasized(), mo89518u, (i4 & 14) | ((i4 << 3) & 896), 0, 32762);
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                mo89518u.mo89563f();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                mo89518u.mo89563f();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                obj = interfaceC41563gV23;
            }
            mo89512w = mo89518u.mo89512w();
            if (mo89512w == null) {
                mo89512w.mo20405a(new SearchFooterKt$SearchFooterRow$2(str, j, i, j2, j3, obj, i2, i3));
                return;
            }
            return;
        }
        obj = interfaceC41563gV2;
        if ((374491 & i4) != 74898) {
        }
        if (i11 == 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        InterfaceC4360K9.C4361a c4361a2 = InterfaceC4360K9.f19170a;
        InterfaceC4360K9.InterfaceC4363c m99138h2 = c4361a2.m99138h();
        float f2 = 8;
        InterfaceC41563gV2 interfaceC41563gV232 = interfaceC41563gV22;
        InterfaceC41563gV2 m94182k2 = ND3.m94182k(BB5.m114255n(interfaceC41563gV22, 0.0f, 1, null), 0.0f, C43705k61.m29303g(f2), 1, null);
        mo89518u.mo89638F(693286680);
        C25777lo c25777lo2 = C25777lo.f96729a;
        InterfaceC51579xO2 m74813a2 = C37252Yc5.m74813a(c25777lo2.m26803f(), m99138h2, mo89518u, 48);
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g013 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm23 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq63 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a2 = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a3 = c0757a2.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a3 = C31723Am2.m115273a(m94182k2);
        if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
        }
        mo89518u.mo89557h();
        if (!mo89518u.mo89521t()) {
        }
        mo89518u.mo89620L();
        InterfaceC32720Et0 m64192a3 = C38680bf6.m64192a(mo89518u);
        C38680bf6.m64191b(m64192a3, m74813a2, c0757a2.m113412d());
        C38680bf6.m64191b(m64192a3, interfaceC41273g013, c0757a2.m113414b());
        C38680bf6.m64191b(m64192a3, enumC47065pm23, c0757a2.m113413c());
        C38680bf6.m64191b(m64192a3, interfaceC33869Jq63, c0757a2.m113410f());
        mo89518u.mo89530q();
        m115273a3.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-678309503);
        C38066ad5 c38066ad52 = C38066ad5.f50835a;
        mo89518u.mo89638F(-318774852);
        AbstractC45562nE3 m19793d2 = C46748pE3.m19793d(i, mo89518u, (i4 >> 6) & 14);
        C48841sm0 m13699b2 = C48841sm0.C28383a.m13699b(C48841sm0.f109227b, j2, 0, 2, null);
        InterfaceC41563gV2.C20912a c20912a2 = InterfaceC41563gV2.f82354b0;
        C51659xX1.m5069a(m19793d2, null, ND3.m94184i(C13342bw.m62124d(C35447Qk0.m88106a(BB5.m114246w(c20912a2, C43705k61.m29303g(32)), C39242cc5.m61172d(C43705k61.m29303g(6))), j3, null, 2, null), C43705k61.m29303g(f2)), null, null, 0.0f, m13699b2, mo89518u, 56, 56);
        DN5.m110552a(BB5.m114246w(c20912a2, C43705k61.m29303g(f2)), mo89518u, 6);
        mo89518u.mo89638F(-483455358);
        InterfaceC51579xO2 m91546a2 = C34997Om0.m91546a(c25777lo2.m26802g(), c4361a2.m99136j(), mo89518u, 0);
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g0122 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm222 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq622 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        Function0<InterfaceC32018Bt0> m113415a22 = c0757a2.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a22 = C31723Am2.m115273a(c20912a2);
        if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
        }
        mo89518u.mo89557h();
        if (!mo89518u.mo89521t()) {
        }
        mo89518u.mo89620L();
        InterfaceC32720Et0 m64192a22 = C38680bf6.m64192a(mo89518u);
        C38680bf6.m64191b(m64192a22, m91546a2, c0757a2.m113412d());
        C38680bf6.m64191b(m64192a22, interfaceC41273g0122, c0757a2.m113414b());
        C38680bf6.m64191b(m64192a22, enumC47065pm222, c0757a2.m113413c());
        C38680bf6.m64191b(m64192a22, interfaceC33869Jq622, c0757a2.m113410f());
        mo89518u.mo89530q();
        m115273a22.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-1163856341);
        C35465Qm0 c35465Qm02 = C35465Qm0.f30887a;
        mo89518u.mo89638F(-1502182010);
        C38909c26.m62000e(str, null, j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, FinancialConnectionsTheme.INSTANCE.getTypography(mo89518u, 6).getCaptionTightEmphasized(), mo89518u, (i4 & 14) | ((i4 << 3) & 896), 0, 32762);
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        if (C35528Qt0.m87827O()) {
        }
        obj = interfaceC41563gV232;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
        }
    }

    public static final void SearchFooterTest(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(3811430);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(3811430, i, -1, "com.stripe.android.financialconnections.features.institutionpicker.SearchFooterTest (SearchFooter.kt:106)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, ComposableSingletons$SearchFooterKt.INSTANCE.m116388getLambda1$financial_connections_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new SearchFooterKt$SearchFooterTest$1(i));
        }
    }
}
