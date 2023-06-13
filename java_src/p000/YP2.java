package p000;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.InterfaceC11728i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: YP2 */
/* loaded from: classes.dex */
public class YP2 {

    /* renamed from: a */
    public final Runnable f45849a;

    /* renamed from: b */
    public final CopyOnWriteArrayList<InterfaceC50411vQ2> f45850b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public final Map<InterfaceC50411vQ2, C9769a> f45851c = new HashMap();

    /* renamed from: YP2$a */
    /* loaded from: classes.dex */
    public static class C9769a {

        /* renamed from: a */
        public final AbstractC11719f f45852a;

        /* renamed from: b */
        public InterfaceC11728i f45853b;

        public C9769a(AbstractC11719f abstractC11719f, InterfaceC11728i interfaceC11728i) {
            this.f45852a = abstractC11719f;
            this.f45853b = interfaceC11728i;
            abstractC11719f.mo67008a(interfaceC11728i);
        }

        /* renamed from: a */
        public void m75096a() {
            this.f45852a.mo67006d(this.f45853b);
            this.f45853b = null;
        }
    }

    public YP2(Runnable runnable) {
        this.f45849a = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m75103f(InterfaceC50411vQ2 interfaceC50411vQ2, LifecycleOwner lifecycleOwner, AbstractC11719f.EnumC11720a enumC11720a) {
        if (enumC11720a == AbstractC11719f.EnumC11720a.ON_DESTROY) {
            m75097l(interfaceC50411vQ2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m75102g(AbstractC11719f.EnumC11724b enumC11724b, InterfaceC50411vQ2 interfaceC50411vQ2, LifecycleOwner lifecycleOwner, AbstractC11719f.EnumC11720a enumC11720a) {
        if (enumC11720a == AbstractC11719f.EnumC11720a.m67018d(enumC11724b)) {
            m75106c(interfaceC50411vQ2);
        } else if (enumC11720a == AbstractC11719f.EnumC11720a.ON_DESTROY) {
            m75097l(interfaceC50411vQ2);
        } else if (enumC11720a == AbstractC11719f.EnumC11720a.m67020b(enumC11724b)) {
            this.f45850b.remove(interfaceC50411vQ2);
            this.f45849a.run();
        }
    }

    /* renamed from: c */
    public void m75106c(InterfaceC50411vQ2 interfaceC50411vQ2) {
        this.f45850b.add(interfaceC50411vQ2);
        this.f45849a.run();
    }

    /* renamed from: d */
    public void m75105d(final InterfaceC50411vQ2 interfaceC50411vQ2, LifecycleOwner lifecycleOwner) {
        m75106c(interfaceC50411vQ2);
        AbstractC11719f lifecycle = lifecycleOwner.getLifecycle();
        C9769a remove = this.f45851c.remove(interfaceC50411vQ2);
        if (remove != null) {
            remove.m75096a();
        }
        this.f45851c.put(interfaceC50411vQ2, new C9769a(lifecycle, new InterfaceC11728i() { // from class: WP2
            @Override // androidx.lifecycle.InterfaceC11728i
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, AbstractC11719f.EnumC11720a enumC11720a) {
                YP2.this.m75103f(interfaceC50411vQ2, lifecycleOwner2, enumC11720a);
            }
        }));
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: e */
    public void m75104e(final InterfaceC50411vQ2 interfaceC50411vQ2, LifecycleOwner lifecycleOwner, final AbstractC11719f.EnumC11724b enumC11724b) {
        AbstractC11719f lifecycle = lifecycleOwner.getLifecycle();
        C9769a remove = this.f45851c.remove(interfaceC50411vQ2);
        if (remove != null) {
            remove.m75096a();
        }
        this.f45851c.put(interfaceC50411vQ2, new C9769a(lifecycle, new InterfaceC11728i() { // from class: XP2
            @Override // androidx.lifecycle.InterfaceC11728i
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, AbstractC11719f.EnumC11720a enumC11720a) {
                YP2.this.m75102g(enumC11724b, interfaceC50411vQ2, lifecycleOwner2, enumC11720a);
            }
        }));
    }

    /* renamed from: h */
    public void m75101h(Menu menu, MenuInflater menuInflater) {
        Iterator<InterfaceC50411vQ2> it = this.f45850b.iterator();
        while (it.hasNext()) {
            it.next().mo8735a(menu, menuInflater);
        }
    }

    /* renamed from: i */
    public void m75100i(Menu menu) {
        Iterator<InterfaceC50411vQ2> it = this.f45850b.iterator();
        while (it.hasNext()) {
            it.next().mo8734b(menu);
        }
    }

    /* renamed from: j */
    public boolean m75099j(MenuItem menuItem) {
        Iterator<InterfaceC50411vQ2> it = this.f45850b.iterator();
        while (it.hasNext()) {
            if (it.next().mo8732d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void m75098k(Menu menu) {
        Iterator<InterfaceC50411vQ2> it = this.f45850b.iterator();
        while (it.hasNext()) {
            it.next().mo8733c(menu);
        }
    }

    /* renamed from: l */
    public void m75097l(InterfaceC50411vQ2 interfaceC50411vQ2) {
        this.f45850b.remove(interfaceC50411vQ2);
        C9769a remove = this.f45851c.remove(interfaceC50411vQ2);
        if (remove != null) {
            remove.m75096a();
        }
        this.f45849a.run();
    }
}
