package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.lifecycle.LiveData;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p053io.CloseableKt;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00102\u00020\u0001:\u00056;!\"3BX\b\u0007\u0012\u0006\u0010\u0015\u001a\u000205\u0012\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0:\u0012\u001d\u0010@\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000b0>¢\u0006\u0002\b?0:\u0012\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000b¢\u0006\u0004\bm\u0010nJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J'\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0017J\u0010\u0010\"\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0017J\u0010\u0010#\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0017J\u000f\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b%\u0010&J\b\u0010'\u001a\u00020\u0002H\u0016J#\u0010)\u001a\u00020\u00022\u0012\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000bH\u0007¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0004H\u0000¢\u0006\u0004\b+\u0010\u0017J\u000f\u0010,\u001a\u00020\u0002H\u0000¢\u0006\u0004\b,\u0010-JA\u00103\u001a\b\u0012\u0004\u0012\u00028\u000002\"\u0004\b\u0000\u0010.2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010/\u001a\u00020$2\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0017¢\u0006\u0004\b3\u00104R\u001a\u0010\u0015\u001a\u0002058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R \u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R+\u0010@\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000b0>¢\u0006\u0002\b?0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010<R&\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060:8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010<\u001a\u0004\bA\u0010BR\"\u0010G\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u0010D\u001a\u0004\bE\u0010FR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010HR\u001a\u0010N\u001a\u00020I8GX\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0016\u0010P\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010OR$\u0010W\u001a\u0004\u0018\u00010Q8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bJ\u0010T\"\u0004\bU\u0010VR\u0014\u0010Z\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010YR\u0014\u0010]\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010\\R&\u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020_0^8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0016\u0010`\u001a\u0004\bR\u0010aR\u0018\u0010e\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010dR\u0014\u0010g\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010fR\u0014\u0010h\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010fR\u001a\u0010l\u001a\u00020i8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010j\u0012\u0004\bk\u0010-¨\u0006o"}, m28432d2 = {"Lq72;", "", "", "n", "LmV5;", "db", "", "tableId", "u", "t", "", "", "tableNames", "x", "([Ljava/lang/String;)[Ljava/lang/String;", "names", "q", "LIq;", "autoCloser", "r", "(LIq;)V", "database", "l", "(LmV5;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "name", "Landroid/content/Intent;", "serviceIntent", "s", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "Lq72$c;", "observer", "c", DateTokenConverter.CONVERTER_KEY, "p", "", "f", "()Z", "o", "tables", "m", "([Ljava/lang/String;)V", "w", "v", "()V", "T", "inTransaction", "Ljava/util/concurrent/Callable;", "computeFunction", "Landroidx/lifecycle/LiveData;", "e", "([Ljava/lang/String;ZLjava/util/concurrent/Callable;)Landroidx/lifecycle/LiveData;", "LEb5;", C17296a.f69688o, "LEb5;", "h", "()LEb5;", "", "b", "Ljava/util/Map;", "shadowTablesMap", "", "Lkotlin/jvm/JvmSuppressWildcards;", "viewTables", "k", "()Ljava/util/Map;", "tableIdLookup", "[Ljava/lang/String;", "getTablesNames$room_runtime_release", "()[Ljava/lang/String;", "tablesNames", "LIq;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "g", "Ljava/util/concurrent/atomic/AtomicBoolean;", "j", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "pendingRefresh", "Z", "initialized", "LqV5;", "i", "LqV5;", "()LqV5;", "setCleanupStatement$room_runtime_release", "(LqV5;)V", "cleanupStatement", "Lq72$b;", "Lq72$b;", "observedTableTracker", "Ln72;", "Ln72;", "invalidationLiveDataContainer", "Lph5;", "Lq72$d;", "Lph5;", "()Lph5;", "observerMap", "LBW2;", "LBW2;", "multiInstanceInvalidationClient", "Ljava/lang/Object;", "syncTriggersLock", "trackerLock", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "getRefreshRunnable$annotations", "refreshRunnable", "<init>", "(LEb5;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: q72  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C47274q72 {

    /* renamed from: q */
    public static final C27502a f104718q = new C27502a(null);

    /* renamed from: r */
    public static final String[] f104719r = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a */
    public final AbstractC32563Eb5 f104720a;

    /* renamed from: b */
    public final Map<String, String> f104721b;

    /* renamed from: c */
    public final Map<String, Set<String>> f104722c;

    /* renamed from: d */
    public final Map<String, Integer> f104723d;

    /* renamed from: e */
    public final String[] f104724e;

    /* renamed from: f */
    public C3770Iq f104725f;

    /* renamed from: g */
    public final AtomicBoolean f104726g;

    /* renamed from: h */
    public volatile boolean f104727h;

    /* renamed from: i */
    public volatile InterfaceC47496qV5 f104728i;

    /* renamed from: j */
    public final C27503b f104729j;

    /* renamed from: k */
    public final C45495n72 f104730k;

    /* renamed from: l */
    public final C47018ph5<AbstractC27505c, C27506d> f104731l;

    /* renamed from: m */
    public BW2 f104732m;

    /* renamed from: n */
    public final Object f104733n;

    /* renamed from: o */
    public final Object f104734o;
    @JvmField

    /* renamed from: p */
    public final Runnable f104735p;

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u0011J\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u001a\u0010\u000f\u001a\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u000f\u0010\r\u0012\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u0012\u0010\r\u0012\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\r¨\u0006\u001a"}, m28432d2 = {"Lq72$a;", "", "", "tableName", "triggerType", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "LmV5;", "database", "", C17296a.f69688o, "(LmV5;)V", "CREATE_TRACKING_TABLE_SQL", "Ljava/lang/String;", "INVALIDATED_COLUMN_NAME", "RESET_UPDATED_TABLES_SQL", "getRESET_UPDATED_TABLES_SQL$room_runtime_release$annotations", "()V", "SELECT_UPDATED_TABLES_SQL", "getSELECT_UPDATED_TABLES_SQL$room_runtime_release$annotations", "TABLE_ID_COLUMN_NAME", "", "TRIGGERS", "[Ljava/lang/String;", "UPDATE_TABLE_NAME", "<init>", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: q72$a */
    /* loaded from: classes.dex */
    public static final class C27502a {
        public /* synthetic */ C27502a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void m18122a(InterfaceC45124mV5 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            if (database.mo25486r3()) {
                database.mo25490Y();
            } else {
                database.mo25485w();
            }
        }

        /* renamed from: b */
        public final String m18121b(String tableName, String triggerType) {
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            Intrinsics.checkNotNullParameter(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }

        private C27502a() {
        }
    }

    @Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0018\n\u0002\b\u000f\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00020\u0002\"\u00020\u0003J\u0012\u0010\u0007\u001a\u00020\u00052\n\u0010\u0004\u001a\u00020\u0002\"\u00020\u0003J\u0006\u0010\t\u001a\u00020\bJ\n\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0007R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\"\u0010\u001a\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, m28432d2 = {"Lq72$b;", "", "", "", "tableIds", "", "b", "c", "", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "", "[J", "getTableObservers", "()[J", "tableObservers", "", "[Z", "triggerStates", "[I", "triggerStateChanges", "Z", "getNeedsSync", "()Z", "setNeedsSync", "(Z)V", "needsSync", "tableCount", "<init>", "(I)V", "e", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: q72$b */
    /* loaded from: classes.dex */
    public static final class C27503b {

        /* renamed from: e */
        public static final C27504a f104736e = new C27504a(null);

        /* renamed from: a */
        public final long[] f104737a;

        /* renamed from: b */
        public final boolean[] f104738b;

        /* renamed from: c */
        public final int[] f104739c;

        /* renamed from: d */
        public boolean f104740d;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, m28432d2 = {"Lq72$b$a;", "", "", "ADD", "I", "NO_OP", "REMOVE", "<init>", "()V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
        /* renamed from: q72$b$a */
        /* loaded from: classes.dex */
        public static final class C27504a {
            public /* synthetic */ C27504a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C27504a() {
            }
        }

        public C27503b(int i) {
            this.f104737a = new long[i];
            this.f104738b = new boolean[i];
            this.f104739c = new int[i];
        }

        @JvmName(name = "getTablesToSync")
        /* renamed from: a */
        public final int[] m18120a() {
            boolean z;
            synchronized (this) {
                if (!this.f104740d) {
                    return null;
                }
                long[] jArr = this.f104737a;
                int length = jArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    int i4 = 1;
                    if (jArr[i] > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean[] zArr = this.f104738b;
                    if (z != zArr[i2]) {
                        int[] iArr = this.f104739c;
                        if (!z) {
                            i4 = 2;
                        }
                        iArr[i2] = i4;
                    } else {
                        this.f104739c[i2] = 0;
                    }
                    zArr[i2] = z;
                    i++;
                    i2 = i3;
                }
                this.f104740d = false;
                return (int[]) this.f104739c.clone();
            }
        }

        /* renamed from: b */
        public final boolean m18119b(int... tableIds) {
            boolean z;
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (this) {
                z = false;
                for (int i : tableIds) {
                    long[] jArr = this.f104737a;
                    long j = jArr[i];
                    jArr[i] = 1 + j;
                    if (j == 0) {
                        z = true;
                        this.f104740d = true;
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
            return z;
        }

        /* renamed from: c */
        public final boolean m18118c(int... tableIds) {
            boolean z;
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (this) {
                z = false;
                for (int i : tableIds) {
                    long[] jArr = this.f104737a;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        z = true;
                        this.f104740d = true;
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
            return z;
        }

        /* renamed from: d */
        public final void m18117d() {
            synchronized (this) {
                Arrays.fill(this.f104738b, false);
                this.f104740d = true;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&R\"\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"Lq72$c;", "", "", "", "tables", "", "c", "", C17296a.f69688o, "[Ljava/lang/String;", "()[Ljava/lang/String;", "", "b", "()Z", "isRemote", "<init>", "([Ljava/lang/String;)V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: q72$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC27505c {

        /* renamed from: a */
        public final String[] f104741a;

        public AbstractC27505c(String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            this.f104741a = tables;
        }

        /* renamed from: a */
        public final String[] m18116a() {
            return this.f104741a;
        }

        /* renamed from: b */
        public boolean mo18115b() {
            return false;
        }

        /* renamed from: c */
        public abstract void mo18111c(Set<String> set);
    }

    @Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00052\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u000e\u0010\u0015R\u001c\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"Lq72$d;", "", "", "", "invalidatedTablesIds", "", "b", "(Ljava/util/Set;)V", "", "", "tables", "c", "([Ljava/lang/String;)V", "Lq72$c;", C17296a.f69688o, "Lq72$c;", "getObserver$room_runtime_release", "()Lq72$c;", "observer", "", "[I", "()[I", "tableIds", "[Ljava/lang/String;", "tableNames", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Set;", "singleTableSet", "<init>", "(Lq72$c;[I[Ljava/lang/String;)V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: q72$d */
    /* loaded from: classes.dex */
    public static final class C27506d {

        /* renamed from: a */
        public final AbstractC27505c f104742a;

        /* renamed from: b */
        public final int[] f104743b;

        /* renamed from: c */
        public final String[] f104744c;

        /* renamed from: d */
        public final Set<String> f104745d;

        public C27506d(AbstractC27505c observer, int[] tableIds, String[] tableNames) {
            boolean z;
            Set<String> emptySet;
            Intrinsics.checkNotNullParameter(observer, "observer");
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            Intrinsics.checkNotNullParameter(tableNames, "tableNames");
            this.f104742a = observer;
            this.f104743b = tableIds;
            this.f104744c = tableNames;
            if (tableNames.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                emptySet = SetsKt__SetsJVMKt.setOf(tableNames[0]);
            } else {
                emptySet = SetsKt__SetsKt.emptySet();
            }
            this.f104745d = emptySet;
            if (tableIds.length == tableNames.length) {
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        /* renamed from: a */
        public final int[] m18114a() {
            return this.f104743b;
        }

        /* renamed from: b */
        public final void m18113b(Set<Integer> invalidatedTablesIds) {
            Set<String> emptySet;
            Set createSetBuilder;
            Intrinsics.checkNotNullParameter(invalidatedTablesIds, "invalidatedTablesIds");
            int[] iArr = this.f104743b;
            int length = iArr.length;
            if (length != 0) {
                int i = 0;
                if (length != 1) {
                    createSetBuilder = SetsKt__SetsJVMKt.createSetBuilder();
                    int[] iArr2 = this.f104743b;
                    int length2 = iArr2.length;
                    int i2 = 0;
                    while (i < length2) {
                        int i3 = i2 + 1;
                        if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i]))) {
                            createSetBuilder.add(this.f104744c[i2]);
                        }
                        i++;
                        i2 = i3;
                    }
                    emptySet = SetsKt__SetsJVMKt.build(createSetBuilder);
                } else if (invalidatedTablesIds.contains(Integer.valueOf(iArr[0]))) {
                    emptySet = this.f104745d;
                } else {
                    emptySet = SetsKt__SetsKt.emptySet();
                }
            } else {
                emptySet = SetsKt__SetsKt.emptySet();
            }
            if (!emptySet.isEmpty()) {
                this.f104742a.mo18111c(emptySet);
            }
        }

        /* renamed from: c */
        public final void m18112c(String[] tables) {
            Set<String> emptySet;
            boolean equals;
            Set createSetBuilder;
            String[] strArr;
            boolean equals2;
            Intrinsics.checkNotNullParameter(tables, "tables");
            int length = this.f104744c.length;
            if (length != 0) {
                boolean z = false;
                if (length != 1) {
                    createSetBuilder = SetsKt__SetsJVMKt.createSetBuilder();
                    for (String str : tables) {
                        for (String str2 : this.f104744c) {
                            equals2 = StringsKt__StringsJVMKt.equals(str2, str, true);
                            if (equals2) {
                                createSetBuilder.add(str2);
                            }
                        }
                    }
                    emptySet = SetsKt__SetsJVMKt.build(createSetBuilder);
                } else {
                    int length2 = tables.length;
                    int i = 0;
                    while (true) {
                        if (i >= length2) {
                            break;
                        }
                        equals = StringsKt__StringsJVMKt.equals(tables[i], this.f104744c[0], true);
                        if (equals) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                    if (z) {
                        emptySet = this.f104745d;
                    } else {
                        emptySet = SetsKt__SetsKt.emptySet();
                    }
                }
            } else {
                emptySet = SetsKt__SetsKt.emptySet();
            }
            if (!emptySet.isEmpty()) {
                this.f104742a.mo18111c(emptySet);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, m28432d2 = {"Lq72$e;", "Lq72$c;", "", "", "tables", "", "c", "Lq72;", "b", "Lq72;", "getTracker", "()Lq72;", "tracker", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "getDelegateRef", "()Ljava/lang/ref/WeakReference;", "delegateRef", "delegate", "<init>", "(Lq72;Lq72$c;)V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: q72$e */
    /* loaded from: classes.dex */
    public static final class C27507e extends AbstractC27505c {

        /* renamed from: b */
        public final C47274q72 f104746b;

        /* renamed from: c */
        public final WeakReference<AbstractC27505c> f104747c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27507e(C47274q72 tracker, AbstractC27505c delegate) {
            super(delegate.m18116a());
            Intrinsics.checkNotNullParameter(tracker, "tracker");
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f104746b = tracker;
            this.f104747c = new WeakReference<>(delegate);
        }

        @Override // p000.C47274q72.AbstractC27505c
        /* renamed from: c */
        public void mo18111c(Set<String> tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            AbstractC27505c abstractC27505c = this.f104747c.get();
            if (abstractC27505c == null) {
                this.f104746b.m18131p(this);
            } else {
                abstractC27505c.mo18111c(tables);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¨\u0006\u0007"}, m28432d2 = {"q72$f", "Ljava/lang/Runnable;", "", "run", "", "", C17296a.f69688o, "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: q72$f */
    /* loaded from: classes.dex */
    public static final class RunnableC27508f implements Runnable {
        public RunnableC27508f() {
        }

        /* renamed from: a */
        public final Set<Integer> m18110a() {
            Set createSetBuilder;
            Set<Integer> build;
            C47274q72 c47274q72 = C47274q72.this;
            createSetBuilder = SetsKt__SetsJVMKt.createSetBuilder();
            Cursor query$default = AbstractC32563Eb5.query$default(c47274q72.m18139h(), new UA5("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
            while (query$default.moveToNext()) {
                try {
                    createSetBuilder.add(Integer.valueOf(query$default.getInt(0)));
                } finally {
                }
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(query$default, null);
            build = SetsKt__SetsJVMKt.build(createSetBuilder);
            if (!build.isEmpty()) {
                if (C47274q72.this.m18140g() != null) {
                    InterfaceC47496qV5 m18140g = C47274q72.this.m18140g();
                    if (m18140g != null) {
                        m18140g.mo17482M();
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
            return build;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
            if (r0 != null) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
            r0.m101650e();
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00a2, code lost:
            if (r0 == null) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00ba, code lost:
            if (r0 == null) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00c2, code lost:
            if ((!r3.isEmpty()) == false) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00c4, code lost:
            r0 = r5.f104748b.m18138i();
            r1 = r5.f104748b;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00cc, code lost:
            monitor-enter(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00cd, code lost:
            r1 = r1.m18138i().iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00d9, code lost:
            if (r1.hasNext() == false) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00db, code lost:
            ((p000.C47274q72.C27506d) ((java.util.Map.Entry) r1.next()).getValue()).m18113b(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00eb, code lost:
            r1 = kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00ed, code lost:
            monitor-exit(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00f2, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
            return;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            Set<Integer> emptySet;
            C3770Iq c3770Iq;
            Lock m108726j = C47274q72.this.m18139h().m108726j();
            m108726j.lock();
            try {
                try {
                    if (!C47274q72.this.m18141f()) {
                    } else if (!C47274q72.this.m18137j().compareAndSet(true, false)) {
                        m108726j.unlock();
                        C3770Iq c3770Iq2 = C47274q72.this.f104725f;
                        if (c3770Iq2 != null) {
                            c3770Iq2.m101650e();
                        }
                    } else if (C47274q72.this.m18139h().m108721q()) {
                        m108726j.unlock();
                        C3770Iq c3770Iq3 = C47274q72.this.f104725f;
                        if (c3770Iq3 != null) {
                            c3770Iq3.m101650e();
                        }
                    } else {
                        InterfaceC45124mV5 mo6496d1 = C47274q72.this.m18139h().m108724l().mo6496d1();
                        mo6496d1.mo25490Y();
                        try {
                            emptySet = m18110a();
                            mo6496d1.mo25492W1();
                            m108726j.unlock();
                            c3770Iq = C47274q72.this.f104725f;
                        } finally {
                            mo6496d1.mo25488d2();
                        }
                    }
                } catch (SQLiteException e) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                    emptySet = SetsKt__SetsKt.emptySet();
                    m108726j.unlock();
                    c3770Iq = C47274q72.this.f104725f;
                } catch (IllegalStateException e2) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
                    emptySet = SetsKt__SetsKt.emptySet();
                    m108726j.unlock();
                    c3770Iq = C47274q72.this.f104725f;
                }
            } finally {
                m108726j.unlock();
                C3770Iq c3770Iq4 = C47274q72.this.f104725f;
                if (c3770Iq4 != null) {
                    c3770Iq4.m101650e();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C47274q72(AbstractC32563Eb5 database, Map<String, String> shadowTablesMap, Map<String, Set<String>> viewTables, String... tableNames) {
        Object value;
        String str;
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.f104720a = database;
        this.f104721b = shadowTablesMap;
        this.f104722c = viewTables;
        this.f104726g = new AtomicBoolean(false);
        this.f104729j = new C27503b(tableNames.length);
        this.f104730k = new C45495n72(database);
        this.f104731l = new C47018ph5<>();
        this.f104733n = new Object();
        this.f104734o = new Object();
        this.f104723d = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            String str2 = tableNames[i];
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str2.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f104723d.put(lowerCase, Integer.valueOf(i));
            String str3 = this.f104721b.get(tableNames[i]);
            if (str3 != null) {
                Intrinsics.checkNotNullExpressionValue(US, "US");
                str = str3.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr[i] = lowerCase;
        }
        this.f104724e = strArr;
        for (Map.Entry<String, String> entry : this.f104721b.entrySet()) {
            Locale US2 = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US2, "US");
            String lowerCase2 = entry.getValue().toLowerCase(US2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f104723d.containsKey(lowerCase2)) {
                Intrinsics.checkNotNullExpressionValue(US2, "US");
                String lowerCase3 = entry.getKey().toLowerCase(US2);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                Map<String, Integer> map = this.f104723d;
                value = MapsKt__MapsKt.getValue(map, lowerCase2);
                map.put(lowerCase3, value);
            }
        }
        this.f104735p = new RunnableC27508f();
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: c */
    public void m18144c(AbstractC27505c observer) {
        int[] intArray;
        C27506d mo18966h;
        Intrinsics.checkNotNullParameter(observer, "observer");
        String[] m18130q = m18130q(observer.m18116a());
        ArrayList arrayList = new ArrayList(m18130q.length);
        for (String str : m18130q) {
            Map<String, Integer> map = this.f104723d;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = map.get(lowerCase);
            if (num != null) {
                arrayList.add(Integer.valueOf(num.intValue()));
            } else {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
        }
        intArray = CollectionsKt___CollectionsKt.toIntArray(arrayList);
        C27506d c27506d = new C27506d(observer, intArray, m18130q);
        synchronized (this.f104731l) {
            mo18966h = this.f104731l.mo18966h(observer, c27506d);
        }
        if (mo18966h == null && this.f104729j.m18119b(Arrays.copyOf(intArray, intArray.length))) {
            m18125v();
        }
    }

    /* renamed from: d */
    public void m18143d(AbstractC27505c observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        m18144c(new C27507e(this, observer));
    }

    /* renamed from: e */
    public <T> LiveData<T> m18142e(String[] tableNames, boolean z, Callable<T> computeFunction) {
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        return this.f104730k.m24315a(m18123x(tableNames), z, computeFunction);
    }

    /* renamed from: f */
    public final boolean m18141f() {
        if (!this.f104720a.m108715w()) {
            return false;
        }
        if (!this.f104727h) {
            this.f104720a.m108724l().mo6496d1();
        }
        if (!this.f104727h) {
            Log.e("ROOM", "database is not initialized even though it is open");
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final InterfaceC47496qV5 m18140g() {
        return this.f104728i;
    }

    /* renamed from: h */
    public final AbstractC32563Eb5 m18139h() {
        return this.f104720a;
    }

    /* renamed from: i */
    public final C47018ph5<AbstractC27505c, C27506d> m18138i() {
        return this.f104731l;
    }

    /* renamed from: j */
    public final AtomicBoolean m18137j() {
        return this.f104726g;
    }

    /* renamed from: k */
    public final Map<String, Integer> m18136k() {
        return this.f104723d;
    }

    /* renamed from: l */
    public final void m18135l(InterfaceC45124mV5 database) {
        Intrinsics.checkNotNullParameter(database, "database");
        synchronized (this.f104734o) {
            if (this.f104727h) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            database.mo25497G1("PRAGMA temp_store = MEMORY;");
            database.mo25497G1("PRAGMA recursive_triggers='ON';");
            database.mo25497G1("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            m18124w(database);
            this.f104728i = database.mo25495J2("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.f104727h = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: m */
    public final void m18134m(String... tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        synchronized (this.f104731l) {
            Iterator<Map.Entry<K, V>> it = this.f104731l.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Intrinsics.checkNotNullExpressionValue(entry, "(observer, wrapper)");
                C27506d c27506d = (C27506d) entry.getValue();
                if (!((AbstractC27505c) entry.getKey()).mo18115b()) {
                    c27506d.m18112c(tables);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: n */
    public final void m18133n() {
        synchronized (this.f104734o) {
            this.f104727h = false;
            this.f104729j.m18117d();
            InterfaceC47496qV5 interfaceC47496qV5 = this.f104728i;
            if (interfaceC47496qV5 != null) {
                interfaceC47496qV5.close();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* renamed from: o */
    public void m18132o() {
        if (this.f104726g.compareAndSet(false, true)) {
            C3770Iq c3770Iq = this.f104725f;
            if (c3770Iq != null) {
                c3770Iq.m101645j();
            }
            this.f104720a.m108723m().execute(this.f104735p);
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: p */
    public void m18131p(AbstractC27505c observer) {
        C27506d mo18965j;
        Intrinsics.checkNotNullParameter(observer, "observer");
        synchronized (this.f104731l) {
            mo18965j = this.f104731l.mo18965j(observer);
        }
        if (mo18965j != null) {
            C27503b c27503b = this.f104729j;
            int[] m18114a = mo18965j.m18114a();
            if (c27503b.m18118c(Arrays.copyOf(m18114a, m18114a.length))) {
                m18125v();
            }
        }
    }

    /* renamed from: q */
    public final String[] m18130q(String[] strArr) {
        Set createSetBuilder;
        Set build;
        createSetBuilder = SetsKt__SetsJVMKt.createSetBuilder();
        for (String str : strArr) {
            Map<String, Set<String>> map = this.f104722c;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map<String, Set<String>> map2 = this.f104722c;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase2 = str.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Set<String> set = map2.get(lowerCase2);
                Intrinsics.checkNotNull(set);
                createSetBuilder.addAll(set);
            } else {
                createSetBuilder.add(str);
            }
        }
        build = SetsKt__SetsJVMKt.build(createSetBuilder);
        Object[] array = build.toArray(new String[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    /* renamed from: r */
    public final void m18129r(C3770Iq autoCloser) {
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.f104725f = autoCloser;
        autoCloser.m101643l(new Runnable() { // from class: p72
            @Override // java.lang.Runnable
            public final void run() {
                C47274q72.this.m18133n();
            }
        });
    }

    /* renamed from: s */
    public final void m18128s(Context context, String name, Intent serviceIntent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        this.f104732m = new BW2(context, name, serviceIntent, this, this.f104720a.m108723m());
    }

    /* renamed from: t */
    public final void m18127t(InterfaceC45124mV5 interfaceC45124mV5, int i) {
        interfaceC45124mV5.mo25497G1("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f104724e[i];
        for (String str2 : f104719r) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + f104718q.m18121b(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i + " AND invalidated = 0; END";
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            interfaceC45124mV5.mo25497G1(str3);
        }
    }

    /* renamed from: u */
    public final void m18126u(InterfaceC45124mV5 interfaceC45124mV5, int i) {
        String[] strArr;
        String str = this.f104724e[i];
        for (String str2 : f104719r) {
            String str3 = "DROP TRIGGER IF EXISTS " + f104718q.m18121b(str, str2);
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            interfaceC45124mV5.mo25497G1(str3);
        }
    }

    /* renamed from: v */
    public final void m18125v() {
        if (!this.f104720a.m108715w()) {
            return;
        }
        m18124w(this.f104720a.m108724l().mo6496d1());
    }

    /* renamed from: w */
    public final void m18124w(InterfaceC45124mV5 database) {
        Intrinsics.checkNotNullParameter(database, "database");
        if (database.mo25487j3()) {
            return;
        }
        try {
            Lock m108726j = this.f104720a.m108726j();
            m108726j.lock();
            synchronized (this.f104733n) {
                int[] m18120a = this.f104729j.m18120a();
                if (m18120a == null) {
                    m108726j.unlock();
                    return;
                }
                f104718q.m18122a(database);
                int length = m18120a.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = m18120a[i];
                    int i4 = i2 + 1;
                    if (i3 != 1) {
                        if (i3 == 2) {
                            m18126u(database, i2);
                        }
                    } else {
                        m18127t(database, i2);
                    }
                    i++;
                    i2 = i4;
                }
                database.mo25492W1();
                database.mo25488d2();
                Unit unit = Unit.INSTANCE;
                m108726j.unlock();
            }
        } catch (SQLiteException e) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
        } catch (IllegalStateException e2) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
        }
    }

    /* renamed from: x */
    public final String[] m18123x(String[] strArr) {
        String[] m18130q = m18130q(strArr);
        for (String str : m18130q) {
            Map<String, Integer> map = this.f104723d;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!map.containsKey(lowerCase)) {
                throw new IllegalArgumentException(("There is no table with name " + str).toString());
            }
        }
        return m18130q;
    }
}
