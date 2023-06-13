package p000;

import android.os.ParcelUuid;
import android.util.SparseArray;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.bluetooth.model.ScannedDevice;
import co.bird.android.model.constant.PhysicalLockPurpose;
import co.bird.android.model.constant.SmartlockVendor;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.nestedstructures.Smartlock;
import com.facebook.share.internal.C17296a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.UByte;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0019\n\u0002\b\u0003\u001a\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a:\u0010\u000f\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u001a\n\u0010\u0011\u001a\u00020\r*\u00020\u0010\u001a\f\u0010\u0013\u001a\u0004\u0018\u00010\u0012*\u00020\u0000\u001a\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u0015*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u0017\u001a(\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\b\b\u0000\u0010\u001c*\u00020\u001b*\u00020\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d\"\u0017\u0010$\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#\"\u001b\u0010(\u001a\u00020\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'\"\u0017\u0010*\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b)\u0010#\"\u001b\u0010,\u001a\u00020\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b+\u0010'\"\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010.¨\u00060"}, m28432d2 = {"Lco/bird/android/bluetooth/model/ScannedDevice;", "", "isConnected", "LsE5;", "l", "Lco/bird/android/model/persistence/nestedstructures/Smartlock;", "smartLock", "Lco/bird/android/model/persistence/Bird;", "bird", "Lco/bird/android/model/constant/PhysicalLockPurpose;", "physicalLockPurpose", "LtE5;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "rideId", C17296a.f69688o, "", "k", "LCF5;", "h", "type", "", "i", "(Lco/bird/android/bluetooth/model/ScannedDevice;LCF5;)Ljava/lang/Integer;", "g", "(Lco/bird/android/bluetooth/model/ScannedDevice;LCF5;)Ljava/lang/Boolean;", "f", "LjI5;", "T", "LuE5;", "manager", "Lvy0;", "j", "[B", "c", "()[B", "NOKE_AD_PREFIX", "b", "Lkotlin/Lazy;", "()I", "NOKE_AD_MANUFACTURER_ID", "e", "SOLEBE_AD_PREFIX", DateTokenConverter.CONVERTER_KEY, "SOLEBE_AD_MANUFACTURER_ID", "", "[C", "HEX", "interface_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSmartLockManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartLockManager.kt\nco/bird/android/smartlock/api/SmartLockManagerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,255:1\n1549#2:256\n1620#2,3:257\n*S KotlinDebug\n*F\n+ 1 SmartLockManager.kt\nco/bird/android/smartlock/api/SmartLockManagerKt\n*L\n187#1:256\n187#1:257,3\n*E\n"})
/* renamed from: tF5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49130tF5 {

    /* renamed from: a */
    public static final byte[] f110222a = {1, 2};

    /* renamed from: b */
    public static final Lazy f110223b;

    /* renamed from: c */
    public static final byte[] f110224c;

    /* renamed from: d */
    public static final Lazy f110225d;

    /* renamed from: e */
    public static final char[] f110226e;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tF5$a */
    /* loaded from: classes4.dex */
    public static final class C28664a extends Lambda implements Function0<Integer> {

        /* renamed from: g */
        public static final C28664a f110227g = new C28664a();

        public C28664a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            byte[] reversedArray;
            reversedArray = ArraysKt___ArraysKt.reversedArray(C49130tF5.m12560c());
            return Integer.valueOf(ByteBuffer.wrap(reversedArray).getShort());
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tF5$b */
    /* loaded from: classes4.dex */
    public static final class C28665b extends Lambda implements Function0<Integer> {

        /* renamed from: g */
        public static final C28665b f110228g = new C28665b();

        public C28665b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            byte[] reversedArray;
            reversedArray = ArraysKt___ArraysKt.reversedArray(C49130tF5.m12558e());
            return Integer.valueOf(ByteBuffer.wrap(reversedArray).getShort());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tF5$c */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C28666c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CF5.values().length];
            try {
                iArr[CF5.NOKE_COMPATIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CF5.NOKE_REFLASH_COMPATIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CF5.SOLEBE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Lazy lazy;
        Lazy lazy2;
        lazy = LazyKt__LazyJVMKt.lazy(C28664a.f110227g);
        f110223b = lazy;
        f110224c = new byte[]{1, 3};
        lazy2 = LazyKt__LazyJVMKt.lazy(C28665b.f110228g);
        f110225d = lazy2;
        char[] charArray = "0123456789ABCDEF".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        f110226e = charArray;
    }

    /* renamed from: a */
    public static final C48528sE5 m12562a(C48528sE5 c48528sE5, Smartlock smartLock, Bird bird, PhysicalLockPurpose physicalLockPurpose, EnumC49121tE5 enumC49121tE5, String str) {
        EnumC49121tE5 enumC49121tE52;
        C48528sE5 m14514a;
        Intrinsics.checkNotNullParameter(c48528sE5, "<this>");
        Intrinsics.checkNotNullParameter(smartLock, "smartLock");
        String id = smartLock.getId();
        String tokenRequest = smartLock.getTokenRequest();
        List<String> tokenRequests = smartLock.getTokenRequests();
        String physicalLockId = smartLock.getPhysicalLockId();
        SmartlockVendor vendor = smartLock.getVendor();
        if (enumC49121tE5 == null) {
            enumC49121tE52 = c48528sE5.m14512c();
        } else {
            enumC49121tE52 = enumC49121tE5;
        }
        m14514a = c48528sE5.m14514a((r34 & 1) != 0 ? c48528sE5.f108494a : null, (r34 & 2) != 0 ? c48528sE5.f108495b : null, (r34 & 4) != 0 ? c48528sE5.f108496c : null, (r34 & 8) != 0 ? c48528sE5.f108497d : false, (r34 & 16) != 0 ? c48528sE5.f108498e : null, (r34 & 32) != 0 ? c48528sE5.f108499f : id, (r34 & 64) != 0 ? c48528sE5.f108500g : tokenRequest, (r34 & 128) != 0 ? c48528sE5.f108501h : tokenRequests, (r34 & 256) != 0 ? c48528sE5.f108502i : physicalLockId, (r34 & 512) != 0 ? c48528sE5.f108503j : vendor, (r34 & 1024) != 0 ? c48528sE5.f108504k : physicalLockPurpose, (r34 & 2048) != 0 ? c48528sE5.f108505l : bird, (r34 & 4096) != 0 ? c48528sE5.f108506m : enumC49121tE52, (r34 & 8192) != 0 ? c48528sE5.f108507n : null, (r34 & 16384) != 0 ? c48528sE5.f108508o : null, (r34 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? c48528sE5.f108509p : str);
        return m14514a;
    }

    /* renamed from: b */
    public static final int m12561b() {
        return ((Number) f110223b.getValue()).intValue();
    }

    /* renamed from: c */
    public static final byte[] m12560c() {
        return f110222a;
    }

    /* renamed from: d */
    public static final int m12559d() {
        return ((Number) f110225d.getValue()).intValue();
    }

    /* renamed from: e */
    public static final byte[] m12558e() {
        return f110224c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        r2 = kotlin.collections.ArraysKt___ArraysKt.getOrNull(r2, 7);
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Integer m12557f(ScannedDevice scannedDevice, CF5 type) {
        SparseArray<byte[]> sparseArray;
        Byte orNull;
        Intrinsics.checkNotNullParameter(scannedDevice, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        C31942Bk5 m22432c = scannedDevice.m59103e().m22432c();
        if (m22432c != null) {
            sparseArray = m22432c.m113537d();
        } else {
            sparseArray = null;
        }
        int i = C28666c.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1 || i == 2) {
            return null;
        }
        if (i == 3) {
            if (sparseArray == null || (r2 = sparseArray.get(m12559d())) == null || orNull == null) {
                return null;
            }
            return Integer.valueOf(orNull.byteValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
        r3 = kotlin.collections.ArraysKt___ArraysKt.getOrNull(r3, 8);
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Boolean m12556g(ScannedDevice scannedDevice, CF5 type) {
        SparseArray<byte[]> sparseArray;
        Byte orNull;
        Intrinsics.checkNotNullParameter(scannedDevice, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        C31942Bk5 m22432c = scannedDevice.m59103e().m22432c();
        if (m22432c != null) {
            sparseArray = m22432c.m113537d();
        } else {
            sparseArray = null;
        }
        int i = C28666c.$EnumSwitchMapping$0[type.ordinal()];
        boolean z = true;
        if (i == 1 || i == 2) {
            return null;
        }
        if (i == 3) {
            if (sparseArray == null || (r3 = sparseArray.get(m12559d())) == null || orNull == null || orNull.byteValue() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: h */
    public static final CF5 m12555h(ScannedDevice scannedDevice) {
        ArrayList arrayList;
        SparseArray<byte[]> sparseArray;
        boolean z;
        byte[] bArr;
        byte[] bArr2;
        List<ParcelUuid> m113534g;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(scannedDevice, "<this>");
        C31942Bk5 m22432c = scannedDevice.m59103e().m22432c();
        if (m22432c != null && (m113534g = m22432c.m113534g()) != null) {
            List<ParcelUuid> list = m113534g;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            arrayList = new ArrayList(collectionSizeOrDefault);
            for (ParcelUuid parcelUuid : list) {
                arrayList.add(parcelUuid.getUuid().toString());
            }
        } else {
            arrayList = null;
        }
        C31942Bk5 m22432c2 = scannedDevice.m59103e().m22432c();
        if (m22432c2 != null) {
            sparseArray = m22432c2.m113537d();
        } else {
            sparseArray = null;
        }
        boolean z2 = true;
        if (arrayList != null && arrayList.contains(EnumC4457KW.f19706c.m98808b().toString())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (sparseArray != null) {
                bArr2 = sparseArray.get(m12561b());
            } else {
                bArr2 = null;
            }
            if (bArr2 != null) {
                return CF5.NOKE_COMPATIBLE;
            }
        }
        if (!((arrayList == null || !arrayList.contains(EnumC4457KW.f19707d.m98808b().toString())) ? false : false)) {
            return null;
        }
        if (sparseArray != null) {
            bArr = sparseArray.get(m12559d());
        } else {
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return CF5.SOLEBE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
        r2 = kotlin.collections.ArraysKt___ArraysKt.getOrNull(r2, 10);
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Integer m12554i(ScannedDevice scannedDevice, CF5 type) {
        SparseArray<byte[]> sparseArray;
        Byte orNull;
        Intrinsics.checkNotNullParameter(scannedDevice, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        C31942Bk5 m22432c = scannedDevice.m59103e().m22432c();
        if (m22432c != null) {
            sparseArray = m22432c.m113537d();
        } else {
            sparseArray = null;
        }
        int i = C28666c.$EnumSwitchMapping$0[type.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        } else if (sparseArray == null || (r2 = sparseArray.get(m12561b())) == null || orNull == null) {
            return null;
        } else {
            return Integer.valueOf(orNull.byteValue());
        }
    }

    /* renamed from: j */
    public static final <T extends InterfaceC43228jI5> C50739vy0<T> m12553j(C48528sE5 c48528sE5, AbstractC49714uE5<T> manager) {
        Intrinsics.checkNotNullParameter(c48528sE5, "<this>");
        Intrinsics.checkNotNullParameter(manager, "manager");
        return new C50739vy0<>(EnumC38707bi3.CONNECT, c48528sE5.m14505j(), manager, 0, 0, false, 56, null);
    }

    /* renamed from: k */
    public static final String m12552k(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        char[] cArr = new char[bArr.length * 2];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = bArr[i] & UByte.MAX_VALUE;
            int i3 = i * 2;
            char[] cArr2 = f110226e;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: l */
    public static final C48528sE5 m12551l(ScannedDevice scannedDevice, boolean z) {
        Intrinsics.checkNotNullParameter(scannedDevice, "<this>");
        CF5 m12555h = m12555h(scannedDevice);
        if (m12555h == null) {
            return null;
        }
        return new C48528sE5(scannedDevice, m12555h, scannedDevice.m59105c(), z, m12554i(scannedDevice, m12555h), null, null, null, null, null, null, null, null, m12557f(scannedDevice, m12555h), m12556g(scannedDevice, m12555h), null, 40928, null);
    }

    public static /* synthetic */ C48528sE5 toSmartLock$default(ScannedDevice scannedDevice, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m12551l(scannedDevice, z);
    }
}
