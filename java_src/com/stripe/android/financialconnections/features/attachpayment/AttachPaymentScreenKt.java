package com.stripe.android.financialconnections.features.attachpayment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.compose.p003ui.platform.C11411h;
import androidx.fragment.app.Fragment;
import androidx.savedstate.C11966a;
import com.stripe.android.financialconnections.exception.AccountNumberRetrievalError;
import com.stripe.android.financialconnections.features.attachpayment.AttachPaymentState;
import com.stripe.android.financialconnections.features.common.ErrorContentKt;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import com.stripe.android.financialconnections.p041ui.CompositionLocalKt;
import com.stripe.android.financialconnections.p041ui.components.ScaffoldKt;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModelKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\b\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001ai\u0010\u000f\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00000\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001aG\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00000\fH\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0014\u0010\u0002¨\u0006\u0015"}, m28432d2 = {"", "AttachPaymentScreen", "(LEt0;I)V", "Ldp;", "Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState$Payload;", "payload", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "attachPayment", "Lkotlin/Function0;", "onSelectAnotherBank", "onEnterDetailsManually", "onCloseClick", "Lkotlin/Function1;", "", "onCloseFromErrorClick", "AttachPaymentContent", "(Ldp;Ldp;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V", "error", "ErrorContent", "(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V", "AttachPaymentScreenPreview", "financial-connections_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAttachPaymentScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttachPaymentScreen.kt\ncom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt\n+ 2 MavericksComposeExtensions.kt\ncom/airbnb/mvrx/compose/MavericksComposeExtensionsKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,141:1\n53#2:142\n54#2,15:144\n69#2,8:165\n79#2:176\n80#2,5:179\n76#3:143\n83#4,3:159\n50#4:177\n49#4:178\n1057#5,3:162\n1060#5,3:173\n*S KotlinDebug\n*F\n+ 1 AttachPaymentScreen.kt\ncom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt\n*L\n29#1:142\n29#1:144,15\n29#1:165,8\n29#1:176\n29#1:179,5\n29#1:143\n29#1:159,3\n29#1:177\n29#1:178\n29#1:162,3\n29#1:173,3\n*E\n"})
/* loaded from: classes7.dex */
public final class AttachPaymentScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void AttachPaymentContent(AbstractC19862dp<AttachPaymentState.Payload> abstractC19862dp, AbstractC19862dp<LinkAccountSessionPaymentAccount> abstractC19862dp2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function1<? super Throwable, Unit> function1, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-2037037975);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-2037037975, i, -1, "com.stripe.android.financialconnections.features.attachpayment.AttachPaymentContent (AttachPaymentScreen.kt:44)");
        }
        ScaffoldKt.FinancialConnectionsScaffold(C43575jt0.m29791b(mo89518u, 158604698, true, new AttachPaymentScreenKt$AttachPaymentContent$1(function03, i)), C43575jt0.m29791b(mo89518u, 887265878, true, new AttachPaymentScreenKt$AttachPaymentContent$2(abstractC19862dp, abstractC19862dp2, function0, function02, function1, i)), mo89518u, 54);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new AttachPaymentScreenKt$AttachPaymentContent$3(abstractC19862dp, abstractC19862dp2, function0, function02, function03, function1, i));
        }
    }

    public static final void AttachPaymentScreen(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC37154Xr6 interfaceC37154Xr6;
        InterfaceC35200Pi5 interfaceC35200Pi5;
        Fragment fragment;
        boolean z;
        Object c27850r6;
        Object obj;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1538621207);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1538621207, i, -1, "com.stripe.android.financialconnections.features.attachpayment.AttachPaymentScreen (AttachPaymentScreen.kt:27)");
            }
            mo89518u.mo89638F(512170640);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) mo89518u.mo89572c(C11411h.m68322i());
            ComponentActivity m12477f = C49199tN2.m12477f((Context) mo89518u.mo89572c(C11411h.m68324g()));
            if (m12477f != null) {
                Object obj2 = null;
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
                        C11966a savedStateRegistry = interfaceC35200Pi5.getSavedStateRegistry();
                        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AttachPaymentViewModel.class);
                        View view = (View) mo89518u.mo89572c(C11411h.m68320k());
                        Object[] objArr = {lifecycleOwner, m12477f, interfaceC37154Xr6, savedStateRegistry};
                        mo89518u.mo89638F(-568225417);
                        boolean z2 = false;
                        for (int i2 = 0; i2 < 4; i2++) {
                            z2 |= mo89518u.mo89539n(objArr[i2]);
                        }
                        Object mo89635G = mo89518u.mo89635G();
                        if (!z2 && mo89635G != InterfaceC32720Et0.f8257a.m108267a()) {
                            z = true;
                        } else {
                            if (lifecycleOwner instanceof Fragment) {
                                fragment = (Fragment) lifecycleOwner;
                            } else {
                                fragment = null;
                            }
                            if (fragment == null) {
                                fragment = C49199tN2.m12476g(view);
                            }
                            Fragment fragment2 = fragment;
                            if (fragment2 != null) {
                                Bundle arguments = fragment2.getArguments();
                                if (arguments != null) {
                                    obj = arguments.get("mavericks:arg");
                                } else {
                                    obj = null;
                                }
                                z = true;
                                c27850r6 = new C33000Fy1(m12477f, obj, fragment2, null, null, 24, null);
                            } else {
                                z = true;
                                Bundle extras = m12477f.getIntent().getExtras();
                                if (extras != null) {
                                    obj2 = extras.get("mavericks:arg");
                                }
                                c27850r6 = new C27850r6(m12477f, obj2, interfaceC37154Xr6, savedStateRegistry);
                            }
                            mo89635G = c27850r6;
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
                            mo89635G2 = YN2.m75139c(yn2, javaClass, AttachPaymentState.class, abstractC35282Pr6, name, false, null, 48, null);
                            mo89518u.mo89503z(mo89635G2);
                        }
                        mo89518u.mo89605Q();
                        mo89518u.mo89605Q();
                        AttachPaymentViewModel attachPaymentViewModel = (AttachPaymentViewModel) ((RN2) mo89635G2);
                        FinancialConnectionsSheetNativeViewModel parentViewModel = FinancialConnectionsSheetNativeViewModelKt.parentViewModel(mo89518u, 0);
                        InterfaceC48627sP5 m12481b = C49199tN2.m12481b(attachPaymentViewModel, mo89518u, 8);
                        C7582Sv.m84651a(z, AttachPaymentScreenKt$AttachPaymentScreen$1.INSTANCE, mo89518u, 54, 0);
                        AttachPaymentContent(((AttachPaymentState) m12481b.getValue()).getPayload(), ((AttachPaymentState) m12481b.getValue()).getLinkPaymentAccount(), new AttachPaymentScreenKt$AttachPaymentScreen$2(attachPaymentViewModel), new AttachPaymentScreenKt$AttachPaymentScreen$3(attachPaymentViewModel), new AttachPaymentScreenKt$AttachPaymentScreen$4(parentViewModel), new AttachPaymentScreenKt$AttachPaymentScreen$5(parentViewModel), mo89518u, 72);
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
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new AttachPaymentScreenKt$AttachPaymentScreen$6(i));
        }
    }

    public static final void AttachPaymentScreenPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1527947085);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1527947085, i, -1, "com.stripe.android.financialconnections.features.attachpayment.AttachPaymentScreenPreview (AttachPaymentScreen.kt:124)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, ComposableSingletons$AttachPaymentScreenKt.INSTANCE.m116357getLambda1$financial_connections_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new AttachPaymentScreenKt$AttachPaymentScreenPreview$1(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ErrorContent(Throwable th, Function0<Unit> function0, Function0<Unit> function02, Function1<? super Throwable, Unit> function1, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1107918986);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1107918986, i, -1, "com.stripe.android.financialconnections.features.attachpayment.ErrorContent (AttachPaymentScreen.kt:102)");
        }
        if (th instanceof AccountNumberRetrievalError) {
            mo89518u.mo89638F(721741528);
            ErrorContentKt.AccountNumberRetrievalErrorContent((AccountNumberRetrievalError) th, function0, function02, mo89518u, (i & 112) | (i & 896));
            mo89518u.mo89605Q();
        } else {
            mo89518u.mo89638F(721741737);
            ErrorContentKt.UnclassifiedErrorContent(th, function1, mo89518u, ((i >> 6) & 112) | 8);
            mo89518u.mo89605Q();
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new AttachPaymentScreenKt$ErrorContent$1(th, function0, function02, function1, i));
        }
    }
}
