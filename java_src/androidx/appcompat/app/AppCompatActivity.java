package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.C10990a;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.savedstate.C11966a;
import p000.AbstractC2614G2;
import p000.BZ5;
/* loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements InterfaceC10819ai, BZ5.InterfaceC0646b, C10990a.InterfaceC10993c {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private AbstractC10999c mDelegate;
    private Resources mResources;

    /* renamed from: androidx.appcompat.app.AppCompatActivity$a */
    /* loaded from: classes.dex */
    public class C10962a implements C11966a.InterfaceC11969c {
        public C10962a() {
        }

        @Override // androidx.savedstate.C11966a.InterfaceC11969c
        /* renamed from: a */
        public Bundle mo18217a() {
            Bundle bundle = new Bundle();
            AppCompatActivity.this.getDelegate().mo28610F(bundle);
            return bundle;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatActivity$b */
    /* loaded from: classes.dex */
    public class C10963b implements InterfaceC45217mf3 {
        public C10963b() {
        }

        @Override // p000.InterfaceC45217mf3
        /* renamed from: a */
        public void mo25215a(Context context) {
            AbstractC10999c delegate = AppCompatActivity.this.getDelegate();
            delegate.mo28589w();
            delegate.mo28614B(AppCompatActivity.this.getSavedStateRegistry().m66076b(AppCompatActivity.DELEGATE_TAG));
        }
    }

    public AppCompatActivity() {
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().m66069i(DELEGATE_TAG, new C10962a());
        addOnContextAvailableListener(new C10963b());
    }

    private void initViewTreeOwners() {
        C35534Qt6.m87652b(getWindow().getDecorView(), this);
        C36470Ut6.m80657b(getWindow().getDecorView(), this);
        C36236Tt6.m82296b(getWindow().getDecorView(), this);
        C36002St6.m84671b(getWindow().getDecorView(), this);
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().mo28598e(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().mo28596i(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo70252g()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.mo70249q(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) getDelegate().mo28594m(i);
    }

    public AbstractC10999c getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AbstractC10999c.m70273j(this, this);
        }
        return this.mDelegate;
    }

    @Override // androidx.appcompat.app.C10990a.InterfaceC10993c
    public C10990a.InterfaceC10992b getDrawerToggleDelegate() {
        return getDelegate().mo28593q();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return getDelegate().mo28591t();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.mResources == null && C38137ak6.m70803c()) {
            this.mResources = new C38137ak6(this, super.getResources());
        }
        Resources resources = this.mResources;
        if (resources == null) {
            return super.getResources();
        }
        return resources;
    }

    public ActionBar getSupportActionBar() {
        return getDelegate().mo28590v();
    }

    @Override // p000.BZ5.InterfaceC0646b
    public Intent getSupportParentActivityIntent() {
        return XY2.m76867a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().mo28588x();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().mo28615A(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(BZ5 bz5) {
        bz5.m113856c(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().mo28613C();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onLocalesChanged(C50711vv2 c50711vv2) {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() == 16908332 && supportActionBar != null && (supportActionBar.mo70220j() & 4) != 0) {
            return onSupportNavigateUp();
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onNightModeChanged(int i) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().mo28612D(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        getDelegate().mo28611E();
    }

    public void onPrepareSupportNavigateUpTaskStack(BZ5 bz5) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        getDelegate().mo28609G();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        getDelegate().mo28608H();
    }

    @Override // p000.InterfaceC10819ai
    public void onSupportActionModeFinished(AbstractC2614G2 abstractC2614G2) {
    }

    @Override // p000.InterfaceC10819ai
    public void onSupportActionModeStarted(AbstractC2614G2 abstractC2614G2) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent != null) {
            if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
                BZ5 m113853h = BZ5.m113853h(this);
                onCreateSupportNavigateUpTaskStack(m113853h);
                onPrepareSupportNavigateUpTaskStack(m113853h);
                m113853h.m113850s();
                try {
                    C25883m3.m26453p(this);
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            }
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        return false;
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().mo28601S(charSequence);
    }

    @Override // p000.InterfaceC10819ai
    public AbstractC2614G2 onWindowStartingSupportActionMode(AbstractC2614G2.InterfaceC2615a interfaceC2615a) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo70248r()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        initViewTreeOwners();
        getDelegate().mo28606L(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().mo28603Q(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        getDelegate().mo28602R(i);
    }

    public AbstractC2614G2 startSupportActionMode(AbstractC2614G2.InterfaceC2615a interfaceC2615a) {
        return getDelegate().mo28600T(interfaceC2615a);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void supportInvalidateOptionsMenu() {
        getDelegate().mo28588x();
    }

    public void supportNavigateUpTo(Intent intent) {
        XY2.m76863e(this, intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo28607K(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return XY2.m76862f(this, intent);
    }

    public AppCompatActivity(int i) {
        super(i);
        initDelegate();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        getDelegate().mo28605M(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().mo28604N(view, layoutParams);
    }
}
