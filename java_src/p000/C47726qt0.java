package p000;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
/* renamed from: qt0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47726qt0 {

    /* renamed from: a */
    public static final C47726qt0 f106031a = new C47726qt0();

    /* renamed from: b */
    public static Function3<AY2, InterfaceC32720Et0, Integer, Unit> f106032b = C43575jt0.m29790c(1621820099, false, C27730a.f106033g);

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LAY2;", "it", "", "invoke", "(LAY2;LEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: qt0$a */
    /* loaded from: classes.dex */
    public static final class C27730a extends Lambda implements Function3<AY2, InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public static final C27730a f106033g = new C27730a();

        public C27730a() {
            super(3);
        }

        public final void invoke(AY2 it, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AY2 ay2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(ay2, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public final Function3<AY2, InterfaceC32720Et0, Integer, Unit> m16810a() {
        return f106032b;
    }
}