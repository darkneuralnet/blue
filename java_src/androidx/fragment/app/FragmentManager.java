package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.AbstractC11685m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.InterfaceC11728i;
import androidx.savedstate.C11966a;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p000.C53112zy1;
/* loaded from: classes.dex */
public abstract class FragmentManager {

    /* renamed from: S */
    public static boolean f54544S = false;

    /* renamed from: D */
    public AbstractC0407B5<Intent> f54548D;

    /* renamed from: E */
    public AbstractC0407B5<IntentSenderRequest> f54549E;

    /* renamed from: F */
    public AbstractC0407B5<String[]> f54550F;

    /* renamed from: H */
    public boolean f54552H;

    /* renamed from: I */
    public boolean f54553I;

    /* renamed from: J */
    public boolean f54554J;

    /* renamed from: K */
    public boolean f54555K;

    /* renamed from: L */
    public boolean f54556L;

    /* renamed from: M */
    public ArrayList<C11647a> f54557M;

    /* renamed from: N */
    public ArrayList<Boolean> f54558N;

    /* renamed from: O */
    public ArrayList<Fragment> f54559O;

    /* renamed from: P */
    public C11678i f54560P;

    /* renamed from: Q */
    public C53112zy1.C31600c f54561Q;

    /* renamed from: b */
    public boolean f54564b;

    /* renamed from: d */
    public ArrayList<C11647a> f54566d;

    /* renamed from: e */
    public ArrayList<Fragment> f54567e;

    /* renamed from: g */
    public OnBackPressedDispatcher f54569g;

    /* renamed from: m */
    public ArrayList<InterfaceC11640n> f54575m;

    /* renamed from: v */
    public AbstractC11673f<?> f54584v;

    /* renamed from: w */
    public AbstractC38865by1 f54585w;

    /* renamed from: x */
    public Fragment f54586x;

    /* renamed from: y */
    public Fragment f54587y;

    /* renamed from: a */
    public final ArrayList<InterfaceC11641o> f54563a = new ArrayList<>();

    /* renamed from: c */
    public final C11684l f54565c = new C11684l();

    /* renamed from: f */
    public final LayoutInflater$Factory2C11674g f54568f = new LayoutInflater$Factory2C11674g(this);

    /* renamed from: h */
    public final AbstractC36566Ve3 f54570h = new C11628b(false);

    /* renamed from: i */
    public final AtomicInteger f54571i = new AtomicInteger();

    /* renamed from: j */
    public final Map<String, BackStackState> f54572j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k */
    public final Map<String, Bundle> f54573k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l */
    public final Map<String, C11639m> f54574l = Collections.synchronizedMap(new HashMap());

    /* renamed from: n */
    public final C11676h f54576n = new C11676h(this);

    /* renamed from: o */
    public final CopyOnWriteArrayList<InterfaceC48369ry1> f54577o = new CopyOnWriteArrayList<>();

    /* renamed from: p */
    public final InterfaceC48378rz0<Configuration> f54578p = new InterfaceC48378rz0() { // from class: ky1
        @Override // p000.InterfaceC48378rz0
        public final void accept(Object obj) {
            FragmentManager.this.m67366W0((Configuration) obj);
        }
    };

    /* renamed from: q */
    public final InterfaceC48378rz0<Integer> f54579q = new InterfaceC48378rz0() { // from class: ly1
        @Override // p000.InterfaceC48378rz0
        public final void accept(Object obj) {
            FragmentManager.this.m67364X0((Integer) obj);
        }
    };

    /* renamed from: r */
    public final InterfaceC48378rz0<C40988fX2> f54580r = new InterfaceC48378rz0() { // from class: my1
        @Override // p000.InterfaceC48378rz0
        public final void accept(Object obj) {
            FragmentManager.this.m67362Y0((C40988fX2) obj);
        }
    };

    /* renamed from: s */
    public final InterfaceC48378rz0<C45697nT3> f54581s = new InterfaceC48378rz0() { // from class: ny1
        @Override // p000.InterfaceC48378rz0
        public final void accept(Object obj) {
            FragmentManager.this.m67360Z0((C45697nT3) obj);
        }
    };

    /* renamed from: t */
    public final InterfaceC50411vQ2 f54582t = new C11629c();

    /* renamed from: u */
    public int f54583u = -1;

    /* renamed from: z */
    public C11672e f54588z = null;

    /* renamed from: A */
    public C11672e f54545A = new C11630d();

    /* renamed from: B */
    public ON5 f54546B = null;

    /* renamed from: C */
    public ON5 f54547C = new C11631e();

    /* renamed from: G */
    public ArrayDeque<LaunchedFragmentInfo> f54551G = new ArrayDeque<>();

    /* renamed from: R */
    public Runnable f54562R = new RunnableC11632f();

    /* renamed from: androidx.fragment.app.FragmentManager$a */
    /* loaded from: classes.dex */
    public class C11627a implements InterfaceC28515t5<Map<String, Boolean>> {
        public C11627a() {
        }

        @Override // p000.InterfaceC28515t5
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void mo1514a(Map<String, Boolean> map) {
            int i;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (((Boolean) arrayList.get(i2)).booleanValue()) {
                    i = 0;
                } else {
                    i = -1;
                }
                iArr[i2] = i;
            }
            LaunchedFragmentInfo pollFirst = FragmentManager.this.f54551G.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = pollFirst.f54593b;
            int i3 = pollFirst.f54594c;
            Fragment m67141i = FragmentManager.this.f54565c.m67141i(str);
            if (m67141i == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                return;
            }
            m67141i.onRequestPermissionsResult(i3, strArr, iArr);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$b */
    /* loaded from: classes.dex */
    public class C11628b extends AbstractC36566Ve3 {
        public C11628b(boolean z) {
            super(z);
        }

        @Override // p000.AbstractC36566Ve3
        public void handleOnBackPressed() {
            FragmentManager.this.m67393J0();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$c */
    /* loaded from: classes.dex */
    public class C11629c implements InterfaceC50411vQ2 {
        public C11629c() {
        }

        @Override // p000.InterfaceC50411vQ2
        /* renamed from: a */
        public void mo8735a(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.m67406F(menu, menuInflater);
        }

        @Override // p000.InterfaceC50411vQ2
        /* renamed from: b */
        public void mo8734b(Menu menu) {
            FragmentManager.this.m67385N(menu);
        }

        @Override // p000.InterfaceC50411vQ2
        /* renamed from: c */
        public void mo8733c(Menu menu) {
            FragmentManager.this.m67377R(menu);
        }

        @Override // p000.InterfaceC50411vQ2
        /* renamed from: d */
        public boolean mo8732d(MenuItem menuItem) {
            return FragmentManager.this.m67387M(menuItem);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$d */
    /* loaded from: classes.dex */
    public class C11630d extends C11672e {
        public C11630d() {
        }

        @Override // androidx.fragment.app.C11672e
        public Fragment instantiate(ClassLoader classLoader, String str) {
            return FragmentManager.this.m67420A0().m62065b(FragmentManager.this.m67420A0().m67214f(), str, null);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$e */
    /* loaded from: classes.dex */
    public class C11631e implements ON5 {
        public C11631e() {
        }

        @Override // p000.ON5
        /* renamed from: a */
        public AbstractC11688o mo67278a(ViewGroup viewGroup) {
            return new C11648b(viewGroup);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$f */
    /* loaded from: classes.dex */
    public class RunnableC11632f implements Runnable {
        public RunnableC11632f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.m67349d0(true);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$g */
    /* loaded from: classes.dex */
    public class C11633g implements InterfaceC48369ry1 {

        /* renamed from: b */
        public final /* synthetic */ Fragment f54601b;

        public C11633g(Fragment fragment) {
            this.f54601b = fragment;
        }

        @Override // p000.InterfaceC48369ry1
        /* renamed from: a */
        public void mo14975a(FragmentManager fragmentManager, Fragment fragment) {
            this.f54601b.onAttachFragment(fragment);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$h */
    /* loaded from: classes.dex */
    public class C11634h implements InterfaceC28515t5<ActivityResult> {
        public C11634h() {
        }

        @Override // p000.InterfaceC28515t5
        /* renamed from: b */
        public void mo1514a(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.f54551G.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f54593b;
            int i = pollFirst.f54594c;
            Fragment m67141i = FragmentManager.this.f54565c.m67141i(str);
            if (m67141i == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            m67141i.onActivityResult(i, activityResult.m70485b(), activityResult.m70486a());
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$i */
    /* loaded from: classes.dex */
    public class C11635i implements InterfaceC28515t5<ActivityResult> {
        public C11635i() {
        }

        @Override // p000.InterfaceC28515t5
        /* renamed from: b */
        public void mo1514a(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.f54551G.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f54593b;
            int i = pollFirst.f54594c;
            Fragment m67141i = FragmentManager.this.f54565c.m67141i(str);
            if (m67141i == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            m67141i.onActivityResult(i, activityResult.m70485b(), activityResult.m70486a());
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$j */
    /* loaded from: classes.dex */
    public interface InterfaceC11636j {
        String getName();
    }

    /* renamed from: androidx.fragment.app.FragmentManager$k */
    /* loaded from: classes.dex */
    public static class C11637k extends AbstractC29414v5<IntentSenderRequest, ActivityResult> {
        @Override // p000.AbstractC29414v5
        /* renamed from: a */
        public Intent createIntent(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent m70467a = intentSenderRequest.m70467a();
            if (m70467a != null && (bundleExtra = m70467a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                m70467a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (m70467a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.C10949a(intentSenderRequest.m70464d()).m70462b(null).m70461c(intentSenderRequest.m70465c(), intentSenderRequest.m70466b()).m70463a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.m67384N0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // p000.AbstractC29414v5
        /* renamed from: b */
        public ActivityResult parseResult(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$l */
    /* loaded from: classes.dex */
    public static abstract class AbstractC11638l {
        @Deprecated
        /* renamed from: a */
        public void m67273a(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: b */
        public void m67272b(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        /* renamed from: c */
        public void m67271c(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: d */
        public void m67270d(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: e */
        public void m67269e(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: f */
        public void mo4372f(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: g */
        public void m67268g(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        /* renamed from: h */
        public void m67267h(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: i */
        public void mo4371i(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: j */
        public void m67266j(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: k */
        public void m67265k(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: l */
        public void m67264l(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: m */
        public void mo65712m(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        }

        /* renamed from: n */
        public void m67263n(FragmentManager fragmentManager, Fragment fragment) {
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$m */
    /* loaded from: classes.dex */
    public static class C11639m implements InterfaceC51333wy1 {

        /* renamed from: a */
        public final AbstractC11719f f54605a;

        /* renamed from: b */
        public final InterfaceC51333wy1 f54606b;

        /* renamed from: c */
        public final InterfaceC11728i f54607c;

        public C11639m(AbstractC11719f abstractC11719f, InterfaceC51333wy1 interfaceC51333wy1, InterfaceC11728i interfaceC11728i) {
            this.f54605a = abstractC11719f;
            this.f54606b = interfaceC51333wy1;
            this.f54607c = interfaceC11728i;
        }

        @Override // p000.InterfaceC51333wy1
        /* renamed from: a */
        public void mo1245a(String str, Bundle bundle) {
            this.f54606b.mo1245a(str, bundle);
        }

        /* renamed from: b */
        public boolean m67262b(AbstractC11719f.EnumC11724b enumC11724b) {
            return this.f54605a.mo67007b().m67013b(enumC11724b);
        }

        /* renamed from: c */
        public void m67261c() {
            this.f54605a.mo67006d(this.f54607c);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$n */
    /* loaded from: classes.dex */
    public interface InterfaceC11640n {
        void onBackStackChanged();
    }

    /* renamed from: androidx.fragment.app.FragmentManager$o */
    /* loaded from: classes.dex */
    public interface InterfaceC11641o {
        /* renamed from: a */
        boolean mo67239a(ArrayList<C11647a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.FragmentManager$p */
    /* loaded from: classes.dex */
    public class C11642p implements InterfaceC11641o {

        /* renamed from: a */
        public final String f54608a;

        /* renamed from: b */
        public final int f54609b;

        /* renamed from: c */
        public final int f54610c;

        public C11642p(String str, int i, int i2) {
            this.f54608a = str;
            this.f54609b = i;
            this.f54610c = i2;
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC11641o
        /* renamed from: a */
        public boolean mo67239a(ArrayList<C11647a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f54587y;
            if (fragment != null && this.f54609b < 0 && this.f54608a == null && fragment.getChildFragmentManager().m67333i1()) {
                return false;
            }
            return FragmentManager.this.m67321m1(arrayList, arrayList2, this.f54608a, this.f54609b, this.f54610c);
        }
    }

    /* renamed from: H0 */
    public static Fragment m67399H0(View view) {
        Object tag = view.getTag(C41690gi4.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* renamed from: N0 */
    public static boolean m67384N0(int i) {
        return f54544S || Log.isLoggable("FragmentManager", i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W0 */
    public /* synthetic */ void m67366W0(Configuration configuration) {
        if (m67380P0()) {
            m67415C(configuration, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X0 */
    public /* synthetic */ void m67364X0(Integer num) {
        if (m67380P0() && num.intValue() == 80) {
            m67397I(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y0 */
    public /* synthetic */ void m67362Y0(C40988fX2 c40988fX2) {
        if (m67380P0()) {
            m67394J(c40988fX2.m41254a(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z0 */
    public /* synthetic */ void m67360Z0(C45697nT3 c45697nT3) {
        if (m67380P0()) {
            m67379Q(c45697nT3.m23638a(), false);
        }
    }

    /* renamed from: f0 */
    public static void m67343f0(ArrayList<C11647a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C11647a c11647a = arrayList.get(i);
            if (arrayList2.get(i).booleanValue()) {
                c11647a.m67248B(-1);
                c11647a.m67243G();
            } else {
                c11647a.m67248B(1);
                c11647a.m67244F();
            }
            i++;
        }
    }

    /* renamed from: k0 */
    public static <F extends Fragment> F m67328k0(View view) {
        F f = (F) m67313p0(view);
        if (f != null) {
            return f;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    /* renamed from: o0 */
    public static FragmentManager m67316o0(View view) {
        FragmentActivity fragmentActivity;
        Fragment m67313p0 = m67313p0(view);
        if (m67313p0 != null) {
            if (m67313p0.isAdded()) {
                return m67313p0.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + m67313p0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (context instanceof ContextWrapper) {
                if (context instanceof FragmentActivity) {
                    fragmentActivity = (FragmentActivity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                fragmentActivity = null;
                break;
            }
        }
        if (fragmentActivity != null) {
            return fragmentActivity.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    /* renamed from: p0 */
    public static Fragment m67313p0(View view) {
        while (view != null) {
            Fragment m67399H0 = m67399H0(view);
            if (m67399H0 != null) {
                return m67399H0;
            }
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }

    /* renamed from: u1 */
    public static int m67297u1(int i) {
        int i2 = 4097;
        if (i != 4097) {
            if (i != 8194) {
                i2 = 8197;
                if (i == 8197) {
                    return 4100;
                }
                if (i == 4099) {
                    return 4099;
                }
                if (i != 4100) {
                    return 0;
                }
            }
            return i2;
        }
        return 8194;
    }

    /* renamed from: A */
    public void m67421A() {
        this.f54553I = false;
        this.f54554J = false;
        this.f54560P.m67177p(false);
        m67369V(4);
    }

    /* renamed from: A0 */
    public AbstractC11673f<?> m67420A0() {
        return this.f54584v;
    }

    /* renamed from: A1 */
    public final void m67419A1(String str, Bundle bundle) {
        C11639m c11639m = this.f54574l.get(str);
        if (c11639m != null && c11639m.m67262b(AbstractC11719f.EnumC11724b.STARTED)) {
            c11639m.mo1245a(str, bundle);
        } else {
            this.f54573k.put(str, bundle);
        }
        if (m67384N0(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    /* renamed from: B */
    public void m67418B() {
        this.f54553I = false;
        this.f54554J = false;
        this.f54560P.m67177p(false);
        m67369V(0);
    }

    /* renamed from: B0 */
    public LayoutInflater.Factory2 m67417B0() {
        return this.f54568f;
    }

    @SuppressLint({"SyntheticAccessor"})
    /* renamed from: B1 */
    public final void m67416B1(final String str, LifecycleOwner lifecycleOwner, final InterfaceC51333wy1 interfaceC51333wy1) {
        final AbstractC11719f lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.mo67007b() == AbstractC11719f.EnumC11724b.DESTROYED) {
            return;
        }
        InterfaceC11728i interfaceC11728i = new InterfaceC11728i() { // from class: androidx.fragment.app.FragmentManager.6
            @Override // androidx.lifecycle.InterfaceC11728i
            public void onStateChanged(LifecycleOwner lifecycleOwner2, AbstractC11719f.EnumC11720a enumC11720a) {
                Bundle bundle;
                if (enumC11720a == AbstractC11719f.EnumC11720a.ON_START && (bundle = (Bundle) FragmentManager.this.f54573k.get(str)) != null) {
                    interfaceC51333wy1.mo1245a(str, bundle);
                    FragmentManager.this.m67296v(str);
                }
                if (enumC11720a == AbstractC11719f.EnumC11720a.ON_DESTROY) {
                    lifecycle.mo67006d(this);
                    FragmentManager.this.f54574l.remove(str);
                }
            }
        };
        C11639m put = this.f54574l.put(str, new C11639m(lifecycle, interfaceC51333wy1, interfaceC11728i));
        if (put != null) {
            put.m67261c();
        }
        if (m67384N0(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + lifecycle + " and listener " + interfaceC51333wy1);
        }
        lifecycle.mo67008a(interfaceC11728i);
    }

    /* renamed from: C */
    public void m67415C(Configuration configuration, boolean z) {
        if (z && (this.f54584v instanceof InterfaceC44624lf3)) {
            m67398H1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.f54565c.m67135o()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z) {
                    fragment.mChildFragmentManager.m67415C(configuration, true);
                }
            }
        }
    }

    /* renamed from: C0 */
    public C11676h m67414C0() {
        return this.f54576n;
    }

    /* renamed from: C1 */
    public void m67413C1(Fragment fragment, AbstractC11719f.EnumC11724b enumC11724b) {
        if (fragment.equals(m67334i0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = enumC11724b;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: D */
    public boolean m67412D(MenuItem menuItem) {
        if (this.f54583u < 1) {
            return false;
        }
        for (Fragment fragment : this.f54565c.m67135o()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: D0 */
    public Fragment m67411D0() {
        return this.f54586x;
    }

    /* renamed from: D1 */
    public void m67410D1(Fragment fragment) {
        if (fragment != null && (!fragment.equals(m67334i0(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this))) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        Fragment fragment2 = this.f54587y;
        this.f54587y = fragment;
        m67383O(fragment2);
        m67383O(this.f54587y);
    }

    /* renamed from: E */
    public void m67409E() {
        this.f54553I = false;
        this.f54554J = false;
        this.f54560P.m67177p(false);
        m67369V(1);
    }

    /* renamed from: E0 */
    public Fragment m67408E0() {
        return this.f54587y;
    }

    /* renamed from: E1 */
    public final void m67407E1(Fragment fragment) {
        ViewGroup m67289x0 = m67289x0(fragment);
        if (m67289x0 != null && fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() > 0) {
            int i = C41690gi4.visible_removing_fragment_view_tag;
            if (m67289x0.getTag(i) == null) {
                m67289x0.setTag(i, fragment);
            }
            ((Fragment) m67289x0.getTag(i)).setPopDirection(fragment.getPopDirection());
        }
    }

    /* renamed from: F */
    public boolean m67406F(Menu menu, MenuInflater menuInflater) {
        if (this.f54583u < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.f54565c.m67135o()) {
            if (fragment != null && m67376R0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f54567e != null) {
            for (int i = 0; i < this.f54567e.size(); i++) {
                Fragment fragment2 = this.f54567e.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f54567e = arrayList;
        return z;
    }

    /* renamed from: F0 */
    public ON5 m67405F0() {
        ON5 on5 = this.f54546B;
        if (on5 != null) {
            return on5;
        }
        Fragment fragment = this.f54586x;
        if (fragment != null) {
            return fragment.mFragmentManager.m67405F0();
        }
        return this.f54547C;
    }

    /* renamed from: F1 */
    public void m67404F1(Fragment fragment) {
        if (m67384N0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    /* renamed from: G */
    public void m67403G() {
        this.f54555K = true;
        m67349d0(true);
        m67358a0();
        m67299u();
        m67369V(-1);
        AbstractC11673f<?> abstractC11673f = this.f54584v;
        if (abstractC11673f instanceof InterfaceC46423oh3) {
            ((InterfaceC46423oh3) abstractC11673f).removeOnTrimMemoryListener(this.f54579q);
        }
        AbstractC11673f<?> abstractC11673f2 = this.f54584v;
        if (abstractC11673f2 instanceof InterfaceC44624lf3) {
            ((InterfaceC44624lf3) abstractC11673f2).removeOnConfigurationChangedListener(this.f54578p);
        }
        AbstractC11673f<?> abstractC11673f3 = this.f54584v;
        if (abstractC11673f3 instanceof InterfaceC37052Xg3) {
            ((InterfaceC37052Xg3) abstractC11673f3).removeOnMultiWindowModeChangedListener(this.f54580r);
        }
        AbstractC11673f<?> abstractC11673f4 = this.f54584v;
        if (abstractC11673f4 instanceof InterfaceC38697bh3) {
            ((InterfaceC38697bh3) abstractC11673f4).removeOnPictureInPictureModeChangedListener(this.f54581s);
        }
        AbstractC11673f<?> abstractC11673f5 = this.f54584v;
        if ((abstractC11673f5 instanceof VP2) && this.f54586x == null) {
            ((VP2) abstractC11673f5).removeMenuProvider(this.f54582t);
        }
        this.f54584v = null;
        this.f54585w = null;
        this.f54586x = null;
        if (this.f54569g != null) {
            this.f54570h.remove();
            this.f54569g = null;
        }
        AbstractC0407B5<Intent> abstractC0407B5 = this.f54548D;
        if (abstractC0407B5 != null) {
            abstractC0407B5.mo67435c();
            this.f54549E.mo67435c();
            this.f54550F.mo67435c();
        }
    }

    /* renamed from: G0 */
    public C53112zy1.C31600c m67402G0() {
        return this.f54561Q;
    }

    /* renamed from: G1 */
    public final void m67401G1() {
        for (C11680j c11680j : this.f54565c.m67139k()) {
            m67339g1(c11680j);
        }
    }

    /* renamed from: H */
    public void m67400H() {
        m67369V(1);
    }

    /* renamed from: H1 */
    public final void m67398H1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C51324wx2("FragmentManager"));
        AbstractC11673f<?> abstractC11673f = this.f54584v;
        if (abstractC11673f != null) {
            try {
                abstractC11673f.mo67212h("  ", null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                m67361Z("  ", null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw runtimeException;
    }

    /* renamed from: I */
    public void m67397I(boolean z) {
        if (z && (this.f54584v instanceof InterfaceC46423oh3)) {
            m67398H1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.f54565c.m67135o()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z) {
                    fragment.mChildFragmentManager.m67397I(true);
                }
            }
        }
    }

    /* renamed from: I0 */
    public C36920Wr6 m67396I0(Fragment fragment) {
        return this.f54560P.m67180m(fragment);
    }

    /* renamed from: I1 */
    public void m67395I1(AbstractC11638l abstractC11638l) {
        this.f54576n.m67189p(abstractC11638l);
    }

    /* renamed from: J */
    public void m67394J(boolean z, boolean z2) {
        if (z2 && (this.f54584v instanceof InterfaceC37052Xg3)) {
            m67398H1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.f54565c.m67135o()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.m67394J(z, true);
                }
            }
        }
    }

    /* renamed from: J0 */
    public void m67393J0() {
        m67349d0(true);
        if (this.f54570h.isEnabled()) {
            m67333i1();
        } else {
            this.f54569g.m70494f();
        }
    }

    /* renamed from: J1 */
    public final void m67392J1() {
        synchronized (this.f54563a) {
            boolean z = true;
            if (!this.f54563a.isEmpty()) {
                this.f54570h.setEnabled(true);
            } else {
                this.f54570h.setEnabled((m67301t0() <= 0 || !m67374S0(this.f54586x)) ? false : false);
            }
        }
    }

    /* renamed from: K */
    public void m67391K(Fragment fragment) {
        Iterator<InterfaceC48369ry1> it = this.f54577o.iterator();
        while (it.hasNext()) {
            it.next().mo14975a(this, fragment);
        }
    }

    /* renamed from: K0 */
    public void m67390K0(Fragment fragment) {
        if (m67384N0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
            m67407E1(fragment);
        }
    }

    /* renamed from: L */
    public void m67389L() {
        for (Fragment fragment : this.f54565c.m67138l()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.m67389L();
            }
        }
    }

    /* renamed from: L0 */
    public void m67388L0(Fragment fragment) {
        if (fragment.mAdded && m67382O0(fragment)) {
            this.f54552H = true;
        }
    }

    /* renamed from: M */
    public boolean m67387M(MenuItem menuItem) {
        if (this.f54583u < 1) {
            return false;
        }
        for (Fragment fragment : this.f54565c.m67135o()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: M0 */
    public boolean m67386M0() {
        return this.f54555K;
    }

    /* renamed from: N */
    public void m67385N(Menu menu) {
        if (this.f54583u < 1) {
            return;
        }
        for (Fragment fragment : this.f54565c.m67135o()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    /* renamed from: O */
    public final void m67383O(Fragment fragment) {
        if (fragment != null && fragment.equals(m67334i0(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    /* renamed from: O0 */
    public final boolean m67382O0(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.m67308r();
    }

    /* renamed from: P */
    public void m67381P() {
        m67369V(5);
    }

    /* renamed from: P0 */
    public final boolean m67380P0() {
        Fragment fragment = this.f54586x;
        if (fragment == null) {
            return true;
        }
        if (fragment.isAdded() && this.f54586x.getParentFragmentManager().m67380P0()) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public void m67379Q(boolean z, boolean z2) {
        if (z2 && (this.f54584v instanceof InterfaceC38697bh3)) {
            m67398H1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.f54565c.m67135o()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.m67379Q(z, true);
                }
            }
        }
    }

    /* renamed from: Q0 */
    public boolean m67378Q0(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    /* renamed from: R */
    public boolean m67377R(Menu menu) {
        boolean z = false;
        if (this.f54583u < 1) {
            return false;
        }
        for (Fragment fragment : this.f54565c.m67135o()) {
            if (fragment != null && m67376R0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: R0 */
    public boolean m67376R0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    /* renamed from: S */
    public void m67375S() {
        m67392J1();
        m67383O(this.f54587y);
    }

    /* renamed from: S0 */
    public boolean m67374S0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragment.equals(fragmentManager.m67408E0()) && m67374S0(fragmentManager.f54586x)) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public void m67373T() {
        this.f54553I = false;
        this.f54554J = false;
        this.f54560P.m67177p(false);
        m67369V(7);
    }

    /* renamed from: T0 */
    public boolean m67372T0(int i) {
        return this.f54583u >= i;
    }

    /* renamed from: U */
    public void m67371U() {
        this.f54553I = false;
        this.f54554J = false;
        this.f54560P.m67177p(false);
        m67369V(5);
    }

    /* renamed from: U0 */
    public boolean m67370U0() {
        return this.f54553I || this.f54554J;
    }

    /* renamed from: V */
    public final void m67369V(int i) {
        try {
            this.f54564b = true;
            this.f54565c.m67146d(i);
            m67348d1(i, false);
            for (AbstractC11688o abstractC11688o : m67293w()) {
                abstractC11688o.m67082j();
            }
            this.f54564b = false;
            m67349d0(true);
        } catch (Throwable th) {
            this.f54564b = false;
            throw th;
        }
    }

    /* renamed from: W */
    public void m67367W() {
        this.f54554J = true;
        this.f54560P.m67177p(true);
        m67369V(4);
    }

    /* renamed from: X */
    public void m67365X() {
        m67369V(2);
    }

    /* renamed from: Y */
    public final void m67363Y() {
        if (this.f54556L) {
            this.f54556L = false;
            m67401G1();
        }
    }

    /* renamed from: Z */
    public void m67361Z(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f54565c.m67145e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f54567e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f54567e.get(i).toString());
            }
        }
        ArrayList<C11647a> arrayList2 = this.f54566d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                C11647a c11647a = this.f54566d.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(c11647a.toString());
                c11647a.m67246D(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f54571i.get());
        synchronized (this.f54563a) {
            int size3 = this.f54563a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(this.f54563a.get(i3));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f54584v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f54585w);
        if (this.f54586x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f54586x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f54583u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f54553I);
        printWriter.print(" mStopped=");
        printWriter.print(this.f54554J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f54555K);
        if (this.f54552H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f54552H);
        }
    }

    /* renamed from: a0 */
    public final void m67358a0() {
        for (AbstractC11688o abstractC11688o : m67293w()) {
            abstractC11688o.m67082j();
        }
    }

    /* renamed from: a1 */
    public void m67357a1(Fragment fragment, String[] strArr, int i) {
        if (this.f54550F != null) {
            this.f54551G.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
            this.f54550F.m114705a(strArr);
            return;
        }
        this.f54584v.m67209k(fragment, strArr, i);
    }

    /* renamed from: b0 */
    public void m67355b0(InterfaceC11641o interfaceC11641o, boolean z) {
        if (!z) {
            if (this.f54584v == null) {
                if (this.f54555K) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            m67305s();
        }
        synchronized (this.f54563a) {
            if (this.f54584v == null) {
                if (z) {
                    return;
                }
                throw new IllegalStateException("Activity has been destroyed");
            }
            this.f54563a.add(interfaceC11641o);
            m67288x1();
        }
    }

    /* renamed from: b1 */
    public void m67354b1(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (this.f54548D != null) {
            this.f54551G.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
            if (intent != null && bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.f54548D.m114705a(intent);
            return;
        }
        this.f54584v.m67207m(fragment, intent, i, bundle);
    }

    /* renamed from: c0 */
    public final void m67352c0(boolean z) {
        if (!this.f54564b) {
            if (this.f54584v == null) {
                if (this.f54555K) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (Looper.myLooper() == this.f54584v.m67213g().getLooper()) {
                if (!z) {
                    m67305s();
                }
                if (this.f54557M == null) {
                    this.f54557M = new ArrayList<>();
                    this.f54558N = new ArrayList<>();
                    return;
                }
                return;
            } else {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    /* renamed from: c1 */
    public void m67351c1(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (this.f54549E != null) {
            if (bundle != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                } else {
                    intent2 = intent;
                }
                if (m67384N0(2)) {
                    Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
                }
                intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            } else {
                intent2 = intent;
            }
            IntentSenderRequest m70463a = new IntentSenderRequest.C10949a(intentSender).m70462b(intent2).m70461c(i3, i2).m70463a();
            this.f54551G.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
            if (m67384N0(2)) {
                Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
            }
            this.f54549E.m114705a(m70463a);
            return;
        }
        this.f54584v.m67206n(fragment, intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* renamed from: d0 */
    public boolean m67349d0(boolean z) {
        m67352c0(z);
        boolean z2 = false;
        while (m67307r0(this.f54557M, this.f54558N)) {
            z2 = true;
            this.f54564b = true;
            try {
                m67309q1(this.f54557M, this.f54558N);
            } finally {
                m67302t();
            }
        }
        m67392J1();
        m67363Y();
        this.f54565c.m67148b();
        return z2;
    }

    /* renamed from: d1 */
    public void m67348d1(int i, boolean z) {
        AbstractC11673f<?> abstractC11673f;
        if (this.f54584v == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (!z && i == this.f54583u) {
            return;
        }
        this.f54583u = i;
        this.f54565c.m67130t();
        m67401G1();
        if (this.f54552H && (abstractC11673f = this.f54584v) != null && this.f54583u == 7) {
            abstractC11673f.mo67205o();
            this.f54552H = false;
        }
    }

    /* renamed from: e0 */
    public void m67346e0(InterfaceC11641o interfaceC11641o, boolean z) {
        if (z && (this.f54584v == null || this.f54555K)) {
            return;
        }
        m67352c0(z);
        if (interfaceC11641o.mo67239a(this.f54557M, this.f54558N)) {
            this.f54564b = true;
            try {
                m67309q1(this.f54557M, this.f54558N);
            } finally {
                m67302t();
            }
        }
        m67392J1();
        m67363Y();
        this.f54565c.m67148b();
    }

    /* renamed from: e1 */
    public void m67345e1() {
        if (this.f54584v == null) {
            return;
        }
        this.f54553I = false;
        this.f54554J = false;
        this.f54560P.m67177p(false);
        for (Fragment fragment : this.f54565c.m67135o()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    /* renamed from: f1 */
    public void m67342f1(FragmentContainerView fragmentContainerView) {
        View view;
        for (C11680j c11680j : this.f54565c.m67139k()) {
            Fragment m67165k = c11680j.m67165k();
            if (m67165k.mContainerId == fragmentContainerView.getId() && (view = m67165k.mView) != null && view.getParent() == null) {
                m67165k.mContainer = fragmentContainerView;
                c11680j.m67174b();
            }
        }
    }

    /* renamed from: g0 */
    public final void m67340g0(ArrayList<C11647a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        boolean z = arrayList.get(i).f54765r;
        ArrayList<Fragment> arrayList3 = this.f54559O;
        if (arrayList3 == null) {
            this.f54559O = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.f54559O.addAll(this.f54565c.m67135o());
        Fragment m67408E0 = m67408E0();
        boolean z2 = false;
        for (int i3 = i; i3 < i2; i3++) {
            C11647a c11647a = arrayList.get(i3);
            if (!arrayList2.get(i3).booleanValue()) {
                m67408E0 = c11647a.m67242H(this.f54559O, m67408E0);
            } else {
                m67408E0 = c11647a.m67240J(this.f54559O, m67408E0);
            }
            if (!z2 && !c11647a.f54756i) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        this.f54559O.clear();
        if (!z && this.f54583u >= 1) {
            for (int i4 = i; i4 < i2; i4++) {
                Iterator<AbstractC11685m.C11686a> it = arrayList.get(i4).f54750c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f54768b;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.f54565c.m67132r(m67287y(fragment));
                    }
                }
            }
        }
        m67343f0(arrayList, arrayList2, i, i2);
        boolean booleanValue = arrayList2.get(i2 - 1).booleanValue();
        for (int i5 = i; i5 < i2; i5++) {
            C11647a c11647a2 = arrayList.get(i5);
            if (booleanValue) {
                for (int size = c11647a2.f54750c.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = c11647a2.f54750c.get(size).f54768b;
                    if (fragment2 != null) {
                        m67287y(fragment2).m67163m();
                    }
                }
            } else {
                Iterator<AbstractC11685m.C11686a> it2 = c11647a2.f54750c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment3 = it2.next().f54768b;
                    if (fragment3 != null) {
                        m67287y(fragment3).m67163m();
                    }
                }
            }
        }
        m67348d1(this.f54583u, true);
        for (AbstractC11688o abstractC11688o : m67290x(arrayList, i, i2)) {
            abstractC11688o.m67074r(booleanValue);
            abstractC11688o.m67076p();
            abstractC11688o.m67085g();
        }
        while (i < i2) {
            C11647a c11647a3 = arrayList.get(i);
            if (arrayList2.get(i).booleanValue() && c11647a3.f54648v >= 0) {
                c11647a3.f54648v = -1;
            }
            c11647a3.m67241I();
            i++;
        }
        if (z2) {
            m67303s1();
        }
    }

    /* renamed from: g1 */
    public void m67339g1(C11680j c11680j) {
        Fragment m67165k = c11680j.m67165k();
        if (m67165k.mDeferStart) {
            if (this.f54564b) {
                this.f54556L = true;
                return;
            }
            m67165k.mDeferStart = false;
            c11680j.m67163m();
        }
    }

    /* renamed from: h0 */
    public boolean m67337h0() {
        boolean m67349d0 = m67349d0(true);
        m67310q0();
        return m67349d0;
    }

    /* renamed from: h1 */
    public void m67336h1(int i, int i2, boolean z) {
        if (i >= 0) {
            m67355b0(new C11642p(null, i, i2), z);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* renamed from: i */
    public void m67335i(C11647a c11647a) {
        if (this.f54566d == null) {
            this.f54566d = new ArrayList<>();
        }
        this.f54566d.add(c11647a);
    }

    /* renamed from: i0 */
    public Fragment m67334i0(String str) {
        return this.f54565c.m67144f(str);
    }

    /* renamed from: i1 */
    public boolean m67333i1() {
        return m67324l1(null, -1, 0);
    }

    /* renamed from: j */
    public C11680j m67332j(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            C53112zy1.m75f(fragment, str);
        }
        if (m67384N0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        C11680j m67287y = m67287y(fragment);
        fragment.mFragmentManager = this;
        this.f54565c.m67132r(m67287y);
        if (!fragment.mDetached) {
            this.f54565c.m67149a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (m67382O0(fragment)) {
                this.f54552H = true;
            }
        }
        return m67287y;
    }

    /* renamed from: j0 */
    public final int m67331j0(String str, int i, boolean z) {
        ArrayList<C11647a> arrayList = this.f54566d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i < 0) {
            if (z) {
                return 0;
            }
            return this.f54566d.size() - 1;
        }
        int size = this.f54566d.size() - 1;
        while (size >= 0) {
            C11647a c11647a = this.f54566d.get(size);
            if ((str != null && str.equals(c11647a.getName())) || (i >= 0 && i == c11647a.f54648v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (z) {
            while (size > 0) {
                C11647a c11647a2 = this.f54566d.get(size - 1);
                if ((str != null && str.equals(c11647a2.getName())) || (i >= 0 && i == c11647a2.f54648v)) {
                    size--;
                } else {
                    return size;
                }
            }
            return size;
        } else if (size == this.f54566d.size() - 1) {
            return -1;
        } else {
            return size + 1;
        }
    }

    /* renamed from: j1 */
    public boolean m67330j1(int i, int i2) {
        if (i >= 0) {
            return m67324l1(null, i, i2);
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* renamed from: k */
    public void m67329k(InterfaceC48369ry1 interfaceC48369ry1) {
        this.f54577o.add(interfaceC48369ry1);
    }

    /* renamed from: k1 */
    public boolean m67327k1(String str, int i) {
        return m67324l1(str, -1, i);
    }

    /* renamed from: l */
    public void m67326l(InterfaceC11640n interfaceC11640n) {
        if (this.f54575m == null) {
            this.f54575m = new ArrayList<>();
        }
        this.f54575m.add(interfaceC11640n);
    }

    /* renamed from: l0 */
    public Fragment m67325l0(int i) {
        return this.f54565c.m67143g(i);
    }

    /* renamed from: l1 */
    public final boolean m67324l1(String str, int i, int i2) {
        m67349d0(false);
        m67352c0(true);
        Fragment fragment = this.f54587y;
        if (fragment != null && i < 0 && str == null && fragment.getChildFragmentManager().m67333i1()) {
            return true;
        }
        boolean m67321m1 = m67321m1(this.f54557M, this.f54558N, str, i, i2);
        if (m67321m1) {
            this.f54564b = true;
            try {
                m67309q1(this.f54557M, this.f54558N);
            } finally {
                m67302t();
            }
        }
        m67392J1();
        m67363Y();
        this.f54565c.m67148b();
        return m67321m1;
    }

    /* renamed from: m */
    public void m67323m(Fragment fragment) {
        this.f54560P.m67188e(fragment);
    }

    /* renamed from: m0 */
    public Fragment m67322m0(String str) {
        return this.f54565c.m67142h(str);
    }

    /* renamed from: m1 */
    public boolean m67321m1(ArrayList<C11647a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        boolean z;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        int m67331j0 = m67331j0(str, i, z);
        if (m67331j0 < 0) {
            return false;
        }
        for (int size = this.f54566d.size() - 1; size >= m67331j0; size--) {
            arrayList.add(this.f54566d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* renamed from: n */
    public int m67320n() {
        return this.f54571i.getAndIncrement();
    }

    /* renamed from: n0 */
    public Fragment m67319n0(String str) {
        return this.f54565c.m67141i(str);
    }

    /* renamed from: n1 */
    public void m67318n1(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            m67398H1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    @SuppressLint({"SyntheticAccessor"})
    /* renamed from: o */
    public void m67317o(AbstractC11673f<?> abstractC11673f, AbstractC38865by1 abstractC38865by1, Fragment fragment) {
        String str;
        if (this.f54584v == null) {
            this.f54584v = abstractC11673f;
            this.f54585w = abstractC38865by1;
            this.f54586x = fragment;
            if (fragment != null) {
                m67329k(new C11633g(fragment));
            } else if (abstractC11673f instanceof InterfaceC48369ry1) {
                m67329k((InterfaceC48369ry1) abstractC11673f);
            }
            if (this.f54586x != null) {
                m67392J1();
            }
            if (abstractC11673f instanceof InterfaceC39270cf3) {
                InterfaceC39270cf3 interfaceC39270cf3 = (InterfaceC39270cf3) abstractC11673f;
                OnBackPressedDispatcher onBackPressedDispatcher = interfaceC39270cf3.getOnBackPressedDispatcher();
                this.f54569g = onBackPressedDispatcher;
                LifecycleOwner lifecycleOwner = interfaceC39270cf3;
                if (fragment != null) {
                    lifecycleOwner = fragment;
                }
                onBackPressedDispatcher.m70498b(lifecycleOwner, this.f54570h);
            }
            if (fragment != null) {
                this.f54560P = fragment.mFragmentManager.m67298u0(fragment);
            } else if (abstractC11673f instanceof InterfaceC37154Xr6) {
                this.f54560P = C11678i.m67182k(((InterfaceC37154Xr6) abstractC11673f).getViewModelStore());
            } else {
                this.f54560P = new C11678i(false);
            }
            this.f54560P.m67177p(m67370U0());
            this.f54565c.m67151A(this.f54560P);
            AbstractC11673f<?> abstractC11673f2 = this.f54584v;
            if ((abstractC11673f2 instanceof InterfaceC35200Pi5) && fragment == null) {
                C11966a savedStateRegistry = ((InterfaceC35200Pi5) abstractC11673f2).getSavedStateRegistry();
                savedStateRegistry.m66069i("android:support:fragments", new C11966a.InterfaceC11969c() { // from class: oy1
                    @Override // androidx.savedstate.C11966a.InterfaceC11969c
                    /* renamed from: a */
                    public final Bundle mo18217a() {
                        Bundle m67368V0;
                        m67368V0 = FragmentManager.this.m67368V0();
                        return m67368V0;
                    }
                });
                Bundle m66076b = savedStateRegistry.m66076b("android:support:fragments");
                if (m66076b != null) {
                    m67300t1(m66076b);
                }
            }
            AbstractC11673f<?> abstractC11673f3 = this.f54584v;
            if (abstractC11673f3 instanceof InterfaceC1735E5) {
                ActivityResultRegistry activityResultRegistry = ((InterfaceC1735E5) abstractC11673f3).getActivityResultRegistry();
                if (fragment != null) {
                    str = fragment.mWho + ":";
                } else {
                    str = "";
                }
                String str2 = "FragmentManager:" + str;
                this.f54548D = activityResultRegistry.m70473i(str2 + "StartActivityForResult", new C30903z5(), new C11634h());
                this.f54549E = activityResultRegistry.m70473i(str2 + "StartIntentSenderForResult", new C11637k(), new C11635i());
                this.f54550F = activityResultRegistry.m70473i(str2 + "RequestPermissions", new C30036x5(), new C11627a());
            }
            AbstractC11673f<?> abstractC11673f4 = this.f54584v;
            if (abstractC11673f4 instanceof InterfaceC44624lf3) {
                ((InterfaceC44624lf3) abstractC11673f4).addOnConfigurationChangedListener(this.f54578p);
            }
            AbstractC11673f<?> abstractC11673f5 = this.f54584v;
            if (abstractC11673f5 instanceof InterfaceC46423oh3) {
                ((InterfaceC46423oh3) abstractC11673f5).addOnTrimMemoryListener(this.f54579q);
            }
            AbstractC11673f<?> abstractC11673f6 = this.f54584v;
            if (abstractC11673f6 instanceof InterfaceC37052Xg3) {
                ((InterfaceC37052Xg3) abstractC11673f6).addOnMultiWindowModeChangedListener(this.f54580r);
            }
            AbstractC11673f<?> abstractC11673f7 = this.f54584v;
            if (abstractC11673f7 instanceof InterfaceC38697bh3) {
                ((InterfaceC38697bh3) abstractC11673f7).addOnPictureInPictureModeChangedListener(this.f54581s);
            }
            AbstractC11673f<?> abstractC11673f8 = this.f54584v;
            if ((abstractC11673f8 instanceof VP2) && fragment == null) {
                ((VP2) abstractC11673f8).addMenuProvider(this.f54582t);
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    /* renamed from: o1 */
    public void m67315o1(AbstractC11638l abstractC11638l, boolean z) {
        this.f54576n.m67190o(abstractC11638l, z);
    }

    /* renamed from: p */
    public void m67314p(Fragment fragment) {
        if (m67384N0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.f54565c.m67149a(fragment);
                if (m67384N0(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (m67382O0(fragment)) {
                    this.f54552H = true;
                }
            }
        }
    }

    /* renamed from: p1 */
    public void m67312p1(Fragment fragment) {
        if (m67384N0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            this.f54565c.m67129u(fragment);
            if (m67382O0(fragment)) {
                this.f54552H = true;
            }
            fragment.mRemoving = true;
            m67407E1(fragment);
        }
    }

    /* renamed from: q */
    public AbstractC11685m m67311q() {
        return new C11647a(this);
    }

    /* renamed from: q0 */
    public final void m67310q0() {
        for (AbstractC11688o abstractC11688o : m67293w()) {
            abstractC11688o.m67081k();
        }
    }

    /* renamed from: q1 */
    public final void m67309q1(ArrayList<C11647a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!arrayList.get(i).f54765r) {
                    if (i2 != i) {
                        m67340g0(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (arrayList2.get(i).booleanValue()) {
                        while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f54765r) {
                            i2++;
                        }
                    }
                    m67340g0(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                m67340g0(arrayList, arrayList2, i2, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    /* renamed from: r */
    public boolean m67308r() {
        boolean z = false;
        for (Fragment fragment : this.f54565c.m67138l()) {
            if (fragment != null) {
                z = m67382O0(fragment);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r0 */
    public final boolean m67307r0(ArrayList<C11647a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f54563a) {
            if (this.f54563a.isEmpty()) {
                return false;
            }
            int size = this.f54563a.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                z |= this.f54563a.get(i).mo67239a(arrayList, arrayList2);
            }
            this.f54563a.clear();
            this.f54584v.m67213g().removeCallbacks(this.f54562R);
            return z;
        }
    }

    /* renamed from: r1 */
    public void m67306r1(Fragment fragment) {
        this.f54560P.m67178o(fragment);
    }

    /* renamed from: s */
    public final void m67305s() {
        if (!m67370U0()) {
            return;
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    /* renamed from: s0 */
    public InterfaceC11636j m67304s0(int i) {
        return this.f54566d.get(i);
    }

    /* renamed from: s1 */
    public final void m67303s1() {
        if (this.f54575m != null) {
            for (int i = 0; i < this.f54575m.size(); i++) {
                this.f54575m.get(i).onBackStackChanged();
            }
        }
    }

    /* renamed from: t */
    public final void m67302t() {
        this.f54564b = false;
        this.f54558N.clear();
        this.f54557M.clear();
    }

    /* renamed from: t0 */
    public int m67301t0() {
        ArrayList<C11647a> arrayList = this.f54566d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: t1 */
    public void m67300t1(Parcelable parcelable) {
        C11680j c11680j;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f54584v.m67214f().getClassLoader());
                this.f54573k.put(str.substring(7), bundle2);
            }
        }
        ArrayList<FragmentState> arrayList = new ArrayList<>();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f54584v.m67214f().getClassLoader());
                arrayList.add((FragmentState) bundle.getParcelable(TransferTable.COLUMN_STATE));
            }
        }
        this.f54565c.m67126x(arrayList);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable(TransferTable.COLUMN_STATE);
        if (fragmentManagerState == null) {
            return;
        }
        this.f54565c.m67128v();
        Iterator<String> it = fragmentManagerState.f54612b.iterator();
        while (it.hasNext()) {
            FragmentState m67150B = this.f54565c.m67150B(it.next(), null);
            if (m67150B != null) {
                Fragment m67184i = this.f54560P.m67184i(m67150B.f54621c);
                if (m67184i != null) {
                    if (m67384N0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + m67184i);
                    }
                    c11680j = new C11680j(this.f54576n, this.f54565c, m67184i, m67150B);
                } else {
                    c11680j = new C11680j(this.f54576n, this.f54565c, this.f54584v.m67214f().getClassLoader(), m67286y0(), m67150B);
                }
                Fragment m67165k = c11680j.m67165k();
                m67165k.mFragmentManager = this;
                if (m67384N0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + m67165k.mWho + "): " + m67165k);
                }
                c11680j.m67161o(this.f54584v.m67214f().getClassLoader());
                this.f54565c.m67132r(c11680j);
                c11680j.m67155u(this.f54583u);
            }
        }
        for (Fragment fragment : this.f54560P.m67181l()) {
            if (!this.f54565c.m67147c(fragment.mWho)) {
                if (m67384N0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + fragmentManagerState.f54612b);
                }
                this.f54560P.m67178o(fragment);
                fragment.mFragmentManager = this;
                C11680j c11680j2 = new C11680j(this.f54576n, this.f54565c, fragment);
                c11680j2.m67155u(1);
                c11680j2.m67163m();
                fragment.mRemoving = true;
                c11680j2.m67163m();
            }
        }
        this.f54565c.m67127w(fragmentManagerState.f54613c);
        if (fragmentManagerState.f54614d != null) {
            this.f54566d = new ArrayList<>(fragmentManagerState.f54614d.length);
            int i = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f54614d;
                if (i >= backStackRecordStateArr.length) {
                    break;
                }
                C11647a m67444b = backStackRecordStateArr[i].m67444b(this);
                if (m67384N0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i + " (index " + m67444b.f54648v + "): " + m67444b);
                    PrintWriter printWriter = new PrintWriter(new C51324wx2("FragmentManager"));
                    m67444b.m67245E("  ", printWriter, false);
                    printWriter.close();
                }
                this.f54566d.add(m67444b);
                i++;
            }
        } else {
            this.f54566d = null;
        }
        this.f54571i.set(fragmentManagerState.f54615e);
        String str3 = fragmentManagerState.f54616f;
        if (str3 != null) {
            Fragment m67334i0 = m67334i0(str3);
            this.f54587y = m67334i0;
            m67383O(m67334i0);
        }
        ArrayList<String> arrayList2 = fragmentManagerState.f54617g;
        if (arrayList2 != null) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                this.f54572j.put(arrayList2.get(i2), fragmentManagerState.f54618h.get(i2));
            }
        }
        this.f54551G = new ArrayDeque<>(fragmentManagerState.f54619i);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f54586x;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f54586x)));
            sb.append("}");
        } else {
            AbstractC11673f<?> abstractC11673f = this.f54584v;
            if (abstractC11673f != null) {
                sb.append(abstractC11673f.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f54584v)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u */
    public final void m67299u() {
        boolean z;
        AbstractC11673f<?> abstractC11673f = this.f54584v;
        if (abstractC11673f instanceof InterfaceC37154Xr6) {
            z = this.f54565c.m67134p().m67179n();
        } else if (abstractC11673f.m67214f() instanceof Activity) {
            z = !((Activity) this.f54584v.m67214f()).isChangingConfigurations();
        } else {
            z = true;
        }
        if (z) {
            for (BackStackState backStackState : this.f54572j.values()) {
                for (String str : backStackState.f54495b) {
                    this.f54565c.m67134p().m67186g(str);
                }
            }
        }
    }

    /* renamed from: u0 */
    public final C11678i m67298u0(Fragment fragment) {
        return this.f54560P.m67183j(fragment);
    }

    /* renamed from: v */
    public final void m67296v(String str) {
        this.f54573k.remove(str);
        if (m67384N0(2)) {
            Log.v("FragmentManager", "Clearing fragment result with key " + str);
        }
    }

    /* renamed from: v0 */
    public AbstractC38865by1 m67295v0() {
        return this.f54585w;
    }

    /* renamed from: v1 */
    public Bundle m67368V0() {
        BackStackRecordState[] backStackRecordStateArr;
        int size;
        Bundle bundle = new Bundle();
        m67310q0();
        m67358a0();
        m67349d0(true);
        this.f54553I = true;
        this.f54560P.m67177p(true);
        ArrayList<String> m67125y = this.f54565c.m67125y();
        ArrayList<FragmentState> m67137m = this.f54565c.m67137m();
        if (m67137m.isEmpty()) {
            if (m67384N0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
        } else {
            ArrayList<String> m67124z = this.f54565c.m67124z();
            ArrayList<C11647a> arrayList = this.f54566d;
            if (arrayList != null && (size = arrayList.size()) > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i = 0; i < size; i++) {
                    backStackRecordStateArr[i] = new BackStackRecordState(this.f54566d.get(i));
                    if (m67384N0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.f54566d.get(i));
                    }
                }
            } else {
                backStackRecordStateArr = null;
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f54612b = m67125y;
            fragmentManagerState.f54613c = m67124z;
            fragmentManagerState.f54614d = backStackRecordStateArr;
            fragmentManagerState.f54615e = this.f54571i.get();
            Fragment fragment = this.f54587y;
            if (fragment != null) {
                fragmentManagerState.f54616f = fragment.mWho;
            }
            fragmentManagerState.f54617g.addAll(this.f54572j.keySet());
            fragmentManagerState.f54618h.addAll(this.f54572j.values());
            fragmentManagerState.f54619i = new ArrayList<>(this.f54551G);
            bundle.putParcelable(TransferTable.COLUMN_STATE, fragmentManagerState);
            for (String str : this.f54573k.keySet()) {
                bundle.putBundle("result_" + str, this.f54573k.get(str));
            }
            Iterator<FragmentState> it = m67137m.iterator();
            while (it.hasNext()) {
                FragmentState next = it.next();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(TransferTable.COLUMN_STATE, next);
                bundle.putBundle("fragment_" + next.f54621c, bundle2);
            }
        }
        return bundle;
    }

    /* renamed from: w */
    public final Set<AbstractC11688o> m67293w() {
        HashSet hashSet = new HashSet();
        for (C11680j c11680j : this.f54565c.m67139k()) {
            ViewGroup viewGroup = c11680j.m67165k().mContainer;
            if (viewGroup != null) {
                hashSet.add(AbstractC11688o.m67078n(viewGroup, m67405F0()));
            }
        }
        return hashSet;
    }

    /* renamed from: w0 */
    public Fragment m67292w0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment m67334i0 = m67334i0(string);
        if (m67334i0 == null) {
            m67398H1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return m67334i0;
    }

    /* renamed from: w1 */
    public Fragment.SavedState m67291w1(Fragment fragment) {
        C11680j m67136n = this.f54565c.m67136n(fragment.mWho);
        if (m67136n == null || !m67136n.m67165k().equals(fragment)) {
            m67398H1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return m67136n.m67158r();
    }

    /* renamed from: x */
    public final Set<AbstractC11688o> m67290x(ArrayList<C11647a> arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator<AbstractC11685m.C11686a> it = arrayList.get(i).f54750c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f54768b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(AbstractC11688o.m67077o(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    /* renamed from: x0 */
    public final ViewGroup m67289x0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f54585w.mo62063d()) {
            View mo62064c = this.f54585w.mo62064c(fragment.mContainerId);
            if (mo62064c instanceof ViewGroup) {
                return (ViewGroup) mo62064c;
            }
        }
        return null;
    }

    /* renamed from: x1 */
    public void m67288x1() {
        synchronized (this.f54563a) {
            boolean z = true;
            if (this.f54563a.size() != 1) {
                z = false;
            }
            if (z) {
                this.f54584v.m67213g().removeCallbacks(this.f54562R);
                this.f54584v.m67213g().post(this.f54562R);
                m67392J1();
            }
        }
    }

    /* renamed from: y */
    public C11680j m67287y(Fragment fragment) {
        C11680j m67136n = this.f54565c.m67136n(fragment.mWho);
        if (m67136n != null) {
            return m67136n;
        }
        C11680j c11680j = new C11680j(this.f54576n, this.f54565c, fragment);
        c11680j.m67161o(this.f54584v.m67214f().getClassLoader());
        c11680j.m67155u(this.f54583u);
        return c11680j;
    }

    /* renamed from: y0 */
    public C11672e m67286y0() {
        C11672e c11672e = this.f54588z;
        if (c11672e != null) {
            return c11672e;
        }
        Fragment fragment = this.f54586x;
        if (fragment != null) {
            return fragment.mFragmentManager.m67286y0();
        }
        return this.f54545A;
    }

    /* renamed from: y1 */
    public void m67285y1(Fragment fragment, boolean z) {
        ViewGroup m67289x0 = m67289x0(fragment);
        if (m67289x0 != null && (m67289x0 instanceof FragmentContainerView)) {
            ((FragmentContainerView) m67289x0).setDrawDisappearingViewsLast(!z);
        }
    }

    /* renamed from: z */
    public void m67284z(Fragment fragment) {
        if (m67384N0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (m67384N0(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                this.f54565c.m67129u(fragment);
                if (m67382O0(fragment)) {
                    this.f54552H = true;
                }
                m67407E1(fragment);
            }
        }
    }

    /* renamed from: z0 */
    public List<Fragment> m67283z0() {
        return this.f54565c.m67135o();
    }

    /* renamed from: z1 */
    public void m67282z1(C11672e c11672e) {
        this.f54588z = c11672e;
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new C11626a();

        /* renamed from: b */
        public String f54593b;

        /* renamed from: c */
        public int f54594c;

        /* renamed from: androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$a */
        /* loaded from: classes.dex */
        public class C11626a implements Parcelable.Creator<LaunchedFragmentInfo> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public LaunchedFragmentInfo[] newArray(int i) {
                return new LaunchedFragmentInfo[i];
            }
        }

        public LaunchedFragmentInfo(String str, int i) {
            this.f54593b = str;
            this.f54594c = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f54593b);
            parcel.writeInt(this.f54594c);
        }

        public LaunchedFragmentInfo(Parcel parcel) {
            this.f54593b = parcel.readString();
            this.f54594c = parcel.readInt();
        }
    }
}
