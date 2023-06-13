package co.bird.android.model.constant;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PaymentMethod$label$1 extends Lambda implements Function1<String, CharSequence> {
    public static final PaymentMethod$label$1 INSTANCE = new PaymentMethod$label$1();

    public PaymentMethod$label$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(String it) {
        String capitalize;
        Intrinsics.checkNotNullParameter(it, "it");
        capitalize = StringsKt__StringsJVMKt.capitalize(it);
        return capitalize;
    }
}
