package p000;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.transition.C12049a;
import java.util.ArrayList;
/* renamed from: Ay1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C31830Ay1 {

    /* renamed from: a */
    public static final AbstractC32298Cy1 f1466a = new C32064By1();

    /* renamed from: b */
    public static final AbstractC32298Cy1 f1467b = m114818c();

    private C31830Ay1() {
    }

    /* renamed from: a */
    public static void m114820a(Fragment fragment, Fragment fragment2, boolean z, C28385so<String, View> c28385so, boolean z2) {
        AbstractC36046Sy5 enterTransitionCallback;
        int size;
        if (z) {
            enterTransitionCallback = fragment2.getEnterTransitionCallback();
        } else {
            enterTransitionCallback = fragment.getEnterTransitionCallback();
        }
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (c28385so == null) {
                size = 0;
            } else {
                size = c28385so.size();
            }
            for (int i = 0; i < size; i++) {
                arrayList2.add(c28385so.m94264i(i));
                arrayList.add(c28385so.m94263m(i));
            }
            if (z2) {
                enterTransitionCallback.m84514g(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.m84515f(arrayList2, arrayList, null);
            }
        }
    }

    /* renamed from: b */
    public static String m114819b(C28385so<String, String> c28385so, String str) {
        int size = c28385so.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(c28385so.m94263m(i))) {
                return c28385so.m94264i(i);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static AbstractC32298Cy1 m114818c() {
        try {
            return (AbstractC32298Cy1) C12049a.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static void m114817d(C28385so<String, String> c28385so, C28385so<String, View> c28385so2) {
        for (int size = c28385so.size() - 1; size >= 0; size--) {
            if (!c28385so2.containsKey(c28385so.m94263m(size))) {
                c28385so.mo34405k(size);
            }
        }
    }

    /* renamed from: e */
    public static void m114816e(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }
}
