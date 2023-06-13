package com.stripe.android.financialconnections.features.manualentrysuccess;

import com.google.p034ar.core.ImageMetadata;
import com.stripe.android.financialconnections.C18634R;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import com.stripe.android.financialconnections.p041ui.components.ButtonKt;
import com.stripe.android.financialconnections.p041ui.theme.FinancialConnectionsTheme;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.C25777lo;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nManualEntrySuccessScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManualEntrySuccessScreen.kt\ncom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessScreenKt$ManualEntrySuccessContent$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,344:1\n154#2:345\n154#2:346\n154#2:347\n154#2:348\n154#2:349\n154#2:382\n154#2:383\n75#3,5:350\n80#3:381\n84#3:388\n75#4:355\n76#4,11:357\n89#4:387\n76#5:356\n460#6,13:368\n473#6,3:384\n*S KotlinDebug\n*F\n+ 1 ManualEntrySuccessScreen.kt\ncom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessScreenKt$ManualEntrySuccessContent$2\n*L\n84#1:345\n88#1:346\n89#1:347\n90#1:348\n91#1:349\n95#1:382\n120#1:383\n83#1:350,5\n83#1:381\n83#1:388\n83#1:355\n83#1:357,11\n83#1:387\n83#1:356\n83#1:368,13\n83#1:384,3\n*E\n"})
/* loaded from: classes7.dex */
public final class ManualEntrySuccessScreenKt$ManualEntrySuccessContent$2 extends Lambda implements Function3<PD3, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ String $last4;
    final /* synthetic */ boolean $loading;
    final /* synthetic */ LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod $microdepositVerificationMethod;
    final /* synthetic */ Function0<Unit> $onDoneClick;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod.values().length];
            try {
                iArr[LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod.AMOUNTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod.DESCRIPTOR_CODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualEntrySuccessScreenKt$ManualEntrySuccessContent$2(LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod microdepositVerificationMethod, String str, int i, Function0<Unit> function0, boolean z) {
        super(3);
        this.$microdepositVerificationMethod = microdepositVerificationMethod;
        this.$last4 = str;
        this.$$dirty = i;
        this.$onDoneClick = function0;
        this.$loading = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(PD3 pd3, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(pd3, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PD3 it, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        String m41310c;
        G26 m105921d;
        G26 m105921d2;
        Intrinsics.checkNotNullParameter(it, "it");
        if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1663358358, i, -1, "com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessContent.<anonymous> (ManualEntrySuccessScreen.kt:81)");
        }
        C25777lo.InterfaceC25782e m26795n = C25777lo.f96729a.m26795n(C43705k61.m29303g(16));
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        float f = 8;
        float f2 = 24;
        InterfaceC41563gV2 m94181l = ND3.m94181l(BB5.m114257l(c20912a, 0.0f, 1, null), C43705k61.m29303g(f2), C43705k61.m29303g(f), C43705k61.m29303g(f2), C43705k61.m29303g(f2));
        LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod microdepositVerificationMethod = this.$microdepositVerificationMethod;
        String str = this.$last4;
        int i2 = this.$$dirty;
        Function0<Unit> function0 = this.$onDoneClick;
        boolean z = this.$loading;
        interfaceC32720Et0.mo89638F(-483455358);
        InterfaceC51579xO2 m91546a = C34997Om0.m91546a(m26795n, InterfaceC4360K9.f19170a.m99136j(), interfaceC32720Et0, 6);
        interfaceC32720Et0.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m94181l);
        if (!(interfaceC32720Et0.mo89515v() instanceof InterfaceC25773lm)) {
            C52468yt0.m2335c();
        }
        interfaceC32720Et0.mo89557h();
        if (interfaceC32720Et0.mo89521t()) {
            interfaceC32720Et0.mo89617M(m113415a);
        } else {
            interfaceC32720Et0.mo89566e();
        }
        interfaceC32720Et0.mo89620L();
        InterfaceC32720Et0 m64192a = C38680bf6.m64192a(interfaceC32720Et0);
        C38680bf6.m64191b(m64192a, m91546a, c0757a.m113412d());
        C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
        C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
        C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
        interfaceC32720Et0.mo89530q();
        m115273a.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89638F(2058660585);
        interfaceC32720Et0.mo89638F(-1163856341);
        C35465Qm0 c35465Qm0 = C35465Qm0.f30887a;
        interfaceC32720Et0.mo89638F(572216672);
        InterfaceC41563gV2 m114246w = BB5.m114246w(c20912a, C43705k61.m29303g(40));
        AbstractC45562nE3 m19793d = C46748pE3.m19793d(C18634R.C18635drawable.stripe_ic_check_circle, interfaceC32720Et0, 0);
        FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
        DP1.m110533b(m19793d, null, m114246w, financialConnectionsTheme.getColors(interfaceC32720Et0, 6).m116475getTextSuccess0d7_KjU(), interfaceC32720Et0, 440, 0);
        InterfaceC41563gV2 m114255n = BB5.m114255n(c20912a, 0.0f, 1, null);
        int i3 = WhenMappings.$EnumSwitchMapping$0[microdepositVerificationMethod.ordinal()];
        if (i3 == 1 || i3 == 2) {
            interfaceC32720Et0.mo89638F(-808714430);
            m41310c = C40946fS5.m41310c(C18634R.string.stripe_manualentrysuccess_title, interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89605Q();
        } else if (i3 != 3) {
            interfaceC32720Et0.mo89638F(-808718988);
            interfaceC32720Et0.mo89605Q();
            throw new NoWhenBranchMatchedException();
        } else {
            interfaceC32720Et0.mo89638F(-808714279);
            m41310c = C40946fS5.m41310c(C18634R.string.stripe_manualentrysuccess_title_descriptorcode, interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89605Q();
        }
        m105921d = r31.m105921d((r42 & 1) != 0 ? r31.f10827a.m105168g() : financialConnectionsTheme.getColors(interfaceC32720Et0, 6).m116473getTextPrimary0d7_KjU(), (r42 & 2) != 0 ? r31.f10827a.m105164k() : 0L, (r42 & 4) != 0 ? r31.f10827a.m105161n() : null, (r42 & 8) != 0 ? r31.f10827a.m105163l() : null, (r42 & 16) != 0 ? r31.f10827a.m105162m() : null, (r42 & 32) != 0 ? r31.f10827a.m105166i() : null, (r42 & 64) != 0 ? r31.f10827a.m105165j() : null, (r42 & 128) != 0 ? r31.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? r31.f10827a.m105170e() : null, (r42 & 512) != 0 ? r31.f10827a.m105154u() : null, (r42 & 1024) != 0 ? r31.f10827a.m105159p() : null, (r42 & 2048) != 0 ? r31.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? r31.f10827a.m105156s() : null, (r42 & 8192) != 0 ? r31.f10827a.m105157r() : null, (r42 & 16384) != 0 ? r31.f10828b.m110652j() : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r31.f10828b.m110650l() : null, (r42 & 65536) != 0 ? r31.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? financialConnectionsTheme.getTypography(interfaceC32720Et0, 6).getSubtitle().f10828b.m110649m() : null);
        C38909c26.m62000e(m41310c, m114255n, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, m105921d, interfaceC32720Et0, 48, 0, 32764);
        String resolveText = ManualEntrySuccessScreenKt.resolveText(microdepositVerificationMethod, str, interfaceC32720Et0, (i2 & 14) | (i2 & 112));
        m105921d2 = r32.m105921d((r42 & 1) != 0 ? r32.f10827a.m105168g() : financialConnectionsTheme.getColors(interfaceC32720Et0, 6).m116474getTextSecondary0d7_KjU(), (r42 & 2) != 0 ? r32.f10827a.m105164k() : 0L, (r42 & 4) != 0 ? r32.f10827a.m105161n() : null, (r42 & 8) != 0 ? r32.f10827a.m105163l() : null, (r42 & 16) != 0 ? r32.f10827a.m105162m() : null, (r42 & 32) != 0 ? r32.f10827a.m105166i() : null, (r42 & 64) != 0 ? r32.f10827a.m105165j() : null, (r42 & 128) != 0 ? r32.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? r32.f10827a.m105170e() : null, (r42 & 512) != 0 ? r32.f10827a.m105154u() : null, (r42 & 1024) != 0 ? r32.f10827a.m105159p() : null, (r42 & 2048) != 0 ? r32.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? r32.f10827a.m105156s() : null, (r42 & 8192) != 0 ? r32.f10827a.m105157r() : null, (r42 & 16384) != 0 ? r32.f10828b.m110652j() : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r32.f10828b.m110650l() : null, (r42 & 65536) != 0 ? r32.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? financialConnectionsTheme.getTypography(interfaceC32720Et0, 6).getBody().f10828b.m110649m() : null);
        C38909c26.m62000e(resolveText, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, m105921d2, interfaceC32720Et0, 0, 0, 32766);
        DN5.m110552a(BB5.m114254o(c20912a, C43705k61.m29303g(f)), interfaceC32720Et0, 6);
        ManualEntrySuccessScreenKt.TransactionHistoryTable(str, microdepositVerificationMethod, interfaceC32720Et0, ((i2 >> 3) & 14) | ((i2 << 3) & 112));
        DN5.m110552a(InterfaceC35231Pm0.m89798b(c35465Qm0, c20912a, 1.0f, false, 2, null), interfaceC32720Et0, 0);
        ButtonKt.FinancialConnectionsButton(function0, BB5.m114255n(c20912a, 0.0f, 1, null), null, null, false, z, ComposableSingletons$ManualEntrySuccessScreenKt.INSTANCE.m116399getLambda1$financial_connections_release(), interfaceC32720Et0, ((i2 >> 12) & 14) | 1572912 | ((i2 << 9) & ImageMetadata.JPEG_GPS_COORDINATES), 28);
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89563f();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
