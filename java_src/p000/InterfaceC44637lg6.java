package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Agreement;
import co.bird.android.model.AgreementKey;
import co.bird.android.model.AgreementRole;
import co.bird.android.model.User;
import co.bird.api.response.AgreementResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J.\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H&JA\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\n\"\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\n\"\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0014\u001a\u00020\u0004H&J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\n\"\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J\"\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&R,\u0010#\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0 0\u001e0\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020$0\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\"¨\u0006'"}, m28432d2 = {"Llg6;", "", "Lco/bird/android/model/AgreementRole;", "role", "", "partnerId", "userGuestId", "Lio/reactivex/p;", "Lco/bird/android/model/Agreement;", "g", "", "roles", "Ltg1;", "f", "([Lco/bird/android/model/AgreementRole;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/p;", "Lio/reactivex/F;", "LHM4;", "Lco/bird/api/response/AgreementResponse;", "c", "([Lco/bird/android/model/AgreementRole;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;", "agreementId", "h", "LvE1;", "agreementRequests", "e", "([LvE1;)Lio/reactivex/p;", "Lco/bird/android/model/User;", "user", "b", "LZ84;", "", "Lco/bird/android/model/AgreementKey;", "", DateTokenConverter.CONVERTER_KEY, "()LZ84;", "agreements", "", C17296a.f69688o, "needsPreloadAgreement", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: lg6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC44637lg6 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: lg6$a */
    /* loaded from: classes2.dex */
    public static final class C25760a {
        public static /* synthetic */ AbstractC24507p getAgreementContent$default(InterfaceC44637lg6 interfaceC44637lg6, AgreementRole agreementRole, String str, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = null;
                }
                if ((i & 4) != 0) {
                    str2 = null;
                }
                return interfaceC44637lg6.mo2954g(agreementRole, str, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAgreementContent");
        }

        public static /* synthetic */ AbstractC23442F legalAgreements$default(InterfaceC44637lg6 interfaceC44637lg6, AgreementRole[] agreementRoleArr, String str, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = null;
                }
                if ((i & 4) != 0) {
                    str2 = null;
                }
                return interfaceC44637lg6.mo2958c(agreementRoleArr, str, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: legalAgreements");
        }

        public static /* synthetic */ AbstractC24507p maybeShouldShowAgreementRoleAs$default(InterfaceC44637lg6 interfaceC44637lg6, User user, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = null;
                }
                return interfaceC44637lg6.mo2959b(user, str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: maybeShouldShowAgreementRoleAs");
        }

        public static /* synthetic */ AbstractC24507p refreshAgreements$default(InterfaceC44637lg6 interfaceC44637lg6, AgreementRole[] agreementRoleArr, String str, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = null;
                }
                if ((i & 4) != 0) {
                    str2 = null;
                }
                return interfaceC44637lg6.mo2955f(agreementRoleArr, str, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshAgreements");
        }
    }

    /* renamed from: a */
    Z84<Boolean> mo2960a();

    /* renamed from: b */
    AbstractC24507p<AgreementRole> mo2959b(User user, String str);

    /* renamed from: c */
    AbstractC23442F<HM4<AgreementResponse>> mo2958c(AgreementRole[] agreementRoleArr, String str, String str2);

    /* renamed from: d */
    Z84<Map<AgreementKey, List<Agreement>>> mo2957d();

    /* renamed from: e */
    AbstractC24507p<C49375tg1> mo2956e(C50302vE1... c50302vE1Arr);

    /* renamed from: f */
    AbstractC24507p<C49375tg1> mo2955f(AgreementRole[] agreementRoleArr, String str, String str2);

    /* renamed from: g */
    AbstractC24507p<Agreement> mo2954g(AgreementRole agreementRole, String str, String str2);

    /* renamed from: h */
    AbstractC24507p<C49375tg1> mo2953h(String str);
}
