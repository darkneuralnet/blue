package com.stripe.android.p049ui.core.elements;

import com.stripe.android.uicore.elements.H6TextKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nSimpleDialogElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleDialogElementUI.kt\ncom/stripe/android/ui/core/elements/SimpleDialogElementUIKt$SimpleDialogElementUI$3\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,59:1\n36#2:60\n1057#3,6:61\n*S KotlinDebug\n*F\n+ 1 SimpleDialogElementUI.kt\ncom/stripe/android/ui/core/elements/SimpleDialogElementUIKt$SimpleDialogElementUI$3\n*L\n26#1:60\n26#1:61,6\n*E\n"})
/* renamed from: com.stripe.android.ui.core.elements.SimpleDialogElementUIKt$SimpleDialogElementUI$3 */
/* loaded from: classes7.dex */
public final class SimpleDialogElementUIKt$SimpleDialogElementUI$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ String $confirmText;
    final /* synthetic */ String $dismissText;
    final /* synthetic */ String $messageText;
    final /* synthetic */ Function0<Unit> $onConfirmListener;
    final /* synthetic */ Function0<Unit> $onDismissListener;
    final /* synthetic */ EX2<Boolean> $openDialog;
    final /* synthetic */ String $titleText;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nSimpleDialogElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleDialogElementUI.kt\ncom/stripe/android/ui/core/elements/SimpleDialogElementUIKt$SimpleDialogElementUI$3$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,59:1\n50#2:60\n49#2:61\n1057#3,6:62\n*S KotlinDebug\n*F\n+ 1 SimpleDialogElementUI.kt\ncom/stripe/android/ui/core/elements/SimpleDialogElementUIKt$SimpleDialogElementUI$3$2\n*L\n37#1:60\n37#1:61\n37#1:62,6\n*E\n"})
    /* renamed from: com.stripe.android.ui.core.elements.SimpleDialogElementUIKt$SimpleDialogElementUI$3$2 */
    /* loaded from: classes7.dex */
    public static final class C194132 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ String $confirmText;
        final /* synthetic */ Function0<Unit> $onConfirmListener;
        final /* synthetic */ EX2<Boolean> $openDialog;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.ui.core.elements.SimpleDialogElementUIKt$SimpleDialogElementUI$3$2$2 */
        /* loaded from: classes7.dex */
        public static final class C194142 extends Lambda implements Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ String $confirmText;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C194142(String str, int i) {
                super(3);
                this.$confirmText = str;
                this.$$dirty = i;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC37486Zc5 interfaceC37486Zc5, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                invoke(interfaceC37486Zc5, interfaceC32720Et0, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(InterfaceC37486Zc5 TextButton, InterfaceC32720Et0 interfaceC32720Et0, int i) {
                Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
                    interfaceC32720Et0.mo89548k();
                    return;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(1220553450, i, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:40)");
                }
                C38909c26.m62000e(this.$confirmText, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC32720Et0, (this.$$dirty >> 9) & 14, 0, 65534);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194132(EX2<Boolean> ex2, Function0<Unit> function0, int i, String str) {
            super(2);
            this.$openDialog = ex2;
            this.$onConfirmListener = function0;
            this.$$dirty = i;
            this.$confirmText = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r15v0, types: [Et0] */
        /* JADX WARN: Type inference failed for: r4v3 */
        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1022002259, i, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:34)");
            }
            EX2<Boolean> ex2 = this.$openDialog;
            Function0<Unit> function0 = this.$onConfirmListener;
            interfaceC32720Et0.mo89638F(511388516);
            boolean mo89539n = interfaceC32720Et0.mo89539n(ex2) | interfaceC32720Et0.mo89539n(function0);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new SimpleDialogElementUIKt$SimpleDialogElementUI$3$2$1$1(ex2, function0);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            C43714k70.m29276c(mo89635G, null, false, null, null, null, null, null, null, C43575jt0.m29791b(interfaceC32720Et0, 1220553450, true, new C194142(this.$confirmText, this.$$dirty)), interfaceC32720Et0, 805306368, 510);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nSimpleDialogElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleDialogElementUI.kt\ncom/stripe/android/ui/core/elements/SimpleDialogElementUIKt$SimpleDialogElementUI$3$3\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,59:1\n50#2:60\n49#2:61\n1057#3,6:62\n*S KotlinDebug\n*F\n+ 1 SimpleDialogElementUI.kt\ncom/stripe/android/ui/core/elements/SimpleDialogElementUIKt$SimpleDialogElementUI$3$3\n*L\n47#1:60\n47#1:61\n47#1:62,6\n*E\n"})
    /* renamed from: com.stripe.android.ui.core.elements.SimpleDialogElementUIKt$SimpleDialogElementUI$3$3 */
    /* loaded from: classes7.dex */
    public static final class C194153 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ String $dismissText;
        final /* synthetic */ Function0<Unit> $onDismissListener;
        final /* synthetic */ EX2<Boolean> $openDialog;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.ui.core.elements.SimpleDialogElementUIKt$SimpleDialogElementUI$3$3$2 */
        /* loaded from: classes7.dex */
        public static final class C194162 extends Lambda implements Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ String $dismissText;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C194162(String str, int i) {
                super(3);
                this.$dismissText = str;
                this.$$dirty = i;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC37486Zc5 interfaceC37486Zc5, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                invoke(interfaceC37486Zc5, interfaceC32720Et0, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(InterfaceC37486Zc5 TextButton, InterfaceC32720Et0 interfaceC32720Et0, int i) {
                Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
                    interfaceC32720Et0.mo89548k();
                    return;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(104585324, i, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:50)");
                }
                C38909c26.m62000e(this.$dismissText, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC32720Et0, (this.$$dirty >> 12) & 14, 0, 65534);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194153(EX2<Boolean> ex2, Function0<Unit> function0, int i, String str) {
            super(2);
            this.$openDialog = ex2;
            this.$onDismissListener = function0;
            this.$$dirty = i;
            this.$dismissText = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r15v0, types: [Et0] */
        /* JADX WARN: Type inference failed for: r4v3 */
        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-2137970385, i, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:44)");
            }
            EX2<Boolean> ex2 = this.$openDialog;
            Function0<Unit> function0 = this.$onDismissListener;
            interfaceC32720Et0.mo89638F(511388516);
            boolean mo89539n = interfaceC32720Et0.mo89539n(ex2) | interfaceC32720Et0.mo89539n(function0);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new SimpleDialogElementUIKt$SimpleDialogElementUI$3$3$1$1(ex2, function0);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            C43714k70.m29276c(mo89635G, null, false, null, null, null, null, null, null, C43575jt0.m29791b(interfaceC32720Et0, 104585324, true, new C194162(this.$dismissText, this.$$dirty)), interfaceC32720Et0, 805306368, 510);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.ui.core.elements.SimpleDialogElementUIKt$SimpleDialogElementUI$3$4 */
    /* loaded from: classes7.dex */
    public static final class C194174 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ String $titleText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194174(String str, int i) {
            super(2);
            this.$titleText = str;
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
                C35528Qt0.m87816Z(1599012848, i, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:28)");
            }
            H4TextKt.H4Text(this.$titleText, null, interfaceC32720Et0, (this.$$dirty >> 3) & 14, 2);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.ui.core.elements.SimpleDialogElementUIKt$SimpleDialogElementUI$3$5 */
    /* loaded from: classes7.dex */
    public static final class C194185 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ String $messageText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194185(String str, int i) {
            super(2);
            this.$messageText = str;
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
                C35528Qt0.m87816Z(1041028785, i, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:31)");
            }
            H6TextKt.H6Text(this.$messageText, null, interfaceC32720Et0, (this.$$dirty >> 6) & 14, 2);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleDialogElementUIKt$SimpleDialogElementUI$3(EX2<Boolean> ex2, int i, Function0<Unit> function0, String str, Function0<Unit> function02, String str2, String str3, String str4) {
        super(2);
        this.$openDialog = ex2;
        this.$$dirty = i;
        this.$onConfirmListener = function0;
        this.$confirmText = str;
        this.$onDismissListener = function02;
        this.$dismissText = str2;
        this.$titleText = str3;
        this.$messageText = str4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [Et0] */
    /* JADX WARN: Type inference failed for: r3v3 */
    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(256730981, i, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous> (SimpleDialogElementUI.kt:23)");
        }
        EX2<Boolean> ex2 = this.$openDialog;
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n = interfaceC32720Et0.mo89539n(ex2);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new SimpleDialogElementUIKt$SimpleDialogElementUI$3$1$1(ex2);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        C25725lb.m27121a(mo89635G, C43575jt0.m29791b(interfaceC32720Et0, -1022002259, true, new C194132(this.$openDialog, this.$onConfirmListener, this.$$dirty, this.$confirmText)), null, C43575jt0.m29791b(interfaceC32720Et0, -2137970385, true, new C194153(this.$openDialog, this.$onDismissListener, this.$$dirty, this.$dismissText)), C43575jt0.m29791b(interfaceC32720Et0, 1599012848, true, new C194174(this.$titleText, this.$$dirty)), C43575jt0.m29791b(interfaceC32720Et0, 1041028785, true, new C194185(this.$messageText, this.$$dirty)), null, 0L, 0L, null, interfaceC32720Et0, 224304, 964);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
