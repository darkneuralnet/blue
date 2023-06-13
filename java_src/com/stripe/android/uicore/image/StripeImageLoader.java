package com.stripe.android.uicore.image;

import android.content.Context;
import android.graphics.Bitmap;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.Logger;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 32\u00020\u0001:\u00013B;\u0012\u0006\u00100\u001a\u00020/\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010&\u001a\u00020%\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b1\u00102J(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\u0007J<\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0083@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ,\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0083@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\u0012J?\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u0016\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014H\u0082@ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J<\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\u000fJ,\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u001e\u0010\u0012R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u0004\u0018\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u0004\u0018\u00010(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00064"}, m28432d2 = {"Lcom/stripe/android/uicore/image/StripeImageLoader;", "", "", "url", "Lkotlin/Result;", "Landroid/graphics/Bitmap;", "loadFromMemory-CmtIpJM", "(Ljava/lang/String;)Lkotlin/Result;", "loadFromMemory", "loadFromDisk-CmtIpJM", "loadFromDisk", "", "width", "height", "loadFromNetwork-BWLJW6A", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFromNetwork", "loadFromNetwork-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "action", "withMutexByUrlLock", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "message", "", "debug", "load-BWLJW6A", "load", "load-gIAlu-s", "Lcom/stripe/android/core/Logger;", "logger", "Lcom/stripe/android/core/Logger;", "Lcom/stripe/android/uicore/image/ImageLruMemoryCache;", "memoryCache", "Lcom/stripe/android/uicore/image/ImageLruMemoryCache;", "Lcom/stripe/android/uicore/image/NetworkImageDecoder;", "networkImageDecoder", "Lcom/stripe/android/uicore/image/NetworkImageDecoder;", "Lcom/stripe/android/uicore/image/ImageLruDiskCache;", "diskCache", "Lcom/stripe/android/uicore/image/ImageLruDiskCache;", "Ljava/util/concurrent/ConcurrentHashMap;", "LSX2;", "imageLoadMutexes", "Ljava/util/concurrent/ConcurrentHashMap;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;Lcom/stripe/android/core/Logger;Lcom/stripe/android/uicore/image/ImageLruMemoryCache;Lcom/stripe/android/uicore/image/NetworkImageDecoder;Lcom/stripe/android/uicore/image/ImageLruDiskCache;)V", "Companion", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStripeImageLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeImageLoader.kt\ncom/stripe/android/uicore/image/StripeImageLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 4 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,139:1\n1#2:140\n1#2:143\n73#3,2:141\n107#4,10:144\n*S KotlinDebug\n*F\n+ 1 StripeImageLoader.kt\ncom/stripe/android/uicore/image/StripeImageLoader\n*L\n121#1:143\n121#1:141,2\n121#1:144,10\n*E\n"})
/* loaded from: classes7.dex */
public final class StripeImageLoader {
    @Deprecated
    private static final String TAG = "StripeImageLoader";
    private final ImageLruDiskCache diskCache;
    private final ConcurrentHashMap<String, SX2> imageLoadMutexes;
    private final Logger logger;
    private final ImageLruMemoryCache memoryCache;
    private final NetworkImageDecoder networkImageDecoder;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/uicore/image/StripeImageLoader$Companion;", "", "()V", "TAG", "", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public StripeImageLoader(Context context, Logger logger, ImageLruMemoryCache imageLruMemoryCache, NetworkImageDecoder networkImageDecoder, ImageLruDiskCache imageLruDiskCache) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(networkImageDecoder, "networkImageDecoder");
        this.logger = logger;
        this.memoryCache = imageLruMemoryCache;
        this.networkImageDecoder = networkImageDecoder;
        this.diskCache = imageLruDiskCache;
        this.imageLoadMutexes = new ConcurrentHashMap<>();
    }

    private final void debug(String str) {
        Logger logger = this.logger;
        logger.debug("StripeImageLoader: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadFromDisk-CmtIpJM  reason: not valid java name */
    public final Result<Bitmap> m116762loadFromDiskCmtIpJM(String str) {
        Bitmap bitmap;
        ImageLruDiskCache imageLruDiskCache = this.diskCache;
        if (imageLruDiskCache != null) {
            bitmap = imageLruDiskCache.getBitmap(str);
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            debug("Image loaded from disk cache");
        } else {
            debug("Image not found on disk cache");
        }
        if (bitmap == null) {
            return null;
        }
        ImageLruMemoryCache imageLruMemoryCache = this.memoryCache;
        if (imageLruMemoryCache != null) {
            imageLruMemoryCache.put(str, bitmap);
        }
        return Result.m116782boximpl(Result.m116783constructorimpl(bitmap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadFromMemory-CmtIpJM  reason: not valid java name */
    public final Result<Bitmap> m116763loadFromMemoryCmtIpJM(String str) {
        Bitmap bitmap;
        ImageLruMemoryCache imageLruMemoryCache = this.memoryCache;
        if (imageLruMemoryCache != null) {
            bitmap = imageLruMemoryCache.getBitmap(str);
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            debug("Image loaded from memory cache");
        } else {
            debug("Image not found on memory cache");
        }
        if (bitmap == null) {
            return null;
        }
        ImageLruDiskCache imageLruDiskCache = this.diskCache;
        if (imageLruDiskCache != null) {
            imageLruDiskCache.put(str, bitmap);
        }
        return Result.m116782boximpl(Result.m116783constructorimpl(bitmap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:23:0x0079, B:25:0x007d, B:27:0x0081, B:28:0x0084, B:30:0x0088, B:32:0x008d), top: B:41:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4  */
    /* renamed from: loadFromNetwork-BWLJW6A  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116764loadFromNetworkBWLJW6A(String str, int i, int i2, Continuation<? super Result<Bitmap>> continuation) {
        StripeImageLoader$loadFromNetwork$1 stripeImageLoader$loadFromNetwork$1;
        Object coroutine_suspended;
        int i3;
        StripeImageLoader stripeImageLoader;
        Object m116783constructorimpl;
        Throwable m116786exceptionOrNullimpl;
        Bitmap bitmap;
        if (continuation instanceof StripeImageLoader$loadFromNetwork$1) {
            stripeImageLoader$loadFromNetwork$1 = (StripeImageLoader$loadFromNetwork$1) continuation;
            int i4 = stripeImageLoader$loadFromNetwork$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                stripeImageLoader$loadFromNetwork$1.label = i4 - Integer.MIN_VALUE;
                Object obj = stripeImageLoader$loadFromNetwork$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = stripeImageLoader$loadFromNetwork$1.label;
                if (i3 == 0) {
                    if (i3 == 1) {
                        str = (String) stripeImageLoader$loadFromNetwork$1.L$1;
                        stripeImageLoader = (StripeImageLoader) stripeImageLoader$loadFromNetwork$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Throwable th) {
                            th = th;
                            Result.Companion companion = Result.Companion;
                            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                            m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                            if (m116786exceptionOrNullimpl != null) {
                            }
                            return m116783constructorimpl;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    try {
                        Result.Companion companion2 = Result.Companion;
                        debug("Image " + str + " loading from internet (" + i + " x " + i2 + ")");
                        NetworkImageDecoder networkImageDecoder = this.networkImageDecoder;
                        stripeImageLoader$loadFromNetwork$1.L$0 = this;
                        stripeImageLoader$loadFromNetwork$1.L$1 = str;
                        stripeImageLoader$loadFromNetwork$1.label = 1;
                        obj = networkImageDecoder.decode(str, i, i2, stripeImageLoader$loadFromNetwork$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        stripeImageLoader = this;
                    } catch (Throwable th2) {
                        th = th2;
                        stripeImageLoader = this;
                        Result.Companion companion3 = Result.Companion;
                        m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                        if (m116786exceptionOrNullimpl != null) {
                        }
                        return m116783constructorimpl;
                    }
                }
                bitmap = (Bitmap) obj;
                if (bitmap == null) {
                    ImageLruDiskCache imageLruDiskCache = stripeImageLoader.diskCache;
                    if (imageLruDiskCache != null) {
                        imageLruDiskCache.put(str, bitmap);
                    }
                    ImageLruMemoryCache imageLruMemoryCache = stripeImageLoader.memoryCache;
                    if (imageLruMemoryCache != null) {
                        imageLruMemoryCache.put(str, bitmap);
                    }
                } else {
                    bitmap = null;
                }
                m116783constructorimpl = Result.m116783constructorimpl(bitmap);
                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                if (m116786exceptionOrNullimpl != null) {
                    stripeImageLoader.logger.error("StripeImageLoader: Could not load image from network", m116786exceptionOrNullimpl);
                }
                return m116783constructorimpl;
            }
        }
        stripeImageLoader$loadFromNetwork$1 = new StripeImageLoader$loadFromNetwork$1(this, continuation);
        Object obj2 = stripeImageLoader$loadFromNetwork$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = stripeImageLoader$loadFromNetwork$1.label;
        if (i3 == 0) {
        }
        bitmap = (Bitmap) obj2;
        if (bitmap == null) {
        }
        m116783constructorimpl = Result.m116783constructorimpl(bitmap);
        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl != null) {
        }
        return m116783constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:23:0x0069, B:25:0x006d, B:27:0x0071, B:28:0x0074, B:30:0x0078, B:32:0x007d), top: B:41:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* renamed from: loadFromNetwork-gIAlu-s  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116765loadFromNetworkgIAlus(String str, Continuation<? super Result<Bitmap>> continuation) {
        StripeImageLoader$loadFromNetwork$4 stripeImageLoader$loadFromNetwork$4;
        Object coroutine_suspended;
        int i;
        StripeImageLoader stripeImageLoader;
        Object m116783constructorimpl;
        Throwable m116786exceptionOrNullimpl;
        Bitmap bitmap;
        if (continuation instanceof StripeImageLoader$loadFromNetwork$4) {
            stripeImageLoader$loadFromNetwork$4 = (StripeImageLoader$loadFromNetwork$4) continuation;
            int i2 = stripeImageLoader$loadFromNetwork$4.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeImageLoader$loadFromNetwork$4.label = i2 - Integer.MIN_VALUE;
                Object obj = stripeImageLoader$loadFromNetwork$4.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeImageLoader$loadFromNetwork$4.label;
                if (i == 0) {
                    if (i == 1) {
                        str = (String) stripeImageLoader$loadFromNetwork$4.L$1;
                        stripeImageLoader = (StripeImageLoader) stripeImageLoader$loadFromNetwork$4.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Throwable th) {
                            th = th;
                            Result.Companion companion = Result.Companion;
                            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                            m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                            if (m116786exceptionOrNullimpl != null) {
                            }
                            return m116783constructorimpl;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    try {
                        Result.Companion companion2 = Result.Companion;
                        debug("Image " + str + " loading from internet");
                        NetworkImageDecoder networkImageDecoder = this.networkImageDecoder;
                        stripeImageLoader$loadFromNetwork$4.L$0 = this;
                        stripeImageLoader$loadFromNetwork$4.L$1 = str;
                        stripeImageLoader$loadFromNetwork$4.label = 1;
                        obj = networkImageDecoder.decode(str, stripeImageLoader$loadFromNetwork$4);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        stripeImageLoader = this;
                    } catch (Throwable th2) {
                        th = th2;
                        stripeImageLoader = this;
                        Result.Companion companion3 = Result.Companion;
                        m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                        if (m116786exceptionOrNullimpl != null) {
                        }
                        return m116783constructorimpl;
                    }
                }
                bitmap = (Bitmap) obj;
                if (bitmap == null) {
                    ImageLruDiskCache imageLruDiskCache = stripeImageLoader.diskCache;
                    if (imageLruDiskCache != null) {
                        imageLruDiskCache.put(str, bitmap);
                    }
                    ImageLruMemoryCache imageLruMemoryCache = stripeImageLoader.memoryCache;
                    if (imageLruMemoryCache != null) {
                        imageLruMemoryCache.put(str, bitmap);
                    }
                } else {
                    bitmap = null;
                }
                m116783constructorimpl = Result.m116783constructorimpl(bitmap);
                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                if (m116786exceptionOrNullimpl != null) {
                    stripeImageLoader.logger.error("StripeImageLoader: Could not load image from network", m116786exceptionOrNullimpl);
                }
                return m116783constructorimpl;
            }
        }
        stripeImageLoader$loadFromNetwork$4 = new StripeImageLoader$loadFromNetwork$4(this, continuation);
        Object obj2 = stripeImageLoader$loadFromNetwork$4.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeImageLoader$loadFromNetwork$4.label;
        if (i == 0) {
        }
        bitmap = (Bitmap) obj2;
        if (bitmap == null) {
        }
        m116783constructorimpl = Result.m116783constructorimpl(bitmap);
        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl != null) {
        }
        return m116783constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object withMutexByUrlLock(String str, Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        StripeImageLoader$withMutexByUrlLock$1 stripeImageLoader$withMutexByUrlLock$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        SX2 sx2;
        StripeImageLoader stripeImageLoader;
        SX2 putIfAbsent;
        SX2 sx22;
        String str2;
        StripeImageLoader stripeImageLoader2;
        try {
            if (continuation instanceof StripeImageLoader$withMutexByUrlLock$1) {
                stripeImageLoader$withMutexByUrlLock$1 = (StripeImageLoader$withMutexByUrlLock$1) continuation;
                int i2 = stripeImageLoader$withMutexByUrlLock$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    stripeImageLoader$withMutexByUrlLock$1.label = i2 - Integer.MIN_VALUE;
                    obj = stripeImageLoader$withMutexByUrlLock$1.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = stripeImageLoader$withMutexByUrlLock$1.label;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                sx22 = (SX2) stripeImageLoader$withMutexByUrlLock$1.L$2;
                                str2 = (String) stripeImageLoader$withMutexByUrlLock$1.L$1;
                                stripeImageLoader2 = (StripeImageLoader) stripeImageLoader$withMutexByUrlLock$1.L$0;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    sx22.mo83451b(null);
                                    stripeImageLoader2.imageLoadMutexes.remove(str2);
                                    return obj;
                                } catch (Throwable th) {
                                    th = th;
                                    sx22.mo83451b(null);
                                    throw th;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        function1 = (Function1) stripeImageLoader$withMutexByUrlLock$1.L$2;
                        String str3 = (String) stripeImageLoader$withMutexByUrlLock$1.L$1;
                        stripeImageLoader = (StripeImageLoader) stripeImageLoader$withMutexByUrlLock$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        sx2 = (SX2) stripeImageLoader$withMutexByUrlLock$1.L$3;
                        str = str3;
                    } else {
                        ResultKt.throwOnFailure(obj);
                        ConcurrentHashMap<String, SX2> concurrentHashMap = this.imageLoadMutexes;
                        SX2 sx23 = concurrentHashMap.get(str);
                        if (sx23 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (sx23 = UX2.m81380b(false, 1, null)))) != null) {
                            sx23 = putIfAbsent;
                        }
                        Intrinsics.checkNotNullExpressionValue(sx23, "imageLoadMutexes.getOrPut(url) { Mutex() }");
                        sx2 = sx23;
                        stripeImageLoader$withMutexByUrlLock$1.L$0 = this;
                        stripeImageLoader$withMutexByUrlLock$1.L$1 = str;
                        stripeImageLoader$withMutexByUrlLock$1.L$2 = function1;
                        stripeImageLoader$withMutexByUrlLock$1.L$3 = sx2;
                        stripeImageLoader$withMutexByUrlLock$1.label = 1;
                        if (sx2.mo83452a(null, stripeImageLoader$withMutexByUrlLock$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        stripeImageLoader = this;
                    }
                    stripeImageLoader$withMutexByUrlLock$1.L$0 = stripeImageLoader;
                    stripeImageLoader$withMutexByUrlLock$1.L$1 = str;
                    stripeImageLoader$withMutexByUrlLock$1.L$2 = sx2;
                    stripeImageLoader$withMutexByUrlLock$1.L$3 = null;
                    stripeImageLoader$withMutexByUrlLock$1.label = 2;
                    obj = function1.invoke(stripeImageLoader$withMutexByUrlLock$1);
                    if (obj != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str2 = str;
                    sx22 = sx2;
                    stripeImageLoader2 = stripeImageLoader;
                    sx22.mo83451b(null);
                    stripeImageLoader2.imageLoadMutexes.remove(str2);
                    return obj;
                }
            }
            stripeImageLoader$withMutexByUrlLock$1.L$0 = stripeImageLoader;
            stripeImageLoader$withMutexByUrlLock$1.L$1 = str;
            stripeImageLoader$withMutexByUrlLock$1.L$2 = sx2;
            stripeImageLoader$withMutexByUrlLock$1.L$3 = null;
            stripeImageLoader$withMutexByUrlLock$1.label = 2;
            obj = function1.invoke(stripeImageLoader$withMutexByUrlLock$1);
            if (obj != coroutine_suspended) {
            }
        } catch (Throwable th2) {
            th = th2;
            sx22 = sx2;
            sx22.mo83451b(null);
            throw th;
        }
        stripeImageLoader$withMutexByUrlLock$1 = new StripeImageLoader$withMutexByUrlLock$1(this, continuation);
        obj = stripeImageLoader$withMutexByUrlLock$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeImageLoader$withMutexByUrlLock$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* renamed from: load-BWLJW6A  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116766loadBWLJW6A(String str, int i, int i2, Continuation<? super Result<Bitmap>> continuation) {
        StripeImageLoader$load$1 stripeImageLoader$load$1;
        Object coroutine_suspended;
        int i3;
        if (continuation instanceof StripeImageLoader$load$1) {
            stripeImageLoader$load$1 = (StripeImageLoader$load$1) continuation;
            int i4 = stripeImageLoader$load$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                stripeImageLoader$load$1.label = i4 - Integer.MIN_VALUE;
                Object obj = stripeImageLoader$load$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = stripeImageLoader$load$1.label;
                if (i3 == 0) {
                    if (i3 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    SC0 m84377b = T41.m84377b();
                    StripeImageLoader$load$2 stripeImageLoader$load$2 = new StripeImageLoader$load$2(this, str, i, i2, null);
                    stripeImageLoader$load$1.label = 1;
                    obj = X30.m77504g(m84377b, stripeImageLoader$load$2, stripeImageLoader$load$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return ((Result) obj).m116792unboximpl();
            }
        }
        stripeImageLoader$load$1 = new StripeImageLoader$load$1(this, continuation);
        Object obj2 = stripeImageLoader$load$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = stripeImageLoader$load$1.label;
        if (i3 == 0) {
        }
        return ((Result) obj2).m116792unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* renamed from: load-gIAlu-s  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116767loadgIAlus(String str, Continuation<? super Result<Bitmap>> continuation) {
        StripeImageLoader$load$3 stripeImageLoader$load$3;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof StripeImageLoader$load$3) {
            stripeImageLoader$load$3 = (StripeImageLoader$load$3) continuation;
            int i2 = stripeImageLoader$load$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeImageLoader$load$3.label = i2 - Integer.MIN_VALUE;
                Object obj = stripeImageLoader$load$3.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeImageLoader$load$3.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    SC0 m84377b = T41.m84377b();
                    StripeImageLoader$load$4 stripeImageLoader$load$4 = new StripeImageLoader$load$4(this, str, null);
                    stripeImageLoader$load$3.label = 1;
                    obj = X30.m77504g(m84377b, stripeImageLoader$load$4, stripeImageLoader$load$3);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return ((Result) obj).m116792unboximpl();
            }
        }
        stripeImageLoader$load$3 = new StripeImageLoader$load$3(this, continuation);
        Object obj2 = stripeImageLoader$load$3.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeImageLoader$load$3.label;
        if (i == 0) {
        }
        return ((Result) obj2).m116792unboximpl();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ StripeImageLoader(Context context, Logger logger, ImageLruMemoryCache imageLruMemoryCache, NetworkImageDecoder networkImageDecoder, ImageLruDiskCache imageLruDiskCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, r0, (i & 4) != 0 ? new ImageLruMemoryCache(0, 1, null) : imageLruMemoryCache, (i & 8) != 0 ? new NetworkImageDecoder() : networkImageDecoder, (i & 16) != 0 ? new ImageLruDiskCache(context, "stripe_image_cache", 0L, 4, null) : imageLruDiskCache);
        Logger logger2;
        boolean isDebuggable;
        if ((i & 2) != 0) {
            Logger.Companion companion = Logger.Companion;
            isDebuggable = StripeImageLoaderKt.isDebuggable(context);
            logger2 = companion.getInstance(isDebuggable);
        } else {
            logger2 = logger;
        }
    }
}
