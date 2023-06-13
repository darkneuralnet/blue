package p000;

import android.util.Log;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.function.Function;
/* renamed from: FA1 */
/* loaded from: classes6.dex */
public class FA1 {
    private FA1() {
    }

    /* renamed from: b */
    public static /* synthetic */ Object m107477b(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
        throw new CompletionException(th);
    }

    /* renamed from: c */
    public static <T> CompletableFuture<T> m107476c(final String str, CompletableFuture<T> completableFuture, final String str2) {
        completableFuture.exceptionally((Function) new Function() { // from class: EA1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object m107477b;
                m107477b = FA1.m107477b(str, str2, (Throwable) obj);
                return m107477b;
            }
        });
        return completableFuture;
    }
}
