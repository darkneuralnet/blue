package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.module.kotlin.KotlinModule;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, m28432d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ExtensionsKt$kotlinModule$1 extends Lambda implements Function1<KotlinModule.Builder, Unit> {
    public static final ExtensionsKt$kotlinModule$1 INSTANCE = new ExtensionsKt$kotlinModule$1();

    public ExtensionsKt$kotlinModule$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(KotlinModule.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "$this$null");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(KotlinModule.Builder builder) {
        invoke2(builder);
        return Unit.INSTANCE;
    }
}
