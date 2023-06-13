package zendesk.support.request;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import zendesk.belvedere.BelvedereUi;
import zendesk.belvedere.C31098b;
import zendesk.support.suas.CombinedSubscription;
import zendesk.support.suas.Store;
import zendesk.support.suas.Subscription;
/* loaded from: classes8.dex */
public class RequestViewConversationsDisabled extends FrameLayout implements RequestView {
    private AppCompatActivity activity;

    /* renamed from: af */
    ActionFactory f121999af;
    private AttachmentHelper attachmentHelper;
    private C31098b imageStream;
    private ComponentInputForm inputFormComponent;
    private List<MenuItemsDelegate> menuItemsDelegates;
    C42732iT3 picasso;
    Store store;
    private Subscription subscription;

    /* loaded from: classes8.dex */
    public interface MenuItemsDelegate {
        void onMenuItemsClicked(MenuItem menuItem);

        void onMenuItemsInflated(MenuItem menuItem, MenuItem menuItem2);
    }

    public RequestViewConversationsDisabled(Context context) {
        super(context);
        this.menuItemsDelegates = new ArrayList();
        viewInit(context);
    }

    private Subscription bindAttachmentCarousel(Store store, ActionFactory actionFactory) {
        RecyclerView recyclerView = (RecyclerView) this.activity.findViewById(C35181Pg4.request_attachment_carousel);
        AdapterAttachmentCarousel adapterAttachmentCarousel = new AdapterAttachmentCarousel(this.attachmentHelper, this.picasso, actionFactory, store);
        ComponentAttachmentCarousel componentAttachmentCarousel = new ComponentAttachmentCarousel(store, actionFactory, this.imageStream, this.activity, this.attachmentHelper, recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.activity, 0, false));
        recyclerView.setAdapter(adapterAttachmentCarousel);
        this.menuItemsDelegates.add(componentAttachmentCarousel);
        return store.addListener(componentAttachmentCarousel.getSelector(), componentAttachmentCarousel);
    }

    private Subscription bindComponents(Store store, ActionFactory actionFactory) {
        return CombinedSubscription.from(bindInput(store), bindAttachmentCarousel(store, actionFactory));
    }

    private Subscription bindInput(Store store) {
        ComponentInputForm create = ComponentInputForm.create(this, store, this.f121999af, this.attachmentHelper);
        this.inputFormComponent = create;
        this.menuItemsDelegates.add(create);
        this.imageStream.m757A9().m813i(this.inputFormComponent);
        return store.addListener(this.inputFormComponent.getSelector(), this.inputFormComponent);
    }

    private void viewInit(Context context) {
        View.inflate(context, C52975zk4.zs_view_request_conversations_disabled, this);
        this.activity = (AppCompatActivity) context;
    }

    @Override // zendesk.support.request.RequestView
    public boolean hasUnsavedInput() {
        ComponentInputForm componentInputForm = this.inputFormComponent;
        return componentInputForm != null && componentInputForm.hasUnsavedInput();
    }

    @Override // zendesk.support.request.RequestView
    public boolean inflateMenu(MenuInflater menuInflater, Menu menu) {
        menuInflater.inflate(C34047Kk4.zs_view_request_conversations_disabled_menu, menu);
        MenuItem findItem = menu.findItem(C35181Pg4.request_conversations_disabled_menu_ic_send);
        MenuItem findItem2 = menu.findItem(C35181Pg4.request_conversations_disabled_menu_ic_add_attachments);
        for (MenuItemsDelegate menuItemsDelegate : this.menuItemsDelegates) {
            menuItemsDelegate.onMenuItemsInflated(findItem, findItem2);
        }
        return true;
    }

    public void init(RequestComponent requestComponent) {
        requestComponent.inject(this);
        this.imageStream = BelvedereUi.m865b(this.activity);
        this.attachmentHelper = new AttachmentHelper(new int[0]);
        Subscription bindComponents = bindComponents(this.store, this.f121999af);
        this.subscription = bindComponents;
        bindComponents.informWithCurrentState();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Subscription subscription = this.subscription;
        if (subscription != null) {
            subscription.removeListener();
        }
    }

    @Override // zendesk.support.request.RequestView
    public boolean onOptionsItemClicked(MenuItem menuItem) {
        for (MenuItemsDelegate menuItemsDelegate : this.menuItemsDelegates) {
            menuItemsDelegate.onMenuItemsClicked(menuItem);
        }
        return true;
    }

    public RequestViewConversationsDisabled(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.menuItemsDelegates = new ArrayList();
        viewInit(context);
    }

    public RequestViewConversationsDisabled(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.menuItemsDelegates = new ArrayList();
        viewInit(context);
    }
}
