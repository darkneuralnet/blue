package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u0003*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003\u0082\u0001\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, m28432d2 = {"LZ21;", "T", "", C17296a.f69688o, "Lvg1;", "LMt2;", "LN93;", "LAT5;", "interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Z21 */
/* loaded from: classes2.dex */
public interface Z21<T> {

    /* renamed from: a */
    public static final C10105a f47770a = C10105a.f47771a;

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003J)\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0004\b\t\u0010\nJ.\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¨\u0006\u0013"}, m28432d2 = {"LZ21$a;", "", "T", "LWX;", "currentOpMode", "LMt2;", "b", "value", "LAT5;", "c", "(LWX;Ljava/lang/Object;)LAT5;", "", "errorCode", "", "throwable", "Lvg1;", C17296a.f69688o, "<init>", "()V", "interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Z21$a */
    /* loaded from: classes2.dex */
    public static final class C10105a {

        /* renamed from: a */
        public static final /* synthetic */ C10105a f47771a = new C10105a();

        private C10105a() {
        }

        public static /* synthetic */ C50560vg1 createError$default(C10105a c10105a, InterfaceC9077WX interfaceC9077WX, int i, Throwable th, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                th = null;
            }
            return c10105a.m73814a(interfaceC9077WX, i, th);
        }

        /* renamed from: a */
        public final <T> C50560vg1<T> m73814a(InterfaceC9077WX currentOpMode, int i, Throwable th) {
            Intrinsics.checkNotNullParameter(currentOpMode, "currentOpMode");
            return new C50560vg1<>(currentOpMode, i, th);
        }

        /* renamed from: b */
        public final <T> C34594Mt2<T> m73813b(InterfaceC9077WX currentOpMode) {
            Intrinsics.checkNotNullParameter(currentOpMode, "currentOpMode");
            return new C34594Mt2<>(currentOpMode);
        }

        /* renamed from: c */
        public final <T> AT5<T> m73812c(InterfaceC9077WX currentOpMode, T t) {
            Intrinsics.checkNotNullParameter(currentOpMode, "currentOpMode");
            return new AT5<>(currentOpMode, t);
        }
    }
}
