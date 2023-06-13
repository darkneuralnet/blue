package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0001\u0012\u0006\u0010\u001a\u001a\u00020\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ7\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\f\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0013\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001a\u0010\u0017\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001d"}, m28432d2 = {"LWm0;", "LgV2;", "R", "initial", "Lkotlin/Function2;", "LgV2$b;", "operation", "n", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "predicate", "o", "", LegacyRepairType.OTHER_KEY, "equals", "", "hashCode", "", "toString", "b", "LgV2;", "()LgV2;", "outer", "c", C17296a.f69688o, "inner", "<init>", "(LgV2;LgV2;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Wm0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36869Wm0 implements InterfaceC41563gV2 {

    /* renamed from: b */
    public final InterfaceC41563gV2 f42092b;

    /* renamed from: c */
    public final InterfaceC41563gV2 f42093c;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "acc", "LgV2$b;", "element", C17296a.f69688o, "(Ljava/lang/String;LgV2$b;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Wm0$a */
    /* loaded from: classes.dex */
    public static final class C9182a extends Lambda implements Function2<String, InterfaceC41563gV2.InterfaceC20913b, String> {

        /* renamed from: g */
        public static final C9182a f42094g = new C9182a();

        public C9182a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final String invoke(String acc, InterfaceC41563gV2.InterfaceC20913b element) {
            boolean z;
            Intrinsics.checkNotNullParameter(acc, "acc");
            Intrinsics.checkNotNullParameter(element, "element");
            if (acc.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return element.toString();
            }
            return acc + ", " + element;
        }
    }

    public C36869Wm0(InterfaceC41563gV2 outer, InterfaceC41563gV2 inner) {
        Intrinsics.checkNotNullParameter(outer, "outer");
        Intrinsics.checkNotNullParameter(inner, "inner");
        this.f42092b = outer;
        this.f42093c = inner;
    }

    /* renamed from: a */
    public final InterfaceC41563gV2 m77839a() {
        return this.f42093c;
    }

    /* renamed from: b */
    public final InterfaceC41563gV2 m77838b() {
        return this.f42092b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C36869Wm0) {
            C36869Wm0 c36869Wm0 = (C36869Wm0) obj;
            if (Intrinsics.areEqual(this.f42092b, c36869Wm0.f42092b) && Intrinsics.areEqual(this.f42093c, c36869Wm0.f42093c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f42092b.hashCode() + (this.f42093c.hashCode() * 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC41563gV2
    /* renamed from: n */
    public <R> R mo39265n(R r, Function2<? super R, ? super InterfaceC41563gV2.InterfaceC20913b, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return (R) this.f42093c.mo39265n(this.f42092b.mo39265n(r, operation), operation);
    }

    @Override // p000.InterfaceC41563gV2
    /* renamed from: o */
    public boolean mo39264o(Function1<? super InterfaceC41563gV2.InterfaceC20913b, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (this.f42092b.mo39264o(predicate) && this.f42093c.mo39264o(predicate)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return '[' + ((String) mo39265n("", C9182a.f42094g)) + ']';
    }
}
