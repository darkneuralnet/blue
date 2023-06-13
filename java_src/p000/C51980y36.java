package p000;

import android.os.Handler;
import android.os.Looper;
import com.adyen.checkout.core.exception.NoConstructorException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* renamed from: y36  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51980y36 {

    /* renamed from: a */
    public static final Handler f118666a = m4211a();

    /* renamed from: b */
    public static final ExecutorService f118667b = Executors.newCachedThreadPool();

    private C51980y36() {
        throw new NoConstructorException();
    }

    /* renamed from: a */
    public static Handler m4211a() {
        try {
            return new Handler(Looper.getMainLooper());
        } catch (RuntimeException unused) {
            return new Handler();
        }
    }
}
