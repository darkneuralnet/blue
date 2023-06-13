package p000;

import android.graphics.Bitmap;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B3\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u000e\u0010\r\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001f\u0010\r\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0003\u0010\u0015¨\u0006\u0019"}, m28432d2 = {"LQX1;", "", "LNX1;", C17296a.f69688o, "LNX1;", "c", "()LNX1;", "request", "Ljava/lang/Exception;", "Lkotlin/Exception;", "b", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "error", "", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "isCachedRedirect", "Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "bitmap", "<init>", "(LNX1;Ljava/lang/Exception;ZLandroid/graphics/Bitmap;)V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: QX1 */
/* loaded from: classes5.dex */
public final class QX1 {

    /* renamed from: a */
    public final NX1 f30473a;

    /* renamed from: b */
    public final Exception f30474b;

    /* renamed from: c */
    public final boolean f30475c;

    /* renamed from: d */
    public final Bitmap f30476d;

    public QX1(NX1 request, Exception exc, boolean z, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f30473a = request;
        this.f30474b = exc;
        this.f30475c = z;
        this.f30476d = bitmap;
    }

    /* renamed from: a */
    public final Bitmap m88438a() {
        return this.f30476d;
    }

    /* renamed from: b */
    public final Exception m88437b() {
        return this.f30474b;
    }

    /* renamed from: c */
    public final NX1 m88436c() {
        return this.f30473a;
    }

    /* renamed from: d */
    public final boolean m88435d() {
        return this.f30475c;
    }
}
