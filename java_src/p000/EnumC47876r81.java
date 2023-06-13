package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016j\u0002\b\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m28432d2 = {"Lr81;", "", "", "value", "b", "<init>", "(Ljava/lang/String;I)V", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", "config_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: r81  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC47876r81 {
    RECURRENT_NTH_EVENT_COUNT_PREFIX,
    CONTEXTUAL_TUTORIAL,
    HAS_SEEN_PHYSICAL_LOCK_TUTORIAL,
    SMARTLOCK_SET_TO_FACTORY_KEYS,
    HAS_SEEN_PRIVATE_BIRD_PHYSICAL_LOCK_TUTORIAL,
    PRIVATE_BIRD_CONTEXTUAL_TUTORIAL,
    SELECTED_FILTER_OPTIONS;

    /* renamed from: b */
    public String m16446b(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        String lowerCase = name().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase + "_" + value;
    }
}
