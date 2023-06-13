package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.analytics.AnalyticsDebugEvent;
import com.facebook.share.internal.C17296a;
import io.reactivex.subjects.C24558d;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016R%\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00050\u00050\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, m28432d2 = {"Lla;", "Lct4;", "Lco/bird/android/model/analytics/AnalyticsDebugEvent;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Landroidx/recyclerview/widget/RecyclerView$D;", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "g", "Lio/reactivex/subjects/d;", "E", "()Lio/reactivex/subjects/d;", "itemClicks", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: la */
/* loaded from: classes2.dex */
public final class C25719la extends AbstractC39429ct4<AnalyticsDebugEvent> {

    /* renamed from: g */
    public final C24558d<Integer> f96329g;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m28432d2 = {"Lla$a;", "Lw1;", "", "position", "", "bind", "Landroid/view/View;", "b", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "Lla;", "c", "Lla;", "getAdapter", "()Lla;", "adapter", "LBp6;", DateTokenConverter.CONVERTER_KEY, "LBp6;", "binding", "<init>", "(Lla;Landroid/view/View;Lla;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: la$a */
    /* loaded from: classes2.dex */
    public final class C25720a extends C29735w1 {

        /* renamed from: b */
        public final View f96330b;

        /* renamed from: c */
        public final C25719la f96331c;

        /* renamed from: d */
        public final C31988Bp6 f96332d;

        /* renamed from: e */
        public final /* synthetic */ C25719la f96333e;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: la$a$a */
        /* loaded from: classes2.dex */
        public static final class C25721a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C25719la f96334g;

            /* renamed from: h */
            public final /* synthetic */ int f96335h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25721a(C25719la c25719la, int i) {
                super(1);
                this.f96334g = c25719la;
                this.f96335h = i;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f96334g.m27146E().onNext(Integer.valueOf(this.f96335h));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25720a(C25719la c25719la, View view, C25719la adapter) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            this.f96333e = c25719la;
            this.f96330b = view;
            this.f96331c = adapter;
            C31988Bp6 m113454a = C31988Bp6.m113454a(view);
            Intrinsics.checkNotNullExpressionValue(m113454a, "bind(view)");
            this.f96332d = m113454a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            String string;
            AnalyticsDebugEvent m44895q = this.f96331c.m44895q(i);
            long currentTimeMillis = System.currentTimeMillis() - m44895q.getTimestamp();
            if (currentTimeMillis <= 0) {
                currentTimeMillis = 0;
            }
            if (currentTimeMillis <= 1000) {
                string = getContext().getString(C45278ml4.time_elapsed_now);
            } else if (currentTimeMillis < TimeUnit.MINUTES.toMillis(1L)) {
                string = getContext().getString(C45871nl4.operator_task_elapsed_seconds, Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis)));
            } else if (currentTimeMillis < TimeUnit.HOURS.toMillis(1L)) {
                string = getContext().getString(C45871nl4.operator_task_elapsed_minutes, Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(currentTimeMillis)));
            } else if (currentTimeMillis < TimeUnit.DAYS.toMillis(1L)) {
                string = getContext().getString(C45871nl4.operator_task_elapsed_hours, Long.valueOf(TimeUnit.MILLISECONDS.toHours(currentTimeMillis)));
            } else {
                string = getContext().getString(C45871nl4.operator_task_elapsed_days, Long.valueOf(TimeUnit.MILLISECONDS.toDays(currentTimeMillis)));
            }
            Intrinsics.checkNotNullExpressionValue(string, "when {\n        timeElaps…meElapsedMillis))\n      }");
            this.f96332d.f2936d.setText(string);
            this.f96332d.f2934b.setText(m44895q.getEvent().getName());
            C34585Ms2.m94661j(this.f96330b, new C25721a(this.f96333e, i));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25719la(Context context) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
        C24558d<Integer> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Int>()");
        this.f96329g = m31902e;
    }

    /* renamed from: E */
    public final C24558d<Integer> m27146E() {
        return this.f96329g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onBindViewHolder(RecyclerView.AbstractC11834D holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((C25720a) holder).bind(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public RecyclerView.AbstractC11834D onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new C25720a(this, C40788fB0.m41761u(m44892u(), C39311cj4.view_analytic_events_debugger_item, parent, false), this);
    }
}
