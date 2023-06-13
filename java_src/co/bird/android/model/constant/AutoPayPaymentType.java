package co.bird.android.model.constant;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/constant/AutoPayPaymentType;", "", "(Ljava/lang/String;I)V", "GOOGLE_PAY", "PAYPAL", "CARD", "Companion", "model-constant"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum AutoPayPaymentType {
    GOOGLE_PAY,
    PAYPAL,
    CARD;
    
    public static final Companion Companion = new Companion(null);
    private static final List<AutoPayPaymentType> DEFAULT_OPTIONS;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"Lco/bird/android/model/constant/AutoPayPaymentType$Companion;", "", "()V", "DEFAULT_OPTIONS", "", "Lco/bird/android/model/constant/AutoPayPaymentType;", "getDEFAULT_OPTIONS", "()Ljava/util/List;", "model-constant"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<AutoPayPaymentType> getDEFAULT_OPTIONS() {
            return AutoPayPaymentType.DEFAULT_OPTIONS;
        }

        private Companion() {
        }
    }

    static {
        AutoPayPaymentType autoPayPaymentType;
        AutoPayPaymentType autoPayPaymentType2;
        AutoPayPaymentType autoPayPaymentType3;
        r0 = CollectionsKt__CollectionsKt.listOf((Object[]) new AutoPayPaymentType[]{autoPayPaymentType, autoPayPaymentType2, autoPayPaymentType3});
        DEFAULT_OPTIONS = r0;
    }
}
