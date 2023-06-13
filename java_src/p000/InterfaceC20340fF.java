package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireBatch;
import co.bird.api.request.BatchKind;
import co.bird.api.response.BatchBird;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J*\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\n0\u00062\u0006\u0010\t\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH&J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\n0\u0006H&J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\n0\u00062\u0006\u0010\t\u001a\u00020\u0002H&J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H&¨\u0006\u0012"}, m28432d2 = {"LfF;", "", "", "description", "Lco/bird/api/request/BatchKind;", "batchKind", "Lio/reactivex/F;", "Lco/bird/android/model/wire/WireBatch;", "e", "batchId", "", "birdsIds", "Lco/bird/api/response/BatchBird;", "b", "c", C17296a.f69688o, "birdId", DateTokenConverter.CONVERTER_KEY, "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: fF */
/* loaded from: classes2.dex */
public interface InterfaceC20340fF {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fF$a */
    /* loaded from: classes2.dex */
    public static final class C20341a {
        public static /* synthetic */ AbstractC23442F createBatch$default(InterfaceC20340fF interfaceC20340fF, String str, BatchKind batchKind, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    batchKind = null;
                }
                return interfaceC20340fF.mo34292e(str, batchKind);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createBatch");
        }
    }

    /* renamed from: a */
    AbstractC23442F<List<BatchBird>> mo34296a(String str);

    /* renamed from: b */
    AbstractC23442F<List<BatchBird>> mo34295b(String str, List<String> list);

    /* renamed from: c */
    AbstractC23442F<List<WireBatch>> mo34294c();

    /* renamed from: d */
    AbstractC23442F<BatchBird> mo34293d(String str, String str2);

    /* renamed from: e */
    AbstractC23442F<WireBatch> mo34292e(String str, BatchKind batchKind);
}
