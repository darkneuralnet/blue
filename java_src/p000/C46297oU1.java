package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.identification.IdentificationAcceptableMethod;
import co.bird.android.model.identification.IdentificationDebugResponse;
import co.bird.android.model.identification.IdentificationDocumentType;
import co.bird.android.model.identification.IdentificationSubmissionData;
import com.facebook.share.internal.C17296a;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b#\u0010$J=\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001b\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, m28432d2 = {"LoU1;", "", "Ljava/util/Locale;", "locale", "Lco/bird/android/model/identification/IdentificationDocumentType;", "documentType", "Lco/bird/android/model/identification/IdentificationAcceptableMethod;", "acceptableMethod", "Lco/bird/android/model/identification/IdentificationDebugResponse;", "debug", "Lco/bird/android/model/identification/IdentificationSubmissionData;", "submissionData", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/util/Locale;", "e", "()Ljava/util/Locale;", "b", "Lco/bird/android/model/identification/IdentificationDocumentType;", DateTokenConverter.CONVERTER_KEY, "()Lco/bird/android/model/identification/IdentificationDocumentType;", "c", "Lco/bird/android/model/identification/IdentificationAcceptableMethod;", "()Lco/bird/android/model/identification/IdentificationAcceptableMethod;", "Lco/bird/android/model/identification/IdentificationDebugResponse;", "()Lco/bird/android/model/identification/IdentificationDebugResponse;", "Lco/bird/android/model/identification/IdentificationSubmissionData;", "f", "()Lco/bird/android/model/identification/IdentificationSubmissionData;", "<init>", "(Ljava/util/Locale;Lco/bird/android/model/identification/IdentificationDocumentType;Lco/bird/android/model/identification/IdentificationAcceptableMethod;Lco/bird/android/model/identification/IdentificationDebugResponse;Lco/bird/android/model/identification/IdentificationSubmissionData;)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: oU1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C46297oU1 {

    /* renamed from: a */
    public final Locale f102055a;

    /* renamed from: b */
    public final IdentificationDocumentType f102056b;

    /* renamed from: c */
    public final IdentificationAcceptableMethod f102057c;

    /* renamed from: d */
    public final IdentificationDebugResponse f102058d;

    /* renamed from: e */
    public final IdentificationSubmissionData f102059e;

    public C46297oU1(Locale locale, IdentificationDocumentType documentType, IdentificationAcceptableMethod acceptableMethod, IdentificationDebugResponse identificationDebugResponse, IdentificationSubmissionData submissionData) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(acceptableMethod, "acceptableMethod");
        Intrinsics.checkNotNullParameter(submissionData, "submissionData");
        this.f102055a = locale;
        this.f102056b = documentType;
        this.f102057c = acceptableMethod;
        this.f102058d = identificationDebugResponse;
        this.f102059e = submissionData;
    }

    public static /* synthetic */ C46297oU1 copy$default(C46297oU1 c46297oU1, Locale locale, IdentificationDocumentType identificationDocumentType, IdentificationAcceptableMethod identificationAcceptableMethod, IdentificationDebugResponse identificationDebugResponse, IdentificationSubmissionData identificationSubmissionData, int i, Object obj) {
        if ((i & 1) != 0) {
            locale = c46297oU1.f102055a;
        }
        if ((i & 2) != 0) {
            identificationDocumentType = c46297oU1.f102056b;
        }
        IdentificationDocumentType identificationDocumentType2 = identificationDocumentType;
        if ((i & 4) != 0) {
            identificationAcceptableMethod = c46297oU1.f102057c;
        }
        IdentificationAcceptableMethod identificationAcceptableMethod2 = identificationAcceptableMethod;
        if ((i & 8) != 0) {
            identificationDebugResponse = c46297oU1.f102058d;
        }
        IdentificationDebugResponse identificationDebugResponse2 = identificationDebugResponse;
        if ((i & 16) != 0) {
            identificationSubmissionData = c46297oU1.f102059e;
        }
        return c46297oU1.m21018a(locale, identificationDocumentType2, identificationAcceptableMethod2, identificationDebugResponse2, identificationSubmissionData);
    }

    /* renamed from: a */
    public final C46297oU1 m21018a(Locale locale, IdentificationDocumentType documentType, IdentificationAcceptableMethod acceptableMethod, IdentificationDebugResponse identificationDebugResponse, IdentificationSubmissionData submissionData) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(acceptableMethod, "acceptableMethod");
        Intrinsics.checkNotNullParameter(submissionData, "submissionData");
        return new C46297oU1(locale, documentType, acceptableMethod, identificationDebugResponse, submissionData);
    }

    /* renamed from: b */
    public final IdentificationAcceptableMethod m21017b() {
        return this.f102057c;
    }

    /* renamed from: c */
    public final IdentificationDebugResponse m21016c() {
        return this.f102058d;
    }

    /* renamed from: d */
    public final IdentificationDocumentType m21015d() {
        return this.f102056b;
    }

    /* renamed from: e */
    public final Locale m21014e() {
        return this.f102055a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C46297oU1) {
            C46297oU1 c46297oU1 = (C46297oU1) obj;
            return Intrinsics.areEqual(this.f102055a, c46297oU1.f102055a) && this.f102056b == c46297oU1.f102056b && Intrinsics.areEqual(this.f102057c, c46297oU1.f102057c) && Intrinsics.areEqual(this.f102058d, c46297oU1.f102058d) && Intrinsics.areEqual(this.f102059e, c46297oU1.f102059e);
        }
        return false;
    }

    /* renamed from: f */
    public final IdentificationSubmissionData m21013f() {
        return this.f102059e;
    }

    public int hashCode() {
        int hashCode = ((((this.f102055a.hashCode() * 31) + this.f102056b.hashCode()) * 31) + this.f102057c.hashCode()) * 31;
        IdentificationDebugResponse identificationDebugResponse = this.f102058d;
        return ((hashCode + (identificationDebugResponse == null ? 0 : identificationDebugResponse.hashCode())) * 31) + this.f102059e.hashCode();
    }

    public String toString() {
        Locale locale = this.f102055a;
        IdentificationDocumentType identificationDocumentType = this.f102056b;
        IdentificationAcceptableMethod identificationAcceptableMethod = this.f102057c;
        IdentificationDebugResponse identificationDebugResponse = this.f102058d;
        IdentificationSubmissionData identificationSubmissionData = this.f102059e;
        return "IdentificationPartialSubmissionData(locale=" + locale + ", documentType=" + identificationDocumentType + ", acceptableMethod=" + identificationAcceptableMethod + ", debug=" + identificationDebugResponse + ", submissionData=" + identificationSubmissionData + ")";
    }
}
