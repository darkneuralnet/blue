package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0005\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\f\u0010\u0011R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m28432d2 = {"Lqj6;", "LXi6;", "", "pin", "b", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Ljava/lang/String;", "", "B", "E", "()B", "header", "c", "length", "", DateTokenConverter.CONVERTER_KEY, "[B", "getData", "()[B", MessageExtension.FIELD_DATA, "<init>", "(Ljava/lang/String;)V", "vtbeacon_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: qj6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47632qj6 implements InterfaceC37073Xi6 {

    /* renamed from: a */
    public final String f105687a;

    /* renamed from: b */
    public final byte f105688b;

    /* renamed from: c */
    public final byte f105689c;

    /* renamed from: d */
    public final byte[] f105690d;

    public C47632qj6(String pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f105687a = pin;
        this.f105688b = (byte) -123;
        this.f105689c = (byte) 7;
        byte[] bytes = pin.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        this.f105690d = bytes;
    }

    public static /* synthetic */ C47632qj6 copy$default(C47632qj6 c47632qj6, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c47632qj6.f105687a;
        }
        return c47632qj6.m17181b(str);
    }

    @Override // p000.InterfaceC37073Xi6
    /* renamed from: E */
    public byte mo15543E() {
        return this.f105688b;
    }

    @Override // p000.InterfaceC37073Xi6
    /* renamed from: a */
    public byte mo15542a() {
        return this.f105689c;
    }

    /* renamed from: b */
    public final C47632qj6 m17181b(String pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        return new C47632qj6(pin);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C47632qj6) && Intrinsics.areEqual(this.f105687a, ((C47632qj6) obj).f105687a);
    }

    @Override // p000.InterfaceC37073Xi6
    public byte[] getData() {
        return this.f105690d;
    }

    public int hashCode() {
        return this.f105687a.hashCode();
    }

    public String toString() {
        String str = this.f105687a;
        return "VTBeaconSetPinCommand(pin=" + str + ")";
    }
}
