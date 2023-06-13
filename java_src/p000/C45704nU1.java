package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.identification.IdentificationManualEntryFormField;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010 JL\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00028\u00002\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019R\u0017\u0010\b\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\u0017\u0010\u001e¨\u0006!"}, m28432d2 = {"LnU1;", "T", "", "", "title", "message", "", "endIcon", "value", "Lco/bird/android/model/identification/IdentificationManualEntryFormField;", "field", C17296a.f69688o, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Lco/bird/android/model/identification/IdentificationManualEntryFormField;)LnU1;", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", DateTokenConverter.CONVERTER_KEY, "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "Lco/bird/android/model/identification/IdentificationManualEntryFormField;", "()Lco/bird/android/model/identification/IdentificationManualEntryFormField;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Lco/bird/android/model/identification/IdentificationManualEntryFormField;)V", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: nU1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45704nU1<T> {

    /* renamed from: a */
    public final String f100029a;

    /* renamed from: b */
    public final String f100030b;

    /* renamed from: c */
    public final Integer f100031c;

    /* renamed from: d */
    public final T f100032d;

    /* renamed from: e */
    public final IdentificationManualEntryFormField f100033e;

    public C45704nU1(String title, String str, Integer num, T t, IdentificationManualEntryFormField field) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(field, "field");
        this.f100029a = title;
        this.f100030b = str;
        this.f100031c = num;
        this.f100032d = t;
        this.f100033e = field;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C45704nU1 copy$default(C45704nU1 c45704nU1, String str, String str2, Integer num, Object obj, IdentificationManualEntryFormField identificationManualEntryFormField, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = c45704nU1.f100029a;
        }
        if ((i & 2) != 0) {
            str2 = c45704nU1.f100030b;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            num = c45704nU1.f100031c;
        }
        Integer num2 = num;
        T t = obj;
        if ((i & 8) != 0) {
            t = c45704nU1.f100032d;
        }
        T t2 = t;
        if ((i & 16) != 0) {
            identificationManualEntryFormField = c45704nU1.f100033e;
        }
        return c45704nU1.m23618a(str, str3, num2, t2, identificationManualEntryFormField);
    }

    /* renamed from: a */
    public final C45704nU1<T> m23618a(String title, String str, Integer num, T t, IdentificationManualEntryFormField field) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(field, "field");
        return new C45704nU1<>(title, str, num, t, field);
    }

    /* renamed from: b */
    public final Integer m23617b() {
        return this.f100031c;
    }

    /* renamed from: c */
    public final IdentificationManualEntryFormField m23616c() {
        return this.f100033e;
    }

    /* renamed from: d */
    public final String m23615d() {
        return this.f100030b;
    }

    /* renamed from: e */
    public final String m23614e() {
        return this.f100029a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C45704nU1) {
            C45704nU1 c45704nU1 = (C45704nU1) obj;
            return Intrinsics.areEqual(this.f100029a, c45704nU1.f100029a) && Intrinsics.areEqual(this.f100030b, c45704nU1.f100030b) && Intrinsics.areEqual(this.f100031c, c45704nU1.f100031c) && Intrinsics.areEqual(this.f100032d, c45704nU1.f100032d) && this.f100033e == c45704nU1.f100033e;
        }
        return false;
    }

    /* renamed from: f */
    public final T m23613f() {
        return this.f100032d;
    }

    public int hashCode() {
        int hashCode = this.f100029a.hashCode() * 31;
        String str = this.f100030b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f100031c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        T t = this.f100032d;
        return ((hashCode3 + (t != null ? t.hashCode() : 0)) * 31) + this.f100033e.hashCode();
    }

    public String toString() {
        String str = this.f100029a;
        String str2 = this.f100030b;
        Integer num = this.f100031c;
        T t = this.f100032d;
        IdentificationManualEntryFormField identificationManualEntryFormField = this.f100033e;
        return "IdentificationManualEntrySelectorViewModel(title=" + str + ", message=" + str2 + ", endIcon=" + num + ", value=" + t + ", field=" + identificationManualEntryFormField + ")";
    }
}
