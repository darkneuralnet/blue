package com.stripe.android.financialconnections;

import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForDataContract;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForDataLauncher;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForTokenContract;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForTokenLauncher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\b\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, m28432d2 = {"Lkotlin/Function1;", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;", "", "callback", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;", "rememberFinancialConnectionsSheet", "(Lkotlin/jvm/functions/Function1;LEt0;I)Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult;", "rememberFinancialConnectionsSheetForToken", "financial-connections_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFinancialConnectionsSheetCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsSheetCompose.kt\ncom/stripe/android/financialconnections/FinancialConnectionsSheetComposeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,64:1\n36#2:65\n25#2:72\n36#2:79\n25#2:86\n1057#3,6:66\n1057#3,6:73\n1057#3,6:80\n1057#3,6:87\n*S KotlinDebug\n*F\n+ 1 FinancialConnectionsSheetCompose.kt\ncom/stripe/android/financialconnections/FinancialConnectionsSheetComposeKt\n*L\n28#1:65\n29#1:72\n55#1:79\n56#1:86\n28#1:66,6\n29#1:73,6\n55#1:80,6\n56#1:87,6\n*E\n"})
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetComposeKt {
    public static final FinancialConnectionsSheet rememberFinancialConnectionsSheet(Function1<? super FinancialConnectionsSheetResult, Unit> callback, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        interfaceC32720Et0.mo89638F(-1667305132);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1667305132, i, -1, "com.stripe.android.financialconnections.rememberFinancialConnectionsSheet (FinancialConnectionsSheetCompose.kt:22)");
        }
        FinancialConnectionsSheetForDataContract financialConnectionsSheetForDataContract = new FinancialConnectionsSheetForDataContract();
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n = interfaceC32720Et0.mo89539n(callback);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new C18626x5be16040(callback);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        TH2 m110957a = C1362D5.m110957a(financialConnectionsSheetForDataContract, (Function1) mo89635G, interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89638F(-492369756);
        Object mo89635G2 = interfaceC32720Et0.mo89635G();
        if (mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G2 = new FinancialConnectionsSheet(new FinancialConnectionsSheetForDataLauncher(m110957a));
            interfaceC32720Et0.mo89503z(mo89635G2);
        }
        interfaceC32720Et0.mo89605Q();
        FinancialConnectionsSheet financialConnectionsSheet = (FinancialConnectionsSheet) mo89635G2;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return financialConnectionsSheet;
    }

    public static final FinancialConnectionsSheet rememberFinancialConnectionsSheetForToken(Function1<? super FinancialConnectionsSheetForTokenResult, Unit> callback, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        interfaceC32720Et0.mo89638F(1097997444);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1097997444, i, -1, "com.stripe.android.financialconnections.rememberFinancialConnectionsSheetForToken (FinancialConnectionsSheetCompose.kt:49)");
        }
        FinancialConnectionsSheetForTokenContract financialConnectionsSheetForTokenContract = new FinancialConnectionsSheetForTokenContract();
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n = interfaceC32720Et0.mo89539n(callback);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new C18627x959170(callback);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        TH2 m110957a = C1362D5.m110957a(financialConnectionsSheetForTokenContract, (Function1) mo89635G, interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89638F(-492369756);
        Object mo89635G2 = interfaceC32720Et0.mo89635G();
        if (mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G2 = new FinancialConnectionsSheet(new FinancialConnectionsSheetForTokenLauncher(m110957a));
            interfaceC32720Et0.mo89503z(mo89635G2);
        }
        interfaceC32720Et0.mo89605Q();
        FinancialConnectionsSheet financialConnectionsSheet = (FinancialConnectionsSheet) mo89635G2;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return financialConnectionsSheet;
    }
}
