package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, m28432d2 = {"LB24;", "Lbs2;", "", "c", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "serialName", "LMs5;", "primitive", "<init>", "(LMs5;)V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: B24 */
/* loaded from: classes8.dex */
public final class B24 extends AbstractC38806bs2 {

    /* renamed from: c */
    public final String f1559c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B24(InterfaceC34588Ms5 primitive) {
        super(primitive, null);
        Intrinsics.checkNotNullParameter(primitive, "primitive");
        this.f1559c = primitive.mo10456h() + "Array";
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: h */
    public String mo10456h() {
        return this.f1559c;
    }
}
