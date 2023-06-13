package zendesk.messaging.p061ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC11940o;
import androidx.recyclerview.widget.C11905h;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import zendesk.messaging.MessagingItem;
import zendesk.messaging.R$id;
import zendesk.messaging.R$layout;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: zendesk.messaging.ui.ResponseOptionsAdapter */
/* loaded from: classes8.dex */
public class ResponseOptionsAdapter extends AbstractC11940o<MessagingItem.Option, RecyclerView.AbstractC11834D> {
    private boolean canSelectOption;
    private ResponseOptionHandler responseOptionHandler;
    private MessagingItem.Option selectedOption;

    /* renamed from: zendesk.messaging.ui.ResponseOptionsAdapter$ResponseOptionsDiffCallback */
    /* loaded from: classes8.dex */
    public static class ResponseOptionsDiffCallback extends C11905h.AbstractC11911f<MessagingItem.Option> {
        private ResponseOptionsDiffCallback() {
        }

        @Override // androidx.recyclerview.widget.C11905h.AbstractC11911f
        public boolean areContentsTheSame(MessagingItem.Option option, MessagingItem.Option option2) {
            return option.equals(option2);
        }

        @Override // androidx.recyclerview.widget.C11905h.AbstractC11911f
        public boolean areItemsTheSame(MessagingItem.Option option, MessagingItem.Option option2) {
            return option.equals(option2);
        }
    }

    public ResponseOptionsAdapter() {
        super(new ResponseOptionsDiffCallback());
        this.canSelectOption = true;
        this.selectedOption = null;
    }

    private void notifyItemChanged(MessagingItem.Option option) {
        for (int i = 0; i < getItemCount(); i++) {
            if (getItem(i).equals(option)) {
                notifyItemChanged(i);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemViewType(int i) {
        if (getItem(i) == this.selectedOption) {
            return R$layout.zui_response_options_selected_option;
        }
        return R$layout.zui_response_options_option;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onBindViewHolder(final RecyclerView.AbstractC11834D abstractC11834D, int i) {
        final MessagingItem.Option item = getItem(i);
        ((TextView) abstractC11834D.itemView.findViewById(R$id.zui_response_option_text)).setText(item.getText());
        abstractC11834D.itemView.setOnClickListener(new View.OnClickListener() { // from class: zendesk.messaging.ui.ResponseOptionsAdapter.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ResponseOptionsAdapter.this.canSelectOption) {
                    if (ResponseOptionsAdapter.this.responseOptionHandler != null) {
                        abstractC11834D.itemView.post(new Runnable() { // from class: zendesk.messaging.ui.ResponseOptionsAdapter.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ResponseOptionsAdapter.this.responseOptionHandler.onResponseOptionSelected(item);
                            }
                        });
                    }
                    ResponseOptionsAdapter.this.canSelectOption = false;
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public RecyclerView.AbstractC11834D onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new RecyclerView.AbstractC11834D(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false)) { // from class: zendesk.messaging.ui.ResponseOptionsAdapter.1
        };
    }

    public void setResponseOptionHandler(ResponseOptionHandler responseOptionHandler) {
        this.responseOptionHandler = responseOptionHandler;
    }

    public void setSelectedOption(MessagingItem.Option option) {
        this.selectedOption = option;
        notifyItemChanged(option);
    }

    @Override // androidx.recyclerview.widget.AbstractC11940o
    public void submitList(List<MessagingItem.Option> list) {
        super.submitList(list);
        this.canSelectOption = true;
        this.selectedOption = null;
    }
}
