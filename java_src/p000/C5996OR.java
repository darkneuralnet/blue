package p000;

import co.bird.android.model.persistence.BirdRatingHistory;
import co.bird.api.response.WireRatingHistoryResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23496h;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.InterfaceC5292MR;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"LOR;", "LMR;", "", "birdId", "Lio/reactivex/c;", "R", "Lio/reactivex/F;", "Lco/bird/android/model/persistence/BirdRatingHistory;", "D", "clear", "LTk3;", C17296a.f69688o, "LTk3;", "operatorClient", "LCR;", "b", "LCR;", "birdRatingHistoryDao", "<init>", "(LTk3;LCR;)V", "co.bird.android.repository.bird-rating-history"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: OR */
/* loaded from: classes4.dex */
public final class C5996OR implements InterfaceC5292MR {

    /* renamed from: a */
    public final InterfaceC36152Tk3 f26562a;

    /* renamed from: b */
    public final AbstractC1025CR f26563b;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/WireRatingHistoryResponse;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/WireRatingHistoryResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OR$a */
    /* loaded from: classes4.dex */
    public static final class C5997a extends Lambda implements Function1<WireRatingHistoryResponse, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ String f26565h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5997a(String str) {
            super(1);
            this.f26565h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(WireRatingHistoryResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C5996OR.this.f26563b.mo110460c(C30592yR.m3503a(it, this.f26565h));
        }
    }

    public C5996OR(InterfaceC36152Tk3 operatorClient, AbstractC1025CR birdRatingHistoryDao) {
        Intrinsics.checkNotNullParameter(operatorClient, "operatorClient");
        Intrinsics.checkNotNullParameter(birdRatingHistoryDao, "birdRatingHistoryDao");
        this.f26562a = operatorClient;
        this.f26563b = birdRatingHistoryDao;
    }

    /* renamed from: L1 */
    public static final InterfaceC23496h m92313L1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC5292MR
    /* renamed from: D */
    public AbstractC23442F<BirdRatingHistory> mo92316D(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        return m92314K1(this.f26563b.mo110462a(birdId));
    }

    /* renamed from: K1 */
    public <T> AbstractC23442F<T> m92314K1(AbstractC23442F<T> abstractC23442F) {
        return InterfaceC5292MR.C5293a.m95302a(this, abstractC23442F);
    }

    @Override // p000.InterfaceC5292MR
    /* renamed from: R */
    public AbstractC23461c mo92312R(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC24507p<WireRatingHistoryResponse> m83018y = this.f26562a.m83018y(birdId);
        final C5997a c5997a = new C5997a(birdId);
        AbstractC23461c m32074A = m83018y.m32074A(new InterfaceC23492o() { // from class: NR
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m92313L1;
                m92313L1 = C5996OR.m92313L1(Function1.this, obj);
                return m92313L1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32074A, "override fun fetchBirdRa…Id)\n        )\n      }\n  }");
        return m32074A;
    }

    @Override // p000.InterfaceC38466bI4
    public AbstractC23461c clear() {
        return this.f26563b.mo110461b();
    }
}
