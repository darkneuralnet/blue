package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
/* renamed from: rX1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C48103rX1 implements Closeable {

    /* renamed from: b */
    public final URL f107244b;

    /* renamed from: c */
    public volatile Future<?> f107245c;

    /* renamed from: d */
    public Task<Bitmap> f107246d;

    public C48103rX1(URL url) {
        this.f107244b = url;
    }

    /* renamed from: d */
    public static C48103rX1 m15822d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new C48103rX1(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m15820g(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(m15824b());
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    /* renamed from: b */
    public Bitmap m15824b() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f107244b);
        }
        byte[] m15823c = m15823c();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(m15823c, 0, m15823c.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f107244b);
            }
            return decodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.f107244b);
    }

    /* renamed from: c */
    public final byte[] m15823c() throws IOException {
        URLConnection openConnection = this.f107244b.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] m97758d = L70.m97758d(L70.m97760b(inputStream, 1048577L));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + m97758d.length + " bytes from " + this.f107244b);
                }
                if (m97758d.length <= 1048576) {
                    return m97758d;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f107245c.cancel(true);
    }

    /* renamed from: f */
    public Task<Bitmap> m15821f() {
        return (Task) Preconditions.checkNotNull(this.f107246d);
    }

    /* renamed from: i */
    public void m15819i(ExecutorService executorService) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f107245c = executorService.submit(new Runnable() { // from class: qX1
            @Override // java.lang.Runnable
            public final void run() {
                C48103rX1.this.m15820g(taskCompletionSource);
            }
        });
        this.f107246d = taskCompletionSource.getTask();
    }
}
