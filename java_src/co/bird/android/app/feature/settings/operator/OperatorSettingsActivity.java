package co.bird.android.app.feature.settings.operator;

import android.app.Application;
import android.os.Bundle;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.app.feature.settings.operator.InterfaceC14309b;
import co.bird.android.core.mrp.BaseActivityLite;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b!\u0010\"J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0012\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, m28432d2 = {"Lco/bird/android/app/feature/settings/operator/OperatorSettingsActivity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "Lwt3;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lio/reactivex/Observable;", "LRa6;", "I0", "Lxt3;", TransferTable.COLUMN_STATE, "R", "Lvt3;", "j", "Lvt3;", "Q", "()Lvt3;", "setPresenter", "(Lvt3;)V", "presenter", "Lpt3;", "k", "Lpt3;", "P", "()Lpt3;", "setConverter", "(Lpt3;)V", "converter", "Lot3;", "l", "Lot3;", "adapter", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorSettingsActivity.kt\nco/bird/android/app/feature/settings/operator/OperatorSettingsActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
/* loaded from: classes2.dex */
public final class OperatorSettingsActivity extends BaseActivityLite implements InterfaceC51285wt3 {

    /* renamed from: j */
    public C50692vt3 f62751j;

    /* renamed from: k */
    public C47136pt3 f62752k;

    /* renamed from: l */
    public final C46543ot3 f62753l = new C46543ot3();

    @Override // p000.InterfaceC51285wt3
    /* renamed from: I0 */
    public Observable<C35597Ra6<?>> mo6186I0() {
        return this.f62753l.m20362I0();
    }

    /* renamed from: P */
    public final C47136pt3 m59392P() {
        C47136pt3 c47136pt3 = this.f62752k;
        if (c47136pt3 != null) {
            return c47136pt3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("converter");
        return null;
    }

    /* renamed from: Q */
    public final C50692vt3 m59391Q() {
        C50692vt3 c50692vt3 = this.f62751j;
        if (c50692vt3 != null) {
            return c50692vt3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: R */
    public void render(AbstractC51878xt3 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof C47521qY3) {
            this.f62753l.mo24871u(m59392P().m18564a(((C47521qY3) state).m17462b()));
        }
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0012A4 m116156c = C0012A4.m116156c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m116156c, "inflate(layoutInflater)");
        setContentView(m116156c.getRoot());
        InterfaceC14309b.InterfaceC14310a m59389a = C14306a.m59389a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        m59389a.mo59384a(c46172oG2.m21419a(application)).mo59385a(this);
        m59391Q().consume(this);
        RecyclerView recyclerView = m116156c.f75b;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new C11894g());
        recyclerView.setAdapter(this.f62753l);
    }
}
