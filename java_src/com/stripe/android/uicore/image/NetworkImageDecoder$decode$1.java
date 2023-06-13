package com.stripe.android.uicore.image;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.uicore.image.NetworkImageDecoder", m28418f = "NetworkImageDecoder.kt", m28417i = {0, 0, 0, 0, 0}, m28416l = {28, 33}, m28415m = "decode", m28414n = {"this", "url", "$this$decode_u24lambda_u240", "width", "height"}, m28413s = {"L$0", "L$1", "L$2", "I$0", "I$1"})
/* loaded from: classes7.dex */
public final class NetworkImageDecoder$decode$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NetworkImageDecoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkImageDecoder$decode$1(NetworkImageDecoder networkImageDecoder, Continuation<? super NetworkImageDecoder$decode$1> continuation) {
        super(continuation);
        this.this$0 = networkImageDecoder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.decode(null, 0, 0, this);
    }
}
