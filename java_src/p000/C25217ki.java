package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AbstractC10999c;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.C10990a;
import androidx.appcompat.widget.Toolbar;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC2614G2;
@Metadata(m28433d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010A\u001a\u00020\u0001\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010B¢\u0006\u0004\bE\u0010FJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0012\u0010\u000f\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u0010\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0014\u001a\u00020\tH\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016J\b\u0010\u0016\u001a\u00020\tH\u0016J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J%\u0010\u001d\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u001b*\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0017H\u0016J\u001c\u0010$\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u001a2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016J\u001c\u0010%\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u001a2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u0010&\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010)\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016J\b\u0010*\u001a\u00020\tH\u0016J\b\u0010+\u001a\u00020\tH\u0016J\n\u0010-\u001a\u0004\u0018\u00010,H\u0016J\u0010\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020\u0017H\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u0001032\u0006\u00102\u001a\u000201H\u0016J\b\u00104\u001a\u00020\tH\u0016J,\u0010:\u001a\u0004\u0018\u00010\u001a2\b\u00105\u001a\u0004\u0018\u00010\u001a2\u0006\u00107\u001a\u0002062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00109\u001a\u000208H\u0016J\u0012\u0010<\u001a\u00020\t2\b\u0010;\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010=\u001a\u00020/H\u0016J\b\u0010>\u001a\u00020\u0017H\u0016R\u0014\u0010A\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010D\u001a\u0004\u0018\u00010B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010C¨\u0006G"}, m28432d2 = {"Lki;", "Landroidx/appcompat/app/c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "V", "Landroidx/appcompat/app/ActionBar;", "v", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "", "Q", "Landroid/view/MenuInflater;", "t", "Landroid/os/Bundle;", "savedInstanceState", "B", "D", "Landroid/content/res/Configuration;", "newConfig", "A", "G", "H", "E", "", "themeResId", "R", "Landroid/view/View;", "T", "id", "m", "(I)Landroid/view/View;", "M", "resId", "L", "Landroid/view/ViewGroup$LayoutParams;", "lp", "N", "e", "i", "", "title", "S", "x", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Landroidx/appcompat/app/a$b;", "q", "featureId", "", "K", "LG2$a;", "callback", "LG2;", "w", "parent", "", "name", "Landroid/util/AttributeSet;", "attrs", "l", "outState", "F", "f", "r", "k", "Landroidx/appcompat/app/c;", "baseDelegate", "LYG6;", "LYG6;", "wrapContext", "<init>", "(Landroidx/appcompat/app/c;LYG6;)V", "viewpump_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: ki */
/* loaded from: classes.dex */
public class C25217ki extends AbstractC10999c {

    /* renamed from: k */
    public final AbstractC10999c f94804k;

    /* renamed from: l */
    public final YG6 f94805l;

    @JvmOverloads
    public C25217ki(AbstractC10999c baseDelegate, YG6 yg6) {
        Intrinsics.checkNotNullParameter(baseDelegate, "baseDelegate");
        this.f94804k = baseDelegate;
        this.f94805l = yg6;
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: A */
    public void mo28615A(Configuration configuration) {
        this.f94804k.mo28615A(configuration);
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: B */
    public void mo28614B(Bundle bundle) {
        this.f94804k.mo28614B(bundle);
        AbstractC10999c.m70282I(this.f94804k);
        AbstractC10999c.m70276d(this);
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: C */
    public void mo28613C() {
        this.f94804k.mo28613C();
        AbstractC10999c.m70282I(this);
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: D */
    public void mo28612D(Bundle bundle) {
        this.f94804k.mo28612D(bundle);
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: E */
    public void mo28611E() {
        this.f94804k.mo28611E();
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: F */
    public void mo28610F(Bundle bundle) {
        this.f94804k.mo28610F(bundle);
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: G */
    public void mo28609G() {
        this.f94804k.mo28609G();
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: H */
    public void mo28608H() {
        this.f94804k.mo28608H();
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: K */
    public boolean mo28607K(int i) {
        return this.f94804k.mo28607K(i);
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: L */
    public void mo28606L(int i) {
        this.f94804k.mo28606L(i);
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: M */
    public void mo28605M(View view) {
        this.f94804k.mo28605M(view);
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: N */
    public void mo28604N(View view, ViewGroup.LayoutParams layoutParams) {
        this.f94804k.mo28604N(view, layoutParams);
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: Q */
    public void mo28603Q(Toolbar toolbar) {
        this.f94804k.mo28603Q(toolbar);
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: R */
    public void mo28602R(int i) {
        this.f94804k.mo28602R(i);
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: S */
    public void mo28601S(CharSequence charSequence) {
        this.f94804k.mo28601S(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: T */
    public AbstractC2614G2 mo28600T(AbstractC2614G2.InterfaceC2615a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return this.f94804k.mo28600T(callback);
    }

    /* renamed from: V */
    public final Context m28599V(Context context) {
        Context mo7343a;
        YG6 yg6 = this.f94805l;
        return (yg6 == null || (mo7343a = yg6.mo7343a(context)) == null) ? context : mo7343a;
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: e */
    public void mo28598e(View view, ViewGroup.LayoutParams layoutParams) {
        this.f94804k.mo28598e(view, layoutParams);
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: f */
    public boolean mo28597f() {
        return this.f94804k.mo28597f();
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: i */
    public Context mo28596i(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context mo28596i = this.f94804k.mo28596i(super.mo28596i(context));
        Intrinsics.checkNotNullExpressionValue(mo28596i, "baseDelegate.attachBaseC…achBaseContext2(context))");
        return m28599V(mo28596i);
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: l */
    public View mo28595l(View view, String name, Context context, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        return this.f94804k.mo28595l(view, name, context, attrs);
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: m */
    public <T extends View> T mo28594m(int i) {
        return (T) this.f94804k.mo28594m(i);
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: q */
    public C10990a.InterfaceC10992b mo28593q() {
        return this.f94804k.mo28593q();
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: r */
    public int mo28592r() {
        return this.f94804k.mo28592r();
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: t */
    public MenuInflater mo28591t() {
        MenuInflater mo28591t = this.f94804k.mo28591t();
        Intrinsics.checkNotNullExpressionValue(mo28591t, "baseDelegate.menuInflater");
        return mo28591t;
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: v */
    public ActionBar mo28590v() {
        return this.f94804k.mo28590v();
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: w */
    public void mo28589w() {
        this.f94804k.mo28589w();
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: x */
    public void mo28588x() {
        this.f94804k.mo28588x();
    }
}
