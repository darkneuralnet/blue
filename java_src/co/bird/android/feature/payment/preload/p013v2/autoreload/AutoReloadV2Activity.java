package co.bird.android.feature.payment.preload.p013v2.autoreload;

import android.os.Bundle;
import android.text.style.UnderlineSpan;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import co.bird.android.buava.Optional;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.api.response.ReloadOption;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.H31;
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b9\u0010:J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0007H\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0002J\b\u0010\u0013\u001a\u00020\u0005H\u0002J.\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001a\u001a\u00020\u0015H\u0002J\u0016\u0010\u001d\u001a\u00020\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017H\u0002R\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u0006;"}, m28432d2 = {"Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "LYs;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lio/reactivex/Observable;", "", "Y2", "J0", "Lco/bird/android/buava/Optional;", "LDs;", "E1", "O0", "LXs;", TransferTable.COLUMN_STATE, "U", "X", "P", "autoReloadToggled", "", "currency", "", "Lco/bird/api/response/ReloadOption;", "autoReloadOptions", "optionIdSelected", "Y", "disclaimers", "Q", "LGs;", "j", "LGs;", "R", "()LGs;", "setConverter", "(LGs;)V", "converter", "LUs;", "k", "LUs;", "S", "()LUs;", "setPresenter", "(LUs;)V", "presenter", "LU2;", "l", "LU2;", "binding", "LEs;", "m", "LEs;", "adapter", "n", "Z", "isLoading", "<init>", "()V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAutoReloadV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoReloadV2Activity.kt\nco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,125:1\n199#2:126\n1855#3,2:127\n*S KotlinDebug\n*F\n+ 1 AutoReloadV2Activity.kt\nco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity\n*L\n88#1:126\n115#1:127,2\n*E\n"})
/* renamed from: co.bird.android.feature.payment.preload.v2.autoreload.AutoReloadV2Activity */
/* loaded from: classes3.dex */
public final class AutoReloadV2Activity extends BaseActivityLite implements InterfaceC10042Ys {

    /* renamed from: j */
    public C2966Gs f64419j;

    /* renamed from: k */
    public C8473Us f64420k;

    /* renamed from: l */
    public C8176U2 f64421l;

    /* renamed from: m */
    public final C1999Es f64422m = new C1999Es();

    /* renamed from: n */
    public boolean f64423n;

    @Override // p000.InterfaceC10042Ys
    /* renamed from: E1 */
    public Observable<Optional<C1630Ds>> mo57773E1() {
        return this.f64422m.m108316w();
    }

    @Override // p000.InterfaceC10042Ys
    /* renamed from: J0 */
    public Observable<Unit> mo57772J0() {
        return this.f64422m.m108318J0();
    }

    @Override // p000.InterfaceC10042Ys
    /* renamed from: O0 */
    public Observable<Unit> mo57771O0() {
        C8176U2 c8176u2 = this.f64421l;
        if (c8176u2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c8176u2 = null;
        }
        TextView textView = c8176u2.f36740g;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.paymentTerms");
        return C44626lf5.clicksThrottle$default(textView, 0L, 1, null);
    }

    /* renamed from: P */
    public final void m57770P() {
        Object m33135e = H31.C3014a.birdDialog$default(m58990F(), C1219Cs.f4819d, false, false, 6, null).m33135e(AutoDispose.m45239a(this));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((SingleSubscribeProxy) m33135e).subscribe();
    }

    /* renamed from: Q */
    public final void m57769Q(List<String> list) {
        String string = getString(C45871nl4.subject_to_bird_payment_terms);
        Intrinsics.checkNotNullExpressionValue(string, "getString(L.string.subject_to_bird_payment_terms)");
        C8176U2 c8176u2 = null;
        if (list.isEmpty()) {
            C8176U2 c8176u22 = this.f64421l;
            if (c8176u22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c8176u2 = c8176u22;
            }
            c8176u2.f36740g.setText(C45097mS5.m25592n(string, string, new UnderlineSpan()));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        for (String str : list) {
            sb.append("\n");
            sb.append(str);
        }
        C8176U2 c8176u23 = this.f64421l;
        if (c8176u23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c8176u2 = c8176u23;
        }
        TextView textView = c8176u2.f36740g;
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "builder.toString()");
        textView.setText(C45097mS5.m25592n(sb2, string, new UnderlineSpan()));
    }

    /* renamed from: R */
    public final C2966Gs m57768R() {
        C2966Gs c2966Gs = this.f64419j;
        if (c2966Gs != null) {
            return c2966Gs;
        }
        Intrinsics.throwUninitializedPropertyAccessException("converter");
        return null;
    }

    /* renamed from: S */
    public final C8473Us m57767S() {
        C8473Us c8473Us = this.f64420k;
        if (c8473Us != null) {
            return c8473Us;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: U */
    public void render(InterfaceC9534Xs state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof C31578zs) {
            C31578zs c31578zs = (C31578zs) state;
            m57764Y(c31578zs.m215c(), c31578zs.m214d(), c31578zs.m216b(), c31578zs.m213e());
            this.f64423n = false;
            C8176U2 c8176u2 = this.f64421l;
            if (c8176u2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c8176u2 = null;
            }
            Group group = c8176u2.f36739f;
            Intrinsics.checkNotNullExpressionValue(group, "binding.loadingViews");
            C49520tu6.show$default(group, false, 0, 2, null);
        } else if (state instanceof C43446jg1) {
            m58990F().error(((C43446jg1) state).m30124b());
        } else if (state instanceof C48190rg1) {
            m58990F().error(((C48190rg1) state).m15584b());
        } else if (state instanceof C33190Gt2) {
            C33190Gt2 c33190Gt2 = (C33190Gt2) state;
            this.f64423n = c33190Gt2.m104614b();
            C8176U2 c8176u22 = this.f64421l;
            if (c8176u22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c8176u22 = null;
            }
            Group group2 = c8176u22.f36739f;
            Intrinsics.checkNotNullExpressionValue(group2, "binding.loadingViews");
            C49520tu6.show$default(group2, c33190Gt2.m104614b(), 0, 2, null);
        } else if (state instanceof W41) {
            m57770P();
        }
    }

    /* renamed from: X */
    public final void m57765X() {
        String string = getString(C45871nl4.subject_to_bird_payment_terms);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.subject_to_bird_payment_terms)");
        C8176U2 c8176u2 = this.f64421l;
        if (c8176u2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c8176u2 = null;
        }
        c8176u2.f36740g.setText(C45097mS5.m25592n(string, string, new UnderlineSpan()));
    }

    /* renamed from: Y */
    public final void m57764Y(boolean z, String str, List<ReloadOption> list, String str2) {
        Pair<List<C3023H6>, List<String>> m104655a = m57768R().m104655a(z, str, list, str2);
        this.f64422m.mo24871u(m104655a.component1());
        m57769Q(m104655a.component2());
    }

    @Override // p000.InterfaceC10042Ys
    /* renamed from: Y2 */
    public Observable<Boolean> mo57763Y2() {
        return this.f64422m.m108317v();
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo58977D();
        C39720dO0.m44334a().mo9390a(m58989H()).mo9393a(this);
        C8176U2 m82055c = C8176U2.m82055c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m82055c, "inflate(layoutInflater)");
        this.f64421l = m82055c;
        C8176U2 c8176u2 = null;
        if (m82055c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m82055c = null;
        }
        ConstraintLayout constraintLayout = m82055c.f36736c;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.footer");
        C49520tu6.m11239l(constraintLayout);
        C8176U2 c8176u22 = this.f64421l;
        if (c8176u22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c8176u22 = null;
        }
        setContentView(c8176u22.getRoot());
        C8176U2 c8176u23 = this.f64421l;
        if (c8176u23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c8176u2 = c8176u23;
        }
        c8176u2.f36741h.setAdapter(this.f64422m);
        m57765X();
        m57767S().consume(this);
    }
}
