package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.WireRideTransaction;
import co.bird.api.response.RideSummary;
import com.facebook.share.internal.C17296a;
import com.stripe.android.networking.FraudDetectionData;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u001b"}, m28432d2 = {"LxR4;", "Lct4;", "Lco/bird/api/response/RideSummary;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Landroidx/recyclerview/widget/RecyclerView$D;", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "", "g", "Z", "E", "()Z", "billedMinutes", "h", "F", "hideTime", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;ZZ)V", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: xR4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C51608xR4 extends AbstractC39429ct4<RideSummary> {

    /* renamed from: g */
    public final boolean f117607g;

    /* renamed from: h */
    public final boolean f117608h;

    @Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b3\u00104J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010$\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010*\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010-\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b+\u0010\u0019\u001a\u0004\b,\u0010\u001bR\u0017\u00100\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b.\u0010\u0019\u001a\u0004\b/\u0010\u001b¨\u00065"}, m28432d2 = {"LxR4$a;", "Lw1;", "", "position", "", "bind", "Lco/bird/android/model/wire/WireRide;", "ride", "", "billedMinutes", "hideTime", "b", "Lco/bird/android/model/wire/WireRideTransaction;", "transaction", "Ljava/util/Currency;", "fallbackCurrency", "", C17296a.f69688o, "LxR4;", "LxR4;", "e", "()LxR4;", "adapter", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "getTimestamp", "()Landroid/widget/TextView;", FraudDetectionData.KEY_TIMESTAMP, DateTokenConverter.CONVERTER_KEY, "getDistance", "distance", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "getDistanceIcon", "()Landroid/widget/ImageView;", "distanceIcon", "Landroid/widget/LinearLayout;", "f", "Landroid/widget/LinearLayout;", "getDurationSection", "()Landroid/widget/LinearLayout;", "durationSection", "g", "getDuration", "duration", "h", "getCost", "cost", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;LxR4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: xR4$a */
    /* loaded from: classes2.dex */
    public static final class C30173a extends C29735w1 {

        /* renamed from: b */
        public final C51608xR4 f117609b;

        /* renamed from: c */
        public final TextView f117610c;

        /* renamed from: d */
        public final TextView f117611d;

        /* renamed from: e */
        public final ImageView f117612e;

        /* renamed from: f */
        public final LinearLayout f117613f;

        /* renamed from: g */
        public final TextView f117614g;

        /* renamed from: h */
        public final TextView f117615h;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: xR4$a$a */
        /* loaded from: classes2.dex */
        public static final class C30174a extends Lambda implements Function1<View, Unit> {
            public C30174a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                int adapterPosition = C30173a.this.getAdapterPosition();
                if (adapterPosition != -1) {
                    C30173a.this.m5263e().m44894r().onNext(C30173a.this.m5263e().m44895q(adapterPosition));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30173a(View view, C51608xR4 adapter) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            this.f117609b = adapter;
            this.f117610c = (TextView) C49520tu6.m11243h(view, C36585Vg4.timestamp);
            this.f117611d = (TextView) C49520tu6.m11243h(view, C36585Vg4.distance);
            this.f117612e = (ImageView) C49520tu6.m11243h(view, C36585Vg4.distanceIcon);
            this.f117613f = (LinearLayout) C49520tu6.m11243h(view, C36585Vg4.durationSection);
            this.f117614g = (TextView) C49520tu6.m11243h(view, C36585Vg4.duration);
            this.f117615h = (TextView) C49520tu6.m11243h(view, C36585Vg4.cost);
            C34585Ms2.m94661j(view, new C30174a());
        }

        /* renamed from: a */
        public final String m5265a(WireRideTransaction wireRideTransaction, Currency currency) {
            String currency$default;
            if (wireRideTransaction == null || (currency$default = C51916xx1.currency$default(C51916xx1.f118396a, wireRideTransaction.getAmount() * (-1), C45097mS5.m25591o(wireRideTransaction.getCurrency()), null, 4, null)) == null) {
                return C51916xx1.currency$default(C51916xx1.f118396a, 0L, currency, null, 4, null);
            }
            return currency$default;
        }

        /* renamed from: b */
        public final void m5264b(WireRide wireRide, boolean z, boolean z2) {
            Unit unit;
            if (z2) {
                C49520tu6.m11239l(this.f117613f);
            } else if (z) {
                Integer billedMinutes = wireRide.getBilledMinutes();
                if (billedMinutes != null) {
                    this.f117614g.setText(C51916xx1.durationMinute$default(C51916xx1.f118396a, this.f117609b.m44892u(), billedMinutes.intValue(), false, 4, null));
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    this.f117614g.setText(C51916xx1.f118396a.m4402j(wireRide.durationSeconds()));
                }
            } else {
                this.f117614g.setText(C51916xx1.f118396a.m4402j(wireRide.durationSeconds()));
            }
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            String string;
            boolean z;
            boolean z2;
            boolean z3;
            WireRideTransaction transaction = this.f117609b.m44895q(i).getTransaction();
            WireRide ride = this.f117609b.m44895q(i).getRide();
            DateTime completedAt = ride.getCompletedAt();
            TextView textView = this.f117610c;
            if (completedAt != null) {
                string = C51916xx1.shortDateAndTimeOfDay$default(C51916xx1.f118396a, completedAt, null, 2, null);
            } else {
                string = textView.getContext().getString(C45871nl4.ride_history_ride_in_progress);
            }
            textView.setText(string);
            this.f117615h.setText(m5265a(transaction, C45097mS5.m25591o(ride.getCurrency())));
            TextView textView2 = this.f117615h;
            boolean z4 = true;
            if (transaction != null) {
                z = true;
            } else {
                z = false;
            }
            C49520tu6.show$default(textView2, z, 0, 2, null);
            TextView textView3 = this.f117611d;
            C51916xx1 c51916xx1 = C51916xx1.f118396a;
            Context context = textView3.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "distance.context");
            textView3.setText(C51916xx1.distance$default(c51916xx1, context, ride.getDistance(), 0.0d, false, 12, null));
            TextView textView4 = this.f117611d;
            if (ride.getDistance() == 0.0d) {
                z2 = true;
            } else {
                z2 = false;
            }
            C49520tu6.show$default(textView4, !z2, 0, 2, null);
            ImageView imageView = this.f117612e;
            if (ride.getDistance() == 0.0d) {
                z3 = true;
            } else {
                z3 = false;
            }
            C49520tu6.show$default(imageView, !z3, 0, 2, null);
            boolean m5267E = this.f117609b.m5267E();
            if (!this.f117609b.m5266F() && ride.durationSeconds() != 0) {
                z4 = false;
            }
            m5264b(ride, m5267E, z4);
        }

        /* renamed from: e */
        public final C51608xR4 m5263e() {
            return this.f117609b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51608xR4(Context context, boolean z, boolean z2) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f117607g = z;
        this.f117608h = z2;
    }

    /* renamed from: E */
    public final boolean m5267E() {
        return this.f117607g;
    }

    /* renamed from: F */
    public final boolean m5266F() {
        return this.f117608h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onBindViewHolder(RecyclerView.AbstractC11834D holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((C29735w1) holder).bind(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public RecyclerView.AbstractC11834D onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new C30173a(C40788fB0.m41761u(m44892u(), C39311cj4.item_ride_history, parent, false), this);
    }
}
