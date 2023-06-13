package zendesk.support.requestlist;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import zendesk.support.requestlist.RequestListView;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class RequestListAdapter extends RecyclerView.AbstractC11843h<RequestListViewHolder> {
    private final RequestListView.OnItemClick itemClickListener;
    private final C42732iT3 picasso;
    private final List<RequestListItem> requestListItems = new ArrayList(0);

    public RequestListAdapter(RequestListView.OnItemClick onItemClick, C42732iT3 c42732iT3) {
        this.itemClickListener = onItemClick;
        this.picasso = c42732iT3;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemCount() {
        return this.requestListItems.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public long getItemId(int i) {
        return this.requestListItems.get(i).getItemId();
    }

    public void swapRequests(List<RequestListItem> list) {
        this.requestListItems.clear();
        this.requestListItems.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onBindViewHolder(RequestListViewHolder requestListViewHolder, int i) {
        requestListViewHolder.bind(this.requestListItems.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public RequestListViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return RequestListViewHolder.create(viewGroup.getContext(), viewGroup, this.itemClickListener, this.picasso);
    }
}
