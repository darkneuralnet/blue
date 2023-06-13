package p000;

import android.annotation.SuppressLint;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0005\t\u000e\u0013\u0017\u001bBC\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014¨\u0006\u001c"}, m28432d2 = {"LtY5;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", C17296a.f69688o, "Ljava/lang/String;", "name", "", "LtY5$a;", "b", "Ljava/util/Map;", "columns", "", "LtY5$c;", "c", "Ljava/util/Set;", "foreignKeys", "LtY5$e;", DateTokenConverter.CONVERTER_KEY, "indices", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V", "e", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: tY5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49301tY5 {

    /* renamed from: e */
    public static final C28784b f110716e = new C28784b(null);
    @JvmField

    /* renamed from: a */
    public final String f110717a;
    @JvmField

    /* renamed from: b */
    public final Map<String, C28782a> f110718b;
    @JvmField

    /* renamed from: c */
    public final Set<C28785c> f110719c;
    @JvmField

    /* renamed from: d */
    public final Set<C28787e> f110720d;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\u0018\u0000 \u001e2\u00020\u0001:\u0001\nB9\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0003R\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0017\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u001a\u0010\u001b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u0012\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, m28432d2 = {"LtY5$a;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", "type", C17296a.f69688o, "Ljava/lang/String;", "name", "b", "c", "Z", "notNull", DateTokenConverter.CONVERTER_KEY, "I", "primaryKeyPosition", "e", "defaultValue", "f", "createdFrom", "g", "getAffinity$annotations", "()V", "affinity", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V", "h", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: tY5$a */
    /* loaded from: classes.dex */
    public static final class C28782a {

        /* renamed from: h */
        public static final C28783a f110721h = new C28783a(null);
        @JvmField

        /* renamed from: a */
        public final String f110722a;
        @JvmField

        /* renamed from: b */
        public final String f110723b;
        @JvmField

        /* renamed from: c */
        public final boolean f110724c;
        @JvmField

        /* renamed from: d */
        public final int f110725d;
        @JvmField

        /* renamed from: e */
        public final String f110726e;
        @JvmField

        /* renamed from: f */
        public final int f110727f;
        @JvmField

        /* renamed from: g */
        public final int f110728g;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\n"}, m28432d2 = {"LtY5$a$a;", "", "", "current", LegacyRepairType.OTHER_KEY, "", "b", C17296a.f69688o, "<init>", "()V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
        /* renamed from: tY5$a$a */
        /* loaded from: classes.dex */
        public static final class C28783a {
            public /* synthetic */ C28783a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final boolean m12059a(String str) {
                boolean z;
                if (str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return false;
                }
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                while (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && charAt != '(') {
                        return false;
                    }
                    if (charAt == '(') {
                        i2++;
                    } else if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                        return false;
                    }
                    i++;
                    i3 = i4;
                }
                if (i2 == 0) {
                    return true;
                }
                return false;
            }

            @JvmStatic
            @SuppressLint({"SyntheticAccessor"})
            /* renamed from: b */
            public final boolean m12058b(String current, String str) {
                CharSequence trim;
                Intrinsics.checkNotNullParameter(current, "current");
                if (Intrinsics.areEqual(current, str)) {
                    return true;
                }
                if (m12059a(current)) {
                    String substring = current.substring(1, current.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    trim = StringsKt__StringsKt.trim((CharSequence) substring);
                    return Intrinsics.areEqual(trim.toString(), str);
                }
                return false;
            }

            private C28783a() {
            }
        }

        public C28782a(String name, String type, boolean z, int i, String str, int i2) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f110722a = name;
            this.f110723b = type;
            this.f110724c = z;
            this.f110725d = i;
            this.f110726e = str;
            this.f110727f = i2;
            this.f110728g = m12060a(type);
        }

        /* renamed from: a */
        public final int m12060a(String str) {
            boolean contains$default;
            boolean contains$default2;
            boolean contains$default3;
            boolean contains$default4;
            boolean contains$default5;
            boolean contains$default6;
            boolean contains$default7;
            boolean contains$default8;
            if (str == null) {
                return 5;
            }
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String upperCase = str.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            contains$default = StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "INT", false, 2, (Object) null);
            if (!contains$default) {
                contains$default2 = StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "CHAR", false, 2, (Object) null);
                if (!contains$default2) {
                    contains$default3 = StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "CLOB", false, 2, (Object) null);
                    if (!contains$default3) {
                        contains$default4 = StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "TEXT", false, 2, (Object) null);
                        if (!contains$default4) {
                            contains$default5 = StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "BLOB", false, 2, (Object) null);
                            if (contains$default5) {
                                return 5;
                            }
                            contains$default6 = StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "REAL", false, 2, (Object) null);
                            if (!contains$default6) {
                                contains$default7 = StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "FLOA", false, 2, (Object) null);
                                if (!contains$default7) {
                                    contains$default8 = StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "DOUB", false, 2, (Object) null);
                                    if (!contains$default8) {
                                        return 1;
                                    }
                                    return 4;
                                }
                                return 4;
                            }
                            return 4;
                        }
                    }
                }
                return 2;
            }
            return 3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x0072, code lost:
            r1 = true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(Object obj) {
            String str;
            String str2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C28782a) || this.f110725d != ((C28782a) obj).f110725d) {
                return false;
            }
            C28782a c28782a = (C28782a) obj;
            if (!Intrinsics.areEqual(this.f110722a, c28782a.f110722a) || this.f110724c != c28782a.f110724c) {
                return false;
            }
            if (this.f110727f == 1 && c28782a.f110727f == 2 && (str2 = this.f110726e) != null && !f110721h.m12058b(str2, c28782a.f110726e)) {
                return false;
            }
            if (this.f110727f == 2 && c28782a.f110727f == 1 && (str = c28782a.f110726e) != null && !f110721h.m12058b(str, this.f110726e)) {
                return false;
            }
            int i = this.f110727f;
            if (i != 0 && i == c28782a.f110727f) {
                boolean z = (r1 = this.f110726e) != null ? false : false;
                if (z) {
                    return false;
                }
            }
            if (this.f110728g == c28782a.f110728g) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int hashCode = ((this.f110722a.hashCode() * 31) + this.f110728g) * 31;
            if (this.f110724c) {
                i = 1231;
            } else {
                i = 1237;
            }
            return ((hashCode + i) * 31) + this.f110725d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Column{name='");
            sb.append(this.f110722a);
            sb.append("', type='");
            sb.append(this.f110723b);
            sb.append("', affinity='");
            sb.append(this.f110728g);
            sb.append("', notNull=");
            sb.append(this.f110724c);
            sb.append(", primaryKeyPosition=");
            sb.append(this.f110725d);
            sb.append(", defaultValue='");
            String str = this.f110726e;
            if (str == null) {
                str = "undefined";
            }
            sb.append(str);
            sb.append("'}");
            return sb.toString();
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000f"}, m28432d2 = {"LtY5$b;", "", "LmV5;", "database", "", "tableName", "LtY5;", C17296a.f69688o, "", "CREATED_FROM_DATABASE", "I", "CREATED_FROM_ENTITY", "CREATED_FROM_UNKNOWN", "<init>", "()V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: tY5$b */
    /* loaded from: classes.dex */
    public static final class C28784b {
        public /* synthetic */ C28784b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C49301tY5 m12057a(InterfaceC45124mV5 database, String tableName) {
            Intrinsics.checkNotNullParameter(database, "database");
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            return C49894uY5.m10068f(database, tableName);
        }

        private C28784b() {
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0018"}, m28432d2 = {"LtY5$c;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", C17296a.f69688o, "Ljava/lang/String;", "referenceTable", "b", "onDelete", "c", "onUpdate", "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "columnNames", "e", "referenceColumnNames", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: tY5$c */
    /* loaded from: classes.dex */
    public static final class C28785c {
        @JvmField

        /* renamed from: a */
        public final String f110729a;
        @JvmField

        /* renamed from: b */
        public final String f110730b;
        @JvmField

        /* renamed from: c */
        public final String f110731c;
        @JvmField

        /* renamed from: d */
        public final List<String> f110732d;
        @JvmField

        /* renamed from: e */
        public final List<String> f110733e;

        public C28785c(String referenceTable, String onDelete, String onUpdate, List<String> columnNames, List<String> referenceColumnNames) {
            Intrinsics.checkNotNullParameter(referenceTable, "referenceTable");
            Intrinsics.checkNotNullParameter(onDelete, "onDelete");
            Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
            Intrinsics.checkNotNullParameter(columnNames, "columnNames");
            Intrinsics.checkNotNullParameter(referenceColumnNames, "referenceColumnNames");
            this.f110729a = referenceTable;
            this.f110730b = onDelete;
            this.f110731c = onUpdate;
            this.f110732d = columnNames;
            this.f110733e = referenceColumnNames;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C28785c)) {
                return false;
            }
            C28785c c28785c = (C28785c) obj;
            if (!Intrinsics.areEqual(this.f110729a, c28785c.f110729a) || !Intrinsics.areEqual(this.f110730b, c28785c.f110730b) || !Intrinsics.areEqual(this.f110731c, c28785c.f110731c) || !Intrinsics.areEqual(this.f110732d, c28785c.f110732d)) {
                return false;
            }
            return Intrinsics.areEqual(this.f110733e, c28785c.f110733e);
        }

        public int hashCode() {
            return (((((((this.f110729a.hashCode() * 31) + this.f110730b.hashCode()) * 31) + this.f110731c.hashCode()) * 31) + this.f110732d.hashCode()) * 31) + this.f110733e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f110729a + "', onDelete='" + this.f110730b + " +', onUpdate='" + this.f110731c + "', columnNames=" + this.f110732d + ", referenceColumnNames=" + this.f110733e + CoreConstants.CURLY_RIGHT;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0096\u0002R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0005\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0015"}, m28432d2 = {"LtY5$d;", "", LegacyRepairType.OTHER_KEY, "", C17296a.f69688o, "b", "I", "c", "()I", "id", "getSequence", "sequence", "", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "()Ljava/lang/String;", "from", "e", "to", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: tY5$d */
    /* loaded from: classes.dex */
    public static final class C28786d implements Comparable<C28786d> {

        /* renamed from: b */
        public final int f110734b;

        /* renamed from: c */
        public final int f110735c;

        /* renamed from: d */
        public final String f110736d;

        /* renamed from: e */
        public final String f110737e;

        public C28786d(int i, int i2, String from, String to) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to, "to");
            this.f110734b = i;
            this.f110735c = i2;
            this.f110736d = from;
            this.f110737e = to;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C28786d other) {
            Intrinsics.checkNotNullParameter(other, "other");
            int i = this.f110734b - other.f110734b;
            if (i == 0) {
                return this.f110735c - other.f110735c;
            }
            return i;
        }

        /* renamed from: b */
        public final String m12055b() {
            return this.f110736d;
        }

        /* renamed from: c */
        public final int m12054c() {
            return this.f110734b;
        }

        /* renamed from: d */
        public final String m12053d() {
            return this.f110737e;
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\tB3\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0018"}, m28432d2 = {"LtY5$e;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", C17296a.f69688o, "Ljava/lang/String;", "name", "b", "Z", "unique", "", "c", "Ljava/util/List;", "columns", DateTokenConverter.CONVERTER_KEY, "orders", "<init>", "(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V", "e", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: tY5$e */
    /* loaded from: classes.dex */
    public static final class C28787e {

        /* renamed from: e */
        public static final C28788a f110738e = new C28788a(null);
        @JvmField

        /* renamed from: a */
        public final String f110739a;
        @JvmField

        /* renamed from: b */
        public final boolean f110740b;
        @JvmField

        /* renamed from: c */
        public final List<String> f110741c;
        @JvmField

        /* renamed from: d */
        public List<String> f110742d;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LtY5$e$a;", "", "", "DEFAULT_PREFIX", "Ljava/lang/String;", "<init>", "()V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
        /* renamed from: tY5$e$a */
        /* loaded from: classes.dex */
        public static final class C28788a {
            public /* synthetic */ C28788a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C28788a() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        public C28787e(String name, boolean z, List<String> columns, List<String> orders) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(columns, "columns");
            Intrinsics.checkNotNullParameter(orders, "orders");
            this.f110739a = name;
            this.f110740b = z;
            this.f110741c = columns;
            this.f110742d = orders;
            List<String> list = orders;
            if (list.isEmpty()) {
                int size = columns.size();
                list = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    list.add(EnumC47807r12.ASC.name());
                }
            }
            this.f110742d = (List) list;
        }

        public boolean equals(Object obj) {
            boolean startsWith$default;
            boolean startsWith$default2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C28787e)) {
                return false;
            }
            C28787e c28787e = (C28787e) obj;
            if (this.f110740b == c28787e.f110740b && Intrinsics.areEqual(this.f110741c, c28787e.f110741c) && Intrinsics.areEqual(this.f110742d, c28787e.f110742d)) {
                startsWith$default = StringsKt__StringsJVMKt.startsWith$default(this.f110739a, "index_", false, 2, null);
                if (startsWith$default) {
                    startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(c28787e.f110739a, "index_", false, 2, null);
                    return startsWith$default2;
                }
                return Intrinsics.areEqual(this.f110739a, c28787e.f110739a);
            }
            return false;
        }

        public int hashCode() {
            boolean startsWith$default;
            int hashCode;
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(this.f110739a, "index_", false, 2, null);
            if (startsWith$default) {
                hashCode = -1184239155;
            } else {
                hashCode = this.f110739a.hashCode();
            }
            return (((((hashCode * 31) + (this.f110740b ? 1 : 0)) * 31) + this.f110741c.hashCode()) * 31) + this.f110742d.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f110739a + "', unique=" + this.f110740b + ", columns=" + this.f110741c + ", orders=" + this.f110742d + "'}";
        }
    }

    public C49301tY5(String name, Map<String, C28782a> columns, Set<C28785c> foreignKeys, Set<C28787e> set) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(foreignKeys, "foreignKeys");
        this.f110717a = name;
        this.f110718b = columns;
        this.f110719c = foreignKeys;
        this.f110720d = set;
    }

    @JvmStatic
    /* renamed from: a */
    public static final C49301tY5 m12061a(InterfaceC45124mV5 interfaceC45124mV5, String str) {
        return f110716e.m12057a(interfaceC45124mV5, str);
    }

    public boolean equals(Object obj) {
        Set<C28787e> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49301tY5)) {
            return false;
        }
        C49301tY5 c49301tY5 = (C49301tY5) obj;
        if (!Intrinsics.areEqual(this.f110717a, c49301tY5.f110717a) || !Intrinsics.areEqual(this.f110718b, c49301tY5.f110718b) || !Intrinsics.areEqual(this.f110719c, c49301tY5.f110719c)) {
            return false;
        }
        Set<C28787e> set2 = this.f110720d;
        if (set2 == null || (set = c49301tY5.f110720d) == null) {
            return true;
        }
        return Intrinsics.areEqual(set2, set);
    }

    public int hashCode() {
        return (((this.f110717a.hashCode() * 31) + this.f110718b.hashCode()) * 31) + this.f110719c.hashCode();
    }

    public String toString() {
        return "TableInfo{name='" + this.f110717a + "', columns=" + this.f110718b + ", foreignKeys=" + this.f110719c + ", indices=" + this.f110720d + CoreConstants.CURLY_RIGHT;
    }
}
