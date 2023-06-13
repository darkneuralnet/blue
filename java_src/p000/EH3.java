package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004j\u0002\b\u0003j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m28432d2 = {"LEH3;", "", "", "b", "()Ljava/lang/String;", "stageName", "<init>", "(Ljava/lang/String;I)V", "c", DateTokenConverter.CONVERTER_KEY, "co.bird.android.feature.ar-parking"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: EH3 */
/* loaded from: classes3.dex */
public enum EH3 {
    SURROUNDINGS,
    FIND_PARKING,
    ANCHOR;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: EH3$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C1772a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EH3.values().length];
            try {
                iArr[EH3.SURROUNDINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EH3.FIND_PARKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EH3.ANCHOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: b */
    public final String m109246b() {
        int i = C1772a.$EnumSwitchMapping$0[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "scan_bird";
                }
                throw new NoWhenBranchMatchedException();
            }
            return "find_parking";
        }
        return "scan_surroundings";
    }
}
