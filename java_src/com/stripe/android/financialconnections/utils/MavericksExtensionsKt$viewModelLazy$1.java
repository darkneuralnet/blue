package com.stripe.android.financialconnections.utils;

import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0010\b\u0001\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00020\u0002\"\n\b\u0002\u0010\u0005\u0018\u0001*\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Landroidx/activity/ComponentActivity;", "T", "LRN2;", "VM", "LAN2;", "S", "", "kotlin.jvm.PlatformType", "invoke", "()Ljava/lang/String;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMavericksExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MavericksExtensions.kt\ncom/stripe/android/financialconnections/utils/MavericksExtensionsKt$viewModelLazy$1\n*L\n1#1,56:1\n*E\n"})
/* loaded from: classes7.dex */
public final class MavericksExtensionsKt$viewModelLazy$1 extends Lambda implements Function0<String> {
    final /* synthetic */ KClass $viewModelClass;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MavericksExtensionsKt$viewModelLazy$1(KClass kClass) {
        super(0);
        this.$viewModelClass = kClass;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String name = JvmClassMappingKt.getJavaClass(this.$viewModelClass).getName();
        Intrinsics.checkNotNullExpressionValue(name, "viewModelClass.java.name");
        return name;
    }
}
