package p000;

import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.CashpayResponse;
import com.amazonaws.services.p026s3.internal.Constants;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C33071Gg0;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0016B\u0019\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m28432d2 = {"LGg0;", "LxE;", "LDg0;", "Lco/bird/android/model/CashpayResponse;", "body", "", "Ii", "za", "Lio/reactivex/k;", "M2", "", "barcodeText", "Rl", "Lh3;", "b", "Lh3;", "binding", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lh3;)V", "c", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCashpayUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CashpayUi.kt\nco/bird/android/app/feature/payment/CashpayUiImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,104:1\n180#2:105\n*S KotlinDebug\n*F\n+ 1 CashpayUi.kt\nco/bird/android/app/feature/payment/CashpayUiImpl\n*L\n92#1:105\n*E\n"})
/* renamed from: Gg0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C33071Gg0 extends AbstractC30071xE implements InterfaceC32369Dg0 {

    /* renamed from: c */
    public static final C2904a f12226c = new C2904a(null);

    /* renamed from: d */
    public static final int f12227d = 8;

    /* renamed from: b */
    public final C22545h3 f12228b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LGg0$a;", "", "", "cashpayVendorBadgeUrl", "Ljava/lang/String;", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Gg0$a */
    /* loaded from: classes2.dex */
    public static final class C2904a {
        public /* synthetic */ C2904a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2904a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Gg0$b */
    /* loaded from: classes2.dex */
    public static final class C2905b extends Lambda implements Function1<Unit, InterfaceC23447K<? extends Bitmap>> {

        /* renamed from: g */
        public final /* synthetic */ String f12229g;

        /* renamed from: h */
        public final /* synthetic */ C33071Gg0 f12230h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2905b(String str, C33071Gg0 c33071Gg0) {
            super(1);
            this.f12229g = str;
            this.f12230h = c33071Gg0;
        }

        /* renamed from: b */
        public static final Bitmap m104918b(String barcodeText, C33071Gg0 this$0) {
            Map<EnumC40431eb1, ?> mapOf;
            int i;
            Intrinsics.checkNotNullParameter(barcodeText, "$barcodeText");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            C34286Ll0 c34286Ll0 = new C34286Ll0();
            EnumC7009Qx enumC7009Qx = EnumC7009Qx.CODE_128;
            int width = this$0.f12228b.f84650b.getWidth();
            int height = this$0.f12228b.f84650b.getHeight();
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(EnumC40431eb1.CHARACTER_SET, Constants.DEFAULT_ENCODING));
            C1837ET mo3433a = c34286Ll0.mo3433a(barcodeText, enumC7009Qx, width, height, mapOf);
            Bitmap createBitmap = Bitmap.createBitmap(mo3433a.m108953o(), mo3433a.m108956l(), Bitmap.Config.RGB_565);
            int m108953o = mo3433a.m108953o();
            for (int i2 = 0; i2 < m108953o; i2++) {
                int m108956l = mo3433a.m108956l();
                for (int i3 = 0; i3 < m108956l; i3++) {
                    if (mo3433a.m108959h(i2, i3)) {
                        i = -16777216;
                    } else {
                        i = -1;
                    }
                    createBitmap.setPixel(i2, i3, i);
                }
            }
            return createBitmap;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Bitmap> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            final String str = this.f12229g;
            final C33071Gg0 c33071Gg0 = this.f12230h;
            return AbstractC23442F.m33161E(new Callable() { // from class: Hg0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bitmap m104918b;
                    m104918b = C33071Gg0.C2905b.m104918b(str, c33071Gg0);
                    return m104918b;
                }
            }).m33142Y(C24542a.m31934a());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Gg0$c */
    /* loaded from: classes2.dex */
    public static final class C2906c extends Lambda implements Function1<Bitmap, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f12232h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2906c(String str) {
            super(1);
            this.f12232h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
            invoke2(bitmap);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Bitmap bitmap) {
            C33071Gg0.this.f12228b.f84650b.setImageBitmap(bitmap);
            C33071Gg0.this.f12228b.f84651c.setText(this.f12232h);
            C33071Gg0.this.f12228b.f84655g.setVisibility(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33071Gg0(BaseActivity activity, C22545h3 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f12228b = binding;
        ComponentCallbacks2C17096a.m53136v(activity).m81656h(Uri.parse("https://static.bird.co/cashpay_vendor_badge_horizontal.png")).m16096R0(binding.f84655g);
    }

    /* renamed from: Sl */
    public static final InterfaceC23447K m104922Sl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: Tl */
    public static final void m104921Tl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC32369Dg0
    /* renamed from: Ii */
    public void mo104927Ii(CashpayResponse body) {
        Intrinsics.checkNotNullParameter(body, "body");
        TextView textView = this.f12228b.f84652d;
        int i = C45871nl4.cashpay_add_body_1;
        C51916xx1 c51916xx1 = C51916xx1.f118396a;
        textView.setText(getString(i, C51916xx1.currency$default(c51916xx1, body.getMinAmount(), C45097mS5.m25591o(body.getCurrency()), null, 4, null), C51916xx1.currency$default(c51916xx1, body.getMaxAmount(), C45097mS5.m25591o(body.getCurrency()), null, 4, null)));
        this.f12228b.f84652d.setVisibility(0);
        this.f12228b.f84658j.setVisibility(0);
        this.f12228b.f84660l.setVisibility(8);
        m104923Rl(body.getBarcode());
    }

    @Override // p000.InterfaceC32369Dg0
    /* renamed from: M2 */
    public AbstractC24490k<Unit> mo104926M2() {
        Button button = this.f12228b.f84656h;
        Intrinsics.checkNotNullExpressionValue(button, "binding.findRetailers");
        AbstractC24490k<Unit> flowable = C44626lf5.clicksThrottle$default(button, 0L, 1, null).toFlowable(EnumC23460b.DROP);
        Intrinsics.checkNotNullExpressionValue(flowable, "binding.findRetailers.cl…ackpressureStrategy.DROP)");
        return flowable;
    }

    /* renamed from: Rl */
    public final void m104923Rl(String str) {
        ImageView imageView = this.f12228b.f84650b;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.barcode");
        Observable<Unit> take = C45219mf5.m25212c(imageView).subscribeOn(C23454a.m33087a()).take(1L);
        final C2905b c2905b = new C2905b(str, this);
        Observable observeOn = take.switchMapSingle(new InterfaceC23492o() { // from class: Eg0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m104922Sl;
                m104922Sl = C33071Gg0.m104922Sl(Function1.this, obj);
                return m104922Sl;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "private fun loadBarcode(… View.VISIBLE\n      }\n  }");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2906c c2906c = new C2906c(str);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Fg0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33071Gg0.m104921Tl(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC32369Dg0
    /* renamed from: za */
    public void mo104920za() {
        this.f12228b.f84658j.setVisibility(8);
        this.f12228b.f84654f.setVisibility(8);
        this.f12228b.f84660l.setText(getString(C45871nl4.error_generic_body, new Object[0]));
        this.f12228b.f84660l.setVisibility(0);
    }
}
