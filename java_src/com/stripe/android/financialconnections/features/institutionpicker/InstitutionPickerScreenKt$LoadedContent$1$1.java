package com.stripe.android.financialconnections.features.institutionpicker;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt$LoadedContent$1$1", m28418f = "InstitutionPickerScreen.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class InstitutionPickerScreenKt$LoadedContent$1$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ EX2<F16> $input$delegate;
    final /* synthetic */ boolean $searchMode;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstitutionPickerScreenKt$LoadedContent$1$1(boolean z, EX2<F16> ex2, Continuation<? super InstitutionPickerScreenKt$LoadedContent$1$1> continuation) {
        super(2, continuation);
        this.$searchMode = z;
        this.$input$delegate = ex2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InstitutionPickerScreenKt$LoadedContent$1$1(this.$searchMode, this.$input$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((InstitutionPickerScreenKt$LoadedContent$1$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.$searchMode) {
                this.$input$delegate.setValue(new F16((String) null, 0L, (C48413s26) null, 7, (DefaultConstructorMarker) null));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}