package p000;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import p000.C40231eF0;
/* renamed from: dF0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC39639dF0 extends BaseAdapter implements Filterable, C40231eF0.InterfaceC19997a {

    /* renamed from: b */
    public boolean f76314b;

    /* renamed from: c */
    public boolean f76315c;

    /* renamed from: d */
    public Cursor f76316d;

    /* renamed from: e */
    public Context f76317e;

    /* renamed from: f */
    public int f76318f;

    /* renamed from: g */
    public C19705a f76319g;

    /* renamed from: h */
    public DataSetObserver f76320h;

    /* renamed from: i */
    public C40231eF0 f76321i;

    /* renamed from: dF0$a */
    /* loaded from: classes.dex */
    public class C19705a extends ContentObserver {
        public C19705a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            AbstractC39639dF0.this.m44483i();
        }
    }

    /* renamed from: dF0$b */
    /* loaded from: classes.dex */
    public class C19706b extends DataSetObserver {
        public C19706b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC39639dF0 abstractC39639dF0 = AbstractC39639dF0.this;
            abstractC39639dF0.f76314b = true;
            abstractC39639dF0.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC39639dF0 abstractC39639dF0 = AbstractC39639dF0.this;
            abstractC39639dF0.f76314b = false;
            abstractC39639dF0.notifyDataSetInvalidated();
        }
    }

    public AbstractC39639dF0(Context context, Cursor cursor, boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        m44486f(context, cursor, i);
    }

    /* renamed from: a */
    public void mo43076a(Cursor cursor) {
        Cursor m44482j = m44482j(cursor);
        if (m44482j != null) {
            m44482j.close();
        }
    }

    @Override // p000.C40231eF0.InterfaceC19997a
    /* renamed from: b */
    public Cursor mo43075b() {
        return this.f76316d;
    }

    /* renamed from: c */
    public abstract CharSequence mo43074c(Cursor cursor);

    /* renamed from: e */
    public abstract void mo44487e(View view, Context context, Cursor cursor);

    /* renamed from: f */
    public void m44486f(Context context, Cursor cursor, int i) {
        int i2;
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f76315c = true;
        } else {
            this.f76315c = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f76316d = cursor;
        this.f76314b = z;
        this.f76317e = context;
        if (z) {
            i2 = cursor.getColumnIndexOrThrow(TransferTable.COLUMN_ID);
        } else {
            i2 = -1;
        }
        this.f76318f = i2;
        if ((i & 2) == 2) {
            this.f76319g = new C19705a();
            this.f76320h = new C19706b();
        } else {
            this.f76319g = null;
            this.f76320h = null;
        }
        if (z) {
            C19705a c19705a = this.f76319g;
            if (c19705a != null) {
                cursor.registerContentObserver(c19705a);
            }
            DataSetObserver dataSetObserver = this.f76320h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: g */
    public abstract View mo44485g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (this.f76314b && (cursor = this.f76316d) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.f76314b) {
            this.f76316d.moveToPosition(i);
            if (view == null) {
                view = mo44485g(this.f76317e, this.f76316d, viewGroup);
            }
            mo44487e(view, this.f76317e, this.f76316d);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f76321i == null) {
            this.f76321i = new C40231eF0(this);
        }
        return this.f76321i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (this.f76314b && (cursor = this.f76316d) != null) {
            cursor.moveToPosition(i);
            return this.f76316d;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f76314b || (cursor = this.f76316d) == null || !cursor.moveToPosition(i)) {
            return 0L;
        }
        return this.f76316d.getLong(this.f76318f);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.f76314b) {
            if (this.f76316d.moveToPosition(i)) {
                if (view == null) {
                    view = mo44484h(this.f76317e, this.f76316d, viewGroup);
                }
                mo44487e(view, this.f76317e, this.f76316d);
                return view;
            }
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }

    /* renamed from: h */
    public abstract View mo44484h(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: i */
    public void m44483i() {
        Cursor cursor;
        if (this.f76315c && (cursor = this.f76316d) != null && !cursor.isClosed()) {
            this.f76314b = this.f76316d.requery();
        }
    }

    /* renamed from: j */
    public Cursor m44482j(Cursor cursor) {
        Cursor cursor2 = this.f76316d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C19705a c19705a = this.f76319g;
            if (c19705a != null) {
                cursor2.unregisterContentObserver(c19705a);
            }
            DataSetObserver dataSetObserver = this.f76320h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f76316d = cursor;
        if (cursor != null) {
            C19705a c19705a2 = this.f76319g;
            if (c19705a2 != null) {
                cursor.registerContentObserver(c19705a2);
            }
            DataSetObserver dataSetObserver2 = this.f76320h;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f76318f = cursor.getColumnIndexOrThrow(TransferTable.COLUMN_ID);
            this.f76314b = true;
            notifyDataSetChanged();
        } else {
            this.f76318f = -1;
            this.f76314b = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
