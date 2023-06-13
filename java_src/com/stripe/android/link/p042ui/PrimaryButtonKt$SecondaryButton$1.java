package com.stripe.android.link.p042ui;

import com.stripe.android.link.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.PrimaryButtonKt$SecondaryButton$1 */
/* loaded from: classes7.dex */
public final class PrimaryButtonKt$SecondaryButton$1 extends Lambda implements Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ String $label;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nPrimaryButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimaryButton.kt\ncom/stripe/android/link/ui/PrimaryButtonKt$SecondaryButton$1$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,206:1\n76#2:207\n*S KotlinDebug\n*F\n+ 1 PrimaryButton.kt\ncom/stripe/android/link/ui/PrimaryButtonKt$SecondaryButton$1$1\n*L\n201#1:207\n*E\n"})
    /* renamed from: com.stripe.android.link.ui.PrimaryButtonKt$SecondaryButton$1$1 */
    /* loaded from: classes7.dex */
    public static final class C190061 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ String $label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190061(String str, int i) {
            super(2);
            this.$label = str;
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
                C35528Qt0.m87816Z(-816714447, i, -1, "com.stripe.android.link.ui.SecondaryButton.<anonymous>.<anonymous> (PrimaryButton.kt:196)");
            }
            C38909c26.m62000e(this.$label, null, C47063pm0.m18743m(ThemeKt.getLinkColors(TM2.f35372a, interfaceC32720Et0, TM2.f35373b).m116541getSecondaryButtonLabel0d7_KjU(), ((Number) interfaceC32720Et0.mo89572c(C37220Xz0.m75931a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC32720Et0, (this.$$dirty >> 3) & 14, 0, 65530);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimaryButtonKt$SecondaryButton$1(boolean z, String str, int i) {
        super(3);
        this.$enabled = z;
        this.$label = str;
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
            C35528Qt0.m87816Z(1154361457, i, -1, "com.stripe.android.link.ui.SecondaryButton.<anonymous> (PrimaryButton.kt:193)");
        }
        W94[] w94Arr = new W94[1];
        w94Arr[0] = C37220Xz0.m75931a().m81907c(Float.valueOf(this.$enabled ? C36986Wz0.f42427a.m77587c(interfaceC32720Et0, C36986Wz0.f42428b) : C36986Wz0.f42427a.m77588b(interfaceC32720Et0, C36986Wz0.f42428b)));
        C41806gu0.m37353a(w94Arr, C43575jt0.m29791b(interfaceC32720Et0, -816714447, true, new C190061(this.$label, this.$$dirty)), interfaceC32720Et0, 56);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
