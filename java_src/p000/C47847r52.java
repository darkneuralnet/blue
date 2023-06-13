package p000;

import com.facebook.C17216a;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import p000.C32172Ck1;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, m28432d2 = {"Lr52;", "", "", C17296a.f69688o, "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: r52  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47847r52 {

    /* renamed from: a */
    public static final C47847r52 f106444a = new C47847r52();

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "enabled", "", C17296a.f69688o, "(Z)V"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: r52$a */
    /* loaded from: classes5.dex */
    public static final class C27846a implements C32172Ck1.InterfaceC1164a {

        /* renamed from: a */
        public static final C27846a f106445a = new C27846a();

        @Override // p000.C32172Ck1.InterfaceC1164a
        /* renamed from: a */
        public final void mo16504a(boolean z) {
            if (z) {
                RD0.f31690d.m87146a();
                if (C32172Ck1.m111754g(C32172Ck1.EnumC1165b.CrashShield)) {
                    C37050Xg1.m76707a();
                    TD0.m84206a();
                }
                if (C32172Ck1.m111754g(C32172Ck1.EnumC1165b.ThreadCheck)) {
                    C49016t36.m13185a();
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "enabled", "", C17296a.f69688o, "(Z)V"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: r52$b */
    /* loaded from: classes5.dex */
    public static final class C27847b implements C32172Ck1.InterfaceC1164a {

        /* renamed from: a */
        public static final C27847b f106446a = new C27847b();

        @Override // p000.C32172Ck1.InterfaceC1164a
        /* renamed from: a */
        public final void mo16504a(boolean z) {
            if (z) {
                C45818ng1.m23338a();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "enabled", "", C17296a.f69688o, "(Z)V"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: r52$c */
    /* loaded from: classes5.dex */
    public static final class C27848c implements C32172Ck1.InterfaceC1164a {

        /* renamed from: a */
        public static final C27848c f106447a = new C27848c();

        @Override // p000.C32172Ck1.InterfaceC1164a
        /* renamed from: a */
        public final void mo16504a(boolean z) {
            if (z) {
                C29720w.m7611a();
            }
        }
    }

    private C47847r52() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m16505a() {
        if (!C17216a.m52736j()) {
            return;
        }
        C32172Ck1.m111760a(C32172Ck1.EnumC1165b.CrashReport, C27846a.f106445a);
        C32172Ck1.m111760a(C32172Ck1.EnumC1165b.ErrorReport, C27847b.f106446a);
        C32172Ck1.m111760a(C32172Ck1.EnumC1165b.AnrReport, C27848c.f106447a);
    }
}
