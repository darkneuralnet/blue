package com.stripe.android.financialconnections.p041ui.theme;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.financialconnections.ui.theme.ThemeKt$FinancialConnectionsTheme$1 */
/* loaded from: classes7.dex */
public final class ThemeKt$FinancialConnectionsTheme$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> $content;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.ui.theme.ThemeKt$FinancialConnectionsTheme$1$1 */
    /* loaded from: classes7.dex */
    public static final class C189371 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> $content;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.financialconnections.ui.theme.ThemeKt$FinancialConnectionsTheme$1$1$1 */
        /* loaded from: classes7.dex */
        public static final class C189381 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> $content;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C189381(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i) {
                super(2);
                this.$content = function2;
                this.$$dirty = i;
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
                    C35528Qt0.m87816Z(-1499577148, i, -1, "com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme.<anonymous>.<anonymous>.<anonymous> (Theme.kt:158)");
                }
                this.$content.invoke(interfaceC32720Et0, Integer.valueOf(this.$$dirty & 14));
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C189371(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i) {
            super(2);
            this.$content = function2;
            this.$$dirty = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            B26 b26;
            if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-705179260, i, -1, "com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme.<anonymous>.<anonymous> (Theme.kt:154)");
            }
            U94<B26> m112949b = C26.m112949b();
            b26 = ThemeKt.TextSelectionColors;
            C41806gu0.m37353a(new W94[]{m112949b.m81907c(b26), C52293yb5.m3198d().m81907c(FinancialConnectionsRippleTheme.INSTANCE)}, C43575jt0.m29791b(interfaceC32720Et0, -1499577148, true, new C189381(this.$content, this.$$dirty)), interfaceC32720Et0, 56);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ThemeKt$FinancialConnectionsTheme$1(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i) {
        super(2);
        this.$content = function2;
        this.$$dirty = i;
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
            C35528Qt0.m87816Z(-1062128464, i, -1, "com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme.<anonymous> (Theme.kt:151)");
        }
        UM2.m81596a(ThemeKt.m116478debugColors8_81llA$default(0L, 1, null), null, null, C43575jt0.m29791b(interfaceC32720Et0, -705179260, true, new C189371(this.$content, this.$$dirty)), interfaceC32720Et0, 3072, 6);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
