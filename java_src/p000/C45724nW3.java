package p000;

import android.graphics.Typeface;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.C32748Ew1;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, m28432d2 = {"LnW3;", "LmW3;", "LJw1;", "fontWeight", "LEw1;", "fontStyle", "Landroid/graphics/Typeface;", C17296a.f69688o, "(LJw1;I)Landroid/graphics/Typeface;", "LtB1;", "name", "b", "(LtB1;LJw1;I)Landroid/graphics/Typeface;", "", "genericFontFamily", "c", "(Ljava/lang/String;LJw1;I)Landroid/graphics/Typeface;", "<init>", "()V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: nW3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45724nW3 implements InterfaceC45131mW3 {
    @Override // p000.InterfaceC45131mW3
    /* renamed from: a */
    public Typeface mo20950a(C33918Jw1 fontWeight, int i) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return m23566c(null, fontWeight, i);
    }

    @Override // p000.InterfaceC45131mW3
    /* renamed from: b */
    public Typeface mo20949b(C49090tB1 name, C33918Jw1 fontWeight, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return m23566c(name.m12920b(), fontWeight, i);
    }

    /* renamed from: c */
    public final Typeface m23566c(String str, C33918Jw1 c33918Jw1, int i) {
        Typeface create;
        Typeface create2;
        boolean z;
        C32748Ew1.C2023a c2023a = C32748Ew1.f8309b;
        if (C32748Ew1.m108206f(i, c2023a.m108201b()) && Intrinsics.areEqual(c33918Jw1, C33918Jw1.f18784c.m99540d())) {
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
        if (str == null) {
            create = Typeface.DEFAULT;
        } else {
            create = Typeface.create(str, 0);
        }
        create2 = Typeface.create(create, c33918Jw1.m99544k(), C32748Ew1.m108206f(i, c2023a.m108202a()));
        Intrinsics.checkNotNullExpressionValue(create2, "create(\n            fami…ontStyle.Italic\n        )");
        return create2;
    }
}
