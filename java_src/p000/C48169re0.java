package p000;

import androidx.compose.p003ui.draw.C11289a;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m28432d2 = {"LgV2;", "modifier", "Lkotlin/Function1;", "LI61;", "", "Lkotlin/ExtensionFunctionType;", "onDraw", C17296a.f69688o, "(LgV2;Lkotlin/jvm/functions/Function1;LEt0;I)V", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCanvas.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Canvas.kt\nandroidx/compose/foundation/CanvasKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,65:1\n36#2:66\n1114#3,6:67\n*S KotlinDebug\n*F\n+ 1 Canvas.kt\nandroidx/compose/foundation/CanvasKt\n*L\n65#1:66\n65#1:67,6\n*E\n"})
/* renamed from: re0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48169re0 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: re0$a */
    /* loaded from: classes.dex */
    public static final class C27960a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC41563gV2 f107344g;

        /* renamed from: h */
        public final /* synthetic */ Function1<I61, Unit> f107345h;

        /* renamed from: i */
        public final /* synthetic */ int f107346i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C27960a(InterfaceC41563gV2 interfaceC41563gV2, Function1<? super I61, Unit> function1, int i) {
            super(2);
            this.f107344g = interfaceC41563gV2;
            this.f107345h = function1;
            this.f107346i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C48169re0.m15656a(this.f107344g, this.f107345h, interfaceC32720Et0, C47127ps4.m18626a(this.f107346i | 1));
        }
    }

    /* renamed from: a */
    public static final void m15656a(InterfaceC41563gV2 modifier, Function1<? super I61, Unit> onDraw, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(onDraw, "onDraw");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-932836462);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(modifier)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89629I(onDraw)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-932836462, i, -1, "androidx.compose.foundation.Canvas (Canvas.kt:41)");
            }
            DN5.m110552a(C11289a.m68867a(modifier, onDraw), mo89518u, 0);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C27960a(modifier, onDraw, i));
        }
    }
}
