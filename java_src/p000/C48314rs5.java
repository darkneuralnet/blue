package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B/\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u0005\u001a\u0004\u0018\u00018\u00002\b\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J,\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u000b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R0\u0010\u0019\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m28432d2 = {"Lrs5;", "T", "", "parentValue", "childValue", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lss5;", "thisRef", "Lkotlin/reflect/KProperty;", "property", "value", "", "c", "(Lss5;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "", "toString", C17296a.f69688o, "Ljava/lang/String;", "()Ljava/lang/String;", "name", "Lkotlin/Function2;", "Lkotlin/jvm/functions/Function2;", "getMergePolicy$ui_release", "()Lkotlin/jvm/functions/Function2;", "mergePolicy", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: rs5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48314rs5<T> {

    /* renamed from: a */
    public final String f107809a;

    /* renamed from: b */
    public final Function2<T, T, T> f107810b;

    @Metadata(m28433d1 = {"\u0000\u0004\n\u0002\b\u0006\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\b\u0010\u0002\u001a\u0004\u0018\u0001H\u00012\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "T", "parentValue", "childValue", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rs5$a */
    /* loaded from: classes.dex */
    public static final class C28045a extends Lambda implements Function2<T, T, T> {

        /* renamed from: g */
        public static final C28045a f107811g = new C28045a();

        public C28045a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final T invoke(T t, T t2) {
            return t == null ? t2 : t;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C48314rs5(String name, Function2<? super T, ? super T, ? extends T> mergePolicy) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mergePolicy, "mergePolicy");
        this.f107809a = name;
        this.f107810b = mergePolicy;
    }

    /* renamed from: a */
    public final String m15148a() {
        return this.f107809a;
    }

    /* renamed from: b */
    public final T m15147b(T t, T t2) {
        return this.f107810b.invoke(t, t2);
    }

    /* renamed from: c */
    public final void m15146c(InterfaceC48906ss5 thisRef, KProperty<?> property, T t) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        thisRef.mo13560a(this, t);
    }

    public String toString() {
        return "SemanticsPropertyKey: " + this.f107809a;
    }

    public /* synthetic */ C48314rs5(String str, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? C28045a.f107811g : function2);
    }
}
