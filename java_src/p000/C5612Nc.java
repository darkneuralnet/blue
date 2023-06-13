package p000;

import android.graphics.Bitmap;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u001d\u0010\u0011\u001a\u00020\u00108VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0005\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, m28432d2 = {"LNc;", "LMW1;", "", C17296a.f69688o, "Landroid/graphics/Bitmap;", "b", "Landroid/graphics/Bitmap;", "c", "()Landroid/graphics/Bitmap;", "bitmap", "", "getWidth", "()I", "width", "getHeight", "height", "LNW1;", "config", "<init>", "(Landroid/graphics/Bitmap;)V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Nc */
/* loaded from: classes.dex */
public final class C5612Nc implements MW1 {

    /* renamed from: b */
    public final Bitmap f24846b;

    public C5612Nc(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f24846b = bitmap;
    }

    @Override // p000.MW1
    /* renamed from: a */
    public void mo93709a() {
        this.f24846b.prepareToDraw();
    }

    @Override // p000.MW1
    /* renamed from: b */
    public int mo93708b() {
        Bitmap.Config config = this.f24846b.getConfig();
        Intrinsics.checkNotNullExpressionValue(config, "bitmap.config");
        return C6809Qc.m88360e(config);
    }

    /* renamed from: c */
    public final Bitmap m93707c() {
        return this.f24846b;
    }

    @Override // p000.MW1
    public int getHeight() {
        return this.f24846b.getHeight();
    }

    @Override // p000.MW1
    public int getWidth() {
        return this.f24846b.getWidth();
    }
}
