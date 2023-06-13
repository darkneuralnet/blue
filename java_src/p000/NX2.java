package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010\u0004\u001a\u00020\u0003J\u001d\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fJ\u0018\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000bR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00148\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"LNX2;", "T", "", "", "c", "", "index", "element", C17296a.f69688o, "(ILjava/lang/Object;)V", "g", "(I)Ljava/lang/Object;", "", "b", DateTokenConverter.CONVERTER_KEY, "LLX2;", "LLX2;", "f", "()LLX2;", "vector", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "getOnVectorMutated", "()Lkotlin/jvm/functions/Function0;", "onVectorMutated", "e", "()I", "size", "<init>", "(LLX2;Lkotlin/jvm/functions/Function0;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMutableVectorWithMutationTracking.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,53:1\n460#2,11:54\n523#2:65\n*S KotlinDebug\n*F\n+ 1 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n*L\n48#1:54,11\n52#1:65\n*E\n"})
/* renamed from: NX2 */
/* loaded from: classes.dex */
public final class NX2<T> {

    /* renamed from: a */
    public final LX2<T> f24752a;

    /* renamed from: b */
    public final Function0<Unit> f24753b;

    public NX2(LX2<T> vector, Function0<Unit> onVectorMutated) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        Intrinsics.checkNotNullParameter(onVectorMutated, "onVectorMutated");
        this.f24752a = vector;
        this.f24753b = onVectorMutated;
    }

    /* renamed from: a */
    public final void m93798a(int i, T t) {
        this.f24752a.m96702a(i, t);
        this.f24753b.invoke();
    }

    /* renamed from: b */
    public final List<T> m93797b() {
        return this.f24752a.m96697g();
    }

    /* renamed from: c */
    public final void m93796c() {
        this.f24752a.m96696h();
        this.f24753b.invoke();
    }

    /* renamed from: d */
    public final T m93795d(int i) {
        return this.f24752a.m96691s()[i];
    }

    /* renamed from: e */
    public final int m93794e() {
        return this.f24752a.m96690u();
    }

    /* renamed from: f */
    public final LX2<T> m93793f() {
        return this.f24752a;
    }

    /* renamed from: g */
    public final T m93792g(int i) {
        T m96707C = this.f24752a.m96707C(i);
        this.f24753b.invoke();
        return m96707C;
    }
}
