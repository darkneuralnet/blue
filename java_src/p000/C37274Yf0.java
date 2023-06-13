package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.card.api.model.Brand;
import com.facebook.share.internal.C17296a;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC51188wj6;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\tJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\tH\u0002¨\u0006\u001a"}, m28432d2 = {"LYf0;", "", "", "number", "", "enableLuhnCheck", "LYk1;", "e", "(Ljava/lang/String;Ljava/lang/Boolean;)LYk1;", "Lvi1;", "expiryDate", "f", "securityCode", "LT11;", "cardType", "g", "normalizedNumber", "c", C17296a.f69688o, "", "month", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Calendar;", "b", "<init>", "()V", "card_release"}, m28431k = 1, m28430mv = {1, 5, 1})
/* renamed from: Yf0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37274Yf0 {

    /* renamed from: a */
    public static final C37274Yf0 f46219a = new C37274Yf0();

    private C37274Yf0() {
    }

    /* renamed from: a */
    public final boolean m74606a(C50580vi1 c50580vi1) {
        if (c50580vi1 != C50580vi1.f114526d && c50580vi1.m8246a() != 0 && c50580vi1.m8245b() != 0 && m74603d(c50580vi1.m8246a()) && c50580vi1.m8245b() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final Calendar m74605b(C50580vi1 c50580vi1) {
        Calendar expiryCalendar = Calendar.getInstance();
        expiryCalendar.clear();
        expiryCalendar.set(c50580vi1.m8245b(), c50580vi1.m8246a() - 1, 1);
        expiryCalendar.add(2, 1);
        expiryCalendar.add(5, -1);
        Intrinsics.checkNotNullExpressionValue(expiryCalendar, "expiryCalendar");
        return expiryCalendar;
    }

    /* renamed from: c */
    public final boolean m74604c(String str) {
        int i;
        int i2;
        String stringBuffer = new StringBuffer(str).reverse().toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer, "StringBuffer(normalizedNumber).reverse().toString()");
        int length = stringBuffer.length() - 1;
        if (length >= 0) {
            int i3 = 0;
            i = 0;
            i2 = 0;
            while (true) {
                int i4 = i3 + 1;
                int digit = Character.digit(stringBuffer.charAt(i3), 10);
                if (i3 % 2 == 0) {
                    i2 += digit;
                } else {
                    i += digit * 2;
                    if (digit >= 5) {
                        i -= 9;
                    }
                }
                if (i4 > length) {
                    break;
                }
                i3 = i4;
            }
        } else {
            i = 0;
            i2 = 0;
        }
        if ((i2 + i) % 10 != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean m74603d(int i) {
        return 1 <= i && i <= 12;
    }

    /* renamed from: e */
    public final C37320Yk1<String> m74602e(String number, Boolean bool) {
        AbstractC51188wj6 c29948a;
        Intrinsics.checkNotNullParameter(number, "number");
        String m36365b = C42132hS5.m36365b(number, new char[0]);
        Intrinsics.checkNotNullExpressionValue(m36365b, "normalize(number)");
        int length = m36365b.length();
        if (!C42132hS5.m36366a(m36365b, new char[0])) {
            c29948a = new AbstractC51188wj6.C29948a(C37557Zk4.checkout_card_number_not_valid);
        } else if (length <= 19 && length >= 8) {
            if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                c29948a = AbstractC51188wj6.C29949b.f116411a;
            } else if (m74604c(m36365b)) {
                c29948a = AbstractC51188wj6.C29949b.f116411a;
            } else {
                c29948a = new AbstractC51188wj6.C29948a(C37557Zk4.checkout_card_number_not_valid);
            }
        } else {
            c29948a = new AbstractC51188wj6.C29948a(C37557Zk4.checkout_card_number_not_valid);
        }
        return new C37320Yk1<>(number, c29948a);
    }

    /* renamed from: f */
    public final C37320Yk1<C50580vi1> m74601f(C50580vi1 expiryDate) {
        Intrinsics.checkNotNullParameter(expiryDate, "expiryDate");
        if (m74606a(expiryDate)) {
            Calendar m74605b = m74605b(expiryDate);
            Calendar calendar = Calendar.getInstance();
            calendar.add(1, 30);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(2, -3);
            if (m74605b.compareTo(calendar2) >= 0 && m74605b.compareTo(calendar) <= 0) {
                return new C37320Yk1<>(expiryDate, AbstractC51188wj6.C29949b.f116411a);
            }
        }
        return new C37320Yk1<>(expiryDate, new AbstractC51188wj6.C29948a(C37557Zk4.checkout_expiry_date_not_valid));
    }

    /* renamed from: g */
    public final C37320Yk1<String> m74600g(String securityCode, T11 t11) {
        Brand.EnumC16802c m84422c;
        EnumC37040Xf0 m84423b;
        Intrinsics.checkNotNullParameter(securityCode, "securityCode");
        String m36365b = C42132hS5.m36365b(securityCode, new char[0]);
        Intrinsics.checkNotNullExpressionValue(m36365b, "normalize(securityCode)");
        int length = m36365b.length();
        AbstractC51188wj6 c29948a = new AbstractC51188wj6.C29948a(C37557Zk4.checkout_security_code_not_valid);
        if (C42132hS5.m36366a(m36365b, new char[0])) {
            EnumC37040Xf0 enumC37040Xf0 = null;
            if (t11 == null) {
                m84422c = null;
            } else {
                m84422c = t11.m84422c();
            }
            if (m84422c == Brand.EnumC16802c.OPTIONAL && length == 0) {
                c29948a = AbstractC51188wj6.C29949b.f116411a;
            } else {
                if (t11 == null) {
                    m84423b = null;
                } else {
                    m84423b = t11.m84423b();
                }
                EnumC37040Xf0 enumC37040Xf02 = EnumC37040Xf0.AMERICAN_EXPRESS;
                if (m84423b == enumC37040Xf02 && length == 4) {
                    c29948a = AbstractC51188wj6.C29949b.f116411a;
                } else {
                    if (t11 != null) {
                        enumC37040Xf0 = t11.m84423b();
                    }
                    if (enumC37040Xf0 != enumC37040Xf02 && length == 3) {
                        c29948a = AbstractC51188wj6.C29949b.f116411a;
                    }
                }
            }
        }
        return new C37320Yk1<>(m36365b, c29948a);
    }
}
