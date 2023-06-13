package com.stripe.android.paymentsheet.addresselement;

import android.app.Application;
import android.content.Context;
import androidx.compose.p003ui.focus.C11309h;
import androidx.compose.p003ui.platform.C11411h;
import androidx.lifecycle.InterfaceC11718e;
import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.p049ui.core.elements.autocomplete.PlacesClientProxy;
import com.stripe.android.p049ui.core.elements.autocomplete.model.AutocompletePrediction;
import com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.FE0;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\n\"\u001a\u0010\u000b\u001a\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u000b\u0010\f\u0012\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/core/injection/NonFallbackInjector;", "injector", "", "country", "", "AutocompleteScreen", "(Lcom/stripe/android/core/injection/NonFallbackInjector;Ljava/lang/String;LEt0;I)V", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;", "viewModel", "AutocompleteScreenUI", "(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;LEt0;I)V", "TEST_TAG_ATTRIBUTION_DRAWABLE", "Ljava/lang/String;", "getTEST_TAG_ATTRIBUTION_DRAWABLE$annotations", "()V", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAutocompleteScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutocompleteScreen.kt\ncom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,235:1\n76#2:236\n81#3,11:237\n25#4:248\n1057#5,6:249\n76#6:255\n76#6:256\n*S KotlinDebug\n*F\n+ 1 AutocompleteScreen.kt\ncom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt\n*L\n59#1:236\n61#1:237,11\n81#1:248\n81#1:249,6\n76#1:255\n77#1:256\n*E\n"})
/* loaded from: classes7.dex */
public final class AutocompleteScreenKt {
    public static final String TEST_TAG_ATTRIBUTION_DRAWABLE = "AutocompleteAttributionDrawable";

    public static final void AutocompleteScreen(NonFallbackInjector injector, String str, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        FE0 fe0;
        Intrinsics.checkNotNullParameter(injector, "injector");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(147990516);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(147990516, i, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreen (AutocompleteScreen.kt:54)");
        }
        Context applicationContext = ((Context) mo89518u.mo89572c(C11411h.m68324g())).getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        AutocompleteViewModel.Factory factory = new AutocompleteViewModel.Factory(injector, new AutocompleteViewModel.Args(str), new AutocompleteScreenKt$AutocompleteScreen$viewModel$1((Application) applicationContext));
        mo89518u.mo89638F(1729797275);
        InterfaceC37154Xr6 m18429a = C47155pv2.f104319a.m18429a(mo89518u, 6);
        if (m18429a != null) {
            if (m18429a instanceof InterfaceC11718e) {
                fe0 = ((InterfaceC11718e) m18429a).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(fe0, "{\n        viewModelStore…ModelCreationExtras\n    }");
            } else {
                fe0 = FE0.C2209a.f9049b;
            }
            AbstractC35048Or6 m84734b = C35984Sr6.m84734b(AutocompleteViewModel.class, m18429a, null, factory, fe0, mo89518u, 36936, 0);
            mo89518u.mo89605Q();
            AutocompleteScreenUI((AutocompleteViewModel) m84734b, mo89518u, 8);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
            if (mo89512w != null) {
                mo89512w.mo20405a(new AutocompleteScreenKt$AutocompleteScreen$1(injector, str, i));
                return;
            }
            return;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }

    public static final void AutocompleteScreenUI(AutocompleteViewModel viewModel, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-9884790);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-9884790, i, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenUI (AutocompleteScreen.kt:74)");
        }
        InterfaceC48627sP5 m105205b = GM5.m105205b(viewModel.getPredictions(), null, mo89518u, 8, 1);
        InterfaceC48627sP5 m105206a = GM5.m105206a(viewModel.getLoading(), Boolean.FALSE, null, mo89518u, 56, 2);
        InterfaceC48627sP5 m105206a2 = GM5.m105206a(viewModel.getTextFieldController().getFieldValue(), "", null, mo89518u, 56, 2);
        Integer placesPoweredByGoogleDrawable$default = PlacesClientProxy.Companion.getPlacesPoweredByGoogleDrawable$default(PlacesClientProxy.Companion, C51020wS0.m6823a(mo89518u, 0), null, 2, null);
        mo89518u.mo89638F(-492369756);
        Object mo89635G = mo89518u.mo89635G();
        if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new C11309h();
            mo89518u.mo89503z(mo89635G);
        }
        mo89518u.mo89605Q();
        C11309h c11309h = (C11309h) mo89635G;
        Y91.m75533f(Unit.INSTANCE, new AutocompleteScreenKt$AutocompleteScreenUI$1(c11309h, null), mo89518u, 70);
        C36604Vi5.m79545a(null, null, C43575jt0.m29791b(mo89518u, 924601935, true, new AutocompleteScreenKt$AutocompleteScreenUI$2(viewModel)), C43575jt0.m29791b(mo89518u, 1873091664, true, new AutocompleteScreenKt$AutocompleteScreenUI$3(viewModel)), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, TM2.f35372a.m83731a(mo89518u, TM2.f35373b).m94896n(), 0L, C43575jt0.m29791b(mo89518u, -927416248, true, new AutocompleteScreenKt$AutocompleteScreenUI$4(m105206a2, viewModel, c11309h, m105206a, m105205b, placesPoweredByGoogleDrawable$default)), mo89518u, 3456, 12582912, 98291);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new AutocompleteScreenKt$AutocompleteScreenUI$5(viewModel, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AutocompletePrediction> AutocompleteScreenUI$lambda$0(InterfaceC48627sP5<? extends List<AutocompletePrediction>> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AutocompleteScreenUI$lambda$1(InterfaceC48627sP5<Boolean> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().booleanValue();
    }

    public static /* synthetic */ void getTEST_TAG_ATTRIBUTION_DRAWABLE$annotations() {
    }
}
