package p000;

import com.braintreepayments.api.exceptions.BraintreeException;
import com.braintreepayments.api.models.CardBuilder;
import com.braintreepayments.api.models.PaymentMethodNonce;
import org.json.JSONException;
/* renamed from: u56  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C49629u56 {

    /* renamed from: u56$a */
    /* loaded from: classes2.dex */
    public static class C29051a implements InterfaceC32288Cx0 {

        /* renamed from: b */
        public final /* synthetic */ AbstractC48015rN3 f111717b;

        /* renamed from: c */
        public final /* synthetic */ G10 f111718c;

        /* renamed from: d */
        public final /* synthetic */ LN3 f111719d;

        public C29051a(AbstractC48015rN3 abstractC48015rN3, G10 g10, LN3 ln3) {
            this.f111717b = abstractC48015rN3;
            this.f111718c = g10;
            this.f111719d = ln3;
        }

        @Override // p000.InterfaceC32288Cx0
        /* renamed from: k */
        public void mo10872k(C40650ex0 c40650ex0) {
            if ((this.f111717b instanceof CardBuilder) && c40650ex0.m42368d().m84198d("tokenize_credit_cards")) {
                C49629u56.m10875d(this.f111718c, (CardBuilder) this.f111717b, this.f111719d);
            } else {
                C49629u56.m10874e(this.f111718c, this.f111717b, this.f111719d);
            }
        }
    }

    /* renamed from: u56$b */
    /* loaded from: classes2.dex */
    public static class C29052b implements HN1 {

        /* renamed from: a */
        public final /* synthetic */ LN3 f111720a;

        /* renamed from: b */
        public final /* synthetic */ CardBuilder f111721b;

        /* renamed from: c */
        public final /* synthetic */ G10 f111722c;

        public C29052b(LN3 ln3, CardBuilder cardBuilder, G10 g10) {
            this.f111720a = ln3;
            this.f111721b = cardBuilder;
            this.f111722c = g10;
        }

        @Override // p000.HN1
        /* renamed from: a */
        public void mo10871a(Exception exc) {
            this.f111722c.m105974Ea("card.graphql.tokenization.failure");
            this.f111720a.mo4604a(exc);
        }

        @Override // p000.HN1
        public void success(String str) {
            try {
                this.f111720a.mo4603b(PaymentMethodNonce.m53326d(str, this.f111721b.mo2560i()));
                this.f111722c.m105974Ea("card.graphql.tokenization.success");
            } catch (JSONException e) {
                this.f111720a.mo4604a(e);
            }
        }
    }

    /* renamed from: u56$c */
    /* loaded from: classes2.dex */
    public static class C29053c implements HN1 {

        /* renamed from: a */
        public final /* synthetic */ LN3 f111723a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC48015rN3 f111724b;

        public C29053c(LN3 ln3, AbstractC48015rN3 abstractC48015rN3) {
            this.f111723a = ln3;
            this.f111724b = abstractC48015rN3;
        }

        @Override // p000.HN1
        /* renamed from: a */
        public void mo10871a(Exception exc) {
            this.f111723a.mo4604a(exc);
        }

        @Override // p000.HN1
        public void success(String str) {
            try {
                this.f111723a.mo4603b(PaymentMethodNonce.m53326d(str, this.f111724b.mo2560i()));
            } catch (JSONException e) {
                this.f111723a.mo4604a(e);
            }
        }
    }

    /* renamed from: c */
    public static void m10876c(G10 g10, AbstractC48015rN3 abstractC48015rN3, LN3 ln3) {
        abstractC48015rN3.m16028j(g10.m105960la());
        g10.m105969Ja(new C29051a(abstractC48015rN3, g10, ln3));
    }

    /* renamed from: d */
    public static void m10875d(G10 g10, CardBuilder cardBuilder, LN3 ln3) {
        g10.m105974Ea("card.graphql.tokenization.started");
        try {
            g10.m105963fa().m101391n(cardBuilder.m16031c(g10.m105966T9(), g10.m105965da()), new C29052b(ln3, cardBuilder, g10));
        } catch (BraintreeException e) {
            ln3.mo4604a(e);
        }
    }

    /* renamed from: e */
    public static void m10874e(G10 g10, AbstractC48015rN3 abstractC48015rN3, LN3 ln3) {
        K10 m105962ha = g10.m105962ha();
        m105962ha.mo3548e(m10873f("payment_methods/" + abstractC48015rN3.mo2561e()), abstractC48015rN3.m16032a(), new C29053c(ln3, abstractC48015rN3));
    }

    /* renamed from: f */
    public static String m10873f(String str) {
        return "/v1/" + str;
    }
}
