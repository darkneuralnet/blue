package com.stripe.android.uicore.text;

import android.graphics.Bitmap;
import com.stripe.android.uicore.image.StripeImageLoader;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import p000.C1577Df;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.uicore.text.HtmlKt$rememberRemoteImages$1$deferred$1$1", m28418f = "Html.kt", m28417i = {}, m28416l = {163}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class HtmlKt$rememberRemoteImages$1$deferred$1$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Pair<? extends String, ? extends Bitmap>>, Object> {
    final /* synthetic */ StripeImageLoader $stripeImageLoader;
    final /* synthetic */ C1577Df.C1580b<String> $url;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlKt$rememberRemoteImages$1$deferred$1$1(C1577Df.C1580b<String> c1580b, StripeImageLoader stripeImageLoader, Continuation<? super HtmlKt$rememberRemoteImages$1$deferred$1$1> continuation) {
        super(2, continuation);
        this.$url = c1580b;
        this.$stripeImageLoader = stripeImageLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HtmlKt$rememberRemoteImages$1$deferred$1$1(this.$url, this.$stripeImageLoader, continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(ZC0 zc0, Continuation<? super Pair<String, Bitmap>> continuation) {
        return ((HtmlKt$rememberRemoteImages$1$deferred$1$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Object obj2;
        Object obj3;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                obj2 = this.L$0;
                ResultKt.throwOnFailure(obj);
                obj3 = ((Result) obj).m116792unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            String m110028e = this.$url.m110028e();
            this.L$0 = m110028e;
            this.label = 1;
            Object m116767loadgIAlus = this.$stripeImageLoader.m116767loadgIAlus(this.$url.m110028e(), this);
            if (m116767loadgIAlus == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj2 = m110028e;
            obj3 = m116767loadgIAlus;
        }
        if (Result.m116789isFailureimpl(obj3)) {
            obj3 = null;
        }
        return new Pair(obj2, obj3);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Continuation<? super Pair<? extends String, ? extends Bitmap>> continuation) {
        return invoke2(zc0, (Continuation<? super Pair<String, Bitmap>>) continuation);
    }
}
