package p000;

import android.view.ViewStructure;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J6\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0007J@\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¨\u0006\u0019"}, m28432d2 = {"LAu;", "", "Landroid/view/ViewStructure;", "structure", "", "index", "b", "num", C17296a.f69688o, "id", "", "packageName", "typeName", "entryName", "", DateTokenConverter.CONVERTER_KEY, "left", "top", "scrollX", "scrollY", "width", "height", "c", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Au */
/* loaded from: classes.dex */
public final class C0299Au {

    /* renamed from: a */
    public static final C0299Au f1322a = new C0299Au();

    private C0299Au() {
    }

    /* renamed from: a */
    public final int m114971a(ViewStructure structure, int i) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        return structure.addChildCount(i);
    }

    /* renamed from: b */
    public final ViewStructure m114970b(ViewStructure structure, int i) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        return structure.newChild(i);
    }

    /* renamed from: c */
    public final void m114969c(ViewStructure structure, int i, int i2, int i3, int i4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        structure.setDimens(i, i2, i3, i4, i5, i6);
    }

    /* renamed from: d */
    public final void m114968d(ViewStructure structure, int i, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        structure.setId(i, str, str2, str3);
    }
}
