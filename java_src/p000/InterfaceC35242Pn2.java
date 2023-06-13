package p000;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001R1\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR1\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m28432d2 = {"LPn2;", "", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "index", "getKey", "()Lkotlin/jvm/functions/Function1;", "key", "getType", "type", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Pn2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC35242Pn2 {

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "", "b", "(I)Ljava/lang/Void;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pn2$a */
    /* loaded from: classes.dex */
    public static final class C6491a extends Lambda implements Function1 {

        /* renamed from: g */
        public static final C6491a f29037g = new C6491a();

        public C6491a() {
            super(1);
        }

        /* renamed from: b */
        public final Void m89790b(int i) {
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m89790b(((Number) obj).intValue());
        }
    }

    default Function1<Integer, Object> getKey() {
        return null;
    }

    default Function1<Integer, Object> getType() {
        return C6491a.f29037g;
    }
}
