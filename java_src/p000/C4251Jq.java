package p000;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003!\b\u000eB\u0017\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010 J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\b\u0010\u0007\u001a\u00020\u0005H\u0016R\u001a\u0010\f\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001b¨\u0006\""}, m28432d2 = {"LJq;", "LnV5;", "LCZ0;", "", "enabled", "", "setWriteAheadLoggingEnabled", "close", "b", "LnV5;", "getDelegate", "()LnV5;", "delegate", "LIq;", "c", "LIq;", "autoCloser", "LJq$a;", DateTokenConverter.CONVERTER_KEY, "LJq$a;", "autoClosingDb", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "LmV5;", "d1", "()LmV5;", "writableDatabase", "V2", "readableDatabase", "<init>", "(LnV5;LIq;)V", C17296a.f69688o, "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Jq */
/* loaded from: classes.dex */
public final class C4251Jq implements InterfaceC45717nV5, CZ0 {

    /* renamed from: b */
    public final InterfaceC45717nV5 f18308b;
    @JvmField

    /* renamed from: c */
    public final C3770Iq f18309c;

    /* renamed from: d */
    public final C4252a f18310d;

    @Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010)\u001a\u00020&¢\u0006\u0004\b;\u0010<J\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0011H\u0016J\u001a\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0017JE\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u001e\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J)\u0010#\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0010\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d0\u001cH\u0016¢\u0006\u0004\b#\u0010$J\b\u0010%\u001a\u00020\u0002H\u0016R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R$\u0010*\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u00178V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0016\u00103\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00100R(\u0010:\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000407\u0018\u0001068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006="}, m28432d2 = {"LJq$a;", "LmV5;", "", C17296a.f69688o, "", "sql", "LqV5;", "J2", "w", "Y", "d2", "W1", "", "j3", "query", "Landroid/database/Cursor;", "c3", "LpV5;", "C1", "Landroid/os/CancellationSignal;", "cancellationSignal", "U0", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "whereClause", "", "", "whereArgs", "T2", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "G1", "bindArgs", "X1", "(Ljava/lang/String;[Ljava/lang/Object;)V", "close", "LIq;", "b", "LIq;", "autoCloser", "version", "getVersion", "()I", "C2", "(I)V", "isOpen", "()Z", "getPath", "()Ljava/lang/String;", "path", "r3", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "J", "()Ljava/util/List;", "attachedDbs", "<init>", "(LIq;)V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Jq$a */
    /* loaded from: classes.dex */
    public static final class C4252a implements InterfaceC45124mV5 {

        /* renamed from: b */
        public final C3770Iq f18311b;

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0005\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LmV5;", "obj", "", "Landroid/util/Pair;", "", C17296a.f69688o, "(LmV5;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: Jq$a$a */
        /* loaded from: classes.dex */
        public static final class C4253a extends Lambda implements Function1<InterfaceC45124mV5, List<? extends Pair<String, String>>> {

            /* renamed from: g */
            public static final C4253a f18312g = new C4253a();

            public C4253a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<Pair<String, String>> invoke(InterfaceC45124mV5 obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.mo25496J();
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LmV5;", "db", "", C17296a.f69688o, "(LmV5;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: Jq$a$b */
        /* loaded from: classes.dex */
        public static final class C4254b extends Lambda implements Function1<InterfaceC45124mV5, Object> {

            /* renamed from: g */
            public final /* synthetic */ String f18313g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4254b(String str) {
                super(1);
                this.f18313g = str;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Object invoke(InterfaceC45124mV5 db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.mo25497G1(this.f18313g);
                return null;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LmV5;", "db", "", C17296a.f69688o, "(LmV5;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: Jq$a$c */
        /* loaded from: classes.dex */
        public static final class C4255c extends Lambda implements Function1<InterfaceC45124mV5, Object> {

            /* renamed from: g */
            public final /* synthetic */ String f18314g;

            /* renamed from: h */
            public final /* synthetic */ Object[] f18315h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4255c(String str, Object[] objArr) {
                super(1);
                this.f18314g = str;
                this.f18315h = objArr;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Object invoke(InterfaceC45124mV5 db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.mo25491X1(this.f18314g, this.f18315h);
                return null;
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* renamed from: Jq$a$d */
        /* loaded from: classes.dex */
        public /* synthetic */ class C4256d extends FunctionReferenceImpl implements Function1<InterfaceC45124mV5, Boolean> {

            /* renamed from: b */
            public static final C4256d f18316b = new C4256d();

            public C4256d() {
                super(1, InterfaceC45124mV5.class, "inTransaction", "inTransaction()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(InterfaceC45124mV5 p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return Boolean.valueOf(p0.mo25487j3());
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LmV5;", "db", "", C17296a.f69688o, "(LmV5;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: Jq$a$e */
        /* loaded from: classes.dex */
        public static final class C4257e extends Lambda implements Function1<InterfaceC45124mV5, Boolean> {

            /* renamed from: g */
            public static final C4257e f18317g = new C4257e();

            public C4257e() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(InterfaceC45124mV5 db) {
                Intrinsics.checkNotNullParameter(db, "db");
                return Boolean.valueOf(db.mo25486r3());
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LmV5;", "obj", "", C17296a.f69688o, "(LmV5;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: Jq$a$f */
        /* loaded from: classes.dex */
        public static final class C4258f extends Lambda implements Function1<InterfaceC45124mV5, String> {

            /* renamed from: g */
            public static final C4258f f18318g = new C4258f();

            public C4258f() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final String invoke(InterfaceC45124mV5 obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.getPath();
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LmV5;", "it", "", C17296a.f69688o, "(LmV5;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: Jq$a$g */
        /* loaded from: classes.dex */
        public static final class C4259g extends Lambda implements Function1<InterfaceC45124mV5, Object> {

            /* renamed from: g */
            public static final C4259g f18319g = new C4259g();

            public C4259g() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Object invoke(InterfaceC45124mV5 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return null;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LmV5;", "db", "", C17296a.f69688o, "(LmV5;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: Jq$a$h */
        /* loaded from: classes.dex */
        public static final class C4260h extends Lambda implements Function1<InterfaceC45124mV5, Integer> {

            /* renamed from: g */
            public final /* synthetic */ String f18320g;

            /* renamed from: h */
            public final /* synthetic */ int f18321h;

            /* renamed from: i */
            public final /* synthetic */ ContentValues f18322i;

            /* renamed from: j */
            public final /* synthetic */ String f18323j;

            /* renamed from: k */
            public final /* synthetic */ Object[] f18324k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4260h(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
                super(1);
                this.f18320g = str;
                this.f18321h = i;
                this.f18322i = contentValues;
                this.f18323j = str2;
                this.f18324k = objArr;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Integer invoke(InterfaceC45124mV5 db) {
                Intrinsics.checkNotNullParameter(db, "db");
                return Integer.valueOf(db.mo25494T2(this.f18320g, this.f18321h, this.f18322i, this.f18323j, this.f18324k));
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LmV5;", "db", "", C17296a.f69688o, "(LmV5;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: Jq$a$i */
        /* loaded from: classes.dex */
        public static final class C4261i extends Lambda implements Function1<InterfaceC45124mV5, Object> {

            /* renamed from: g */
            public final /* synthetic */ int f18325g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4261i(int i) {
                super(1);
                this.f18325g = i;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Object invoke(InterfaceC45124mV5 db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.mo25498C2(this.f18325g);
                return null;
            }
        }

        public C4252a(C3770Iq autoCloser) {
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.f18311b = autoCloser;
        }

        @Override // p000.InterfaceC45124mV5
        /* renamed from: C1 */
        public Cursor mo25499C1(InterfaceC46903pV5 query) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new C4266c(this.f18311b.m101645j().mo25499C1(query), this.f18311b);
            } catch (Throwable th) {
                this.f18311b.m101650e();
                throw th;
            }
        }

        @Override // p000.InterfaceC45124mV5
        /* renamed from: C2 */
        public void mo25498C2(int i) {
            this.f18311b.m101648g(new C4261i(i));
        }

        @Override // p000.InterfaceC45124mV5
        /* renamed from: G1 */
        public void mo25497G1(String sql) throws SQLException {
            Intrinsics.checkNotNullParameter(sql, "sql");
            this.f18311b.m101648g(new C4254b(sql));
        }

        @Override // p000.InterfaceC45124mV5
        /* renamed from: J */
        public List<Pair<String, String>> mo25496J() {
            return (List) this.f18311b.m101648g(C4253a.f18312g);
        }

        @Override // p000.InterfaceC45124mV5
        /* renamed from: J2 */
        public InterfaceC47496qV5 mo25495J2(String sql) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            return new C4262b(sql, this.f18311b);
        }

        @Override // p000.InterfaceC45124mV5
        /* renamed from: T2 */
        public int mo25494T2(String table, int i, ContentValues values, String str, Object[] objArr) {
            Intrinsics.checkNotNullParameter(table, "table");
            Intrinsics.checkNotNullParameter(values, "values");
            return ((Number) this.f18311b.m101648g(new C4260h(table, i, values, str, objArr))).intValue();
        }

        @Override // p000.InterfaceC45124mV5
        /* renamed from: U0 */
        public Cursor mo25493U0(InterfaceC46903pV5 query, CancellationSignal cancellationSignal) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new C4266c(this.f18311b.m101645j().mo25493U0(query, cancellationSignal), this.f18311b);
            } catch (Throwable th) {
                this.f18311b.m101650e();
                throw th;
            }
        }

        @Override // p000.InterfaceC45124mV5
        /* renamed from: W1 */
        public void mo25492W1() {
            Unit unit;
            InterfaceC45124mV5 m101647h = this.f18311b.m101647h();
            if (m101647h != null) {
                m101647h.mo25492W1();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
            throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null".toString());
        }

        @Override // p000.InterfaceC45124mV5
        /* renamed from: X1 */
        public void mo25491X1(String sql, Object[] bindArgs) throws SQLException {
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
            this.f18311b.m101648g(new C4255c(sql, bindArgs));
        }

        @Override // p000.InterfaceC45124mV5
        /* renamed from: Y */
        public void mo25490Y() {
            try {
                this.f18311b.m101645j().mo25490Y();
            } catch (Throwable th) {
                this.f18311b.m101650e();
                throw th;
            }
        }

        /* renamed from: a */
        public final void m99644a() {
            this.f18311b.m101648g(C4259g.f18319g);
        }

        @Override // p000.InterfaceC45124mV5
        /* renamed from: c3 */
        public Cursor mo25489c3(String query) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new C4266c(this.f18311b.m101645j().mo25489c3(query), this.f18311b);
            } catch (Throwable th) {
                this.f18311b.m101650e();
                throw th;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f18311b.m101651d();
        }

        @Override // p000.InterfaceC45124mV5
        /* renamed from: d2 */
        public void mo25488d2() {
            if (this.f18311b.m101647h() != null) {
                try {
                    InterfaceC45124mV5 m101647h = this.f18311b.m101647h();
                    Intrinsics.checkNotNull(m101647h);
                    m101647h.mo25488d2();
                    return;
                } finally {
                    this.f18311b.m101650e();
                }
            }
            throw new IllegalStateException("End transaction called but delegateDb is null".toString());
        }

        @Override // p000.InterfaceC45124mV5
        public String getPath() {
            return (String) this.f18311b.m101648g(C4258f.f18318g);
        }

        @Override // p000.InterfaceC45124mV5
        public boolean isOpen() {
            InterfaceC45124mV5 m101647h = this.f18311b.m101647h();
            if (m101647h == null) {
                return false;
            }
            return m101647h.isOpen();
        }

        @Override // p000.InterfaceC45124mV5
        /* renamed from: j3 */
        public boolean mo25487j3() {
            if (this.f18311b.m101647h() == null) {
                return false;
            }
            return ((Boolean) this.f18311b.m101648g(C4256d.f18316b)).booleanValue();
        }

        @Override // p000.InterfaceC45124mV5
        /* renamed from: r3 */
        public boolean mo25486r3() {
            return ((Boolean) this.f18311b.m101648g(C4257e.f18317g)).booleanValue();
        }

        @Override // p000.InterfaceC45124mV5
        /* renamed from: w */
        public void mo25485w() {
            try {
                this.f18311b.m101645j().mo25485w();
            } catch (Throwable th) {
                this.f18311b.m101650e();
                throw th;
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u000e\u0012\u0006\u0010!\u001a\u00020\u001f¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\fH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000eH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0010H\u0016J)\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0001H\u0002J\u001a\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u001aH\u0002R\u0014\u0010\u001e\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010 R(\u0010%\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\"j\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a`#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010$¨\u0006("}, m28432d2 = {"LJq$b;", "LqV5;", "", "close", "", "M", "", "y2", "index", "m1", "value", "S0", "", "M1", "", "G0", "", "X0", "T", "Lkotlin/Function1;", "block", DateTokenConverter.CONVERTER_KEY, "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "supportSQLiteStatement", "c", "bindIndex", "", "f", "b", "Ljava/lang/String;", "sql", "LIq;", "LIq;", "autoCloser", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "binds", "<init>", "(Ljava/lang/String;LIq;)V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Jq$b */
    /* loaded from: classes.dex */
    public static final class C4262b implements InterfaceC47496qV5 {

        /* renamed from: b */
        public final String f18326b;

        /* renamed from: c */
        public final C3770Iq f18327c;

        /* renamed from: d */
        public final ArrayList<Object> f18328d;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LqV5;", "obj", "", C17296a.f69688o, "(LqV5;)Ljava/lang/Long;"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: Jq$b$a */
        /* loaded from: classes.dex */
        public static final class C4263a extends Lambda implements Function1<InterfaceC47496qV5, Long> {

            /* renamed from: g */
            public static final C4263a f18329g = new C4263a();

            public C4263a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Long invoke(InterfaceC47496qV5 obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return Long.valueOf(obj.mo17481y2());
            }
        }

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "LmV5;", "db", C17296a.f69688o, "(LmV5;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: Jq$b$b */
        /* loaded from: classes.dex */
        public static final class C4264b extends Lambda implements Function1<InterfaceC45124mV5, T> {

            /* renamed from: h */
            public final /* synthetic */ Function1<InterfaceC47496qV5, T> f18331h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C4264b(Function1<? super InterfaceC47496qV5, ? extends T> function1) {
                super(1);
                this.f18331h = function1;
            }

            /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final T invoke(InterfaceC45124mV5 db) {
                Intrinsics.checkNotNullParameter(db, "db");
                InterfaceC47496qV5 mo25495J2 = db.mo25495J2(C4262b.this.f18326b);
                C4262b.this.m99632c(mo25495J2);
                return this.f18331h.invoke(mo25495J2);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LqV5;", "obj", "", C17296a.f69688o, "(LqV5;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: Jq$b$c */
        /* loaded from: classes.dex */
        public static final class C4265c extends Lambda implements Function1<InterfaceC47496qV5, Integer> {

            /* renamed from: g */
            public static final C4265c f18332g = new C4265c();

            public C4265c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Integer invoke(InterfaceC47496qV5 obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return Integer.valueOf(obj.mo17482M());
            }
        }

        public C4262b(String sql, C3770Iq autoCloser) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.f18326b = sql;
            this.f18327c = autoCloser;
            this.f18328d = new ArrayList<>();
        }

        @Override // p000.InterfaceC46310oV5
        /* renamed from: G0 */
        public void mo20958G0(int i, String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            m99630f(i, value);
        }

        @Override // p000.InterfaceC47496qV5
        /* renamed from: M */
        public int mo17482M() {
            return ((Number) m99631d(C4265c.f18332g)).intValue();
        }

        @Override // p000.InterfaceC46310oV5
        /* renamed from: M1 */
        public void mo20957M1(int i, double d) {
            m99630f(i, Double.valueOf(d));
        }

        @Override // p000.InterfaceC46310oV5
        /* renamed from: S0 */
        public void mo20956S0(int i, long j) {
            m99630f(i, Long.valueOf(j));
        }

        @Override // p000.InterfaceC46310oV5
        /* renamed from: X0 */
        public void mo20955X0(int i, byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            m99630f(i, value);
        }

        /* renamed from: c */
        public final void m99632c(InterfaceC47496qV5 interfaceC47496qV5) {
            Iterator<T> it = this.f18328d.iterator();
            int i = 0;
            while (it.hasNext()) {
                it.next();
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                Object obj = this.f18328d.get(i);
                if (obj == null) {
                    interfaceC47496qV5.mo20954m1(i2);
                } else if (obj instanceof Long) {
                    interfaceC47496qV5.mo20956S0(i2, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    interfaceC47496qV5.mo20957M1(i2, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    interfaceC47496qV5.mo20958G0(i2, (String) obj);
                } else if (obj instanceof byte[]) {
                    interfaceC47496qV5.mo20955X0(i2, (byte[]) obj);
                }
                i = i2;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        /* renamed from: d */
        public final <T> T m99631d(Function1<? super InterfaceC47496qV5, ? extends T> function1) {
            return (T) this.f18327c.m101648g(new C4264b(function1));
        }

        /* renamed from: f */
        public final void m99630f(int i, Object obj) {
            int size;
            int i2 = i - 1;
            if (i2 >= this.f18328d.size() && (size = this.f18328d.size()) <= i2) {
                while (true) {
                    this.f18328d.add(null);
                    if (size == i2) {
                        break;
                    }
                    size++;
                }
            }
            this.f18328d.set(i2, obj);
        }

        @Override // p000.InterfaceC46310oV5
        /* renamed from: m1 */
        public void mo20954m1(int i) {
            m99630f(i, null);
        }

        @Override // p000.InterfaceC47496qV5
        /* renamed from: y2 */
        public long mo17481y2() {
            return ((Number) m99631d(C4263a.f18329g)).longValue();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010G\u001a\u00020\u0001\u0012\u0006\u0010K\u001a\u00020H¢\u0006\u0004\bL\u0010MJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\u0096\u0001J\t\u0010\t\u001a\u00020\u0007H\u0097\u0001J\u0019\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\n0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\t\u0010\f\u001a\u00020\u0002H\u0096\u0001J\u0019\u0010\u000e\u001a\u00020\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\r0\rH\u0096\u0001J\u0019\u0010\u000f\u001a\u00020\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\r0\rH\u0096\u0001J\u0019\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\r0\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J6\u0010\u0012\u001a(\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\r0\r \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\r0\r\u0018\u00010\u00110\u0011H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0014\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010\u0018\u001a\n \u0005*\u0004\u0018\u00010\u00170\u0017H\u0096\u0001J\u0011\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\t\u0010\u001e\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0019\u0010!\u001a\n \u0005*\u0004\u0018\u00010\r0\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010\"\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\t\u0010$\u001a\u00020#H\u0096\u0001J\t\u0010%\u001a\u00020#H\u0096\u0001J\t\u0010&\u001a\u00020#H\u0096\u0001J\t\u0010'\u001a\u00020#H\u0096\u0001J\t\u0010(\u001a\u00020#H\u0096\u0001J\t\u0010)\u001a\u00020#H\u0096\u0001J\u0011\u0010*\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010+\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\t\u0010,\u001a\u00020#H\u0096\u0001J\t\u0010-\u001a\u00020#H\u0096\u0001J\t\u0010.\u001a\u00020#H\u0096\u0001J\u0011\u0010/\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\t\u00100\u001a\u00020#H\u0096\u0001J\u0019\u00102\u001a\u00020\u00072\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010101H\u0096\u0001J\u0019\u00104\u001a\u00020\u00072\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010303H\u0096\u0001J\t\u00105\u001a\u00020#H\u0097\u0001J!\u00106\u001a\n \u0005*\u0004\u0018\u00010\u00170\u00172\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00170\u0017H\u0096\u0001J)\u00109\u001a\u00020\u00072\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u000107072\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010808H\u0096\u0001J\u0019\u0010:\u001a\u00020\u00072\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010101H\u0096\u0001J\u0019\u0010;\u001a\u00020\u00072\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010303H\u0096\u0001J\b\u0010<\u001a\u00020\u0007H\u0016J\u001e\u0010@\u001a\u00020\u00072\u0006\u0010=\u001a\u0002072\f\u0010?\u001a\b\u0012\u0004\u0012\u0002080>H\u0017J\b\u0010A\u001a\u000208H\u0017J\u000e\u0010B\u001a\b\u0012\u0004\u0012\u0002080>H\u0017J\u0010\u0010D\u001a\u00020\u00072\u0006\u0010C\u001a\u00020\u0017H\u0017R\u0014\u0010G\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006N"}, m28432d2 = {"LJq$c;", "Landroid/database/Cursor;", "", "p0", "Landroid/database/CharArrayBuffer;", "kotlin.jvm.PlatformType", "p1", "", "copyStringToBuffer", "deactivate", "", "getBlob", "getColumnCount", "", "getColumnIndex", "getColumnIndexOrThrow", "getColumnName", "", "getColumnNames", "()[Ljava/lang/String;", "getCount", "", "getDouble", "Landroid/os/Bundle;", "getExtras", "", "getFloat", "getInt", "", "getLong", "getPosition", "", "getShort", "getString", "getType", "", "getWantsAllOnMoveCalls", "isAfterLast", "isBeforeFirst", "isClosed", "isFirst", "isLast", "isNull", "move", "moveToFirst", "moveToLast", "moveToNext", "moveToPosition", "moveToPrevious", "Landroid/database/ContentObserver;", "registerContentObserver", "Landroid/database/DataSetObserver;", "registerDataSetObserver", "requery", "respond", "Landroid/content/ContentResolver;", "Landroid/net/Uri;", "setNotificationUri", "unregisterContentObserver", "unregisterDataSetObserver", "close", "cr", "", "uris", "setNotificationUris", "getNotificationUri", "getNotificationUris", "extras", "setExtras", "b", "Landroid/database/Cursor;", "delegate", "LIq;", "c", "LIq;", "autoCloser", "<init>", "(Landroid/database/Cursor;LIq;)V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Jq$c */
    /* loaded from: classes.dex */
    public static final class C4266c implements Cursor {

        /* renamed from: b */
        public final Cursor f18333b;

        /* renamed from: c */
        public final C3770Iq f18334c;

        public C4266c(Cursor delegate, C3770Iq autoCloser) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.f18333b = delegate;
            this.f18334c = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f18333b.close();
            this.f18334c.m101650e();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
            this.f18333b.copyStringToBuffer(i, charArrayBuffer);
        }

        @Override // android.database.Cursor
        @Deprecated(message = "Deprecated in Java")
        public void deactivate() {
            this.f18333b.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i) {
            return this.f18333b.getBlob(i);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.f18333b.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.f18333b.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.f18333b.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i) {
            return this.f18333b.getColumnName(i);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.f18333b.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.f18333b.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i) {
            return this.f18333b.getDouble(i);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.f18333b.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i) {
            return this.f18333b.getFloat(i);
        }

        @Override // android.database.Cursor
        public int getInt(int i) {
            return this.f18333b.getInt(i);
        }

        @Override // android.database.Cursor
        public long getLong(int i) {
            return this.f18333b.getLong(i);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return C41566gV5.m39241a(this.f18333b);
        }

        @Override // android.database.Cursor
        public List<Uri> getNotificationUris() {
            return C44531lV5.m27203a(this.f18333b);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.f18333b.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i) {
            return this.f18333b.getShort(i);
        }

        @Override // android.database.Cursor
        public String getString(int i) {
            return this.f18333b.getString(i);
        }

        @Override // android.database.Cursor
        public int getType(int i) {
            return this.f18333b.getType(i);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.f18333b.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.f18333b.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.f18333b.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.f18333b.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.f18333b.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.f18333b.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i) {
            return this.f18333b.isNull(i);
        }

        @Override // android.database.Cursor
        public boolean move(int i) {
            return this.f18333b.move(i);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.f18333b.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.f18333b.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.f18333b.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i) {
            return this.f18333b.moveToPosition(i);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.f18333b.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.f18333b.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f18333b.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        @Deprecated(message = "Deprecated in Java")
        public boolean requery() {
            return this.f18333b.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.f18333b.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle extras) {
            Intrinsics.checkNotNullParameter(extras, "extras");
            C42752iV5.m33853a(this.f18333b, extras);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f18333b.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver cr, List<? extends Uri> uris) {
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(uris, "uris");
            C44531lV5.m27202b(this.f18333b, cr, uris);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f18333b.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f18333b.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public C4251Jq(InterfaceC45717nV5 delegate, C3770Iq autoCloser) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.f18308b = delegate;
        this.f18309c = autoCloser;
        autoCloser.m101644k(getDelegate());
        this.f18310d = new C4252a(autoCloser);
    }

    @Override // p000.InterfaceC45717nV5
    /* renamed from: V2 */
    public InterfaceC45124mV5 mo6501V2() {
        this.f18310d.m99644a();
        return this.f18310d;
    }

    @Override // p000.InterfaceC45717nV5, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f18310d.close();
    }

    @Override // p000.InterfaceC45717nV5
    /* renamed from: d1 */
    public InterfaceC45124mV5 mo6496d1() {
        this.f18310d.m99644a();
        return this.f18310d;
    }

    @Override // p000.InterfaceC45717nV5
    public String getDatabaseName() {
        return this.f18308b.getDatabaseName();
    }

    @Override // p000.CZ0
    public InterfaceC45717nV5 getDelegate() {
        return this.f18308b;
    }

    @Override // p000.InterfaceC45717nV5
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f18308b.setWriteAheadLoggingEnabled(z);
    }
}
