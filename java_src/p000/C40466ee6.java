package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J \u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"Lee6;", "LKj2;", "", "LGV0;", "decoder", C17296a.f69688o, "Lrb1;", "encoder", "value", "b", "(Lrb1;Lkotlin/Unit;)V", "LMs5;", "getDescriptor", "()LMs5;", "descriptor", "<init>", "()V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@PublishedApi
/* renamed from: ee6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C40466ee6 implements InterfaceC34036Kj2<Unit> {

    /* renamed from: b */
    public static final C40466ee6 f78656b = new C40466ee6();

    /* renamed from: a */
    public final /* synthetic */ C36089Td3<Unit> f78657a = new C36089Td3<>("kotlin.Unit", Unit.INSTANCE);

    private C40466ee6() {
    }

    /* renamed from: a */
    public void m42664a(GV0 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        this.f78657a.deserialize(decoder);
    }

    @Override // p000.InterfaceC40615et5
    /* renamed from: b */
    public void serialize(InterfaceC48140rb1 encoder, Unit value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f78657a.serialize(encoder, value);
    }

    @Override // p000.E01
    public /* bridge */ /* synthetic */ Object deserialize(GV0 gv0) {
        m42664a(gv0);
        return Unit.INSTANCE;
    }

    @Override // p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public InterfaceC34588Ms5 getDescriptor() {
        return this.f78657a.getDescriptor();
    }
}
