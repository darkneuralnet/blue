package com.stripe.android.uicore.address;

import com.stripe.android.uicore.elements.SectionFieldElement;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.uicore.address.AddressRepository$add$2", m28418f = "AddressRepository.kt", m28417i = {}, m28416l = {54}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class AddressRepository$add$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $countryCode;
    final /* synthetic */ List<SectionFieldElement> $listElements;
    int label;
    final /* synthetic */ AddressRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AddressRepository$add$2(AddressRepository addressRepository, String str, List<? extends SectionFieldElement> list, Continuation<? super AddressRepository$add$2> continuation) {
        super(2, continuation);
        this.this$0 = addressRepository;
        this.$countryCode = str;
        this.$listElements = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddressRepository$add$2(this.this$0, this.$countryCode, this.$listElements, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((AddressRepository$add$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        InterfaceC32730Eu1 interfaceC32730Eu1;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            interfaceC32730Eu1 = this.this$0.countryFieldMap;
            this.label = 1;
            obj = C36708Vu1.m79248w(interfaceC32730Eu1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        ((Map) obj).put(this.$countryCode, this.$listElements);
        return Unit.INSTANCE;
    }
}
