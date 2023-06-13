package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmSuppressWildcards;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.InterfaceC45717nV5;
@Metadata(m28433d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b&\u0018\u0000 \u001c2\u00020\u0001:\u0006\u001f +*\u001b\u0019B\u0007¢\u0006\u0004\bq\u0010<J-\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\tH\u0002J\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0017J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u001a\u0010\u0014\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0003\u0012\u0004\u0012\u00020\u00130\u0012H\u0017J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u000fH$J\b\u0010\u001b\u001a\u00020\u001aH$J\"\u0010\u001c\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00150\u0012H\u0015J\u0016\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00030\u001dH\u0017J\b\u0010\u001f\u001a\u00020\tH\u0017J\b\u0010 \u001a\u00020\tH\u0017J\u001c\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#H\u0017J\u0010\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'H\u0016J\b\u0010+\u001a\u00020\tH\u0017J\b\u0010,\u001a\u00020\tH\u0017J\b\u0010-\u001a\u00020\tH\u0017J\u0010\u00100\u001a\u00020\t2\u0006\u0010/\u001a\u00020.H\u0016J#\u00103\u001a\u00028\u0000\"\u0004\b\u0000\u001012\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u000002H\u0016¢\u0006\u0004\b3\u00104J\u0010\u00107\u001a\u00020\t2\u0006\u00106\u001a\u000205H\u0014J\b\u00109\u001a\u000208H\u0016R\u001e\u0010=\u001a\u0004\u0018\u0001058\u0004@\u0004X\u0085\u000e¢\u0006\f\n\u0004\b\u001f\u0010:\u0012\u0004\b;\u0010<R\u0016\u0010@\u001a\u00020>8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010?R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010?R\u0016\u0010C\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010BR\u001a\u0010G\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010D\u001a\u0004\bE\u0010FR\u0016\u0010I\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010HR\u0016\u0010J\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010HR$\u0010N\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010\u00158\u0004@\u0004X\u0085\u000e¢\u0006\f\n\u0004\b\u0017\u0010L\u0012\u0004\bM\u0010<R6\u0010\u0014\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0003\u0012\u0004\u0012\u00020\u00130O8\u0004@\u0004X\u0085\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0014\u0010X\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010WR\u0018\u0010[\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010ZR\u001d\u0010b\u001a\b\u0012\u0004\u0012\u00020]0\\8G¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR#\u0010d\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00010O8G¢\u0006\f\n\u0004\bc\u0010Q\u001a\u0004\bP\u0010SR$\u0010e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010QR\u0014\u0010g\u001a\u00020>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010fR\u0014\u0010i\u001a\u00020>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010fR\u0014\u0010\u0006\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010jR\u0017\u0010n\u001a\u0002088G¢\u0006\f\u0012\u0004\bm\u0010<\u001a\u0004\bk\u0010lR\u0014\u0010p\u001a\u0002088@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bo\u0010l¨\u0006r"}, m28432d2 = {"LEb5;", "", "T", "Ljava/lang/Class;", "clazz", "LnV5;", "openHelper", "B", "(Ljava/lang/Class;LnV5;)Ljava/lang/Object;", "", "s", "t", "Ljava/util/concurrent/locks/Lock;", "j", "()Ljava/util/concurrent/locks/Lock;", "LfT0;", "configuration", "r", "", "LTq;", "autoMigrationSpecs", "", "LcU2;", "h", "config", "f", "Lq72;", "e", "o", "", "n", C17296a.f69688o, "b", "LpV5;", "query", "Landroid/os/CancellationSignal;", "signal", "Landroid/database/Cursor;", "x", "", "sql", "LqV5;", DateTokenConverter.CONVERTER_KEY, "c", "g", "A", "Ljava/lang/Runnable;", "body", "z", "V", "Ljava/util/concurrent/Callable;", "y", "(Ljava/util/concurrent/Callable;)Ljava/lang/Object;", "LmV5;", "db", "u", "", "q", "LmV5;", "getMDatabase$annotations", "()V", "mDatabase", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "internalQueryExecutor", "internalTransactionExecutor", "LnV5;", "internalOpenHelper", "Lq72;", "k", "()Lq72;", "invalidationTracker", "Z", "allowMainThreadQueries", "writeAheadLoggingEnabled", "LEb5$b;", "Ljava/util/List;", "getMCallbacks$annotations", "mCallbacks", "", "i", "Ljava/util/Map;", "getAutoMigrationSpecs", "()Ljava/util/Map;", "setAutoMigrationSpecs", "(Ljava/util/Map;)V", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "readWriteLock", "LIq;", "LIq;", "autoCloser", "Ljava/lang/ThreadLocal;", "", "l", "Ljava/lang/ThreadLocal;", "getSuspendingTransactionId", "()Ljava/lang/ThreadLocal;", "suspendingTransactionId", "m", "backingFieldMap", "typeConverters", "()Ljava/util/concurrent/Executor;", "queryExecutor", "p", "transactionExecutor", "()LnV5;", "w", "()Z", "isOpenInternal$annotations", "isOpenInternal", "v", "isMainThread", "<init>", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Eb5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC32563Eb5 {

    /* renamed from: o */
    public static final C1900c f7770o = new C1900c(null);
    @JvmField

    /* renamed from: a */
    public volatile InterfaceC45124mV5 f7771a;

    /* renamed from: b */
    public Executor f7772b;

    /* renamed from: c */
    public Executor f7773c;

    /* renamed from: d */
    public InterfaceC45717nV5 f7774d;

    /* renamed from: f */
    public boolean f7776f;

    /* renamed from: g */
    public boolean f7777g;
    @JvmField

    /* renamed from: h */
    public List<? extends AbstractC1899b> f7778h;

    /* renamed from: k */
    public C3770Iq f7781k;

    /* renamed from: m */
    public final Map<String, Object> f7783m;

    /* renamed from: n */
    public final Map<Class<?>, Object> f7784n;

    /* renamed from: e */
    public final C47274q72 f7775e = mo52997e();

    /* renamed from: i */
    public Map<Class<? extends InterfaceC7937Tq>, InterfaceC7937Tq> f7779i = new LinkedHashMap();

    /* renamed from: j */
    public final ReentrantReadWriteLock f7780j = new ReentrantReadWriteLock();

    /* renamed from: l */
    public final ThreadLocal<Integer> f7782l = new ThreadLocal<>();

    @Metadata(m28433d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B)\b\u0000\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b]\u0010^J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J)\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u000f\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u0018\u0010*\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010<\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00101R\u0016\u0010>\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00101R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010F\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001c\u0010O\u001a\b\u0012\u0004\u0012\u00020L0K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u001e\u0010Q\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010NR\u0018\u0010S\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010\u001dR\u0018\u0010W\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001e\u0010\\\u001a\n\u0012\u0004\u0012\u00020Y\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[¨\u0006_"}, m28432d2 = {"LEb5$a;", "LEb5;", "T", "", "LnV5$c;", "factory", "f", "", "LcU2;", "migrations", "b", "([LcU2;)LEb5$a;", "c", "Ljava/util/concurrent/Executor;", "executor", "g", "e", "LEb5$b;", "callback", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "()LEb5;", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/lang/Class;", "Ljava/lang/Class;", "klass", "", "Ljava/lang/String;", "name", "", "Ljava/util/List;", "callbacks", "LEb5$f;", "LEb5$f;", "prepackagedDatabaseCallback", "typeConverters", "LTq;", "autoMigrationSpecs", "h", "Ljava/util/concurrent/Executor;", "queryExecutor", "i", "transactionExecutor", "j", "LnV5$c;", "", "k", "Z", "allowMainThreadQueries", "LEb5$d;", "l", "LEb5$d;", "journalMode", "Landroid/content/Intent;", "m", "Landroid/content/Intent;", "multiInstanceInvalidationIntent", "n", "requireMigration", "o", "allowDestructiveMigrationOnDowngrade", "", "p", "J", "autoCloseTimeout", "Ljava/util/concurrent/TimeUnit;", "q", "Ljava/util/concurrent/TimeUnit;", "autoCloseTimeUnit", "LEb5$e;", "r", "LEb5$e;", "migrationContainer", "", "", "s", "Ljava/util/Set;", "migrationsNotRequiredFrom", "t", "migrationStartAndEndVersions", "u", "copyFromAssetPath", "Ljava/io/File;", "v", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "w", "Ljava/util/concurrent/Callable;", "copyFromInputStream", "<init>", "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Eb5$a */
    /* loaded from: classes.dex */
    public static class C1898a<T extends AbstractC32563Eb5> {

        /* renamed from: a */
        public final Context f7785a;

        /* renamed from: b */
        public final Class<T> f7786b;

        /* renamed from: c */
        public final String f7787c;

        /* renamed from: d */
        public final List<AbstractC1899b> f7788d;

        /* renamed from: e */
        public AbstractC1903f f7789e;

        /* renamed from: f */
        public final List<Object> f7790f;

        /* renamed from: g */
        public List<InterfaceC7937Tq> f7791g;

        /* renamed from: h */
        public Executor f7792h;

        /* renamed from: i */
        public Executor f7793i;

        /* renamed from: j */
        public InterfaceC45717nV5.InterfaceC26536c f7794j;

        /* renamed from: k */
        public boolean f7795k;

        /* renamed from: l */
        public EnumC1901d f7796l;

        /* renamed from: m */
        public Intent f7797m;

        /* renamed from: n */
        public boolean f7798n;

        /* renamed from: o */
        public boolean f7799o;

        /* renamed from: p */
        public long f7800p;

        /* renamed from: q */
        public TimeUnit f7801q;

        /* renamed from: r */
        public final C1902e f7802r;

        /* renamed from: s */
        public Set<Integer> f7803s;

        /* renamed from: t */
        public Set<Integer> f7804t;

        /* renamed from: u */
        public String f7805u;

        /* renamed from: v */
        public File f7806v;

        /* renamed from: w */
        public Callable<InputStream> f7807w;

        public C1898a(Context context, Class<T> klass, String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(klass, "klass");
            this.f7785a = context;
            this.f7786b = klass;
            this.f7787c = str;
            this.f7788d = new ArrayList();
            this.f7790f = new ArrayList();
            this.f7791g = new ArrayList();
            this.f7796l = EnumC1901d.AUTOMATIC;
            this.f7798n = true;
            this.f7800p = -1L;
            this.f7802r = new C1902e();
            this.f7803s = new LinkedHashSet();
        }

        /* renamed from: a */
        public C1898a<T> m108711a(AbstractC1899b callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f7788d.add(callback);
            return this;
        }

        /* renamed from: b */
        public C1898a<T> m108710b(AbstractC39165cU2... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            if (this.f7804t == null) {
                this.f7804t = new HashSet();
            }
            for (AbstractC39165cU2 abstractC39165cU2 : migrations) {
                Set<Integer> set = this.f7804t;
                Intrinsics.checkNotNull(set);
                set.add(Integer.valueOf(abstractC39165cU2.f60711a));
                Set<Integer> set2 = this.f7804t;
                Intrinsics.checkNotNull(set2);
                set2.add(Integer.valueOf(abstractC39165cU2.f60712b));
            }
            this.f7802r.m108698b((AbstractC39165cU2[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        /* renamed from: c */
        public C1898a<T> m108709c() {
            this.f7795k = true;
            return this;
        }

        /* renamed from: d */
        public T m108708d() {
            int i;
            int i2;
            int i3;
            Executor executor = this.f7792h;
            if (executor == null && this.f7793i == null) {
                Executor m108397g = C1988Em.m108397g();
                this.f7793i = m108397g;
                this.f7792h = m108397g;
            } else if (executor != null && this.f7793i == null) {
                this.f7793i = executor;
            } else if (executor == null) {
                this.f7792h = this.f7793i;
            }
            Set<Integer> set = this.f7804t;
            boolean z = true;
            if (set != null) {
                Intrinsics.checkNotNull(set);
                for (Integer num : set) {
                    int intValue = num.intValue();
                    if (!(!this.f7803s.contains(Integer.valueOf(intValue)))) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + intValue).toString());
                    }
                }
            }
            C4603Kq c4603Kq = this.f7794j;
            if (c4603Kq == null) {
                c4603Kq = new C36978Wy1();
            }
            if (c4603Kq != null) {
                if (this.f7800p > 0) {
                    if (this.f7787c != null) {
                        long j = this.f7800p;
                        TimeUnit timeUnit = this.f7801q;
                        if (timeUnit != null) {
                            Executor executor2 = this.f7792h;
                            if (executor2 != null) {
                                c4603Kq = new C4603Kq(c4603Kq, new C3770Iq(j, timeUnit, executor2));
                            } else {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.".toString());
                    }
                }
                String str = this.f7805u;
                if (str != null || this.f7806v != null || this.f7807w != null) {
                    if (this.f7787c != null) {
                        if (str == null) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                        File file = this.f7806v;
                        if (file == null) {
                            i2 = 0;
                        } else {
                            i2 = 1;
                        }
                        Callable<InputStream> callable = this.f7807w;
                        if (callable == null) {
                            i3 = 0;
                        } else {
                            i3 = 1;
                        }
                        if (i + i2 + i3 != 1) {
                            z = false;
                        }
                        if (z) {
                            c4603Kq = new C51750xg5(str, file, callable, c4603Kq);
                        } else {
                            throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.".toString());
                    }
                }
            } else {
                c4603Kq = null;
            }
            C51750xg5 c51750xg5 = c4603Kq;
            if (c51750xg5 != null) {
                Context context = this.f7785a;
                String str2 = this.f7787c;
                C1902e c1902e = this.f7802r;
                List<AbstractC1899b> list = this.f7788d;
                boolean z2 = this.f7795k;
                EnumC1901d m108700c = this.f7796l.m108700c(context);
                Executor executor3 = this.f7792h;
                if (executor3 != null) {
                    Executor executor4 = this.f7793i;
                    if (executor4 != null) {
                        C40950fT0 c40950fT0 = new C40950fT0(context, str2, c51750xg5, c1902e, list, z2, m108700c, executor3, executor4, this.f7797m, this.f7798n, this.f7799o, this.f7803s, this.f7805u, this.f7806v, this.f7807w, this.f7789e, this.f7790f, this.f7791g);
                        T t = (T) C32329Db5.m110125b(this.f7786b, "_Impl");
                        t.m108720r(c40950fT0);
                        return t;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        /* renamed from: e */
        public C1898a<T> m108707e() {
            this.f7798n = false;
            this.f7799o = true;
            return this;
        }

        /* renamed from: f */
        public C1898a<T> m108706f(InterfaceC45717nV5.InterfaceC26536c interfaceC26536c) {
            this.f7794j = interfaceC26536c;
            return this;
        }

        /* renamed from: g */
        public C1898a<T> m108705g(Executor executor) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.f7792h = executor;
            return this;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, m28432d2 = {"LEb5$b;", "", "LmV5;", "db", "", C17296a.f69688o, "c", "b", "<init>", "()V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Eb5$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1899b {
        /* renamed from: a */
        public void m108704a(InterfaceC45124mV5 db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        /* renamed from: b */
        public void m108703b(InterfaceC45124mV5 db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        /* renamed from: c */
        public void mo88145c(InterfaceC45124mV5 db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LEb5$c;", "", "", "MAX_BIND_PARAMETER_CNT", "I", "<init>", "()V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Eb5$c */
    /* loaded from: classes.dex */
    public static final class C1900c {
        public /* synthetic */ C1900c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1900c() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002j\u0002\b\tj\u0002\b\u0004j\u0002\b\f¨\u0006\r"}, m28432d2 = {"LEb5$d;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "c", "(Landroid/content/Context;)LEb5$d;", "Landroid/app/ActivityManager;", "activityManager", "", "b", "<init>", "(Ljava/lang/String;I)V", DateTokenConverter.CONVERTER_KEY, "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Eb5$d */
    /* loaded from: classes.dex */
    public enum EnumC1901d {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        /* renamed from: b */
        public final boolean m108701b(ActivityManager activityManager) {
            return C41566gV5.m39240b(activityManager);
        }

        /* renamed from: c */
        public final EnumC1901d m108700c(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            if (!m108701b((ActivityManager) systemService)) {
                return WRITE_AHEAD_LOGGING;
            }
            return TRUNCATE;
        }
    }

    @Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b0\bH\u0016J \u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016J\u0016\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tJ\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0003H\u0002J6\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0002R,\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001b¨\u0006\u001e"}, m28432d2 = {"LEb5$e;", "", "", "LcU2;", "migrations", "", "b", "([LcU2;)V", "", "", "f", "start", "end", "", DateTokenConverter.CONVERTER_KEY, "startVersion", "endVersion", "", "c", "migration", C17296a.f69688o, "", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "upgrade", "e", "", "Ljava/util/TreeMap;", "Ljava/util/Map;", "<init>", "()V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Eb5$e */
    /* loaded from: classes.dex */
    public static class C1902e {

        /* renamed from: a */
        public final Map<Integer, TreeMap<Integer, AbstractC39165cU2>> f7812a = new LinkedHashMap();

        /* renamed from: a */
        public final void m108699a(AbstractC39165cU2 abstractC39165cU2) {
            int i = abstractC39165cU2.f60711a;
            int i2 = abstractC39165cU2.f60712b;
            Map<Integer, TreeMap<Integer, AbstractC39165cU2>> map = this.f7812a;
            Integer valueOf = Integer.valueOf(i);
            TreeMap<Integer, AbstractC39165cU2> treeMap = map.get(valueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(valueOf, treeMap);
            }
            TreeMap<Integer, AbstractC39165cU2> treeMap2 = treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i2))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i2)) + " with " + abstractC39165cU2);
            }
            treeMap2.put(Integer.valueOf(i2), abstractC39165cU2);
        }

        /* renamed from: b */
        public void m108698b(AbstractC39165cU2... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            for (AbstractC39165cU2 abstractC39165cU2 : migrations) {
                m108699a(abstractC39165cU2);
            }
        }

        /* renamed from: c */
        public final boolean m108697c(int i, int i2) {
            Map<Integer, Map<Integer, AbstractC39165cU2>> m108694f = m108694f();
            if (m108694f.containsKey(Integer.valueOf(i))) {
                Map<Integer, AbstractC39165cU2> map = m108694f.get(Integer.valueOf(i));
                if (map == null) {
                    map = MapsKt__MapsKt.emptyMap();
                }
                return map.containsKey(Integer.valueOf(i2));
            }
            return false;
        }

        /* renamed from: d */
        public List<AbstractC39165cU2> m108696d(int i, int i2) {
            boolean z;
            List<AbstractC39165cU2> emptyList;
            if (i == i2) {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                return emptyList;
            }
            if (i2 > i) {
                z = true;
            } else {
                z = false;
            }
            return m108695e(new ArrayList(), z, i, i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
            if (r6 <= r12) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
            if (r6 < r11) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
            r6 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0059, code lost:
            continue;
         */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final List<AbstractC39165cU2> m108695e(List<AbstractC39165cU2> list, boolean z, int i, int i2) {
            boolean z2;
            boolean z3;
            Set<Integer> keySet;
            boolean z4;
            do {
                z2 = true;
                if (!z ? i > i2 : i < i2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    TreeMap<Integer, AbstractC39165cU2> treeMap = this.f7812a.get(Integer.valueOf(i));
                    if (treeMap == null) {
                        return null;
                    }
                    if (z) {
                        keySet = treeMap.descendingKeySet();
                    } else {
                        keySet = treeMap.keySet();
                    }
                    Iterator<Integer> it = keySet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Integer targetVersion = it.next();
                            if (z) {
                                int i3 = i + 1;
                                Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                                int intValue = targetVersion.intValue();
                                if (i3 <= intValue) {
                                }
                                z4 = false;
                                continue;
                            } else {
                                Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                                int intValue2 = targetVersion.intValue();
                                if (i2 <= intValue2) {
                                }
                                z4 = false;
                                continue;
                            }
                            if (z4) {
                                AbstractC39165cU2 abstractC39165cU2 = treeMap.get(targetVersion);
                                Intrinsics.checkNotNull(abstractC39165cU2);
                                list.add(abstractC39165cU2);
                                i = targetVersion.intValue();
                                continue;
                                break;
                            }
                        } else {
                            z2 = false;
                            continue;
                            break;
                        }
                    }
                } else {
                    return list;
                }
            } while (z2);
            return null;
        }

        /* renamed from: f */
        public Map<Integer, Map<Integer, AbstractC39165cU2>> m108694f() {
            return this.f7812a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, m28432d2 = {"LEb5$f;", "", "LmV5;", "db", "", C17296a.f69688o, "<init>", "()V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Eb5$f */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1903f {
        /* renamed from: a */
        public void m108693a(InterfaceC45124mV5 db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LmV5;", "it", "", C17296a.f69688o, "(LmV5;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: Eb5$g */
    /* loaded from: classes.dex */
    public static final class C1904g extends Lambda implements Function1<InterfaceC45124mV5, Object> {
        public C1904g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Object invoke(InterfaceC45124mV5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC32563Eb5.this.m108719s();
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LmV5;", "it", "", C17296a.f69688o, "(LmV5;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: Eb5$h */
    /* loaded from: classes.dex */
    public static final class C1905h extends Lambda implements Function1<InterfaceC45124mV5, Object> {
        public C1905h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Object invoke(InterfaceC45124mV5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC32563Eb5.this.m108718t();
            return null;
        }
    }

    public AbstractC32563Eb5() {
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        Intrinsics.checkNotNullExpressionValue(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f7783m = synchronizedMap;
        this.f7784n = new LinkedHashMap();
    }

    public static /* synthetic */ void isOpen$annotations() {
    }

    public static /* synthetic */ void isOpenInternal$annotations() {
    }

    public static /* synthetic */ Cursor query$default(AbstractC32563Eb5 abstractC32563Eb5, InterfaceC46903pV5 interfaceC46903pV5, CancellationSignal cancellationSignal, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                cancellationSignal = null;
            }
            return abstractC32563Eb5.m108714x(interfaceC46903pV5, cancellationSignal);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
    }

    @Deprecated(message = "setTransactionSuccessful() is deprecated", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    /* renamed from: A */
    public void m108734A() {
        m108724l().mo6496d1().mo25492W1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B */
    public final <T> T m108733B(Class<T> cls, InterfaceC45717nV5 interfaceC45717nV5) {
        if (cls.isInstance(interfaceC45717nV5)) {
            return interfaceC45717nV5;
        }
        if (interfaceC45717nV5 instanceof CZ0) {
            return (T) m108733B(cls, ((CZ0) interfaceC45717nV5).getDelegate());
        }
        return null;
    }

    /* renamed from: a */
    public void m108732a() {
        if (this.f7776f || (!m108716v())) {
            return;
        }
        throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
    }

    /* renamed from: b */
    public void m108731b() {
        if (!(m108721q() || this.f7782l.get() == null)) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    @Deprecated(message = "beginTransaction() is deprecated", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    /* renamed from: c */
    public void m108730c() {
        m108732a();
        C3770Iq c3770Iq = this.f7781k;
        if (c3770Iq == null) {
            m108719s();
        } else {
            c3770Iq.m101648g(new C1904g());
        }
    }

    /* renamed from: d */
    public InterfaceC47496qV5 m108729d(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        m108732a();
        m108731b();
        return m108724l().mo6496d1().mo25495J2(sql);
    }

    /* renamed from: e */
    public abstract C47274q72 mo52997e();

    /* renamed from: f */
    public abstract InterfaceC45717nV5 mo52996f(C40950fT0 c40950fT0);

    @Deprecated(message = "endTransaction() is deprecated", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    /* renamed from: g */
    public void m108728g() {
        C3770Iq c3770Iq = this.f7781k;
        if (c3770Iq == null) {
            m108718t();
        } else {
            c3770Iq.m101648g(new C1905h());
        }
    }

    @JvmSuppressWildcards
    /* renamed from: h */
    public List<AbstractC39165cU2> mo52995h(Map<Class<? extends InterfaceC7937Tq>, InterfaceC7937Tq> autoMigrationSpecs) {
        List<AbstractC39165cU2> emptyList;
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }

    /* renamed from: i */
    public final Map<String, Object> m108727i() {
        return this.f7783m;
    }

    /* renamed from: j */
    public final Lock m108726j() {
        ReentrantReadWriteLock.ReadLock readLock = this.f7780j.readLock();
        Intrinsics.checkNotNullExpressionValue(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    /* renamed from: k */
    public C47274q72 m108725k() {
        return this.f7775e;
    }

    /* renamed from: l */
    public InterfaceC45717nV5 m108724l() {
        InterfaceC45717nV5 interfaceC45717nV5 = this.f7774d;
        if (interfaceC45717nV5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("internalOpenHelper");
            return null;
        }
        return interfaceC45717nV5;
    }

    /* renamed from: m */
    public Executor m108723m() {
        Executor executor = this.f7772b;
        if (executor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("internalQueryExecutor");
            return null;
        }
        return executor;
    }

    /* renamed from: n */
    public Set<Class<? extends InterfaceC7937Tq>> mo52994n() {
        Set<Class<? extends InterfaceC7937Tq>> emptySet;
        emptySet = SetsKt__SetsKt.emptySet();
        return emptySet;
    }

    /* renamed from: o */
    public Map<Class<?>, List<Class<?>>> mo52993o() {
        Map<Class<?>, List<Class<?>>> emptyMap;
        emptyMap = MapsKt__MapsKt.emptyMap();
        return emptyMap;
    }

    /* renamed from: p */
    public Executor m108722p() {
        Executor executor = this.f7773c;
        if (executor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("internalTransactionExecutor");
            return null;
        }
        return executor;
    }

    /* renamed from: q */
    public boolean m108721q() {
        return m108724l().mo6496d1().mo25487j3();
    }

    /* renamed from: r */
    public void m108720r(C40950fT0 configuration) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f7774d = mo52996f(configuration);
        Set<Class<? extends InterfaceC7937Tq>> mo52994n = mo52994n();
        BitSet bitSet = new BitSet();
        Iterator<Class<? extends InterfaceC7937Tq>> it = mo52994n.iterator();
        while (true) {
            boolean z3 = true;
            int i = -1;
            if (it.hasNext()) {
                Class<? extends InterfaceC7937Tq> next = it.next();
                int size = configuration.f80188s.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i2 = size - 1;
                        if (next.isAssignableFrom(configuration.f80188s.get(size).getClass())) {
                            bitSet.set(size);
                            i = size;
                            break;
                        } else if (i2 < 0) {
                            break;
                        } else {
                            size = i2;
                        }
                    }
                }
                if (i < 0) {
                    z3 = false;
                }
                if (z3) {
                    this.f7779i.put(next, configuration.f80188s.get(i));
                } else {
                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
            } else {
                int size2 = configuration.f80188s.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i3 = size2 - 1;
                        if (bitSet.get(size2)) {
                            if (i3 < 0) {
                                break;
                            }
                            size2 = i3;
                        } else {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
                        }
                    }
                }
                for (AbstractC39165cU2 abstractC39165cU2 : mo52995h(this.f7779i)) {
                    if (!configuration.f80173d.m108697c(abstractC39165cU2.f60711a, abstractC39165cU2.f60712b)) {
                        configuration.f80173d.m108698b(abstractC39165cU2);
                    }
                }
                C51157wg5 c51157wg5 = (C51157wg5) m108733B(C51157wg5.class, m108724l());
                if (c51157wg5 != null) {
                    c51157wg5.m6497d(configuration);
                }
                C4251Jq c4251Jq = (C4251Jq) m108733B(C4251Jq.class, m108724l());
                if (c4251Jq != null) {
                    this.f7781k = c4251Jq.f18309c;
                    m108725k().m18129r(c4251Jq.f18309c);
                }
                if (configuration.f80176g == EnumC1901d.WRITE_AHEAD_LOGGING) {
                    z = true;
                } else {
                    z = false;
                }
                m108724l().setWriteAheadLoggingEnabled(z);
                this.f7778h = configuration.f80174e;
                this.f7772b = configuration.f80177h;
                this.f7773c = new Q66(configuration.f80178i);
                this.f7776f = configuration.f80175f;
                this.f7777g = z;
                if (configuration.f80179j != null) {
                    if (configuration.f80171b != null) {
                        m108725k().m18128s(configuration.f80170a, configuration.f80171b, configuration.f80179j);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                Map<Class<?>, List<Class<?>>> mo52993o = mo52993o();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry<Class<?>, List<Class<?>>> entry : mo52993o.entrySet()) {
                    Class<?> key = entry.getKey();
                    for (Class<?> cls : entry.getValue()) {
                        int size3 = configuration.f80187r.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i4 = size3 - 1;
                                if (cls.isAssignableFrom(configuration.f80187r.get(size3).getClass())) {
                                    bitSet2.set(size3);
                                    break;
                                } else if (i4 < 0) {
                                    break;
                                } else {
                                    size3 = i4;
                                }
                            }
                        }
                        size3 = -1;
                        if (size3 >= 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            this.f7784n.put(cls, configuration.f80187r.get(size3));
                        } else {
                            throw new IllegalArgumentException(("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                        }
                    }
                }
                int size4 = configuration.f80187r.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i5 = size4 - 1;
                    if (bitSet2.get(size4)) {
                        if (i5 >= 0) {
                            size4 = i5;
                        } else {
                            return;
                        }
                    } else {
                        throw new IllegalArgumentException("Unexpected type converter " + configuration.f80187r.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                }
            }
        }
    }

    /* renamed from: s */
    public final void m108719s() {
        m108732a();
        InterfaceC45124mV5 mo6496d1 = m108724l().mo6496d1();
        m108725k().m18124w(mo6496d1);
        if (mo6496d1.mo25486r3()) {
            mo6496d1.mo25490Y();
        } else {
            mo6496d1.mo25485w();
        }
    }

    /* renamed from: t */
    public final void m108718t() {
        m108724l().mo6496d1().mo25488d2();
        if (!m108721q()) {
            m108725k().m18132o();
        }
    }

    /* renamed from: u */
    public void m108717u(InterfaceC45124mV5 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        m108725k().m18135l(db);
    }

    /* renamed from: v */
    public final boolean m108716v() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: w */
    public final boolean m108715w() {
        InterfaceC45124mV5 interfaceC45124mV5 = this.f7771a;
        return interfaceC45124mV5 != null && interfaceC45124mV5.isOpen();
    }

    @JvmOverloads
    /* renamed from: x */
    public Cursor m108714x(InterfaceC46903pV5 query, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        m108732a();
        m108731b();
        if (cancellationSignal != null) {
            return m108724l().mo6496d1().mo25493U0(query, cancellationSignal);
        }
        return m108724l().mo6496d1().mo25499C1(query);
    }

    /* renamed from: y */
    public <V> V m108713y(Callable<V> body) {
        Intrinsics.checkNotNullParameter(body, "body");
        m108730c();
        try {
            V call = body.call();
            m108734A();
            return call;
        } finally {
            m108728g();
        }
    }

    /* renamed from: z */
    public void m108712z(Runnable body) {
        Intrinsics.checkNotNullParameter(body, "body");
        m108730c();
        try {
            body.run();
            m108734A();
        } finally {
            m108728g();
        }
    }
}
