package co.bird.android.feature.flocktogether;

import android.os.Bundle;
import android.widget.Button;
import co.bird.android.core.mrp.BaseActivityLite;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0016R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/feature/flocktogether/FlockTogetherActivity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "LBu1;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LCu1;", TransferTable.COLUMN_STATE, "Q", "Lio/reactivex/Observable;", "l0", "LAu1;", "j", "LAu1;", "P", "()LAu1;", "setPresenter", "(LAu1;)V", "presenter", "LD3;", "k", "LD3;", "binding", "<init>", "()V", "co.bird.android.feature.flock-together"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFlockTogetherActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlockTogetherActivity.kt\nco/bird/android/feature/flocktogether/FlockTogetherActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,42:1\n1#2:43\n*E\n"})
/* loaded from: classes3.dex */
public final class FlockTogetherActivity extends BaseActivityLite implements InterfaceC32028Bu1 {

    /* renamed from: j */
    public C31794Au1 f64011j;

    /* renamed from: k */
    public C1337D3 f64012k;

    /* renamed from: P */
    public final C31794Au1 m58161P() {
        C31794Au1 c31794Au1 = this.f64011j;
        if (c31794Au1 != null) {
            return c31794Au1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: Q */
    public void render(InterfaceC32262Cu1 state) {
        Unit unit;
        Intrinsics.checkNotNullParameter(state, "state");
        if (!(state instanceof C51373x22) && (state instanceof C36339Uf1)) {
            String m81206a = ((C36339Uf1) state).m81206a();
            if (m81206a != null) {
                m58990F().error(m81206a);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                m58990F().errorGeneric();
            }
        }
    }

    @Override // p000.InterfaceC32028Bu1
    /* renamed from: l0 */
    public Observable<Unit> mo58159l0() {
        C1337D3 c1337d3 = this.f64012k;
        if (c1337d3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c1337d3 = null;
        }
        Button button = c1337d3.f5114b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.cta");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C14836a.m58158a().mo58154a(m58989H(), this).mo58155a(this);
        C1337D3 m111013c = C1337D3.m111013c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m111013c, "inflate(layoutInflater)");
        this.f64012k = m111013c;
        if (m111013c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m111013c = null;
        }
        setContentView(m111013c.getRoot());
        m58161P().consume(this);
    }
}
