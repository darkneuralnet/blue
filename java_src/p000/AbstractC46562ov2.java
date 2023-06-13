package p000;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import p000.IS0;
/* renamed from: ov2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC46562ov2<T> implements IS0<T> {

    /* renamed from: b */
    public final Uri f102772b;

    /* renamed from: c */
    public final ContentResolver f102773c;

    /* renamed from: d */
    public T f102774d;

    public AbstractC46562ov2(ContentResolver contentResolver, Uri uri) {
        this.f102773c = contentResolver;
        this.f102772b = uri;
    }

    @Override // p000.IS0
    /* renamed from: b */
    public ZS0 mo19947b() {
        return ZS0.LOCAL;
    }

    /* renamed from: c */
    public abstract void mo6833c(T t) throws IOException;

    @Override // p000.IS0
    public void cancel() {
    }

    @Override // p000.IS0
    public void cleanup() {
        T t = this.f102774d;
        if (t != null) {
            try {
                mo6833c(t);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: d */
    public abstract T mo6832d(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    @Override // p000.IS0
    /* renamed from: e */
    public final void mo19946e(P24 p24, IS0.InterfaceC3534a<? super T> interfaceC3534a) {
        try {
            T mo6832d = mo6832d(this.f102772b, this.f102773c);
            this.f102774d = mo6832d;
            interfaceC3534a.mo77098c(mo6832d);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            interfaceC3534a.mo77097d(e);
        }
    }
}
