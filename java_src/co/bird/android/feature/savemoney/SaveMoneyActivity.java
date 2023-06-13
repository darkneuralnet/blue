package co.bird.android.feature.savemoney;

import android.os.Bundle;
import co.bird.android.core.mrp.BaseActivityLite;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.model.Stripe3ds2AuthParams;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b%\u0010&J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006'"}, m28432d2 = {"Lco/bird/android/feature/savemoney/SaveMoneyActivity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "LAi5;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LDi5;", TransferTable.COLUMN_STATE, "R", "Lio/reactivex/Observable;", "Lhi5;", "R5", "LT5;", "j", "LT5;", "P", "()LT5;", "S", "(LT5;)V", "binding", "Lei5;", "k", "Lei5;", "adapter", "Lii5;", "l", "Lii5;", "converter", "Lzi5;", "m", "Lzi5;", "Q", "()Lzi5;", "setPresenter", "(Lzi5;)V", "presenter", "<init>", "()V", "save-money_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class SaveMoneyActivity extends BaseActivityLite implements InterfaceC31690Ai5 {

    /* renamed from: j */
    public C7646T5 f65188j;

    /* renamed from: k */
    public final C40505ei5 f65189k = new C40505ei5();

    /* renamed from: l */
    public final C42877ii5 f65190l = new C42877ii5();

    /* renamed from: m */
    public C52956zi5 f65191m;

    /* renamed from: P */
    public final C7646T5 m56995P() {
        C7646T5 c7646t5 = this.f65188j;
        if (c7646t5 != null) {
            return c7646t5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    /* renamed from: Q */
    public final C52956zi5 m56994Q() {
        C52956zi5 c52956zi5 = this.f65191m;
        if (c52956zi5 != null) {
            return c52956zi5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: R */
    public void render(InterfaceC32392Di5 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof C49967ug0) {
            this.f65189k.mo24871u(this.f65190l.m33537a(((C49967ug0) state).m9894b()));
        }
    }

    @Override // p000.InterfaceC31690Ai5
    /* renamed from: R5 */
    public Observable<EnumC42284hi5> mo56992R5() {
        return this.f65189k.m42605v();
    }

    /* renamed from: S */
    public final void m56991S(C7646T5 c7646t5) {
        Intrinsics.checkNotNullParameter(c7646t5, "<set-?>");
        this.f65188j = c7646t5;
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        C15515a.m56990a().mo56986a(m58989H()).mo56987a(this);
        C7646T5 m84368c = C7646T5.m84368c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m84368c, "inflate(layoutInflater)");
        m56991S(m84368c);
        m56995P().f34735b.setAdapter(this.f65189k);
        setContentView(m56995P().getRoot());
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            str = extras.getString(Stripe3ds2AuthParams.FIELD_SOURCE);
        } else {
            str = null;
        }
        m56994Q().m507K(str);
        m56994Q().consume(this);
    }
}
