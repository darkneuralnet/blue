package co.bird.android.feature.transferorder.sku.vehicles;

import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.model.wire.WireSkuOrder;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b2\u00103J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\"\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\"\u0010/\u001a\u0010\u0012\f\u0012\n ,*\u0004\u0018\u00010\u00110\u00110+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\"\u00101\u001a\u0010\u0012\f\u0012\n ,*\u0004\u0018\u00010\u00050\u00050+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010.¨\u00064"}, m28432d2 = {"Lco/bird/android/feature/transferorder/sku/vehicles/SkuOrderVehiclesActivity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "LNC5;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "LOC5;", TransferTable.COLUMN_STATE, "R", "Lio/reactivex/Observable;", "", "Q4", "LMC5;", "j", "LMC5;", "Q", "()LMC5;", "setPresenter", "(LMC5;)V", "presenter", "LGC5;", "k", "LGC5;", "P", "()LGC5;", "setConverter", "(LGC5;)V", "converter", "LW5;", "l", "LW5;", "binding", "LFC5;", "m", "LFC5;", "adapter", "Lma4;", "kotlin.jvm.PlatformType", "n", "Lma4;", "skuOrderRelay", "o", "processContainerOrderSuccessRelay", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSkuOrderVehiclesActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkuOrderVehiclesActivity.kt\nco/bird/android/feature/transferorder/sku/vehicles/SkuOrderVehiclesActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n1#2:85\n*E\n"})
/* loaded from: classes3.dex */
public final class SkuOrderVehiclesActivity extends BaseActivityLite implements NC5 {

    /* renamed from: j */
    public MC5 f65835j;

    /* renamed from: k */
    public GC5 f65836k;

    /* renamed from: l */
    public C8932W5 f65837l;

    /* renamed from: m */
    public final FC5 f65838m = new FC5();

    /* renamed from: n */
    public final C45168ma4<String> f65839n;

    /* renamed from: o */
    public final C45168ma4<Unit> f65840o;

    public SkuOrderVehiclesActivity() {
        C45168ma4<String> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<String>()");
        this.f65839n = m25409g;
        C45168ma4<Unit> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<Unit>()");
        this.f65840o = m25409g2;
    }

    /* renamed from: P */
    public final GC5 m56362P() {
        GC5 gc5 = this.f65836k;
        if (gc5 != null) {
            return gc5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("converter");
        return null;
    }

    /* renamed from: Q */
    public final MC5 m56361Q() {
        MC5 mc5 = this.f65835j;
        if (mc5 != null) {
            return mc5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.NC5
    /* renamed from: Q4 */
    public Observable<String> mo56360Q4() {
        Observable<String> hide = this.f65839n.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "skuOrderRelay.hide()");
        return hide;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: R */
    public void render(OC5 state) {
        Throwable error;
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof C37505Ze6) {
            WireSkuOrder mo72802a = state.mo72802a();
            if (mo72802a != null) {
                this.f65838m.mo24871u(m56362P().m105648a(mo72802a, state.mo72801b()));
            }
        } else if ((state instanceof C35871Sf1) && (error = state.getError()) != null) {
            C38689bg5.m64178c(m58990F(), error);
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10060 && i2 == -1) {
            this.f65840o.accept(Unit.INSTANCE);
        }
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8932W5 m78855c = C8932W5.m78855c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m78855c, "inflate(layoutInflater)");
        this.f65837l = m78855c;
        C8932W5 c8932w5 = null;
        if (m78855c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m78855c = null;
        }
        setContentView(m78855c.getRoot());
        C15865a.m56358a().mo56353a(m58989H()).mo56354a(this);
        C8932W5 c8932w52 = this.f65837l;
        if (c8932w52 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c8932w5 = c8932w52;
        }
        RecyclerView root = c8932w5.getRoot();
        root.setLayoutManager(new LinearLayoutManager(this));
        root.setItemAnimator(new C11894g());
        root.setAdapter(this.f65838m);
        m56361Q().consume(this);
        String stringExtra = getIntent().getStringExtra("sku_order_id");
        if (stringExtra != null) {
            this.f65839n.accept(stringExtra);
        }
    }
}
