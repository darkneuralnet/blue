package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bj\u0002\b\bj\u0002\b\nj\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m28432d2 = {"LgR4;", "", "LIc0;", "", "toString", "", "b", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Integer;)V", "fine", "<init>", "(Ljava/lang/String;I)V", "e", "f", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: gR4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC41529gR4 implements InterfaceC33503Ic0 {
    NO_PARKING { // from class: gR4.d
        @Override // p000.InterfaceC33503Ic0
        /* renamed from: a */
        public void mo39468a(Integer num) {
            m39469d(num);
        }
    },
    NO_HOT_ZONE { // from class: gR4.c
        @Override // p000.InterfaceC33503Ic0
        /* renamed from: a */
        public void mo39468a(Integer num) {
        }
    },
    NO_COUPON_DESTINATION { // from class: gR4.b
        @Override // p000.InterfaceC33503Ic0
        /* renamed from: a */
        public void mo39468a(Integer num) {
        }
    },
    GOOD_PARKING_REMINDER { // from class: gR4.a
        @Override // p000.InterfaceC33503Ic0
        /* renamed from: a */
        public void mo39468a(Integer num) {
        }
    };
    

    /* renamed from: b */
    public Integer f82196b;

    /* synthetic */ EnumC41529gR4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: c */
    public final Integer m39470c() {
        return this.f82196b;
    }

    /* renamed from: d */
    public final void m39469d(Integer num) {
        this.f82196b = num;
    }

    @Override // java.lang.Enum
    public String toString() {
        String name = name();
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        String lowerCase = name.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}
