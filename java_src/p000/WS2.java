package p000;

import android.os.Handler;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.constant.Permission;
import co.bird.android.model.wire.WireCoupon;
import co.bird.android.model.wire.WireMerchantDescription;
import co.bird.android.model.wire.WireMerchantSite;
import com.facebook.share.internal.C17296a;
import com.stripe.android.paymentsheet.p047ui.PrimaryButtonAnimator;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.MaybeSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
import p000.WS2;
@Metadata(m28433d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BW\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u000e\b\u0001\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$\u0012\b\b\u0001\u0010,\u001a\u00020)\u0012\b\b\u0001\u00100\u001a\u00020-\u0012\b\b\u0001\u00104\u001a\u000201¢\u0006\u0004\b5\u00106J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tH\u0002J6\u0010\u0013\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0002R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00067"}, m28432d2 = {"LWS2;", "LMS2;", "", C17296a.f69688o, "onResume", "onPause", "LbN4;", "rawResult", "handleResult", "", "delayMillis", "r", "", "success", "", "rawData", "merchantId", "siteId", "placardId", "u", "LEa;", "b", "LEa;", "analyticsManager", "LiO;", "c", "LiO;", "birdPayManager", "Landroid/os/Handler;", DateTokenConverter.CONVERTER_KEY, "Landroid/os/Handler;", "handler", "LV74;", "e", "LV74;", "promoManager", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "f", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "LDQ3;", "g", "LDQ3;", "permissionManager", "LcT2;", "h", "LcT2;", "ui", "Le13;", "i", "Le13;", "navigator", "<init>", "(LEa;LiO;Landroid/os/Handler;LV74;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LDQ3;LcT2;Le13;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMerchantScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MerchantScanPresenter.kt\nco/bird/android/app/feature/scanner/presenter/MerchantScanPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,168:1\n180#2:169\n218#2:170\n199#2:171\n*S KotlinDebug\n*F\n+ 1 MerchantScanPresenter.kt\nco/bird/android/app/feature/scanner/presenter/MerchantScanPresenterImpl\n*L\n65#1:169\n79#1:170\n108#1:171\n*E\n"})
/* renamed from: WS2 */
/* loaded from: classes2.dex */
public final class WS2 implements MS2 {

    /* renamed from: b */
    public final InterfaceC1880Ea f41054b;

    /* renamed from: c */
    public final InterfaceC23227iO f41055c;

    /* renamed from: d */
    public final Handler f41056d;

    /* renamed from: e */
    public final V74 f41057e;

    /* renamed from: f */
    public final LifecycleScopeProvider<EnumC7097RE> f41058f;

    /* renamed from: g */
    public final DQ3 f41059g;

    /* renamed from: h */
    public final InterfaceC39156cT2 f41060h;

    /* renamed from: i */
    public final InterfaceC40099e13 f41061i;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "LbT2;", "scanResponse", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "b", "(LHM4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: WS2$a */
    /* loaded from: classes2.dex */
    public static final class C9033a extends Lambda implements Function1<HM4<C38563bT2>, InterfaceC23447K<? extends HM4<C38563bT2>>> {

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireCoupon;", "it", "Lio/reactivex/K;", "LHM4;", "LbT2;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: WS2$a$a */
        /* loaded from: classes2.dex */
        public static final class C9034a extends Lambda implements Function1<List<? extends WireCoupon>, InterfaceC23447K<? extends HM4<C38563bT2>>> {

            /* renamed from: g */
            public final /* synthetic */ HM4<C38563bT2> f41063g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9034a(HM4<C38563bT2> hm4) {
                super(1);
                this.f41063g = hm4;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23447K<? extends HM4<C38563bT2>> invoke(List<WireCoupon> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return AbstractC23442F.m33158H(this.f41063g);
            }
        }

        public C9033a() {
            super(1);
        }

        public static final InterfaceC23447K invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends HM4<C38563bT2>> invoke(HM4<C38563bT2> scanResponse) {
            Intrinsics.checkNotNullParameter(scanResponse, "scanResponse");
            AbstractC23442F<List<WireCoupon>> mo27787i = WS2.this.f41057e.mo27787i();
            final C9034a c9034a = new C9034a(scanResponse);
            return mo27787i.m33165A(new InterfaceC23492o() { // from class: VS2
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K invoke$lambda$0;
                    invoke$lambda$0 = WS2.C9033a.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "LbT2;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: WS2$b */
    /* loaded from: classes2.dex */
    public static final class C9035b extends Lambda implements Function1<HM4<C38563bT2>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f41065h;

        /* renamed from: i */
        public final /* synthetic */ String f41066i;

        /* renamed from: j */
        public final /* synthetic */ Ref.BooleanRef f41067j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9035b(String str, String str2, Ref.BooleanRef booleanRef) {
            super(1);
            this.f41065h = str;
            this.f41066i = str2;
            this.f41067j = booleanRef;
        }

        /* renamed from: a */
        public final void m78383a(HM4<C38563bT2> response) {
            String str;
            String str2;
            WireMerchantSite m64517b;
            WireMerchantSite m64517b2;
            WireMerchantDescription merchant;
            C38563bT2 m103944a = response.m103944a();
            if (response.m103939f() && m103944a != null) {
                String id = m103944a.m64517b().getId();
                WS2 ws2 = WS2.this;
                String raw = this.f41065h;
                Intrinsics.checkNotNullExpressionValue(raw, "raw");
                ws2.m78387u(true, raw, m103944a.m64517b().getMerchant().getId(), id, this.f41066i);
                if (Intrinsics.areEqual(id, WS2.this.f41055c.mo27362e().getValue().m59038b().getId())) {
                    this.f41067j.element = true;
                    InterfaceC40099e13.C19924a.goToMerchantPay$default(WS2.this.f41061i, id, this.f41066i, false, 4, null);
                    WS2.this.f41061i.close();
                    return;
                }
                WS2.this.f41060h.error(C45871nl4.merchant_scan_incorrect);
                return;
            }
            WS2 ws22 = WS2.this;
            String raw2 = this.f41065h;
            Intrinsics.checkNotNullExpressionValue(raw2, "raw");
            String str3 = null;
            if (m103944a != null && (m64517b2 = m103944a.m64517b()) != null && (merchant = m64517b2.getMerchant()) != null) {
                str = merchant.getId();
            } else {
                str = null;
            }
            if (m103944a != null && (m64517b = m103944a.m64517b()) != null) {
                str2 = m64517b.getId();
            } else {
                str2 = null;
            }
            ws22.m78387u(true, raw2, str, str2, this.f41066i);
            InterfaceC39156cT2 interfaceC39156cT2 = WS2.this.f41060h;
            Intrinsics.checkNotNullExpressionValue(response, "response");
            C49375tg1 m94017d = NM4.m94017d(response);
            if (m94017d != null) {
                str3 = m94017d.m11932c();
            }
            interfaceC39156cT2.error(str3);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<C38563bT2> hm4) {
            m78383a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: WS2$c */
    /* loaded from: classes2.dex */
    public static final class C9036c extends Lambda implements Function1<Throwable, Unit> {
        public C9036c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable error) {
            InterfaceC39156cT2 interfaceC39156cT2 = WS2.this.f41060h;
            Intrinsics.checkNotNullExpressionValue(error, "error");
            interfaceC39156cT2.error(error);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: WS2$d */
    /* loaded from: classes2.dex */
    public static final class C9037d extends Lambda implements Function1<Unit, Unit> {
        public C9037d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            WS2.this.f41060h.mo44230i();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LFQ3;", "it", "Lio/reactivex/u;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LFQ3;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: WS2$e */
    /* loaded from: classes2.dex */
    public static final class C9038e extends Lambda implements Function1<FQ3, InterfaceC24574u<? extends DialogResponse>> {
        public C9038e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends DialogResponse> invoke(FQ3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (!it.m107154a()) {
                return WS2.this.f41060h.dialog(C38644bc0.f57750d, false, false).m33125j0();
            }
            WS2.m78389s(WS2.this, 0L, 1, null);
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: WS2$f */
    /* loaded from: classes2.dex */
    public static final class C9039f extends Lambda implements Function1<DialogResponse, Unit> {

        /* renamed from: g */
        public static final C9039f f41071g = new C9039f();

        public C9039f() {
            super(1);
        }

        /* renamed from: a */
        public final void m78381a(DialogResponse dialogResponse) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m78381a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: WS2$g */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C9040g extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C9040g f41072b = new C9040g();

        public C9040g() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    public WS2(InterfaceC1880Ea analyticsManager, InterfaceC23227iO birdPayManager, Handler handler, V74 promoManager, LifecycleScopeProvider<EnumC7097RE> scopeProvider, DQ3 permissionManager, InterfaceC39156cT2 ui, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(birdPayManager, "birdPayManager");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(promoManager, "promoManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f41054b = analyticsManager;
        this.f41055c = birdPayManager;
        this.f41056d = handler;
        this.f41057e = promoManager;
        this.f41058f = scopeProvider;
        this.f41059g = permissionManager;
        this.f41060h = ui;
        this.f41061i = navigator;
    }

    /* renamed from: j */
    public static final InterfaceC23447K m78397j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m78396k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m78395l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final void m78394m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final InterfaceC24574u m78393n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m78392o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m78391p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static /* synthetic */ void m78389s(WS2 ws2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        ws2.m78390r(j);
    }

    /* renamed from: t */
    public static final void m78388t(WS2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f41060h.mo44233Z1(this$0);
        this$0.f41060h.mo44229n1();
    }

    /* renamed from: a */
    public void m78406a() {
        this.f41054b.mo55905y(new C5985OO(null, null, null, this.f41055c.mo27362e().getValue().m59038b().getId(), 7, null));
        Observable<Unit> observeOn = this.f41060h.mo44231h0().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.flashClicks()\n      .…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f41058f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9037d c9037d = new C9037d();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: NS2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                WS2.m78394m(Function1.this, obj);
            }
        });
        AbstractC23442F<FQ3> m110485l = this.f41059g.m110485l(Permission.CAMERA_GENERIC);
        final C9038e c9038e = new C9038e();
        AbstractC24507p<R> m33163C = m110485l.m33163C(new InterfaceC23492o() { // from class: OS2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m78393n;
                m78393n = WS2.m78393n(Function1.this, obj);
                return m78393n;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33163C, "override fun onCreate() …cribe({ }, Timber::e)\n  }");
        Object m32048b = m33163C.m32048b(AutoDispose.m45239a(this.f41058f));
        Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9039f c9039f = C9039f.f41071g;
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: PS2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                WS2.m78392o(Function1.this, obj);
            }
        };
        final C9040g c9040g = C9040g.f41072b;
        ((MaybeSubscribeProxy) m32048b).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: QS2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                WS2.m78391p(Function1.this, obj);
            }
        });
    }

    @Override // me.dm7.barcodescanner.zxing.ZXingScannerView.ResultHandler
    public void handleResult(C38511bN4 rawResult) {
        String m99598d;
        Intrinsics.checkNotNullParameter(rawResult, "rawResult");
        String m64617f = rawResult.m64617f();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        if (m64617f != null && (m99598d = C33894Jt4.f18402a.m99598d(m64617f)) != null) {
            AbstractC23442F progress$default = C28237sD.progress$default(this.f41055c.mo27356k(m99598d), this.f41060h, 0, 2, (Object) null);
            final C9033a c9033a = new C9033a();
            AbstractC23442F m33152N = progress$default.m33165A(new InterfaceC23492o() { // from class: RS2
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K m78397j;
                    m78397j = WS2.m78397j(Function1.this, obj);
                    return m78397j;
                }
            }).m33152N(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(m33152N, "override fun handleResul…rtCamera(1500L)\n    }\n  }");
            Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f41058f));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C9035b c9035b = new C9035b(m64617f, m99598d, booleanRef);
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: SS2
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    WS2.m78396k(Function1.this, obj);
                }
            };
            final C9036c c9036c = new C9036c();
            ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: TS2
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    WS2.m78395l(Function1.this, obj);
                }
            });
        }
        if (!booleanRef.element) {
            m78390r(PrimaryButtonAnimator.HOLD_ANIMATION_ON_SLIDE_IN_COMPLETION);
        }
    }

    @Override // p000.MS2
    public void onPause() {
        this.f41060h.mo44232a1();
    }

    @Override // p000.MS2
    public void onResume() {
        m78389s(this, 0L, 1, null);
    }

    /* renamed from: r */
    public final void m78390r(long j) {
        this.f41056d.postDelayed(new Runnable() { // from class: US2
            @Override // java.lang.Runnable
            public final void run() {
                WS2.m78388t(WS2.this);
            }
        }, j);
    }

    /* renamed from: u */
    public final void m78387u(boolean z, String str, String str2, String str3, String str4) {
        this.f41054b.mo55905y(new C20834gN(null, null, null, z, str, str2, str3, str4, 7, null));
    }
}
