package p000;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p053io.CloseableKt;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a(\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u001a\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\n\u001a\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r\u001a\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006¨\u0006\u0012"}, m28432d2 = {"LEb5;", "db", "LpV5;", "sqLiteQuery", "", "maybeCopy", "Landroid/os/CancellationSignal;", "signal", "Landroid/database/Cursor;", "c", "LmV5;", "", "b", "Ljava/io/File;", "databaseFile", "", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "room-runtime_release"}, m28431k = 2, m28430mv = {1, 7, 1})
@JvmName(name = "DBUtil")
/* renamed from: IF0 */
/* loaded from: classes.dex */
public final class IF0 {
    /* renamed from: a */
    public static final CancellationSignal m102675a() {
        return C40973fV5.m41269b();
    }

    /* renamed from: b */
    public static final void m102674b(InterfaceC45124mV5 db) {
        List createListBuilder;
        List<String> build;
        boolean startsWith$default;
        Intrinsics.checkNotNullParameter(db, "db");
        createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        Cursor mo25489c3 = db.mo25489c3("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (mo25489c3.moveToNext()) {
            try {
                createListBuilder.add(mo25489c3.getString(0));
            } finally {
            }
        }
        Unit unit = Unit.INSTANCE;
        CloseableKt.closeFinally(mo25489c3, null);
        build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
        for (String triggerName : build) {
            Intrinsics.checkNotNullExpressionValue(triggerName, "triggerName");
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(triggerName, "room_fts_content_sync_", false, 2, null);
            if (startsWith$default) {
                db.mo25497G1("DROP TRIGGER IF EXISTS " + triggerName);
            }
        }
    }

    /* renamed from: c */
    public static final Cursor m102673c(AbstractC32563Eb5 db, InterfaceC46903pV5 sqLiteQuery, boolean z, CancellationSignal cancellationSignal) {
        int i;
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(sqLiteQuery, "sqLiteQuery");
        Cursor m108714x = db.m108714x(sqLiteQuery, cancellationSignal);
        if (z && (m108714x instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) m108714x;
            int count = abstractWindowedCursor.getCount();
            if (abstractWindowedCursor.hasWindow()) {
                i = abstractWindowedCursor.getWindow().getNumRows();
            } else {
                i = count;
            }
            if (i < count) {
                return C40824fF0.m41649a(m108714x);
            }
            return m108714x;
        }
        return m108714x;
    }

    /* renamed from: d */
    public static final int m102672d(File databaseFile) throws IOException {
        Intrinsics.checkNotNullParameter(databaseFile, "databaseFile");
        FileChannel channel = new FileInputStream(databaseFile).getChannel();
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) == 4) {
                allocate.rewind();
                int i = allocate.getInt();
                CloseableKt.closeFinally(channel, null);
                return i;
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(channel, th);
                throw th2;
            }
        }
    }
}
