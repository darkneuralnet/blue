package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.C18343a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes6.dex */
public final class FirebaseAnalytics {

    /* renamed from: b */
    public static volatile FirebaseAnalytics f74237b;

    /* renamed from: a */
    public final C52032y88 f74238a;

    public FirebaseAnalytics(C52032y88 c52032y88) {
        Preconditions.checkNotNull(c52032y88);
        this.f74238a = c52032y88;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f74237b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f74237b == null) {
                    f74237b = new FirebaseAnalytics(C52032y88.m4047t(context, null, null, null, null));
                }
            }
        }
        return f74237b;
    }

    @Keep
    public static InterfaceC39629dD8 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C52032y88 m4047t = C52032y88.m4047t(context, null, null, null, bundle);
        if (m4047t == null) {
            return null;
        }
        return new C48710sY7(m4047t);
    }

    /* renamed from: a */
    public void m47377a(String str, Bundle bundle) {
        this.f74238a.m4068H(str, bundle);
    }

    /* renamed from: b */
    public void m47376b(String str) {
        this.f74238a.m4061f(str);
    }

    /* renamed from: c */
    public void m47375c(String str, String str2) {
        this.f74238a.m4060g(null, str, str2, false);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(C18343a.m47263p().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f74238a.m4063d(activity, str, str2);
    }
}
