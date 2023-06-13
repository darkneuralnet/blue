package zendesk.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.snackbar.Snackbar;
import java.util.List;
import zendesk.messaging.Banner;
import zendesk.messaging.MessagingConfiguration;
import zendesk.messaging.Update;
import zendesk.messaging.p061ui.InputBox;
import zendesk.messaging.p061ui.MessagingCellFactory;
import zendesk.messaging.p061ui.MessagingComposer;
import zendesk.messaging.p061ui.MessagingState;
import zendesk.messaging.p061ui.MessagingView;
/* loaded from: classes8.dex */
public class MessagingActivity extends AppCompatActivity {
    EventFactory eventFactory;
    MessagingCellFactory messagingCellFactory;
    MessagingComposer messagingComposer;
    MessagingDialog messagingDialog;
    private MessagingView messagingView;
    C42732iT3 picasso;
    MessagingViewModel viewModel;

    public static MessagingConfiguration.Builder builder() {
        return new MessagingConfiguration.Builder();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        MessagingViewModel messagingViewModel = this.viewModel;
        if (messagingViewModel != null) {
            messagingViewModel.onEvent(this.eventFactory.onActivityResult(i, i2, intent));
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getTheme().applyStyle(R$style.ZendeskActivityDefaultTheme, true);
        MessagingConfiguration messagingConfiguration = (MessagingConfiguration) new C32054Bx0().m113275f(getIntent().getExtras(), MessagingConfiguration.class);
        if (messagingConfiguration == null) {
            C33694Ix2.m101454e("MessagingActivity", "No configuration found. Please use MessagingActivity.builder()", new Object[0]);
            finish();
            return;
        }
        C41352g80 m39983a5 = C41352g80.m39983a5(this);
        MessagingComponent messagingComponent = (MessagingComponent) m39983a5.m39984N6("messaging_component");
        if (messagingComponent == null) {
            List<Engine> engines = messagingConfiguration.getEngines();
            if (C43505jm0.m29950g(engines)) {
                C33694Ix2.m101454e("MessagingActivity", "No Engines found in MessagingConfiguration. Please use MessagingActivity.builder()", new Object[0]);
                finish();
                return;
            }
            messagingComponent = DaggerMessagingComponent.builder().appContext(getApplicationContext()).engines(engines).messagingConfiguration(messagingConfiguration).build();
            messagingComponent.messagingViewModel().start();
            m39983a5.m39982t8("messaging_component", messagingComponent);
        }
        DaggerMessagingActivityComponent.builder().messagingComponent(messagingComponent).activity(this).build().inject(this);
        setContentView(R$layout.zui_activity_messaging);
        this.messagingView = (MessagingView) findViewById(R$id.zui_view_messaging);
        Toolbar toolbar = (Toolbar) findViewById(R$id.zui_toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: zendesk.messaging.MessagingActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MessagingActivity.this.finish();
            }
        });
        toolbar.setTitle(messagingConfiguration.getToolbarTitle(getResources()));
        this.messagingComposer.bind((InputBox) findViewById(R$id.zui_input_box));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        if (this.viewModel == null) {
            return false;
        }
        menu.clear();
        List<MenuItem> value = this.viewModel.getLiveMenuItems().getValue();
        if (C43505jm0.m29950g(value)) {
            C33694Ix2.m101457b("MessagingActivity", "Menu: no items, hiding...", new Object[0]);
            return false;
        }
        for (MenuItem menuItem : value) {
            menu.add(0, menuItem.getItemId(), 0, menuItem.getLabelId());
        }
        C33694Ix2.m101457b("MessagingActivity", "Menu: items updated.", new Object[0]);
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!isChangingConfigurations() && this.viewModel != null) {
            C33694Ix2.m101457b("MessagingActivity", "onDestroy() called, clearing...", new Object[0]);
            this.viewModel.onCleared();
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        super.onOptionsItemSelected(menuItem);
        this.viewModel.onEvent(this.eventFactory.menuItemClicked(menuItem.getItemId()));
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        MessagingViewModel messagingViewModel = this.viewModel;
        if (messagingViewModel != null) {
            messagingViewModel.getLiveMessagingState().observe(this, new InterfaceC41056fe3<MessagingState>() { // from class: zendesk.messaging.MessagingActivity.2
                @Override // p000.InterfaceC41056fe3
                public void onChanged(MessagingState messagingState) {
                    MessagingView messagingView = MessagingActivity.this.messagingView;
                    MessagingActivity messagingActivity = MessagingActivity.this;
                    messagingView.renderState(messagingState, messagingActivity.messagingCellFactory, messagingActivity.picasso, messagingActivity.viewModel, messagingActivity.eventFactory);
                }
            });
            this.viewModel.getLiveNavigationStream().observe(this, new InterfaceC41056fe3<Update.Action.Navigation>() { // from class: zendesk.messaging.MessagingActivity.3
                @Override // p000.InterfaceC41056fe3
                public void onChanged(Update.Action.Navigation navigation) {
                    if (navigation != null) {
                        navigation.navigate(MessagingActivity.this);
                    }
                }
            });
            this.viewModel.getLiveInterfaceUpdateItems().observe(this, new InterfaceC41056fe3<Banner>() { // from class: zendesk.messaging.MessagingActivity.4
                @Override // p000.InterfaceC41056fe3
                public void onChanged(Banner banner) {
                    if (banner == null || banner.getPosition() != Banner.Position.BOTTOM) {
                        return;
                    }
                    Snackbar.m48855o0(MessagingActivity.this.findViewById(R$id.zui_recycler_view), banner.getLabel(), 0).mo48864Y();
                }
            });
            this.viewModel.getLiveMenuItems().observe(this, new InterfaceC41056fe3<List<MenuItem>>() { // from class: zendesk.messaging.MessagingActivity.5
                @Override // p000.InterfaceC41056fe3
                public void onChanged(List<MenuItem> list) {
                    MessagingActivity.this.invalidateOptionsMenu();
                }
            });
            this.viewModel.getDialogUpdates().observe(this, this.messagingDialog);
        }
    }
}
