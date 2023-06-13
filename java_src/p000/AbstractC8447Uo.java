package p000;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;
import p000.IS0;
/* renamed from: Uo */
/* loaded from: classes5.dex */
public abstract class AbstractC8447Uo<T> implements IS0<T> {

    /* renamed from: b */
    public final String f38011b;

    /* renamed from: c */
    public final AssetManager f38012c;

    /* renamed from: d */
    public T f38013d;

    public AbstractC8447Uo(AssetManager assetManager, String str) {
        this.f38012c = assetManager;
        this.f38011b = str;
    }

    @Override // p000.IS0
    /* renamed from: b */
    public ZS0 mo19947b() {
        return ZS0.LOCAL;
    }

    /* renamed from: c */
    public abstract void mo25621c(T t) throws IOException;

    @Override // p000.IS0
    public void cancel() {
    }

    @Override // p000.IS0
    public void cleanup() {
        T t = this.f38013d;
        if (t == null) {
            return;
        }
        try {
            mo25621c(t);
        } catch (IOException unused) {
        }
    }

    /* renamed from: d */
    public abstract T mo25620d(AssetManager assetManager, String str) throws IOException;

    @Override // p000.IS0
    /* renamed from: e */
    public void mo19946e(P24 p24, IS0.InterfaceC3534a<? super T> interfaceC3534a) {
        try {
            T mo25620d = mo25620d(this.f38012c, this.f38011b);
            this.f38013d = mo25620d;
            interfaceC3534a.mo77098c(mo25620d);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            interfaceC3534a.mo77097d(e);
        }
    }
}
