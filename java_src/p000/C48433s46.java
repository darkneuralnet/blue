package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.ServiceCenterRouteStationStatus;
import co.bird.android.model.wire.WireHydratedRoute;
import co.bird.android.model.wire.WireHydratedStation;
import co.bird.android.widget.VehicleSummaryView;
import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0011"}, m28432d2 = {"Ls46;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "<init>", "()V", C17296a.f69688o, "b", "c", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: s46  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48433s46 extends AbstractC52206yS0 {

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, m28432d2 = {"Ls46$a;", "Lw1;", "", "position", "", "bind", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "b", "Landroid/widget/ImageView;", "icon", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "route", "Landroid/view/View;", "view", "<init>", "(Ls46;Landroid/view/View;)V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTimelineAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimelineAdapter.kt\nco/bird/android/feature/commandcenter/timeline/adapters/TimelineAdapter$RouteViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,103:1\n18#2:104\n9#3,4:105\n1726#4,3:109\n*S KotlinDebug\n*F\n+ 1 TimelineAdapter.kt\nco/bird/android/feature/commandcenter/timeline/adapters/TimelineAdapter$RouteViewHolder\n*L\n47#1:104\n47#1:105,4\n48#1:109,3\n*E\n"})
    /* renamed from: s46$a */
    /* loaded from: classes3.dex */
    public final class C28172a extends C29735w1 {

        /* renamed from: b */
        public final ImageView f108215b;

        /* renamed from: c */
        public final TextView f108216c;

        /* renamed from: d */
        public final /* synthetic */ C48433s46 f108217d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28172a(C48433s46 c48433s46, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f108217d = c48433s46;
            this.f108215b = (ImageView) view.findViewById(C42273hh4.icon);
            this.f108216c = (TextView) view.findViewById(C42273hh4.route);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            int i2;
            Object m105816c = this.f108217d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof WireHydratedRoute)) {
                m105816c = null;
            }
            WireHydratedRoute wireHydratedRoute = (WireHydratedRoute) m105816c;
            if (wireHydratedRoute != null) {
                List<WireHydratedStation> stations = wireHydratedRoute.getStations();
                boolean z2 = true;
                if (!(stations instanceof Collection) || !stations.isEmpty()) {
                    Iterator<T> it = stations.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ServiceCenterRouteStationStatus status = ((WireHydratedStation) it.next()).getStatus();
                        if (status != null && status.isCompletedStatus()) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (!z) {
                            z2 = false;
                            break;
                        }
                    }
                }
                if (z2) {
                    i2 = C48193rg4.ic_filled_check_circle_green;
                } else {
                    i2 = C48193rg4.ic_progress_selected_v2;
                }
                this.f108216c.setText(wireHydratedRoute.getRouteDisplay());
                this.f108215b.setImageDrawable(NA0.m94299e(this.itemView.getContext(), i2));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u001c\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\r¨\u0006\u0017"}, m28432d2 = {"Ls46$b;", "Lw1;", "", "position", "", "bind", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "b", "Landroid/widget/ImageView;", "arrow", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "station", DateTokenConverter.CONVERTER_KEY, "check", "e", "completion", "Landroid/view/View;", "view", "<init>", "(Ls46;Landroid/view/View;)V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTimelineAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimelineAdapter.kt\nco/bird/android/feature/commandcenter/timeline/adapters/TimelineAdapter$StationViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n18#2:104\n9#3,4:105\n1#4:109\n*S KotlinDebug\n*F\n+ 1 TimelineAdapter.kt\nco/bird/android/feature/commandcenter/timeline/adapters/TimelineAdapter$StationViewHolder\n*L\n76#1:104\n76#1:105,4\n*E\n"})
    /* renamed from: s46$b */
    /* loaded from: classes3.dex */
    public final class C28173b extends C29735w1 {

        /* renamed from: b */
        public final ImageView f108218b;

        /* renamed from: c */
        public final TextView f108219c;

        /* renamed from: d */
        public final ImageView f108220d;

        /* renamed from: e */
        public final TextView f108221e;

        /* renamed from: f */
        public final /* synthetic */ C48433s46 f108222f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28173b(C48433s46 c48433s46, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f108222f = c48433s46;
            this.f108218b = (ImageView) view.findViewById(C42273hh4.arrow);
            this.f108219c = (TextView) view.findViewById(C42273hh4.station);
            this.f108220d = (ImageView) view.findViewById(C42273hh4.stationCheck);
            this.f108221e = (TextView) view.findViewById(C42273hh4.completion);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            int i2;
            int m94301c;
            Object m105816c = this.f108222f.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof WireHydratedStation)) {
                m105816c = null;
            }
            WireHydratedStation wireHydratedStation = (WireHydratedStation) m105816c;
            if (wireHydratedStation != null) {
                ServiceCenterRouteStationStatus status = wireHydratedStation.getStatus();
                if (status != null) {
                    z = status.isCompletedStatus();
                } else {
                    z = false;
                }
                if (wireHydratedStation.getStatus() == ServiceCenterRouteStationStatus.PASSED) {
                    i2 = C48193rg4.ic_check_xs;
                } else {
                    i2 = C48193rg4.ic_issue_x;
                }
                Integer statusColor = wireHydratedStation.getStatusColor();
                if (statusColor != null) {
                    TextView textView = this.f108219c;
                    Intrinsics.checkNotNullExpressionValue(textView, "this.station");
                    textView.setTextColor(statusColor.intValue());
                }
                this.f108219c.setText(wireHydratedStation.getStationDisplay());
                this.f108221e.setText(wireHydratedStation.getStationDescription());
                TextView textView2 = this.f108221e;
                Intrinsics.checkNotNullExpressionValue(textView2, "this.completion");
                C49520tu6.show$default(textView2, z, 0, 2, null);
                this.f108220d.setImageDrawable(NA0.m94299e(this.itemView.getContext(), i2));
                ImageView imageView = this.f108220d;
                Intrinsics.checkNotNullExpressionValue(imageView, "this.check");
                C49520tu6.show$default(imageView, z, 0, 2, null);
                if (wireHydratedStation.getStatus() != ServiceCenterRouteStationStatus.PENDING) {
                    m94301c = NA0.m94301c(this.itemView.getContext(), C32364Df4.birdNewRoad);
                } else {
                    m94301c = NA0.m94301c(this.itemView.getContext(), C32364Df4.secondaryBG);
                }
                this.f108218b.setImageTintList(ColorStateList.valueOf(m94301c));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Ls46$c;", "Lw1;", "", "position", "", "bind", "Lco/bird/android/widget/VehicleSummaryView;", "b", "Lco/bird/android/widget/VehicleSummaryView;", "vehicleSummary", "Landroid/view/View;", "view", "<init>", "(Ls46;Landroid/view/View;)V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTimelineAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimelineAdapter.kt\nco/bird/android/feature/commandcenter/timeline/adapters/TimelineAdapter$VehicleSummaryViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n18#2:104\n9#3,4:105\n1#4:109\n*S KotlinDebug\n*F\n+ 1 TimelineAdapter.kt\nco/bird/android/feature/commandcenter/timeline/adapters/TimelineAdapter$VehicleSummaryViewHolder\n*L\n65#1:104\n65#1:105,4\n*E\n"})
    /* renamed from: s46$c */
    /* loaded from: classes3.dex */
    public final class C28174c extends C29735w1 {

        /* renamed from: b */
        public final VehicleSummaryView f108223b;

        /* renamed from: c */
        public final /* synthetic */ C48433s46 f108224c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28174c(C48433s46 c48433s46, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f108224c = c48433s46;
            this.f108223b = (VehicleSummaryView) view;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f108224c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C50043un6)) {
                m105816c = null;
            }
            C50043un6 c50043un6 = (C50043un6) m105816c;
            if (c50043un6 != null) {
                this.f108223b.m54355e(c50043un6);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C51990y46());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C36369Ui4.item_timeline_vehicle_summary ? new C28174c(this, m41761u) : i == C36369Ui4.item_timeline_route ? new C28172a(this, m41761u) : i == C36369Ui4.item_timeline_station ? new C28173b(this, m41761u) : new C29735w1(m41761u);
    }
}
