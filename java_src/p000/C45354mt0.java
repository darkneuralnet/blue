package p000;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
/* renamed from: mt0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45354mt0 {

    /* renamed from: a */
    public static final C45354mt0 f98978a = new C45354mt0();

    /* renamed from: b */
    public static Function4<InterfaceC7907Te, AY2, InterfaceC32720Et0, Integer, Unit> f98979b = C43575jt0.m29790c(-2143581737, false, C26284a.f98980g);

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTe;", "LAY2;", "it", "", "invoke", "(LTe;LAY2;LEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: mt0$a */
    /* loaded from: classes5.dex */
    public static final class C26284a extends Lambda implements Function4<InterfaceC7907Te, AY2, InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public static final C26284a f98980g = new C26284a();

        public C26284a() {
            super(4);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC7907Te interfaceC7907Te, AY2 ay2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC7907Te, ay2, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC7907Te $receiver, AY2 it, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            Intrinsics.checkNotNullParameter(it, "it");
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-2143581737, i, -1, "com.google.accompanist.navigation.animation.ComposableSingletons$AnimatedComposeNavigatorKt.lambda-1.<anonymous> (AnimatedComposeNavigator.kt:53)");
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    /* renamed from: a */
    public final Function4<InterfaceC7907Te, AY2, InterfaceC32720Et0, Integer, Unit> m24776a() {
        return f98979b;
    }
}
