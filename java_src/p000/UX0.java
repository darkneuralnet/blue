package p000;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016¨\u0006\u000e"}, m28432d2 = {"LUX0;", "", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onStart", "onResume", "outState", "onSaveInstanceState", "onPause", "onStop", "onDestroy", "onLowMemory", "core-basemvp_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: UX0 */
/* loaded from: classes2.dex */
public interface UX0 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: UX0$a */
    /* loaded from: classes2.dex */
    public static final class C8308a {
        /* renamed from: a */
        public static void m81389a(UX0 ux0, Bundle bundle) {
        }

        /* renamed from: b */
        public static void m81388b(UX0 ux0) {
        }

        /* renamed from: c */
        public static void m81387c(UX0 ux0) {
        }

        /* renamed from: d */
        public static void m81386d(UX0 ux0) {
        }

        /* renamed from: e */
        public static void m81385e(UX0 ux0) {
        }

        /* renamed from: f */
        public static void m81384f(UX0 ux0, Bundle outState) {
            Intrinsics.checkNotNullParameter(outState, "outState");
        }

        /* renamed from: g */
        public static void m81383g(UX0 ux0) {
        }

        /* renamed from: h */
        public static void m81382h(UX0 ux0) {
        }
    }

    void onCreate(Bundle bundle);

    void onDestroy();

    void onLowMemory();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);

    void onStart();

    void onStop();
}
