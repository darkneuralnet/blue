package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Issue;
import co.bird.android.model.RepairScope;
import co.bird.android.model.RepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import io.reactivex.Observable;
import io.reactivex.subjects.C24552a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b&\u0018\u00002\u00020\u0001:\u0004$%\u0017\u001aB\u0007¢\u0006\u0004\b\"\u0010#J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000eJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000eJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u000eJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eJ\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eR\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\n0\n0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\n0\n0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\n0\n0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00120\u00120\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\"\u0010!\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00120\u00120\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018¨\u0006&"}, m28432d2 = {"LtD;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "LF6;", "r", "Lio/reactivex/Observable;", "w", "v", "x", "Lco/bird/android/model/Issue;", "y", "A", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/a;", "commandSubject", DateTokenConverter.CONVERTER_KEY, "addRepairSubject", "e", "idToolsSubject", "f", "issueRepairSubject", "g", "issueStatusSubject", "<init>", "()V", C17296a.f69688o, "b", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: tD */
/* loaded from: classes3.dex */
public abstract class AbstractC28652tD extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24552a<Unit> f110142c;

    /* renamed from: d */
    public final C24552a<Unit> f110143d;

    /* renamed from: e */
    public final C24552a<Unit> f110144e;

    /* renamed from: f */
    public final C24552a<Issue> f110145f;

    /* renamed from: g */
    public final C24552a<Issue> f110146g;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LtD$a;", "Lw1;", "", "position", "", "bind", "Landroid/widget/Button;", "b", "Landroid/widget/Button;", "button", "Landroid/view/View;", "view", "<init>", "(LtD;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBaseRepairOverviewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRepairOverviewAdapter.kt\nco/bird/android/feature/repair/v1/base/adapters/BaseRepairOverviewAdapter$ButtonViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,134:1\n18#2:135\n9#3,4:136\n*S KotlinDebug\n*F\n+ 1 BaseRepairOverviewAdapter.kt\nco/bird/android/feature/repair/v1/base/adapters/BaseRepairOverviewAdapter$ButtonViewHolder\n*L\n77#1:135\n77#1:136,4\n*E\n"})
    /* renamed from: tD$a */
    /* loaded from: classes3.dex */
    public final class C28653a extends C29735w1 {

        /* renamed from: b */
        public final Button f110147b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC28652tD f110148c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nBaseRepairOverviewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRepairOverviewAdapter.kt\nco/bird/android/feature/repair/v1/base/adapters/BaseRepairOverviewAdapter$ButtonViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,134:1\n18#2:135\n9#3,4:136\n*S KotlinDebug\n*F\n+ 1 BaseRepairOverviewAdapter.kt\nco/bird/android/feature/repair/v1/base/adapters/BaseRepairOverviewAdapter$ButtonViewHolder$1\n*L\n66#1:135\n66#1:136,4\n*E\n"})
        /* renamed from: tD$a$a */
        /* loaded from: classes3.dex */
        public static final class C28654a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ AbstractC28652tD f110149g;

            /* renamed from: h */
            public final /* synthetic */ C28653a f110150h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28654a(AbstractC28652tD abstractC28652tD, C28653a c28653a) {
                super(1);
                this.f110149g = abstractC28652tD;
                this.f110150h = c28653a;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Object m105816c = this.f110149g.m94545o().m109394h().get(this.f110150h.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof RB4)) {
                    m105816c = null;
                }
                RB4 rb4 = (RB4) m105816c;
                if (rb4 != null) {
                    AbstractC28652tD abstractC28652tD = this.f110149g;
                    if (rb4 instanceof C39347cn0) {
                        abstractC28652tD.f110142c.onNext(Unit.INSTANCE);
                    } else if (rb4 instanceof C28529t7) {
                        abstractC28652tD.f110143d.onNext(Unit.INSTANCE);
                    } else if (rb4 instanceof C48040rQ1) {
                        abstractC28652tD.f110144e.onNext(Unit.INSTANCE);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28653a(AbstractC28652tD abstractC28652tD, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f110148c = abstractC28652tD;
            Button button = (Button) view;
            this.f110147b = button;
            C34585Ms2.m94661j(button, new C28654a(abstractC28652tD, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Button button = this.f110147b;
            Object m105816c = this.f110148c.m94545o().m109394h().get(i).m105816c();
            String str = null;
            if (!(m105816c instanceof RB4)) {
                m105816c = null;
            }
            RB4 rb4 = (RB4) m105816c;
            if (rb4 != null) {
                str = rb4.mo13042a();
            }
            button.setText(str);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LtD$b;", "Lw1;", "", "position", "", "bind", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "repair", "Landroid/view/View;", "view", "<init>", "(LtD;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBaseRepairOverviewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRepairOverviewAdapter.kt\nco/bird/android/feature/repair/v1/base/adapters/BaseRepairOverviewAdapter$IssueRepairViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,134:1\n18#2:135\n9#3,4:136\n*S KotlinDebug\n*F\n+ 1 BaseRepairOverviewAdapter.kt\nco/bird/android/feature/repair/v1/base/adapters/BaseRepairOverviewAdapter$IssueRepairViewHolder\n*L\n106#1:135\n106#1:136,4\n*E\n"})
    /* renamed from: tD$b */
    /* loaded from: classes3.dex */
    public final class C28655b extends C29735w1 {

        /* renamed from: b */
        public final TextView f110151b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC28652tD f110152c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28655b(AbstractC28652tD abstractC28652tD, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f110152c = abstractC28652tD;
            this.f110151b = (TextView) view;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            String display;
            Object m105816c = this.f110152c.m94545o().m109394h().get(i).m105816c();
            if (!(m105816c instanceof RepairType)) {
                m105816c = null;
            }
            RepairType repairType = (RepairType) m105816c;
            if (repairType != null) {
                List<RepairScope> repairScopes = repairType.getRepairScopes();
                boolean z = false;
                if (repairScopes != null && repairScopes.contains(RepairScope.INTERNAL)) {
                    z = true;
                }
                if (z) {
                    display = repairType.getNotes();
                } else {
                    display = repairType.getDisplay();
                }
                this.f110151b.setText("• " + display);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u001c\u0010\u0010\u001a\n \u0007*\u0004\u0018\u00010\r0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, m28432d2 = {"LtD$c;", "Lw1;", "", "position", "", "bind", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "b", "Landroid/widget/TextView;", "issue", "c", Stripe3ds2AuthParams.FIELD_SOURCE, "Landroid/widget/Button;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/Button;", "status", "Landroid/view/View;", "view", "<init>", "(LtD;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBaseRepairOverviewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRepairOverviewAdapter.kt\nco/bird/android/feature/repair/v1/base/adapters/BaseRepairOverviewAdapter$IssueStatusViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n18#2:135\n9#3,4:136\n1#4:140\n*S KotlinDebug\n*F\n+ 1 BaseRepairOverviewAdapter.kt\nco/bird/android/feature/repair/v1/base/adapters/BaseRepairOverviewAdapter$IssueStatusViewHolder\n*L\n93#1:135\n93#1:136,4\n*E\n"})
    /* renamed from: tD$c */
    /* loaded from: classes3.dex */
    public final class C28656c extends C29735w1 {

        /* renamed from: b */
        public final TextView f110153b;

        /* renamed from: c */
        public final TextView f110154c;

        /* renamed from: d */
        public final Button f110155d;

        /* renamed from: e */
        public final /* synthetic */ AbstractC28652tD f110156e;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nBaseRepairOverviewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRepairOverviewAdapter.kt\nco/bird/android/feature/repair/v1/base/adapters/BaseRepairOverviewAdapter$IssueStatusViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n18#2:135\n9#3,4:136\n1#4:140\n*S KotlinDebug\n*F\n+ 1 BaseRepairOverviewAdapter.kt\nco/bird/android/feature/repair/v1/base/adapters/BaseRepairOverviewAdapter$IssueStatusViewHolder$1\n*L\n88#1:135\n88#1:136,4\n*E\n"})
        /* renamed from: tD$c$a */
        /* loaded from: classes3.dex */
        public static final class C28657a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ AbstractC28652tD f110157g;

            /* renamed from: h */
            public final /* synthetic */ C28656c f110158h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28657a(AbstractC28652tD abstractC28652tD, C28656c c28656c) {
                super(1);
                this.f110157g = abstractC28652tD;
                this.f110158h = c28656c;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Object m105816c = this.f110157g.m94545o().m109394h().get(this.f110158h.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof Issue)) {
                    m105816c = null;
                }
                Issue issue = (Issue) m105816c;
                if (issue != null) {
                    this.f110157g.f110146g.onNext(issue);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28656c(AbstractC28652tD abstractC28652tD, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f110156e = abstractC28652tD;
            this.f110153b = (TextView) view.findViewById(C35658Rh4.issue);
            this.f110154c = (TextView) view.findViewById(C35658Rh4.source);
            Button status = (Button) view.findViewById(C35658Rh4.status);
            this.f110155d = status;
            Intrinsics.checkNotNullExpressionValue(status, "status");
            C34585Ms2.m94661j(status, new C28657a(abstractC28652tD, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f110156e.m94545o().m109394h().get(i).m105816c();
            String str = null;
            if (!(m105816c instanceof Issue)) {
                m105816c = null;
            }
            Issue issue = (Issue) m105816c;
            if (issue != null) {
                this.f110153b.setText(issue.getDisplay());
                this.f110154c.setText(issue.getSourceDisplay());
                Button button = this.f110155d;
                String statusDisplay = issue.getStatusDisplay();
                if (statusDisplay != null) {
                    str = StringsKt__StringsJVMKt.capitalize(statusDisplay);
                }
                button.setText(str);
                Integer statusColor = issue.getStatusColor();
                if (statusColor != null) {
                    Button button2 = this.f110155d;
                    Intrinsics.checkNotNullExpressionValue(button2, "this.status");
                    button2.setTextColor(statusColor.intValue());
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LtD$d;", "Lw1;", "", "position", "", "bind", "Landroid/widget/Button;", "b", "Landroid/widget/Button;", "button", "Landroid/view/View;", "view", "<init>", "(LtD;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBaseRepairOverviewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRepairOverviewAdapter.kt\nco/bird/android/feature/repair/v1/base/adapters/BaseRepairOverviewAdapter$RepairButtonViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,134:1\n18#2:135\n9#3,4:136\n*S KotlinDebug\n*F\n+ 1 BaseRepairOverviewAdapter.kt\nco/bird/android/feature/repair/v1/base/adapters/BaseRepairOverviewAdapter$RepairButtonViewHolder\n*L\n130#1:135\n130#1:136,4\n*E\n"})
    /* renamed from: tD$d */
    /* loaded from: classes3.dex */
    public final class C28658d extends C29735w1 {

        /* renamed from: b */
        public final Button f110159b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC28652tD f110160c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nBaseRepairOverviewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRepairOverviewAdapter.kt\nco/bird/android/feature/repair/v1/base/adapters/BaseRepairOverviewAdapter$RepairButtonViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n18#2:135\n9#3,4:136\n1#4:140\n*S KotlinDebug\n*F\n+ 1 BaseRepairOverviewAdapter.kt\nco/bird/android/feature/repair/v1/base/adapters/BaseRepairOverviewAdapter$RepairButtonViewHolder$1\n*L\n123#1:135\n123#1:136,4\n*E\n"})
        /* renamed from: tD$d$a */
        /* loaded from: classes3.dex */
        public static final class C28659a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ AbstractC28652tD f110161g;

            /* renamed from: h */
            public final /* synthetic */ C28658d f110162h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28659a(AbstractC28652tD abstractC28652tD, C28658d c28658d) {
                super(1);
                this.f110161g = abstractC28652tD;
                this.f110162h = c28658d;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Issue issue;
                Object m105816c = this.f110161g.m94545o().m109394h().get(this.f110162h.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof Pair)) {
                    m105816c = null;
                }
                Pair pair = (Pair) m105816c;
                if (pair == null || (issue = (Issue) pair.getFirst()) == null) {
                    return;
                }
                this.f110161g.f110145f.onNext(issue);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28658d(AbstractC28652tD abstractC28652tD, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f110160c = abstractC28652tD;
            Button button = (Button) view;
            this.f110159b = button;
            C34585Ms2.m94661j(button, new C28659a(abstractC28652tD, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Button button = this.f110159b;
            Object m105816c = this.f110160c.m94545o().m109394h().get(getAdapterPosition()).m105816c();
            String str = null;
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null) {
                str = (String) pair.getSecond();
            }
            button.setText(str);
        }
    }

    public AbstractC28652tD() {
        C24552a<Unit> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<Unit>()");
        this.f110142c = m31922e;
        C24552a<Unit> m31922e2 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e2, "create<Unit>()");
        this.f110143d = m31922e2;
        C24552a<Unit> m31922e3 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e3, "create<Unit>()");
        this.f110144e = m31922e3;
        C24552a<Issue> m31922e4 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e4, "create<Issue>()");
        this.f110145f = m31922e4;
        C24552a<Issue> m31922e5 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e5, "create<Issue>()");
        this.f110146g = m31922e5;
    }

    /* renamed from: A */
    public final Observable<Issue> m12600A() {
        Observable<Issue> hide = this.f110146g.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "issueStatusSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new WB4());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new QB4();
    }

    /* renamed from: v */
    public final Observable<Unit> m12599v() {
        Observable<Unit> hide = this.f110143d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "addRepairSubject.hide()");
        return hide;
    }

    /* renamed from: w */
    public final Observable<Unit> m12598w() {
        Observable<Unit> hide = this.f110142c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "commandSubject.hide()");
        return hide;
    }

    /* renamed from: x */
    public final Observable<Unit> m12597x() {
        Observable<Unit> hide = this.f110144e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "idToolsSubject.hide()");
        return hide;
    }

    /* renamed from: y */
    public final Observable<Issue> m12596y() {
        Observable<Issue> hide = this.f110145f.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "issueRepairSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C45268mk4.item_button_secondary ? new C28653a(this, m41761u) : i == C32634Ej4.item_repair_status ? new C28656c(this, m41761u) : i == C32634Ej4.item_issue_repair ? new C28655b(this, m41761u) : i == C32634Ej4.item_dropdown_repair_button ? new C28658d(this, m41761u) : new C29735w1(m41761u);
    }
}
