package p000;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@SuppressLint({"UnknownNullness"})
/* renamed from: Cy1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC32298Cy1 {

    /* renamed from: Cy1$a */
    /* loaded from: classes.dex */
    public class RunnableC1265a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ int f4965b;

        /* renamed from: c */
        public final /* synthetic */ ArrayList f4966c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f4967d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList f4968e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f4969f;

        public RunnableC1265a(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f4965b = i;
            this.f4966c = arrayList;
            this.f4967d = arrayList2;
            this.f4968e = arrayList3;
            this.f4969f = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.f4965b; i++) {
                C38790bq6.m62505Y0((View) this.f4966c.get(i), (String) this.f4967d.get(i));
                C38790bq6.m62505Y0((View) this.f4968e.get(i), (String) this.f4969f.get(i));
            }
        }
    }

    /* renamed from: d */
    public static void m111195d(List<View> list, View view) {
        int size = list.size();
        if (m111194g(list, view, size)) {
            return;
        }
        if (C38790bq6.m62530M(view) != null) {
            list.add(view);
        }
        for (int i = size; i < list.size(); i++) {
            View view2 = list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!m111194g(list, childAt, size) && C38790bq6.m62530M(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public static boolean m111194g(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m111192i(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    public abstract void mo65822a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo65821b(Object obj, ArrayList<View> arrayList);

    /* renamed from: c */
    public abstract void mo65820c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo65819e(Object obj);

    /* renamed from: f */
    public abstract Object mo65818f(Object obj);

    /* renamed from: h */
    public void m111193h(View view, Rect rect) {
        if (!C38790bq6.m62506Y(view)) {
            return;
        }
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getMatrix().mapRect(rectF);
        rectF.offset(view.getLeft(), view.getTop());
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            view2.getMatrix().mapRect(rectF);
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
        int[] iArr = new int[2];
        view.getRootView().getLocationOnScreen(iArr);
        rectF.offset(iArr[0], iArr[1]);
        rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    /* renamed from: j */
    public abstract Object mo65817j(Object obj, Object obj2, Object obj3);

    /* renamed from: k */
    public abstract Object mo65816k(Object obj, Object obj2, Object obj3);

    /* renamed from: l */
    public ArrayList<String> m111191l(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(C38790bq6.m62530M(view));
            C38790bq6.m62505Y0(view, null);
        }
        return arrayList2;
    }

    /* renamed from: m */
    public abstract void mo65815m(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: n */
    public abstract void mo65814n(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: o */
    public abstract void mo65813o(Object obj, Rect rect);

    /* renamed from: p */
    public abstract void mo65812p(Object obj, View view);

    /* renamed from: q */
    public void mo111190q(Fragment fragment, Object obj, C39858dd0 c39858dd0, Runnable runnable) {
        runnable.run();
    }

    /* renamed from: r */
    public void m111189r(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String m62530M = C38790bq6.m62530M(view2);
            arrayList4.add(m62530M);
            if (m62530M != null) {
                C38790bq6.m62505Y0(view2, null);
                String str = map.get(m62530M);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        C38790bq6.m62505Y0(arrayList2.get(i2), m62530M);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        ViewTreeObserver$OnPreDrawListenerC32615Eh3.m108576a(view, new RunnableC1265a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: s */
    public abstract void mo65811s(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: t */
    public abstract void mo65810t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: u */
    public abstract Object mo65809u(Object obj);
}
