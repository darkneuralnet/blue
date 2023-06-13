package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.NonRepair;
import co.bird.android.model.RepairCategory;
import co.bird.android.model.RepairFlow;
import co.bird.android.model.RepairIssue;
import co.bird.android.model.constant.MapMarkerKind;
import co.bird.android.model.wire.WireMapMarker;
import co.bird.android.model.wire.WireMapMarkerKt;
import co.bird.android.model.wire.WireQuickLink;
import co.bird.android.widget.BatteryView;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import com.google.android.material.imageview.ShapeableImageView;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0003()\u001bB\u0007¢\u0006\u0004\b&\u0010'J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000eJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000eJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eJ\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eJ\u0018\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00170\u00160\u000eR\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\n0\n0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00100\u00100\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\"\u0010!\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00120\u00120\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001cR\"\u0010#\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00140\u00140\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001cR:\u0010%\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0017 \u001a*\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00160\u00160\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001c¨\u0006*"}, m28432d2 = {"LUE4;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "LF6;", "r", "Lio/reactivex/Observable;", "A", "Lco/bird/android/model/RepairCategory;", "v", "Lco/bird/android/model/RepairIssue;", "w", "Lco/bird/android/model/wire/WireQuickLink;", "y", "Lkotlin/Pair;", "Lco/bird/android/model/NonRepair;", "x", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "vehicleInfoClicksSubject", DateTokenConverter.CONVERTER_KEY, "categorySelectsSubject", "e", "issueSelectsSubject", "f", "quickLinkSelectsSubject", "g", "nonRepairSelectsSubject", "<init>", "()V", C17296a.f69688o, "b", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: UE4 */
/* loaded from: classes3.dex */
public final class UE4 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<Unit> f37106c;

    /* renamed from: d */
    public final C24558d<RepairCategory> f37107d;

    /* renamed from: e */
    public final C24558d<RepairIssue> f37108e;

    /* renamed from: f */
    public final C24558d<WireQuickLink> f37109f;

    /* renamed from: g */
    public final C24558d<Pair<RepairCategory, NonRepair>> f37110g;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LUE4$a;", "Lw1;", "", "position", "", "bind", "LSe2;", "b", "LSe2;", "binding", "LDF4;", "c", "LDF4;", "adapter", "Landroid/view/View;", "view", "<init>", "(LUE4;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairV3OverviewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3OverviewAdapter.kt\nco/bird/android/feature/repair/v3/overview/adapters/RepairV3OverviewAdapter$QuickLinksViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,169:1\n18#2:170\n9#3,4:171\n*S KotlinDebug\n*F\n+ 1 RepairV3OverviewAdapter.kt\nco/bird/android/feature/repair/v3/overview/adapters/RepairV3OverviewAdapter$QuickLinksViewHolder\n*L\n163#1:170\n163#1:171,4\n*E\n"})
    /* renamed from: UE4$a */
    /* loaded from: classes3.dex */
    public final class C8236a extends C29735w1 {

        /* renamed from: b */
        public final C35863Se2 f37111b;

        /* renamed from: c */
        public final DF4 f37112c;

        /* renamed from: d */
        public final /* synthetic */ UE4 f37113d;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: UE4$a$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C8237a extends FunctionReferenceImpl implements Function1<WireQuickLink, Unit> {
            public C8237a(Object obj) {
                super(1, obj, C24558d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
            }

            /* renamed from: a */
            public final void m81786a(WireQuickLink p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((C24558d) this.receiver).onNext(p0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WireQuickLink wireQuickLink) {
                m81786a(wireQuickLink);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8236a(UE4 ue4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f37113d = ue4;
            C35863Se2 m85167a = C35863Se2.m85167a(view);
            Intrinsics.checkNotNullExpressionValue(m85167a, "bind(view)");
            this.f37111b = m85167a;
            DF4 df4 = new DF4();
            this.f37112c = df4;
            RecyclerView recyclerView = m85167a.f34017b;
            recyclerView.setLayoutManager(new LinearLayoutManager(m85167a.getRoot().getContext()));
            recyclerView.setItemAnimator(new C11894g());
            recyclerView.setAdapter(df4);
            df4.m110643v(new C8237a(ue4.f37109f));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            List listOf;
            Object m105816c = this.f37113d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C3023H6)) {
                m105816c = null;
            }
            C3023H6 c3023h6 = (C3023H6) m105816c;
            if (c3023h6 != null) {
                DF4 df4 = this.f37112c;
                listOf = CollectionsKt__CollectionsJVMKt.listOf(c3023h6);
                df4.mo24871u(listOf);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LUE4$b;", "Lw1;", "", "position", "", "bind", "Laf2;", "b", "Laf2;", "binding", "LXE4;", "c", "LXE4;", "adapter", "Landroid/view/View;", "view", "<init>", "(LUE4;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairV3OverviewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3OverviewAdapter.kt\nco/bird/android/feature/repair/v3/overview/adapters/RepairV3OverviewAdapter$RepairCategoryViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,169:1\n18#2:170\n9#3,4:171\n1#4:175\n1726#5,3:176\n1774#5,4:179\n*S KotlinDebug\n*F\n+ 1 RepairV3OverviewAdapter.kt\nco/bird/android/feature/repair/v3/overview/adapters/RepairV3OverviewAdapter$RepairCategoryViewHolder\n*L\n120#1:170\n120#1:171,4\n125#1:176,3\n128#1:179,4\n*E\n"})
    /* renamed from: UE4$b */
    /* loaded from: classes3.dex */
    public final class C8238b extends C29735w1 {

        /* renamed from: b */
        public final C38083af2 f37114b;

        /* renamed from: c */
        public final XE4 f37115c;

        /* renamed from: d */
        public final /* synthetic */ UE4 f37116d;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nRepairV3OverviewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3OverviewAdapter.kt\nco/bird/android/feature/repair/v3/overview/adapters/RepairV3OverviewAdapter$RepairCategoryViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,169:1\n18#2:170\n9#3,4:171\n1#4:175\n*S KotlinDebug\n*F\n+ 1 RepairV3OverviewAdapter.kt\nco/bird/android/feature/repair/v3/overview/adapters/RepairV3OverviewAdapter$RepairCategoryViewHolder$1\n*L\n102#1:170\n102#1:171,4\n*E\n"})
        /* renamed from: UE4$b$a */
        /* loaded from: classes3.dex */
        public static final class C8239a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ UE4 f37118h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8239a(UE4 ue4) {
                super(1);
                this.f37118h = ue4;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                int adapterPosition = C8238b.this.getAdapterPosition();
                if (adapterPosition != -1) {
                    Object m105816c = this.f37118h.m94545o().m109397e(adapterPosition).m105816c();
                    if (!(m105816c instanceof C33705Iy4)) {
                        m105816c = null;
                    }
                    C33705Iy4 c33705Iy4 = (C33705Iy4) m105816c;
                    if (c33705Iy4 != null) {
                        UE4 ue4 = this.f37118h;
                        RepairCategory m101434a = c33705Iy4.m101434a();
                        c33705Iy4.m101432c();
                        ue4.f37107d.onNext(m101434a);
                    }
                }
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: UE4$b$b */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C8240b extends FunctionReferenceImpl implements Function1<RepairIssue, Unit> {
            public C8240b(Object obj) {
                super(1, obj, C24558d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
            }

            /* renamed from: a */
            public final void m81785a(RepairIssue p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((C24558d) this.receiver).onNext(p0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(RepairIssue repairIssue) {
                m81785a(repairIssue);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: UE4$b$c */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C8241c extends FunctionReferenceImpl implements Function1<Pair<? extends RepairCategory, ? extends NonRepair>, Unit> {
            public C8241c(Object obj) {
                super(1, obj, C24558d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends RepairCategory, ? extends NonRepair> pair) {
                invoke2((Pair<RepairCategory, NonRepair>) pair);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Pair<RepairCategory, NonRepair> p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((C24558d) this.receiver).onNext(p0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8238b(UE4 ue4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f37116d = ue4;
            C38083af2 m70907a = C38083af2.m70907a(view);
            Intrinsics.checkNotNullExpressionValue(m70907a, "bind(view)");
            this.f37114b = m70907a;
            XE4 xe4 = new XE4();
            this.f37115c = xe4;
            ConstraintLayout root = m70907a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C8239a(ue4));
            ShapeableImageView shapeableImageView = m70907a.f50909c;
            Intrinsics.checkNotNullExpressionValue(shapeableImageView, "binding.image");
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
            CY1.m112150a(shapeableImageView, C49347td3.m12002a(4, context));
            RecyclerView recyclerView = m70907a.f50910d;
            recyclerView.setLayoutManager(new LinearLayoutManager(m70907a.getRoot().getContext()));
            recyclerView.setItemAnimator(new C11894g());
            recyclerView.setAdapter(xe4);
            xe4.m77167v(new C8240b(ue4.f37108e));
            xe4.m77166w(new C8241c(ue4.f37110g));
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00fe  */
        @Override // p000.C29735w1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void bind(int i) {
            boolean z;
            boolean z2;
            int i2;
            boolean z3;
            String string;
            String assetUrl;
            AbstractC33662It6<ImageView, Drawable> abstractC33662It6;
            List listOf;
            boolean isBlank;
            Object m105816c = this.f37116d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C33705Iy4)) {
                m105816c = null;
            }
            C33705Iy4 c33705Iy4 = (C33705Iy4) m105816c;
            if (c33705Iy4 != null) {
                RepairCategory m101434a = c33705Iy4.m101434a();
                C3023H6 m101433b = c33705Iy4.m101433b();
                boolean m101432c = c33705Iy4.m101432c();
                this.f37114b.f50911e.setText(m101434a.getDisplay());
                String description = m101434a.getDescription();
                if (description != null) {
                    isBlank = StringsKt__StringsJVMKt.isBlank(description);
                    if (!isBlank) {
                        z = true;
                        if (!z) {
                            string = m101434a.getDescription();
                        } else {
                            List<RepairIssue> issues = m101434a.getIssues();
                            if (!(issues instanceof Collection) || !issues.isEmpty()) {
                                for (RepairIssue repairIssue : issues) {
                                    if (!(!repairIssue.getSelected())) {
                                        z2 = false;
                                        break;
                                    }
                                }
                            }
                            z2 = true;
                            if (z2) {
                                string = this.itemView.getContext().getString(C45871nl4.repair_repairs_needed);
                            } else {
                                Context context = this.itemView.getContext();
                                int i3 = C45871nl4.repair_repairs_needed_format;
                                Object[] objArr = new Object[1];
                                List<RepairIssue> issues2 = m101434a.getIssues();
                                if ((issues2 instanceof Collection) && issues2.isEmpty()) {
                                    i2 = 0;
                                } else {
                                    i2 = 0;
                                    for (RepairIssue repairIssue2 : issues2) {
                                        if (!repairIssue2.getCompleted() && repairIssue2.getSelected()) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (z3 && (i2 = i2 + 1) < 0) {
                                            CollectionsKt__CollectionsKt.throwCountOverflow();
                                        }
                                    }
                                }
                                objArr[0] = Integer.valueOf(i2);
                                string = context.getString(i3, objArr);
                            }
                        }
                        this.f37114b.f50908b.setText(string);
                        assetUrl = m101434a.getAssetUrl();
                        if (assetUrl == null) {
                            abstractC33662It6 = ComponentCallbacks2C17096a.m53137u(this.f37114b.f50909c).m81653k(assetUrl).m16096R0(this.f37114b.f50909c);
                        } else {
                            abstractC33662It6 = null;
                        }
                        if (abstractC33662It6 == null) {
                            this.f37114b.f50909c.setImageDrawable(null);
                        }
                        this.f37114b.getRoot().setEnabled(m101432c);
                        XE4 xe4 = this.f37115c;
                        listOf = CollectionsKt__CollectionsJVMKt.listOf(m101433b);
                        xe4.mo24871u(listOf);
                    }
                }
                z = false;
                if (!z) {
                }
                this.f37114b.f50908b.setText(string);
                assetUrl = m101434a.getAssetUrl();
                if (assetUrl == null) {
                }
                if (abstractC33662It6 == null) {
                }
                this.f37114b.getRoot().setEnabled(m101432c);
                XE4 xe42 = this.f37115c;
                listOf = CollectionsKt__CollectionsJVMKt.listOf(m101433b);
                xe42.mo24871u(listOf);
            }
        }
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u001c\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u001c\u0010\u0016\u001a\n \u0007*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, m28432d2 = {"LUE4$c;", "Lw1;", "", "position", "", "bind", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "b", "Landroid/widget/TextView;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "Lco/bird/android/widget/BatteryView;", "c", "Lco/bird/android/widget/BatteryView;", "battery", DateTokenConverter.CONVERTER_KEY, "batteryLevel", "e", "status", "Landroid/widget/ImageView;", "f", "Landroid/widget/ImageView;", "statusIcon", "Landroid/view/View;", "view", "<init>", "(LUE4;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairV3OverviewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3OverviewAdapter.kt\nco/bird/android/feature/repair/v3/overview/adapters/RepairV3OverviewAdapter$VehicleInfoViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,169:1\n18#2:170\n9#3,4:171\n*S KotlinDebug\n*F\n+ 1 RepairV3OverviewAdapter.kt\nco/bird/android/feature/repair/v3/overview/adapters/RepairV3OverviewAdapter$VehicleInfoViewHolder\n*L\n84#1:170\n84#1:171,4\n*E\n"})
    /* renamed from: UE4$c */
    /* loaded from: classes3.dex */
    public final class C8242c extends C29735w1 {

        /* renamed from: b */
        public final TextView f37119b;

        /* renamed from: c */
        public final BatteryView f37120c;

        /* renamed from: d */
        public final TextView f37121d;

        /* renamed from: e */
        public final TextView f37122e;

        /* renamed from: f */
        public final ImageView f37123f;

        /* renamed from: g */
        public final /* synthetic */ UE4 f37124g;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: UE4$c$a */
        /* loaded from: classes3.dex */
        public static final class C8243a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ UE4 f37125g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8243a(UE4 ue4) {
                super(1);
                this.f37125g = ue4;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f37125g.f37106c.onNext(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8242c(UE4 ue4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f37124g = ue4;
            this.f37119b = (TextView) view.findViewById(C52955zi4.code);
            this.f37120c = (BatteryView) view.findViewById(C52955zi4.battery);
            this.f37121d = (TextView) view.findViewById(C52955zi4.batteryLevel);
            this.f37122e = (TextView) view.findViewById(C52955zi4.status);
            this.f37123f = (ImageView) view.findViewById(C52955zi4.statusIcon);
            C34585Ms2.m94661j(view, new C8243a(ue4));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            String str;
            MapMarkerKind kind;
            Object m105816c = this.f37124g.m94545o().m109397e(i).m105816c();
            Drawable drawable = null;
            if (!(m105816c instanceof RepairFlow)) {
                m105816c = null;
            }
            RepairFlow repairFlow = (RepairFlow) m105816c;
            if (repairFlow != null) {
                this.f37119b.setText(repairFlow.getCode());
                this.f37120c.setPercent(repairFlow.getBatteryLevel());
                this.f37121d.setText(this.itemView.getContext().getString(C45871nl4.battery_percent, Integer.valueOf(repairFlow.getBatteryLevel())));
                TextView textView = this.f37122e;
                WireMapMarker marker = repairFlow.getMarker();
                if (marker != null) {
                    str = marker.getLabel();
                } else {
                    str = null;
                }
                textView.setText(str);
                ImageView imageView = this.f37123f;
                WireMapMarker marker2 = repairFlow.getMarker();
                if (marker2 != null && (kind = WireMapMarkerKt.getKind(marker2)) != null) {
                    Context context = this.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
                    drawable = C52136yK2.m3671b(kind, context);
                }
                imageView.setImageDrawable(drawable);
            }
        }
    }

    public UE4() {
        C24558d<Unit> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Unit>()");
        this.f37106c = m31902e;
        C24558d<RepairCategory> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<RepairCategory>()");
        this.f37107d = m31902e2;
        C24558d<RepairIssue> m31902e3 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e3, "create<RepairIssue>()");
        this.f37108e = m31902e3;
        C24558d<WireQuickLink> m31902e4 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e4, "create<WireQuickLink>()");
        this.f37109f = m31902e4;
        C24558d<Pair<RepairCategory, NonRepair>> m31902e5 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e5, "create<Pair<RepairCategory, NonRepair>>()");
        this.f37110g = m31902e5;
    }

    /* renamed from: A */
    public final Observable<Unit> m81791A() {
        Observable<Unit> hide = this.f37106c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "vehicleInfoClicksSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C37846aF4());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new VE4();
    }

    /* renamed from: v */
    public final Observable<RepairCategory> m81790v() {
        Observable<RepairCategory> hide = this.f37107d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "categorySelectsSubject.hide()");
        return hide;
    }

    /* renamed from: w */
    public final Observable<RepairIssue> m81789w() {
        Observable<RepairIssue> hide = this.f37108e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "issueSelectsSubject.hide()");
        return hide;
    }

    /* renamed from: x */
    public final Observable<Pair<RepairCategory, NonRepair>> m81788x() {
        Observable<Pair<RepairCategory, NonRepair>> hide = this.f37110g.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "nonRepairSelectsSubject.hide()");
        return hide;
    }

    /* renamed from: y */
    public final Observable<WireQuickLink> m81787y() {
        Observable<WireQuickLink> hide = this.f37109f.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "quickLinkSelectsSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C45268mk4.item_vehicle_servicing_vehicle_info ? new C8242c(this, m41761u) : i == C32634Ej4.item_repair_category ? new C8238b(this, m41761u) : i == C32634Ej4.item_quick_links_section ? new C8236a(this, m41761u) : new C29735w1(m41761u);
    }
}
