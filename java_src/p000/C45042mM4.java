package p000;

import android.content.Context;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p053io.CloseableKt;
@Metadata(m28433d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u0005*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002\u001a5\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\r\u0010\u000e\u001a\n\u0010\u0011\u001a\u00020\u0010*\u00020\u000f\u001a\u0012\u0010\u0014\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012*\u00020\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m28432d2 = {"R", "Landroid/content/Context;", "", "fileLocation", "Lkotlin/Function2;", "Ljava/nio/ByteBuffer;", "Lkotlin/coroutines/Continuation;", "", "block", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lkotlin/Function1;", "e", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Ljava/io/InputStream;", "", "c", "Ljava/nio/FloatBuffer;", "kotlin.jvm.PlatformType", C17296a.f69688o, "sceneview_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: mM4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45042mM4 {
    /* renamed from: a */
    public static final FloatBuffer m25811a(FloatBuffer floatBuffer) {
        Intrinsics.checkNotNullParameter(floatBuffer, "<this>");
        FloatBuffer allocate = FloatBuffer.allocate(floatBuffer.capacity());
        floatBuffer.rewind();
        allocate.put(floatBuffer);
        floatBuffer.rewind();
        allocate.flip();
        return allocate;
    }

    /* renamed from: b */
    public static final ByteBuffer m25810b(Context context, String fileLocation) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(fileLocation, "fileLocation");
        return C44449lM4.m27397d(context, fileLocation);
    }

    /* renamed from: c */
    public static final byte[] m25809c(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        try {
            byte[] bArr = new byte[inputStream.available()];
            inputStream.read(bArr);
            CloseableKt.closeFinally(inputStream, null);
            return bArr;
        } finally {
        }
    }

    /* renamed from: d */
    public static final <R> Object m25808d(Context context, String str, Function2<? super ByteBuffer, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        return C44449lM4.f95920a.m27395f(context, str, function2, continuation);
    }

    /* renamed from: e */
    public static final <R> R m25807e(Context context, String fileLocation, Function1<? super ByteBuffer, ? extends R> block) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(fileLocation, "fileLocation");
        Intrinsics.checkNotNullParameter(block, "block");
        return (R) C44449lM4.f95920a.m27394g(context, fileLocation, block);
    }
}
