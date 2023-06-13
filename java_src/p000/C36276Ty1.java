package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.share.internal.C17296a;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001?B\u000f\u0012\u0006\u0010*\u001a\u00020%¢\u0006\u0004\b=\u0010>J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0010H\u0016J\u001a\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0017JE\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u001d\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001c\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J)\u0010\"\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010!\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001c0\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\b\u0010$\u001a\u00020\u0006H\u0016J\u000e\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%R\u0014\u0010*\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R$\u00100\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0014\u00101\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0016\u00105\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00102R(\u0010<\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000209\u0018\u0001088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006@"}, m28432d2 = {"LTy1;", "LmV5;", "", "sql", "LqV5;", "J2", "", "w", "Y", "d2", "W1", "", "j3", "query", "Landroid/database/Cursor;", "c3", "LpV5;", "C1", "Landroid/os/CancellationSignal;", "cancellationSignal", "U0", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "whereClause", "", "", "whereArgs", "T2", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "G1", "bindArgs", "X1", "(Ljava/lang/String;[Ljava/lang/Object;)V", "close", "Landroid/database/sqlite/SQLiteDatabase;", "sqLiteDatabase", "c", "b", "Landroid/database/sqlite/SQLiteDatabase;", "delegate", "value", "getVersion", "()I", "C2", "(I)V", "version", "isOpen", "()Z", "getPath", "()Ljava/lang/String;", "path", "r3", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "J", "()Ljava/util/List;", "attachedDbs", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;)V", C17296a.f69688o, "sqlite-framework_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Ty1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36276Ty1 implements InterfaceC45124mV5 {

    /* renamed from: c */
    public static final C8160a f36562c = new C8160a(null);

    /* renamed from: d */
    public static final String[] f36563d = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: e */
    public static final String[] f36564e = new String[0];

    /* renamed from: b */
    public final SQLiteDatabase f36565b;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\t"}, m28432d2 = {"LTy1$a;", "", "", "", "CONFLICT_VALUES", "[Ljava/lang/String;", "EMPTY_STRING_ARRAY", "<init>", "()V", "sqlite-framework_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Ty1$a */
    /* loaded from: classes.dex */
    public static final class C8160a {
        public /* synthetic */ C8160a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C8160a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Landroid/database/sqlite/SQLiteDatabase;", "<anonymous parameter 0>", "Landroid/database/sqlite/SQLiteCursorDriver;", "masterQuery", "", "editTable", "Landroid/database/sqlite/SQLiteQuery;", "sqLiteQuery", "Landroid/database/sqlite/SQLiteCursor;", C17296a.f69688o, "(Landroid/database/sqlite/SQLiteDatabase;Landroid/database/sqlite/SQLiteCursorDriver;Ljava/lang/String;Landroid/database/sqlite/SQLiteQuery;)Landroid/database/sqlite/SQLiteCursor;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: Ty1$b */
    /* loaded from: classes.dex */
    public static final class C8161b extends Lambda implements Function4<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC46903pV5 f36566g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8161b(InterfaceC46903pV5 interfaceC46903pV5) {
            super(4);
            this.f36566g = interfaceC46903pV5;
        }

        @Override // kotlin.jvm.functions.Function4
        /* renamed from: a */
        public final SQLiteCursor invoke(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            InterfaceC46903pV5 interfaceC46903pV5 = this.f36566g;
            Intrinsics.checkNotNull(sQLiteQuery);
            interfaceC46903pV5.mo19173b(new C37212Xy1(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public C36276Ty1(SQLiteDatabase delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f36565b = delegate;
    }

    /* renamed from: d */
    public static final Cursor m82211d(Function4 tmp0, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Cursor) tmp0.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* renamed from: f */
    public static final Cursor m82210f(InterfaceC46903pV5 query, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.checkNotNullParameter(query, "$query");
        Intrinsics.checkNotNull(sQLiteQuery);
        query.mo19173b(new C37212Xy1(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // p000.InterfaceC45124mV5
    /* renamed from: C1 */
    public Cursor mo25499C1(InterfaceC46903pV5 query) {
        Intrinsics.checkNotNullParameter(query, "query");
        final C8161b c8161b = new C8161b(query);
        Cursor rawQueryWithFactory = this.f36565b.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: Sy1
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                Cursor m82211d;
                m82211d = C36276Ty1.m82211d(Function4.this, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                return m82211d;
            }
        }, query.mo19174a(), f36564e, null);
        Intrinsics.checkNotNullExpressionValue(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    @Override // p000.InterfaceC45124mV5
    /* renamed from: C2 */
    public void mo25498C2(int i) {
        this.f36565b.setVersion(i);
    }

    @Override // p000.InterfaceC45124mV5
    /* renamed from: G1 */
    public void mo25497G1(String sql) throws SQLException {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.f36565b.execSQL(sql);
    }

    @Override // p000.InterfaceC45124mV5
    /* renamed from: J */
    public List<Pair<String, String>> mo25496J() {
        return this.f36565b.getAttachedDbs();
    }

    @Override // p000.InterfaceC45124mV5
    /* renamed from: J2 */
    public InterfaceC47496qV5 mo25495J2(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        SQLiteStatement compileStatement = this.f36565b.compileStatement(sql);
        Intrinsics.checkNotNullExpressionValue(compileStatement, "delegate.compileStatement(sql)");
        return new C37446Yy1(compileStatement);
    }

    @Override // p000.InterfaceC45124mV5
    /* renamed from: T2 */
    public int mo25494T2(String table, int i, ContentValues values, String str, Object[] objArr) {
        boolean z;
        int length;
        String str2;
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        int i2 = 0;
        if (values.size() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int size = values.size();
            if (objArr == null) {
                length = size;
            } else {
                length = objArr.length + size;
            }
            Object[] objArr2 = new Object[length];
            StringBuilder sb = new StringBuilder();
            sb.append("UPDATE ");
            sb.append(f36563d[i]);
            sb.append(table);
            sb.append(" SET ");
            for (String str3 : values.keySet()) {
                if (i2 > 0) {
                    str2 = ",";
                } else {
                    str2 = "";
                }
                sb.append(str2);
                sb.append(str3);
                objArr2[i2] = values.get(str3);
                sb.append("=?");
                i2++;
            }
            if (objArr != null) {
                for (int i3 = size; i3 < length; i3++) {
                    objArr2[i3] = objArr[i3 - size];
                }
            }
            if (!TextUtils.isEmpty(str)) {
                sb.append(" WHERE ");
                sb.append(str);
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            InterfaceC47496qV5 mo25495J2 = mo25495J2(sb2);
            UA5.f36930d.m81894b(mo25495J2, objArr2);
            return mo25495J2.mo17482M();
        }
        throw new IllegalArgumentException("Empty values".toString());
    }

    @Override // p000.InterfaceC45124mV5
    /* renamed from: U0 */
    public Cursor mo25493U0(final InterfaceC46903pV5 query, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        SQLiteDatabase sQLiteDatabase = this.f36565b;
        String mo19174a = query.mo19174a();
        String[] strArr = f36564e;
        Intrinsics.checkNotNull(cancellationSignal);
        return C40973fV5.m41266e(sQLiteDatabase, mo19174a, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: Ry1
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                Cursor m82210f;
                m82210f = C36276Ty1.m82210f(InterfaceC46903pV5.this, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
                return m82210f;
            }
        });
    }

    @Override // p000.InterfaceC45124mV5
    /* renamed from: W1 */
    public void mo25492W1() {
        this.f36565b.setTransactionSuccessful();
    }

    @Override // p000.InterfaceC45124mV5
    /* renamed from: X1 */
    public void mo25491X1(String sql, Object[] bindArgs) throws SQLException {
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        this.f36565b.execSQL(sql, bindArgs);
    }

    @Override // p000.InterfaceC45124mV5
    /* renamed from: Y */
    public void mo25490Y() {
        this.f36565b.beginTransactionNonExclusive();
    }

    /* renamed from: c */
    public final boolean m82212c(SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        return Intrinsics.areEqual(this.f36565b, sqLiteDatabase);
    }

    @Override // p000.InterfaceC45124mV5
    /* renamed from: c3 */
    public Cursor mo25489c3(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return mo25499C1(new UA5(query));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f36565b.close();
    }

    @Override // p000.InterfaceC45124mV5
    /* renamed from: d2 */
    public void mo25488d2() {
        this.f36565b.endTransaction();
    }

    @Override // p000.InterfaceC45124mV5
    public String getPath() {
        return this.f36565b.getPath();
    }

    @Override // p000.InterfaceC45124mV5
    public boolean isOpen() {
        return this.f36565b.isOpen();
    }

    @Override // p000.InterfaceC45124mV5
    /* renamed from: j3 */
    public boolean mo25487j3() {
        return this.f36565b.inTransaction();
    }

    @Override // p000.InterfaceC45124mV5
    /* renamed from: r3 */
    public boolean mo25486r3() {
        return C40973fV5.m41267d(this.f36565b);
    }

    @Override // p000.InterfaceC45124mV5
    /* renamed from: w */
    public void mo25485w() {
        this.f36565b.beginTransaction();
    }
}
