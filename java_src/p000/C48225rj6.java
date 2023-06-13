package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.nio.ByteBuffer;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\r\u0010\u0012R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"Lrj6;", "LXi6;", "Ljava/util/UUID;", "uuid", "b", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Ljava/util/UUID;", "", "B", "E", "()B", "header", "c", "length", "", DateTokenConverter.CONVERTER_KEY, "[B", "getData", "()[B", MessageExtension.FIELD_DATA, "<init>", "(Ljava/util/UUID;)V", "vtbeacon_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: rj6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C48225rj6 implements InterfaceC37073Xi6 {

    /* renamed from: a */
    public final UUID f107538a;

    /* renamed from: b */
    public final byte f107539b;

    /* renamed from: c */
    public final byte f107540c;

    /* renamed from: d */
    public final byte[] f107541d;

    public C48225rj6(UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.f107538a = uuid;
        this.f107539b = ByteCompanionObject.MIN_VALUE;
        this.f107540c = (byte) 17;
        byte[] array = ByteBuffer.allocate(16).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array();
        Intrinsics.checkNotNullExpressionValue(array, "allocate(16)\n    .putLon…ificantBits)\n    .array()");
        this.f107541d = array;
    }

    public static /* synthetic */ C48225rj6 copy$default(C48225rj6 c48225rj6, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = c48225rj6.f107538a;
        }
        return c48225rj6.m15541b(uuid);
    }

    @Override // p000.InterfaceC37073Xi6
    /* renamed from: E */
    public byte mo15543E() {
        return this.f107539b;
    }

    @Override // p000.InterfaceC37073Xi6
    /* renamed from: a */
    public byte mo15542a() {
        return this.f107540c;
    }

    /* renamed from: b */
    public final C48225rj6 m15541b(UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return new C48225rj6(uuid);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C48225rj6) && Intrinsics.areEqual(this.f107538a, ((C48225rj6) obj).f107538a);
    }

    @Override // p000.InterfaceC37073Xi6
    public byte[] getData() {
        return this.f107541d;
    }

    public int hashCode() {
        return this.f107538a.hashCode();
    }

    public String toString() {
        UUID uuid = this.f107538a;
        return "VTBeaconSetUUIDCommand(uuid=" + uuid + ")";
    }
}
