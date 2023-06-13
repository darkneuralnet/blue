package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.C18358d;
import java.util.Map;
import java.util.concurrent.Executor;
/* renamed from: com.google.firebase.messaging.d */
/* loaded from: classes6.dex */
public class C18358d {

    /* renamed from: a */
    public final Executor f74336a;

    /* renamed from: b */
    public final Map<String, Task<String>> f74337b = new C28385so();

    /* renamed from: com.google.firebase.messaging.d$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC18359a {
        Task<String> start();
    }

    public C18358d(Executor executor) {
        this.f74336a = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ Task m47143c(String str, Task task) throws Exception {
        synchronized (this) {
            this.f74337b.remove(str);
        }
        return task;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public synchronized Task<String> m47144b(final String str, InterfaceC18359a interfaceC18359a) {
        Task<String> task = this.f74337b.get(str);
        if (task != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return task;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        Task continueWithTask = interfaceC18359a.start().continueWithTask(this.f74336a, new Continuation() { // from class: GI4
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                Task m47143c;
                m47143c = C18358d.this.m47143c(str, task2);
                return m47143c;
            }
        });
        this.f74337b.put(str, continueWithTask);
        return continueWithTask;
    }
}
