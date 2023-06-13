package p000;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.HealthStatus;
import co.bird.android.model.wire.WireInventoryPart;
import co.bird.android.model.wire.WireQuickLink;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24552a;
import io.reactivex.subjects.C24558d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0003\u001b\u001c\u0010B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00030\u00030\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00070\u00070\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00050\u00050\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011¨\u0006\u001d"}, m28432d2 = {"LaI3;", "LyS0;", "Lio/reactivex/Observable;", "", "v", "Lco/bird/android/model/wire/WireQuickLink;", "w", "", "x", "Landroid/view/ViewGroup;", "parent", "viewType", "Lw1;", "onCreateViewHolder", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "partCountSubject", "Lio/reactivex/subjects/a;", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/a;", "partScanClicksSubject", "e", "relatedLinkClicksSubject", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.operator-inventory"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: aI3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37872aI3 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<Integer> f50234c;

    /* renamed from: d */
    public final C24552a<Unit> f50235d;

    /* renamed from: e */
    public final C24558d<WireQuickLink> f50236e;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u0010"}, m28432d2 = {"LaI3$a;", "Lw1;", "", "position", "", "bind", "Lco/bird/android/model/constant/HealthStatus;", "healthStatus", "b", "Lte2;", "Lte2;", "binding", "Landroid/view/View;", "view", "<init>", "(LaI3;Landroid/view/View;)V", "co.bird.android.feature.operator-inventory"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPartDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartDetailsAdapter.kt\nco/bird/android/feature/operatorinventory/adapter/PartDetailsAdapter$PartDetailsViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,152:1\n18#2:153\n9#3,4:154\n*S KotlinDebug\n*F\n+ 1 PartDetailsAdapter.kt\nco/bird/android/feature/operatorinventory/adapter/PartDetailsAdapter$PartDetailsViewHolder\n*L\n72#1:153\n72#1:154,4\n*E\n"})
    /* renamed from: aI3$a */
    /* loaded from: classes3.dex */
    public final class C10616a extends C29735w1 {

        /* renamed from: b */
        public final C49356te2 f50237b;

        /* renamed from: c */
        public final /* synthetic */ C37872aI3 f50238c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: aI3$a$a */
        /* loaded from: classes3.dex */
        public static final class C10617a extends Lambda implements Function1<View, Unit> {
            public C10617a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                int i = 1;
                try {
                    i = 1 + Integer.parseInt(C10616a.this.f50237b.f110823l.getText().toString());
                } catch (NumberFormatException unused) {
                }
                C10616a.this.f50237b.f110823l.setText(String.valueOf(i));
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: aI3$a$b */
        /* loaded from: classes3.dex */
        public static final class C10618b extends Lambda implements Function1<View, Unit> {
            public C10618b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                int i = 0;
                try {
                    i = RangesKt___RangesKt.coerceAtLeast(Integer.parseInt(C10616a.this.f50237b.f110823l.getText().toString()) - 1, 0);
                } catch (NumberFormatException unused) {
                }
                C10616a.this.f50237b.f110823l.setText(String.valueOf(i));
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"aI3$a$c", "Ld36;", "Landroid/text/Editable;", "s", "", "afterTextChanged", "co.bird.android.feature.operator-inventory"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: aI3$a$c */
        /* loaded from: classes3.dex */
        public static final class C10619c extends C39530d36 {

            /* renamed from: b */
            public final /* synthetic */ C37872aI3 f50241b;

            /* renamed from: c */
            public final /* synthetic */ C10616a f50242c;

            /* renamed from: d */
            public final /* synthetic */ WireInventoryPart f50243d;

            public C10619c(C37872aI3 c37872aI3, C10616a c10616a, WireInventoryPart wireInventoryPart) {
                this.f50241b = c37872aI3;
                this.f50242c = c10616a;
                this.f50243d = wireInventoryPart;
            }

            @Override // p000.C39530d36, android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                Intrinsics.checkNotNullParameter(s, "s");
                try {
                    int parseInt = Integer.parseInt(s.toString());
                    this.f50241b.f50234c.onNext(Integer.valueOf(parseInt));
                    this.f50242c.m71692b(this.f50243d.healthyLevel(parseInt));
                } catch (NumberFormatException unused) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10616a(C37872aI3 c37872aI3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f50238c = c37872aI3;
            C49356te2 m11985a = C49356te2.m11985a(view);
            Intrinsics.checkNotNullExpressionValue(m11985a, "bind(view)");
            this.f50237b = m11985a;
            ImageView imageView = m11985a.f110822k;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.plusButton");
            C34585Ms2.m94661j(imageView, new C10617a());
            ImageView imageView2 = m11985a.f110815d;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.minusButton");
            C34585Ms2.m94661j(imageView2, new C10618b());
        }

        /* renamed from: b */
        public final void m71692b(HealthStatus healthStatus) {
            boolean z;
            boolean z2;
            TextView textView = this.f50237b.f110814c;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.inventoryLevelLabel");
            boolean z3 = true;
            C49520tu6.show$default(textView, true, 0, 2, null);
            TextView textView2 = this.f50237b.f110813b;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.healthyLevel");
            if (healthStatus == null) {
                z = true;
            } else {
                z = false;
            }
            C49520tu6.show$default(textView2, z, 0, 2, null);
            TextView textView3 = this.f50237b.f110816e;
            Intrinsics.checkNotNullExpressionValue(textView3, "binding.outOfStockLabel");
            if (healthStatus == HealthStatus.OUT_OF_STOCK) {
                z2 = true;
            } else {
                z2 = false;
            }
            C49520tu6.show$default(textView3, z2, 0, 2, null);
            TextView textView4 = this.f50237b.f110824m;
            Intrinsics.checkNotNullExpressionValue(textView4, "binding.runningLowLabel");
            if (healthStatus != HealthStatus.RUNNING_LOW) {
                z3 = false;
            }
            C49520tu6.show$default(textView4, z3, 0, 2, null);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f50238c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof WireInventoryPart)) {
                m105816c = null;
            }
            WireInventoryPart wireInventoryPart = (WireInventoryPart) m105816c;
            if (wireInventoryPart != null) {
                C37872aI3 c37872aI3 = this.f50238c;
                this.f50237b.f110826o.setText(wireInventoryPart.displayName());
                boolean z = true;
                this.f50237b.f110825n.setText(getContext().getString(C45871nl4.operator_inventory_part_sku, wireInventoryPart.getSku()));
                String defaultImageUrl = wireInventoryPart.getDefaultImageUrl();
                if (defaultImageUrl != null) {
                    ComponentCallbacks2C17096a.m53137u(this.f50237b.f110818g).m81662b().m16089a1(defaultImageUrl).m16082g1(C24847jU.m30574l()).m16096R0(this.f50237b.f110818g);
                }
                this.f50237b.f110823l.setText(String.valueOf(wireInventoryPart.getQuantity()));
                this.f50237b.f110821j.setText(getContext().getString(C45871nl4.operator_inventory_part_reorder_level, String.valueOf(wireInventoryPart.getHealthyThreshold())));
                if (wireInventoryPart.getHealthStatus() == HealthStatus.INCOMPLETE) {
                    z = false;
                }
                if (z) {
                    m71692b(wireInventoryPart.healthyLevel(wireInventoryPart.getQuantity()));
                } else {
                    TextView textView = this.f50237b.f110814c;
                    Intrinsics.checkNotNullExpressionValue(textView, "binding.inventoryLevelLabel");
                    C49520tu6.show$default(textView, false, 0, 2, null);
                    TextView textView2 = this.f50237b.f110813b;
                    Intrinsics.checkNotNullExpressionValue(textView2, "binding.healthyLevel");
                    C49520tu6.show$default(textView2, false, 0, 2, null);
                    TextView textView3 = this.f50237b.f110816e;
                    Intrinsics.checkNotNullExpressionValue(textView3, "binding.outOfStockLabel");
                    C49520tu6.show$default(textView3, false, 0, 2, null);
                    TextView textView4 = this.f50237b.f110824m;
                    Intrinsics.checkNotNullExpressionValue(textView4, "binding.runningLowLabel");
                    C49520tu6.show$default(textView4, false, 0, 2, null);
                }
                this.f50237b.f110823l.addTextChangedListener(new C10619c(c37872aI3, this, wireInventoryPart));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LaI3$b;", "Lw1;", "", "position", "", "bind", "Lwe2;", "b", "Lwe2;", "binding", "LhI3;", "c", "LhI3;", "relatedLinkAdapter", "Landroid/view/View;", "view", "<init>", "(LaI3;Landroid/view/View;)V", "co.bird.android.feature.operator-inventory"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPartDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartDetailsAdapter.kt\nco/bird/android/feature/operatorinventory/adapter/PartDetailsAdapter$RelatedLinksViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,152:1\n18#2:153\n9#3,4:154\n*S KotlinDebug\n*F\n+ 1 PartDetailsAdapter.kt\nco/bird/android/feature/operatorinventory/adapter/PartDetailsAdapter$RelatedLinksViewHolder\n*L\n146#1:153\n146#1:154,4\n*E\n"})
    /* renamed from: aI3$b */
    /* loaded from: classes3.dex */
    public final class C10620b extends C29735w1 {

        /* renamed from: b */
        public final C51134we2 f50244b;

        /* renamed from: c */
        public final C42040hI3 f50245c;

        /* renamed from: d */
        public final /* synthetic */ C37872aI3 f50246d;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: aI3$b$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C10621a extends FunctionReferenceImpl implements Function1<WireQuickLink, Unit> {
            public C10621a(Object obj) {
                super(1, obj, C24558d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
            }

            /* renamed from: a */
            public final void m71691a(WireQuickLink p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((C24558d) this.receiver).onNext(p0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WireQuickLink wireQuickLink) {
                m71691a(wireQuickLink);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10620b(C37872aI3 c37872aI3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f50246d = c37872aI3;
            C51134we2 m6563a = C51134we2.m6563a(view);
            Intrinsics.checkNotNullExpressionValue(m6563a, "bind(view)");
            this.f50244b = m6563a;
            C42040hI3 c42040hI3 = new C42040hI3();
            this.f50245c = c42040hI3;
            RecyclerView recyclerView = m6563a.f116297b;
            recyclerView.addItemDecoration(new C42633iI3());
            recyclerView.setItemAnimator(new C11894g());
            recyclerView.setAdapter(c42040hI3);
            c42040hI3.m36553v(new C10621a(c37872aI3.f50236e));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            List listOf;
            Object m105816c = this.f50246d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C3023H6)) {
                m105816c = null;
            }
            C3023H6 c3023h6 = (C3023H6) m105816c;
            if (c3023h6 != null) {
                C42040hI3 c42040hI3 = this.f50245c;
                listOf = CollectionsKt__CollectionsJVMKt.listOf(c3023h6);
                c42040hI3.mo24871u(listOf);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\n"}, m28432d2 = {"LaI3$c;", "Lw1;", "Lue2;", "b", "Lue2;", "binding", "Landroid/view/View;", "view", "<init>", "(LaI3;Landroid/view/View;)V", "co.bird.android.feature.operator-inventory"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: aI3$c */
    /* loaded from: classes3.dex */
    public final class C10622c extends C29735w1 {

        /* renamed from: b */
        public final C49949ue2 f50247b;

        /* renamed from: c */
        public final /* synthetic */ C37872aI3 f50248c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: aI3$c$a */
        /* loaded from: classes3.dex */
        public static final class C10623a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C37872aI3 f50249g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10623a(C37872aI3 c37872aI3) {
                super(1);
                this.f50249g = c37872aI3;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f50249g.f50235d.onNext(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10622c(C37872aI3 c37872aI3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f50248c = c37872aI3;
            C49949ue2 m9928a = C49949ue2.m9928a(view);
            Intrinsics.checkNotNullExpressionValue(m9928a, "bind(view)");
            this.f50247b = m9928a;
            View view2 = m9928a.f112700e;
            Intrinsics.checkNotNullExpressionValue(view2, "binding.scanAnotherPartContainer");
            C34585Ms2.m94661j(view2, new C10623a(c37872aI3));
        }
    }

    public C37872aI3() {
        C24558d<Integer> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Int>()");
        this.f50234c = m31902e;
        C24552a<Unit> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<Unit>()");
        this.f50235d = m31922e;
        C24558d<WireQuickLink> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<WireQuickLink>()");
        this.f50236e = m31902e2;
    }

    /* renamed from: v */
    public final Observable<Integer> m71696v() {
        Observable<Integer> hide = this.f50234c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "partCountSubject.hide()");
        return hide;
    }

    /* renamed from: w */
    public final Observable<WireQuickLink> m71695w() {
        Observable<WireQuickLink> hide = this.f50236e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "relatedLinkClicksSubject.hide()");
        return hide;
    }

    /* renamed from: x */
    public final Observable<Unit> m71694x() {
        Observable<Unit> hide = this.f50235d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "partScanClicksSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C52965zj4.item_part_details ? new C10616a(this, m41761u) : i == C52965zj4.item_part_details_scan_another_part ? new C10622c(this, m41761u) : i == C52965zj4.item_part_related_links_section ? new C10620b(this, m41761u) : new C29735w1(m41761u);
    }
}
