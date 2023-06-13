package p000;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzq;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: od9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC46389od9<T> {

    /* renamed from: a */
    public final int f102231a;

    /* renamed from: b */
    public final TaskCompletionSource<T> f102232b = new TaskCompletionSource<>();

    /* renamed from: c */
    public final int f102233c;

    /* renamed from: d */
    public final Bundle f102234d;

    public AbstractC46389od9(int i, int i2, Bundle bundle) {
        this.f102231a = i;
        this.f102233c = i2;
        this.f102234d = bundle;
    }

    /* renamed from: a */
    public abstract void mo450a(Bundle bundle);

    /* renamed from: b */
    public abstract boolean mo449b();

    /* renamed from: c */
    public final void m20761c(zzq zzqVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzqVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f102232b.setException(zzqVar);
    }

    /* renamed from: d */
    public final void m20760d(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(valueOf.length() + 16 + valueOf2.length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f102232b.setResult(t);
    }

    public final String toString() {
        int i = this.f102233c;
        int i2 = this.f102231a;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(mo449b());
        sb.append("}");
        return sb.toString();
    }
}
