package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.C18356b;
import java.util.concurrent.ExecutionException;
/* loaded from: classes6.dex */
public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {
    /* renamed from: g */
    public static Intent m47286g(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    /* renamed from: b */
    public int mo47288b(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) Tasks.await(new C36141Tj1(context).m83066i(cloudMessage.m51624s()))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e);
            return 500;
        }
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    /* renamed from: c */
    public void mo47287c(Context context, Bundle bundle) {
        Intent m47286g = m47286g(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (C18356b.m47199B(m47286g)) {
            C18356b.m47179s(m47286g);
        }
    }
}
