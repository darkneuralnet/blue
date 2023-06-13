package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u0019\u0010\u001c\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"LjO5;", "T", "Ltm1;", "Lvf;", "V", "Lwb6;", "converter", "Lvk6;", "i", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", C17296a.f69688o, "F", "f", "()F", "dampingRatio", "b", "g", "stiffness", "c", "Ljava/lang/Object;", "h", "()Ljava/lang/Object;", "visibilityThreshold", "<init>", "(FFLjava/lang/Object;)V", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: jO5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43282jO5<T> implements InterfaceC49435tm1<T> {

    /* renamed from: a */
    public final float f92640a;

    /* renamed from: b */
    public final float f92641b;

    /* renamed from: c */
    public final T f92642c;

    public C43282jO5() {
        this(0.0f, 0.0f, null, 7, null);
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (!(obj instanceof C43282jO5)) {
            return false;
        }
        C43282jO5 c43282jO5 = (C43282jO5) obj;
        if (c43282jO5.f92640a == this.f92640a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (c43282jO5.f92641b == this.f92641b) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || !Intrinsics.areEqual(c43282jO5.f92642c, this.f92642c)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final float m30724f() {
        return this.f92640a;
    }

    /* renamed from: g */
    public final float m30723g() {
        return this.f92641b;
    }

    /* renamed from: h */
    public final T m30722h() {
        return this.f92642c;
    }

    public int hashCode() {
        T t = this.f92642c;
        return ((((t != null ? t.hashCode() : 0) * 31) + Float.hashCode(this.f92640a)) * 31) + Float.hashCode(this.f92641b);
    }

    @Override // p000.InterfaceC25753lf
    /* renamed from: i */
    public <V extends AbstractC29607vf> C50605vk6<V> mo12016a(InterfaceC51108wb6<T, V> converter) {
        AbstractC29607vf m25228b;
        Intrinsics.checkNotNullParameter(converter, "converter");
        float f = this.f92640a;
        float f2 = this.f92641b;
        m25228b = C26160mf.m25228b(converter, this.f92642c);
        return new C50605vk6<>(f, f2, m25228b);
    }

    public C43282jO5(float f, float f2, T t) {
        this.f92640a = f;
        this.f92641b = f2;
        this.f92642c = t;
    }

    public /* synthetic */ C43282jO5(float f, float f2, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? null : obj);
    }
}
