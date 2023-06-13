package zendesk.messaging.p061ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.TimeUnit;
import zendesk.commonui.AlmostRealProgressBar;
import zendesk.messaging.EventFactory;
import zendesk.messaging.EventListener;
import zendesk.messaging.R$id;
import zendesk.messaging.R$layout;
/* renamed from: zendesk.messaging.ui.MessagingView */
/* loaded from: classes8.dex */
public class MessagingView extends CoordinatorLayout {
    public static final long DEFAULT_ANIMATION_DURATION = TimeUnit.MILLISECONDS.toMillis(300);
    private final CellListAdapter cellListAdapter;
    private final LostConnectionBanner lostConnectionBanner;
    private final AlmostRealProgressBar progressBar;

    public MessagingView(Context context) {
        this(context, null);
    }

    public void renderState(MessagingState messagingState, MessagingCellFactory messagingCellFactory, C42732iT3 c42732iT3, final EventListener eventListener, final EventFactory eventFactory) {
        if (messagingState == null) {
            return;
        }
        this.cellListAdapter.submitList(messagingCellFactory.createCells(messagingState.messagingItems, messagingState.typingState, c42732iT3, messagingState.attachmentSettings));
        if (messagingState.progressBarVisible) {
            this.progressBar.m633n(AlmostRealProgressBar.f121892h);
        } else {
            this.progressBar.m631p(300L);
        }
        this.lostConnectionBanner.update(messagingState.connectionState);
        this.lostConnectionBanner.setOnRetryConnectionClickListener(new View.OnClickListener() { // from class: zendesk.messaging.ui.MessagingView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                eventListener.onEvent(eventFactory.reconnectButtonClick());
            }
        });
    }

    public MessagingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MessagingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R$layout.zui_view_messaging, (ViewGroup) this, true);
        this.progressBar = (AlmostRealProgressBar) findViewById(R$id.zui_progressBar);
        CellListAdapter cellListAdapter = new CellListAdapter();
        this.cellListAdapter = cellListAdapter;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        RecyclerView recyclerView = (RecyclerView) findViewById(R$id.zui_recycler_view);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(cellListAdapter);
        recyclerView.getRecycledViewPool().m66545m(R$layout.zui_cell_response_options_stacked, 0);
        C11894g c11894g = new C11894g();
        long j = DEFAULT_ANIMATION_DURATION;
        c11894g.setAddDuration(j);
        c11894g.setChangeDuration(j);
        c11894g.setRemoveDuration(j);
        c11894g.setMoveDuration(j);
        c11894g.setSupportsChangeAnimations(false);
        recyclerView.setItemAnimator(c11894g);
        InputBox inputBox = (InputBox) findViewById(R$id.zui_input_box);
        this.lostConnectionBanner = LostConnectionBanner.create(this, recyclerView, inputBox);
        new RecyclerViewScroller(recyclerView, linearLayoutManager, cellListAdapter).install(inputBox);
    }
}
