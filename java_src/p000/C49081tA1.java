package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0014\u0010\r\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0011\u0010!\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u000b\u0010 ¨\u0006$"}, m28432d2 = {"LtA1;", "", "", "b", "Ljava/util/concurrent/Executor;", C17296a.f69688o, "Ljava/util/concurrent/Executor;", "executor", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "reportFullyDrawn", "c", "Ljava/lang/Object;", "lock", "", DateTokenConverter.CONVERTER_KEY, "I", "reporterCount", "", "e", "Z", "reportPosted", "f", "reportedFullyDrawn", "", "g", "Ljava/util/List;", "onReportCallbacks", "Ljava/lang/Runnable;", "h", "Ljava/lang/Runnable;", "reportRunnable", "()Z", "isFullyDrawnReported", "<init>", "(Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)V", "activity_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFullyDrawnReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,192:1\n1#2:193\n1855#3,2:194\n*S KotlinDebug\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n*L\n157#1:194,2\n*E\n"})
/* renamed from: tA1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49081tA1 {

    /* renamed from: a */
    public final Executor f109963a;

    /* renamed from: b */
    public final Function0<Unit> f109964b;

    /* renamed from: c */
    public final Object f109965c;

    /* renamed from: d */
    public int f109966d;

    /* renamed from: e */
    public boolean f109967e;

    /* renamed from: f */
    public boolean f109968f;

    /* renamed from: g */
    public final List<Function0<Unit>> f109969g;

    /* renamed from: h */
    public final Runnable f109970h;

    public C49081tA1(Executor executor, Function0<Unit> reportFullyDrawn) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(reportFullyDrawn, "reportFullyDrawn");
        this.f109963a = executor;
        this.f109964b = reportFullyDrawn;
        this.f109965c = new Object();
        this.f109969g = new ArrayList();
        this.f109970h = new Runnable() { // from class: sA1
            @Override // java.lang.Runnable
            public final void run() {
                C49081tA1.m12953d(C49081tA1.this);
            }
        };
    }

    /* renamed from: d */
    public static final void m12953d(C49081tA1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.f109965c) {
            this$0.f109967e = false;
            if (this$0.f109966d == 0 && !this$0.f109968f) {
                this$0.f109964b.invoke();
                this$0.m12955b();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: b */
    public final void m12955b() {
        synchronized (this.f109965c) {
            this.f109968f = true;
            Iterator<T> it = this.f109969g.iterator();
            while (it.hasNext()) {
                ((Function0) it.next()).invoke();
            }
            this.f109969g.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: c */
    public final boolean m12954c() {
        boolean z;
        synchronized (this.f109965c) {
            z = this.f109968f;
        }
        return z;
    }
}
