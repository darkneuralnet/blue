package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\f\u0010\u0005¨\u0006\u0010"}, m28432d2 = {"Lmi0;", "", "LcJ3;", C17296a.f69688o, "LcJ3;", "()LcJ3;", "checkPath", "LoJ3;", "b", "LoJ3;", "()LoJ3;", "pathMeasure", "c", "pathToDraw", "<init>", "(LcJ3;LoJ3;LcJ3;)V", "material_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: mi0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45244mi0 {

    /* renamed from: a */
    public final InterfaceC39067cJ3 f98578a;

    /* renamed from: b */
    public final InterfaceC46200oJ3 f98579b;

    /* renamed from: c */
    public final InterfaceC39067cJ3 f98580c;

    public C45244mi0() {
        this(null, null, null, 7, null);
    }

    /* renamed from: a */
    public final InterfaceC39067cJ3 m25158a() {
        return this.f98578a;
    }

    /* renamed from: b */
    public final InterfaceC46200oJ3 m25157b() {
        return this.f98579b;
    }

    /* renamed from: c */
    public final InterfaceC39067cJ3 m25156c() {
        return this.f98580c;
    }

    public C45244mi0(InterfaceC39067cJ3 checkPath, InterfaceC46200oJ3 pathMeasure, InterfaceC39067cJ3 pathToDraw) {
        Intrinsics.checkNotNullParameter(checkPath, "checkPath");
        Intrinsics.checkNotNullParameter(pathMeasure, "pathMeasure");
        Intrinsics.checkNotNullParameter(pathToDraw, "pathToDraw");
        this.f98578a = checkPath;
        this.f98579b = pathMeasure;
        this.f98580c = pathToDraw;
    }

    public /* synthetic */ C45244mi0(InterfaceC39067cJ3 interfaceC39067cJ3, InterfaceC46200oJ3 interfaceC46200oJ3, InterfaceC39067cJ3 interfaceC39067cJ32, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C28793td.m12007a() : interfaceC39067cJ3, (i & 2) != 0 ? C28362sd.m13937a() : interfaceC46200oJ3, (i & 4) != 0 ? C28793td.m12007a() : interfaceC39067cJ32);
    }
}
