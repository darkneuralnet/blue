package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty1;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0005\u001a\u00020\u00002\"\u0010\u0004\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00030\u0002\"\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, m28432d2 = {"La01;", "", "", "Lkotlin/reflect/KProperty1;", "properties", C17296a.f69688o, "([Lkotlin/reflect/KProperty1;)La01;", "", "b", "()Ljava/lang/String;", "subscriptionId", "<init>", "()V", "Lgt4;", "LRd6;", "mvrx_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: a01  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC37698a01 {

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0001\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lkotlin/reflect/KProperty1;", "it", "", C17296a.f69688o, "(Lkotlin/reflect/KProperty1;)Ljava/lang/CharSequence;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: a01$a */
    /* loaded from: classes2.dex */
    public static final class C10485a extends Lambda implements Function1<KProperty1<?, ?>, CharSequence> {

        /* renamed from: g */
        public static final C10485a f49630g = new C10485a();

        public C10485a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(KProperty1<?, ?> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getName();
        }
    }

    public /* synthetic */ AbstractC37698a01(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public final AbstractC37698a01 m72134a(KProperty1<?, ?>... properties) {
        String joinToString$default;
        Intrinsics.checkNotNullParameter(properties, "properties");
        if (this instanceof C41800gt4) {
            return C41800gt4.f84406a;
        }
        if (this instanceof C35624Rd6) {
            joinToString$default = ArraysKt___ArraysKt.joinToString$default(properties, ",", mo37364b() + '_', (CharSequence) null, 0, (CharSequence) null, C10485a.f49630g, 28, (Object) null);
            return new C35624Rd6(joinToString$default);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public abstract String mo37364b();

    private AbstractC37698a01() {
    }
}
