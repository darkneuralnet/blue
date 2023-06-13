package p000;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* renamed from: aM4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC37909aM4 extends AbstractC39639dF0 {

    /* renamed from: j */
    public int f50363j;

    /* renamed from: k */
    public int f50364k;

    /* renamed from: l */
    public LayoutInflater f50365l;

    @Deprecated
    public AbstractC37909aM4(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f50364k = i;
        this.f50363j = i;
        this.f50365l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p000.AbstractC39639dF0
    /* renamed from: g */
    public View mo44485g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f50365l.inflate(this.f50364k, viewGroup, false);
    }

    @Override // p000.AbstractC39639dF0
    /* renamed from: h */
    public View mo44484h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f50365l.inflate(this.f50363j, viewGroup, false);
    }
}
