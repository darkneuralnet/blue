package p000;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.MerchantTransaction;
import co.bird.android.model.TransactionSummary;
import co.bird.android.model.TransactionSummaryKt;
import co.bird.android.model.TransactionSummaryRide;
import co.bird.android.model.wire.WireEndRidePhotoParkingEvaluation;
import co.bird.android.model.wire.WireMerchant;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.networking.FraudDetectionData;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010%\u001a\u00020\u0017\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b&\u0010'J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u0002H\u0002R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\rR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006)"}, m28432d2 = {"Lor6;", "Landroidx/recyclerview/widget/RecyclerView$D;", "Lco/bird/android/model/TransactionSummary;", RequestHeadersFactory.MODEL, "", "b", "", C17296a.f69688o, "", "Z", "enableRiderParkingReview", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "title", DateTokenConverter.CONVERTER_KEY, FraudDetectionData.KEY_TIMESTAMP, "e", "separator", "f", "description", "g", "cost", "Landroid/view/View;", "h", "Landroid/view/View;", "rightArrow", "Landroid/widget/ImageView;", "i", "Landroid/widget/ImageView;", "thumbImage", "j", "photoResultLabel", "Landroid/widget/LinearLayout;", "k", "Landroid/widget/LinearLayout;", "photoResultContainer", "view", "<init>", "(Landroid/view/View;Z)V", "l", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransactionHistoryAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionHistoryAdapter.kt\nco/bird/android/app/feature/transactionhistory/ViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n1#2:143\n*E\n"})
/* renamed from: or6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C46526or6 extends RecyclerView.AbstractC11834D {

    /* renamed from: l */
    public static final C27077a f102585l = new C27077a(null);

    /* renamed from: m */
    public static final int f102586m = 8;

    /* renamed from: n */
    public static final DateTimeFormatter f102587n;

    /* renamed from: o */
    public static final DateTimeFormatter f102588o;

    /* renamed from: b */
    public final boolean f102589b;

    /* renamed from: c */
    public final TextView f102590c;

    /* renamed from: d */
    public final TextView f102591d;

    /* renamed from: e */
    public final TextView f102592e;

    /* renamed from: f */
    public final TextView f102593f;

    /* renamed from: g */
    public final TextView f102594g;

    /* renamed from: h */
    public final View f102595h;

    /* renamed from: i */
    public final ImageView f102596i;

    /* renamed from: j */
    public final TextView f102597j;

    /* renamed from: k */
    public final LinearLayout f102598k;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lor6$a;", "", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: or6$a */
    /* loaded from: classes2.dex */
    public static final class C27077a {
        public /* synthetic */ C27077a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C27077a() {
        }
    }

    static {
        DateTimeFormatter shortDate = DateTimeFormat.shortDate();
        Intrinsics.checkNotNullExpressionValue(shortDate, "shortDate()");
        f102587n = shortDate;
        DateTimeFormatter shortTime = DateTimeFormat.shortTime();
        Intrinsics.checkNotNullExpressionValue(shortTime, "shortTime()");
        f102588o = shortTime;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46526or6(View view, boolean z) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.f102589b = z;
        this.f102590c = (TextView) C49520tu6.m11243h(view, C36585Vg4.title);
        this.f102591d = (TextView) C49520tu6.m11243h(view, C36585Vg4.date);
        this.f102592e = (TextView) C49520tu6.m11243h(view, C36585Vg4.separator);
        this.f102593f = (TextView) C49520tu6.m11243h(view, C36585Vg4.description);
        this.f102594g = (TextView) C49520tu6.m11243h(view, C36585Vg4.cost);
        this.f102595h = C49520tu6.m11243h(view, C36585Vg4.rightArrow);
        this.f102596i = (ImageView) C49520tu6.m11243h(view, C36585Vg4.thumbImage);
        this.f102597j = (TextView) C49520tu6.m11243h(view, C36585Vg4.photoResultLabel);
        this.f102598k = (LinearLayout) C49520tu6.m11243h(view, C36585Vg4.photoResultContainer);
    }

    /* renamed from: a */
    public final String m20427a(TransactionSummary transactionSummary) {
        Integer auxiliaryDescriptionRes = TransactionSummaryKt.auxiliaryDescriptionRes(transactionSummary);
        if (auxiliaryDescriptionRes != null) {
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
            return context.getString(auxiliaryDescriptionRes.intValue());
        }
        return null;
    }

    /* renamed from: b */
    public final void m20426b(TransactionSummary model) {
        boolean m84306a;
        Unit unit;
        boolean z;
        Pair pair;
        WireMerchant merchant;
        String name;
        WireEndRidePhotoParkingEvaluation wireEndRidePhotoParkingEvaluation;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(model, "model");
        View view = this.f102595h;
        m84306a = T66.m84306a(model);
        C49520tu6.m11232s(view, m84306a, 4);
        DateTime timestamp = model.timestamp();
        Unit unit2 = null;
        if (timestamp != null) {
            C49520tu6.setTextAndVisibility$default(this.f102591d, f102587n.print(timestamp), 0, 2, null);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C49520tu6.m11239l(this.f102591d);
        }
        String m20427a = m20427a(model);
        if (m20427a == null) {
            DateTime timestamp2 = model.timestamp();
            if (timestamp2 != null) {
                m20427a = f102588o.print(timestamp2);
            } else {
                m20427a = null;
            }
        }
        C49520tu6.setTextAndVisibility$default(this.f102593f, m20427a, 0, 2, null);
        TextView textView = this.f102592e;
        if (C49520tu6.m11230u(this.f102591d) && C49520tu6.m11230u(this.f102593f)) {
            z = true;
        } else {
            z = false;
        }
        C49520tu6.show$default(textView, z, 0, 2, null);
        MerchantTransaction merchantTransaction = model.getMerchantTransaction();
        if (merchantTransaction != null) {
            pair = new Pair(Long.valueOf(merchantTransaction.getBilledAmount()), C45097mS5.m25591o(merchantTransaction.getCurrency()));
        } else {
            pair = new Pair(Long.valueOf(model.cost()), C45097mS5.m25591o(model.currency()));
        }
        long longValue = ((Number) pair.component1()).longValue();
        String m4408d = C51916xx1.f118396a.m4408d(Math.abs(longValue), (Currency) pair.component2(), EnumC36501Ux1.SHOW_ALWAYS);
        if (!model.getTransactedInFull() && longValue != 0) {
            if (i2 > 0) {
                m4408d = this.itemView.getContext().getString(C45871nl4.currency_positive_amount, m4408d);
                Intrinsics.checkNotNullExpressionValue(m4408d, "{\n        itemView.conte…nt, amountString)\n      }");
            } else {
                m4408d = this.itemView.getContext().getString(C45871nl4.currency_negative_amount, m4408d);
                Intrinsics.checkNotNullExpressionValue(m4408d, "{\n        itemView.conte…nt, amountString)\n      }");
            }
        }
        this.f102594g.setText(m4408d);
        C49520tu6.show$default(this.f102598k, this.f102589b, 0, 2, null);
        if (this.f102589b && model.getRide() != null) {
            TransactionSummaryRide ride = model.getRide();
            if (ride != null) {
                wireEndRidePhotoParkingEvaluation = ride.getRideEndRidePhotoParkingEvaluation();
            } else {
                wireEndRidePhotoParkingEvaluation = null;
            }
            if (wireEndRidePhotoParkingEvaluation != null) {
                this.f102597j.setText(C45871nl4.ride_history_parking_photo_review_label);
                if (wireEndRidePhotoParkingEvaluation.getProperParking()) {
                    i = C48193rg4.ic_thumbs_up_small;
                } else {
                    i = C48193rg4.ic_thumbs_down_small;
                }
                this.f102596i.setImageResource(i);
                C49520tu6.m11233r(this.f102596i);
            } else {
                this.f102597j.setText(C45871nl4.ride_history_parking_photo_in_review);
                C49520tu6.m11239l(this.f102596i);
            }
            C49520tu6.m11233r(this.f102597j);
        } else {
            C49520tu6.m11239l(this.f102597j);
            C49520tu6.m11239l(this.f102596i);
        }
        if (model.getMerchantTransaction() != null) {
            C49520tu6.m11233r(this.f102590c);
            MerchantTransaction merchantTransaction2 = model.getMerchantTransaction();
            if (merchantTransaction2 != null && (merchant = merchantTransaction2.getMerchant()) != null && (name = merchant.getName()) != null) {
                this.f102590c.setText(name);
                unit2 = Unit.INSTANCE;
            }
            if (unit2 == null) {
                this.f102590c.setText(C45871nl4.merchant_transaction_history_title);
                return;
            }
            return;
        }
        C49520tu6.m11239l(this.f102590c);
    }
}
