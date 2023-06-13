package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.C17216a;
import com.facebook.share.internal.C17296a;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p000.C32992Fx2;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 02\u00020\u0001:\b\u0013\u0017\u001a\u001d\"\n(\u0006B\u0017\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\u0006\u0010-\u001a\u00020+¢\u0006\u0004\b.\u0010/J\u001f\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0087\u0002J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007J\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0005J\b\u0010\r\u001a\u00020\u0002H\u0016J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\tH\u0002J\b\u0010\u0012\u001a\u00020\tH\u0002R\u0014\u0010\u0015\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010$\u001a\n !*\u0004\u0018\u00010 0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010&R\u0014\u0010*\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010,¨\u00061"}, m28432d2 = {"Lpl1;", "", "", "key", "contentTag", "Ljava/io/InputStream;", "h", "Ljava/io/OutputStream;", "l", "", "f", "input", "j", "toString", "Ljava/io/File;", "buffer", "o", "n", "p", C17296a.f69688o, "Ljava/io/File;", "directory", "", "b", "Z", "isTrimPending", "c", "isTrimInProgress", "Ljava/util/concurrent/locks/ReentrantLock;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/Condition;", "kotlin.jvm.PlatformType", "e", "Ljava/util/concurrent/locks/Condition;", "condition", "Ljava/util/concurrent/atomic/AtomicLong;", "Ljava/util/concurrent/atomic/AtomicLong;", "lastClearCacheTime", "g", "Ljava/lang/String;", "tag", "Lpl1$e;", "Lpl1$e;", "limits", "<init>", "(Ljava/lang/String;Lpl1$e;)V", "k", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: pl1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47054pl1 {

    /* renamed from: i */
    public static final String f104011i;

    /* renamed from: j */
    public static final AtomicLong f104012j;

    /* renamed from: k */
    public static final C27374c f104013k = new C27374c(null);

    /* renamed from: a */
    public final File f104014a;

    /* renamed from: b */
    public boolean f104015b;

    /* renamed from: c */
    public boolean f104016c;

    /* renamed from: d */
    public final ReentrantLock f104017d;

    /* renamed from: e */
    public final Condition f104018e;

    /* renamed from: f */
    public final AtomicLong f104019f;

    /* renamed from: g */
    public final String f104020g;

    /* renamed from: h */
    public final C27376e f104021h;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0010\u0010\t\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\u000f"}, m28432d2 = {"Lpl1$a;", "", "Ljava/io/File;", "root", "", C17296a.f69688o, "Ljava/io/FilenameFilter;", "b", "c", DateTokenConverter.CONVERTER_KEY, "Ljava/io/FilenameFilter;", "filterExcludeBufferFiles", "filterExcludeNonBufferFiles", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: pl1$a */
    /* loaded from: classes5.dex */
    public static final class C27370a {

        /* renamed from: c */
        public static final C27370a f104024c = new C27370a();

        /* renamed from: a */
        public static final FilenameFilter f104022a = C27371a.f104025a;

        /* renamed from: b */
        public static final FilenameFilter f104023b = C27372b.f104026a;

        @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "dir", "Ljava/io/File;", "kotlin.jvm.PlatformType", "filename", "", "accept"}, m28431k = 3, m28430mv = {1, 4, 0})
        /* renamed from: pl1$a$a */
        /* loaded from: classes5.dex */
        public static final class C27371a implements FilenameFilter {

            /* renamed from: a */
            public static final C27371a f104025a = new C27371a();

            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String filename) {
                boolean startsWith$default;
                Intrinsics.checkNotNullExpressionValue(filename, "filename");
                startsWith$default = StringsKt__StringsJVMKt.startsWith$default(filename, "buffer", false, 2, null);
                return !startsWith$default;
            }
        }

        @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "dir", "Ljava/io/File;", "kotlin.jvm.PlatformType", "filename", "", "accept"}, m28431k = 3, m28430mv = {1, 4, 0})
        /* renamed from: pl1$a$b */
        /* loaded from: classes5.dex */
        public static final class C27372b implements FilenameFilter {

            /* renamed from: a */
            public static final C27372b f104026a = new C27372b();

            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String filename) {
                boolean startsWith$default;
                Intrinsics.checkNotNullExpressionValue(filename, "filename");
                startsWith$default = StringsKt__StringsJVMKt.startsWith$default(filename, "buffer", false, 2, null);
                return startsWith$default;
            }
        }

        private C27370a() {
        }

        /* renamed from: a */
        public final void m18809a(File root) {
            Intrinsics.checkNotNullParameter(root, "root");
            File[] listFiles = root.listFiles(m18807c());
            if (listFiles != null) {
                for (File file : listFiles) {
                    file.delete();
                }
            }
        }

        /* renamed from: b */
        public final FilenameFilter m18808b() {
            return f104022a;
        }

        /* renamed from: c */
        public final FilenameFilter m18807c() {
            return f104023b;
        }

        /* renamed from: d */
        public final File m18806d(File file) {
            return new File(file, "buffer" + String.valueOf(C47054pl1.f104012j.incrementAndGet()));
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u0001\u0012\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H\u0016R\u0017\u0010\u0010\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m28432d2 = {"Lpl1$b;", "Ljava/io/OutputStream;", "", "close", "flush", "", "buffer", "", "offset", "count", "write", "oneByte", "b", "Ljava/io/OutputStream;", "getInnerStream", "()Ljava/io/OutputStream;", "innerStream", "Lpl1$g;", "c", "Lpl1$g;", "getCallback", "()Lpl1$g;", "callback", "<init>", "(Ljava/io/OutputStream;Lpl1$g;)V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: pl1$b */
    /* loaded from: classes5.dex */
    public static final class C27373b extends OutputStream {

        /* renamed from: b */
        public final OutputStream f104027b;

        /* renamed from: c */
        public final InterfaceC27379g f104028c;

        public C27373b(OutputStream innerStream, InterfaceC27379g callback) {
            Intrinsics.checkNotNullParameter(innerStream, "innerStream");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f104027b = innerStream;
            this.f104028c = callback;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                this.f104027b.close();
            } finally {
                this.f104028c.mo18797a();
            }
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f104027b.flush();
        }

        @Override // java.io.OutputStream
        public void write(byte[] buffer, int i, int i2) throws IOException {
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            this.f104027b.write(buffer, i, i2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] buffer) throws IOException {
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            this.f104027b.write(buffer);
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            this.f104027b.write(i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m28432d2 = {"Lpl1$c;", "", "", "TAG", "Ljava/lang/String;", C17296a.f69688o, "()Ljava/lang/String;", "HEADER_CACHEKEY_KEY", "HEADER_CACHE_CONTENT_TAG_KEY", "Ljava/util/concurrent/atomic/AtomicLong;", "bufferIndex", "Ljava/util/concurrent/atomic/AtomicLong;", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: pl1$c */
    /* loaded from: classes5.dex */
    public static final class C27374c {
        private C27374c() {
        }

        /* renamed from: a */
        public final String m18805a() {
            return C47054pl1.f104011i;
        }

        public /* synthetic */ C27374c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eR*\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u000f"}, m28432d2 = {"Lpl1$e;", "", "", "value", C17296a.f69688o, "I", "()I", "setByteCount", "(I)V", "byteCount", "b", "setFileCount", "fileCount", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: pl1$e */
    /* loaded from: classes5.dex */
    public static final class C27376e {

        /* renamed from: a */
        public int f104031a = 1048576;

        /* renamed from: b */
        public int f104032b = 1024;

        /* renamed from: a */
        public final int m18804a() {
            return this.f104031a;
        }

        /* renamed from: b */
        public final int m18803b() {
            return this.f104032b;
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\b\u001a\u00020\u0003H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0016"}, m28432d2 = {"Lpl1$f;", "", "another", "", C17296a.f69688o, "", "", "equals", "hashCode", "", "b", "J", "c", "()J", "modified", "Ljava/io/File;", "Ljava/io/File;", "()Ljava/io/File;", "file", "<init>", "(Ljava/io/File;)V", DateTokenConverter.CONVERTER_KEY, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: pl1$f */
    /* loaded from: classes5.dex */
    public static final class C27377f implements Comparable<C27377f> {

        /* renamed from: d */
        public static final C27378a f104033d = new C27378a(null);

        /* renamed from: b */
        public final long f104034b;

        /* renamed from: c */
        public final File f104035c;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lpl1$f$a;", "", "", "HASH_MULTIPLIER", "I", "HASH_SEED", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
        /* renamed from: pl1$f$a */
        /* loaded from: classes5.dex */
        public static final class C27378a {
            private C27378a() {
            }

            public /* synthetic */ C27378a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C27377f(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            this.f104035c = file;
            this.f104034b = file.lastModified();
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C27377f another) {
            Intrinsics.checkNotNullParameter(another, "another");
            long j = this.f104034b;
            long j2 = another.f104034b;
            if (j < j2) {
                return -1;
            }
            if (j > j2) {
                return 1;
            }
            return this.f104035c.compareTo(another.f104035c);
        }

        /* renamed from: b */
        public final File m18801b() {
            return this.f104035c;
        }

        /* renamed from: c */
        public final long m18800c() {
            return this.f104034b;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C27377f) && compareTo((C27377f) obj) == 0;
        }

        public int hashCode() {
            return ((1073 + this.f104035c.hashCode()) * 37) + ((int) (this.f104034b % Integer.MAX_VALUE));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bb\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, m28432d2 = {"Lpl1$g;", "", "", C17296a.f69688o, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: pl1$g */
    /* loaded from: classes5.dex */
    public interface InterfaceC27379g {
        /* renamed from: a */
        void mo18797a();
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\b¨\u0006\f"}, m28432d2 = {"Lpl1$h;", "", "Ljava/io/OutputStream;", "stream", "Lorg/json/JSONObject;", "header", "", "b", "Ljava/io/InputStream;", C17296a.f69688o, "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: pl1$h */
    /* loaded from: classes5.dex */
    public static final class C27380h {

        /* renamed from: a */
        public static final C27380h f104036a = new C27380h();

        private C27380h() {
        }

        /* renamed from: a */
        public final JSONObject m18799a(InputStream stream) throws IOException {
            Intrinsics.checkNotNullParameter(stream, "stream");
            if (stream.read() != 0) {
                return null;
            }
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < 3; i3++) {
                int read = stream.read();
                if (read == -1) {
                    C32992Fx2.f10539f.m106214c(EnumC36034Sx2.CACHE, C47054pl1.f104013k.m18805a(), "readHeader: stream.read returned -1 while reading header size");
                    return null;
                }
                i2 = (i2 << 8) + (read & KotlinVersion.MAX_COMPONENT_VALUE);
            }
            byte[] bArr = new byte[i2];
            while (i < i2) {
                int read2 = stream.read(bArr, i, i2 - i);
                if (read2 < 1) {
                    C32992Fx2.f10539f.m106214c(EnumC36034Sx2.CACHE, C47054pl1.f104013k.m18805a(), "readHeader: stream.read stopped at " + Integer.valueOf(i) + " when expected " + i2);
                    return null;
                }
                i += read2;
            }
            try {
                Object nextValue = new JSONTokener(new String(bArr, Charsets.UTF_8)).nextValue();
                if (!(nextValue instanceof JSONObject)) {
                    C32992Fx2.f10539f.m106214c(EnumC36034Sx2.CACHE, C47054pl1.f104013k.m18805a(), "readHeader: expected JSONObject, got " + nextValue.getClass().getCanonicalName());
                    return null;
                }
                return (JSONObject) nextValue;
            } catch (JSONException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: b */
        public final void m18798b(OutputStream stream, JSONObject header) throws IOException {
            Intrinsics.checkNotNullParameter(stream, "stream");
            Intrinsics.checkNotNullParameter(header, "header");
            String jSONObject = header.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "header.toString()");
            Charset charset = Charsets.UTF_8;
            if (jSONObject != null) {
                byte[] bytes = jSONObject.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                stream.write(0);
                stream.write((bytes.length >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                stream.write((bytes.length >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                stream.write((bytes.length >> 0) & KotlinVersion.MAX_COMPONENT_VALUE);
                stream.write(bytes);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "run"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: pl1$i */
    /* loaded from: classes5.dex */
    public static final class RunnableC27381i implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ File[] f104037b;

        public RunnableC27381i(File[] fileArr) {
            this.f104037b = fileArr;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                if (TD0.m84203d(this)) {
                    return;
                }
                for (File file : this.f104037b) {
                    file.delete();
                }
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"pl1$j", "Lpl1$g;", "", C17296a.f69688o, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: pl1$j */
    /* loaded from: classes5.dex */
    public static final class C27382j implements InterfaceC27379g {

        /* renamed from: b */
        public final /* synthetic */ long f104039b;

        /* renamed from: c */
        public final /* synthetic */ File f104040c;

        /* renamed from: d */
        public final /* synthetic */ String f104041d;

        public C27382j(long j, File file, String str) {
            this.f104039b = j;
            this.f104040c = file;
            this.f104041d = str;
        }

        @Override // p000.C47054pl1.InterfaceC27379g
        /* renamed from: a */
        public void mo18797a() {
            if (this.f104039b < C47054pl1.this.f104019f.get()) {
                this.f104040c.delete();
            } else {
                C47054pl1.this.m18811o(this.f104041d, this.f104040c);
            }
        }
    }

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, m28432d2 = {"<anonymous>", "", "run", "com/facebook/internal/FileLruCache$postTrim$1$1"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: pl1$k */
    /* loaded from: classes5.dex */
    public static final class RunnableC27383k implements Runnable {
        public RunnableC27383k() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                if (TD0.m84203d(this)) {
                    return;
                }
                C47054pl1.this.m18810p();
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    static {
        String simpleName = C47054pl1.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "FileLruCache::class.java.simpleName");
        f104011i = simpleName;
        f104012j = new AtomicLong();
    }

    public C47054pl1(String tag, C27376e limits) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(limits, "limits");
        this.f104020g = tag;
        this.f104021h = limits;
        File file = new File(C17216a.m52735k(), tag);
        this.f104014a = file;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f104017d = reentrantLock;
        this.f104018e = reentrantLock.newCondition();
        this.f104019f = new AtomicLong(0L);
        if (file.mkdirs() || file.isDirectory()) {
            C27370a.f104024c.m18809a(file);
        }
    }

    /* renamed from: i */
    public static /* synthetic */ InputStream m18817i(C47054pl1 c47054pl1, String str, String str2, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c47054pl1.m18818h(str, str2);
    }

    /* renamed from: m */
    public static /* synthetic */ OutputStream m18813m(C47054pl1 c47054pl1, String str, String str2, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c47054pl1.m18814l(str, str2);
    }

    /* renamed from: f */
    public final void m18820f() {
        File[] listFiles = this.f104014a.listFiles(C27370a.f104024c.m18808b());
        this.f104019f.set(System.currentTimeMillis());
        if (listFiles != null) {
            C17216a.m52731o().execute(new RunnableC27381i(listFiles));
        }
    }

    @JvmOverloads
    /* renamed from: g */
    public final InputStream m18819g(String str) throws IOException {
        return m18817i(this, str, null, 2, null);
    }

    @JvmOverloads
    /* renamed from: h */
    public final InputStream m18818h(String key, String str) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        File file = new File(this.f104014a, C52364yi6.m2846c0(key));
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 8192);
            try {
                JSONObject m18799a = C27380h.f104036a.m18799a(bufferedInputStream);
                if (m18799a == null) {
                    return null;
                }
                if (!Intrinsics.areEqual(m18799a.optString("key"), key)) {
                    return null;
                }
                String optString = m18799a.optString("tag", null);
                if (str == null && (!Intrinsics.areEqual(str, optString))) {
                    return null;
                }
                long time = new Date().getTime();
                C32992Fx2.C2516a c2516a = C32992Fx2.f10539f;
                EnumC36034Sx2 enumC36034Sx2 = EnumC36034Sx2.CACHE;
                String str2 = f104011i;
                c2516a.m106214c(enumC36034Sx2, str2, "Setting lastModified to " + Long.valueOf(time) + " for " + file.getName());
                file.setLastModified(time);
                return bufferedInputStream;
            } finally {
                bufferedInputStream.close();
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public final InputStream m18816j(String key, InputStream input) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(input, "input");
        return new C27375d(input, m18813m(this, key, null, 2, null));
    }

    @JvmOverloads
    /* renamed from: k */
    public final OutputStream m18815k(String str) throws IOException {
        return m18813m(this, str, null, 2, null);
    }

    @JvmOverloads
    /* renamed from: l */
    public final OutputStream m18814l(String key, String str) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        File m18806d = C27370a.f104024c.m18806d(this.f104014a);
        m18806d.delete();
        if (m18806d.createNewFile()) {
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new C27373b(new FileOutputStream(m18806d), new C27382j(System.currentTimeMillis(), m18806d, key)), 8192);
                try {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("key", key);
                        if (!C52364yi6.m2860R(str)) {
                            jSONObject.put("tag", str);
                        }
                        C27380h.f104036a.m18798b(bufferedOutputStream, jSONObject);
                        return bufferedOutputStream;
                    } catch (JSONException e) {
                        C32992Fx2.C2516a c2516a = C32992Fx2.f10539f;
                        EnumC36034Sx2 enumC36034Sx2 = EnumC36034Sx2.CACHE;
                        String str2 = f104011i;
                        c2516a.m106216a(enumC36034Sx2, 5, str2, "Error creating JSON header for cache file: " + e);
                        throw new IOException(e.getMessage());
                    }
                } catch (Throwable th) {
                    bufferedOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e2) {
                C32992Fx2.C2516a c2516a2 = C32992Fx2.f10539f;
                EnumC36034Sx2 enumC36034Sx22 = EnumC36034Sx2.CACHE;
                String str3 = f104011i;
                c2516a2.m106216a(enumC36034Sx22, 5, str3, "Error creating buffer output stream: " + e2);
                throw new IOException(e2.getMessage());
            }
        }
        throw new IOException("Could not create file at " + m18806d.getAbsolutePath());
    }

    /* renamed from: n */
    public final void m18812n() {
        ReentrantLock reentrantLock = this.f104017d;
        reentrantLock.lock();
        try {
            if (!this.f104015b) {
                this.f104015b = true;
                C17216a.m52731o().execute(new RunnableC27383k());
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: o */
    public final void m18811o(String str, File file) {
        if (!file.renameTo(new File(this.f104014a, C52364yi6.m2846c0(str)))) {
            file.delete();
        }
        m18812n();
    }

    /* renamed from: p */
    public final void m18810p() {
        long j;
        C27377f c27377f;
        ReentrantLock reentrantLock = this.f104017d;
        reentrantLock.lock();
        try {
            this.f104015b = false;
            this.f104016c = true;
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            try {
                C32992Fx2.f10539f.m106214c(EnumC36034Sx2.CACHE, f104011i, "trim started");
                PriorityQueue priorityQueue = new PriorityQueue();
                File[] listFiles = this.f104014a.listFiles(C27370a.f104024c.m18808b());
                long j2 = 0;
                if (listFiles != null) {
                    j = 0;
                    for (File file : listFiles) {
                        Intrinsics.checkNotNullExpressionValue(file, "file");
                        priorityQueue.add(new C27377f(file));
                        C32992Fx2.f10539f.m106214c(EnumC36034Sx2.CACHE, f104011i, "  trim considering time=" + Long.valueOf(c27377f.m18800c()) + " name=" + c27377f.m18801b().getName());
                        j2 += file.length();
                        j++;
                    }
                } else {
                    j = 0;
                }
                while (true) {
                    if (j2 <= this.f104021h.m18804a() && j <= this.f104021h.m18803b()) {
                        this.f104017d.lock();
                        try {
                            this.f104016c = false;
                            this.f104018e.signalAll();
                            Unit unit2 = Unit.INSTANCE;
                            return;
                        } finally {
                        }
                    }
                    File m18801b = ((C27377f) priorityQueue.remove()).m18801b();
                    C32992Fx2.f10539f.m106214c(EnumC36034Sx2.CACHE, f104011i, "  trim removing " + m18801b.getName());
                    j2 -= m18801b.length();
                    j += -1;
                    m18801b.delete();
                }
            } catch (Throwable th) {
                this.f104017d.lock();
                try {
                    this.f104016c = false;
                    this.f104018e.signalAll();
                    Unit unit3 = Unit.INSTANCE;
                    throw th;
                } finally {
                }
            }
        } finally {
        }
    }

    public String toString() {
        return "{FileLruCache: tag:" + this.f104020g + " file:" + this.f104014a.getName() + "}";
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0001\u0012\u0006\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J \u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u0017\u0010\u0017\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, m28432d2 = {"Lpl1$d;", "Ljava/io/InputStream;", "", "available", "", "close", "readlimit", "mark", "", "markSupported", "", "buffer", "read", "offset", "length", "reset", "", "byteCount", "skip", "b", "Ljava/io/InputStream;", "getInput", "()Ljava/io/InputStream;", "input", "Ljava/io/OutputStream;", "c", "Ljava/io/OutputStream;", "getOutput", "()Ljava/io/OutputStream;", "output", "<init>", "(Ljava/io/InputStream;Ljava/io/OutputStream;)V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: pl1$d */
    /* loaded from: classes5.dex */
    public static final class C27375d extends InputStream {

        /* renamed from: b */
        public final InputStream f104029b;

        /* renamed from: c */
        public final OutputStream f104030c;

        public C27375d(InputStream input, OutputStream output) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(output, "output");
            this.f104029b = input;
            this.f104030c = output;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f104029b.available();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                this.f104029b.close();
            } finally {
                this.f104030c.close();
            }
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return false;
        }

        @Override // java.io.InputStream
        public int read(byte[] buffer) throws IOException {
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            int read = this.f104029b.read(buffer);
            if (read > 0) {
                this.f104030c.write(buffer, 0, read);
            }
            return read;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.InputStream
        public long skip(long j) throws IOException {
            byte[] bArr = new byte[1024];
            long j2 = 0;
            while (j2 < j) {
                int read = read(bArr, 0, (int) Math.min(j - j2, 1024));
                if (read < 0) {
                    return j2;
                }
                j2 += read;
            }
            return j2;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            int read = this.f104029b.read();
            if (read >= 0) {
                this.f104030c.write(read);
            }
            return read;
        }

        @Override // java.io.InputStream
        public int read(byte[] buffer, int i, int i2) throws IOException {
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            int read = this.f104029b.read(buffer, i, i2);
            if (read > 0) {
                this.f104030c.write(buffer, i, read);
            }
            return read;
        }
    }
}
