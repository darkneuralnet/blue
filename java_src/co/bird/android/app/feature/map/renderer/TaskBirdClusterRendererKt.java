package co.bird.android.app.feature.map.renderer;

import co.bird.android.model.constant.BountyKind;
import co.bird.android.model.wire.WireBird;
import java.util.Currency;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0002\"\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "LUx1;", "fractionOption", "", "priceLabel", "", "dispatchDrawable", "MAX_LABEL_LENGTH", "I", "co.bird.android.feature.map"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTaskBirdClusterRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskBirdClusterRenderer.kt\nco/bird/android/app/feature/map/renderer/TaskBirdClusterRendererKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,379:1\n429#2:380\n502#2,5:381\n*S KotlinDebug\n*F\n+ 1 TaskBirdClusterRenderer.kt\nco/bird/android/app/feature/map/renderer/TaskBirdClusterRendererKt\n*L\n366#1:380\n366#1:381,5\n*E\n"})
/* loaded from: classes2.dex */
public final class TaskBirdClusterRendererKt {
    private static final int MAX_LABEL_LENGTH = 3;

    /* JADX INFO: Access modifiers changed from: private */
    public static final int dispatchDrawable(WireBird wireBird) {
        if (wireBird.getBountyKind() == BountyKind.SPECIAL_TASK_DISPATCH_REBALANCE) {
            return C48193rg4.ic_rebalance_white;
        }
        return C48193rg4.ic_charge_white;
    }

    public static final String priceLabel(WireBird wireBird, EnumC36501Ux1 fractionOption) {
        long j;
        boolean isWhitespace;
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        Intrinsics.checkNotNullParameter(fractionOption, "fractionOption");
        Currency m25591o = C45097mS5.m25591o(wireBird.getBountyCurrency());
        C51916xx1 c51916xx1 = C51916xx1.f118396a;
        Integer bountyPrice = wireBird.getBountyPrice();
        if (bountyPrice != null) {
            j = bountyPrice.intValue();
        } else {
            j = 0;
        }
        String m4408d = c51916xx1.m4408d(j, m25591o, fractionOption);
        String symbol = m25591o.getSymbol();
        String symbolUS = m25591o.getSymbol(Locale.US);
        if (symbolUS.length() < symbol.length()) {
            Intrinsics.checkNotNullExpressionValue(symbol, "symbol");
            Intrinsics.checkNotNullExpressionValue(symbolUS, "symbolUS");
            m4408d = StringsKt__StringsJVMKt.replace$default(m4408d, symbol, symbolUS, false, 4, (Object) null);
        }
        if (m4408d.length() > 3) {
            StringBuilder sb = new StringBuilder();
            int length = m4408d.length();
            for (int i = 0; i < length; i++) {
                char charAt = m4408d.charAt(i);
                isWhitespace = CharsKt__CharJVMKt.isWhitespace(charAt);
                if (!isWhitespace) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "filterTo(StringBuilder(), predicate).toString()");
            return sb2;
        }
        return m4408d;
    }
}
