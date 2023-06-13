package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import p000.W06;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007\u001a'\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, m28432d2 = {"LG26;", "start", "stop", "", "fraction", "c", "style", "Lpm2;", "direction", DateTokenConverter.CONVERTER_KEY, "layoutDirection", "LW06;", "textDirection", "e", "(Lpm2;LW06;)I", "LdW3;", "platformSpanStyle", "LZV3;", "platformParagraphStyle", "LlW3;", "b", "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: H26 */
/* loaded from: classes.dex */
public final class H26 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: H26$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C3012a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC47065pm2.values().length];
            try {
                iArr[EnumC47065pm2.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC47065pm2.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: b */
    public static final C44538lW3 m104479b(C39795dW3 c39795dW3, ZV3 zv3) {
        if (c39795dW3 == null && zv3 == null) {
            return null;
        }
        return C7488Sd.m85183a(c39795dW3, zv3);
    }

    /* renamed from: c */
    public static final G26 m104478c(G26 start, G26 stop, float f) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return new G26(HN5.m103926b(start.m105925L(), stop.m105925L(), f), EE3.m109281a(start.m105926K(), stop.m105926K(), f));
    }

    /* renamed from: d */
    public static final G26 m104477d(G26 style, EnumC47065pm2 direction) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new G26(HN5.m103922f(style.m105936A()), EE3.m109279c(style.m105901x(), direction), style.m105900y());
    }

    /* renamed from: e */
    public static final int m104476e(EnumC47065pm2 layoutDirection, W06 w06) {
        boolean m78950i;
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        W06.C8909a c8909a = W06.f40244b;
        int m78946a = c8909a.m78946a();
        if (w06 == null) {
            m78950i = false;
        } else {
            m78950i = W06.m78950i(w06.m78947l(), m78946a);
        }
        if (m78950i) {
            int i = C3012a.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return c8909a.m78944c();
                }
                throw new NoWhenBranchMatchedException();
            }
            return c8909a.m78945b();
        } else if (w06 == null) {
            int i2 = C3012a.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    return c8909a.m78942e();
                }
                throw new NoWhenBranchMatchedException();
            }
            return c8909a.m78943d();
        } else {
            return w06.m78947l();
        }
    }
}
