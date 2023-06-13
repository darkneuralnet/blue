package co.bird.android.buava;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u0000 \u0015*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u000f\u001aB\u0011\u0012\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0003\u001a\u0004\b\u00028\u0000ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\u0004J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u000e\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b9¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "T", "", "b", "()Ljava/lang/Object;", "alternative", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)Ljava/lang/Object;", "e", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "value", C17296a.f69688o, "(Ljava/lang/Object;)Lco/bird/android/buava/Optional;", "", "toString", "Ljava/lang/Object;", "Z", "c", "()Z", "isPresent", "<init>", "(Ljava/lang/Object;)V", "NotPresentException", "buava_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Optional<T> {

    /* renamed from: c */
    public static final C14443a f63040c = new C14443a(null);

    /* renamed from: a */
    public final T f63041a;

    /* renamed from: b */
    public final boolean f63042b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lco/bird/android/buava/Optional$NotPresentException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "buava_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes2.dex */
    public static final class NotPresentException extends RuntimeException {
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\u0006J\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u0002¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/buava/Optional$a;", "", "T", "t", "Lco/bird/android/buava/Optional;", "b", "(Ljava/lang/Object;)Lco/bird/android/buava/Optional;", "c", C17296a.f69688o, "<init>", "()V", "buava_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.buava.Optional$a */
    /* loaded from: classes2.dex */
    public static final class C14443a {
        public /* synthetic */ C14443a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final <T> Optional<T> m59034a() {
            return new Optional<>(null);
        }

        /* renamed from: b */
        public final <T> Optional<T> m59033b(T t) {
            return new Optional<>(t);
        }

        /* renamed from: c */
        public final <T> Optional<T> m59032c(T t) {
            return new Optional<>(t);
        }

        private C14443a() {
        }
    }

    public Optional(T t) {
        boolean z;
        this.f63041a = t;
        if (t != null) {
            z = true;
        } else {
            z = false;
        }
        this.f63042b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Optional copy$default(Optional optional, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = optional.f63041a;
        }
        return optional.m59039a(obj);
    }

    /* renamed from: a */
    public final Optional<T> m59039a(T t) {
        return new Optional<>(t);
    }

    /* renamed from: b */
    public final T m59038b() {
        T t = this.f63041a;
        if (t != null) {
            return t;
        }
        throw new NotPresentException();
    }

    /* renamed from: c */
    public final boolean m59037c() {
        return this.f63042b;
    }

    /* renamed from: d */
    public final T m59036d(T t) {
        T t2 = this.f63041a;
        return t2 == null ? t : t2;
    }

    /* renamed from: e */
    public final T m59035e() {
        return this.f63041a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Optional) {
            return Intrinsics.areEqual(m59035e(), ((Optional) obj).m59035e());
        }
        return false;
    }

    public int hashCode() {
        T t = this.f63041a;
        if (t != null) {
            return t.hashCode();
        }
        return 0;
    }

    public String toString() {
        T t = this.f63041a;
        return "Optional(value=" + t + ")";
    }
}
