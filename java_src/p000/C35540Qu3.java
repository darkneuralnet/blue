package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.C11905h;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdKt;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.joda.time.DateTime;
import p000.C35540Qu3;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002&\u001aB\u0019\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\u0004\b$\u0010%J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0014\u0010\u0014\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015R\u001c\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010#\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010\u00160\u00160\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001b¨\u0006'"}, m28432d2 = {"LQu3;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lw1;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "getItemViewType", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "", "LH6;", "sections", "o", "Lio/reactivex/Observable;", "", "p", "Lio/reactivex/subjects/d;", "Lco/bird/android/model/wire/WireBird;", "b", "Lio/reactivex/subjects/d;", "taskPublisher", "LE6;", "c", "LE6;", "adapterData", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "searchPublisher", "<init>", "(Lio/reactivex/subjects/d;)V", C17296a.f69688o, "task-list_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Qu3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35540Qu3 extends RecyclerView.AbstractC11843h<C29735w1> {

    /* renamed from: b */
    public final C24558d<WireBird> f31170b;

    /* renamed from: c */
    public final C1737E6 f31171c;

    /* renamed from: d */
    public final C24558d<String> f31172d;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\n"}, m28432d2 = {"LQu3$a;", "Lw1;", "Lde2;", "b", "Lde2;", "binding", "Landroid/view/View;", "view", "<init>", "(LQu3;Landroid/view/View;)V", "task-list_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Qu3$a */
    /* loaded from: classes3.dex */
    public final class C6976a extends C29735w1 {

        /* renamed from: b */
        public final C39870de2 f31173b;

        /* renamed from: c */
        public final /* synthetic */ C35540Qu3 f31174c;

        @Metadata(m28433d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\n"}, m28432d2 = {"Qu3$a$a", "Ld36;", "", "s", "", "start", "before", "count", "", "onTextChanged", "task-list_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: Qu3$a$a */
        /* loaded from: classes3.dex */
        public static final class C6977a extends C39530d36 {

            /* renamed from: c */
            public final /* synthetic */ C35540Qu3 f31176c;

            public C6977a(C35540Qu3 c35540Qu3) {
                this.f31176c = c35540Qu3;
            }

            @Override // p000.C39530d36, android.text.TextWatcher
            public void onTextChanged(CharSequence s, int i, int i2, int i3) {
                boolean isBlank;
                boolean isBlank2;
                Intrinsics.checkNotNullParameter(s, "s");
                super.onTextChanged(s, i, i2, i3);
                TextView textView = C6976a.this.f31173b.f76980c;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.hint");
                isBlank = StringsKt__StringsJVMKt.isBlank(s);
                C49520tu6.show$default(textView, isBlank, 0, 2, null);
                ImageView imageView = C6976a.this.f31173b.f76979b;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.clear");
                isBlank2 = StringsKt__StringsJVMKt.isBlank(s);
                C49520tu6.show$default(imageView, !isBlank2, 0, 2, null);
                this.f31176c.f31172d.onNext(s.toString());
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Qu3$a$b */
        /* loaded from: classes3.dex */
        public static final class C6978b extends Lambda implements Function1<View, Unit> {
            public C6978b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C6976a.this.f31173b.f76981d.getText().clear();
                C6976a.this.f31173b.f76981d.requestFocus();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6976a(C35540Qu3 c35540Qu3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f31174c = c35540Qu3;
            C39870de2 m43959a = C39870de2.m43959a(view);
            Intrinsics.checkNotNullExpressionValue(m43959a, "bind(view)");
            this.f31173b = m43959a;
            m43959a.f76981d.addTextChangedListener(new C6977a(c35540Qu3));
            ImageView imageView = m43959a.f76979b;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.clear");
            C34585Ms2.m94661j(imageView, new C6978b());
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LQu3$b;", "Lw1;", "", "position", "", "bind", "Lns6;", "b", "Lns6;", "binding", "Landroid/view/View;", "view", "<init>", "(LQu3;Landroid/view/View;)V", "task-list_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorTaskAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorTaskAdapter.kt\nco/bird/android/feature/operator/tasklist/adapter/OperatorTaskAdapter$TaskViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,152:1\n18#2:153\n18#2:158\n9#3,4:154\n9#3,4:159\n*S KotlinDebug\n*F\n+ 1 OperatorTaskAdapter.kt\nco/bird/android/feature/operator/tasklist/adapter/OperatorTaskAdapter$TaskViewHolder\n*L\n108#1:153\n101#1:158\n108#1:154,4\n101#1:159,4\n*E\n"})
    /* renamed from: Qu3$b */
    /* loaded from: classes3.dex */
    public final class C6979b extends C29735w1 {

        /* renamed from: b */
        public final C45943ns6 f31178b;

        /* renamed from: c */
        public final /* synthetic */ C35540Qu3 f31179c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6979b(final C35540Qu3 c35540Qu3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f31179c = c35540Qu3;
            C45943ns6 m22263a = C45943ns6.m22263a(view);
            Intrinsics.checkNotNullExpressionValue(m22263a, "bind(view)");
            this.f31178b = m22263a;
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: Ru3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C35540Qu3.C6979b.m87638b(C35540Qu3.this, this, view2);
                }
            });
        }

        /* renamed from: b */
        public static final void m87638b(C35540Qu3 this$0, C6979b this$1, View view) {
            C24558d c24558d;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Object m105816c = this$0.f31171c.m109394h().get(this$1.getAdapterPosition()).m105816c();
            if (!(m105816c instanceof WireBird)) {
                m105816c = null;
            }
            WireBird wireBird = (WireBird) m105816c;
            if (wireBird != null && (c24558d = this$0.f31170b) != null) {
                c24558d.onNext(wireBird);
            }
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            boolean z2;
            boolean z3;
            DateTime startedAt;
            String string;
            Object m105816c = this.f31179c.f31171c.m109394h().get(i).m105816c();
            String str = null;
            if (!(m105816c instanceof WireBird)) {
                m105816c = null;
            }
            WireBird wireBird = (WireBird) m105816c;
            TextView textView = this.f31178b.f100962d;
            if (wireBird != null) {
                str = wireBird.getCode();
            }
            textView.setText(str);
            boolean z4 = true;
            if (wireBird != null) {
                int batteryLevel = wireBird.getBatteryLevel();
                this.f31178b.f100960b.setText(this.itemView.getContext().getString(C45871nl4.battery_percent, Integer.valueOf(batteryLevel)));
                this.f31178b.f100961c.setPercent(batteryLevel);
            }
            if (wireBird != null && (startedAt = wireBird.getStartedAt()) != null) {
                long currentTimeMillis = System.currentTimeMillis() - startedAt.getMillis();
                if (currentTimeMillis < TimeUnit.MINUTES.toMillis(1L)) {
                    string = this.itemView.getContext().getString(C45871nl4.operator_task_elapsed_seconds, Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis)));
                } else if (currentTimeMillis < TimeUnit.HOURS.toMillis(1L)) {
                    string = this.itemView.getContext().getString(C45871nl4.operator_task_elapsed_minutes, Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(currentTimeMillis)));
                } else if (currentTimeMillis < TimeUnit.DAYS.toMillis(1L)) {
                    string = this.itemView.getContext().getString(C45871nl4.operator_task_elapsed_hours, Long.valueOf(TimeUnit.MILLISECONDS.toHours(currentTimeMillis)));
                } else {
                    string = this.itemView.getContext().getString(C45871nl4.operator_task_elapsed_days, Long.valueOf(TimeUnit.MILLISECONDS.toDays(currentTimeMillis)));
                }
                Intrinsics.checkNotNullExpressionValue(string, "when {\n          timeEla…ElapsedMillis))\n        }");
                this.f31178b.f100964f.setText(string);
            }
            if (wireBird != null && WireBirdKt.isCollect(wireBird)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f31178b.f100963e.setText(this.itemView.getContext().getString(C45871nl4.operator_task_status_collect_label));
                this.f31178b.f100963e.setBackgroundColor(NA0.m94301c(this.itemView.getContext(), C32364Df4.birdRed));
                this.f31178b.f100963e.setTextColor(NA0.m94301c(this.itemView.getContext(), C32364Df4.white));
                return;
            }
            if (wireBird != null && wireBird.getSubmerged()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (wireBird != null && wireBird.getDisconnected()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    if (wireBird == null || !WireBirdKt.isDamaged(wireBird)) {
                        z4 = false;
                    }
                    if (!z4) {
                        this.f31178b.f100963e.setText(this.itemView.getContext().getString(C45871nl4.operator_task_status_ready_label));
                        this.f31178b.f100963e.setBackgroundResource(0);
                        this.f31178b.f100963e.setTextColor(NA0.m94301c(this.itemView.getContext(), C32364Df4.birdNewRoad));
                        return;
                    }
                }
            }
            this.f31178b.f100963e.setText(this.itemView.getContext().getString(C45871nl4.operator_task_status_damaged_label));
            this.f31178b.f100963e.setBackgroundColor(NA0.m94301c(this.itemView.getContext(), C32364Df4.birdRed));
            this.f31178b.f100963e.setTextColor(NA0.m94301c(this.itemView.getContext(), C32364Df4.white));
        }
    }

    public C35540Qu3() {
        this(null, 1, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemCount() {
        return this.f31171c.m109395g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemViewType(int i) {
        return this.f31171c.m109394h().get(i).m105817b();
    }

    /* renamed from: o */
    public final void m87642o(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        if (this.f31171c.m109395g() == 0) {
            this.f31171c.m109400b(sections);
            return;
        }
        C11905h.C11910e mo30a = new C36008Su3().mo30a(this.f31171c.m109392j(), sections);
        this.f31171c.m109399c();
        this.f31171c.m109401a(sections);
        mo30a.m66261d(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C40040dv3());
        }
    }

    /* renamed from: p */
    public final Observable<String> m87641p() {
        return this.f31172d;
    }

    public /* synthetic */ C35540Qu3(C24558d c24558d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c24558d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onBindViewHolder(C29735w1 holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C51186wj4.item_operator_task_list_search ? new C6976a(this, m41761u) : i == C51186wj4.view_operator_task ? new C6979b(this, m41761u) : new C29735w1(m41761u);
    }

    public C35540Qu3(C24558d<WireBird> c24558d) {
        this.f31170b = c24558d;
        this.f31171c = new C1737E6(this);
        C24558d<String> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<String>()");
        this.f31172d = m31902e;
    }
}
