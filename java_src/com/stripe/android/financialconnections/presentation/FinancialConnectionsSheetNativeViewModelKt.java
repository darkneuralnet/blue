package com.stripe.android.financialconnections.presentation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.compose.p003ui.platform.C11411h;
import androidx.fragment.app.Fragment;
import androidx.savedstate.C11966a;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;", "parentViewModel", "(LEt0;I)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;", "financial-connections_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFinancialConnectionsSheetNativeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsSheetNativeViewModel.kt\ncom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModelKt\n+ 2 MavericksComposeExtensions.kt\ncom/airbnb/mvrx/compose/MavericksComposeExtensionsKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,375:1\n119#2,4:376\n123#2,4:381\n57#2,12:385\n69#2,8:403\n79#2:414\n80#2,5:417\n76#3:380\n83#4,3:397\n50#4:415\n49#4:416\n1057#5,3:400\n1060#5,3:411\n*S KotlinDebug\n*F\n+ 1 FinancialConnectionsSheetNativeViewModel.kt\ncom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModelKt\n*L\n358#1:376,4\n358#1:381,4\n358#1:385,12\n358#1:403,8\n358#1:414\n358#1:417,5\n358#1:380\n358#1:397,3\n358#1:415\n358#1:416\n358#1:400,3\n358#1:411,3\n*E\n"})
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetNativeViewModelKt {
    public static final FinancialConnectionsSheetNativeViewModel parentViewModel(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Fragment fragment;
        Fragment fragment2;
        Object obj;
        interfaceC32720Et0.mo89638F(688516201);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(688516201, i, -1, "com.stripe.android.financialconnections.presentation.parentViewModel (FinancialConnectionsSheetNativeViewModel.kt:356)");
        }
        interfaceC32720Et0.mo89638F(403151030);
        ComponentActivity m12477f = C49199tN2.m12477f((Context) interfaceC32720Et0.mo89572c(C11411h.m68324g()));
        if (m12477f != null) {
            interfaceC32720Et0.mo89638F(512170640);
            ComponentActivity m12477f2 = C49199tN2.m12477f((Context) interfaceC32720Et0.mo89572c(C11411h.m68324g()));
            if (m12477f2 != null) {
                C11966a savedStateRegistry = m12477f.getSavedStateRegistry();
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FinancialConnectionsSheetNativeViewModel.class);
                View view = (View) interfaceC32720Et0.mo89572c(C11411h.m68320k());
                Object[] objArr = {m12477f, m12477f2, m12477f, savedStateRegistry};
                interfaceC32720Et0.mo89638F(-568225417);
                boolean z = false;
                for (int i2 = 0; i2 < 4; i2++) {
                    z |= interfaceC32720Et0.mo89539n(objArr[i2]);
                }
                Object mo89635G = interfaceC32720Et0.mo89635G();
                if (z || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                    Object obj2 = null;
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
                            obj = arguments.get("mavericks:arg");
                        } else {
                            obj = null;
                        }
                        mo89635G = new C33000Fy1(m12477f2, obj, fragment2, null, null, 24, null);
                    } else {
                        Bundle extras = m12477f2.getIntent().getExtras();
                        if (extras != null) {
                            obj2 = extras.get("mavericks:arg");
                        }
                        mo89635G = new C27850r6(m12477f2, obj2, m12477f, savedStateRegistry);
                    }
                    interfaceC32720Et0.mo89503z(mo89635G);
                }
                interfaceC32720Et0.mo89605Q();
                AbstractC35282Pr6 abstractC35282Pr6 = (AbstractC35282Pr6) mo89635G;
                interfaceC32720Et0.mo89638F(511388516);
                boolean mo89539n = interfaceC32720Et0.mo89539n(orCreateKotlinClass) | interfaceC32720Et0.mo89539n(abstractC35282Pr6);
                Object mo89635G2 = interfaceC32720Et0.mo89635G();
                if (mo89539n || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
                    YN2 yn2 = YN2.f45797a;
                    Class javaClass = JvmClassMappingKt.getJavaClass(orCreateKotlinClass);
                    String name = JvmClassMappingKt.getJavaClass(orCreateKotlinClass).getName();
                    Intrinsics.checkNotNullExpressionValue(name, "keyFactory?.invoke() ?: viewModelClass.java.name");
                    mo89635G2 = YN2.m75139c(yn2, javaClass, FinancialConnectionsSheetNativeState.class, abstractC35282Pr6, name, false, null, 48, null);
                    interfaceC32720Et0.mo89503z(mo89635G2);
                }
                interfaceC32720Et0.mo89605Q();
                interfaceC32720Et0.mo89605Q();
                interfaceC32720Et0.mo89605Q();
                FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel = (FinancialConnectionsSheetNativeViewModel) ((RN2) mo89635G2);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                interfaceC32720Et0.mo89605Q();
                return financialConnectionsSheetNativeViewModel;
            }
            throw new IllegalStateException("Composable is not hosted in a ComponentActivity!".toString());
        }
        throw new IllegalStateException("LocalContext is not a ComponentActivity!".toString());
    }
}
