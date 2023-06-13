package com.stripe.android.financialconnections.features.common;

import com.google.p034ar.core.ImageMetadata;
import com.stripe.android.financialconnections.C18634R;
import com.stripe.android.financialconnections.exception.AccountLoadError;
import com.stripe.android.financialconnections.exception.AccountNoneEligibleForPaymentMethodError;
import com.stripe.android.financialconnections.exception.AccountNumberRetrievalError;
import com.stripe.android.financialconnections.exception.InstitutionPlannedDowntimeError;
import com.stripe.android.financialconnections.exception.InstitutionUnplannedDowntimeError;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.p041ui.CompositionLocalKt;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.financialconnections.p041ui.components.ButtonKt;
import com.stripe.android.financialconnections.p041ui.components.FinancialConnectionsButton;
import com.stripe.android.financialconnections.p041ui.theme.FinancialConnectionsTheme;
import com.stripe.android.uicore.image.StripeImageKt;
import com.stripe.android.uicore.image.StripeImageLoader;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.C25777lo;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC32720Et0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\t\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0001¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a3\u0010\u0011\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a3\u0010\u0014\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00132\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001aA\u0010\u0018\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00162\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a3\u0010\u001b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u001a2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a{\u0010'\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f2\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001d2\u001c\b\u0002\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0007\u0018\u00010\u001f2\u001c\b\u0002\u0010&\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0007\u0018\u00010\u001fH\u0001¢\u0006\u0004\b'\u0010(\u001a-\u0010*\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010\u001d2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001fH\u0003¢\u0006\u0004\b*\u0010+\u001a\u000f\u0010,\u001a\u00020\u0003H\u0001¢\u0006\u0004\b,\u0010-\u001a\u000f\u0010.\u001a\u00020\u0003H\u0001¢\u0006\u0004\b.\u0010-\u001a\u000f\u0010/\u001a\u00020\u0003H\u0001¢\u0006\u0004\b/\u0010-\u001a\u0017\u00102\u001a\u00020\u00032\u0006\u00101\u001a\u000200H\u0001¢\u0006\u0004\b2\u00103¨\u00064"}, m28432d2 = {"", "error", "Lkotlin/Function1;", "", "onCloseFromErrorClick", "UnclassifiedErrorContent", "(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;LEt0;I)V", "Lkotlin/Function0;", "onSelectAnotherBank", "InstitutionUnknownErrorContent", "(Lkotlin/jvm/functions/Function0;LEt0;I)V", "Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;", "exception", "onEnterDetailsManually", "InstitutionUnplannedDowntimeErrorContent", "(Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V", "Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;", "InstitutionPlannedDowntimeErrorContent", "(Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V", "Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;", "NoSupportedPaymentMethodTypeAccountsErrorContent", "(Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V", "Lcom/stripe/android/financialconnections/exception/AccountLoadError;", "onTryAgain", "NoAccountsAvailableErrorContent", "(Lcom/stripe/android/financialconnections/exception/AccountLoadError;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V", "Lcom/stripe/android/financialconnections/exception/AccountNumberRetrievalError;", "AccountNumberRetrievalErrorContent", "(Lcom/stripe/android/financialconnections/exception/AccountNumberRetrievalError;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V", "", "iconUrl", "Lkotlin/Pair;", "LnE3;", "Lhy5;", "badge", "title", "content", "primaryCta", "secondaryCta", "ErrorContent", "(Ljava/lang/String;Lkotlin/Pair;Ljava/lang/String;Ljava/lang/String;Lkotlin/Pair;Lkotlin/Pair;LEt0;II)V", "institutionIconUrl", "BadgedInstitutionImage", "(Ljava/lang/String;Lkotlin/Pair;LEt0;I)V", "UnclassifiedErrorContentPreview", "(LEt0;I)V", "InstitutionPlannedDowntimeErrorContentPreview", "NoAccountsAvailableErrorContentPreview", "LgV2;", "modifier", "InstitutionPlaceholder", "(LgV2;LEt0;I)V", "financial-connections_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nErrorContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErrorContent.kt\ncom/stripe/android/financialconnections/features/common/ErrorContentKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,439:1\n1057#2,6:440\n1057#2,6:446\n1057#2,6:452\n1057#2,6:458\n1#3:464\n154#4:465\n154#4:466\n154#4:467\n154#4:468\n154#4:535\n154#4:536\n154#4:542\n154#4:548\n154#4:582\n154#4:583\n154#4:585\n154#4:586\n74#5,6:469\n80#5:501\n74#5,6:502\n80#5:534\n84#5:541\n84#5:547\n75#6:475\n76#6,11:477\n75#6:508\n76#6,11:510\n89#6:540\n89#6:546\n75#6:555\n76#6,11:557\n89#6:590\n76#7:476\n76#7:509\n76#7:556\n76#7:584\n460#8,13:488\n460#8,13:521\n473#8,3:537\n473#8,3:543\n460#8,13:568\n473#8,3:587\n67#9,6:549\n73#9:581\n77#9:591\n*S KotlinDebug\n*F\n+ 1 ErrorContent.kt\ncom/stripe/android/financialconnections/features/common/ErrorContentKt\n*L\n114#1:440,6\n115#1:446,6\n183#1:452,6\n205#1:458,6\n273#1:465\n274#1:466\n275#1:467\n276#1:468\n286#1:535\n291#1:536\n307#1:542\n328#1:548\n331#1:582\n333#1:583\n347#1:585\n351#1:586\n270#1:469,6\n270#1:501\n280#1:502,6\n280#1:534\n280#1:541\n270#1:547\n270#1:475\n270#1:477,11\n280#1:508\n280#1:510,11\n280#1:540\n270#1:546\n326#1:555\n326#1:557,11\n326#1:590\n270#1:476\n280#1:509\n326#1:556\n336#1:584\n270#1:488,13\n280#1:521,13\n280#1:537,3\n270#1:543,3\n326#1:568,13\n326#1:587,3\n326#1:549,6\n326#1:581\n326#1:591\n*E\n"})
/* loaded from: classes7.dex */
public final class ErrorContentKt {
    public static final void AccountNumberRetrievalErrorContent(AccountNumberRetrievalError exception, Function0<Unit> onSelectAnotherBank, Function0<Unit> onEnterDetailsManually, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int i3;
        Pair pair;
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(onSelectAnotherBank, "onSelectAnotherBank");
        Intrinsics.checkNotNullParameter(onEnterDetailsManually, "onEnterDetailsManually");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1714910993);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(exception)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89539n(onSelectAnotherBank)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (mo89518u.mo89539n(onEnterDetailsManually)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i2 & 731) == 146 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1714910993, i, -1, "com.stripe.android.financialconnections.features.common.AccountNumberRetrievalErrorContent (ErrorContent.kt:225)");
            }
            Image icon = exception.getInstitution().getIcon();
            String str = (icon == null || (r0 = icon.getDefault()) == null) ? "" : "";
            String m41310c = C40946fS5.m41310c(C18634R.string.stripe_attachlinkedpaymentaccount_error_title, mo89518u, 0);
            boolean allowManualEntry = exception.getAllowManualEntry();
            if (allowManualEntry) {
                i3 = C18634R.string.stripe_attachlinkedpaymentaccount_error_desc_manual_entry;
            } else if (!allowManualEntry) {
                i3 = C18634R.string.stripe_attachlinkedpaymentaccount_error_desc;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            String m41310c2 = C40946fS5.m41310c(i3, mo89518u, 0);
            Pair pair2 = new Pair(C40946fS5.m41310c(C18634R.string.stripe_error_cta_select_another_bank, mo89518u, 0), onSelectAnotherBank);
            if (exception.getAllowManualEntry()) {
                pair = new Pair(C40946fS5.m41310c(C18634R.string.stripe_error_cta_manual_entry, mo89518u, 0), onEnterDetailsManually);
            } else {
                pair = null;
            }
            ErrorContent(str, null, m41310c, m41310c2, pair2, pair, mo89518u, 0, 2);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ErrorContentKt$AccountNumberRetrievalErrorContent$1(exception, onSelectAnotherBank, onEnterDetailsManually, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BadgedInstitutionImage(String str, Pair<? extends AbstractC45562nE3, ? extends InterfaceC42444hy5> pair, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        String str2;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(525043801);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(525043801, i, -1, "com.stripe.android.financialconnections.features.common.BadgedInstitutionImage (ErrorContent.kt:321)");
        }
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        InterfaceC41563gV2 m114246w = BB5.m114246w(c20912a, C43705k61.m29303g(40));
        mo89518u.mo89638F(733328855);
        InterfaceC4360K9.C4361a c4361a = InterfaceC4360K9.f19170a;
        InterfaceC51579xO2 m44729h = C39504d10.m44729h(c4361a.m99132n(), false, mo89518u, 0);
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m114246w);
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
        C38680bf6.m64191b(m64192a, m44729h, c0757a.m113412d());
        C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
        C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
        C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
        mo89518u.mo89530q();
        m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-2137368960);
        C40689f10 c40689f10 = C40689f10.f79291a;
        mo89518u.mo89638F(1479490963);
        InterfaceC41563gV2 m88106a = C35447Qk0.m88106a(c40689f10.mo35388c(BB5.m114246w(c20912a, C43705k61.m29303g(36)), c4361a.m99142d()), C39242cc5.m61172d(C43705k61.m29303g(6)));
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        StripeImageKt.StripeImage(str2, (StripeImageLoader) mo89518u.mo89572c(FinancialConnectionsSheetNativeActivityKt.getLocalImageLoader()), null, m88106a, null, null, null, C43575jt0.m29791b(mo89518u, -1310898216, true, new ErrorContentKt$BadgedInstitutionImage$1$1(m88106a)), null, mo89518u, (StripeImageLoader.$stable << 3) | 12583296, 368);
        FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
        DP1.m110533b(pair.getFirst(), "", ND3.m94184i(C13342bw.m62124d(C35447Qk0.m88106a(BB5.m114246w(c40689f10.mo35388c(c20912a, c4361a.m99133m()), C43705k61.m29303g(12)), pair.getSecond()), financialConnectionsTheme.getColors(mo89518u, 6).m116476getTextWhite0d7_KjU(), null, 2, null), C43705k61.m29303g(1)), financialConnectionsTheme.getColors(mo89518u, 6).m116470getTextCritical0d7_KjU(), mo89518u, 56, 0);
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ErrorContentKt$BadgedInstitutionImage$2(str, pair, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0256  */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ErrorContent(String str, Pair<? extends AbstractC45562nE3, ? extends InterfaceC42444hy5> pair, String title, String content, Pair<String, ? extends Function0<Unit>> pair2, Pair<String, ? extends Function0<Unit>> pair3, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Object obj;
        int i7;
        int i8;
        Object obj2;
        int i9;
        Pair<? extends AbstractC45562nE3, ? extends InterfaceC42444hy5> pair4;
        Pair<? extends AbstractC45562nE3, ? extends InterfaceC42444hy5> pair5;
        int i10;
        Pair<String, ? extends Function0<Unit>> pair6;
        Pair<String, ? extends Function0<Unit>> pair7;
        InterfaceC41563gV2.C20912a c20912a;
        float f;
        InterfaceC32720Et0 interfaceC32720Et02;
        float f2;
        Object obj3;
        ?? r15;
        Pair<String, ? extends Function0<Unit>> pair8;
        Pair<String, ? extends Function0<Unit>> pair9;
        Pair<? extends AbstractC45562nE3, ? extends InterfaceC42444hy5> pair10;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1077493574);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89539n(str)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (mo89518u.mo89539n(title)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (mo89518u.mo89539n(content)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        int i12 = i2 & 16;
        if (i12 != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            obj = pair2;
            if (mo89518u.mo89539n(obj)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
            i8 = i2 & 32;
            if (i8 == 0) {
                i3 |= ImageMetadata.EDGE_MODE;
            } else if ((458752 & i) == 0) {
                obj2 = pair3;
                if (mo89518u.mo89539n(obj2)) {
                    i9 = DateUtils.FORMAT_NUMERIC_DATE;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
                if (i11 != 2 && (374491 & i3) == 74898 && mo89518u.mo89575b()) {
                    mo89518u.mo89548k();
                    pair10 = pair;
                    pair8 = obj;
                    pair9 = obj2;
                    interfaceC32720Et02 = mo89518u;
                } else {
                    mo89518u.mo89626J();
                    if ((i & 1) == 0 && !mo89518u.mo89545l()) {
                        mo89518u.mo89548k();
                        if (i11 != 0) {
                            i3 &= -113;
                        }
                        pair5 = pair;
                    } else {
                        if (i11 != 0) {
                            pair4 = new Pair<>(C46748pE3.m19793d(C18634R.C18635drawable.stripe_ic_warning_circle, mo89518u, 0), C39242cc5.m61171e());
                            i3 &= -113;
                        } else {
                            pair4 = pair;
                        }
                        if (i12 != 0) {
                            obj = null;
                        }
                        if (i8 != 0) {
                            i10 = i3;
                            pair5 = pair4;
                            pair6 = obj;
                            pair7 = null;
                            mo89518u.mo89650B();
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87816Z(1077493574, i10, -1, "com.stripe.android.financialconnections.features.common.ErrorContent (ErrorContent.kt:257)");
                            }
                            C37135Xp5 m80790a = C36433Up5.m80790a(0, mo89518u, 0, 1);
                            c20912a = InterfaceC41563gV2.f82354b0;
                            f = 8;
                            float f3 = 24;
                            InterfaceC41563gV2 m114257l = BB5.m114257l(ND3.m94181l(c20912a, C43705k61.m29303g(f3), C43705k61.m29303g(f), C43705k61.m29303g(f3), C43705k61.m29303g(f3)), 0.0f, 1, null);
                            mo89518u.mo89638F(-483455358);
                            C25777lo c25777lo = C25777lo.f96729a;
                            C25777lo.InterfaceC25789l m26802g = c25777lo.m26802g();
                            InterfaceC4360K9.C4361a c4361a = InterfaceC4360K9.f19170a;
                            InterfaceC51579xO2 m91546a = C34997Om0.m91546a(m26802g, c4361a.m99136j(), mo89518u, 0);
                            mo89518u.mo89638F(-1323940314);
                            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m114257l);
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
                            mo89518u.mo89638F(-1291491184);
                            InterfaceC41563gV2 m80787d = C36433Up5.m80787d(InterfaceC35231Pm0.m89798b(c35465Qm0, c20912a, 1.0f, false, 2, null), m80790a, false, null, false, 14, null);
                            mo89518u.mo89638F(-483455358);
                            InterfaceC51579xO2 m91546a2 = C34997Om0.m91546a(c25777lo.m26802g(), c4361a.m99136j(), mo89518u, 0);
                            mo89518u.mo89638F(-1323940314);
                            InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                            EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                            InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                            Function0<InterfaceC32018Bt0> m113415a2 = c0757a.m113415a();
                            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(m80787d);
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
                            C38680bf6.m64191b(m64192a2, m91546a2, c0757a.m113412d());
                            C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a.m113414b());
                            C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a.m113413c());
                            C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a.m113410f());
                            mo89518u.mo89530q();
                            m115273a2.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
                            mo89518u.mo89638F(2058660585);
                            mo89518u.mo89638F(-1163856341);
                            mo89518u.mo89638F(-784965414);
                            BadgedInstitutionImage(str, pair5, mo89518u, (i10 & 14) | 64);
                            float f4 = 16;
                            DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(f4)), mo89518u, 6);
                            int i13 = i10;
                            Pair<? extends AbstractC45562nE3, ? extends InterfaceC42444hy5> pair11 = pair5;
                            FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
                            interfaceC32720Et02 = mo89518u;
                            C38909c26.m62000e(title, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, financialConnectionsTheme.getTypography(mo89518u, 6).getSubtitle(), mo89518u, (i13 >> 6) & 14, 0, 32766);
                            DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(f4)), interfaceC32720Et02, 6);
                            C38909c26.m62000e(content, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, financialConnectionsTheme.getTypography(interfaceC32720Et02, 6).getBody(), interfaceC32720Et02, (i13 >> 9) & 14, 0, 32766);
                            interfaceC32720Et02.mo89605Q();
                            interfaceC32720Et02.mo89605Q();
                            interfaceC32720Et02.mo89605Q();
                            interfaceC32720Et02.mo89563f();
                            interfaceC32720Et02.mo89605Q();
                            interfaceC32720Et02.mo89605Q();
                            interfaceC32720Et02.mo89638F(1495673842);
                            if (pair7 != null) {
                                f2 = 0.0f;
                                obj3 = null;
                                r15 = 1;
                            } else {
                                f2 = 0.0f;
                                obj3 = null;
                                r15 = 1;
                                ButtonKt.FinancialConnectionsButton(pair7.component2(), BB5.m114255n(c20912a, 0.0f, 1, null), FinancialConnectionsButton.Type.Secondary.INSTANCE, null, false, false, C43575jt0.m29791b(interfaceC32720Et02, -1816944322, true, new ErrorContentKt$ErrorContent$1$2$1(pair7.component1())), interfaceC32720Et02, 1573296, 56);
                                Unit unit = Unit.INSTANCE;
                            }
                            interfaceC32720Et02.mo89605Q();
                            interfaceC32720Et02.mo89638F(1495674162);
                            if (pair6 != null && pair7 != null) {
                                DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(f)), interfaceC32720Et02, 6);
                            }
                            interfaceC32720Et02.mo89605Q();
                            if (pair6 != null) {
                                ButtonKt.FinancialConnectionsButton(pair6.component2(), BB5.m114255n(c20912a, f2, r15, obj3), FinancialConnectionsButton.Type.Primary.INSTANCE, null, false, false, C43575jt0.m29791b(interfaceC32720Et02, -110507161, r15, new ErrorContentKt$ErrorContent$1$3$1(pair6.component1())), interfaceC32720Et02, 1573296, 56);
                                Unit unit2 = Unit.INSTANCE;
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
                            pair8 = pair6;
                            pair9 = pair7;
                            pair10 = pair11;
                        } else {
                            pair5 = pair4;
                        }
                    }
                    pair6 = obj;
                    pair7 = obj2;
                    i10 = i3;
                    mo89518u.mo89650B();
                    if (C35528Qt0.m87827O()) {
                    }
                    C37135Xp5 m80790a2 = C36433Up5.m80790a(0, mo89518u, 0, 1);
                    c20912a = InterfaceC41563gV2.f82354b0;
                    f = 8;
                    float f32 = 24;
                    InterfaceC41563gV2 m114257l2 = BB5.m114257l(ND3.m94181l(c20912a, C43705k61.m29303g(f32), C43705k61.m29303g(f), C43705k61.m29303g(f32), C43705k61.m29303g(f32)), 0.0f, 1, null);
                    mo89518u.mo89638F(-483455358);
                    C25777lo c25777lo2 = C25777lo.f96729a;
                    C25777lo.InterfaceC25789l m26802g2 = c25777lo2.m26802g();
                    InterfaceC4360K9.C4361a c4361a2 = InterfaceC4360K9.f19170a;
                    InterfaceC51579xO2 m91546a3 = C34997Om0.m91546a(m26802g2, c4361a2.m99136j(), mo89518u, 0);
                    mo89518u.mo89638F(-1323940314);
                    InterfaceC41273g01 interfaceC41273g013 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                    EnumC47065pm2 enumC47065pm23 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                    InterfaceC33869Jq6 interfaceC33869Jq63 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                    InterfaceC32018Bt0.C0757a c0757a2 = InterfaceC32018Bt0.f2995M;
                    Function0<InterfaceC32018Bt0> m113415a3 = c0757a2.m113415a();
                    Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a3 = C31723Am2.m115273a(m114257l2);
                    if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                    }
                    mo89518u.mo89557h();
                    if (!mo89518u.mo89521t()) {
                    }
                    mo89518u.mo89620L();
                    InterfaceC32720Et0 m64192a3 = C38680bf6.m64192a(mo89518u);
                    C38680bf6.m64191b(m64192a3, m91546a3, c0757a2.m113412d());
                    C38680bf6.m64191b(m64192a3, interfaceC41273g013, c0757a2.m113414b());
                    C38680bf6.m64191b(m64192a3, enumC47065pm23, c0757a2.m113413c());
                    C38680bf6.m64191b(m64192a3, interfaceC33869Jq63, c0757a2.m113410f());
                    mo89518u.mo89530q();
                    m115273a3.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
                    mo89518u.mo89638F(2058660585);
                    mo89518u.mo89638F(-1163856341);
                    C35465Qm0 c35465Qm02 = C35465Qm0.f30887a;
                    mo89518u.mo89638F(-1291491184);
                    InterfaceC41563gV2 m80787d2 = C36433Up5.m80787d(InterfaceC35231Pm0.m89798b(c35465Qm02, c20912a, 1.0f, false, 2, null), m80790a2, false, null, false, 14, null);
                    mo89518u.mo89638F(-483455358);
                    InterfaceC51579xO2 m91546a22 = C34997Om0.m91546a(c25777lo2.m26802g(), c4361a2.m99136j(), mo89518u, 0);
                    mo89518u.mo89638F(-1323940314);
                    InterfaceC41273g01 interfaceC41273g0122 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                    EnumC47065pm2 enumC47065pm222 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                    InterfaceC33869Jq6 interfaceC33869Jq622 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                    Function0<InterfaceC32018Bt0> m113415a22 = c0757a2.m113415a();
                    Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a22 = C31723Am2.m115273a(m80787d2);
                    if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                    }
                    mo89518u.mo89557h();
                    if (!mo89518u.mo89521t()) {
                    }
                    mo89518u.mo89620L();
                    InterfaceC32720Et0 m64192a22 = C38680bf6.m64192a(mo89518u);
                    C38680bf6.m64191b(m64192a22, m91546a22, c0757a2.m113412d());
                    C38680bf6.m64191b(m64192a22, interfaceC41273g0122, c0757a2.m113414b());
                    C38680bf6.m64191b(m64192a22, enumC47065pm222, c0757a2.m113413c());
                    C38680bf6.m64191b(m64192a22, interfaceC33869Jq622, c0757a2.m113410f());
                    mo89518u.mo89530q();
                    m115273a22.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
                    mo89518u.mo89638F(2058660585);
                    mo89518u.mo89638F(-1163856341);
                    mo89518u.mo89638F(-784965414);
                    BadgedInstitutionImage(str, pair5, mo89518u, (i10 & 14) | 64);
                    float f42 = 16;
                    DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(f42)), mo89518u, 6);
                    int i132 = i10;
                    Pair<? extends AbstractC45562nE3, ? extends InterfaceC42444hy5> pair112 = pair5;
                    FinancialConnectionsTheme financialConnectionsTheme2 = FinancialConnectionsTheme.INSTANCE;
                    interfaceC32720Et02 = mo89518u;
                    C38909c26.m62000e(title, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, financialConnectionsTheme2.getTypography(mo89518u, 6).getSubtitle(), mo89518u, (i132 >> 6) & 14, 0, 32766);
                    DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(f42)), interfaceC32720Et02, 6);
                    C38909c26.m62000e(content, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, financialConnectionsTheme2.getTypography(interfaceC32720Et02, 6).getBody(), interfaceC32720Et02, (i132 >> 9) & 14, 0, 32766);
                    interfaceC32720Et02.mo89605Q();
                    interfaceC32720Et02.mo89605Q();
                    interfaceC32720Et02.mo89605Q();
                    interfaceC32720Et02.mo89563f();
                    interfaceC32720Et02.mo89605Q();
                    interfaceC32720Et02.mo89605Q();
                    interfaceC32720Et02.mo89638F(1495673842);
                    if (pair7 != null) {
                    }
                    interfaceC32720Et02.mo89605Q();
                    interfaceC32720Et02.mo89638F(1495674162);
                    if (pair6 != null) {
                        DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(f)), interfaceC32720Et02, 6);
                    }
                    interfaceC32720Et02.mo89605Q();
                    if (pair6 != null) {
                    }
                    interfaceC32720Et02.mo89605Q();
                    interfaceC32720Et02.mo89605Q();
                    interfaceC32720Et02.mo89605Q();
                    interfaceC32720Et02.mo89563f();
                    interfaceC32720Et02.mo89605Q();
                    interfaceC32720Et02.mo89605Q();
                    if (C35528Qt0.m87827O()) {
                    }
                    pair8 = pair6;
                    pair9 = pair7;
                    pair10 = pair112;
                }
                InterfaceC36874Wm5 mo89512w = interfaceC32720Et02.mo89512w();
                if (mo89512w != null) {
                    mo89512w.mo20405a(new ErrorContentKt$ErrorContent$2(str, pair10, title, content, pair8, pair9, i, i2));
                    return;
                }
                return;
            }
            obj2 = pair3;
            if (i11 != 2) {
            }
            mo89518u.mo89626J();
            if ((i & 1) == 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i8 != 0) {
            }
        }
        obj = pair2;
        i8 = i2 & 32;
        if (i8 == 0) {
        }
        obj2 = pair3;
        if (i11 != 2) {
        }
        mo89518u.mo89626J();
        if ((i & 1) == 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i8 != 0) {
        }
    }

    public static final void InstitutionPlaceholder(InterfaceC41563gV2 modifier, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-917481424);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(modifier)) {
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
                C35528Qt0.m87816Z(-917481424, i2, -1, "com.stripe.android.financialconnections.features.common.InstitutionPlaceholder (ErrorContent.kt:430)");
            }
            C51659xX1.m5069a(C46748pE3.m19793d(C18634R.C18635drawable.stripe_ic_brandicon_institution, mo89518u, 0), "Bank icon placeholder", modifier, null, BA0.f1929a.m114317a(), 0.0f, null, mo89518u, ((i2 << 6) & 896) | 24632, 104);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ErrorContentKt$InstitutionPlaceholder$1(modifier, i));
        }
    }

    public static final void InstitutionPlannedDowntimeErrorContent(InstitutionPlannedDowntimeError exception, Function0<Unit> onSelectAnotherBank, Function0<Unit> onEnterDetailsManually, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        Pair pair;
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(onSelectAnotherBank, "onSelectAnotherBank");
        Intrinsics.checkNotNullParameter(onEnterDetailsManually, "onEnterDetailsManually");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(118813745);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(exception)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89539n(onSelectAnotherBank)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (mo89518u.mo89539n(onEnterDetailsManually)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(118813745, i, -1, "com.stripe.android.financialconnections.features.common.InstitutionPlannedDowntimeErrorContent (ErrorContent.kt:108)");
            }
            Object mo89635G = mo89518u.mo89635G();
            InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
            if (mo89635G == c2012a.m108267a()) {
                mo89635G = new Locale(C47748qv2.f106064b.m16784a().m16788a());
                mo89518u.mo89503z(mo89635G);
            }
            Locale locale = (Locale) mo89635G;
            boolean mo89524s = mo89518u.mo89524s(exception.getBackUpAt());
            Object mo89635G2 = mo89518u.mo89635G();
            if (mo89524s || mo89635G2 == c2012a.m108267a()) {
                mo89635G2 = new SimpleDateFormat("dd/MM/yyyy HH:mm", locale).format(Long.valueOf(exception.getBackUpAt()));
                mo89518u.mo89503z(mo89635G2);
            }
            String readableDate = (String) mo89635G2;
            Image icon = exception.getInstitution().getIcon();
            String str = (icon == null || (r0 = icon.getDefault()) == null) ? "" : "";
            String m41309d = C40946fS5.m41309d(C18634R.string.stripe_error_planned_downtime_title, new Object[]{exception.getInstitution().getName()}, mo89518u, 64);
            int i6 = C18634R.string.stripe_error_planned_downtime_desc;
            Intrinsics.checkNotNullExpressionValue(readableDate, "readableDate");
            String m41309d2 = C40946fS5.m41309d(i6, new Object[]{readableDate}, mo89518u, 64);
            Pair pair2 = new Pair(C40946fS5.m41310c(C18634R.string.stripe_error_cta_select_another_bank, mo89518u, 0), onSelectAnotherBank);
            if (exception.getAllowManualEntry()) {
                pair = new Pair(C40946fS5.m41310c(C18634R.string.stripe_error_cta_manual_entry, mo89518u, 0), onEnterDetailsManually);
            } else {
                pair = null;
            }
            ErrorContent(str, null, m41309d, m41309d2, pair2, pair, mo89518u, 0, 2);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ErrorContentKt$InstitutionPlannedDowntimeErrorContent$1(exception, onSelectAnotherBank, onEnterDetailsManually, i));
        }
    }

    public static final void InstitutionPlannedDowntimeErrorContentPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1460745428);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1460745428, i, -1, "com.stripe.android.financialconnections.features.common.InstitutionPlannedDowntimeErrorContentPreview (ErrorContent.kt:369)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, ComposableSingletons$ErrorContentKt.INSTANCE.m116374getLambda6$financial_connections_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ErrorContentKt$InstitutionPlannedDowntimeErrorContentPreview$1(i));
        }
    }

    public static final void InstitutionUnknownErrorContent(Function0<Unit> onSelectAnotherBank, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(onSelectAnotherBank, "onSelectAnotherBank");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(517513307);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(onSelectAnotherBank)) {
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
                C35528Qt0.m87816Z(517513307, i, -1, "com.stripe.android.financialconnections.features.common.InstitutionUnknownErrorContent (ErrorContent.kt:65)");
            }
            ErrorContent(null, null, C40946fS5.m41310c(C18634R.string.stripe_error_generic_title, mo89518u, 0), C40946fS5.m41310c(C18634R.string.stripe_error_unplanned_downtime_desc, mo89518u, 0), new Pair(C40946fS5.m41310c(C18634R.string.stripe_error_cta_select_another_bank, mo89518u, 0), onSelectAnotherBank), null, mo89518u, 6, 34);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ErrorContentKt$InstitutionUnknownErrorContent$1(onSelectAnotherBank, i));
        }
    }

    public static final void InstitutionUnplannedDowntimeErrorContent(InstitutionUnplannedDowntimeError exception, Function0<Unit> onSelectAnotherBank, Function0<Unit> onEnterDetailsManually, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        Pair pair;
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(onSelectAnotherBank, "onSelectAnotherBank");
        Intrinsics.checkNotNullParameter(onEnterDetailsManually, "onEnterDetailsManually");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1547189329);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(exception)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89539n(onSelectAnotherBank)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (mo89518u.mo89539n(onEnterDetailsManually)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1547189329, i, -1, "com.stripe.android.financialconnections.features.common.InstitutionUnplannedDowntimeErrorContent (ErrorContent.kt:80)");
            }
            Image icon = exception.getInstitution().getIcon();
            String str = (icon == null || (r0 = icon.getDefault()) == null) ? "" : "";
            String m41309d = C40946fS5.m41309d(C18634R.string.stripe_error_unplanned_downtime_title, new Object[]{exception.getInstitution().getName()}, mo89518u, 64);
            String m41310c = C40946fS5.m41310c(C18634R.string.stripe_error_unplanned_downtime_desc, mo89518u, 0);
            Pair pair2 = new Pair(C40946fS5.m41310c(C18634R.string.stripe_error_cta_select_another_bank, mo89518u, 0), onSelectAnotherBank);
            if (exception.getAllowManualEntry()) {
                pair = new Pair(C40946fS5.m41310c(C18634R.string.stripe_error_cta_manual_entry, mo89518u, 0), onEnterDetailsManually);
            } else {
                pair = null;
            }
            ErrorContent(str, null, m41309d, m41310c, pair2, pair, mo89518u, 0, 2);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ErrorContentKt$InstitutionUnplannedDowntimeErrorContent$1(exception, onSelectAnotherBank, onEnterDetailsManually, i));
        }
    }

    public static final void NoAccountsAvailableErrorContent(AccountLoadError exception, Function0<Unit> onSelectAnotherBank, Function0<Unit> onEnterDetailsManually, Function0<Unit> onTryAgain, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        Pair pair;
        int i3;
        Pair pair2;
        int i4;
        int i5;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(onSelectAnotherBank, "onSelectAnotherBank");
        Intrinsics.checkNotNullParameter(onEnterDetailsManually, "onEnterDetailsManually");
        Intrinsics.checkNotNullParameter(onTryAgain, "onTryAgain");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-162660842);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(exception)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89539n(onSelectAnotherBank)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 896) == 0) {
            if (mo89518u.mo89539n(onEnterDetailsManually)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        }
        if ((i & 7168) == 0) {
            if (mo89518u.mo89539n(onTryAgain)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i2 & 5851) == 1170 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-162660842, i, -1, "com.stripe.android.financialconnections.features.common.NoAccountsAvailableErrorContent (ErrorContent.kt:175)");
            }
            boolean mo89536o = mo89518u.mo89536o(exception.getAllowManualEntry()) | mo89518u.mo89536o(exception.getCanRetry());
            Object mo89635G = mo89518u.mo89635G();
            if (mo89536o || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                if (exception.getCanRetry()) {
                    pair = new Pair(TuplesKt.m28425to(Integer.valueOf(C18634R.string.stripe_error_cta_retry), onTryAgain), TuplesKt.m28425to(Integer.valueOf(C18634R.string.stripe_error_cta_select_another_bank), onSelectAnotherBank));
                } else if (exception.getAllowManualEntry()) {
                    pair = new Pair(TuplesKt.m28425to(Integer.valueOf(C18634R.string.stripe_error_cta_manual_entry), onEnterDetailsManually), TuplesKt.m28425to(Integer.valueOf(C18634R.string.stripe_error_cta_select_another_bank), onSelectAnotherBank));
                } else {
                    pair = new Pair(TuplesKt.m28425to(Integer.valueOf(C18634R.string.stripe_error_cta_select_another_bank), onSelectAnotherBank), null);
                }
                mo89635G = pair;
                mo89518u.mo89503z(mo89635G);
            }
            Pair pair3 = (Pair) mo89635G;
            Pair pair4 = (Pair) pair3.component1();
            Pair pair5 = (Pair) pair3.component2();
            boolean mo89536o2 = mo89518u.mo89536o(exception.getAllowManualEntry()) | mo89518u.mo89536o(exception.getCanRetry());
            Object mo89635G2 = mo89518u.mo89635G();
            if (mo89536o2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
                if (exception.getCanRetry()) {
                    i3 = C18634R.string.stripe_accounts_error_desc_retry;
                } else if (exception.getAllowManualEntry()) {
                    i3 = C18634R.string.stripe_accounts_error_desc_manualentry;
                } else {
                    i3 = C18634R.string.stripe_accounts_error_desc_no_retry;
                }
                mo89635G2 = Integer.valueOf(i3);
                mo89518u.mo89503z(mo89635G2);
            }
            int intValue = ((Number) mo89635G2).intValue();
            Image icon = exception.getInstitution().getIcon();
            String str = (icon == null || (str = icon.getDefault()) == null) ? "" : "";
            String m41309d = C40946fS5.m41309d(C18634R.string.stripe_account_picker_error_no_account_available_title, new Object[]{exception.getInstitution().getName()}, mo89518u, 64);
            String m41310c = C40946fS5.m41310c(intValue, mo89518u, 0);
            Pair m28425to = TuplesKt.m28425to(C40946fS5.m41310c(((Number) pair4.getFirst()).intValue(), mo89518u, 0), pair4.getSecond());
            if (pair5 != null) {
                pair2 = TuplesKt.m28425to(C40946fS5.m41310c(((Number) pair5.getFirst()).intValue(), mo89518u, 0), pair5.getSecond());
            } else {
                pair2 = null;
            }
            ErrorContent(str, null, m41309d, m41310c, m28425to, pair2, mo89518u, 0, 2);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ErrorContentKt$NoAccountsAvailableErrorContent$3(exception, onSelectAnotherBank, onEnterDetailsManually, onTryAgain, i));
        }
    }

    public static final void NoAccountsAvailableErrorContentPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-437381441);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-437381441, i, -1, "com.stripe.android.financialconnections.features.common.NoAccountsAvailableErrorContentPreview (ErrorContent.kt:400)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, ComposableSingletons$ErrorContentKt.INSTANCE.m116377getLambda9$financial_connections_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ErrorContentKt$NoAccountsAvailableErrorContentPreview$1(i));
        }
    }

    public static final void NoSupportedPaymentMethodTypeAccountsErrorContent(AccountNoneEligibleForPaymentMethodError exception, Function0<Unit> onSelectAnotherBank, Function0<Unit> onEnterDetailsManually, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        Pair pair;
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(onSelectAnotherBank, "onSelectAnotherBank");
        Intrinsics.checkNotNullParameter(onEnterDetailsManually, "onEnterDetailsManually");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(477494063);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(exception)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89539n(onSelectAnotherBank)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (mo89518u.mo89539n(onEnterDetailsManually)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(477494063, i, -1, "com.stripe.android.financialconnections.features.common.NoSupportedPaymentMethodTypeAccountsErrorContent (ErrorContent.kt:143)");
            }
            Image icon = exception.getInstitution().getIcon();
            String str = (icon == null || (r0 = icon.getDefault()) == null) ? "" : "";
            String m41310c = C40946fS5.m41310c(C18634R.string.stripe_account_picker_error_no_payment_method_title, mo89518u, 0);
            String m41309d = C40946fS5.m41309d(C18634R.string.stripe_account_picker_error_no_payment_method_desc, new Object[]{String.valueOf(exception.getAccountsCount()), exception.getInstitution().getName(), exception.getMerchantName()}, mo89518u, 64);
            Pair pair2 = new Pair(C40946fS5.m41310c(C18634R.string.stripe_error_cta_select_another_bank, mo89518u, 0), onSelectAnotherBank);
            if (exception.getAllowManualEntry()) {
                pair = new Pair(C40946fS5.m41310c(C18634R.string.stripe_error_cta_manual_entry, mo89518u, 0), onEnterDetailsManually);
            } else {
                pair = null;
            }
            ErrorContent(str, null, m41310c, m41309d, pair2, pair, mo89518u, 0, 2);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C18725x628fa082(exception, onSelectAnotherBank, onEnterDetailsManually, i));
        }
    }

    public static final void UnclassifiedErrorContent(Throwable error, Function1<? super Throwable, Unit> onCloseFromErrorClick, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(onCloseFromErrorClick, "onCloseFromErrorClick");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1193262794);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1193262794, i, -1, "com.stripe.android.financialconnections.features.common.UnclassifiedErrorContent (ErrorContent.kt:50)");
        }
        ErrorContent(null, null, C40946fS5.m41310c(C18634R.string.stripe_error_generic_title, mo89518u, 0), C40946fS5.m41310c(C18634R.string.stripe_error_generic_desc, mo89518u, 0), TuplesKt.m28425to(C40946fS5.m41310c(C18634R.string.stripe_error_cta_close, mo89518u, 0), new ErrorContentKt$UnclassifiedErrorContent$1(onCloseFromErrorClick, error)), null, mo89518u, 6, 34);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ErrorContentKt$UnclassifiedErrorContent$2(error, onCloseFromErrorClick, i));
        }
    }

    public static final void UnclassifiedErrorContentPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1144122875);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1144122875, i, -1, "com.stripe.android.financialconnections.features.common.UnclassifiedErrorContentPreview (ErrorContent.kt:357)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, ComposableSingletons$ErrorContentKt.INSTANCE.m116371getLambda3$financial_connections_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ErrorContentKt$UnclassifiedErrorContentPreview$1(i));
        }
    }
}
