package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: vt0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50689vt0 {

    /* renamed from: a */
    public static final C50689vt0 f114849a = new C50689vt0();

    /* renamed from: b */
    public static Function3<InterfaceC39096cM5, InterfaceC32720Et0, Integer, Unit> f114850b = C43575jt0.m29790c(996639038, false, C29690a.f114851g);

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LcM5;", "it", "", C17296a.f69688o, "(LcM5;LEt0;I)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vt0$a */
    /* loaded from: classes.dex */
    public static final class C29690a extends Lambda implements Function3<InterfaceC39096cM5, InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public static final C29690a f114851g = new C29690a();

        public C29690a() {
            super(3);
        }

        /* renamed from: a */
        public final void m7867a(InterfaceC39096cM5 it, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            int i2;
            int i3;
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 14) == 0) {
                if (interfaceC32720Et0.mo89539n(it)) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i2 = i | i3;
            } else {
                i2 = i;
            }
            if ((i2 & 91) == 18 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(996639038, i2, -1, "androidx.compose.material.ComposableSingletons$SnackbarHostKt.lambda-1.<anonymous> (SnackbarHost.kt:153)");
            }
            C42078hM5.m36519d(it, null, false, null, 0L, 0L, 0L, 0.0f, interfaceC32720Et0, i2 & 14, 254);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC39096cM5 interfaceC39096cM5, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            m7867a(interfaceC39096cM5, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public final Function3<InterfaceC39096cM5, InterfaceC32720Et0, Integer, Unit> m7868a() {
        return f114850b;
    }
}
