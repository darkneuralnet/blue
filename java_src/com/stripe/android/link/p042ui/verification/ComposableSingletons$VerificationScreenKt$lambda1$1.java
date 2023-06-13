package com.stripe.android.link.p042ui.verification;

import androidx.compose.p003ui.focus.C11309h;
import com.stripe.android.link.C18975R;
import com.stripe.android.p049ui.core.elements.OTPSpec;
import com.stripe.android.uicore.elements.OTPElement;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "invoke", "(LEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVerificationScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerificationScreen.kt\ncom/stripe/android/link/ui/verification/ComposableSingletons$VerificationScreenKt$lambda-1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,312:1\n25#2:313\n1057#3,6:314\n*S KotlinDebug\n*F\n+ 1 VerificationScreen.kt\ncom/stripe/android/link/ui/verification/ComposableSingletons$VerificationScreenKt$lambda-1$1\n*L\n70#1:313\n70#1:314,6\n*E\n"})
/* renamed from: com.stripe.android.link.ui.verification.ComposableSingletons$VerificationScreenKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes7.dex */
public final class ComposableSingletons$VerificationScreenKt$lambda1$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    public static final ComposableSingletons$VerificationScreenKt$lambda1$1 INSTANCE = new ComposableSingletons$VerificationScreenKt$lambda1$1();

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.ui.verification.ComposableSingletons$VerificationScreenKt$lambda-1$1$2 */
    /* loaded from: classes7.dex */
    public static final class C190532 extends Lambda implements Function0<Unit> {
        public static final C190532 INSTANCE = new C190532();

        public C190532() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.ui.verification.ComposableSingletons$VerificationScreenKt$lambda-1$1$3 */
    /* loaded from: classes7.dex */
    public static final class C190543 extends Lambda implements Function0<Unit> {
        public static final C190543 INSTANCE = new C190543();

        public C190543() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.ui.verification.ComposableSingletons$VerificationScreenKt$lambda-1$1$4 */
    /* loaded from: classes7.dex */
    public static final class C190554 extends Lambda implements Function0<Unit> {
        public static final C190554 INSTANCE = new C190554();

        public C190554() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public ComposableSingletons$VerificationScreenKt$lambda1$1() {
        super(2);
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
            C35528Qt0.m87816Z(-2011683056, i, -1, "com.stripe.android.link.ui.verification.ComposableSingletons$VerificationScreenKt.lambda-1.<anonymous> (VerificationScreen.kt:58)");
        }
        int i2 = C18975R.string.verification_header;
        int i3 = C18975R.string.verification_message;
        OTPElement transform = OTPSpec.INSTANCE.transform();
        interfaceC32720Et0.mo89638F(-492369756);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new C11309h();
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        VerificationScreenKt.VerificationBody(i2, i3, true, "+1********23", "test@stripe.com", transform, false, false, null, (C11309h) mo89635G, C190532.INSTANCE, C190543.INSTANCE, C190554.INSTANCE, interfaceC32720Et0, (OTPElement.$stable << 15) | 114847104 | (C11309h.f52989c << 27), 438);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
