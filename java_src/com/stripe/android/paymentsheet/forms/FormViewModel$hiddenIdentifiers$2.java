package com.stripe.android.paymentsheet.forms;

import com.stripe.android.p049ui.core.elements.SaveForFutureUseElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, m28432d2 = {"", "showFutureUse", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "cardBillingIdentifiers", "saveFutureUseIdentifiers", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.forms.FormViewModel$hiddenIdentifiers$2", m28418f = "FormViewModel.kt", m28417i = {0, 0}, m28416l = {116}, m28415m = "invokeSuspend", m28414n = {"hiddenIdentifiers", "showFutureUse"}, m28413s = {"L$0", "Z$0"})
/* loaded from: classes7.dex */
public final class FormViewModel$hiddenIdentifiers$2 extends SuspendLambda implements Function4<Boolean, Set<? extends IdentifierSpec>, Set<? extends IdentifierSpec>, Continuation<? super Set<? extends IdentifierSpec>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ FormViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormViewModel$hiddenIdentifiers$2(FormViewModel formViewModel, Continuation<? super FormViewModel$hiddenIdentifiers$2> continuation) {
        super(4, continuation);
        this.this$0 = formViewModel;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Set<? extends IdentifierSpec> set, Set<? extends IdentifierSpec> set2, Continuation<? super Set<? extends IdentifierSpec>> continuation) {
        return invoke(bool.booleanValue(), (Set<IdentifierSpec>) set, (Set<IdentifierSpec>) set2, (Continuation<? super Set<IdentifierSpec>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Set plus;
        InterfaceC32730Eu1 interfaceC32730Eu1;
        boolean z;
        Set plus2;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                z = this.Z$0;
                plus = (Set) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            boolean z2 = this.Z$0;
            plus = SetsKt___SetsKt.plus((Set) this.L$1, (Iterable) ((Set) this.L$0));
            interfaceC32730Eu1 = this.this$0.saveForFutureUseElement;
            this.L$0 = plus;
            this.Z$0 = z2;
            this.label = 1;
            Object m79246y = C36708Vu1.m79246y(interfaceC32730Eu1, this);
            if (m79246y == coroutine_suspended) {
                return coroutine_suspended;
            }
            z = z2;
            obj = m79246y;
        }
        SaveForFutureUseElement saveForFutureUseElement = (SaveForFutureUseElement) obj;
        if (!z && saveForFutureUseElement != null) {
            plus2 = SetsKt___SetsKt.plus(plus, saveForFutureUseElement.getIdentifier());
            return plus2;
        }
        return plus;
    }

    public final Object invoke(boolean z, Set<IdentifierSpec> set, Set<IdentifierSpec> set2, Continuation<? super Set<IdentifierSpec>> continuation) {
        FormViewModel$hiddenIdentifiers$2 formViewModel$hiddenIdentifiers$2 = new FormViewModel$hiddenIdentifiers$2(this.this$0, continuation);
        formViewModel$hiddenIdentifiers$2.Z$0 = z;
        formViewModel$hiddenIdentifiers$2.L$0 = set;
        formViewModel$hiddenIdentifiers$2.L$1 = set2;
        return formViewModel$hiddenIdentifiers$2.invokeSuspend(Unit.INSTANCE);
    }
}
