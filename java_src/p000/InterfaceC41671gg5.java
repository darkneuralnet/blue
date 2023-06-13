package p000;

import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import java.io.File;
import kotlin.Metadata;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J$\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¨\u0006\u000e"}, m28432d2 = {"Lgg5;", "", "", "signedS3Url", "Lio/reactivex/F;", "LHM4;", "Lokhttp3/ResponseBody;", C17296a.f69688o, "Ljava/io/File;", "file", "Lokhttp3/MediaType;", "mediaType", "Lio/reactivex/c;", "b", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: gg5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC41671gg5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gg5$a */
    /* loaded from: classes2.dex */
    public static final class C22409a {
        public static /* synthetic */ AbstractC23461c upload$default(InterfaceC41671gg5 interfaceC41671gg5, String str, File file, MediaType mediaType, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    mediaType = null;
                }
                return interfaceC41671gg5.mo30120b(str, file, mediaType);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: upload");
        }
    }

    /* renamed from: a */
    AbstractC23442F<HM4<ResponseBody>> mo30121a(String str);

    /* renamed from: b */
    AbstractC23461c mo30120b(String str, File file, MediaType mediaType);
}
