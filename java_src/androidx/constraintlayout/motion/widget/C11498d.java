package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.motion.widget.C11495c;
import androidx.constraintlayout.widget.C11515b;
import androidx.constraintlayout.widget.C11522c;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* renamed from: androidx.constraintlayout.motion.widget.d */
/* loaded from: classes.dex */
public class C11498d {

    /* renamed from: a */
    public final MotionLayout f53804a;

    /* renamed from: c */
    public HashSet<View> f53806c;

    /* renamed from: e */
    public ArrayList<C11495c.C11497b> f53808e;

    /* renamed from: b */
    public ArrayList<C11495c> f53805b = new ArrayList<>();

    /* renamed from: d */
    public String f53807d = "ViewTransitionController";

    /* renamed from: f */
    public ArrayList<C11495c.C11497b> f53809f = new ArrayList<>();

    /* renamed from: androidx.constraintlayout.motion.widget.d$a */
    /* loaded from: classes.dex */
    public class C11499a implements C11522c.InterfaceC11523a {

        /* renamed from: b */
        public final /* synthetic */ C11495c f53810b;

        /* renamed from: c */
        public final /* synthetic */ int f53811c;

        /* renamed from: d */
        public final /* synthetic */ boolean f53812d;

        /* renamed from: e */
        public final /* synthetic */ int f53813e;

        public C11499a(C11495c c11495c, int i, boolean z, int i2) {
            this.f53810b = c11495c;
            this.f53811c = i;
            this.f53812d = z;
            this.f53813e = i2;
        }
    }

    public C11498d(MotionLayout motionLayout) {
        this.f53804a = motionLayout;
    }

    /* renamed from: a */
    public void m67950a(C11495c c11495c) {
        this.f53805b.add(c11495c);
        this.f53806c = null;
        if (c11495c.m67961i() == 4) {
            m67945f(c11495c, true);
        } else if (c11495c.m67961i() == 5) {
            m67945f(c11495c, false);
        }
    }

    /* renamed from: b */
    public void m67949b(C11495c.C11497b c11497b) {
        if (this.f53808e == null) {
            this.f53808e = new ArrayList<>();
        }
        this.f53808e.add(c11497b);
    }

    /* renamed from: c */
    public void m67948c() {
        ArrayList<C11495c.C11497b> arrayList = this.f53808e;
        if (arrayList == null) {
            return;
        }
        Iterator<C11495c.C11497b> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().m67955a();
        }
        this.f53808e.removeAll(this.f53809f);
        this.f53809f.clear();
        if (this.f53808e.isEmpty()) {
            this.f53808e = null;
        }
    }

    /* renamed from: d */
    public boolean m67947d(int i, OV2 ov2) {
        Iterator<C11495c> it = this.f53805b.iterator();
        while (it.hasNext()) {
            C11495c next = it.next();
            if (next.m67965e() == i) {
                next.f53771f.m23244a(ov2);
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public void m67946e() {
        this.f53804a.invalidate();
    }

    /* renamed from: f */
    public final void m67945f(C11495c c11495c, boolean z) {
        ConstraintLayout.getSharedValues().m67779a(c11495c.m67962h(), new C11499a(c11495c, c11495c.m67962h(), z, c11495c.m67963g()));
    }

    /* renamed from: g */
    public void m67944g(C11495c.C11497b c11497b) {
        this.f53809f.add(c11497b);
    }

    /* renamed from: h */
    public void m67943h(MotionEvent motionEvent) {
        C11495c c11495c;
        int m68180S = this.f53804a.m68180S();
        if (m68180S == -1) {
            return;
        }
        if (this.f53806c == null) {
            this.f53806c = new HashSet<>();
            Iterator<C11495c> it = this.f53805b.iterator();
            while (it.hasNext()) {
                C11495c next = it.next();
                int childCount = this.f53804a.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = this.f53804a.getChildAt(i);
                    if (next.m67959k(childAt)) {
                        childAt.getId();
                        this.f53806c.add(childAt);
                    }
                }
            }
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        Rect rect = new Rect();
        int action = motionEvent.getAction();
        ArrayList<C11495c.C11497b> arrayList = this.f53808e;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<C11495c.C11497b> it2 = this.f53808e.iterator();
            while (it2.hasNext()) {
                it2.next().m67952d(action, x, y);
            }
        }
        if (action == 0 || action == 1) {
            C11515b m68182Q = this.f53804a.m68182Q(m68180S);
            Iterator<C11495c> it3 = this.f53805b.iterator();
            while (it3.hasNext()) {
                C11495c next2 = it3.next();
                if (next2.m67957m(action)) {
                    Iterator<View> it4 = this.f53806c.iterator();
                    while (it4.hasNext()) {
                        View next3 = it4.next();
                        if (next2.m67959k(next3)) {
                            next3.getHitRect(rect);
                            if (rect.contains((int) x, (int) y)) {
                                c11495c = next2;
                                next2.m67967c(this, this.f53804a, m68180S, m68182Q, next3);
                            } else {
                                c11495c = next2;
                            }
                            next2 = c11495c;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: i */
    public void m67942i(int i, View... viewArr) {
        ArrayList arrayList = new ArrayList();
        Iterator<C11495c> it = this.f53805b.iterator();
        C11495c c11495c = null;
        while (it.hasNext()) {
            C11495c next = it.next();
            if (next.m67965e() == i) {
                for (View view : viewArr) {
                    if (next.m67966d(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    m67941j(next, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
                c11495c = next;
            }
        }
        if (c11495c == null) {
            Log.e(this.f53807d, " Could not find ViewTransition");
        }
    }

    /* renamed from: j */
    public final void m67941j(C11495c c11495c, View... viewArr) {
        int m68180S = this.f53804a.m68180S();
        if (c11495c.f53770e != 2) {
            if (m68180S == -1) {
                String str = this.f53807d;
                Log.w(str, "No support for ViewTransition within transition yet. Currently: " + this.f53804a.toString());
                return;
            }
            C11515b m68182Q = this.f53804a.m68182Q(m68180S);
            if (m68182Q == null) {
                return;
            }
            c11495c.m67967c(this, this.f53804a, m68180S, m68182Q, viewArr);
            return;
        }
        c11495c.m67967c(this, this.f53804a, m68180S, null, viewArr);
    }
}
