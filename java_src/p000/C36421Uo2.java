package p000;

import android.widget.ImageView;
import co.bird.android.model.constant.AssetKind;
import co.bird.android.model.persistence.nestedstructures.LegacyAsset;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0017R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u0010"}, m28432d2 = {"LUo2;", "LTo2;", "Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;", "asset", "Landroid/widget/ImageView;", "view", "", "width", "height", "Lio/reactivex/c;", C17296a.f69688o, "LsP2;", "LsP2;", "mediaManager", "<init>", "(LsP2;)V", "media_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Uo2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36421Uo2 implements InterfaceC36187To2 {

    /* renamed from: a */
    public final InterfaceC48624sP2 f38018a;

    public C36421Uo2(InterfaceC48624sP2 mediaManager) {
        Intrinsics.checkNotNullParameter(mediaManager, "mediaManager");
        this.f38018a = mediaManager;
    }

    @Override // p000.InterfaceC36187To2
    /* renamed from: a */
    public AbstractC23461c mo80867a(LegacyAsset asset, ImageView view, int i, int i2) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(view, "view");
        if (asset.getKind() == AssetKind.MEDIA) {
            return this.f38018a.mo6893a(asset.getMedia(), view, i, i2);
        }
        AssetKind kind = asset.getKind();
        throw new NotImplementedError("The requested media " + kind + " is not supported.");
    }
}
