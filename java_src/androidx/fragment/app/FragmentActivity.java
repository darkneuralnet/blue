package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.C11729j;
import androidx.savedstate.C11966a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p000.C25883m3;
/* loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity implements C25883m3.InterfaceC25887d {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final C11729j mFragmentLifecycleRegistry;
    final C39476cy1 mFragments;
    boolean mResumed;
    boolean mStopped;

    /* renamed from: androidx.fragment.app.FragmentActivity$a */
    /* loaded from: classes.dex */
    public class C11623a extends AbstractC11673f<FragmentActivity> implements InterfaceC44624lf3, InterfaceC46423oh3, InterfaceC37052Xg3, InterfaceC38697bh3, InterfaceC37154Xr6, InterfaceC39270cf3, InterfaceC1735E5, InterfaceC35200Pi5, InterfaceC48369ry1, VP2 {
        public C11623a() {
            super(FragmentActivity.this);
        }

        @Override // p000.InterfaceC48369ry1
        /* renamed from: a */
        public void mo14975a(FragmentManager fragmentManager, Fragment fragment) {
            FragmentActivity.this.onAttachFragment(fragment);
        }

        @Override // p000.VP2
        public void addMenuProvider(InterfaceC50411vQ2 interfaceC50411vQ2) {
            FragmentActivity.this.addMenuProvider(interfaceC50411vQ2);
        }

        @Override // p000.InterfaceC44624lf3
        public void addOnConfigurationChangedListener(InterfaceC48378rz0<Configuration> interfaceC48378rz0) {
            FragmentActivity.this.addOnConfigurationChangedListener(interfaceC48378rz0);
        }

        @Override // p000.InterfaceC37052Xg3
        public void addOnMultiWindowModeChangedListener(InterfaceC48378rz0<C40988fX2> interfaceC48378rz0) {
            FragmentActivity.this.addOnMultiWindowModeChangedListener(interfaceC48378rz0);
        }

        @Override // p000.InterfaceC38697bh3
        public void addOnPictureInPictureModeChangedListener(InterfaceC48378rz0<C45697nT3> interfaceC48378rz0) {
            FragmentActivity.this.addOnPictureInPictureModeChangedListener(interfaceC48378rz0);
        }

        @Override // p000.InterfaceC46423oh3
        public void addOnTrimMemoryListener(InterfaceC48378rz0<Integer> interfaceC48378rz0) {
            FragmentActivity.this.addOnTrimMemoryListener(interfaceC48378rz0);
        }

        @Override // androidx.fragment.app.AbstractC11673f, p000.AbstractC38865by1
        /* renamed from: c */
        public View mo62064c(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        @Override // androidx.fragment.app.AbstractC11673f, p000.AbstractC38865by1
        /* renamed from: d */
        public boolean mo62063d() {
            Window window = FragmentActivity.this.getWindow();
            if (window != null && window.peekDecorView() != null) {
                return true;
            }
            return false;
        }

        @Override // p000.InterfaceC1735E5
        public ActivityResultRegistry getActivityResultRegistry() {
            return FragmentActivity.this.getActivityResultRegistry();
        }

        @Override // p000.LifecycleOwner
        public AbstractC11719f getLifecycle() {
            return FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        @Override // p000.InterfaceC39270cf3
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        @Override // p000.InterfaceC35200Pi5
        public C11966a getSavedStateRegistry() {
            return FragmentActivity.this.getSavedStateRegistry();
        }

        @Override // p000.InterfaceC37154Xr6
        public C36920Wr6 getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.AbstractC11673f
        /* renamed from: h */
        public void mo67212h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.AbstractC11673f
        /* renamed from: j */
        public LayoutInflater mo67210j() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.AbstractC11673f
        /* renamed from: l */
        public boolean mo67208l(String str) {
            return C25883m3.m26445x(FragmentActivity.this, str);
        }

        @Override // androidx.fragment.app.AbstractC11673f
        /* renamed from: o */
        public void mo67205o() {
            m67426p();
        }

        /* renamed from: p */
        public void m67426p() {
            FragmentActivity.this.invalidateMenu();
        }

        @Override // androidx.fragment.app.AbstractC11673f
        /* renamed from: q */
        public FragmentActivity mo67211i() {
            return FragmentActivity.this;
        }

        @Override // p000.VP2
        public void removeMenuProvider(InterfaceC50411vQ2 interfaceC50411vQ2) {
            FragmentActivity.this.removeMenuProvider(interfaceC50411vQ2);
        }

        @Override // p000.InterfaceC44624lf3
        public void removeOnConfigurationChangedListener(InterfaceC48378rz0<Configuration> interfaceC48378rz0) {
            FragmentActivity.this.removeOnConfigurationChangedListener(interfaceC48378rz0);
        }

        @Override // p000.InterfaceC37052Xg3
        public void removeOnMultiWindowModeChangedListener(InterfaceC48378rz0<C40988fX2> interfaceC48378rz0) {
            FragmentActivity.this.removeOnMultiWindowModeChangedListener(interfaceC48378rz0);
        }

        @Override // p000.InterfaceC38697bh3
        public void removeOnPictureInPictureModeChangedListener(InterfaceC48378rz0<C45697nT3> interfaceC48378rz0) {
            FragmentActivity.this.removeOnPictureInPictureModeChangedListener(interfaceC48378rz0);
        }

        @Override // p000.InterfaceC46423oh3
        public void removeOnTrimMemoryListener(InterfaceC48378rz0<Integer> interfaceC48378rz0) {
            FragmentActivity.this.removeOnTrimMemoryListener(interfaceC48378rz0);
        }
    }

    public FragmentActivity() {
        this.mFragments = C39476cy1.m44789b(new C11623a());
        this.mFragmentLifecycleRegistry = new C11729j(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().m66069i(LIFECYCLE_TAG, new C11966a.InterfaceC11969c() { // from class: Vx1
            @Override // androidx.savedstate.C11966a.InterfaceC11969c
            /* renamed from: a */
            public final Bundle mo18217a() {
                Bundle lambda$init$0;
                lambda$init$0 = FragmentActivity.this.lambda$init$0();
                return lambda$init$0;
            }
        });
        addOnConfigurationChangedListener(new InterfaceC48378rz0() { // from class: Wx1
            @Override // p000.InterfaceC48378rz0
            public final void accept(Object obj) {
                FragmentActivity.this.lambda$init$1((Configuration) obj);
            }
        });
        addOnNewIntentListener(new InterfaceC48378rz0() { // from class: Xx1
            @Override // p000.InterfaceC48378rz0
            public final void accept(Object obj) {
                FragmentActivity.this.lambda$init$2((Intent) obj);
            }
        });
        addOnContextAvailableListener(new InterfaceC45217mf3() { // from class: Yx1
            @Override // p000.InterfaceC45217mf3
            /* renamed from: a */
            public final void mo25215a(Context context) {
                FragmentActivity.this.lambda$init$3(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.m67001i(AbstractC11719f.EnumC11720a.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.m44778m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.m44778m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$3(Context context) {
        this.mFragments.m44790a(null);
    }

    private static boolean markState(FragmentManager fragmentManager, AbstractC11719f.EnumC11724b enumC11724b) {
        boolean z = false;
        for (Fragment fragment : fragmentManager.m67283z0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z |= markState(fragment.getChildFragmentManager(), enumC11724b);
                }
                C11687n c11687n = fragment.mViewLifecycleOwner;
                if (c11687n != null && c11687n.getLifecycle().mo67007b().m67013b(AbstractC11719f.EnumC11724b.STARTED)) {
                    fragment.mViewLifecycleOwner.m67092f(enumC11724b);
                    z = true;
                }
                if (fragment.mLifecycleRegistry.mo67007b().m67013b(AbstractC11719f.EnumC11724b.STARTED)) {
                    fragment.mLifecycleRegistry.m66995o(enumC11724b);
                    z = true;
                }
            }
        }
        return z;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.m44777n(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (!shouldDumpInternalState(strArr)) {
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            AbstractC49506tt2.m11259b(this).mo9610a(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.m44779l().m67361Z(str, fileDescriptor, printWriter, strArr);
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.m44779l();
    }

    @Deprecated
    public AbstractC49506tt2 getSupportLoaderManager() {
        return AbstractC49506tt2.m11259b(this);
    }

    public void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), AbstractC11719f.EnumC11724b.CREATED));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.m44778m();
        super.onActivityResult(i, i2, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.m67001i(AbstractC11719f.EnumC11720a.ON_CREATE);
        this.mFragments.m44786e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.m44785f();
        this.mFragmentLifecycleRegistry.m67001i(AbstractC11719f.EnumC11720a.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.m44787d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.m44784g();
        this.mFragmentLifecycleRegistry.m67001i(AbstractC11719f.EnumC11720a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.m44778m();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.m44778m();
        super.onResume();
        this.mResumed = true;
        this.mFragments.m44780k();
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.m67001i(AbstractC11719f.EnumC11720a.ON_RESUME);
        this.mFragments.m44783h();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.m44778m();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.m44788c();
        }
        this.mFragments.m44780k();
        this.mFragmentLifecycleRegistry.m67001i(AbstractC11719f.EnumC11720a.ON_START);
        this.mFragments.m44782i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m44778m();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.m44781j();
        this.mFragmentLifecycleRegistry.m67001i(AbstractC11719f.EnumC11720a.ON_STOP);
    }

    public void setEnterSharedElementCallback(AbstractC36046Sy5 abstractC36046Sy5) {
        C25883m3.m26447v(this, abstractC36046Sy5);
    }

    public void setExitSharedElementCallback(AbstractC36046Sy5 abstractC36046Sy5) {
        C25883m3.m26446w(this, abstractC36046Sy5);
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            C25883m3.m26443z(this, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        C25883m3.m26452q(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        C25883m3.m26450s(this);
    }

    public void supportStartPostponedEnterTransition() {
        C25883m3.m26455A(this);
    }

    @Override // p000.C25883m3.InterfaceC25887d
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            C25883m3.m26444y(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public FragmentActivity(int i) {
        super(i);
        this.mFragments = C39476cy1.m44789b(new C11623a());
        this.mFragmentLifecycleRegistry = new C11729j(this);
        this.mStopped = true;
        init();
    }
}
