package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.ServiceConnectionC18364g;
/* renamed from: com.google.firebase.messaging.f */
/* loaded from: classes6.dex */
public class BinderC18362f extends Binder {

    /* renamed from: a */
    public final InterfaceC18363a f74343a;

    /* renamed from: com.google.firebase.messaging.f$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC18363a {
        /* renamed from: a */
        Task<Void> mo47129a(Intent intent);
    }

    public BinderC18362f(InterfaceC18363a interfaceC18363a) {
        this.f74343a = interfaceC18363a;
    }

    /* renamed from: c */
    public void m47130c(final ServiceConnectionC18364g.C18365a c18365a) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            this.f74343a.mo47129a(c18365a.f74350a).addOnCompleteListener(new ExecutorC49647u74(), new OnCompleteListener() { // from class: yC6
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ServiceConnectionC18364g.C18365a.this.m47121d();
                }
            });
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
