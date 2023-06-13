package p000;

import co.bird.android.model.DialogResponse;
import co.bird.android.model.Warehouse;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.subjects.AbstractC24569h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"Loz6;", "Llz6;", "Lco/bird/android/model/Warehouse;", "currentWarehouse", "suggestedWarehouse", "", C17296a.f69688o, "Lio/reactivex/subjects/h;", "Lco/bird/android/model/DialogResponse;", "Lio/reactivex/subjects/h;", "responseSubject", "Lpz6;", "b", "Lpz6;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "c", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "<init>", "(Lio/reactivex/subjects/h;Lpz6;Lcom/uber/autodispose/ScopeProvider;)V", "warehouse-checker_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWarehouseVerificationPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WarehouseVerificationPresenter.kt\nco/bird/android/warehousechecker/dialogs/warehouseverification/WarehouseVerificationPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,37:1\n180#2:38\n*S KotlinDebug\n*F\n+ 1 WarehouseVerificationPresenter.kt\nco/bird/android/warehousechecker/dialogs/warehouseverification/WarehouseVerificationPresenterImpl\n*L\n29#1:38\n*E\n"})
/* renamed from: oz6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46606oz6 implements InterfaceC44827lz6 {

    /* renamed from: a */
    public final AbstractC24569h<DialogResponse> f102884a;

    /* renamed from: b */
    public final InterfaceC47199pz6 f102885b;

    /* renamed from: c */
    public final ScopeProvider f102886c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: oz6$a */
    /* loaded from: classes4.dex */
    public static final class C27113a extends Lambda implements Function1<DialogResponse, Unit> {
        public C27113a() {
            super(1);
        }

        /* renamed from: a */
        public final void m20179a(DialogResponse dialogResponse) {
            C46606oz6.this.f102885b.dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m20179a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: oz6$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C27114b extends FunctionReferenceImpl implements Function1<DialogResponse, Unit> {
        public C27114b(Object obj) {
            super(1, obj, AbstractC24569h.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m20178a(DialogResponse p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((AbstractC24569h) this.receiver).onNext(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m20178a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    public C46606oz6(AbstractC24569h<DialogResponse> responseSubject, InterfaceC47199pz6 ui, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(responseSubject, "responseSubject");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f102884a = responseSubject;
        this.f102885b = ui;
        this.f102886c = scopeProvider;
        Observable observeOn = Observable.merge(ui.mo13287f(), ui.mo13292I7()).observeOn(C23454a.m33087a());
        final C27113a c27113a = new C27113a();
        Observable doOnNext = observeOn.doOnNext(new InterfaceC23484g() { // from class: mz6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46606oz6.m20181d(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "merge(\n      ui.confirmC…doOnNext { ui.dismiss() }");
        Object m33094as = doOnNext.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C27114b c27114b = new C27114b(responseSubject);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: nz6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46606oz6.m20180e(Function1.this, obj);
            }
        });
    }

    /* renamed from: d */
    public static final void m20181d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e */
    public static final void m20180e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC44827lz6
    /* renamed from: a */
    public void mo20184a(Warehouse currentWarehouse, Warehouse warehouse) {
        Intrinsics.checkNotNullParameter(currentWarehouse, "currentWarehouse");
        this.f102885b.mo13286ya(currentWarehouse, warehouse);
    }
}
