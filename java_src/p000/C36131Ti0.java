package p000;

import android.content.Intent;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u0010"}, m28432d2 = {"LTi0;", "LRi0;", "Landroid/content/Intent;", "intent", "", "b", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", C17296a.f69688o, "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "LUi0;", "LUi0;", "ui", "<init>", "(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LUi0;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nChoosePhysicalLockPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChoosePhysicalLockPresenter.kt\nco/bird/android/app/feature/physicallock/ChoosePhysicalLockPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,36:1\n180#2:37\n*S KotlinDebug\n*F\n+ 1 ChoosePhysicalLockPresenter.kt\nco/bird/android/app/feature/physicallock/ChoosePhysicalLockPresenterImpl\n*L\n30#1:37\n*E\n"})
/* renamed from: Ti0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C36131Ti0 implements InterfaceC35663Ri0 {

    /* renamed from: a */
    public final LifecycleScopeProvider<EnumC7097RE> f35900a;

    /* renamed from: b */
    public final InterfaceC36365Ui0 f35901b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "position", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ti0$a */
    /* loaded from: classes2.dex */
    public static final class C7914a extends Lambda implements Function1<Integer, Unit> {
        public C7914a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Integer position) {
            InterfaceC36365Ui0 interfaceC36365Ui0 = C36131Ti0.this.f35901b;
            Intrinsics.checkNotNullExpressionValue(position, "position");
            interfaceC36365Ui0.mo79550G4(position.intValue());
        }
    }

    public C36131Ti0(LifecycleScopeProvider<EnumC7097RE> scopeProvider, InterfaceC36365Ui0 ui) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f35900a = scopeProvider;
        this.f35901b = ui;
    }

    /* renamed from: c */
    public static final void m83142c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC35663Ri0
    /* renamed from: b */
    public void mo83143b(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("physical_lock_types");
        if (parcelableArrayListExtra != null) {
            this.f35901b.mo79551Ba(parcelableArrayListExtra);
        }
        Observable<Integer> subscribeOn = this.f35901b.mo79549L().observeOn(C23454a.m33087a()).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "ui.itemClicks()\n      .o…scribeOn(Schedulers.io())");
        Object m33094as = subscribeOn.m33094as(AutoDispose.m45239a(this.f35900a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7914a c7914a = new C7914a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Si0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36131Ti0.m83142c(Function1.this, obj);
            }
        });
    }
}
