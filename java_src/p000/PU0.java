package p000;

import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b \u0010!J \u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\""}, m28432d2 = {"LPU0;", "LxC;", "LOU0;", "Landroid/view/View;", "view", "", "position", "LLU0;", "item", "", "q", "LQU0;", "c", "LQU0;", "getUi", "()LQU0;", "ui", "Le13;", DateTokenConverter.CONVERTER_KEY, "Le13;", "getNavigator", "()Le13;", "navigator", "LYR4;", "e", "LYR4;", "getRideManager", "()LYR4;", "rideManager", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "scopeProvider", "<init>", "(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LQU0;Le13;LYR4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: PU0 */
/* loaded from: classes2.dex */
public final class PU0 extends C30060xC implements OU0 {

    /* renamed from: c */
    public final QU0 f28557c;

    /* renamed from: d */
    public final InterfaceC40099e13 f28558d;

    /* renamed from: e */
    public final YR4 f28559e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PU0(LifecycleScopeProvider<EnumC7097RE> scopeProvider, QU0 ui, InterfaceC40099e13 navigator, YR4 rideManager) {
        super(scopeProvider);
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        this.f28557c = ui;
        this.f28558d = navigator;
        this.f28559e = rideManager;
    }

    @Override // p000.OU0
    /* renamed from: q */
    public void mo90203q(View view, int i, LU0 item) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(item, "item");
        item.mo96894c(this.f28558d, this.f28559e);
    }
}
