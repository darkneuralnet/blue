package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import java.util.ArrayList;
import java.util.List;
import zendesk.belvedere.MediaResult;
/* renamed from: YX1 */
/* loaded from: classes8.dex */
public class YX1 {

    /* renamed from: a */
    public final Context f45978a;

    /* renamed from: b */
    public final WX1 f45979b;

    public YX1(Context context) {
        this.f45978a = context.getApplicationContext();
        this.f45979b = new WX1(context, Build.VERSION.SDK_INT);
    }

    /* renamed from: a */
    public boolean m74933a(String str) {
        return C32627Ei6.m108565c(str, this.f45978a);
    }

    /* renamed from: b */
    public List<MediaResult> m74932b(int i) {
        int lastIndexOf;
        ArrayList arrayList = new ArrayList();
        Cursor m78253a = this.f45979b.m78253a(i);
        if (m78253a != null) {
            while (m78253a.moveToNext()) {
                try {
                    Uri contentUri = MediaStore.Files.getContentUri("external", m78253a.getLong(m78253a.getColumnIndex(TransferTable.COLUMN_ID)));
                    long j = m78253a.getLong(m78253a.getColumnIndex("_size"));
                    long j2 = m78253a.getLong(m78253a.getColumnIndex("width"));
                    long j3 = m78253a.getLong(m78253a.getColumnIndex("height"));
                    String string = m78253a.getString(m78253a.getColumnIndex("_display_name"));
                    String str = "image/jpeg";
                    if (!TextUtils.isEmpty(string) && (lastIndexOf = string.lastIndexOf(InstructionFileId.DOT)) != -1) {
                        str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(string.substring(lastIndexOf + 1));
                    }
                    arrayList.add(new MediaResult(null, contentUri, contentUri, string, str, j, j2, j3));
                } finally {
                    m78253a.close();
                }
            }
        }
        if (m78253a != null) {
        }
        return arrayList;
    }
}
