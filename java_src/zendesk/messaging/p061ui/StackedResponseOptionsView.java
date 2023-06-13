package zendesk.messaging.p061ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import zendesk.messaging.MessagingItem;
import zendesk.messaging.R$drawable;
import zendesk.messaging.R$id;
import zendesk.messaging.R$layout;
/* renamed from: zendesk.messaging.ui.StackedResponseOptionsView */
/* loaded from: classes8.dex */
public class StackedResponseOptionsView extends FrameLayout implements Updatable<ResponseOptionsViewState> {
    private ResponseOptionsAdapter adapter;

    public StackedResponseOptionsView(Context context) {
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
        recyclerView.setItemAnimator(null);
        C36915Wr1 c36915Wr1 = new C36915Wr1(getContext());
        c36915Wr1.m77795n(3);
        Drawable m94299e = NA0.m94299e(getContext(), R$drawable.zui_view_stacked_response_options_divider);
        if (m94299e != null) {
            c36915Wr1.m77798k(m94299e);
        }
        recyclerView.setLayoutManager(new FlexboxLayoutManager(getContext(), 1));
        recyclerView.addItemDecoration(c36915Wr1);
        ResponseOptionsAdapter responseOptionsAdapter = new ResponseOptionsAdapter();
        this.adapter = responseOptionsAdapter;
        recyclerView.setAdapter(responseOptionsAdapter);
    }

    @Override // zendesk.messaging.p061ui.Updatable
    public void update(final ResponseOptionsViewState responseOptionsViewState) {
        responseOptionsViewState.getProps().apply(this);
        this.adapter.setResponseOptionHandler(new ResponseOptionHandler() { // from class: zendesk.messaging.ui.StackedResponseOptionsView.1
            @Override // zendesk.messaging.p061ui.ResponseOptionHandler
            public void onResponseOptionSelected(MessagingItem.Option option) {
                StackedResponseOptionsView.this.adapter.setSelectedOption(option);
                responseOptionsViewState.getListener().onResponseOptionSelected(option);
            }
        });
        this.adapter.submitList(responseOptionsViewState.getOptions());
    }

    public StackedResponseOptionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public StackedResponseOptionsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
