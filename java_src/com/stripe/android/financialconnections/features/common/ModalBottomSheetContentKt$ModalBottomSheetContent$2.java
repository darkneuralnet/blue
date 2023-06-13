package com.stripe.android.financialconnections.features.common;

import com.stripe.android.financialconnections.p041ui.TextResource;
import com.stripe.android.financialconnections.p041ui.sdui.BulletUI;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ModalBottomSheetContentKt$ModalBottomSheetContent$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ List<BulletUI> $bullets;
    final /* synthetic */ TextResource $connectedAccountNotice;
    final /* synthetic */ String $cta;
    final /* synthetic */ TextResource $learnMore;
    final /* synthetic */ Function1<String, Unit> $onClickableTextClick;
    final /* synthetic */ Function0<Unit> $onConfirmModalClick;
    final /* synthetic */ TextResource.Text $subtitle;
    final /* synthetic */ TextResource.Text $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModalBottomSheetContentKt$ModalBottomSheetContent$2(TextResource.Text text, TextResource.Text text2, Function1<? super String, Unit> function1, List<BulletUI> list, TextResource textResource, String str, TextResource textResource2, Function0<Unit> function0, int i) {
        super(2);
        this.$title = text;
        this.$subtitle = text2;
        this.$onClickableTextClick = function1;
        this.$bullets = list;
        this.$connectedAccountNotice = textResource;
        this.$cta = str;
        this.$learnMore = textResource2;
        this.$onConfirmModalClick = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        ModalBottomSheetContentKt.ModalBottomSheetContent(this.$title, this.$subtitle, this.$onClickableTextClick, this.$bullets, this.$connectedAccountNotice, this.$cta, this.$learnMore, this.$onConfirmModalClick, interfaceC32720Et0, this.$$changed | 1);
    }
}
