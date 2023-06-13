package p000;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
/* renamed from: hu9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C42408hu9 implements Continuation {

    /* renamed from: a */
    public static final /* synthetic */ C42408hu9 f86167a = new C42408hu9();

    private /* synthetic */ C42408hu9() {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        if (task.isSuccessful()) {
            return (Bundle) task.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(task.getException());
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("Error making request: ");
            sb.append(valueOf);
            Log.d("Rpc", sb.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
    }
}
