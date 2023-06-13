package co.bird.android.feature.birdplus.p011v1.list;

import android.os.Bundle;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.model.persistence.BirdPlusView;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b!\u0010\"J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, m28432d2 = {"Lco/bird/android/feature/birdplus/v1/list/BirdPlusLandingActivity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "LGQ;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LIQ;", TransferTable.COLUMN_STATE, "Q", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/BirdPlusView;", "g4", "LFQ;", "j", "LFQ;", "P", "()LFQ;", "setPresenter", "(LFQ;)V", "presenter", "Lb3;", "k", "Lb3;", "binding", "LtP;", "l", "LtP;", "converter", "LaP;", "m", "LaP;", "adapter", "<init>", "()V", "bird-plus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdPlusLandingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPlusLandingActivity.kt\nco/bird/android/feature/birdplus/v1/list/BirdPlusLandingActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n1#2:64\n*E\n"})
/* renamed from: co.bird.android.feature.birdplus.v1.list.BirdPlusLandingActivity */
/* loaded from: classes3.dex */
public final class BirdPlusLandingActivity extends BaseActivityLite implements InterfaceC2846GQ {

    /* renamed from: j */
    public C2265FQ f63365j;

    /* renamed from: k */
    public C12279b3 f63366k;

    /* renamed from: l */
    public final C28697tP f63367l = new C28697tP(this);

    /* renamed from: m */
    public final C10669aP f63368m = new C10669aP();

    /* renamed from: P */
    public final C2265FQ m58684P() {
        C2265FQ c2265fq = this.f63365j;
        if (c2265fq != null) {
            return c2265fq;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: Q */
    public void render(InterfaceC3530IQ state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof C40701f22) {
            C12279b3 c12279b3 = this.f63366k;
            if (c12279b3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c12279b3 = null;
            }
            LinearProgressIndicator linearProgressIndicator = c12279b3.f56824b;
            Intrinsics.checkNotNullExpressionValue(linearProgressIndicator, "binding.progressBar");
            C49520tu6.show$default(linearProgressIndicator, false, 0, 2, null);
        } else if (state instanceof C34126Kt2) {
            C12279b3 c12279b32 = this.f63366k;
            if (c12279b32 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c12279b32 = null;
            }
            LinearProgressIndicator linearProgressIndicator2 = c12279b32.f56824b;
            Intrinsics.checkNotNullExpressionValue(linearProgressIndicator2, "binding.progressBar");
            C49520tu6.show$default(linearProgressIndicator2, true, 0, 2, null);
        } else if (state instanceof C38087af6) {
            C12279b3 c12279b33 = this.f63366k;
            if (c12279b33 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c12279b33 = null;
            }
            LinearProgressIndicator linearProgressIndicator3 = c12279b33.f56824b;
            Intrinsics.checkNotNullExpressionValue(linearProgressIndicator3, "binding.progressBar");
            C49520tu6.show$default(linearProgressIndicator3, false, 0, 2, null);
            this.f63368m.mo24871u(this.f63367l.m12414a(((C38087af6) state).m70904b()));
        }
    }

    @Override // p000.InterfaceC2846GQ
    /* renamed from: g4 */
    public Observable<BirdPlusView> mo58682g4() {
        return this.f63368m.m71484g4();
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C12279b3 m65063c = C12279b3.m65063c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m65063c, "inflate(layoutInflater)");
        this.f63366k = m65063c;
        C12279b3 c12279b3 = null;
        if (m65063c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m65063c = null;
        }
        setContentView(m65063c.getRoot());
        C38453bH0.m64729a().mo14236a(m58989H()).mo14237c(this);
        C12279b3 c12279b32 = this.f63366k;
        if (c12279b32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c12279b32 = null;
        }
        c12279b32.f56825c.setLayoutManager(new LinearLayoutManager(this));
        C12279b3 c12279b33 = this.f63366k;
        if (c12279b33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c12279b33 = null;
        }
        c12279b33.f56825c.setAdapter(this.f63368m);
        C12279b3 c12279b34 = this.f63366k;
        if (c12279b34 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c12279b3 = c12279b34;
        }
        c12279b3.f56825c.setItemAnimator(new C11894g());
        m58684P().consume(this);
    }
}
