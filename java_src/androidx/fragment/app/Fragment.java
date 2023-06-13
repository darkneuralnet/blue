package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.C11729j;
import androidx.lifecycle.C11750q;
import androidx.lifecycle.C11755r;
import androidx.lifecycle.C11759u;
import androidx.lifecycle.InterfaceC11718e;
import androidx.lifecycle.InterfaceC11728i;
import androidx.lifecycle.LiveData;
import androidx.savedstate.C11966a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, LifecycleOwner, InterfaceC37154Xr6, InterfaceC11718e, InterfaceC35200Pi5, InterfaceC29050u5 {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    C11620j mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    C11759u.InterfaceC11763b mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    AbstractC11673f<?> mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    C11729j mLifecycleRegistry;
    AbstractC11719f.EnumC11724b mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<AbstractC11622l> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final AbstractC11622l mSavedStateAttachListener;
    C34966Oi5 mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;
    C11687n mViewLifecycleOwner;
    C49882uX2<LifecycleOwner> mViewLifecycleOwnerLiveData;
    String mWho;

    /* loaded from: classes.dex */
    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$a */
    /* loaded from: classes.dex */
    public class C11611a extends AbstractC0407B5<I> {

        /* renamed from: a */
        public final /* synthetic */ AtomicReference f54499a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC29414v5 f54500b;

        public C11611a(AtomicReference atomicReference, AbstractC29414v5 abstractC29414v5) {
            this.f54499a = atomicReference;
            this.f54500b = abstractC29414v5;
        }

        @Override // p000.AbstractC0407B5
        /* renamed from: b */
        public void mo67436b(I i, C1727E4 c1727e4) {
            AbstractC0407B5 abstractC0407B5 = (AbstractC0407B5) this.f54499a.get();
            if (abstractC0407B5 != null) {
                abstractC0407B5.mo67436b(i, c1727e4);
                return;
            }
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }

        @Override // p000.AbstractC0407B5
        /* renamed from: c */
        public void mo67435c() {
            AbstractC0407B5 abstractC0407B5 = (AbstractC0407B5) this.f54499a.getAndSet(null);
            if (abstractC0407B5 != null) {
                abstractC0407B5.mo67435c();
            }
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    /* loaded from: classes.dex */
    public class RunnableC11612b implements Runnable {
        public RunnableC11612b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$c */
    /* loaded from: classes.dex */
    public class C11613c extends AbstractC11622l {
        public C11613c() {
            super(null);
        }

        @Override // androidx.fragment.app.Fragment.AbstractC11622l
        /* renamed from: a */
        public void mo67431a() {
            Fragment.this.mSavedStateRegistryController.m91664c();
            C11750q.m66934c(Fragment.this);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$d */
    /* loaded from: classes.dex */
    public class RunnableC11614d implements Runnable {
        public RunnableC11614d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    /* loaded from: classes.dex */
    public class RunnableC11615e implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ AbstractC11688o f54505b;

        public RunnableC11615e(AbstractC11688o abstractC11688o) {
            this.f54505b = abstractC11688o;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f54505b.m67085g();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$f */
    /* loaded from: classes.dex */
    public class C11616f extends AbstractC38865by1 {
        public C11616f() {
        }

        @Override // p000.AbstractC38865by1
        /* renamed from: c */
        public View mo62064c(int i) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // p000.AbstractC38865by1
        /* renamed from: d */
        public boolean mo62063d() {
            return Fragment.this.mView != null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$g */
    /* loaded from: classes.dex */
    public class C11617g implements InterfaceC51452xA1<Void, ActivityResultRegistry> {
        public C11617g() {
        }

        @Override // p000.InterfaceC51452xA1
        /* renamed from: a */
        public ActivityResultRegistry apply(Void r3) {
            Fragment fragment = Fragment.this;
            AbstractC11673f<?> abstractC11673f = fragment.mHost;
            if (abstractC11673f instanceof InterfaceC1735E5) {
                return ((InterfaceC1735E5) abstractC11673f).getActivityResultRegistry();
            }
            return fragment.requireActivity().getActivityResultRegistry();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$h */
    /* loaded from: classes.dex */
    public class C11618h implements InterfaceC51452xA1<Void, ActivityResultRegistry> {

        /* renamed from: a */
        public final /* synthetic */ ActivityResultRegistry f54509a;

        public C11618h(ActivityResultRegistry activityResultRegistry) {
            this.f54509a = activityResultRegistry;
        }

        @Override // p000.InterfaceC51452xA1
        /* renamed from: a */
        public ActivityResultRegistry apply(Void r1) {
            return this.f54509a;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$i */
    /* loaded from: classes.dex */
    public class C11619i extends AbstractC11622l {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC51452xA1 f54511a;

        /* renamed from: b */
        public final /* synthetic */ AtomicReference f54512b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC29414v5 f54513c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC28515t5 f54514d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11619i(InterfaceC51452xA1 interfaceC51452xA1, AtomicReference atomicReference, AbstractC29414v5 abstractC29414v5, InterfaceC28515t5 interfaceC28515t5) {
            super(null);
            this.f54511a = interfaceC51452xA1;
            this.f54512b = atomicReference;
            this.f54513c = abstractC29414v5;
            this.f54514d = interfaceC28515t5;
        }

        @Override // androidx.fragment.app.Fragment.AbstractC11622l
        /* renamed from: a */
        public void mo67431a() {
            this.f54512b.set(((ActivityResultRegistry) this.f54511a.apply(null)).m70472j(Fragment.this.generateActivityResultKey(), Fragment.this, this.f54513c, this.f54514d));
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$j */
    /* loaded from: classes.dex */
    public static class C11620j {

        /* renamed from: a */
        public View f54516a;

        /* renamed from: b */
        public boolean f54517b;

        /* renamed from: c */
        public int f54518c;

        /* renamed from: d */
        public int f54519d;

        /* renamed from: e */
        public int f54520e;

        /* renamed from: f */
        public int f54521f;

        /* renamed from: g */
        public int f54522g;

        /* renamed from: h */
        public ArrayList<String> f54523h;

        /* renamed from: i */
        public ArrayList<String> f54524i;

        /* renamed from: j */
        public Object f54525j = null;

        /* renamed from: k */
        public Object f54526k;

        /* renamed from: l */
        public Object f54527l;

        /* renamed from: m */
        public Object f54528m;

        /* renamed from: n */
        public Object f54529n;

        /* renamed from: o */
        public Object f54530o;

        /* renamed from: p */
        public Boolean f54531p;

        /* renamed from: q */
        public Boolean f54532q;

        /* renamed from: r */
        public AbstractC36046Sy5 f54533r;

        /* renamed from: s */
        public AbstractC36046Sy5 f54534s;

        /* renamed from: t */
        public float f54535t;

        /* renamed from: u */
        public View f54536u;

        /* renamed from: v */
        public boolean f54537v;

        public C11620j() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f54526k = obj;
            this.f54527l = null;
            this.f54528m = obj;
            this.f54529n = null;
            this.f54530o = obj;
            this.f54533r = null;
            this.f54534s = null;
            this.f54535t = 1.0f;
            this.f54536u = null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$k */
    /* loaded from: classes.dex */
    public static class C11621k {
        private C11621k() {
        }

        /* renamed from: a */
        public static void m67432a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$l */
    /* loaded from: classes.dex */
    public static abstract class AbstractC11622l {
        private AbstractC11622l() {
        }

        /* renamed from: a */
        public abstract void mo67431a();

        public /* synthetic */ AbstractC11622l(RunnableC11612b runnableC11612b) {
            this();
        }
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new C47184py1();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new RunnableC11612b();
        this.mMaxState = AbstractC11719f.EnumC11724b.RESUMED;
        this.mViewLifecycleOwnerLiveData = new C49882uX2<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new C11613c();
        initLifecycle();
    }

    private C11620j ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new C11620j();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        AbstractC11719f.EnumC11724b enumC11724b = this.mMaxState;
        if (enumC11724b != AbstractC11719f.EnumC11724b.INITIALIZED && this.mParentFragment != null) {
            return Math.min(enumC11724b.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
        }
        return enumC11724b.ordinal();
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new C11729j(this);
        this.mSavedStateRegistryController = C34966Oi5.m91666a(this);
        this.mDefaultFactory = null;
        if (!this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            registerOnPreAttachListener(this.mSavedStateAttachListener);
        }
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    private <I, O> AbstractC0407B5<I> prepareCallInternal(AbstractC29414v5<I, O> abstractC29414v5, InterfaceC51452xA1<Void, ActivityResultRegistry> interfaceC51452xA1, InterfaceC28515t5<O> interfaceC28515t5) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            registerOnPreAttachListener(new C11619i(interfaceC51452xA1, atomicReference, abstractC29414v5, interfaceC28515t5));
            return new C11611a(atomicReference, abstractC29414v5);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    private void registerOnPreAttachListener(AbstractC11622l abstractC11622l) {
        if (this.mState >= 0) {
            abstractC11622l.mo67431a();
        } else {
            this.mOnPreAttachedListeners.add(abstractC11622l);
        }
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        C11620j c11620j = this.mAnimationInfo;
        if (c11620j != null) {
            c11620j.f54537v = false;
        }
        if (this.mView != null && (viewGroup = this.mContainer) != null && (fragmentManager = this.mFragmentManager) != null) {
            AbstractC11688o m67077o = AbstractC11688o.m67077o(viewGroup, fragmentManager);
            m67077o.m67076p();
            if (z) {
                this.mHost.m67213g().post(new RunnableC11615e(m67077o));
            } else {
                m67077o.m67085g();
            }
            Handler handler = this.mPostponedHandler;
            if (handler != null) {
                handler.removeCallbacks(this.mPostponedDurationRunnable);
                this.mPostponedHandler = null;
            }
        }
    }

    public AbstractC38865by1 createFragmentContainer() {
        return new C11616f();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            AbstractC49506tt2.m11259b(this).mo9610a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.m67361Z(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.m67319n0(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final FragmentActivity getActivity() {
        AbstractC11673f<?> abstractC11673f = this.mHost;
        if (abstractC11673f == null) {
            return null;
        }
        return (FragmentActivity) abstractC11673f.m67215e();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C11620j c11620j = this.mAnimationInfo;
        if (c11620j != null && (bool = c11620j.f54532q) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C11620j c11620j = this.mAnimationInfo;
        if (c11620j != null && (bool = c11620j.f54531p) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public View getAnimatingAway() {
        C11620j c11620j = this.mAnimationInfo;
        if (c11620j == null) {
            return null;
        }
        return c11620j.f54516a;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Context getContext() {
        AbstractC11673f<?> abstractC11673f = this.mHost;
        if (abstractC11673f == null) {
            return null;
        }
        return abstractC11673f.m67214f();
    }

    @Override // androidx.lifecycle.InterfaceC11718e
    public FE0 getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        if (application == null && FragmentManager.m67384N0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C47511qX2 c47511qX2 = new C47511qX2();
        if (application != null) {
            c47511qX2.m17470c(C11759u.C11760a.f54991h, application);
        }
        c47511qX2.m17470c(C11750q.f54966a, this);
        c47511qX2.m17470c(C11750q.f54967b, this);
        if (getArguments() != null) {
            c47511qX2.m17470c(C11750q.f54968c, getArguments());
        }
        return c47511qX2;
    }

    @Override // androidx.lifecycle.InterfaceC11718e
    public C11759u.InterfaceC11763b getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                Context applicationContext = requireContext().getApplicationContext();
                while (true) {
                    if (applicationContext instanceof ContextWrapper) {
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                            break;
                        }
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    } else {
                        application = null;
                        break;
                    }
                }
                if (application == null && FragmentManager.m67384N0(3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.mDefaultFactory = new C11755r(application, this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public int getEnterAnim() {
        C11620j c11620j = this.mAnimationInfo;
        if (c11620j == null) {
            return 0;
        }
        return c11620j.f54518c;
    }

    public Object getEnterTransition() {
        C11620j c11620j = this.mAnimationInfo;
        if (c11620j == null) {
            return null;
        }
        return c11620j.f54525j;
    }

    public AbstractC36046Sy5 getEnterTransitionCallback() {
        C11620j c11620j = this.mAnimationInfo;
        if (c11620j == null) {
            return null;
        }
        return c11620j.f54533r;
    }

    public int getExitAnim() {
        C11620j c11620j = this.mAnimationInfo;
        if (c11620j == null) {
            return 0;
        }
        return c11620j.f54519d;
    }

    public Object getExitTransition() {
        C11620j c11620j = this.mAnimationInfo;
        if (c11620j == null) {
            return null;
        }
        return c11620j.f54527l;
    }

    public AbstractC36046Sy5 getExitTransitionCallback() {
        C11620j c11620j = this.mAnimationInfo;
        if (c11620j == null) {
            return null;
        }
        return c11620j.f54534s;
    }

    public View getFocusedView() {
        C11620j c11620j = this.mAnimationInfo;
        if (c11620j == null) {
            return null;
        }
        return c11620j.f54536u;
    }

    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        AbstractC11673f<?> abstractC11673f = this.mHost;
        if (abstractC11673f == null) {
            return null;
        }
        return abstractC11673f.mo67211i();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // p000.LifecycleOwner
    public AbstractC11719f getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public AbstractC49506tt2 getLoaderManager() {
        return AbstractC49506tt2.m11259b(this);
    }

    public int getNextTransition() {
        C11620j c11620j = this.mAnimationInfo;
        if (c11620j == null) {
            return 0;
        }
        return c11620j.f54522g;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public boolean getPopDirection() {
        C11620j c11620j = this.mAnimationInfo;
        if (c11620j == null) {
            return false;
        }
        return c11620j.f54517b;
    }

    public int getPopEnterAnim() {
        C11620j c11620j = this.mAnimationInfo;
        if (c11620j == null) {
            return 0;
        }
        return c11620j.f54520e;
    }

    public int getPopExitAnim() {
        C11620j c11620j = this.mAnimationInfo;
        if (c11620j == null) {
            return 0;
        }
        return c11620j.f54521f;
    }

    public float getPostOnViewCreatedAlpha() {
        C11620j c11620j = this.mAnimationInfo;
        if (c11620j == null) {
            return 1.0f;
        }
        return c11620j.f54535t;
    }

    public Object getReenterTransition() {
        C11620j c11620j = this.mAnimationInfo;
        if (c11620j == null) {
            return null;
        }
        Object obj = c11620j.f54528m;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getExitTransition();
        }
        return obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        C53112zy1.m73h(this);
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        C11620j c11620j = this.mAnimationInfo;
        if (c11620j == null) {
            return null;
        }
        Object obj = c11620j.f54526k;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getEnterTransition();
        }
        return obj;
    }

    @Override // p000.InterfaceC35200Pi5
    public final C11966a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.m91665b();
    }

    public Object getSharedElementEnterTransition() {
        C11620j c11620j = this.mAnimationInfo;
        if (c11620j == null) {
            return null;
        }
        return c11620j.f54529n;
    }

    public Object getSharedElementReturnTransition() {
        C11620j c11620j = this.mAnimationInfo;
        if (c11620j == null) {
            return null;
        }
        Object obj = c11620j.f54530o;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getSharedElementEnterTransition();
        }
        return obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        C11620j c11620j = this.mAnimationInfo;
        if (c11620j != null && (arrayList = c11620j.f54523h) != null) {
            return arrayList;
        }
        return new ArrayList<>();
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        C11620j c11620j = this.mAnimationInfo;
        if (c11620j != null && (arrayList = c11620j.f54524i) != null) {
            return arrayList;
        }
        return new ArrayList<>();
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        C53112zy1.m72i(this);
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public LifecycleOwner getViewLifecycleOwner() {
        C11687n c11687n = this.mViewLifecycleOwner;
        if (c11687n != null) {
            return c11687n;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public LiveData<LifecycleOwner> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // p000.InterfaceC37154Xr6
    public C36920Wr6 getViewModelStore() {
        if (this.mFragmentManager != null) {
            if (getMinimumMaxLifecycleState() != AbstractC11719f.EnumC11724b.INITIALIZED.ordinal()) {
                return this.mFragmentManager.m67396I0(this);
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new C47184py1();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        FragmentManager fragmentManager;
        if (!this.mHidden && ((fragmentManager = this.mFragmentManager) == null || !fragmentManager.m67378Q0(this.mParentFragment))) {
            return false;
        }
        return true;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        FragmentManager fragmentManager;
        if (this.mMenuVisible && ((fragmentManager = this.mFragmentManager) == null || fragmentManager.m67376R0(this.mParentFragment))) {
            return true;
        }
        return false;
    }

    public boolean isPostponed() {
        C11620j c11620j = this.mAnimationInfo;
        if (c11620j == null) {
            return false;
        }
        return c11620j.f54537v;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.m67370U0();
    }

    public final boolean isVisible() {
        View view;
        if (isAdded() && !isHidden() && (view = this.mView) != null && view.getWindowToken() != null && this.mView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.m67345e1();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (FragmentManager.m67384N0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        AbstractC11673f<?> abstractC11673f = this.mHost;
        Activity m67215e = abstractC11673f == null ? null : abstractC11673f.m67215e();
        if (m67215e != null) {
            this.mCalled = false;
            onAttach(m67215e);
        }
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (!this.mChildFragmentManager.m67372T0(1)) {
            this.mChildFragmentManager.m67409E();
        }
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        AbstractC11673f<?> abstractC11673f = this.mHost;
        Activity m67215e = abstractC11673f == null ? null : abstractC11673f.m67215e();
        if (m67215e != null) {
            this.mCalled = false;
            onInflate(m67215e, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.m67345e1();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            restoreViewState();
            this.mChildFragmentManager.m67421A();
            return;
        }
        throw new UU5("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public void performAttach() {
        Iterator<AbstractC11622l> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo67431a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.m67317o(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.m67214f());
        if (this.mCalled) {
            this.mFragmentManager.m67391K(this);
            this.mChildFragmentManager.m67418B();
            return;
        }
        throw new UU5("Fragment " + this + " did not call through to super.onAttach()");
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (onContextItemSelected(menuItem)) {
                return true;
            }
            return this.mChildFragmentManager.m67412D(menuItem);
        }
        return false;
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.m67345e1();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.mo67008a(new InterfaceC11728i() { // from class: androidx.fragment.app.Fragment.6
            @Override // androidx.lifecycle.InterfaceC11728i
            public void onStateChanged(LifecycleOwner lifecycleOwner, AbstractC11719f.EnumC11720a enumC11720a) {
                View view;
                if (enumC11720a == AbstractC11719f.EnumC11720a.ON_STOP && (view = Fragment.this.mView) != null) {
                    C11621k.m67432a(view);
                }
            }
        });
        this.mSavedStateRegistryController.m91663d(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.m67001i(AbstractC11719f.EnumC11720a.ON_CREATE);
            return;
        }
        throw new UU5("Fragment " + this + " did not call through to super.onCreate()");
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return z | this.mChildFragmentManager.m67406F(menu, menuInflater);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.m67345e1();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C11687n(this, getViewModelStore());
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.m67096b();
            C35534Qt6.m87652b(this.mView, this.mViewLifecycleOwner);
            C36470Ut6.m80657b(this.mView, this.mViewLifecycleOwner);
            C36236Tt6.m82296b(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
        } else if (!this.mViewLifecycleOwner.m67095c()) {
            this.mViewLifecycleOwner = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public void performDestroy() {
        this.mChildFragmentManager.m67403G();
        this.mLifecycleRegistry.m67001i(AbstractC11719f.EnumC11720a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        throw new UU5("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public void performDestroyView() {
        this.mChildFragmentManager.m67400H();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().mo67007b().m67013b(AbstractC11719f.EnumC11724b.CREATED)) {
            this.mViewLifecycleOwner.m67097a(AbstractC11719f.EnumC11720a.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            AbstractC49506tt2.m11259b(this).mo9608d();
            this.mPerformedCreateView = false;
            return;
        }
        throw new UU5("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            if (!this.mChildFragmentManager.m67386M0()) {
                this.mChildFragmentManager.m67403G();
                this.mChildFragmentManager = new C47184py1();
                return;
            }
            return;
        }
        throw new UU5("Fragment " + this + " did not call through to super.onDetach()");
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
                return true;
            }
            return this.mChildFragmentManager.m67387M(menuItem);
        }
        return false;
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.m67385N(menu);
        }
    }

    public void performPause() {
        this.mChildFragmentManager.m67381P();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m67097a(AbstractC11719f.EnumC11720a.ON_PAUSE);
        }
        this.mLifecycleRegistry.m67001i(AbstractC11719f.EnumC11720a.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        throw new UU5("Fragment " + this + " did not call through to super.onPause()");
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return z | this.mChildFragmentManager.m67377R(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean m67374S0 = this.mFragmentManager.m67374S0(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != m67374S0) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(m67374S0);
            onPrimaryNavigationFragmentChanged(m67374S0);
            this.mChildFragmentManager.m67375S();
        }
    }

    public void performResume() {
        this.mChildFragmentManager.m67345e1();
        this.mChildFragmentManager.m67349d0(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            C11729j c11729j = this.mLifecycleRegistry;
            AbstractC11719f.EnumC11720a enumC11720a = AbstractC11719f.EnumC11720a.ON_RESUME;
            c11729j.m67001i(enumC11720a);
            if (this.mView != null) {
                this.mViewLifecycleOwner.m67097a(enumC11720a);
            }
            this.mChildFragmentManager.m67373T();
            return;
        }
        throw new UU5("Fragment " + this + " did not call through to super.onResume()");
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m91662e(bundle);
        Bundle m67368V0 = this.mChildFragmentManager.m67368V0();
        if (m67368V0 != null) {
            bundle.putParcelable("android:support:fragments", m67368V0);
        }
    }

    public void performStart() {
        this.mChildFragmentManager.m67345e1();
        this.mChildFragmentManager.m67349d0(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            C11729j c11729j = this.mLifecycleRegistry;
            AbstractC11719f.EnumC11720a enumC11720a = AbstractC11719f.EnumC11720a.ON_START;
            c11729j.m67001i(enumC11720a);
            if (this.mView != null) {
                this.mViewLifecycleOwner.m67097a(enumC11720a);
            }
            this.mChildFragmentManager.m67371U();
            return;
        }
        throw new UU5("Fragment " + this + " did not call through to super.onStart()");
    }

    public void performStop() {
        this.mChildFragmentManager.m67367W();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m67097a(AbstractC11719f.EnumC11720a.ON_STOP);
        }
        this.mLifecycleRegistry.m67001i(AbstractC11719f.EnumC11720a.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        throw new UU5("Fragment " + this + " did not call through to super.onStop()");
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.m67365X();
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f54537v = true;
    }

    @Override // p000.InterfaceC29050u5
    public final <I, O> AbstractC0407B5<I> registerForActivityResult(AbstractC29414v5<I, O> abstractC29414v5, InterfaceC28515t5<O> interfaceC28515t5) {
        return prepareCallInternal(abstractC29414v5, new C11617g(), interfaceC28515t5);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i) {
        if (this.mHost != null) {
            getParentFragmentManager().m67357a1(this, strArr, i);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            if (getContext() == null) {
                throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
            }
            throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
        }
        return parentFragment;
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.mChildFragmentManager.m67300t1(parcelable);
            this.mChildFragmentManager.m67409E();
        }
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.m67094d(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.m67097a(AbstractC11719f.EnumC11720a.ON_CREATE);
                return;
            }
            return;
        }
        throw new UU5("Fragment " + this + " did not call through to super.onViewStateRestored()");
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().f54532q = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().f54531p = Boolean.valueOf(z);
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        ensureAnimationInfo().f54518c = i;
        ensureAnimationInfo().f54519d = i2;
        ensureAnimationInfo().f54520e = i3;
        ensureAnimationInfo().f54521f = i4;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(AbstractC36046Sy5 abstractC36046Sy5) {
        ensureAnimationInfo().f54533r = abstractC36046Sy5;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f54525j = obj;
    }

    public void setExitSharedElementCallback(AbstractC36046Sy5 abstractC36046Sy5) {
        ensureAnimationInfo().f54534s = abstractC36046Sy5;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f54527l = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().f54536u = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mHost.mo67205o();
            }
        }
    }

    public void setInitialSavedState(SavedState savedState) {
        if (this.mFragmentManager == null) {
            this.mSavedFragmentState = (savedState == null || (r2 = savedState.f54498b) == null) ? null : null;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.mo67205o();
            }
        }
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f54522g = i;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().f54517b = z;
    }

    public void setPostOnViewCreatedAlpha(float f) {
        ensureAnimationInfo().f54535t = f;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f54528m = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        C53112zy1.m70k(this);
        this.mRetainInstance = z;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            if (z) {
                fragmentManager.m67323m(this);
                return;
            } else {
                fragmentManager.m67306r1(this);
                return;
            }
        }
        this.mRetainInstanceChangedWhileDetached = true;
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f54526k = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f54529n = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        C11620j c11620j = this.mAnimationInfo;
        c11620j.f54523h = arrayList;
        c11620j.f54524i = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f54530o = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i) {
        FragmentManager fragmentManager;
        if (fragment != null) {
            C53112zy1.m69l(this, fragment, i);
        }
        FragmentManager fragmentManager2 = this.mFragmentManager;
        if (fragment != null) {
            fragmentManager = fragment.mFragmentManager;
        } else {
            fragmentManager = null;
        }
        if (fragmentManager2 != null && fragmentManager != null && fragmentManager2 != fragmentManager) {
            throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
        }
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getTargetFragment(false)) {
            if (fragment2.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager != null && fragment.mFragmentManager != null) {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        } else {
            this.mTargetWho = null;
            this.mTarget = fragment;
        }
        this.mTargetRequestCode = i;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        boolean z2;
        C53112zy1.m68m(this, z);
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.m67339g1(fragmentManager.m67287y(this));
        }
        this.mUserVisibleHint = z;
        if (this.mState < 5 && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mDeferStart = z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        AbstractC11673f<?> abstractC11673f = this.mHost;
        if (abstractC11673f != null) {
            return abstractC11673f.mo67208l(str);
        }
        return false;
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost != null) {
            if (FragmentManager.m67384N0(2)) {
                Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
            }
            getParentFragmentManager().m67351c1(this, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo != null && ensureAnimationInfo().f54537v) {
            if (this.mHost == null) {
                ensureAnimationInfo().f54537v = false;
            } else if (Looper.myLooper() != this.mHost.m67213g().getLooper()) {
                this.mHost.m67213g().postAtFrontOfQueue(new RunnableC11614d());
            } else {
                callStartTransitionListener(true);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C11610a();

        /* renamed from: b */
        public final Bundle f54498b;

        /* renamed from: androidx.fragment.app.Fragment$SavedState$a */
        /* loaded from: classes.dex */
        public class C11610a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Bundle bundle) {
            this.f54498b = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f54498b);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f54498b = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }
    }

    private Fragment getTargetFragment(boolean z) {
        String str;
        if (z) {
            C53112zy1.m71j(this);
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.m67334i0(str);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment newInstance = C11672e.loadFragmentClass(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.setArguments(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (java.lang.InstantiationException e2) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        ensureAnimationInfo().f54537v = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            this.mPostponedHandler = fragmentManager.m67420A0().m67213g();
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public final <I, O> AbstractC0407B5<I> registerForActivityResult(AbstractC29414v5<I, O> abstractC29414v5, ActivityResultRegistry activityResultRegistry, InterfaceC28515t5<O> interfaceC28515t5) {
        return prepareCallInternal(abstractC29414v5, new C11618h(activityResultRegistry), interfaceC28515t5);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        AbstractC11673f<?> abstractC11673f = this.mHost;
        if (abstractC11673f != null) {
            abstractC11673f.m67207m(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().m67354b1(this, intent, i, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        AbstractC11673f<?> abstractC11673f = this.mHost;
        if (abstractC11673f != null) {
            LayoutInflater mo67210j = abstractC11673f.mo67210j();
            C50029um2.m9787a(mo67210j, this.mChildFragmentManager.m67417B0());
            return mo67210j;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    private void restoreViewState() {
        if (FragmentManager.m67384N0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    public Fragment(int i) {
        this();
        this.mContentLayoutId = i;
    }
}
