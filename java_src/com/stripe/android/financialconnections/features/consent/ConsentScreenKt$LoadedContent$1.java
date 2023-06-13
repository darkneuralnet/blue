package com.stripe.android.financialconnections.features.consent;

import com.stripe.android.financialconnections.features.common.ModalBottomSheetContentKt;
import com.stripe.android.financialconnections.features.consent.ConsentState;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.LegalDetailsNotice;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ConsentScreenKt$LoadedContent$1 extends Lambda implements Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ ConsentState.BottomSheetContent $bottomSheetMode;
    final /* synthetic */ Function1<String, Unit> $onClickableTextClick;
    final /* synthetic */ Function0<Unit> $onConfirmModalClick;
    final /* synthetic */ ConsentState.Payload $payload;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConsentState.BottomSheetContent.values().length];
            try {
                iArr[ConsentState.BottomSheetContent.LEGAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConsentState.BottomSheetContent.DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConsentScreenKt$LoadedContent$1(ConsentState.BottomSheetContent bottomSheetContent, ConsentState.Payload payload, Function1<? super String, Unit> function1, Function0<Unit> function0, int i) {
        super(3);
        this.$bottomSheetMode = bottomSheetContent;
        this.$payload = payload;
        this.$onClickableTextClick = function1;
        this.$onConfirmModalClick = function0;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC35231Pm0 interfaceC35231Pm0, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC35231Pm0, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC35231Pm0 ModalBottomSheetLayout, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
        if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(663984294, i, -1, "com.stripe.android.financialconnections.features.consent.LoadedContent.<anonymous> (ConsentScreen.kt:328)");
        }
        ConsentState.BottomSheetContent bottomSheetContent = this.$bottomSheetMode;
        int i2 = bottomSheetContent == null ? -1 : WhenMappings.$EnumSwitchMapping$0[bottomSheetContent.ordinal()];
        if (i2 == -1) {
            interfaceC32720Et0.mo89638F(42979895);
            interfaceC32720Et0.mo89605Q();
        } else if (i2 == 1) {
            interfaceC32720Et0.mo89638F(42979323);
            LegalDetailsNotice legalDetailsNotice = this.$payload.getConsent().getLegalDetailsNotice();
            Function1<String, Unit> function1 = this.$onClickableTextClick;
            Function0<Unit> function0 = this.$onConfirmModalClick;
            int i3 = this.$$dirty;
            ModalBottomSheetContentKt.LegalDetailsBottomSheetContent(legalDetailsNotice, function1, function0, interfaceC32720Et0, ((i3 >> 12) & 896) | ((i3 >> 12) & 112) | 8);
            interfaceC32720Et0.mo89605Q();
        } else if (i2 != 2) {
            interfaceC32720Et0.mo89638F(42979911);
            interfaceC32720Et0.mo89605Q();
        } else {
            interfaceC32720Et0.mo89638F(42979628);
            DataAccessNotice dataAccessNotice = this.$payload.getConsent().getDataAccessNotice();
            Function1<String, Unit> function12 = this.$onClickableTextClick;
            Function0<Unit> function02 = this.$onConfirmModalClick;
            int i4 = this.$$dirty;
            ModalBottomSheetContentKt.DataAccessBottomSheetContent(dataAccessNotice, function12, function02, interfaceC32720Et0, ((i4 >> 12) & 896) | ((i4 >> 12) & 112) | 8);
            interfaceC32720Et0.mo89605Q();
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
