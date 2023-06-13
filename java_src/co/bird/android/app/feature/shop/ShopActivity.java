package co.bird.android.app.feature.shop;

import android.content.Intent;
import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, m28432d2 = {"Lco/bird/android/app/feature/shop/ShopActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "LOz5;", "B", "LOz5;", "k0", "()LOz5;", "setUiFactory", "(LOz5;)V", "uiFactory", "LJz5;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LJz5;", "j0", "()LJz5;", "setPresenterFactory", "(LJz5;)V", "presenterFactory", "LHz5;", "D", "LHz5;", "presenter", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nShopActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShopActivity.kt\nco/bird/android/app/feature/shop/ShopActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,37:1\n44#2:38\n*S KotlinDebug\n*F\n+ 1 ShopActivity.kt\nco/bird/android/app/feature/shop/ShopActivity\n*L\n23#1:38\n*E\n"})
/* loaded from: classes2.dex */
public final class ShopActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC35119Oz5 f62835B;

    /* renamed from: C */
    public InterfaceC33949Jz5 f62836C;

    /* renamed from: D */
    public C33481Hz5 f62837D;

    public ShopActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC33949Jz5 m59339j0() {
        InterfaceC33949Jz5 interfaceC33949Jz5 = this.f62836C;
        if (interfaceC33949Jz5 != null) {
            return interfaceC33949Jz5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenterFactory");
        return null;
    }

    /* renamed from: k0 */
    public final InterfaceC35119Oz5 m59338k0() {
        InterfaceC35119Oz5 interfaceC35119Oz5 = this.f62835B;
        if (interfaceC35119Oz5 != null) {
            return interfaceC35119Oz5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("uiFactory");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C33481Hz5 c33481Hz5 = this.f62837D;
        if (c33481Hz5 != null) {
            c33481Hz5.m103117o(i, i2, intent);
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        H22.f12748a.mo24088J(this);
        setContentView(C39311cj4.activity_webview);
        InterfaceC33949Jz5 m59339j0 = m59339j0();
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        C33481Hz5 mo97998a = m59339j0.mo97998a(m45197b, this, m59338k0().mo89173a(this), mo58957w());
        mo97998a.m103114r();
        this.f62837D = mo97998a;
    }
}
