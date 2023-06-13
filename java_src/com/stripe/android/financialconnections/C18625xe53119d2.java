package com.stripe.android.financialconnections;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\t\u001a\u00028\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0010\b\u0001\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00020\u0002\"\n\b\u0002\u0010\u0005\u0018\u0001*\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"Landroidx/activity/ComponentActivity;", "T", "LRN2;", "VM", "LAN2;", "S", "invoke", "()LRN2;", "com/stripe/android/financialconnections/utils/MavericksExtensionsKt$viewModelLazy$2", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMavericksExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MavericksExtensions.kt\ncom/stripe/android/financialconnections/utils/MavericksExtensionsKt$viewModelLazy$2\n+ 2 MavericksExtensions.kt\ncom/stripe/android/financialconnections/utils/MavericksExtensionsKt$viewModelLazy$1\n*L\n1#1,56:1\n28#2:57\n*E\n"})
/* renamed from: com.stripe.android.financialconnections.FinancialConnectionsSheetActivity$special$$inlined$viewModelLazy$default$1 */
/* loaded from: classes7.dex */
public final class C18625xe53119d2 extends Lambda implements Function0<FinancialConnectionsSheetViewModel> {
    final /* synthetic */ ComponentActivity $this_viewModelLazy;
    final /* synthetic */ KClass $viewModelClass;
    final /* synthetic */ KClass $viewModelClass$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18625xe53119d2(KClass kClass, ComponentActivity componentActivity, KClass kClass2) {
        super(0);
        this.$viewModelClass = kClass;
        this.$this_viewModelLazy = componentActivity;
        this.$viewModelClass$inlined = kClass2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel, RN2] */
    @Override // kotlin.jvm.functions.Function0
    public final FinancialConnectionsSheetViewModel invoke() {
        YN2 yn2 = YN2.f45797a;
        Class javaClass = JvmClassMappingKt.getJavaClass(this.$viewModelClass);
        ComponentActivity componentActivity = this.$this_viewModelLazy;
        Bundle extras = componentActivity.getIntent().getExtras();
        C27850r6 c27850r6 = new C27850r6(componentActivity, extras != null ? extras.get("mavericks:arg") : null, null, null, 12, null);
        String name = JvmClassMappingKt.getJavaClass(this.$viewModelClass$inlined).getName();
        Intrinsics.checkNotNullExpressionValue(name, "viewModelClass.java.name");
        return YN2.m75139c(yn2, javaClass, FinancialConnectionsSheetState.class, c27850r6, name, false, null, 48, null);
    }
}
