package p000;

import co.bird.android.model.constant.ContentKind;
import co.bird.android.model.constant.UploadKind;
import co.bird.android.model.wire.WireSignedUrlUploadConfigResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¨\u0006\t"}, m28432d2 = {"Ldf6;", "", "Lco/bird/android/model/constant/UploadKind;", "uploadKind", "Lco/bird/android/model/constant/ContentKind;", "contentKind", "Lio/reactivex/F;", "Lco/bird/android/model/wire/WireSignedUrlUploadConfigResponse;", C17296a.f69688o, "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: df6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC39884df6 {
    @NA1("v1/signed/upload-config")
    /* renamed from: a */
    AbstractC23442F<WireSignedUrlUploadConfigResponse> m43926a(@InterfaceC37017Xc4("upload_kind") UploadKind uploadKind, @InterfaceC37017Xc4("mime_type") ContentKind contentKind);
}
