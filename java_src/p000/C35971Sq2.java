package p000;

import android.content.Intent;
import co.bird.android.library.lightbox.LightboxImage;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.rxkotlin.C24527f;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014¨\u0006\u0018"}, m28432d2 = {"LSq2;", "LQq2;", "", "Lco/bird/android/library/lightbox/LightboxImage;", "images", "", "index", "", C17296a.f69688o, "", "onBackPressed", "c", "Lcom/uber/autodispose/ScopeProvider;", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LTq2;", "b", "LTq2;", "ui", "Le13;", "Le13;", "navigator", "<init>", "(Lcom/uber/autodispose/ScopeProvider;LTq2;Le13;)V", "lightbox_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLightboxPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LightboxPresenter.kt\nco/bird/android/library/lightbox/LightboxPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,48:1\n180#2:49\n*S KotlinDebug\n*F\n+ 1 LightboxPresenter.kt\nco/bird/android/library/lightbox/LightboxPresenterImpl\n*L\n30#1:49\n*E\n"})
/* renamed from: Sq2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35971Sq2 implements InterfaceC35503Qq2 {

    /* renamed from: a */
    public final ScopeProvider f34311a;

    /* renamed from: b */
    public final InterfaceC36205Tq2 f34312b;

    /* renamed from: c */
    public final InterfaceC40099e13 f34313c;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Sq2$a */
    /* loaded from: classes3.dex */
    public static final class C7550a extends Lambda implements Function1<Pair<? extends Unit, ? extends Integer>, Unit> {
        public C7550a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends Integer> pair) {
            invoke2((Pair<Unit, Integer>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, Integer> pair) {
            Integer index = pair.component2();
            C35971Sq2 c35971Sq2 = C35971Sq2.this;
            Intrinsics.checkNotNullExpressionValue(index, "index");
            c35971Sq2.m84797c(index.intValue());
        }
    }

    public C35971Sq2(ScopeProvider scopeProvider, InterfaceC36205Tq2 ui, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f34311a = scopeProvider;
        this.f34312b = ui;
        this.f34313c = navigator;
    }

    /* renamed from: d */
    public static final void m84796d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC35503Qq2
    /* renamed from: a */
    public void mo84799a(List<LightboxImage> images, int i) {
        Intrinsics.checkNotNullParameter(images, "images");
        this.f34312b.mo80772s1(images, i);
        Observable observeOn = C24527f.m31950a(this.f34312b.mo80774q1(), this.f34312b.mo80773r1()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.closeClicks()\n      .…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f34311a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7550a c7550a = new C7550a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Rq2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35971Sq2.m84796d(Function1.this, obj);
            }
        });
    }

    /* renamed from: c */
    public final void m84797c(int i) {
        Intent putExtra = new Intent().putExtra("item_index", i);
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent().putExtra(Extras.ITEM_INDEX, index)");
        this.f34313c.mo37029e4(-1, putExtra);
    }

    @Override // p000.InterfaceC35503Qq2
    public boolean onBackPressed() {
        try {
            m84797c(this.f34312b.mo80773r1().getValue().intValue());
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
