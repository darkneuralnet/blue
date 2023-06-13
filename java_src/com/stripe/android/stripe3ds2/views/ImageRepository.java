package com.stripe.android.stripe3ds2.views;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.StripeHttpClient;
import com.stripe.android.stripe3ds2.utils.ImageCache;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p053io.CloseableKt;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0017B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u001f\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/views/ImageRepository;", "", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V", "imageCache", "Lcom/stripe/android/stripe3ds2/utils/ImageCache;", "imageSupplier", "Lcom/stripe/android/stripe3ds2/views/ImageRepository$ImageSupplier;", "(Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/stripe3ds2/utils/ImageCache;Lcom/stripe/android/stripe3ds2/views/ImageRepository$ImageSupplier;)V", "cacheImage", "", "imageUrl", "", Entry.TYPE_IMAGE, "Landroid/graphics/Bitmap;", "getImage", "getImage$3ds2sdk_release", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLocalImage", "getRemoteImage", "ImageSupplier", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ImageRepository {
    private final ImageCache imageCache;
    private final ImageSupplier imageSupplier;
    private final CoroutineContext workContext;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0007J\u001b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/views/ImageRepository$ImageSupplier;", "", "getBitmap", "Landroid/graphics/Bitmap;", "url", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Default", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public interface ImageSupplier {

        @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/views/ImageRepository$ImageSupplier$Default;", "Lcom/stripe/android/stripe3ds2/views/ImageRepository$ImageSupplier;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V", "getBitmap", "Landroid/graphics/Bitmap;", "url", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Default implements ImageSupplier {
            private final ErrorReporter errorReporter;
            private final CoroutineContext workContext;

            public Default(ErrorReporter errorReporter, CoroutineContext workContext) {
                Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
                Intrinsics.checkNotNullParameter(workContext, "workContext");
                this.errorReporter = errorReporter;
                this.workContext = workContext;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0061 A[Catch: all -> 0x0069, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x0032, blocks: (B:12:0x002e, B:23:0x005d, B:26:0x0065, B:34:0x0071, B:25:0x0061), top: B:47:0x002e }] */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x0088  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x00af  */
            /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
            @Override // com.stripe.android.stripe3ds2.views.ImageRepository.ImageSupplier
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Object getBitmap(String str, Continuation<? super Bitmap> continuation) {
                ImageRepository$ImageSupplier$Default$getBitmap$1 imageRepository$ImageSupplier$Default$getBitmap$1;
                Object coroutine_suspended;
                int i;
                Default r0;
                Object m116783constructorimpl;
                Throwable m116786exceptionOrNullimpl;
                InputStream inputStream;
                Bitmap bitmap;
                if (continuation instanceof ImageRepository$ImageSupplier$Default$getBitmap$1) {
                    imageRepository$ImageSupplier$Default$getBitmap$1 = (ImageRepository$ImageSupplier$Default$getBitmap$1) continuation;
                    int i2 = imageRepository$ImageSupplier$Default$getBitmap$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        imageRepository$ImageSupplier$Default$getBitmap$1.label = i2 - Integer.MIN_VALUE;
                        Object obj = imageRepository$ImageSupplier$Default$getBitmap$1.result;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = imageRepository$ImageSupplier$Default$getBitmap$1.label;
                        if (i == 0) {
                            if (i == 1) {
                                str = (String) imageRepository$ImageSupplier$Default$getBitmap$1.L$1;
                                r0 = (Default) imageRepository$ImageSupplier$Default$getBitmap$1.L$0;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                } catch (Throwable th) {
                                    th = th;
                                    Result.Companion companion = Result.Companion;
                                    m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                                    m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                                    if (m116786exceptionOrNullimpl != null) {
                                    }
                                    if (!Result.m116789isFailureimpl(m116783constructorimpl)) {
                                    }
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            try {
                                Result.Companion companion2 = Result.Companion;
                                StripeHttpClient stripeHttpClient = new StripeHttpClient(str, null, this.errorReporter, this.workContext, 2, null);
                                imageRepository$ImageSupplier$Default$getBitmap$1.L$0 = this;
                                imageRepository$ImageSupplier$Default$getBitmap$1.L$1 = str;
                                imageRepository$ImageSupplier$Default$getBitmap$1.label = 1;
                                obj = stripeHttpClient.doGetRequest(imageRepository$ImageSupplier$Default$getBitmap$1);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                r0 = this;
                            } catch (Throwable th2) {
                                th = th2;
                                r0 = this;
                                Result.Companion companion3 = Result.Companion;
                                m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                                if (m116786exceptionOrNullimpl != null) {
                                }
                                if (!Result.m116789isFailureimpl(m116783constructorimpl)) {
                                }
                            }
                        }
                        inputStream = (InputStream) obj;
                        if (inputStream == null) {
                            bitmap = BitmapFactory.decodeStream(inputStream);
                            CloseableKt.closeFinally(inputStream, null);
                        } else {
                            bitmap = null;
                        }
                        m116783constructorimpl = Result.m116783constructorimpl(bitmap);
                        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                        if (m116786exceptionOrNullimpl != null) {
                            r0.errorReporter.reportError(new RuntimeException("Could not get bitmap from url: " + str + CoreConstants.DOT, m116786exceptionOrNullimpl));
                        }
                        if (!Result.m116789isFailureimpl(m116783constructorimpl)) {
                            return null;
                        }
                        return m116783constructorimpl;
                    }
                }
                imageRepository$ImageSupplier$Default$getBitmap$1 = new ImageRepository$ImageSupplier$Default$getBitmap$1(this, continuation);
                Object obj2 = imageRepository$ImageSupplier$Default$getBitmap$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = imageRepository$ImageSupplier$Default$getBitmap$1.label;
                if (i == 0) {
                }
                inputStream = (InputStream) obj2;
                if (inputStream == null) {
                }
                m116783constructorimpl = Result.m116783constructorimpl(bitmap);
                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                if (m116786exceptionOrNullimpl != null) {
                }
                if (!Result.m116789isFailureimpl(m116783constructorimpl)) {
                }
            }
        }

        Object getBitmap(String str, Continuation<? super Bitmap> continuation);
    }

    public ImageRepository(CoroutineContext workContext, ImageCache imageCache, ImageSupplier imageSupplier) {
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        Intrinsics.checkNotNullParameter(imageSupplier, "imageSupplier");
        this.workContext = workContext;
        this.imageCache = imageCache;
        this.imageSupplier = imageSupplier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cacheImage(String str, Bitmap bitmap) {
        if (bitmap != null) {
            this.imageCache.set(str, bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap getLocalImage(String str) {
        return this.imageCache.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getRemoteImage(String str, Continuation<? super Bitmap> continuation) {
        return this.imageSupplier.getBitmap(str, continuation);
    }

    public final Object getImage$3ds2sdk_release(String str, Continuation<? super Bitmap> continuation) {
        return X30.m77504g(this.workContext, new ImageRepository$getImage$2(str, this, null), continuation);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageRepository(ErrorReporter errorReporter, CoroutineContext workContext) {
        this(workContext, ImageCache.Default.INSTANCE, new ImageSupplier.Default(errorReporter, workContext));
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
    }
}
