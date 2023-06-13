package p000;

import android.os.Bundle;
import androidx.lifecycle.AbstractC11719f;
import androidx.savedstate.C11966a;
import androidx.savedstate.Recreator;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00062\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"LOi5;", "", "", "c", "Landroid/os/Bundle;", "savedState", DateTokenConverter.CONVERTER_KEY, "outBundle", "e", "LPi5;", C17296a.f69688o, "LPi5;", "owner", "Landroidx/savedstate/a;", "b", "Landroidx/savedstate/a;", "()Landroidx/savedstate/a;", "savedStateRegistry", "", "Z", "attached", "<init>", "(LPi5;)V", "savedstate_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Oi5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34966Oi5 {

    /* renamed from: d */
    public static final C6099a f27078d = new C6099a(null);

    /* renamed from: a */
    public final InterfaceC35200Pi5 f27079a;

    /* renamed from: b */
    public final C11966a f27080b;

    /* renamed from: c */
    public boolean f27081c;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, m28432d2 = {"LOi5$a;", "", "LPi5;", "owner", "LOi5;", C17296a.f69688o, "<init>", "()V", "savedstate_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Oi5$a */
    /* loaded from: classes.dex */
    public static final class C6099a {
        public /* synthetic */ C6099a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C34966Oi5 m91661a(InterfaceC35200Pi5 owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return new C34966Oi5(owner, null);
        }

        private C6099a() {
        }
    }

    public /* synthetic */ C34966Oi5(InterfaceC35200Pi5 interfaceC35200Pi5, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC35200Pi5);
    }

    @JvmStatic
    /* renamed from: a */
    public static final C34966Oi5 m91666a(InterfaceC35200Pi5 interfaceC35200Pi5) {
        return f27078d.m91661a(interfaceC35200Pi5);
    }

    /* renamed from: b */
    public final C11966a m91665b() {
        return this.f27080b;
    }

    /* renamed from: c */
    public final void m91664c() {
        boolean z;
        AbstractC11719f lifecycle = this.f27079a.getLifecycle();
        if (lifecycle.mo67007b() == AbstractC11719f.EnumC11724b.INITIALIZED) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            lifecycle.mo67008a(new Recreator(this.f27079a));
            this.f27080b.m66072f(lifecycle);
            this.f27081c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    /* renamed from: d */
    public final void m91663d(Bundle bundle) {
        if (!this.f27081c) {
            m91664c();
        }
        AbstractC11719f lifecycle = this.f27079a.getLifecycle();
        if (!lifecycle.mo67007b().m67013b(AbstractC11719f.EnumC11724b.STARTED)) {
            this.f27080b.m66071g(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.mo67007b()).toString());
    }

    /* renamed from: e */
    public final void m91662e(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        this.f27080b.m66070h(outBundle);
    }

    public C34966Oi5(InterfaceC35200Pi5 interfaceC35200Pi5) {
        this.f27079a = interfaceC35200Pi5;
        this.f27080b = new C11966a();
    }
}
