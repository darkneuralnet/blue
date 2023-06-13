package p000;

import androidx.lifecycle.C11759u;
import com.adyen.checkout.card.CardConfiguration;
import com.adyen.checkout.components.model.paymentmethods.PaymentMethod;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0096\u0002J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0003H\u0002¨\u0006\u000e"}, m28432d2 = {"LAf0;", "LkR5;", "Lyf0;", "Lcom/adyen/checkout/card/CardConfiguration;", "LXr6;", "viewModelStoreOwner", "Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;", "paymentMethod", "configuration", "c", "cardConfiguration", "b", "<init>", "()V", "card_release"}, m28431k = 1, m28430mv = {1, 5, 1})
/* renamed from: Af0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31658Af0 implements InterfaceC43902kR5<C52328yf0, CardConfiguration> {

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"Af0$a", "Landroidx/lifecycle/u$b;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)LOr6;", "components-core_release"}, m28431k = 1, m28430mv = {1, 5, 1})
    /* renamed from: Af0$a */
    /* loaded from: classes.dex */
    public static final class C0169a implements C11759u.InterfaceC11763b {

        /* renamed from: b */
        public final /* synthetic */ PaymentMethod f904b;

        /* renamed from: c */
        public final /* synthetic */ CardConfiguration f905c;

        /* renamed from: d */
        public final /* synthetic */ C6750QG f906d;

        /* renamed from: e */
        public final /* synthetic */ C43982ka4 f907e;

        public C0169a(PaymentMethod paymentMethod, CardConfiguration cardConfiguration, C6750QG c6750qg, C43982ka4 c43982ka4) {
            this.f904b = paymentMethod;
            this.f905c = cardConfiguration;
            this.f906d = c6750qg;
            this.f907e = c43982ka4;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public <T extends AbstractC35048Or6> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return new C52328yf0(new W73(this.f904b, this.f905c, this.f906d, this.f907e), this.f905c);
        }
    }

    /* renamed from: b */
    public final CardConfiguration m115413b(PaymentMethod paymentMethod, CardConfiguration cardConfiguration) {
        List<EnumC37040Xf0> m53711j;
        String str;
        String str2;
        Intrinsics.checkNotNullExpressionValue(cardConfiguration.m53711j(), "cardConfiguration.supportedCardTypes");
        boolean z = true;
        if (!m53711j.isEmpty()) {
            return cardConfiguration;
        }
        List<String> brands = paymentMethod.getBrands();
        List supportedCardTypes = CardConfiguration.f68337p;
        List<String> list = brands;
        if (list != null && !list.isEmpty()) {
            z = false;
        }
        if (!z) {
            supportedCardTypes = new ArrayList();
            for (String str3 : brands) {
                EnumC37040Xf0 m76730b = EnumC37040Xf0.m76730b(str3);
                if (m76730b != null) {
                    supportedCardTypes.add(m76730b);
                } else {
                    str2 = C31892Bf0.f2636a;
                    C32290Cx2.m111212c(str2, Intrinsics.stringPlus("Failed to get card type for brand: ", str3));
                }
            }
        } else {
            str = C31892Bf0.f2636a;
            C32290Cx2.m111214a(str, "Falling back to DEFAULT_SUPPORTED_CARDS_LIST");
        }
        CardConfiguration.C16794b m53706o = cardConfiguration.m53706o();
        Intrinsics.checkNotNullExpressionValue(supportedCardTypes, "supportedCardTypes");
        Object[] array = supportedCardTypes.toArray(new EnumC37040Xf0[0]);
        if (array != null) {
            EnumC37040Xf0[] enumC37040Xf0Arr = (EnumC37040Xf0[]) array;
            CardConfiguration m10726a = m53706o.m53691s((EnumC37040Xf0[]) Arrays.copyOf(enumC37040Xf0Arr, enumC37040Xf0Arr.length)).m10726a();
            Intrinsics.checkNotNullExpressionValue(m10726a, "cardConfiguration.newBuilder()\n            .setSupportedCardTypes(*supportedCardTypes.toTypedArray())\n            .build()");
            return m10726a;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Override // p000.OL3
    /* renamed from: c */
    public C52328yf0 mo92402a(InterfaceC37154Xr6 viewModelStoreOwner, PaymentMethod paymentMethod, CardConfiguration configuration) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        AbstractC35048Or6 m66922a = new C11759u(viewModelStoreOwner, new C0169a(paymentMethod, m115413b(paymentMethod, configuration), new C6750QG(), new C43982ka4())).m66922a(C52328yf0.class);
        Intrinsics.checkNotNullExpressionValue(m66922a, "ViewModelProvider(viewModelStoreOwner, factory).get(CardComponent::class.java)");
        return (C52328yf0) m66922a;
    }
}
