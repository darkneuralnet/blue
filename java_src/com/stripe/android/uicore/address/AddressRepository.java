package com.stripe.android.uicore.address;

import android.content.res.Resources;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.uicore.elements.SectionFieldElement;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0087@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ%\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR,\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, m28432d2 = {"Lcom/stripe/android/uicore/address/AddressRepository;", "Lcom/stripe/android/uicore/address/AddressSchemaRepository;", "", "countryCode", "", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "listElements", "", "add", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "LEu1;", "", "countryFieldMap", "LEu1;", "Lzh2;", "initializeCountryFieldMapJob", "Lzh2;", "Landroid/content/res/Resources;", "resources", "<init>", "(Landroid/content/res/Resources;Lkotlin/coroutines/CoroutineContext;)V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class AddressRepository extends AddressSchemaRepository {
    public static final int $stable = 8;
    private final InterfaceC32730Eu1<Map<String, List<SectionFieldElement>>> countryFieldMap;
    private final InterfaceC52943zh2 initializeCountryFieldMapJob;
    private final CoroutineContext workContext;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.uicore.address.AddressRepository$1", m28418f = "AddressRepository.kt", m28417i = {}, m28416l = {45}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    @SourceDebugExtension({"SMAP\nAddressRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressRepository.kt\ncom/stripe/android/uicore/address/AddressRepository$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n1179#2,2:66\n1253#2,4:68\n*S KotlinDebug\n*F\n+ 1 AddressRepository.kt\ncom/stripe/android/uicore/address/AddressRepository$1\n*L\n39#1:66,2\n39#1:68,4\n*E\n"})
    /* renamed from: com.stripe.android.uicore.address.AddressRepository$1 */
    /* loaded from: classes7.dex */
    public static final class C194271 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        final /* synthetic */ BX2<Map<String, List<SectionFieldElement>>> $sharedFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194271(BX2<Map<String, List<SectionFieldElement>>> bx2, Continuation<? super C194271> continuation) {
            super(2, continuation);
            this.$sharedFlow = bx2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C194271(this.$sharedFlow, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C194271) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            int collectionSizeOrDefault;
            int mapCapacity;
            int coerceAtLeast;
            Map<String, List<SectionFieldElement>> mutableMap;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Set<Map.Entry<String, List<CountryAddressSchema>>> entrySet = AddressRepository.this.getCountryAddressSchemaMap().entrySet();
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(entrySet, 10);
                mapCapacity = MapsKt__MapsJVMKt.mapCapacity(collectionSizeOrDefault);
                coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
                LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
                Iterator<T> it = entrySet.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    List<SectionFieldElement> transformToElementList = TransformAddressToElementKt.transformToElementList((List) entry.getValue(), str);
                    if (transformToElementList != null) {
                        Pair m28425to = TuplesKt.m28425to(str, transformToElementList);
                        linkedHashMap.put(m28425to.getFirst(), m28425to.getSecond());
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                mutableMap = MapsKt__MapsKt.toMutableMap(linkedHashMap);
                BX2<Map<String, List<SectionFieldElement>>> bx2 = this.$sharedFlow;
                this.label = 1;
                if (bx2.emit(mutableMap, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressRepository(Resources resources, @IOContext CoroutineContext workContext) {
        super(resources);
        InterfaceC52943zh2 m73800d;
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.workContext = workContext;
        BX2 m79031b = C36748Vy5.m79031b(1, 0, null, 6, null);
        this.countryFieldMap = m79031b;
        m73800d = Z30.m73800d(C37824aD0.m71790a(workContext), null, null, new C194271(m79031b, null), 3, null);
        this.initializeCountryFieldMapJob = m73800d;
    }

    public final Object add(String str, List<? extends SectionFieldElement> list, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m77504g = X30.m77504g(this.workContext, new AddressRepository$add$2(this, str, list, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m77504g == coroutine_suspended ? m77504g : Unit.INSTANCE;
    }

    public final Object get(String str, Continuation<? super List<? extends SectionFieldElement>> continuation) {
        return X30.m77504g(this.workContext, new AddressRepository$get$2(str, this, null), continuation);
    }
}
