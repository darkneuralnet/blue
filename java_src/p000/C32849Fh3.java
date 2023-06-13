package p000;

import androidx.work.AbstractC12126c;
import androidx.work.OverwritingInputMerger;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000.EG6;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0002\u0007\bB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, m28432d2 = {"LFh3;", "LEG6;", "LFh3$a;", "builder", "<init>", "(LFh3$a;)V", "e", C17296a.f69688o, "b", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Fh3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32849Fh3 extends EG6 {

    /* renamed from: e */
    public static final C2400b f9959e = new C2400b(null);

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0006\u001a\u00020\u00002\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003J\u000f\u0010\u0007\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00008PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, m28432d2 = {"LFh3$a;", "LEG6$a;", "LFh3;", "Ljava/lang/Class;", "Lh32;", "inputMerger", "n", "l", "()LFh3;", "m", "()LFh3$a;", "thisObject", "Landroidx/work/c;", "workerClass", "<init>", "(Ljava/lang/Class;)V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Fh3$a */
    /* loaded from: classes.dex */
    public static final class C2399a extends EG6.AbstractC1769a<C2399a, C32849Fh3> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2399a(Class<? extends AbstractC12126c> workerClass) {
            super(workerClass);
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            m109253g().f13194d = OverwritingInputMerger.class.getName();
        }

        @Override // p000.EG6.AbstractC1769a
        /* renamed from: l */
        public C32849Fh3 mo19321b() {
            boolean z;
            if (m109256c() && m109253g().f13200j.m26576h()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return new C32849Fh3(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
        }

        @Override // p000.EG6.AbstractC1769a
        /* renamed from: m */
        public C2399a mo19320f() {
            return this;
        }

        /* renamed from: n */
        public final C2399a m106742n(Class<? extends AbstractC41897h32> inputMerger) {
            Intrinsics.checkNotNullParameter(inputMerger, "inputMerger");
            m109253g().f13194d = inputMerger.getName();
            return this;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0007¨\u0006\t"}, m28432d2 = {"LFh3$b;", "", "Ljava/lang/Class;", "Landroidx/work/c;", "workerClass", "LFh3;", C17296a.f69688o, "<init>", "()V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Fh3$b */
    /* loaded from: classes.dex */
    public static final class C2400b {
        public /* synthetic */ C2400b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C32849Fh3 m106741a(Class<? extends AbstractC12126c> workerClass) {
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            return new C2399a(workerClass).m109257a();
        }

        private C2400b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32849Fh3(C2399a builder) {
        super(builder.m109255d(), builder.m109253g(), builder.m109254e());
        Intrinsics.checkNotNullParameter(builder, "builder");
    }

    @JvmStatic
    /* renamed from: e */
    public static final C32849Fh3 m106745e(Class<? extends AbstractC12126c> cls) {
        return f9959e.m106741a(cls);
    }
}
