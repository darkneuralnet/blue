package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\f\n\u0002\b\f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m28432d2 = {"LjH6;", "", "", "b", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "begin", "c", "end", "<init>", "(Ljava/lang/String;ICC)V", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: jH6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC43220jH6 {
    OBJ(CoreConstants.CURLY_LEFT, CoreConstants.CURLY_RIGHT),
    LIST('[', ']'),
    MAP(CoreConstants.CURLY_LEFT, CoreConstants.CURLY_RIGHT),
    POLY_OBJ('[', ']');
    
    @JvmField

    /* renamed from: b */
    public final char f92430b;
    @JvmField

    /* renamed from: c */
    public final char f92431c;

    EnumC43220jH6(char c, char c2) {
        this.f92430b = c;
        this.f92431c = c2;
    }
}
