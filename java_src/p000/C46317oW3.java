package p000;

import android.graphics.Typeface;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0014\u001a\u00020\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, m28432d2 = {"LoW3;", "LmW3;", "LJw1;", "fontWeight", "LEw1;", "fontStyle", "Landroid/graphics/Typeface;", C17296a.f69688o, "(LJw1;I)Landroid/graphics/Typeface;", "LtB1;", "name", "b", "(LtB1;LJw1;I)Landroid/graphics/Typeface;", "", "familyName", "weight", "style", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;LJw1;I)Landroid/graphics/Typeface;", "genericFontFamily", "c", "<init>", "()V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: oW3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46317oW3 implements InterfaceC45131mW3 {
    @Override // p000.InterfaceC45131mW3
    /* renamed from: a */
    public Typeface mo20950a(C33918Jw1 fontWeight, int i) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return m20948c(null, fontWeight, i);
    }

    @Override // p000.InterfaceC45131mW3
    /* renamed from: b */
    public Typeface mo20949b(C49090tB1 name, C33918Jw1 fontWeight, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        Typeface m20947d = m20947d(C46910pW3.m19152b(name.m12920b(), fontWeight), fontWeight, i);
        if (m20947d == null) {
            return m20948c(name.m12920b(), fontWeight, i);
        }
        return m20947d;
    }

    /* renamed from: c */
    public final Typeface m20948c(String str, C33918Jw1 c33918Jw1, int i) {
        boolean z;
        boolean z2 = false;
        if (C32748Ew1.m108206f(i, C32748Ew1.f8309b.m108201b()) && Intrinsics.areEqual(c33918Jw1, C33918Jw1.f18784c.m99540d())) {
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                Typeface DEFAULT = Typeface.DEFAULT;
                Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
                return DEFAULT;
            }
        }
        int m95135c = C5319Mc.m95135c(c33918Jw1, i);
        if (str == null || str.length() == 0) {
            z2 = true;
        }
        if (z2) {
            Typeface defaultFromStyle = Typeface.defaultFromStyle(m95135c);
            Intrinsics.checkNotNullExpressionValue(defaultFromStyle, "{\n            Typeface.d…le(targetStyle)\n        }");
            return defaultFromStyle;
        }
        Typeface create = Typeface.create(str, m95135c);
        Intrinsics.checkNotNullExpressionValue(create, "{\n            Typeface.c…y, targetStyle)\n        }");
        return create;
    }

    /* renamed from: d */
    public final Typeface m20947d(String str, C33918Jw1 c33918Jw1, int i) {
        boolean z;
        boolean z2 = true;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        Typeface m20948c = m20948c(str, c33918Jw1, i);
        if (Intrinsics.areEqual(m20948c, Typeface.create(Typeface.DEFAULT, C5319Mc.m95135c(c33918Jw1, i))) || Intrinsics.areEqual(m20948c, m20948c(null, c33918Jw1, i))) {
            z2 = false;
        }
        if (!z2) {
            return null;
        }
        return m20948c;
    }
}
