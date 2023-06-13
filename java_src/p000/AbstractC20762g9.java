package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.AgreementRole;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\b&\u0018\u00002\u00020\u0001BE\u0012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H&R\u001f\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u001a"}, m28432d2 = {"Lg9;", "", "Lio/reactivex/c;", C17296a.f69688o, "", "Lco/bird/android/model/AgreementRole;", "[Lco/bird/android/model/AgreementRole;", DateTokenConverter.CONVERTER_KEY, "()[Lco/bird/android/model/AgreementRole;", "roles", "", "b", "Z", "c", "()Z", "refreshAgreements", "", "Ljava/lang/String;", "()Ljava/lang/String;", "partnerId", "e", "userGuestId", "f", "isAggressivelyTriggered", "<init>", "([Lco/bird/android/model/AgreementRole;ZLjava/lang/String;Ljava/lang/String;Z)V", "agreements_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: g9 */
/* loaded from: classes4.dex */
public abstract class AbstractC20762g9 {

    /* renamed from: a */
    public final AgreementRole[] f81680a;

    /* renamed from: b */
    public final boolean f81681b;

    /* renamed from: c */
    public final String f81682c;

    /* renamed from: d */
    public final String f81683d;

    /* renamed from: e */
    public final boolean f81684e;

    public AbstractC20762g9(AgreementRole[] roles, boolean z, String str, String str2, boolean z2) {
        Intrinsics.checkNotNullParameter(roles, "roles");
        this.f81680a = roles;
        this.f81681b = z;
        this.f81682c = str;
        this.f81683d = str2;
        this.f81684e = z2;
    }

    /* renamed from: a */
    public abstract AbstractC23461c mo39976a();

    /* renamed from: b */
    public final String m39975b() {
        return this.f81682c;
    }

    /* renamed from: c */
    public final boolean m39974c() {
        return this.f81681b;
    }

    /* renamed from: d */
    public final AgreementRole[] m39973d() {
        return this.f81680a;
    }

    /* renamed from: e */
    public final String m39972e() {
        return this.f81683d;
    }

    /* renamed from: f */
    public final boolean m39971f() {
        return this.f81684e;
    }

    public /* synthetic */ AbstractC20762g9(AgreementRole[] agreementRoleArr, boolean z, String str, String str2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(agreementRoleArr, (i & 2) != 0 ? false : z, str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? false : z2);
    }
}
