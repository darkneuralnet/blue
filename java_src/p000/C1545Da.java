package p000;

import com.facebook.share.internal.C17296a;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m28432d2 = {"Lum1;", "Lcom/google/firebase/analytics/FirebaseAnalytics;", C17296a.f69688o, "(Lum1;)Lcom/google/firebase/analytics/FirebaseAnalytics;", "analytics", "java.com.google.android.libraries.firebase.firebase_analytics_ktx_granule"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Da */
/* loaded from: classes6.dex */
public final class C1545Da {

    /* renamed from: a */
    public static volatile FirebaseAnalytics f5962a;

    /* renamed from: b */
    public static final Object f5963b = new Object();

    /* renamed from: a */
    public static final FirebaseAnalytics m110167a(C50028um1 c50028um1) {
        Intrinsics.checkNotNullParameter(c50028um1, "<this>");
        if (f5962a == null) {
            synchronized (f5963b) {
                if (f5962a == null) {
                    f5962a = FirebaseAnalytics.getInstance(C36636Vm1.m79431a(C50028um1.f112894a).m115293j());
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = f5962a;
        Intrinsics.checkNotNull(firebaseAnalytics);
        return firebaseAnalytics;
    }
}
