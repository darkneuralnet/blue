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
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m28432d2 = {"LKW;", "", "Ljava/util/UUID;", "b", "Ljava/util/UUID;", "()Ljava/util/UUID;", "uuid", "<init>", "(Ljava/lang/String;ILjava/util/UUID;)V", "c", DateTokenConverter.CONVERTER_KEY, "interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: KW */
/* loaded from: classes4.dex */
public final class EnumC4457KW {

    /* renamed from: c */
    public static final EnumC4457KW f19706c;

    /* renamed from: d */
    public static final EnumC4457KW f19707d;

    /* renamed from: e */
    public static final /* synthetic */ EnumC4457KW[] f19708e;

    /* renamed from: b */
    public final UUID f19709b;

    static {
        UUID fromString = UUID.fromString("0000fee7-0000-1000-8000-00805f9b34fb");
        Intrinsics.checkNotNullExpressionValue(fromString, "fromString(\"0000fee7-0000-1000-8000-00805f9b34fb\")");
        f19706c = new EnumC4457KW("NOKE_SERVICE_UUID", 0, fromString);
        UUID fromString2 = UUID.fromString("0000fee7-0000-1000-8000-00805f9b34fb");
        Intrinsics.checkNotNullExpressionValue(fromString2, "fromString(\"0000fee7-0000-1000-8000-00805f9b34fb\")");
        f19707d = new EnumC4457KW("SOLEBE_SERVICE_UUID", 1, fromString2);
        f19708e = m98809a();
    }

    public EnumC4457KW(String str, int i, UUID uuid) {
        this.f19709b = uuid;
    }

    /* renamed from: a */
    public static final /* synthetic */ EnumC4457KW[] m98809a() {
        return new EnumC4457KW[]{f19706c, f19707d};
    }

    public static EnumC4457KW valueOf(String str) {
        return (EnumC4457KW) Enum.valueOf(EnumC4457KW.class, str);
    }

    public static EnumC4457KW[] values() {
        return (EnumC4457KW[]) f19708e.clone();
    }

    /* renamed from: b */
    public final UUID m98808b() {
        return this.f19709b;
    }
}
