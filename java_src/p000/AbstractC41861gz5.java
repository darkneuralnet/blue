package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H$J\b\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u001b\u0010\u0018\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m28432d2 = {"Lgz5;", "", "", "e", "", "c", "LqV5;", "b", "statement", "h", DateTokenConverter.CONVERTER_KEY, "", "canUseCached", "g", "LEb5;", C17296a.f69688o, "LEb5;", "database", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "lock", "Lkotlin/Lazy;", "f", "()LqV5;", "stmt", "<init>", "(LEb5;)V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: gz5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC41861gz5 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f84571a;

    /* renamed from: b */
    public final AtomicBoolean f84572b;

    /* renamed from: c */
    public final Lazy f84573c;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LqV5;", "b", "()LqV5;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: gz5$a */
    /* loaded from: classes.dex */
    public static final class C22525a extends Lambda implements Function0<InterfaceC47496qV5> {
        public C22525a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final InterfaceC47496qV5 invoke() {
            return AbstractC41861gz5.this.m37252d();
        }
    }

    public AbstractC41861gz5(AbstractC32563Eb5 database) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(database, "database");
        this.f84571a = database;
        this.f84572b = new AtomicBoolean(false);
        lazy = LazyKt__LazyJVMKt.lazy(new C22525a());
        this.f84573c = lazy;
    }

    /* renamed from: b */
    public InterfaceC47496qV5 m37254b() {
        m37253c();
        return m37250g(this.f84572b.compareAndSet(false, true));
    }

    /* renamed from: c */
    public void m37253c() {
        this.f84571a.m108732a();
    }

    /* renamed from: d */
    public final InterfaceC47496qV5 m37252d() {
        return this.f84571a.m108729d(mo3699e());
    }

    /* renamed from: e */
    public abstract String mo3699e();

    /* renamed from: f */
    public final InterfaceC47496qV5 m37251f() {
        return (InterfaceC47496qV5) this.f84573c.getValue();
    }

    /* renamed from: g */
    public final InterfaceC47496qV5 m37250g(boolean z) {
        if (z) {
            return m37251f();
        }
        return m37252d();
    }

    /* renamed from: h */
    public void m37249h(InterfaceC47496qV5 statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        if (statement == m37251f()) {
            this.f84572b.set(false);
        }
    }
}
