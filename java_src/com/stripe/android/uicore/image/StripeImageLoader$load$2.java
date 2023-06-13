package com.stripe.android.uicore.image;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Lkotlin/Result;", "Landroid/graphics/Bitmap;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.uicore.image.StripeImageLoader$load$2", m28418f = "StripeImageLoader.kt", m28417i = {}, m28416l = {50}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class StripeImageLoader$load$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super Result<? extends Bitmap>>, Object> {
    final /* synthetic */ int $height;
    final /* synthetic */ String $url;
    final /* synthetic */ int $width;
    int label;
    final /* synthetic */ StripeImageLoader this$0;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m28432d2 = {"Lkotlin/Result;", "Landroid/graphics/Bitmap;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.uicore.image.StripeImageLoader$load$2$1", m28418f = "StripeImageLoader.kt", m28417i = {}, m28416l = {51}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.uicore.image.StripeImageLoader$load$2$1 */
    /* loaded from: classes7.dex */
    public static final class C194971 extends SuspendLambda implements Function1<Continuation<? super Result<? extends Bitmap>>, Object> {
        final /* synthetic */ int $height;
        final /* synthetic */ String $url;
        final /* synthetic */ int $width;
        int label;
        final /* synthetic */ StripeImageLoader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194971(StripeImageLoader stripeImageLoader, String str, int i, int i2, Continuation<? super C194971> continuation) {
            super(1, continuation);
            this.this$0 = stripeImageLoader;
            this.$url = str;
            this.$width = i;
            this.$height = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C194971(this.this$0, this.$url, this.$width, this.$height, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Result<? extends Bitmap>> continuation) {
            return invoke2((Continuation<? super Result<Bitmap>>) continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
            r6 = r5.this$0.m116762loadFromDiskCmtIpJM(r5.$url);
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            Result m116763loadFromMemoryCmtIpJM;
            Object m116764loadFromNetworkBWLJW6A;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    m116764loadFromNetworkBWLJW6A = ((Result) obj).m116792unboximpl();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                m116763loadFromMemoryCmtIpJM = this.this$0.m116763loadFromMemoryCmtIpJM(this.$url);
                if (m116763loadFromMemoryCmtIpJM != null || m116763loadFromMemoryCmtIpJM != null) {
                    m116764loadFromNetworkBWLJW6A = m116763loadFromMemoryCmtIpJM.m116792unboximpl();
                } else {
                    StripeImageLoader stripeImageLoader = this.this$0;
                    String str = this.$url;
                    int i2 = this.$width;
                    int i3 = this.$height;
                    this.label = 1;
                    m116764loadFromNetworkBWLJW6A = stripeImageLoader.m116764loadFromNetworkBWLJW6A(str, i2, i3, this);
                    if (m116764loadFromNetworkBWLJW6A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Result.m116782boximpl(m116764loadFromNetworkBWLJW6A);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Result<Bitmap>> continuation) {
            return ((C194971) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeImageLoader$load$2(StripeImageLoader stripeImageLoader, String str, int i, int i2, Continuation<? super StripeImageLoader$load$2> continuation) {
        super(2, continuation);
        this.this$0 = stripeImageLoader;
        this.$url = str;
        this.$width = i;
        this.$height = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StripeImageLoader$load$2(this.this$0, this.$url, this.$width, this.$height, continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(ZC0 zc0, Continuation<? super Result<Bitmap>> continuation) {
        return ((StripeImageLoader$load$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
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
            StripeImageLoader stripeImageLoader = this.this$0;
            String str = this.$url;
            C194971 c194971 = new C194971(stripeImageLoader, str, this.$width, this.$height, null);
            this.label = 1;
            obj = stripeImageLoader.withMutexByUrlLock(str, c194971, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Continuation<? super Result<? extends Bitmap>> continuation) {
        return invoke2(zc0, (Continuation<? super Result<Bitmap>>) continuation);
    }
}
