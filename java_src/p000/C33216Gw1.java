package p000;

import android.graphics.Typeface;
import android.os.Build;
import com.facebook.share.internal.C17296a;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.C33918Jw1;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\t\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, m28432d2 = {"LFw1;", "", "typeface", "Lew1;", PaymentSheetEvent.FIELD_FONT, "LJw1;", "requestedWeight", "LEw1;", "requestedStyle", C17296a.f69688o, "(ILjava/lang/Object;Lew1;LJw1;I)Ljava/lang/Object;", "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Gw1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33216Gw1 {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m104572a(int i, Object typeface, InterfaceC40641ew1 font, C33918Jw1 requestedWeight, int i2) {
        boolean z;
        boolean z2;
        int m99544k;
        boolean m108206f;
        Typeface m1011a;
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        Intrinsics.checkNotNullParameter(font, "font");
        Intrinsics.checkNotNullParameter(requestedWeight, "requestedWeight");
        if (!(typeface instanceof Typeface)) {
            return typeface;
        }
        boolean z3 = true;
        if (C32982Fw1.m106235k(i) && !Intrinsics.areEqual(font.mo39574b(), requestedWeight)) {
            C33918Jw1.C4281a c4281a = C33918Jw1.f18784c;
            if (requestedWeight.compareTo(C5319Mc.m95137a(c4281a)) >= 0 && font.mo39574b().compareTo(C5319Mc.m95137a(c4281a)) < 0) {
                z = true;
                if (!C32982Fw1.m106236j(i) && !C32748Ew1.m108206f(i2, font.mo39573c())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && !z) {
                    return typeface;
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    if (!z2 || !C32748Ew1.m108206f(i2, C32748Ew1.f8309b.m108202a())) {
                        z3 = false;
                    }
                    m1011a = Typeface.create((Typeface) typeface, C5319Mc.m95136b(z, z3));
                } else {
                    if (z) {
                        m99544k = requestedWeight.m99544k();
                    } else {
                        m99544k = font.mo39574b().m99544k();
                    }
                    if (z2) {
                        m108206f = C32748Ew1.m108206f(i2, C32748Ew1.f8309b.m108202a());
                    } else {
                        m108206f = C32748Ew1.m108206f(font.mo39573c(), C32748Ew1.f8309b.m108202a());
                    }
                    m1011a = C52897zc6.f121635a.m1011a((Typeface) typeface, m99544k, m108206f);
                }
                Intrinsics.checkNotNullExpressionValue(m1011a, "if (Build.VERSION.SDK_IN…ht, finalFontStyle)\n    }");
                return m1011a;
            }
        }
        z = false;
        if (!C32982Fw1.m106236j(i)) {
        }
        z2 = false;
        if (z2) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
        }
        Intrinsics.checkNotNullExpressionValue(m1011a, "if (Build.VERSION.SDK_IN…ht, finalFontStyle)\n    }");
        return m1011a;
    }
}
