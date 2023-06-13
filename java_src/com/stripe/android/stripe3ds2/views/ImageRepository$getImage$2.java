package com.stripe.android.stripe3ds2.views;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Landroid/graphics/Bitmap;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
@DebugMetadata(m28419c = "com.stripe.android.stripe3ds2.views.ImageRepository$getImage$2", m28418f = "ImageRepository.kt", m28417i = {}, m28416l = {33}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class ImageRepository$getImage$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super Bitmap>, Object> {
    final /* synthetic */ String $imageUrl;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ImageRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageRepository$getImage$2(String str, ImageRepository imageRepository, Continuation<? super ImageRepository$getImage$2> continuation) {
        super(2, continuation);
        this.$imageUrl = str;
        this.this$0 = imageRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ImageRepository$getImage$2(this.$imageUrl, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Bitmap> continuation) {
        return ((ImageRepository$getImage$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        ImageRepository imageRepository;
        Bitmap localImage;
        Object remoteImage;
        String str;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                str = (String) this.L$1;
                imageRepository = (ImageRepository) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            String str2 = this.$imageUrl;
            if (str2 != null) {
                imageRepository = this.this$0;
                localImage = imageRepository.getLocalImage(str2);
                if (localImage == null) {
                    this.L$0 = imageRepository;
                    this.L$1 = str2;
                    this.label = 1;
                    remoteImage = imageRepository.getRemoteImage(str2, this);
                    if (remoteImage == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = str2;
                    obj = remoteImage;
                } else {
                    return localImage;
                }
            } else {
                return null;
            }
        }
        Bitmap bitmap = (Bitmap) obj;
        imageRepository.cacheImage(str, bitmap);
        return bitmap;
    }
}
