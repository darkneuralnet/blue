package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u000b\u0012\u0006\u0010\t\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0003\u0010\u000fR+\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R+\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b\r\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, m28432d2 = {"LPU3;", "", "", C17296a.f69688o, "I", "c", "()I", "f", "(I)V", "mainAxisSize", "Lne;", "LA52;", "Ltf;", "b", "Lne;", "()Lne;", "animatedOffset", "J", DateTokenConverter.CONVERTER_KEY, "()J", "g", "(J)V", "targetOffset", "", "<set-?>", "LEX2;", "()Z", "e", "(Z)V", "inProgress", "initialOffset", "<init>", "(JILkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyGridItemPlacementAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/PlaceableInfo\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,412:1\n76#2:413\n102#2,2:414\n*S KotlinDebug\n*F\n+ 1 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/PlaceableInfo\n*L\n402#1:413\n402#1:414,2\n*E\n"})
/* renamed from: PU3 */
/* loaded from: classes.dex */
public final class PU3 {

    /* renamed from: a */
    public int f28575a;

    /* renamed from: b */
    public final C26560ne<A52, C28797tf> f28576b;

    /* renamed from: c */
    public long f28577c;

    /* renamed from: d */
    public final EX2 f28578d;

    public /* synthetic */ PU3(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i);
    }

    /* renamed from: a */
    public final C26560ne<A52, C28797tf> m90198a() {
        return this.f28576b;
    }

    /* renamed from: b */
    public final boolean m90197b() {
        return ((Boolean) this.f28578d.getValue()).booleanValue();
    }

    /* renamed from: c */
    public final int m90196c() {
        return this.f28575a;
    }

    /* renamed from: d */
    public final long m90195d() {
        return this.f28577c;
    }

    /* renamed from: e */
    public final void m90194e(boolean z) {
        this.f28578d.setValue(Boolean.valueOf(z));
    }

    /* renamed from: f */
    public final void m90193f(int i) {
        this.f28575a = i;
    }

    /* renamed from: g */
    public final void m90192g(long j) {
        this.f28577c = j;
    }

    public PU3(long j, int i) {
        EX2 m97025e;
        this.f28575a = i;
        this.f28576b = new C26560ne<>(A52.m116119b(j), C37082Xj6.m76521d(A52.f130b), null, 4, null);
        this.f28577c = j;
        m97025e = LM5.m97025e(Boolean.FALSE, null, 2, null);
        this.f28578d = m97025e;
    }
}
