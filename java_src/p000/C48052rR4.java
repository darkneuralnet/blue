package p000;

import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.widget.IssueFlowLayout;
import co.bird.android.widget.IssueView;
import com.afollestad.materialdialogs.MaterialDialog;
import com.facebook.share.internal.C17296a;
import com.google.android.play.core.review.ReviewInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
@Metadata(m28433d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\n\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J$\u0010\u000e\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\b\u0010\u0019\u001a\u00020\u0005H\u0016R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R)\u0010)\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010#0#0\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006."}, m28432d2 = {"LrR4;", "LxE;", "LnR4;", "", "show", "", "r1", "", "", "issues", "k0", "Lkotlin/Function0;", "onYes", "onNo", "y1", "", "rating", "X", "LiR4;", "presenter", "pd", "", "y0", "D", "Y0", "f1", "LEO4;", "b", "LEO4;", "reviewManager", "LH5;", "c", "LH5;", "binding", "LXY5;", "Lcom/google/android/play/core/review/ReviewInfo;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Lazy;", "Ul", "()LXY5;", "requestReviewTask", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LEO4;LH5;)V", "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideFeedbackUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideFeedbackUi.kt\nco/bird/android/feature/rideendsummary/RideFeedbackUiImpl\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,123:1\n215#2,2:124\n1295#3,2:126\n*S KotlinDebug\n*F\n+ 1 RideFeedbackUi.kt\nco/bird/android/feature/rideendsummary/RideFeedbackUiImpl\n*L\n48#1:124,2\n91#1:126,2\n*E\n"})
/* renamed from: rR4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48052rR4 extends AbstractC30071xE implements InterfaceC45680nR4 {

    /* renamed from: b */
    public final EO4 f107072b;

    /* renamed from: c */
    public final C3022H5 f107073c;

    /* renamed from: d */
    public final Lazy f107074d;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rR4$a */
    /* loaded from: classes3.dex */
    public static final class C27915a extends Lambda implements Function1<View, Unit> {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC42715iR4 f107076h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27915a(InterfaceC42715iR4 interfaceC42715iR4) {
            super(1);
            this.f107076h = interfaceC42715iR4;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            C48052rR4.this.f107073c.f12821h.setClickable(false);
            this.f107076h.mo27291a(C48052rR4.this.f107073c.f12820g.getRating(), C48052rR4.this.f107073c.f12815b.getText().toString());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/widget/RatingBar;", "<anonymous parameter 0>", "", "rating", "", "<anonymous parameter 2>", "", C17296a.f69688o, "(Landroid/widget/RatingBar;FZ)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rR4$b */
    /* loaded from: classes3.dex */
    public static final class C27916b extends Lambda implements Function3<RatingBar, Float, Boolean, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC42715iR4 f107077g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27916b(InterfaceC42715iR4 interfaceC42715iR4) {
            super(3);
            this.f107077g = interfaceC42715iR4;
        }

        /* renamed from: a */
        public final void m15952a(RatingBar ratingBar, float f, boolean z) {
            this.f107077g.mo27289c(f);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RatingBar ratingBar, Float f, Boolean bool) {
            m15952a(ratingBar, f.floatValue(), bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "Lco/bird/android/widget/IssueView;", "b", "(I)Lco/bird/android/widget/IssueView;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rR4$c */
    /* loaded from: classes3.dex */
    public static final class C27917c extends Lambda implements Function1<Integer, IssueView> {
        public C27917c() {
            super(1);
        }

        /* renamed from: b */
        public final IssueView m15951b(int i) {
            View childAt = C48052rR4.this.f107073c.f12817d.getChildAt(i);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type co.bird.android.widget.IssueView");
            return (IssueView) childAt;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IssueView invoke(Integer num) {
            return m15951b(num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/widget/IssueView;", "it", "", C17296a.f69688o, "(Lco/bird/android/widget/IssueView;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rR4$d */
    /* loaded from: classes3.dex */
    public static final class C27918d extends Lambda implements Function1<IssueView, Boolean> {

        /* renamed from: g */
        public static final C27918d f107079g = new C27918d();

        public C27918d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(IssueView it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.m54547f());
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LXY5;", "Lcom/google/android/play/core/review/ReviewInfo;", "kotlin.jvm.PlatformType", "b", "()LXY5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rR4$e */
    /* loaded from: classes3.dex */
    public static final class C27919e extends Lambda implements Function0<XY5<ReviewInfo>> {
        public C27919e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final XY5<ReviewInfo> invoke() {
            return C48052rR4.this.f107072b.mo48459a();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rR4$f */
    /* loaded from: classes3.dex */
    public static final class C27920f extends Lambda implements Function1<MaterialDialog, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function0<Unit> f107081g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27920f(Function0<Unit> function0) {
            super(1);
            this.f107081g = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MaterialDialog materialDialog) {
            invoke2(materialDialog);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(MaterialDialog it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.f107081g.invoke();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rR4$g */
    /* loaded from: classes3.dex */
    public static final class C27921g extends Lambda implements Function1<MaterialDialog, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function0<Unit> f107082g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27921g(Function0<Unit> function0) {
            super(1);
            this.f107082g = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MaterialDialog materialDialog) {
            invoke2(materialDialog);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(MaterialDialog it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.f107082g.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48052rR4(BaseActivity activity, EO4 reviewManager, C3022H5 binding) {
        super(activity);
        Lazy lazy;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(reviewManager, "reviewManager");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f107072b = reviewManager;
        this.f107073c = binding;
        lazy = LazyKt__LazyJVMKt.lazy(new C27919e());
        this.f107074d = lazy;
    }

    /* renamed from: Sl */
    public static final void m15964Sl(C48052rR4 this$0, XY5 task) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.mo1421g()) {
            Object mo1423e = task.mo1423e();
            Intrinsics.checkNotNullExpressionValue(mo1423e, "task.result");
            this$0.f107072b.mo48458b(this$0.getActivity(), (ReviewInfo) mo1423e).mo1427a(new InterfaceC44031kf3() { // from class: qR4
                @Override // p000.InterfaceC44031kf3
                /* renamed from: a */
                public final void mo17508a(XY5 xy5) {
                    C48052rR4.m15963Tl(xy5);
                }
            });
            return;
        }
        C41318g46.m40158f(task.mo1424d(), "Exception raised while requesting in-app review flow", new Object[0]);
    }

    /* renamed from: Tl */
    public static final void m15963Tl(XY5 xy5) {
        Intrinsics.checkNotNullParameter(xy5, "<anonymous parameter 0>");
        C41318g46.m40163a("in app review attempted successfully", new Object[0]);
    }

    /* renamed from: Vl */
    public static final void m15961Vl(XY5 task) {
        Intrinsics.checkNotNullParameter(task, "task");
        C41318g46.m40163a("request review complete (" + task + ")", new Object[0]);
    }

    @Override // p000.InterfaceC45680nR4
    /* renamed from: D */
    public void mo15968D() {
        m15962Ul().mo1427a(new InterfaceC44031kf3() { // from class: oR4
            @Override // p000.InterfaceC44031kf3
            /* renamed from: a */
            public final void mo17508a(XY5 xy5) {
                C48052rR4.m15961Vl(xy5);
            }
        });
    }

    /* renamed from: Ul */
    public final XY5<ReviewInfo> m15962Ul() {
        return (XY5) this.f107074d.getValue();
    }

    @Override // p000.InterfaceC45680nR4
    /* renamed from: X */
    public void mo15960X(float f) {
        this.f107073c.f12820g.setRating(f);
    }

    @Override // p000.InterfaceC45680nR4
    /* renamed from: Y0 */
    public boolean mo15959Y0() {
        return m15962Ul().mo1421g();
    }

    @Override // p000.InterfaceC45680nR4
    /* renamed from: f1 */
    public void mo15958f1() {
        C41318g46.m40163a("attemptInAppReview called, waiting for review request task to complete...", new Object[0]);
        m15962Ul().mo1427a(new InterfaceC44031kf3() { // from class: pR4
            @Override // p000.InterfaceC44031kf3
            /* renamed from: a */
            public final void mo17508a(XY5 xy5) {
                C48052rR4.m15964Sl(C48052rR4.this, xy5);
            }
        });
    }

    @Override // p000.InterfaceC45680nR4
    /* renamed from: k0 */
    public void mo15957k0(Map<String, String> issues) {
        Intrinsics.checkNotNullParameter(issues, "issues");
        for (Map.Entry<String, String> entry : issues.entrySet()) {
            IssueView issueView = new IssueView(getActivity(), null, 0, 6, null);
            issueView.setIssue(entry.getKey(), entry.getValue());
            this.f107073c.f12817d.addView(issueView);
        }
    }

    @Override // p000.InterfaceC45680nR4
    /* renamed from: pd */
    public void mo15956pd(InterfaceC42715iR4 presenter) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Button button = this.f107073c.f12821h;
        Intrinsics.checkNotNullExpressionValue(button, "binding.submit");
        C34585Ms2.m94661j(button, new C27915a(presenter));
        RatingBar ratingBar = this.f107073c.f12820g;
        Intrinsics.checkNotNullExpressionValue(ratingBar, "binding.ratingBar");
        C34585Ms2.m94651t(ratingBar, new C27916b(presenter));
    }

    @Override // p000.InterfaceC45680nR4
    /* renamed from: r1 */
    public void mo15955r1(boolean z) {
        TextView textView = this.f107073c.f12818e;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.issueLabel");
        C49520tu6.show$default(textView, z, 0, 2, null);
        IssueFlowLayout issueFlowLayout = this.f107073c.f12817d;
        Intrinsics.checkNotNullExpressionValue(issueFlowLayout, "binding.issueContainer");
        C49520tu6.show$default(issueFlowLayout, z, 0, 2, null);
    }

    @Override // p000.InterfaceC45680nR4
    /* renamed from: y0 */
    public List<String> mo15954y0() {
        Sequence asSequence;
        Sequence map;
        Sequence<IssueView> filter;
        ArrayList arrayList = new ArrayList();
        asSequence = CollectionsKt___CollectionsKt.asSequence(new IntRange(0, this.f107073c.f12817d.getChildCount() - 1));
        map = SequencesKt___SequencesKt.map(asSequence, new C27917c());
        filter = SequencesKt___SequencesKt.filter(map, C27918d.f107079g);
        for (IssueView issueView : filter) {
            arrayList.add(issueView.m54548e());
        }
        return arrayList;
    }

    @Override // p000.InterfaceC45680nR4
    /* renamed from: y1 */
    public void mo15953y1(Function0<Unit> onYes, Function0<Unit> onNo) {
        Intrinsics.checkNotNullParameter(onYes, "onYes");
        Intrinsics.checkNotNullParameter(onNo, "onNo");
        if (!getActivity().isFinishing()) {
            MaterialDialog.negativeButton$default(MaterialDialog.positiveButton$default(MaterialDialog.message$default(MaterialDialog.title$default(new MaterialDialog(getActivity(), null, 2, null), Integer.valueOf(C45871nl4.rate_app_title), null, 2, null), Integer.valueOf(C45871nl4.rate_app_question), null, null, 6, null), Integer.valueOf(C45871nl4.rate_app_yes), null, new C27920f(onYes), 2, null), Integer.valueOf(C45871nl4.rate_app_no), null, new C27921g(onNo), 2, null).show();
        }
    }
}
