package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC32563Eb5;
import p000.InterfaceC45717nV5;
@Metadata(m28433d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001BÏ\u0001\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010'\u001a\u00020\"\u0012\b\u0010+\u001a\u0004\u0018\u00010(\u0012\u0006\u0010-\u001a\u00020\u0005\u0012\u0006\u0010/\u001a\u00020\u0005\u0012\u000e\u00103\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000100\u0012\b\u00105\u001a\u0004\u0018\u00010\n\u0012\b\u00109\u001a\u0004\u0018\u000106\u0012\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010:\u0012\b\u0010B\u001a\u0004\u0018\u00010?\u0012\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016\u0012\f\u0010G\u001a\b\u0012\u0004\u0012\u00020E0\u0016¢\u0006\u0004\bJ\u0010KJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010$R\u0016\u0010+\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010\u001cR\u0014\u0010/\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010\u001cR\u001c\u00103\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010\fR\u0016\u00109\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001c\u0010>\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010:8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010B\u001a\u0004\u0018\u00010?8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010\u0019R\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020E0\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010\u0019R\u0014\u0010I\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010\u001c¨\u0006L"}, m28432d2 = {"LfT0;", "", "", "fromVersion", "toVersion", "", C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "b", "Ljava/lang/String;", "name", "LnV5$c;", "c", "LnV5$c;", "sqliteOpenHelperFactory", "LEb5$e;", DateTokenConverter.CONVERTER_KEY, "LEb5$e;", "migrationContainer", "", "LEb5$b;", "e", "Ljava/util/List;", "callbacks", "f", "Z", "allowMainThreadQueries", "LEb5$d;", "g", "LEb5$d;", "journalMode", "Ljava/util/concurrent/Executor;", "h", "Ljava/util/concurrent/Executor;", "queryExecutor", "i", "transactionExecutor", "Landroid/content/Intent;", "j", "Landroid/content/Intent;", "multiInstanceInvalidationServiceIntent", "k", "requireMigration", "l", "allowDestructiveMigrationOnDowngrade", "", "m", "Ljava/util/Set;", "migrationNotRequiredFrom", "n", "copyFromAssetPath", "Ljava/io/File;", "o", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "p", "Ljava/util/concurrent/Callable;", "copyFromInputStream", "LEb5$f;", "q", "LEb5$f;", "prepackagedDatabaseCallback", "r", "typeConverters", "LTq;", "s", "autoMigrationSpecs", "t", "multiInstanceInvalidation", "<init>", "(Landroid/content/Context;Ljava/lang/String;LnV5$c;LEb5$e;Ljava/util/List;ZLEb5$d;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;LEb5$f;Ljava/util/List;Ljava/util/List;)V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: fT0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C40950fT0 {
    @JvmField

    /* renamed from: a */
    public final Context f80170a;
    @JvmField

    /* renamed from: b */
    public final String f80171b;
    @JvmField

    /* renamed from: c */
    public final InterfaceC45717nV5.InterfaceC26536c f80172c;
    @JvmField

    /* renamed from: d */
    public final AbstractC32563Eb5.C1902e f80173d;
    @JvmField

    /* renamed from: e */
    public final List<AbstractC32563Eb5.AbstractC1899b> f80174e;
    @JvmField

    /* renamed from: f */
    public final boolean f80175f;
    @JvmField

    /* renamed from: g */
    public final AbstractC32563Eb5.EnumC1901d f80176g;
    @JvmField

    /* renamed from: h */
    public final Executor f80177h;
    @JvmField

    /* renamed from: i */
    public final Executor f80178i;
    @JvmField

    /* renamed from: j */
    public final Intent f80179j;
    @JvmField

    /* renamed from: k */
    public final boolean f80180k;
    @JvmField

    /* renamed from: l */
    public final boolean f80181l;

    /* renamed from: m */
    public final Set<Integer> f80182m;
    @JvmField

    /* renamed from: n */
    public final String f80183n;
    @JvmField

    /* renamed from: o */
    public final File f80184o;
    @JvmField

    /* renamed from: p */
    public final Callable<InputStream> f80185p;
    @JvmField

    /* renamed from: q */
    public final AbstractC32563Eb5.AbstractC1903f f80186q;
    @JvmField

    /* renamed from: r */
    public final List<Object> f80187r;
    @JvmField

    /* renamed from: s */
    public final List<InterfaceC7937Tq> f80188s;
    @JvmField

    /* renamed from: t */
    public final boolean f80189t;

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"LambdaLast"})
    public C40950fT0(Context context, String str, InterfaceC45717nV5.InterfaceC26536c sqliteOpenHelperFactory, AbstractC32563Eb5.C1902e migrationContainer, List<? extends AbstractC32563Eb5.AbstractC1899b> list, boolean z, AbstractC32563Eb5.EnumC1901d journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z2, boolean z3, Set<Integer> set, String str2, File file, Callable<InputStream> callable, AbstractC32563Eb5.AbstractC1903f abstractC1903f, List<? extends Object> typeConverters, List<? extends InterfaceC7937Tq> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        this.f80170a = context;
        this.f80171b = str;
        this.f80172c = sqliteOpenHelperFactory;
        this.f80173d = migrationContainer;
        this.f80174e = list;
        this.f80175f = z;
        this.f80176g = journalMode;
        this.f80177h = queryExecutor;
        this.f80178i = transactionExecutor;
        this.f80179j = intent;
        this.f80180k = z2;
        this.f80181l = z3;
        this.f80182m = set;
        this.f80183n = str2;
        this.f80184o = file;
        this.f80185p = callable;
        this.f80186q = abstractC1903f;
        this.f80187r = typeConverters;
        this.f80188s = autoMigrationSpecs;
        this.f80189t = intent != null;
    }

    /* renamed from: a */
    public boolean m41304a(int i, int i2) {
        boolean z;
        Set<Integer> set;
        if (i > i2) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.f80181l) {
            return false;
        }
        if (this.f80180k && ((set = this.f80182m) == null || !set.contains(Integer.valueOf(i)))) {
            return true;
        }
        return false;
    }
}
