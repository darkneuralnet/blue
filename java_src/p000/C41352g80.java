package p000;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.HashMap;
import java.util.Map;
/* renamed from: g80  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C41352g80 extends Fragment {

    /* renamed from: b */
    public final Map<String, Object> f81653b = new HashMap();

    /* renamed from: a5 */
    public static C41352g80 m39983a5(FragmentActivity fragmentActivity) {
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Fragment m67322m0 = supportFragmentManager.m67322m0("CacheFragment");
        if (m67322m0 instanceof C41352g80) {
            return (C41352g80) m67322m0;
        }
        C41352g80 c41352g80 = new C41352g80();
        c41352g80.setRetainInstance(true);
        supportFragmentManager.m67311q().m67119e(c41352g80, "CacheFragment").mo67115i();
        return c41352g80;
    }

    /* renamed from: N6 */
    public <T> T m39984N6(String str) {
        try {
            return (T) this.f81653b.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: t8 */
    public <T> void m39982t8(String str, T t) {
        this.f81653b.put(str, t);
    }
}
