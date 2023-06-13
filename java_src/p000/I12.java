package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B,\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001aø\u0001\u0000¢\u0006\u0004\b \u0010!J,\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001f\u001a\u00020\u001a8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, m28432d2 = {"LI12;", "T", "Llf;", "Lvf;", "V", "Lwb6;", "converter", "Llk6;", C17296a.f69688o, "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "Lh81;", "Lh81;", "getAnimation", "()Lh81;", "animation", "LeG4;", "b", "LeG4;", "getRepeatMode", "()LeG4;", "repeatMode", "LKO5;", "c", "J", "getInitialStartOffset-Rmkjzm4", "()J", "initialStartOffset", "<init>", "(Lh81;LeG4;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: I12 */
/* loaded from: classes.dex */
public final class I12<T> implements InterfaceC25753lf<T> {

    /* renamed from: d */
    public static final int f14339d = 8;

    /* renamed from: a */
    public final InterfaceC41946h81<T> f14340a;

    /* renamed from: b */
    public final EnumC40244eG4 f14341b;

    /* renamed from: c */
    public final long f14342c;

    public /* synthetic */ I12(InterfaceC41946h81 interfaceC41946h81, EnumC40244eG4 enumC40244eG4, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC41946h81, enumC40244eG4, j);
    }

    @Override // p000.InterfaceC25753lf
    /* renamed from: a */
    public <V extends AbstractC29607vf> InterfaceC44677lk6<V> mo12016a(InterfaceC51108wb6<T, V> converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        return new C48827sk6(this.f14340a.mo12016a((InterfaceC51108wb6) converter), this.f14341b, this.f14342c, null);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof I12)) {
            return false;
        }
        I12 i12 = (I12) obj;
        if (!Intrinsics.areEqual(i12.f14340a, this.f14340a) || i12.f14341b != this.f14341b || !KO5.m98918d(i12.f14342c, this.f14342c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.f14340a.hashCode() * 31) + this.f14341b.hashCode()) * 31) + KO5.m98917e(this.f14342c);
    }

    public I12(InterfaceC41946h81<T> interfaceC41946h81, EnumC40244eG4 enumC40244eG4, long j) {
        this.f14340a = interfaceC41946h81;
        this.f14341b = enumC40244eG4;
        this.f14342c = j;
    }
}
