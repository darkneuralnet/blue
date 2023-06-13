package com.stripe.android.p049ui.core.elements.menu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.menu.MenuKt$DropdownMenuItemContent$2$1 */
/* loaded from: classes7.dex */
public final class MenuKt$DropdownMenuItemContent$2$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty$1;
    final /* synthetic */ Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> $content;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InterfaceC37486Zc5 $this_Row;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.ui.core.elements.menu.MenuKt$DropdownMenuItemContent$2$1$1 */
    /* loaded from: classes7.dex */
    public static final class C194221 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ int $$dirty$1;
        final /* synthetic */ Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> $content;
        final /* synthetic */ InterfaceC37486Zc5 $this_Row;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C194221(Function3<? super InterfaceC37486Zc5, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, InterfaceC37486Zc5 interfaceC37486Zc5, int i, int i2) {
            super(2);
            this.$content = function3;
            this.$this_Row = interfaceC37486Zc5;
            this.$$dirty = i;
            this.$$dirty$1 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(2024906302, i, -1, "com.stripe.android.ui.core.elements.menu.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:184)");
            }
            this.$content.invoke(this.$this_Row, interfaceC32720Et0, Integer.valueOf((this.$$dirty & 14) | ((this.$$dirty$1 >> 12) & 112)));
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MenuKt$DropdownMenuItemContent$2$1(boolean z, Function3<? super InterfaceC37486Zc5, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, InterfaceC37486Zc5 interfaceC37486Zc5, int i, int i2) {
        super(2);
        this.$enabled = z;
        this.$content = function3;
        this.$this_Row = interfaceC37486Zc5;
        this.$$dirty = i;
        this.$$dirty$1 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        float m77588b;
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1663902978, i, -1, "com.stripe.android.ui.core.elements.menu.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:182)");
        }
        if (this.$enabled) {
            interfaceC32720Et0.mo89638F(-1827379404);
            m77588b = C36986Wz0.f42427a.m77587c(interfaceC32720Et0, C36986Wz0.f42428b);
        } else {
            interfaceC32720Et0.mo89638F(-1827379381);
            m77588b = C36986Wz0.f42427a.m77588b(interfaceC32720Et0, C36986Wz0.f42428b);
        }
        interfaceC32720Et0.mo89605Q();
        C41806gu0.m37353a(new W94[]{C37220Xz0.m75931a().m81907c(Float.valueOf(m77588b))}, C43575jt0.m29791b(interfaceC32720Et0, 2024906302, true, new C194221(this.$content, this.$this_Row, this.$$dirty, this.$$dirty$1)), interfaceC32720Et0, 56);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
