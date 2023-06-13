package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\n¢\u0006\u0004\b\u0011\u0010\u000fJ&\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0090\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0090\u0002¢\u0006\u0004\b\b\u0010\tR&\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"Liw;", "LlV2;", "T", "LhV2;", "key", "b", "(LhV2;)Ljava/lang/Object;", "", C17296a.f69688o, "(LhV2;)Z", "LoV2;", "LoV2;", "getElement", "()LoV2;", "c", "(LoV2;)V", "element", "<init>", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: iw */
/* loaded from: classes.dex */
public final class C24644iw extends AbstractC44528lV2 {

    /* renamed from: a */
    public InterfaceC46307oV2<?> f91734a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24644iw(InterfaceC46307oV2<?> element) {
        super(null);
        Intrinsics.checkNotNullParameter(element, "element");
        this.f91734a = element;
    }

    @Override // p000.AbstractC44528lV2
    /* renamed from: a */
    public boolean mo27215a(AbstractC42156hV2<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key == this.f91734a.getKey()) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC44528lV2
    /* renamed from: b */
    public <T> T mo27214b(AbstractC42156hV2<T> key) {
        boolean z;
        Intrinsics.checkNotNullParameter(key, "key");
        if (key == this.f91734a.getKey()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return (T) this.f91734a.getValue();
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: c */
    public final void m31601c(InterfaceC46307oV2<?> interfaceC46307oV2) {
        Intrinsics.checkNotNullParameter(interfaceC46307oV2, "<set-?>");
        this.f91734a = interfaceC46307oV2;
    }
}
