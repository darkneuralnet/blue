package co.bird.android.app.feature.physicallock;

import android.content.Intent;
import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\f\u001a\u00020\u0004H\u0016R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/ReplacePhysicalLockActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "onBackPressed", "LJy4;", "B", "LJy4;", "j0", "()LJy4;", "setRepairClient", "(LJy4;)V", "repairClient", "LnG4;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LnG4;", "presenter", "<init>", "()V", "D", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ReplacePhysicalLockActivity extends BaseActivity {

    /* renamed from: D */
    public static final C14008a f61976D = new C14008a(null);

    /* renamed from: E */
    public static final int f61977E = 8;

    /* renamed from: B */
    public InterfaceC33939Jy4 f61978B;

    /* renamed from: C */
    public InterfaceC45581nG4 f61979C;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/ReplacePhysicalLockActivity$a;", "", "", "REQUEST_CODE", "I", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.ReplacePhysicalLockActivity$a */
    /* loaded from: classes2.dex */
    public static final class C14008a {
        public /* synthetic */ C14008a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C14008a() {
        }
    }

    public ReplacePhysicalLockActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC33939Jy4 m60180j0() {
        InterfaceC33939Jy4 interfaceC33939Jy4 = this.f61978B;
        if (interfaceC33939Jy4 != null) {
            return interfaceC33939Jy4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("repairClient");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent != null) {
            InterfaceC45581nG4 interfaceC45581nG4 = this.f61979C;
            if (interfaceC45581nG4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
                interfaceC45581nG4 = null;
            }
            interfaceC45581nG4.onActivityResult(i, i2, intent);
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        InterfaceC45581nG4 interfaceC45581nG4 = this.f61979C;
        if (interfaceC45581nG4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            interfaceC45581nG4 = null;
        }
        interfaceC45581nG4.onBackPressed();
        super.onBackPressed();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C26358n5 m24486c = C26358n5.m24486c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m24486c, "inflate(layoutInflater)");
        setContentView(m24486c.getRoot());
        H22.f12748a.mo24039o0(this);
        C51509xG4 c51509xG4 = new C51509xG4(m58963Z(), mo58957w(), new BG4(this, m24486c), m60180j0());
        this.f61979C = c51509xG4;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        c51509xG4.mo5601b(intent);
    }
}
