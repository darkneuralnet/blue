package p000;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\b\u0010\u0006\u001a\u00020\u0004H&R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, m28432d2 = {"LnV5;", "Ljava/io/Closeable;", "", "enabled", "", "setWriteAheadLoggingEnabled", "close", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "LmV5;", "d1", "()LmV5;", "writableDatabase", "V2", "readableDatabase", C17296a.f69688o, "b", "c", "sqlite_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: nV5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC45717nV5 extends Closeable {

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b&\u0018\u0000 \u00052\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R\u0014\u0010\u0012\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LnV5$a;", "", "LmV5;", "db", "", "b", DateTokenConverter.CONVERTER_KEY, "", "oldVersion", "newVersion", "g", "e", "f", "c", "", "fileName", C17296a.f69688o, "I", "version", "<init>", "(I)V", "sqlite_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: nV5$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC26531a {

        /* renamed from: b */
        public static final C26532a f100063b = new C26532a(null);
        @JvmField

        /* renamed from: a */
        public final int f100064a;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LnV5$a$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "sqlite_release"}, m28431k = 1, m28430mv = {1, 7, 1})
        /* renamed from: nV5$a$a */
        /* loaded from: classes.dex */
        public static final class C26532a {
            public /* synthetic */ C26532a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C26532a() {
            }
        }

        public AbstractC26531a(int i) {
            this.f100064a = i;
        }

        /* renamed from: a */
        public final void m23595a(String str) {
            boolean equals;
            int i;
            boolean z;
            boolean z2 = true;
            equals = StringsKt__StringsJVMKt.equals(str, ":memory:", true);
            if (!equals) {
                int length = str.length() - 1;
                int i2 = 0;
                boolean z3 = false;
                while (i2 <= length) {
                    if (!z3) {
                        i = i2;
                    } else {
                        i = length;
                    }
                    if (Intrinsics.compare((int) str.charAt(i), 32) <= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z3) {
                        if (!z) {
                            z3 = true;
                        } else {
                            i2++;
                        }
                    } else if (!z) {
                        break;
                    } else {
                        length--;
                    }
                }
                if (str.subSequence(i2, length + 1).toString().length() != 0) {
                    z2 = false;
                }
                if (!z2) {
                    Log.w("SupportSQLite", "deleting the database file: " + str);
                    try {
                        C40973fV5.m41268c(new File(str));
                    } catch (Exception e) {
                        Log.w("SupportSQLite", "delete failed: ", e);
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo23594b(InterfaceC45124mV5 db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        /* renamed from: c */
        public void m23593c(InterfaceC45124mV5 db) {
            Intrinsics.checkNotNullParameter(db, "db");
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + db + ".path");
            if (!db.isOpen()) {
                String path = db.getPath();
                if (path != null) {
                    m23595a(path);
                    return;
                }
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = db.mo25496J();
                } catch (SQLiteException unused) {
                }
                try {
                    db.close();
                } catch (IOException unused2) {
                }
            } finally {
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        Object obj = ((Pair) it.next()).second;
                        Intrinsics.checkNotNullExpressionValue(obj, "p.second");
                        m23595a((String) obj);
                    }
                } else {
                    String path2 = db.getPath();
                    if (path2 != null) {
                        m23595a(path2);
                    }
                }
            }
        }

        /* renamed from: d */
        public abstract void mo6494d(InterfaceC45124mV5 interfaceC45124mV5);

        /* renamed from: e */
        public void mo23592e(InterfaceC45124mV5 db, int i, int i2) {
            Intrinsics.checkNotNullParameter(db, "db");
            throw new SQLiteException("Can't downgrade database from version " + i + " to " + i2);
        }

        /* renamed from: f */
        public void mo6493f(InterfaceC45124mV5 db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        /* renamed from: g */
        public abstract void mo6492g(InterfaceC45124mV5 interfaceC45124mV5, int i, int i2);
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00162\u00020\u0001:\u0002\u0003\u0007B5\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0017"}, m28432d2 = {"LnV5$b;", "", "Landroid/content/Context;", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "b", "Ljava/lang/String;", "name", "LnV5$a;", "c", "LnV5$a;", "callback", "", DateTokenConverter.CONVERTER_KEY, "Z", "useNoBackupDirectory", "e", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;LnV5$a;ZZ)V", "f", "sqlite_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: nV5$b */
    /* loaded from: classes.dex */
    public static final class C26533b {

        /* renamed from: f */
        public static final C26535b f100065f = new C26535b(null);
        @JvmField

        /* renamed from: a */
        public final Context f100066a;
        @JvmField

        /* renamed from: b */
        public final String f100067b;
        @JvmField

        /* renamed from: c */
        public final AbstractC26531a f100068c;
        @JvmField

        /* renamed from: d */
        public final boolean f100069d;
        @JvmField

        /* renamed from: e */
        public final boolean f100070e;

        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\nH\u0016R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0014¨\u0006\u0017"}, m28432d2 = {"LnV5$b$a;", "", "LnV5$b;", "b", "", "name", DateTokenConverter.CONVERTER_KEY, "LnV5$a;", "callback", "c", "", "useNoBackupDirectory", "e", "allowDataLossOnRecovery", C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/lang/String;", "LnV5$a;", "Z", "<init>", "(Landroid/content/Context;)V", "sqlite_release"}, m28431k = 1, m28430mv = {1, 7, 1})
        /* renamed from: nV5$b$a */
        /* loaded from: classes.dex */
        public static class C26534a {

            /* renamed from: a */
            public final Context f100071a;

            /* renamed from: b */
            public String f100072b;

            /* renamed from: c */
            public AbstractC26531a f100073c;

            /* renamed from: d */
            public boolean f100074d;

            /* renamed from: e */
            public boolean f100075e;

            public C26534a(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                this.f100071a = context;
            }

            /* renamed from: a */
            public C26534a m23590a(boolean z) {
                this.f100075e = z;
                return this;
            }

            /* renamed from: b */
            public C26533b m23589b() {
                boolean z;
                AbstractC26531a abstractC26531a = this.f100073c;
                if (abstractC26531a != null) {
                    boolean z2 = true;
                    if (this.f100074d) {
                        String str = this.f100072b;
                        if (str != null && str.length() != 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        return new C26533b(this.f100071a, this.f100072b, abstractC26531a, this.f100074d, this.f100075e);
                    }
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.".toString());
            }

            /* renamed from: c */
            public C26534a m23588c(AbstractC26531a callback) {
                Intrinsics.checkNotNullParameter(callback, "callback");
                this.f100073c = callback;
                return this;
            }

            /* renamed from: d */
            public C26534a m23587d(String str) {
                this.f100072b = str;
                return this;
            }

            /* renamed from: e */
            public C26534a m23586e(boolean z) {
                this.f100074d = z;
                return this;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, m28432d2 = {"LnV5$b$b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LnV5$b$a;", C17296a.f69688o, "<init>", "()V", "sqlite_release"}, m28431k = 1, m28430mv = {1, 7, 1})
        /* renamed from: nV5$b$b */
        /* loaded from: classes.dex */
        public static final class C26535b {
            public /* synthetic */ C26535b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            /* renamed from: a */
            public final C26534a m23585a(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return new C26534a(context);
            }

            private C26535b() {
            }
        }

        public C26533b(Context context, String str, AbstractC26531a callback, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f100066a = context;
            this.f100067b = str;
            this.f100068c = callback;
            this.f100069d = z;
            this.f100070e = z2;
        }

        @JvmStatic
        /* renamed from: a */
        public static final C26534a m23591a(Context context) {
            return f100065f.m23585a(context);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m28432d2 = {"LnV5$c;", "", "LnV5$b;", "configuration", "LnV5;", C17296a.f69688o, "sqlite_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: nV5$c */
    /* loaded from: classes.dex */
    public interface InterfaceC26536c {
        /* renamed from: a */
        InterfaceC45717nV5 mo4888a(C26533b c26533b);
    }

    /* renamed from: V2 */
    InterfaceC45124mV5 mo6501V2();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    /* renamed from: d1 */
    InterfaceC45124mV5 mo6496d1();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z);
}
