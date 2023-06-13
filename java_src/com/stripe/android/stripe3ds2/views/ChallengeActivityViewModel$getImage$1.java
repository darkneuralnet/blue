package com.stripe.android.stripe3ds2.views;

import android.graphics.Bitmap;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m28432d2 = {"LVs2;", "Landroid/graphics/Bitmap;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
@DebugMetadata(m28419c = "com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$getImage$1", m28418f = "ChallengeActivityViewModel.kt", m28417i = {}, m28416l = {70, 69}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class ChallengeActivityViewModel$getImage$1 extends SuspendLambda implements Function2<InterfaceC36691Vs2<Bitmap>, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $densityDpi;
    final /* synthetic */ ChallengeResponseData.Image $imageData;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChallengeActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeActivityViewModel$getImage$1(ChallengeActivityViewModel challengeActivityViewModel, ChallengeResponseData.Image image, int i, Continuation<? super ChallengeActivityViewModel$getImage$1> continuation) {
        super(2, continuation);
        this.this$0 = challengeActivityViewModel;
        this.$imageData = image;
        this.$densityDpi = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChallengeActivityViewModel$getImage$1 challengeActivityViewModel$getImage$1 = new ChallengeActivityViewModel$getImage$1(this.this$0, this.$imageData, this.$densityDpi, continuation);
        challengeActivityViewModel$getImage$1.L$0 = obj;
        return challengeActivityViewModel$getImage$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC36691Vs2<Bitmap> interfaceC36691Vs2, Continuation<? super Unit> continuation) {
        return ((ChallengeActivityViewModel$getImage$1) create(interfaceC36691Vs2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        InterfaceC36691Vs2 interfaceC36691Vs2;
        ImageRepository imageRepository;
        String str;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC36691Vs2 = (InterfaceC36691Vs2) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            interfaceC36691Vs2 = (InterfaceC36691Vs2) this.L$0;
            imageRepository = this.this$0.imageRepository;
            ChallengeResponseData.Image image = this.$imageData;
            if (image != null) {
                str = image.getUrlForDensity(this.$densityDpi);
            } else {
                str = null;
            }
            this.L$0 = interfaceC36691Vs2;
            this.label = 1;
            obj = imageRepository.getImage$3ds2sdk_release(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.L$0 = null;
        this.label = 2;
        if (interfaceC36691Vs2.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
