package p000;

import android.database.Cursor;
import android.widget.Filter;
/* renamed from: eF0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C40231eF0 extends Filter {

    /* renamed from: a */
    public InterfaceC19997a f78161a;

    /* renamed from: eF0$a */
    /* loaded from: classes.dex */
    public interface InterfaceC19997a {
        /* renamed from: a */
        void mo43076a(Cursor cursor);

        /* renamed from: b */
        Cursor mo43075b();

        /* renamed from: c */
        CharSequence mo43074c(Cursor cursor);

        /* renamed from: d */
        Cursor mo43073d(CharSequence charSequence);
    }

    public C40231eF0(InterfaceC19997a interfaceC19997a) {
        this.f78161a = interfaceC19997a;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f78161a.mo43074c((Cursor) obj);
    }

    @Override // android.widget.Filter
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor mo43073d = this.f78161a.mo43073d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (mo43073d != null) {
            filterResults.count = mo43073d.getCount();
            filterResults.values = mo43073d;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor mo43075b = this.f78161a.mo43075b();
        Object obj = filterResults.values;
        if (obj != null && obj != mo43075b) {
            this.f78161a.mo43076a((Cursor) obj);
        }
    }
}
