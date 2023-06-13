package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum e uses external variables
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
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m28432d2 = {"LVb5;", "", "LUj6;", "b", "LUj6;", DateTokenConverter.CONVERTER_KEY, "()LUj6;", "yaw", "c", "pitch", "roll", "<init>", "(Ljava/lang/String;ILUj6;LUj6;LUj6;)V", "e", "f", "g", "h", "i", "j", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Vb5  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC36541Vb5 {

    /* renamed from: e */
    public static final EnumC36541Vb5 f39322e;

    /* renamed from: f */
    public static final EnumC36541Vb5 f39323f;

    /* renamed from: g */
    public static final EnumC36541Vb5 f39324g;

    /* renamed from: h */
    public static final EnumC36541Vb5 f39325h;

    /* renamed from: i */
    public static final EnumC36541Vb5 f39326i;

    /* renamed from: j */
    public static final EnumC36541Vb5 f39327j;

    /* renamed from: k */
    public static final /* synthetic */ EnumC36541Vb5[] f39328k;

    /* renamed from: b */
    public final EnumC36380Uj6 f39329b;

    /* renamed from: c */
    public final EnumC36380Uj6 f39330c;

    /* renamed from: d */
    public final EnumC36380Uj6 f39331d;

    static {
        EnumC36380Uj6 enumC36380Uj6 = EnumC36380Uj6.X;
        EnumC36380Uj6 enumC36380Uj62 = EnumC36380Uj6.Y;
        EnumC36380Uj6 enumC36380Uj63 = EnumC36380Uj6.Z;
        f39322e = new EnumC36541Vb5("XYZ", 0, enumC36380Uj6, enumC36380Uj62, enumC36380Uj63);
        f39323f = new EnumC36541Vb5("XZY", 1, enumC36380Uj6, enumC36380Uj63, enumC36380Uj62);
        f39324g = new EnumC36541Vb5("YXZ", 2, enumC36380Uj62, enumC36380Uj6, enumC36380Uj63);
        f39325h = new EnumC36541Vb5("YZX", 3, enumC36380Uj62, enumC36380Uj63, enumC36380Uj6);
        f39326i = new EnumC36541Vb5("ZXY", 4, enumC36380Uj63, enumC36380Uj6, enumC36380Uj62);
        f39327j = new EnumC36541Vb5("ZYX", 5, enumC36380Uj63, enumC36380Uj62, enumC36380Uj6);
        f39328k = m79688a();
    }

    public EnumC36541Vb5(String str, int i, EnumC36380Uj6 enumC36380Uj6, EnumC36380Uj6 enumC36380Uj62, EnumC36380Uj6 enumC36380Uj63) {
        this.f39329b = enumC36380Uj6;
        this.f39330c = enumC36380Uj62;
        this.f39331d = enumC36380Uj63;
    }

    /* renamed from: a */
    public static final /* synthetic */ EnumC36541Vb5[] m79688a() {
        return new EnumC36541Vb5[]{f39322e, f39323f, f39324g, f39325h, f39326i, f39327j};
    }

    public static EnumC36541Vb5 valueOf(String str) {
        return (EnumC36541Vb5) Enum.valueOf(EnumC36541Vb5.class, str);
    }

    public static EnumC36541Vb5[] values() {
        return (EnumC36541Vb5[]) f39328k.clone();
    }

    /* renamed from: b */
    public final EnumC36380Uj6 m79687b() {
        return this.f39330c;
    }

    /* renamed from: c */
    public final EnumC36380Uj6 m79686c() {
        return this.f39331d;
    }

    /* renamed from: d */
    public final EnumC36380Uj6 m79685d() {
        return this.f39329b;
    }
}
