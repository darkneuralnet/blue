package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m28432d2 = {"Lvg1;", "T", "LZ21;", "LWX;", "currentOpSettings", "", "errorCode", "", "throwable", C17296a.f69688o, "", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "b", "LWX;", "getCurrentOpSettings", "()LWX;", "c", "I", "getErrorCode", "()I", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "<init>", "(LWX;ILjava/lang/Throwable;)V", "interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: vg1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C50560vg1<T> implements Z21<T> {

    /* renamed from: b */
    public final InterfaceC9077WX f114484b;

    /* renamed from: c */
    public final int f114485c;

    /* renamed from: d */
    public final Throwable f114486d;

    public C50560vg1(InterfaceC9077WX currentOpSettings, int i, Throwable th) {
        Intrinsics.checkNotNullParameter(currentOpSettings, "currentOpSettings");
        this.f114484b = currentOpSettings;
        this.f114485c = i;
        this.f114486d = th;
    }

    public static /* synthetic */ C50560vg1 copy$default(C50560vg1 c50560vg1, InterfaceC9077WX interfaceC9077WX, int i, Throwable th, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            interfaceC9077WX = c50560vg1.f114484b;
        }
        if ((i2 & 2) != 0) {
            i = c50560vg1.f114485c;
        }
        if ((i2 & 4) != 0) {
            th = c50560vg1.f114486d;
        }
        return c50560vg1.m8270a(interfaceC9077WX, i, th);
    }

    /* renamed from: a */
    public final C50560vg1<T> m8270a(InterfaceC9077WX currentOpSettings, int i, Throwable th) {
        Intrinsics.checkNotNullParameter(currentOpSettings, "currentOpSettings");
        return new C50560vg1<>(currentOpSettings, i, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C50560vg1) {
            C50560vg1 c50560vg1 = (C50560vg1) obj;
            return Intrinsics.areEqual(this.f114484b, c50560vg1.f114484b) && this.f114485c == c50560vg1.f114485c && Intrinsics.areEqual(this.f114486d, c50560vg1.f114486d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.f114484b.hashCode() * 31) + Integer.hashCode(this.f114485c)) * 31;
        Throwable th = this.f114486d;
        return hashCode + (th == null ? 0 : th.hashCode());
    }

    public String toString() {
        InterfaceC9077WX interfaceC9077WX = this.f114484b;
        int i = this.f114485c;
        Throwable th = this.f114486d;
        return "ErrorResult(currentOpSettings=" + interfaceC9077WX + ", errorCode=" + i + ", throwable=" + th + ")";
    }

    public /* synthetic */ C50560vg1(InterfaceC9077WX interfaceC9077WX, int i, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC9077WX, i, (i2 & 4) != 0 ? null : th);
    }
}
