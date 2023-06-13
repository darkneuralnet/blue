package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BirdPartBody;
import co.bird.android.model.User;
import co.bird.android.model.constant.PartKind;
import co.bird.android.model.itemlease.p022enum.ItemLeaseType;
import co.bird.android.model.wire.WireBirdPart;
import co.bird.android.model.wire.WireInventoryPart;
import co.bird.android.model.wire.WirePart;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23447K;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C8997WM;
import p000.InterfaceC36863Wl3;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u0010#\u001a\u00020!\u0012\u0006\u0010&\u001a\u00020$¢\u0006\u0004\b'\u0010(J0\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016J\"\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00110\b0\u00072\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J,\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\b0\u00072\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH\u0016J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH\u0016J$\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\b0\u00072\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0005H\u0016J\f\u0010\u001a\u001a\u00020\u0019*\u00020\u0005H\u0002R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010%¨\u0006)"}, m28432d2 = {"LWM;", "LSM;", "", "id", "key", "Lco/bird/android/model/constant/PartKind;", "kind", "Lio/reactivex/F;", "LHM4;", "Lco/bird/android/model/wire/WireBirdPart;", C17296a.f69688o, "raw", "", "warehouseSpecific", "Lco/bird/android/model/wire/WirePart;", DateTokenConverter.CONVERTER_KEY, "birdId", "", "b", "sourcePart", "identifyingPart", "c", "f", "partKind", "e", "Lco/bird/android/model/itemlease/enum/ItemLeaseType;", "m", "LRM;", "LRM;", "birdPartClient", "LWl3;", "LWl3;", "inventoryClient", "Llh6;", "Llh6;", "userManager", "LMc2;", "LMc2;", "itemLeaseManager", "<init>", "(LRM;LWl3;Llh6;LMc2;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: WM */
/* loaded from: classes2.dex */
public final class C8997WM implements InterfaceC7381SM {

    /* renamed from: a */
    public final InterfaceC7153RM f40888a;

    /* renamed from: b */
    public final InterfaceC36863Wl3 f40889b;

    /* renamed from: c */
    public final InterfaceC44647lh6 f40890c;

    /* renamed from: d */
    public final InterfaceC34441Mc2 f40891d;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: WM$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C8998a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PartKind.values().length];
            try {
                iArr[PartKind.HELMET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/wire/WirePart;", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "b", "(LHM4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: WM$b */
    /* loaded from: classes2.dex */
    public static final class C8999b extends Lambda implements Function1<HM4<WirePart>, InterfaceC23447K<? extends HM4<WirePart>>> {

        /* renamed from: h */
        public final /* synthetic */ String f40893h;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "ex", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: WM$b$a */
        /* loaded from: classes2.dex */
        public static final class C9000a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public static final C9000a f40894g = new C9000a();

            public C9000a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C41318g46.m40158f(th, "Error while attempting to mark lease item available in id tools, ignoring since this was best effort attempt", new Object[0]);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8999b(String str) {
            super(1);
            this.f40893h = str;
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends HM4<WirePart>> invoke(HM4<WirePart> it) {
            AbstractC23461c m33039p;
            Intrinsics.checkNotNullParameter(it, "it");
            WirePart m103944a = it.m103944a();
            if (m103944a == null) {
                return AbstractC23442F.m33158H(it);
            }
            ItemLeaseType m78553m = C8997WM.this.m78553m(m103944a.getKind());
            if (m78553m != ItemLeaseType.UNKNOWN) {
                AbstractC23461c m33159G = C8997WM.this.f40891d.mo55661o(m78553m, true, m103944a.getId(), this.f40893h).m33159G();
                final C9000a c9000a = C9000a.f40894g;
                m33039p = m33159G.m33084B(new InterfaceC23484g() { // from class: XM
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C8997WM.C8999b.invoke$lambda$0(Function1.this, obj);
                    }
                }).m33069Q();
            } else {
                m33039p = AbstractC23461c.m33039p();
            }
            return m33039p.m33042m(AbstractC23442F.m33158H(it));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/User;", "user", "Lio/reactivex/K;", "Lco/bird/android/model/wire/WirePart;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/User;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: WM$c */
    /* loaded from: classes2.dex */
    public static final class C9001c extends Lambda implements Function1<User, InterfaceC23447K<? extends WirePart>> {

        /* renamed from: h */
        public final /* synthetic */ String f40896h;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireInventoryPart;", "it", "Lco/bird/android/model/wire/WirePart;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lco/bird/android/model/wire/WirePart;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: WM$c$a */
        /* loaded from: classes2.dex */
        public static final class C9002a extends Lambda implements Function1<List<? extends WireInventoryPart>, WirePart> {

            /* renamed from: g */
            public static final C9002a f40897g = new C9002a();

            public C9002a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final WirePart invoke(List<WireInventoryPart> it) {
                Object first;
                Intrinsics.checkNotNullParameter(it, "it");
                first = CollectionsKt___CollectionsKt.first((List<? extends Object>) it);
                return ((WireInventoryPart) first).toPart();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9001c(String str) {
            super(1);
            this.f40896h = str;
        }

        /* renamed from: c */
        public static final WirePart m78548c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (WirePart) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends WirePart> invoke(User user) {
            Intrinsics.checkNotNullParameter(user, "user");
            InterfaceC36863Wl3 interfaceC36863Wl3 = C8997WM.this.f40889b;
            String str = this.f40896h;
            String warehouseId = user.getWarehouseId();
            if (warehouseId == null) {
                warehouseId = "";
            }
            AbstractC23442F searchParts$default = InterfaceC36863Wl3.C9164a.searchParts$default(interfaceC36863Wl3, null, str, warehouseId, 1, null);
            final C9002a c9002a = C9002a.f40897g;
            return searchParts$default.m33157I(new InterfaceC23492o() { // from class: YM
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    WirePart m78548c;
                    m78548c = C8997WM.C9001c.m78548c(Function1.this, obj);
                    return m78548c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBirdPart;", "it", "Lco/bird/android/model/wire/WirePart;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBirdPart;)Lco/bird/android/model/wire/WirePart;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: WM$d */
    /* loaded from: classes2.dex */
    public static final class C9003d extends Lambda implements Function1<WireBirdPart, WirePart> {

        /* renamed from: g */
        public static final C9003d f40898g = new C9003d();

        public C9003d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final WirePart invoke(WireBirdPart it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toPart();
        }
    }

    public C8997WM(InterfaceC7153RM birdPartClient, InterfaceC36863Wl3 inventoryClient, InterfaceC44647lh6 userManager, InterfaceC34441Mc2 itemLeaseManager) {
        Intrinsics.checkNotNullParameter(birdPartClient, "birdPartClient");
        Intrinsics.checkNotNullParameter(inventoryClient, "inventoryClient");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(itemLeaseManager, "itemLeaseManager");
        this.f40888a = birdPartClient;
        this.f40889b = inventoryClient;
        this.f40890c = userManager;
        this.f40891d = itemLeaseManager;
    }

    /* renamed from: j */
    public static final InterfaceC23447K m78556j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final InterfaceC23447K m78555k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final WirePart m78554l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WirePart) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC7381SM
    /* renamed from: a */
    public AbstractC23442F<HM4<WireBirdPart>> mo78565a(String str, String str2, PartKind kind) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        AbstractC23442F<HM4<WireBirdPart>> m33142Y = this.f40888a.m86829a(str, str2, kind).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "birdPartClient.getBirdPa…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC7381SM
    /* renamed from: b */
    public AbstractC23442F<HM4<List<WireBirdPart>>> mo78564b(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F<HM4<List<WireBirdPart>>> m33142Y = this.f40888a.m86828b(birdId).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "birdPartClient.getPartsB…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC7381SM
    /* renamed from: c */
    public AbstractC23442F<HM4<WirePart>> mo78563c(String birdId, WirePart sourcePart, WirePart identifyingPart) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(sourcePart, "sourcePart");
        Intrinsics.checkNotNullParameter(identifyingPart, "identifyingPart");
        AbstractC23442F<HM4<WirePart>> m86827c = this.f40888a.m86827c(new BirdPartBody(null, sourcePart, identifyingPart, null, birdId, 9, null));
        final C8999b c8999b = new C8999b(birdId);
        AbstractC23442F m33165A = m86827c.m33165A(new InterfaceC23492o() { // from class: VM
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m78556j;
                m78556j = C8997WM.m78556j(Function1.this, obj);
                return m78556j;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun attachPart(…gle.just(it))\n      }\n  }");
        return m33165A;
    }

    @Override // p000.InterfaceC7381SM
    /* renamed from: d */
    public AbstractC23442F<WirePart> mo78562d(String raw, PartKind kind, boolean z) {
        AbstractC23442F<WirePart> abstractC23442F;
        boolean z2;
        Intrinsics.checkNotNullParameter(raw, "raw");
        Intrinsics.checkNotNullParameter(kind, "kind");
        String first = C33894Jt4.f18402a.m99600b(raw).getFirst();
        if (z) {
            if (first != null && first.length() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                first = raw;
            }
        }
        if (first != null) {
            AbstractC23442F<User> user = this.f40890c.getUser();
            final C9001c c9001c = new C9001c(first);
            abstractC23442F = user.m33165A(new InterfaceC23492o() { // from class: TM
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K m78555k;
                    m78555k = C8997WM.m78555k(Function1.this, obj);
                    return m78555k;
                }
            });
        } else {
            abstractC23442F = null;
        }
        if (abstractC23442F == null) {
            AbstractC23442F m70883l = C38096ag5.m70883l(mo78565a(null, raw, kind));
            final C9003d c9003d = C9003d.f40898g;
            AbstractC23442F<WirePart> m33157I = m70883l.m33157I(new InterfaceC23492o() { // from class: UM
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    WirePart m78554l;
                    m78554l = C8997WM.m78554l(Function1.this, obj);
                    return m78554l;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33157I, "getBirdPart(id = null, k…ody().map { it.toPart() }");
            return m33157I;
        }
        return abstractC23442F;
    }

    @Override // p000.InterfaceC7381SM
    /* renamed from: e */
    public AbstractC23442F<HM4<WirePart>> mo78561e(String birdId, PartKind partKind) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(partKind, "partKind");
        return this.f40888a.m86825e(new BirdPartBody(null, null, null, partKind, birdId, 7, null));
    }

    @Override // p000.InterfaceC7381SM
    /* renamed from: f */
    public AbstractC23442F<WirePart> mo78560f(String birdId, WirePart sourcePart, WirePart identifyingPart) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(sourcePart, "sourcePart");
        Intrinsics.checkNotNullParameter(identifyingPart, "identifyingPart");
        return this.f40888a.m86826d(new BirdPartBody(null, sourcePart, identifyingPart, null, birdId, 9, null));
    }

    /* renamed from: m */
    public final ItemLeaseType m78553m(PartKind partKind) {
        if (C8998a.$EnumSwitchMapping$0[partKind.ordinal()] == 1) {
            return ItemLeaseType.HELMET;
        }
        return ItemLeaseType.UNKNOWN;
    }
}
