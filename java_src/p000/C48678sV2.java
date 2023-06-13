package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, m28432d2 = {"LsV2;", "LlD3;", "Lhe3;", "b", "Lhe3;", "()Lhe3;", "observerNode", "", "L", "()Z", "isValidOwnerScope", "<init>", "(Lhe3;)V", "c", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: sV2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48678sV2 implements InterfaceC44367lD3 {

    /* renamed from: c */
    public static final C28327b f108883c = new C28327b(null);

    /* renamed from: d */
    public static final Function1<C48678sV2, Unit> f108884d = C28326a.f108886g;

    /* renamed from: b */
    public final InterfaceC42242he3 f108885b;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LsV2;", "it", "", C17296a.f69688o, "(LsV2;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: sV2$a */
    /* loaded from: classes.dex */
    public static final class C28326a extends Lambda implements Function1<C48678sV2, Unit> {

        /* renamed from: g */
        public static final C28326a f108886g = new C28326a();

        public C28326a() {
            super(1);
        }

        /* renamed from: a */
        public final void m14139a(C48678sV2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.mo14142L()) {
                it.m14140b().mo36118s();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C48678sV2 c48678sV2) {
            m14139a(c48678sV2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"LsV2$b;", "", "Lkotlin/Function1;", "LsV2;", "", "OnObserveReadsChanged", "Lkotlin/jvm/functions/Function1;", C17296a.f69688o, "()Lkotlin/jvm/functions/Function1;", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: sV2$b */
    /* loaded from: classes.dex */
    public static final class C28327b {
        public /* synthetic */ C28327b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function1<C48678sV2, Unit> m14138a() {
            return C48678sV2.f108884d;
        }

        private C28327b() {
        }
    }

    public C48678sV2(InterfaceC42242he3 observerNode) {
        Intrinsics.checkNotNullParameter(observerNode, "observerNode");
        this.f108885b = observerNode;
    }

    @Override // p000.InterfaceC44367lD3
    /* renamed from: L */
    public boolean mo14142L() {
        return this.f108885b.mo8445r().m39254Q();
    }

    /* renamed from: b */
    public final InterfaceC42242he3 m14140b() {
        return this.f108885b;
    }
}
