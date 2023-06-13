package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.Sticker;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.PartKind;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdPart;
import co.bird.android.model.wire.WirePart;
import co.bird.api.error.RetrofitException;
import co.bird.api.exception.HttpException;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import p000.C34692Ne1;
import p000.H31;
@Metadata(m28433d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 52\u00020\u0001:\u0001\u001cB9\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+¢\u0006\u0004\b3\u00104J&\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0002J\u001e\u0010\f\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J\"\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\u000e2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0003H\u0002J\"\u0010\u0017\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010\r\u001a\u000200*\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00066"}, m28432d2 = {"LNe1;", "Lse1;", "Lio/reactivex/Observable;", "", "scanObservable", "", "Lco/bird/android/model/constant/BirdModel;", "restrictModels", "", "I", "Lco/bird/android/model/constant/PartKind;", "kind", "P", PaymentMethodOptionsParams.Blik.PARAM_CODE, "Lio/reactivex/p;", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBirdPart;", "Lco/bird/android/model/wire/WireBird;", "x", "key", "Lio/reactivex/F;", "Lco/bird/android/model/wire/WirePart;", "D", C17296a.f69688o, "Lom3;", "Lom3;", "operatorManager", "LSM;", "b", "LSM;", "birdPartManager", "LNQ5;", "c", "LNQ5;", "stickerManager", "Lcom/uber/autodispose/ScopeProvider;", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LSe1;", "e", "LSe1;", "ui", "Le13;", "f", "Le13;", "navigator", "", "", "w", "(Ljava/lang/Throwable;)I", "<init>", "(Lom3;LSM;LNQ5;Lcom/uber/autodispose/ScopeProvider;LSe1;Le13;)V", "g", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEnterCodePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterCodePresenter.kt\nco/bird/android/vehiclescanner/servicecenter/code/EnterCodePresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,235:1\n180#2:236\n180#2:237\n180#2:238\n*S KotlinDebug\n*F\n+ 1 EnterCodePresenter.kt\nco/bird/android/vehiclescanner/servicecenter/code/EnterCodePresenterImpl\n*L\n66#1:236\n125#1:237\n162#1:238\n*E\n"})
/* renamed from: Ne1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C34692Ne1 implements InterfaceC48762se1 {

    /* renamed from: g */
    public static final C5623b f24903g = new C5623b(null);

    /* renamed from: h */
    public static final IntRange f24904h = new IntRange(4, 5);

    /* renamed from: i */
    public static final IntRange f24905i = new IntRange(4, 6);

    /* renamed from: a */
    public final InterfaceC46473om3 f24906a;

    /* renamed from: b */
    public final InterfaceC7381SM f24907b;

    /* renamed from: c */
    public final NQ5 f24908c;

    /* renamed from: d */
    public final ScopeProvider f24909d;

    /* renamed from: e */
    public final InterfaceC35862Se1 f24910e;

    /* renamed from: f */
    public final InterfaceC40099e13 f24911f;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ne1$a */
    /* loaded from: classes4.dex */
    public static final class C5622a extends Lambda implements Function1<String, Unit> {
        public C5622a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C34692Ne1.this.f24910e.mo79628L9(null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"LNe1$b;", "", "Lkotlin/ranges/IntRange;", "CODE_LENGTH_RANGE", "Lkotlin/ranges/IntRange;", "PLATE_LENGTH_RANGE", "", "SERIAL_LENGTH", "I", "<init>", "()V", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Ne1$b */
    /* loaded from: classes4.dex */
    public static final class C5623b {
        public /* synthetic */ C5623b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C5623b() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ne1$c */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C5624c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PartKind.values().length];
            try {
                iArr[PartKind.STICKER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PartKind.PLATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/wire/WireBirdPart;", "response", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lco/bird/android/model/wire/WireBirdPart;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ne1$d */
    /* loaded from: classes4.dex */
    public static final class C5625d extends Lambda implements Function1<HM4<WireBirdPart>, WireBirdPart> {

        /* renamed from: g */
        public static final C5625d f24913g = new C5625d();

        public C5625d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final WireBirdPart invoke(HM4<WireBirdPart> response) {
            Intrinsics.checkNotNullParameter(response, "response");
            WireBirdPart m103944a = response.m103944a();
            Intrinsics.checkNotNull(m103944a);
            return m103944a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ne1$e */
    /* loaded from: classes4.dex */
    public static final class C5626e extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ PartKind f24914g;

        /* renamed from: h */
        public final /* synthetic */ C34692Ne1 f24915h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5626e(PartKind partKind, C34692Ne1 c34692Ne1) {
            super(1);
            this.f24914g = partKind;
            this.f24915h = c34692Ne1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (this.f24914g == PartKind.STICKER) {
                this.f24915h.f24910e.mo79628L9(EnumC44632lg1.INVALID_STICKER);
            } else {
                this.f24915h.f24910e.mo79628L9(EnumC44632lg1.INVALID_SERIAL);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001ar\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0016\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003 \u0006*8\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0016\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/wire/WireBirdPart;", "wireBirdPart", "Lio/reactivex/K;", "Lkotlin/Pair;", "LHM4;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/WireBirdPart;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ne1$f */
    /* loaded from: classes4.dex */
    public static final class C5627f extends Lambda implements Function1<WireBirdPart, InterfaceC23447K<? extends Pair<? extends WireBirdPart, ? extends HM4<WireBird>>>> {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000 \u0005*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/wire/WireBird;", "response", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBirdPart;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Ne1$f$a */
        /* loaded from: classes4.dex */
        public static final class C5628a extends Lambda implements Function1<HM4<WireBird>, Pair<? extends WireBirdPart, ? extends HM4<WireBird>>> {

            /* renamed from: g */
            public final /* synthetic */ WireBirdPart f24917g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5628a(WireBirdPart wireBirdPart) {
                super(1);
                this.f24917g = wireBirdPart;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<WireBirdPart, HM4<WireBird>> invoke(HM4<WireBird> response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return TuplesKt.m28425to(this.f24917g, response);
            }
        }

        public C5627f() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<WireBirdPart, HM4<WireBird>>> invoke(WireBirdPart wireBirdPart) {
            Intrinsics.checkNotNullParameter(wireBirdPart, "wireBirdPart");
            AbstractC23442F<HM4<WireBird>> mo8116b = C34692Ne1.this.f24906a.mo8116b(wireBirdPart.getBirdId());
            final C5628a c5628a = new C5628a(wireBirdPart);
            return mo8116b.m33157I(new InterfaceC23492o() { // from class: Oe1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C34692Ne1.C5627f.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u000622\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBirdPart;", "LHM4;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ne1$g */
    /* loaded from: classes4.dex */
    public static final class C5629g extends Lambda implements Function1<Pair<? extends WireBirdPart, ? extends HM4<WireBird>>, Unit> {
        public C5629g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends WireBirdPart, ? extends HM4<WireBird>> pair) {
            invoke2((Pair<WireBirdPart, HM4<WireBird>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<WireBirdPart, HM4<WireBird>> pair) {
            HM4<WireBird> response = pair.component2();
            if (!response.m103939f() || response.m103944a() == null) {
                InterfaceC35862Se1 interfaceC35862Se1 = C34692Ne1.this.f24910e;
                Intrinsics.checkNotNullExpressionValue(response, "response");
                C49375tg1 m94017d = NM4.m94017d(response);
                interfaceC35862Se1.error(m94017d != null ? m94017d.m11932c() : null);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003 \u0006*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u0000 \u0006*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003 \u0006*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u0000\u0018\u00010\u00050\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBirdPart;", "LHM4;", "Lco/bird/android/model/wire/WireBird;", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ne1$h */
    /* loaded from: classes4.dex */
    public static final class C5630h extends Lambda implements Function1<Pair<? extends WireBirdPart, ? extends HM4<WireBird>>, InterfaceC24574u<? extends Pair<? extends WireBirdPart, ? extends WireBird>>> {

        /* renamed from: g */
        public static final C5630h f24919g = new C5630h();

        public C5630h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends Pair<WireBirdPart, WireBird>> invoke(Pair<WireBirdPart, HM4<WireBird>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            WireBirdPart component1 = pair.component1();
            HM4<WireBird> component2 = pair.component2();
            WireBird m103944a = component2.m103944a();
            if (component2.m103939f() && m103944a != null) {
                return AbstractC24507p.m32068G(TuplesKt.m28425to(component1, m103944a));
            }
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Sticker;", "sticker", "Lco/bird/android/model/wire/WirePart;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Sticker;)Lco/bird/android/model/wire/WirePart;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ne1$i */
    /* loaded from: classes4.dex */
    public static final class C5631i extends Lambda implements Function1<Sticker, WirePart> {

        /* renamed from: g */
        public final /* synthetic */ PartKind f24920g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5631i(PartKind partKind) {
            super(1);
            this.f24920g = partKind;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final WirePart invoke(Sticker sticker) {
            Intrinsics.checkNotNullParameter(sticker, "sticker");
            return new WirePart(sticker.getId(), this.f24920g, sticker.getCode());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ne1$j */
    /* loaded from: classes4.dex */
    public static final class C5632j extends Lambda implements Function1<Pair<? extends Unit, ? extends String>, Unit> {
        public C5632j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends String> pair) {
            invoke2((Pair<Unit, String>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, String> pair) {
            C34692Ne1.this.f24910e.hideKeyboard();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0005\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Pair;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ne1$k */
    /* loaded from: classes4.dex */
    public static final class C5633k extends Lambda implements Function1<Pair<? extends Unit, ? extends String>, String> {

        /* renamed from: g */
        public static final C5633k f24922g = new C5633k();

        public C5633k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Pair<Unit, String> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return pair.component2();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "input", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ne1$l */
    /* loaded from: classes4.dex */
    public static final class C5634l extends Lambda implements Function1<String, InterfaceC24574u<? extends String>> {
        public C5634l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends String> invoke(String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            IntRange intRange = C34692Ne1.f24904h;
            int first = intRange.getFirst();
            int last = intRange.getLast();
            int length = input.length();
            boolean z = false;
            if (first <= length && length <= last) {
                z = true;
            }
            if (!z && input.length() != 14) {
                C34692Ne1.this.f24910e.mo79628L9(EnumC44632lg1.INVALID_INPUT_BIRD);
                return AbstractC24507p.m32024u();
            }
            return AbstractC24507p.m32068G(input);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ne1$m */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C5635m extends FunctionReferenceImpl implements Function1<String, AbstractC24507p<Pair<? extends WireBirdPart, ? extends WireBird>>> {
        public C5635m(Object obj) {
            super(1, obj, C34692Ne1.class, "identifyBird", "identifyBird(Ljava/lang/String;)Lio/reactivex/Maybe;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC24507p<Pair<WireBirdPart, WireBird>> invoke(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((C34692Ne1) this.receiver).m93632x(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0005*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0005*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBirdPart;", "Lco/bird/android/model/wire/WireBird;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ne1$n */
    /* loaded from: classes4.dex */
    public static final class C5636n extends Lambda implements Function1<Pair<? extends WireBirdPart, ? extends WireBird>, InterfaceC23447K<? extends Pair<? extends WireBirdPart, ? extends WireBird>>> {

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"LHM4;", "", "it", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBirdPart;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Ne1$n$a */
        /* loaded from: classes4.dex */
        public static final class C5637a extends Lambda implements Function1<HM4<Boolean>, Pair<? extends WireBirdPart, ? extends WireBird>> {

            /* renamed from: g */
            public final /* synthetic */ WireBirdPart f24925g;

            /* renamed from: h */
            public final /* synthetic */ WireBird f24926h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5637a(WireBirdPart wireBirdPart, WireBird wireBird) {
                super(1);
                this.f24925g = wireBirdPart;
                this.f24926h = wireBird;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<WireBirdPart, WireBird> invoke(HM4<Boolean> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(this.f24925g, this.f24926h);
            }
        }

        public C5636n() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<WireBirdPart, WireBird>> invoke(Pair<WireBirdPart, WireBird> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            WireBird component2 = pair.component2();
            AbstractC23442F<HM4<Boolean>> mo8115b1 = C34692Ne1.this.f24906a.mo8115b1(component2.getId());
            final C5637a c5637a = new C5637a(pair.component1(), component2);
            return mo8115b1.m33157I(new InterfaceC23492o() { // from class: Pe1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C34692Ne1.C5636n.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0005*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0005*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBirdPart;", "Lco/bird/android/model/wire/WireBird;", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ne1$o */
    /* loaded from: classes4.dex */
    public static final class C5638o extends Lambda implements Function1<Pair<? extends WireBirdPart, ? extends WireBird>, InterfaceC24574u<? extends Pair<? extends WireBirdPart, ? extends WireBird>>> {

        /* renamed from: g */
        public final /* synthetic */ List<BirdModel> f24927g;

        /* renamed from: h */
        public final /* synthetic */ C34692Ne1 f24928h;

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0006*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lio/reactivex/u;", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBirdPart;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Ne1$o$a */
        /* loaded from: classes4.dex */
        public static final class C5639a extends Lambda implements Function1<DialogResponse, InterfaceC24574u<? extends Pair<? extends WireBirdPart, ? extends WireBird>>> {

            /* renamed from: g */
            public static final C5639a f24929g = new C5639a();

            public C5639a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC24574u<? extends Pair<WireBirdPart, WireBird>> invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return AbstractC24507p.m32024u();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5638o(List<? extends BirdModel> list, C34692Ne1 c34692Ne1) {
            super(1);
            this.f24927g = list;
            this.f24928h = c34692Ne1;
        }

        /* renamed from: c */
        public static final InterfaceC24574u m93615c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends Pair<WireBirdPart, WireBird>> invoke(Pair<WireBirdPart, WireBird> pair) {
            AbstractC5751Ny abstractC5751Ny;
            boolean contains;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            WireBirdPart component1 = pair.component1();
            WireBird component2 = pair.component2();
            List<BirdModel> list = this.f24927g;
            boolean z = false;
            if (list != null) {
                contains = CollectionsKt___CollectionsKt.contains(list, BirdModel.Companion.fromString(component2.getModel()));
                if (!contains) {
                    z = true;
                }
            }
            if (z) {
                List<BirdModel> list2 = this.f24927g;
                BirdModel.Companion companion = BirdModel.Companion;
                if (Intrinsics.areEqual(list2, companion.getBirdZeroList())) {
                    abstractC5751Ny = C42887ij5.f87791d;
                } else if (Intrinsics.areEqual(list2, companion.getV2BrainList())) {
                    abstractC5751Ny = C50614vl5.f114574d;
                } else if (Intrinsics.areEqual(list2, companion.getBirdOnePcmList())) {
                    abstractC5751Ny = C42294hj5.f85801d;
                } else {
                    abstractC5751Ny = C42887ij5.f87791d;
                }
                AbstractC23442F m33142Y = H31.C3014a.dialog$default(this.f24928h.f24910e, abstractC5751Ny, false, false, 6, null).m33142Y(C23454a.m33087a());
                final C5639a c5639a = C5639a.f24929g;
                return m33142Y.m33163C(new InterfaceC23492o() { // from class: Qe1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC24574u m93615c;
                        m93615c = C34692Ne1.C5638o.m93615c(Function1.this, obj);
                        return m93615c;
                    }
                });
            }
            return AbstractC24507p.m32068G(TuplesKt.m28425to(component1, component2));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ne1$p */
    /* loaded from: classes4.dex */
    public static final class C5640p extends Lambda implements Function1<Throwable, Unit> {
        public C5640p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
            C34692Ne1.this.f24910e.error(C45871nl4.error_generic_body);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBirdPart;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ne1$q */
    /* loaded from: classes4.dex */
    public static final class C5641q extends Lambda implements Function1<Pair<? extends WireBirdPart, ? extends WireBird>, Unit> {
        public C5641q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends WireBirdPart, ? extends WireBird> pair) {
            invoke2((Pair<WireBirdPart, WireBird>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<WireBirdPart, WireBird> pair) {
            Intent intent = new Intent();
            intent.putExtra("bird", pair.component2());
            intent.putExtra("part", pair.component1().toPart());
            C34692Ne1.this.f24911f.mo37029e4(-1, intent);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "input", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ne1$r */
    /* loaded from: classes4.dex */
    public static final class C5642r extends Lambda implements Function1<String, InterfaceC24574u<? extends String>> {

        /* renamed from: g */
        public final /* synthetic */ PartKind f24932g;

        /* renamed from: h */
        public final /* synthetic */ C34692Ne1 f24933h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5642r(PartKind partKind, C34692Ne1 c34692Ne1) {
            super(1);
            this.f24932g = partKind;
            this.f24933h = c34692Ne1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends String> invoke(String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            if (this.f24932g == PartKind.PLATE) {
                IntRange intRange = C34692Ne1.f24905i;
                int first = intRange.getFirst();
                int last = intRange.getLast();
                int length = input.length();
                boolean z = false;
                if (first <= length && length <= last) {
                    z = true;
                }
                if (!z) {
                    this.f24933h.f24910e.mo79628L9(EnumC44632lg1.INVALID_INPUT_PLATE);
                    return AbstractC24507p.m32024u();
                }
            }
            if (this.f24932g == PartKind.PCM && input.length() != 14) {
                this.f24933h.f24910e.mo79628L9(EnumC44632lg1.INVALID_INPUT_PCM);
                return AbstractC24507p.m32024u();
            }
            return AbstractC24507p.m32068G(input);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "input", "Lio/reactivex/K;", "Lco/bird/android/model/wire/WirePart;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ne1$s */
    /* loaded from: classes4.dex */
    public static final class C5643s extends Lambda implements Function1<String, InterfaceC23447K<? extends WirePart>> {

        /* renamed from: h */
        public final /* synthetic */ PartKind f24935h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5643s(PartKind partKind) {
            super(1);
            this.f24935h = partKind;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends WirePart> invoke(String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            return C34692Ne1.this.m93671D(this.f24935h, input);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ne1$t */
    /* loaded from: classes4.dex */
    public static final class C5644t extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ PartKind f24936g;

        /* renamed from: h */
        public final /* synthetic */ C34692Ne1 f24937h;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Ne1$t$a */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C5645a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PartKind.values().length];
                try {
                    iArr[PartKind.PLATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PartKind.IL_PLATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5644t(PartKind partKind, C34692Ne1 c34692Ne1) {
            super(1);
            this.f24936g = partKind;
            this.f24937h = c34692Ne1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
            int i = C5645a.$EnumSwitchMapping$0[this.f24936g.ordinal()];
            if (i != 1 && i != 2) {
                this.f24937h.f24910e.error(C45871nl4.error_generic_body);
            } else {
                this.f24937h.f24910e.mo79628L9(EnumC44632lg1.INVALID_PLATE);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WirePart;", "kotlin.jvm.PlatformType", "part", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WirePart;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ne1$u */
    /* loaded from: classes4.dex */
    public static final class C5646u extends Lambda implements Function1<WirePart, Unit> {
        public C5646u() {
            super(1);
        }

        /* renamed from: a */
        public final void m93612a(WirePart wirePart) {
            Intent intent = new Intent();
            intent.putExtra("part", wirePart);
            C34692Ne1.this.f24911f.mo37029e4(-1, intent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WirePart wirePart) {
            m93612a(wirePart);
            return Unit.INSTANCE;
        }
    }

    public C34692Ne1(InterfaceC46473om3 operatorManager, InterfaceC7381SM birdPartManager, NQ5 stickerManager, ScopeProvider scopeProvider, InterfaceC35862Se1 ui, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(birdPartManager, "birdPartManager");
        Intrinsics.checkNotNullParameter(stickerManager, "stickerManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f24906a = operatorManager;
        this.f24907b = birdPartManager;
        this.f24908c = stickerManager;
        this.f24909d = scopeProvider;
        this.f24910e = ui;
        this.f24911f = navigator;
        Observable<String> observeOn = ui.mo79621yl().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.inputChanges()\n      …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5622a c5622a = new C5622a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: He1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34692Ne1.m93634v(Function1.this, obj);
            }
        });
    }

    /* renamed from: A */
    public static final InterfaceC23447K m93674A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m93673B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final InterfaceC24574u m93672C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final WirePart m93670E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WirePart) tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final WirePart m93669F(PartKind kind, C34692Ne1 this$0, String key, Throwable e) {
        Intrinsics.checkNotNullParameter(kind, "$kind");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        Intrinsics.checkNotNullParameter(e, "e");
        if (kind != PartKind.STICKER) {
            int m93633w = this$0.m93633w(e);
            boolean z = false;
            if (400 <= m93633w && m93633w < 500) {
                z = true;
            }
            if (z) {
                return new WirePart(null, kind, key, 1, null);
            }
        }
        throw e;
    }

    /* renamed from: G */
    public static final void m93668G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final String m93667H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final InterfaceC24574u m93665J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final InterfaceC24574u m93664K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final InterfaceC23447K m93663L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final InterfaceC24574u m93662M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m93661N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m93660O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final InterfaceC23447K m93658Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final void m93657R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final void m93656S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final InterfaceC24574u m93655T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m93634v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final WireBirdPart m93631y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WireBirdPart) tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m93630z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public final AbstractC23442F<WirePart> m93671D(final PartKind partKind, final String str) {
        int i = C5624c.$EnumSwitchMapping$0[partKind.ordinal()];
        if (i != 1 && i != 2) {
            AbstractC23442F<WirePart> m33158H = AbstractC23442F.m33158H(new WirePart(null, partKind, str, 1, null));
            Intrinsics.checkNotNullExpressionValue(m33158H, "just(WirePart(kind = kind, key = key))");
            return m33158H;
        }
        AbstractC23442F m70883l = C38096ag5.m70883l(this.f24908c.mo92318a(str));
        final C5631i c5631i = new C5631i(partKind);
        AbstractC23442F<WirePart> m33149Q = m70883l.m33157I(new InterfaceC23492o() { // from class: Fe1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                WirePart m93670E;
                m93670E = C34692Ne1.m93670E(Function1.this, obj);
                return m93670E;
            }
        }).m33149Q(new InterfaceC23492o() { // from class: Ge1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                WirePart m93669F;
                m93669F = C34692Ne1.m93669F(PartKind.this, this, str, (Throwable) obj);
                return m93669F;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33149Q, "kind: PartKind, key: Str…row e\n          }\n      }");
        return m33149Q;
    }

    /* renamed from: I */
    public final void m93666I(Observable<String> observable, List<? extends BirdModel> list) {
        final C5634l c5634l = new C5634l();
        Observable<R> flatMapMaybe = observable.flatMapMaybe(new InterfaceC23492o() { // from class: ue1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m93665J;
                m93665J = C34692Ne1.m93665J(Function1.this, obj);
                return m93665J;
            }
        });
        final C5635m c5635m = new C5635m(this);
        Observable flatMapMaybe2 = flatMapMaybe.flatMapMaybe(new InterfaceC23492o() { // from class: ve1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m93664K;
                m93664K = C34692Ne1.m93664K(Function1.this, obj);
                return m93664K;
            }
        });
        final C5636n c5636n = new C5636n();
        Observable flatMapSingle = flatMapMaybe2.flatMapSingle(new InterfaceC23492o() { // from class: we1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m93663L;
                m93663L = C34692Ne1.m93663L(Function1.this, obj);
                return m93663L;
            }
        });
        final C5638o c5638o = new C5638o(list, this);
        Observable flatMapMaybe3 = flatMapSingle.flatMapMaybe(new InterfaceC23492o() { // from class: xe1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m93662M;
                m93662M = C34692Ne1.m93662M(Function1.this, obj);
                return m93662M;
            }
        });
        final C5640p c5640p = new C5640p();
        Observable observeOn = flatMapMaybe3.doOnError(new InterfaceC23484g() { // from class: ye1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34692Ne1.m93661N(Function1.this, obj);
            }
        }).retry().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "private fun scanForBird(…ULT_OK, data)\n      }\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f24909d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5641q c5641q = new C5641q();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: ze1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34692Ne1.m93660O(Function1.this, obj);
            }
        });
    }

    /* renamed from: P */
    public final void m93659P(Observable<String> observable, PartKind partKind) {
        final C5642r c5642r = new C5642r(partKind, this);
        Observable<R> flatMapMaybe = observable.flatMapMaybe(new InterfaceC23492o() { // from class: Ae1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m93655T;
                m93655T = C34692Ne1.m93655T(Function1.this, obj);
                return m93655T;
            }
        });
        final C5643s c5643s = new C5643s(partKind);
        Observable flatMapSingle = flatMapMaybe.flatMapSingle(new InterfaceC23492o() { // from class: Be1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m93658Q;
                m93658Q = C34692Ne1.m93658Q(Function1.this, obj);
                return m93658Q;
            }
        });
        final C5644t c5644t = new C5644t(partKind, this);
        Observable observeOn = flatMapSingle.doOnError(new InterfaceC23484g() { // from class: Ce1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34692Ne1.m93657R(Function1.this, obj);
            }
        }).retry().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "private fun scanForPart(…ULT_OK, data)\n      }\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f24909d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5646u c5646u = new C5646u();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: De1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34692Ne1.m93656S(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC48762se1
    /* renamed from: a */
    public void mo13916a(List<? extends BirdModel> list, PartKind partKind) {
        Observable m31950a = C24527f.m31950a(this.f24910e.mo79623Yg(), this.f24910e.mo79621yl());
        final C5632j c5632j = new C5632j();
        Observable doOnNext = m31950a.doOnNext(new InterfaceC23484g() { // from class: te1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34692Ne1.m93668G(Function1.this, obj);
            }
        });
        final C5633k c5633k = C5633k.f24922g;
        Observable<String> scanObservable = doOnNext.map(new InterfaceC23492o() { // from class: Ee1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m93667H;
                m93667H = C34692Ne1.m93667H(Function1.this, obj);
                return m93667H;
            }
        });
        if (partKind == null) {
            Intrinsics.checkNotNullExpressionValue(scanObservable, "scanObservable");
            m93666I(scanObservable, list);
        } else {
            Intrinsics.checkNotNullExpressionValue(scanObservable, "scanObservable");
            m93659P(scanObservable, partKind);
        }
        this.f24910e.mo79622d1(partKind);
    }

    /* renamed from: w */
    public final int m93633w(Throwable th) {
        if (th instanceof HttpException) {
            return ((HttpException) th).m53921a();
        }
        if (th instanceof retrofit2.HttpException) {
            return ((retrofit2.HttpException) th).m15616a();
        }
        if (th instanceof RetrofitException) {
            return ((RetrofitException) th).m53927c().m103943b();
        }
        return -1;
    }

    /* renamed from: x */
    public final AbstractC24507p<Pair<WireBirdPart, WireBird>> m93632x(String str) {
        boolean z;
        PartKind partKind;
        IntRange intRange = f24904h;
        int first = intRange.getFirst();
        int last = intRange.getLast();
        int length = str.length();
        if (first <= length && length <= last) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            partKind = PartKind.STICKER;
        } else {
            partKind = PartKind.CHASSIS;
        }
        AbstractC23442F m33152N = C28237sD.progress$default(this.f24907b.mo78565a(null, str, partKind), this.f24910e, 0, 2, (Object) null).m33152N(C23454a.m33087a());
        final C5625d c5625d = C5625d.f24913g;
        AbstractC23442F m33157I = m33152N.m33157I(new InterfaceC23492o() { // from class: Ie1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                WireBirdPart m93631y;
                m93631y = C34692Ne1.m93631y(Function1.this, obj);
                return m93631y;
            }
        });
        final C5626e c5626e = new C5626e(partKind, this);
        AbstractC23442F m33106t = m33157I.m33106t(new InterfaceC23484g() { // from class: Je1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34692Ne1.m93630z(Function1.this, obj);
            }
        });
        final C5627f c5627f = new C5627f();
        AbstractC23442F m33165A = m33106t.m33165A(new InterfaceC23492o() { // from class: Ke1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m93674A;
                m93674A = C34692Ne1.m93674A(Function1.this, obj);
                return m93674A;
            }
        });
        final C5629g c5629g = new C5629g();
        AbstractC23442F m33101w = m33165A.m33101w(new InterfaceC23484g() { // from class: Le1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34692Ne1.m93673B(Function1.this, obj);
            }
        });
        final C5630h c5630h = C5630h.f24919g;
        AbstractC24507p<Pair<WireBirdPart, WireBird>> m33163C = m33101w.m33163C(new InterfaceC23492o() { // from class: Me1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m93672C;
                m93672C = C34692Ne1.m93672C(Function1.this, obj);
                return m93672C;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33163C, "private fun identifyBird…y()\n        }\n      }\n  }");
        return m33163C;
    }
}
