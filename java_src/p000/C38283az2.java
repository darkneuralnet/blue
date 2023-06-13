package p000;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, m28432d2 = {"Laz2;", "Lfy0;", "Landroid/graphics/drawable/BitmapDrawable;", "i", "", "logoUrl", "<init>", "(Ljava/lang/String;)V", "components-core_release"}, m28431k = 1, m28430mv = {1, 5, 1})
/* renamed from: az2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38283az2 extends AbstractCallableC41253fy0<BitmapDrawable> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38283az2(String logoUrl) {
        super(logoUrl);
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: i */
    public BitmapDrawable call() throws IOException {
        String str;
        str = C38876bz2.f59844a;
        C32290Cx2.m111209f(str, Intrinsics.stringPlus("call - ", Integer.valueOf(m40409d().hashCode())));
        byte[] m40412a = m40412a();
        Intrinsics.checkNotNullExpressionValue(m40412a, "get()");
        return new BitmapDrawable(Resources.getSystem(), BitmapFactory.decodeByteArray(m40412a, 0, m40412a.length));
    }
}
