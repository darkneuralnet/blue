package p000;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.RentalPlan;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringNumberConversionsKt;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, m28432d2 = {"Ljy4;", "LOr5;", "Lco/bird/android/model/RentalPlan;", "item", "", "K", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Landroidx/recyclerview/widget/RecyclerView$D;", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "Le13;", "i", "Le13;", "navigator", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;Le13;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: jy4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C43629jy4 extends AbstractC35047Or5<RentalPlan> {

    /* renamed from: i */
    public final InterfaceC40099e13 f93630i;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jy4$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C25059a extends FunctionReferenceImpl implements Function1<RentalPlan, Unit> {
        public C25059a(Object obj) {
            super(1, obj, C43629jy4.class, "onItemSelected", "onItemSelected(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m29579a(RentalPlan p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C43629jy4) this.receiver).m91276H(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RentalPlan rentalPlan) {
            m29579a(rentalPlan);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jy4$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C25060b extends FunctionReferenceImpl implements Function1<Integer, RentalPlan> {
        public C25060b(Object obj) {
            super(1, obj, C43629jy4.class, "get", "get(I)Ljava/lang/Object;", 0);
        }

        /* renamed from: a */
        public final RentalPlan m29578a(int i) {
            return ((C43629jy4) this.receiver).m44895q(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ RentalPlan invoke(Integer num) {
            return m29578a(num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jy4$c */
    /* loaded from: classes2.dex */
    public static final class C25061c extends Lambda implements Function0<Integer> {
        public C25061c() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(C43629jy4.this.m91277F());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "articleLink", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jy4$d */
    /* loaded from: classes2.dex */
    public static final class C25062d extends Lambda implements Function1<String, Unit> {
        public C25062d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String articleLink) {
            Long longOrNull;
            Intrinsics.checkNotNullParameter(articleLink, "articleLink");
            longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(articleLink);
            if (longOrNull == null) {
                C43629jy4.this.f93630i.mo36983m2(articleLink);
            } else {
                C43629jy4.this.f93630i.mo36922w3(longOrNull.longValue());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43629jy4(Context context, InterfaceC40099e13 navigator) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f93630i = navigator;
    }

    @Override // p000.AbstractC35047Or5
    /* renamed from: K */
    public String getId(RentalPlan item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item.getId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onBindViewHolder(RecyclerView.AbstractC11834D holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((C29735w1) holder).bind(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public RecyclerView.AbstractC11834D onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        return new C38167an6(C40788fB0.m41761u(context, C39311cj4.item_rental_vehicle_plan, parent, false), new C25059a(this), new C25060b(this), new C25061c(), new C25062d());
    }
}
