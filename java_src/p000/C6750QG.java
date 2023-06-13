package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.card.CardConfiguration;
import com.adyen.checkout.card.api.model.BinLookupRequest;
import com.adyen.checkout.card.api.model.BinLookupResponse;
import com.adyen.checkout.card.api.model.Brand;
import com.adyen.checkout.cse.exception.EncryptionException;
import com.facebook.share.internal.C17296a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0002J1\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J-\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000eJ\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0002R<\u0010\u0017\u001a*\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0014j\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, m28432d2 = {"LQG;", "", "", "cardNumber", "", "e", C17296a.f69688o, "", "LT11;", "c", "publicKey", "Lcom/adyen/checkout/card/CardConfiguration;", "cardConfiguration", "b", "(Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/card/CardConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "Lcom/adyen/checkout/card/api/model/BinLookupResponse;", "f", "binLookupResponse", "g", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "cachedBinLookup", "<init>", "()V", "card_release"}, m28431k = 1, m28430mv = {1, 5, 1})
/* renamed from: QG */
/* loaded from: classes.dex */
public final class C6750QG {

    /* renamed from: b */
    public static final C6751a f30122b = new C6751a(null);

    /* renamed from: a */
    public final HashMap<String, List<T11>> f30123a = new HashMap<>();

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LQG$a;", "", "", "REQUIRED_BIN_SIZE", "I", "<init>", "()V", "card_release"}, m28431k = 1, m28430mv = {1, 5, 1})
    /* renamed from: QG$a */
    /* loaded from: classes.dex */
    public static final class C6751a {
        public /* synthetic */ C6751a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C6751a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 5, 1}, m28428xi = 48)
    @DebugMetadata(m28419c = "com.adyen.checkout.card.repository.BinLookupRepository", m28418f = "BinLookupRepository.kt", m28417i = {0, 0}, m28416l = {65}, m28415m = "fetch", m28414n = {"this", "cardNumber"}, m28413s = {"L$0", "L$1"})
    /* renamed from: QG$b */
    /* loaded from: classes.dex */
    public static final class C6752b extends ContinuationImpl {

        /* renamed from: h */
        public Object f30124h;

        /* renamed from: i */
        public Object f30125i;

        /* renamed from: j */
        public /* synthetic */ Object f30126j;

        /* renamed from: l */
        public int f30128l;

        public C6752b(Continuation<? super C6752b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f30126j = obj;
            this.f30128l |= Integer.MIN_VALUE;
            return C6750QG.this.m88682b(null, null, null, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Lcom/adyen/checkout/card/api/model/BinLookupResponse;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 5, 1})
    @DebugMetadata(m28419c = "com.adyen.checkout.card.repository.BinLookupRepository$makeBinLookup$2", m28418f = "BinLookupRepository.kt", m28417i = {}, m28416l = {80, 120}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: QG$c */
    /* loaded from: classes.dex */
    public static final class C6753c extends SuspendLambda implements Function2<ZC0, Continuation<? super BinLookupResponse>, Object> {

        /* renamed from: h */
        public int f30129h;

        /* renamed from: i */
        public /* synthetic */ Object f30130i;

        /* renamed from: j */
        public final /* synthetic */ CardConfiguration f30131j;

        /* renamed from: k */
        public final /* synthetic */ String f30132k;

        /* renamed from: l */
        public final /* synthetic */ String f30133l;

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 5, 1})
        @DebugMetadata(m28419c = "com.adyen.checkout.card.repository.BinLookupRepository$makeBinLookup$2$deferredEncryption$1", m28418f = "BinLookupRepository.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: QG$c$a */
        /* loaded from: classes.dex */
        public static final class C6754a extends SuspendLambda implements Function2<ZC0, Continuation<? super String>, Object> {

            /* renamed from: h */
            public int f30134h;

            /* renamed from: i */
            public final /* synthetic */ String f30135i;

            /* renamed from: j */
            public final /* synthetic */ String f30136j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6754a(String str, String str2, Continuation<? super C6754a> continuation) {
                super(2, continuation);
                this.f30135i = str;
                this.f30136j = str2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C6754a(this.f30135i, this.f30136j, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super String> continuation) {
                return ((C6754a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f30134h == 0) {
                    ResultKt.throwOnFailure(obj);
                    return C32828Ff0.m106766a(this.f30135i, this.f30136j);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u008a@"}, m28432d2 = {"T", "LZC0;", "kotlin.jvm.PlatformType", "<anonymous>"}, m28431k = 3, m28430mv = {1, 5, 1})
        @DebugMetadata(m28419c = "com.adyen.checkout.components.api.ConnectionExtKt$suspendedCall$2", m28418f = "ConnectionExt.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: QG$c$b */
        /* loaded from: classes.dex */
        public static final class C6755b extends SuspendLambda implements Function2<ZC0, Continuation<? super BinLookupResponse>, Object> {

            /* renamed from: h */
            public int f30137h;

            /* renamed from: i */
            public final /* synthetic */ AbstractCallableC41253fy0 f30138i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6755b(AbstractCallableC41253fy0 abstractCallableC41253fy0, Continuation continuation) {
                super(2, continuation);
                this.f30138i = abstractCallableC41253fy0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C6755b(this.f30138i, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super BinLookupResponse> continuation) {
                return ((C6755b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f30137h == 0) {
                    ResultKt.throwOnFailure(obj);
                    return this.f30138i.call();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6753c(CardConfiguration cardConfiguration, String str, String str2, Continuation<? super C6753c> continuation) {
            super(2, continuation);
            this.f30131j = cardConfiguration;
            this.f30132k = str;
            this.f30133l = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C6753c c6753c = new C6753c(this.f30131j, this.f30132k, this.f30133l, continuation);
            c6753c.f30130i = obj;
            return c6753c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super BinLookupResponse> continuation) {
            return ((C6753c) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            String str;
            String str2;
            InterfaceC42190hZ0 m73802b;
            int collectionSizeOrDefault;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f30129h;
            try {
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            return (BinLookupResponse) obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    m73802b = Z30.m73802b((ZC0) this.f30130i, T41.m84378a(), null, new C6754a(this.f30132k, this.f30133l, null), 2, null);
                    this.f30129h = 1;
                    obj = m73802b.mo29821k(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                Intrinsics.checkNotNullExpressionValue(obj, "deferredEncryption.await()");
                String str3 = (String) obj;
                List<EnumC37040Xf0> m53711j = this.f30131j.m53711j();
                Intrinsics.checkNotNullExpressionValue(m53711j, "cardConfiguration.supportedCardTypes");
                List<EnumC37040Xf0> list = m53711j;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                for (EnumC37040Xf0 enumC37040Xf0 : list) {
                    arrayList.add(enumC37040Xf0.m76729c());
                }
                C5932OG c5932og = new C5932OG(new BinLookupRequest(str3, UUID.randomUUID().toString(), arrayList), this.f30131j.m53595b(), this.f30131j.m53596a());
                SC0 m84377b = T41.m84377b();
                C6755b c6755b = new C6755b(c5932og, null);
                this.f30129h = 2;
                obj = X30.m77504g(m84377b, c6755b, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return (BinLookupResponse) obj;
            } catch (EncryptionException e) {
                str2 = C7104RG.f31776a;
                C32290Cx2.m111211d(str2, "checkCardType - Failed to encrypt BIN", e);
                return null;
            } catch (IOException e2) {
                str = C7104RG.f31776a;
                C32290Cx2.m111211d(str, "checkCardType - Failed to call binLookup API.", e2);
                return null;
            }
        }
    }

    /* renamed from: a */
    public final boolean m88683a(String cardNumber) {
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        if (m88679e(cardNumber)) {
            return this.f30123a.containsKey(m88680d(cardNumber));
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m88682b(String str, String str2, CardConfiguration cardConfiguration, Continuation<? super List<T11>> continuation) {
        C6752b c6752b;
        Object coroutine_suspended;
        int i;
        C6750QG c6750qg;
        if (continuation instanceof C6752b) {
            c6752b = (C6752b) continuation;
            int i2 = c6752b.f30128l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c6752b.f30128l = i2 - Integer.MIN_VALUE;
                Object obj = c6752b.f30126j;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c6752b.f30128l;
                if (i == 0) {
                    if (i == 1) {
                        str = (String) c6752b.f30125i;
                        c6750qg = (C6750QG) c6752b.f30124h;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    c6752b.f30124h = this;
                    c6752b.f30125i = str;
                    c6752b.f30128l = 1;
                    obj = m88678f(str, str2, cardConfiguration, c6752b);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c6750qg = this;
                }
                List<T11> m88677g = c6750qg.m88677g((BinLookupResponse) obj);
                c6750qg.f30123a.put(c6750qg.m88680d(str), m88677g);
                return m88677g;
            }
        }
        c6752b = new C6752b(continuation);
        Object obj2 = c6752b.f30126j;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c6752b.f30128l;
        if (i == 0) {
        }
        List<T11> m88677g2 = c6750qg.m88677g((BinLookupResponse) obj2);
        c6750qg.f30123a.put(c6750qg.m88680d(str), m88677g2);
        return m88677g2;
    }

    /* renamed from: c */
    public final List<T11> m88681c(String cardNumber) {
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        if (m88679e(cardNumber)) {
            List<T11> list = this.f30123a.get(m88680d(cardNumber));
            if (list != null) {
                return list;
            }
            throw new IllegalArgumentException("BinLookupRepository does not contain card number");
        }
        throw new IllegalArgumentException("Card number too small card number");
    }

    /* renamed from: d */
    public final String m88680d(String str) {
        String take;
        C34165Kx5 c34165Kx5 = C34165Kx5.f20452a;
        take = StringsKt___StringsKt.take(str, 11);
        return c34165Kx5.m98049b(take);
    }

    /* renamed from: e */
    public final boolean m88679e(String cardNumber) {
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        if (cardNumber.length() >= 11) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final Object m88678f(String str, String str2, CardConfiguration cardConfiguration, Continuation<? super BinLookupResponse> continuation) {
        return C37824aD0.m71786e(new C6753c(cardConfiguration, str, str2, null), continuation);
    }

    /* renamed from: g */
    public final List<T11> m88677g(BinLookupResponse binLookupResponse) {
        String str;
        String str2;
        List<Brand> brands;
        List<Brand> brands2;
        T11 t11;
        str = C7104RG.f31776a;
        C32290Cx2.m111214a(str, "handleBinLookupResponse");
        str2 = C7104RG.f31776a;
        if (binLookupResponse == null) {
            brands = null;
        } else {
            brands = binLookupResponse.getBrands();
        }
        C32290Cx2.m111209f(str2, Intrinsics.stringPlus("Brands: ", brands));
        if (binLookupResponse == null) {
            brands2 = null;
        } else {
            brands2 = binLookupResponse.getBrands();
        }
        if (brands2 == null) {
            brands2 = CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Brand brand : brands2) {
            if (brand.getBrand() == null) {
                t11 = null;
            } else {
                EnumC37040Xf0 m76730b = EnumC37040Xf0.m76730b(brand.getBrand());
                if (m76730b == null) {
                    m76730b = EnumC37040Xf0.UNKNOWN;
                    m76730b.m76727e(brand.getBrand());
                }
                EnumC37040Xf0 enumC37040Xf0 = m76730b;
                Intrinsics.checkNotNullExpressionValue(enumC37040Xf0, "CardType.getByBrandName(brandResponse.brand) ?: CardType.UNKNOWN.apply { txVariant = brandResponse.brand }");
                boolean areEqual = Intrinsics.areEqual(brand.m53619c(), Boolean.TRUE);
                Brand.EnumC16802c.C16803a c16803a = Brand.EnumC16802c.f68376c;
                String m53620b = brand.m53620b();
                if (m53620b == null) {
                    m53620b = Brand.EnumC16802c.REQUIRED.m53612b();
                }
                Brand.EnumC16802c m53611a = c16803a.m53611a(m53620b);
                String m53618d = brand.m53618d();
                if (m53618d == null) {
                    m53618d = Brand.EnumC16802c.REQUIRED.m53612b();
                }
                t11 = new T11(enumC37040Xf0, true, areEqual, m53611a, c16803a.m53611a(m53618d));
            }
            if (t11 != null) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }
}
