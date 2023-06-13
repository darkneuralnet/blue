package p000;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\"\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\u000e"}, m28432d2 = {"La70;", "", "Landroid/os/Bundle;", "bundle", "", "key", "Landroid/util/Size;", "value", "", C17296a.f69688o, "Landroid/util/SizeF;", "b", "<init>", "()V", "core-ktx_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: a70  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37767a70 {

    /* renamed from: a */
    public static final C37767a70 f49842a = new C37767a70();

    private C37767a70() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m71883a(Bundle bundle, String key, Size size) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putSize(key, size);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m71882b(Bundle bundle, String key, SizeF sizeF) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putSizeF(key, sizeF);
    }
}
