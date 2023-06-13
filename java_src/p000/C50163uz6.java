package p000;

import com.facebook.share.internal.C17296a;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0004H\u0002R \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"Luz6;", "T", "", "element", "", "c", "(Ljava/lang/Object;)V", "b", "()Ljava/lang/Object;", C17296a.f69688o, "LLX2;", "Ljava/lang/ref/Reference;", "LLX2;", "values", "Ljava/lang/ref/ReferenceQueue;", "Ljava/lang/ref/ReferenceQueue;", "referenceQueue", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWeakCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeakCache.kt\nandroidx/compose/ui/platform/WeakCache\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,76:1\n1182#2:77\n1161#2,2:78\n728#3,2:80\n48#3:82\n*S KotlinDebug\n*F\n+ 1 WeakCache.kt\nandroidx/compose/ui/platform/WeakCache\n*L\n29#1:77\n29#1:78,2\n38#1:80,2\n49#1:82\n*E\n"})
/* renamed from: uz6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50163uz6<T> {

    /* renamed from: a */
    public final LX2<Reference<T>> f113285a = new LX2<>(new Reference[16], 0);

    /* renamed from: b */
    public final ReferenceQueue<T> f113286b = new ReferenceQueue<>();

    /* renamed from: a */
    public final void m9415a() {
        Reference<? extends T> poll;
        do {
            poll = this.f113286b.poll();
            if (poll != null) {
                this.f113285a.m96709A(poll);
                continue;
            }
        } while (poll != null);
    }

    /* renamed from: b */
    public final T m9414b() {
        m9415a();
        while (this.f113285a.m96687x()) {
            LX2<Reference<T>> lx2 = this.f113285a;
            T t = lx2.m96707C(lx2.m96690u() - 1).get();
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void m9413c(T t) {
        m9415a();
        this.f113285a.m96701b(new WeakReference(t, this.f113286b));
    }
}
