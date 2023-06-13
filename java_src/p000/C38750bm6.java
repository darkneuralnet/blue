package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireDisplayValue;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, m28432d2 = {"Lbm6;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "<init>", "()V", C17296a.f69688o, "health-check_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: bm6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38750bm6 extends AbstractC52206yS0 {

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0010\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0012\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0015"}, m28432d2 = {"Lbm6$a;", "Lw1;", "", "position", "", "bind", "Landroid/view/View;", "b", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "c", "Landroid/widget/TextView;", "title", DateTokenConverter.CONVERTER_KEY, "description", "<init>", "(Lbm6;Landroid/view/View;)V", "health-check_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nVehicleIssuesAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleIssuesAdapter.kt\nco/bird/android/feature/healthcheck/adapter/VehicleIssuesAdapter$VehicleIssueViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,51:1\n18#2:52\n9#3,4:53\n*S KotlinDebug\n*F\n+ 1 VehicleIssuesAdapter.kt\nco/bird/android/feature/healthcheck/adapter/VehicleIssuesAdapter$VehicleIssueViewHolder\n*L\n32#1:52\n32#1:53,4\n*E\n"})
    /* renamed from: bm6$a */
    /* loaded from: classes3.dex */
    public final class C12494a extends C29735w1 {

        /* renamed from: b */
        public final View f58118b;

        /* renamed from: c */
        public TextView f58119c;

        /* renamed from: d */
        public TextView f58120d;

        /* renamed from: e */
        public final /* synthetic */ C38750bm6 f58121e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12494a(C38750bm6 c38750bm6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f58121e = c38750bm6;
            this.f58118b = view;
            this.f58119c = (TextView) this.itemView.findViewById(C48795sh4.title);
            this.f58120d = (TextView) this.itemView.findViewById(C48795sh4.subtitle);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f58121e.m94545o().m109397e(i).m105816c();
            Unit unit = null;
            if (!(m105816c instanceof WireDisplayValue)) {
                m105816c = null;
            }
            WireDisplayValue wireDisplayValue = (WireDisplayValue) m105816c;
            if (wireDisplayValue != null) {
                this.f58119c.setText(wireDisplayValue.getTitle());
                if (wireDisplayValue.getDescription() == null) {
                    TextView description = this.f58120d;
                    Intrinsics.checkNotNullExpressionValue(description, "description");
                    C49520tu6.m11239l(description);
                    return;
                }
                TextView description2 = this.f58120d;
                Intrinsics.checkNotNullExpressionValue(description2, "description");
                C49520tu6.m11233r(description2);
                this.f58120d.setText(wireDisplayValue.getDescription());
                Long textColor = wireDisplayValue.getTextColor();
                if (textColor != null) {
                    long longValue = textColor.longValue();
                    this.f58119c.setTextColor((int) longValue);
                    this.f58118b.setBackgroundTintList(ColorStateList.valueOf((int) (longValue + 1073741824)));
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    TextView textView = this.f58119c;
                    Context context = this.f58118b.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "view.context");
                    textView.setTextColor(C40788fB0.m41776f(context, C32364Df4.errorRed));
                    View view = this.f58118b;
                    Context context2 = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "view.context");
                    view.setBackgroundTintList(ColorStateList.valueOf(C40788fB0.m41776f(context2, C32364Df4.errorRedTransparent)));
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C41107fj4.view_vehicle_issue ? new C12494a(this, m41761u) : new C29735w1(m41761u);
    }
}
