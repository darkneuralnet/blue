package p000;

import android.view.View;
import androidx.compose.p003ui.platform.C11411h;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0004R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, m28432d2 = {"Lpv2;", "", "LXr6;", "viewModelStoreOwner", "LW94;", "b", "LU94;", "LU94;", "LocalViewModelStoreOwner", C17296a.f69688o, "(LEt0;I)LXr6;", "current", "<init>", "()V", "lifecycle-viewmodel-compose_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLocalViewModelStoreOwner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalViewModelStoreOwner.kt\nandroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,53:1\n76#2:54\n76#2:55\n*S KotlinDebug\n*F\n+ 1 LocalViewModelStoreOwner.kt\nandroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner\n*L\n41#1:54\n42#1:55\n*E\n"})
/* renamed from: pv2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47155pv2 {

    /* renamed from: a */
    public static final C47155pv2 f104319a = new C47155pv2();

    /* renamed from: b */
    public static final U94<InterfaceC37154Xr6> f104320b = C41806gu0.m37351c(null, C27418a.f104321g, 1, null);

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LXr6;", "invoke", "()LXr6;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: pv2$a */
    /* loaded from: classes.dex */
    public static final class C27418a extends Lambda implements Function0<InterfaceC37154Xr6> {

        /* renamed from: g */
        public static final C27418a f104321g = new C27418a();

        public C27418a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC37154Xr6 invoke() {
            return null;
        }
    }

    private C47155pv2() {
    }

    @JvmName(name = "getCurrent")
    /* renamed from: a */
    public final InterfaceC37154Xr6 m18429a(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        interfaceC32720Et0.mo89638F(-584162872);
        InterfaceC37154Xr6 interfaceC37154Xr6 = (InterfaceC37154Xr6) interfaceC32720Et0.mo89572c(f104320b);
        if (interfaceC37154Xr6 == null) {
            interfaceC37154Xr6 = C36470Ut6.m80658a((View) interfaceC32720Et0.mo89572c(C11411h.m68320k()));
        }
        interfaceC32720Et0.mo89605Q();
        return interfaceC37154Xr6;
    }

    /* renamed from: b */
    public final W94<InterfaceC37154Xr6> m18428b(InterfaceC37154Xr6 viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        return f104320b.m81907c(viewModelStoreOwner);
    }
}
