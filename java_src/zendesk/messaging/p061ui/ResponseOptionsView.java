package zendesk.messaging.p061ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import zendesk.messaging.MessagingItem;
import zendesk.messaging.R$dimen;
import zendesk.messaging.R$id;
import zendesk.messaging.R$layout;
/* renamed from: zendesk.messaging.ui.ResponseOptionsView */
/* loaded from: classes8.dex */
public class ResponseOptionsView extends FrameLayout implements Updatable<ResponseOptionsViewState> {
    private ResponseOptionsAdapter adapter;

    /* renamed from: zendesk.messaging.ui.ResponseOptionsView$ItemOffsetDecoration */
    /* loaded from: classes8.dex */
    public static class ItemOffsetDecoration extends RecyclerView.AbstractC11854o {
        private int itemOffset;

        public ItemOffsetDecoration(Context context, int i) {
            this.itemOffset = context.getResources().getDimensionPixelSize(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C11872z c11872z) {
            boolean z;
            super.getItemOffsets(rect, view, recyclerView, c11872z);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == -1) {
                return;
            }
            boolean z2 = true;
            if (childAdapterPosition == 0) {
                z = true;
            } else {
                z = false;
            }
            if (C38790bq6.m62548D(recyclerView) != 0) {
                z2 = false;
            }
            if (z2) {
                if (!z) {
                    rect.set(0, 0, this.itemOffset, 0);
                }
            } else if (!z) {
                rect.set(this.itemOffset, 0, 0, 0);
            }
        }
    }

    public ResponseOptionsView(Context context) {
        super(context);
        init();
    }

    private void init() {
        View.inflate(getContext(), R$layout.zui_view_response_options_content, this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        RecyclerView recyclerView = (RecyclerView) findViewById(R$id.zui_response_options_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, true));
        ResponseOptionsAdapter responseOptionsAdapter = new ResponseOptionsAdapter();
        this.adapter = responseOptionsAdapter;
        recyclerView.setAdapter(responseOptionsAdapter);
        recyclerView.addItemDecoration(new ItemOffsetDecoration(getContext(), R$dimen.zui_cell_response_options_horizontal_spacing));
    }

    @Override // zendesk.messaging.p061ui.Updatable
    public void update(final ResponseOptionsViewState responseOptionsViewState) {
        responseOptionsViewState.getProps().apply(this);
        this.adapter.setResponseOptionHandler(new ResponseOptionHandler() { // from class: zendesk.messaging.ui.ResponseOptionsView.1
            @Override // zendesk.messaging.p061ui.ResponseOptionHandler
            public void onResponseOptionSelected(MessagingItem.Option option) {
                ResponseOptionsView.this.adapter.submitList(Collections.singletonList(option));
                responseOptionsViewState.getListener().onResponseOptionSelected(option);
            }
        });
        this.adapter.submitList(responseOptionsViewState.getOptions());
    }

    public ResponseOptionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ResponseOptionsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
