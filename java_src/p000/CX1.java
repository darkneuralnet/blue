package p000;

import android.net.Uri;
import android.widget.ImageView;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0002R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LCX1;", "LBX1;", "", "url", "Landroid/widget/ImageView;", "into", "", "b", "Landroid/net/Uri;", "uri", C17296a.f69688o, "LYI4;", "c", "LUI4;", "LUI4;", "glide", "<init>", "(LUI4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: CX1 */
/* loaded from: classes2.dex */
public final class CX1 implements BX1 {

    /* renamed from: a */
    public final UI4 f4186a;

    public CX1(UI4 glide) {
        Intrinsics.checkNotNullParameter(glide, "glide");
        this.f4186a = glide;
    }

    @Override // p000.BX1
    /* renamed from: a */
    public void mo112175a(Uri uri, ImageView into) {
        Intrinsics.checkNotNullParameter(into, "into");
        this.f4186a.m81656h(uri).mo16086d(m112173c()).m16083f1(0.1f).m16096R0(into);
    }

    @Override // p000.BX1
    /* renamed from: b */
    public void mo112174b(String str, ImageView into) {
        Intrinsics.checkNotNullParameter(into, "into");
        this.f4186a.m81653k(str).mo16086d(m112173c()).m16083f1(0.1f).m16096R0(into);
    }

    /* renamed from: c */
    public final YI4 m112173c() {
        int i = C48193rg4.ic_circle_avatar;
        YI4 m97549n = new YI4().m97561f().m97554k(B41.f1615a).m97552l().m97551l0(i).m97549n(i);
        Intrinsics.checkNotNullExpressionValue(m97549n, "RequestOptions()\n      .…rawable.ic_circle_avatar)");
        return m97549n;
    }
}
