package p000;

import android.net.Uri;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p053io.CloseableKt;
import p000.C44821lz0;
import p000.UC6;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0016\u0010\u0018\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0007J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0019\u001a\u00020\u0017H\u0007¨\u0006\u001d"}, m28432d2 = {"LPG6;", "", "LUC6$a;", TransferTable.COLUMN_STATE, "", "j", "value", "f", "Lgw;", "backoffPolicy", C17296a.f69688o, "c", "LS73;", "networkType", "g", DateTokenConverter.CONVERTER_KEY, "LXy3;", "policy", "h", "e", "", "Llz0$c;", "triggers", "", "i", "bytes", "b", "<init>", "()V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: PG6 */
/* loaded from: classes.dex */
public final class PG6 {

    /* renamed from: a */
    public static final PG6 f28178a = new PG6();

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: PG6$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C6304a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[UC6.EnumC8214a.values().length];
            try {
                iArr[UC6.EnumC8214a.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UC6.EnumC8214a.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UC6.EnumC8214a.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UC6.EnumC8214a.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UC6.EnumC8214a.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UC6.EnumC8214a.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EnumC22516gw.values().length];
            try {
                iArr2[EnumC22516gw.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC22516gw.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[S73.values().length];
            try {
                iArr3[S73.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[S73.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[S73.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[S73.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[S73.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[EnumC37214Xy3.values().length];
            try {
                iArr4[EnumC37214Xy3.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[EnumC37214Xy3.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    private PG6() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final int m90535a(EnumC22516gw backoffPolicy) {
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        int i = C6304a.$EnumSwitchMapping$1[backoffPolicy.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            throw new NoWhenBranchMatchedException();
        }
        return 0;
    }

    @JvmStatic
    /* renamed from: b */
    public static final Set<C44821lz0.C25843c> m90534b(byte[] bytes) {
        boolean z;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int readInt = objectInputStream.readInt();
                    for (int i = 0; i < readInt; i++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean readBoolean = objectInputStream.readBoolean();
                        Intrinsics.checkNotNullExpressionValue(uri, "uri");
                        linkedHashSet.add(new C44821lz0.C25843c(uri, readBoolean));
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(objectInputStream, null);
                } finally {
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            Unit unit2 = Unit.INSTANCE;
            CloseableKt.closeFinally(byteArrayInputStream, null);
            return linkedHashSet;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(byteArrayInputStream, th);
                throw th2;
            }
        }
    }

    @JvmStatic
    /* renamed from: c */
    public static final EnumC22516gw m90533c(int i) {
        if (i != 0) {
            if (i == 1) {
                return EnumC22516gw.LINEAR;
            }
            throw new IllegalArgumentException("Could not convert " + i + " to BackoffPolicy");
        }
        return EnumC22516gw.EXPONENTIAL;
    }

    @JvmStatic
    /* renamed from: d */
    public static final S73 m90532d(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (Build.VERSION.SDK_INT >= 30 && i == 5) {
                                return S73.TEMPORARILY_UNMETERED;
                            }
                            throw new IllegalArgumentException("Could not convert " + i + " to NetworkType");
                        }
                        return S73.METERED;
                    }
                    return S73.NOT_ROAMING;
                }
                return S73.UNMETERED;
            }
            return S73.CONNECTED;
        }
        return S73.NOT_REQUIRED;
    }

    @JvmStatic
    /* renamed from: e */
    public static final EnumC37214Xy3 m90531e(int i) {
        if (i != 0) {
            if (i == 1) {
                return EnumC37214Xy3.DROP_WORK_REQUEST;
            }
            throw new IllegalArgumentException("Could not convert " + i + " to OutOfQuotaPolicy");
        }
        return EnumC37214Xy3.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
    }

    @JvmStatic
    /* renamed from: f */
    public static final UC6.EnumC8214a m90530f(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return UC6.EnumC8214a.CANCELLED;
                            }
                            throw new IllegalArgumentException("Could not convert " + i + " to State");
                        }
                        return UC6.EnumC8214a.BLOCKED;
                    }
                    return UC6.EnumC8214a.FAILED;
                }
                return UC6.EnumC8214a.SUCCEEDED;
            }
            return UC6.EnumC8214a.RUNNING;
        }
        return UC6.EnumC8214a.ENQUEUED;
    }

    @JvmStatic
    /* renamed from: g */
    public static final int m90529g(S73 networkType) {
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        int i = C6304a.$EnumSwitchMapping$2[networkType.ordinal()];
        if (i != 1) {
            int i2 = 2;
            if (i == 2) {
                return 1;
            }
            if (i != 3) {
                i2 = 4;
                if (i == 4) {
                    return 3;
                }
                if (i != 5) {
                    if (Build.VERSION.SDK_INT >= 30 && networkType == S73.TEMPORARILY_UNMETERED) {
                        return 5;
                    }
                    throw new IllegalArgumentException("Could not convert " + networkType + " to int");
                }
            }
            return i2;
        }
        return 0;
    }

    @JvmStatic
    /* renamed from: h */
    public static final int m90528h(EnumC37214Xy3 policy) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        int i = C6304a.$EnumSwitchMapping$3[policy.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            throw new NoWhenBranchMatchedException();
        }
        return 0;
    }

    @JvmStatic
    /* renamed from: i */
    public static final byte[] m90527i(Set<C44821lz0.C25843c> triggers) {
        Intrinsics.checkNotNullParameter(triggers, "triggers");
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeInt(triggers.size());
            for (C44821lz0.C25843c c25843c : triggers) {
                objectOutputStream.writeUTF(c25843c.m26572a().toString());
                objectOutputStream.writeBoolean(c25843c.m26571b());
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(objectOutputStream, null);
            CloseableKt.closeFinally(byteArrayOutputStream, null);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "outputStream.toByteArray()");
            return byteArray;
        } finally {
        }
    }

    @JvmStatic
    /* renamed from: j */
    public static final int m90526j(UC6.EnumC8214a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        switch (C6304a.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
