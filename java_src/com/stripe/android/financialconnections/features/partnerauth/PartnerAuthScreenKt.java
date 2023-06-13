package com.stripe.android.financialconnections.features.partnerauth;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.compose.p003ui.platform.C11411h;
import androidx.fragment.app.Fragment;
import androidx.savedstate.C11966a;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.financialconnections.C18634R;
import com.stripe.android.financialconnections.domain.Display;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.financialconnections.domain.OauthPrepane;
import com.stripe.android.financialconnections.domain.PartnerNotice;
import com.stripe.android.financialconnections.exception.InstitutionPlannedDowntimeError;
import com.stripe.android.financialconnections.exception.InstitutionUnplannedDowntimeError;
import com.stripe.android.financialconnections.features.common.ErrorContentKt;
import com.stripe.android.financialconnections.features.common.LoadingContentKt;
import com.stripe.android.financialconnections.features.common.PartnerCalloutKt;
import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthState;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.p041ui.CompositionLocalKt;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.financialconnections.p041ui.TextResource;
import com.stripe.android.financialconnections.p041ui.components.ButtonKt;
import com.stripe.android.financialconnections.p041ui.components.ScaffoldKt;
import com.stripe.android.financialconnections.p041ui.components.StringAnnotation;
import com.stripe.android.financialconnections.p041ui.components.TextKt;
import com.stripe.android.financialconnections.p041ui.sdui.ServerDrivenUiKt;
import com.stripe.android.financialconnections.p041ui.theme.FinancialConnectionsTheme;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeState;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModelKt;
import com.stripe.android.uicore.image.StripeImageKt;
import com.stripe.android.uicore.image.StripeImageLoader;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import p000.C25777lo;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u008d\u0001\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00000\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00000\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001aw\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00000\n2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00000\nH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001aG\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00000\nH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001aU\u0010\u001d\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00000\nH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u000f\u0010\u001f\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u001f\u0010\u0002\u001a9\u0010\"\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072\u0006\u0010!\u001a\u00020 2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00000\nH\u0003¢\u0006\u0004\b\"\u0010#\u001a\u001f\u0010'\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u000bH\u0003¢\u0006\u0004\b'\u0010(\u001a\u000f\u0010)\u001a\u00020\u0000H\u0001¢\u0006\u0004\b)\u0010\u0002\"\u0014\u0010+\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010,\"\u0014\u0010-\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010,¨\u0006."}, m28432d2 = {"", "PartnerAuthScreen", "(LEt0;I)V", "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;", TransferTable.COLUMN_STATE, "LGU2;", "modalBottomSheetState", "Lkotlin/Function0;", "onContinueClick", "onSelectAnotherBank", "Lkotlin/Function1;", "", "onClickableTextClick", "onEnterDetailsManually", "onCloseClick", "", "onCloseFromErrorClick", "onConfirmModalClick", "PartnerAuthScreenContent", "(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;LGU2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;LEt0;I)V", "PartnerAuthScreenMainContent", "(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V", "error", "ErrorContent", "(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V", "Ldp;", "authenticationStatus", "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$Payload;", "payload", "LoadedContent", "(Ldp;Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$Payload;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V", "BrowserLoadingContent", "Lcom/stripe/android/financialconnections/domain/OauthPrepane;", "content", "InstitutionalPrePaneContent", "(Lkotlin/jvm/functions/Function0;Lcom/stripe/android/financialconnections/domain/OauthPrepane;Lkotlin/jvm/functions/Function1;LEt0;I)V", "LgV2;", "modifier", "gifUrl", "GifWebView", "(LgV2;Ljava/lang/String;LEt0;I)V", "InstitutionalPrepaneContentPreview", "", "PHONE_BACKGROUND_WIDTH_DP", "I", "PHONE_BACKGROUND_HEIGHT_DP", "financial-connections_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPartnerAuthScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartnerAuthScreen.kt\ncom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt\n+ 2 MavericksComposeExtensions.kt\ncom/airbnb/mvrx/compose/MavericksComposeExtensionsKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 11 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 12 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,538:1\n119#2,4:539\n123#2,4:544\n57#2,12:548\n69#2,8:566\n79#2:577\n80#2,5:580\n53#2:586\n54#2,15:588\n69#2,8:609\n79#2:620\n80#2,5:626\n76#3:543\n76#3:585\n76#3:587\n76#3:656\n76#3:704\n76#3:732\n76#3:742\n76#3:778\n83#4,3:560\n50#4:578\n49#4:579\n83#4,3:603\n50#4:621\n49#4:622\n25#4:638\n460#4,13:668\n473#4,3:682\n460#4,13:716\n460#4,13:754\n460#4,13:790\n473#4,3:809\n473#4,3:817\n473#4,3:822\n1057#5,3:563\n1060#5,3:574\n1057#5,3:606\n1060#5,3:617\n1057#5,3:623\n1060#5,3:631\n1057#5,3:639\n1060#5,3:645\n1057#5,6:687\n474#6,4:634\n478#6,2:642\n482#6:648\n474#7:644\n154#8:649\n154#8:693\n154#8:694\n154#8:695\n154#8:696\n154#8:730\n154#8:731\n154#8:733\n154#8:734\n154#8:770\n154#8:804\n154#8:805\n154#8:806\n154#8:807\n154#8:808\n154#8:814\n154#8:816\n68#9,5:650\n73#9:681\n77#9:686\n67#9,6:771\n73#9:803\n77#9:813\n75#10:655\n76#10,11:657\n89#10:685\n75#10:703\n76#10,11:705\n75#10:741\n76#10,11:743\n75#10:777\n76#10,11:779\n89#10:812\n89#10:820\n89#10:825\n74#11,6:697\n80#11:729\n74#11,6:735\n80#11:767\n84#11:821\n84#11:826\n1864#12,2:768\n1866#12:815\n*S KotlinDebug\n*F\n+ 1 PartnerAuthScreen.kt\ncom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt\n*L\n98#1:539,4\n98#1:544,4\n98#1:548,12\n98#1:566,8\n98#1:577\n98#1:580,5\n104#1:586\n104#1:588,15\n104#1:609,8\n104#1:620\n104#1:626,5\n98#1:543\n101#1:585\n104#1:587\n289#1:656\n306#1:704\n323#1:732\n337#1:742\n347#1:778\n98#1:560,3\n98#1:578\n98#1:579\n104#1:603,3\n104#1:621\n104#1:622\n108#1:638\n289#1:668,13\n289#1:682,3\n306#1:716,13\n337#1:754,13\n347#1:790,13\n347#1:809,3\n337#1:817,3\n306#1:822,3\n98#1:563,3\n98#1:574,3\n104#1:606,3\n104#1:617,3\n104#1:623,3\n104#1:631,3\n108#1:639,3\n108#1:645,3\n302#1:687,6\n108#1:634,4\n108#1:642,2\n108#1:648\n108#1:644\n160#1:649\n310#1:693\n311#1:694\n312#1:695\n313#1:696\n318#1:730\n319#1:731\n327#1:733\n339#1:734\n351#1:770\n362#1:804\n363#1:805\n368#1:806\n369#1:807\n370#1:808\n389#1:814\n394#1:816\n289#1:650,5\n289#1:681\n289#1:686\n347#1:771,6\n347#1:803\n347#1:813\n289#1:655\n289#1:657,11\n289#1:685\n306#1:703\n306#1:705,11\n337#1:741\n337#1:743,11\n347#1:777\n347#1:779,11\n347#1:812\n337#1:820\n306#1:825\n306#1:697,6\n306#1:729\n337#1:735,6\n337#1:767\n337#1:821\n306#1:826\n344#1:768,2\n344#1:815\n*E\n"})
/* loaded from: classes7.dex */
public final class PartnerAuthScreenKt {
    private static final int PHONE_BACKGROUND_HEIGHT_DP = 264;
    private static final int PHONE_BACKGROUND_WIDTH_DP = 272;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BrowserLoadingContent(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1479685345);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1479685345, i, -1, "com.stripe.android.financialconnections.features.partnerauth.BrowserLoadingContent (PartnerAuthScreen.kt:287)");
            }
            InterfaceC41563gV2 m114257l = BB5.m114257l(InterfaceC41563gV2.f82354b0, 0.0f, 1, null);
            InterfaceC4360K9 m99141e = InterfaceC4360K9.f19170a.m99141e();
            mo89518u.mo89638F(733328855);
            InterfaceC51579xO2 m44729h = C39504d10.m44729h(m99141e, false, mo89518u, 6);
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
            mo89518u.mo89638F(179406553);
            K74.m99208b(null, FinancialConnectionsTheme.INSTANCE.getColors(mo89518u, 6).m116465getIconBrand0d7_KjU(), 0.0f, mo89518u, 0, 5);
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89563f();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PartnerAuthScreenKt$BrowserLoadingContent$2(i));
        }
    }

    public static final void ErrorContent(Throwable error, Function0<Unit> onSelectAnotherBank, Function0<Unit> onEnterDetailsManually, Function1<? super Throwable, Unit> onCloseFromErrorClick, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(onSelectAnotherBank, "onSelectAnotherBank");
        Intrinsics.checkNotNullParameter(onEnterDetailsManually, "onEnterDetailsManually");
        Intrinsics.checkNotNullParameter(onCloseFromErrorClick, "onCloseFromErrorClick");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(911963050);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(911963050, i, -1, "com.stripe.android.financialconnections.features.partnerauth.ErrorContent (PartnerAuthScreen.kt:227)");
        }
        if (error instanceof InstitutionPlannedDowntimeError) {
            mo89518u.mo89638F(1901750719);
            ErrorContentKt.InstitutionPlannedDowntimeErrorContent((InstitutionPlannedDowntimeError) error, onSelectAnotherBank, onEnterDetailsManually, mo89518u, (i & 112) | (i & 896));
            mo89518u.mo89605Q();
        } else if (error instanceof InstitutionUnplannedDowntimeError) {
            mo89518u.mo89638F(1901750964);
            ErrorContentKt.InstitutionUnplannedDowntimeErrorContent((InstitutionUnplannedDowntimeError) error, onSelectAnotherBank, onEnterDetailsManually, mo89518u, (i & 112) | (i & 896));
            mo89518u.mo89605Q();
        } else {
            mo89518u.mo89638F(1901751179);
            ErrorContentKt.UnclassifiedErrorContent(error, onCloseFromErrorClick, mo89518u, ((i >> 6) & 112) | 8);
            mo89518u.mo89605Q();
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PartnerAuthScreenKt$ErrorContent$1(error, onSelectAnotherBank, onEnterDetailsManually, onCloseFromErrorClick, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GifWebView(InterfaceC41563gV2 interfaceC41563gV2, String str, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int i3;
        int i4;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-371671729);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(interfaceC41563gV2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89539n(str)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-371671729, i2, -1, "com.stripe.android.financialconnections.features.partnerauth.GifWebView (PartnerAuthScreen.kt:428)");
            }
            C49679uA6.m10705a(C49679uA6.m10697i("<html><body><img style=\"width: 100%\" src=\"" + str + "\"></body></html>", null, mo89518u, 0, 2), interfaceC41563gV2, false, null, PartnerAuthScreenKt$GifWebView$1.INSTANCE, null, null, null, null, mo89518u, ((i2 << 3) & 112) | 24576, 492);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PartnerAuthScreenKt$GifWebView$2(interfaceC41563gV2, str, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    public static final void InstitutionalPrePaneContent(Function0<Unit> function0, OauthPrepane oauthPrepane, Function1<? super String, Unit> function1, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        float f;
        boolean z;
        InterfaceC41563gV2.C20912a c20912a;
        int i2;
        Map mapOf;
        int i3;
        GN5 m105174a;
        Map mapOf2;
        int lastIndex;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1093143944);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1093143944, i, -1, "com.stripe.android.financialconnections.features.partnerauth.InstitutionalPrePaneContent (PartnerAuthScreen.kt:296)");
        }
        boolean mo89539n = mo89518u.mo89539n(oauthPrepane.getTitle());
        Object mo89635G = mo89518u.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new TextResource.Text(ServerDrivenUiKt.fromHtml(oauthPrepane.getTitle()));
            mo89518u.mo89503z(mo89635G);
        }
        TextResource.Text text = (TextResource.Text) mo89635G;
        C37135Xp5 m80790a = C36433Up5.m80790a(0, mo89518u, 0, 1);
        InterfaceC41563gV2.C20912a c20912a2 = InterfaceC41563gV2.f82354b0;
        float f2 = 16;
        float f3 = 24;
        InterfaceC41563gV2 m94181l = ND3.m94181l(BB5.m114257l(c20912a2, 0.0f, 1, null), C43705k61.m29303g(f3), C43705k61.m29303g(f2), C43705k61.m29303g(f3), C43705k61.m29303g(f3));
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
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m94181l);
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
        mo89518u.mo89638F(-1227504814);
        Image institutionIcon = oauthPrepane.getInstitutionIcon();
        String str = institutionIcon != null ? institutionIcon.getDefault() : null;
        mo89518u.mo89638F(1987189260);
        if (str == null) {
            i2 = 6;
            f = f2;
            c20912a = c20912a2;
            z = false;
        } else {
            InterfaceC41563gV2 m88106a = C35447Qk0.m88106a(BB5.m114246w(c20912a2, C43705k61.m29303g(36)), C39242cc5.m61172d(C43705k61.m29303g(6)));
            f = f2;
            z = false;
            StripeImageKt.StripeImage(str, (StripeImageLoader) mo89518u.mo89572c(FinancialConnectionsSheetNativeActivityKt.getLocalImageLoader()), null, m88106a, null, null, null, C43575jt0.m29791b(mo89518u, -1901002709, true, new PartnerAuthScreenKt$InstitutionalPrePaneContent$1$1$1(m88106a)), null, mo89518u, (StripeImageLoader.$stable << 3) | 12583296, 368);
            c20912a = c20912a2;
            i2 = 6;
            DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(f)), mo89518u, 6);
            Unit unit = Unit.INSTANCE;
        }
        mo89518u.mo89605Q();
        PartnerAuthScreenKt$InstitutionalPrePaneContent$1$2 partnerAuthScreenKt$InstitutionalPrePaneContent$1$2 = PartnerAuthScreenKt$InstitutionalPrePaneContent$1$2.INSTANCE;
        FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
        G26 subtitle = financialConnectionsTheme.getTypography(mo89518u, i2).getSubtitle();
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(StringAnnotation.BOLD, financialConnectionsTheme.getTypography(mo89518u, i2).getSubtitleEmphasized().m105925L()));
        TextKt.AnnotatedText(text, partnerAuthScreenKt$InstitutionalPrePaneContent$1$2, subtitle, null, mapOf, mo89518u, 56, 8);
        InterfaceC41563gV2 m80787d = C36433Up5.m80787d(InterfaceC35231Pm0.m89798b(c35465Qm0, ND3.m94180m(c20912a, 0.0f, C43705k61.m29303g(f), 0.0f, C43705k61.m29303g(f), 5, null), 1.0f, false, 2, null), m80790a, false, null, false, 14, null);
        mo89518u.mo89638F(-483455358);
        InterfaceC51579xO2 m91546a2 = C34997Om0.m91546a(c25777lo.m26802g(), c4361a.m99136j(), mo89518u, z ? 1 : 0);
        int i4 = -1323940314;
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
        if (mo89518u.mo89521t()) {
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
        m115273a2.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, Integer.valueOf(z ? 1 : 0));
        int i5 = 2058660585;
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-1163856341);
        mo89518u.mo89638F(-1881995236);
        mo89518u.mo89638F(1320298591);
        int i6 = z ? 1 : 0;
        ?? r0 = z;
        for (Object obj : oauthPrepane.getBody().getEntries()) {
            int i7 = i6 + 1;
            if (i6 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Entry entry = (Entry) obj;
            if (entry instanceof Entry.Image) {
                mo89518u.mo89638F(-1541994132);
                InterfaceC41563gV2.C20912a c20912a3 = InterfaceC41563gV2.f82354b0;
                InterfaceC41563gV2 m62125c = C13342bw.m62125c(BB5.m114255n(c20912a3, 0.0f, 1, null), FinancialConnectionsTheme.INSTANCE.getColors(mo89518u, i2).m116460getBackgroundContainer0d7_KjU(), C39242cc5.m61172d(C43705k61.m29303g(8)));
                mo89518u.mo89638F(733328855);
                InterfaceC4360K9.C4361a c4361a2 = InterfaceC4360K9.f19170a;
                InterfaceC51579xO2 m44729h = C39504d10.m44729h(c4361a2.m99132n(), r0, mo89518u, r0);
                mo89518u.mo89638F(i4);
                InterfaceC41273g01 interfaceC41273g013 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm23 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq63 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                InterfaceC32018Bt0.C0757a c0757a2 = InterfaceC32018Bt0.f2995M;
                Function0<InterfaceC32018Bt0> m113415a3 = c0757a2.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a3 = C31723Am2.m115273a(m62125c);
                if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                    C52468yt0.m2335c();
                }
                mo89518u.mo89557h();
                if (mo89518u.mo89521t()) {
                    mo89518u.mo89617M(m113415a3);
                } else {
                    mo89518u.mo89566e();
                }
                mo89518u.mo89620L();
                InterfaceC32720Et0 m64192a3 = C38680bf6.m64192a(mo89518u);
                C38680bf6.m64191b(m64192a3, m44729h, c0757a2.m113412d());
                C38680bf6.m64191b(m64192a3, interfaceC41273g013, c0757a2.m113414b());
                C38680bf6.m64191b(m64192a3, enumC47065pm23, c0757a2.m113413c());
                C38680bf6.m64191b(m64192a3, interfaceC33869Jq63, c0757a2.m113410f());
                mo89518u.mo89530q();
                m115273a3.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, Integer.valueOf((int) r0));
                mo89518u.mo89638F(i5);
                mo89518u.mo89638F(-2137368960);
                C40689f10 c40689f10 = C40689f10.f79291a;
                mo89518u.mo89638F(-83274523);
                AbstractC45562nE3 m19793d = C46748pE3.m19793d(C18634R.C18635drawable.stripe_prepane_phone_bg, mo89518u, r0);
                BA0 m114317a = BA0.f1929a.m114317a();
                InterfaceC41563gV2 mo35388c = c40689f10.mo35388c(c20912a3, c4361a2.m99141e());
                float f4 = (float) PHONE_BACKGROUND_HEIGHT_DP;
                InterfaceC41563gV2 m114273A = BB5.m114273A(mo35388c, C43705k61.m29303g(f4));
                float f5 = (float) PHONE_BACKGROUND_WIDTH_DP;
                i3 = i6;
                C51659xX1.m5069a(m19793d, "Test", BB5.m114254o(m114273A, C43705k61.m29303g(f5)), null, m114317a, 0.0f, null, mo89518u, 24632, 104);
                InterfaceC41563gV2 m94182k = ND3.m94182k(BB5.m114254o(BB5.m114273A(c40689f10.mo35388c(c20912a3, c4361a2.m99141e()), C43705k61.m29303g(f4)), C43705k61.m29303g(f5)), C43705k61.m29303g(f), 0.0f, 2, null);
                String str2 = ((Entry.Image) entry).getContent().getDefault();
                Intrinsics.checkNotNull(str2);
                GifWebView(m94182k, str2, mo89518u, 0);
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                mo89518u.mo89563f();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
            } else {
                i3 = i6;
                if (entry instanceof Entry.Text) {
                    mo89518u.mo89638F(-1541992635);
                    TextResource.Text text2 = new TextResource.Text(ServerDrivenUiKt.fromHtml(((Entry.Text) entry).getContent()));
                    FinancialConnectionsTheme financialConnectionsTheme2 = FinancialConnectionsTheme.INSTANCE;
                    G26 body = financialConnectionsTheme2.getTypography(mo89518u, 6).getBody();
                    StringAnnotation stringAnnotation = StringAnnotation.CLICKABLE;
                    m105174a = r35.m105174a((r35 & 1) != 0 ? r35.m105168g() : financialConnectionsTheme2.getColors(mo89518u, 6).m116469getTextBrand0d7_KjU(), (r35 & 2) != 0 ? r35.f11830b : 0L, (r35 & 4) != 0 ? r35.f11831c : null, (r35 & 8) != 0 ? r35.f11832d : null, (r35 & 16) != 0 ? r35.f11833e : null, (r35 & 32) != 0 ? r35.f11834f : null, (r35 & 64) != 0 ? r35.f11835g : null, (r35 & 128) != 0 ? r35.f11836h : 0L, (r35 & 256) != 0 ? r35.f11837i : null, (r35 & 512) != 0 ? r35.f11838j : null, (r35 & 1024) != 0 ? r35.f11839k : null, (r35 & 2048) != 0 ? r35.f11840l : 0L, (r35 & 4096) != 0 ? r35.f11841m : null, (r35 & 8192) != 0 ? financialConnectionsTheme2.getTypography(mo89518u, 6).getBodyEmphasized().m105925L().f11842n : null);
                    mapOf2 = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(StringAnnotation.BOLD, financialConnectionsTheme2.getTypography(mo89518u, 6).getBodyEmphasized().m105925L()), TuplesKt.m28425to(stringAnnotation, m105174a));
                    TextKt.AnnotatedText(text2, function1, body, null, mapOf2, mo89518u, ((i >> 3) & 112) | 8, 8);
                    mo89518u.mo89605Q();
                } else {
                    mo89518u.mo89638F(-1541991909);
                    mo89518u.mo89605Q();
                }
            }
            lastIndex = CollectionsKt__CollectionsKt.getLastIndex(oauthPrepane.getBody().getEntries());
            if (i3 != lastIndex) {
                DN5.m110552a(BB5.m114246w(InterfaceC41563gV2.f82354b0, C43705k61.m29303g(f)), mo89518u, 6);
            }
            i6 = i7;
            r0 = 0;
            i5 = 2058660585;
            i2 = 6;
            i4 = -1323940314;
        }
        mo89518u.mo89605Q();
        InterfaceC41563gV2.C20912a c20912a4 = InterfaceC41563gV2.f82354b0;
        C39504d10.m44736a(InterfaceC35231Pm0.m89798b(c35465Qm0, c20912a4, 1.0f, false, 2, null), mo89518u, 0);
        PartnerNotice partnerNotice = oauthPrepane.getPartnerNotice();
        mo89518u.mo89638F(1987192904);
        if (partnerNotice != null) {
            DN5.m110552a(BB5.m114246w(c20912a4, C43705k61.m29303g(f)), mo89518u, 6);
            PartnerCalloutKt.PartnerCallout(null, oauthPrepane.getPartnerNotice(), function1, mo89518u, i & 896, 1);
            Unit unit2 = Unit.INSTANCE;
        }
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        ButtonKt.FinancialConnectionsButton(function0, BB5.m114255n(c20912a4, 0.0f, 1, null), null, null, false, false, C43575jt0.m29791b(mo89518u, -225021607, true, new PartnerAuthScreenKt$InstitutionalPrePaneContent$1$4(oauthPrepane)), mo89518u, (i & 14) | 1572912, 60);
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
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new PartnerAuthScreenKt$InstitutionalPrePaneContent$2(function0, oauthPrepane, function1, i));
    }

    public static final void InstitutionalPrepaneContentPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(734645841);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(734645841, i, -1, "com.stripe.android.financialconnections.features.partnerauth.InstitutionalPrepaneContentPreview (PartnerAuthScreen.kt:452)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, ComposableSingletons$PartnerAuthScreenKt.INSTANCE.m116408getLambda2$financial_connections_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PartnerAuthScreenKt$InstitutionalPrepaneContentPreview$1(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadedContent(AbstractC19862dp<String> abstractC19862dp, PartnerAuthState.Payload payload, Function0<Unit> function0, Function0<Unit> function02, Function1<? super String, Unit> function1, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(78753775);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(78753775, i, -1, "com.stripe.android.financialconnections.features.partnerauth.LoadedContent (PartnerAuthScreen.kt:251)");
        }
        if (abstractC19862dp instanceof C34454Md6) {
            mo89518u.mo89638F(951188274);
            boolean isOAuth = payload.getAuthSession().isOAuth();
            if (isOAuth) {
                mo89518u.mo89638F(951188331);
                Display display = payload.getAuthSession().getDisplay();
                Intrinsics.checkNotNull(display);
                int i2 = i >> 6;
                InstitutionalPrePaneContent(function0, display.getText().getOauthPrepane(), function1, mo89518u, (i2 & 896) | (i2 & 14) | 64);
                mo89518u.mo89605Q();
            } else if (!isOAuth) {
                mo89518u.mo89638F(951188583);
                LoadingContentKt.LoadingContent(null, C40946fS5.m41310c(C18634R.string.stripe_partnerauth_loading_title, mo89518u, 0), C40946fS5.m41310c(C18634R.string.stripe_partnerauth_loading_desc, mo89518u, 0), mo89518u, 0, 1);
                mo89518u.mo89605Q();
            } else {
                mo89518u.mo89638F(951188798);
                mo89518u.mo89605Q();
            }
            mo89518u.mo89605Q();
        } else if (abstractC19862dp instanceof C31786At2) {
            mo89518u.mo89638F(951188822);
            BrowserLoadingContent(mo89518u, 0);
            mo89518u.mo89605Q();
        } else if (abstractC19862dp instanceof C51034wT5) {
            mo89518u.mo89638F(951188869);
            LoadingContentKt.LoadingContent(null, C40946fS5.m41310c(C18634R.string.stripe_account_picker_loading_title, mo89518u, 0), C40946fS5.m41310c(C18634R.string.stripe_account_picker_loading_desc, mo89518u, 0), mo89518u, 0, 1);
            mo89518u.mo89605Q();
        } else if (abstractC19862dp instanceof C32163Cj1) {
            mo89518u.mo89638F(951189079);
            ErrorContentKt.InstitutionUnknownErrorContent(function02, mo89518u, (i >> 9) & 14);
            mo89518u.mo89605Q();
        } else {
            mo89518u.mo89638F(951189238);
            mo89518u.mo89605Q();
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PartnerAuthScreenKt$LoadedContent$1(abstractC19862dp, payload, function0, function02, function1, i));
        }
    }

    public static final void PartnerAuthScreen(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Fragment fragment;
        Fragment fragment2;
        Object obj;
        Object obj2;
        InterfaceC37154Xr6 interfaceC37154Xr6;
        InterfaceC35200Pi5 interfaceC35200Pi5;
        Fragment fragment3;
        Object obj3;
        Object obj4;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1213481672);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1213481672, i, -1, "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthScreen (PartnerAuthScreen.kt:95)");
            }
            mo89518u.mo89638F(403151030);
            ComponentActivity m12477f = C49199tN2.m12477f((Context) mo89518u.mo89572c(C11411h.m68324g()));
            if (m12477f != null) {
                mo89518u.mo89638F(512170640);
                ComponentActivity m12477f2 = C49199tN2.m12477f((Context) mo89518u.mo89572c(C11411h.m68324g()));
                if (m12477f2 != null) {
                    C11966a savedStateRegistry = m12477f.getSavedStateRegistry();
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FinancialConnectionsSheetNativeViewModel.class);
                    View view = (View) mo89518u.mo89572c(C11411h.m68320k());
                    Object[] objArr = {m12477f, m12477f2, m12477f, savedStateRegistry};
                    mo89518u.mo89638F(-568225417);
                    boolean z = false;
                    for (int i2 = 0; i2 < 4; i2++) {
                        z |= mo89518u.mo89539n(objArr[i2]);
                    }
                    Object mo89635G = mo89518u.mo89635G();
                    if (z || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                        if (m12477f instanceof Fragment) {
                            fragment = (Fragment) m12477f;
                        } else {
                            fragment = null;
                        }
                        if (fragment == null) {
                            fragment2 = C49199tN2.m12476g(view);
                        } else {
                            fragment2 = fragment;
                        }
                        if (fragment2 != null) {
                            Bundle arguments = fragment2.getArguments();
                            if (arguments != null) {
                                obj2 = arguments.get("mavericks:arg");
                            } else {
                                obj2 = null;
                            }
                            mo89635G = new C33000Fy1(m12477f2, obj2, fragment2, null, null, 24, null);
                        } else {
                            Bundle extras = m12477f2.getIntent().getExtras();
                            if (extras != null) {
                                obj = extras.get("mavericks:arg");
                            } else {
                                obj = null;
                            }
                            mo89635G = new C27850r6(m12477f2, obj, m12477f, savedStateRegistry);
                        }
                        mo89518u.mo89503z(mo89635G);
                    }
                    mo89518u.mo89605Q();
                    AbstractC35282Pr6 abstractC35282Pr6 = (AbstractC35282Pr6) mo89635G;
                    mo89518u.mo89638F(511388516);
                    boolean mo89539n = mo89518u.mo89539n(orCreateKotlinClass) | mo89518u.mo89539n(abstractC35282Pr6);
                    Object mo89635G2 = mo89518u.mo89635G();
                    if (mo89539n || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
                        YN2 yn2 = YN2.f45797a;
                        Class javaClass = JvmClassMappingKt.getJavaClass(orCreateKotlinClass);
                        String name = JvmClassMappingKt.getJavaClass(orCreateKotlinClass).getName();
                        Intrinsics.checkNotNullExpressionValue(name, "keyFactory?.invoke() ?: viewModelClass.java.name");
                        mo89635G2 = YN2.m75139c(yn2, javaClass, FinancialConnectionsSheetNativeState.class, abstractC35282Pr6, name, false, null, 48, null);
                        mo89518u.mo89503z(mo89635G2);
                    }
                    mo89518u.mo89605Q();
                    mo89518u.mo89605Q();
                    mo89518u.mo89605Q();
                    FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel = (FinancialConnectionsSheetNativeViewModel) ((RN2) mo89635G2);
                    FinancialConnectionsSheetNativeViewModel parentViewModel = FinancialConnectionsSheetNativeViewModelKt.parentViewModel(mo89518u, 0);
                    InterfaceC48627sP5 m12480c = C49199tN2.m12480c(financialConnectionsSheetNativeViewModel, null, PartnerAuthScreenKt$PartnerAuthScreen$webAuthFlow$1.INSTANCE, mo89518u, 392, 1);
                    InterfaceC32366Df6 interfaceC32366Df6 = (InterfaceC32366Df6) mo89518u.mo89572c(C42399hu0.m35603p());
                    mo89518u.mo89638F(512170640);
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) mo89518u.mo89572c(C11411h.m68322i());
                    ComponentActivity m12477f3 = C49199tN2.m12477f((Context) mo89518u.mo89572c(C11411h.m68324g()));
                    if (m12477f3 != null) {
                        if (lifecycleOwner instanceof InterfaceC37154Xr6) {
                            interfaceC37154Xr6 = (InterfaceC37154Xr6) lifecycleOwner;
                        } else {
                            interfaceC37154Xr6 = null;
                        }
                        if (interfaceC37154Xr6 != null) {
                            if (lifecycleOwner instanceof InterfaceC35200Pi5) {
                                interfaceC35200Pi5 = (InterfaceC35200Pi5) lifecycleOwner;
                            } else {
                                interfaceC35200Pi5 = null;
                            }
                            if (interfaceC35200Pi5 != null) {
                                C11966a savedStateRegistry2 = interfaceC35200Pi5.getSavedStateRegistry();
                                KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(PartnerAuthViewModel.class);
                                View view2 = (View) mo89518u.mo89572c(C11411h.m68320k());
                                Object[] objArr2 = {lifecycleOwner, m12477f3, interfaceC37154Xr6, savedStateRegistry2};
                                mo89518u.mo89638F(-568225417);
                                boolean z2 = false;
                                for (int i3 = 0; i3 < 4; i3++) {
                                    z2 |= mo89518u.mo89539n(objArr2[i3]);
                                }
                                C27850r6 mo89635G3 = mo89518u.mo89635G();
                                if (z2 || mo89635G3 == InterfaceC32720Et0.f8257a.m108267a()) {
                                    if (lifecycleOwner instanceof Fragment) {
                                        fragment3 = (Fragment) lifecycleOwner;
                                    } else {
                                        fragment3 = null;
                                    }
                                    if (fragment3 == null) {
                                        fragment3 = C49199tN2.m12476g(view2);
                                    }
                                    Fragment fragment4 = fragment3;
                                    if (fragment4 != null) {
                                        Bundle arguments2 = fragment4.getArguments();
                                        if (arguments2 != null) {
                                            obj4 = arguments2.get("mavericks:arg");
                                        } else {
                                            obj4 = null;
                                        }
                                        mo89635G3 = new C33000Fy1(m12477f3, obj4, fragment4, null, null, 24, null);
                                    } else {
                                        Bundle extras2 = m12477f3.getIntent().getExtras();
                                        if (extras2 != null) {
                                            obj3 = extras2.get("mavericks:arg");
                                        } else {
                                            obj3 = null;
                                        }
                                        mo89635G3 = new C27850r6(m12477f3, obj3, interfaceC37154Xr6, savedStateRegistry2);
                                    }
                                    mo89518u.mo89503z(mo89635G3);
                                }
                                mo89518u.mo89605Q();
                                AbstractC35282Pr6 abstractC35282Pr62 = (AbstractC35282Pr6) mo89635G3;
                                mo89518u.mo89638F(511388516);
                                boolean mo89539n2 = mo89518u.mo89539n(orCreateKotlinClass2) | mo89518u.mo89539n(abstractC35282Pr62);
                                Object mo89635G4 = mo89518u.mo89635G();
                                if (mo89539n2 || mo89635G4 == InterfaceC32720Et0.f8257a.m108267a()) {
                                    YN2 yn22 = YN2.f45797a;
                                    Class javaClass2 = JvmClassMappingKt.getJavaClass(orCreateKotlinClass2);
                                    String name2 = JvmClassMappingKt.getJavaClass(orCreateKotlinClass2).getName();
                                    Intrinsics.checkNotNullExpressionValue(name2, "keyFactory?.invoke() ?: viewModelClass.java.name");
                                    mo89635G4 = YN2.m75139c(yn22, javaClass2, PartnerAuthState.class, abstractC35282Pr62, name2, false, null, 48, null);
                                    mo89518u.mo89503z(mo89635G4);
                                }
                                mo89518u.mo89605Q();
                                mo89518u.mo89605Q();
                                PartnerAuthViewModel partnerAuthViewModel = (PartnerAuthViewModel) ((RN2) mo89635G4);
                                InterfaceC48627sP5 m12481b = C49199tN2.m12481b(partnerAuthViewModel, mo89518u, 8);
                                mo89518u.mo89638F(773894976);
                                mo89518u.mo89638F(-492369756);
                                Object mo89635G5 = mo89518u.mo89635G();
                                if (mo89635G5 == InterfaceC32720Et0.f8257a.m108267a()) {
                                    C42992iu0 c42992iu0 = new C42992iu0(Y91.m75529j(EmptyCoroutineContext.INSTANCE, mo89518u));
                                    mo89518u.mo89503z(c42992iu0);
                                    mo89635G5 = c42992iu0;
                                }
                                mo89518u.mo89605Q();
                                ZC0 m31665a = ((C42992iu0) mo89635G5).m31665a();
                                mo89518u.mo89605Q();
                                GU2 m107098p = FU2.m107098p(HU2.Hidden, null, true, null, mo89518u, 390, 10);
                                PartnerAuthState.ViewEffect viewEffect = ((PartnerAuthState) m12481b.getValue()).getViewEffect();
                                mo89518u.mo89638F(-652880520);
                                if (viewEffect != null) {
                                    Y91.m75533f(viewEffect, new PartnerAuthScreenKt$PartnerAuthScreen$1$1(viewEffect, m107098p, interfaceC32366Df6, financialConnectionsSheetNativeViewModel, partnerAuthViewModel, null), mo89518u, 64);
                                    Unit unit = Unit.INSTANCE;
                                }
                                mo89518u.mo89605Q();
                                Y91.m75533f(m12480c.getValue(), new PartnerAuthScreenKt$PartnerAuthScreen$2(partnerAuthViewModel, m12480c, null), mo89518u, 72);
                                PartnerAuthScreenContent((PartnerAuthState) m12481b.getValue(), m107098p, new PartnerAuthScreenKt$PartnerAuthScreen$3(partnerAuthViewModel), new PartnerAuthScreenKt$PartnerAuthScreen$4(partnerAuthViewModel), new PartnerAuthScreenKt$PartnerAuthScreen$6(partnerAuthViewModel), new PartnerAuthScreenKt$PartnerAuthScreen$5(partnerAuthViewModel), new PartnerAuthScreenKt$PartnerAuthScreen$8(parentViewModel), new PartnerAuthScreenKt$PartnerAuthScreen$7(parentViewModel), new PartnerAuthScreenKt$PartnerAuthScreen$9(m31665a, m107098p), mo89518u, 8);
                                if (C35528Qt0.m87827O()) {
                                    C35528Qt0.m87817Y();
                                }
                            } else {
                                throw new IllegalStateException("LifecycleOwner must be a SavedStateRegistryOwner!".toString());
                            }
                        } else {
                            throw new IllegalStateException("LifecycleOwner must be a ViewModelStoreOwner!".toString());
                        }
                    } else {
                        throw new IllegalStateException("Composable is not hosted in a ComponentActivity!".toString());
                    }
                } else {
                    throw new IllegalStateException("Composable is not hosted in a ComponentActivity!".toString());
                }
            } else {
                throw new IllegalStateException("LocalContext is not a ComponentActivity!".toString());
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PartnerAuthScreenKt$PartnerAuthScreen$10(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PartnerAuthScreenContent(PartnerAuthState partnerAuthState, GU2 gu2, Function0<Unit> function0, Function0<Unit> function02, Function1<? super String, Unit> function1, Function0<Unit> function03, Function0<Unit> function04, Function1<? super Throwable, Unit> function12, Function0<Unit> function05, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1328182848);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1328182848, i, -1, "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthScreenContent (PartnerAuthScreen.kt:145)");
        }
        FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
        long m116461getBackgroundSurface0d7_KjU = financialConnectionsTheme.getColors(mo89518u, 6).m116461getBackgroundSurface0d7_KjU();
        FU2.m107111c(C43575jt0.m29791b(mo89518u, -800417298, true, new PartnerAuthScreenKt$PartnerAuthScreenContent$1(partnerAuthState, function1, function05, i)), null, gu2, C39242cc5.m61172d(C43705k61.m29303g(8)), 0.0f, m116461getBackgroundSurface0d7_KjU, 0L, C47063pm0.m18743m(financialConnectionsTheme.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), C43575jt0.m29791b(mo89518u, 140181606, true, new PartnerAuthScreenKt$PartnerAuthScreenContent$2(partnerAuthState, function04, function02, function03, function12, function0, function1, i)), mo89518u, ((i << 3) & 896) | 100663302, 82);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PartnerAuthScreenKt$PartnerAuthScreenContent$3(partnerAuthState, gu2, function0, function02, function1, function03, function04, function12, function05, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PartnerAuthScreenMainContent(PartnerAuthState partnerAuthState, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function1<? super Throwable, Unit> function1, Function0<Unit> function04, Function1<? super String, Unit> function12, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(143114063);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(143114063, i, -1, "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthScreenMainContent (PartnerAuthScreen.kt:185)");
        }
        ScaffoldKt.FinancialConnectionsScaffold(C43575jt0.m29791b(mo89518u, 418406334, true, new PartnerAuthScreenKt$PartnerAuthScreenMainContent$1(partnerAuthState, function0, i)), C43575jt0.m29791b(mo89518u, -1372492670, true, new PartnerAuthScreenKt$PartnerAuthScreenMainContent$2(partnerAuthState, function02, function03, function1, i, function04, function12)), mo89518u, 54);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PartnerAuthScreenKt$PartnerAuthScreenMainContent$3(partnerAuthState, function0, function02, function03, function1, function04, function12, i));
        }
    }
}
