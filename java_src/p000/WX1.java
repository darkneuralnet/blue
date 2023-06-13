package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.MediaStore;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import java.util.Locale;
/* renamed from: WX1 */
/* loaded from: classes8.dex */
public class WX1 {

    /* renamed from: c */
    public static final String[] f41231c = {TransferTable.COLUMN_ID, "_display_name", "_size", "width", "height"};

    /* renamed from: a */
    public final Context f41232a;

    /* renamed from: b */
    public final int f41233b;

    public WX1(Context context, int i) {
        this.f41232a = context;
        this.f41233b = i;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public Cursor m78253a(int i) {
        Cursor query;
        if (this.f41232a == null) {
            return null;
        }
        String m78252b = m78252b();
        if (this.f41233b >= 26) {
            Bundle bundle = new Bundle();
            bundle.putInt("android:query-arg-limit", i);
            bundle.putStringArray("android:query-arg-sort-columns", new String[]{m78252b});
            bundle.putInt("android:query-arg-sort-direction", 1);
            query = this.f41232a.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, f41231c, bundle, null);
            return query;
        }
        return this.f41232a.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, f41231c, null, null, String.format(Locale.US, "%s DESC LIMIT %s", m78252b, Integer.valueOf(i)));
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: b */
    public String m78252b() {
        return this.f41233b >= 29 ? "datetaken" : "date_modified";
    }
}
