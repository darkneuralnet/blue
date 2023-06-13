package p000;

import com.adyen.checkout.components.base.Configuration;
import com.adyen.checkout.components.model.paymentmethods.PaymentMethod;
import com.adyen.checkout.core.exception.CheckoutException;
import p000.NL3;
/* renamed from: OL3 */
/* loaded from: classes.dex */
public interface OL3<ComponentT extends NL3, ConfigurationT extends Configuration> {
    /* renamed from: a */
    ComponentT mo92402a(InterfaceC37154Xr6 interfaceC37154Xr6, PaymentMethod paymentMethod, ConfigurationT configurationt) throws CheckoutException;
}
