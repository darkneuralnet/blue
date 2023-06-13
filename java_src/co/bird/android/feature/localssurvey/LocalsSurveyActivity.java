package co.bird.android.feature.localssurvey;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.feature.localssurvey.InterfaceC14942b;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.google.android.libraries.places.api.model.AddressComponent;
import com.google.android.libraries.places.widget.AutocompleteSupportFragment;
import io.reactivex.Observable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b$\u0010%J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016R\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R!\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u001b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR!\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u001b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001f¨\u0006&"}, m28432d2 = {"Lco/bird/android/feature/localssurvey/LocalsSurveyActivity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "LSv2;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onBackPressed", "LTv2;", TransferTable.COLUMN_STATE, "Q", "LRv2;", "j", "LRv2;", "P", "()LRv2;", "setPresenter", "(LRv2;)V", "presenter", "Li4;", "k", "Li4;", "binding", "Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;", "l", "Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;", "autocompleteSupportFragment", "Lio/reactivex/Observable;", "m", "Lkotlin/Lazy;", "w8", "()Lio/reactivex/Observable;", "nextClicks", "n", "L", "skipClicks", "<init>", "()V", "locals-survey_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLocalsSurveyActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalsSurveyActivity.kt\nco/bird/android/feature/localssurvey/LocalsSurveyActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
/* loaded from: classes3.dex */
public final class LocalsSurveyActivity extends BaseActivityLite implements InterfaceC36016Sv2 {

    /* renamed from: j */
    public C35782Rv2 f64137j;

    /* renamed from: k */
    public C23121i4 f64138k;

    /* renamed from: l */
    public AutocompleteSupportFragment f64139l;

    /* renamed from: m */
    public final Lazy f64140m;

    /* renamed from: n */
    public final Lazy f64141n;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lio/reactivex/Observable;", "", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.localssurvey.LocalsSurveyActivity$a */
    /* loaded from: classes3.dex */
    public static final class C14937a extends Lambda implements Function0<Observable<Unit>> {
        public C14937a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Unit> invoke() {
            C23121i4 c23121i4 = LocalsSurveyActivity.this.f64138k;
            if (c23121i4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c23121i4 = null;
            }
            Button button = c23121i4.f86684c;
            Intrinsics.checkNotNullExpressionValue(button, "binding.next");
            return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lio/reactivex/Observable;", "", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.localssurvey.LocalsSurveyActivity$b */
    /* loaded from: classes3.dex */
    public static final class C14938b extends Lambda implements Function0<Observable<Unit>> {
        public C14938b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Unit> invoke() {
            C23121i4 c23121i4 = LocalsSurveyActivity.this.f64138k;
            if (c23121i4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c23121i4 = null;
            }
            Button button = c23121i4.f86685d;
            Intrinsics.checkNotNullExpressionValue(button, "binding.skip");
            return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
        }
    }

    public LocalsSurveyActivity() {
        Lazy lazy;
        Lazy lazy2;
        lazy = LazyKt__LazyJVMKt.lazy(new C14937a());
        this.f64140m = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C14938b());
        this.f64141n = lazy2;
    }

    @Override // p000.InterfaceC36016Sv2
    /* renamed from: L */
    public Observable<Unit> mo58004L() {
        return (Observable) this.f64141n.getValue();
    }

    /* renamed from: P */
    public final C35782Rv2 m58003P() {
        C35782Rv2 c35782Rv2 = this.f64137j;
        if (c35782Rv2 != null) {
            return c35782Rv2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: Q */
    public void render(AbstractC36250Tv2 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof WT3) {
            m58990F().hideKeyboard();
            String statusMessage = ((WT3) state).m78341b().getStatusMessage();
            if (statusMessage != null) {
                m58990F().snackToast(statusMessage);
                return;
            }
            return;
        }
        AutocompleteSupportFragment autocompleteSupportFragment = null;
        String str = null;
        if (state instanceof NU3) {
            m58990F().hideKeyboard();
            C23121i4 c23121i4 = this.f64138k;
            if (c23121i4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c23121i4 = null;
            }
            c23121i4.f86684c.setEnabled(true);
            AutocompleteSupportFragment autocompleteSupportFragment2 = this.f64139l;
            if (autocompleteSupportFragment2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("autocompleteSupportFragment");
                autocompleteSupportFragment2 = null;
            }
            AddressComponent m96427b = C34260Li1.m96427b(((NU3) state).m93856b());
            if (m96427b != null) {
                str = m96427b.getName();
            }
            autocompleteSupportFragment2.setText(str);
        } else if (state instanceof MU3) {
            m58990F().error(C45871nl4.please_enter_a_valid_postal_code);
            AutocompleteSupportFragment autocompleteSupportFragment3 = this.f64139l;
            if (autocompleteSupportFragment3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("autocompleteSupportFragment");
            } else {
                autocompleteSupportFragment = autocompleteSupportFragment3;
            }
            View requireView = autocompleteSupportFragment.requireView();
            requireView.setFocusableInTouchMode(true);
            requireView.requestFocus();
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m58003P().m42280h(C13361c0.f59868a);
        super.onBackPressed();
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C23121i4 m34506c = C23121i4.m34506c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m34506c, "inflate(layoutInflater)");
        this.f64138k = m34506c;
        AutocompleteSupportFragment autocompleteSupportFragment = null;
        if (m34506c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m34506c = null;
        }
        setContentView(m34506c.getRoot());
        Fragment m67325l0 = getSupportFragmentManager().m67325l0(C51759xh4.autocomplete_fragment);
        Intrinsics.checkNotNull(m67325l0, "null cannot be cast to non-null type com.google.android.libraries.places.widget.AutocompleteSupportFragment");
        this.f64139l = (AutocompleteSupportFragment) m67325l0;
        InterfaceC14942b.InterfaceC14943a m57998a = C14939a.m57998a();
        InterfaceC44393lG2 m58989H = m58989H();
        AutocompleteSupportFragment autocompleteSupportFragment2 = this.f64139l;
        if (autocompleteSupportFragment2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("autocompleteSupportFragment");
        } else {
            autocompleteSupportFragment = autocompleteSupportFragment2;
        }
        m57998a.mo57994a(m58989H, autocompleteSupportFragment).mo57995a(this);
        m58003P().consume(this);
        C35782Rv2 m58003P = m58003P();
        String string = getString(C45871nl4.enter_your_postal_code);
        Intrinsics.checkNotNullExpressionValue(string, "getString(L.string.enter_your_postal_code)");
        m58003P.m42280h(new C52175yO5(string));
    }

    @Override // p000.InterfaceC36016Sv2
    /* renamed from: w8 */
    public Observable<Unit> mo58001w8() {
        return (Observable) this.f64140m.getValue();
    }
}
