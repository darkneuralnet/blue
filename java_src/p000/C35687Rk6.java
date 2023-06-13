package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.feature.commandcenter.vehicledetails.views.PastWorkOrderView;
import co.bird.android.model.VehicleCommand;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import p000.AbstractC26846oA;
import p000.AbstractC27514qA;
import zendesk.support.request.DocumentRenderer;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u0019B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\nH\u0002R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, m28432d2 = {"LRk6;", "LqA;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "LF6;", "r", "w", "Lco/bird/android/model/VehicleCommand;", "command", "B", "E", "f", "Landroidx/recyclerview/widget/RecyclerView;", "<init>", "()V", C17296a.f69688o, "b", "c", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVehicleDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleDetailsAdapter.kt\nco/bird/android/feature/commandcenter/vehicledetails/adapters/VehicleDetailsAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,128:1\n1549#2:129\n1620#2,3:130\n1855#2,2:133\n*S KotlinDebug\n*F\n+ 1 VehicleDetailsAdapter.kt\nco/bird/android/feature/commandcenter/vehicledetails/adapters/VehicleDetailsAdapter\n*L\n69#1:129\n69#1:130,3\n70#1:133,2\n*E\n"})
/* renamed from: Rk6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35687Rk6 extends AbstractC27514qA {

    /* renamed from: f */
    public RecyclerView f32524f;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LRk6$a;", "Lw1;", "", "position", "", "bind", "Lco/bird/android/feature/commandcenter/vehicledetails/views/PastWorkOrderView;", "b", "Lco/bird/android/feature/commandcenter/vehicledetails/views/PastWorkOrderView;", "pastWorkOrderView", "Landroid/view/View;", "view", "<init>", "(LRk6;Landroid/view/View;)V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nVehicleDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleDetailsAdapter.kt\nco/bird/android/feature/commandcenter/vehicledetails/adapters/VehicleDetailsAdapter$PastWorkOrderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,128:1\n18#2:129\n9#3,4:130\n*S KotlinDebug\n*F\n+ 1 VehicleDetailsAdapter.kt\nco/bird/android/feature/commandcenter/vehicledetails/adapters/VehicleDetailsAdapter$PastWorkOrderViewHolder\n*L\n122#1:129\n122#1:130,4\n*E\n"})
    /* renamed from: Rk6$a */
    /* loaded from: classes3.dex */
    public final class C7258a extends C29735w1 {

        /* renamed from: b */
        public final PastWorkOrderView f32525b;

        /* renamed from: c */
        public final /* synthetic */ C35687Rk6 f32526c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nVehicleDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleDetailsAdapter.kt\nco/bird/android/feature/commandcenter/vehicledetails/adapters/VehicleDetailsAdapter$PastWorkOrderViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,128:1\n18#2:129\n9#3,4:130\n*S KotlinDebug\n*F\n+ 1 VehicleDetailsAdapter.kt\nco/bird/android/feature/commandcenter/vehicledetails/adapters/VehicleDetailsAdapter$PastWorkOrderViewHolder$1\n*L\n115#1:129\n115#1:130,4\n*E\n"})
        /* renamed from: Rk6$a$a */
        /* loaded from: classes3.dex */
        public static final class C7259a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C35687Rk6 f32528h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7259a(C35687Rk6 c35687Rk6) {
                super(1);
                this.f32528h = c35687Rk6;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                if (C7258a.this.getAdapterPosition() == -1) {
                    return;
                }
                Object m105816c = this.f32528h.m94545o().m109394h().get(C7258a.this.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof C38474bJ3)) {
                    m105816c = null;
                }
                C38474bJ3 c38474bJ3 = (C38474bJ3) m105816c;
                if (c38474bJ3 != null) {
                    this.f32528h.m18038D().onNext(c38474bJ3.m64690b());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7258a(C35687Rk6 c35687Rk6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f32526c = c35687Rk6;
            PastWorkOrderView pastWorkOrderView = (PastWorkOrderView) view;
            this.f32525b = pastWorkOrderView;
            pastWorkOrderView.setManager(new VS5(C36369Ui4.item_command_center_past_work_order_issue_item, DocumentRenderer.Style.C31402Li.UNICODE_BULLET));
            C34585Ms2.m94661j(pastWorkOrderView.m58454h(), new C7259a(c35687Rk6));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f32526c.m94545o().m109394h().get(i).m105816c();
            if (!(m105816c instanceof C38474bJ3)) {
                m105816c = null;
            }
            C38474bJ3 c38474bJ3 = (C38474bJ3) m105816c;
            if (c38474bJ3 != null) {
                this.f32525b.m58456f(c38474bJ3);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u001c\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u0013"}, m28432d2 = {"LRk6$b;", "Lw1;", "", "position", "", "bind", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "b", "Landroid/widget/TextView;", "scrapRejection", "c", "scrapRejectionMessage", DateTokenConverter.CONVERTER_KEY, "scrapReviewedDate", "Landroid/view/View;", "view", "<init>", "(LRk6;Landroid/view/View;)V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nVehicleDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleDetailsAdapter.kt\nco/bird/android/feature/commandcenter/vehicledetails/adapters/VehicleDetailsAdapter$ScrapViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,128:1\n18#2:129\n9#3,4:130\n*S KotlinDebug\n*F\n+ 1 VehicleDetailsAdapter.kt\nco/bird/android/feature/commandcenter/vehicledetails/adapters/VehicleDetailsAdapter$ScrapViewHolder\n*L\n84#1:129\n84#1:130,4\n*E\n"})
    /* renamed from: Rk6$b */
    /* loaded from: classes3.dex */
    public final class C7260b extends C29735w1 {

        /* renamed from: b */
        public final TextView f32529b;

        /* renamed from: c */
        public final TextView f32530c;

        /* renamed from: d */
        public final TextView f32531d;

        /* renamed from: e */
        public final /* synthetic */ C35687Rk6 f32532e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7260b(C35687Rk6 c35687Rk6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f32532e = c35687Rk6;
            this.f32529b = (TextView) view.findViewById(C52955zi4.rejection);
            this.f32530c = (TextView) view.findViewById(C52955zi4.rejectMessage);
            this.f32531d = (TextView) view.findViewById(C52955zi4.reviewedDate);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            Object m105816c = this.f32532e.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C33157Gp5)) {
                m105816c = null;
            }
            C33157Gp5 c33157Gp5 = (C33157Gp5) m105816c;
            if (c33157Gp5 != null) {
                this.f32529b.setText(c33157Gp5.m104694b());
                this.f32530c.setText(c33157Gp5.m104693c());
                TextView scrapRejectionMessage = this.f32530c;
                Intrinsics.checkNotNullExpressionValue(scrapRejectionMessage, "scrapRejectionMessage");
                if (c33157Gp5.m104693c() != null) {
                    z = true;
                } else {
                    z = false;
                }
                C49520tu6.show$default(scrapRejectionMessage, z, 0, 2, null);
                this.f32531d.setText(String.valueOf(c33157Gp5.m104692d()));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u0011"}, m28432d2 = {"LRk6$c;", "Lw1;", "", "position", "", "bind", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "b", "Landroid/widget/TextView;", "warehouse", "c", "status", "Landroid/view/View;", "view", "<init>", "(LRk6;Landroid/view/View;)V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nVehicleDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleDetailsAdapter.kt\nco/bird/android/feature/commandcenter/vehicledetails/adapters/VehicleDetailsAdapter$ServiceCenterViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,128:1\n18#2:129\n9#3,4:130\n*S KotlinDebug\n*F\n+ 1 VehicleDetailsAdapter.kt\nco/bird/android/feature/commandcenter/vehicledetails/adapters/VehicleDetailsAdapter$ServiceCenterViewHolder\n*L\n98#1:129\n98#1:130,4\n*E\n"})
    /* renamed from: Rk6$c */
    /* loaded from: classes3.dex */
    public final class C7261c extends C29735w1 {

        /* renamed from: b */
        public final TextView f32533b;

        /* renamed from: c */
        public final TextView f32534c;

        /* renamed from: d */
        public final /* synthetic */ C35687Rk6 f32535d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7261c(C35687Rk6 c35687Rk6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f32535d = c35687Rk6;
            this.f32533b = (TextView) this.itemView.findViewById(C42273hh4.warehouse);
            this.f32534c = (TextView) this.itemView.findViewById(C42273hh4.status);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f32535d.m94545o().m109394h().get(i).m105816c();
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null) {
                TextView textView = this.f32533b;
                String string = this.itemView.getContext().getString(C45871nl4.command_center_service_center_warehouse_format, pair.getFirst());
                Intrinsics.checkNotNullExpressionValue(string, "itemView.context.getStri… serviceCenterInfo.first)");
                textView.setText(C45097mS5.span$default(string, (String) pair.getFirst(), null, 2, null));
                TextView textView2 = this.f32534c;
                String string2 = this.itemView.getContext().getString(C45871nl4.command_center_service_center_status_format, pair.getSecond());
                Intrinsics.checkNotNullExpressionValue(string2, "itemView.context.getStri…serviceCenterInfo.second)");
                textView2.setText(C45097mS5.span$default(string2, (String) pair.getSecond(), null, 2, null));
            }
        }
    }

    @Override // p000.AbstractC26846oA
    /* renamed from: B */
    public void mo21706B(VehicleCommand command) {
        Intrinsics.checkNotNullParameter(command, "command");
        super.mo21706B(command);
        m86353E();
    }

    /* renamed from: E */
    public final void m86353E() {
        IntRange until;
        int collectionSizeOrDefault;
        AbstractC26846oA.C26847a c26847a;
        RecyclerView recyclerView = this.f32524f;
        if (recyclerView == null) {
            return;
        }
        until = RangesKt___RangesKt.until(0, recyclerView.getChildCount());
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
        ArrayList<View> arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(recyclerView.getChildAt(((IntIterator) it).nextInt()));
        }
        for (View child : arrayList) {
            Intrinsics.checkNotNullExpressionValue(child, "child");
            Integer m40591a = C41207ft4.m40591a(recyclerView, child);
            if (m40591a != null) {
                int intValue = m40591a.intValue();
                if (getItemViewType(intValue) == C45851nj4.item_command_center_command) {
                    RecyclerView.AbstractC11834D childViewHolder = recyclerView.getChildViewHolder(child);
                    if (childViewHolder instanceof AbstractC26846oA.C26847a) {
                        c26847a = (AbstractC26846oA.C26847a) childViewHolder;
                    } else {
                        c26847a = null;
                    }
                    if (c26847a != null) {
                        c26847a.bind(intValue);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f32524f = recyclerView;
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C37559Zk6());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C35921Sk6();
    }

    @Override // p000.AbstractC26846oA
    /* renamed from: w */
    public void mo21705w() {
        super.mo21705w();
        m86353E();
    }

    @Override // p000.AbstractC27514qA, p000.AbstractC26846oA, androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        if (i == C36369Ui4.item_command_center_service_center) {
            return new C7261c(this, m41761u);
        }
        if (i == C36369Ui4.item_command_center_past_work_order) {
            return new C7258a(this, m41761u);
        }
        if (i != C36369Ui4.item_button_drop_down_brand_outline && i != C45268mk4.item_button_matte_black) {
            return i == C45268mk4.item_scrap_rejection ? new C7260b(this, m41761u) : i == C45268mk4.item_button ? new AbstractC27514qA.C27515a(this, m41761u) : super.onCreateViewHolder(parent, i);
        }
        return new AbstractC27514qA.C27515a(this, m41761u);
    }
}
