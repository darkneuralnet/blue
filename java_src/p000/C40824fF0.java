package p000;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Build;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p053io.CloseableKt;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a%\u0010\u0001\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0001\u0010\f¨\u0006\r"}, m28432d2 = {"Landroid/database/Cursor;", "c", C17296a.f69688o, "", "name", "", DateTokenConverter.CONVERTER_KEY, "e", "cursor", "b", "", "columnNames", "([Ljava/lang/String;Ljava/lang/String;)I", "room-runtime_release"}, m28431k = 2, m28430mv = {1, 7, 1})
@JvmName(name = "CursorUtil")
/* renamed from: fF0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40824fF0 {
    /* renamed from: a */
    public static final Cursor m41649a(Cursor c) {
        Intrinsics.checkNotNullParameter(c, "c");
        try {
            MatrixCursor matrixCursor = new MatrixCursor(c.getColumnNames(), c.getCount());
            while (c.moveToNext()) {
                Object[] objArr = new Object[c.getColumnCount()];
                int columnCount = c.getColumnCount();
                for (int i = 0; i < columnCount; i++) {
                    int type = c.getType(i);
                    if (type != 0) {
                        if (type != 1) {
                            if (type != 2) {
                                if (type != 3) {
                                    if (type == 4) {
                                        objArr[i] = c.getBlob(i);
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                } else {
                                    objArr[i] = c.getString(i);
                                }
                            } else {
                                objArr[i] = Double.valueOf(c.getDouble(i));
                            }
                        } else {
                            objArr[i] = Long.valueOf(c.getLong(i));
                        }
                    } else {
                        objArr[i] = null;
                    }
                }
                matrixCursor.addRow(objArr);
            }
            CloseableKt.closeFinally(c, null);
            return matrixCursor;
        } finally {
        }
    }

    /* renamed from: b */
    public static final int m41648b(Cursor cursor, String str) {
        boolean z;
        if (Build.VERSION.SDK_INT > 25) {
            return -1;
        }
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        Intrinsics.checkNotNullExpressionValue(columnNames, "columnNames");
        return m41647c(columnNames, str);
    }

    /* renamed from: c */
    public static final int m41647c(String[] columnNames, String name) {
        boolean endsWith$default;
        boolean endsWith$default2;
        Intrinsics.checkNotNullParameter(columnNames, "columnNames");
        Intrinsics.checkNotNullParameter(name, "name");
        String str = CoreConstants.DOT + name;
        String str2 = CoreConstants.DOT + name + '`';
        int length = columnNames.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str3 = columnNames[i];
            int i3 = i2 + 1;
            if (str3.length() >= name.length() + 2) {
                endsWith$default = StringsKt__StringsJVMKt.endsWith$default(str3, str, false, 2, null);
                if (endsWith$default) {
                    return i2;
                }
                if (str3.charAt(0) == '`') {
                    endsWith$default2 = StringsKt__StringsJVMKt.endsWith$default(str3, str2, false, 2, null);
                    if (endsWith$default2) {
                        return i2;
                    }
                } else {
                    continue;
                }
            }
            i++;
            i2 = i3;
        }
        return -1;
    }

    /* renamed from: d */
    public static final int m41646d(Cursor c, String name) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int columnIndex = c.getColumnIndex(name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c.getColumnIndex('`' + name + '`');
        if (columnIndex2 < 0) {
            return m41648b(c, name);
        }
        return columnIndex2;
    }

    /* renamed from: e */
    public static final int m41645e(Cursor c, String name) {
        String str;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int m41646d = m41646d(c, name);
        if (m41646d >= 0) {
            return m41646d;
        }
        try {
            String[] columnNames = c.getColumnNames();
            Intrinsics.checkNotNullExpressionValue(columnNames, "c.columnNames");
            str = ArraysKt___ArraysKt.joinToString$default(columnNames, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            str = "unknown";
        }
        throw new IllegalArgumentException("column '" + name + "' does not exist. Available columns: " + str);
    }
}
