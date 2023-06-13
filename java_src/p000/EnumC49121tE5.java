package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002j\u0002\b\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m28432d2 = {"LtE5;", "", "", "b", "<init>", "(Ljava/lang/String;I)V", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: tE5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC49121tE5 {
    PRIVATE_BIRD,
    PENDING_ITEM_LEASE_BIRD,
    RETURNING_ITEM_LEASE_BIRD,
    ACTIVE_ITEM_LEASE_BIRD,
    RIDDEN_BIRD,
    UNKNOWN;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tE5$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C28662a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC49121tE5.values().length];
            try {
                iArr[EnumC49121tE5.RIDDEN_BIRD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: b */
    public final String m12566b() {
        if (C28662a.$EnumSwitchMapping$0[ordinal()] == 1) {
            return "ride";
        }
        String lowerCase = name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }
}
