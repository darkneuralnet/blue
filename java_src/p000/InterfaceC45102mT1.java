package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.identification.IdentificationDocumentType;
import co.bird.android.model.identification.IdentificationEntryMethod;
import co.bird.android.model.identification.IdentificationIntentPermissionStatus;
import co.bird.android.model.identification.IdentificationManualEntryFormData;
import co.bird.android.model.identification.IdentificationRequestIdentifier;
import co.bird.android.model.identification.IdentificationSelfieEntryMethod;
import co.bird.android.model.identification.IdentificationSubmissionData;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&Jb\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\u0012H&J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H&J\u001e\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH&J\b\u0010\u001f\u001a\u00020\u001cH&J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u0019H&R \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\"0!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0016\u0010(\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0016\u0010+\u001a\u0004\u0018\u00010\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020/0!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010$¨\u00062"}, m28432d2 = {"LmT1;", "", "Lco/bird/android/model/identification/IdentificationRequestIdentifier;", "identifier", "Lio/reactivex/F;", "LZV1;", "i", "Lco/bird/android/model/identification/IdentificationEntryMethod;", "documentEntryMethod", "Lco/bird/android/model/identification/IdentificationDocumentType;", "documentType", "Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;", "selfieEntryMethod", "", "stateCode", "countryCode", "regionCode", "service", "Lco/bird/android/model/identification/IdentificationSubmissionData;", "submissionData", "Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/identification/IdentificationManualEntryFormData;", "formData", "e", "LoU1;", "partialSubmissionData", "Lkotlin/Function0;", "", "onSubscribe", "k", "b", "f", "LZ84;", "Lco/bird/android/buava/Optional;", "g", "()LZ84;", "identificationStatuses", "j", "()Lco/bird/android/model/identification/IdentificationRequestIdentifier;", "currentSessionIdentifier", "h", "()LoU1;", "currentPartialSubmissionData", C17296a.f69688o, "()Ljava/lang/String;", "imageCacheDirectoryPath", "LbT1;", "c", "backgroundSubmissionStates", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: mT1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC45102mT1 {
    /* renamed from: a */
    String mo25568a();

    /* renamed from: b */
    void mo25567b();

    /* renamed from: c */
    Z84<AbstractC38562bT1> mo25566c();

    /* renamed from: d */
    AbstractC23442F<IdentificationIntentPermissionStatus> mo25565d(IdentificationRequestIdentifier identificationRequestIdentifier, IdentificationEntryMethod identificationEntryMethod, IdentificationDocumentType identificationDocumentType, IdentificationSelfieEntryMethod identificationSelfieEntryMethod, String str, String str2, String str3, String str4, IdentificationSubmissionData identificationSubmissionData);

    /* renamed from: e */
    AbstractC23442F<IdentificationIntentPermissionStatus> mo25564e(IdentificationRequestIdentifier identificationRequestIdentifier, IdentificationManualEntryFormData identificationManualEntryFormData);

    /* renamed from: f */
    void mo25563f(C46297oU1 c46297oU1);

    /* renamed from: g */
    Z84<Optional<ZV1>> mo25562g();

    /* renamed from: h */
    C46297oU1 mo25561h();

    /* renamed from: i */
    AbstractC23442F<ZV1> mo25560i(IdentificationRequestIdentifier identificationRequestIdentifier);

    /* renamed from: j */
    IdentificationRequestIdentifier mo25559j();

    /* renamed from: k */
    void mo25558k(C46297oU1 c46297oU1, Function0<Unit> function0);
}
