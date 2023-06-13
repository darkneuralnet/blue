package p000;

import android.widget.ImageView;
import co.bird.android.model.persistence.nestedstructures.LegacyAsset;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H&¨\u0006\u000b"}, m28432d2 = {"LTo2;", "", "Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;", "asset", "Landroid/widget/ImageView;", "view", "", "width", "height", "Lio/reactivex/c;", C17296a.f69688o, "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: To2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC36187To2 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: To2$a */
    /* loaded from: classes2.dex */
    public static final class C7925a {
        public static /* synthetic */ AbstractC23461c drawable$default(InterfaceC36187To2 interfaceC36187To2, LegacyAsset legacyAsset, ImageView imageView, int i, int i2, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    i = 0;
                }
                if ((i3 & 8) != 0) {
                    i2 = 0;
                }
                return interfaceC36187To2.mo80867a(legacyAsset, imageView, i, i2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawable");
        }
    }

    /* renamed from: a */
    AbstractC23461c mo80867a(LegacyAsset legacyAsset, ImageView imageView, int i, int i2);
}
