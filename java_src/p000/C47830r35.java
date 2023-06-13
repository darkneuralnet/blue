package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.RideReportIcon;
import co.bird.android.model.constant.RideReportStatus;
import co.bird.android.model.wire.WireLegacyAsset;
import co.bird.android.model.wire.WireRideDetail;
import co.bird.android.model.wire.WireRideReport;
import co.bird.android.model.wire.WireRideReportItem;
import co.bird.android.model.wire.WireThemedColors;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016R.\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m28432d2 = {"Lr35;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "Lkotlin/Function1;", "Lco/bird/android/model/wire/WireRideReportItem;", "c", "Lkotlin/jvm/functions/Function1;", "v", "()Lkotlin/jvm/functions/Function1;", "w", "(Lkotlin/jvm/functions/Function1;)V", "reportItemClicks", "<init>", "()V", C17296a.f69688o, "b", "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: r35  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47830r35 extends AbstractC52206yS0 {

    /* renamed from: c */
    public Function1<? super WireRideReportItem, Unit> f106356c = C27840c.f106363g;

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, m28432d2 = {"Lr35$a;", "Lw1;", "", "position", "", "bind", "Lco/bird/android/model/constant/RideReportIcon;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/graphics/drawable/Drawable;", C17296a.f69688o, "Lqf2;", "b", "Lqf2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lr35;Landroid/view/View;)V", "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRideReportAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideReportAdapter.kt\nco/bird/android/feature/rideendsummary/ridereport/adapters/RideReportAdapter$ReportItemViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n18#2:114\n9#3,4:115\n1#4:119\n*S KotlinDebug\n*F\n+ 1 RideReportAdapter.kt\nco/bird/android/feature/rideendsummary/ridereport/adapters/RideReportAdapter$ReportItemViewHolder\n*L\n81#1:114\n81#1:115,4\n*E\n"})
    /* renamed from: r35$a */
    /* loaded from: classes3.dex */
    public final class C27836a extends C29735w1 {

        /* renamed from: b */
        public final C47588qf2 f106357b;

        /* renamed from: c */
        public final /* synthetic */ C47830r35 f106358c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nRideReportAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideReportAdapter.kt\nco/bird/android/feature/rideendsummary/ridereport/adapters/RideReportAdapter$ReportItemViewHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,113:1\n1#2:114\n18#3:115\n9#4,4:116\n*S KotlinDebug\n*F\n+ 1 RideReportAdapter.kt\nco/bird/android/feature/rideendsummary/ridereport/adapters/RideReportAdapter$ReportItemViewHolder$1\n*L\n74#1:115\n74#1:116,4\n*E\n"})
        /* renamed from: r35$a$a */
        /* loaded from: classes3.dex */
        public static final class C27837a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C47830r35 f106360h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27837a(C47830r35 c47830r35) {
                super(1);
                this.f106360h = c47830r35;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C2637G6 m109397e;
                WireRideReportItem wireRideReportItem;
                Integer safePosition = C27836a.this.getSafePosition();
                if (safePosition == null || (m109397e = this.f106360h.m94545o().m109397e(safePosition.intValue())) == null) {
                    return;
                }
                Object m105816c = m109397e.m105816c();
                if (!(m105816c instanceof Pair)) {
                    m105816c = null;
                }
                Pair pair = (Pair) m105816c;
                if (pair == null || (wireRideReportItem = (WireRideReportItem) pair.getSecond()) == null) {
                    return;
                }
                this.f106360h.m16559v().invoke(wireRideReportItem);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: r35$a$b */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C27838b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RideReportIcon.values().length];
                try {
                    iArr[RideReportIcon.CHECK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RideReportIcon.ISSUE_TRIANGLE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27836a(C47830r35 c47830r35, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f106358c = c47830r35;
            C47588qf2 m17266a = C47588qf2.m17266a(view);
            Intrinsics.checkNotNullExpressionValue(m17266a, "bind(view)");
            this.f106357b = m17266a;
            ConstraintLayout root = m17266a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C27837a(c47830r35));
        }

        /* renamed from: a */
        public final Drawable m16557a(RideReportIcon rideReportIcon, Context context) {
            int i;
            int i2 = C27838b.$EnumSwitchMapping$0[rideReportIcon.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    return null;
                }
                i = C48193rg4.ic_issue_triangle;
            } else {
                i = C48193rg4.ic_check;
            }
            return NA0.m94299e(context, i);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            Drawable drawable;
            ColorStateList colorStateList;
            Object m105816c = this.f106358c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null) {
                int intValue = ((Number) pair.component1()).intValue();
                WireRideReportItem wireRideReportItem = (WireRideReportItem) pair.component2();
                boolean z2 = true;
                this.f106357b.f105585f.setText(String.valueOf(intValue + 1));
                this.f106357b.f105586g.setText(wireRideReportItem.getTitle());
                TextView textView = this.f106357b.f105582c;
                String text = wireRideReportItem.getText();
                if (wireRideReportItem.getStatus() != RideReportStatus.PENDING) {
                    z = true;
                } else {
                    z = false;
                }
                if (!Boolean.valueOf(z).booleanValue()) {
                    text = null;
                }
                if (text == null) {
                    text = getContext().getString(C45871nl4.ride_report_rule_pending_status_text);
                }
                textView.setText(text);
                ImageView imageView = this.f106357b.f105583d;
                RideReportIcon iconName = wireRideReportItem.getIconName();
                if (iconName != null) {
                    drawable = m16557a(iconName, getContext());
                } else {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                ImageView imageView2 = this.f106357b.f105583d;
                WireThemedColors iconColor = wireRideReportItem.getIconColor();
                if (iconColor != null) {
                    colorStateList = ColorStateList.valueOf(iconColor.getLightMode());
                } else {
                    colorStateList = null;
                }
                imageView2.setImageTintList(colorStateList);
                ShapeableImageView shapeableImageView = this.f106357b.f105584e;
                Intrinsics.checkNotNullExpressionValue(shapeableImageView, "binding.image");
                if (wireRideReportItem.getImageAsset() == null) {
                    z2 = false;
                }
                C49520tu6.show$default(shapeableImageView, z2, 0, 2, null);
                WireLegacyAsset imageAsset = wireRideReportItem.getImageAsset();
                if (imageAsset != null) {
                    ComponentCallbacks2C17096a.m53137u(this.f106357b.getRoot()).m81653k(imageAsset.getMedia().getMediaUrl()).m16096R0(this.f106357b.f105584e);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lr35$b;", "Lw1;", "", "position", "", "bind", "Lrf2;", "b", "Lrf2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lr35;Landroid/view/View;)V", "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRideReportAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideReportAdapter.kt\nco/bird/android/feature/rideendsummary/ridereport/adapters/RideReportAdapter$SummaryViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,113:1\n18#2:114\n9#3,4:115\n*S KotlinDebug\n*F\n+ 1 RideReportAdapter.kt\nco/bird/android/feature/rideendsummary/ridereport/adapters/RideReportAdapter$SummaryViewHolder\n*L\n54#1:114\n54#1:115,4\n*E\n"})
    /* renamed from: r35$b */
    /* loaded from: classes3.dex */
    public final class C27839b extends C29735w1 {

        /* renamed from: b */
        public final C48181rf2 f106361b;

        /* renamed from: c */
        public final /* synthetic */ C47830r35 f106362c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27839b(C47830r35 c47830r35, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f106362c = c47830r35;
            C48181rf2 m15589a = C48181rf2.m15589a(view);
            Intrinsics.checkNotNullExpressionValue(m15589a, "bind(view)");
            this.f106361b = m15589a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Double co2SavedLbs;
            Object m105816c = this.f106362c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof WireRideDetail)) {
                m105816c = null;
            }
            WireRideDetail wireRideDetail = (WireRideDetail) m105816c;
            if (wireRideDetail != null) {
                if (wireRideDetail.getReport() != null && wireRideDetail.getReportStatus() != RideReportStatus.PENDING) {
                    TextView textView = this.f106361b.f107447i;
                    Intrinsics.checkNotNullExpressionValue(textView, "binding.pendingTitle");
                    C49520tu6.m11239l(textView);
                    Group group = this.f106361b.f107440b;
                    Intrinsics.checkNotNullExpressionValue(group, "binding.available");
                    C49520tu6.m11233r(group);
                    TextView textView2 = this.f106361b.f107443e;
                    String distance = wireRideDetail.getDistance();
                    Object obj = "--";
                    if (distance == null) {
                        distance = "--";
                    }
                    textView2.setText(distance);
                    TextView textView3 = this.f106361b.f107441c;
                    Context context = getContext();
                    int i2 = C45871nl4.lbs_format;
                    Object[] objArr = new Object[1];
                    WireRideReport report = wireRideDetail.getReport();
                    if (report != null && (co2SavedLbs = report.getCo2SavedLbs()) != null) {
                        obj = co2SavedLbs;
                    }
                    objArr[0] = obj;
                    textView3.setText(context.getString(i2, objArr));
                    return;
                }
                TextView textView4 = this.f106361b.f107447i;
                Intrinsics.checkNotNullExpressionValue(textView4, "binding.pendingTitle");
                C49520tu6.m11233r(textView4);
                Group group2 = this.f106361b.f107440b;
                Intrinsics.checkNotNullExpressionValue(group2, "binding.available");
                C49520tu6.m11239l(group2);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/wire/WireRideReportItem;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRideReportItem;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: r35$c */
    /* loaded from: classes3.dex */
    public static final class C27840c extends Lambda implements Function1<WireRideReportItem, Unit> {

        /* renamed from: g */
        public static final C27840c f106363g = new C27840c();

        public C27840c() {
            super(1);
        }

        /* renamed from: a */
        public final void m16556a(WireRideReportItem it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireRideReportItem wireRideReportItem) {
            m16556a(wireRideReportItem);
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C49015t35());
        }
    }

    /* renamed from: v */
    public final Function1<WireRideReportItem, Unit> m16559v() {
        return this.f106356c;
    }

    /* renamed from: w */
    public final void m16558w(Function1<? super WireRideReportItem, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f106356c = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C32868Fj4.item_ride_report_summary ? new C27839b(this, m41761u) : i == C32868Fj4.item_ride_report_item ? new C27836a(this, m41761u) : new C29735w1(m41761u);
    }
}
