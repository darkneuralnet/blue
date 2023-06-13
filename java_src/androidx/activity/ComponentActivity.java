package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.C11729j;
import androidx.lifecycle.C11750q;
import androidx.lifecycle.C11755r;
import androidx.lifecycle.C11759u;
import androidx.lifecycle.FragmentC11742o;
import androidx.lifecycle.InterfaceC11718e;
import androidx.lifecycle.InterfaceC11728i;
import androidx.savedstate.C11966a;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p000.AbstractC29414v5;
/* loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements InterfaceC37154Xr6, InterfaceC11718e, InterfaceC35200Pi5, InterfaceC39270cf3, InterfaceC1735E5, InterfaceC29050u5, InterfaceC44624lf3, InterfaceC46423oh3, InterfaceC37052Xg3, InterfaceC38697bh3, VP2, InterfaceC49674uA1 {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    final LA0 mContextAwareHelper;
    private C11759u.InterfaceC11763b mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    final C49081tA1 mFullyDrawnReporter;
    private final C11729j mLifecycleRegistry;
    private final YP2 mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<InterfaceC48378rz0<Configuration>> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC48378rz0<C40988fX2>> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC48378rz0<Intent>> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<InterfaceC48378rz0<C45697nT3>> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC48378rz0<Integer>> mOnTrimMemoryListeners;
    final InterfaceExecutorC10937f mReportFullyDrawnExecutor;
    final C34966Oi5 mSavedStateRegistryController;
    private C36920Wr6 mViewModelStore;

    /* renamed from: androidx.activity.ComponentActivity$a */
    /* loaded from: classes.dex */
    public class RunnableC10930a implements Runnable {
        public RunnableC10930a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    return;
                }
                throw e;
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    /* loaded from: classes.dex */
    public class C10931b extends ActivityResultRegistry {

        /* renamed from: androidx.activity.ComponentActivity$b$a */
        /* loaded from: classes.dex */
        public class RunnableC10932a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ int f51413b;

            /* renamed from: c */
            public final /* synthetic */ AbstractC29414v5.C29415a f51414c;

            public RunnableC10932a(int i, AbstractC29414v5.C29415a c29415a) {
                this.f51413b = i;
                this.f51414c = c29415a;
            }

            @Override // java.lang.Runnable
            public void run() {
                C10931b.this.m70479c(this.f51413b, this.f51414c.m9207a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b */
        /* loaded from: classes.dex */
        public class RunnableC10933b implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ int f51416b;

            /* renamed from: c */
            public final /* synthetic */ IntentSender.SendIntentException f51417c;

            public RunnableC10933b(int i, IntentSender.SendIntentException sendIntentException) {
                this.f51416b = i;
                this.f51417c = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                C10931b.this.m70480b(this.f51416b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f51417c));
            }
        }

        public C10931b() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        /* renamed from: f */
        public <I, O> void mo70476f(int i, AbstractC29414v5<I, O> abstractC29414v5, I i2, C1727E4 c1727e4) {
            Bundle bundle;
            Bundle bundle2;
            ComponentActivity componentActivity = ComponentActivity.this;
            AbstractC29414v5.C29415a<O> synchronousResult = abstractC29414v5.getSynchronousResult(componentActivity, i2);
            if (synchronousResult != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC10932a(i, synchronousResult));
                return;
            }
            Intent createIntent = abstractC29414v5.createIntent(componentActivity, i2);
            if (createIntent.getExtras() != null && createIntent.getExtras().getClassLoader() == null) {
                createIntent.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (createIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = createIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                createIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle2 = bundleExtra;
            } else {
                if (c1727e4 != null) {
                    bundle = c1727e4.m109468a();
                } else {
                    bundle = null;
                }
                bundle2 = bundle;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(createIntent.getAction())) {
                String[] stringArrayExtra = createIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                C25883m3.m26448u(componentActivity, stringArrayExtra, i);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(createIntent.getAction())) {
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) createIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    C25883m3.m26443z(componentActivity, intentSenderRequest.m70464d(), i, intentSenderRequest.m70467a(), intentSenderRequest.m70466b(), intentSenderRequest.m70465c(), 0, bundle2);
                } catch (IntentSender.SendIntentException e) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC10933b(i, e));
                }
            } else {
                C25883m3.m26444y(componentActivity, createIntent, i, bundle2);
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$c */
    /* loaded from: classes.dex */
    public static class C10934c {
        private C10934c() {
        }

        /* renamed from: a */
        public static void m70506a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$d */
    /* loaded from: classes.dex */
    public static class C10935d {
        private C10935d() {
        }

        /* renamed from: a */
        public static OnBackInvokedDispatcher m70505a(Activity activity) {
            OnBackInvokedDispatcher onBackInvokedDispatcher;
            onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            return onBackInvokedDispatcher;
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$e */
    /* loaded from: classes.dex */
    public static final class C10936e {

        /* renamed from: a */
        public Object f51419a;

        /* renamed from: b */
        public C36920Wr6 f51420b;
    }

    /* renamed from: androidx.activity.ComponentActivity$f */
    /* loaded from: classes.dex */
    public interface InterfaceExecutorC10937f extends Executor {
        /* renamed from: E */
        void mo70504E();

        /* renamed from: s */
        void mo70501s(View view);
    }

    /* renamed from: androidx.activity.ComponentActivity$g */
    /* loaded from: classes.dex */
    public class ViewTreeObserver$OnDrawListenerC10938g implements InterfaceExecutorC10937f, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: c */
        public Runnable f51422c;

        /* renamed from: b */
        public final long f51421b = SystemClock.uptimeMillis() + AbstractComponentTracker.LINGERING_TIMEOUT;

        /* renamed from: d */
        public boolean f51423d = false;

        public ViewTreeObserver$OnDrawListenerC10938g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m70502b() {
            Runnable runnable = this.f51422c;
            if (runnable != null) {
                runnable.run();
                this.f51422c = null;
            }
        }

        @Override // androidx.activity.ComponentActivity.InterfaceExecutorC10937f
        /* renamed from: E */
        public void mo70504E() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f51422c = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            if (this.f51423d) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    decorView.invalidate();
                    return;
                } else {
                    decorView.postInvalidate();
                    return;
                }
            }
            decorView.postOnAnimation(new Runnable() { // from class: Ls0
                @Override // java.lang.Runnable
                public final void run() {
                    ComponentActivity.ViewTreeObserver$OnDrawListenerC10938g.this.m70502b();
                }
            });
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f51422c;
            if (runnable != null) {
                runnable.run();
                this.f51422c = null;
                if (ComponentActivity.this.mFullyDrawnReporter.m12954c()) {
                    this.f51423d = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                }
            } else if (SystemClock.uptimeMillis() > this.f51421b) {
                this.f51423d = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // androidx.activity.ComponentActivity.InterfaceExecutorC10937f
        /* renamed from: s */
        public void mo70501s(View view) {
            if (!this.f51423d) {
                this.f51423d = true;
                view.getViewTreeObserver().addOnDrawListener(this);
            }
        }
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new LA0();
        this.mMenuHostHelper = new YP2(new Runnable() { // from class: Gs0
            @Override // java.lang.Runnable
            public final void run() {
                ComponentActivity.this.invalidateMenu();
            }
        });
        this.mLifecycleRegistry = new C11729j(this);
        C34966Oi5 m91666a = C34966Oi5.m91666a(this);
        this.mSavedStateRegistryController = m91666a;
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new RunnableC10930a());
        InterfaceExecutorC10937f createFullyDrawnExecutor = createFullyDrawnExecutor();
        this.mReportFullyDrawnExecutor = createFullyDrawnExecutor;
        this.mFullyDrawnReporter = new C49081tA1(createFullyDrawnExecutor, new Function0() { // from class: Hs0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit lambda$new$0;
                lambda$new$0 = ComponentActivity.this.lambda$new$0();
                return lambda$new$0;
            }
        });
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new C10931b();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() != null) {
            getLifecycle().mo67008a(new InterfaceC11728i() { // from class: androidx.activity.ComponentActivity.3
                @Override // androidx.lifecycle.InterfaceC11728i
                public void onStateChanged(LifecycleOwner lifecycleOwner, AbstractC11719f.EnumC11720a enumC11720a) {
                    View view;
                    if (enumC11720a == AbstractC11719f.EnumC11720a.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        if (window != null) {
                            view = window.peekDecorView();
                        } else {
                            view = null;
                        }
                        if (view != null) {
                            C10934c.m70506a(view);
                        }
                    }
                }
            });
            getLifecycle().mo67008a(new InterfaceC11728i() { // from class: androidx.activity.ComponentActivity.4
                @Override // androidx.lifecycle.InterfaceC11728i
                public void onStateChanged(LifecycleOwner lifecycleOwner, AbstractC11719f.EnumC11720a enumC11720a) {
                    if (enumC11720a == AbstractC11719f.EnumC11720a.ON_DESTROY) {
                        ComponentActivity.this.mContextAwareHelper.m97639b();
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.getViewModelStore().m77779a();
                        }
                        ComponentActivity.this.mReportFullyDrawnExecutor.mo70504E();
                    }
                }
            });
            getLifecycle().mo67008a(new InterfaceC11728i() { // from class: androidx.activity.ComponentActivity.5
                @Override // androidx.lifecycle.InterfaceC11728i
                public void onStateChanged(LifecycleOwner lifecycleOwner, AbstractC11719f.EnumC11720a enumC11720a) {
                    ComponentActivity.this.ensureViewModelStore();
                    ComponentActivity.this.getLifecycle().mo67006d(this);
                }
            });
            m91666a.m91664c();
            C11750q.m66934c(this);
            getSavedStateRegistry().m66069i(ACTIVITY_RESULT_TAG, new C11966a.InterfaceC11969c() { // from class: Is0
                @Override // androidx.savedstate.C11966a.InterfaceC11969c
                /* renamed from: a */
                public final Bundle mo18217a() {
                    Bundle lambda$new$1;
                    lambda$new$1 = ComponentActivity.this.lambda$new$1();
                    return lambda$new$1;
                }
            });
            addOnContextAvailableListener(new InterfaceC45217mf3() { // from class: Js0
                @Override // p000.InterfaceC45217mf3
                /* renamed from: a */
                public final void mo25215a(Context context) {
                    ComponentActivity.this.lambda$new$2(context);
                }
            });
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    private InterfaceExecutorC10937f createFullyDrawnExecutor() {
        return new ViewTreeObserver$OnDrawListenerC10938g();
    }

    private void initViewTreeOwners() {
        C35534Qt6.m87652b(getWindow().getDecorView(), this);
        C36470Ut6.m80657b(getWindow().getDecorView(), this);
        C36236Tt6.m82296b(getWindow().getDecorView(), this);
        C36002St6.m84671b(getWindow().getDecorView(), this);
        C35300Pt6.m89462a(getWindow().getDecorView(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$new$0() {
        reportFullyDrawn();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$new$1() {
        Bundle bundle = new Bundle();
        this.mActivityResultRegistry.m70474h(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(Context context) {
        Bundle m66076b = getSavedStateRegistry().m66076b(ACTIVITY_RESULT_TAG);
        if (m66076b != null) {
            this.mActivityResultRegistry.m70475g(m66076b);
        }
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.mo70501s(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // p000.VP2
    public void addMenuProvider(InterfaceC50411vQ2 interfaceC50411vQ2) {
        this.mMenuHostHelper.m75106c(interfaceC50411vQ2);
    }

    @Override // p000.InterfaceC44624lf3
    public final void addOnConfigurationChangedListener(InterfaceC48378rz0<Configuration> interfaceC48378rz0) {
        this.mOnConfigurationChangedListeners.add(interfaceC48378rz0);
    }

    public final void addOnContextAvailableListener(InterfaceC45217mf3 interfaceC45217mf3) {
        this.mContextAwareHelper.m97640a(interfaceC45217mf3);
    }

    @Override // p000.InterfaceC37052Xg3
    public final void addOnMultiWindowModeChangedListener(InterfaceC48378rz0<C40988fX2> interfaceC48378rz0) {
        this.mOnMultiWindowModeChangedListeners.add(interfaceC48378rz0);
    }

    public final void addOnNewIntentListener(InterfaceC48378rz0<Intent> interfaceC48378rz0) {
        this.mOnNewIntentListeners.add(interfaceC48378rz0);
    }

    @Override // p000.InterfaceC38697bh3
    public final void addOnPictureInPictureModeChangedListener(InterfaceC48378rz0<C45697nT3> interfaceC48378rz0) {
        this.mOnPictureInPictureModeChangedListeners.add(interfaceC48378rz0);
    }

    @Override // p000.InterfaceC46423oh3
    public final void addOnTrimMemoryListener(InterfaceC48378rz0<Integer> interfaceC48378rz0) {
        this.mOnTrimMemoryListeners.add(interfaceC48378rz0);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            C10936e c10936e = (C10936e) getLastNonConfigurationInstance();
            if (c10936e != null) {
                this.mViewModelStore = c10936e.f51420b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new C36920Wr6();
            }
        }
    }

    @Override // p000.InterfaceC1735E5
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC11718e
    public FE0 getDefaultViewModelCreationExtras() {
        C47511qX2 c47511qX2 = new C47511qX2();
        if (getApplication() != null) {
            c47511qX2.m17470c(C11759u.C11760a.f54991h, getApplication());
        }
        c47511qX2.m17470c(C11750q.f54966a, this);
        c47511qX2.m17470c(C11750q.f54967b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            c47511qX2.m17470c(C11750q.f54968c, getIntent().getExtras());
        }
        return c47511qX2;
    }

    @Override // androidx.lifecycle.InterfaceC11718e
    public C11759u.InterfaceC11763b getDefaultViewModelProviderFactory() {
        Bundle bundle;
        if (this.mDefaultFactory == null) {
            Application application = getApplication();
            if (getIntent() != null) {
                bundle = getIntent().getExtras();
            } else {
                bundle = null;
            }
            this.mDefaultFactory = new C11755r(application, this, bundle);
        }
        return this.mDefaultFactory;
    }

    public C49081tA1 getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        C10936e c10936e = (C10936e) getLastNonConfigurationInstance();
        if (c10936e != null) {
            return c10936e.f51419a;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, p000.LifecycleOwner
    public AbstractC11719f getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // p000.InterfaceC39270cf3
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // p000.InterfaceC35200Pi5
    public final C11966a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.m91665b();
    }

    @Override // p000.InterfaceC37154Xr6
    public C36920Wr6 getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.mActivityResultRegistry.m70480b(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.m70494f();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<InterfaceC48378rz0<Configuration>> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.m91663d(bundle);
        this.mContextAwareHelper.m97638c(this);
        super.onCreate(bundle);
        FragmentC11742o.m66959e(this);
        if (T30.m84398c()) {
            this.mOnBackPressedDispatcher.m70493g(C10935d.m70505a(this));
        }
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            super.onCreatePanelMenu(i, menu);
            this.mMenuHostHelper.m75101h(menu, getMenuInflater());
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mMenuHostHelper.m75099j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<InterfaceC48378rz0<C40988fX2>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C40988fX2(z));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<InterfaceC48378rz0<Intent>> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        this.mMenuHostHelper.m75100i(menu);
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<InterfaceC48378rz0<C45697nT3>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C45697nT3(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            super.onPreparePanel(i, view, menu);
            this.mMenuHostHelper.m75098k(menu);
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.mActivityResultRegistry.m70480b(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C10936e c10936e;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        C36920Wr6 c36920Wr6 = this.mViewModelStore;
        if (c36920Wr6 == null && (c10936e = (C10936e) getLastNonConfigurationInstance()) != null) {
            c36920Wr6 = c10936e.f51420b;
        }
        if (c36920Wr6 == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C10936e c10936e2 = new C10936e();
        c10936e2.f51419a = onRetainCustomNonConfigurationInstance;
        c10936e2.f51420b = c36920Wr6;
        return c10936e2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC11719f lifecycle = getLifecycle();
        if (lifecycle instanceof C11729j) {
            ((C11729j) lifecycle).m66995o(AbstractC11719f.EnumC11724b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m91662e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<InterfaceC48378rz0<Integer>> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.m97637d();
    }

    public final <I, O> AbstractC0407B5<I> registerForActivityResult(AbstractC29414v5<I, O> abstractC29414v5, ActivityResultRegistry activityResultRegistry, InterfaceC28515t5<O> interfaceC28515t5) {
        return activityResultRegistry.m70472j("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, abstractC29414v5, interfaceC28515t5);
    }

    @Override // p000.VP2
    public void removeMenuProvider(InterfaceC50411vQ2 interfaceC50411vQ2) {
        this.mMenuHostHelper.m75097l(interfaceC50411vQ2);
    }

    @Override // p000.InterfaceC44624lf3
    public final void removeOnConfigurationChangedListener(InterfaceC48378rz0<Configuration> interfaceC48378rz0) {
        this.mOnConfigurationChangedListeners.remove(interfaceC48378rz0);
    }

    public final void removeOnContextAvailableListener(InterfaceC45217mf3 interfaceC45217mf3) {
        this.mContextAwareHelper.m97636e(interfaceC45217mf3);
    }

    @Override // p000.InterfaceC37052Xg3
    public final void removeOnMultiWindowModeChangedListener(InterfaceC48378rz0<C40988fX2> interfaceC48378rz0) {
        this.mOnMultiWindowModeChangedListeners.remove(interfaceC48378rz0);
    }

    public final void removeOnNewIntentListener(InterfaceC48378rz0<Intent> interfaceC48378rz0) {
        this.mOnNewIntentListeners.remove(interfaceC48378rz0);
    }

    @Override // p000.InterfaceC38697bh3
    public final void removeOnPictureInPictureModeChangedListener(InterfaceC48378rz0<C45697nT3> interfaceC48378rz0) {
        this.mOnPictureInPictureModeChangedListeners.remove(interfaceC48378rz0);
    }

    @Override // p000.InterfaceC46423oh3
    public final void removeOnTrimMemoryListener(InterfaceC48378rz0<Integer> interfaceC48378rz0) {
        this.mOnTrimMemoryListeners.remove(interfaceC48378rz0);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (C37763a66.m71890d()) {
                C37763a66.m71893a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.mFullyDrawnReporter.m12955b();
        } finally {
            C37763a66.m71892b();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.mo70501s(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public void addMenuProvider(InterfaceC50411vQ2 interfaceC50411vQ2, LifecycleOwner lifecycleOwner) {
        this.mMenuHostHelper.m75105d(interfaceC50411vQ2, lifecycleOwner);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(InterfaceC50411vQ2 interfaceC50411vQ2, LifecycleOwner lifecycleOwner, AbstractC11719f.EnumC11724b enumC11724b) {
        this.mMenuHostHelper.m75104e(interfaceC50411vQ2, lifecycleOwner, enumC11724b);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<InterfaceC48378rz0<C40988fX2>> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new C40988fX2(z, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<InterfaceC48378rz0<C45697nT3>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new C45697nT3(z, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // p000.InterfaceC29050u5
    public final <I, O> AbstractC0407B5<I> registerForActivityResult(AbstractC29414v5<I, O> abstractC29414v5, InterfaceC28515t5<O> interfaceC28515t5) {
        return registerForActivityResult(abstractC29414v5, this.mActivityResultRegistry, interfaceC28515t5);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.mo70501s(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.mo70501s(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    public ComponentActivity(int i) {
        this();
        this.mContentLayoutId = i;
    }
}
