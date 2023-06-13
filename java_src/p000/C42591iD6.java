package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BirdSummaryViewModel;
import co.bird.android.model.Issue;
import co.bird.android.model.LegacyRepair;
import co.bird.android.model.OperatorRole;
import co.bird.android.model.User;
import co.bird.android.model.WorkOrder;
import co.bird.android.model.constant.BirdModel;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0007\u001b\u001c\u0012\u0016\u001d\u001e\u001fB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000eR\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\n0\n0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006 "}, m28432d2 = {"LiD6;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "LF6;", "r", "Lio/reactivex/Observable;", "v", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "addSubject", "Ljava/text/SimpleDateFormat;", DateTokenConverter.CONVERTER_KEY, "Ljava/text/SimpleDateFormat;", "repairDateFormat", "<init>", "()V", C17296a.f69688o, "b", "e", "f", "g", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: iD6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42591iD6 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<Unit> f86954c;

    /* renamed from: d */
    public final SimpleDateFormat f86955d;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\n"}, m28432d2 = {"LiD6$a;", "Lw1;", "Lng2;", "b", "Lng2;", "binding", "Landroid/view/View;", "view", "<init>", "(LiD6;Landroid/view/View;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: iD6$a */
    /* loaded from: classes3.dex */
    public final class C23162a extends C29735w1 {

        /* renamed from: b */
        public final C45819ng2 f86956b;

        /* renamed from: c */
        public final /* synthetic */ C42591iD6 f86957c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: iD6$a$a */
        /* loaded from: classes3.dex */
        public static final class C23163a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C42591iD6 f86958g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23163a(C42591iD6 c42591iD6) {
                super(1);
                this.f86958g = c42591iD6;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f86958g.f86954c.onNext(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23162a(C42591iD6 c42591iD6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f86957c = c42591iD6;
            C45819ng2 m23333a = C45819ng2.m23333a(view);
            Intrinsics.checkNotNullExpressionValue(m23333a, "bind(view)");
            this.f86956b = m23333a;
            Button button = m23333a.f100306b;
            Intrinsics.checkNotNullExpressionValue(button, "binding.add");
            C34585Ms2.m94661j(button, new C23163a(c42591iD6));
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LiD6$b;", "Lw1;", "", "position", "", "bind", "LQa2;", "b", "LQa2;", "binding", "Landroid/view/View;", "view", "<init>", "(LiD6;Landroid/view/View;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWorkOrderDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderDetailsAdapter.kt\nco/bird/android/feature/workorders/details/adapters/WorkOrderDetailsAdapter$BirdInfoViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,139:1\n18#2:140\n9#3,4:141\n*S KotlinDebug\n*F\n+ 1 WorkOrderDetailsAdapter.kt\nco/bird/android/feature/workorders/details/adapters/WorkOrderDetailsAdapter$BirdInfoViewHolder\n*L\n66#1:140\n66#1:141,4\n*E\n"})
    /* renamed from: iD6$b */
    /* loaded from: classes3.dex */
    public final class C23164b extends C29735w1 {

        /* renamed from: b */
        public final C35359Qa2 f86959b;

        /* renamed from: c */
        public final /* synthetic */ C42591iD6 f86960c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23164b(C42591iD6 c42591iD6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f86960c = c42591iD6;
            C35359Qa2 m88392a = C35359Qa2.m88392a(view);
            Intrinsics.checkNotNullExpressionValue(m88392a, "bind(view)");
            this.f86959b = m88392a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f86960c.m94545o().m109394h().get(i).m105816c();
            Drawable drawable = null;
            if (!(m105816c instanceof BirdSummaryViewModel)) {
                m105816c = null;
            }
            BirdSummaryViewModel birdSummaryViewModel = (BirdSummaryViewModel) m105816c;
            if (birdSummaryViewModel != null) {
                ImageView imageView = this.f86959b.f30541d;
                BirdModel model = birdSummaryViewModel.getModel();
                if (model != null) {
                    Context context = this.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
                    drawable = C6327PM.m90445a(model, context);
                }
                imageView.setImageDrawable(drawable);
                this.f86959b.f30540c.setText(birdSummaryViewModel.getCode());
                this.f86959b.f30543f.setText(birdSummaryViewModel.getDisplayModel());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LiD6$c;", "Lw1;", "", "position", "", "bind", "Log2;", "b", "Log2;", "binding", "Landroid/view/View;", "view", "<init>", "(LiD6;Landroid/view/View;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWorkOrderDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderDetailsAdapter.kt\nco/bird/android/feature/workorders/details/adapters/WorkOrderDetailsAdapter$DetailViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,139:1\n18#2:140\n9#3,4:141\n*S KotlinDebug\n*F\n+ 1 WorkOrderDetailsAdapter.kt\nco/bird/android/feature/workorders/details/adapters/WorkOrderDetailsAdapter$DetailViewHolder\n*L\n125#1:140\n125#1:141,4\n*E\n"})
    /* renamed from: iD6$c */
    /* loaded from: classes3.dex */
    public final class C23165c extends C29735w1 {

        /* renamed from: b */
        public final C46412og2 f86961b;

        /* renamed from: c */
        public final /* synthetic */ C42591iD6 f86962c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23165c(C42591iD6 c42591iD6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f86962c = c42591iD6;
            C46412og2 m20664a = C46412og2.m20664a(view);
            Intrinsics.checkNotNullExpressionValue(m20664a, "bind(view)");
            this.f86961b = m20664a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            String str;
            Object m105816c = this.f86962c.m94545o().m109394h().get(i).m105816c();
            String str2 = null;
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            TextView textView = this.f86961b.f102304b;
            if (pair != null) {
                str = (String) pair.getFirst();
            } else {
                str = null;
            }
            textView.setText(str);
            TextView textView2 = this.f86961b.f102305c;
            if (pair != null) {
                str2 = (String) pair.getSecond();
            }
            textView2.setText(str2);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LiD6$d;", "Lw1;", "", "position", "", "bind", "Lqg2;", "b", "Lqg2;", "binding", "Landroid/view/View;", "view", "<init>", "(LiD6;Landroid/view/View;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWorkOrderDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderDetailsAdapter.kt\nco/bird/android/feature/workorders/details/adapters/WorkOrderDetailsAdapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n18#2:140\n9#3,4:141\n1#4:145\n*S KotlinDebug\n*F\n+ 1 WorkOrderDetailsAdapter.kt\nco/bird/android/feature/workorders/details/adapters/WorkOrderDetailsAdapter$HeaderViewHolder\n*L\n78#1:140\n78#1:141,4\n*E\n"})
    /* renamed from: iD6$d */
    /* loaded from: classes3.dex */
    public final class C23166d extends C29735w1 {

        /* renamed from: b */
        public final C47598qg2 f86963b;

        /* renamed from: c */
        public final /* synthetic */ C42591iD6 f86964c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23166d(C42591iD6 c42591iD6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f86964c = c42591iD6;
            C47598qg2 m17253a = C47598qg2.m17253a(view);
            Intrinsics.checkNotNullExpressionValue(m17253a, "bind(view)");
            this.f86963b = m17253a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f86964c.m94545o().m109394h().get(i).m105816c();
            String str = null;
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null) {
                String str2 = (String) pair.component2();
                TextView textView = this.f86963b.f105600c;
                String statusDisplay = ((WorkOrder) pair.component1()).getStatusDisplay();
                if (statusDisplay != null) {
                    str = StringsKt__StringsJVMKt.capitalize(statusDisplay);
                }
                textView.setText(str);
                this.f86963b.f105599b.setText(str2);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LiD6$e;", "Lw1;", "", "position", "", "bind", "LAc2;", "b", "LAc2;", "binding", "Landroid/view/View;", "view", "<init>", "(LiD6;Landroid/view/View;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWorkOrderDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderDetailsAdapter.kt\nco/bird/android/feature/workorders/details/adapters/WorkOrderDetailsAdapter$IssueHeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n18#2:140\n9#3,4:141\n1#4:145\n*S KotlinDebug\n*F\n+ 1 WorkOrderDetailsAdapter.kt\nco/bird/android/feature/workorders/details/adapters/WorkOrderDetailsAdapter$IssueHeaderViewHolder\n*L\n89#1:140\n89#1:141,4\n*E\n"})
    /* renamed from: iD6$e */
    /* loaded from: classes3.dex */
    public final class C23167e extends C29735w1 {

        /* renamed from: b */
        public final C31633Ac2 f86965b;

        /* renamed from: c */
        public final /* synthetic */ C42591iD6 f86966c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23167e(C42591iD6 c42591iD6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f86966c = c42591iD6;
            C31633Ac2 m115442a = C31633Ac2.m115442a(view);
            Intrinsics.checkNotNullExpressionValue(m115442a, "bind(view)");
            this.f86965b = m115442a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            Object m105816c = this.f86966c.m94545o().m109394h().get(i).m105816c();
            String str = null;
            if (!(m105816c instanceof Issue)) {
                m105816c = null;
            }
            Issue issue = (Issue) m105816c;
            if (issue != null) {
                this.f86965b.f861b.setText(issue.getDisplay());
                this.f86965b.f862c.setText(issue.getSourceDisplay());
                TextView textView = this.f86965b.f862c;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.source");
                if (issue.getSourceDisplay() != null) {
                    z = true;
                } else {
                    z = false;
                }
                C49520tu6.show$default(textView, z, 0, 2, null);
                TextView textView2 = this.f86965b.f863d;
                String statusDisplay = issue.getStatusDisplay();
                if (statusDisplay != null) {
                    str = StringsKt__StringsJVMKt.capitalize(statusDisplay);
                }
                textView2.setText(str);
                Integer statusColor = issue.getStatusColor();
                if (statusColor != null) {
                    TextView textView3 = this.f86965b.f863d;
                    Intrinsics.checkNotNullExpressionValue(textView3, "binding.status");
                    textView3.setTextColor(statusColor.intValue());
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LiD6$f;", "Lw1;", "", "position", "", "bind", "Ltg2;", "b", "Ltg2;", "binding", "Landroid/view/View;", "view", "<init>", "(LiD6;Landroid/view/View;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWorkOrderDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderDetailsAdapter.kt\nco/bird/android/feature/workorders/details/adapters/WorkOrderDetailsAdapter$RepairViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,139:1\n18#2:140\n9#3,4:141\n*S KotlinDebug\n*F\n+ 1 WorkOrderDetailsAdapter.kt\nco/bird/android/feature/workorders/details/adapters/WorkOrderDetailsAdapter$RepairViewHolder\n*L\n104#1:140\n104#1:141,4\n*E\n"})
    /* renamed from: iD6$f */
    /* loaded from: classes3.dex */
    public final class C23168f extends C29735w1 {

        /* renamed from: b */
        public final C49376tg2 f86967b;

        /* renamed from: c */
        public final /* synthetic */ C42591iD6 f86968c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23168f(C42591iD6 c42591iD6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f86968c = c42591iD6;
            C49376tg2 m11930a = C49376tg2.m11930a(view);
            Intrinsics.checkNotNullExpressionValue(m11930a, "bind(view)");
            this.f86967b = m11930a;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
        @Override // p000.C29735w1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void bind(int i) {
            Date date;
            String str;
            User user;
            List<OperatorRole> operatorRoles;
            Object first;
            Object m105816c = this.f86968c.m94545o().m109394h().get(i).m105816c();
            String str2 = null;
            if (!(m105816c instanceof LegacyRepair)) {
                m105816c = null;
            }
            LegacyRepair legacyRepair = (LegacyRepair) m105816c;
            if (legacyRepair != null) {
                C42591iD6 c42591iD6 = this.f86968c;
                this.f86967b.f110859d.setText(legacyRepair.getDisplay());
                TextView textView = this.f86967b.f110861f;
                SimpleDateFormat simpleDateFormat = c42591iD6.f86955d;
                DateTime createdAt = legacyRepair.getCreatedAt();
                if (createdAt != null) {
                    date = createdAt.toDate();
                } else {
                    date = null;
                }
                textView.setText(simpleDateFormat.format(date));
                TextView textView2 = this.f86967b.f110860e;
                User user2 = legacyRepair.getUser();
                if (user2 != null && (operatorRoles = user2.getOperatorRoles()) != null) {
                    first = CollectionsKt___CollectionsKt.first((List<? extends Object>) operatorRoles);
                    OperatorRole operatorRole = (OperatorRole) first;
                    if (operatorRole != null) {
                        str = operatorRole.getTitle();
                        textView2.setText(str);
                        TextView textView3 = this.f86967b.f110858c;
                        user = legacyRepair.getUser();
                        if (user != null) {
                            str2 = user.getEmail();
                        }
                        textView3.setText(str2);
                    }
                }
                str = null;
                textView2.setText(str);
                TextView textView32 = this.f86967b.f110858c;
                user = legacyRepair.getUser();
                if (user != null) {
                }
                textView32.setText(str2);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LiD6$g;", "Lw1;", "", "position", "", "bind", "Lpg2;", "b", "Lpg2;", "binding", "Landroid/view/View;", "view", "<init>", "(LiD6;Landroid/view/View;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWorkOrderDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderDetailsAdapter.kt\nco/bird/android/feature/workorders/details/adapters/WorkOrderDetailsAdapter$SectionHeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,139:1\n18#2:140\n9#3,4:141\n*S KotlinDebug\n*F\n+ 1 WorkOrderDetailsAdapter.kt\nco/bird/android/feature/workorders/details/adapters/WorkOrderDetailsAdapter$SectionHeaderViewHolder\n*L\n117#1:140\n117#1:141,4\n*E\n"})
    /* renamed from: iD6$g */
    /* loaded from: classes3.dex */
    public final class C23169g extends C29735w1 {

        /* renamed from: b */
        public final C47005pg2 f86969b;

        /* renamed from: c */
        public final /* synthetic */ C42591iD6 f86970c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23169g(C42591iD6 c42591iD6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f86970c = c42591iD6;
            C47005pg2 m18998a = C47005pg2.m18998a(view);
            Intrinsics.checkNotNullExpressionValue(m18998a, "bind(view)");
            this.f86969b = m18998a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            TextView textView = this.f86969b.f103904b;
            Object m105816c = this.f86970c.m94545o().m109394h().get(i).m105816c();
            if (m105816c != null) {
                z = m105816c instanceof CharSequence;
            } else {
                z = true;
            }
            if (!z) {
                m105816c = null;
            }
            textView.setText((CharSequence) m105816c);
        }
    }

    public C42591iD6() {
        C24558d<Unit> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Unit>()");
        this.f86954c = m31902e;
        this.f86955d = new SimpleDateFormat("h:mm a", Locale.getDefault());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C46149oD6());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C43184jD6();
    }

    /* renamed from: v */
    public final Observable<Unit> m34331v() {
        Observable<Unit> hide = this.f86954c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "addSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C37080Xj4.item_bird_code_and_model ? new C23164b(this, m41761u) : i == C37080Xj4.item_work_order_header ? new C23166d(this, m41761u) : i == C37080Xj4.item_issue_header ? new C23167e(this, m41761u) : i == C37080Xj4.item_work_order_repair ? new C23168f(this, m41761u) : i == C37080Xj4.item_work_order_details_header ? new C23169g(this, m41761u) : i == C37080Xj4.item_work_order_details ? new C23165c(this, m41761u) : i == C37080Xj4.item_work_order_details_add ? new C23162a(this, m41761u) : new C29735w1(m41761u);
    }
}
