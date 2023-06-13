package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.card.CardConfiguration;
import com.adyen.checkout.card.api.model.Brand;
import com.adyen.checkout.components.model.paymentmethods.PaymentMethod;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.AbstractC51188wj6;
@Metadata(m28433d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u00104\u001a\u000201\u0012\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J'\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0002H\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u0005H\u0016J\b\u0010\u001e\u001a\u00020\u0005H\u0016J\b\u0010\u001f\u001a\u00020\u0005H\u0016J\b\u0010 \u001a\u00020\u0005H\u0016J\b\u0010!\u001a\u00020\u0005H\u0016J\b\u0010\"\u001a\u00020\u0005H\u0016J(\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100&2\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010%\u001a\u00020$H\u0016J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00100&2\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010*\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020)H\u0002J\u0012\u0010,\u001a\u00020\u00052\b\u0010+\u001a\u0004\u0018\u00010\fH\u0002R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R \u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100&058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00106R&\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100&088\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u00109\u001a\u0004\b:\u0010;¨\u0006C"}, m28432d2 = {"LW73;", "LEf0;", "", C17296a.f69688o, "cardNumber", "", "enableLuhnCheck", "LYk1;", "l", "(Ljava/lang/String;Ljava/lang/Boolean;)LYk1;", "Lvi1;", "expiryDate", "Lcom/adyen/checkout/card/api/model/Brand$c;", "expiryDatePolicy", "m", "securityCode", "LT11;", "cardType", "r", "holderName", "n", "socialSecurityNumber", "s", "kcpBirthDateOrTaxNumber", "o", "kcpCardPassword", "p", "postalCode", "q", "f", "j", "h", "k", "g", "i", "publicKey", "LZC0;", "coroutineScope", "", "b", "v", "LXf0;", "y", "fieldPolicy", "x", "Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;", DateTokenConverter.CONVERTER_KEY, "Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;", "paymentMethod", "LQG;", "e", "LQG;", "binLookupRepository", "LBX2;", "LBX2;", "_binLookupFlow", "LEu1;", "LEu1;", "w", "()LEu1;", "binLookupFlow", "Lcom/adyen/checkout/card/CardConfiguration;", "cardConfiguration", "Lka4;", "publicKeyRepository", "<init>", "(Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;Lcom/adyen/checkout/card/CardConfiguration;LQG;Lka4;)V", "card_release"}, m28431k = 1, m28430mv = {1, 5, 1})
/* renamed from: W73 */
/* loaded from: classes.dex */
public final class W73 extends AbstractC32594Ef0 {

    /* renamed from: d */
    public final PaymentMethod f40445d;

    /* renamed from: e */
    public final C6750QG f40446e;

    /* renamed from: f */
    public final BX2<List<T11>> f40447f;

    /* renamed from: g */
    public final InterfaceC32730Eu1<List<T11>> f40448g;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 5, 1})
    @DebugMetadata(m28419c = "com.adyen.checkout.card.NewCardDelegate$detectCardType$1", m28418f = "NewCardDelegate.kt", m28417i = {}, m28416l = {165}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: W73$a */
    /* loaded from: classes.dex */
    public static final class C8940a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f40449h;

        /* renamed from: j */
        public final /* synthetic */ String f40451j;

        /* renamed from: k */
        public final /* synthetic */ String f40452k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8940a(String str, String str2, Continuation<? super C8940a> continuation) {
            super(2, continuation);
            this.f40451j = str;
            this.f40452k = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C8940a(this.f40451j, this.f40452k, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C8940a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            String str;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f40449h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C6750QG c6750qg = W73.this.f40446e;
                String str2 = this.f40451j;
                String str3 = this.f40452k;
                CardConfiguration m108597d = W73.this.m108597d();
                this.f40449h = 1;
                obj = c6750qg.m88682b(str2, str3, m108597d, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            str = X73.f42683a;
            C32290Cx2.m111214a(str, "Emitting new detectedCardTypes");
            W73.this.f40447f.mo10357b((List) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W73(PaymentMethod paymentMethod, CardConfiguration cardConfiguration, C6750QG binLookupRepository, C43982ka4 publicKeyRepository) {
        super(cardConfiguration, publicKeyRepository);
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(cardConfiguration, "cardConfiguration");
        Intrinsics.checkNotNullParameter(binLookupRepository, "binLookupRepository");
        Intrinsics.checkNotNullParameter(publicKeyRepository, "publicKeyRepository");
        this.f40445d = paymentMethod;
        this.f40446e = binLookupRepository;
        BX2<List<T11>> m79032a = C36748Vy5.m79032a(0, 1, EnumC43674k30.DROP_OLDEST);
        this.f40447f = m79032a;
        this.f40448g = m79032a;
    }

    @Override // p000.InterfaceC48607sN3
    /* renamed from: a */
    public String mo14257a() {
        String type = this.f40445d.getType();
        return type == null ? "unknown" : type;
    }

    @Override // p000.AbstractC32594Ef0
    /* renamed from: b */
    public List<T11> mo33926b(String cardNumber, String str, ZC0 coroutineScope) {
        String str2;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        str2 = X73.f42683a;
        C32290Cx2.m111214a(str2, "detectCardType");
        if (this.f40446e.m88679e(cardNumber)) {
            if (this.f40446e.m88683a(cardNumber)) {
                str4 = X73.f42683a;
                C32290Cx2.m111214a(str4, "Returning cashed result.");
                return this.f40446e.m88681c(cardNumber);
            } else if (str != null) {
                str3 = X73.f42683a;
                C32290Cx2.m111214a(str3, "Launching Bin Lookup");
                Z30.m73800d(coroutineScope, null, null, new C8940a(cardNumber, str, null), 3, null);
            }
        }
        return m78804v(cardNumber);
    }

    @Override // p000.AbstractC32594Ef0
    /* renamed from: f */
    public boolean mo33925f() {
        return m108597d().m53710k();
    }

    @Override // p000.AbstractC32594Ef0
    /* renamed from: g */
    public boolean mo33924g() {
        return m108597d().m53708m();
    }

    @Override // p000.AbstractC32594Ef0
    /* renamed from: h */
    public boolean mo33923h() {
        return m108597d().m53714g() == EnumC33568Ij2.SHOW;
    }

    @Override // p000.AbstractC32594Ef0
    /* renamed from: i */
    public boolean mo33922i() {
        return m108597d().m53715e() == EnumC24723j8.POSTAL_CODE;
    }

    @Override // p000.AbstractC32594Ef0
    /* renamed from: j */
    public boolean mo33921j() {
        return m108597d().m53712i() == EnumC43866kN5.SHOW;
    }

    @Override // p000.AbstractC32594Ef0
    /* renamed from: k */
    public boolean mo33920k() {
        return true;
    }

    @Override // p000.AbstractC32594Ef0
    /* renamed from: l */
    public C37320Yk1<String> mo33919l(String cardNumber, Boolean bool) {
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        return C37274Yf0.f46219a.m74602e(cardNumber, bool);
    }

    @Override // p000.AbstractC32594Ef0
    /* renamed from: m */
    public C37320Yk1<C50580vi1> mo33918m(C50580vi1 expiryDate, Brand.EnumC16802c enumC16802c) {
        Intrinsics.checkNotNullParameter(expiryDate, "expiryDate");
        boolean areEqual = Intrinsics.areEqual(expiryDate, C50580vi1.f114526d);
        if (!m78802x(enumC16802c) && areEqual) {
            return new C37320Yk1<>(expiryDate, AbstractC51188wj6.C29949b.f116411a);
        }
        return C37274Yf0.f46219a.m74601f(expiryDate);
    }

    @Override // p000.AbstractC32594Ef0
    /* renamed from: n */
    public C37320Yk1<String> mo33917n(String holderName) {
        boolean isBlank;
        Intrinsics.checkNotNullParameter(holderName, "holderName");
        if (m108597d().m53708m()) {
            isBlank = StringsKt__StringsJVMKt.isBlank(holderName);
            if (isBlank) {
                return new C37320Yk1<>(holderName, new AbstractC51188wj6.C29948a(C37557Zk4.checkout_holder_name_not_valid));
            }
        }
        return new C37320Yk1<>(holderName, AbstractC51188wj6.C29949b.f116411a);
    }

    @Override // p000.AbstractC32594Ef0
    /* renamed from: o */
    public C37320Yk1<String> mo33916o(String kcpBirthDateOrTaxNumber) {
        Intrinsics.checkNotNullParameter(kcpBirthDateOrTaxNumber, "kcpBirthDateOrTaxNumber");
        if (mo33923h()) {
            return C35674Rj2.f32477a.m86418a(kcpBirthDateOrTaxNumber);
        }
        return new C37320Yk1<>(kcpBirthDateOrTaxNumber, AbstractC51188wj6.C29949b.f116411a);
    }

    @Override // p000.AbstractC32594Ef0
    /* renamed from: p */
    public C37320Yk1<String> mo33915p(String kcpCardPassword) {
        Intrinsics.checkNotNullParameter(kcpCardPassword, "kcpCardPassword");
        if (mo33923h()) {
            return C35674Rj2.f32477a.m86417b(kcpCardPassword);
        }
        return new C37320Yk1<>(kcpCardPassword, AbstractC51188wj6.C29949b.f116411a);
    }

    @Override // p000.AbstractC32594Ef0
    /* renamed from: q */
    public C37320Yk1<String> mo33914q(String postalCode) {
        AbstractC51188wj6 abstractC51188wj6;
        boolean z;
        Intrinsics.checkNotNullParameter(postalCode, "postalCode");
        if (mo33922i()) {
            if (postalCode.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                abstractC51188wj6 = AbstractC51188wj6.C29949b.f116411a;
            } else {
                abstractC51188wj6 = new AbstractC51188wj6.C29948a(C37557Zk4.checkout_card_postal_not_valid);
            }
        } else {
            abstractC51188wj6 = AbstractC51188wj6.C29949b.f116411a;
        }
        return new C37320Yk1<>(postalCode, abstractC51188wj6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r0 != false) goto L16;
     */
    @Override // p000.AbstractC32594Ef0
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C37320Yk1<String> mo33913r(String securityCode, T11 t11) {
        Brand.EnumC16802c m84422c;
        boolean z;
        Intrinsics.checkNotNullParameter(securityCode, "securityCode");
        if (!m108597d().m53710k()) {
            if (t11 == null) {
                m84422c = null;
            } else {
                m84422c = t11.m84422c();
            }
            if (!m78802x(m84422c)) {
                if (securityCode.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            return C37274Yf0.f46219a.m74600g(securityCode, t11);
        }
        return new C37320Yk1<>(securityCode, AbstractC51188wj6.C29949b.f116411a);
    }

    @Override // p000.AbstractC32594Ef0
    /* renamed from: s */
    public C37320Yk1<String> mo33912s(String socialSecurityNumber) {
        Intrinsics.checkNotNullParameter(socialSecurityNumber, "socialSecurityNumber");
        if (mo33921j()) {
            return C43273jN5.f92614a.m30745c(socialSecurityNumber);
        }
        return new C37320Yk1<>(socialSecurityNumber, AbstractC51188wj6.C29949b.f116411a);
    }

    /* renamed from: v */
    public final List<T11> m78804v(String str) {
        String str2;
        boolean z;
        int collectionSizeOrDefault;
        List<T11> emptyList;
        str2 = X73.f42683a;
        C32290Cx2.m111214a(str2, "detectCardLocally");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        List<EnumC37040Xf0> m53711j = m108597d().m53711j();
        Intrinsics.checkNotNullExpressionValue(m53711j, "cardConfiguration.supportedCardTypes");
        List<EnumC37040Xf0> m76731a = EnumC37040Xf0.m76731a(str);
        Intrinsics.checkNotNullExpressionValue(m76731a, "estimate(cardNumber)");
        ArrayList<EnumC37040Xf0> arrayList = new ArrayList();
        for (Object obj : m53711j) {
            if (m76731a.contains((EnumC37040Xf0) obj)) {
                arrayList.add(obj);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (EnumC37040Xf0 it : arrayList) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            arrayList2.add(m78801y(it));
        }
        return arrayList2;
    }

    /* renamed from: w */
    public final InterfaceC32730Eu1<List<T11>> m78803w() {
        return this.f40448g;
    }

    /* renamed from: x */
    public final boolean m78802x(Brand.EnumC16802c enumC16802c) {
        return enumC16802c == Brand.EnumC16802c.REQUIRED;
    }

    /* renamed from: y */
    public final T11 m78801y(EnumC37040Xf0 enumC37040Xf0) {
        Brand.EnumC16802c enumC16802c;
        if (m108596e().contains(enumC37040Xf0)) {
            enumC16802c = Brand.EnumC16802c.HIDDEN;
        } else {
            enumC16802c = Brand.EnumC16802c.REQUIRED;
        }
        return new T11(enumC37040Xf0, false, true, enumC16802c, Brand.EnumC16802c.REQUIRED);
    }
}
