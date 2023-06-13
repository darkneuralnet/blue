package p000;

import ch.qos.logback.core.joran.action.ActionConst;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010\u0013\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u000e\b\u0007\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u00018B\u0011\b\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b;\u0010<J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0007J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0011H\u0016J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J\u0018\u0010\u0015\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0007H\u0016R\u001a\u0010\u001a\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\"\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b \u0010!R\u001a\u0010'\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u0012\u0004\b&\u0010!R\"\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u0012\u0004\b*\u0010!R\"\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u0012\u0004\b.\u0010!R\u001a\u00104\u001a\u0002008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b1\u00102\u0012\u0004\b3\u0010!R$\u00107\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00058\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b6\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0014\u0010:\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006>"}, m28432d2 = {"LHb5;", "LpV5;", "LoV5;", "", "query", "", "initArgCount", "", "f", "release", "statement", "b", "index", "m1", "", "value", "S0", "", "M1", "G0", "", "X0", "close", "I", "getCapacity", "()I", "capacity", "c", "Ljava/lang/String;", "", DateTokenConverter.CONVERTER_KEY, "[J", "getLongBindings$annotations", "()V", "longBindings", "", "e", "[D", "getDoubleBindings$annotations", "doubleBindings", "", "[Ljava/lang/String;", "getStringBindings$annotations", "stringBindings", "g", "[[B", "getBlobBindings$annotations", "blobBindings", "", "h", "[I", "getBindingTypes$annotations", "bindingTypes", "<set-?>", "i", "argCount", C17296a.f69688o, "()Ljava/lang/String;", "sql", "<init>", "(I)V", "j", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Hb5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33265Hb5 implements InterfaceC46903pV5, InterfaceC46310oV5 {

    /* renamed from: j */
    public static final C3173a f13613j = new C3173a(null);
    @JvmField

    /* renamed from: k */
    public static final TreeMap<Integer, C33265Hb5> f13614k = new TreeMap<>();

    /* renamed from: b */
    public final int f13615b;

    /* renamed from: c */
    public volatile String f13616c;
    @JvmField

    /* renamed from: d */
    public final long[] f13617d;
    @JvmField

    /* renamed from: e */
    public final double[] f13618e;
    @JvmField

    /* renamed from: f */
    public final String[] f13619f;
    @JvmField

    /* renamed from: g */
    public final byte[][] f13620g;

    /* renamed from: h */
    public final int[] f13621h;

    /* renamed from: i */
    public int f13622i;

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\nJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00048\u0006X\u0087T¢\u0006\f\n\u0004\b\r\u0010\f\u0012\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0012\u001a\u00020\u00048\u0006X\u0087T¢\u0006\f\n\u0004\b\u0012\u0010\f\u0012\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\fR&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0018\u0010\n¨\u0006\u001a"}, m28432d2 = {"LHb5$a;", "", "", "query", "", "argumentCount", "LHb5;", C17296a.f69688o, "", "b", "()V", "BLOB", "I", "DESIRED_POOL_SIZE", "getDESIRED_POOL_SIZE$annotations", "DOUBLE", "LONG", ActionConst.NULL, "POOL_LIMIT", "getPOOL_LIMIT$annotations", "STRING", "Ljava/util/TreeMap;", "queryPool", "Ljava/util/TreeMap;", "getQueryPool$annotations", "<init>", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Hb5$a */
    /* loaded from: classes.dex */
    public static final class C3173a {
        public /* synthetic */ C3173a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C33265Hb5 m103677a(String query, int i) {
            Intrinsics.checkNotNullParameter(query, "query");
            TreeMap<Integer, C33265Hb5> treeMap = C33265Hb5.f13614k;
            synchronized (treeMap) {
                Map.Entry<Integer, C33265Hb5> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
                if (ceilingEntry != null) {
                    treeMap.remove(ceilingEntry.getKey());
                    C33265Hb5 sqliteQuery = ceilingEntry.getValue();
                    sqliteQuery.m103678f(query, i);
                    Intrinsics.checkNotNullExpressionValue(sqliteQuery, "sqliteQuery");
                    return sqliteQuery;
                }
                Unit unit = Unit.INSTANCE;
                C33265Hb5 c33265Hb5 = new C33265Hb5(i, null);
                c33265Hb5.m103678f(query, i);
                return c33265Hb5;
            }
        }

        /* renamed from: b */
        public final void m103676b() {
            TreeMap<Integer, C33265Hb5> treeMap = C33265Hb5.f13614k;
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                Intrinsics.checkNotNullExpressionValue(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i = size - 1;
                    if (size > 0) {
                        it.next();
                        it.remove();
                        size = i;
                    } else {
                        return;
                    }
                }
            }
        }

        private C3173a() {
        }
    }

    public /* synthetic */ C33265Hb5(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    @JvmStatic
    /* renamed from: c */
    public static final C33265Hb5 m103680c(String str, int i) {
        return f13613j.m103677a(str, i);
    }

    @Override // p000.InterfaceC46310oV5
    /* renamed from: G0 */
    public void mo20958G0(int i, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f13621h[i] = 4;
        this.f13619f[i] = value;
    }

    @Override // p000.InterfaceC46310oV5
    /* renamed from: M1 */
    public void mo20957M1(int i, double d) {
        this.f13621h[i] = 3;
        this.f13618e[i] = d;
    }

    @Override // p000.InterfaceC46310oV5
    /* renamed from: S0 */
    public void mo20956S0(int i, long j) {
        this.f13621h[i] = 2;
        this.f13617d[i] = j;
    }

    @Override // p000.InterfaceC46310oV5
    /* renamed from: X0 */
    public void mo20955X0(int i, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f13621h[i] = 5;
        this.f13620g[i] = value;
    }

    @Override // p000.InterfaceC46903pV5
    /* renamed from: a */
    public String mo19174a() {
        String str = this.f13616c;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // p000.InterfaceC46903pV5
    /* renamed from: b */
    public void mo19173b(InterfaceC46310oV5 statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        int m103679d = m103679d();
        if (1 <= m103679d) {
            int i = 1;
            while (true) {
                int i2 = this.f13621h[i];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                if (i2 == 5) {
                                    byte[] bArr = this.f13620g[i];
                                    if (bArr != null) {
                                        statement.mo20955X0(i, bArr);
                                    } else {
                                        throw new IllegalArgumentException("Required value was null.".toString());
                                    }
                                }
                            } else {
                                String str = this.f13619f[i];
                                if (str != null) {
                                    statement.mo20958G0(i, str);
                                } else {
                                    throw new IllegalArgumentException("Required value was null.".toString());
                                }
                            }
                        } else {
                            statement.mo20957M1(i, this.f13618e[i]);
                        }
                    } else {
                        statement.mo20956S0(i, this.f13617d[i]);
                    }
                } else {
                    statement.mo20954m1(i);
                }
                if (i != m103679d) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* renamed from: d */
    public int m103679d() {
        return this.f13622i;
    }

    /* renamed from: f */
    public final void m103678f(String query, int i) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f13616c = query;
        this.f13622i = i;
    }

    @Override // p000.InterfaceC46310oV5
    /* renamed from: m1 */
    public void mo20954m1(int i) {
        this.f13621h[i] = 1;
    }

    public final void release() {
        TreeMap<Integer, C33265Hb5> treeMap = f13614k;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f13615b), this);
            f13613j.m103676b();
            Unit unit = Unit.INSTANCE;
        }
    }

    public C33265Hb5(int i) {
        this.f13615b = i;
        int i2 = i + 1;
        this.f13621h = new int[i2];
        this.f13617d = new long[i2];
        this.f13618e = new double[i2];
        this.f13619f = new String[i2];
        this.f13620g = new byte[i2];
    }
}
