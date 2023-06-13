package zendesk.messaging.p061ui;

import android.view.View;
import androidx.recyclerview.widget.C11939n;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: zendesk.messaging.ui.RecyclerViewScroller */
/* loaded from: classes8.dex */
class RecyclerViewScroller {
    private final RecyclerView.AbstractC11843h<RecyclerView.AbstractC11834D> adapter;
    private final LinearLayoutManager linearLayoutManager;
    private final RecyclerView recyclerView;
    private int lastCompletelyVisiblePosition = 0;
    private int secondCompletelyVisiblePosition = 0;

    public RecyclerViewScroller(final RecyclerView recyclerView, final LinearLayoutManager linearLayoutManager, final RecyclerView.AbstractC11843h<RecyclerView.AbstractC11834D> abstractC11843h) {
        this.recyclerView = recyclerView;
        this.linearLayoutManager = linearLayoutManager;
        this.adapter = abstractC11843h;
        recyclerView.addOnScrollListener(new RecyclerView.AbstractC11863t() { // from class: zendesk.messaging.ui.RecyclerViewScroller.1
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11863t
            public void onScrolled(RecyclerView recyclerView2, int i, int i2) {
                super.onScrolled(recyclerView2, i, i2);
                RecyclerViewScroller recyclerViewScroller = RecyclerViewScroller.this;
                recyclerViewScroller.secondCompletelyVisiblePosition = recyclerViewScroller.lastCompletelyVisiblePosition;
                RecyclerViewScroller.this.lastCompletelyVisiblePosition = linearLayoutManager.m66706s2();
            }
        });
        recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: zendesk.messaging.ui.RecyclerViewScroller.2
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i4 < i8 && abstractC11843h.getItemCount() - 1 == RecyclerViewScroller.this.secondCompletelyVisiblePosition) {
                    RecyclerViewScroller.this.postScrollToBottom(1);
                }
            }
        });
        abstractC11843h.registerAdapterDataObserver(new RecyclerView.AbstractC11846j() { // from class: zendesk.messaging.ui.RecyclerViewScroller.3
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
            public void onItemRangeInserted(int i, int i2) {
                if (!recyclerView.canScrollVertically(1)) {
                    RecyclerViewScroller.this.postScrollToBottom(3);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postScrollToBottom(final int i) {
        this.recyclerView.post(new Runnable() { // from class: zendesk.messaging.ui.RecyclerViewScroller.7
            @Override // java.lang.Runnable
            public void run() {
                RecyclerViewScroller.this.scrollToBottom(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scrollToBottom(int i) {
        int i2;
        int itemCount = this.adapter.getItemCount() - 1;
        if (itemCount >= 0) {
            if (i == 1) {
                RecyclerView.AbstractC11834D findViewHolderForAdapterPosition = this.recyclerView.findViewHolderForAdapterPosition(itemCount);
                if (findViewHolderForAdapterPosition != null) {
                    i2 = findViewHolderForAdapterPosition.itemView.getHeight();
                } else {
                    i2 = 0;
                }
                this.linearLayoutManager.m66731S2(itemCount, (this.recyclerView.getPaddingBottom() + i2) * (-1));
            } else if (i == 3) {
                C11939n c11939n = new C11939n(this.recyclerView.getContext()) { // from class: zendesk.messaging.ui.RecyclerViewScroller.6
                    @Override // androidx.recyclerview.widget.C11939n
                    public int calculateTimeForScrolling(int i3) {
                        return 50;
                    }
                };
                c11939n.setTargetPosition(itemCount);
                this.linearLayoutManager.m66598b2(c11939n);
            } else if (i == 2) {
                C11939n c11939n2 = new C11939n(this.recyclerView.getContext());
                c11939n2.setTargetPosition(itemCount);
                this.linearLayoutManager.m66598b2(c11939n2);
            }
        }
    }

    public void install(final InputBox inputBox) {
        inputBox.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: zendesk.messaging.ui.RecyclerViewScroller.4
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, final int i2, int i3, int i4, int i5, final int i6, int i7, int i8) {
                RecyclerViewScroller.this.recyclerView.post(new Runnable() { // from class: zendesk.messaging.ui.RecyclerViewScroller.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        int paddingLeft = RecyclerViewScroller.this.recyclerView.getPaddingLeft();
                        int paddingRight = RecyclerViewScroller.this.recyclerView.getPaddingRight();
                        int paddingTop = RecyclerViewScroller.this.recyclerView.getPaddingTop();
                        int height = inputBox.getHeight();
                        if (height != RecyclerViewScroller.this.recyclerView.getPaddingBottom()) {
                            RecyclerViewScroller.this.recyclerView.setPadding(paddingLeft, paddingTop, paddingRight, height);
                            RecyclerViewScroller.this.recyclerView.scrollBy(0, i6 - i2);
                        }
                    }
                });
            }
        });
        inputBox.addSendButtonClickListener(new View.OnClickListener() { // from class: zendesk.messaging.ui.RecyclerViewScroller.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                RecyclerViewScroller.this.postScrollToBottom(1);
            }
        });
    }
}
