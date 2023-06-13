package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.api.exception.HttpException;
import co.bird.api.response.WarehouseInventory;
import co.bird.api.response.WireBinDefinition;
import co.bird.api.response.WireInventoryCount;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"Lph1;", "Lkh1;", "Lco/bird/api/response/WarehouseInventory;", "inventory", "", C17296a.f69688o, "LI82;", "LI82;", "inventoryManager", "Lqh1;", "b", "Lqh1;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "c", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", DateTokenConverter.CONVERTER_KEY, "Le13;", "navigator", "<init>", "(LI82;Lqh1;Lcom/uber/autodispose/ScopeProvider;Le13;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nExcessInventoryPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExcessInventoryPresenter.kt\nco/bird/android/feature/servicecenter/inventorycount/excessinventory/ExcessInventoryPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,66:1\n180#2:67\n180#2:68\n*S KotlinDebug\n*F\n+ 1 ExcessInventoryPresenter.kt\nco/bird/android/feature/servicecenter/inventorycount/excessinventory/ExcessInventoryPresenterImpl\n*L\n31#1:67\n57#1:68\n*E\n"})
/* renamed from: ph1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47014ph1 implements InterfaceC44049kh1 {

    /* renamed from: a */
    public final I82 f103920a;

    /* renamed from: b */
    public final InterfaceC47607qh1 f103921b;

    /* renamed from: c */
    public final ScopeProvider f103922c;

    /* renamed from: d */
    public final InterfaceC40099e13 f103923d;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "quantity", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ph1$a */
    /* loaded from: classes3.dex */
    public static final class C27329a extends Lambda implements Function1<Integer, Unit> {
        public C27329a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Integer quantity) {
            InterfaceC47607qh1 interfaceC47607qh1 = C47014ph1.this.f103921b;
            Intrinsics.checkNotNullExpressionValue(quantity, "quantity");
            interfaceC47607qh1.mo15571x(quantity.intValue() > 0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/api/response/WireInventoryCount;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ph1$b */
    /* loaded from: classes3.dex */
    public static final class C27330b extends Lambda implements Function1<Pair<? extends Unit, ? extends Integer>, InterfaceC23447K<? extends WireInventoryCount>> {

        /* renamed from: h */
        public final /* synthetic */ String f103926h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27330b(String str) {
            super(1);
            this.f103926h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends WireInventoryCount> invoke(Pair<Unit, Integer> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Integer quantity = pair.component2();
            I82 i82 = C47014ph1.this.f103920a;
            String str = this.f103926h;
            Intrinsics.checkNotNullExpressionValue(quantity, "quantity");
            return C38096ag5.m70883l(i82.mo101098b(str, quantity.intValue()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nExcessInventoryPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExcessInventoryPresenter.kt\nco/bird/android/feature/servicecenter/inventorycount/excessinventory/ExcessInventoryPresenterImpl$onCreate$2\n+ 2 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n9#2,4:67\n1#3:71\n*S KotlinDebug\n*F\n+ 1 ExcessInventoryPresenter.kt\nco/bird/android/feature/servicecenter/inventorycount/excessinventory/ExcessInventoryPresenterImpl$onCreate$2\n*L\n54#1:67,4\n*E\n"})
    /* renamed from: ph1$c */
    /* loaded from: classes3.dex */
    public static final class C27331c extends Lambda implements Function1<Throwable, Unit> {
        public C27331c() {
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
            Unit unit = null;
            if (!(th instanceof HttpException)) {
                th = null;
            }
            HttpException httpException = (HttpException) th;
            if (httpException != null) {
                C47014ph1.this.f103921b.error(httpException);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                C47014ph1.this.f103921b.errorGeneric();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/WireInventoryCount;", "kotlin.jvm.PlatformType", "count", "", C17296a.f69688o, "(Lco/bird/api/response/WireInventoryCount;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ph1$d */
    /* loaded from: classes3.dex */
    public static final class C27332d extends Lambda implements Function1<WireInventoryCount, Unit> {
        public C27332d() {
            super(1);
        }

        /* renamed from: a */
        public final void m18980a(WireInventoryCount wireInventoryCount) {
            Intent intent = new Intent();
            intent.putExtra("inventory", wireInventoryCount);
            C47014ph1.this.f103923d.mo37190C1(-1, intent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireInventoryCount wireInventoryCount) {
            m18980a(wireInventoryCount);
            return Unit.INSTANCE;
        }
    }

    public C47014ph1(I82 inventoryManager, InterfaceC47607qh1 ui, ScopeProvider scopeProvider, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(inventoryManager, "inventoryManager");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f103920a = inventoryManager;
        this.f103921b = ui;
        this.f103922c = scopeProvider;
        this.f103923d = navigator;
        Object m33094as = ui.mo15572sg().m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C27329a c27329a = new C27329a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: oh1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C47014ph1.m18985f(Function1.this, obj);
            }
        });
    }

    /* renamed from: f */
    public static final void m18985f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final InterfaceC23447K m18984g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final void m18983h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m18982i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    @Override // p000.InterfaceC44049kh1
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo18990a(WarehouseInventory inventory) {
        String str;
        boolean z;
        boolean isBlank;
        Intrinsics.checkNotNullParameter(inventory, "inventory");
        WireBinDefinition binDefinition = inventory.getBinDefinition();
        if (binDefinition != null) {
            str = binDefinition.getSku();
        } else {
            str = null;
        }
        if (str != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(str);
            if (!isBlank) {
                z = false;
                if (!z) {
                    this.f103921b.mo15574Fd();
                    this.f103923d.close();
                    return;
                }
                Observable m31950a = C24527f.m31950a(this.f103921b.mo15573c(), this.f103921b.mo15572sg());
                final C27330b c27330b = new C27330b(str);
                Observable flatMapSingle = m31950a.flatMapSingle(new InterfaceC23492o() { // from class: lh1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23447K m18984g;
                        m18984g = C47014ph1.m18984g(Function1.this, obj);
                        return m18984g;
                    }
                });
                final C27331c c27331c = new C27331c();
                Observable retry = flatMapSingle.doOnError(new InterfaceC23484g() { // from class: mh1
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C47014ph1.m18983h(Function1.this, obj);
                    }
                }).retry();
                Intrinsics.checkNotNullExpressionValue(retry, "override fun onCreate(in…ULT_OK, data)\n      }\n  }");
                Object m33094as = retry.m33094as(AutoDispose.m45239a(this.f103922c));
                Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
                final C27332d c27332d = new C27332d();
                ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: nh1
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C47014ph1.m18982i(Function1.this, obj);
                    }
                });
                return;
            }
        }
        z = true;
        if (!z) {
        }
    }
}
