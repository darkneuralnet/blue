package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\b\b\u0002\u0010\u0016\u001a\u00020\r\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0017\u0010\u0013\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"Ltb6;", "T", "Lh81;", "Lvf;", "V", "Lwb6;", "converter", "Lwk6;", "f", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", C17296a.f69688o, "I", "getDurationMillis", "()I", "durationMillis", "b", "getDelay", "delay", "Lh91;", "c", "Lh91;", "getEasing", "()Lh91;", "easing", "<init>", "(IILh91;)V", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: tb6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49330tb6<T> implements InterfaceC41946h81<T> {

    /* renamed from: a */
    public final int f110781a;

    /* renamed from: b */
    public final int f110782b;

    /* renamed from: c */
    public final InterfaceC41956h91 f110783c;

    public C49330tb6() {
        this(0, 0, null, 7, null);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C49330tb6)) {
            return false;
        }
        C49330tb6 c49330tb6 = (C49330tb6) obj;
        if (c49330tb6.f110781a != this.f110781a || c49330tb6.f110782b != this.f110782b || !Intrinsics.areEqual(c49330tb6.f110783c, this.f110783c)) {
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC41946h81, p000.InterfaceC25753lf
    /* renamed from: f */
    public <V extends AbstractC29607vf> C51198wk6<V> mo12016a(InterfaceC51108wb6<T, V> converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        return new C51198wk6<>(this.f110781a, this.f110782b, this.f110783c);
    }

    public int hashCode() {
        return (((this.f110781a * 31) + this.f110783c.hashCode()) * 31) + this.f110782b;
    }

    public C49330tb6(int i, int i2, InterfaceC41956h91 easing) {
        Intrinsics.checkNotNullParameter(easing, "easing");
        this.f110781a = i;
        this.f110782b = i2;
        this.f110783c = easing;
    }

    public /* synthetic */ C49330tb6(int i, int i2, InterfaceC41956h91 interfaceC41956h91, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 300 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? C42549i91.m34395b() : interfaceC41956h91);
    }
}
