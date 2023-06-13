package p000;

import ch.qos.logback.core.joran.action.ActionConst;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0007J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\nR(\u0010\u000f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u0011"}, m28432d2 = {"Lx36;", "", "LKg1;", C17296a.f69688o, "()LKg1;", "", "c", "()V", "eventLoop", DateTokenConverter.CONVERTER_KEY, "(LKg1;)V", "Ljava/lang/ThreadLocal;", "Lkotlinx/coroutines/internal/CommonThreadLocal;", "b", "Ljava/lang/ThreadLocal;", ActionConst.REF_ATTRIBUTE, "<init>", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: x36  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C51387x36 {

    /* renamed from: a */
    public static final C51387x36 f117057a = new C51387x36();

    /* renamed from: b */
    public static final ThreadLocal<AbstractC34008Kg1> f117058b = new ThreadLocal<>();

    private C51387x36() {
    }

    /* renamed from: a */
    public final AbstractC34008Kg1 m5889a() {
        return f117058b.get();
    }

    /* renamed from: b */
    public final AbstractC34008Kg1 m5888b() {
        ThreadLocal<AbstractC34008Kg1> threadLocal = f117058b;
        AbstractC34008Kg1 abstractC34008Kg1 = threadLocal.get();
        if (abstractC34008Kg1 == null) {
            AbstractC34008Kg1 m93586a = C34710Ng1.m93586a();
            threadLocal.set(m93586a);
            return m93586a;
        }
        return abstractC34008Kg1;
    }

    /* renamed from: c */
    public final void m5887c() {
        f117058b.set(null);
    }

    /* renamed from: d */
    public final void m5886d(AbstractC34008Kg1 abstractC34008Kg1) {
        f117058b.set(abstractC34008Kg1);
    }
}
