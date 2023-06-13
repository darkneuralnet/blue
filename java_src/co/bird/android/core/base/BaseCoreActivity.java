package co.bird.android.core.base;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.app.AbstractC10999c;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import co.bird.android.core.base.BaseCoreActivity;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b:\u0010;J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0015J\b\u0010\u0006\u001a\u00020\u0004H\u0015J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0015J\b\u0010\r\u001a\u00020\u0004H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J-\u0010\u001a\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0014J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0010H\u0004J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0010H\u0004J\b\u0010\"\u001a\u00020\u0004H\u0004R\u001b\u0010'\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010-\u001a\u00020(8&@&X¦\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u00103\u001a\u00020.8&@&X¦\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u00109\u001a\u0002048&@&X¦\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006<"}, m28432d2 = {"Lco/bird/android/core/base/BaseCoreActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "onBackPressed", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Landroidx/appcompat/app/c;", "getDelegate", "D", "noActionBar", "B", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "A", "b", "Lkotlin/Lazy;", "v", "()Landroidx/appcompat/app/c;", "appCompatDelegate", "Le13;", "w", "()Le13;", "setNavigator", "(Le13;)V", "navigator", "LDQ3;", "x", "()LDQ3;", "setPermissionManager", "(LDQ3;)V", "permissionManager", "LTq4;", "y", "()LTq4;", "setReactiveConfig", "(LTq4;)V", "reactiveConfig", "<init>", "()V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class BaseCoreActivity extends AppCompatActivity {

    /* renamed from: b */
    public final Lazy f63043b;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LWs6;", "b", "()LWs6;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.core.base.BaseCoreActivity$a */
    /* loaded from: classes2.dex */
    public static final class C14444a extends Lambda implements Function0<LayoutInflater$Factory2C36929Ws6> {
        public C14444a() {
            super(0);
        }

        /* renamed from: c */
        public static final Context m59025c(Context baseContext) {
            String str;
            boolean contains;
            Intrinsics.checkNotNullParameter(baseContext, "baseContext");
            try {
                str = Build.MANUFACTURER + Build.MODEL;
            } catch (Exception unused) {
                str = "";
            }
            contains = StringsKt__StringsKt.contains((CharSequence) str, (CharSequence) "moto", true);
            if (!contains) {
                baseContext.getApplicationContext();
            }
            return UM4.m81588h(baseContext);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final LayoutInflater$Factory2C36929Ws6 invoke() {
            AbstractC10999c delegate = BaseCoreActivity.super.getDelegate();
            Intrinsics.checkNotNullExpressionValue(delegate, "super.getDelegate()");
            return new LayoutInflater$Factory2C36929Ws6(delegate, BaseCoreActivity.this, new YG6() { // from class: wA
                @Override // p000.YG6
                /* renamed from: a */
                public final Context mo7343a(Context context) {
                    Context m59025c;
                    m59025c = BaseCoreActivity.C14444a.m59025c(context);
                    return m59025c;
                }
            });
        }
    }

    public BaseCoreActivity() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new C14444a());
        this.f63043b = lazy;
    }

    /* renamed from: A */
    public final void m59031A() {
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            Object systemService = getApplicationContext().getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            IBinder windowToken = currentFocus.getWindowToken();
            if (windowToken != null) {
                Intrinsics.checkNotNullExpressionValue(windowToken, "windowToken");
                inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
            }
        }
    }

    /* renamed from: B */
    public final void m59030B(boolean z) {
        if (z) {
            setTheme(C32184Cl4.DarkAppTheme_NoActionBar);
        } else {
            setTheme(C32184Cl4.DarkAppTheme);
        }
        getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() & (-8193));
        getWindow().setStatusBarColor(C49785uM4.m10399d(getResources(), C32364Df4.colorPrimaryDark, null));
    }

    /* renamed from: C */
    public final void m59029C(boolean z) {
        if (z) {
            setTheme(C32184Cl4.LightAppTheme_NoActionBar);
        } else {
            setTheme(C32184Cl4.LightAppTheme);
        }
        getWindow().getDecorView().setSystemUiVisibility(8192);
        getWindow().setStatusBarColor(C49785uM4.m10399d(getResources(), C32364Df4.birdWhite, null));
    }

    /* renamed from: D */
    public void mo58977D() {
        Drawable m41769m = C40788fB0.m41769m(this, C48193rg4.ic_close, C48183rf4.navigationColorControlNormal, C40788fB0.m41776f(this, C32364Df4.birdNewRoad), true);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70246A(m41769m);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public AbstractC10999c getDelegate() {
        return m59028v();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (!isFinishing()) {
            mo58957w().mo37136L1(this);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        m59031A();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo58957w().mo37136L1(this);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 16908332) {
            setResult(0);
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        mo58956x().m110489h(i, permissions, grantResults);
        List<Fragment> m67283z0 = getSupportFragmentManager().m67283z0();
        Intrinsics.checkNotNullExpressionValue(m67283z0, "supportFragmentManager.fragments");
        for (Fragment fragment : m67283z0) {
            if (fragment != null) {
                fragment.onRequestPermissionsResult(i, permissions, grantResults);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        mo58957w().mo37136L1(this);
    }

    /* renamed from: v */
    public final AbstractC10999c m59028v() {
        return (AbstractC10999c) this.f63043b.getValue();
    }

    /* renamed from: w */
    public abstract InterfaceC40099e13 mo58957w();

    /* renamed from: x */
    public abstract DQ3 mo58956x();

    /* renamed from: y */
    public abstract C36207Tq4 mo58955y();
}
