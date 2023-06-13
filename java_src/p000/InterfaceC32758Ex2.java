package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u001c\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u001c\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u001c\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¨\u0006\n"}, m28432d2 = {"LEx2;", "", "", "message", "", "throwable", "", C17296a.f69688o, "b", "error", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ex2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC32758Ex2 {

    /* renamed from: a */
    public static final C2027a f8338a = C2027a.f8339b;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\f"}, m28432d2 = {"LEx2$a;", "LEx2;", "", "message", "", "throwable", "", C17296a.f69688o, "b", "error", "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Ex2$a */
    /* loaded from: classes5.dex */
    public static final class C2027a implements InterfaceC32758Ex2 {

        /* renamed from: b */
        public static final /* synthetic */ C2027a f8339b = new C2027a();

        private C2027a() {
        }

        @Override // p000.InterfaceC32758Ex2
        /* renamed from: a */
        public void mo30037a(String message, Throwable th) {
            Intrinsics.checkNotNullParameter(message, "message");
            C43475jj0.f93239a.m30040c().mo30037a(message, th);
        }

        @Override // p000.InterfaceC32758Ex2
        /* renamed from: b */
        public void mo30036b(String message, Throwable th) {
            Intrinsics.checkNotNullParameter(message, "message");
            C43475jj0.f93239a.m30040c().mo30036b(message, th);
        }

        @Override // p000.InterfaceC32758Ex2
        public void error(String message, Throwable th) {
            Intrinsics.checkNotNullParameter(message, "message");
            C43475jj0.f93239a.m30040c().error(message, th);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ex2$b */
    /* loaded from: classes5.dex */
    public static final class C2028b {
        /* renamed from: a */
        public static /* synthetic */ void m108185a(InterfaceC32758Ex2 interfaceC32758Ex2, String str, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            interfaceC32758Ex2.error(str, th);
        }

        /* renamed from: b */
        public static /* synthetic */ void m108184b(InterfaceC32758Ex2 interfaceC32758Ex2, String str, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            interfaceC32758Ex2.mo30037a(str, th);
        }

        /* renamed from: c */
        public static /* synthetic */ void m108183c(InterfaceC32758Ex2 interfaceC32758Ex2, String str, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            interfaceC32758Ex2.mo30036b(str, th);
        }
    }

    /* renamed from: a */
    void mo30037a(String str, Throwable th);

    /* renamed from: b */
    void mo30036b(String str, Throwable th);

    void error(String str, Throwable th);
}
