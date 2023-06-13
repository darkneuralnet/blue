package p000;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: nt0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45947nt0 {

    /* renamed from: a */
    public static final C45947nt0 f100977a = new C45947nt0();

    /* renamed from: b */
    public static Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> f100978b = C43575jt0.m29790c(-771938130, false, C26736a.f100979g);

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LZc5;", "", "invoke", "(LZc5;LEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: nt0$a */
    /* loaded from: classes.dex */
    public static final class C26736a extends Lambda implements Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public static final C26736a f100979g = new C26736a();

        public C26736a() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC37486Zc5 interfaceC37486Zc5, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC37486Zc5, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC37486Zc5 interfaceC37486Zc5, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Intrinsics.checkNotNullParameter(interfaceC37486Zc5, "$this$null");
            if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-771938130, i, -1, "androidx.compose.material.ComposableSingletons$AppBarKt.lambda-1.<anonymous> (AppBar.kt:80)");
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    /* renamed from: a */
    public final Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> m22249a() {
        return f100978b;
    }
}
