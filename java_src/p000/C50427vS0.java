package p000;

import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.imageupload.ImageUploadBar;
import co.bird.android.widget.IssueFlowLayout;
import co.bird.android.widget.IssueView;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
@Metadata(m28433d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u00108\u001a\u000207\u0012\b\b\u0002\u00109\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b:\u0010;J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001c\u0010\f\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0003H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\nH\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0002R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010$R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u00102\u001a\n 0*\u0004\u0018\u00010/0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00101R.\u00106\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000f 0*\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\u000e038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u0006<"}, m28432d2 = {"LvS0;", "LxE;", "LtS0;", "Lio/reactivex/Observable;", "", "c", "", "show", "r1", "", "", "issues", "k0", "g", "", "Landroid/net/Uri;", "v", "url", "j", "Jg", "Cb", "y0", "b", "Z", "reportingPhysicalLockIssue", "unlocking", "Landroid/widget/ProgressBar;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/ProgressBar;", "progressBar", "Landroid/widget/EditText;", "e", "Landroid/widget/EditText;", "feedback", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "issueLabel", "instructions", "Lco/bird/android/widget/IssueFlowLayout;", "h", "Lco/bird/android/widget/IssueFlowLayout;", "issueContainer", "Landroid/widget/Button;", "i", "Landroid/widget/Button;", "submit", "Lco/bird/android/imageupload/ImageUploadBar;", "kotlin.jvm.PlatformType", "Lco/bird/android/imageupload/ImageUploadBar;", "imageUploadBar", "Lio/reactivex/subjects/d;", "k", "Lio/reactivex/subjects/d;", "photosChangeSubject", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "markDamagedCopyUpdates", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;ZZZ)V", "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDamageFeedbackUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DamageFeedbackUi.kt\nco/bird/android/feature/rideendsummary/DamageFeedbackUiImpl\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,125:1\n215#2,2:126\n1295#3,2:128\n*S KotlinDebug\n*F\n+ 1 DamageFeedbackUi.kt\nco/bird/android/feature/rideendsummary/DamageFeedbackUiImpl\n*L\n93#1:126,2\n121#1:128,2\n*E\n"})
/* renamed from: vS0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50427vS0 extends AbstractC30071xE implements InterfaceC49242tS0 {

    /* renamed from: b */
    public final boolean f114109b;

    /* renamed from: c */
    public final boolean f114110c;

    /* renamed from: d */
    public final ProgressBar f114111d;

    /* renamed from: e */
    public final EditText f114112e;

    /* renamed from: f */
    public final TextView f114113f;

    /* renamed from: g */
    public final TextView f114114g;

    /* renamed from: h */
    public final IssueFlowLayout f114115h;

    /* renamed from: i */
    public final Button f114116i;

    /* renamed from: j */
    public final ImageUploadBar f114117j;

    /* renamed from: k */
    public final C24558d<List<Uri>> f114118k;

    @Metadata(m28433d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u0007"}, m28432d2 = {"vS0$a", "Lco/bird/android/imageupload/ImageUploadBar$a;", "", "Landroid/net/Uri;", "photos", "", C17296a.f69688o, "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: vS0$a */
    /* loaded from: classes3.dex */
    public static final class C29556a implements ImageUploadBar.InterfaceC15989a {
        public C29556a() {
        }

        @Override // co.bird.android.imageupload.ImageUploadBar.InterfaceC15989a
        /* renamed from: a */
        public void mo8628a(List<? extends Uri> photos) {
            Intrinsics.checkNotNullParameter(photos, "photos");
            C50427vS0.this.f114118k.onNext(photos);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "Lco/bird/android/widget/IssueView;", "b", "(I)Lco/bird/android/widget/IssueView;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vS0$b */
    /* loaded from: classes3.dex */
    public static final class C29557b extends Lambda implements Function1<Integer, IssueView> {
        public C29557b() {
            super(1);
        }

        /* renamed from: b */
        public final IssueView m8627b(int i) {
            View childAt = C50427vS0.this.f114115h.getChildAt(i);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type co.bird.android.widget.IssueView");
            return (IssueView) childAt;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IssueView invoke(Integer num) {
            return m8627b(num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/widget/IssueView;", "it", "", C17296a.f69688o, "(Lco/bird/android/widget/IssueView;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vS0$c */
    /* loaded from: classes3.dex */
    public static final class C29558c extends Lambda implements Function1<IssueView, Boolean> {

        /* renamed from: g */
        public static final C29558c f114121g = new C29558c();

        public C29558c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(IssueView it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.m54547f());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: vS0$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C29559d extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C29559d(Object obj) {
            super(1, obj, Button.class, "setEnabled", "setEnabled(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((Button) this.receiver).setEnabled(z);
        }
    }

    public /* synthetic */ C50427vS0(BaseActivity baseActivity, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseActivity, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, z3);
    }

    /* renamed from: Ql */
    public static final void m8636Ql(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC49242tS0
    /* renamed from: Cb */
    public List<String> mo8639Cb() {
        return m8629y0();
    }

    @Override // p000.InterfaceC49242tS0
    /* renamed from: Jg */
    public String mo8638Jg() {
        return this.f114112e.getText().toString();
    }

    @Override // p000.InterfaceC49242tS0
    /* renamed from: c */
    public Observable<Unit> mo8635c() {
        return C44626lf5.clicksThrottle$default(this.f114116i, 0L, 1, null);
    }

    @Override // p000.InterfaceC49242tS0
    /* renamed from: g */
    public Observable<Unit> mo8634g() {
        Observable<Unit> clicksThrottle$default;
        ImageUploadBar imageUploadBar = this.f114117j;
        if (imageUploadBar == null || (clicksThrottle$default = C44626lf5.clicksThrottle$default(imageUploadBar, 0L, 1, null)) == null) {
            Observable<Unit> never = Observable.never();
            Intrinsics.checkNotNullExpressionValue(never, "never()");
            return never;
        }
        return clicksThrottle$default;
    }

    @Override // p000.InterfaceC49242tS0
    /* renamed from: j */
    public void mo8633j(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        ImageUploadBar imageUploadBar = this.f114117j;
        if (imageUploadBar != null) {
            imageUploadBar.m56145s(url);
        }
    }

    @Override // p000.InterfaceC49242tS0
    /* renamed from: k0 */
    public void mo8632k0(Map<String, String> issues) {
        Intrinsics.checkNotNullParameter(issues, "issues");
        for (Map.Entry<String, String> entry : issues.entrySet()) {
            IssueView issueView = new IssueView(getActivity(), null, 0, 6, null);
            issueView.setIssue(entry.getKey(), entry.getValue());
            this.f114115h.addView(issueView);
        }
        Observable<Boolean> startWith = this.f114115h.m54553b().startWith((Observable<Boolean>) Boolean.FALSE);
        final C29559d c29559d = new C29559d(this.f114116i);
        startWith.subscribe(new InterfaceC23484g() { // from class: uS0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50427vS0.m8636Ql(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC49242tS0
    /* renamed from: r1 */
    public void mo8631r1(boolean z) {
        if (!this.f114109b) {
            C49520tu6.show$default(this.f114113f, z, 0, 2, null);
        }
        C49520tu6.show$default(this.f114115h, z, 0, 2, null);
    }

    @Override // p000.InterfaceC49242tS0
    /* renamed from: v */
    public Observable<List<Uri>> mo8630v() {
        Observable<List<Uri>> hide = this.f114118k.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "photosChangeSubject.hide()");
        return hide;
    }

    /* renamed from: y0 */
    public final List<String> m8629y0() {
        Sequence asSequence;
        Sequence map;
        Sequence<IssueView> filter;
        ArrayList arrayList = new ArrayList();
        asSequence = CollectionsKt___CollectionsKt.asSequence(new IntRange(0, this.f114115h.getChildCount() - 1));
        map = SequencesKt___SequencesKt.map(asSequence, new C29557b());
        filter = SequencesKt___SequencesKt.filter(map, C29558c.f114121g);
        for (IssueView issueView : filter) {
            arrayList.add(issueView.m54548e());
        }
        return arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50427vS0(BaseActivity activity, boolean z, boolean z2, boolean z3) {
        super(activity);
        int i;
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f114109b = z2;
        this.f114110c = z3;
        ProgressBar progressBar = (ProgressBar) C40788fB0.m41779c(activity, C35892Sh4.progressBar);
        this.f114111d = progressBar;
        EditText editText = (EditText) C40788fB0.m41779c(activity, C35892Sh4.feedback);
        this.f114112e = editText;
        TextView textView = (TextView) C40788fB0.m41779c(activity, C35892Sh4.issueLabel);
        this.f114113f = textView;
        TextView textView2 = (TextView) C40788fB0.m41779c(activity, C35892Sh4.instructions);
        this.f114114g = textView2;
        this.f114115h = (IssueFlowLayout) C40788fB0.m41779c(activity, C35892Sh4.issueContainer);
        Button button = (Button) C40788fB0.m41779c(activity, C52955zi4.button);
        this.f114116i = button;
        ImageUploadBar imageUploadBar = (ImageUploadBar) activity.findViewById(C35892Sh4.imageUploadBar);
        this.f114117j = imageUploadBar;
        C24558d<List<Uri>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<List<Uri>>()");
        this.f114118k = m31902e;
        progressBar.setVisibility(8);
        button.setEnabled(false);
        if (z2) {
            ActionBar supportActionBar = activity.getSupportActionBar();
            if (supportActionBar != null) {
                if (z3) {
                    i = C45871nl4.damage_feedback_physical_lock_unlocking_activity_title;
                } else {
                    i = C45871nl4.damage_feedback_physical_lock_locking_activity_title;
                }
                supportActionBar.mo70242E(activity.getString(i));
            }
            textView2.setText(activity.getString(C45871nl4.damage_feedback_physical_lock_issue_title));
            editText.setHint(activity.getString(C45871nl4.damage_feedback_physical_lock_description_hint));
        } else if (z) {
            ActionBar supportActionBar2 = activity.getSupportActionBar();
            if (supportActionBar2 != null) {
                supportActionBar2.mo70242E(activity.getString(C45871nl4.damage_feedback_activity_alternative_title));
            }
            textView.setText(activity.getString(C45871nl4.damage_feedback_issue_alternative_title));
            textView2.setText(activity.getString(C45871nl4.damage_feedback_alternative_title));
        }
        if (imageUploadBar != null) {
            imageUploadBar.setMaxPhotos(5);
        }
        if (imageUploadBar == null) {
            return;
        }
        imageUploadBar.setPhotoChangedListener(new C29556a());
    }
}
