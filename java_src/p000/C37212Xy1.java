package p000;

import android.database.sqlite.SQLiteProgram;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"LXy1;", "LoV5;", "", "index", "", "m1", "", "value", "S0", "", "M1", "", "G0", "", "X0", "close", "Landroid/database/sqlite/SQLiteProgram;", "b", "Landroid/database/sqlite/SQLiteProgram;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteProgram;)V", "sqlite-framework_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Xy1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C37212Xy1 implements InterfaceC46310oV5 {

    /* renamed from: b */
    public final SQLiteProgram f44323b;

    public C37212Xy1(SQLiteProgram delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f44323b = delegate;
    }

    @Override // p000.InterfaceC46310oV5
    /* renamed from: G0 */
    public void mo20958G0(int i, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f44323b.bindString(i, value);
    }

    @Override // p000.InterfaceC46310oV5
    /* renamed from: M1 */
    public void mo20957M1(int i, double d) {
        this.f44323b.bindDouble(i, d);
    }

    @Override // p000.InterfaceC46310oV5
    /* renamed from: S0 */
    public void mo20956S0(int i, long j) {
        this.f44323b.bindLong(i, j);
    }

    @Override // p000.InterfaceC46310oV5
    /* renamed from: X0 */
    public void mo20955X0(int i, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f44323b.bindBlob(i, value);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f44323b.close();
    }

    @Override // p000.InterfaceC46310oV5
    /* renamed from: m1 */
    public void mo20954m1(int i) {
        this.f44323b.bindNull(i);
    }
}
