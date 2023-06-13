package com.stripe.android.financialconnections.features.common;

import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.financialconnections.C18634R;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.p041ui.CompositionLocalKt;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.financialconnections.p041ui.TextResource;
import com.stripe.android.financialconnections.p041ui.components.StringAnnotation;
import com.stripe.android.financialconnections.p041ui.components.TextKt;
import com.stripe.android.financialconnections.p041ui.theme.FinancialConnectionsTheme;
import com.stripe.android.uicore.image.StripeImageKt;
import com.stripe.android.uicore.image.StripeImageLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt__CharKt;
import net.danlew.android.joda.DateUtils;
import p000.C25777lo;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a;\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0014\u0010\u0006\u001a(\u0010\u0019\u001a\u00020\u00032\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u0015¢\u0006\u0002\b\u0017H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001d\u0010\u001d\u001a\u00020\u000e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\tH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0018\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\t*\b\u0012\u0004\u0012\u00020\u001f0\tH\u0002\u001a\u000f\u0010!\u001a\u00020\u0003H\u0001¢\u0006\u0004\b!\u0010\"\u001a\u000f\u0010#\u001a\u00020\u0003H\u0001¢\u0006\u0004\b#\u0010\"\u001a\u000f\u0010$\u001a\u00020\u0003H\u0001¢\u0006\u0004\b$\u0010\"\u001a\u000f\u0010%\u001a\u00020\u0003H\u0001¢\u0006\u0004\b%\u0010\"\u001a\u000f\u0010&\u001a\u00020\u0003H\u0001¢\u0006\u0004\b&\u0010\"\u001a\u000f\u0010'\u001a\u00020\u0003H\u0001¢\u0006\u0004\b'\u0010\"\u001a\u0015\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0003¢\u0006\u0004\b(\u0010)\"\u0014\u0010*\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;", RequestHeadersFactory.MODEL, "Lkotlin/Function0;", "", "onLearnMoreClick", "AccessibleDataCallout", "(Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;Lkotlin/jvm/functions/Function0;LEt0;I)V", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "institution", "", "Lcom/stripe/android/financialconnections/model/PartnerAccount;", "accounts", "AccessibleDataCalloutWithAccounts", "(Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/util/List;Lkotlin/jvm/functions/Function0;LEt0;I)V", "", Entry.TYPE_TEXT, "subText", "iconUrl", "AccountRow", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LEt0;II)V", "AccessibleDataText", "Lkotlin/Function1;", "Le10;", "Lkotlin/ExtensionFunctionType;", "content", "AccessibleDataCalloutBox", "(Lkotlin/jvm/functions/Function3;LEt0;I)V", "", "permissionsReadable", "readableListOfPermissions", "(Ljava/util/List;LEt0;I)Ljava/lang/String;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;", "toStringRes", "AccessibleDataCalloutPreview", "(LEt0;I)V", "AccessibleDataCalloutWithManyAccountsPreview", "AccessibleDataCalloutStripeDirectPreview", "AccessibleDataCalloutNetworkingPreview", "AccessibleDataCalloutWithMultipleAccountsPreview", "AccessibleDataCalloutWithOneAccountPreview", "partnerAccountsForPreview", "(LEt0;I)Ljava/util/List;", "COLLAPSE_ACCOUNTS_THRESHOLD", "I", "financial-connections_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAccessibleDataCallout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccessibleDataCallout.kt\ncom/stripe/android/financialconnections/features/common/AccessibleDataCalloutKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,526:1\n79#2,2:527\n81#2:555\n74#2,7:557\n81#2:590\n85#2:598\n85#2:603\n75#3:529\n76#3,11:531\n75#3:564\n76#3,11:566\n89#3:597\n89#3:602\n75#3:620\n76#3,11:622\n89#3:650\n76#4:530\n76#4:565\n76#4:593\n76#4:604\n76#4:621\n460#5,13:542\n460#5,13:577\n473#5,3:594\n473#5,3:599\n36#5:605\n460#5,13:633\n473#5,3:647\n154#6:556\n154#6:591\n154#6:592\n154#6:612\n154#6:613\n1057#7,6:606\n67#8,6:614\n73#8:646\n77#8:651\n1549#9:652\n1620#9,3:653\n1804#9,4:656\n1603#9,9:660\n1855#9:669\n1856#9:671\n1612#9:672\n1#10:670\n*S KotlinDebug\n*F\n+ 1 AccessibleDataCallout.kt\ncom/stripe/android/financialconnections/features/common/AccessibleDataCalloutKt\n*L\n100#1:527,2\n100#1:555\n105#1:557,7\n105#1:590\n105#1:598\n100#1:603\n100#1:529\n100#1:531,11\n105#1:564\n105#1:566,11\n105#1:597\n100#1:602\n184#1:620\n184#1:622,11\n184#1:650\n100#1:530\n105#1:565\n114#1:593\n140#1:604\n184#1:621\n100#1:542,13\n105#1:577,13\n105#1:594,3\n100#1:599,3\n141#1:605\n184#1:633,13\n184#1:647,3\n107#1:556\n110#1:591\n111#1:592\n187#1:612\n189#1:613\n141#1:606,6\n184#1:614,6\n184#1:646\n184#1:651\n198#1:652\n198#1:653,3\n199#1:656,4\n210#1:660,9\n210#1:669\n210#1:671\n210#1:672\n210#1:670\n*E\n"})
/* loaded from: classes7.dex */
public final class AccessibleDataCalloutKt {
    private static final int COLLAPSE_ACCOUNTS_THRESHOLD = 5;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FinancialConnectionsAccount.Permissions.values().length];
            try {
                iArr[FinancialConnectionsAccount.Permissions.BALANCES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FinancialConnectionsAccount.Permissions.OWNERSHIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FinancialConnectionsAccount.Permissions.PAYMENT_METHOD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FinancialConnectionsAccount.Permissions.ACCOUNT_NUMBERS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FinancialConnectionsAccount.Permissions.TRANSACTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FinancialConnectionsAccount.Permissions.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void AccessibleDataCallout(AccessibleDataCalloutModel model, Function0<Unit> onLearnMoreClick, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(onLearnMoreClick, "onLearnMoreClick");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1677298152);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1677298152, i, -1, "com.stripe.android.financialconnections.features.common.AccessibleDataCallout (AccessibleDataCallout.kt:45)");
        }
        AccessibleDataCalloutBox(C43575jt0.m29791b(mo89518u, 1459459175, true, new AccessibleDataCalloutKt$AccessibleDataCallout$1(model, onLearnMoreClick, i)), mo89518u, 6);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new AccessibleDataCalloutKt$AccessibleDataCallout$2(model, onLearnMoreClick, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AccessibleDataCalloutBox(Function3<? super InterfaceC40096e10, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1716518631);
        if ((i & 14) == 0) {
            i2 = (mo89518u.mo89539n(function3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1716518631, i2, -1, "com.stripe.android.financialconnections.features.common.AccessibleDataCalloutBox (AccessibleDataCallout.kt:180)");
            }
            InterfaceC41563gV2 m94184i = ND3.m94184i(C13342bw.m62124d(C35447Qk0.m88106a(BB5.m114255n(InterfaceC41563gV2.f82354b0, 0.0f, 1, null), C39242cc5.m61172d(C43705k61.m29303g(8))), FinancialConnectionsTheme.INSTANCE.getColors(mo89518u, 6).m116460getBackgroundContainer0d7_KjU(), null, 2, null), C43705k61.m29303g(12));
            int i3 = (i2 << 9) & 7168;
            mo89518u.mo89638F(733328855);
            int i4 = i3 >> 3;
            InterfaceC51579xO2 m44729h = C39504d10.m44729h(InterfaceC4360K9.f19170a.m99132n(), false, mo89518u, (i4 & 112) | (i4 & 14));
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m94184i);
            int i5 = ((((i3 << 3) & 112) << 9) & 7168) | 6;
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
            m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, Integer.valueOf((i5 >> 3) & 112));
            mo89518u.mo89638F(2058660585);
            mo89518u.mo89638F(-2137368960);
            if (((i5 >> 9) & 14 & 11) == 2 && mo89518u.mo89575b()) {
                mo89518u.mo89548k();
            } else {
                function3.invoke(C40689f10.f79291a, mo89518u, Integer.valueOf(((i3 >> 6) & 112) | 6));
            }
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
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new AccessibleDataCalloutKt$AccessibleDataCalloutBox$1(function3, i));
    }

    public static final void AccessibleDataCalloutNetworkingPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(2010293629);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(2010293629, i, -1, "com.stripe.android.financialconnections.features.common.AccessibleDataCalloutNetworkingPreview (AccessibleDataCallout.kt:335)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, ComposableSingletons$AccessibleDataCalloutKt.INSTANCE.m116361getLambda4$financial_connections_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new AccessibleDataCalloutKt$AccessibleDataCalloutNetworkingPreview$1(i));
        }
    }

    public static final void AccessibleDataCalloutPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1525703825);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1525703825, i, -1, "com.stripe.android.financialconnections.features.common.AccessibleDataCalloutPreview (AccessibleDataCallout.kt:243)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, ComposableSingletons$AccessibleDataCalloutKt.INSTANCE.m116358getLambda1$financial_connections_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new AccessibleDataCalloutKt$AccessibleDataCalloutPreview$1(i));
        }
    }

    public static final void AccessibleDataCalloutStripeDirectPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1164163045);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1164163045, i, -1, "com.stripe.android.financialconnections.features.common.AccessibleDataCalloutStripeDirectPreview (AccessibleDataCallout.kt:301)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, ComposableSingletons$AccessibleDataCalloutKt.INSTANCE.m116360getLambda3$financial_connections_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C18704x6c4c575a(i));
        }
    }

    public static final void AccessibleDataCalloutWithAccounts(AccessibleDataCalloutModel model, FinancialConnectionsInstitution institution, List<PartnerAccount> accounts, Function0<Unit> onLearnMoreClick, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(institution, "institution");
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        Intrinsics.checkNotNullParameter(onLearnMoreClick, "onLearnMoreClick");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1524826032);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1524826032, i, -1, "com.stripe.android.financialconnections.features.common.AccessibleDataCalloutWithAccounts (AccessibleDataCallout.kt:58)");
        }
        AccessibleDataCalloutBox(C43575jt0.m29791b(mo89518u, -469393647, true, new AccessibleDataCalloutKt$AccessibleDataCalloutWithAccounts$1(accounts, institution, model, onLearnMoreClick, i)), mo89518u, 6);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new AccessibleDataCalloutKt$AccessibleDataCalloutWithAccounts$2(model, institution, accounts, onLearnMoreClick, i));
        }
    }

    public static final void AccessibleDataCalloutWithManyAccountsPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1688115514);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1688115514, i, -1, "com.stripe.android.financialconnections.features.common.AccessibleDataCalloutWithManyAccountsPreview (AccessibleDataCallout.kt:267)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, ComposableSingletons$AccessibleDataCalloutKt.INSTANCE.m116359getLambda2$financial_connections_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C18705x6be5b4c5(i));
        }
    }

    public static final void AccessibleDataCalloutWithMultipleAccountsPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(161378037);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(161378037, i, -1, "com.stripe.android.financialconnections.features.common.AccessibleDataCalloutWithMultipleAccountsPreview (AccessibleDataCallout.kt:368)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, ComposableSingletons$AccessibleDataCalloutKt.INSTANCE.m116362getLambda5$financial_connections_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C18706xeef31ab4(i));
        }
    }

    public static final void AccessibleDataCalloutWithOneAccountPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1088315652);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1088315652, i, -1, "com.stripe.android.financialconnections.features.common.AccessibleDataCalloutWithOneAccountPreview (AccessibleDataCallout.kt:426)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, ComposableSingletons$AccessibleDataCalloutKt.INSTANCE.m116363getLambda6$financial_connections_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C18707xb3b09ac3(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AccessibleDataText(AccessibleDataCalloutModel accessibleDataCalloutModel, Function0<Unit> function0, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        List listOfNotNull;
        G26 m105921d;
        GN5 m105174a;
        GN5 m105174a2;
        Map mapOf;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-183831359);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-183831359, i, -1, "com.stripe.android.financialconnections.features.common.AccessibleDataText (AccessibleDataCallout.kt:135)");
        }
        InterfaceC32366Df6 interfaceC32366Df6 = (InterfaceC32366Df6) mo89518u.mo89572c(C42399hu0.m35603p());
        List<FinancialConnectionsAccount.Permissions> permissions = accessibleDataCalloutModel.getPermissions();
        mo89518u.mo89638F(1157296644);
        boolean mo89539n = mo89518u.mo89539n(permissions);
        Object mo89635G = mo89518u.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = toStringRes(accessibleDataCalloutModel.getPermissions());
            mo89518u.mo89503z(mo89635G);
        }
        mo89518u.mo89605Q();
        List list = (List) mo89635G;
        if (accessibleDataCalloutModel.isNetworking()) {
            if (accessibleDataCalloutModel.getBusinessName() == null) {
                i2 = C18634R.string.data_accessible_callout_through_link_no_business;
            } else {
                i2 = C18634R.string.data_accessible_callout_through_link;
            }
        } else if (accessibleDataCalloutModel.isStripeDirect()) {
            i2 = C18634R.string.data_accessible_callout_stripe_direct;
        } else if (accessibleDataCalloutModel.getBusinessName() == null) {
            i2 = C18634R.string.data_accessible_callout_through_stripe_no_business;
        } else {
            i2 = C18634R.string.data_accessible_callout_through_stripe;
        }
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new String[]{accessibleDataCalloutModel.getBusinessName(), readableListOfPermissions(list, mo89518u, 8)});
        TextResource.StringId stringId = new TextResource.StringId(i2, listOfNotNull);
        AccessibleDataCalloutKt$AccessibleDataText$1 accessibleDataCalloutKt$AccessibleDataText$1 = new AccessibleDataCalloutKt$AccessibleDataText$1(interfaceC32366Df6, accessibleDataCalloutModel, function0);
        FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
        m105921d = r13.m105921d((r42 & 1) != 0 ? r13.f10827a.m105168g() : financialConnectionsTheme.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU(), (r42 & 2) != 0 ? r13.f10827a.m105164k() : 0L, (r42 & 4) != 0 ? r13.f10827a.m105161n() : null, (r42 & 8) != 0 ? r13.f10827a.m105163l() : null, (r42 & 16) != 0 ? r13.f10827a.m105162m() : null, (r42 & 32) != 0 ? r13.f10827a.m105166i() : null, (r42 & 64) != 0 ? r13.f10827a.m105165j() : null, (r42 & 128) != 0 ? r13.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? r13.f10827a.m105170e() : null, (r42 & 512) != 0 ? r13.f10827a.m105154u() : null, (r42 & 1024) != 0 ? r13.f10827a.m105159p() : null, (r42 & 2048) != 0 ? r13.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? r13.f10827a.m105156s() : null, (r42 & 8192) != 0 ? r13.f10827a.m105157r() : null, (r42 & 16384) != 0 ? r13.f10828b.m110652j() : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r13.f10828b.m110650l() : null, (r42 & 65536) != 0 ? r13.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? financialConnectionsTheme.getTypography(mo89518u, 6).getCaption().f10828b.m110649m() : null);
        StringAnnotation stringAnnotation = StringAnnotation.CLICKABLE;
        m105174a = r15.m105174a((r35 & 1) != 0 ? r15.m105168g() : financialConnectionsTheme.getColors(mo89518u, 6).m116469getTextBrand0d7_KjU(), (r35 & 2) != 0 ? r15.f11830b : 0L, (r35 & 4) != 0 ? r15.f11831c : null, (r35 & 8) != 0 ? r15.f11832d : null, (r35 & 16) != 0 ? r15.f11833e : null, (r35 & 32) != 0 ? r15.f11834f : null, (r35 & 64) != 0 ? r15.f11835g : null, (r35 & 128) != 0 ? r15.f11836h : 0L, (r35 & 256) != 0 ? r15.f11837i : null, (r35 & 512) != 0 ? r15.f11838j : null, (r35 & 1024) != 0 ? r15.f11839k : null, (r35 & 2048) != 0 ? r15.f11840l : 0L, (r35 & 4096) != 0 ? r15.f11841m : null, (r35 & 8192) != 0 ? financialConnectionsTheme.getTypography(mo89518u, 6).getCaptionEmphasized().m105925L().f11842n : null);
        StringAnnotation stringAnnotation2 = StringAnnotation.BOLD;
        m105174a2 = r14.m105174a((r35 & 1) != 0 ? r14.m105168g() : financialConnectionsTheme.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU(), (r35 & 2) != 0 ? r14.f11830b : 0L, (r35 & 4) != 0 ? r14.f11831c : null, (r35 & 8) != 0 ? r14.f11832d : null, (r35 & 16) != 0 ? r14.f11833e : null, (r35 & 32) != 0 ? r14.f11834f : null, (r35 & 64) != 0 ? r14.f11835g : null, (r35 & 128) != 0 ? r14.f11836h : 0L, (r35 & 256) != 0 ? r14.f11837i : null, (r35 & 512) != 0 ? r14.f11838j : null, (r35 & 1024) != 0 ? r14.f11839k : null, (r35 & 2048) != 0 ? r14.f11840l : 0L, (r35 & 4096) != 0 ? r14.f11841m : null, (r35 & 8192) != 0 ? financialConnectionsTheme.getTypography(mo89518u, 6).getCaptionEmphasized().m105925L().f11842n : null);
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(stringAnnotation, m105174a), TuplesKt.m28425to(stringAnnotation2, m105174a2));
        TextKt.AnnotatedText(stringId, accessibleDataCalloutKt$AccessibleDataText$1, m105921d, null, mapOf, mo89518u, 8, 8);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new AccessibleDataCalloutKt$AccessibleDataText$2(accessibleDataCalloutModel, function0, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountRow(String str, String str2, String str3, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        int i5;
        int i6;
        int i7;
        Object obj2;
        String str4;
        InterfaceC36874Wm5 mo89512w;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1575684875);
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
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = str2;
            if (mo89518u.mo89539n(obj)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                if (mo89518u.mo89539n(str3)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i3 |= i6;
            }
            i7 = i3;
            if ((i7 & 731) != 146 && mo89518u.mo89575b()) {
                mo89518u.mo89548k();
                obj2 = obj;
            } else {
                if (i8 == 0) {
                    obj2 = null;
                } else {
                    obj2 = obj;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-1575684875, i7, -1, "com.stripe.android.financialconnections.features.common.AccountRow (AccessibleDataCallout.kt:94)");
                }
                InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
                InterfaceC41563gV2 m114255n = BB5.m114255n(c20912a, 0.0f, 1, null);
                InterfaceC4360K9.C4361a c4361a = InterfaceC4360K9.f19170a;
                InterfaceC4360K9.InterfaceC4363c m99138h = c4361a.m99138h();
                C25777lo c25777lo = C25777lo.f96729a;
                C25777lo.InterfaceC25782e m26805d = c25777lo.m26805d();
                mo89518u.mo89638F(693286680);
                InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(m26805d, m99138h, mo89518u, 54);
                mo89518u.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m114255n);
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
                mo89518u.mo89638F(-1121145583);
                InterfaceC4360K9.InterfaceC4363c m99138h2 = c4361a.m99138h();
                C25777lo.InterfaceC25782e m26795n = c25777lo.m26795n(C43705k61.m29303g(8));
                mo89518u.mo89638F(693286680);
                InterfaceC51579xO2 m74813a2 = C37252Yc5.m74813a(m26795n, m99138h2, mo89518u, 54);
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
                C38680bf6.m64191b(m64192a2, m74813a2, c0757a.m113412d());
                C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a.m113414b());
                C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a.m113413c());
                C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a.m113410f());
                mo89518u.mo89530q();
                m115273a2.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
                mo89518u.mo89638F(2058660585);
                mo89518u.mo89638F(-678309503);
                mo89518u.mo89638F(-1394699219);
                InterfaceC41563gV2 m88106a = C35447Qk0.m88106a(BB5.m114246w(c20912a, C43705k61.m29303g(24)), C39242cc5.m61172d(C43705k61.m29303g(4)));
                if (str3 != null) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                StripeImageKt.StripeImage(str4, (StripeImageLoader) mo89518u.mo89572c(FinancialConnectionsSheetNativeActivityKt.getLocalImageLoader()), null, m88106a, null, null, null, C43575jt0.m29791b(mo89518u, -2024966670, true, new AccessibleDataCalloutKt$AccountRow$1$1$1(m88106a)), null, mo89518u, (StripeImageLoader.$stable << 3) | 12583296, 368);
                FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
                C38909c26.m62000e(str, null, financialConnectionsTheme.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, financialConnectionsTheme.getTypography(mo89518u, 6).getCaptionTightEmphasized(), mo89518u, i7 & 14, 0, 32762);
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                mo89518u.mo89563f();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                if (obj2 != null) {
                    C38909c26.m62000e(obj2, null, financialConnectionsTheme.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, financialConnectionsTheme.getTypography(mo89518u, 6).getCaptionTightEmphasized(), mo89518u, (i7 >> 3) & 14, 0, 32762);
                }
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
            mo89512w = mo89518u.mo89512w();
            if (mo89512w == null) {
                mo89512w.mo20405a(new AccessibleDataCalloutKt$AccountRow$2(str, obj2, str3, i, i2));
                return;
            }
            return;
        }
        obj = str2;
        if ((i2 & 4) == 0) {
        }
        i7 = i3;
        if ((i7 & 731) != 146) {
        }
        if (i8 == 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        InterfaceC41563gV2.C20912a c20912a2 = InterfaceC41563gV2.f82354b0;
        InterfaceC41563gV2 m114255n2 = BB5.m114255n(c20912a2, 0.0f, 1, null);
        InterfaceC4360K9.C4361a c4361a2 = InterfaceC4360K9.f19170a;
        InterfaceC4360K9.InterfaceC4363c m99138h3 = c4361a2.m99138h();
        C25777lo c25777lo2 = C25777lo.f96729a;
        C25777lo.InterfaceC25782e m26805d2 = c25777lo2.m26805d();
        mo89518u.mo89638F(693286680);
        InterfaceC51579xO2 m74813a3 = C37252Yc5.m74813a(m26805d2, m99138h3, mo89518u, 54);
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g013 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm23 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq63 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a2 = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a3 = c0757a2.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a3 = C31723Am2.m115273a(m114255n2);
        if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
        }
        mo89518u.mo89557h();
        if (!mo89518u.mo89521t()) {
        }
        mo89518u.mo89620L();
        InterfaceC32720Et0 m64192a3 = C38680bf6.m64192a(mo89518u);
        C38680bf6.m64191b(m64192a3, m74813a3, c0757a2.m113412d());
        C38680bf6.m64191b(m64192a3, interfaceC41273g013, c0757a2.m113414b());
        C38680bf6.m64191b(m64192a3, enumC47065pm23, c0757a2.m113413c());
        C38680bf6.m64191b(m64192a3, interfaceC33869Jq63, c0757a2.m113410f());
        mo89518u.mo89530q();
        m115273a3.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-678309503);
        C38066ad5 c38066ad52 = C38066ad5.f50835a;
        mo89518u.mo89638F(-1121145583);
        InterfaceC4360K9.InterfaceC4363c m99138h22 = c4361a2.m99138h();
        C25777lo.InterfaceC25782e m26795n2 = c25777lo2.m26795n(C43705k61.m29303g(8));
        mo89518u.mo89638F(693286680);
        InterfaceC51579xO2 m74813a22 = C37252Yc5.m74813a(m26795n2, m99138h22, mo89518u, 54);
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
        C38680bf6.m64191b(m64192a22, m74813a22, c0757a2.m113412d());
        C38680bf6.m64191b(m64192a22, interfaceC41273g0122, c0757a2.m113414b());
        C38680bf6.m64191b(m64192a22, enumC47065pm222, c0757a2.m113413c());
        C38680bf6.m64191b(m64192a22, interfaceC33869Jq622, c0757a2.m113410f());
        mo89518u.mo89530q();
        m115273a22.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-678309503);
        mo89518u.mo89638F(-1394699219);
        InterfaceC41563gV2 m88106a2 = C35447Qk0.m88106a(BB5.m114246w(c20912a2, C43705k61.m29303g(24)), C39242cc5.m61172d(C43705k61.m29303g(4)));
        if (str3 != null) {
        }
        StripeImageKt.StripeImage(str4, (StripeImageLoader) mo89518u.mo89572c(FinancialConnectionsSheetNativeActivityKt.getLocalImageLoader()), null, m88106a2, null, null, null, C43575jt0.m29791b(mo89518u, -2024966670, true, new AccessibleDataCalloutKt$AccountRow$1$1$1(m88106a2)), null, mo89518u, (StripeImageLoader.$stable << 3) | 12583296, 368);
        FinancialConnectionsTheme financialConnectionsTheme2 = FinancialConnectionsTheme.INSTANCE;
        C38909c26.m62000e(str, null, financialConnectionsTheme2.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, financialConnectionsTheme2.getTypography(mo89518u, 6).getCaptionTightEmphasized(), mo89518u, i7 & 14, 0, 32762);
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        if (obj2 != null) {
        }
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        if (C35528Qt0.m87827O()) {
        }
        mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<PartnerAccount> partnerAccountsForPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        List emptyList;
        List emptyList2;
        List emptyList3;
        List emptyList4;
        List emptyList5;
        List<PartnerAccount> listOf;
        interfaceC32720Et0.mo89638F(70611652);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(70611652, i, -1, "com.stripe.android.financialconnections.features.common.partnerAccountsForPreview (AccessibleDataCallout.kt:472)");
        }
        FinancialConnectionsAccount.Category category = FinancialConnectionsAccount.Category.CASH;
        FinancialConnectionsAccount.Subcategory subcategory = FinancialConnectionsAccount.Subcategory.CHECKING;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        Boolean bool = Boolean.TRUE;
        FinancialConnectionsAccount.Subcategory subcategory2 = FinancialConnectionsAccount.Subcategory.SAVINGS;
        emptyList2 = CollectionsKt__CollectionsKt.emptyList();
        emptyList3 = CollectionsKt__CollectionsKt.emptyList();
        emptyList4 = CollectionsKt__CollectionsKt.emptyList();
        emptyList5 = CollectionsKt__CollectionsKt.emptyList();
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new PartnerAccount[]{new PartnerAccount("Authorization", category, "id1", "Account 1 - no acct numbers", subcategory, emptyList, (Integer) null, (String) null, (String) null, (Integer) null, "Random bank", bool, "", (String) null, (String) null, (String) null, (FinancialConnectionsAccount.Status) null, 123840, (DefaultConstructorMarker) null), new PartnerAccount("Authorization", category, "id2", "Account 2 - no acct numbers", subcategory2, emptyList2, (Integer) null, (String) null, (String) null, (Integer) null, (String) null, bool, "", (String) null, (String) null, (String) null, (FinancialConnectionsAccount.Status) null, 124864, (DefaultConstructorMarker) null), new PartnerAccount("Authorization", category, "id3", "Account 3 - no acct numbers", subcategory2, emptyList3, (Integer) null, (String) null, (String) null, (Integer) null, (String) null, bool, "", (String) null, (String) null, (String) null, (FinancialConnectionsAccount.Status) null, 124864, (DefaultConstructorMarker) null), new PartnerAccount("Authorization", category, "id4", "Account 4 - no acct numbers", subcategory2, emptyList4, (Integer) null, (String) null, (String) null, (Integer) null, (String) null, bool, "", (String) null, (String) null, (String) null, (FinancialConnectionsAccount.Status) null, 124864, (DefaultConstructorMarker) null), new PartnerAccount("Authorization", category, "id5", "Account 5 - no acct numbers", subcategory2, emptyList5, (Integer) null, (String) null, (String) null, (Integer) null, (String) null, bool, "", (String) null, (String) null, (String) null, (FinancialConnectionsAccount.Status) null, 124864, (DefaultConstructorMarker) null)});
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return listOf;
    }

    private static final String readableListOfPermissions(List<Integer> list, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int collectionSizeOrDefault;
        int lastIndex;
        boolean z;
        String valueOf;
        interfaceC32720Et0.mo89638F(-57119637);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-57119637, i, -1, "com.stripe.android.financialconnections.features.common.readableListOfPermissions (AccessibleDataCallout.kt:194)");
        }
        List<Integer> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Number number : list2) {
            arrayList.add(C40946fS5.m41310c(number.intValue(), interfaceC32720Et0, 0));
        }
        String str = "";
        int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String str2 = (String) obj;
            if (i2 == 0) {
                if (str2.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    char charAt = str2.charAt(0);
                    if (Character.isLowerCase(charAt)) {
                        valueOf = CharsKt__CharKt.titlecase(charAt);
                    } else {
                        valueOf = String.valueOf(charAt);
                    }
                    sb.append((Object) valueOf);
                    String substring = str2.substring(1);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                    sb.append(substring);
                    str = sb.toString();
                } else {
                    str = str2;
                }
            } else {
                lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list);
                if (lastIndex == i2) {
                    str = str + " and " + str2;
                } else {
                    str = str + ", " + str2;
                }
            }
            i2 = i3;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> toStringRes(List<? extends FinancialConnectionsAccount.Permissions> list) {
        List<Integer> distinct;
        Integer valueOf;
        ArrayList arrayList = new ArrayList();
        for (FinancialConnectionsAccount.Permissions permissions : list) {
            switch (WhenMappings.$EnumSwitchMapping$0[permissions.ordinal()]) {
                case 1:
                    valueOf = Integer.valueOf(C18634R.string.data_accessible_type_balances);
                    break;
                case 2:
                    valueOf = Integer.valueOf(C18634R.string.data_accessible_type_ownership);
                    break;
                case 3:
                case 4:
                    valueOf = Integer.valueOf(C18634R.string.data_accessible_type_accountdetails);
                    break;
                case 5:
                    valueOf = Integer.valueOf(C18634R.string.data_accessible_type_transactions);
                    break;
                case 6:
                    valueOf = null;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            if (valueOf != null) {
                arrayList.add(valueOf);
            }
        }
        distinct = CollectionsKt___CollectionsKt.distinct(arrayList);
        return distinct;
    }
}
