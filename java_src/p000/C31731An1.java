package p000;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import dagger.Module;
import dagger.Provides;
@Module
/* renamed from: An1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C31731An1 {

    /* renamed from: a */
    public final C31722Am1 f1065a;

    /* renamed from: b */
    public final InterfaceC35934Sm1 f1066b;

    /* renamed from: c */
    public final X94<C36486Uv4> f1067c;

    /* renamed from: d */
    public final X94<U96> f1068d;

    public C31731An1(C31722Am1 c31722Am1, InterfaceC35934Sm1 interfaceC35934Sm1, X94<C36486Uv4> x94, X94<U96> x942) {
        this.f1065a = c31722Am1;
        this.f1066b = interfaceC35934Sm1;
        this.f1067c = x94;
        this.f1068d = x942;
    }

    @Provides
    /* renamed from: a */
    public C32036Bv0 m115271a() {
        return C32036Bv0.m113351g();
    }

    @Provides
    /* renamed from: b */
    public C31722Am1 m115270b() {
        return this.f1065a;
    }

    @Provides
    /* renamed from: c */
    public InterfaceC35934Sm1 m115269c() {
        return this.f1066b;
    }

    @Provides
    /* renamed from: d */
    public X94<C36486Uv4> m115268d() {
        return this.f1067c;
    }

    @Provides
    /* renamed from: e */
    public RemoteConfigManager m115267e() {
        return RemoteConfigManager.getInstance();
    }

    @Provides
    /* renamed from: f */
    public SessionManager m115266f() {
        return SessionManager.getInstance();
    }

    @Provides
    /* renamed from: g */
    public X94<U96> m115265g() {
        return this.f1068d;
    }
}
