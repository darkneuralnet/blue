package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BarcodeScanType;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.Warehouse;
import co.bird.android.model.constant.Permission;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
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
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.subjects.C24552a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.ResponseBody;
import p000.C26758ny;
import p000.H31;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u000e\b\u0001\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\b\b\u0001\u0010 \u001a\u00020\u001d\u0012\b\b\u0001\u0010$\u001a\u00020!\u0012\b\b\u0001\u0010(\u001a\u00020%\u0012\b\b\u0001\u0010+\u001a\u00020\u000f¢\u0006\u0004\b6\u00107J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\"\u00105\u001a\u0010\u0012\f\u0012\n 2*\u0004\u0018\u00010101008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00068"}, m28432d2 = {"Lny;", "LYx;", "Landroid/content/Intent;", "intent", "", "w", "onResume", "onPause", "LbN4;", "rawResult", "handleResult", "onBackPressed", "q", "r", "F", "", "enabled", "a5", "LGt5;", "b", "LGt5;", "o", "()LGt5;", "serviceCenterManager", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "c", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "Luy;", DateTokenConverter.CONVERTER_KEY, "Luy;", "ui", "Le13;", "e", "Le13;", "navigator", "LDQ3;", "f", "LDQ3;", "permissionManager", "g", "Z", "enablePeripheralKeyboardSupport", "Lco/bird/android/model/BarcodeScanType;", "h", "Lco/bird/android/model/BarcodeScanType;", "barcodeScanType", "Lio/reactivex/subjects/a;", "", "kotlin.jvm.PlatformType", "i", "Lio/reactivex/subjects/a;", "manualCodeEntrySubject", "<init>", "(LGt5;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Luy;Le13;LDQ3;Z)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBarcodeScannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BarcodeScannerPresenter.kt\nco/bird/android/feature/servicecenter/BarcodeScannerPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,201:1\n218#2:202\n180#2:203\n199#2:204\n218#2:205\n180#2:206\n*S KotlinDebug\n*F\n+ 1 BarcodeScannerPresenter.kt\nco/bird/android/feature/servicecenter/BarcodeScannerPresenterImpl\n*L\n76#1:202\n83#1:203\n106#1:204\n140#1:205\n177#1:206\n*E\n"})
/* renamed from: ny */
/* loaded from: classes3.dex */
public final class C26758ny implements InterfaceC10084Yx {

    /* renamed from: b */
    public final InterfaceC33193Gt5 f101138b;

    /* renamed from: c */
    public final LifecycleScopeProvider<EnumC7097RE> f101139c;

    /* renamed from: d */
    public final InterfaceC29346uy f101140d;

    /* renamed from: e */
    public final InterfaceC40099e13 f101141e;

    /* renamed from: f */
    public final DQ3 f101142f;

    /* renamed from: g */
    public final boolean f101143g;

    /* renamed from: h */
    public BarcodeScanType f101144h;

    /* renamed from: i */
    public final C24552a<String> f101145i;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ny$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26759a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BarcodeScanType.values().length];
            try {
                iArr[BarcodeScanType.WAREHOUSE_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BarcodeScanType.RAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/Warehouse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ny$b */
    /* loaded from: classes3.dex */
    public static final class C26760b extends Lambda implements Function1<HM4<Warehouse>, Unit> {
        public C26760b() {
            super(1);
        }

        /* renamed from: a */
        public final void m22063a(HM4<Warehouse> hm4) {
            String str;
            if (hm4.m103939f() && hm4.m103944a() != null) {
                Intent intent = new Intent();
                intent.putExtra("warehouse", hm4.m103944a());
                C26758ny.this.f101141e.mo37190C1(-1, intent);
                return;
            }
            InterfaceC29346uy interfaceC29346uy = C26758ny.this.f101140d;
            ResponseBody m103940e = hm4.m103940e();
            if (m103940e != null) {
                str = m103940e.string();
            } else {
                str = null;
            }
            interfaceC29346uy.error(str);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<Warehouse> hm4) {
            m22063a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", PaymentMethodOptionsParams.Blik.PARAM_CODE, "Lio/reactivex/K;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ny$c */
    /* loaded from: classes3.dex */
    public static final class C26761c extends Lambda implements Function1<String, InterfaceC23447K<? extends Intent>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/Warehouse;", "response", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Landroid/content/Intent;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nBarcodeScannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BarcodeScannerPresenter.kt\nco/bird/android/feature/servicecenter/BarcodeScannerPresenterImpl$maybeEnablePeripheralScannerMode$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n1#2:202\n*E\n"})
        /* renamed from: ny$c$a */
        /* loaded from: classes3.dex */
        public static final class C26762a extends Lambda implements Function1<HM4<Warehouse>, Intent> {

            /* renamed from: g */
            public static final C26762a f101148g = new C26762a();

            public C26762a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Intent invoke(HM4<Warehouse> response) {
                Intrinsics.checkNotNullParameter(response, "response");
                Intent intent = new Intent();
                if (response.m103939f() && response.m103944a() != null) {
                    intent.putExtra("warehouse", response.m103944a());
                }
                return intent;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00040\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "", "kotlin.jvm.PlatformType", "it", "Landroid/content/Intent;", C17296a.f69688o, "(LHM4;)Landroid/content/Intent;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: ny$c$b */
        /* loaded from: classes3.dex */
        public static final class C26763b extends Lambda implements Function1<HM4<Unit>, Intent> {

            /* renamed from: g */
            public final /* synthetic */ String f101149g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26763b(String str) {
                super(1);
                this.f101149g = str;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Intent invoke(HM4<Unit> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Intent intent = new Intent();
                intent.putExtra(PaymentMethodOptionsParams.Blik.PARAM_CODE, this.f101149g);
                return intent;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00040\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "", "kotlin.jvm.PlatformType", "it", "Landroid/content/Intent;", C17296a.f69688o, "(LHM4;)Landroid/content/Intent;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: ny$c$c */
        /* loaded from: classes3.dex */
        public static final class C26764c extends Lambda implements Function1<HM4<Unit>, Intent> {

            /* renamed from: g */
            public static final C26764c f101150g = new C26764c();

            public C26764c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Intent invoke(HM4<Unit> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new Intent();
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: ny$c$d */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C26765d {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BarcodeScanType.values().length];
                try {
                    iArr[BarcodeScanType.WAREHOUSE_ID.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BarcodeScanType.RAW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C26761c() {
            super(1);
        }

        /* renamed from: d */
        public static final Intent m22059d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Intent) tmp0.invoke(obj);
        }

        /* renamed from: e */
        public static final Intent m22058e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Intent) tmp0.invoke(obj);
        }

        /* renamed from: f */
        public static final Intent m22057f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Intent) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Intent> invoke(String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            BarcodeScanType barcodeScanType = C26758ny.this.f101144h;
            if (barcodeScanType == null) {
                Intrinsics.throwUninitializedPropertyAccessException("barcodeScanType");
                barcodeScanType = null;
            }
            int i = C26765d.$EnumSwitchMapping$0[barcodeScanType.ordinal()];
            if (i == 1) {
                AbstractC23442F<HM4<Warehouse>> mo94633a = C26758ny.this.m22075o().mo94633a(code);
                final C26762a c26762a = C26762a.f101148g;
                return mo94633a.m33157I(new InterfaceC23492o() { // from class: oy
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Intent m22059d;
                        m22059d = C26758ny.C26761c.m22059d(Function1.this, obj);
                        return m22059d;
                    }
                });
            } else if (i != 2) {
                AbstractC23442F m33158H = AbstractC23442F.m33158H(HM4.m103935j(Unit.INSTANCE));
                final C26764c c26764c = C26764c.f101150g;
                return m33158H.m33157I(new InterfaceC23492o() { // from class: qy
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Intent m22057f;
                        m22057f = C26758ny.C26761c.m22057f(Function1.this, obj);
                        return m22057f;
                    }
                });
            } else {
                AbstractC23442F m33158H2 = AbstractC23442F.m33158H(HM4.m103935j(Unit.INSTANCE));
                final C26763b c26763b = new C26763b(code);
                return m33158H2.m33157I(new InterfaceC23492o() { // from class: py
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Intent m22058e;
                        m22058e = C26758ny.C26761c.m22058e(Function1.this, obj);
                        return m22058e;
                    }
                });
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ny$d */
    /* loaded from: classes3.dex */
    public static final class C26766d extends Lambda implements Function1<Throwable, Unit> {
        public C26766d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C26758ny.this.f101140d.error(th.getMessage());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "intent", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nBarcodeScannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BarcodeScannerPresenter.kt\nco/bird/android/feature/servicecenter/BarcodeScannerPresenterImpl$maybeEnablePeripheralScannerMode$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n1#2:202\n*E\n"})
    /* renamed from: ny$e */
    /* loaded from: classes3.dex */
    public static final class C26767e extends Lambda implements Function1<Intent, Unit> {
        public C26767e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Intent intent) {
            invoke2(intent);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Intent intent) {
            Bundle extras = intent.getExtras();
            boolean z = false;
            if (extras != null && extras.size() > 0) {
                z = true;
            }
            if (z) {
                C26758ny.this.f101141e.mo37190C1(-1, intent);
            } else {
                C26758ny.this.f101140d.error(C45871nl4.error_generic_body);
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ny$f */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26768f extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C26768f f101153b = new C26768f();

        public C26768f() {
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

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LFQ3;", "it", "Lio/reactivex/u;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LFQ3;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ny$g */
    /* loaded from: classes3.dex */
    public static final class C26769g extends Lambda implements Function1<FQ3, InterfaceC24574u<? extends DialogResponse>> {
        public C26769g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends DialogResponse> invoke(FQ3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (!it.m107154a()) {
                return C26758ny.this.f101140d.dialog(C38644bc0.f57750d, false, false).m33125j0();
            }
            C26758ny.this.m22089a5(true);
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ny$h */
    /* loaded from: classes3.dex */
    public static final class C26770h extends Lambda implements Function1<DialogResponse, Unit> {

        /* renamed from: g */
        public static final C26770h f101155g = new C26770h();

        public C26770h() {
            super(1);
        }

        /* renamed from: a */
        public final void m22052a(DialogResponse dialogResponse) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m22052a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ny$i */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26771i extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C26771i f101156b = new C26771i();

        public C26771i() {
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

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ny$j */
    /* loaded from: classes3.dex */
    public static final class C26772j extends Lambda implements Function1<Unit, Unit> {
        public C26772j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C26758ny.this.f101140d.mo7695i();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LH31$b;", "dialogResponse", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LH31$b;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ny$k */
    /* loaded from: classes3.dex */
    public static final class C26773k extends Lambda implements Function1<H31.AbstractC3016b, String> {

        /* renamed from: g */
        public static final C26773k f101158g = new C26773k();

        public C26773k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(H31.AbstractC3016b dialogResponse) {
            Intrinsics.checkNotNullParameter(dialogResponse, "dialogResponse");
            if (dialogResponse instanceof H31.AbstractC3016b.C3019c) {
                return ((H31.AbstractC3016b.C3019c) dialogResponse).m104470b();
            }
            return "";
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ny$l */
    /* loaded from: classes3.dex */
    public static final class C26774l extends Lambda implements Function1<String, Boolean> {

        /* renamed from: g */
        public static final C26774l f101159g = new C26774l();

        public C26774l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(String it) {
            boolean isBlank;
            Intrinsics.checkNotNullParameter(it, "it");
            isBlank = StringsKt__StringsJVMKt.isBlank(it);
            return Boolean.valueOf(!isBlank);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ny$m */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26775m extends FunctionReferenceImpl implements Function1<String, Unit> {
        public C26775m(Object obj) {
            super(1, obj, C24552a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24552a) this.receiver).onNext(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ny$n */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26776n extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C26776n f101160b = new C26776n();

        public C26776n() {
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

    public C26758ny(InterfaceC33193Gt5 serviceCenterManager, LifecycleScopeProvider<EnumC7097RE> scopeProvider, InterfaceC29346uy ui, InterfaceC40099e13 navigator, DQ3 permissionManager, boolean z) {
        Intrinsics.checkNotNullParameter(serviceCenterManager, "serviceCenterManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        this.f101138b = serviceCenterManager;
        this.f101139c = scopeProvider;
        this.f101140d = ui;
        this.f101141e = navigator;
        this.f101142f = permissionManager;
        this.f101143g = z;
        C24552a<String> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<String>()");
        this.f101145i = m31922e;
    }

    /* renamed from: A */
    public static final void m22095A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final String m22094B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final boolean m22093C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: D */
    public static final void m22092D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m22091E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m22074p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final InterfaceC23447K m22071s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m22070t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m22069u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m22068v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final InterfaceC24574u m22066x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m22065y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m22064z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public final void m22090F() {
        this.f101140d.mo7694il(this);
    }

    /* renamed from: a5 */
    public final void m22089a5(boolean z) {
        this.f101140d.mo7698a7(z ? this : null, z);
    }

    @Override // me.dm7.barcodescanner.zxing.ZXingScannerView.ResultHandler
    public void handleResult(C38511bN4 c38511bN4) {
        String str;
        BarcodeScanType barcodeScanType = null;
        if (c38511bN4 != null) {
            str = c38511bN4.m64617f();
        } else {
            str = null;
        }
        if (str == null) {
            return;
        }
        BarcodeScanType barcodeScanType2 = this.f101144h;
        if (barcodeScanType2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barcodeScanType");
        } else {
            barcodeScanType = barcodeScanType2;
        }
        int i = C26759a.$EnumSwitchMapping$0[barcodeScanType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                Intent intent = new Intent();
                intent.putExtra(PaymentMethodOptionsParams.Blik.PARAM_CODE, str);
                this.f101141e.mo37190C1(-1, intent);
                return;
            }
            return;
        }
        AbstractC23442F<HM4<Warehouse>> m33152N = this.f101138b.mo94633a(str).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "serviceCenterManager.get…dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f101139c));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26760b c26760b = new C26760b();
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: hy
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C26758ny.m22074p(Function1.this, obj);
            }
        });
    }

    /* renamed from: o */
    public final InterfaceC33193Gt5 m22075o() {
        return this.f101138b;
    }

    @Override // p000.InterfaceC10084Yx
    public void onBackPressed() {
        this.f101141e.mo37030e3();
    }

    @Override // p000.InterfaceC10084Yx
    public void onPause() {
        this.f101140d.mo7700M1();
    }

    @Override // p000.InterfaceC10084Yx
    public void onResume() {
        this.f101140d.mo7696h2(0.2f);
        m22090F();
        if (this.f101143g) {
            this.f101140d.mo7702C6();
        }
    }

    @Override // p000.InterfaceC10084Yx
    /* renamed from: q */
    public void mo22073q() {
        AbstractC23442F<H31.AbstractC3016b> mo7701M = this.f101140d.mo7701M(C45871nl4.enter_code, C45871nl4.enter_vehicle_code_dialog_hint);
        final C26773k c26773k = C26773k.f101158g;
        AbstractC23442F<R> m33157I = mo7701M.m33157I(new InterfaceC23492o() { // from class: Zx
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m22094B;
                m22094B = C26758ny.m22094B(Function1.this, obj);
                return m22094B;
            }
        });
        final C26774l c26774l = C26774l.f101159g;
        AbstractC24507p m33098z = m33157I.m33098z(new InterfaceC23494q() { // from class: ey
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m22093C;
                m22093C = C26758ny.m22093C(Function1.this, obj);
                return m22093C;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33098z, "ui.enterCodeDialogWithRe…ilter { it.isNotBlank() }");
        Object m32048b = m33098z.m32048b(AutoDispose.m45239a(this.f101139c));
        Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26775m c26775m = new C26775m(this.f101145i);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: fy
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C26758ny.m22092D(Function1.this, obj);
            }
        };
        final C26776n c26776n = C26776n.f101160b;
        ((MaybeSubscribeProxy) m32048b).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: gy
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C26758ny.m22091E(Function1.this, obj);
            }
        });
    }

    /* renamed from: r */
    public final void m22072r() {
        if (this.f101143g) {
            this.f101140d.mo7697da();
            Observable merge = Observable.merge(this.f101140d.mo7692z3(), this.f101145i.hide());
            final C26761c c26761c = new C26761c();
            Observable observeOn = merge.flatMapSingle(new InterfaceC23492o() { // from class: my
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K m22071s;
                    m22071s = C26758ny.m22071s(Function1.this, obj);
                    return m22071s;
                }
            }).observeOn(C23454a.m33087a());
            final C26766d c26766d = new C26766d();
            Observable doOnError = observeOn.doOnError(new InterfaceC23484g() { // from class: ay
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C26758ny.m22070t(Function1.this, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(doOnError, "private fun maybeEnableP…  }, Timber::e)\n    }\n  }");
            Object m33094as = doOnError.m33094as(AutoDispose.m45239a(this.f101139c));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C26767e c26767e = new C26767e();
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: cy
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C26758ny.m22069u(Function1.this, obj);
                }
            };
            final C26768f c26768f = C26768f.f101153b;
            ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: dy
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C26758ny.m22068v(Function1.this, obj);
                }
            });
        }
    }

    /* renamed from: w */
    public void m22067w(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Parcelable parcelableExtra = intent.getParcelableExtra("barcode_scan_type");
        Intrinsics.checkNotNull(parcelableExtra);
        this.f101144h = (BarcodeScanType) parcelableExtra;
        m22072r();
        AbstractC23442F<FQ3> m110485l = this.f101142f.m110485l(Permission.CAMERA_GENERIC);
        final C26769g c26769g = new C26769g();
        AbstractC24507p<R> m33163C = m110485l.m33163C(new InterfaceC23492o() { // from class: iy
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m22066x;
                m22066x = C26758ny.m22066x(Function1.this, obj);
                return m22066x;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33163C, "override fun onCreate(in…toggleFlash()\n      }\n  }");
        Object m32048b = m33163C.m32048b(AutoDispose.m45239a(this.f101139c));
        Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26770h c26770h = C26770h.f101155g;
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: jy
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C26758ny.m22065y(Function1.this, obj);
            }
        };
        final C26771i c26771i = C26771i.f101156b;
        ((MaybeSubscribeProxy) m32048b).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: ky
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C26758ny.m22064z(Function1.this, obj);
            }
        });
        Object m33094as = this.f101140d.mo7693z1().m33094as(AutoDispose.m45239a(this.f101139c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26772j c26772j = new C26772j();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: ly
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C26758ny.m22095A(Function1.this, obj);
            }
        });
    }
}
