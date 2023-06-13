package p000;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
/* renamed from: sT0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C48658sT0 extends BaseAdapter {

    /* renamed from: e */
    public static final int f108839e;

    /* renamed from: b */
    public final Calendar f108840b;

    /* renamed from: c */
    public final int f108841c;

    /* renamed from: d */
    public final int f108842d;

    static {
        f108839e = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public C48658sT0() {
        Calendar m30049l = C43471ji6.m30049l();
        this.f108840b = m30049l;
        this.f108841c = m30049l.getMaximum(7);
        this.f108842d = m30049l.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public Integer getItem(int i) {
        if (i >= this.f108841c) {
            return null;
        }
        return Integer.valueOf(m14169b(i));
    }

    /* renamed from: b */
    public final int m14169b(int i) {
        int i2 = i + this.f108842d;
        int i3 = this.f108841c;
        if (i2 > i3) {
            return i2 - i3;
        }
        return i2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f108841c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C50603vk4.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.f108840b.set(7, m14169b(i));
        textView.setText(this.f108840b.getDisplayName(7, f108839e, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(C40534el4.mtrl_picker_day_of_week_column_header), this.f108840b.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public C48658sT0(int i) {
        Calendar m30049l = C43471ji6.m30049l();
        this.f108840b = m30049l;
        this.f108841c = m30049l.getMaximum(7);
        this.f108842d = i;
    }
}
