package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.BirdPayment;
import co.bird.android.widget.PaymentButton;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Card;
import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u0016R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, m28432d2 = {"LxN3;", "Lct4;", "Lco/bird/android/model/BirdPayment;", "bird", "", "E", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Landroidx/recyclerview/widget/RecyclerView$D;", "onCreateViewHolder", "holder", "position", "onBindViewHolder", "g", "Lco/bird/android/model/BirdPayment;", "defaultBirdPayment", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: xN3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C51571xN3 extends AbstractC39429ct4<BirdPayment> {

    /* renamed from: g */
    public BirdPayment f117529g;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"LxN3$a;", "Lw1;", "", "position", "", "bind", "Lco/bird/android/widget/PaymentButton;", "b", "Lco/bird/android/widget/PaymentButton;", "getView", "()Lco/bird/android/widget/PaymentButton;", "view", "LxN3;", "c", "LxN3;", C17296a.f69688o, "()LxN3;", "adapter", "<init>", "(Lco/bird/android/widget/PaymentButton;LxN3;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: xN3$a */
    /* loaded from: classes4.dex */
    public static final class C30162a extends C29735w1 {

        /* renamed from: b */
        public final PaymentButton f117530b;

        /* renamed from: c */
        public final C51571xN3 f117531c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: xN3$a$a */
        /* loaded from: classes4.dex */
        public static final class C30163a extends Lambda implements Function1<View, Unit> {
            public C30163a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                int adapterPosition = C30162a.this.getAdapterPosition();
                if (adapterPosition != -1) {
                    C30162a.this.m5328a().m44894r().onNext(C30162a.this.m5328a().m44895q(adapterPosition));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30162a(PaymentButton view, C51571xN3 adapter) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            this.f117530b = view;
            this.f117531c = adapter;
            C34585Ms2.m94661j(view, new C30163a());
        }

        /* renamed from: a */
        public final C51571xN3 m5328a() {
            return this.f117531c;
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x00aa, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual(r0, r1) == false) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00d0, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual(r0, r2) == false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00e6, code lost:
            if (r6.isGooglePay() == true) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x00ea, code lost:
            if (r1 != false) goto L50;
         */
        @Override // p000.C29735w1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void bind(int i) {
            String str;
            boolean z;
            String str2;
            PaymentMethod stripePaymentMethod;
            String str3;
            String str4;
            Card stripeCard;
            BirdPayment m44895q = this.f117531c.m44895q(i);
            if (m44895q.isStripeCard()) {
                PaymentButton paymentButton = this.f117530b;
                Card stripeCard2 = m44895q.getStripeCard();
                Intrinsics.checkNotNull(stripeCard2);
                paymentButton.setStripeCard(stripeCard2);
            } else if (m44895q.isStripePaymentMethod()) {
                PaymentButton paymentButton2 = this.f117530b;
                PaymentMethod stripePaymentMethod2 = m44895q.getStripePaymentMethod();
                Intrinsics.checkNotNull(stripePaymentMethod2);
                paymentButton2.setStripePaymentMethod(stripePaymentMethod2);
            } else if (m44895q.isPaypal()) {
                PaymentButton paymentButton3 = this.f117530b;
                String paypalEmail = m44895q.getPaypalEmail();
                Intrinsics.checkNotNull(paypalEmail);
                paymentButton3.setPaypal(paypalEmail);
            } else if (m44895q.isAdyen()) {
                PaymentButton paymentButton4 = this.f117530b;
                boolean isGooglePay = m44895q.isGooglePay();
                String brand = m44895q.getBrand();
                String str5 = "";
                if (brand == null) {
                    brand = "";
                }
                String lastCardNumbers = m44895q.getLastCardNumbers();
                if (lastCardNumbers != null) {
                    str5 = lastCardNumbers;
                }
                paymentButton4.setAdyenCard(isGooglePay, brand, str5);
            }
            if (!m44895q.getDefaultPaymentMethod()) {
                String id = m44895q.getId();
                BirdPayment birdPayment = this.f117531c.f117529g;
                String str6 = null;
                if (birdPayment != null) {
                    str = birdPayment.getId();
                } else {
                    str = null;
                }
                if (!Intrinsics.areEqual(id, str)) {
                    if (m44895q.isStripeCard()) {
                        Card stripeCard3 = m44895q.getStripeCard();
                        if (stripeCard3 != null) {
                            str3 = stripeCard3.getId();
                        } else {
                            str3 = null;
                        }
                        BirdPayment birdPayment2 = this.f117531c.f117529g;
                        if (birdPayment2 != null && (stripeCard = birdPayment2.getStripeCard()) != null) {
                            str4 = stripeCard.getId();
                        } else {
                            str4 = null;
                        }
                    }
                    if (m44895q.isStripePaymentMethod()) {
                        PaymentMethod stripePaymentMethod3 = m44895q.getStripePaymentMethod();
                        if (stripePaymentMethod3 != null) {
                            str2 = stripePaymentMethod3.f75358id;
                        } else {
                            str2 = null;
                        }
                        BirdPayment birdPayment3 = this.f117531c.f117529g;
                        if (birdPayment3 != null && (stripePaymentMethod = birdPayment3.getStripePaymentMethod()) != null) {
                            str6 = stripePaymentMethod.f75358id;
                        }
                    }
                    if (m44895q.isGooglePay()) {
                        BirdPayment birdPayment4 = this.f117531c.f117529g;
                        if (birdPayment4 != null) {
                            z = true;
                        }
                        z = false;
                    }
                    this.f117530b.setEndIcon(0);
                    return;
                }
            }
            this.f117530b.setEndIcon(C48193rg4.ic_check);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51571xN3(Context context) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: E */
    public final void m5329E(BirdPayment birdPayment) {
        this.f117529g = birdPayment;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onBindViewHolder(RecyclerView.AbstractC11834D holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((C29735w1) holder).bind(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public RecyclerView.AbstractC11834D onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new C30162a(new PaymentButton(m44892u(), null, 0, 6, null), this);
    }
}
