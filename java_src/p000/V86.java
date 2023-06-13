package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.User;
import co.bird.android.model.constant.ContainerOrderStatus;
import co.bird.android.model.constant.OperatorOrderViewType;
import co.bird.android.model.constant.SkuOrderStatus;
import co.bird.android.model.persistence.OperatorOrderView;
import co.bird.android.model.persistence.OperatorOrderViewSection;
import co.bird.android.model.persistence.ScrapOrderView;
import co.bird.android.model.persistence.SkuOrder;
import co.bird.android.model.wire.WireContainerOrder;
import co.bird.android.model.wire.WireItemScrapReason;
import co.bird.android.model.wire.WireSkuOrder;
import co.bird.android.model.wire.WireSkuOrderKt;
import co.bird.android.model.wire.WireSkuScanItem;
import co.bird.android.model.wire.WireSkuScannedItems;
import co.bird.android.model.wire.WireTransferOrder;
import co.bird.android.model.wire.WireTransferOrderClosedIncompleteReason;
import co.bird.android.model.wire.WireTransferOrderFilter;
import co.bird.android.model.wire.WireTransferOrderLineItem;
import co.bird.api.request.BillOfLadingRequestBody;
import co.bird.api.request.BulkSkuItemScanRequestBody;
import co.bird.api.request.SkuItemScanRequestBody;
import co.bird.api.request.SkuOrderMissing;
import co.bird.api.request.SkuOrderMissingRequestBody;
import co.bird.api.request.SkuScannedItemRequest;
import co.bird.api.request.TestRideRequestBody;
import co.bird.api.response.BulkScanItemResponse;
import co.bird.api.response.ServiceCenterOrderViewResponse;
import co.bird.api.response.TestRideResponse;
import co.bird.api.response.TransferOrderVehicleViewResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010U\u001a\u00020S\u0012\u0006\u0010X\u001a\u00020V\u0012\u0006\u0010[\u001a\u00020Y\u0012\u0006\u0010^\u001a\u00020\\\u0012\u0006\u0010a\u001a\u00020_\u0012\u0006\u0010d\u001a\u00020b\u0012\u0006\u0010g\u001a\u00020e¢\u0006\u0004\bh\u0010iJ,\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\u0014\u001a\u00020\u0006H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\b2\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0006H\u0016J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\b2\u0006\u0010\u001f\u001a\u00020\u0006H\u0016JH\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\b2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u000f2\b\u0010%\u001a\u0004\u0018\u00010\u00062\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u000fH\u0016J<\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\b2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00062\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u000fH\u0016JJ\u0010.\u001a\b\u0012\u0004\u0012\u00020+0\b2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00062\u001a\u0010*\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060-0\u00052\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u000fH\u0016J,\u00101\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\u0014\u001a\u00020\u00062\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u00100\u001a\u00020\u000fH\u0016J$\u00104\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u00062\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000602H\u0016J\u001e\u00107\u001a\b\u0012\u0004\u0012\u0002060\b2\u0006\u00105\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\u001c\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u00050\b2\u0006\u0010\u001f\u001a\u00020\u0006H\u0016J\u0014\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0\u00050\bH\u0016J\b\u0010<\u001a\u00020\u001dH\u0016J\u0014\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0\u00050=H\u0016J\u001c\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0\u00050=2\u0006\u0010@\u001a\u00020\u0006H\u0016J\u001e\u0010F\u001a\b\u0012\u0004\u0012\u00020A0=2\u0006\u0010C\u001a\u00020\u00062\u0006\u0010E\u001a\u00020DH\u0016J\b\u0010G\u001a\u00020\u001dH\u0016J\u000e\u0010I\u001a\b\u0012\u0004\u0012\u00020H0=H\u0016J\u0010\u0010J\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\u0016\u0010L\u001a\b\u0012\u0004\u0012\u00020K0=2\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\u001e\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\b2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\u0006H\u0016J\b\u0010P\u001a\u00020\u001dH\u0016J\u0014\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u00050=H\u0016R\u0014\u0010U\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010TR\u0014\u0010X\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010WR\u0014\u0010[\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010ZR\u0014\u0010^\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010]R\u0014\u0010a\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010`R\u0014\u0010d\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010cR\u0014\u0010g\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010f¨\u0006j"}, m28432d2 = {"LV86;", "LO86;", "Lorg/joda/time/DateTime;", "startDate", "endDate", "", "", "statusFilters", "Lio/reactivex/F;", "Lco/bird/api/response/ServiceCenterOrderViewResponse;", "e", "Lco/bird/android/model/wire/WireTransferOrderFilter;", "c", "Lco/bird/android/model/wire/WireSkuOrder;", "wireSkuOrder", "", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/wire/WireContainerOrder;", "wireContainerOrder", "m", "containerOrderId", "g", "skuOrderId", "h", "Lco/bird/android/model/wire/WireSkuScannedItems;", "w", "s", "q", "itemId", "Lio/reactivex/c;", "l", "transferOrderId", "Lco/bird/api/response/TransferOrderVehicleViewResponse;", C17296a.f69688o, "outbound", "scanIdentifier", "serviceCenterScan", "previousScanIdentifier", "validateOnly", "force", "Lco/bird/android/model/wire/WireSkuScanItem;", "u", "scanIdentifiers", "Lco/bird/api/response/BulkScanItemResponse;", "p", "Lkotlin/Pair;", "o", "bolPhotoUrls", "inbound", "k", "", "missingItemIdsAndReason", "i", "birdId", "Lco/bird/api/response/TestRideResponse;", "v", "Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;", "t", "Lco/bird/android/model/wire/WireItemScrapReason;", "O", "f", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/OperatorOrderViewSection;", "d0", "section", "Lco/bird/android/model/persistence/OperatorOrderView;", "p0", "orderId", "Lco/bird/android/model/constant/OperatorOrderViewType;", "type", "W", "m0", "", "M", "n", "Lco/bird/android/model/persistence/SkuOrder;", "D0", "reason", "Lco/bird/android/model/wire/WireTransferOrder;", "b", "r", "Lco/bird/android/model/persistence/ScrapOrderView;", "j", "Lgl;", "Lgl;", "preference", "Lh86;", "Lh86;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "Llh6;", "Llh6;", "userManager", "LTq4;", "LTq4;", "reactiveConfig", "LVp3;", "LVp3;", "operatorOrderViewRepo", "Lcj3;", "Lcj3;", "fmAllocationDetailsRepo", "Ljp5;", "Ljp5;", "scrapOrderViewRepo", "<init>", "(Lgl;Lh86;Llh6;LTq4;LVp3;Lcj3;Ljp5;)V", "transfer-order_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransferOrderManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferOrderManagerImpl.kt\nco/bird/android/manager/transferorder/TransferOrderManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,296:1\n237#2:297\n1726#3,3:298\n1726#3,3:301\n1747#3,3:304\n1549#3:307\n1620#3,3:308\n1549#3:311\n1620#3,3:312\n125#4:315\n152#4,3:316\n*S KotlinDebug\n*F\n+ 1 TransferOrderManagerImpl.kt\nco/bird/android/manager/transferorder/TransferOrderManagerImpl\n*L\n65#1:297\n99#1:298,3\n101#1:301,3\n127#1:304,3\n173#1:307\n173#1:308,3\n193#1:311\n193#1:312,3\n215#1:315\n215#1:316,3\n*E\n"})
/* renamed from: V86 */
/* loaded from: classes4.dex */
public final class V86 implements O86 {

    /* renamed from: a */
    public final C22454gl f38676a;

    /* renamed from: b */
    public final InterfaceC41951h86 f38677b;

    /* renamed from: c */
    public final InterfaceC44647lh6 f38678c;

    /* renamed from: d */
    public final C36207Tq4 f38679d;

    /* renamed from: e */
    public final InterfaceC36665Vp3 f38680e;

    /* renamed from: f */
    public final InterfaceC39310cj3 f38681f;

    /* renamed from: g */
    public final InterfaceC43540jp5 f38682g;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "enabled", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: V86$a */
    /* loaded from: classes4.dex */
    public static final class C8564a extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C8564a f38683g = new C8564a();

        public C8564a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean enabled) {
            Intrinsics.checkNotNullParameter(enabled, "enabled");
            return enabled;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: V86$b */
    /* loaded from: classes4.dex */
    public static final class C8565b extends Lambda implements Function1<Boolean, InterfaceC23496h> {
        public C8565b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23496h invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return V86.this.mo80298f();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: V86$c */
    /* loaded from: classes4.dex */
    public static final class C8566c extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C8566c f38685g = new C8566c();

        public C8566c() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/User;", "user", "Lio/reactivex/K;", "Lco/bird/api/response/ServiceCenterOrderViewResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/User;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: V86$d */
    /* loaded from: classes4.dex */
    public static final class C8567d extends Lambda implements Function1<User, InterfaceC23447K<? extends ServiceCenterOrderViewResponse>> {

        /* renamed from: h */
        public final /* synthetic */ DateTime f38687h;

        /* renamed from: i */
        public final /* synthetic */ DateTime f38688i;

        /* renamed from: j */
        public final /* synthetic */ List<String> f38689j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8567d(DateTime dateTime, DateTime dateTime2, List<String> list) {
            super(1);
            this.f38687h = dateTime;
            this.f38688i = dateTime2;
            this.f38689j = list;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends ServiceCenterOrderViewResponse> invoke(User user) {
            Intrinsics.checkNotNullParameter(user, "user");
            String warehouseId = user.getWarehouseId();
            if (warehouseId != null) {
                return V86.this.f38677b.m36812o(warehouseId, this.f38687h, this.f38688i, this.f38689j);
            }
            throw new RuntimeException("Unable to retrieve Active Transfer Orders because user is not associated to a warehouse");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "user", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/User;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: V86$e */
    /* loaded from: classes4.dex */
    public static final class C8568e extends Lambda implements Function1<User, InterfaceC23496h> {
        public C8568e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(User user) {
            Intrinsics.checkNotNullParameter(user, "user");
            String warehouseId = user.getWarehouseId();
            if (warehouseId != null) {
                return V86.this.f38682g.mo26760C1(warehouseId).m33063X(C24542a.m31932c());
            }
            throw new RuntimeException("Unable to retrieve Active Scrap Orders because user is not associated to a warehouse");
        }
    }

    public V86(C22454gl preference, InterfaceC41951h86 client, InterfaceC44647lh6 userManager, C36207Tq4 reactiveConfig, InterfaceC36665Vp3 operatorOrderViewRepo, InterfaceC39310cj3 fmAllocationDetailsRepo, InterfaceC43540jp5 scrapOrderViewRepo) {
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(operatorOrderViewRepo, "operatorOrderViewRepo");
        Intrinsics.checkNotNullParameter(fmAllocationDetailsRepo, "fmAllocationDetailsRepo");
        Intrinsics.checkNotNullParameter(scrapOrderViewRepo, "scrapOrderViewRepo");
        this.f38676a = preference;
        this.f38677b = client;
        this.f38678c = userManager;
        this.f38679d = reactiveConfig;
        this.f38680e = operatorOrderViewRepo;
        this.f38681f = fmAllocationDetailsRepo;
        this.f38682g = scrapOrderViewRepo;
        Observable<Boolean> m82930B6 = reactiveConfig.m82930B6();
        final C8564a c8564a = C8564a.f38683g;
        AbstractC23442F<Boolean> firstOrError = m82930B6.filter(new InterfaceC23494q() { // from class: P86
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m80314D;
                m80314D = V86.m80314D(Function1.this, obj);
                return m80314D;
            }
        }).firstOrError();
        final C8565b c8565b = new C8565b();
        AbstractC23461c m33164B = firstOrError.m33164B(new InterfaceC23492o() { // from class: Q86
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m80312E;
                m80312E = V86.m80312E(Function1.this, obj);
                return m80312E;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "reactiveConfig.enableOpe…{ fetchOperatorOrders() }");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33041n = m33164B.m33041n(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: R86
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                V86.m80311F();
            }
        };
        final C8566c c8566c = C8566c.f38685g;
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: S86
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                V86.m80310G(Function1.this, obj);
            }
        });
    }

    /* renamed from: D */
    public static final boolean m80314D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: E */
    public static final InterfaceC23496h m80312E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m80311F() {
    }

    /* renamed from: G */
    public static final void m80310G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final InterfaceC23447K m80309H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final InterfaceC23496h m80308I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    @Override // p000.O86
    /* renamed from: D0 */
    public Observable<SkuOrder> mo80313D0(String skuOrderId) {
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        Observable<SkuOrder> subscribeOn = this.f38681f.mo40991D0(skuOrderId).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "fmAllocationDetailsRepo.…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.O86
    /* renamed from: M */
    public Observable<Integer> mo80307M() {
        return this.f38680e.mo72442M();
    }

    @Override // p000.O86
    /* renamed from: O */
    public AbstractC23442F<List<WireItemScrapReason>> mo80306O() {
        AbstractC23442F<List<WireItemScrapReason>> m33142Y = this.f38677b.m36827O().m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "client.scrapReasons()\n  …scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.O86
    /* renamed from: W */
    public Observable<OperatorOrderView> mo80305W(String orderId, OperatorOrderViewType type) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(type, "type");
        Observable<OperatorOrderView> subscribeOn = this.f38680e.mo72437W(orderId, type).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "operatorOrderViewRepo.st…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.O86
    /* renamed from: a */
    public AbstractC23442F<TransferOrderVehicleViewResponse> mo80304a(String transferOrderId) {
        Intrinsics.checkNotNullParameter(transferOrderId, "transferOrderId");
        return this.f38677b.m36826a(transferOrderId);
    }

    @Override // p000.O86
    /* renamed from: b */
    public AbstractC23442F<WireTransferOrder> mo80303b(String transferOrderId, String reason) {
        Intrinsics.checkNotNullParameter(transferOrderId, "transferOrderId");
        Intrinsics.checkNotNullParameter(reason, "reason");
        return this.f38677b.m36825b(transferOrderId, reason);
    }

    @Override // p000.O86
    /* renamed from: c */
    public AbstractC23442F<List<WireTransferOrderFilter>> mo80302c() {
        return this.f38677b.m36824c();
    }

    @Override // p000.O86
    /* renamed from: d */
    public boolean mo80301d(WireSkuOrder wireSkuOrder) {
        Intrinsics.checkNotNullParameter(wireSkuOrder, "wireSkuOrder");
        if (wireSkuOrder.getStatus() != SkuOrderStatus.CHECKED_IN && wireSkuOrder.getStatus() != SkuOrderStatus.READY_FOR_PROCESSING && wireSkuOrder.getStatus() != SkuOrderStatus.PENDING && !this.f38679d.m82623f8().m73665a().getOperatorConfig().getFeatures().getTransferOrder().getAllowSkuScanOverride()) {
            return false;
        }
        return true;
    }

    @Override // p000.O86
    /* renamed from: d0 */
    public Observable<List<OperatorOrderViewSection>> mo80300d0() {
        Observable<List<OperatorOrderViewSection>> subscribeOn = this.f38680e.mo72436d0().subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "operatorOrderViewRepo.st…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.O86
    /* renamed from: e */
    public AbstractC23442F<ServiceCenterOrderViewResponse> mo80299e(DateTime startDate, DateTime endDate, List<String> statusFilters) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(statusFilters, "statusFilters");
        AbstractC23442F<User> user = this.f38678c.getUser();
        final C8567d c8567d = new C8567d(startDate, endDate, statusFilters);
        AbstractC23442F m33165A = user.m33165A(new InterfaceC23492o() { // from class: U86
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m80309H;
                m80309H = V86.m80309H(Function1.this, obj);
                return m80309H;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun activeTrans…rs,\n        )\n      }\n  }");
        return m33165A;
    }

    @Override // p000.O86
    /* renamed from: f */
    public AbstractC23461c mo80298f() {
        AbstractC23461c m33063X = this.f38680e.mo72435g1().m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "operatorOrderViewRepo.fe…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.O86
    /* renamed from: g */
    public AbstractC23442F<WireContainerOrder> mo80297g(String containerOrderId) {
        Intrinsics.checkNotNullParameter(containerOrderId, "containerOrderId");
        return this.f38677b.m36815l(containerOrderId);
    }

    @Override // p000.O86
    /* renamed from: h */
    public AbstractC23442F<WireSkuOrder> mo80296h(String skuOrderId) {
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        return this.f38677b.m36814m(skuOrderId);
    }

    @Override // p000.O86
    /* renamed from: i */
    public AbstractC23461c mo80295i(String skuOrderId, Map<String, String> missingItemIdsAndReason) {
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        Intrinsics.checkNotNullParameter(missingItemIdsAndReason, "missingItemIdsAndReason");
        InterfaceC41951h86 interfaceC41951h86 = this.f38677b;
        ArrayList arrayList = new ArrayList(missingItemIdsAndReason.size());
        for (Map.Entry<String, String> entry : missingItemIdsAndReason.entrySet()) {
            arrayList.add(new SkuOrderMissing(entry.getKey(), entry.getValue()));
        }
        return interfaceC41951h86.m36821f(new SkuOrderMissingRequestBody(skuOrderId, arrayList));
    }

    @Override // p000.O86
    /* renamed from: j */
    public Observable<List<ScrapOrderView>> mo80294j() {
        Observable<List<ScrapOrderView>> subscribeOn = this.f38682g.mo26755q1().subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "scrapOrderViewRepo.scrap…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.O86
    /* renamed from: k */
    public AbstractC23442F<WireContainerOrder> mo80293k(String containerOrderId, List<String> bolPhotoUrls, boolean z) {
        Intrinsics.checkNotNullParameter(containerOrderId, "containerOrderId");
        Intrinsics.checkNotNullParameter(bolPhotoUrls, "bolPhotoUrls");
        return this.f38677b.m36817j(new BillOfLadingRequestBody(containerOrderId, bolPhotoUrls, z));
    }

    @Override // p000.O86
    /* renamed from: l */
    public AbstractC23461c mo80292l(String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        return this.f38677b.m36823d(itemId);
    }

    @Override // p000.O86
    /* renamed from: m */
    public boolean mo80291m(WireContainerOrder wireContainerOrder) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(wireContainerOrder, "wireContainerOrder");
        boolean mo80283s = mo80283s(wireContainerOrder);
        if (mo80283s && wireContainerOrder.getStatus() == ContainerOrderStatus.READY_FOR_PICKUP) {
            return true;
        }
        if (mo80283s) {
            List<WireSkuOrder> skuOrders = wireContainerOrder.getSkuOrders();
            if (!(skuOrders instanceof Collection) || !skuOrders.isEmpty()) {
                for (WireSkuOrder wireSkuOrder : skuOrders) {
                    if (!WireSkuOrderKt.readyForPickup(wireSkuOrder)) {
                        z2 = false;
                        break;
                    }
                }
            }
            z2 = true;
            if (z2) {
                return true;
            }
        }
        if (!mo80283s && wireContainerOrder.getStatus() == ContainerOrderStatus.IN_TRANSIT) {
            return true;
        }
        if (!mo80283s) {
            List<WireSkuOrder> skuOrders2 = wireContainerOrder.getSkuOrders();
            if (!(skuOrders2 instanceof Collection) || !skuOrders2.isEmpty()) {
                for (WireSkuOrder wireSkuOrder2 : skuOrders2) {
                    if (!WireSkuOrderKt.receivedInDestination(wireSkuOrder2)) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.O86
    /* renamed from: m0 */
    public AbstractC23461c mo80290m0() {
        AbstractC23461c m33063X = this.f38680e.mo72434m0().m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "operatorOrderViewRepo.fe…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.O86
    /* renamed from: n */
    public AbstractC23461c mo80289n(String skuOrderId) {
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        AbstractC23461c m33063X = this.f38681f.mo40986n(skuOrderId).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "fmAllocationDetailsRepo.…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.O86
    /* renamed from: o */
    public AbstractC23442F<BulkScanItemResponse> mo80288o(boolean z, String skuOrderId, List<Pair<String, String>> scanIdentifiers, boolean z2, boolean z3) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        Intrinsics.checkNotNullParameter(scanIdentifiers, "scanIdentifiers");
        InterfaceC41951h86 interfaceC41951h86 = this.f38677b;
        List<Pair<String, String>> list = scanIdentifiers;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(new SkuScannedItemRequest((String) pair.component1(), (String) pair.component2()));
        }
        return interfaceC41951h86.m36820g(new BulkSkuItemScanRequestBody(skuOrderId, arrayList, !z, !z2));
    }

    @Override // p000.O86
    /* renamed from: p */
    public AbstractC23442F<BulkScanItemResponse> mo80287p(boolean z, String skuOrderId, List<String> scanIdentifiers, boolean z2, boolean z3) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        Intrinsics.checkNotNullParameter(scanIdentifiers, "scanIdentifiers");
        InterfaceC41951h86 interfaceC41951h86 = this.f38677b;
        List<String> list = scanIdentifiers;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (String str : list) {
            arrayList.add(new SkuScannedItemRequest(str, null));
        }
        return interfaceC41951h86.m36820g(new BulkSkuItemScanRequestBody(skuOrderId, arrayList, !z, !z2));
    }

    @Override // p000.O86
    /* renamed from: p0 */
    public Observable<List<OperatorOrderView>> mo80286p0(String section) {
        Intrinsics.checkNotNullParameter(section, "section");
        Observable<List<OperatorOrderView>> subscribeOn = this.f38680e.mo72433p0(section).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "operatorOrderViewRepo.st…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.O86
    /* renamed from: q */
    public boolean mo80285q(WireSkuOrder wireSkuOrder) {
        String str;
        WireTransferOrder transferOrder;
        Intrinsics.checkNotNullParameter(wireSkuOrder, "wireSkuOrder");
        WireTransferOrderLineItem transferOrderLineItem = wireSkuOrder.getTransferOrderLineItem();
        String str2 = null;
        if (transferOrderLineItem != null && (transferOrder = transferOrderLineItem.getTransferOrder()) != null) {
            str = transferOrder.getOriginWarehouseId();
        } else {
            str = null;
        }
        User m37750B0 = this.f38676a.m37750B0();
        if (m37750B0 != null) {
            str2 = m37750B0.getWarehouseId();
        }
        return Intrinsics.areEqual(str, str2);
    }

    @Override // p000.O86
    /* renamed from: r */
    public AbstractC23461c mo80284r() {
        AbstractC23442F<User> user = this.f38678c.getUser();
        final C8568e c8568e = new C8568e();
        AbstractC23461c m33164B = user.m33164B(new InterfaceC23492o() { // from class: T86
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m80308I;
                m80308I = V86.m80308I(Function1.this, obj);
                return m80308I;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchScrapO…edulers.io())\n      }\n  }");
        return m33164B;
    }

    @Override // p000.O86
    /* renamed from: s */
    public boolean mo80283s(WireContainerOrder wireContainerOrder) {
        Intrinsics.checkNotNullParameter(wireContainerOrder, "wireContainerOrder");
        List<WireSkuOrder> skuOrders = wireContainerOrder.getSkuOrders();
        if ((skuOrders instanceof Collection) && skuOrders.isEmpty()) {
            return false;
        }
        for (WireSkuOrder wireSkuOrder : skuOrders) {
            if (mo80285q(wireSkuOrder)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.O86
    /* renamed from: t */
    public AbstractC23442F<List<WireTransferOrderClosedIncompleteReason>> mo80282t(String transferOrderId) {
        Intrinsics.checkNotNullParameter(transferOrderId, "transferOrderId");
        AbstractC23442F<List<WireTransferOrderClosedIncompleteReason>> m33142Y = this.f38677b.m36811p(transferOrderId).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "client.closedIncompleteR…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.O86
    /* renamed from: u */
    public AbstractC23442F<WireSkuScanItem> mo80281u(boolean z, String skuOrderId, String scanIdentifier, boolean z2, String str, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        Intrinsics.checkNotNullParameter(scanIdentifier, "scanIdentifier");
        return this.f38677b.m36810q(new SkuItemScanRequestBody(skuOrderId, scanIdentifier, str, !z, z3, !z2, z4));
    }

    @Override // p000.O86
    /* renamed from: v */
    public AbstractC23442F<TestRideResponse> mo80280v(String birdId, String skuOrderId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        return this.f38677b.m36816k(new TestRideRequestBody(birdId, skuOrderId));
    }

    @Override // p000.O86
    /* renamed from: w */
    public AbstractC23442F<WireSkuScannedItems> mo80279w(String skuOrderId) {
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        return this.f38677b.m36818i(skuOrderId);
    }
}
