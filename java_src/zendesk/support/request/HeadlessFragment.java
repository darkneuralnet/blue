package zendesk.support.request;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
/* loaded from: classes8.dex */
public class HeadlessFragment<E> extends Fragment {
    private static final String TAG = "ZendeskHeadlessFragment";
    private E data;

    private E getData() {
        return this.data;
    }

    public static <E> void install(FragmentManager fragmentManager, E e) {
        HeadlessFragment headlessFragment = new HeadlessFragment();
        headlessFragment.setData(e);
        fragmentManager.m67311q().m67119e(headlessFragment, TAG).mo67115i();
    }

    private void setData(E e) {
        this.data = e;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setRetainInstance(true);
        return null;
    }

    public static <E> E getData(FragmentManager fragmentManager) {
        Fragment m67322m0 = fragmentManager.m67322m0(TAG);
        if (m67322m0 instanceof HeadlessFragment) {
            return (E) ((HeadlessFragment) m67322m0).getData();
        }
        return null;
    }
}
