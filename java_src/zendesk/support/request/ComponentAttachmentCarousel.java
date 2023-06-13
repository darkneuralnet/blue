package zendesk.support.request;

import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.List;
import zendesk.belvedere.C31098b;
import zendesk.belvedere.MediaResult;
import zendesk.support.request.RequestViewConversationsDisabled;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.Listener;
import zendesk.support.suas.State;
import zendesk.support.suas.StateSelector;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ComponentAttachmentCarousel implements C31098b.InterfaceC31100b, Listener<AttachmentCarouselModel>, RequestViewConversationsDisabled.MenuItemsDelegate {
    private final ActionFactory actionFactory;
    private final AppCompatActivity activity;
    private MenuItem attachmentButton;
    private final AttachmentHelper attachmentHelper;
    private final Dispatcher dispatcher;
    private final C31098b imageStream;
    private final RecyclerView recyclerView;
    private final ScrollView scrollView;
    private boolean attachmentSupportEnabled = false;
    private final StateSelector<AttachmentCarouselModel> selector = new AttachmentCarouselSelector();

    /* loaded from: classes8.dex */
    public static class AttachmentCarouselModel {
        private final Collection<StateRequestAttachment> additionalAttachments;
        private final boolean isAttachmentSupportEnabled;
        private final boolean isLoading;
        private final long maxAttachmentSize;
        private final Collection<StateRequestAttachment> selectedAttachments;

        public AttachmentCarouselModel(Collection<StateRequestAttachment> collection, Collection<StateRequestAttachment> collection2, boolean z, boolean z2, long j) {
            this.selectedAttachments = collection;
            this.additionalAttachments = collection2;
            this.isLoading = z;
            this.isAttachmentSupportEnabled = z2;
            this.maxAttachmentSize = j;
        }

        public Collection<StateRequestAttachment> getAdditionalAttachments() {
            return this.additionalAttachments;
        }

        public long getMaxAttachmentSize() {
            return this.maxAttachmentSize;
        }

        public Collection<StateRequestAttachment> getSelectedAttachments() {
            return this.selectedAttachments;
        }

        public boolean isAttachmentSupportEnabled() {
            return this.isAttachmentSupportEnabled;
        }

        public boolean isLoading() {
            return this.isLoading;
        }
    }

    /* loaded from: classes8.dex */
    public static class AttachmentCarouselSelector implements StateSelector<AttachmentCarouselModel> {
        @Override // zendesk.support.suas.StateSelector
        public AttachmentCarouselModel selectData(State state) {
            StateAttachments fromState = StateAttachments.fromState(state);
            StateConfig fromState2 = StateConfig.fromState(state);
            return new AttachmentCarouselModel(fromState.getSelectedAttachments(), fromState.getAllSelectedAttachments(), StateProgress.fomState(state).getRunningRequests() > 0, fromState2.getSettings().isAttachmentsEnabled(), fromState2.getSettings().getMaxAttachmentSize());
        }
    }

    public ComponentAttachmentCarousel(Dispatcher dispatcher, ActionFactory actionFactory, C31098b c31098b, AppCompatActivity appCompatActivity, AttachmentHelper attachmentHelper, RecyclerView recyclerView) {
        this.dispatcher = dispatcher;
        this.actionFactory = actionFactory;
        this.imageStream = c31098b;
        this.activity = appCompatActivity;
        this.attachmentHelper = attachmentHelper;
        this.recyclerView = recyclerView;
        this.scrollView = (ScrollView) appCompatActivity.findViewById(C35181Pg4.request_conversations_disabled_scrollview);
        initImagePicker();
    }

    private void attachmentButtonVisibility(boolean z, boolean z2) {
        MenuItem menuItem = this.attachmentButton;
        if (menuItem != null) {
            menuItem.setVisible(z);
            this.attachmentButton.getActionView().setEnabled(z2);
        }
    }

    private void attachmentCount(int i) {
        MenuItem menuItem = this.attachmentButton;
        if (menuItem != null) {
            ((ViewCellAttachmentMenuItem) menuItem.getActionView()).setBadgeCount(i);
        }
    }

    private void initImagePicker() {
        this.imageStream.m750N6(this);
        if (this.imageStream.m757A9().m811k().hasFocus()) {
            this.scrollView.requestFocus();
        }
        if (this.imageStream.m744ea()) {
            this.scrollView.post(new Runnable() { // from class: zendesk.support.request.ComponentAttachmentCarousel.1
                @Override // java.lang.Runnable
                public void run() {
                    ComponentAttachmentCarousel.this.onAddAttachmentsRequested(true);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAddAttachmentsRequested(boolean z) {
        if (!this.imageStream.m755D9()) {
            this.attachmentHelper.showImagePicker(this.activity);
        } else if (z) {
            this.imageStream.dismiss();
        }
    }

    private void scroll(final int i) {
        this.scrollView.post(new Runnable() { // from class: zendesk.support.request.ComponentAttachmentCarousel.2
            @Override // java.lang.Runnable
            public void run() {
                ComponentAttachmentCarousel.this.scrollView.fullScroll(i);
            }
        });
    }

    public StateSelector<AttachmentCarouselModel> getSelector() {
        return this.selector;
    }

    @Override // zendesk.belvedere.C31098b.InterfaceC31100b
    public void onDismissed() {
        this.scrollView.requestFocus();
        scroll(33);
    }

    @Override // zendesk.belvedere.C31098b.InterfaceC31100b
    public void onMediaDeselected(List<MediaResult> list) {
        this.dispatcher.dispatch(this.actionFactory.deselectAttachment(list));
        onAddAttachmentsRequested(false);
    }

    @Override // zendesk.belvedere.C31098b.InterfaceC31100b
    public void onMediaSelected(List<MediaResult> list) {
        this.dispatcher.dispatch(this.actionFactory.selectAttachment(list));
        onAddAttachmentsRequested(false);
    }

    @Override // zendesk.support.request.RequestViewConversationsDisabled.MenuItemsDelegate
    public void onMenuItemsClicked(MenuItem menuItem) {
    }

    @Override // zendesk.support.request.RequestViewConversationsDisabled.MenuItemsDelegate
    public void onMenuItemsInflated(MenuItem menuItem, MenuItem menuItem2) {
        this.attachmentButton = menuItem2;
        menuItem2.getActionView().setOnClickListener(new View.OnClickListener() { // from class: zendesk.support.request.ComponentAttachmentCarousel.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ComponentAttachmentCarousel.this.onAddAttachmentsRequested(true);
            }
        });
        attachmentButtonVisibility(this.attachmentSupportEnabled, true);
    }

    @Override // zendesk.belvedere.C31098b.InterfaceC31100b
    public void onVisible() {
        scroll(130);
    }

    @Override // zendesk.support.suas.Listener
    public void update(AttachmentCarouselModel attachmentCarouselModel) {
        boolean isAttachmentSupportEnabled = attachmentCarouselModel.isAttachmentSupportEnabled();
        this.attachmentSupportEnabled = isAttachmentSupportEnabled;
        attachmentButtonVisibility(isAttachmentSupportEnabled, !attachmentCarouselModel.isLoading());
        if (attachmentCarouselModel.isLoading()) {
            return;
        }
        this.attachmentHelper.updateAttachments(attachmentCarouselModel.getSelectedAttachments(), attachmentCarouselModel.getAdditionalAttachments());
        this.attachmentHelper.updateMaxFileSize(attachmentCarouselModel.getMaxAttachmentSize());
        attachmentCount(this.attachmentHelper.getSelectedAttachments().size());
        if (this.attachmentHelper.getSelectedAttachments().size() > 0) {
            scroll(130);
        } else {
            scroll(33);
        }
        this.recyclerView.getAdapter().notifyDataSetChanged();
    }
}
