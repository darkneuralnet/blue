package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R$\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\f\u0010\n¨\u0006\u001e"}, m28432d2 = {"Ll72;", "T", "", "callback", "", "c", "(Ljava/lang/Object;)V", DateTokenConverter.CONVERTER_KEY, "", "b", "()Z", "Lkotlin/Function1;", C17296a.f69688o, "Lkotlin/jvm/functions/Function1;", "callbackInvoker", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "invalidGetter", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "", "Ljava/util/List;", "callbacks", "<set-?>", "e", "Z", "invalid", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: l72  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44309l72<T> {

    /* renamed from: a */
    public final Function1<T, Unit> f95573a;

    /* renamed from: b */
    public final Function0<Boolean> f95574b;

    /* renamed from: c */
    public final ReentrantLock f95575c;

    /* renamed from: d */
    public final List<T> f95576d;

    /* renamed from: e */
    public boolean f95577e;

    /* JADX WARN: Multi-variable type inference failed */
    public C44309l72(Function1<? super T, Unit> callbackInvoker, Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(callbackInvoker, "callbackInvoker");
        this.f95573a = callbackInvoker;
        this.f95574b = function0;
        this.f95575c = new ReentrantLock();
        this.f95576d = new ArrayList();
    }

    /* renamed from: a */
    public final boolean m27826a() {
        return this.f95577e;
    }

    /* renamed from: b */
    public final boolean m27825b() {
        List<T> list;
        if (this.f95577e) {
            return false;
        }
        ReentrantLock reentrantLock = this.f95575c;
        reentrantLock.lock();
        try {
            if (this.f95577e) {
                return false;
            }
            this.f95577e = true;
            list = CollectionsKt___CollectionsKt.toList(this.f95576d);
            this.f95576d.clear();
            Unit unit = Unit.INSTANCE;
            if (list != null) {
                Function1<T, Unit> function1 = this.f95573a;
                for (T t : list) {
                    function1.invoke(t);
                }
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: c */
    public final void m27824c(T t) {
        boolean z;
        Function0<Boolean> function0 = this.f95574b;
        boolean z2 = true;
        if (function0 != null && function0.invoke().booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m27825b();
        }
        if (this.f95577e) {
            this.f95573a.invoke(t);
            return;
        }
        ReentrantLock reentrantLock = this.f95575c;
        reentrantLock.lock();
        try {
            if (this.f95577e) {
                Unit unit = Unit.INSTANCE;
            } else {
                this.f95576d.add(t);
                z2 = false;
            }
            if (z2) {
                this.f95573a.invoke(t);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: d */
    public final void m27823d(T t) {
        ReentrantLock reentrantLock = this.f95575c;
        reentrantLock.lock();
        try {
            this.f95576d.remove(t);
        } finally {
            reentrantLock.unlock();
        }
    }

    public /* synthetic */ C44309l72(Function1 function1, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i & 2) != 0 ? null : function0);
    }
}
