package com.stripe.android.stripe3ds2.views;

import com.stripe.android.stripe3ds2.views.ImageRepository;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.stripe3ds2.views.ImageRepository$ImageSupplier$Default", m28418f = "ImageRepository.kt", m28417i = {0, 0}, m28416l = {60}, m28415m = "getBitmap", m28414n = {"this", "url"}, m28413s = {"L$0", "L$1"})
/* loaded from: classes7.dex */
public final class ImageRepository$ImageSupplier$Default$getBitmap$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ImageRepository.ImageSupplier.Default this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageRepository$ImageSupplier$Default$getBitmap$1(ImageRepository.ImageSupplier.Default r1, Continuation<? super ImageRepository$ImageSupplier$Default$getBitmap$1> continuation) {
        super(continuation);
        this.this$0 = r1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getBitmap(null, this);
    }
}
