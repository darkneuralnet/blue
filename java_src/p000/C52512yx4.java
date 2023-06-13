package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p000.C52512yx4;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u0016¨\u0006\u0017"}, m28432d2 = {"Lyx4;", "LOr5;", "Lc01;", "item", "", "K", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Landroidx/recyclerview/widget/RecyclerView$D;", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "i", C17296a.f69688o, "b", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: yx4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C52512yx4 extends AbstractC35047Or5<C38884c01> {

    /* renamed from: i */
    public static final C30787a f120442i = new C30787a(null);

    /* renamed from: j */
    public static final DateTimeFormatter f120443j = DateTimeFormat.forStyle("-S");

    /* renamed from: k */
    public static final DateTimeFormatter f120444k = DateTimeFormat.forStyle("L-");

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\t"}, m28432d2 = {"Lyx4$a;", "", "Lorg/joda/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "DATE_FORMATTER", "Lorg/joda/time/format/DateTimeFormatter;", "TIME_FORMATTER", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: yx4$a */
    /* loaded from: classes2.dex */
    public static final class C30787a {
        public /* synthetic */ C30787a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C30787a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m28432d2 = {"Lyx4$b;", "Lw1;", "", "position", "", "bind", "Lyx4;", "b", "Lyx4;", "getAdapter", "()Lyx4;", "adapter", "LXe2;", "c", "LXe2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lyx4;Landroid/view/View;Lyx4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: yx4$b */
    /* loaded from: classes2.dex */
    public final class C30788b extends C29735w1 {

        /* renamed from: b */
        public final C52512yx4 f120445b;

        /* renamed from: c */
        public final C37033Xe2 f120446c;

        /* renamed from: d */
        public final /* synthetic */ C52512yx4 f120447d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30788b(C52512yx4 c52512yx4, View view, C52512yx4 adapter) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            this.f120447d = c52512yx4;
            this.f120445b = adapter;
            C37033Xe2 m76744a = C37033Xe2.m76744a(view);
            Intrinsics.checkNotNullExpressionValue(m76744a, "bind(view)");
            this.f120446c = m76744a;
        }

        /* renamed from: b */
        public static final void m2215b(C30788b this$0, C38884c01 item, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(item, "$item");
            this$0.f120445b.m91276H(item);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            if (i == this.f120447d.m91277F()) {
                this.itemView.setBackground(NA0.m94299e(getContext(), C33309Hg4.frame_rectangle_border_rounded_large_radius_purple));
            } else {
                this.itemView.setBackground(NA0.m94299e(getContext(), C33309Hg4.frame_rectangle_border_rounded_large_radius));
            }
            final C38884c01 m44895q = this.f120445b.m44895q(i);
            this.f120446c.f43492b.setText(C52512yx4.f120444k.print(m44895q.m62044c()));
            this.f120446c.f43493c.setText(getContext().getString(C45871nl4.date_time_range, C52512yx4.f120443j.print(m44895q.m62044c()), C52512yx4.f120443j.print(m44895q.m62045b())));
            this.f120446c.f43494d.setText(C52512yx4.f120444k.print(m44895q.m62042e()));
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: zx4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C52512yx4.C30788b.m2215b(C52512yx4.C30788b.this, m44895q, view);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52512yx4(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // p000.AbstractC35047Or5
    /* renamed from: K */
    public String getId(C38884c01 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item.m62043d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onBindViewHolder(RecyclerView.AbstractC11834D holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((C29735w1) holder).bind(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public RecyclerView.AbstractC11834D onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new C30788b(this, C40788fB0.m41761u(m44892u(), C39311cj4.item_rental_date, parent, false), this);
    }
}
