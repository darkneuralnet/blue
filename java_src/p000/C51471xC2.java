package p000;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.library.flow.FlowActivity;
import co.bird.android.model.DeliveryWindow;
import co.bird.android.model.RentalNote;
import co.bird.android.model.constant.RentalKind;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.model.Card;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import io.reactivex.Observable;
import java.util.Currency;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
@Metadata(m28433d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0001LB\u0017\u0012\u0006\u0010?\u001a\u00020<\u0012\u0006\u0010C\u001a\u00020@¢\u0006\u0004\bI\u0010JJ\u0006\u0010\u0004\u001a\u00020\u0003J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005J\u000e\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\f\u001a\u00020\u00032\b\b\u0001\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\rJ\u0016\u0010\u0014\u001a\u00020\u00032\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012J\u000e\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015J\"\u0010\u001b\u001a\u00020\u00032\b\b\u0001\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\r2\b\b\u0003\u0010\u001a\u001a\u00020\nJ\u0010\u0010\u001e\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cJ\u000e\u0010\u001f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010 \u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\"\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\rJ&\u0010)\u001a\u00020\u00032\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#2\u0006\u0010(\u001a\u00020'J\u000e\u0010+\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\rJ\u000e\u0010,\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010-\u001a\u00020\u00032\b\b\u0001\u0010*\u001a\u00020\nJ\u0010\u0010.\u001a\u00020\u00032\b\b\u0001\u0010*\u001a\u00020\nJ\u000e\u0010/\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007J\u000e\u00100\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007J\u000e\u00103\u001a\u00020\u00032\u0006\u00102\u001a\u000201J\u000e\u00104\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007J\u000e\u00105\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007J\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005J\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005J\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005J\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005J\u0018\u0010;\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\nH\u0016R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\"\u0010H\u001a\u0010\u0012\f\u0012\n E*\u0004\u0018\u00010\u00030\u00030D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006M"}, m28432d2 = {"LxC2;", "LxE;", "LS74;", "", "om", "Lio/reactivex/Observable;", "Sl", "", "show", "km", "", "status", "Yl", "", PaymentMethod.BillingDetails.PARAM_ADDRESS, "Zl", "notes", "am", "", "Lco/bird/android/model/RentalNote;", "em", "Lco/bird/android/model/DeliveryWindow;", "window", "cm", "label", "date", "color", "gm", "Lco/bird/android/model/constant/RentalKind;", "kind", "bm", "lm", "nm", "included", "dm", "", "rental", "tax", "total", "Ljava/util/Currency;", "currency", "Wl", Entry.TYPE_TEXT, "Vl", "im", "fm", "hm", "mm", "jm", "Lcom/stripe/android/core/model/StripeModel;", "card", "Xl", "qm", "rm", "Rl", "Ql", "Tl", "Ul", "hiddenState", "showProgress", "Lco/bird/android/library/flow/FlowActivity;", "b", "Lco/bird/android/library/flow/FlowActivity;", "flowActivity", "LOC2;", "c", "LOC2;", "binding", "Lma4;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lma4;", "infoButtonClicks", "<init>", "(Lco/bird/android/library/flow/FlowActivity;LOC2;)V", "e", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: xC2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C51471xC2 extends AbstractC30071xE {

    /* renamed from: e */
    public static final C30061a f117184e = new C30061a(null);

    /* renamed from: f */
    public static final int f117185f = 8;

    /* renamed from: g */
    public static final DateTimeFormatter f117186g = DateTimeFormat.forStyle("-S");

    /* renamed from: h */
    public static final DateTimeFormatter f117187h = DateTimeFormat.forStyle("L-");

    /* renamed from: b */
    public final FlowActivity f117188b;

    /* renamed from: c */
    public final OC2 f117189c;

    /* renamed from: d */
    public final C45168ma4<Unit> f117190d;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\t"}, m28432d2 = {"LxC2$a;", "", "Lorg/joda/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "DATE_FORMATTER", "Lorg/joda/time/format/DateTimeFormatter;", "TIME_FORMATTER", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: xC2$a */
    /* loaded from: classes2.dex */
    public static final class C30061a {
        public /* synthetic */ C30061a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C30061a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xC2$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C30062b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RentalKind.values().length];
            try {
                iArr[RentalKind.DROP_OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RentalKind.PICK_UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51471xC2(FlowActivity flowActivity, OC2 binding) {
        super(flowActivity);
        Intrinsics.checkNotNullParameter(flowActivity, "flowActivity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f117188b = flowActivity;
        this.f117189c = binding;
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        this.f117190d = m25409g;
    }

    /* renamed from: pm */
    public static final void m5683pm(C51471xC2 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f117190d.accept(Unit.INSTANCE);
    }

    public static /* synthetic */ void setReturnDate$default(C51471xC2 c51471xC2, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = C32364Df4.colorPrimaryDarkAlt;
        }
        c51471xC2.m5692gm(i, str, i2);
    }

    /* renamed from: Ql */
    public final Observable<Unit> m5708Ql() {
        Button button = this.f117189c.f26174g;
        Intrinsics.checkNotNullExpressionValue(button, "binding.continueWithCreditButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: Rl */
    public final Observable<Unit> m5707Rl() {
        LinearLayout root = this.f117189c.f26178k.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.googlePayButton.root");
        return C44626lf5.clicksThrottle$default(root, 0L, 1, null);
    }

    /* renamed from: Sl */
    public final Observable<Unit> m5706Sl() {
        Observable<Unit> throttleFirst = this.f117190d.throttleFirst(500L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(throttleFirst, "infoButtonClicks.throttl…0, TimeUnit.MILLISECONDS)");
        return throttleFirst;
    }

    /* renamed from: Tl */
    public final Observable<Unit> m5705Tl() {
        Button button = this.f117189c.f26179l;
        Intrinsics.checkNotNullExpressionValue(button, "binding.hollowPrimary");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: Ul */
    public final Observable<Unit> m5704Ul() {
        Button button = this.f117189c.f26180m;
        Intrinsics.checkNotNullExpressionValue(button, "binding.hollowSecondary");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: Vl */
    public final void m5703Vl(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f117189c.f26172e.setText(text);
    }

    /* renamed from: Wl */
    public final void m5702Wl(long j, long j2, long j3, Currency currency) {
        boolean z;
        Intrinsics.checkNotNullParameter(currency, "currency");
        TextView textView = this.f117189c.f26186s;
        C51916xx1 c51916xx1 = C51916xx1.f118396a;
        EnumC36501Ux1 enumC36501Ux1 = EnumC36501Ux1.SHOW_ALWAYS;
        textView.setText(c51916xx1.m4408d(j, currency, enumC36501Ux1));
        this.f117189c.f26166B.setText(c51916xx1.m4408d(j3, currency, enumC36501Ux1));
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i != 0) {
            this.f117189c.f26193z.setText(c51916xx1.m4408d(j2, currency, enumC36501Ux1));
        }
        FrameLayout frameLayout = this.f117189c.f26165A;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.taxCostSection");
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        C49520tu6.show$default(frameLayout, z, 0, 2, null);
    }

    /* renamed from: Xl */
    public final void m5701Xl(StripeModel card) {
        Card card2;
        PaymentMethod.Card card3;
        CardBrand cardBrand;
        Card card4;
        PaymentMethod.Card card5;
        String str;
        String last4;
        Intrinsics.checkNotNullParameter(card, "card");
        boolean z = card instanceof Card;
        String str2 = null;
        if (z) {
            card2 = (Card) card;
        } else {
            card2 = null;
        }
        if (card2 == null || (cardBrand = card2.getBrand()) == null) {
            if (card instanceof PaymentMethod.Card) {
                card3 = (PaymentMethod.Card) card;
            } else {
                card3 = null;
            }
            if (card3 != null) {
                cardBrand = card3.brand;
            } else {
                cardBrand = null;
            }
        }
        if (z) {
            card4 = (Card) card;
        } else {
            card4 = null;
        }
        if (card4 != null && (last4 = card4.getLast4()) != null) {
            str2 = last4;
        } else {
            if (card instanceof PaymentMethod.Card) {
                card5 = (PaymentMethod.Card) card;
            } else {
                card5 = null;
            }
            if (card5 != null) {
                str2 = card5.last4;
            }
        }
        if (cardBrand == null && str2 == null) {
            str = this.f117188b.getString(C45871nl4.payment_default);
            Intrinsics.checkNotNullExpressionValue(str, "{\n      flowActivity.get…ng.payment_default)\n    }");
        } else {
            if (cardBrand == null) {
                cardBrand = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            str = cardBrand + " " + str2;
        }
        Button button = this.f117189c.f26174g;
        Intrinsics.checkNotNullExpressionValue(button, "binding.continueWithCreditButton");
        C49520tu6.m11233r(button);
        this.f117189c.f26174g.setText(this.f117188b.getString(C45871nl4.long_term_rental_payment_method_continue, str));
    }

    /* renamed from: Yl */
    public final void m5700Yl(int i) {
        this.f117189c.f26191x.setText(this.f117188b.getString(i));
    }

    /* renamed from: Zl */
    public final void m5699Zl(String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f117189c.f26169b.setText(address);
    }

    /* renamed from: am */
    public final void m5698am(String notes) {
        Intrinsics.checkNotNullParameter(notes, "notes");
        this.f117189c.f26183p.setText(notes);
    }

    /* renamed from: bm */
    public final void m5697bm(RentalKind rentalKind) {
        int i;
        if (rentalKind == null) {
            i = -1;
        } else {
            i = C30062b.$EnumSwitchMapping$0[rentalKind.ordinal()];
        }
        if (i != 1) {
            if (i == 2) {
                this.f117189c.f26184q.setText((CharSequence) null);
                this.f117189c.f26170c.setText(C45871nl4.rental_pickup_summary_location);
                this.f117189c.f26176i.setText(C45871nl4.rental_pickup_summary_date);
                return;
            }
            return;
        }
        this.f117189c.f26184q.setText(C45871nl4.long_term_rental_delivery_notes_label);
        this.f117189c.f26170c.setText(C45871nl4.long_term_rental_delivery_location_label);
        this.f117189c.f26176i.setText(C45871nl4.long_term_rental_delivery_date_label);
    }

    /* renamed from: cm */
    public final void m5696cm(DeliveryWindow window) {
        Intrinsics.checkNotNullParameter(window, "window");
        if (window.getAddress() != null) {
            this.f117189c.f26169b.setText(window.getAddress());
        }
        FlowActivity flowActivity = this.f117188b;
        int i = C45871nl4.date_time_range;
        DateTimeFormatter dateTimeFormatter = f117186g;
        String string = flowActivity.getString(i, dateTimeFormatter.print(window.getStart()), dateTimeFormatter.print(window.getEnd()));
        Intrinsics.checkNotNullExpressionValue(string, "flowActivity.getString(\n…MATTER.print(window.end))");
        this.f117189c.f26175h.setText(this.f117188b.getString(C45871nl4.date_time, f117187h.print(window.getStart()), string));
    }

    /* renamed from: dm */
    public final void m5695dm(String included) {
        Intrinsics.checkNotNullParameter(included, "included");
        this.f117189c.f26181n.setText(included);
    }

    /* renamed from: em */
    public final void m5694em(List<RentalNote> list) {
        RentalNote rentalNote;
        Object firstOrNull;
        if (list != null) {
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) list);
            rentalNote = (RentalNote) firstOrNull;
        } else {
            rentalNote = null;
        }
        if (rentalNote != null) {
            this.f117189c.f26184q.setText(rentalNote.getTitle());
            this.f117189c.f26183p.setText(rentalNote.getContent());
        }
    }

    /* renamed from: fm */
    public final void m5693fm(int i) {
        this.f117189c.f26179l.setText(this.f117188b.getString(i));
    }

    /* renamed from: gm */
    public final void m5692gm(int i, String date, int i2) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.f117189c.f26189v.setText(this.f117188b.getString(i));
        this.f117189c.f26188u.setText(date);
        this.f117189c.f26188u.setTextColor(NA0.m94301c(this.f117188b, i2));
    }

    /* renamed from: hm */
    public final void m5691hm(int i) {
        this.f117189c.f26180m.setText(this.f117188b.getString(i));
    }

    /* renamed from: im */
    public final void m5690im(boolean z) {
        TextView textView = this.f117189c.f26172e;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.buttonsLabel");
        C49520tu6.show$default(textView, z, 0, 2, null);
    }

    /* renamed from: jm */
    public final void m5689jm(boolean z) {
        Button button = this.f117189c.f26174g;
        Intrinsics.checkNotNullExpressionValue(button, "binding.continueWithCreditButton");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    /* renamed from: km */
    public final void m5688km(boolean z) {
        LinearLayout linearLayout = this.f117189c.f26192y;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.statusSection");
        C49520tu6.show$default(linearLayout, z, 0, 2, null);
    }

    /* renamed from: lm */
    public final void m5687lm(boolean z) {
        LinearLayout linearLayout = this.f117189c.f26177j;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.deliverySection");
        C49520tu6.show$default(linearLayout, z, 0, 2, null);
    }

    /* renamed from: mm */
    public final void m5686mm(boolean z) {
        LinearLayout root = this.f117189c.f26178k.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.googlePayButton.root");
        C49520tu6.show$default(root, z, 0, 2, null);
    }

    /* renamed from: nm */
    public final void m5685nm(boolean z) {
        LinearLayout linearLayout = this.f117189c.f26182o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.includedSection");
        C49520tu6.show$default(linearLayout, z, 0, 2, null);
    }

    /* renamed from: om */
    public final void m5684om() {
        AppCompatImageView appCompatImageView = new AppCompatImageView(this.f117188b);
        appCompatImageView.setImageDrawable(NA0.m94299e(this.f117188b, C48193rg4.ic_info));
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: wC2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C51471xC2.m5683pm(C51471xC2.this, view);
            }
        });
        this.f117188b.setCustomNavView(appCompatImageView);
    }

    /* renamed from: qm */
    public final void m5682qm(boolean z) {
        Button button = this.f117189c.f26179l;
        Intrinsics.checkNotNullExpressionValue(button, "binding.hollowPrimary");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    /* renamed from: rm */
    public final void m5681rm(boolean z) {
        Button button = this.f117189c.f26180m;
        Intrinsics.checkNotNullExpressionValue(button, "binding.hollowSecondary");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    @Override // p000.AbstractC9344XC, p000.S74
    public void showProgress(boolean z, int i) {
        super.showProgress(z, i);
        this.f117189c.f26178k.getRoot().setEnabled(!z);
        this.f117189c.f26179l.setEnabled(!z);
        this.f117189c.f26180m.setEnabled(!z);
        this.f117189c.f26174g.setEnabled(!z);
    }
}
