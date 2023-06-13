package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.PropertyReportActionOption;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.AbstractC39429ct4;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0005H\u0002R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, m28432d2 = {"Lc94;", "Lct4;", "Lco/bird/android/model/PropertyReportActionOption;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Landroidx/recyclerview/widget/RecyclerView$D;", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "", "E", "g", "Ljava/lang/Integer;", "checkedPosition", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: c94  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C38977c94 extends AbstractC39429ct4<PropertyReportActionOption> {

    /* renamed from: g */
    public Integer f60215g;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m28432d2 = {"Lc94$a;", "Lw1;", "", "position", "", "bind", "Lc94;", "b", "Lc94;", C17296a.f69688o, "()Lc94;", "adapter", "LPe2;", "c", "LPe2;", "binding", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;Lc94;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: c94$a */
    /* loaded from: classes2.dex */
    public static final class C13421a extends C29735w1 {

        /* renamed from: b */
        public final C38977c94 f60216b;

        /* renamed from: c */
        public final C35161Pe2 f60217c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: c94$a$a */
        /* loaded from: classes2.dex */
        public static final class C13422a extends Lambda implements Function1<View, Unit> {
            public C13422a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                AbstractC39429ct4.InterfaceC19633a<PropertyReportActionOption> m44891v;
                int adapterPosition = C13421a.this.getAdapterPosition();
                if (adapterPosition == -1 || !C13421a.this.m61876a().m61877E(adapterPosition) || (m44891v = C13421a.this.m61876a().m44891v()) == null) {
                    return;
                }
                Intrinsics.checkNotNull(view);
                m44891v.mo44887a(view, adapterPosition, C13421a.this.m61876a().m44895q(adapterPosition));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13421a(View view, C38977c94 adapter) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            this.f60216b = adapter;
            C35161Pe2 m90045a = C35161Pe2.m90045a(view);
            Intrinsics.checkNotNullExpressionValue(m90045a, "bind(view)");
            this.f60217c = m90045a;
            C34585Ms2.m94661j(view, new C13422a());
        }

        /* renamed from: a */
        public final C38977c94 m61876a() {
            return this.f60216b;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            PropertyReportActionOption m44895q = this.f60216b.m44895q(i);
            this.f60217c.f28788b.setChecked(m44895q.getChecked());
            this.f60217c.f28789c.setText(this.itemView.getContext().getString(m44895q.getAction().getLabel()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38977c94(Context context) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: E */
    public final boolean m61877E(int i) {
        Integer num = this.f60215g;
        if (num != null && i == num.intValue()) {
            return false;
        }
        Integer num2 = this.f60215g;
        if (num2 != null) {
            int intValue = num2.intValue();
            m44895q(intValue).setChecked(false);
            notifyItemChanged(intValue);
        }
        m44895q(i).setChecked(true);
        notifyItemChanged(i);
        this.f60215g = Integer.valueOf(i);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onBindViewHolder(RecyclerView.AbstractC11834D holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((C29735w1) holder).bind(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public RecyclerView.AbstractC11834D onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new C13421a(C40788fB0.m41761u(m44892u(), C39311cj4.item_property_report_option, parent, false), this);
    }
}
