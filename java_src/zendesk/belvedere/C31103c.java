package zendesk.belvedere;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import zendesk.belvedere.C31106d;
/* renamed from: zendesk.belvedere.c */
/* loaded from: classes8.dex */
public class C31103c extends RecyclerView.AbstractC11843h<RecyclerView.AbstractC11834D> {

    /* renamed from: b */
    public List<C31106d.AbstractC31108b> f121822b = new ArrayList();

    /* renamed from: c */
    public List<C31106d.AbstractC31108b> f121823c = new ArrayList();

    /* renamed from: d */
    public List<C31106d.AbstractC31108b> f121824d = new ArrayList();

    /* renamed from: zendesk.belvedere.c$a */
    /* loaded from: classes8.dex */
    public class C31104a extends RecyclerView.AbstractC11834D {
        public C31104a(View view) {
            super(view);
        }
    }

    /* renamed from: zendesk.belvedere.c$b */
    /* loaded from: classes8.dex */
    public interface InterfaceC31105b {
        /* renamed from: a */
        boolean mo698a(C31106d.AbstractC31108b abstractC31108b);

        /* renamed from: b */
        void mo697b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemCount() {
        return this.f121824d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public long getItemId(int i) {
        return this.f121824d.get(i).m735b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemViewType(int i) {
        return this.f121824d.get(i).m734c();
    }

    /* renamed from: o */
    public void m741o(C31106d.AbstractC31108b abstractC31108b) {
        m738r(Collections.singletonList(abstractC31108b), this.f121823c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onBindViewHolder(RecyclerView.AbstractC11834D abstractC11834D, int i) {
        this.f121824d.get(i).mo728a(abstractC11834D.itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public RecyclerView.AbstractC11834D onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C31104a(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
    }

    /* renamed from: p */
    public void m740p(List<C31106d.AbstractC31108b> list) {
        m738r(this.f121822b, list);
    }

    /* renamed from: q */
    public void m739q(List<MediaResult> list) {
        ArrayList arrayList = new ArrayList(this.f121823c);
        HashSet hashSet = new HashSet();
        for (MediaResult mediaResult : list) {
            hashSet.add(mediaResult.m781h());
        }
        for (C31106d.AbstractC31108b abstractC31108b : arrayList) {
            abstractC31108b.m731f(hashSet.contains(abstractC31108b.m733d().m781h()));
        }
        m738r(this.f121822b, arrayList);
    }

    /* renamed from: r */
    public final void m738r(List<C31106d.AbstractC31108b> list, List<C31106d.AbstractC31108b> list2) {
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        this.f121822b = list;
        this.f121823c = list2;
        this.f121824d = arrayList;
    }
}
