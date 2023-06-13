package com.stripe.android.financialconnections.utils;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
/* JADX WARN: Incorrect field signature: TT; */
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00028\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0010\b\u0001\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00020\u0002\"\n\b\u0002\u0010\u0005\u0018\u0001*\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Landroidx/activity/ComponentActivity;", "T", "LRN2;", "VM", "LAN2;", "S", "invoke", "()LRN2;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMavericksExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MavericksExtensions.kt\ncom/stripe/android/financialconnections/utils/MavericksExtensionsKt$viewModelLazy$2\n*L\n1#1,56:1\n*E\n"})
/* loaded from: classes7.dex */
public final class MavericksExtensionsKt$viewModelLazy$2 extends Lambda implements Function0<VM> {
    final /* synthetic */ Function0<String> $keyFactory;
    final /* synthetic */ ComponentActivity $this_viewModelLazy;
    final /* synthetic */ KClass<VM> $viewModelClass;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lkotlin/reflect/KClass<TVM;>;TT;Lkotlin/jvm/functions/Function0<Ljava/lang/String;>;)V */
    public MavericksExtensionsKt$viewModelLazy$2(KClass kClass, ComponentActivity componentActivity, Function0 function0) {
        super(0);
        this.$viewModelClass = kClass;
        this.$this_viewModelLazy = componentActivity;
        this.$keyFactory = function0;
    }

    /* JADX WARN: Incorrect return type in method signature: ()TVM; */
    @Override // kotlin.jvm.functions.Function0
    public final RN2 invoke() {
        YN2 yn2 = YN2.f45797a;
        Class javaClass = JvmClassMappingKt.getJavaClass((KClass) this.$viewModelClass);
        Intrinsics.reifiedOperationMarker(4, "S");
        ComponentActivity componentActivity = this.$this_viewModelLazy;
        Bundle extras = componentActivity.getIntent().getExtras();
        return YN2.m75139c(yn2, javaClass, AN2.class, new C27850r6(componentActivity, extras != null ? extras.get("mavericks:arg") : null, null, null, 12, null), this.$keyFactory.invoke(), false, null, 48, null);
    }
}
