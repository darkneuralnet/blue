package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum c uses external variables
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
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m28432d2 = {"LWi6;", "", "Ljava/util/UUID;", "b", "Ljava/util/UUID;", "()Ljava/util/UUID;", "uuid", "<init>", "(Ljava/lang/String;ILjava/util/UUID;)V", "c", DateTokenConverter.CONVERTER_KEY, "vtbeacon_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Wi6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC36839Wi6 {

    /* renamed from: c */
    public static final EnumC36839Wi6 f41560c;

    /* renamed from: d */
    public static final EnumC36839Wi6 f41561d;

    /* renamed from: e */
    public static final /* synthetic */ EnumC36839Wi6[] f41562e;

    /* renamed from: b */
    public final UUID f41563b;

    static {
        UUID fromString = UUID.fromString("5413000B-98C4-48E3-999C-01FB46C6547F");
        Intrinsics.checkNotNullExpressionValue(fromString, "fromString(\"5413000B-98C4-48E3-999C-01FB46C6547F\")");
        f41560c = new EnumC36839Wi6("WRITE", 0, fromString);
        UUID fromString2 = UUID.fromString("5413000C-98C4-48E3-999C-01FB46C6547F");
        Intrinsics.checkNotNullExpressionValue(fromString2, "fromString(\"5413000C-98C4-48E3-999C-01FB46C6547F\")");
        f41561d = new EnumC36839Wi6("ACK", 1, fromString2);
        f41562e = m77955a();
    }

    public EnumC36839Wi6(String str, int i, UUID uuid) {
        this.f41563b = uuid;
    }

    /* renamed from: a */
    public static final /* synthetic */ EnumC36839Wi6[] m77955a() {
        return new EnumC36839Wi6[]{f41560c, f41561d};
    }

    public static EnumC36839Wi6 valueOf(String str) {
        return (EnumC36839Wi6) Enum.valueOf(EnumC36839Wi6.class, str);
    }

    public static EnumC36839Wi6[] values() {
        return (EnumC36839Wi6[]) f41562e.clone();
    }

    /* renamed from: b */
    public final UUID m77954b() {
        return this.f41563b;
    }
}
