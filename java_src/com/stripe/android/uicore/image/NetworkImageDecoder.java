package com.stripe.android.uicore.image;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p053io.CloseableKt;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002J\u001b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\rJ+\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u001f\u0010\u0011\u001a\u0004\u0018\u00010\n*\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\f\u0010\u0013\u001a\u00020\u0014*\u00020\u0015H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, m28432d2 = {"Lcom/stripe/android/uicore/image/NetworkImageDecoder;", "", "()V", "calculateInSampleSize", "", "options", "Landroid/graphics/BitmapFactory$Options;", "reqWidth", "reqHeight", "decode", "Landroid/graphics/Bitmap;", "url", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "width", "height", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "decodeStream", "(Landroid/graphics/BitmapFactory$Options;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stream", "Ljava/io/InputStream;", "Ljava/net/URL;", "Companion", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nNetworkImageDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkImageDecoder.kt\ncom/stripe/android/uicore/image/NetworkImageDecoder\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,89:1\n314#2,9:90\n323#2,2:100\n1#3:99\n*S KotlinDebug\n*F\n+ 1 NetworkImageDecoder.kt\ncom/stripe/android/uicore/image/NetworkImageDecoder\n*L\n47#1:90,9\n47#1:100,2\n*E\n"})
/* loaded from: classes7.dex */
public final class NetworkImageDecoder {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    @Deprecated
    public static final int IMAGE_STREAM_TIMEOUT = 10000;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/uicore/image/NetworkImageDecoder$Companion;", "", "()V", "IMAGE_STREAM_TIMEOUT", "", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        Pair m28425to = TuplesKt.m28425to(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        int intValue = ((Number) m28425to.component1()).intValue();
        int intValue2 = ((Number) m28425to.component2()).intValue();
        int i3 = 1;
        if (intValue > i2 || intValue2 > i) {
            int i4 = intValue / 2;
            int i5 = intValue2 / 2;
            while (i4 / i3 >= i2 && i5 / i3 >= i) {
                i3 *= 2;
            }
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object decodeStream(BitmapFactory.Options options, String str, Continuation<? super Bitmap> continuation) {
        Continuation intercepted;
        Object m116783constructorimpl;
        Object coroutine_suspended;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        C37013Xc0 c37013Xc0 = new C37013Xc0(intercepted, 1);
        c37013Xc0.m76766u();
        try {
            Result.Companion companion = Result.Companion;
            InputStream stream = stream(new URL(str));
            c37013Xc0.mo76794H(new NetworkImageDecoder$decodeStream$2$1$1$1(stream));
            Bitmap decodeStream = BitmapFactory.decodeStream(stream, null, options);
            CloseableKt.closeFinally(stream, null);
            m116783constructorimpl = Result.m116783constructorimpl(decodeStream);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl == null) {
            c37013Xc0.resumeWith(Result.m116783constructorimpl((Bitmap) m116783constructorimpl));
        } else {
            c37013Xc0.resumeWith(Result.m116783constructorimpl(ResultKt.createFailure(m116786exceptionOrNullimpl)));
        }
        Object m76770q = c37013Xc0.m76770q();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m76770q == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return m76770q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InputStream stream(URL url) {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
        Intrinsics.checkNotNullExpressionValue(uRLConnection, "openConnection()");
        uRLConnection.setConnectTimeout(10000);
        uRLConnection.setReadTimeout(10000);
        InputStream inputStream = uRLConnection.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "con.getInputStream()");
        return inputStream;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object decode(String str, int i, int i2, Continuation<? super Bitmap> continuation) {
        NetworkImageDecoder$decode$1 networkImageDecoder$decode$1;
        Object obj;
        Object coroutine_suspended;
        int i3;
        NetworkImageDecoder networkImageDecoder;
        String str2;
        BitmapFactory.Options options;
        if (continuation instanceof NetworkImageDecoder$decode$1) {
            networkImageDecoder$decode$1 = (NetworkImageDecoder$decode$1) continuation;
            int i4 = networkImageDecoder$decode$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                networkImageDecoder$decode$1.label = i4 - Integer.MIN_VALUE;
                obj = networkImageDecoder$decode$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = networkImageDecoder$decode$1.label;
                if (i3 != 0) {
                    ResultKt.throwOnFailure(obj);
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inJustDecodeBounds = true;
                    networkImageDecoder$decode$1.L$0 = this;
                    networkImageDecoder$decode$1.L$1 = str;
                    networkImageDecoder$decode$1.L$2 = options2;
                    networkImageDecoder$decode$1.I$0 = i;
                    networkImageDecoder$decode$1.I$1 = i2;
                    networkImageDecoder$decode$1.label = 1;
                    if (decodeStream(options2, str, networkImageDecoder$decode$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    networkImageDecoder = this;
                    str2 = str;
                    options = options2;
                } else if (i3 != 1) {
                    if (i3 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return (Bitmap) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i2 = networkImageDecoder$decode$1.I$1;
                    i = networkImageDecoder$decode$1.I$0;
                    options = (BitmapFactory.Options) networkImageDecoder$decode$1.L$2;
                    str2 = (String) networkImageDecoder$decode$1.L$1;
                    networkImageDecoder = (NetworkImageDecoder) networkImageDecoder$decode$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                options.inSampleSize = networkImageDecoder.calculateInSampleSize(options, i, i2);
                options.inJustDecodeBounds = false;
                networkImageDecoder$decode$1.L$0 = null;
                networkImageDecoder$decode$1.L$1 = null;
                networkImageDecoder$decode$1.L$2 = null;
                networkImageDecoder$decode$1.label = 2;
                obj = networkImageDecoder.decodeStream(options, str2, networkImageDecoder$decode$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return (Bitmap) obj;
            }
        }
        networkImageDecoder$decode$1 = new NetworkImageDecoder$decode$1(this, continuation);
        obj = networkImageDecoder$decode$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = networkImageDecoder$decode$1.label;
        if (i3 != 0) {
        }
        options.inSampleSize = networkImageDecoder.calculateInSampleSize(options, i, i2);
        options.inJustDecodeBounds = false;
        networkImageDecoder$decode$1.L$0 = null;
        networkImageDecoder$decode$1.L$1 = null;
        networkImageDecoder$decode$1.L$2 = null;
        networkImageDecoder$decode$1.label = 2;
        obj = networkImageDecoder.decodeStream(options, str2, networkImageDecoder$decode$1);
        if (obj == coroutine_suspended) {
        }
        return (Bitmap) obj;
    }

    public final Object decode(String str, Continuation<? super Bitmap> continuation) {
        Object coroutine_suspended;
        Object decodeStream = decodeStream(new BitmapFactory.Options(), str, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return decodeStream == coroutine_suspended ? decodeStream : (Bitmap) decodeStream;
    }
}
