package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.identification.IdentificationManualEntryFormField;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010 JL\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, m28432d2 = {"LlT1;", "T", "", "Lco/bird/android/model/identification/IdentificationManualEntryFormField;", "field", "", "hint", "error", "value", "", "editable", C17296a.f69688o, "(Lco/bird/android/model/identification/IdentificationManualEntryFormField;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)LlT1;", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Lco/bird/android/model/identification/IdentificationManualEntryFormField;", "c", "()Lco/bird/android/model/identification/IdentificationManualEntryFormField;", "b", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "Ljava/lang/Object;", "e", "()Ljava/lang/Object;", "Z", "getEditable", "()Z", "<init>", "(Lco/bird/android/model/identification/IdentificationManualEntryFormField;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: lT1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44509lT1<T> {

    /* renamed from: a */
    public final IdentificationManualEntryFormField f96228a;

    /* renamed from: b */
    public final String f96229b;

    /* renamed from: c */
    public final String f96230c;

    /* renamed from: d */
    public final T f96231d;

    /* renamed from: e */
    public final boolean f96232e;

    public C44509lT1(IdentificationManualEntryFormField field, String hint, String str, T t, boolean z) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(hint, "hint");
        this.f96228a = field;
        this.f96229b = hint;
        this.f96230c = str;
        this.f96231d = t;
        this.f96232e = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C44509lT1 copy$default(C44509lT1 c44509lT1, IdentificationManualEntryFormField identificationManualEntryFormField, String str, String str2, Object obj, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            identificationManualEntryFormField = c44509lT1.f96228a;
        }
        if ((i & 2) != 0) {
            str = c44509lT1.f96229b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = c44509lT1.f96230c;
        }
        String str4 = str2;
        T t = obj;
        if ((i & 8) != 0) {
            t = c44509lT1.f96231d;
        }
        T t2 = t;
        if ((i & 16) != 0) {
            z = c44509lT1.f96232e;
        }
        return c44509lT1.m27264a(identificationManualEntryFormField, str3, str4, t2, z);
    }

    /* renamed from: a */
    public final C44509lT1<T> m27264a(IdentificationManualEntryFormField field, String hint, String str, T t, boolean z) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(hint, "hint");
        return new C44509lT1<>(field, hint, str, t, z);
    }

    /* renamed from: b */
    public final String m27263b() {
        return this.f96230c;
    }

    /* renamed from: c */
    public final IdentificationManualEntryFormField m27262c() {
        return this.f96228a;
    }

    /* renamed from: d */
    public final String m27261d() {
        return this.f96229b;
    }

    /* renamed from: e */
    public final T m27260e() {
        return this.f96231d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C44509lT1) {
            C44509lT1 c44509lT1 = (C44509lT1) obj;
            return this.f96228a == c44509lT1.f96228a && Intrinsics.areEqual(this.f96229b, c44509lT1.f96229b) && Intrinsics.areEqual(this.f96230c, c44509lT1.f96230c) && Intrinsics.areEqual(this.f96231d, c44509lT1.f96231d) && this.f96232e == c44509lT1.f96232e;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f96228a.hashCode() * 31) + this.f96229b.hashCode()) * 31;
        String str = this.f96230c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        T t = this.f96231d;
        int hashCode3 = (hashCode2 + (t != null ? t.hashCode() : 0)) * 31;
        boolean z = this.f96232e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode3 + i;
    }

    public String toString() {
        IdentificationManualEntryFormField identificationManualEntryFormField = this.f96228a;
        String str = this.f96229b;
        String str2 = this.f96230c;
        T t = this.f96231d;
        boolean z = this.f96232e;
        return "IdentificationEditTextViewModel(field=" + identificationManualEntryFormField + ", hint=" + str + ", error=" + str2 + ", value=" + t + ", editable=" + z + ")";
    }

    public /* synthetic */ C44509lT1(IdentificationManualEntryFormField identificationManualEntryFormField, String str, String str2, Object obj, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(identificationManualEntryFormField, str, str2, obj, (i & 16) != 0 ? true : z);
    }
}
