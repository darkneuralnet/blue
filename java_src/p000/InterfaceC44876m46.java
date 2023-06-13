package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0006"}, m28432d2 = {"Lm46;", "", "", C17296a.f69688o, "Lorg/joda/time/DateTime;", "b", "localization_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: m46  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC44876m46 {

    /* renamed from: a */
    public static final C25905a f97292a = C25905a.f97293a;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m28432d2 = {"Lm46$a;", "", "Lm46;", "b", "Lm46;", C17296a.f69688o, "()Lm46;", "SYSTEM", "<init>", "()V", "localization_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: m46$a */
    /* loaded from: classes3.dex */
    public static final class C25905a {

        /* renamed from: a */
        public static final /* synthetic */ C25905a f97293a = new C25905a();

        /* renamed from: b */
        public static final InterfaceC44876m46 f97294b = new C25906a();

        @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, m28432d2 = {"m46$a$a", "Lm46;", "", C17296a.f69688o, "Lorg/joda/time/DateTime;", "b", "localization_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: m46$a$a */
        /* loaded from: classes3.dex */
        public static final class C25906a implements InterfaceC44876m46 {
            @Override // p000.InterfaceC44876m46
            /* renamed from: a */
            public long mo26387a() {
                return System.currentTimeMillis();
            }

            @Override // p000.InterfaceC44876m46
            /* renamed from: b */
            public DateTime mo26386b() {
                DateTime now = DateTime.now();
                Intrinsics.checkNotNullExpressionValue(now, "now()");
                return now;
            }
        }

        private C25905a() {
        }

        /* renamed from: a */
        public final InterfaceC44876m46 m26388a() {
            return f97294b;
        }
    }

    /* renamed from: a */
    long mo26387a();

    /* renamed from: b */
    DateTime mo26386b();
}
