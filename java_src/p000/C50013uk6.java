package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC29607vf;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\t\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0016"}, m28432d2 = {"Luk6;", "Lvf;", "V", "Lok6;", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "e", "(JLvf;Lvf;Lvf;)Lvf;", DateTokenConverter.CONVERTER_KEY, "", C17296a.f69688o, "I", "f", "()I", "delayMillis", "g", "durationMillis", "<init>", "(I)V", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: uk6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50013uk6<V extends AbstractC29607vf> implements InterfaceC46456ok6<V> {

    /* renamed from: a */
    public final int f112830a;

    public C50013uk6() {
        this(0, 1, null);
    }

    @Override // p000.InterfaceC44677lk6
    /* renamed from: d */
    public V mo6414d(long j, V initialValue, V targetValue, V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return initialVelocity;
    }

    @Override // p000.InterfaceC44677lk6
    /* renamed from: e */
    public V mo6413e(long j, V initialValue, V targetValue, V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (j < mo6412f() * 1000000) {
            return initialValue;
        }
        return targetValue;
    }

    @Override // p000.InterfaceC46456ok6
    /* renamed from: f */
    public int mo6412f() {
        return this.f112830a;
    }

    @Override // p000.InterfaceC46456ok6
    /* renamed from: g */
    public int mo6411g() {
        return 0;
    }

    public C50013uk6(int i) {
        this.f112830a = i;
    }

    public /* synthetic */ C50013uk6(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
