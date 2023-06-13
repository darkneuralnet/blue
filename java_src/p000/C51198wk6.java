package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC29607vf;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\f\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010\t\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001c¨\u0006 "}, m28432d2 = {"Lwk6;", "Lvf;", "V", "Lok6;", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "e", "(JLvf;Lvf;Lvf;)Lvf;", DateTokenConverter.CONVERTER_KEY, "", C17296a.f69688o, "I", "g", "()I", "durationMillis", "b", "f", "delayMillis", "Lh91;", "c", "Lh91;", "getEasing", "()Lh91;", "easing", "Lqk6;", "Lqk6;", "anim", "<init>", "(IILh91;)V", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: wk6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51198wk6<V extends AbstractC29607vf> implements InterfaceC46456ok6<V> {

    /* renamed from: a */
    public final int f116431a;

    /* renamed from: b */
    public final int f116432b;

    /* renamed from: c */
    public final InterfaceC41956h91 f116433c;

    /* renamed from: d */
    public final C47642qk6<V> f116434d;

    public C51198wk6() {
        this(0, 0, null, 7, null);
    }

    @Override // p000.InterfaceC44677lk6
    /* renamed from: d */
    public V mo6414d(long j, V initialValue, V targetValue, V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return this.f116434d.mo6414d(j, initialValue, targetValue, initialVelocity);
    }

    @Override // p000.InterfaceC44677lk6
    /* renamed from: e */
    public V mo6413e(long j, V initialValue, V targetValue, V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return this.f116434d.mo6413e(j, initialValue, targetValue, initialVelocity);
    }

    @Override // p000.InterfaceC46456ok6
    /* renamed from: f */
    public int mo6412f() {
        return this.f116432b;
    }

    @Override // p000.InterfaceC46456ok6
    /* renamed from: g */
    public int mo6411g() {
        return this.f116431a;
    }

    public C51198wk6(int i, int i2, InterfaceC41956h91 easing) {
        Intrinsics.checkNotNullParameter(easing, "easing");
        this.f116431a = i;
        this.f116432b = i2;
        this.f116433c = easing;
        this.f116434d = new C47642qk6<>(new C50108uu1(mo6411g(), mo6412f(), easing));
    }

    public /* synthetic */ C51198wk6(int i, int i2, InterfaceC41956h91 interfaceC41956h91, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 300 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? C42549i91.m34395b() : interfaceC41956h91);
    }
}
