package com.stripe.android.link.model;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LUY2;", "", "invoke", "(LUY2;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class Navigator$navigateTo$1$1 extends Lambda implements Function1<UY2, Unit> {
    final /* synthetic */ boolean $clearBackStack;
    final /* synthetic */ OY2 $navController;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LlY3;", "", "invoke", "(LlY3;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.link.model.Navigator$navigateTo$1$1$1 */
    /* loaded from: classes7.dex */
    public static final class C189871 extends Lambda implements Function1<C44556lY3, Unit> {
        public static final C189871 INSTANCE = new C189871();

        public C189871() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44556lY3 c44556lY3) {
            invoke2(c44556lY3);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(C44556lY3 popUpTo) {
            Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
            popUpTo.m27164c(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Navigator$navigateTo$1$1(boolean z, OY2 oy2) {
        super(1);
        this.$clearBackStack = z;
        this.$navController = oy2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UY2 uy2) {
        invoke2(uy2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(UY2 navigate) {
        Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
        if (this.$clearBackStack) {
            navigate.m81362c(this.$navController.m110205v().first().m115582f().m103774s(), C189871.INSTANCE);
        }
    }
}
