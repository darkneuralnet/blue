package co.bird.android.model;

import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.Intrinsics;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum ALL uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m28432d2 = {"Lco/bird/android/model/Countries;", "", "countries", "", "", "(Ljava/lang/String;ILjava/util/Set;)V", "getCountries", "()Ljava/util/Set;", "ALL", "EUROPE", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class Countries {
    private static final /* synthetic */ Countries[] $VALUES;
    public static final Countries ALL;
    public static final Countries EUROPE;
    private final Set<String> countries;

    private static final /* synthetic */ Countries[] $values() {
        return new Countries[]{ALL, EUROPE};
    }

    static {
        Set set;
        Set of;
        String[] iSOCountries = Locale.getISOCountries();
        Intrinsics.checkNotNullExpressionValue(iSOCountries, "getISOCountries()");
        set = ArraysKt___ArraysKt.toSet(iSOCountries);
        ALL = new Countries("ALL", 0, set);
        of = SetsKt__SetsKt.setOf((Object[]) new String[]{"AT", "BE", "BR", "BG", "HR", "CY", "CZ", "DK", "EE", "FI", "FR", "DE", "GR", "HU", "IS", "IE", "IT", "LV", "LI", "LT", "LU", "MT", "NL", "NO", "PL", "PT", "RO", "SK", "SI", "ES", "SE", "CH", "GB"});
        EUROPE = new Countries("EUROPE", 1, of);
        $VALUES = $values();
    }

    private Countries(String str, int i, Set set) {
        this.countries = set;
    }

    public static Countries valueOf(String str) {
        return (Countries) Enum.valueOf(Countries.class, str);
    }

    public static Countries[] values() {
        return (Countries[]) $VALUES.clone();
    }

    public final Set<String> getCountries() {
        return this.countries;
    }
}
