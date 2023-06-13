package p000;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.C11729j;
/* renamed from: ZG8 */
/* loaded from: classes6.dex */
public final class ZG8 extends Fragment {

    /* renamed from: c */
    public static final /* synthetic */ int f48142c = 0;

    /* renamed from: b */
    public C40337eQ7 f48143b;

    /* renamed from: a */
    public static void m73375a(Activity activity, AbstractC11719f.EnumC11720a enumC11720a) {
        if (activity instanceof InterfaceC33397Hq2) {
            ((InterfaceC33397Hq2) activity).getLifecycle().m67001i(enumC11720a);
        } else if (activity instanceof LifecycleOwner) {
            AbstractC11719f lifecycle = ((LifecycleOwner) activity).getLifecycle();
            if (lifecycle instanceof C11729j) {
                ((C11729j) lifecycle).m67001i(enumC11720a);
            }
        }
    }

    /* renamed from: b */
    public final void m73374b(C40337eQ7 c40337eQ7) {
        this.f48143b = c40337eQ7;
    }

    /* renamed from: c */
    public final void m73373c(AbstractC11719f.EnumC11720a enumC11720a) {
        if (Build.VERSION.SDK_INT < 29) {
            m73375a(getActivity(), enumC11720a);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m73373c(AbstractC11719f.EnumC11720a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m73373c(AbstractC11719f.EnumC11720a.ON_DESTROY);
        this.f48143b = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m73373c(AbstractC11719f.EnumC11720a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C40337eQ7 c40337eQ7 = this.f48143b;
        if (c40337eQ7 != null) {
            c40337eQ7.f78389a.m110067c();
        }
        m73373c(AbstractC11719f.EnumC11720a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C40337eQ7 c40337eQ7 = this.f48143b;
        if (c40337eQ7 != null) {
            c40337eQ7.f78389a.m110066d();
        }
        m73373c(AbstractC11719f.EnumC11720a.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m73373c(AbstractC11719f.EnumC11720a.ON_STOP);
    }
}
