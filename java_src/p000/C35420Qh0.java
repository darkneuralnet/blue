package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087@\u0018\u0000 \u001e*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0013\u001e\u001dB\u0016\b\u0001\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0015\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019\u0088\u0001\u0017\u0092\u0001\u0004\u0018\u00010\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, m28432d2 = {"LQh0;", "T", "", "f", "(Ljava/lang/Object;)Ljava/lang/Object;", "g", "", "e", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "k", "(Ljava/lang/Object;)Ljava/lang/String;", "", "h", "(Ljava/lang/Object;)I", LegacyRepairType.OTHER_KEY, "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;Ljava/lang/Object;)Z", C17296a.f69688o, "Ljava/lang/Object;", "getHolder$annotations", "()V", "holder", "j", "(Ljava/lang/Object;)Z", "isSuccess", "i", "isClosed", "c", "b", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
@JvmInline
/* renamed from: Qh0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C35420Qh0<T> {

    /* renamed from: b */
    public static final C6844b f30755b = new C6844b(null);

    /* renamed from: c */
    public static final C6845c f30756c = new C6845c();

    /* renamed from: a */
    public final Object f30757a;

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"LQh0$a;", "LQh0$c;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", "", C17296a.f69688o, "Ljava/lang/Throwable;", "cause", "<init>", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: Qh0$a */
    /* loaded from: classes8.dex */
    public static final class C6843a extends C6845c {
        @JvmField

        /* renamed from: a */
        public final Throwable f30758a;

        public C6843a(Throwable th) {
            this.f30758a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C6843a) && Intrinsics.areEqual(this.f30758a, ((C6843a) obj).f30758a);
        }

        public int hashCode() {
            Throwable th = this.f30758a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // p000.C35420Qh0.C6845c
        public String toString() {
            return "Closed(" + this.f30758a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u0002H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, m28432d2 = {"LQh0$b;", "", "E", "value", "LQh0;", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "", "cause", C17296a.f69688o, "(Ljava/lang/Throwable;)Ljava/lang/Object;", "LQh0$c;", "failed", "LQh0$c;", "<init>", "()V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: Qh0$b */
    /* loaded from: classes8.dex */
    public static final class C6844b {
        public /* synthetic */ C6844b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final <E> Object m88177a(Throwable th) {
            return C35420Qh0.m88187c(new C6843a(th));
        }

        /* renamed from: b */
        public final <E> Object m88176b() {
            return C35420Qh0.m88187c(C35420Qh0.f30756c);
        }

        /* renamed from: c */
        public final <E> Object m88175c(E e) {
            return C35420Qh0.m88187c(e);
        }

        private C6844b() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"LQh0$c;", "", "", "toString", "<init>", "()V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: Qh0$c */
    /* loaded from: classes8.dex */
    public static class C6845c {
        public String toString() {
            return "Failed";
        }
    }

    @PublishedApi
    public /* synthetic */ C35420Qh0(Object obj) {
        this.f30757a = obj;
    }

    /* renamed from: b */
    public static final /* synthetic */ C35420Qh0 m88188b(Object obj) {
        return new C35420Qh0(obj);
    }

    @PublishedApi
    /* renamed from: c */
    public static <T> Object m88187c(Object obj) {
        return obj;
    }

    /* renamed from: d */
    public static boolean m88186d(Object obj, Object obj2) {
        return (obj2 instanceof C35420Qh0) && Intrinsics.areEqual(obj, ((C35420Qh0) obj2).m88178l());
    }

    /* renamed from: e */
    public static final Throwable m88185e(Object obj) {
        C6843a c6843a = obj instanceof C6843a ? (C6843a) obj : null;
        if (c6843a != null) {
            return c6843a.f30758a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static final T m88184f(Object obj) {
        if (obj instanceof C6845c) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public static final T m88183g(Object obj) {
        Throwable th;
        if (!(obj instanceof C6845c)) {
            return obj;
        }
        if ((obj instanceof C6843a) && (th = ((C6843a) obj).f30758a) != null) {
            throw th;
        }
        throw new IllegalStateException(("Trying to call 'getOrThrow' on a failed channel result: " + obj).toString());
    }

    /* renamed from: h */
    public static int m88182h(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: i */
    public static final boolean m88181i(Object obj) {
        return obj instanceof C6843a;
    }

    /* renamed from: j */
    public static final boolean m88180j(Object obj) {
        return !(obj instanceof C6845c);
    }

    /* renamed from: k */
    public static String m88179k(Object obj) {
        if (obj instanceof C6843a) {
            return ((C6843a) obj).toString();
        }
        return "Value(" + obj + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return m88186d(this.f30757a, obj);
    }

    public int hashCode() {
        return m88182h(this.f30757a);
    }

    /* renamed from: l */
    public final /* synthetic */ Object m88178l() {
        return this.f30757a;
    }

    public String toString() {
        return m88179k(this.f30757a);
    }
}
