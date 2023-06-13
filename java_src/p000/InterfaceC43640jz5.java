package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.LongCompanionObject;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\b"}, m28432d2 = {"Ljz5;", "", "LtP5;", "", "subscriptionCount", "LEu1;", "Lhz5;", C17296a.f69688o, "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: jz5 */
/* loaded from: classes8.dex */
public interface InterfaceC43640jz5 {

    /* renamed from: a */
    public static final C25067a f93705a = C25067a.f93706a;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\u0010"}, m28432d2 = {"Ljz5$a;", "", "", "stopTimeoutMillis", "replayExpirationMillis", "Ljz5;", C17296a.f69688o, "b", "Ljz5;", "c", "()Ljz5;", "Eagerly", DateTokenConverter.CONVERTER_KEY, "Lazily", "<init>", "()V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: jz5$a */
    /* loaded from: classes8.dex */
    public static final class C25067a {

        /* renamed from: a */
        public static final /* synthetic */ C25067a f93706a = new C25067a();

        /* renamed from: b */
        public static final InterfaceC43640jz5 f93707b = new C45070mP5();

        /* renamed from: c */
        public static final InterfaceC43640jz5 f93708c = new C45663nP5();

        private C25067a() {
        }

        /* renamed from: b */
        public static /* synthetic */ InterfaceC43640jz5 m29522b(C25067a c25067a, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = 0;
            }
            if ((i & 2) != 0) {
                j2 = LongCompanionObject.MAX_VALUE;
            }
            return c25067a.m29523a(j, j2);
        }

        /* renamed from: a */
        public final InterfaceC43640jz5 m29523a(long j, long j2) {
            return new C46256oP5(j, j2);
        }

        /* renamed from: c */
        public final InterfaceC43640jz5 m29521c() {
            return f93707b;
        }

        /* renamed from: d */
        public final InterfaceC43640jz5 m29520d() {
            return f93708c;
        }
    }

    /* renamed from: a */
    InterfaceC32730Eu1<EnumC42454hz5> mo21100a(InterfaceC49220tP5<Integer> interfaceC49220tP5);
}
