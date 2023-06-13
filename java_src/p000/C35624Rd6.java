package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m28432d2 = {"LRd6;", "La01;", "", C17296a.f69688o, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "subscriptionId", "<init>", "(Ljava/lang/String;)V", "mvrx_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Rd6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C35624Rd6 extends AbstractC37698a01 {

    /* renamed from: a */
    public final String f32365a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35624Rd6(String subscriptionId) {
        super(null);
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        this.f32365a = subscriptionId;
    }

    @Override // p000.AbstractC37698a01
    /* renamed from: b */
    public String mo37364b() {
        return this.f32365a;
    }
}
