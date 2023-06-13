package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.User;
import co.bird.android.model.wire.WireInventoryPart;
import co.bird.android.model.wire.WirePartCategory;
import co.bird.api.request.AdjustInventoryCountRequest;
import co.bird.api.response.AdjustInventoryCountResponse;
import co.bird.api.response.InventoryStatusResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C41136fm3;
import p000.InterfaceC36863Wl3;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b(\u0010)J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0016J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u00022\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J$\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00030\u00022\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J.\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00030\u00022\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\u00140\u0003H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H\u0002R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\"\u0010\"\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u001f0\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010!R \u0010'\u001a\b\u0012\u0004\u0012\u00020\u001f0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b%\u0010&¨\u0006*"}, m28432d2 = {"Lfm3;", "LXl3;", "Lio/reactivex/F;", "", "Lco/bird/android/model/wire/WirePartCategory;", "b", "", "categoryId", "Lco/bird/android/model/wire/WireInventoryPart;", "f", "Lio/reactivex/c;", "e", "sku", C17296a.f69688o, "query", "c", "", "quantity", "Lco/bird/api/response/AdjustInventoryCountResponse;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Pair;", "parts", "h", "p", "LWl3;", "LWl3;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "Llh6;", "Llh6;", "userManager", "Lio/reactivex/subjects/a;", "Lco/bird/api/response/InventoryStatusResponse;", "kotlin.jvm.PlatformType", "Lio/reactivex/subjects/a;", "healthStatusSubject", "Lio/reactivex/Observable;", "Lio/reactivex/Observable;", "g", "()Lio/reactivex/Observable;", "healthStatus", "<init>", "(LWl3;Llh6;)V", "co.bird.android.manager.operator-inventory"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorInventoryManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorInventoryManagerImpl.kt\nco/bird/android/manager/operatorinventory/OperatorInventoryManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,72:1\n1549#2:73\n1620#2,3:74\n*S KotlinDebug\n*F\n+ 1 OperatorInventoryManagerImpl.kt\nco/bird/android/manager/operatorinventory/OperatorInventoryManagerImpl\n*L\n62#1:73\n62#1:74,3\n*E\n"})
/* renamed from: fm3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41136fm3 implements InterfaceC37097Xl3 {

    /* renamed from: a */
    public final InterfaceC36863Wl3 f80657a;

    /* renamed from: b */
    public final InterfaceC44647lh6 f80658b;

    /* renamed from: c */
    public final C24552a<InventoryStatusResponse> f80659c;

    /* renamed from: d */
    public final Observable<InventoryStatusResponse> f80660d;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/User;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fm3$a */
    /* loaded from: classes4.dex */
    public static final class C20519a extends Lambda implements Function1<User, String> {

        /* renamed from: g */
        public static final C20519a f80661g = new C20519a();

        public C20519a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(User it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String warehouseId = it.getWarehouseId();
            if (warehouseId == null) {
                return "";
            }
            return warehouseId;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "warehouseId", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fm3$b */
    /* loaded from: classes4.dex */
    public static final class C20520b extends Lambda implements Function1<String, InterfaceC23496h> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: fm3$b$a */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C20521a extends FunctionReferenceImpl implements Function1<InventoryStatusResponse, Unit> {
            public C20521a(Object obj) {
                super(1, obj, C24552a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
            }

            /* renamed from: a */
            public final void m40824a(InventoryStatusResponse p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((C24552a) this.receiver).onNext(p0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InventoryStatusResponse inventoryStatusResponse) {
                m40824a(inventoryStatusResponse);
                return Unit.INSTANCE;
            }
        }

        public C20520b() {
            super(1);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(String warehouseId) {
            Intrinsics.checkNotNullParameter(warehouseId, "warehouseId");
            AbstractC23442F<InventoryStatusResponse> m77884a = C41136fm3.this.f80657a.m77884a(warehouseId);
            final C20521a c20521a = new C20521a(C41136fm3.this.f80659c);
            return m77884a.m33101w(new InterfaceC23484g() { // from class: gm3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C41136fm3.C20520b.invoke$lambda$0(Function1.this, obj);
                }
            }).m33159G();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "warehouseId", "Lio/reactivex/K;", "", "Lco/bird/android/model/wire/WireInventoryPart;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fm3$c */
    /* loaded from: classes4.dex */
    public static final class C20522c extends Lambda implements Function1<String, InterfaceC23447K<? extends List<? extends WireInventoryPart>>> {

        /* renamed from: h */
        public final /* synthetic */ String f80664h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20522c(String str) {
            super(1);
            this.f80664h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends List<WireInventoryPart>> invoke(String warehouseId) {
            Intrinsics.checkNotNullParameter(warehouseId, "warehouseId");
            return InterfaceC36863Wl3.C9164a.searchParts$default(C41136fm3.this.f80657a, this.f80664h, null, warehouseId, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "warehouseId", "Lio/reactivex/K;", "", "Lco/bird/api/response/AdjustInventoryCountResponse;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fm3$d */
    /* loaded from: classes4.dex */
    public static final class C20523d extends Lambda implements Function1<String, InterfaceC23447K<? extends List<? extends AdjustInventoryCountResponse>>> {

        /* renamed from: h */
        public final /* synthetic */ List<AdjustInventoryCountRequest> f80666h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20523d(List<AdjustInventoryCountRequest> list) {
            super(1);
            this.f80666h = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends List<AdjustInventoryCountResponse>> invoke(String warehouseId) {
            Intrinsics.checkNotNullParameter(warehouseId, "warehouseId");
            return C41136fm3.this.f80657a.m77880e(this.f80666h, warehouseId);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "warehouseId", "Lio/reactivex/K;", "Lco/bird/android/model/wire/WireInventoryPart;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fm3$e */
    /* loaded from: classes4.dex */
    public static final class C20524e extends Lambda implements Function1<String, InterfaceC23447K<? extends WireInventoryPart>> {

        /* renamed from: h */
        public final /* synthetic */ String f80668h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20524e(String str) {
            super(1);
            this.f80668h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends WireInventoryPart> invoke(String warehouseId) {
            Intrinsics.checkNotNullParameter(warehouseId, "warehouseId");
            return C41136fm3.this.f80657a.m77883b(warehouseId, this.f80668h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "warehouseId", "Lio/reactivex/K;", "", "Lco/bird/android/model/wire/WireInventoryPart;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fm3$f */
    /* loaded from: classes4.dex */
    public static final class C20525f extends Lambda implements Function1<String, InterfaceC23447K<? extends List<? extends WireInventoryPart>>> {

        /* renamed from: h */
        public final /* synthetic */ String f80670h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20525f(String str) {
            super(1);
            this.f80670h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends List<WireInventoryPart>> invoke(String warehouseId) {
            Intrinsics.checkNotNullParameter(warehouseId, "warehouseId");
            return InterfaceC36863Wl3.C9164a.searchParts$default(C41136fm3.this.f80657a, null, this.f80670h, warehouseId, 1, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "warehouseId", "Lio/reactivex/K;", "", "Lco/bird/api/response/AdjustInventoryCountResponse;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fm3$g */
    /* loaded from: classes4.dex */
    public static final class C20526g extends Lambda implements Function1<String, InterfaceC23447K<? extends List<? extends AdjustInventoryCountResponse>>> {

        /* renamed from: h */
        public final /* synthetic */ AdjustInventoryCountRequest f80672h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20526g(AdjustInventoryCountRequest adjustInventoryCountRequest) {
            super(1);
            this.f80672h = adjustInventoryCountRequest;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends List<AdjustInventoryCountResponse>> invoke(String warehouseId) {
            List<AdjustInventoryCountRequest> listOf;
            Intrinsics.checkNotNullParameter(warehouseId, "warehouseId");
            InterfaceC36863Wl3 interfaceC36863Wl3 = C41136fm3.this.f80657a;
            listOf = CollectionsKt__CollectionsJVMKt.listOf(this.f80672h);
            return interfaceC36863Wl3.m77880e(listOf, warehouseId);
        }
    }

    public C41136fm3(InterfaceC36863Wl3 client, InterfaceC44647lh6 userManager) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        this.f80657a = client;
        this.f80658b = userManager;
        C24552a<InventoryStatusResponse> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<InventoryStatusResponse>()");
        this.f80659c = m31922e;
        Observable<InventoryStatusResponse> hide = m31922e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "healthStatusSubject.hide()");
        this.f80660d = hide;
    }

    /* renamed from: q */
    public static final String m40834q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final InterfaceC23496h m40833r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final InterfaceC23447K m40832s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final InterfaceC23447K m40831t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final InterfaceC23447K m40830u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final InterfaceC23447K m40829v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final InterfaceC23447K m40828w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC37097Xl3
    /* renamed from: a */
    public AbstractC23442F<WireInventoryPart> mo40850a(String sku) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        AbstractC23442F<String> m40835p = m40835p();
        final C20524e c20524e = new C20524e(sku);
        AbstractC23442F m33165A = m40835p.m33165A(new InterfaceC23492o() { // from class: Yl3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m40830u;
                m40830u = C41136fm3.m40830u(Function1.this, obj);
                return m40830u;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun partDetails…eId, sku = sku)\n    }\n  }");
        return m33165A;
    }

    @Override // p000.InterfaceC37097Xl3
    /* renamed from: b */
    public AbstractC23442F<List<WirePartCategory>> mo40849b() {
        return this.f80657a.m77882c();
    }

    @Override // p000.InterfaceC37097Xl3
    /* renamed from: c */
    public AbstractC23442F<List<WireInventoryPart>> mo40848c(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        AbstractC23442F<String> m40835p = m40835p();
        final C20525f c20525f = new C20525f(query);
        AbstractC23442F m33165A = m40835p.m33165A(new InterfaceC23492o() { // from class: dm3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m40829v;
                m40829v = C41136fm3.m40829v(Function1.this, obj);
                return m40829v;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun searchPartB… = warehouseId)\n    }\n  }");
        return m33165A;
    }

    @Override // p000.InterfaceC37097Xl3
    /* renamed from: d */
    public AbstractC23442F<List<AdjustInventoryCountResponse>> mo40847d(String sku, int i) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        AdjustInventoryCountRequest adjustInventoryCountRequest = new AdjustInventoryCountRequest(sku, null, Integer.valueOf(i), 2, null);
        AbstractC23442F<String> m40835p = m40835p();
        final C20526g c20526g = new C20526g(adjustInventoryCountRequest);
        AbstractC23442F m33165A = m40835p.m33165A(new InterfaceC23492o() { // from class: Zl3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m40828w;
                m40828w = C41136fm3.m40828w(Function1.this, obj);
                return m40828w;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun updatePartQ…), warehouseId)\n    }\n  }");
        return m33165A;
    }

    @Override // p000.InterfaceC37097Xl3
    /* renamed from: e */
    public AbstractC23461c mo40846e() {
        AbstractC23442F<String> m40835p = m40835p();
        final C20520b c20520b = new C20520b();
        AbstractC23461c m33164B = m40835p.m33164B(new InterfaceC23492o() { // from class: bm3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m40833r;
                m40833r = C41136fm3.m40833r(Function1.this, obj);
                return m40833r;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchInvent…ignoreElement()\n    }\n  }");
        return m33164B;
    }

    @Override // p000.InterfaceC37097Xl3
    /* renamed from: f */
    public AbstractC23442F<List<WireInventoryPart>> mo40845f(String categoryId) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        AbstractC23442F<String> m40835p = m40835p();
        final C20522c c20522c = new C20522c(categoryId);
        AbstractC23442F m33165A = m40835p.m33165A(new InterfaceC23492o() { // from class: am3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m40832s;
                m40832s = C41136fm3.m40832s(Function1.this, obj);
                return m40832s;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun fetchPartsB… = warehouseId)\n    }\n  }");
        return m33165A;
    }

    @Override // p000.InterfaceC37097Xl3
    /* renamed from: g */
    public Observable<InventoryStatusResponse> mo40844g() {
        return this.f80660d;
    }

    @Override // p000.InterfaceC37097Xl3
    /* renamed from: h */
    public AbstractC23442F<List<AdjustInventoryCountResponse>> mo40843h(List<Pair<String, Integer>> parts) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(parts, "parts");
        List<Pair<String, Integer>> list = parts;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(new AdjustInventoryCountRequest((String) pair.component1(), Integer.valueOf(((Number) pair.component2()).intValue()), null, 4, null));
        }
        AbstractC23442F<String> m40835p = m40835p();
        final C20523d c20523d = new C20523d(arrayList);
        AbstractC23442F m33165A = m40835p.m33165A(new InterfaceC23492o() { // from class: em3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m40831t;
                m40831t = C41136fm3.m40831t(Function1.this, obj);
                return m40831t;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun incrementPa…e, warehouseId)\n    }\n  }");
        return m33165A;
    }

    /* renamed from: p */
    public final AbstractC23442F<String> m40835p() {
        AbstractC23442F<User> user = this.f80658b.getUser();
        final C20519a c20519a = C20519a.f80661g;
        AbstractC23442F m33157I = user.m33157I(new InterfaceC23492o() { // from class: cm3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m40834q;
                m40834q = C41136fm3.m40834q(Function1.this, obj);
                return m40834q;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "userManager.getUser().map { it.warehouseId ?: \"\" }");
        return m33157I;
    }
}
