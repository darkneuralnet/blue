package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C11905h;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdKt;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002&\u0012B\u0011\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b$\u0010%J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0014\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u000e0\u000e0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006'"}, m28432d2 = {"Lx43;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lw1;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "getItemCount", "", "Lco/bird/android/model/wire/WireBird;", "birds", "p", "", "b", "Z", "showRange", "Lio/reactivex/Observable;", "c", "Lkotlin/Lazy;", "o", "()Lio/reactivex/Observable;", "reserveClicks", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/d;", "reserveClicksSubject", "", "e", "Ljava/util/List;", "adapterData", "<init>", "(Z)V", C17296a.f69688o, "nest-details_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: x43  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51394x43 extends RecyclerView.AbstractC11843h<C29735w1> {

    /* renamed from: b */
    public final boolean f117067b;

    /* renamed from: c */
    public final Lazy f117068c;

    /* renamed from: d */
    public final C24558d<WireBird> f117069d;

    /* renamed from: e */
    public final List<WireBird> f117070e;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0013"}, m28432d2 = {"Lx43$a;", "Landroidx/recyclerview/widget/h$b;", "", "oldItemPosition", "newItemPosition", "", "areItemsTheSame", "getOldListSize", "getNewListSize", "areContentsTheSame", "", "Lco/bird/android/model/wire/WireBird;", C17296a.f69688o, "Ljava/util/List;", "oldBirds", "b", "newBirds", "<init>", "(Lx43;Ljava/util/List;Ljava/util/List;)V", "nest-details_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: x43$a */
    /* loaded from: classes3.dex */
    public final class C30032a extends C11905h.AbstractC11907b {

        /* renamed from: a */
        public final List<WireBird> f117071a;

        /* renamed from: b */
        public final List<WireBird> f117072b;

        /* renamed from: c */
        public final /* synthetic */ C51394x43 f117073c;

        public C30032a(C51394x43 c51394x43, List<WireBird> oldBirds, List<WireBird> newBirds) {
            Intrinsics.checkNotNullParameter(oldBirds, "oldBirds");
            Intrinsics.checkNotNullParameter(newBirds, "newBirds");
            this.f117073c = c51394x43;
            this.f117071a = oldBirds;
            this.f117072b = newBirds;
        }

        @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
        public boolean areContentsTheSame(int i, int i2) {
            WireBird wireBird = this.f117071a.get(i);
            WireBird wireBird2 = this.f117072b.get(i2);
            if (Intrinsics.areEqual(wireBird.getCode(), wireBird2.getCode()) && wireBird.getBatteryLevel() == wireBird2.getBatteryLevel() && Intrinsics.areEqual(wireBird.getLastRideEndedAt(), wireBird2.getLastRideEndedAt())) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
        public boolean areItemsTheSame(int i, int i2) {
            return this.f117071a.get(i).isSame(this.f117072b.get(i2));
        }

        @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
        public int getNewListSize() {
            return this.f117072b.size();
        }

        @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
        public int getOldListSize() {
            return this.f117071a.size();
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lx43$b;", "Lw1;", "", "position", "", "bind", "Lud2;", "b", "Lud2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lx43;Landroid/view/View;)V", "nest-details_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: x43$b */
    /* loaded from: classes3.dex */
    public final class C30033b extends C29735w1 {

        /* renamed from: b */
        public final C49939ud2 f117074b;

        /* renamed from: c */
        public final /* synthetic */ C51394x43 f117075c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: x43$b$a */
        /* loaded from: classes3.dex */
        public static final class C30034a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C51394x43 f117077h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30034a(C51394x43 c51394x43) {
                super(1);
                this.f117077h = c51394x43;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                if (C30033b.this.getAdapterPosition() != -1) {
                    this.f117077h.f117069d.onNext(this.f117077h.f117070e.get(C30033b.this.getAdapterPosition()));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30033b(C51394x43 c51394x43, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f117075c = c51394x43;
            C49939ud2 m9944a = C49939ud2.m9944a(view);
            Intrinsics.checkNotNullExpressionValue(m9944a, "bind(view)");
            this.f117074b = m9944a;
            Button button = m9944a.f112680g;
            Intrinsics.checkNotNullExpressionValue(button, "binding.reserve");
            C34585Ms2.m94661j(button, new C30034a(c51394x43));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            int i2;
            super.bind(i);
            WireBird wireBird = (WireBird) this.f117075c.f117070e.get(i);
            Integer estimatedRange = wireBird.getEstimatedRange();
            View view = this.itemView;
            if (this.f117075c.f117067b && estimatedRange != null) {
                LinearLayout linearLayout = this.f117074b.f112679f;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.rangeView");
                C49520tu6.m11233r(linearLayout);
                LinearLayout linearLayout2 = this.f117074b.f112677d;
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.batteryView");
                C49520tu6.m11239l(linearLayout2);
                TextView textView = this.f117074b.f112678e;
                C51916xx1 c51916xx1 = C51916xx1.f118396a;
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                textView.setText(C51916xx1.distance$default(c51916xx1, context, estimatedRange.intValue(), 0.0d, true, 4, null));
            } else {
                LinearLayout linearLayout3 = this.f117074b.f112679f;
                Intrinsics.checkNotNullExpressionValue(linearLayout3, "binding.rangeView");
                C49520tu6.m11239l(linearLayout3);
                LinearLayout linearLayout4 = this.f117074b.f112677d;
                Intrinsics.checkNotNullExpressionValue(linearLayout4, "binding.batteryView");
                C49520tu6.m11233r(linearLayout4);
                TextView textView2 = this.f117074b.f112675b;
                C51916xx1 c51916xx12 = C51916xx1.f118396a;
                Context context2 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "context");
                textView2.setText(c51916xx12.m4411a(context2, wireBird.getBatteryLevel(), true));
                this.f117074b.f112676c.setPercent(wireBird.getBatteryLevel());
            }
            this.f117074b.f112682i.setText(wireBird.getCode());
            ImageView imageView = this.f117074b.f112683j;
            if (WireBirdKt.isCruiserModel(wireBird)) {
                i2 = C48193rg4.ic_vehicle_moped;
            } else {
                i2 = C48193rg4.ic_scooter_flying;
            }
            imageView.setImageResource(i2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: x43$c */
    /* loaded from: classes3.dex */
    public static final class C30035c extends Lambda implements Function0<Observable<WireBird>> {
        public C30035c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<WireBird> invoke() {
            return C51394x43.this.f117069d.hide();
        }
    }

    public C51394x43(boolean z) {
        Lazy lazy;
        this.f117067b = z;
        lazy = LazyKt__LazyJVMKt.lazy(new C30035c());
        this.f117068c = lazy;
        C24558d<WireBird> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<WireBird>()");
        this.f117069d = m31902e;
        this.f117070e = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemCount() {
        return this.f117070e.size();
    }

    /* renamed from: o */
    public final Observable<WireBird> m5877o() {
        Object value = this.f117068c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-reserveClicks>(...)");
        return (Observable) value;
    }

    /* renamed from: p */
    public final void m5876p(List<WireBird> birds) {
        Intrinsics.checkNotNullParameter(birds, "birds");
        C11905h.C11910e m66274b = C11905h.m66274b(new C30032a(this, this.f117070e, birds));
        Intrinsics.checkNotNullExpressionValue(m66274b, "calculateDiff(DiffCallba…rData, newBirds = birds))");
        this.f117070e.clear();
        this.f117070e.addAll(birds);
        m66274b.m66261d(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onBindViewHolder(C29735w1 holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        return new C30033b(this, C40788fB0.m41761u(context, C47037pj4.item_nest_details_vehicle, parent, false));
    }
}
