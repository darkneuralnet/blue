package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC29607vf;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, m28432d2 = {"Lok6;", "Lvf;", "V", "Lpk6;", "initialValue", "targetValue", "initialVelocity", "", "b", "(Lvf;Lvf;Lvf;)J", "", "g", "()I", "durationMillis", "f", "delayMillis", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ok6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC46456ok6<V extends AbstractC29607vf> extends InterfaceC47049pk6<V> {
    @Override // p000.InterfaceC44677lk6
    /* renamed from: b */
    default long mo8207b(V initialValue, V targetValue, V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return (mo6412f() + mo6411g()) * 1000000;
    }

    /* renamed from: f */
    int mo6412f();

    /* renamed from: g */
    int mo6411g();
}
