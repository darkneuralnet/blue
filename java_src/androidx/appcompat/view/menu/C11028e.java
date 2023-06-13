package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.internal.http2.Settings;
/* renamed from: androidx.appcompat.view.menu.e */
/* loaded from: classes.dex */
public class C11028e implements InterfaceMenuC38584bV5 {

    /* renamed from: A */
    public static final int[] f51870A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    public final Context f51871a;

    /* renamed from: b */
    public final Resources f51872b;

    /* renamed from: c */
    public boolean f51873c;

    /* renamed from: d */
    public boolean f51874d;

    /* renamed from: e */
    public InterfaceC11029a f51875e;

    /* renamed from: m */
    public ContextMenu.ContextMenuInfo f51883m;

    /* renamed from: n */
    public CharSequence f51884n;

    /* renamed from: o */
    public Drawable f51885o;

    /* renamed from: p */
    public View f51886p;

    /* renamed from: x */
    public C11032g f51894x;

    /* renamed from: z */
    public boolean f51896z;

    /* renamed from: l */
    public int f51882l = 0;

    /* renamed from: q */
    public boolean f51887q = false;

    /* renamed from: r */
    public boolean f51888r = false;

    /* renamed from: s */
    public boolean f51889s = false;

    /* renamed from: t */
    public boolean f51890t = false;

    /* renamed from: u */
    public boolean f51891u = false;

    /* renamed from: v */
    public ArrayList<C11032g> f51892v = new ArrayList<>();

    /* renamed from: w */
    public CopyOnWriteArrayList<WeakReference<InterfaceC11037i>> f51893w = new CopyOnWriteArrayList<>();

    /* renamed from: y */
    public boolean f51895y = false;

    /* renamed from: f */
    public ArrayList<C11032g> f51876f = new ArrayList<>();

    /* renamed from: g */
    public ArrayList<C11032g> f51877g = new ArrayList<>();

    /* renamed from: h */
    public boolean f51878h = true;

    /* renamed from: i */
    public ArrayList<C11032g> f51879i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<C11032g> f51880j = new ArrayList<>();

    /* renamed from: k */
    public boolean f51881k = true;

    /* renamed from: androidx.appcompat.view.menu.e$a */
    /* loaded from: classes.dex */
    public interface InterfaceC11029a {
        /* renamed from: a */
        boolean mo5020a(C11028e c11028e, MenuItem menuItem);

        /* renamed from: b */
        void mo5019b(C11028e c11028e);
    }

    /* renamed from: androidx.appcompat.view.menu.e$b */
    /* loaded from: classes.dex */
    public interface InterfaceC11030b {
        /* renamed from: b */
        boolean mo70000b(C11032g c11032g);
    }

    public C11028e(Context context) {
        this.f51871a = context;
        this.f51872b = context.getResources();
        m70142f0(true);
    }

    /* renamed from: D */
    public static int m70170D(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f51870A;
            if (i2 < iArr.length) {
                return (i & Settings.DEFAULT_INITIAL_WINDOW_SIZE) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: p */
    public static int m70132p(ArrayList<C11032g> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).m70115f() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: A */
    public View m70173A() {
        return this.f51886p;
    }

    /* renamed from: B */
    public ArrayList<C11032g> m70172B() {
        m70128t();
        return this.f51880j;
    }

    /* renamed from: C */
    public boolean m70171C() {
        return this.f51890t;
    }

    /* renamed from: E */
    public Resources m70169E() {
        return this.f51872b;
    }

    /* renamed from: F */
    public C11028e mo70078F() {
        return this;
    }

    /* renamed from: G */
    public ArrayList<C11032g> m70168G() {
        if (!this.f51878h) {
            return this.f51877g;
        }
        this.f51877g.clear();
        int size = this.f51876f.size();
        for (int i = 0; i < size; i++) {
            C11032g c11032g = this.f51876f.get(i);
            if (c11032g.isVisible()) {
                this.f51877g.add(c11032g);
            }
        }
        this.f51878h = false;
        this.f51881k = true;
        return this.f51877g;
    }

    /* renamed from: H */
    public boolean mo70077H() {
        return this.f51895y;
    }

    /* renamed from: I */
    public boolean mo70076I() {
        return this.f51873c;
    }

    /* renamed from: J */
    public boolean mo70075J() {
        return this.f51874d;
    }

    /* renamed from: K */
    public void m70167K(C11032g c11032g) {
        this.f51881k = true;
        mo70165M(true);
    }

    /* renamed from: L */
    public void m70166L(C11032g c11032g) {
        this.f51878h = true;
        mo70165M(true);
    }

    /* renamed from: M */
    public void mo70165M(boolean z) {
        if (!this.f51887q) {
            if (z) {
                this.f51878h = true;
                this.f51881k = true;
            }
            m70138i(z);
            return;
        }
        this.f51888r = true;
        if (z) {
            this.f51889s = true;
        }
    }

    /* renamed from: N */
    public boolean m70164N(MenuItem menuItem, int i) {
        return m70163O(menuItem, null, i);
    }

    /* renamed from: O */
    public boolean m70163O(MenuItem menuItem, InterfaceC11037i interfaceC11037i, int i) {
        boolean z;
        C11032g c11032g = (C11032g) menuItem;
        if (c11032g == null || !c11032g.isEnabled()) {
            return false;
        }
        boolean m70110k = c11032g.m70110k();
        AbstractC3314I2 mo44207b = c11032g.mo44207b();
        if (mo44207b != null && mo44207b.mo17526a()) {
            z = true;
        } else {
            z = false;
        }
        if (c11032g.m70111j()) {
            m70110k |= c11032g.expandActionView();
            if (m70110k) {
                m70144e(true);
            }
        } else if (!c11032g.hasSubMenu() && !z) {
            if ((i & 1) == 0) {
                m70144e(true);
            }
        } else {
            if ((i & 4) == 0) {
                m70144e(false);
            }
            if (!c11032g.hasSubMenu()) {
                c11032g.m70097x(new SubMenuC11044l(m70126w(), this, c11032g));
            }
            SubMenuC11044l subMenuC11044l = (SubMenuC11044l) c11032g.getSubMenu();
            if (z) {
                mo44207b.mo17523f(subMenuC11044l);
            }
            m70110k |= m70135l(subMenuC11044l, interfaceC11037i);
            if (!m70110k) {
                m70144e(true);
            }
        }
        return m70110k;
    }

    /* renamed from: P */
    public final void m70162P(int i, boolean z) {
        if (i >= 0 && i < this.f51876f.size()) {
            this.f51876f.remove(i);
            if (z) {
                mo70165M(true);
            }
        }
    }

    /* renamed from: Q */
    public void m70161Q(InterfaceC11037i interfaceC11037i) {
        Iterator<WeakReference<InterfaceC11037i>> it = this.f51893w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC11037i> next = it.next();
            InterfaceC11037i interfaceC11037i2 = next.get();
            if (interfaceC11037i2 == null || interfaceC11037i2 == interfaceC11037i) {
                this.f51893w.remove(next);
            }
        }
    }

    /* renamed from: R */
    public void m70160R(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo70069v());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC11044l) item.getSubMenu()).m70160R(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 > 0 && (findItem = findItem(i2)) != null) {
            findItem.expandActionView();
        }
    }

    /* renamed from: S */
    public void m70159S(Bundle bundle) {
        m70137j(bundle);
    }

    /* renamed from: T */
    public void m70158T(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC11044l) item.getSubMenu()).m70158T(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo70069v(), sparseArray);
        }
    }

    /* renamed from: U */
    public void m70157U(Bundle bundle) {
        m70136k(bundle);
    }

    /* renamed from: V */
    public void mo70074V(InterfaceC11029a interfaceC11029a) {
        this.f51875e = interfaceC11029a;
    }

    /* renamed from: W */
    public C11028e m70156W(int i) {
        this.f51882l = i;
        return this;
    }

    /* renamed from: X */
    public void m70155X(MenuItem menuItem) {
        boolean z;
        int groupId = menuItem.getGroupId();
        int size = this.f51876f.size();
        m70139h0();
        for (int i = 0; i < size; i++) {
            C11032g c11032g = this.f51876f.get(i);
            if (c11032g.getGroupId() == groupId && c11032g.m70108m() && c11032g.isCheckable()) {
                if (c11032g == menuItem) {
                    z = true;
                } else {
                    z = false;
                }
                c11032g.m70102s(z);
            }
        }
        m70140g0();
    }

    /* renamed from: Y */
    public C11028e m70154Y(int i) {
        m70151a0(0, null, i, null, null);
        return this;
    }

    /* renamed from: Z */
    public C11028e m70153Z(Drawable drawable) {
        m70151a0(0, null, 0, drawable, null);
        return this;
    }

    /* renamed from: a */
    public MenuItem mo70152a(int i, int i2, int i3, CharSequence charSequence) {
        int m70170D = m70170D(i3);
        C11032g m70141g = m70141g(i, i2, i3, m70170D, charSequence, this.f51882l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f51883m;
        if (contextMenuInfo != null) {
            m70141g.m70099v(contextMenuInfo);
        }
        ArrayList<C11032g> arrayList = this.f51876f;
        arrayList.add(m70132p(arrayList, m70170D), m70141g);
        mo70165M(true);
        return m70141g;
    }

    /* renamed from: a0 */
    public final void m70151a0(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources m70169E = m70169E();
        if (view != null) {
            this.f51886p = view;
            this.f51884n = null;
            this.f51885o = null;
        } else {
            if (i > 0) {
                this.f51884n = m70169E.getText(i);
            } else if (charSequence != null) {
                this.f51884n = charSequence;
            }
            if (i2 > 0) {
                this.f51885o = NA0.m94299e(m70126w(), i2);
            } else if (drawable != null) {
                this.f51885o = drawable;
            }
            this.f51886p = null;
        }
        mo70165M(false);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return mo70152a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        Intent intent2;
        int i6;
        PackageManager packageManager = this.f51871a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i5 = queryIntentActivityOptions.size();
        } else {
            i5 = 0;
        }
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i7 = 0; i7 < i5; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            if (i8 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i8];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent4 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = intent4;
            }
        }
        return i5;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void m70150b(InterfaceC11037i interfaceC11037i) {
        m70148c(interfaceC11037i, this.f51871a);
    }

    /* renamed from: b0 */
    public C11028e m70149b0(int i) {
        m70151a0(i, null, 0, null, null);
        return this;
    }

    /* renamed from: c */
    public void m70148c(InterfaceC11037i interfaceC11037i, Context context) {
        this.f51893w.add(new WeakReference<>(interfaceC11037i));
        interfaceC11037i.mo12397i(context, this);
        this.f51881k = true;
    }

    /* renamed from: c0 */
    public C11028e m70147c0(CharSequence charSequence) {
        m70151a0(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public void clear() {
        C11032g c11032g = this.f51894x;
        if (c11032g != null) {
            mo70073f(c11032g);
        }
        this.f51876f.clear();
        mo70165M(true);
    }

    public void clearHeader() {
        this.f51885o = null;
        this.f51884n = null;
        this.f51886p = null;
        mo70165M(false);
    }

    @Override // android.view.Menu
    public void close() {
        m70144e(true);
    }

    /* renamed from: d */
    public void m70146d() {
        InterfaceC11029a interfaceC11029a = this.f51875e;
        if (interfaceC11029a != null) {
            interfaceC11029a.mo5019b(this);
        }
    }

    /* renamed from: d0 */
    public C11028e m70145d0(View view) {
        m70151a0(0, null, 0, null, view);
        return this;
    }

    /* renamed from: e */
    public final void m70144e(boolean z) {
        if (this.f51891u) {
            return;
        }
        this.f51891u = true;
        Iterator<WeakReference<InterfaceC11037i>> it = this.f51893w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC11037i> next = it.next();
            InterfaceC11037i interfaceC11037i = next.get();
            if (interfaceC11037i == null) {
                this.f51893w.remove(next);
            } else {
                interfaceC11037i.mo49325b(this, z);
            }
        }
        this.f51891u = false;
    }

    /* renamed from: e0 */
    public void m70143e0(boolean z) {
        this.f51896z = z;
    }

    /* renamed from: f */
    public boolean mo70073f(C11032g c11032g) {
        boolean z = false;
        if (!this.f51893w.isEmpty() && this.f51894x == c11032g) {
            m70139h0();
            Iterator<WeakReference<InterfaceC11037i>> it = this.f51893w.iterator();
            while (it.hasNext()) {
                WeakReference<InterfaceC11037i> next = it.next();
                InterfaceC11037i interfaceC11037i = next.get();
                if (interfaceC11037i == null) {
                    this.f51893w.remove(next);
                } else {
                    z = interfaceC11037i.mo12398h(this, c11032g);
                    if (z) {
                        break;
                    }
                }
            }
            m70140g0();
            if (z) {
                this.f51894x = null;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (p000.C34571Mq6.m94683f(android.view.ViewConfiguration.get(r2.f51871a), r2.f51871a) != false) goto L6;
     */
    /* renamed from: f0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m70142f0(boolean z) {
        boolean z2;
        if (z) {
            z2 = true;
            if (this.f51872b.getConfiguration().keyboard != 1) {
            }
        }
        z2 = false;
        this.f51874d = z2;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C11032g c11032g = this.f51876f.get(i2);
            if (c11032g.getItemId() == i) {
                return c11032g;
            }
            if (c11032g.hasSubMenu() && (findItem = c11032g.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final C11032g m70141g(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C11032g(this, i, i2, i3, i4, charSequence, i5);
    }

    /* renamed from: g0 */
    public void m70140g0() {
        this.f51887q = false;
        if (this.f51888r) {
            this.f51888r = false;
            mo70165M(this.f51889s);
        }
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.f51876f.get(i);
    }

    /* renamed from: h */
    public boolean mo70072h(C11028e c11028e, MenuItem menuItem) {
        InterfaceC11029a interfaceC11029a = this.f51875e;
        return interfaceC11029a != null && interfaceC11029a.mo5020a(c11028e, menuItem);
    }

    /* renamed from: h0 */
    public void m70139h0() {
        if (!this.f51887q) {
            this.f51887q = true;
            this.f51888r = false;
            this.f51889s = false;
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f51896z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f51876f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void m70138i(boolean z) {
        if (this.f51893w.isEmpty()) {
            return;
        }
        m70139h0();
        Iterator<WeakReference<InterfaceC11037i>> it = this.f51893w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC11037i> next = it.next();
            InterfaceC11037i interfaceC11037i = next.get();
            if (interfaceC11037i == null) {
                this.f51893w.remove(next);
            } else {
                interfaceC11037i.mo49322f(z);
            }
        }
        m70140g0();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m70130r(i, keyEvent) != null;
    }

    /* renamed from: j */
    public final void m70137j(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.f51893w.isEmpty()) {
            Iterator<WeakReference<InterfaceC11037i>> it = this.f51893w.iterator();
            while (it.hasNext()) {
                WeakReference<InterfaceC11037i> next = it.next();
                InterfaceC11037i interfaceC11037i = next.get();
                if (interfaceC11037i == null) {
                    this.f51893w.remove(next);
                } else {
                    int id = interfaceC11037i.getId();
                    if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        interfaceC11037i.mo49319l(parcelable);
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public final void m70136k(Bundle bundle) {
        Parcelable mo49323e;
        if (this.f51893w.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator<WeakReference<InterfaceC11037i>> it = this.f51893w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC11037i> next = it.next();
            InterfaceC11037i interfaceC11037i = next.get();
            if (interfaceC11037i == null) {
                this.f51893w.remove(next);
            } else {
                int id = interfaceC11037i.getId();
                if (id > 0 && (mo49323e = interfaceC11037i.mo49323e()) != null) {
                    sparseArray.put(id, mo49323e);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    /* renamed from: l */
    public final boolean m70135l(SubMenuC11044l subMenuC11044l, InterfaceC11037i interfaceC11037i) {
        boolean z = false;
        if (this.f51893w.isEmpty()) {
            return false;
        }
        if (interfaceC11037i != null) {
            z = interfaceC11037i.mo49318m(subMenuC11044l);
        }
        Iterator<WeakReference<InterfaceC11037i>> it = this.f51893w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC11037i> next = it.next();
            InterfaceC11037i interfaceC11037i2 = next.get();
            if (interfaceC11037i2 == null) {
                this.f51893w.remove(next);
            } else if (!z) {
                z = interfaceC11037i2.mo49318m(subMenuC11044l);
            }
        }
        return z;
    }

    /* renamed from: m */
    public boolean mo70070m(C11032g c11032g) {
        boolean z = false;
        if (this.f51893w.isEmpty()) {
            return false;
        }
        m70139h0();
        Iterator<WeakReference<InterfaceC11037i>> it = this.f51893w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC11037i> next = it.next();
            InterfaceC11037i interfaceC11037i = next.get();
            if (interfaceC11037i == null) {
                this.f51893w.remove(next);
            } else {
                z = interfaceC11037i.mo12399d(this, c11032g);
                if (z) {
                    break;
                }
            }
        }
        m70140g0();
        if (z) {
            this.f51894x = c11032g;
        }
        return z;
    }

    /* renamed from: n */
    public int m70134n(int i) {
        return m70133o(i, 0);
    }

    /* renamed from: o */
    public int m70133o(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f51876f.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return m70164N(findItem(i), i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        C11032g m70130r = m70130r(i, keyEvent);
        if (m70130r != null) {
            z = m70164N(m70130r, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            m70144e(true);
        }
        return z;
    }

    /* renamed from: q */
    public int m70131q(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f51876f.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: r */
    public C11032g m70130r(int i, KeyEvent keyEvent) {
        char numericShortcut;
        ArrayList<C11032g> arrayList = this.f51892v;
        arrayList.clear();
        m70129s(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean mo70076I = mo70076I();
        for (int i2 = 0; i2 < size; i2++) {
            C11032g c11032g = arrayList.get(i2);
            if (mo70076I) {
                numericShortcut = c11032g.getAlphabeticShortcut();
            } else {
                numericShortcut = c11032g.getNumericShortcut();
            }
            char[] cArr = keyData.meta;
            if ((numericShortcut == cArr[0] && (metaState & 2) == 0) || ((numericShortcut == cArr[2] && (metaState & 2) != 0) || (mo70076I && numericShortcut == '\b' && i == 67))) {
                return c11032g;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int m70134n = m70134n(i);
        if (m70134n >= 0) {
            int size = this.f51876f.size() - m70134n;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f51876f.get(m70134n).getGroupId() != i) {
                    break;
                }
                m70162P(m70134n, false);
                i2 = i3;
            }
            mo70165M(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        m70162P(m70131q(i), true);
    }

    /* renamed from: s */
    public void m70129s(List<C11032g> list, int i, KeyEvent keyEvent) {
        char numericShortcut;
        int numericModifiers;
        boolean z;
        boolean mo70076I = mo70076I();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && i != 67) {
            return;
        }
        int size = this.f51876f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C11032g c11032g = this.f51876f.get(i2);
            if (c11032g.hasSubMenu()) {
                ((C11028e) c11032g.getSubMenu()).m70129s(list, i, keyEvent);
            }
            if (mo70076I) {
                numericShortcut = c11032g.getAlphabeticShortcut();
            } else {
                numericShortcut = c11032g.getNumericShortcut();
            }
            if (mo70076I) {
                numericModifiers = c11032g.getAlphabeticModifiers();
            } else {
                numericModifiers = c11032g.getNumericModifiers();
            }
            if ((modifiers & 69647) == (numericModifiers & 69647)) {
                z = true;
            } else {
                z = false;
            }
            if (z && numericShortcut != 0) {
                char[] cArr = keyData.meta;
                if ((numericShortcut == cArr[0] || numericShortcut == cArr[2] || (mo70076I && numericShortcut == '\b' && i == 67)) && c11032g.isEnabled()) {
                    list.add(c11032g);
                }
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f51876f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C11032g c11032g = this.f51876f.get(i2);
            if (c11032g.getGroupId() == i) {
                c11032g.m70101t(z2);
                c11032g.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f51895y = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.f51876f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C11032g c11032g = this.f51876f.get(i2);
            if (c11032g.getGroupId() == i) {
                c11032g.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.f51876f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C11032g c11032g = this.f51876f.get(i2);
            if (c11032g.getGroupId() == i && c11032g.m70096y(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo70165M(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f51873c = z;
        mo70165M(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f51876f.size();
    }

    /* renamed from: t */
    public void m70128t() {
        ArrayList<C11032g> m70168G = m70168G();
        if (!this.f51881k) {
            return;
        }
        Iterator<WeakReference<InterfaceC11037i>> it = this.f51893w.iterator();
        boolean z = false;
        while (it.hasNext()) {
            WeakReference<InterfaceC11037i> next = it.next();
            InterfaceC11037i interfaceC11037i = next.get();
            if (interfaceC11037i == null) {
                this.f51893w.remove(next);
            } else {
                z |= interfaceC11037i.mo49321g();
            }
        }
        if (z) {
            this.f51879i.clear();
            this.f51880j.clear();
            int size = m70168G.size();
            for (int i = 0; i < size; i++) {
                C11032g c11032g = m70168G.get(i);
                if (c11032g.m70109l()) {
                    this.f51879i.add(c11032g);
                } else {
                    this.f51880j.add(c11032g);
                }
            }
        } else {
            this.f51879i.clear();
            this.f51880j.clear();
            this.f51880j.addAll(m70168G());
        }
        this.f51881k = false;
    }

    /* renamed from: u */
    public ArrayList<C11032g> m70127u() {
        m70128t();
        return this.f51879i;
    }

    /* renamed from: v */
    public String mo70069v() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: w */
    public Context m70126w() {
        return this.f51871a;
    }

    /* renamed from: x */
    public C11032g m70125x() {
        return this.f51894x;
    }

    /* renamed from: y */
    public Drawable m70124y() {
        return this.f51885o;
    }

    /* renamed from: z */
    public CharSequence m70123z() {
        return this.f51884n;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return mo70152a(0, 0, 0, this.f51872b.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f51872b.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo70152a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C11032g c11032g = (C11032g) mo70152a(i, i2, i3, charSequence);
        SubMenuC11044l subMenuC11044l = new SubMenuC11044l(this.f51871a, this, c11032g);
        c11032g.m70097x(subMenuC11044l);
        return subMenuC11044l;
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo70152a(i, i2, i3, this.f51872b.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f51872b.getString(i4));
    }
}
