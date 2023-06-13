package p000;

import com.adyen.checkout.components.base.Configuration;
import com.adyen.checkout.components.model.payments.request.PaymentMethodDetails;
import p000.PL3;
/* renamed from: QL3 */
/* loaded from: classes.dex */
public abstract class QL3<ConfigurationT extends Configuration, ComponentStateT extends PL3<? extends PaymentMethodDetails>> extends AbstractC35048Or6 implements NL3<ComponentStateT, ConfigurationT> {

    /* renamed from: a */
    public final InterfaceC48607sN3 f30228a;

    /* renamed from: b */
    public final ConfigurationT f30229b;

    public QL3(InterfaceC48607sN3 interfaceC48607sN3, ConfigurationT configurationt) {
        this.f30228a = interfaceC48607sN3;
        this.f30229b = configurationt;
    }

    @Override // p000.InterfaceC32945Fs0
    /* renamed from: d */
    public ConfigurationT mo88649d() {
        return this.f30229b;
    }
}
