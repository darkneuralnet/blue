package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.DialogResponse;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24567g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"LgE4;", "", "", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/g;", "Lco/bird/android/model/DialogResponse;", C17296a.f69688o, "Lio/reactivex/subjects/g;", "responseSubject", "LhE4;", "b", "LhE4;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "c", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "<init>", "(Lio/reactivex/subjects/g;LhE4;Lcom/uber/autodispose/ScopeProvider;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairV3CompletePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3CompletePresenter.kt\nco/bird/android/feature/repair/v3/overview/dialogs/RepairV3CompletePresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,28:1\n180#2:29\n*S KotlinDebug\n*F\n+ 1 RepairV3CompletePresenter.kt\nco/bird/android/feature/repair/v3/overview/dialogs/RepairV3CompletePresenter\n*L\n21#1:29\n*E\n"})
/* renamed from: gE4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41412gE4 {

    /* renamed from: a */
    public final C24567g<DialogResponse> f81810a;

    /* renamed from: b */
    public final C42005hE4 f81811b;

    /* renamed from: c */
    public final ScopeProvider f81812c;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/DialogResponse;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gE4$a */
    /* loaded from: classes3.dex */
    public static final class C20786a extends Lambda implements Function1<Unit, DialogResponse> {

        /* renamed from: g */
        public static final C20786a f81813g = new C20786a();

        public C20786a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final DialogResponse invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return DialogResponse.OK;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/DialogResponse;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gE4$b */
    /* loaded from: classes3.dex */
    public static final class C20787b extends Lambda implements Function1<Unit, DialogResponse> {

        /* renamed from: g */
        public static final C20787b f81814g = new C20787b();

        public C20787b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final DialogResponse invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return DialogResponse.CANCEL;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gE4$c */
    /* loaded from: classes3.dex */
    public static final class C20788c extends Lambda implements Function1<DialogResponse, Unit> {
        public C20788c() {
            super(1);
        }

        /* renamed from: a */
        public final void m39810a(DialogResponse dialogResponse) {
            C41412gE4.this.f81810a.onSuccess(dialogResponse);
            C41412gE4.this.f81811b.dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m39810a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    public C41412gE4(C24567g<DialogResponse> responseSubject, C42005hE4 ui, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(responseSubject, "responseSubject");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f81810a = responseSubject;
        this.f81811b = ui;
        this.f81812c = scopeProvider;
    }

    /* renamed from: e */
    public static final DialogResponse m39815e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (DialogResponse) tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final DialogResponse m39814f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (DialogResponse) tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m39813g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d */
    public final void m39816d() {
        Observable<Unit> m36580f = this.f81811b.m36580f();
        final C20786a c20786a = C20786a.f81813g;
        InterfaceC23434B map = m36580f.map(new InterfaceC23492o() { // from class: dE4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                DialogResponse m39815e;
                m39815e = C41412gE4.m39815e(Function1.this, obj);
                return m39815e;
            }
        });
        Observable<Unit> m36579i2 = this.f81811b.m36579i2();
        final C20787b c20787b = C20787b.f81814g;
        Observable merge = Observable.merge(map, m36579i2.map(new InterfaceC23492o() { // from class: eE4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                DialogResponse m39814f;
                m39814f = C41412gE4.m39814f(Function1.this, obj);
                return m39814f;
            }
        }));
        Intrinsics.checkNotNullExpressionValue(merge, "merge(\n      ui.confirmC…ogResponse.CANCEL }\n    )");
        Object m33094as = merge.m33094as(AutoDispose.m45239a(this.f81812c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20788c c20788c = new C20788c();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: fE4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41412gE4.m39813g(Function1.this, obj);
            }
        });
    }
}
