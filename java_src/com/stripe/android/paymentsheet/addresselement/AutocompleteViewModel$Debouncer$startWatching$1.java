package com.stripe.android.paymentsheet.addresselement;

import androidx.recyclerview.widget.C11925l;
import com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import p000.InterfaceC52943zh2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel$Debouncer$startWatching$1", m28418f = "AutocompleteViewModel.kt", m28417i = {}, m28416l = {C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class AutocompleteViewModel$Debouncer$startWatching$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<String, Unit> $onValidQuery;
    final /* synthetic */ InterfaceC49220tP5<String> $queryFlow;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AutocompleteViewModel.Debouncer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AutocompleteViewModel$Debouncer$startWatching$1(InterfaceC49220tP5<String> interfaceC49220tP5, AutocompleteViewModel.Debouncer debouncer, Function1<? super String, Unit> function1, Continuation<? super AutocompleteViewModel$Debouncer$startWatching$1> continuation) {
        super(2, continuation);
        this.$queryFlow = interfaceC49220tP5;
        this.this$0 = debouncer;
        this.$onValidQuery = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AutocompleteViewModel$Debouncer$startWatching$1 autocompleteViewModel$Debouncer$startWatching$1 = new AutocompleteViewModel$Debouncer$startWatching$1(this.$queryFlow, this.this$0, this.$onValidQuery, continuation);
        autocompleteViewModel$Debouncer$startWatching$1.L$0 = obj;
        return autocompleteViewModel$Debouncer$startWatching$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((AutocompleteViewModel$Debouncer$startWatching$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            final ZC0 zc0 = (ZC0) this.L$0;
            InterfaceC49220tP5<String> interfaceC49220tP5 = this.$queryFlow;
            final AutocompleteViewModel.Debouncer debouncer = this.this$0;
            final Function1<String, Unit> function1 = this.$onValidQuery;
            InterfaceC33198Gu1<String> interfaceC33198Gu1 = new InterfaceC33198Gu1<String>() { // from class: com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel$Debouncer$startWatching$1.1
                @Override // p000.InterfaceC33198Gu1
                public /* bridge */ /* synthetic */ Object emit(String str, Continuation continuation) {
                    return emit2(str, (Continuation<? super Unit>) continuation);
                }

                /* renamed from: emit  reason: avoid collision after fix types in other method */
                public final Object emit2(String str, Continuation<? super Unit> continuation) {
                    InterfaceC52943zh2 interfaceC52943zh2;
                    InterfaceC52943zh2 m73800d;
                    if (str != null) {
                        AutocompleteViewModel.Debouncer debouncer2 = AutocompleteViewModel.Debouncer.this;
                        ZC0 zc02 = zc0;
                        Function1<String, Unit> function12 = function1;
                        interfaceC52943zh2 = debouncer2.searchJob;
                        if (interfaceC52943zh2 != null) {
                            InterfaceC52943zh2.C31478a.m550a(interfaceC52943zh2, null, 1, null);
                        }
                        if (str.length() > 3) {
                            m73800d = Z30.m73800d(zc02, null, null, new AutocompleteViewModel$Debouncer$startWatching$1$1$emit$2$1(function12, str, null), 3, null);
                            debouncer2.searchJob = m73800d;
                        }
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (interfaceC49220tP5.collect(interfaceC33198Gu1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        throw new KotlinNothingValueException();
    }
}
