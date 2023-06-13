package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.VehicleDescriptor;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.VehicleVersion;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.io.InputStream;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b4\b\u0086\b\u0018\u00002\u00020\u0001:\u0002#\u0003BÃ\u0001\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001f\u001a\u00020\b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\bS\u0010TJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0016JÌ\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\"\u001a\u00020!HÆ\u0001¢\u0006\u0004\b#\u0010$J\t\u0010%\u001a\u00020\bHÖ\u0001J\u0013\u0010'\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b,\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b)\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b5\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00168\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u001b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bJ\u0010(\u001a\u0004\bJ\u0010*R\u0017\u0010\u001c\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b@\u0010(\u001a\u0004\bF\u0010*R\u0017\u0010\u001d\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bH\u0010(\u001a\u0004\b:\u0010*R\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bD\u0010K\u001a\u0004\b>\u0010LR\u0017\u0010\u001f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b<\u0010(\u001a\u0004\bB\u0010*R\u0019\u0010 \u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b8\u0010M\u001a\u0004\bN\u0010OR\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\bN\u0010P\u001a\u0004\bQ\u0010R¨\u0006U"}, m28432d2 = {"LXn1;", "", "", "b", "", "c", "", "toString", "", "commandCountId", "Lco/bird/android/model/persistence/Bird;", "bird", "Lco/bird/android/model/persistence/VehicleVersion;", "vehicleVersion", "Lco/bird/android/model/VehicleDescriptor;", "vehicleDescriptor", "LXn1$a;", "component", "LXn1$b;", TransferTable.COLUMN_STATE, "", "previousCommand", "", "firmwareUpdateContent", "Ljava/io/InputStream;", "firmwareUpdateStream", "firmwareUpdateLength", "firmwareBytesWritten", "firmwareBytesPending", "errorCount", "errorReceived", "errorResendLineCount", "updateFailureReason", "Lorg/joda/time/DateTime;", "updateStartTime", C17296a.f69688o, "(ILco/bird/android/model/persistence/Bird;Lco/bird/android/model/persistence/VehicleVersion;Lco/bird/android/model/VehicleDescriptor;LXn1$a;LXn1$b;[B[Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/Long;IIIZILjava/lang/String;Lorg/joda/time/DateTime;)LXn1;", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "I", "e", "()I", "Lco/bird/android/model/persistence/Bird;", DateTokenConverter.CONVERTER_KEY, "()Lco/bird/android/model/persistence/Bird;", "Lco/bird/android/model/persistence/VehicleVersion;", "t", "()Lco/bird/android/model/persistence/VehicleVersion;", "Lco/bird/android/model/VehicleDescriptor;", "s", "()Lco/bird/android/model/VehicleDescriptor;", "LXn1$a;", "f", "()LXn1$a;", "LXn1$b;", "p", "()LXn1$b;", "g", "[B", "o", "()[B", "h", "[Ljava/lang/String;", "l", "()[Ljava/lang/String;", "i", "Ljava/io/InputStream;", "n", "()Ljava/io/InputStream;", "j", "Ljava/lang/Long;", "m", "()Ljava/lang/Long;", "k", "Z", "()Z", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "Lorg/joda/time/DateTime;", "r", "()Lorg/joda/time/DateTime;", "<init>", "(ILco/bird/android/model/persistence/Bird;Lco/bird/android/model/persistence/VehicleVersion;Lco/bird/android/model/VehicleDescriptor;LXn1$a;LXn1$b;[B[Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/Long;IIIZILjava/lang/String;Lorg/joda/time/DateTime;)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Xn1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C37113Xn1 {

    /* renamed from: a */
    public final int f43910a;

    /* renamed from: b */
    public final Bird f43911b;

    /* renamed from: c */
    public final VehicleVersion f43912c;

    /* renamed from: d */
    public final VehicleDescriptor f43913d;

    /* renamed from: e */
    public final EnumC9493a f43914e;

    /* renamed from: f */
    public final EnumC9494b f43915f;

    /* renamed from: g */
    public final byte[] f43916g;

    /* renamed from: h */
    public final String[] f43917h;

    /* renamed from: i */
    public final InputStream f43918i;

    /* renamed from: j */
    public final Long f43919j;

    /* renamed from: k */
    public final int f43920k;

    /* renamed from: l */
    public final int f43921l;

    /* renamed from: m */
    public final int f43922m;

    /* renamed from: n */
    public final boolean f43923n;

    /* renamed from: o */
    public final int f43924o;

    /* renamed from: p */
    public final String f43925p;

    /* renamed from: q */
    public final DateTime f43926q;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m28432d2 = {"LXn1$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Xn1$a */
    /* loaded from: classes2.dex */
    public enum EnumC9493a {
        DASH,
        PCM,
        NONE
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m28432d2 = {"LXn1$b;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", "i", "j", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Xn1$b */
    /* loaded from: classes2.dex */
    public enum EnumC9494b {
        CHALLENGE_INITIATED,
        VERIFYING_PASSCODE,
        PASSCODE_VERIFIED,
        UPDATE_CONNECTED,
        SYNC,
        FIRMWARE_UPDATING,
        UPDATE_FAILED,
        UPDATE_SUCCESS,
        NONE
    }

    public C37113Xn1() {
        this(0, null, null, null, null, null, null, null, null, null, 0, 0, 0, false, 0, null, null, 131071, null);
    }

    /* renamed from: a */
    public final C37113Xn1 m76349a(int i, Bird bird, VehicleVersion vehicleVersion, VehicleDescriptor vehicleDescriptor, EnumC9493a component, EnumC9494b state, byte[] previousCommand, String[] firmwareUpdateContent, InputStream inputStream, Long l, int i2, int i3, int i4, boolean z, int i5, String str, DateTime updateStartTime) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(previousCommand, "previousCommand");
        Intrinsics.checkNotNullParameter(firmwareUpdateContent, "firmwareUpdateContent");
        Intrinsics.checkNotNullParameter(updateStartTime, "updateStartTime");
        return new C37113Xn1(i, bird, vehicleVersion, vehicleDescriptor, component, state, previousCommand, firmwareUpdateContent, inputStream, l, i2, i3, i4, z, i5, str, updateStartTime);
    }

    /* renamed from: b */
    public final long m76348b() {
        Long l = this.f43919j;
        if (l == null) {
            return 0L;
        }
        return this.f43920k / l.longValue();
    }

    /* renamed from: c */
    public final boolean m76347c() {
        Long l = this.f43919j;
        if (l == null) {
            return false;
        }
        int i = this.f43920k;
        if (i > 0) {
            long j = i;
            if (l != null) {
                int i2 = (j > l.longValue() ? 1 : (j == l.longValue() ? 0 : -1));
            }
        }
        return true;
    }

    /* renamed from: d */
    public final Bird m76346d() {
        return this.f43911b;
    }

    /* renamed from: e */
    public final int m76345e() {
        return this.f43910a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C37113Xn1) {
            C37113Xn1 c37113Xn1 = (C37113Xn1) obj;
            return this.f43910a == c37113Xn1.f43910a && Intrinsics.areEqual(this.f43911b, c37113Xn1.f43911b) && Intrinsics.areEqual(this.f43912c, c37113Xn1.f43912c) && Intrinsics.areEqual(this.f43913d, c37113Xn1.f43913d) && this.f43914e == c37113Xn1.f43914e && this.f43915f == c37113Xn1.f43915f && Intrinsics.areEqual(this.f43916g, c37113Xn1.f43916g) && Intrinsics.areEqual(this.f43917h, c37113Xn1.f43917h) && Intrinsics.areEqual(this.f43918i, c37113Xn1.f43918i) && Intrinsics.areEqual(this.f43919j, c37113Xn1.f43919j) && this.f43920k == c37113Xn1.f43920k && this.f43921l == c37113Xn1.f43921l && this.f43922m == c37113Xn1.f43922m && this.f43923n == c37113Xn1.f43923n && this.f43924o == c37113Xn1.f43924o && Intrinsics.areEqual(this.f43925p, c37113Xn1.f43925p) && Intrinsics.areEqual(this.f43926q, c37113Xn1.f43926q);
        }
        return false;
    }

    /* renamed from: f */
    public final EnumC9493a m76344f() {
        return this.f43914e;
    }

    /* renamed from: g */
    public final int m76343g() {
        return this.f43922m;
    }

    /* renamed from: h */
    public final boolean m76342h() {
        return this.f43923n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.f43910a) * 31;
        Bird bird = this.f43911b;
        int hashCode2 = (hashCode + (bird == null ? 0 : bird.hashCode())) * 31;
        VehicleVersion vehicleVersion = this.f43912c;
        int hashCode3 = (hashCode2 + (vehicleVersion == null ? 0 : vehicleVersion.hashCode())) * 31;
        VehicleDescriptor vehicleDescriptor = this.f43913d;
        int hashCode4 = (((((((((hashCode3 + (vehicleDescriptor == null ? 0 : vehicleDescriptor.hashCode())) * 31) + this.f43914e.hashCode()) * 31) + this.f43915f.hashCode()) * 31) + Arrays.hashCode(this.f43916g)) * 31) + Arrays.hashCode(this.f43917h)) * 31;
        InputStream inputStream = this.f43918i;
        int hashCode5 = (hashCode4 + (inputStream == null ? 0 : inputStream.hashCode())) * 31;
        Long l = this.f43919j;
        int hashCode6 = (((((((hashCode5 + (l == null ? 0 : l.hashCode())) * 31) + Integer.hashCode(this.f43920k)) * 31) + Integer.hashCode(this.f43921l)) * 31) + Integer.hashCode(this.f43922m)) * 31;
        boolean z = this.f43923n;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode7 = (((hashCode6 + i) * 31) + Integer.hashCode(this.f43924o)) * 31;
        String str = this.f43925p;
        return ((hashCode7 + (str != null ? str.hashCode() : 0)) * 31) + this.f43926q.hashCode();
    }

    /* renamed from: i */
    public final int m76341i() {
        return this.f43924o;
    }

    /* renamed from: j */
    public final int m76340j() {
        return this.f43921l;
    }

    /* renamed from: k */
    public final int m76339k() {
        return this.f43920k;
    }

    /* renamed from: l */
    public final String[] m76338l() {
        return this.f43917h;
    }

    /* renamed from: m */
    public final Long m76337m() {
        return this.f43919j;
    }

    /* renamed from: n */
    public final InputStream m76336n() {
        return this.f43918i;
    }

    /* renamed from: o */
    public final byte[] m76335o() {
        return this.f43916g;
    }

    /* renamed from: p */
    public final EnumC9494b m76334p() {
        return this.f43915f;
    }

    /* renamed from: q */
    public final String m76333q() {
        return this.f43925p;
    }

    /* renamed from: r */
    public final DateTime m76332r() {
        return this.f43926q;
    }

    /* renamed from: s */
    public final VehicleDescriptor m76331s() {
        return this.f43913d;
    }

    /* renamed from: t */
    public final VehicleVersion m76330t() {
        return this.f43912c;
    }

    public String toString() {
        int i = this.f43910a;
        EnumC9493a enumC9493a = this.f43914e;
        EnumC9494b enumC9494b = this.f43915f;
        Long l = this.f43919j;
        int length = this.f43917h.length;
        int i2 = this.f43920k;
        int i3 = this.f43921l;
        int i4 = this.f43922m;
        int i5 = this.f43924o;
        boolean z = this.f43923n;
        String str = this.f43925p;
        return "FirmwareUpdateState(commandCountId: " + i + ", component: " + enumC9493a + ", state: " + enumC9494b + ", firmwareUpdateLength: " + l + ", firmwareUpdateContentLength: " + length + ", firmwareBytesWritten: " + i2 + ", firmwareBytesPending: " + i3 + ", errorCount: " + i4 + ", errorResendLineCount: " + i5 + ", errorReceived: " + z + ", updateFailureReason: " + str + ")";
    }

    public C37113Xn1(int i, Bird bird, VehicleVersion vehicleVersion, VehicleDescriptor vehicleDescriptor, EnumC9493a component, EnumC9494b state, byte[] previousCommand, String[] firmwareUpdateContent, InputStream inputStream, Long l, int i2, int i3, int i4, boolean z, int i5, String str, DateTime updateStartTime) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(previousCommand, "previousCommand");
        Intrinsics.checkNotNullParameter(firmwareUpdateContent, "firmwareUpdateContent");
        Intrinsics.checkNotNullParameter(updateStartTime, "updateStartTime");
        this.f43910a = i;
        this.f43911b = bird;
        this.f43912c = vehicleVersion;
        this.f43913d = vehicleDescriptor;
        this.f43914e = component;
        this.f43915f = state;
        this.f43916g = previousCommand;
        this.f43917h = firmwareUpdateContent;
        this.f43918i = inputStream;
        this.f43919j = l;
        this.f43920k = i2;
        this.f43921l = i3;
        this.f43922m = i4;
        this.f43923n = z;
        this.f43924o = i5;
        this.f43925p = str;
        this.f43926q = updateStartTime;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C37113Xn1(int i, Bird bird, VehicleVersion vehicleVersion, VehicleDescriptor vehicleDescriptor, EnumC9493a enumC9493a, EnumC9494b enumC9494b, byte[] bArr, String[] strArr, InputStream inputStream, Long l, int i2, int i3, int i4, boolean z, int i5, String str, DateTime dateTime, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r37, r16, r0);
        int i7;
        DateTime dateTime2;
        int i8 = (i6 & 1) != 0 ? 0 : i;
        Bird bird2 = (i6 & 2) != 0 ? null : bird;
        VehicleVersion vehicleVersion2 = (i6 & 4) != 0 ? null : vehicleVersion;
        VehicleDescriptor vehicleDescriptor2 = (i6 & 8) != 0 ? null : vehicleDescriptor;
        EnumC9493a enumC9493a2 = (i6 & 16) != 0 ? EnumC9493a.NONE : enumC9493a;
        EnumC9494b enumC9494b2 = (i6 & 32) != 0 ? EnumC9494b.NONE : enumC9494b;
        byte[] bArr2 = (i6 & 64) != 0 ? new byte[0] : bArr;
        String[] strArr2 = (i6 & 128) != 0 ? new String[0] : strArr;
        InputStream inputStream2 = (i6 & 256) != 0 ? null : inputStream;
        Long l2 = (i6 & 512) != 0 ? null : l;
        int i9 = (i6 & 1024) != 0 ? 0 : i2;
        int i10 = (i6 & 2048) != 0 ? 0 : i3;
        int i11 = (i6 & 4096) != 0 ? 0 : i4;
        boolean z2 = (i6 & 8192) != 0 ? false : z;
        int i12 = (i6 & 16384) != 0 ? 0 : i5;
        String str2 = (i6 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? null : str;
        if ((i6 & 65536) != 0) {
            dateTime2 = DateTime.now();
            i7 = i12;
            Intrinsics.checkNotNullExpressionValue(dateTime2, "now()");
        } else {
            i7 = i12;
            dateTime2 = dateTime;
        }
    }
}
