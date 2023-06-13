package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import android.content.Context;
import androidx.compose.p003ui.platform.C11411h;
import com.stripe.android.paymentsheet.C19159R;
import com.stripe.android.uicore.StripeThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.Duration;
import p000.C25777lo;
import p000.C47801r06;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u000b\u001a5\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0011\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0016\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0017\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u000f\u0010\u0019\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0019\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;", "viewModel", "LgV2;", "modifier", "", "PollingScreen", "(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;LgV2;LEt0;II)V", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;", "uiState", "Lkotlin/Function0;", "onCancel", "(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;Lkotlin/jvm/functions/Function0;LgV2;LEt0;II)V", "Lkotlin/time/Duration;", "remainingDuration", "ActivePolling-bz6L7rs", "(JLkotlin/jvm/functions/Function0;LgV2;LEt0;II)V", "ActivePolling", "FailedPolling", "(Lkotlin/jvm/functions/Function0;LgV2;LEt0;II)V", "", "rememberActivePollingMessage-KLykuaI", "(JLEt0;I)Ljava/lang/String;", "rememberActivePollingMessage", "ActivePollingScreenPreview", "(LEt0;I)V", "FailedPollingScreenPreview", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPollingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PollingScreen.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Duration.kt\nkotlin/time/Duration\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,261:1\n76#2:262\n76#2:266\n76#2:299\n78#3,2:263\n80#3:291\n84#3:298\n75#4:265\n76#4,11:267\n89#4:297\n460#5,13:278\n473#5,3:294\n36#5:300\n141#6,2:292\n1057#7,3:301\n1060#7,3:306\n705#8,2:304\n76#9:309\n*S KotlinDebug\n*F\n+ 1 PollingScreen.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt\n*L\n54#1:262\n103#1:266\n205#1:299\n103#1:263,2\n103#1:291\n103#1:298\n103#1:265\n103#1:267,11\n103#1:297\n103#1:278,13\n103#1:294,3\n207#1:300\n128#1:292,2\n207#1:301,3\n207#1:306,3\n208#1:304,2\n55#1:309\n*E\n"})
/* loaded from: classes7.dex */
public final class PollingScreenKt {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PollingState.values().length];
            try {
                iArr[PollingState.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PollingState.Success.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PollingState.Canceled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PollingState.Failed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* renamed from: ActivePolling-bz6L7rs  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m116616ActivePollingbz6L7rs(long j, Function0<Unit> function0, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Object obj;
        int i6;
        InterfaceC41563gV2.C20912a c20912a;
        InterfaceC41563gV2 interfaceC41563gV22;
        InterfaceC36874Wm5 mo89512w;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(476348734);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89524s(j)) {
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
            if (mo89518u.mo89539n(function0)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = interfaceC41563gV2;
            if (mo89518u.mo89539n(obj)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
            if ((i3 & 731) != 146 && mo89518u.mo89575b()) {
                mo89518u.mo89548k();
                interfaceC41563gV22 = obj;
            } else {
                if (i7 == 0) {
                    c20912a = InterfaceC41563gV2.f82354b0;
                } else {
                    c20912a = obj;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(476348734, i3, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.ActivePolling (PollingScreen.kt:97)");
                }
                InterfaceC4360K9.InterfaceC4362b m99139g = InterfaceC4360K9.f19170a.m99139g();
                C25777lo.InterfaceC25782e m26807b = C25777lo.f96729a.m26807b();
                InterfaceC41563gV2 m94183j = ND3.m94183j(BB5.m114257l(c20912a, 0.0f, 1, null), H24.m104481a(C19159R.dimen.stripe_paymentsheet_outer_spacing_horizontal, mo89518u, 0), H24.m104481a(C19159R.dimen.stripe_paymentsheet_outer_spacing_top, mo89518u, 0));
                mo89518u.mo89638F(-483455358);
                InterfaceC51579xO2 m91546a = C34997Om0.m91546a(m26807b, m99139g, mo89518u, 54);
                mo89518u.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m94183j);
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
                mo89518u.mo89638F(-1892636024);
                InterfaceC41563gV2.C20912a c20912a2 = InterfaceC41563gV2.f82354b0;
                Spacing spacing = Spacing.INSTANCE;
                InterfaceC41563gV2 m94180m = ND3.m94180m(c20912a2, 0.0f, 0.0f, 0.0f, spacing.m116635getExtendedD9Ej5fM(), 7, null);
                TM2 tm2 = TM2.f35372a;
                int i8 = TM2.f35373b;
                InterfaceC41563gV2 interfaceC41563gV23 = c20912a;
                K74.m99208b(m94180m, StripeThemeKt.getStripeColors(tm2, mo89518u, i8).m116694getAppBarIcon0d7_KjU(), 0.0f, mo89518u, 6, 4);
                String m41310c = C40946fS5.m41310c(C19159R.string.upi_polling_header, mo89518u, 0);
                G26 m104960h = tm2.m83729c(mo89518u, i8).m104960h();
                C47801r06.C27748a c27748a = C47801r06.f106195b;
                C38909c26.m62000e(m41310c, ND3.m94180m(c20912a2, 0.0f, 0.0f, 0.0f, spacing.m116636getNormalD9Ej5fM(), 7, null), 0L, 0L, null, null, null, 0L, null, C47801r06.m16685g(c27748a.m16678a()), 0L, 0, false, 0, null, m104960h, mo89518u, 48, 0, 32252);
                String m116618rememberActivePollingMessageKLykuaI = m116618rememberActivePollingMessageKLykuaI(j, mo89518u, i3 & 14);
                int m16678a = c27748a.m16678a();
                long m105911n = tm2.m83729c(mo89518u, i8).m104965c().m105911n();
                N26.m94418b(m105911n);
                C38909c26.m62000e(m116618rememberActivePollingMessageKLykuaI, ND3.m94180m(c20912a2, 0.0f, 0.0f, 0.0f, spacing.m116636getNormalD9Ej5fM(), 7, null), 0L, 0L, null, null, null, 0L, null, C47801r06.m16685g(m16678a), N26.m94411i(M26.m95974f(m105911n), M26.m95972h(m105911n) * 1.3f), 0, false, 0, null, null, mo89518u, 48, 0, 63996);
                C43714k70.m29276c(function0, null, false, null, null, null, null, null, null, ComposableSingletons$PollingScreenKt.INSTANCE.m116608getLambda1$paymentsheet_release(), mo89518u, ((i3 >> 3) & 14) | 805306368, 510);
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                mo89518u.mo89563f();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                interfaceC41563gV22 = interfaceC41563gV23;
            }
            mo89512w = mo89518u.mo89512w();
            if (mo89512w == null) {
                mo89512w.mo20405a(new PollingScreenKt$ActivePolling$2(j, function0, interfaceC41563gV22, i, i2));
                return;
            }
            return;
        }
        obj = interfaceC41563gV2;
        if ((i3 & 731) != 146) {
        }
        if (i7 == 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        InterfaceC4360K9.InterfaceC4362b m99139g2 = InterfaceC4360K9.f19170a.m99139g();
        C25777lo.InterfaceC25782e m26807b2 = C25777lo.f96729a.m26807b();
        InterfaceC41563gV2 m94183j2 = ND3.m94183j(BB5.m114257l(c20912a, 0.0f, 1, null), H24.m104481a(C19159R.dimen.stripe_paymentsheet_outer_spacing_horizontal, mo89518u, 0), H24.m104481a(C19159R.dimen.stripe_paymentsheet_outer_spacing_top, mo89518u, 0));
        mo89518u.mo89638F(-483455358);
        InterfaceC51579xO2 m91546a2 = C34997Om0.m91546a(m26807b2, m99139g2, mo89518u, 54);
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a2 = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a2 = c0757a2.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(m94183j2);
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
        mo89518u.mo89638F(-1892636024);
        InterfaceC41563gV2.C20912a c20912a22 = InterfaceC41563gV2.f82354b0;
        Spacing spacing2 = Spacing.INSTANCE;
        InterfaceC41563gV2 m94180m2 = ND3.m94180m(c20912a22, 0.0f, 0.0f, 0.0f, spacing2.m116635getExtendedD9Ej5fM(), 7, null);
        TM2 tm22 = TM2.f35372a;
        int i82 = TM2.f35373b;
        InterfaceC41563gV2 interfaceC41563gV232 = c20912a;
        K74.m99208b(m94180m2, StripeThemeKt.getStripeColors(tm22, mo89518u, i82).m116694getAppBarIcon0d7_KjU(), 0.0f, mo89518u, 6, 4);
        String m41310c2 = C40946fS5.m41310c(C19159R.string.upi_polling_header, mo89518u, 0);
        G26 m104960h2 = tm22.m83729c(mo89518u, i82).m104960h();
        C47801r06.C27748a c27748a2 = C47801r06.f106195b;
        C38909c26.m62000e(m41310c2, ND3.m94180m(c20912a22, 0.0f, 0.0f, 0.0f, spacing2.m116636getNormalD9Ej5fM(), 7, null), 0L, 0L, null, null, null, 0L, null, C47801r06.m16685g(c27748a2.m16678a()), 0L, 0, false, 0, null, m104960h2, mo89518u, 48, 0, 32252);
        String m116618rememberActivePollingMessageKLykuaI2 = m116618rememberActivePollingMessageKLykuaI(j, mo89518u, i3 & 14);
        int m16678a2 = c27748a2.m16678a();
        long m105911n2 = tm22.m83729c(mo89518u, i82).m104965c().m105911n();
        N26.m94418b(m105911n2);
        C38909c26.m62000e(m116618rememberActivePollingMessageKLykuaI2, ND3.m94180m(c20912a22, 0.0f, 0.0f, 0.0f, spacing2.m116636getNormalD9Ej5fM(), 7, null), 0L, 0L, null, null, null, 0L, null, C47801r06.m16685g(m16678a2), N26.m94411i(M26.m95974f(m105911n2), M26.m95972h(m105911n2) * 1.3f), 0, false, 0, null, null, mo89518u, 48, 0, 63996);
        C43714k70.m29276c(function0, null, false, null, null, null, null, null, null, ComposableSingletons$PollingScreenKt.INSTANCE.m116608getLambda1$paymentsheet_release(), mo89518u, ((i3 >> 3) & 14) | 805306368, 510);
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        if (C35528Qt0.m87827O()) {
        }
        interfaceC41563gV22 = interfaceC41563gV232;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ActivePollingScreenPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-816023731);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-816023731, i, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.ActivePollingScreenPreview (PollingScreen.kt:231)");
            }
            StripeThemeKt.StripeTheme(null, null, null, ComposableSingletons$PollingScreenKt.INSTANCE.m116613getLambda6$paymentsheet_release(), mo89518u, 3072, 7);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PollingScreenKt$ActivePollingScreenPreview$1(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FailedPolling(Function0<Unit> function0, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        int i5;
        int i6;
        InterfaceC41563gV2.C20912a c20912a;
        InterfaceC32720Et0 interfaceC32720Et02;
        InterfaceC36874Wm5 mo89512w;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-826407987);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89539n(function0)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = interfaceC41563gV2;
            if (mo89518u.mo89539n(obj)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
            i6 = i3;
            if ((i6 & 91) != 18 && mo89518u.mo89575b()) {
                mo89518u.mo89548k();
                interfaceC32720Et02 = mo89518u;
            } else {
                if (i7 == 0) {
                    c20912a = InterfaceC41563gV2.f82354b0;
                } else {
                    c20912a = obj;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-826407987, i6, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.FailedPolling (PollingScreen.kt:138)");
                }
                interfaceC32720Et02 = mo89518u;
                C36604Vi5.m79545a(c20912a, null, C43575jt0.m29791b(mo89518u, 108078738, true, new PollingScreenKt$FailedPolling$1(function0, i6)), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableSingletons$PollingScreenKt.INSTANCE.m116611getLambda4$paymentsheet_release(), interfaceC32720Et02, ((i6 >> 3) & 14) | 384, 12582912, 131066);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                obj = c20912a;
            }
            mo89512w = interfaceC32720Et02.mo89512w();
            if (mo89512w == null) {
                mo89512w.mo20405a(new PollingScreenKt$FailedPolling$2(function0, obj, i, i2));
                return;
            }
            return;
        }
        obj = interfaceC41563gV2;
        i6 = i3;
        if ((i6 & 91) != 18) {
        }
        if (i7 == 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        interfaceC32720Et02 = mo89518u;
        C36604Vi5.m79545a(c20912a, null, C43575jt0.m29791b(mo89518u, 108078738, true, new PollingScreenKt$FailedPolling$1(function0, i6)), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableSingletons$PollingScreenKt.INSTANCE.m116611getLambda4$paymentsheet_release(), interfaceC32720Et02, ((i6 >> 3) & 14) | 384, 12582912, 131066);
        if (C35528Qt0.m87827O()) {
        }
        obj = c20912a;
        mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FailedPollingScreenPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(705722564);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(705722564, i, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.FailedPollingScreenPreview (PollingScreen.kt:247)");
            }
            StripeThemeKt.StripeTheme(null, null, null, ComposableSingletons$PollingScreenKt.INSTANCE.m116615getLambda8$paymentsheet_release(), mo89518u, 3072, 7);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PollingScreenKt$FailedPollingScreenPreview$1(i));
        }
    }

    public static final void PollingScreen(PollingViewModel viewModel, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1574771667);
        if ((i2 & 2) != 0) {
            interfaceC41563gV2 = InterfaceC41563gV2.f82354b0;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1574771667, i, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingScreen (PollingScreen.kt:49)");
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) mo89518u.mo89572c(C11411h.m68322i());
        InterfaceC48627sP5 m105205b = GM5.m105205b(viewModel.getUiState(), null, mo89518u, 8, 1);
        Y91.m75536c(lifecycleOwner, new PollingScreenKt$PollingScreen$1(viewModel, lifecycleOwner), mo89518u, 8);
        PollingScreen(PollingScreen$lambda$0(m105205b), new PollingScreenKt$PollingScreen$2(viewModel), BB5.m114260i(interfaceC41563gV2, 0.67f), mo89518u, 0, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new PollingScreenKt$PollingScreen$3(viewModel, interfaceC41563gV2, i, i2));
    }

    private static final PollingUiState PollingScreen$lambda$0(InterfaceC48627sP5<PollingUiState> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    /* renamed from: rememberActivePollingMessage-KLykuaI  reason: not valid java name */
    private static final String m116618rememberActivePollingMessageKLykuaI(long j, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        String padStart;
        interfaceC32720Et0.mo89638F(-214983362);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-214983362, i, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.rememberActivePollingMessage (PollingScreen.kt:201)");
        }
        Context context = (Context) interfaceC32720Et0.mo89572c(C11411h.m68324g());
        Duration m118138boximpl = Duration.m118138boximpl(j);
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n = interfaceC32720Et0.mo89539n(m118138boximpl);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            long m118159getInWholeMinutesimpl = Duration.m118159getInWholeMinutesimpl(j);
            int m118164getSecondsComponentimpl = Duration.m118164getSecondsComponentimpl(j);
            Duration.m118163getNanosecondsComponentimpl(j);
            padStart = StringsKt__StringsKt.padStart(String.valueOf(m118164getSecondsComponentimpl), 2, '0');
            mo89635G = context.getString(C19159R.string.upi_polling_message, m118159getInWholeMinutesimpl + ":" + padStart);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        Intrinsics.checkNotNullExpressionValue(mo89635G, "remember(remainingDurati…age, remainingTime)\n    }");
        String str = (String) mo89635G;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PollingScreen(PollingUiState pollingUiState, Function0<Unit> function0, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1466224530);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (mo89518u.mo89539n(pollingUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= mo89518u.mo89539n(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= mo89518u.mo89539n(interfaceC41563gV2) ? 256 : 128;
        }
        if ((i3 & 731) == 146 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (i4 != 0) {
                interfaceC41563gV2 = InterfaceC41563gV2.f82354b0;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1466224530, i3, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingScreen (PollingScreen.kt:72)");
            }
            int i5 = WhenMappings.$EnumSwitchMapping$0[pollingUiState.getPollingState().ordinal()];
            if (i5 == 1 || i5 == 2 || i5 == 3) {
                mo89518u.mo89638F(1387107239);
                m116616ActivePollingbz6L7rs(pollingUiState.m116622getDurationRemainingUwyO8pc(), function0, interfaceC41563gV2, mo89518u, (i3 & 112) | (i3 & 896), 0);
                mo89518u.mo89605Q();
            } else if (i5 != 4) {
                mo89518u.mo89638F(1387107592);
                mo89518u.mo89605Q();
            } else {
                mo89518u.mo89638F(1387107460);
                int i6 = i3 >> 3;
                FailedPolling(function0, interfaceC41563gV2, mo89518u, (i6 & 112) | (i6 & 14), 0);
                mo89518u.mo89605Q();
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC41563gV2 interfaceC41563gV22 = interfaceC41563gV2;
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new PollingScreenKt$PollingScreen$4(pollingUiState, function0, interfaceC41563gV22, i, i2));
    }
}
