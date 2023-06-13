package p000;

import co.bird.android.model.wire.WireAsset;
import co.bird.api.response.WireSignedUrl;
import com.amazonaws.services.p026s3.internal.Constants;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.functions.InterfaceC23492o;
import java.io.File;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u0011"}, m28432d2 = {"Lxz6;", "LQo;", "", "assetId", "Lio/reactivex/F;", "LHM4;", "Lco/bird/api/response/WireSignedUrl;", C17296a.f69688o, "Ljava/io/File;", "file", "", "c", "Lyz6;", "Lyz6;", "webArchiveClient", "<init>", "(Lyz6;)V", "web-archive_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: xz6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C51941xz6 implements InterfaceC6909Qo {

    /* renamed from: a */
    public final InterfaceC52534yz6 f118552a;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LwC6;", "response", "LHM4;", "Lco/bird/api/response/WireSignedUrl;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LwC6;)LHM4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xz6$a */
    /* loaded from: classes4.dex */
    public static final class C30389a extends Lambda implements Function1<C50882wC6, HM4<WireSignedUrl>> {

        /* renamed from: g */
        public final /* synthetic */ String f118553g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30389a(String str) {
            super(1);
            this.f118553g = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final HM4<WireSignedUrl> invoke(C50882wC6 response) {
            HM4<WireSignedUrl> m103935j;
            Intrinsics.checkNotNullParameter(response, "response");
            String m7260c = response.m7260c();
            if (m7260c == null || (m103935j = HM4.m103935j(new WireSignedUrl(new WireAsset(this.f118553g, 0L, response.m7261b(), null, null, 26, null), m7260c))) == null) {
                return HM4.m103942c(Constants.NO_SUCH_BUCKET_STATUS_CODE, ResponseBody.Companion.create((MediaType) null, "No url returned for given assetId from web archive client lookup"));
            }
            return m103935j;
        }
    }

    public C51941xz6(InterfaceC52534yz6 webArchiveClient) {
        Intrinsics.checkNotNullParameter(webArchiveClient, "webArchiveClient");
        this.f118552a = webArchiveClient;
    }

    /* renamed from: d */
    public static final HM4 m4275d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (HM4) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC6909Qo
    /* renamed from: a */
    public AbstractC23442F<HM4<WireSignedUrl>> mo4278a(String assetId) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        AbstractC23442F<C50882wC6> m2142a = this.f118552a.m2142a(assetId);
        final C30389a c30389a = new C30389a(assetId);
        AbstractC23442F m33157I = m2142a.m33157I(new InterfaceC23492o() { // from class: wz6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                HM4 m4275d;
                m4275d = C51941xz6.m4275d(Function1.this, obj);
                return m4275d;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "assetId: String): Single… client lookup\"))\n      }");
        return m33157I;
    }

    /* renamed from: c */
    public Void m4276c(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new NotImplementedError("WebArchiveAssetManager does not currently support uploading assets");
    }

    @Override // p000.InterfaceC6909Qo
    public /* bridge */ /* synthetic */ AbstractC23442F createAsset(File file) {
        return (AbstractC23442F) m4276c(file);
    }
}
