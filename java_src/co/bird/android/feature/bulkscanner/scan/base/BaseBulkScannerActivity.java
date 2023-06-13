package co.bird.android.feature.bulkscanner.scan.base;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.BulkScanPurpose;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b*\u0010+J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0014J\b\u0010\u0012\u001a\u00020\u0006H\u0014J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\"\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014R\"\u0010!\u001a\u00020\u001a8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010)\u001a\u00020$8&@&X¦\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006,"}, m28432d2 = {"Lco/bird/android/feature/bulkscanner/scan/base/BaseBulkScannerActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Lco/bird/android/model/constant/BulkScanPurpose;", "purpose", "", "enablePeripheralKeyboardSupport", "", "j0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/Menu;", "menu", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "onResume", "onPause", "onBackPressed", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "Lv4;", "B", "Lv4;", "k0", "()Lv4;", "n0", "(Lv4;)V", "binding", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Z", "Lm40;", "m0", "()Lm40;", "setPresenter", "(Lm40;)V", "presenter", "<init>", "()V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseBulkScannerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseBulkScannerActivity.kt\nco/bird/android/feature/bulkscanner/scan/base/BaseBulkScannerActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
/* loaded from: classes3.dex */
public abstract class BaseBulkScannerActivity extends BaseActivity {

    /* renamed from: B */
    public C29406v4 f63464B;

    /* renamed from: C */
    public boolean f63465C;

    public BaseBulkScannerActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public abstract void mo58564j0(BulkScanPurpose bulkScanPurpose, boolean z);

    /* renamed from: k0 */
    public final C29406v4 m58614k0() {
        C29406v4 c29406v4 = this.f63464B;
        if (c29406v4 != null) {
            return c29406v4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    /* renamed from: m0 */
    public abstract InterfaceC44870m40 mo58563m0();

    /* renamed from: n0 */
    public final void m58613n0(C29406v4 c29406v4) {
        Intrinsics.checkNotNullParameter(c29406v4, "<set-?>");
        this.f63464B = c29406v4;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        mo58563m0().onActivityResult(i, i2, intent);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        mo58563m0().onBackPressed();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C29406v4 m9229c = C29406v4.m9229c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m9229c, "inflate(layoutInflater)");
        m58613n0(m9229c);
        setContentView(m58614k0().f113480s);
        mo58977D();
        String stringExtra = getIntent().getStringExtra("bulk_purpose");
        Intrinsics.checkNotNull(stringExtra);
        BulkScanPurpose valueOf = BulkScanPurpose.valueOf(stringExtra);
        boolean z = true;
        z = (getResources().getConfiguration().keyboard == 1 || !mo58955y().m82623f8().getValue().getOperatorConfig().getEnablePeripheralKeyboardSupport()) ? false : false;
        this.f63465C = z;
        mo58564j0(valueOf, z);
        mo58563m0().mo35633a();
        if (this.f63465C) {
            mo58563m0().mo26395t8();
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (this.f63465C) {
            getMenuInflater().inflate(C33111Gk4.menu_qr_code, menu);
            MenuItem findItem = menu.findItem(C52955zi4.qrCode);
            Drawable icon = findItem.getIcon();
            if (icon != null) {
                drawable = P61.m90834r(icon);
            } else {
                drawable = null;
            }
            if (drawable != null) {
                P61.m90838n(drawable, -1);
            }
            findItem.setIcon(drawable);
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        int itemId = item.getItemId();
        if (itemId == 16908332) {
            mo58563m0().onBackPressed();
            return true;
        } else if (itemId == C52955zi4.qrCode) {
            mo58563m0().mo26396q();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        mo58563m0().onPause();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        mo58563m0().onResume();
    }
}
