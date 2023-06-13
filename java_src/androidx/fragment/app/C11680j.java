package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.AbstractC11688o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC11719f;
/* renamed from: androidx.fragment.app.j */
/* loaded from: classes.dex */
public class C11680j {

    /* renamed from: a */
    public final C11676h f54729a;

    /* renamed from: b */
    public final C11684l f54730b;

    /* renamed from: c */
    public final Fragment f54731c;

    /* renamed from: d */
    public boolean f54732d = false;

    /* renamed from: e */
    public int f54733e = -1;

    /* renamed from: androidx.fragment.app.j$a */
    /* loaded from: classes.dex */
    public class View$OnAttachStateChangeListenerC11681a implements View.OnAttachStateChangeListener {

        /* renamed from: b */
        public final /* synthetic */ View f54734b;

        public View$OnAttachStateChangeListenerC11681a(View view) {
            this.f54734b = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f54734b.removeOnAttachStateChangeListener(this);
            C38790bq6.m62458s0(this.f54734b);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.fragment.app.j$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C11682b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f54736a;

        static {
            int[] iArr = new int[AbstractC11719f.EnumC11724b.values().length];
            f54736a = iArr;
            try {
                iArr[AbstractC11719f.EnumC11724b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54736a[AbstractC11719f.EnumC11724b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54736a[AbstractC11719f.EnumC11724b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f54736a[AbstractC11719f.EnumC11724b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C11680j(C11676h c11676h, C11684l c11684l, Fragment fragment) {
        this.f54729a = c11676h;
        this.f54730b = c11684l;
        this.f54731c = fragment;
    }

    /* renamed from: a */
    public void m67175a() {
        if (FragmentManager.m67384N0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f54731c);
        }
        Fragment fragment = this.f54731c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        C11676h c11676h = this.f54729a;
        Fragment fragment2 = this.f54731c;
        c11676h.m67204a(fragment2, fragment2.mSavedFragmentState, false);
    }

    /* renamed from: b */
    public void m67174b() {
        int m67140j = this.f54730b.m67140j(this.f54731c);
        Fragment fragment = this.f54731c;
        fragment.mContainer.addView(fragment.mView, m67140j);
    }

    /* renamed from: c */
    public void m67173c() {
        if (FragmentManager.m67384N0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f54731c);
        }
        Fragment fragment = this.f54731c;
        Fragment fragment2 = fragment.mTarget;
        C11680j c11680j = null;
        if (fragment2 != null) {
            C11680j m67136n = this.f54730b.m67136n(fragment2.mWho);
            if (m67136n != null) {
                Fragment fragment3 = this.f54731c;
                fragment3.mTargetWho = fragment3.mTarget.mWho;
                fragment3.mTarget = null;
                c11680j = m67136n;
            } else {
                throw new IllegalStateException("Fragment " + this.f54731c + " declared target fragment " + this.f54731c.mTarget + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (c11680j = this.f54730b.m67136n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f54731c + " declared target fragment " + this.f54731c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (c11680j != null) {
            c11680j.m67163m();
        }
        Fragment fragment4 = this.f54731c;
        fragment4.mHost = fragment4.mFragmentManager.m67420A0();
        Fragment fragment5 = this.f54731c;
        fragment5.mParentFragment = fragment5.mFragmentManager.m67411D0();
        this.f54729a.m67198g(this.f54731c, false);
        this.f54731c.performAttach();
        this.f54729a.m67203b(this.f54731c, false);
    }

    /* renamed from: d */
    public int m67172d() {
        AbstractC11688o.C11693e.EnumC11695b enumC11695b;
        Fragment fragment = this.f54731c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i = this.f54733e;
        int i2 = C11682b.f54736a[fragment.mMaxState.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        i = Math.min(i, -1);
                    } else {
                        i = Math.min(i, 0);
                    }
                } else {
                    i = Math.min(i, 1);
                }
            } else {
                i = Math.min(i, 5);
            }
        }
        Fragment fragment2 = this.f54731c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                i = Math.max(this.f54733e, 2);
                View view = this.f54731c.mView;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f54733e < 4 ? Math.min(i, fragment2.mState) : Math.min(i, 1);
            }
        }
        if (!this.f54731c.mAdded) {
            i = Math.min(i, 1);
        }
        Fragment fragment3 = this.f54731c;
        ViewGroup viewGroup = fragment3.mContainer;
        if (viewGroup != null) {
            enumC11695b = AbstractC11688o.m67077o(viewGroup, fragment3.getParentFragmentManager()).m67080l(this);
        } else {
            enumC11695b = null;
        }
        if (enumC11695b == AbstractC11688o.C11693e.EnumC11695b.ADDING) {
            i = Math.min(i, 6);
        } else if (enumC11695b == AbstractC11688o.C11693e.EnumC11695b.REMOVING) {
            i = Math.max(i, 3);
        } else {
            Fragment fragment4 = this.f54731c;
            if (fragment4.mRemoving) {
                if (fragment4.isInBackStack()) {
                    i = Math.min(i, 1);
                } else {
                    i = Math.min(i, -1);
                }
            }
        }
        Fragment fragment5 = this.f54731c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            i = Math.min(i, 4);
        }
        if (FragmentManager.m67384N0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + this.f54731c);
        }
        return i;
    }

    /* renamed from: e */
    public void m67171e() {
        if (FragmentManager.m67384N0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f54731c);
        }
        Fragment fragment = this.f54731c;
        if (!fragment.mIsCreated) {
            this.f54729a.m67197h(fragment, fragment.mSavedFragmentState, false);
            Fragment fragment2 = this.f54731c;
            fragment2.performCreate(fragment2.mSavedFragmentState);
            C11676h c11676h = this.f54729a;
            Fragment fragment3 = this.f54731c;
            c11676h.m67202c(fragment3, fragment3.mSavedFragmentState, false);
            return;
        }
        fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
        this.f54731c.mState = 1;
    }

    /* renamed from: f */
    public void m67170f() {
        String str;
        if (this.f54731c.mFromLayout) {
            return;
        }
        if (FragmentManager.m67384N0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f54731c);
        }
        Fragment fragment = this.f54731c;
        LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        Fragment fragment2 = this.f54731c;
        ViewGroup viewGroup = fragment2.mContainer;
        if (viewGroup == null) {
            int i = fragment2.mContainerId;
            if (i != 0) {
                if (i != -1) {
                    viewGroup = (ViewGroup) fragment2.mFragmentManager.m67295v0().mo62064c(this.f54731c.mContainerId);
                    if (viewGroup == null) {
                        Fragment fragment3 = this.f54731c;
                        if (!fragment3.mRestored) {
                            try {
                                str = fragment3.getResources().getResourceName(this.f54731c.mContainerId);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f54731c.mContainerId) + " (" + str + ") for fragment " + this.f54731c);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        C53112zy1.m67n(this.f54731c, viewGroup);
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f54731c + " for a container view with no id");
                }
            } else {
                viewGroup = null;
            }
        }
        Fragment fragment4 = this.f54731c;
        fragment4.mContainer = viewGroup;
        fragment4.performCreateView(performGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
        View view = this.f54731c.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f54731c;
            fragment5.mView.setTag(C41690gi4.fragment_container_view_tag, fragment5);
            if (viewGroup != null) {
                m67174b();
            }
            Fragment fragment6 = this.f54731c;
            if (fragment6.mHidden) {
                fragment6.mView.setVisibility(8);
            }
            if (C38790bq6.m62506Y(this.f54731c.mView)) {
                C38790bq6.m62458s0(this.f54731c.mView);
            } else {
                View view2 = this.f54731c.mView;
                view2.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC11681a(view2));
            }
            this.f54731c.performViewCreated();
            C11676h c11676h = this.f54729a;
            Fragment fragment7 = this.f54731c;
            c11676h.m67192m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
            int visibility = this.f54731c.mView.getVisibility();
            this.f54731c.setPostOnViewCreatedAlpha(this.f54731c.mView.getAlpha());
            Fragment fragment8 = this.f54731c;
            if (fragment8.mContainer != null && visibility == 0) {
                View findFocus = fragment8.mView.findFocus();
                if (findFocus != null) {
                    this.f54731c.setFocusedView(findFocus);
                    if (FragmentManager.m67384N0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f54731c);
                    }
                }
                this.f54731c.mView.setAlpha(0.0f);
            }
        }
        this.f54731c.mState = 2;
    }

    /* renamed from: g */
    public void m67169g() {
        boolean z;
        boolean z2;
        Fragment m67144f;
        if (FragmentManager.m67384N0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f54731c);
        }
        Fragment fragment = this.f54731c;
        boolean z3 = true;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Fragment fragment2 = this.f54731c;
            if (!fragment2.mBeingSaved) {
                this.f54730b.m67150B(fragment2.mWho, null);
            }
        }
        if (!z && !this.f54730b.m67134p().m67176q(this.f54731c)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            AbstractC11673f<?> abstractC11673f = this.f54731c.mHost;
            if (abstractC11673f instanceof InterfaceC37154Xr6) {
                z3 = this.f54730b.m67134p().m67179n();
            } else if (abstractC11673f.m67214f() instanceof Activity) {
                z3 = true ^ ((Activity) abstractC11673f.m67214f()).isChangingConfigurations();
            }
            if ((z && !this.f54731c.mBeingSaved) || z3) {
                this.f54730b.m67134p().m67187f(this.f54731c);
            }
            this.f54731c.performDestroy();
            this.f54729a.m67201d(this.f54731c, false);
            for (C11680j c11680j : this.f54730b.m67139k()) {
                if (c11680j != null) {
                    Fragment m67165k = c11680j.m67165k();
                    if (this.f54731c.mWho.equals(m67165k.mTargetWho)) {
                        m67165k.mTarget = this.f54731c;
                        m67165k.mTargetWho = null;
                    }
                }
            }
            Fragment fragment3 = this.f54731c;
            String str = fragment3.mTargetWho;
            if (str != null) {
                fragment3.mTarget = this.f54730b.m67144f(str);
            }
            this.f54730b.m67131s(this);
            return;
        }
        String str2 = this.f54731c.mTargetWho;
        if (str2 != null && (m67144f = this.f54730b.m67144f(str2)) != null && m67144f.mRetainInstance) {
            this.f54731c.mTarget = m67144f;
        }
        this.f54731c.mState = 0;
    }

    /* renamed from: h */
    public void m67168h() {
        View view;
        if (FragmentManager.m67384N0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f54731c);
        }
        Fragment fragment = this.f54731c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f54731c.performDestroyView();
        this.f54729a.m67191n(this.f54731c, false);
        Fragment fragment2 = this.f54731c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.setValue(null);
        this.f54731c.mInLayout = false;
    }

    /* renamed from: i */
    public void m67167i() {
        if (FragmentManager.m67384N0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f54731c);
        }
        this.f54731c.performDetach();
        boolean z = false;
        this.f54729a.m67200e(this.f54731c, false);
        Fragment fragment = this.f54731c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z = true;
        }
        if (z || this.f54730b.m67134p().m67176q(this.f54731c)) {
            if (FragmentManager.m67384N0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f54731c);
            }
            this.f54731c.initState();
        }
    }

    /* renamed from: j */
    public void m67166j() {
        Fragment fragment = this.f54731c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.m67384N0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f54731c);
            }
            Fragment fragment2 = this.f54731c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.f54731c.mSavedFragmentState);
            View view = this.f54731c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f54731c;
                fragment3.mView.setTag(C41690gi4.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f54731c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f54731c.performViewCreated();
                C11676h c11676h = this.f54729a;
                Fragment fragment5 = this.f54731c;
                c11676h.m67192m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f54731c.mState = 2;
            }
        }
    }

    /* renamed from: k */
    public Fragment m67165k() {
        return this.f54731c;
    }

    /* renamed from: l */
    public final boolean m67164l(View view) {
        if (view == this.f54731c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f54731c.mView) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public void m67163m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f54732d) {
            if (FragmentManager.m67384N0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + m67165k());
                return;
            }
            return;
        }
        try {
            this.f54732d = true;
            boolean z = false;
            while (true) {
                int m67172d = m67172d();
                Fragment fragment = this.f54731c;
                int i = fragment.mState;
                if (m67172d != i) {
                    if (m67172d > i) {
                        switch (i + 1) {
                            case 0:
                                m67173c();
                                continue;
                            case 1:
                                m67171e();
                                continue;
                            case 2:
                                m67166j();
                                m67170f();
                                continue;
                            case 3:
                                m67175a();
                                continue;
                            case 4:
                                if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                    AbstractC11688o.m67077o(viewGroup3, fragment.getParentFragmentManager()).m67090b(AbstractC11688o.C11693e.EnumC11696c.m67060b(this.f54731c.mView.getVisibility()), this);
                                }
                                this.f54731c.mState = 4;
                                continue;
                            case 5:
                                m67154v();
                                continue;
                            case 6:
                                fragment.mState = 6;
                                continue;
                            case 7:
                                m67160p();
                                continue;
                            default:
                                continue;
                        }
                    } else {
                        switch (i - 1) {
                            case -1:
                                m67167i();
                                continue;
                            case 0:
                                if (fragment.mBeingSaved && this.f54730b.m67133q(fragment.mWho) == null) {
                                    m67157s();
                                }
                                m67169g();
                                continue;
                            case 1:
                                m67168h();
                                this.f54731c.mState = 1;
                                continue;
                            case 2:
                                fragment.mInLayout = false;
                                fragment.mState = 2;
                                continue;
                            case 3:
                                if (FragmentManager.m67384N0(3)) {
                                    Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f54731c);
                                }
                                Fragment fragment2 = this.f54731c;
                                if (fragment2.mBeingSaved) {
                                    m67157s();
                                } else if (fragment2.mView != null && fragment2.mSavedViewState == null) {
                                    m67156t();
                                }
                                Fragment fragment3 = this.f54731c;
                                if (fragment3.mView != null && (viewGroup2 = fragment3.mContainer) != null) {
                                    AbstractC11688o.m67077o(viewGroup2, fragment3.getParentFragmentManager()).m67088d(this);
                                }
                                this.f54731c.mState = 3;
                                continue;
                            case 4:
                                m67153w();
                                continue;
                            case 5:
                                fragment.mState = 5;
                                continue;
                            case 6:
                                m67162n();
                                continue;
                            default:
                                continue;
                        }
                    }
                    z = true;
                } else {
                    if (!z && i == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f54731c.mBeingSaved) {
                        if (FragmentManager.m67384N0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f54731c);
                        }
                        this.f54730b.m67134p().m67187f(this.f54731c);
                        this.f54730b.m67131s(this);
                        if (FragmentManager.m67384N0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f54731c);
                        }
                        this.f54731c.initState();
                    }
                    Fragment fragment4 = this.f54731c;
                    if (fragment4.mHiddenChanged) {
                        if (fragment4.mView != null && (viewGroup = fragment4.mContainer) != null) {
                            AbstractC11688o m67077o = AbstractC11688o.m67077o(viewGroup, fragment4.getParentFragmentManager());
                            if (this.f54731c.mHidden) {
                                m67077o.m67089c(this);
                            } else {
                                m67077o.m67087e(this);
                            }
                        }
                        Fragment fragment5 = this.f54731c;
                        FragmentManager fragmentManager = fragment5.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.m67388L0(fragment5);
                        }
                        Fragment fragment6 = this.f54731c;
                        fragment6.mHiddenChanged = false;
                        fragment6.onHiddenChanged(fragment6.mHidden);
                        this.f54731c.mChildFragmentManager.m67389L();
                    }
                    return;
                }
            }
        } finally {
            this.f54732d = false;
        }
    }

    /* renamed from: n */
    public void m67162n() {
        if (FragmentManager.m67384N0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f54731c);
        }
        this.f54731c.performPause();
        this.f54729a.m67199f(this.f54731c, false);
    }

    /* renamed from: o */
    public void m67161o(ClassLoader classLoader) {
        Bundle bundle = this.f54731c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f54731c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f54731c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f54731c;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
        Fragment fragment4 = this.f54731c;
        if (fragment4.mTargetWho != null) {
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f54731c;
        Boolean bool = fragment5.mSavedUserVisibleHint;
        if (bool != null) {
            fragment5.mUserVisibleHint = bool.booleanValue();
            this.f54731c.mSavedUserVisibleHint = null;
        } else {
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f54731c;
        if (!fragment6.mUserVisibleHint) {
            fragment6.mDeferStart = true;
        }
    }

    /* renamed from: p */
    public void m67160p() {
        String str;
        if (FragmentManager.m67384N0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f54731c);
        }
        View focusedView = this.f54731c.getFocusedView();
        if (focusedView != null && m67164l(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (FragmentManager.m67384N0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(focusedView);
                sb.append(" ");
                if (requestFocus) {
                    str = "succeeded";
                } else {
                    str = "failed";
                }
                sb.append(str);
                sb.append(" on Fragment ");
                sb.append(this.f54731c);
                sb.append(" resulting in focused view ");
                sb.append(this.f54731c.mView.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f54731c.setFocusedView(null);
        this.f54731c.performResume();
        this.f54729a.m67196i(this.f54731c, false);
        Fragment fragment = this.f54731c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    /* renamed from: q */
    public final Bundle m67159q() {
        Bundle bundle = new Bundle();
        this.f54731c.performSaveInstanceState(bundle);
        this.f54729a.m67195j(this.f54731c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f54731c.mView != null) {
            m67156t();
        }
        if (this.f54731c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f54731c.mSavedViewState);
        }
        if (this.f54731c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f54731c.mSavedViewRegistryState);
        }
        if (!this.f54731c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f54731c.mUserVisibleHint);
        }
        return bundle;
    }

    /* renamed from: r */
    public Fragment.SavedState m67158r() {
        Bundle m67159q;
        if (this.f54731c.mState <= -1 || (m67159q = m67159q()) == null) {
            return null;
        }
        return new Fragment.SavedState(m67159q);
    }

    /* renamed from: s */
    public void m67157s() {
        FragmentState fragmentState = new FragmentState(this.f54731c);
        Fragment fragment = this.f54731c;
        if (fragment.mState > -1 && fragmentState.f54632n == null) {
            Bundle m67159q = m67159q();
            fragmentState.f54632n = m67159q;
            if (this.f54731c.mTargetWho != null) {
                if (m67159q == null) {
                    fragmentState.f54632n = new Bundle();
                }
                fragmentState.f54632n.putString("android:target_state", this.f54731c.mTargetWho);
                int i = this.f54731c.mTargetRequestCode;
                if (i != 0) {
                    fragmentState.f54632n.putInt("android:target_req_state", i);
                }
            }
        } else {
            fragmentState.f54632n = fragment.mSavedFragmentState;
        }
        this.f54730b.m67150B(this.f54731c.mWho, fragmentState);
    }

    /* renamed from: t */
    public void m67156t() {
        if (this.f54731c.mView == null) {
            return;
        }
        if (FragmentManager.m67384N0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f54731c + " with view " + this.f54731c.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f54731c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f54731c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f54731c.mViewLifecycleOwner.m67093e(bundle);
        if (!bundle.isEmpty()) {
            this.f54731c.mSavedViewRegistryState = bundle;
        }
    }

    /* renamed from: u */
    public void m67155u(int i) {
        this.f54733e = i;
    }

    /* renamed from: v */
    public void m67154v() {
        if (FragmentManager.m67384N0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f54731c);
        }
        this.f54731c.performStart();
        this.f54729a.m67194k(this.f54731c, false);
    }

    /* renamed from: w */
    public void m67153w() {
        if (FragmentManager.m67384N0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f54731c);
        }
        this.f54731c.performStop();
        this.f54729a.m67193l(this.f54731c, false);
    }

    public C11680j(C11676h c11676h, C11684l c11684l, ClassLoader classLoader, C11672e c11672e, FragmentState fragmentState) {
        this.f54729a = c11676h;
        this.f54730b = c11684l;
        Fragment m67258a = fragmentState.m67258a(c11672e, classLoader);
        this.f54731c = m67258a;
        if (FragmentManager.m67384N0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + m67258a);
        }
    }

    public C11680j(C11676h c11676h, C11684l c11684l, Fragment fragment, FragmentState fragmentState) {
        this.f54729a = c11676h;
        this.f54730b = c11684l;
        this.f54731c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.f54632n;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}
