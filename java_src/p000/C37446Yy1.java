package p000;

import android.database.sqlite.SQLiteStatement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, m28432d2 = {"LYy1;", "LXy1;", "LqV5;", "", "M", "", "y2", "Landroid/database/sqlite/SQLiteStatement;", "c", "Landroid/database/sqlite/SQLiteStatement;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteStatement;)V", "sqlite-framework_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Yy1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37446Yy1 extends C37212Xy1 implements InterfaceC47496qV5 {

    /* renamed from: c */
    public final SQLiteStatement f47693c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37446Yy1(SQLiteStatement delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f47693c = delegate;
    }

    @Override // p000.InterfaceC47496qV5
    /* renamed from: M */
    public int mo17482M() {
        return this.f47693c.executeUpdateDelete();
    }

    @Override // p000.InterfaceC47496qV5
    /* renamed from: y2 */
    public long mo17481y2() {
        return this.f47693c.executeInsert();
    }
}
