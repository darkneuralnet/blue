package p000;

import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.MapMode;
import co.bird.api.response.DownloadRideReceiptResponse;
import co.bird.api.response.ReceiptDetailResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.MaybeSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
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
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
import p000.X76;
@Metadata(m28433d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001BO\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\b\b\u0001\u0010(\u001a\u00020%\u0012\n\b\u0001\u0010*\u001a\u0004\u0018\u00010%¢\u0006\u0004\b7\u00108J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010*\u001a\u0004\u0018\u00010%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R$\u00106\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00069"}, m28432d2 = {"LX76;", "", "", "s", "t", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "r", "l", "v", "LZ76;", C17296a.f69688o, "LZ76;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "b", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "c", "Le13;", "navigator", "LTq4;", DateTokenConverter.CONVERTER_KEY, "LTq4;", "reactiveConfig", "LEa;", "e", "LEa;", "analyticsManager", "LVM3;", "f", "LVM3;", "paymentManager", "", "g", "Ljava/lang/String;", "receiptId", "h", "title", "LK76;", "i", "LK76;", "converter", "Lco/bird/api/response/ReceiptDetailResponse;", "j", "Lco/bird/api/response/ReceiptDetailResponse;", "k", "()Lco/bird/api/response/ReceiptDetailResponse;", "u", "(Lco/bird/api/response/ReceiptDetailResponse;)V", "receiptDetails", "<init>", "(LZ76;Lcom/uber/autodispose/ScopeProvider;Le13;LTq4;LEa;LVM3;Ljava/lang/String;Ljava/lang/String;)V", "co.bird.android.feature.self-serve-payment"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransactionReceiptPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionReceiptPresenter.kt\nco/bird/android/feature/selfservepayment/receipt/TransactionReceiptPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,121:1\n218#2:122\n180#2:123\n180#2:124\n*S KotlinDebug\n*F\n+ 1 TransactionReceiptPresenter.kt\nco/bird/android/feature/selfservepayment/receipt/TransactionReceiptPresenter\n*L\n76#1:122\n106#1:123\n110#1:124\n*E\n"})
/* renamed from: X76 */
/* loaded from: classes3.dex */
public final class X76 {

    /* renamed from: a */
    public final Z76 f42686a;

    /* renamed from: b */
    public final ScopeProvider f42687b;

    /* renamed from: c */
    public final InterfaceC40099e13 f42688c;

    /* renamed from: d */
    public final C36207Tq4 f42689d;

    /* renamed from: e */
    public final InterfaceC1880Ea f42690e;

    /* renamed from: f */
    public final VM3 f42691f;

    /* renamed from: g */
    public final String f42692g;

    /* renamed from: h */
    public final String f42693h;

    /* renamed from: i */
    public final K76 f42694i;

    /* renamed from: j */
    public ReceiptDetailResponse f42695j;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/ReceiptDetailResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/api/response/ReceiptDetailResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: X76$a */
    /* loaded from: classes3.dex */
    public static final class C9306a extends Lambda implements Function1<ReceiptDetailResponse, Unit> {
        public C9306a() {
            super(1);
        }

        /* renamed from: a */
        public final void m77335a(ReceiptDetailResponse receiptDetailResponse) {
            X76.this.m77341u(receiptDetailResponse);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ReceiptDetailResponse receiptDetailResponse) {
            m77335a(receiptDetailResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: X76$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C9307b extends FunctionReferenceImpl implements Function1<ReceiptDetailResponse, List<? extends C3023H6>> {
        public C9307b(Object obj) {
            super(1, obj, K76.class, "convert", "convert(Lco/bird/api/response/ReceiptDetailResponse;)Ljava/util/List;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<C3023H6> invoke(ReceiptDetailResponse p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((K76) this.receiver).m99191a(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: X76$c */
    /* loaded from: classes3.dex */
    public static final class C9308c extends Lambda implements Function1<Throwable, Unit> {
        public C9308c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            String str = X76.this.f42692g;
            C41318g46.m40161c(it, "Error encountered while attempting to get download receipt details for receiptId " + str, new Object[0]);
            Z76 z76 = X76.this.f42686a;
            Context context = X76.this.f42686a.getContext();
            Intrinsics.checkNotNullExpressionValue(it, "it");
            C37513Zf5.displayStyledError$default(z76, context, it, X76.this.f42688c, null, null, false, 56, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LH6;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: X76$d */
    /* loaded from: classes3.dex */
    public static final class C9309d extends Lambda implements Function1<List<? extends C3023H6>, Unit> {
        public C9309d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> list) {
            if (X76.this.f42693h == null) {
                ReceiptDetailResponse m77351k = X76.this.m77351k();
                if ((m77351k != null ? m77351k.getTitle() : null) != null) {
                    Z76 z76 = X76.this.f42686a;
                    ReceiptDetailResponse m77351k2 = X76.this.m77351k();
                    z76.m73713t(m77351k2 != null ? m77351k2.getTitle() : null);
                }
            }
            Z76 z762 = X76.this.f42686a;
            ReceiptDetailResponse m77351k3 = X76.this.m77351k();
            z762.m73716Ql(m77351k3 != null ? Intrinsics.areEqual(m77351k3.getShowDownloadInvoiceButton(), Boolean.TRUE) : false);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: X76$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C9310e extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C9310e(Object obj) {
            super(1, obj, Z76.class, "updateReceiptDetails", "updateReceiptDetails(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((Z76) this.receiver).m73715Rl(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/api/response/DownloadRideReceiptResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: X76$f */
    /* loaded from: classes3.dex */
    public static final class C9311f extends Lambda implements Function1<Unit, InterfaceC23447K<? extends DownloadRideReceiptResponse>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/DownloadRideReceiptResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/api/response/DownloadRideReceiptResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nTransactionReceiptPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionReceiptPresenter.kt\nco/bird/android/feature/selfservepayment/receipt/TransactionReceiptPresenter$setupClickListeners$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,121:1\n1#2:122\n*E\n"})
        /* renamed from: X76$f$a */
        /* loaded from: classes3.dex */
        public static final class C9312a extends Lambda implements Function1<DownloadRideReceiptResponse, Unit> {

            /* renamed from: g */
            public final /* synthetic */ X76 f42700g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9312a(X76 x76) {
                super(1);
                this.f42700g = x76;
            }

            /* renamed from: a */
            public final void m77332a(DownloadRideReceiptResponse downloadRideReceiptResponse) {
                Unit unit;
                C41318g46.m40163a("receipt invoice response: " + downloadRideReceiptResponse, new Object[0]);
                String url = downloadRideReceiptResponse.getUrl();
                if (url != null) {
                    this.f42700g.f42688c.mo36983m2(url);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    String str = this.f42700g.f42692g;
                    C41318g46.m40163a("could not get url from download receipt endpoint for receiptId " + str, new Object[0]);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DownloadRideReceiptResponse downloadRideReceiptResponse) {
                m77332a(downloadRideReceiptResponse);
                return Unit.INSTANCE;
            }
        }

        public C9311f() {
            super(1);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends DownloadRideReceiptResponse> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23442F<DownloadRideReceiptResponse> mo25753a = X76.this.f42691f.mo25753a(X76.this.f42692g);
            final C9312a c9312a = new C9312a(X76.this);
            AbstractC23442F<DownloadRideReceiptResponse> m33152N = mo25753a.m33101w(new InterfaceC23484g() { // from class: Y76
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    X76.C9311f.invoke$lambda$0(Function1.this, obj);
                }
            }).m33152N(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(m33152N, "private fun setupClickLi…tton click\")\n      })\n  }");
            return C28237sD.progress$default(m33152N, X76.this.f42686a, 0, 2, (Object) null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: X76$g */
    /* loaded from: classes3.dex */
    public static final class C9313g extends Lambda implements Function1<Throwable, Unit> {
        public C9313g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            String str = X76.this.f42692g;
            C41318g46.m40161c(it, "Error encountered while attempting to get download receipt url for receiptId " + str, new Object[0]);
            Z76 z76 = X76.this.f42686a;
            Context context = X76.this.f42686a.getContext();
            Intrinsics.checkNotNullExpressionValue(it, "it");
            C37513Zf5.displayStyledError$default(z76, context, it, X76.this.f42688c, null, null, false, 56, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/api/response/DownloadRideReceiptResponse;", "it", "", C17296a.f69688o, "(Lco/bird/api/response/DownloadRideReceiptResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: X76$h */
    /* loaded from: classes3.dex */
    public static final class C9314h extends Lambda implements Function1<DownloadRideReceiptResponse, Unit> {

        /* renamed from: g */
        public static final C9314h f42702g = new C9314h();

        public C9314h() {
            super(1);
        }

        /* renamed from: a */
        public final void m77331a(DownloadRideReceiptResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DownloadRideReceiptResponse downloadRideReceiptResponse) {
            m77331a(downloadRideReceiptResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: X76$i */
    /* loaded from: classes3.dex */
    public static final class C9315i extends Lambda implements Function1<Unit, Unit> {
        public C9315i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.goToHelp$default(X76.this.f42688c, MapMode.RIDER, null, true, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: X76$j */
    /* loaded from: classes3.dex */
    public static final class C9316j extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C9316j f42704g = new C9316j();

        public C9316j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error handling help button click", new Object[0]);
        }
    }

    public X76(Z76 ui, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager, VM3 paymentManager, String receiptId, String str) {
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(paymentManager, "paymentManager");
        Intrinsics.checkNotNullParameter(receiptId, "receiptId");
        this.f42686a = ui;
        this.f42687b = scopeProvider;
        this.f42688c = navigator;
        this.f42689d = reactiveConfig;
        this.f42690e = analyticsManager;
        this.f42691f = paymentManager;
        this.f42692g = receiptId;
        this.f42693h = str;
        this.f42694i = new K76();
    }

    /* renamed from: A */
    public static final void m77362A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final void m77349m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final List m77348n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m77347o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m77346p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m77345q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final InterfaceC23447K m77339w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m77338x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final Unit m77337y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Unit) tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m77336z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public final ReceiptDetailResponse m77351k() {
        return this.f42695j;
    }

    /* renamed from: l */
    public final void m77350l() {
        this.f42686a.m73713t(this.f42693h);
        ReceiptDetailResponse receiptDetailResponse = this.f42695j;
        if (receiptDetailResponse == null) {
            AbstractC23442F<ReceiptDetailResponse> mo25711w = this.f42691f.mo25711w(this.f42692g);
            final C9306a c9306a = new C9306a();
            AbstractC23442F<ReceiptDetailResponse> m33101w = mo25711w.m33101w(new InterfaceC23484g() { // from class: S76
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    X76.m77349m(Function1.this, obj);
                }
            });
            final C9307b c9307b = new C9307b(this.f42694i);
            AbstractC24507p m32066I = m33101w.m33157I(new InterfaceC23492o() { // from class: T76
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    List m77348n;
                    m77348n = X76.m77348n(Function1.this, obj);
                    return m77348n;
                }
            }).m33125j0().m32066I(C23454a.m33087a());
            final C9308c c9308c = new C9308c();
            AbstractC24507p m32029p = m32066I.m32029p(new InterfaceC23484g() { // from class: U76
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    X76.m77347o(Function1.this, obj);
                }
            });
            final C9309d c9309d = new C9309d();
            AbstractC24507p m32065J = m32029p.m32026s(new InterfaceC23484g() { // from class: V76
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    X76.m77346p(Function1.this, obj);
                }
            }).m32065J();
            Intrinsics.checkNotNullExpressionValue(m32065J, "private fun initializeUi…eiptDetails!!))\n    }\n  }");
            Object m32048b = m32065J.m32048b(AutoDispose.m45239a(this.f42687b));
            Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C9310e c9310e = new C9310e(this.f42686a);
            ((MaybeSubscribeProxy) m32048b).subscribe(new InterfaceC23484g() { // from class: W76
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    X76.m77345q(Function1.this, obj);
                }
            });
            return;
        }
        Z76 z76 = this.f42686a;
        K76 k76 = this.f42694i;
        Intrinsics.checkNotNull(receiptDetailResponse);
        z76.m73715Rl(k76.m99191a(receiptDetailResponse));
    }

    /* renamed from: r */
    public final void m77344r(int i, int i2, Intent intent) {
    }

    /* renamed from: s */
    public final void m77343s() {
    }

    /* renamed from: t */
    public final void m77342t() {
        m77350l();
        m77340v();
    }

    /* renamed from: u */
    public final void m77341u(ReceiptDetailResponse receiptDetailResponse) {
        this.f42695j = receiptDetailResponse;
    }

    /* renamed from: v */
    public final void m77340v() {
        Observable<Unit> m73717Pl = this.f42686a.m73717Pl();
        final C9311f c9311f = new C9311f();
        Observable observeOn = m73717Pl.flatMapSingle(new InterfaceC23492o() { // from class: N76
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m77339w;
                m77339w = X76.m77339w(Function1.this, obj);
                return m77339w;
            }
        }).observeOn(C23454a.m33087a());
        final C9313g c9313g = new C9313g();
        Observable doOnError = observeOn.doOnError(new InterfaceC23484g() { // from class: O76
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                X76.m77338x(Function1.this, obj);
            }
        });
        final C9314h c9314h = C9314h.f42702g;
        Observable onErrorReturnItem = doOnError.map(new InterfaceC23492o() { // from class: P76
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Unit m77337y;
                m77337y = X76.m77337y(Function1.this, obj);
                return m77337y;
            }
        }).onErrorReturnItem(Unit.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(onErrorReturnItem, "private fun setupClickLi…tton click\")\n      })\n  }");
        Object m33094as = onErrorReturnItem.m33094as(AutoDispose.m45239a(this.f42687b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe();
        Object m33094as2 = this.f42686a.m73714r0().m33094as(AutoDispose.m45239a(this.f42687b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9315i c9315i = new C9315i();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Q76
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                X76.m77336z(Function1.this, obj);
            }
        };
        final C9316j c9316j = C9316j.f42704g;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: R76
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                X76.m77362A(Function1.this, obj);
            }
        });
    }
}
