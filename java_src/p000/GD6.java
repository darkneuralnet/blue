package p000;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.Issue;
import co.bird.android.model.IssueStatus;
import co.bird.android.model.LocalAsset;
import co.bird.android.model.constant.AssetManagerType;
import co.bird.android.model.constant.CampaignPriority;
import co.bird.android.model.constant.TaskPriority;
import co.bird.android.model.extension.IssueStatus_Kt;
import co.bird.android.model.wire.WireServiceCenterCampaign;
import co.bird.android.model.wire.WireServiceCenterCampaignPriority;
import co.bird.android.model.wire.WireServiceCenterCampaignPriorityKt;
import co.bird.android.widget.standardcomponents.InspectionV2CardView;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.ViewScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.GD6;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0002'(B\u0011\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b%\u0010&J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000eJ\u001a\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00100\u000eJ\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00140\u00100\u000eR\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR>\u0010 \u001a,\u0012(\u0012&\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012 \u001d*\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00100\u00100\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010\"\u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\n0\n0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR:\u0010$\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0014 \u001d*\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00100\u00100\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001f¨\u0006)"}, m28432d2 = {"LGD6;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "LF6;", "r", "Lio/reactivex/Observable;", "I", "Lkotlin/Pair;", "Lco/bird/android/model/Issue;", "", "v", "", "w", "Lsu2;", "c", "Lsu2;", "localAssetManager", DateTokenConverter.CONVERTER_KEY, "Landroidx/recyclerview/widget/RecyclerView;", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "e", "Lio/reactivex/subjects/d;", "issueUpdatesSubject", "f", "completeSubject", "g", "toShowPriorityWarnDialogSubject", "<init>", "(Lsu2;)V", C17296a.f69688o, "b", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: GD6 */
/* loaded from: classes3.dex */
public final class GD6 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final InterfaceC48923su2 f11149c;

    /* renamed from: d */
    public RecyclerView f11150d;

    /* renamed from: e */
    public final C24558d<Pair<Issue, Boolean>> f11151e;

    /* renamed from: f */
    public final C24558d<Unit> f11152f;

    /* renamed from: g */
    public final C24558d<Pair<Issue, String>> f11153g;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LGD6$a;", "Lw1;", "", "position", "", "bind", "Landroid/widget/Button;", "b", "Landroid/widget/Button;", "button", "Landroid/view/View;", "view", "<init>", "(LGD6;Landroid/view/View;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWorkOrderInspectionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderInspectionAdapter.kt\nco/bird/android/feature/workorders/inspection/adapters/WorkOrderInspectionAdapter$ButtonViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n18#2:182\n9#3,4:183\n1#4:187\n*S KotlinDebug\n*F\n+ 1 WorkOrderInspectionAdapter.kt\nco/bird/android/feature/workorders/inspection/adapters/WorkOrderInspectionAdapter$ButtonViewHolder\n*L\n174#1:182\n174#1:183,4\n*E\n"})
    /* renamed from: GD6$a */
    /* loaded from: classes3.dex */
    public final class C2683a extends C29735w1 {

        /* renamed from: b */
        public final Button f11154b;

        /* renamed from: c */
        public final /* synthetic */ GD6 f11155c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: GD6$a$a */
        /* loaded from: classes3.dex */
        public static final class C2684a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ GD6 f11156g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2684a(GD6 gd6) {
                super(1);
                this.f11156g = gd6;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f11156g.f11152f.onNext(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2683a(GD6 gd6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f11155c = gd6;
            Button button = (Button) view;
            this.f11154b = button;
            C34585Ms2.m94661j(button, new C2684a(gd6));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f11155c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null) {
                boolean booleanValue = ((Boolean) pair.component2()).booleanValue();
                this.f11154b.setText((String) pair.component1());
                this.f11154b.setEnabled(booleanValue);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LGD6$b;", "Lw1;", "", "position", "", "bind", "Lco/bird/android/widget/standardcomponents/InspectionV2CardView;", "b", "Lco/bird/android/widget/standardcomponents/InspectionV2CardView;", "inspectionCard", "LDa2;", "c", "LDa2;", "adapter", "Landroid/view/View;", "view", "<init>", "(LGD6;Landroid/view/View;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWorkOrderInspectionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderInspectionAdapter.kt\nco/bird/android/feature/workorders/inspection/adapters/WorkOrderInspectionAdapter$InspectionViewHolder\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 5 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n41#2:182\n41#2:184\n41#2:186\n41#2:209\n180#3:183\n180#3:185\n180#3:187\n18#4:188\n18#4:197\n9#5,4:189\n9#5,4:198\n1#6:193\n1549#7:194\n1620#7,2:195\n1622#7:202\n1747#7,3:203\n1747#7,3:206\n*S KotlinDebug\n*F\n+ 1 WorkOrderInspectionAdapter.kt\nco/bird/android/feature/workorders/inspection/adapters/WorkOrderInspectionAdapter$InspectionViewHolder\n*L\n117#1:182\n123#1:184\n127#1:186\n153#1:209\n117#1:183\n123#1:185\n127#1:187\n132#1:188\n135#1:197\n132#1:189,4\n135#1:198,4\n135#1:194\n135#1:195,2\n135#1:202\n135#1:203,3\n138#1:206,3\n*E\n"})
    /* renamed from: GD6$b */
    /* loaded from: classes3.dex */
    public final class C2685b extends C29735w1 {

        /* renamed from: b */
        public final InspectionV2CardView f11157b;

        /* renamed from: c */
        public final C32317Da2 f11158c;

        /* renamed from: d */
        public final /* synthetic */ GD6 f11159d;

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\b\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0005*\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "it", "Lkotlin/Pair;", "LHa2;", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lkotlin/Pair;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: GD6$b$a */
        /* loaded from: classes3.dex */
        public static final class C2686a extends Lambda implements Function1<Unit, Pair<? extends C33253Ha2, ? extends Boolean>> {

            /* renamed from: g */
            public final /* synthetic */ GD6 f11160g;

            /* renamed from: h */
            public final /* synthetic */ C2685b f11161h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2686a(GD6 gd6, C2685b c2685b) {
                super(1);
                this.f11160g = gd6;
                this.f11161h = c2685b;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Pair<C33253Ha2, Boolean> invoke(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Object m105816c = this.f11160g.m94545o().m109397e(this.f11161h.getAdapterPosition()).m105816c();
                Intrinsics.checkNotNull(m105816c, "null cannot be cast to non-null type co.bird.android.feature.workorders.inspection.viewmodels.IssueViewModel");
                return TuplesKt.m28425to((C33253Ha2) m105816c, this.f11161h.f11157b.m53979v());
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001ab\u0012*\b\u0001\u0012&\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0002 \u0006*\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00000\u0000 \u0006*0\u0012*\b\u0001\u0012&\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0002 \u0006*\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00000\u0000\u0018\u00010\u00040\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "LHa2;", "", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "Lco/bird/android/model/Issue;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: GD6$b$b */
        /* loaded from: classes3.dex */
        public static final class C2687b extends Lambda implements Function1<Pair<? extends C33253Ha2, ? extends Boolean>, InterfaceC24574u<? extends Pair<? extends Issue, ? extends Boolean>>> {

            /* renamed from: g */
            public final /* synthetic */ View f11162g;

            /* renamed from: h */
            public final /* synthetic */ GD6 f11163h;

            /* renamed from: i */
            public final /* synthetic */ C2685b f11164i;

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: GD6$b$b$a */
            /* loaded from: classes3.dex */
            public static final class C2688a extends Lambda implements Function1<DialogResponse, Unit> {

                /* renamed from: g */
                public final /* synthetic */ C2685b f11165g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2688a(C2685b c2685b) {
                    super(1);
                    this.f11165g = c2685b;
                }

                /* renamed from: a */
                public final void m105615a(DialogResponse dialogResponse) {
                    if (dialogResponse != DialogResponse.OK) {
                        this.f11165g.f11157b.setAccepted(Boolean.FALSE);
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
                    m105615a(dialogResponse);
                    return Unit.INSTANCE;
                }
            }

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: GD6$b$b$b */
            /* loaded from: classes3.dex */
            public static final class C2689b extends Lambda implements Function1<DialogResponse, Boolean> {

                /* renamed from: g */
                public static final C2689b f11166g = new C2689b();

                public C2689b() {
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

            @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0005*\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lkotlin/Pair;", "Lco/bird/android/model/Issue;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: GD6$b$b$c */
            /* loaded from: classes3.dex */
            public static final class C2690c extends Lambda implements Function1<DialogResponse, Pair<? extends Issue, ? extends Boolean>> {

                /* renamed from: g */
                public final /* synthetic */ Issue f11167g;

                /* renamed from: h */
                public final /* synthetic */ Boolean f11168h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2690c(Issue issue, Boolean bool) {
                    super(1);
                    this.f11167g = issue;
                    this.f11168h = bool;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final Pair<Issue, Boolean> invoke(DialogResponse it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return TuplesKt.m28425to(this.f11167g, this.f11168h);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2687b(View view, GD6 gd6, C2685b c2685b) {
                super(1);
                this.f11162g = view;
                this.f11163h = gd6;
                this.f11164i = c2685b;
            }

            /* renamed from: e */
            public static final boolean m105616e(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return ((Boolean) tmp0.invoke(obj)).booleanValue();
            }

            public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            public static final Pair invoke$lambda$2(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (Pair) tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: d */
            public final InterfaceC24574u<? extends Pair<Issue, Boolean>> invoke(Pair<C33253Ha2, Boolean> pair) {
                CampaignPriority campaignPriority;
                WireServiceCenterCampaignPriority wirePriority;
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                C33253Ha2 component1 = pair.component1();
                Boolean component2 = pair.component2();
                Issue m103699g = component1.m103699g();
                WireServiceCenterCampaign m103700f = component1.m103700f();
                String str = null;
                if (m103700f != null && (wirePriority = m103700f.getWirePriority()) != null) {
                    campaignPriority = wirePriority.getPriority();
                } else {
                    campaignPriority = null;
                }
                if (campaignPriority == CampaignPriority.WARN) {
                    str = WireServiceCenterCampaignPriorityKt.getDisplayMessage(component1.m103700f().getWirePriority());
                }
                if (C42794ia2.m33794a(m103699g.getSource()) && m103699g.getStatus() == IssueStatus.OPEN && !Intrinsics.areEqual(component2, Boolean.FALSE)) {
                    C44972mE6 m25869a = C44972mE6.f97697e.m25869a(m103699g);
                    Activity m11242i = C49520tu6.m11242i(this.f11162g);
                    Intrinsics.checkNotNull(m11242i, "null cannot be cast to non-null type co.bird.android.core.mvp.BaseActivity");
                    m25869a.show(((BaseActivity) m11242i).getSupportFragmentManager(), "WorkOrderInspectionDisputeBottomSheetDialog");
                    AbstractC24507p<DialogResponse> firstElement = m25869a.m25870a5().firstElement();
                    final C2688a c2688a = new C2688a(this.f11164i);
                    AbstractC24507p<DialogResponse> m32026s = firstElement.m32026s(new InterfaceC23484g() { // from class: MD6
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            GD6.C2685b.C2687b.invoke$lambda$0(Function1.this, obj);
                        }
                    });
                    final C2689b c2689b = C2689b.f11166g;
                    AbstractC24507p<DialogResponse> m32022w = m32026s.m32022w(new InterfaceC23494q() { // from class: ND6
                        @Override // io.reactivex.functions.InterfaceC23494q
                        public final boolean test(Object obj) {
                            boolean m105616e;
                            m105616e = GD6.C2685b.C2687b.m105616e(Function1.this, obj);
                            return m105616e;
                        }
                    });
                    final C2690c c2690c = new C2690c(m103699g, component2);
                    return m32022w.m32067H(new InterfaceC23492o() { // from class: OD6
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            Pair invoke$lambda$2;
                            invoke$lambda$2 = GD6.C2685b.C2687b.invoke$lambda$2(Function1.this, obj);
                            return invoke$lambda$2;
                        }
                    });
                } else if (!Intrinsics.areEqual(IssueStatus_Kt.toBoolean(m103699g.getStatus()), Boolean.TRUE) && str != null) {
                    this.f11163h.f11153g.onNext(TuplesKt.m28425to(m103699g, str));
                    return AbstractC24507p.m32068G(TuplesKt.m28425to(m103699g, component2));
                } else {
                    return AbstractC24507p.m32068G(TuplesKt.m28425to(m103699g, component2));
                }
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: GD6$b$c */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C2691c extends FunctionReferenceImpl implements Function1<Pair<? extends Issue, ? extends Boolean>, Unit> {
            public C2691c(Object obj) {
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

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: GD6$b$d */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C2692d extends FunctionReferenceImpl implements Function1<Pair<? extends Issue, ? extends Boolean>, Unit> {
            public C2692d(Object obj) {
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

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: GD6$b$e */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C2693e extends FunctionReferenceImpl implements Function1<Pair<? extends Issue, ? extends String>, Unit> {
            public C2693e(Object obj) {
                super(1, obj, C24558d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Issue, ? extends String> pair) {
                invoke2((Pair<Issue, String>) pair);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Pair<Issue, String> p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((C24558d) this.receiver).onNext(p0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2685b(GD6 gd6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f11159d = gd6;
            InspectionV2CardView inspectionV2CardView = (InspectionV2CardView) view;
            this.f11157b = inspectionV2CardView;
            C32317Da2 c32317Da2 = new C32317Da2();
            this.f11158c = c32317Da2;
            Observable merge = Observable.merge(inspectionV2CardView.m53975z(), inspectionV2CardView.m53977x());
            final C2686a c2686a = new C2686a(gd6, this);
            Observable map = merge.map(new InterfaceC23492o() { // from class: HD6
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair m105626k;
                    m105626k = GD6.C2685b.m105626k(Function1.this, obj);
                    return m105626k;
                }
            });
            final C2687b c2687b = new C2687b(view, gd6, this);
            Observable flatMapMaybe = map.flatMapMaybe(new InterfaceC23492o() { // from class: ID6
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC24574u m105625l;
                    m105625l = GD6.C2685b.m105625l(Function1.this, obj);
                    return m105625l;
                }
            });
            Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "merge(inspectionCard.pas…  }\n          }\n        }");
            RecyclerView recyclerView = gd6.f11150d;
            RecyclerView recyclerView2 = null;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                recyclerView = null;
            }
            ScopeProvider m45202a = ViewScopeProvider.m45202a(recyclerView);
            Intrinsics.checkExpressionValueIsNotNull(m45202a, "ViewScopeProvider.from(this)");
            Object m33094as = flatMapMaybe.m33094as(AutoDispose.m45239a(m45202a));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C2691c c2691c = new C2691c(gd6.f11151e);
            ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: JD6
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    GD6.C2685b.m105624m(Function1.this, obj);
                }
            });
            inspectionV2CardView.setAdapter(c32317Da2);
            Observable<Pair<Issue, Boolean>> m110163v = c32317Da2.m110163v();
            RecyclerView recyclerView3 = gd6.f11150d;
            if (recyclerView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                recyclerView3 = null;
            }
            ScopeProvider m45202a2 = ViewScopeProvider.m45202a(recyclerView3);
            Intrinsics.checkExpressionValueIsNotNull(m45202a2, "ViewScopeProvider.from(this)");
            Object m33094as2 = m110163v.m33094as(AutoDispose.m45239a(m45202a2));
            Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C2692d c2692d = new C2692d(gd6.f11151e);
            ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: KD6
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    GD6.C2685b.m105623n(Function1.this, obj);
                }
            });
            Observable<Pair<Issue, String>> m110162w = c32317Da2.m110162w();
            RecyclerView recyclerView4 = gd6.f11150d;
            if (recyclerView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            } else {
                recyclerView2 = recyclerView4;
            }
            ScopeProvider m45202a3 = ViewScopeProvider.m45202a(recyclerView2);
            Intrinsics.checkExpressionValueIsNotNull(m45202a3, "ViewScopeProvider.from(this)");
            Object m33094as3 = m110162w.m33094as(AutoDispose.m45239a(m45202a3));
            Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C2693e c2693e = new C2693e(gd6.f11153g);
            ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: LD6
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    GD6.C2685b.m105622o(Function1.this, obj);
                }
            });
        }

        /* renamed from: k */
        public static final Pair m105626k(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        /* renamed from: l */
        public static final InterfaceC24574u m105625l(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        /* renamed from: m */
        public static final void m105624m(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: n */
        public static final void m105623n(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: o */
        public static final void m105622o(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00f0  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0117  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x00d7 A[EDGE_INSN: B:72:0x00d7->B:46:0x00d7 ?: BREAK  , SYNTHETIC] */
        @Override // p000.C29735w1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void bind(int i) {
            boolean z;
            List<Issue> subtypes;
            Iterator<T> it;
            Boolean bool;
            String assetId;
            List<C3023H6> listOf;
            int collectionSizeOrDefault;
            boolean z2;
            boolean z3;
            Object m105816c = this.f11159d.m94545o().m109397e(i).m105816c();
            RecyclerView recyclerView = null;
            if (!(m105816c instanceof C33253Ha2)) {
                m105816c = null;
            }
            C33253Ha2 c33253Ha2 = (C33253Ha2) m105816c;
            if (c33253Ha2 != null) {
                GD6 gd6 = this.f11159d;
                Issue m103705a = c33253Ha2.m103705a();
                boolean m103704b = c33253Ha2.m103704b();
                C3023H6 m103703c = c33253Ha2.m103703c();
                WireServiceCenterCampaign m103702d = c33253Ha2.m103702d();
                this.f11157b.setTitle(m103705a.getDisplay());
                this.f11157b.setDescription(m103705a.getDescription());
                InspectionV2CardView inspectionV2CardView = this.f11157b;
                boolean z4 = false;
                if (!m103704b) {
                    List<C2637G6> m104408e = m103703c.m104408e();
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(m104408e, 10);
                    ArrayList<Pair> arrayList = new ArrayList(collectionSizeOrDefault);
                    for (C2637G6 c2637g6 : m104408e) {
                        Object m105816c2 = c2637g6.m105816c();
                        if (!(m105816c2 instanceof Pair)) {
                            m105816c2 = null;
                        }
                        arrayList.add((Pair) m105816c2);
                    }
                    if (!arrayList.isEmpty()) {
                        for (Pair pair : arrayList) {
                            if (pair != null && ((Boolean) pair.getSecond()).booleanValue()) {
                                z2 = true;
                                continue;
                            } else {
                                z2 = false;
                                continue;
                            }
                            if (z2) {
                                z3 = true;
                                break;
                            }
                        }
                    }
                    z3 = false;
                    if (!z3) {
                        z = true;
                        inspectionV2CardView.setEnabled(z);
                        subtypes = m103705a.getSubtypes();
                        if ((subtypes instanceof Collection) || !subtypes.isEmpty()) {
                            it = subtypes.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (IssueStatus_Kt.isFailedStatus(((Issue) it.next()).getStatus())) {
                                        z4 = true;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        InspectionV2CardView inspectionV2CardView2 = this.f11157b;
                        if (!z4) {
                            bool = Boolean.FALSE;
                        } else {
                            bool = IssueStatus_Kt.toBoolean(m103705a.getStatus());
                        }
                        inspectionV2CardView2.setAccepted(bool);
                        this.f11157b.m53959D();
                        if (m103702d != null) {
                            this.f11157b.setVehicleCampaign(WireServiceCenterCampaignPriorityKt.getDisplayMessage(m103702d.getWirePriority()), m103702d.getWirePriority().getColor(), m103702d.getWirePriority().getPriority().canPassFailIssue());
                        }
                        assetId = m103705a.getAssetId();
                        if (assetId != null) {
                            AbstractC23442F<LocalAsset> mo13534a = gd6.f11149c.mo13534a(assetId, AssetManagerType.REPAIR, TaskPriority.IMMEDIATE);
                            ImageView m53961s = this.f11157b.m53961s();
                            RecyclerView recyclerView2 = gd6.f11150d;
                            if (recyclerView2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                            } else {
                                recyclerView = recyclerView2;
                            }
                            ScopeProvider m45202a = ViewScopeProvider.m45202a(recyclerView);
                            Intrinsics.checkExpressionValueIsNotNull(m45202a, "ViewScopeProvider.from(this)");
                            C37279Yf5.m74583L(mo13534a, m53961s, m45202a);
                        }
                        if ((!IssueStatus_Kt.isFailedStatus(m103705a.getStatus()) || z4) && (!m103703c.m104408e().isEmpty())) {
                            InspectionV2CardView inspectionV2CardView3 = this.f11157b;
                            listOf = CollectionsKt__CollectionsJVMKt.listOf(m103703c);
                            inspectionV2CardView3.m53982B(listOf);
                        }
                        this.f11157b.m53980u();
                        return;
                    }
                }
                z = false;
                inspectionV2CardView.setEnabled(z);
                subtypes = m103705a.getSubtypes();
                if (subtypes instanceof Collection) {
                }
                it = subtypes.iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                    

                    public GD6(InterfaceC48923su2 localAssetManager) {
                        Intrinsics.checkNotNullParameter(localAssetManager, "localAssetManager");
                        this.f11149c = localAssetManager;
                        C24558d<Pair<Issue, Boolean>> m31902e = C24558d.m31902e();
                        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Pair<Issue, Boolean?>>()");
                        this.f11151e = m31902e;
                        C24558d<Unit> m31902e2 = C24558d.m31902e();
                        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<Unit>()");
                        this.f11152f = m31902e2;
                        C24558d<Pair<Issue, String>> m31902e3 = C24558d.m31902e();
                        Intrinsics.checkNotNullExpressionValue(m31902e3, "create<Pair<Issue, String>>()");
                        this.f11153g = m31902e3;
                    }

                    /* renamed from: I */
                    public final Observable<Unit> m105634I() {
                        Observable<Unit> hide = this.f11152f.hide();
                        Intrinsics.checkNotNullExpressionValue(hide, "completeSubject.hide()");
                        return hide;
                    }

                    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
                    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
                        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                        this.f11150d = recyclerView;
                        if (recyclerView.getItemDecorationCount() == 0) {
                            recyclerView.addItemDecoration(new C51493xE6());
                        }
                    }

                    @Override // p000.AbstractC5440My
                    /* renamed from: r */
                    public InterfaceC2152F6 mo2178r() {
                        return new PD6();
                    }

                    /* renamed from: v */
                    public final Observable<Pair<Issue, Boolean>> m105633v() {
                        Observable<Pair<Issue, Boolean>> hide = this.f11151e.hide();
                        Intrinsics.checkNotNullExpressionValue(hide, "issueUpdatesSubject.hide()");
                        return hide;
                    }

                    /* renamed from: w */
                    public final Observable<Pair<Issue, String>> m105632w() {
                        Observable<Pair<Issue, String>> hide = this.f11153g.hide();
                        Intrinsics.checkNotNullExpressionValue(hide, "toShowPriorityWarnDialogSubject.hide()");
                        return hide;
                    }

                    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
                    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
                        Intrinsics.checkNotNullParameter(parent, "parent");
                        Context context = parent.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
                        View m41761u = C40788fB0.m41761u(context, i, parent, false);
                        return i == C37080Xj4.item_inspection_issue_type ? new C2685b(this, m41761u) : i == C45268mk4.item_button_matte_black ? new C2683a(this, m41761u) : new C29735w1(m41761u);
                    }
                }
