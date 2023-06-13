package p000;

import android.content.Context;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p053io.CloseableKt;
import kotlin.ranges.RangesKt___RangesKt;
import p000.AbstractC32563Eb5;
import p000.InterfaceC45717nV5;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b\u0012\u0006\u0010\"\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020\u0001¢\u0006\u0004\b6\u00107J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0017J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J\u0010\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\rH\u0002R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010!R\u001a\u0010'\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00102¨\u00068"}, m28432d2 = {"Lwg5;", "LnV5;", "LCZ0;", "", "enabled", "", "setWriteAheadLoggingEnabled", "close", "LfT0;", "databaseConfiguration", DateTokenConverter.CONVERTER_KEY, "writable", "f", "Ljava/io/File;", "destinationFile", C17296a.f69688o, "databaseFile", "c", "b", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Ljava/lang/String;", "copyFromAssetPath", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "e", "Ljava/util/concurrent/Callable;", "copyFromInputStream", "", "I", "databaseVersion", "g", "LnV5;", "getDelegate", "()LnV5;", "delegate", "h", "LfT0;", "i", "Z", "verified", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "LmV5;", "d1", "()LmV5;", "writableDatabase", "V2", "readableDatabase", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;ILnV5;)V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: wg5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51157wg5 implements InterfaceC45717nV5, CZ0 {

    /* renamed from: b */
    public final Context f116348b;

    /* renamed from: c */
    public final String f116349c;

    /* renamed from: d */
    public final File f116350d;

    /* renamed from: e */
    public final Callable<InputStream> f116351e;

    /* renamed from: f */
    public final int f116352f;

    /* renamed from: g */
    public final InterfaceC45717nV5 f116353g;

    /* renamed from: h */
    public C40950fT0 f116354h;

    /* renamed from: i */
    public boolean f116355i;

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, m28432d2 = {"wg5$a", "LnV5$a;", "LmV5;", "db", "", DateTokenConverter.CONVERTER_KEY, "", "oldVersion", "newVersion", "g", "f", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: wg5$a */
    /* loaded from: classes.dex */
    public static final class C29940a extends InterfaceC45717nV5.AbstractC26531a {

        /* renamed from: c */
        public final /* synthetic */ int f116356c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29940a(int i, int i2) {
            super(i2);
            this.f116356c = i;
        }

        @Override // p000.InterfaceC45717nV5.AbstractC26531a
        /* renamed from: d */
        public void mo6494d(InterfaceC45124mV5 db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        @Override // p000.InterfaceC45717nV5.AbstractC26531a
        /* renamed from: f */
        public void mo6493f(InterfaceC45124mV5 db) {
            Intrinsics.checkNotNullParameter(db, "db");
            int i = this.f116356c;
            if (i < 1) {
                db.mo25498C2(i);
            }
        }

        @Override // p000.InterfaceC45717nV5.AbstractC26531a
        /* renamed from: g */
        public void mo6492g(InterfaceC45124mV5 db, int i, int i2) {
            Intrinsics.checkNotNullParameter(db, "db");
        }
    }

    public C51157wg5(Context context, String str, File file, Callable<InputStream> callable, int i, InterfaceC45717nV5 delegate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f116348b = context;
        this.f116349c = str;
        this.f116350d = file;
        this.f116351e = callable;
        this.f116352f = i;
        this.f116353g = delegate;
    }

    @Override // p000.InterfaceC45717nV5
    /* renamed from: V2 */
    public InterfaceC45124mV5 mo6501V2() {
        if (!this.f116355i) {
            m6495f(false);
            this.f116355i = true;
        }
        return getDelegate().mo6501V2();
    }

    /* renamed from: a */
    public final void m6500a(File file, boolean z) throws IOException {
        ReadableByteChannel newChannel;
        if (this.f116349c != null) {
            newChannel = Channels.newChannel(this.f116348b.getAssets().open(this.f116349c));
            Intrinsics.checkNotNullExpressionValue(newChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.f116350d != null) {
            newChannel = new FileInputStream(this.f116350d).getChannel();
            Intrinsics.checkNotNullExpressionValue(newChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable<InputStream> callable = this.f116351e;
            if (callable != null) {
                try {
                    newChannel = Channels.newChannel(callable.call());
                    Intrinsics.checkNotNullExpressionValue(newChannel, "newChannel(inputStream)");
                } catch (Exception e) {
                    throw new IOException("inputStreamCallable exception on call", e);
                }
            } else {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
        }
        File intermediateFile = File.createTempFile("room-copy-helper", ".tmp", this.f116348b.getCacheDir());
        intermediateFile.deleteOnExit();
        FileChannel output = new FileOutputStream(intermediateFile).getChannel();
        Intrinsics.checkNotNullExpressionValue(output, "output");
        C50018ul1.m9801a(newChannel, output);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        Intrinsics.checkNotNullExpressionValue(intermediateFile, "intermediateFile");
        m6498c(intermediateFile, z);
        if (intermediateFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + intermediateFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    /* renamed from: b */
    public final InterfaceC45717nV5 m6499b(File file) {
        int coerceAtLeast;
        try {
            int m102672d = IF0.m102672d(file);
            C36978Wy1 c36978Wy1 = new C36978Wy1();
            InterfaceC45717nV5.C26533b.C26534a m23587d = InterfaceC45717nV5.C26533b.f100065f.m23585a(this.f116348b).m23587d(file.getAbsolutePath());
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(m102672d, 1);
            return c36978Wy1.mo4888a(m23587d.m23588c(new C29940a(m102672d, coerceAtLeast)).m23589b());
        } catch (IOException e) {
            throw new RuntimeException("Malformed database file, unable to read version.", e);
        }
    }

    /* renamed from: c */
    public final void m6498c(File file, boolean z) {
        InterfaceC45124mV5 mo6501V2;
        C40950fT0 c40950fT0 = this.f116354h;
        if (c40950fT0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
            c40950fT0 = null;
        }
        if (c40950fT0.f80186q == null) {
            return;
        }
        InterfaceC45717nV5 m6499b = m6499b(file);
        try {
            if (z) {
                mo6501V2 = m6499b.mo6496d1();
            } else {
                mo6501V2 = m6499b.mo6501V2();
            }
            C40950fT0 c40950fT02 = this.f116354h;
            if (c40950fT02 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
                c40950fT02 = null;
            }
            AbstractC32563Eb5.AbstractC1903f abstractC1903f = c40950fT02.f80186q;
            Intrinsics.checkNotNull(abstractC1903f);
            abstractC1903f.m108693a(mo6501V2);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(m6499b, null);
        } finally {
        }
    }

    @Override // p000.InterfaceC45717nV5, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        getDelegate().close();
        this.f116355i = false;
    }

    /* renamed from: d */
    public final void m6497d(C40950fT0 databaseConfiguration) {
        Intrinsics.checkNotNullParameter(databaseConfiguration, "databaseConfiguration");
        this.f116354h = databaseConfiguration;
    }

    @Override // p000.InterfaceC45717nV5
    /* renamed from: d1 */
    public InterfaceC45124mV5 mo6496d1() {
        if (!this.f116355i) {
            m6495f(true);
            this.f116355i = true;
        }
        return getDelegate().mo6496d1();
    }

    /* renamed from: f */
    public final void m6495f(boolean z) {
        String databaseName = getDatabaseName();
        if (databaseName != null) {
            File databaseFile = this.f116348b.getDatabasePath(databaseName);
            C40950fT0 c40950fT0 = this.f116354h;
            C40950fT0 c40950fT02 = null;
            if (c40950fT0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
                c40950fT0 = null;
            }
            O64 o64 = new O64(databaseName, this.f116348b.getFilesDir(), c40950fT0.f80189t);
            try {
                O64.m92908c(o64, false, 1, null);
                if (!databaseFile.exists()) {
                    try {
                        Intrinsics.checkNotNullExpressionValue(databaseFile, "databaseFile");
                        m6500a(databaseFile, z);
                        o64.m92907d();
                        return;
                    } catch (IOException e) {
                        throw new RuntimeException("Unable to copy database file.", e);
                    }
                }
                try {
                    Intrinsics.checkNotNullExpressionValue(databaseFile, "databaseFile");
                    int m102672d = IF0.m102672d(databaseFile);
                    if (m102672d == this.f116352f) {
                        o64.m92907d();
                        return;
                    }
                    C40950fT0 c40950fT03 = this.f116354h;
                    if (c40950fT03 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
                    } else {
                        c40950fT02 = c40950fT03;
                    }
                    if (c40950fT02.m41304a(m102672d, this.f116352f)) {
                        o64.m92907d();
                        return;
                    }
                    if (this.f116348b.deleteDatabase(databaseName)) {
                        try {
                            m6500a(databaseFile, z);
                        } catch (IOException e2) {
                            Log.w("ROOM", "Unable to copy database file.", e2);
                        }
                    } else {
                        Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                    }
                    o64.m92907d();
                    return;
                } catch (IOException e3) {
                    Log.w("ROOM", "Unable to read database version.", e3);
                    o64.m92907d();
                    return;
                }
            } catch (Throwable th) {
                o64.m92907d();
                throw th;
            }
            o64.m92907d();
            throw th;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // p000.InterfaceC45717nV5
    public String getDatabaseName() {
        return getDelegate().getDatabaseName();
    }

    @Override // p000.CZ0
    public InterfaceC45717nV5 getDelegate() {
        return this.f116353g;
    }

    @Override // p000.InterfaceC45717nV5
    public void setWriteAheadLoggingEnabled(boolean z) {
        getDelegate().setWriteAheadLoggingEnabled(z);
    }
}
