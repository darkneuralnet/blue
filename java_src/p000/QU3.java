package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u000b\u0012\u0006\u0010\t\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0003\u0010\u000fR+\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R+\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b\r\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, m28432d2 = {"LQU3;", "", "", C17296a.f69688o, "I", "c", "()I", "f", "(I)V", "mainAxisSize", "Lne;", "LA52;", "Ltf;", "b", "Lne;", "()Lne;", "animatedOffset", "J", DateTokenConverter.CONVERTER_KEY, "()J", "g", "(J)V", "targetOffset", "", "<set-?>", "LEX2;", "()Z", "e", "(Z)V", "inProgress", "initialOffset", "<init>", "(JILkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyListItemPlacementAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/PlaceableInfo\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,350:1\n76#2:351\n102#2,2:352\n*S KotlinDebug\n*F\n+ 1 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/PlaceableInfo\n*L\n340#1:351\n340#1:352,2\n*E\n"})
/* renamed from: QU3 */
/* loaded from: classes.dex */
public final class QU3 {

    /* renamed from: a */
    public int f30433a;

    /* renamed from: b */
    public final C26560ne<A52, C28797tf> f30434b;

    /* renamed from: c */
    public long f30435c;

    /* renamed from: d */
    public final EX2 f30436d;

    public /* synthetic */ QU3(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i);
    }

    /* renamed from: a */
    public final C26560ne<A52, C28797tf> m88477a() {
        return this.f30434b;
    }

    /* renamed from: b */
    public final boolean m88476b() {
        return ((Boolean) this.f30436d.getValue()).booleanValue();
    }

    /* renamed from: c */
    public final int m88475c() {
        return this.f30433a;
    }

    /* renamed from: d */
    public final long m88474d() {
        return this.f30435c;
    }

    /* renamed from: e */
    public final void m88473e(boolean z) {
        this.f30436d.setValue(Boolean.valueOf(z));
    }

    /* renamed from: f */
    public final void m88472f(int i) {
        this.f30433a = i;
    }

    /* renamed from: g */
    public final void m88471g(long j) {
        this.f30435c = j;
    }

    public QU3(long j, int i) {
        EX2 m97025e;
        this.f30433a = i;
        this.f30434b = new C26560ne<>(A52.m116119b(j), C37082Xj6.m76521d(A52.f130b), null, 4, null);
        this.f30435c = j;
        m97025e = LM5.m97025e(Boolean.FALSE, null, 2, null);
        this.f30436d = m97025e;
    }
}
