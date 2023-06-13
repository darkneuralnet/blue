package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.adyen.checkout.card.api.model.Brand;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001d"}, m28432d2 = {"LT11;", "", "LXf0;", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "LXf0;", "b", "()LXf0;", "cardType", "Z", "isReliable", "()Z", "c", DateTokenConverter.CONVERTER_KEY, "enableLuhnCheck", "Lcom/adyen/checkout/card/api/model/Brand$c;", "Lcom/adyen/checkout/card/api/model/Brand$c;", "()Lcom/adyen/checkout/card/api/model/Brand$c;", "cvcPolicy", "e", "expiryDatePolicy", "<init>", "(LXf0;ZZLcom/adyen/checkout/card/api/model/Brand$c;Lcom/adyen/checkout/card/api/model/Brand$c;)V", "card_release"}, m28431k = 1, m28430mv = {1, 5, 1})
/* renamed from: T11 */
/* loaded from: classes.dex */
public final class T11 {

    /* renamed from: a */
    public final EnumC37040Xf0 f34637a;

    /* renamed from: b */
    public final boolean f34638b;

    /* renamed from: c */
    public final boolean f34639c;

    /* renamed from: d */
    public final Brand.EnumC16802c f34640d;

    /* renamed from: e */
    public final Brand.EnumC16802c f34641e;

    public T11(EnumC37040Xf0 cardType, boolean z, boolean z2, Brand.EnumC16802c cvcPolicy, Brand.EnumC16802c expiryDatePolicy) {
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        Intrinsics.checkNotNullParameter(cvcPolicy, "cvcPolicy");
        Intrinsics.checkNotNullParameter(expiryDatePolicy, "expiryDatePolicy");
        this.f34637a = cardType;
        this.f34638b = z;
        this.f34639c = z2;
        this.f34640d = cvcPolicy;
        this.f34641e = expiryDatePolicy;
    }

    /* renamed from: a */
    public final EnumC37040Xf0 m84424a() {
        return this.f34637a;
    }

    /* renamed from: b */
    public final EnumC37040Xf0 m84423b() {
        return this.f34637a;
    }

    /* renamed from: c */
    public final Brand.EnumC16802c m84422c() {
        return this.f34640d;
    }

    /* renamed from: d */
    public final boolean m84421d() {
        return this.f34639c;
    }

    /* renamed from: e */
    public final Brand.EnumC16802c m84420e() {
        return this.f34641e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof T11) {
            T11 t11 = (T11) obj;
            return this.f34637a == t11.f34637a && this.f34638b == t11.f34638b && this.f34639c == t11.f34639c && this.f34640d == t11.f34640d && this.f34641e == t11.f34641e;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f34637a.hashCode() * 31;
        boolean z = this.f34638b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f34639c;
        return ((((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.f34640d.hashCode()) * 31) + this.f34641e.hashCode();
    }

    public String toString() {
        return "DetectedCardType(cardType=" + this.f34637a + ", isReliable=" + this.f34638b + ", enableLuhnCheck=" + this.f34639c + ", cvcPolicy=" + this.f34640d + ", expiryDatePolicy=" + this.f34641e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
