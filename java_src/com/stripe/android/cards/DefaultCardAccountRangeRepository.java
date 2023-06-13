package com.stripe.android.cards;

import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.AccountRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, m28432d2 = {"Lcom/stripe/android/cards/DefaultCardAccountRangeRepository;", "Lcom/stripe/android/cards/CardAccountRangeRepository;", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "cardNumber", "Lcom/stripe/android/model/AccountRange;", "getAccountRange", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getAccountRanges", "Lcom/stripe/android/cards/CardAccountRangeSource;", "inMemorySource", "Lcom/stripe/android/cards/CardAccountRangeSource;", "remoteSource", "staticSource", "Lcom/stripe/android/cards/CardAccountRangeStore;", "store", "Lcom/stripe/android/cards/CardAccountRangeStore;", "LEu1;", "", "loading", "LEu1;", "getLoading", "()LEu1;", "<init>", "(Lcom/stripe/android/cards/CardAccountRangeSource;Lcom/stripe/android/cards/CardAccountRangeSource;Lcom/stripe/android/cards/CardAccountRangeSource;Lcom/stripe/android/cards/CardAccountRangeStore;)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDefaultCardAccountRangeRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultCardAccountRangeRepository.kt\ncom/stripe/android/cards/DefaultCardAccountRangeRepository\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,48:1\n287#2:49\n288#2:54\n37#3:50\n36#3,3:51\n106#4:55\n*S KotlinDebug\n*F\n+ 1 DefaultCardAccountRangeRepository.kt\ncom/stripe/android/cards/DefaultCardAccountRangeRepository\n*L\n37#1:49\n37#1:54\n37#1:50\n37#1:51,3\n37#1:55\n*E\n"})
/* loaded from: classes6.dex */
public final class DefaultCardAccountRangeRepository implements CardAccountRangeRepository {
    private final CardAccountRangeSource inMemorySource;
    private final InterfaceC32730Eu1<Boolean> loading;
    private final CardAccountRangeSource remoteSource;
    private final CardAccountRangeSource staticSource;
    private final CardAccountRangeStore store;

    public DefaultCardAccountRangeRepository(CardAccountRangeSource inMemorySource, CardAccountRangeSource remoteSource, CardAccountRangeSource staticSource, CardAccountRangeStore store) {
        List listOf;
        List list;
        Intrinsics.checkNotNullParameter(inMemorySource, "inMemorySource");
        Intrinsics.checkNotNullParameter(remoteSource, "remoteSource");
        Intrinsics.checkNotNullParameter(staticSource, "staticSource");
        Intrinsics.checkNotNullParameter(store, "store");
        this.inMemorySource = inMemorySource;
        this.remoteSource = remoteSource;
        this.staticSource = staticSource;
        this.store = store;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new InterfaceC32730Eu1[]{inMemorySource.getLoading(), remoteSource.getLoading(), staticSource.getLoading()});
        list = CollectionsKt___CollectionsKt.toList(listOf);
        Object[] array = list.toArray(new InterfaceC32730Eu1[0]);
        if (array != null) {
            final InterfaceC32730Eu1[] interfaceC32730Eu1Arr = (InterfaceC32730Eu1[]) array;
            this.loading = new InterfaceC32730Eu1<Boolean>() { // from class: com.stripe.android.cards.DefaultCardAccountRangeRepository$special$$inlined$combine$1

                @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "R", "", "invoke", "()[Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$1\n*L\n1#1,332:1\n*E\n"})
                /* renamed from: com.stripe.android.cards.DefaultCardAccountRangeRepository$special$$inlined$combine$1$2 */
                /* loaded from: classes6.dex */
                public static final class C186142 extends Lambda implements Function0<Boolean[]> {
                    final /* synthetic */ InterfaceC32730Eu1[] $flowArray;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C186142(InterfaceC32730Eu1[] interfaceC32730Eu1Arr) {
                        super(0);
                        this.$flowArray = interfaceC32730Eu1Arr;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean[] invoke() {
                        return new Boolean[this.$flowArray.length];
                    }
                }

                @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m28432d2 = {"T", "R", "LGu1;", "", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                @DebugMetadata(m28419c = "com.stripe.android.cards.DefaultCardAccountRangeRepository$special$$inlined$combine$1$3", m28418f = "DefaultCardAccountRangeRepository.kt", m28417i = {}, m28416l = {292}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2\n+ 2 DefaultCardAccountRangeRepository.kt\ncom/stripe/android/cards/DefaultCardAccountRangeRepository\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,332:1\n45#2:333\n12744#3,2:334\n*S KotlinDebug\n*F\n+ 1 DefaultCardAccountRangeRepository.kt\ncom/stripe/android/cards/DefaultCardAccountRangeRepository\n*L\n45#1:334,2\n*E\n"})
                /* renamed from: com.stripe.android.cards.DefaultCardAccountRangeRepository$special$$inlined$combine$1$3 */
                /* loaded from: classes6.dex */
                public static final class C186153 extends SuspendLambda implements Function3<InterfaceC33198Gu1<? super Boolean>, Boolean[], Continuation<? super Unit>, Object> {
                    private /* synthetic */ Object L$0;
                    /* synthetic */ Object L$1;
                    int label;

                    public C186153(Continuation continuation) {
                        super(3, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(InterfaceC33198Gu1<? super Boolean> interfaceC33198Gu1, Boolean[] boolArr, Continuation<? super Unit> continuation) {
                        C186153 c186153 = new C186153(continuation);
                        c186153.L$0 = interfaceC33198Gu1;
                        c186153.L$1 = boolArr;
                        return c186153.invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended;
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
                            InterfaceC33198Gu1 interfaceC33198Gu1 = (InterfaceC33198Gu1) this.L$0;
                            Boolean[] boolArr = (Boolean[]) ((Object[]) this.L$1);
                            int length = boolArr.length;
                            boolean z = false;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    break;
                                } else if (boolArr[i2].booleanValue()) {
                                    z = true;
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                            Boolean boxBoolean = Boxing.boxBoolean(z);
                            this.label = 1;
                            if (interfaceC33198Gu1.emit(boxBoolean, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // p000.InterfaceC32730Eu1
                public Object collect(InterfaceC33198Gu1<? super Boolean> interfaceC33198Gu1, Continuation continuation) {
                    Object coroutine_suspended;
                    InterfaceC32730Eu1[] interfaceC32730Eu1Arr2 = interfaceC32730Eu1Arr;
                    Object m86325a = C35699Rm0.m86325a(interfaceC33198Gu1, interfaceC32730Eu1Arr2, new C186142(interfaceC32730Eu1Arr2), new C186153(null), continuation);
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (m86325a == coroutine_suspended) {
                        return m86325a;
                    }
                    return Unit.INSTANCE;
                }
            };
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    @Override // com.stripe.android.cards.CardAccountRangeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAccountRange(CardNumber.Unvalidated unvalidated, Continuation<? super AccountRange> continuation) {
        DefaultCardAccountRangeRepository$getAccountRange$1 defaultCardAccountRangeRepository$getAccountRange$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        DefaultCardAccountRangeRepository defaultCardAccountRangeRepository;
        AccountRange accountRange;
        if (continuation instanceof DefaultCardAccountRangeRepository$getAccountRange$1) {
            defaultCardAccountRangeRepository$getAccountRange$1 = (DefaultCardAccountRangeRepository$getAccountRange$1) continuation;
            int i2 = defaultCardAccountRangeRepository$getAccountRange$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultCardAccountRangeRepository$getAccountRange$1.label = i2 - Integer.MIN_VALUE;
                obj = defaultCardAccountRangeRepository$getAccountRange$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = defaultCardAccountRangeRepository$getAccountRange$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    ResultKt.throwOnFailure(obj);
                                    accountRange = (AccountRange) obj;
                                    return accountRange;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            unvalidated = (CardNumber.Unvalidated) defaultCardAccountRangeRepository$getAccountRange$1.L$1;
                            defaultCardAccountRangeRepository = (DefaultCardAccountRangeRepository) defaultCardAccountRangeRepository$getAccountRange$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            accountRange = (AccountRange) obj;
                            if (accountRange == null) {
                                CardAccountRangeSource cardAccountRangeSource = defaultCardAccountRangeRepository.staticSource;
                                defaultCardAccountRangeRepository$getAccountRange$1.L$0 = null;
                                defaultCardAccountRangeRepository$getAccountRange$1.L$1 = null;
                                defaultCardAccountRangeRepository$getAccountRange$1.label = 4;
                                obj = cardAccountRangeSource.getAccountRange(unvalidated, defaultCardAccountRangeRepository$getAccountRange$1);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                accountRange = (AccountRange) obj;
                            }
                            return accountRange;
                        }
                        unvalidated = (CardNumber.Unvalidated) defaultCardAccountRangeRepository$getAccountRange$1.L$1;
                        defaultCardAccountRangeRepository = (DefaultCardAccountRangeRepository) defaultCardAccountRangeRepository$getAccountRange$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        accountRange = (AccountRange) obj;
                        if (accountRange == null) {
                        }
                        return accountRange;
                    }
                    unvalidated = (CardNumber.Unvalidated) defaultCardAccountRangeRepository$getAccountRange$1.L$1;
                    defaultCardAccountRangeRepository = (DefaultCardAccountRangeRepository) defaultCardAccountRangeRepository$getAccountRange$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    Bin bin = unvalidated.getBin();
                    if (bin == null) {
                        return null;
                    }
                    CardAccountRangeStore cardAccountRangeStore = this.store;
                    defaultCardAccountRangeRepository$getAccountRange$1.L$0 = this;
                    defaultCardAccountRangeRepository$getAccountRange$1.L$1 = unvalidated;
                    defaultCardAccountRangeRepository$getAccountRange$1.label = 1;
                    obj = cardAccountRangeStore.contains(bin, defaultCardAccountRangeRepository$getAccountRange$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    defaultCardAccountRangeRepository = this;
                }
                if (!((Boolean) obj).booleanValue()) {
                    CardAccountRangeSource cardAccountRangeSource2 = defaultCardAccountRangeRepository.inMemorySource;
                    defaultCardAccountRangeRepository$getAccountRange$1.L$0 = defaultCardAccountRangeRepository;
                    defaultCardAccountRangeRepository$getAccountRange$1.L$1 = unvalidated;
                    defaultCardAccountRangeRepository$getAccountRange$1.label = 2;
                    obj = cardAccountRangeSource2.getAccountRange(unvalidated, defaultCardAccountRangeRepository$getAccountRange$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    accountRange = (AccountRange) obj;
                    if (accountRange == null) {
                    }
                    return accountRange;
                }
                CardAccountRangeSource cardAccountRangeSource3 = defaultCardAccountRangeRepository.remoteSource;
                defaultCardAccountRangeRepository$getAccountRange$1.L$0 = defaultCardAccountRangeRepository;
                defaultCardAccountRangeRepository$getAccountRange$1.L$1 = unvalidated;
                defaultCardAccountRangeRepository$getAccountRange$1.label = 3;
                obj = cardAccountRangeSource3.getAccountRange(unvalidated, defaultCardAccountRangeRepository$getAccountRange$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                accountRange = (AccountRange) obj;
                if (accountRange == null) {
                }
                return accountRange;
            }
        }
        defaultCardAccountRangeRepository$getAccountRange$1 = new DefaultCardAccountRangeRepository$getAccountRange$1(this, continuation);
        obj = defaultCardAccountRangeRepository$getAccountRange$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultCardAccountRangeRepository$getAccountRange$1.label;
        if (i == 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    @Override // com.stripe.android.cards.CardAccountRangeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAccountRanges(CardNumber.Unvalidated unvalidated, Continuation<? super List<AccountRange>> continuation) {
        DefaultCardAccountRangeRepository$getAccountRanges$1 defaultCardAccountRangeRepository$getAccountRanges$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        DefaultCardAccountRangeRepository defaultCardAccountRangeRepository;
        List list;
        if (continuation instanceof DefaultCardAccountRangeRepository$getAccountRanges$1) {
            defaultCardAccountRangeRepository$getAccountRanges$1 = (DefaultCardAccountRangeRepository$getAccountRanges$1) continuation;
            int i2 = defaultCardAccountRangeRepository$getAccountRanges$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultCardAccountRangeRepository$getAccountRanges$1.label = i2 - Integer.MIN_VALUE;
                obj = defaultCardAccountRangeRepository$getAccountRanges$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = defaultCardAccountRangeRepository$getAccountRanges$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    ResultKt.throwOnFailure(obj);
                                    list = (List) obj;
                                    return list;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            unvalidated = (CardNumber.Unvalidated) defaultCardAccountRangeRepository$getAccountRanges$1.L$1;
                            defaultCardAccountRangeRepository = (DefaultCardAccountRangeRepository) defaultCardAccountRangeRepository$getAccountRanges$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            list = (List) obj;
                            if (list == null) {
                                CardAccountRangeSource cardAccountRangeSource = defaultCardAccountRangeRepository.staticSource;
                                defaultCardAccountRangeRepository$getAccountRanges$1.L$0 = null;
                                defaultCardAccountRangeRepository$getAccountRanges$1.L$1 = null;
                                defaultCardAccountRangeRepository$getAccountRanges$1.label = 4;
                                obj = cardAccountRangeSource.getAccountRanges(unvalidated, defaultCardAccountRangeRepository$getAccountRanges$1);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                list = (List) obj;
                            }
                            return list;
                        }
                        unvalidated = (CardNumber.Unvalidated) defaultCardAccountRangeRepository$getAccountRanges$1.L$1;
                        defaultCardAccountRangeRepository = (DefaultCardAccountRangeRepository) defaultCardAccountRangeRepository$getAccountRanges$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        list = (List) obj;
                        if (list == null) {
                        }
                        return list;
                    }
                    unvalidated = (CardNumber.Unvalidated) defaultCardAccountRangeRepository$getAccountRanges$1.L$1;
                    defaultCardAccountRangeRepository = (DefaultCardAccountRangeRepository) defaultCardAccountRangeRepository$getAccountRanges$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    Bin bin = unvalidated.getBin();
                    if (bin == null) {
                        return null;
                    }
                    CardAccountRangeStore cardAccountRangeStore = this.store;
                    defaultCardAccountRangeRepository$getAccountRanges$1.L$0 = this;
                    defaultCardAccountRangeRepository$getAccountRanges$1.L$1 = unvalidated;
                    defaultCardAccountRangeRepository$getAccountRanges$1.label = 1;
                    obj = cardAccountRangeStore.contains(bin, defaultCardAccountRangeRepository$getAccountRanges$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    defaultCardAccountRangeRepository = this;
                }
                if (!((Boolean) obj).booleanValue()) {
                    CardAccountRangeSource cardAccountRangeSource2 = defaultCardAccountRangeRepository.inMemorySource;
                    defaultCardAccountRangeRepository$getAccountRanges$1.L$0 = defaultCardAccountRangeRepository;
                    defaultCardAccountRangeRepository$getAccountRanges$1.L$1 = unvalidated;
                    defaultCardAccountRangeRepository$getAccountRanges$1.label = 2;
                    obj = cardAccountRangeSource2.getAccountRanges(unvalidated, defaultCardAccountRangeRepository$getAccountRanges$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list = (List) obj;
                    if (list == null) {
                    }
                    return list;
                }
                CardAccountRangeSource cardAccountRangeSource3 = defaultCardAccountRangeRepository.remoteSource;
                defaultCardAccountRangeRepository$getAccountRanges$1.L$0 = defaultCardAccountRangeRepository;
                defaultCardAccountRangeRepository$getAccountRanges$1.L$1 = unvalidated;
                defaultCardAccountRangeRepository$getAccountRanges$1.label = 3;
                obj = cardAccountRangeSource3.getAccountRanges(unvalidated, defaultCardAccountRangeRepository$getAccountRanges$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list = (List) obj;
                if (list == null) {
                }
                return list;
            }
        }
        defaultCardAccountRangeRepository$getAccountRanges$1 = new DefaultCardAccountRangeRepository$getAccountRanges$1(this, continuation);
        obj = defaultCardAccountRangeRepository$getAccountRanges$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultCardAccountRangeRepository$getAccountRanges$1.label;
        if (i == 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    @Override // com.stripe.android.cards.CardAccountRangeRepository
    public InterfaceC32730Eu1<Boolean> getLoading() {
        return this.loading;
    }
}
