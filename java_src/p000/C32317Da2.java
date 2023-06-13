package p000;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.Issue;
import co.bird.android.model.IssueStatus;
import co.bird.android.model.constant.CampaignPriority;
import co.bird.android.model.extension.IssueStatus_Kt;
import co.bird.android.model.wire.WireServiceCenterCampaign;
import co.bird.android.model.wire.WireServiceCenterCampaignPriority;
import co.bird.android.model.wire.WireServiceCenterCampaignPriorityKt;
import co.bird.android.widget.standardcomponents.CheckableItemView;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.MaybeSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.ViewScopeProvider;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C32317Da2;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\fJ\u0018\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\r0\fR:\u0010\u0017\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f \u0014*\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r0\r0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R:\u0010\u0019\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0011 \u0014*\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0011\u0018\u00010\r0\r0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"LDa2;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "Lco/bird/android/model/Issue;", "", "v", "", "w", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "subtypeUpdatesSubject", DateTokenConverter.CONVERTER_KEY, "toShowPriorityWarnDialogSubject", "e", "Landroidx/recyclerview/widget/RecyclerView;", "<init>", "()V", C17296a.f69688o, "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Da2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32317Da2 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<Pair<Issue, Boolean>> f5970c;

    /* renamed from: d */
    public final C24558d<Pair<Issue, String>> f5971d;

    /* renamed from: e */
    public RecyclerView f5972e;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LDa2$a;", "Lw1;", "", "position", "", "bind", "Lco/bird/android/widget/standardcomponents/CheckableItemView;", "b", "Lco/bird/android/widget/standardcomponents/CheckableItemView;", "checkableItem", "", "c", "Z", "binding", "Landroid/view/View;", "view", "<init>", "(LDa2;Landroid/view/View;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nIssueSubtypeAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IssueSubtypeAdapter.kt\nco/bird/android/feature/workorders/inspection/adapters/IssueSubtypeAdapter$IssueSubtypeViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n18#2:104\n9#3,4:105\n1#4:109\n*S KotlinDebug\n*F\n+ 1 IssueSubtypeAdapter.kt\nco/bird/android/feature/workorders/inspection/adapters/IssueSubtypeAdapter$IssueSubtypeViewHolder\n*L\n94#1:104\n94#1:105,4\n*E\n"})
    /* renamed from: Da2$a */
    /* loaded from: classes3.dex */
    public final class C1547a extends C29735w1 {

        /* renamed from: b */
        public final CheckableItemView f5973b;

        /* renamed from: c */
        public boolean f5974c;

        /* renamed from: d */
        public final /* synthetic */ C32317Da2 f5975d;

        @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, m28432d2 = {"Da2$a$a", "Lco/bird/android/widget/standardcomponents/CheckableItemView$b;", "Lco/bird/android/widget/standardcomponents/CheckableItemView;", "view", "", "isChecked", "", C17296a.f69688o, "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nIssueSubtypeAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IssueSubtypeAdapter.kt\nco/bird/android/feature/workorders/inspection/adapters/IssueSubtypeAdapter$IssueSubtypeViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 KotlinExtensions.kt\ncom/uber/autodispose/android/KotlinExtensionsKt\n+ 6 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,103:1\n18#2:104\n9#3,4:105\n1#4:109\n41#5:110\n218#6:111\n*S KotlinDebug\n*F\n+ 1 IssueSubtypeAdapter.kt\nco/bird/android/feature/workorders/inspection/adapters/IssueSubtypeAdapter$IssueSubtypeViewHolder$1\n*L\n55#1:104\n55#1:105,4\n74#1:110\n74#1:111\n*E\n"})
        /* renamed from: Da2$a$a */
        /* loaded from: classes3.dex */
        public static final class C1548a implements CheckableItemView.InterfaceC16699b {

            /* renamed from: b */
            public final /* synthetic */ C32317Da2 f5977b;

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: Da2$a$a$a */
            /* loaded from: classes3.dex */
            public static final class C1549a extends Lambda implements Function1<DialogResponse, Unit> {

                /* renamed from: g */
                public final /* synthetic */ C1547a f5978g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1549a(C1547a c1547a) {
                    super(1);
                    this.f5978g = c1547a;
                }

                /* renamed from: a */
                public final void m110151a(DialogResponse dialogResponse) {
                    if (dialogResponse != DialogResponse.OK) {
                        this.f5978g.f5973b.setChecked(true);
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
                    m110151a(dialogResponse);
                    return Unit.INSTANCE;
                }
            }

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: Da2$a$a$b */
            /* loaded from: classes3.dex */
            public static final class C1550b extends Lambda implements Function1<DialogResponse, Boolean> {

                /* renamed from: g */
                public static final C1550b f5979g = new C1550b();

                public C1550b() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final Boolean invoke(DialogResponse response) {
                    boolean z;
                    Intrinsics.checkNotNullParameter(response, "response");
                    if (response == DialogResponse.OK) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }

            @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lkotlin/Pair;", "Lco/bird/android/model/Issue;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: Da2$a$a$c */
            /* loaded from: classes3.dex */
            public static final class C1551c extends Lambda implements Function1<DialogResponse, Pair<? extends Issue, ? extends Boolean>> {

                /* renamed from: g */
                public final /* synthetic */ Issue f5980g;

                /* renamed from: h */
                public final /* synthetic */ boolean f5981h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1551c(Issue issue, boolean z) {
                    super(1);
                    this.f5980g = issue;
                    this.f5981h = z;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final Pair<Issue, Boolean> invoke(DialogResponse it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return TuplesKt.m28425to(this.f5980g, Boolean.valueOf(!this.f5981h));
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: Da2$a$a$d */
            /* loaded from: classes3.dex */
            public /* synthetic */ class C1552d extends FunctionReferenceImpl implements Function1<Pair<? extends Issue, ? extends Boolean>, Unit> {
                public C1552d(Object obj) {
                    super(1, obj, C24558d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Issue, ? extends Boolean> pair) {
                    invoke2((Pair<Issue, Boolean>) pair);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Pair<Issue, Boolean> p0) {
                    Intrinsics.checkNotNullParameter(p0, "p0");
                    ((C24558d) this.receiver).onNext(p0);
                }
            }

            public C1548a(C32317Da2 c32317Da2) {
                this.f5977b = c32317Da2;
            }

            /* renamed from: f */
            public static final void m110155f(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            /* renamed from: g */
            public static final boolean m110154g(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return ((Boolean) tmp0.invoke(obj)).booleanValue();
            }

            /* renamed from: h */
            public static final Pair m110153h(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (Pair) tmp0.invoke(obj);
            }

            /* renamed from: i */
            public static final void m110152i(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            @Override // co.bird.android.widget.standardcomponents.CheckableItemView.InterfaceC16699b
            /* renamed from: a */
            public void mo3842a(CheckableItemView view, boolean z) {
                CampaignPriority campaignPriority;
                WireServiceCenterCampaignPriority wirePriority;
                WireServiceCenterCampaignPriority wirePriority2;
                Intrinsics.checkNotNullParameter(view, "view");
                if (C1547a.this.f5974c) {
                    return;
                }
                Object m105816c = this.f5977b.m94545o().m109397e(C1547a.this.getAdapterPosition()).m105816c();
                String str = null;
                RecyclerView recyclerView = null;
                str = null;
                if (!(m105816c instanceof Pair)) {
                    m105816c = null;
                }
                Pair pair = (Pair) m105816c;
                if (pair != null) {
                    C32317Da2 c32317Da2 = this.f5977b;
                    C1547a c1547a = C1547a.this;
                    Issue issue = (Issue) pair.component1();
                    if (C42794ia2.m33794a(issue.getSource()) && issue.getStatus() == IssueStatus.OPEN && !z) {
                        C44972mE6 m25869a = C44972mE6.f97697e.m25869a(issue);
                        Activity m11242i = C49520tu6.m11242i(view);
                        Intrinsics.checkNotNull(m11242i, "null cannot be cast to non-null type co.bird.android.core.mvp.BaseActivity");
                        m25869a.show(((BaseActivity) m11242i).getSupportFragmentManager(), "WorkOrderInspectionDisputeBottomSheetDialog");
                        AbstractC24507p<DialogResponse> firstElement = m25869a.m25870a5().firstElement();
                        final C1549a c1549a = new C1549a(c1547a);
                        AbstractC24507p<DialogResponse> m32026s = firstElement.m32026s(new InterfaceC23484g() { // from class: za2
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj) {
                                C32317Da2.C1547a.C1548a.m110155f(Function1.this, obj);
                            }
                        });
                        final C1550b c1550b = C1550b.f5979g;
                        AbstractC24507p<DialogResponse> m32022w = m32026s.m32022w(new InterfaceC23494q() { // from class: Aa2
                            @Override // io.reactivex.functions.InterfaceC23494q
                            public final boolean test(Object obj) {
                                boolean m110154g;
                                m110154g = C32317Da2.C1547a.C1548a.m110154g(Function1.this, obj);
                                return m110154g;
                            }
                        });
                        final C1551c c1551c = new C1551c(issue, z);
                        AbstractC24507p<R> m32067H = m32022w.m32067H(new InterfaceC23492o() { // from class: Ba2
                            @Override // io.reactivex.functions.InterfaceC23492o
                            public final Object apply(Object obj) {
                                Pair m110153h;
                                m110153h = C32317Da2.C1547a.C1548a.m110153h(Function1.this, obj);
                                return m110153h;
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(m32067H, "private inner class Issu…binding = false\n    }\n  }");
                        RecyclerView recyclerView2 = c32317Da2.f5972e;
                        if (recyclerView2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                        } else {
                            recyclerView = recyclerView2;
                        }
                        ScopeProvider m45202a = ViewScopeProvider.m45202a(recyclerView);
                        Intrinsics.checkExpressionValueIsNotNull(m45202a, "ViewScopeProvider.from(this)");
                        Object m32048b = m32067H.m32048b(AutoDispose.m45239a(m45202a));
                        Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
                        final C1552d c1552d = new C1552d(c32317Da2.f5970c);
                        ((MaybeSubscribeProxy) m32048b).subscribe(new InterfaceC23484g() { // from class: Ca2
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj) {
                                C32317Da2.C1547a.C1548a.m110152i(Function1.this, obj);
                            }
                        });
                        return;
                    }
                    if (issue.getStatus() == IssueStatus.OPEN && !z) {
                        WireServiceCenterCampaign wireCampaign = issue.getWireCampaign();
                        if (wireCampaign != null && (wirePriority2 = wireCampaign.getWirePriority()) != null) {
                            campaignPriority = wirePriority2.getPriority();
                        } else {
                            campaignPriority = null;
                        }
                        if (campaignPriority == CampaignPriority.WARN) {
                            c32317Da2.f5970c.onNext(TuplesKt.m28425to(issue, Boolean.valueOf(!z)));
                            C24558d c24558d = c32317Da2.f5971d;
                            WireServiceCenterCampaign wireCampaign2 = issue.getWireCampaign();
                            if (wireCampaign2 != null && (wirePriority = wireCampaign2.getWirePriority()) != null) {
                                str = WireServiceCenterCampaignPriorityKt.getDisplayMessage(wirePriority);
                            }
                            Intrinsics.checkNotNull(str);
                            c24558d.onNext(TuplesKt.m28425to(issue, str));
                            return;
                        }
                    }
                    c32317Da2.f5970c.onNext(TuplesKt.m28425to(issue, Boolean.valueOf(!z)));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1547a(C32317Da2 c32317Da2, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f5975d = c32317Da2;
            CheckableItemView checkableItemView = (CheckableItemView) view;
            this.f5973b = checkableItemView;
            checkableItemView.setOnCheckChangedListener(new C1548a(c32317Da2));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            this.f5974c = true;
            Object m105816c = this.f5975d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null) {
                Issue issue = (Issue) pair.component1();
                boolean booleanValue = ((Boolean) pair.component2()).booleanValue();
                this.f5973b.setTitle(issue.getDisplay());
                this.f5973b.setChecked(Intrinsics.areEqual(IssueStatus_Kt.toBoolean(issue.getStatus()), Boolean.FALSE));
                this.f5973b.setEnabled(!booleanValue);
            }
            this.f5974c = false;
        }
    }

    public C32317Da2() {
        C24558d<Pair<Issue, Boolean>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Pair<Issue, Boolean>>()");
        this.f5970c = m31902e;
        C24558d<Pair<Issue, String>> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<Pair<Issue, String>>()");
        this.f5971d = m31902e2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f5972e = recyclerView;
    }

    /* renamed from: v */
    public final Observable<Pair<Issue, Boolean>> m110163v() {
        Observable<Pair<Issue, Boolean>> hide = this.f5970c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "subtypeUpdatesSubject.hide()");
        return hide;
    }

    /* renamed from: w */
    public final Observable<Pair<Issue, String>> m110162w() {
        Observable<Pair<Issue, String>> hide = this.f5971d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "toShowPriorityWarnDialogSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C37080Xj4.item_inspection_issue_subtype ? new C1547a(this, m41761u) : new C29735w1(m41761u);
    }
}
