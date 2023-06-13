package zendesk.messaging.p061ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC11940o;
import androidx.recyclerview.widget.C11905h;
import androidx.recyclerview.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: zendesk.messaging.ui.CellListAdapter */
/* loaded from: classes8.dex */
public class CellListAdapter extends AbstractC11940o<MessagingCell, RecyclerView.AbstractC11834D> {

    /* renamed from: zendesk.messaging.ui.CellListAdapter$CellDiffUtil */
    /* loaded from: classes8.dex */
    public static class CellDiffUtil extends C11905h.AbstractC11911f<MessagingCell> {
        @Override // androidx.recyclerview.widget.C11905h.AbstractC11911f
        public boolean areContentsTheSame(MessagingCell messagingCell, MessagingCell messagingCell2) {
            return messagingCell.areContentsTheSame(messagingCell2);
        }

        @Override // androidx.recyclerview.widget.C11905h.AbstractC11911f
        public boolean areItemsTheSame(MessagingCell messagingCell, MessagingCell messagingCell2) {
            if (messagingCell.getId().equals(MessagingCellFactory.TYPING_INDICATOR_ID)) {
                return false;
            }
            return messagingCell.getId().equals(messagingCell2.getId());
        }
    }

    public CellListAdapter() {
        super(new CellDiffUtil());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemViewType(int i) {
        return getItem(i).getLayoutRes();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onBindViewHolder(RecyclerView.AbstractC11834D abstractC11834D, int i) {
        MessagingCell item = getItem(i);
        View view = abstractC11834D.itemView;
        if (item.getViewClassType().isInstance(view)) {
            item.bind(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public RecyclerView.AbstractC11834D onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new RecyclerView.AbstractC11834D(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false)) { // from class: zendesk.messaging.ui.CellListAdapter.1
        };
    }
}
