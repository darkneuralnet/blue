package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m28432d2 = {"Lx24;", "", "", "toString", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: x24  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC51375x24 {
    NONE,
    SEE_PRICING,
    SEE_UPDATED_PRICING,
    LEGACY;

    @Override // java.lang.Enum
    public String toString() {
        String lowerCase = name().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }
}