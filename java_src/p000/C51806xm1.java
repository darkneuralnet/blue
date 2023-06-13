package p000;

import android.os.Bundle;
import com.facebook.share.internal.C17296a;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m28432d2 = {"Lxm1;", "Lwm1;", "", "event", "Landroid/os/Bundle;", "parameters", "", "logEvent", "userId", C17296a.f69688o, "property", "value", "b", "LTq4;", "LTq4;", "getReactiveConfig", "()LTq4;", "reactiveConfig", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "c", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "analytics", "<init>", "(LTq4;)V", "firebase_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: xm1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C51806xm1 implements InterfaceC51213wm1 {

    /* renamed from: a */
    public final C36207Tq4 f118081a;

    /* renamed from: b */
    public final FirebaseAnalytics f118082b;

    public C51806xm1(C36207Tq4 reactiveConfig) {
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f118081a = reactiveConfig;
    }

    @Override // p000.InterfaceC51213wm1
    /* renamed from: a */
    public void mo4721a(String str) {
        FirebaseAnalytics m4719c = m4719c();
        if (m4719c != null) {
            m4719c.m47376b(str);
        }
    }

    @Override // p000.InterfaceC51213wm1
    /* renamed from: b */
    public void mo4720b(String property, String value) {
        FirebaseAnalytics m4719c;
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(property, "user_id") && (m4719c = m4719c()) != null) {
            m4719c.m47375c(property, value);
        }
    }

    /* renamed from: c */
    public final FirebaseAnalytics m4719c() {
        FirebaseAnalytics firebaseAnalytics = this.f118082b;
        if (firebaseAnalytics == null) {
            if (this.f118081a.m82623f8().m73665a().getThirdPartyConfig().getFirebase().getEnabled()) {
                return C1545Da.m110167a(C50028um1.f112894a);
            }
            return null;
        }
        return firebaseAnalytics;
    }

    @Override // p000.InterfaceC51213wm1
    public void logEvent(String event, Bundle bundle) {
        Intrinsics.checkNotNullParameter(event, "event");
        FirebaseAnalytics m4719c = m4719c();
        if (m4719c != null) {
            m4719c.m47377a(event, bundle);
        }
    }
}
