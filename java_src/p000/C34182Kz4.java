package p000;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Issue;
import co.bird.android.model.LocalAsset;
import co.bird.android.model.constant.AssetManagerType;
import co.bird.android.model.constant.TaskPriority;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.ViewScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import io.reactivex.subjects.C24552a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u0011\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u000f0\u000f0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, m28432d2 = {"LKz4;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "LF6;", "r", "Lio/reactivex/Observable;", "Lco/bird/android/model/Issue;", "v", "Lsu2;", "c", "Lsu2;", "localAssetManager", DateTokenConverter.CONVERTER_KEY, "Landroidx/recyclerview/widget/RecyclerView;", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "e", "Lio/reactivex/subjects/a;", "supertypesSubject", "<init>", "(Lsu2;)V", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Kz4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34182Kz4 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final InterfaceC48923su2 f20511c;

    /* renamed from: d */
    public RecyclerView f20512d;

    /* renamed from: e */
    public final C24552a<Issue> f20513e;

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u001c\u0010\u0010\u001a\n \u0007*\u0004\u0018\u00010\r0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0014\u001a\n \u0007*\u0004\u0018\u00010\u00110\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\n \u0007*\u0004\u0018\u00010\u00150\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 "}, m28432d2 = {"LKz4$a;", "Lw1;", "", "position", "", "bind", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "b", "Landroid/widget/TextView;", "supertypeText", "c", "repairsNeeded", "Landroid/widget/ImageView;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/ImageView;", "asset", "Landroidx/recyclerview/widget/RecyclerView;", "e", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/view/View;", "f", "Landroid/view/View;", "divider", "LHz4;", "g", "LHz4;", "adapter", "view", "<init>", "(LKz4;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairIssueSupertypesAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSupertypesAdapter.kt\nco/bird/android/feature/repair/v2/supertypes/adapters/RepairIssueSupertypesAdapter$SupertypeViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 KotlinExtensions.kt\ncom/uber/autodispose/android/KotlinExtensionsKt\n*L\n1#1,106:1\n18#2:107\n9#3,4:108\n1#4:112\n41#5:113\n*S KotlinDebug\n*F\n+ 1 RepairIssueSupertypesAdapter.kt\nco/bird/android/feature/repair/v2/supertypes/adapters/RepairIssueSupertypesAdapter$SupertypeViewHolder\n*L\n86#1:107\n86#1:108,4\n95#1:113\n*E\n"})
    /* renamed from: Kz4$a */
    /* loaded from: classes3.dex */
    public final class C4663a extends C29735w1 {

        /* renamed from: b */
        public final TextView f20514b;

        /* renamed from: c */
        public final TextView f20515c;

        /* renamed from: d */
        public final ImageView f20516d;

        /* renamed from: e */
        public final RecyclerView f20517e;

        /* renamed from: f */
        public final View f20518f;

        /* renamed from: g */
        public final C33480Hz4 f20519g;

        /* renamed from: h */
        public final /* synthetic */ C34182Kz4 f20520h;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/view/View;", "<anonymous parameter 0>", "Landroid/view/MotionEvent;", "event", "", C17296a.f69688o, "(Landroid/view/View;Landroid/view/MotionEvent;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Kz4$a$a */
        /* loaded from: classes3.dex */
        public static final class C4664a extends Lambda implements Function2<View, MotionEvent, Boolean> {
            public C4664a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a */
            public final Boolean invoke(View view, MotionEvent event) {
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                return Boolean.valueOf(C4663a.this.itemView.onTouchEvent(event));
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nRepairIssueSupertypesAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSupertypesAdapter.kt\nco/bird/android/feature/repair/v2/supertypes/adapters/RepairIssueSupertypesAdapter$SupertypeViewHolder$2\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n18#2:107\n9#3,4:108\n1#4:112\n*S KotlinDebug\n*F\n+ 1 RepairIssueSupertypesAdapter.kt\nco/bird/android/feature/repair/v2/supertypes/adapters/RepairIssueSupertypesAdapter$SupertypeViewHolder$2\n*L\n79#1:107\n79#1:108,4\n*E\n"})
        /* renamed from: Kz4$a$b */
        /* loaded from: classes3.dex */
        public static final class C4665b extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C34182Kz4 f20522g;

            /* renamed from: h */
            public final /* synthetic */ C4663a f20523h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4665b(C34182Kz4 c34182Kz4, C4663a c4663a) {
                super(1);
                this.f20522g = c34182Kz4;
                this.f20523h = c4663a;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Object m105816c = this.f20522g.m94545o().m109397e(this.f20523h.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof C32551Ea2)) {
                    m105816c = null;
                }
                C32551Ea2 c32551Ea2 = (C32551Ea2) m105816c;
                if (c32551Ea2 != null) {
                    C34182Kz4 c34182Kz4 = this.f20522g;
                    c34182Kz4.f20513e.onNext(c32551Ea2.m108787a());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4663a(C34182Kz4 c34182Kz4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f20520h = c34182Kz4;
            this.f20514b = (TextView) view.findViewById(C35658Rh4.supertype);
            this.f20515c = (TextView) view.findViewById(C35658Rh4.repairsNeeded);
            this.f20516d = (ImageView) view.findViewById(C35658Rh4.asset);
            RecyclerView recyclerView = (RecyclerView) view.findViewById(C35658Rh4.recyclerView);
            this.f20517e = recyclerView;
            this.f20518f = view.findViewById(C35658Rh4.divider);
            C33480Hz4 c33480Hz4 = new C33480Hz4();
            this.f20519g = c33480Hz4;
            recyclerView.setLayoutManager(new LinearLayoutManager(this.itemView.getContext()));
            recyclerView.setItemAnimator(new C11894g());
            recyclerView.setAdapter(c33480Hz4);
            Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
            C34585Ms2.m94649v(recyclerView, new C4664a());
            View itemView = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            C34585Ms2.m94661j(itemView, new C4665b(c34182Kz4, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            List listOf;
            Object m105816c = this.f20520h.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C32551Ea2)) {
                m105816c = null;
            }
            C32551Ea2 c32551Ea2 = (C32551Ea2) m105816c;
            if (c32551Ea2 != null) {
                C34182Kz4 c34182Kz4 = this.f20520h;
                Issue m108787a = c32551Ea2.m108787a();
                String m108786b = c32551Ea2.m108786b();
                C3023H6 m108785c = c32551Ea2.m108785c();
                this.f20514b.setText(m108787a.getDisplay());
                this.f20515c.setText(m108786b);
                String assetId = m108787a.getAssetId();
                if (assetId != null) {
                    AbstractC23442F<LocalAsset> mo13534a = c34182Kz4.f20511c.mo13534a(assetId, AssetManagerType.REPAIR, TaskPriority.IMMEDIATE);
                    ImageView asset = this.f20516d;
                    Intrinsics.checkNotNullExpressionValue(asset, "asset");
                    RecyclerView recyclerView = c34182Kz4.f20512d;
                    if (recyclerView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                        recyclerView = null;
                    }
                    ScopeProvider m45202a = ViewScopeProvider.m45202a(recyclerView);
                    Intrinsics.checkExpressionValueIsNotNull(m45202a, "ViewScopeProvider.from(this)");
                    C37279Yf5.m74583L(mo13534a, asset, m45202a);
                }
                RecyclerView recyclerView2 = this.f20517e;
                Intrinsics.checkNotNullExpressionValue(recyclerView2, "recyclerView");
                if (m108785c.m104407f() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                C49520tu6.show$default(recyclerView2, z, 0, 2, null);
                View divider = this.f20518f;
                Intrinsics.checkNotNullExpressionValue(divider, "divider");
                RecyclerView recyclerView3 = this.f20517e;
                Intrinsics.checkNotNullExpressionValue(recyclerView3, "recyclerView");
                C49520tu6.m11232s(divider, C49520tu6.m11230u(recyclerView3), 4);
                C33480Hz4 c33480Hz4 = this.f20519g;
                listOf = CollectionsKt__CollectionsJVMKt.listOf(m108785c);
                c33480Hz4.mo24871u(listOf);
            }
        }
    }

    public C34182Kz4(InterfaceC48923su2 localAssetManager) {
        Intrinsics.checkNotNullParameter(localAssetManager, "localAssetManager");
        this.f20511c = localAssetManager;
        C24552a<Issue> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<Issue>()");
        this.f20513e = m31922e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f20512d = recyclerView;
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C35820Rz4());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C34416Lz4();
    }

    /* renamed from: v */
    public final Observable<Issue> m98000v() {
        Observable<Issue> hide = this.f20513e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "supertypesSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C32634Ej4.item_repair_v2_supertype_card ? new C4663a(this, m41761u) : new C29735w1(m41761u);
    }
}
