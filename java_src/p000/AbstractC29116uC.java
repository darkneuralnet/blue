package p000;

import android.content.Context;
import android.text.TextUtils;
import com.adyen.checkout.components.analytics.AnalyticEvent;
import com.adyen.checkout.components.analytics.AnalyticsDispatcher;
import com.adyen.checkout.components.base.Configuration;
import com.adyen.checkout.components.model.payments.request.PaymentMethodDetails;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.exception.ComponentException;
import p000.InterfaceC38915c32;
import p000.InterfaceC38986cA3;
import p000.PL3;
/* renamed from: uC */
/* loaded from: classes.dex */
public abstract class AbstractC29116uC<ConfigurationT extends Configuration, InputDataT extends InterfaceC38915c32, OutputDataT extends InterfaceC38986cA3, ComponentStateT extends PL3<? extends PaymentMethodDetails>> extends QL3<ConfigurationT, ComponentStateT> implements InterfaceC50113uu6<OutputDataT, ConfigurationT, ComponentStateT> {

    /* renamed from: i */
    public static final String f111938i = C50139ux2.m9434c();

    /* renamed from: c */
    public InputDataT f111939c;

    /* renamed from: d */
    public final C49882uX2<ComponentStateT> f111940d;

    /* renamed from: e */
    public final C49882uX2<C36221Ts0> f111941e;

    /* renamed from: f */
    public final C49882uX2<OutputDataT> f111942f;

    /* renamed from: g */
    public boolean f111943g;

    /* renamed from: h */
    public boolean f111944h;

    public AbstractC29116uC(InterfaceC48607sN3 interfaceC48607sN3, ConfigurationT configurationt) {
        super(interfaceC48607sN3, configurationt);
        this.f111940d = new C49882uX2<>();
        this.f111941e = new C49882uX2<>();
        this.f111942f = new C49882uX2<>();
        this.f111943g = false;
        this.f111944h = true;
        m10671f(interfaceC48607sN3.mo14257a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m10667k() {
        try {
            this.f111940d.postValue(mo3025g());
        } catch (Exception e) {
            String str = f111938i;
            C32290Cx2.m111212c(str, "notifyStateChanged - error:" + e.getMessage());
            m10666l(new ComponentException("Unexpected error", e));
        }
    }

    @Override // p000.InterfaceC50113uu6
    /* renamed from: c */
    public void mo9503c(Context context) {
        AnalyticEvent.EnumC16808c enumC16808c;
        if (this.f111944h) {
            if (this.f111943g) {
                enumC16808c = AnalyticEvent.EnumC16808c.DROPIN;
            } else {
                enumC16808c = AnalyticEvent.EnumC16808c.COMPONENT;
            }
            String mo14257a = this.f30228a.mo14257a();
            if (!TextUtils.isEmpty(mo14257a)) {
                AnalyticsDispatcher.m53597j(context, mo88649d().m53595b(), AnalyticEvent.m53601a(context, enumC16808c, mo14257a, mo88649d().m53594c()));
                return;
            }
            throw new CheckoutException("Payment method has empty or null type");
        }
    }

    /* renamed from: f */
    public final void m10671f(String str) {
        if (m10668j(str)) {
            return;
        }
        throw new IllegalArgumentException("Unsupported payment method type " + str);
    }

    /* renamed from: g */
    public abstract ComponentStateT mo3025g();

    /* renamed from: h */
    public OutputDataT m10670h() {
        return this.f111942f.getValue();
    }

    /* renamed from: i */
    public final void m10669i(InputDataT inputdatat) {
        C32290Cx2.m111209f(f111938i, "inputDataChanged");
        this.f111939c = inputdatat;
        m10664n(mo3024q(inputdatat));
    }

    /* renamed from: j */
    public final boolean m10668j(String str) {
        for (String str2 : mo3026a()) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public void m10666l(CheckoutException checkoutException) {
        String str = f111938i;
        C32290Cx2.m111212c(str, "notifyException - " + checkoutException.getMessage());
        this.f111941e.postValue(new C36221Ts0(checkoutException));
    }

    /* renamed from: m */
    public void m10665m() {
        C32290Cx2.m111214a(f111938i, "notifyStateChanged");
        C51980y36.f118667b.submit(new Runnable() { // from class: tC
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC29116uC.this.m10667k();
            }
        });
    }

    /* renamed from: n */
    public void m10664n(OutputDataT outputdatat) {
        String str = f111938i;
        C32290Cx2.m111214a(str, "notifyStateChanged with OutputData");
        if (!outputdatat.equals(this.f111942f.getValue())) {
            this.f111942f.setValue(outputdatat);
            m10665m();
            return;
        }
        C32290Cx2.m111214a(str, "state has not changed");
    }

    /* renamed from: o */
    public void m10663o(LifecycleOwner lifecycleOwner, InterfaceC41056fe3<ComponentStateT> interfaceC41056fe3) {
        this.f111940d.observe(lifecycleOwner, interfaceC41056fe3);
    }

    /* renamed from: p */
    public void m10662p(LifecycleOwner lifecycleOwner, InterfaceC41056fe3<OutputDataT> interfaceC41056fe3) {
        this.f111942f.observe(lifecycleOwner, interfaceC41056fe3);
    }

    /* renamed from: q */
    public abstract OutputDataT mo3024q(InputDataT inputdatat);
}
