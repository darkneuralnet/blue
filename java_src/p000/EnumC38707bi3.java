package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m28432d2 = {"Lbi3;", "", "", "b", "I", "()I", "mode", "<init>", "(Ljava/lang/String;II)V", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", "i", "interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: bi3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC38707bi3 {
    NO_OP(Integer.MIN_VALUE),
    SCAN_LEGACY(-2147483647),
    SCAN_OPPORTUNISTIC(-1),
    SCAN_LOW_POWER(0),
    SCAN_BALANCED(1),
    SCAN_LOW_LATENCY(2),
    CONNECT(Integer.MAX_VALUE);
    

    /* renamed from: b */
    public final int f57981b;

    EnumC38707bi3(int i) {
        this.f57981b = i;
    }

    /* renamed from: b */
    public final int m64098b() {
        return this.f57981b;
    }
}
