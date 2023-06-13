package com.google.firebase.messaging;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;
/* renamed from: com.google.firebase.messaging.a */
/* loaded from: classes6.dex */
public final class C18354a {

    /* renamed from: a */
    public static final long f74334a = TimeUnit.MINUTES.toMillis(3);

    /* renamed from: com.google.firebase.messaging.a$a */
    /* loaded from: classes6.dex */
    public static final class C18355a {
        private C18355a() {
        }

        /* renamed from: a */
        public static C28385so<String, String> m47201a(Bundle bundle) {
            C28385so<String, String> c28385so = new C28385so<>();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        c28385so.put(str, str2);
                    }
                }
            }
            return c28385so;
        }
    }

    private C18354a() {
    }
}
