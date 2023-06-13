package p000;

import co.bird.android.buava.Optional;
import co.bird.android.model.TaxInformation;
import co.bird.api.request.TaxInformationBody;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u0004H\u0016J\f\u0010\t\u001a\u00020\b*\u00020\u0002H\u0002J\f\u0010\n\u001a\u00020\u0002*\u00020\bH\u0002R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\u0010"}, m28432d2 = {"LKZ5;", "LHZ5;", "Lco/bird/android/model/TaxInformation;", "info", "Lio/reactivex/F;", "b", "Lco/bird/android/buava/Optional;", C17296a.f69688o, "Lco/bird/api/request/TaxInformationBody;", "g", "h", "LGZ5;", "LGZ5;", "taxInformationClient", "<init>", "(LGZ5;)V", "tax-information_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: KZ5 */
/* loaded from: classes4.dex */
public final class KZ5 implements HZ5 {

    /* renamed from: a */
    public final GZ5 f19873a;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LHM4;", "Lco/bird/api/request/TaxInformationBody;", "response", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/TaxInformation;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: KZ5$a */
    /* loaded from: classes4.dex */
    public static final class C4492a extends Lambda implements Function1<HM4<TaxInformationBody>, Optional<TaxInformation>> {
        public C4492a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<TaxInformation> invoke(HM4<TaxInformationBody> response) {
            TaxInformation taxInformation;
            Intrinsics.checkNotNullParameter(response, "response");
            Optional.C14443a c14443a = Optional.f63040c;
            TaxInformationBody m103944a = response.m103944a();
            if (m103944a != null) {
                taxInformation = KZ5.this.m98731h(m103944a);
            } else {
                taxInformation = null;
            }
            return c14443a.m59033b(taxInformation);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/request/TaxInformationBody;", "it", "Lco/bird/android/model/TaxInformation;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/request/TaxInformationBody;)Lco/bird/android/model/TaxInformation;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: KZ5$b */
    /* loaded from: classes4.dex */
    public static final class C4493b extends Lambda implements Function1<TaxInformationBody, TaxInformation> {
        public C4493b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final TaxInformation invoke(TaxInformationBody it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return KZ5.this.m98731h(it);
        }
    }

    public KZ5(GZ5 taxInformationClient) {
        Intrinsics.checkNotNullParameter(taxInformationClient, "taxInformationClient");
        this.f19873a = taxInformationClient;
    }

    /* renamed from: e */
    public static final Optional m98734e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final TaxInformation m98733f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (TaxInformation) tmp0.invoke(obj);
    }

    @Override // p000.HZ5
    /* renamed from: a */
    public AbstractC23442F<Optional<TaxInformation>> mo98738a() {
        AbstractC23442F<HM4<TaxInformationBody>> m105003a = this.f19873a.m105003a();
        final C4492a c4492a = new C4492a();
        AbstractC23442F m33157I = m105003a.m33157I(new InterfaceC23492o() { // from class: JZ5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m98734e;
                m98734e = KZ5.m98734e(Function1.this, obj);
                return m98734e;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "override fun getTaxInfor…)?.toModel())\n      }\n  }");
        return m33157I;
    }

    @Override // p000.HZ5
    /* renamed from: b */
    public AbstractC23442F<TaxInformation> mo98737b(TaxInformation info) {
        Intrinsics.checkNotNullParameter(info, "info");
        AbstractC23442F<TaxInformationBody> m105002b = this.f19873a.m105002b(m98732g(info));
        final C4493b c4493b = new C4493b();
        AbstractC23442F m33157I = m105002b.m33157I(new InterfaceC23492o() { // from class: IZ5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                TaxInformation m98733f;
                m98733f = KZ5.m98733f(Function1.this, obj);
                return m98733f;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "override fun setTaxInfor….map { it.toModel() }\n  }");
        return m33157I;
    }

    /* renamed from: g */
    public final TaxInformationBody m98732g(TaxInformation taxInformation) {
        return new TaxInformationBody(taxInformation.getFirstName(), taxInformation.getLastName(), taxInformation.getFiscalCode(), taxInformation.getAddress(), taxInformation.getPostalCode(), taxInformation.getCity(), taxInformation.getProvince(), taxInformation.getCountry(), taxInformation.getVatId(), taxInformation.getCompanyName());
    }

    /* renamed from: h */
    public final TaxInformation m98731h(TaxInformationBody taxInformationBody) {
        return new TaxInformation(taxInformationBody.getFirstName(), taxInformationBody.getLastName(), taxInformationBody.getFiscalCode(), taxInformationBody.getAddress(), taxInformationBody.getPostalCode(), taxInformationBody.getCity(), taxInformationBody.getProvince(), taxInformationBody.getCountry(), taxInformationBody.getVatId(), taxInformationBody.getCompanyName());
    }
}
