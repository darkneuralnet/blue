package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J$\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016J\u001e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0002R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, m28432d2 = {"LsU2;", "LpG2;", "LqZ0;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "B", "", "timeMillis", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lo51;", "t", "", "S", "LWc0;", "", "continuation", "V", "", "toString", "T", "", "c", "Ljava/lang/Throwable;", "cause", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "errorHint", "G", "()LpG2;", "immediate", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: sU2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48669sU2 extends AbstractC46765pG2 implements InterfaceC47527qZ0 {

    /* renamed from: c */
    public final Throwable f108854c;

    /* renamed from: d */
    public final String f108855d;

    public /* synthetic */ C48669sU2(Throwable th, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i & 2) != 0 ? null : str);
    }

    @Override // p000.SC0
    /* renamed from: B */
    public boolean mo14157B(CoroutineContext coroutineContext) {
        m14154T();
        throw new KotlinNothingValueException();
    }

    @Override // p000.AbstractC46765pG2
    /* renamed from: G */
    public AbstractC46765pG2 mo14156G() {
        return this;
    }

    @Override // p000.SC0
    /* renamed from: S */
    public Void mo14150y(CoroutineContext coroutineContext, Runnable runnable) {
        m14154T();
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r1 == null) goto L10;
     */
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Void m14154T() {
        String str;
        if (this.f108854c != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Module with the Main dispatcher had failed to initialize");
            String str2 = this.f108855d;
            if (str2 != null) {
                str = ". " + str2;
            }
            str = "";
            sb.append(str);
            throw new IllegalStateException(sb.toString(), this.f108854c);
        }
        C48543sG2.m14487d();
        throw new KotlinNothingValueException();
    }

    @Override // p000.InterfaceC47527qZ0
    /* renamed from: V */
    public Void mo14152l(long j, InterfaceC36779Wc0<? super Unit> interfaceC36779Wc0) {
        m14154T();
        throw new KotlinNothingValueException();
    }

    @Override // p000.InterfaceC47527qZ0
    /* renamed from: t */
    public InterfaceC46067o51 mo14151t(long j, Runnable runnable, CoroutineContext coroutineContext) {
        m14154T();
        throw new KotlinNothingValueException();
    }

    @Override // p000.AbstractC46765pG2, p000.SC0
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        if (this.f108854c != null) {
            str = ", cause=" + this.f108854c;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }

    public C48669sU2(Throwable th, String str) {
        this.f108854c = th;
        this.f108855d = str;
    }
}
