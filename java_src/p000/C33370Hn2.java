package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "initialFirstVisibleItemIndex", "initialFirstVisibleItemScrollOffset", "LGn2;", C17296a.f69688o, "(IILEt0;II)LGn2;", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridStateKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,460:1\n50#2:461\n49#2:462\n1114#3,6:463\n*S KotlinDebug\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridStateKt\n*L\n62#1:461\n62#1:462\n62#1:463,6\n*E\n"})
/* renamed from: Hn2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33370Hn2 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Hn2$a */
    /* loaded from: classes.dex */
    public static final class C3230a extends Lambda implements Function0<C33136Gn2> {

        /* renamed from: g */
        public final /* synthetic */ int f13883g;

        /* renamed from: h */
        public final /* synthetic */ int f13884h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3230a(int i, int i2) {
            super(0);
            this.f13883g = i;
            this.f13884h = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C33136Gn2 invoke() {
            return new C33136Gn2(this.f13883g, this.f13884h);
        }
    }

    /* renamed from: a */
    public static final C33136Gn2 m103430a(int i, int i2, InterfaceC32720Et0 interfaceC32720Et0, int i3, int i4) {
        interfaceC32720Et0.mo89638F(29186956);
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(29186956, i3, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:57)");
        }
        Object[] objArr = new Object[0];
        InterfaceC35668Ri5<C33136Gn2, ?> m104722a = C33136Gn2.f12417x.m104722a();
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        interfaceC32720Et0.mo89638F(511388516);
        boolean mo89539n = interfaceC32720Et0.mo89539n(valueOf) | interfaceC32720Et0.mo89539n(valueOf2);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new C3230a(i, i2);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        C33136Gn2 c33136Gn2 = (C33136Gn2) C35550Qv4.m87571b(objArr, m104722a, null, (Function0) mo89635G, interfaceC32720Et0, 72, 4);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return c33136Gn2;
    }
}
