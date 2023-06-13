package com.uber.autodispose;

import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.Scopes;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.functions.InterfaceC23484g;
import java.util.concurrent.Callable;
/* loaded from: classes7.dex */
public final class Scopes {
    private Scopes() {
    }

    /* renamed from: b */
    public static AbstractC23461c m45207b(final ScopeProvider scopeProvider) {
        return AbstractC23461c.m33035t(new Callable() { // from class: Xm5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23496h m45206c;
                m45206c = Scopes.m45206c(ScopeProvider.this);
                return m45206c;
            }
        });
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceC23496h m45206c(ScopeProvider scopeProvider) throws Exception {
        try {
            return scopeProvider.mo231T0();
        } catch (OutsideScopeException e) {
            InterfaceC23484g<? super OutsideScopeException> m45226a = AutoDisposePlugins.m45226a();
            if (m45226a != null) {
                m45226a.accept(e);
                return AbstractC23461c.m33039p();
            }
            return AbstractC23461c.m33080F(e);
        }
    }
}
