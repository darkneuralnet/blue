package p000;

import androidx.work.C12124b;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import p000.UC6;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b-\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0003)+\bBÍ\u0001\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0003\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\t\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\b\b\u0002\u0010#\u001a\u00020\u0018\u0012\b\b\u0002\u0010$\u001a\u00020\u0018¢\u0006\u0004\bG\u0010HB\u0019\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010I\u001a\u00020\u000b¢\u0006\u0004\bG\u0010JB\u0019\b\u0016\u0012\u0006\u0010K\u001a\u00020\u000b\u0012\u0006\u0010'\u001a\u00020\u0000¢\u0006\u0004\bG\u0010LJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\tJ\b\u0010\f\u001a\u00020\u000bH\u0016JÓ\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0003\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020\u00182\b\b\u0002\u0010$\u001a\u00020\u0018HÆ\u0001J\t\u0010&\u001a\u00020\u0018HÖ\u0001J\u0013\u0010(\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0014\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\b\u0010*R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b%\u0010*R\u0016\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\u0014\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b/\u0010.R\u0016\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u00101R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b2\u00101R\u0016\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u00105R\u0016\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u00106R\u0016\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b7\u00101R\u0016\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b8\u00101R\u0016\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b9\u00101R\u0016\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b:\u00101R\u0016\u0010 \u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010\"\u001a\u00020!8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\"\u0010#\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u00105\u001a\u0004\b0\u0010@\"\u0004\bA\u0010BR\u001a\u0010$\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u00105\u001a\u0004\b/\u0010@R\u0011\u0010E\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b3\u0010DR\u0011\u0010F\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b2\u0010D¨\u0006N"}, m28432d2 = {"LHG6;", "", "", "intervalDuration", "", "k", "flexDuration", "l", "c", "", "h", "", "toString", "id", "LUC6$a;", TransferTable.COLUMN_STATE, "workerClassName", "inputMergerClassName", "Landroidx/work/b;", "input", "output", "initialDelay", "Llz0;", "constraints", "", "runAttemptCount", "Lgw;", "backoffPolicy", "backoffDelayDuration", "lastEnqueueTime", "minimumRetentionDuration", "scheduleRequestedAt", "expedited", "LXy3;", "outOfQuotaPolicy", "periodCount", "generation", DateTokenConverter.CONVERTER_KEY, "hashCode", LegacyRepairType.OTHER_KEY, "equals", C17296a.f69688o, "Ljava/lang/String;", "b", "LUC6$a;", "e", "Landroidx/work/b;", "f", "g", "J", "i", "j", "Llz0;", "I", "Lgw;", "m", "n", "o", "p", "q", "Z", "r", "LXy3;", "s", "()I", "setPeriodCount", "(I)V", "t", "()Z", "isPeriodic", "isBackedOff", "<init>", "(Ljava/lang/String;LUC6$a;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLlz0;ILgw;JJJJZLXy3;II)V", "workerClassName_", "(Ljava/lang/String;Ljava/lang/String;)V", "newId", "(Ljava/lang/String;LHG6;)V", "u", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: HG6 */
/* loaded from: classes.dex */
public final class HG6 {

    /* renamed from: u */
    public static final C3119a f13188u = new C3119a(null);

    /* renamed from: v */
    public static final String f13189v;
    @JvmField

    /* renamed from: w */
    public static final InterfaceC51452xA1<List<C3121c>, List<UC6>> f13190w;
    @JvmField

    /* renamed from: a */
    public final String f13191a;
    @JvmField

    /* renamed from: b */
    public UC6.EnumC8214a f13192b;
    @JvmField

    /* renamed from: c */
    public String f13193c;
    @JvmField

    /* renamed from: d */
    public String f13194d;
    @JvmField

    /* renamed from: e */
    public C12124b f13195e;
    @JvmField

    /* renamed from: f */
    public C12124b f13196f;
    @JvmField

    /* renamed from: g */
    public long f13197g;
    @JvmField

    /* renamed from: h */
    public long f13198h;
    @JvmField

    /* renamed from: i */
    public long f13199i;
    @JvmField

    /* renamed from: j */
    public C44821lz0 f13200j;
    @JvmField

    /* renamed from: k */
    public int f13201k;
    @JvmField

    /* renamed from: l */
    public EnumC22516gw f13202l;
    @JvmField

    /* renamed from: m */
    public long f13203m;
    @JvmField

    /* renamed from: n */
    public long f13204n;
    @JvmField

    /* renamed from: o */
    public long f13205o;
    @JvmField

    /* renamed from: p */
    public long f13206p;
    @JvmField

    /* renamed from: q */
    public boolean f13207q;
    @JvmField

    /* renamed from: r */
    public EnumC37214Xy3 f13208r;

    /* renamed from: s */
    public int f13209s;

    /* renamed from: t */
    public final int f13210t;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R,\u0010\f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, m28432d2 = {"LHG6$a;", "", "", "SCHEDULE_NOT_REQUESTED_YET", "J", "", "TAG", "Ljava/lang/String;", "LxA1;", "", "LHG6$c;", "LUC6;", "WORK_INFO_MAPPER", "LxA1;", "<init>", "()V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: HG6$a */
    /* loaded from: classes.dex */
    public static final class C3119a {
        public /* synthetic */ C3119a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3119a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LHG6$b;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Ljava/lang/String;", "id", "LUC6$a;", "b", "LUC6$a;", TransferTable.COLUMN_STATE, "<init>", "(Ljava/lang/String;LUC6$a;)V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: HG6$b */
    /* loaded from: classes.dex */
    public static final class C3120b {
        @JvmField

        /* renamed from: a */
        public String f13211a;
        @JvmField

        /* renamed from: b */
        public UC6.EnumC8214a f13212b;

        public C3120b(String id, UC6.EnumC8214a state) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            this.f13211a = id;
            this.f13212b = state;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C3120b) {
                C3120b c3120b = (C3120b) obj;
                return Intrinsics.areEqual(this.f13211a, c3120b.f13211a) && this.f13212b == c3120b.f13212b;
            }
            return false;
        }

        public int hashCode() {
            return (this.f13211a.hashCode() * 31) + this.f13212b.hashCode();
        }

        public String toString() {
            return "IdAndState(id=" + this.f13211a + ", state=" + this.f13212b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010'\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010*\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$R(\u00102\u001a\b\u0012\u0004\u0012\u00020\u00040+8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R(\u00106\u001a\b\u0012\u0004\u0012\u00020\u00190+8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010-\u001a\u0004\b4\u0010/\"\u0004\b5\u00101¨\u00067"}, m28432d2 = {"LHG6$c;", "", "LUC6;", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "id", "LUC6$a;", "b", "LUC6$a;", "getState", "()LUC6$a;", "setState", "(LUC6$a;)V", TransferTable.COLUMN_STATE, "Landroidx/work/b;", "c", "Landroidx/work/b;", "getOutput", "()Landroidx/work/b;", "setOutput", "(Landroidx/work/b;)V", "output", DateTokenConverter.CONVERTER_KEY, "I", "getRunAttemptCount", "()I", "setRunAttemptCount", "(I)V", "runAttemptCount", "e", "getGeneration", "generation", "", "f", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "setTags", "(Ljava/util/List;)V", "tags", "g", "getProgress", "setProgress", "progress", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: HG6$c */
    /* loaded from: classes.dex */
    public static final class C3121c {

        /* renamed from: a */
        public String f13213a;

        /* renamed from: b */
        public UC6.EnumC8214a f13214b;

        /* renamed from: c */
        public C12124b f13215c;

        /* renamed from: d */
        public int f13216d;

        /* renamed from: e */
        public final int f13217e;

        /* renamed from: f */
        public List<String> f13218f;

        /* renamed from: g */
        public List<C12124b> f13219g;

        /* renamed from: a */
        public final UC6 m104066a() {
            C12124b c12124b;
            if (!this.f13219g.isEmpty()) {
                c12124b = this.f13219g.get(0);
            } else {
                c12124b = C12124b.f56214c;
            }
            return new UC6(UUID.fromString(this.f13213a), this.f13214b, this.f13215c, this.f13218f, c12124b, this.f13216d, this.f13217e);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C3121c) {
                C3121c c3121c = (C3121c) obj;
                return Intrinsics.areEqual(this.f13213a, c3121c.f13213a) && this.f13214b == c3121c.f13214b && Intrinsics.areEqual(this.f13215c, c3121c.f13215c) && this.f13216d == c3121c.f13216d && this.f13217e == c3121c.f13217e && Intrinsics.areEqual(this.f13218f, c3121c.f13218f) && Intrinsics.areEqual(this.f13219g, c3121c.f13219g);
            }
            return false;
        }

        public int hashCode() {
            return (((((((((((this.f13213a.hashCode() * 31) + this.f13214b.hashCode()) * 31) + this.f13215c.hashCode()) * 31) + Integer.hashCode(this.f13216d)) * 31) + Integer.hashCode(this.f13217e)) * 31) + this.f13218f.hashCode()) * 31) + this.f13219g.hashCode();
        }

        public String toString() {
            return "WorkInfoPojo(id=" + this.f13213a + ", state=" + this.f13214b + ", output=" + this.f13215c + ", runAttemptCount=" + this.f13216d + ", generation=" + this.f13217e + ", tags=" + this.f13218f + ", progress=" + this.f13219g + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    static {
        String m113270i = AbstractC32056Bx2.m113270i("WorkSpec");
        Intrinsics.checkNotNullExpressionValue(m113270i, "tagWithPrefix(\"WorkSpec\")");
        f13189v = m113270i;
        f13190w = new InterfaceC51452xA1() { // from class: GG6
            @Override // p000.InterfaceC51452xA1
            public final Object apply(Object obj) {
                List m104077b;
                m104077b = HG6.m104077b((List) obj);
                return m104077b;
            }
        };
    }

    public HG6(String id, UC6.EnumC8214a state, String workerClassName, String str, C12124b input, C12124b output, long j, long j2, long j3, C44821lz0 constraints, int i, EnumC22516gw backoffPolicy, long j4, long j5, long j6, long j7, boolean z, EnumC37214Xy3 outOfQuotaPolicy, int i2, int i3) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.f13191a = id;
        this.f13192b = state;
        this.f13193c = workerClassName;
        this.f13194d = str;
        this.f13195e = input;
        this.f13196f = output;
        this.f13197g = j;
        this.f13198h = j2;
        this.f13199i = j3;
        this.f13200j = constraints;
        this.f13201k = i;
        this.f13202l = backoffPolicy;
        this.f13203m = j4;
        this.f13204n = j5;
        this.f13205o = j6;
        this.f13206p = j7;
        this.f13207q = z;
        this.f13208r = outOfQuotaPolicy;
        this.f13209s = i2;
        this.f13210t = i3;
    }

    /* renamed from: b */
    public static final List m104077b(List list) {
        int collectionSizeOrDefault;
        if (list != null) {
            List<C3121c> list2 = list;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (C3121c c3121c : list2) {
                arrayList.add(c3121c.m104066a());
            }
            return arrayList;
        }
        return null;
    }

    /* renamed from: c */
    public final long m104076c() {
        long scalb;
        long coerceAtMost;
        boolean z = false;
        if (m104070i()) {
            if (this.f13202l == EnumC22516gw.LINEAR) {
                z = true;
            }
            if (z) {
                scalb = this.f13203m * this.f13201k;
            } else {
                scalb = Math.scalb((float) this.f13203m, this.f13201k - 1);
            }
            long j = this.f13204n;
            coerceAtMost = RangesKt___RangesKt.coerceAtMost(scalb, 18000000L);
            return j + coerceAtMost;
        }
        long j2 = 0;
        if (m104069j()) {
            int i = this.f13209s;
            long j3 = this.f13204n;
            if (i == 0) {
                j3 += this.f13197g;
            }
            long j4 = this.f13199i;
            long j5 = this.f13198h;
            if (j4 != j5) {
                z = true;
            }
            if (z) {
                if (i == 0) {
                    j2 = (-1) * j4;
                }
                j3 += j5;
            } else if (i != 0) {
                j2 = j5;
            }
            return j3 + j2;
        }
        long j6 = this.f13204n;
        if (j6 == 0) {
            j6 = System.currentTimeMillis();
        }
        return this.f13197g + j6;
    }

    /* renamed from: d */
    public final HG6 m104075d(String id, UC6.EnumC8214a state, String workerClassName, String str, C12124b input, C12124b output, long j, long j2, long j3, C44821lz0 constraints, int i, EnumC22516gw backoffPolicy, long j4, long j5, long j6, long j7, boolean z, EnumC37214Xy3 outOfQuotaPolicy, int i2, int i3) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new HG6(id, state, workerClassName, str, input, output, j, j2, j3, constraints, i, backoffPolicy, j4, j5, j6, j7, z, outOfQuotaPolicy, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HG6) {
            HG6 hg6 = (HG6) obj;
            return Intrinsics.areEqual(this.f13191a, hg6.f13191a) && this.f13192b == hg6.f13192b && Intrinsics.areEqual(this.f13193c, hg6.f13193c) && Intrinsics.areEqual(this.f13194d, hg6.f13194d) && Intrinsics.areEqual(this.f13195e, hg6.f13195e) && Intrinsics.areEqual(this.f13196f, hg6.f13196f) && this.f13197g == hg6.f13197g && this.f13198h == hg6.f13198h && this.f13199i == hg6.f13199i && Intrinsics.areEqual(this.f13200j, hg6.f13200j) && this.f13201k == hg6.f13201k && this.f13202l == hg6.f13202l && this.f13203m == hg6.f13203m && this.f13204n == hg6.f13204n && this.f13205o == hg6.f13205o && this.f13206p == hg6.f13206p && this.f13207q == hg6.f13207q && this.f13208r == hg6.f13208r && this.f13209s == hg6.f13209s && this.f13210t == hg6.f13210t;
        }
        return false;
    }

    /* renamed from: f */
    public final int m104073f() {
        return this.f13210t;
    }

    /* renamed from: g */
    public final int m104072g() {
        return this.f13209s;
    }

    /* renamed from: h */
    public final boolean m104071h() {
        return !Intrinsics.areEqual(C44821lz0.f97038j, this.f13200j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f13191a.hashCode() * 31) + this.f13192b.hashCode()) * 31) + this.f13193c.hashCode()) * 31;
        String str = this.f13194d;
        int hashCode2 = (((((((((((((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f13195e.hashCode()) * 31) + this.f13196f.hashCode()) * 31) + Long.hashCode(this.f13197g)) * 31) + Long.hashCode(this.f13198h)) * 31) + Long.hashCode(this.f13199i)) * 31) + this.f13200j.hashCode()) * 31) + Integer.hashCode(this.f13201k)) * 31) + this.f13202l.hashCode()) * 31) + Long.hashCode(this.f13203m)) * 31) + Long.hashCode(this.f13204n)) * 31) + Long.hashCode(this.f13205o)) * 31) + Long.hashCode(this.f13206p)) * 31;
        boolean z = this.f13207q;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((hashCode2 + i) * 31) + this.f13208r.hashCode()) * 31) + Integer.hashCode(this.f13209s)) * 31) + Integer.hashCode(this.f13210t);
    }

    /* renamed from: i */
    public final boolean m104070i() {
        return this.f13192b == UC6.EnumC8214a.ENQUEUED && this.f13201k > 0;
    }

    /* renamed from: j */
    public final boolean m104069j() {
        return this.f13198h != 0;
    }

    /* renamed from: k */
    public final void m104068k(long j) {
        long coerceAtLeast;
        long coerceAtLeast2;
        if (j < 900000) {
            AbstractC32056Bx2.m113272e().mo113262k(f13189v, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(j, 900000L);
        coerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast(j, 900000L);
        m104067l(coerceAtLeast, coerceAtLeast2);
    }

    /* renamed from: l */
    public final void m104067l(long j, long j2) {
        long coerceAtLeast;
        long coerceIn;
        if (j < 900000) {
            AbstractC32056Bx2.m113272e().mo113262k(f13189v, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(j, 900000L);
        this.f13198h = coerceAtLeast;
        if (j2 < 300000) {
            AbstractC32056Bx2.m113272e().mo113262k(f13189v, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j2 > this.f13198h) {
            AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
            String str = f13189v;
            m113272e.mo113262k(str, "Flex duration greater than interval duration; Changed to " + j);
        }
        coerceIn = RangesKt___RangesKt.coerceIn(j2, 300000L, this.f13198h);
        this.f13199i = coerceIn;
    }

    public String toString() {
        return "{WorkSpec: " + this.f13191a + CoreConstants.CURLY_RIGHT;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ HG6(String str, UC6.EnumC8214a enumC8214a, String str2, String str3, C12124b c12124b, C12124b c12124b2, long j, long j2, long j3, C44821lz0 c44821lz0, int i, EnumC22516gw enumC22516gw, long j4, long j5, long j6, long j7, boolean z, EnumC37214Xy3 enumC37214Xy3, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, r4, str2, r6, r7, r8, (i4 & 64) != 0 ? 0L : j, (i4 & 128) != 0 ? 0L : j2, (i4 & 256) != 0 ? 0L : j3, (i4 & 512) != 0 ? C44821lz0.f97038j : c44821lz0, (i4 & 1024) != 0 ? 0 : i, (i4 & 2048) != 0 ? EnumC22516gw.EXPONENTIAL : enumC22516gw, (i4 & 4096) != 0 ? 30000L : j4, (i4 & 8192) != 0 ? 0L : j5, (i4 & 16384) != 0 ? 0L : j6, (32768 & i4) != 0 ? -1L : j7, (65536 & i4) != 0 ? false : z, (131072 & i4) != 0 ? EnumC37214Xy3.RUN_AS_NON_EXPEDITED_WORK_REQUEST : enumC37214Xy3, (262144 & i4) != 0 ? 0 : i2, (i4 & 524288) != 0 ? 0 : i3);
        C12124b c12124b3;
        C12124b c12124b4;
        UC6.EnumC8214a enumC8214a2 = (i4 & 2) != 0 ? UC6.EnumC8214a.ENQUEUED : enumC8214a;
        String str4 = (i4 & 8) != 0 ? null : str3;
        if ((i4 & 16) != 0) {
            C12124b EMPTY = C12124b.f56214c;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            c12124b3 = EMPTY;
        } else {
            c12124b3 = c12124b;
        }
        if ((i4 & 32) != 0) {
            C12124b EMPTY2 = C12124b.f56214c;
            Intrinsics.checkNotNullExpressionValue(EMPTY2, "EMPTY");
            c12124b4 = EMPTY2;
        } else {
            c12124b4 = c12124b2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HG6(String id, String workerClassName_) {
        this(id, null, workerClassName_, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 1048570, null);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(workerClassName_, "workerClassName_");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HG6(String newId, HG6 other) {
        this(newId, other.f13192b, other.f13193c, other.f13194d, new C12124b(other.f13195e), new C12124b(other.f13196f), other.f13197g, other.f13198h, other.f13199i, new C44821lz0(other.f13200j), other.f13201k, other.f13202l, other.f13203m, other.f13204n, other.f13205o, other.f13206p, other.f13207q, other.f13208r, other.f13209s, 0, 524288, null);
        Intrinsics.checkNotNullParameter(newId, "newId");
        Intrinsics.checkNotNullParameter(other, "other");
    }
}
