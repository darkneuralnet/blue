package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
/* loaded from: classes6.dex */
public class FirebaseMessagingService extends EnhancedIntentService {

    /* renamed from: g */
    public static final Queue<String> f74303g = new ArrayDeque(10);

    @Override // com.google.firebase.messaging.EnhancedIntentService
    /* renamed from: e */
    public Intent mo47222e(Intent intent) {
        return C42414hv5.m35493b().m35492c();
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    /* renamed from: f */
    public void mo47221f(Intent intent) {
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(action) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
                mo47213s(intent.getStringExtra("token"));
                return;
            }
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
            return;
        }
        m47217o(intent);
    }

    /* renamed from: l */
    public final boolean m47220l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = f74303g;
        if (queue.contains(str)) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received duplicate message: " + str);
                return true;
            }
            return true;
        }
        if (queue.size() >= 10) {
            queue.remove();
        }
        queue.add(str);
        return false;
    }

    /* renamed from: m */
    public final void m47219m(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (C18357c.m47152t(extras)) {
            C18357c c18357c = new C18357c(extras);
            ExecutorService m80973e = C36375Uj1.m80973e();
            try {
                if (new C43102j51(this, c18357c, m80973e).m31150a()) {
                    return;
                }
                m80973e.shutdown();
                if (C18356b.m47199B(intent)) {
                    C18356b.m47178t(intent);
                }
            } finally {
                m80973e.shutdown();
            }
        }
        mo47215q(new RemoteMessage(extras));
    }

    /* renamed from: n */
    public final String m47218n(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            return intent.getStringExtra("message_id");
        }
        return stringExtra;
    }

    /* renamed from: o */
    public final void m47217o(Intent intent) {
        if (!m47220l(intent.getStringExtra("google.message_id"))) {
            m47211u(intent);
        }
    }

    /* renamed from: p */
    public void m47216p() {
    }

    /* renamed from: q */
    public void mo47215q(RemoteMessage remoteMessage) {
    }

    /* renamed from: r */
    public void m47214r(String str) {
    }

    /* renamed from: s */
    public void mo47213s(String str) {
    }

    /* renamed from: t */
    public void m47212t(String str, Exception exc) {
    }

    /* renamed from: u */
    public final void m47211u(Intent intent) {
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        char c = 65535;
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals("deleted_messages")) {
                    c = 0;
                    break;
                }
                break;
            case 102161:
                if (stringExtra.equals("gcm")) {
                    c = 1;
                    break;
                }
                break;
            case 814694033:
                if (stringExtra.equals("send_error")) {
                    c = 2;
                    break;
                }
                break;
            case 814800675:
                if (stringExtra.equals("send_event")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                m47216p();
                return;
            case 1:
                C18356b.m47176v(intent);
                m47219m(intent);
                return;
            case 2:
                m47212t(m47218n(intent), new SendException(intent.getStringExtra("error")));
                return;
            case 3:
                m47214r(intent.getStringExtra("google.message_id"));
                return;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                return;
        }
    }
}
