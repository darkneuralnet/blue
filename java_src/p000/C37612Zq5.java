package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import p000.AbstractC36442Uq5;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081@\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003B\u0014\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u0088\u0001\r\u0092\u0001\u0004\u0018\u00010\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m28432d2 = {"LZq5;", "LUq5;", "S", "", "", "c", "(Ljava/lang/Object;)Z", "isClosed", "b", "(Ljava/lang/Object;)LUq5;", "getSegment$annotations", "()V", "segment", "value", C17296a.f69688o, "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
@JvmInline
/* renamed from: Zq5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C37612Zq5<S extends AbstractC36442Uq5<S>> {
    /* renamed from: a */
    public static <S extends AbstractC36442Uq5<S>> Object m72403a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static final S m72402b(Object obj) {
        C49885uX5 c49885uX5;
        c49885uX5 = C31793Au0.f1323a;
        if (obj != c49885uX5) {
            if (obj != null) {
                return (S) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    /* renamed from: c */
    public static final boolean m72401c(Object obj) {
        C49885uX5 c49885uX5;
        c49885uX5 = C31793Au0.f1323a;
        return obj == c49885uX5;
    }
}
