package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&j\u0002\b\u0007j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m28432d2 = {"LUx1;", "", "Ljava/math/BigDecimal;", "price", "Ljava/util/Currency;", "currency", "", "b", "<init>", "(Ljava/lang/String;I)V", "c", DateTokenConverter.CONVERTER_KEY, "localization_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ux1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC36501Ux1 {
    SHOW_NEVER { // from class: Ux1.c
        @Override // p000.EnumC36501Ux1
        /* renamed from: b */
        public boolean mo80587b(BigDecimal price, Currency currency) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(currency, "currency");
            return false;
        }
    },
    SHOW_ALWAYS { // from class: Ux1.a
        @Override // p000.EnumC36501Ux1
        /* renamed from: b */
        public boolean mo80587b(BigDecimal price, Currency currency) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(currency, "currency");
            if (currency.getDefaultFractionDigits() > 0) {
                return true;
            }
            return false;
        }
    },
    SHOW_IF_NON_ZERO { // from class: Ux1.b
        @Override // p000.EnumC36501Ux1
        /* renamed from: b */
        public boolean mo80587b(BigDecimal price, Currency currency) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(currency, "currency");
            return !C52509yx1.m2226a(price);
        }
    };

    /* synthetic */ EnumC36501Ux1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: b */
    public abstract boolean mo80587b(BigDecimal bigDecimal, Currency currency);
}
