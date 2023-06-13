package p000;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0016\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\b\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\n\u001a\u00020\t*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¨\u0006\u000b"}, m28432d2 = {"Landroid/content/res/TypedArray;", "", "index", "", C17296a.f69688o, "b", "Landroid/graphics/drawable/Drawable;", "c", DateTokenConverter.CONVERTER_KEY, "", "e", "core-ktx_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: Gb6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33032Gb6 {
    /* renamed from: a */
    public static final void m104983a(TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            return;
        }
        throw new IllegalArgumentException("Attribute not defined in set.");
    }

    /* renamed from: b */
    public static final int m104982b(TypedArray typedArray, int i) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        m104983a(typedArray, i);
        return typedArray.getDimensionPixelSize(i, 0);
    }

    /* renamed from: c */
    public static final Drawable m104981c(TypedArray typedArray, int i) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        m104983a(typedArray, i);
        Drawable drawable = typedArray.getDrawable(i);
        Intrinsics.checkNotNull(drawable);
        return drawable;
    }

    /* renamed from: d */
    public static final int m104980d(TypedArray typedArray, int i) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        m104983a(typedArray, i);
        return typedArray.getResourceId(i, 0);
    }

    /* renamed from: e */
    public static final String m104979e(TypedArray typedArray, int i) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        m104983a(typedArray, i);
        String string = typedArray.getString(i);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Attribute value could not be coerced to String.".toString());
    }
}
