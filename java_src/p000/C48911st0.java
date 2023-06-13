package p000;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: st0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48911st0 {

    /* renamed from: a */
    public static final C48911st0 f109448a = new C48911st0();

    /* renamed from: b */
    public static Function3<Function2<? super InterfaceC32720Et0, ? super Integer, Unit>, InterfaceC32720Et0, Integer, Unit> f109449b = C43575jt0.m29790c(671295101, false, C28421a.f109450g);

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lkotlin/Function0;", "", "innerTextField", "invoke", "(Lkotlin/jvm/functions/Function2;LEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: st0$a */
    /* loaded from: classes.dex */
    public static final class C28421a extends Lambda implements Function3<Function2<? super InterfaceC32720Et0, ? super Integer, ? extends Unit>, InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public static final C28421a f109450g = new C28421a();

        public C28421a() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super InterfaceC32720Et0, ? super Integer, ? extends Unit> function2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke((Function2<? super InterfaceC32720Et0, ? super Integer, Unit>) function2, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> innerTextField, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
            if ((i & 14) == 0) {
                i |= interfaceC32720Et0.mo89629I(innerTextField) ? 4 : 2;
            }
            if ((i & 91) == 18 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(671295101, i, -1, "androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.lambda-1.<anonymous> (CoreTextField.kt:197)");
            }
            innerTextField.invoke(interfaceC32720Et0, Integer.valueOf(i & 14));
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    /* renamed from: a */
    public final Function3<Function2<? super InterfaceC32720Et0, ? super Integer, Unit>, InterfaceC32720Et0, Integer, Unit> m13550a() {
        return f109449b;
    }
}
