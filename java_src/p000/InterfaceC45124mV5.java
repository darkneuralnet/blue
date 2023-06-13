package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\u0006H&J\b\u0010\f\u001a\u00020\u000bH&J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H&J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0010H&J\u001a\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H'JE\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u001d\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001c\u0018\u00010\u001bH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J)\u0010\"\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010!\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001c0\u001bH&¢\u0006\u0004\b\"\u0010#R\u001c\u0010(\u001a\u00020\u00168&@&X¦\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0016\u0010-\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u000b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010*R(\u00104\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000201\u0018\u0001008fX¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00065À\u0006\u0001"}, m28432d2 = {"LmV5;", "Ljava/io/Closeable;", "", "sql", "LqV5;", "J2", "", "w", "Y", "d2", "W1", "", "j3", "query", "Landroid/database/Cursor;", "c3", "LpV5;", "C1", "Landroid/os/CancellationSignal;", "cancellationSignal", "U0", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "whereClause", "", "", "whereArgs", "T2", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "G1", "bindArgs", "X1", "(Ljava/lang/String;[Ljava/lang/Object;)V", "getVersion", "()I", "C2", "(I)V", "version", "isOpen", "()Z", "getPath", "()Ljava/lang/String;", "path", "r3", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "J", "()Ljava/util/List;", "attachedDbs", "sqlite_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: mV5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC45124mV5 extends Closeable {
    /* renamed from: C1 */
    Cursor mo25499C1(InterfaceC46903pV5 interfaceC46903pV5);

    /* renamed from: C2 */
    void mo25498C2(int i);

    /* renamed from: G1 */
    void mo25497G1(String str) throws SQLException;

    /* renamed from: J */
    List<Pair<String, String>> mo25496J();

    /* renamed from: J2 */
    InterfaceC47496qV5 mo25495J2(String str);

    /* renamed from: T2 */
    int mo25494T2(String str, int i, ContentValues contentValues, String str2, Object[] objArr);

    /* renamed from: U0 */
    Cursor mo25493U0(InterfaceC46903pV5 interfaceC46903pV5, CancellationSignal cancellationSignal);

    /* renamed from: W1 */
    void mo25492W1();

    /* renamed from: X1 */
    void mo25491X1(String str, Object[] objArr) throws SQLException;

    /* renamed from: Y */
    void mo25490Y();

    /* renamed from: c3 */
    Cursor mo25489c3(String str);

    /* renamed from: d2 */
    void mo25488d2();

    String getPath();

    boolean isOpen();

    /* renamed from: j3 */
    boolean mo25487j3();

    /* renamed from: r3 */
    boolean mo25486r3();

    /* renamed from: w */
    void mo25485w();
}
