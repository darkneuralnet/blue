package p000;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum REQUEST_CONTEXT uses external variables
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
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m28432d2 = {"Lrz5;", "", "Ljava/lang/reflect/Type;", "b", "Ljava/lang/reflect/Type;", "()Ljava/lang/reflect/Type;", "type", "<init>", "(Ljava/lang/String;ILjava/lang/reflect/Type;)V", "REQUEST_CONTEXT", "REQUEST_PAYMENT", "CLOSE_VIEW", "c", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: rz5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC48383rz5 {
    @JsonProperty("closeView")
    @InterfaceC41208ft5("closeView")
    public static final EnumC48383rz5 CLOSE_VIEW;
    @JsonProperty("requestContext")
    @InterfaceC41208ft5("requestContext")
    public static final EnumC48383rz5 REQUEST_CONTEXT;
    @JsonProperty("requestPayment")
    @InterfaceC41208ft5("requestPayment")
    public static final EnumC48383rz5 REQUEST_PAYMENT;

    /* renamed from: c */
    public static final EnumC48383rz5 f108095c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC48383rz5[] f108096d;

    /* renamed from: b */
    public final Type f108097b;

    static {
        Type REQUEST_CONTEXT_TYPE;
        Type REQUEST_PAYMENT_TYPE;
        Type CLOSE_VIEW_TYPE;
        Type UNKNOWN_TYPE;
        REQUEST_CONTEXT_TYPE = C49569tz5.f111442a;
        Intrinsics.checkNotNullExpressionValue(REQUEST_CONTEXT_TYPE, "REQUEST_CONTEXT_TYPE");
        REQUEST_CONTEXT = new EnumC48383rz5("REQUEST_CONTEXT", 0, REQUEST_CONTEXT_TYPE);
        REQUEST_PAYMENT_TYPE = C49569tz5.f111443b;
        Intrinsics.checkNotNullExpressionValue(REQUEST_PAYMENT_TYPE, "REQUEST_PAYMENT_TYPE");
        REQUEST_PAYMENT = new EnumC48383rz5("REQUEST_PAYMENT", 1, REQUEST_PAYMENT_TYPE);
        CLOSE_VIEW_TYPE = C49569tz5.f111444c;
        Intrinsics.checkNotNullExpressionValue(CLOSE_VIEW_TYPE, "CLOSE_VIEW_TYPE");
        CLOSE_VIEW = new EnumC48383rz5("CLOSE_VIEW", 2, CLOSE_VIEW_TYPE);
        UNKNOWN_TYPE = C49569tz5.f111445d;
        Intrinsics.checkNotNullExpressionValue(UNKNOWN_TYPE, "UNKNOWN_TYPE");
        f108095c = new EnumC48383rz5("UNKNOWN", 3, UNKNOWN_TYPE);
        f108096d = m14908a();
    }

    public EnumC48383rz5(String str, int i, Type type) {
        this.f108097b = type;
    }

    /* renamed from: a */
    public static final /* synthetic */ EnumC48383rz5[] m14908a() {
        return new EnumC48383rz5[]{REQUEST_CONTEXT, REQUEST_PAYMENT, CLOSE_VIEW, f108095c};
    }

    public static EnumC48383rz5 valueOf(String str) {
        return (EnumC48383rz5) Enum.valueOf(EnumC48383rz5.class, str);
    }

    public static EnumC48383rz5[] values() {
        return (EnumC48383rz5[]) f108096d.clone();
    }

    /* renamed from: b */
    public final Type m14907b() {
        return this.f108097b;
    }
}
