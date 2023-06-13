package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.AsyncTask;
import ch.qos.logback.classic.spi.CallerData;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.networking.FraudDetectionData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: fa */
/* loaded from: classes2.dex */
public class C20467fa extends SQLiteOpenHelper {

    /* renamed from: b */
    public final Set<AsyncTask> f80325b;

    /* renamed from: fa$a */
    /* loaded from: classes2.dex */
    public class RunnableC20468a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ContentValues f80326b;

        public RunnableC20468a(ContentValues contentValues) {
            this.f80326b = contentValues;
        }

        @Override // java.lang.Runnable
        public void run() {
            SQLiteDatabase sQLiteDatabase;
            Throwable th;
            SQLiteDatabase sQLiteDatabase2 = null;
            try {
                sQLiteDatabase = C20467fa.this.getWritableDatabase();
                try {
                    sQLiteDatabase.insert("analytics", null, this.f80326b);
                    sQLiteDatabase.close();
                } catch (SQLiteException unused) {
                    sQLiteDatabase2 = sQLiteDatabase;
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    throw th;
                }
            } catch (SQLiteException unused2) {
            } catch (Throwable th3) {
                sQLiteDatabase = null;
                th = th3;
            }
        }
    }

    /* renamed from: fa$b */
    /* loaded from: classes2.dex */
    public class RunnableC20469b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ StringBuilder f80328b;

        /* renamed from: c */
        public final /* synthetic */ String[] f80329c;

        public RunnableC20469b(StringBuilder sb, String[] strArr) {
            this.f80328b = sb;
            this.f80329c = strArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabase = C20467fa.this.getWritableDatabase();
                sQLiteDatabase.delete("analytics", this.f80328b.toString(), this.f80329c);
            } catch (SQLiteException unused) {
                if (sQLiteDatabase == null) {
                    return;
                }
            } catch (Throwable th) {
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
            sQLiteDatabase.close();
        }
    }

    /* renamed from: fa$c */
    /* loaded from: classes2.dex */
    public class C20470c implements N10<Void> {

        /* renamed from: a */
        public final /* synthetic */ AsyncTaskC20471d f80331a;

        public C20470c(AsyncTaskC20471d asyncTaskC20471d) {
            this.f80331a = asyncTaskC20471d;
        }

        @Override // p000.N10
        /* renamed from: a */
        public void onResponse(Void r3) {
            synchronized (C20467fa.this.f80325b) {
                C20467fa.this.f80325b.remove(this.f80331a);
            }
        }
    }

    /* renamed from: fa$d */
    /* loaded from: classes2.dex */
    public static class AsyncTaskC20471d extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        public Runnable f80333a;

        /* renamed from: b */
        public N10<Void> f80334b;

        public AsyncTaskC20471d(Runnable runnable) {
            this.f80333a = runnable;
        }

        @Override // android.os.AsyncTask
        /* renamed from: b */
        public Void doInBackground(Void... voidArr) {
            this.f80333a.run();
            return null;
        }

        @Override // android.os.AsyncTask
        /* renamed from: c */
        public void onPostExecute(Void r2) {
            N10<Void> n10 = this.f80334b;
            if (n10 != null) {
                n10.onResponse(null);
            }
        }

        /* renamed from: d */
        public final void m41164d(N10<Void> n10) {
            this.f80334b = n10;
        }
    }

    public C20467fa(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, "braintree-analytics.db", cursorFactory, 1);
        this.f80325b = new HashSet();
    }

    /* renamed from: b */
    public static C20467fa m41172b(Context context) {
        return new C20467fa(context, "braintree-analytics.db", null, 1);
    }

    /* renamed from: a */
    public void m41173a(C24929ja c24929ja) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event", c24929ja.f92934b);
        contentValues.put(FraudDetectionData.KEY_TIMESTAMP, Long.valueOf(c24929ja.f92935c));
        contentValues.put("meta_json", c24929ja.f92936d.toString());
        m41170d(new AsyncTaskC20471d(new RunnableC20468a(contentValues)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0096, code lost:
        if (r3 != null) goto L19;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<List<C24929ja>> m41171c() {
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = getReadableDatabase();
            Cursor query = sQLiteDatabase.query(false, "analytics", new String[]{"group_concat(_id)", "group_concat(event)", "group_concat(timestamp)", "meta_json"}, null, null, "meta_json", null, "_id asc", null);
            while (query.moveToNext()) {
                ArrayList arrayList2 = new ArrayList();
                String[] split = query.getString(0).split(",");
                String[] split2 = query.getString(1).split(",");
                String[] split3 = query.getString(2).split(",");
                for (int i = 0; i < split2.length; i++) {
                    try {
                        C24929ja c24929ja = new C24929ja();
                        c24929ja.f92933a = Integer.valueOf(split[i]).intValue();
                        c24929ja.f92934b = split2[i];
                        c24929ja.f92935c = Long.valueOf(split3[i]).longValue();
                        c24929ja.f92936d = new JSONObject(query.getString(query.getColumnIndex("meta_json")));
                        arrayList2.add(c24929ja);
                    } catch (JSONException unused) {
                    }
                }
                arrayList.add(arrayList2);
            }
            query.close();
        } catch (SQLiteException unused2) {
        } catch (Throwable th) {
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
        sQLiteDatabase.close();
        return arrayList;
    }

    /* renamed from: d */
    public final void m41170d(AsyncTaskC20471d asyncTaskC20471d) {
        asyncTaskC20471d.m41164d(new C20470c(asyncTaskC20471d));
        synchronized (this.f80325b) {
            this.f80325b.add(asyncTaskC20471d);
        }
        asyncTaskC20471d.execute(new Void[0]);
    }

    /* renamed from: f */
    public void m41169f(List<C24929ja> list) {
        StringBuilder sb = new StringBuilder(TransferTable.COLUMN_ID);
        sb.append(" in (");
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = Integer.toString(list.get(i).f92933a);
            sb.append(CallerData.f61059NA);
            if (i < list.size() - 1) {
                sb.append(",");
            } else {
                sb.append(")");
            }
        }
        m41170d(new AsyncTaskC20471d(new RunnableC20469b(sb, strArr)));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table analytics(_id integer primary key autoincrement, event text not null, timestamp long not null, meta_json text not null);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("drop table if exists analytics");
        onCreate(sQLiteDatabase);
    }
}
