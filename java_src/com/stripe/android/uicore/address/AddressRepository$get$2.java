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
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.uicore.address.AddressRepository$get$2", m28418f = "AddressRepository.kt", m28417i = {0}, m28416l = {61, 62}, m28415m = "invokeSuspend", m28414n = {"it"}, m28413s = {"L$0"})
/* loaded from: classes7.dex */
public final class AddressRepository$get$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super List<? extends SectionFieldElement>>, Object> {
    final /* synthetic */ String $countryCode;
    Object L$0;
    int label;
    final /* synthetic */ AddressRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressRepository$get$2(String str, AddressRepository addressRepository, Continuation<? super AddressRepository$get$2> continuation) {
        super(2, continuation);
        this.$countryCode = str;
        this.this$0 = addressRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddressRepository$get$2(this.$countryCode, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super List<? extends SectionFieldElement>> continuation) {
        return ((AddressRepository$get$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        String str;
        InterfaceC32730Eu1 interfaceC32730Eu1;
        InterfaceC32730Eu1 interfaceC32730Eu12;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return (List) ((Map) obj).get("ZZ");
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            str = this.$countryCode;
            if (str != null) {
                interfaceC32730Eu1 = this.this$0.countryFieldMap;
                this.L$0 = str;
                this.label = 1;
                obj = C36708Vu1.m79248w(interfaceC32730Eu1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            interfaceC32730Eu12 = this.this$0.countryFieldMap;
            this.L$0 = null;
            this.label = 2;
            obj = C36708Vu1.m79248w(interfaceC32730Eu12, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (List) ((Map) obj).get("ZZ");
        }
        List list = (List) ((Map) obj).get(str);
        if (list != null) {
            return list;
        }
        interfaceC32730Eu12 = this.this$0.countryFieldMap;
        this.L$0 = null;
        this.label = 2;
        obj = C36708Vu1.m79248w(interfaceC32730Eu12, this);
        if (obj == coroutine_suspended) {
        }
        return (List) ((Map) obj).get("ZZ");
    }
}
