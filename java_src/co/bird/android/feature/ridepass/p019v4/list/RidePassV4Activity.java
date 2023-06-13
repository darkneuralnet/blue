package co.bird.android.feature.ridepass.p019v4.list;

import android.os.Bundle;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.model.persistence.RidePassView;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b!\u0010\"J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, m28432d2 = {"Lco/bird/android/feature/ridepass/v4/list/RidePassV4Activity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "LyX4;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LzX4;", TransferTable.COLUMN_STATE, "Q", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/RidePassView;", "z8", "LxX4;", "j", "LxX4;", "P", "()LxX4;", "setPresenter", "(LxX4;)V", "presenter", "LM5;", "k", "LM5;", "binding", "LCW4;", "l", "LCW4;", "converter", "LAW4;", "m", "LAW4;", "adapter", "<init>", "()V", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRidePassV4Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassV4Activity.kt\nco/bird/android/feature/ridepass/v4/list/RidePassV4Activity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1#2:57\n*E\n"})
/* renamed from: co.bird.android.feature.ridepass.v4.list.RidePassV4Activity */
/* loaded from: classes3.dex */
public final class RidePassV4Activity extends BaseActivityLite implements InterfaceC52255yX4 {

    /* renamed from: j */
    public C51662xX4 f64864j;

    /* renamed from: k */
    public C5191M5 f64865k;

    /* renamed from: l */
    public final CW4 f64866l = new CW4(this);

    /* renamed from: m */
    public final AW4 f64867m = new AW4();

    /* renamed from: P */
    public final C51662xX4 m57371P() {
        C51662xX4 c51662xX4 = this.f64864j;
        if (c51662xX4 != null) {
            return c51662xX4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: Q */
    public void render(InterfaceC52848zX4 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof C36335Ue6) {
            this.f64867m.mo24871u(this.f64866l.m112180b(((C36335Ue6) state).m81213b()));
        }
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C5191M5 m95837c = C5191M5.m95837c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m95837c, "inflate(layoutInflater)");
        this.f64865k = m95837c;
        C5191M5 c5191m5 = null;
        if (m95837c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m95837c = null;
        }
        setContentView(m95837c.getRoot());
        DP0.m110542a().mo110541a(m58989H()).mo110539b(this);
        C5191M5 c5191m52 = this.f64865k;
        if (c5191m52 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5191m52 = null;
        }
        c5191m52.getRoot().setLayoutManager(new LinearLayoutManager(this));
        C5191M5 c5191m53 = this.f64865k;
        if (c5191m53 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5191m53 = null;
        }
        c5191m53.getRoot().setAdapter(this.f64867m);
        C5191M5 c5191m54 = this.f64865k;
        if (c5191m54 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c5191m5 = c5191m54;
        }
        c5191m5.getRoot().setItemAnimator(new C11894g());
        m57371P().consume(this);
        String stringExtra = getIntent().getStringExtra("ride_pass_link_code");
        if (stringExtra != null) {
            mo58957w().mo37002j1(stringExtra);
        }
    }

    @Override // p000.InterfaceC52255yX4
    /* renamed from: z8 */
    public Observable<RidePassView> mo3347z8() {
        return this.f64867m.m115687z8();
    }
}
