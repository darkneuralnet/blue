package com.stripe.android.financialconnections.features.reset;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.compose.p003ui.platform.C11411h;
import androidx.fragment.app.Fragment;
import androidx.savedstate.C11966a;
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
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a?\u0010\n\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00000\u0007H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\f\u0010\u0002¨\u0006\r"}, m28432d2 = {"", "ResetScreen", "(LEt0;I)V", "Ldp;", "payload", "Lkotlin/Function0;", "onCloseClick", "Lkotlin/Function1;", "", "onCloseFromErrorClick", "ResetContent", "(Ldp;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V", "ResetScreenPreview", "financial-connections_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nResetScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResetScreen.kt\ncom/stripe/android/financialconnections/features/reset/ResetScreenKt\n+ 2 MavericksComposeExtensions.kt\ncom/airbnb/mvrx/compose/MavericksComposeExtensionsKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,68:1\n53#2:69\n54#2,15:71\n69#2,8:92\n79#2:103\n80#2,5:106\n76#3:70\n83#4,3:86\n50#4:104\n49#4:105\n1057#5,3:89\n1060#5,3:100\n*S KotlinDebug\n*F\n+ 1 ResetScreen.kt\ncom/stripe/android/financialconnections/features/reset/ResetScreenKt\n*L\n23#1:69\n23#1:71,15\n23#1:92,8\n23#1:103\n23#1:106,5\n23#1:70\n23#1:86,3\n23#1:104\n23#1:105\n23#1:89,3\n23#1:100,3\n*E\n"})
/* loaded from: classes7.dex */
public final class ResetScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void ResetContent(AbstractC19862dp<Unit> abstractC19862dp, Function0<Unit> function0, Function1<? super Throwable, Unit> function1, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1778634189);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1778634189, i, -1, "com.stripe.android.financialconnections.features.reset.ResetContent (ResetScreen.kt:34)");
        }
        ScaffoldKt.FinancialConnectionsScaffold(C43575jt0.m29791b(mo89518u, -1440831068, true, new ResetScreenKt$ResetContent$1(function0, i)), C43575jt0.m29791b(mo89518u, -173929120, true, new ResetScreenKt$ResetContent$2(abstractC19862dp, function1, i)), mo89518u, 54);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ResetScreenKt$ResetContent$3(abstractC19862dp, function0, function1, i));
        }
    }

    public static final void ResetScreen(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC37154Xr6 interfaceC37154Xr6;
        InterfaceC35200Pi5 interfaceC35200Pi5;
        Fragment fragment;
        boolean z;
        int i2;
        AbstractC35282Pr6 c27850r6;
        Object obj;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(594421417);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(594421417, i, -1, "com.stripe.android.financialconnections.features.reset.ResetScreen (ResetScreen.kt:21)");
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
                        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ResetViewModel.class);
                        View view = (View) mo89518u.mo89572c(C11411h.m68320k());
                        Object[] objArr = {lifecycleOwner, m12477f, interfaceC37154Xr6, savedStateRegistry};
                        mo89518u.mo89638F(-568225417);
                        boolean z2 = false;
                        for (int i3 = 0; i3 < 4; i3++) {
                            z2 |= mo89518u.mo89539n(objArr[i3]);
                        }
                        Object mo89635G = mo89518u.mo89635G();
                        if (!z2 && mo89635G != InterfaceC32720Et0.f8257a.m108267a()) {
                            c27850r6 = mo89635G;
                            z = true;
                            i2 = 0;
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
                                i2 = 0;
                                c27850r6 = new C33000Fy1(m12477f, obj, fragment2, null, null, 24, null);
                            } else {
                                z = true;
                                i2 = 0;
                                Bundle extras = m12477f.getIntent().getExtras();
                                if (extras != null) {
                                    obj2 = extras.get("mavericks:arg");
                                }
                                c27850r6 = new C27850r6(m12477f, obj2, interfaceC37154Xr6, savedStateRegistry);
                            }
                            mo89518u.mo89503z(c27850r6);
                        }
                        mo89518u.mo89605Q();
                        AbstractC35282Pr6 abstractC35282Pr6 = c27850r6;
                        mo89518u.mo89638F(511388516);
                        boolean mo89539n = mo89518u.mo89539n(orCreateKotlinClass) | mo89518u.mo89539n(abstractC35282Pr6);
                        Object mo89635G2 = mo89518u.mo89635G();
                        if (mo89539n || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
                            YN2 yn2 = YN2.f45797a;
                            Class javaClass = JvmClassMappingKt.getJavaClass(orCreateKotlinClass);
                            String name = JvmClassMappingKt.getJavaClass(orCreateKotlinClass).getName();
                            Intrinsics.checkNotNullExpressionValue(name, "keyFactory?.invoke() ?: viewModelClass.java.name");
                            mo89635G2 = YN2.m75139c(yn2, javaClass, ResetState.class, abstractC35282Pr6, name, false, null, 48, null);
                            mo89518u.mo89503z(mo89635G2);
                        }
                        mo89518u.mo89605Q();
                        mo89518u.mo89605Q();
                        FinancialConnectionsSheetNativeViewModel parentViewModel = FinancialConnectionsSheetNativeViewModelKt.parentViewModel(mo89518u, i2);
                        InterfaceC48627sP5 m12480c = C49199tN2.m12480c((ResetViewModel) ((RN2) mo89635G2), null, ResetScreenKt$ResetScreen$payload$1.INSTANCE, mo89518u, 392, 1);
                        C7582Sv.m84651a(z, ResetScreenKt$ResetScreen$1.INSTANCE, mo89518u, 54, i2);
                        ResetContent((AbstractC19862dp) m12480c.getValue(), new ResetScreenKt$ResetScreen$2(parentViewModel), new ResetScreenKt$ResetScreen$3(parentViewModel), mo89518u, 8);
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
            mo89512w.mo20405a(new ResetScreenKt$ResetScreen$4(i));
        }
    }

    public static final void ResetScreenPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1386747579);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1386747579, i, -1, "com.stripe.android.financialconnections.features.reset.ResetScreenPreview (ResetScreen.kt:59)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, ComposableSingletons$ResetScreenKt.INSTANCE.m116410getLambda1$financial_connections_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ResetScreenKt$ResetScreenPreview$1(i));
        }
    }
}
