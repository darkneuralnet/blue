package p000;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.io.File;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C36510Uy1;
import p000.InterfaceC45717nV5;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 (2\u00020\u0001:\u0003/\b\fB7\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014R\u0016\u0010!\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$R\u001b\u0010,\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b(\u0010)*\u0004\b*\u0010+¨\u00060"}, m28432d2 = {"LUy1;", "LnV5;", "", "enabled", "", "setWriteAheadLoggingEnabled", "close", "Landroid/content/Context;", "b", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "c", "Ljava/lang/String;", "name", "LnV5$a;", DateTokenConverter.CONVERTER_KEY, "LnV5$a;", "callback", "e", "Z", "useNoBackupDirectory", "f", "allowDataLossOnRecovery", "Lkotlin/Lazy;", "LUy1$c;", "g", "Lkotlin/Lazy;", "lazyDelegate", "h", "writeAheadLoggingEnabled", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "LmV5;", "d1", "()LmV5;", "writableDatabase", "V2", "readableDatabase", "i", "()LUy1$c;", "getDelegate$delegate", "(LUy1;)Ljava/lang/Object;", "delegate", "<init>", "(Landroid/content/Context;Ljava/lang/String;LnV5$a;ZZ)V", C17296a.f69688o, "sqlite-framework_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Uy1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36510Uy1 implements InterfaceC45717nV5 {

    /* renamed from: i */
    public static final C8514a f38336i = new C8514a(null);

    /* renamed from: b */
    public final Context f38337b;

    /* renamed from: c */
    public final String f38338c;

    /* renamed from: d */
    public final InterfaceC45717nV5.AbstractC26531a f38339d;

    /* renamed from: e */
    public final boolean f38340e;

    /* renamed from: f */
    public final boolean f38341f;

    /* renamed from: g */
    public final Lazy<C8516c> f38342g;

    /* renamed from: h */
    public boolean f38343h;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LUy1$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "sqlite-framework_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Uy1$a */
    /* loaded from: classes.dex */
    public static final class C8514a {
        public /* synthetic */ C8514a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C8514a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\u0007R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"LUy1$b;", "", "LTy1;", C17296a.f69688o, "LTy1;", "()LTy1;", "b", "(LTy1;)V", "db", "<init>", "sqlite-framework_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Uy1$b */
    /* loaded from: classes.dex */
    public static final class C8515b {

        /* renamed from: a */
        public C36276Ty1 f38344a;

        public C8515b(C36276Ty1 c36276Ty1) {
            this.f38344a = c36276Ty1;
        }

        /* renamed from: a */
        public final C36276Ty1 m80571a() {
            return this.f38344a;
        }

        /* renamed from: b */
        public final void m80570b(C36276Ty1 c36276Ty1) {
            this.f38344a = c36276Ty1;
        }
    }

    @Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u0000 62\u00020\u0001:\u00037\u0018\u0005B1\u0012\u0006\u0010\u001c\u001a\u00020\u0017\u0012\b\u00103\u001a\u0004\u0018\u000102\u0012\u0006\u0010!\u001a\u00020\u001d\u0012\u0006\u0010&\u001a\u00020\"\u0012\u0006\u0010+\u001a\u00020\u0002¢\u0006\u0004\b4\u00105J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J \u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010!\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010&\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010+\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010(R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010.R\u0016\u00101\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010(¨\u00068"}, m28432d2 = {"LUy1$c;", "Landroid/database/sqlite/SQLiteOpenHelper;", "", "writable", "LmV5;", "c", "Landroid/database/sqlite/SQLiteDatabase;", "sqLiteDatabase", "LTy1;", DateTokenConverter.CONVERTER_KEY, "", "onCreate", "", "oldVersion", "newVersion", "onUpgrade", "db", "onConfigure", "onDowngrade", "onOpen", "close", "g", "f", "Landroid/content/Context;", "b", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LUy1$b;", "LUy1$b;", "getDbRef", "()LUy1$b;", "dbRef", "LnV5$a;", "LnV5$a;", "getCallback", "()LnV5$a;", "callback", "e", "Z", "getAllowDataLossOnRecovery", "()Z", "allowDataLossOnRecovery", "migrated", "LO64;", "LO64;", "lock", "h", "opened", "", "name", "<init>", "(Landroid/content/Context;Ljava/lang/String;LUy1$b;LnV5$a;Z)V", "i", C17296a.f69688o, "sqlite-framework_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Uy1$c */
    /* loaded from: classes.dex */
    public static final class C8516c extends SQLiteOpenHelper {

        /* renamed from: i */
        public static final C8519c f38345i = new C8519c(null);

        /* renamed from: b */
        public final Context f38346b;

        /* renamed from: c */
        public final C8515b f38347c;

        /* renamed from: d */
        public final InterfaceC45717nV5.AbstractC26531a f38348d;

        /* renamed from: e */
        public final boolean f38349e;

        /* renamed from: f */
        public boolean f38350f;

        /* renamed from: g */
        public final O64 f38351g;

        /* renamed from: h */
        public boolean f38352h;

        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\b\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"LUy1$c$a;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "LUy1$c$b;", "b", "LUy1$c$b;", C17296a.f69688o, "()LUy1$c$b;", "callbackName", "", "c", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "cause", "<init>", "(LUy1$c$b;Ljava/lang/Throwable;)V", "sqlite-framework_release"}, m28431k = 1, m28430mv = {1, 7, 1})
        /* renamed from: Uy1$c$a */
        /* loaded from: classes.dex */
        public static final class C8517a extends RuntimeException {

            /* renamed from: b */
            public final EnumC8518b f38353b;

            /* renamed from: c */
            public final Throwable f38354c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8517a(EnumC8518b callbackName, Throwable cause) {
                super(cause);
                Intrinsics.checkNotNullParameter(callbackName, "callbackName");
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.f38353b = callbackName;
                this.f38354c = cause;
            }

            /* renamed from: a */
            public final EnumC8518b m80563a() {
                return this.f38353b;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.f38354c;
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m28432d2 = {"LUy1$c$b;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "sqlite-framework_release"}, m28431k = 1, m28430mv = {1, 7, 1})
        /* renamed from: Uy1$c$b */
        /* loaded from: classes.dex */
        public enum EnumC8518b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, m28432d2 = {"LUy1$c$c;", "", "LUy1$b;", "refHolder", "Landroid/database/sqlite/SQLiteDatabase;", "sqLiteDatabase", "LTy1;", C17296a.f69688o, "<init>", "()V", "sqlite-framework_release"}, m28431k = 1, m28430mv = {1, 7, 1})
        /* renamed from: Uy1$c$c */
        /* loaded from: classes.dex */
        public static final class C8519c {
            public /* synthetic */ C8519c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C36276Ty1 m80561a(C8515b refHolder, SQLiteDatabase sqLiteDatabase) {
                Intrinsics.checkNotNullParameter(refHolder, "refHolder");
                Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
                C36276Ty1 m80571a = refHolder.m80571a();
                if (m80571a == null || !m80571a.m82212c(sqLiteDatabase)) {
                    C36276Ty1 c36276Ty1 = new C36276Ty1(sqLiteDatabase);
                    refHolder.m80570b(c36276Ty1);
                    return c36276Ty1;
                }
                return m80571a;
            }

            private C8519c() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* renamed from: Uy1$c$d */
        /* loaded from: classes.dex */
        public /* synthetic */ class C8520d {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC8518b.values().length];
                try {
                    iArr[EnumC8518b.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC8518b.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC8518b.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC8518b.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC8518b.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8516c(Context context, String str, final C8515b dbRef, final InterfaceC45717nV5.AbstractC26531a callback, boolean z) {
            super(context, str, null, callback.f100064a, new DatabaseErrorHandler() { // from class: Vy1
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    C36510Uy1.C8516c.m80568b(InterfaceC45717nV5.AbstractC26531a.this, dbRef, sQLiteDatabase);
                }
            });
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dbRef, "dbRef");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f38346b = context;
            this.f38347c = dbRef;
            this.f38348d = callback;
            this.f38349e = z;
            if (str == null) {
                str = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
            }
            this.f38351g = new O64(str, context.getCacheDir(), false);
        }

        /* renamed from: b */
        public static final void m80568b(InterfaceC45717nV5.AbstractC26531a callback, C8515b dbRef, SQLiteDatabase dbObj) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(dbRef, "$dbRef");
            C8519c c8519c = f38345i;
            Intrinsics.checkNotNullExpressionValue(dbObj, "dbObj");
            callback.m23593c(c8519c.m80561a(dbRef, dbObj));
        }

        /* renamed from: c */
        public final InterfaceC45124mV5 m80567c(boolean z) {
            boolean z2;
            try {
                O64 o64 = this.f38351g;
                if (!this.f38352h && getDatabaseName() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                o64.m92909b(z2);
                this.f38350f = false;
                SQLiteDatabase m80564g = m80564g(z);
                if (this.f38350f) {
                    close();
                    return m80567c(z);
                }
                return m80566d(m80564g);
            } finally {
                this.f38351g.m92907d();
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                O64.m92908c(this.f38351g, false, 1, null);
                super.close();
                this.f38347c.m80570b(null);
                this.f38352h = false;
            } finally {
                this.f38351g.m92907d();
            }
        }

        /* renamed from: d */
        public final C36276Ty1 m80566d(SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            return f38345i.m80561a(this.f38347c, sqLiteDatabase);
        }

        /* renamed from: f */
        public final SQLiteDatabase m80565f(boolean z) {
            if (z) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                Intrinsics.checkNotNullExpressionValue(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            Intrinsics.checkNotNullExpressionValue(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        /* renamed from: g */
        public final SQLiteDatabase m80564g(boolean z) {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z2 = this.f38352h;
            if (databaseName != null && !z2 && (parentFile = this.f38346b.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return m80565f(z);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return m80565f(z);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof C8517a) {
                        C8517a c8517a = th;
                        Throwable cause = c8517a.getCause();
                        int i = C8520d.$EnumSwitchMapping$0[c8517a.m80563a().ordinal()];
                        if (i != 1 && i != 2 && i != 3 && i != 4) {
                            if (!(cause instanceof SQLiteException)) {
                                throw cause;
                            }
                        } else {
                            throw cause;
                        }
                    } else if (th instanceof SQLiteException) {
                        if (databaseName == null || !this.f38349e) {
                            throw th;
                        }
                    } else {
                        throw th;
                    }
                    this.f38346b.deleteDatabase(databaseName);
                    try {
                        return m80565f(z);
                    } catch (C8517a e) {
                        throw e.getCause();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            if (!this.f38350f && this.f38348d.f100064a != db.getVersion()) {
                db.setMaxSqlCacheSize(1);
            }
            try {
                this.f38348d.mo23594b(m80566d(db));
            } catch (Throwable th) {
                throw new C8517a(EnumC8518b.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.f38348d.mo6494d(m80566d(sqLiteDatabase));
            } catch (Throwable th) {
                throw new C8517a(EnumC8518b.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase db, int i, int i2) {
            Intrinsics.checkNotNullParameter(db, "db");
            this.f38350f = true;
            try {
                this.f38348d.mo23592e(m80566d(db), i, i2);
            } catch (Throwable th) {
                throw new C8517a(EnumC8518b.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            if (!this.f38350f) {
                try {
                    this.f38348d.mo6493f(m80566d(db));
                } catch (Throwable th) {
                    throw new C8517a(EnumC8518b.ON_OPEN, th);
                }
            }
            this.f38352h = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i2) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            this.f38350f = true;
            try {
                this.f38348d.mo6492g(m80566d(sqLiteDatabase), i, i2);
            } catch (Throwable th) {
                throw new C8517a(EnumC8518b.ON_UPGRADE, th);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LUy1$c;", "b", "()LUy1$c;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: Uy1$d */
    /* loaded from: classes.dex */
    public static final class C8521d extends Lambda implements Function0<C8516c> {
        public C8521d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C8516c invoke() {
            C8516c c8516c;
            if (C36510Uy1.this.f38338c != null && C36510Uy1.this.f38340e) {
                c8516c = new C8516c(C36510Uy1.this.f38337b, new File(C42159hV5.m36325a(C36510Uy1.this.f38337b), C36510Uy1.this.f38338c).getAbsolutePath(), new C8515b(null), C36510Uy1.this.f38339d, C36510Uy1.this.f38341f);
            } else {
                c8516c = new C8516c(C36510Uy1.this.f38337b, C36510Uy1.this.f38338c, new C8515b(null), C36510Uy1.this.f38339d, C36510Uy1.this.f38341f);
            }
            C40973fV5.m41265f(c8516c, C36510Uy1.this.f38343h);
            return c8516c;
        }
    }

    @JvmOverloads
    public C36510Uy1(Context context, String str, InterfaceC45717nV5.AbstractC26531a callback, boolean z, boolean z2) {
        Lazy<C8516c> lazy;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f38337b = context;
        this.f38338c = str;
        this.f38339d = callback;
        this.f38340e = z;
        this.f38341f = z2;
        lazy = LazyKt__LazyJVMKt.lazy(new C8521d());
        this.f38342g = lazy;
    }

    @Override // p000.InterfaceC45717nV5
    /* renamed from: V2 */
    public InterfaceC45124mV5 mo6501V2() {
        return m80572i().m80567c(false);
    }

    @Override // p000.InterfaceC45717nV5, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f38342g.isInitialized()) {
            m80572i().close();
        }
    }

    @Override // p000.InterfaceC45717nV5
    /* renamed from: d1 */
    public InterfaceC45124mV5 mo6496d1() {
        return m80572i().m80567c(true);
    }

    @Override // p000.InterfaceC45717nV5
    public String getDatabaseName() {
        return this.f38338c;
    }

    /* renamed from: i */
    public final C8516c m80572i() {
        return this.f38342g.getValue();
    }

    @Override // p000.InterfaceC45717nV5
    public void setWriteAheadLoggingEnabled(boolean z) {
        if (this.f38342g.isInitialized()) {
            C40973fV5.m41265f(m80572i(), z);
        }
        this.f38343h = z;
    }
}
