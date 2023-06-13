package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001d\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#¨\u0006$"}, m28432d2 = {"LfN1;", "", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "host", "", "c", "I", "()I", "port", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "config_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: fN1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC40897fN1 {
    API_BIRD("api-bird", 8080),
    API_COUPON("api-coupon", 8080),
    API_REPAIR("api-repair", 9730),
    API_INVENTORY("api-inventory", 7000),
    API_ASSET("api-asset", 9000),
    POWERLINE("pl", 8081),
    API_BLUETOOTHTRACE("api-bluetoothtrace", 8100),
    API_RADAR("api-radar", 8200),
    API_RIDER("api-rider", 8080),
    API_ANALYTICS("api-analytics", 8080),
    API_IDENTIFICATION("api-identification", 7453),
    API_ITEM_LEASE("api-itemlease", 8080),
    API_LOCALIZATION("api-localization", 8080),
    API_PAYMENT("api-payment", 8080),
    API_SUBSCRIPTION("api-subscription", 8080),
    API_RELEASE("api-release", 8080),
    API_BIRDPLUS("api-birdplus", 8080),
    API_ASSEMBLY("api-assembly", 7930),
    API_SURPLUS("api-surplus", 8080),
    API_BOUNTY("api-bounty", 8080),
    API_COMPLAINT("api-complaint", 5210),
    API_COMMUNICATION("api-communication", 5210);
    

    /* renamed from: b */
    public final String f80019b;

    /* renamed from: c */
    public final int f80020c;

    EnumC40897fN1(String str, int i) {
        this.f80019b = str;
        this.f80020c = i;
    }

    /* renamed from: b */
    public final String m41479b() {
        return this.f80019b;
    }

    /* renamed from: c */
    public final int m41478c() {
        return this.f80020c;
    }
}
