package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.Agreement;
import co.bird.android.model.AgreementKey;
import co.bird.android.model.AgreementRole;
import co.bird.android.model.Listing;
import co.bird.android.model.wire.WireMerchantSite;
import co.bird.android.model.wire.WireMerchantTransaction;
import co.bird.android.model.wire.WireTransaction;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.MaybeSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23486i;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C41318g46;
import p000.InterfaceC44637lg6;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, m28432d2 = {"Ln76;", "LX66;", "", C17296a.f69688o, "onResume", "LaS2;", "LaS2;", "merchantManager", "Lcom/uber/autodispose/ScopeProvider;", "b", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lt76;", "c", "Lt76;", "transactionHistoryUi", "Le13;", DateTokenConverter.CONVERTER_KEY, "Le13;", "navigator", "Llg6;", "e", "Llg6;", "agreementManager", "LTq4;", "f", "LTq4;", "reactiveConfig", "Lg46$b;", "i", "()Lg46$b;", "logger", "<init>", "(LaS2;Lcom/uber/autodispose/ScopeProvider;Lt76;Le13;Llg6;LTq4;)V", "co.bird.android.feature.merchant"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransactionHistoryPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionHistoryPresenter.kt\nco/bird/android/feature/merchant/presenter/TransactionHistoryPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nco/bird/android/library/rx/Observables\n*L\n1#1,117:1\n180#2:118\n180#2:119\n180#2:120\n218#2:121\n180#2:124\n180#2:125\n71#3,2:122\n*S KotlinDebug\n*F\n+ 1 TransactionHistoryPresenter.kt\nco/bird/android/feature/merchant/presenter/TransactionHistoryPresenterImpl\n*L\n44#1:118\n52#1:119\n65#1:120\n72#1:121\n82#1:124\n105#1:125\n75#1:122,2\n*E\n"})
/* renamed from: n76  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45499n76 implements X66 {

    /* renamed from: a */
    public final InterfaceC37961aS2 f99476a;

    /* renamed from: b */
    public final ScopeProvider f99477b;

    /* renamed from: c */
    public final InterfaceC49056t76 f99478c;

    /* renamed from: d */
    public final InterfaceC40099e13 f99479d;

    /* renamed from: e */
    public final InterfaceC44637lg6 f99480e;

    /* renamed from: f */
    public final C36207Tq4 f99481f;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u00022\u0006\u0010\u0007\u001a\u00028\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"T1", "T2", "T3", "T4", "t1", "t2", "t3", "t4", "Lwb4;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lwb4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$3\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: n76$a */
    /* loaded from: classes3.dex */
    public static final class C26408a<T1, T2, T3, T4, R> implements InterfaceC23486i {

        /* renamed from: a */
        public static final C26408a<T1, T2, T3, T4, R> f99482a = new C26408a<>();

        @Override // io.reactivex.functions.InterfaceC23486i
        /* renamed from: a */
        public final C51106wb4<T1, T2, T3, T4> apply(T1 t1, T2 t2, T3 t3, T4 t4) {
            return new C51106wb4<>(t1, t2, t3, t4);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0006*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00050\u0005 \u0006* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0006*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Listing;", "Lco/bird/android/model/wire/WireMerchantTransaction;", "it", "Lio/reactivex/B;", "LZD3;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: n76$b */
    /* loaded from: classes3.dex */
    public static final class C26409b extends Lambda implements Function1<Optional<Listing<WireMerchantTransaction>>, InterfaceC23434B<? extends ZD3<WireMerchantTransaction>>> {

        /* renamed from: g */
        public static final C26409b f99483g = new C26409b();

        public C26409b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends ZD3<WireMerchantTransaction>> invoke(Optional<Listing<WireMerchantTransaction>> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m59038b().getPagedList();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LZD3;", "Lco/bird/android/model/wire/WireMerchantTransaction;", "kotlin.jvm.PlatformType", "listing", "", C17296a.f69688o, "(LZD3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: n76$c */
    /* loaded from: classes3.dex */
    public static final class C26410c extends Lambda implements Function1<ZD3<WireMerchantTransaction>, Unit> {
        public C26410c() {
            super(1);
        }

        /* renamed from: a */
        public final void m24291a(ZD3<WireMerchantTransaction> listing) {
            InterfaceC49056t76 interfaceC49056t76 = C45499n76.this.f99478c;
            Intrinsics.checkNotNullExpressionValue(listing, "listing");
            interfaceC49056t76.mo9162N0(listing);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ZD3<WireMerchantTransaction> zd3) {
            m24291a(zd3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: n76$d */
    /* loaded from: classes3.dex */
    public static final class C26411d extends Lambda implements Function1<Throwable, Unit> {
        public C26411d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C45499n76.this.m24301i().mo7224f(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantTransaction;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireMerchantTransaction;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: n76$e */
    /* loaded from: classes3.dex */
    public static final class C26412e extends Lambda implements Function1<WireMerchantTransaction, Unit> {
        public C26412e() {
            super(1);
        }

        /* renamed from: a */
        public final void m24290a(WireMerchantTransaction wireMerchantTransaction) {
            WireTransaction transaction = wireMerchantTransaction.getTransaction();
            C45499n76.this.f99479d.mo37113P0(transaction.getId(), transaction.getAmount(), transaction.getCurrency(), transaction.getTransactionDate(), transaction.getMerchantSiteId());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireMerchantTransaction wireMerchantTransaction) {
            m24290a(wireMerchantTransaction);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: n76$f */
    /* loaded from: classes3.dex */
    public static final class C26413f extends Lambda implements Function1<Unit, Unit> {
        public C26413f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            List<? extends AgreementRole> listOf;
            InterfaceC40099e13 interfaceC40099e13 = C45499n76.this.f99479d;
            listOf = CollectionsKt__CollectionsJVMKt.listOf(AgreementRole.MERCHANT);
            interfaceC40099e13.mo37078W(listOf, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u00020\n2\u008f\u0001\u0010\t\u001a\u008a\u0001\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0001 \b*D\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u000b\u0010\f"}, m28432d2 = {"Lwb4;", "Lco/bird/android/buava/Optional;", "", "Lco/bird/android/model/AgreementKey;", "", "Lco/bird/android/model/Agreement;", "", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lwb4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTransactionHistoryPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionHistoryPresenter.kt\nco/bird/android/feature/merchant/presenter/TransactionHistoryPresenterImpl$onCreate$6\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n766#2:118\n857#2,2:119\n*S KotlinDebug\n*F\n+ 1 TransactionHistoryPresenter.kt\nco/bird/android/feature/merchant/presenter/TransactionHistoryPresenterImpl$onCreate$6\n*L\n86#1:118\n86#1:119,2\n*E\n"})
    /* renamed from: n76$g */
    /* loaded from: classes3.dex */
    public static final class C26414g extends Lambda implements Function1<C51106wb4<? extends Optional<Map<AgreementKey, ? extends List<? extends Agreement>>>, ? extends Boolean, ? extends Optional<String>, ? extends Optional<String>>, Unit> {
        public C26414g() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m24289a(C51106wb4<Optional<Map<AgreementKey, List<Agreement>>>, Boolean, Optional<String>, Optional<String>> c51106wb4) {
            boolean z;
            boolean z2;
            boolean isBlank;
            List<Agreement> list;
            boolean booleanValue = c51106wb4.m6613b().booleanValue();
            Optional<String> m6612c = c51106wb4.m6612c();
            Optional<String> m6611d = c51106wb4.m6611d();
            Map<AgreementKey, List<Agreement>> m59035e = c51106wb4.m6614a().m59035e();
            ArrayList arrayList = null;
            if (m59035e != null && (list = m59035e.get(new AgreementKey(AgreementRole.MERCHANT, null, null, 4, null))) != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((Agreement) obj).getNeedsToAccept()) {
                        arrayList.add(obj);
                    }
                }
            }
            boolean z3 = false;
            if (booleanValue) {
                String m59035e2 = m6611d.m59035e();
                if (m59035e2 != null) {
                    isBlank = StringsKt__StringsJVMKt.isBlank(m59035e2);
                    if (!isBlank) {
                        z = false;
                        if (!z) {
                            if (arrayList != null && !arrayList.isEmpty()) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (!z2) {
                                z3 = true;
                            }
                        }
                    }
                }
                z = true;
                if (!z) {
                }
            }
            InterfaceC49056t76 interfaceC49056t76 = C45499n76.this.f99478c;
            String m59035e3 = m6612c.m59035e();
            if (m59035e3 == null) {
                m59035e3 = C45499n76.this.f99478c.getString(C45871nl4.merchant_sign_agreement);
            }
            interfaceC49056t76.mo9158R0(m59035e3);
            InterfaceC49056t76 interfaceC49056t762 = C45499n76.this.f99478c;
            String m59035e4 = m6611d.m59035e();
            if (m59035e4 == null) {
                m59035e4 = C45499n76.this.f99478c.getString(C45871nl4.merchant_view_agreement);
            }
            interfaceC49056t762.mo9160P0(m59035e4);
            C45499n76.this.f99478c.mo9161O0(z3);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C51106wb4<? extends Optional<Map<AgreementKey, ? extends List<? extends Agreement>>>, ? extends Boolean, ? extends Optional<String>, ? extends Optional<String>> c51106wb4) {
            m24289a(c51106wb4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", "storeOptional", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: n76$h */
    /* loaded from: classes3.dex */
    public static final class C26415h extends Lambda implements Function1<Optional<WireMerchantSite>, Unit> {
        public C26415h() {
            super(1);
        }

        /* renamed from: a */
        public final void m24288a(Optional<WireMerchantSite> optional) {
            if (optional.m59037c()) {
                WireMerchantSite m59038b = optional.m59038b();
                C45499n76.this.f99476a.mo12338i(m59038b.getMerchant().getId(), m59038b.getId());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<WireMerchantSite> optional) {
            m24288a(optional);
            return Unit.INSTANCE;
        }
    }

    public C45499n76(InterfaceC37961aS2 merchantManager, ScopeProvider scopeProvider, InterfaceC49056t76 transactionHistoryUi, InterfaceC40099e13 navigator, InterfaceC44637lg6 agreementManager, C36207Tq4 reactiveConfig) {
        Intrinsics.checkNotNullParameter(merchantManager, "merchantManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(transactionHistoryUi, "transactionHistoryUi");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(agreementManager, "agreementManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f99476a = merchantManager;
        this.f99477b = scopeProvider;
        this.f99478c = transactionHistoryUi;
        this.f99479d = navigator;
        this.f99480e = agreementManager;
        this.f99481f = reactiveConfig;
    }

    /* renamed from: j */
    public static final InterfaceC23434B m24300j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m24299k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m24298l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final void m24297m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m24296n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m24295o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m24294p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.X66
    /* renamed from: a */
    public void mo24309a() {
        Observable<Optional<Listing<WireMerchantTransaction>>> mo12346a = this.f99476a.mo12346a();
        final C26409b c26409b = C26409b.f99483g;
        Observable observeOn = mo12346a.flatMap(new InterfaceC23492o() { // from class: a76
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m24300j;
                m24300j = C45499n76.m24300j(Function1.this, obj);
                return m24300j;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "merchantManager.merchant…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f99477b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26410c c26410c = new C26410c();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: c76
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45499n76.m24299k(Function1.this, obj);
            }
        };
        final C26411d c26411d = new C26411d();
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: e76
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45499n76.m24298l(Function1.this, obj);
            }
        });
        Observable<WireMerchantTransaction> observeOn2 = this.f99478c.mo9164L().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "transactionHistoryUi.ite…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f99477b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26412e c26412e = new C26412e();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: g76
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45499n76.m24297m(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn3 = this.f99478c.mo9163M0().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "transactionHistoryUi.agr…dSchedulers.mainThread())");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(this.f99477b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26413f c26413f = new C26413f();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: i76
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45499n76.m24296n(Function1.this, obj);
            }
        });
        AbstractC24507p m32065J = InterfaceC44637lg6.C25760a.refreshAgreements$default(this.f99480e, new AgreementRole[]{AgreementRole.MERCHANT}, null, null, 6, null).m32065J();
        Intrinsics.checkNotNullExpressionValue(m32065J, "agreementManager.refresh…\n      .onErrorComplete()");
        Object m32048b = m32065J.m32048b(AutoDispose.m45239a(this.f99477b));
        Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((MaybeSubscribeProxy) m32048b).subscribe();
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable combineLatest = Observable.combineLatest(C37279Yf5.m74541n0(this.f99480e.mo2957d()), this.f99481f.m82418y8(), this.f99481f.m82428x8(), this.f99481f.m82438w8(), C26408a.f99482a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…> Quad(t1, t2, t3, t4) })");
        Observable observeOn4 = combineLatest.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as4 = observeOn4.m33094as(AutoDispose.m45239a(this.f99477b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26414g c26414g = new C26414g();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: k76
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45499n76.m24295o(Function1.this, obj);
            }
        });
    }

    /* renamed from: i */
    public final C41318g46.AbstractC20723b m24301i() {
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("merchant-history-presenter");
        Intrinsics.checkNotNullExpressionValue(m40153k, "tag(\"merchant-history-presenter\")");
        return m40153k;
    }

    @Override // p000.X66
    public void onResume() {
        Observable<Optional<WireMerchantSite>> observeOn = this.f99476a.mo12344c().distinctUntilChanged().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "merchantManager.currentS…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f99477b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26415h c26415h = new C26415h();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Y66
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45499n76.m24294p(Function1.this, obj);
            }
        });
    }
}
