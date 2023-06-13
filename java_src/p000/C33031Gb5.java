package p000;

import android.database.Cursor;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p053io.CloseableKt;
import p000.InterfaceC45717nV5;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0017\u0018\u0000 \n2\u00020\u0001:\u0003\u001d\u0005\u0011B'\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018¨\u0006\u001e"}, m28432d2 = {"LGb5;", "LnV5$a;", "LmV5;", "db", "", "b", DateTokenConverter.CONVERTER_KEY, "", "oldVersion", "newVersion", "g", "e", "f", "h", "j", "i", "LfT0;", "c", "LfT0;", "configuration", "LGb5$b;", "LGb5$b;", "delegate", "", "Ljava/lang/String;", "identityHash", "legacyHash", "<init>", "(LfT0;LGb5$b;Ljava/lang/String;Ljava/lang/String;)V", C17296a.f69688o, "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Gb5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C33031Gb5 extends InterfaceC45717nV5.AbstractC26531a {

    /* renamed from: g */
    public static final C2893a f12128g = new C2893a(null);

    /* renamed from: c */
    public C40950fT0 f12129c;

    /* renamed from: d */
    public final AbstractC2894b f12130d;

    /* renamed from: e */
    public final String f12131e;

    /* renamed from: f */
    public final String f12132f;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\n"}, m28432d2 = {"LGb5$a;", "", "LmV5;", "db", "", "b", "(LmV5;)Z", C17296a.f69688o, "<init>", "()V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Gb5$a */
    /* loaded from: classes.dex */
    public static final class C2893a {
        public /* synthetic */ C2893a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean m104985a(InterfaceC45124mV5 db) {
            Intrinsics.checkNotNullParameter(db, "db");
            Cursor mo25489c3 = db.mo25489c3("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z = false;
                if (mo25489c3.moveToFirst()) {
                    if (mo25489c3.getInt(0) == 0) {
                        z = true;
                    }
                }
                CloseableKt.closeFinally(mo25489c3, null);
                return z;
            } finally {
            }
        }

        /* renamed from: b */
        public final boolean m104984b(InterfaceC45124mV5 db) {
            Intrinsics.checkNotNullParameter(db, "db");
            Cursor mo25489c3 = db.mo25489c3("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                boolean z = false;
                if (mo25489c3.moveToFirst()) {
                    if (mo25489c3.getInt(0) != 0) {
                        z = true;
                    }
                }
                CloseableKt.closeFinally(mo25489c3, null);
                return z;
            } finally {
            }
        }

        private C2893a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"LGb5$b;", "", "LmV5;", "database", "", "b", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "c", "db", "LGb5$c;", "g", "f", "e", "", "I", "version", "<init>", "(I)V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Gb5$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2894b {
        @JvmField

        /* renamed from: a */
        public final int f12133a;

        public AbstractC2894b(int i) {
            this.f12133a = i;
        }

        /* renamed from: a */
        public abstract void mo52992a(InterfaceC45124mV5 interfaceC45124mV5);

        /* renamed from: b */
        public abstract void mo52991b(InterfaceC45124mV5 interfaceC45124mV5);

        /* renamed from: c */
        public abstract void mo52990c(InterfaceC45124mV5 interfaceC45124mV5);

        /* renamed from: d */
        public abstract void mo52989d(InterfaceC45124mV5 interfaceC45124mV5);

        /* renamed from: e */
        public abstract void mo52988e(InterfaceC45124mV5 interfaceC45124mV5);

        /* renamed from: f */
        public abstract void mo52987f(InterfaceC45124mV5 interfaceC45124mV5);

        /* renamed from: g */
        public abstract C2895c mo52986g(InterfaceC45124mV5 interfaceC45124mV5);
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, m28432d2 = {"LGb5$c;", "", "", C17296a.f69688o, "Z", "isValid", "", "b", "Ljava/lang/String;", "expectedFoundMsg", "<init>", "(ZLjava/lang/String;)V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Gb5$c */
    /* loaded from: classes.dex */
    public static class C2895c {
        @JvmField

        /* renamed from: a */
        public final boolean f12134a;
        @JvmField

        /* renamed from: b */
        public final String f12135b;

        public C2895c(boolean z, String str) {
            this.f12134a = z;
            this.f12135b = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33031Gb5(C40950fT0 configuration, AbstractC2894b delegate, String identityHash, String legacyHash) {
        super(delegate.f12133a);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(identityHash, "identityHash");
        Intrinsics.checkNotNullParameter(legacyHash, "legacyHash");
        this.f12129c = configuration;
        this.f12130d = delegate;
        this.f12131e = identityHash;
        this.f12132f = legacyHash;
    }

    @Override // p000.InterfaceC45717nV5.AbstractC26531a
    /* renamed from: b */
    public void mo23594b(InterfaceC45124mV5 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        super.mo23594b(db);
    }

    @Override // p000.InterfaceC45717nV5.AbstractC26531a
    /* renamed from: d */
    public void mo6494d(InterfaceC45124mV5 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        boolean m104985a = f12128g.m104985a(db);
        this.f12130d.mo52992a(db);
        if (!m104985a) {
            C2895c mo52986g = this.f12130d.mo52986g(db);
            if (!mo52986g.f12134a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + mo52986g.f12135b);
            }
        }
        m104986j(db);
        this.f12130d.mo52990c(db);
    }

    @Override // p000.InterfaceC45717nV5.AbstractC26531a
    /* renamed from: e */
    public void mo23592e(InterfaceC45124mV5 db, int i, int i2) {
        Intrinsics.checkNotNullParameter(db, "db");
        mo6492g(db, i, i2);
    }

    @Override // p000.InterfaceC45717nV5.AbstractC26531a
    /* renamed from: f */
    public void mo6493f(InterfaceC45124mV5 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        super.mo6493f(db);
        m104988h(db);
        this.f12130d.mo52989d(db);
        this.f12129c = null;
    }

    @Override // p000.InterfaceC45717nV5.AbstractC26531a
    /* renamed from: g */
    public void mo6492g(InterfaceC45124mV5 db, int i, int i2) {
        List<AbstractC39165cU2> m108696d;
        C2895c mo52986g;
        Intrinsics.checkNotNullParameter(db, "db");
        C40950fT0 c40950fT0 = this.f12129c;
        boolean z = false;
        if (c40950fT0 != null && (m108696d = c40950fT0.f80173d.m108696d(i, i2)) != null) {
            this.f12130d.mo52987f(db);
            for (AbstractC39165cU2 abstractC39165cU2 : m108696d) {
                abstractC39165cU2.mo202a(db);
            }
            if (this.f12130d.mo52986g(db).f12134a) {
                this.f12130d.mo52988e(db);
                m104986j(db);
                z = true;
            } else {
                throw new IllegalStateException("Migration didn't properly handle: " + mo52986g.f12135b);
            }
        }
        if (!z) {
            C40950fT0 c40950fT02 = this.f12129c;
            if (c40950fT02 != null && !c40950fT02.m41304a(i, i2)) {
                this.f12130d.mo52991b(db);
                this.f12130d.mo52992a(db);
                return;
            }
            throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
    }

    /* renamed from: h */
    public final void m104988h(InterfaceC45124mV5 interfaceC45124mV5) {
        C2895c mo52986g;
        String str;
        if (f12128g.m104984b(interfaceC45124mV5)) {
            Cursor mo25499C1 = interfaceC45124mV5.mo25499C1(new UA5("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                if (mo25499C1.moveToFirst()) {
                    str = mo25499C1.getString(0);
                } else {
                    str = null;
                }
                CloseableKt.closeFinally(mo25499C1, null);
                if (!Intrinsics.areEqual(this.f12131e, str) && !Intrinsics.areEqual(this.f12132f, str)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.f12131e + ", found: " + str);
                }
                return;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(mo25499C1, th);
                    throw th2;
                }
            }
        }
        if (this.f12130d.mo52986g(interfaceC45124mV5).f12134a) {
            this.f12130d.mo52988e(interfaceC45124mV5);
            m104986j(interfaceC45124mV5);
            return;
        }
        throw new IllegalStateException("Pre-packaged database has an invalid schema: " + mo52986g.f12135b);
    }

    /* renamed from: i */
    public final void m104987i(InterfaceC45124mV5 interfaceC45124mV5) {
        interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    /* renamed from: j */
    public final void m104986j(InterfaceC45124mV5 interfaceC45124mV5) {
        m104987i(interfaceC45124mV5);
        interfaceC45124mV5.mo25497G1(C32797Fb5.m106916a(this.f12131e));
    }
}
