package p000;

import com.adyen.checkout.card.CardConfiguration;
import com.adyen.checkout.card.api.model.Brand;
import com.adyen.checkout.components.model.payments.request.Address;
import com.adyen.checkout.components.model.payments.request.CardPaymentMethod;
import com.adyen.checkout.components.model.payments.request.PaymentComponentData;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.exception.ComponentException;
import com.adyen.checkout.cse.EncryptedCard;
import com.adyen.checkout.cse.exception.EncryptionException;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import p000.C34220Ld6;
@Metadata(m28433d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 F2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001GB\u0019\b\u0002\u0012\u0006\u00107\u001a\u000204\u0012\u0006\u0010>\u001a\u00020\u0002¢\u0006\u0004\b?\u0010@B\u0019\b\u0016\u0012\u0006\u0010B\u001a\u00020A\u0012\u0006\u0010>\u001a\u00020\u0002¢\u0006\u0004\b?\u0010CB\u0019\b\u0016\u0012\u0006\u00107\u001a\u00020D\u0012\u0006\u0010>\u001a\u00020\u0002¢\u0006\u0004\b?\u0010EJ\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0003H\u0014J\b\u0010\u000e\u001a\u00020\u0005H\u0014J\u0006\u0010\u000f\u001a\u00020\u0006J\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\u0011\u001a\u00020\u0006J\u0006\u0010\u0012\u001a\u00020\u0006J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0004J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\tH\u0007J^\u0010&\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\t2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002J\u0012\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'H\u0002J\u0012\u0010,\u001a\u00020)2\b\u0010+\u001a\u0004\u0018\u00010'H\u0002J2\u00103\u001a\u00020\u00052\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\t2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00102\u001a\u00020\tH\u0002R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010:\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010=\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006H"}, m28432d2 = {"Lyf0;", "LuC;", "Lcom/adyen/checkout/card/CardConfiguration;", "LHf0;", "LWf0;", "LCf0;", "", "J", "", "", C17296a.f69688o, "()[Ljava/lang/String;", "inputData", "I", "y", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "A", "B", "K", "outputData", "Lcom/adyen/checkout/components/model/payments/request/Address;", "D", "input", "", "z", "cardNumber", "Lvi1;", "expiryDate", "securityCode", "holderName", "socialSecurityNumber", "kcpBirthDateOrTaxNumber", "kcpCardPassword", "isStorePaymentSelected", "postalCode", "", "LT11;", "detectedCardTypes", "G", "Lcom/adyen/checkout/card/api/model/Brand$c;", "cvcPolicy", "Le32;", "E", "expiryDatePolicy", "F", "Lcom/adyen/checkout/cse/EncryptedCard;", "encryptedCard", "stateOutputData", "LXf0;", "firstCardType", "binValue", "H", "LEf0;", "j", "LEf0;", "cardDelegate", "k", "LHf0;", "storedPaymentInputData", "l", "Ljava/lang/String;", "publicKey", "cardConfiguration", "<init>", "(LEf0;Lcom/adyen/checkout/card/CardConfiguration;)V", "LiR5;", "storedCardDelegate", "(LiR5;Lcom/adyen/checkout/card/CardConfiguration;)V", "LW73;", "(LW73;Lcom/adyen/checkout/card/CardConfiguration;)V", "m", "c", "card_release"}, m28431k = 1, m28430mv = {1, 5, 1})
/* renamed from: yf0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52328yf0 extends AbstractC29116uC<CardConfiguration, C33296Hf0, C36806Wf0, C32126Cf0> {

    /* renamed from: m */
    public static final C30656c f119932m = new C30656c(null);

    /* renamed from: n */
    public static final InterfaceC43902kR5<C52328yf0, CardConfiguration> f119933n = new C31658Af0();

    /* renamed from: j */
    public final AbstractC32594Ef0 f119934j;

    /* renamed from: k */
    public C33296Hf0 f119935k;

    /* renamed from: l */
    public String f119936l;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 5, 1})
    @DebugMetadata(m28419c = "com.adyen.checkout.card.CardComponent$1", m28418f = "CardComponent.kt", m28417i = {}, m28416l = {54}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: yf0$a */
    /* loaded from: classes.dex */
    public static final class C30654a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public Object f119937h;

        /* renamed from: i */
        public int f119938i;

        public C30654a(Continuation<? super C30654a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30654a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C30654a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            C52328yf0 c52328yf0;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f119938i;
            try {
                if (i != 0) {
                    if (i == 1) {
                        c52328yf0 = (C52328yf0) this.f119937h;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    C52328yf0 c52328yf02 = C52328yf0.this;
                    AbstractC32594Ef0 abstractC32594Ef0 = c52328yf02.f119934j;
                    this.f119937h = c52328yf02;
                    this.f119938i = 1;
                    Object m108598c = abstractC32594Ef0.m108598c(this);
                    if (m108598c == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c52328yf0 = c52328yf02;
                    obj = m108598c;
                }
                c52328yf0.f119936l = (String) obj;
                C52328yf0.this.m10665m();
            } catch (CheckoutException e) {
                C52328yf0.this.m10666l(new ComponentException("Unable to fetch publicKey.", e));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m28432d2 = {"", "LT11;", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 5, 1})
    @DebugMetadata(m28419c = "com.adyen.checkout.card.CardComponent$2", m28418f = "CardComponent.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: yf0$b */
    /* loaded from: classes.dex */
    public static final class C30655b extends SuspendLambda implements Function2<List<? extends T11>, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f119940h;

        /* renamed from: i */
        public /* synthetic */ Object f119941i;

        public C30655b(Continuation<? super C30655b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C30655b c30655b = new C30655b(continuation);
            c30655b.f119941i = obj;
            return c30655b;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends T11> list, Continuation<? super Unit> continuation) {
            return invoke2((List<T11>) list, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f119940h == 0) {
                ResultKt.throwOnFailure(obj);
                List list = (List) this.f119941i;
                str = C52921zf0.f122009a;
                C32290Cx2.m111214a(str, "New binLookupFlow emitted");
                str2 = C52921zf0.f122009a;
                C32290Cx2.m111214a(str2, Intrinsics.stringPlus("Brands: ", list));
                C36806Wf0 m10670h = C52328yf0.this.m10670h();
                C52328yf0 c52328yf0 = C52328yf0.this;
                C36806Wf0 c36806Wf0 = m10670h;
                if (c36806Wf0 != null) {
                    c52328yf0.m10664n(c52328yf0.m3031G(c36806Wf0.m78044a().m74341b(), c36806Wf0.m78041d().m74341b(), c36806Wf0.m78035j().m74341b(), c36806Wf0.m78039f().m74341b(), c36806Wf0.m78034k().m74341b(), c36806Wf0.m78038g().m74341b(), c36806Wf0.m78037h().m74341b(), c36806Wf0.m78030o(), c36806Wf0.m78036i().m74341b(), list));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(List<T11> list, Continuation<? super Unit> continuation) {
            return ((C30655b) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\nR,\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, m28432d2 = {"Lyf0$c;", "", "LkR5;", "Lyf0;", "Lcom/adyen/checkout/card/CardConfiguration;", "PROVIDER", "LkR5;", C17296a.f69688o, "()LkR5;", "getPROVIDER$annotations", "()V", "<init>", "card_release"}, m28431k = 1, m28430mv = {1, 5, 1})
    /* renamed from: yf0$c */
    /* loaded from: classes.dex */
    public static final class C30656c {
        public /* synthetic */ C30656c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC43902kR5<C52328yf0, CardConfiguration> m3014a() {
            return C52328yf0.f119933n;
        }

        private C30656c() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 5, 1}, m28428xi = 48)
    /* renamed from: yf0$d */
    /* loaded from: classes.dex */
    public /* synthetic */ class C30657d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Brand.EnumC16802c.values().length];
            iArr[Brand.EnumC16802c.OPTIONAL.ordinal()] = 1;
            iArr[Brand.EnumC16802c.HIDDEN.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C52328yf0(AbstractC32594Ef0 abstractC32594Ef0, CardConfiguration cardConfiguration) {
        super(abstractC32594Ef0, cardConfiguration);
        this.f119934j = abstractC32594Ef0;
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new C30654a(null), 3, null);
        if (abstractC32594Ef0 instanceof W73) {
            C36708Vu1.m79279I(C36708Vu1.m79276L(((W73) abstractC32594Ef0).m78803w(), new C30655b(null)), C36218Tr6.m82333a(this));
        }
    }

    /* renamed from: A */
    public final C33296Hf0 m3037A() {
        return this.f119935k;
    }

    /* renamed from: B */
    public final boolean m3036B() {
        return this.f119934j.mo33924g();
    }

    /* renamed from: C */
    public final boolean m3035C() {
        return this.f119934j instanceof C42716iR5;
    }

    /* renamed from: D */
    public final Address m3034D(C36806Wf0 outputData) {
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        Address address = new Address();
        address.setPostalCode(outputData.m78036i().m74341b());
        address.setStreet("null");
        address.setStateOrProvince("null");
        address.setHouseNumberOrName("null");
        address.setCity("null");
        address.setCountry("ZZ");
        return address;
    }

    /* renamed from: E */
    public final EnumC40118e32 m3033E(Brand.EnumC16802c enumC16802c) {
        String str;
        str = C52921zf0.f122009a;
        C32290Cx2.m111214a(str, Intrinsics.stringPlus("makeCvcUIState: ", enumC16802c));
        if (this.f119934j.mo33925f()) {
            return EnumC40118e32.HIDDEN;
        }
        if (enumC16802c != Brand.EnumC16802c.OPTIONAL && enumC16802c != Brand.EnumC16802c.HIDDEN) {
            return EnumC40118e32.REQUIRED;
        }
        return EnumC40118e32.OPTIONAL;
    }

    /* renamed from: F */
    public final EnumC40118e32 m3032F(Brand.EnumC16802c enumC16802c) {
        int i;
        if (enumC16802c == null) {
            i = -1;
        } else {
            i = C30657d.$EnumSwitchMapping$0[enumC16802c.ordinal()];
        }
        if (i != 1 && i != 2) {
            return EnumC40118e32.REQUIRED;
        }
        return EnumC40118e32.OPTIONAL;
    }

    /* renamed from: G */
    public final C36806Wf0 m3031G(String str, C50580vi1 c50580vi1, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, List<T11> list) {
        Object firstOrNull;
        Boolean valueOf;
        String str8;
        Brand.EnumC16802c m84420e;
        C50580vi1 c50580vi12;
        Brand.EnumC16802c m84422c;
        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) list);
        T11 t11 = (T11) firstOrNull;
        AbstractC32594Ef0 abstractC32594Ef0 = this.f119934j;
        Brand.EnumC16802c enumC16802c = null;
        if (t11 == null) {
            str8 = str;
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(t11.m84421d());
            str8 = str;
        }
        C37320Yk1<String> mo33919l = abstractC32594Ef0.mo33919l(str8, valueOf);
        AbstractC32594Ef0 abstractC32594Ef02 = this.f119934j;
        if (t11 == null) {
            c50580vi12 = c50580vi1;
            m84420e = null;
        } else {
            m84420e = t11.m84420e();
            c50580vi12 = c50580vi1;
        }
        C37320Yk1<C50580vi1> mo33918m = abstractC32594Ef02.mo33918m(c50580vi12, m84420e);
        C37320Yk1<String> mo33913r = this.f119934j.mo33913r(str2, t11);
        C37320Yk1<String> mo33917n = this.f119934j.mo33917n(str3);
        C37320Yk1<String> mo33912s = this.f119934j.mo33912s(str4);
        C37320Yk1<String> mo33916o = this.f119934j.mo33916o(str5);
        C37320Yk1<String> mo33915p = this.f119934j.mo33915p(str6);
        C37320Yk1<String> mo33914q = this.f119934j.mo33914q(str7);
        if (t11 == null) {
            m84422c = null;
        } else {
            m84422c = t11.m84422c();
        }
        EnumC40118e32 m3033E = m3033E(m84422c);
        if (t11 != null) {
            enumC16802c = t11.m84420e();
        }
        return new C36806Wf0(mo33919l, mo33918m, mo33913r, mo33917n, mo33912s, mo33916o, mo33915p, mo33914q, z, m3033E, m3032F(enumC16802c), list, this.f119934j.mo33921j(), this.f119934j.mo33923h(), this.f119934j.mo33922i());
    }

    /* renamed from: H */
    public final C32126Cf0 m3030H(EncryptedCard encryptedCard, C36806Wf0 c36806Wf0, String str, EnumC37040Xf0 enumC37040Xf0, String str2) {
        String takeLast;
        Unit unit;
        CardPaymentMethod cardPaymentMethod = new CardPaymentMethod();
        cardPaymentMethod.setType(CardPaymentMethod.PAYMENT_METHOD_TYPE);
        if (!m3035C()) {
            cardPaymentMethod.setEncryptedCardNumber(encryptedCard.m53572a());
            cardPaymentMethod.setEncryptedExpiryMonth(encryptedCard.m53571b());
            cardPaymentMethod.setEncryptedExpiryYear(encryptedCard.m53570c());
        } else {
            InterfaceC48607sN3 interfaceC48607sN3 = this.f30228a;
            if (interfaceC48607sN3 != null) {
                cardPaymentMethod.setStoredPaymentMethodId(((C42716iR5) interfaceC48607sN3).m33911t());
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.adyen.checkout.card.StoredCardDelegate");
            }
        }
        if (!this.f119934j.mo33925f()) {
            cardPaymentMethod.setEncryptedSecurityCode(encryptedCard.m53569d());
        }
        if (this.f119934j.mo33924g()) {
            cardPaymentMethod.setHolderName(c36806Wf0.m78039f().m74341b());
        }
        if (this.f119934j.mo33923h()) {
            String str3 = this.f119936l;
            if (str3 == null) {
                unit = null;
            } else {
                cardPaymentMethod.setEncryptedPassword(C47312qB1.m17953b("password", c36806Wf0.m78037h().m74341b(), str3));
                unit = Unit.INSTANCE;
            }
            if (unit != null) {
                cardPaymentMethod.setTaxNumber(c36806Wf0.m78038g().m74341b());
            } else {
                throw new CheckoutException("Encryption failed because public key cannot be found.");
            }
        }
        PaymentComponentData paymentComponentData = new PaymentComponentData();
        paymentComponentData.setPaymentMethod(cardPaymentMethod);
        paymentComponentData.setStorePaymentMethod(c36806Wf0.m78030o());
        paymentComponentData.setShopperReference(((CardConfiguration) mo88649d()).m53713h());
        if (this.f119934j.mo33921j()) {
            paymentComponentData.setSocialSecurityNumber(c36806Wf0.m78034k().m74341b());
        }
        if (this.f119934j.mo33922i()) {
            paymentComponentData.setBillingAddress(m3034D(c36806Wf0));
        }
        takeLast = StringsKt___StringsKt.takeLast(str, 4);
        return new C32126Cf0(paymentComponentData, true, true, enumC37040Xf0, str2, takeLast);
    }

    @Override // p000.AbstractC29116uC
    /* renamed from: I */
    public C36806Wf0 mo3024q(C33296Hf0 inputData) {
        String str;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        str = C52921zf0.f122009a;
        C32290Cx2.m111209f(str, "onInputDataChanged");
        return m3031G(inputData.m103574a(), inputData.m103573b(), inputData.m103568g(), inputData.m103572c(), inputData.m103567h(), inputData.m103571d(), inputData.m103570e(), inputData.m103566i(), inputData.m103569f(), this.f119934j.mo33926b(inputData.m103574a(), this.f119936l, C36218Tr6.m82333a(this)));
    }

    /* renamed from: J */
    public boolean m3028J() {
        return this.f119934j.mo33920k();
    }

    /* renamed from: K */
    public final boolean m3027K() {
        return ((CardConfiguration) mo88649d()).m53707n();
    }

    @Override // p000.NL3
    /* renamed from: a */
    public String[] mo3026a() {
        String[] strArr;
        strArr = C52921zf0.f122010b;
        return strArr;
    }

    @Override // p000.AbstractC29116uC
    /* renamed from: y */
    public C32126Cf0 mo3025g() {
        String str;
        Object firstOrNull;
        EnumC37040Xf0 m84423b;
        String take;
        boolean z;
        str = C52921zf0.f122009a;
        C32290Cx2.m111209f(str, "createComponentState");
        C36806Wf0 m10670h = m10670h();
        if (m10670h != null) {
            String m74341b = m10670h.m78044a().m74341b();
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) m10670h.m78042c());
            T11 t11 = (T11) firstOrNull;
            if (t11 == null) {
                m84423b = null;
            } else {
                m84423b = t11.m84423b();
            }
            EnumC37040Xf0 enumC37040Xf0 = m84423b;
            take = StringsKt___StringsKt.take(m74341b, 6);
            String str2 = this.f119936l;
            boolean z2 = true;
            if (m10670h.m78029p() && str2 != null) {
                C34220Ld6.C5047a c5047a = new C34220Ld6.C5047a();
                try {
                    if (!m3035C()) {
                        c5047a.m96526g(m10670h.m78044a().m74341b());
                    }
                    if (!this.f119934j.mo33925f()) {
                        String m74341b2 = m10670h.m78035j().m74341b();
                        if (m74341b2.length() <= 0) {
                            z2 = false;
                        }
                        if (z2) {
                            c5047a.m96529d(m74341b2);
                        }
                    }
                    C50580vi1 m74341b3 = m10670h.m78041d().m74341b();
                    if (m74341b3.m8245b() != 0 && m74341b3.m8246a() != 0) {
                        c5047a.m96528e(String.valueOf(m74341b3.m8246a()));
                        c5047a.m96527f(String.valueOf(m74341b3.m8245b()));
                    }
                    EncryptedCard m106765b = C32828Ff0.m106765b(c5047a.m96532a(), str2);
                    Intrinsics.checkNotNullExpressionValue(m106765b, "{\n            if (!isStoredPaymentMethod()) {\n                unencryptedCardBuilder.setNumber(stateOutputData.cardNumberState.value)\n            }\n            if (!cardDelegate.isCvcHidden()) {\n                val cvc = stateOutputData.securityCodeState.value\n                if (cvc.isNotEmpty()) unencryptedCardBuilder.setCvc(cvc)\n            }\n            val expiryDateResult = stateOutputData.expiryDateState.value\n            if (expiryDateResult.expiryYear != ExpiryDate.EMPTY_VALUE && expiryDateResult.expiryMonth != ExpiryDate.EMPTY_VALUE) {\n                unencryptedCardBuilder.setExpiryMonth(expiryDateResult.expiryMonth.toString())\n                unencryptedCardBuilder.setExpiryYear(expiryDateResult.expiryYear.toString())\n            }\n\n            CardEncrypter.encryptFields(unencryptedCardBuilder.build(), publicKey)\n        }");
                    return m3030H(m106765b, m10670h, m74341b, enumC37040Xf0, take);
                } catch (EncryptionException e) {
                    m10666l(e);
                    return new C32126Cf0(new PaymentComponentData(), false, true, enumC37040Xf0, take, null);
                }
            }
            PaymentComponentData paymentComponentData = new PaymentComponentData();
            boolean m78029p = m10670h.m78029p();
            if (str2 != null) {
                z = true;
            } else {
                z = false;
            }
            return new C32126Cf0(paymentComponentData, m78029p, z, enumC37040Xf0, take, null);
        }
        throw new CheckoutException("Cannot create state with null outputData");
    }

    /* renamed from: z */
    public final int m3015z(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.length() > 6) {
            return C37557Zk4.checkout_kcp_tax_number_hint;
        }
        return C37557Zk4.checkout_kcp_birth_date_or_tax_number_hint;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52328yf0(C42716iR5 storedCardDelegate, CardConfiguration cardConfiguration) {
        this((AbstractC32594Ef0) storedCardDelegate, cardConfiguration);
        Intrinsics.checkNotNullParameter(storedCardDelegate, "storedCardDelegate");
        Intrinsics.checkNotNullParameter(cardConfiguration, "cardConfiguration");
        this.f119935k = storedCardDelegate.m33910u();
        if (m3028J()) {
            return;
        }
        m10669i(new C33296Hf0(null, null, null, null, null, null, null, null, false, 511, null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52328yf0(W73 cardDelegate, CardConfiguration cardConfiguration) {
        this((AbstractC32594Ef0) cardDelegate, cardConfiguration);
        Intrinsics.checkNotNullParameter(cardDelegate, "cardDelegate");
        Intrinsics.checkNotNullParameter(cardConfiguration, "cardConfiguration");
    }
}
