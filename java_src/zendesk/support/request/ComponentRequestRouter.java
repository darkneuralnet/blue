package zendesk.support.request;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.transition.C12055c;
import androidx.transition.Fade;
import java.util.concurrent.atomic.AtomicReference;
import zendesk.support.request.StateError;
import zendesk.support.suas.Listener;
import zendesk.support.suas.State;
import zendesk.support.suas.StateSelector;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ComponentRequestRouter implements Listener<RequestScreen> {
    private final AppCompatActivity activity;
    private final RequestComponent component;
    private RequestView currentScreen;
    private final RequestViewConversationsDisabled disabledView;
    private final RequestViewConversationsEnabled enabledView;
    private final boolean isCleanStart;
    private final RequestViewLoading loadingView;
    private final ViewGroup root;
    private final AtomicReference<RequestScreen> screen = new AtomicReference<>();

    /* renamed from: zendesk.support.request.ComponentRequestRouter$1 */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C313971 {

        /* renamed from: $SwitchMap$zendesk$support$request$ComponentRequestRouter$RequestScreen */
        static final /* synthetic */ int[] f121980xa0706e24;

        static {
            int[] iArr = new int[RequestScreen.values().length];
            f121980xa0706e24 = iArr;
            try {
                iArr[RequestScreen.Loading.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f121980xa0706e24[RequestScreen.EmailForm.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f121980xa0706e24[RequestScreen.Conversation.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f121980xa0706e24[RequestScreen.Fin.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class RequestRouterSelector implements StateSelector<RequestScreen> {
        @Override // zendesk.support.suas.StateSelector
        public RequestScreen selectData(State state) {
            StateConfig fromState = StateConfig.fromState(state);
            StateConversation fromState2 = StateConversation.fromState(state);
            StateSettings settings = fromState.getSettings();
            StateError fromState3 = StateError.fromState(state);
            boolean hasSettings = settings.hasSettings();
            boolean m27273b = C44504lS5.m27273b(fromState2.getRemoteId());
            boolean isConversationsEnabled = settings.isConversationsEnabled();
            boolean hasIdentityEmailAddress = settings.hasIdentityEmailAddress();
            boolean isNeverRequestEmailOn = settings.isNeverRequestEmailOn();
            if (fromState3.getState() == StateError.ErrorType.NoAccess) {
                C33694Ix2.m101454e("RequestActivity", "Network returned 'No Access'. Ticket is not longer valid. Error: '%s'", fromState3.getMessage());
                return RequestScreen.Fin;
            } else if (hasSettings) {
                if (isConversationsEnabled) {
                    return RequestScreen.Conversation;
                }
                if (m27273b) {
                    C33694Ix2.m101447l("RequestActivity", "Conversations are disabled. Exiting RequestActivity", new Object[0]);
                    return RequestScreen.Fin;
                } else if (!hasIdentityEmailAddress && isNeverRequestEmailOn) {
                    C33694Ix2.m101447l("RequestActivity", "Conversations are disabled, never request email is enabled, with this configuration tickets would go into a black hole. Exiting RequestActivity.", new Object[0]);
                    return RequestScreen.Fin;
                } else {
                    return RequestScreen.EmailForm;
                }
            } else {
                return RequestScreen.Loading;
            }
        }
    }

    /* loaded from: classes8.dex */
    public enum RequestScreen {
        Loading,
        EmailForm,
        Conversation,
        Fin
    }

    public ComponentRequestRouter(AppCompatActivity appCompatActivity, ViewGroup viewGroup, RequestViewConversationsDisabled requestViewConversationsDisabled, RequestViewConversationsEnabled requestViewConversationsEnabled, RequestViewLoading requestViewLoading, RequestComponent requestComponent, boolean z) {
        this.activity = appCompatActivity;
        this.root = viewGroup;
        this.disabledView = requestViewConversationsDisabled;
        this.enabledView = requestViewConversationsEnabled;
        this.loadingView = requestViewLoading;
        this.component = requestComponent;
        this.isCleanStart = z;
    }

    public static ComponentRequestRouter create(AppCompatActivity appCompatActivity, boolean z, RequestComponent requestComponent) {
        return new ComponentRequestRouter(appCompatActivity, (ViewGroup) appCompatActivity.findViewById(C35181Pg4.activity_request_root), (RequestViewConversationsDisabled) appCompatActivity.findViewById(C35181Pg4.activity_request_conversation_disabled), (RequestViewConversationsEnabled) appCompatActivity.findViewById(C35181Pg4.activity_request_conversation), (RequestViewLoading) appCompatActivity.findViewById(C35181Pg4.activity_request_loading), requestComponent, z);
    }

    private void displayView(View view, View... viewArr) {
        C12055c.m65804b(this.root, new Fade());
        view.setVisibility(0);
        for (View view2 : viewArr) {
            view2.setVisibility(8);
        }
        this.activity.invalidateOptionsMenu();
        C12055c.m65802d(this.root);
    }

    public RequestView getCurrentScreen() {
        return this.currentScreen;
    }

    public StateSelector<RequestScreen> getSelector() {
        return new RequestRouterSelector();
    }

    @Override // zendesk.support.suas.Listener
    public void update(RequestScreen requestScreen) {
        if (this.screen.getAndSet(requestScreen) == requestScreen) {
            return;
        }
        int i = C313971.f121980xa0706e24[requestScreen.ordinal()];
        if (i == 1) {
            C33694Ix2.m101457b("RequestActivity", "Installing screen: 'Loading Screen'", new Object[0]);
            RequestViewLoading requestViewLoading = this.loadingView;
            this.currentScreen = requestViewLoading;
            displayView(requestViewLoading, this.disabledView, this.enabledView);
        } else if (i == 2) {
            C33694Ix2.m101457b("RequestActivity", "Installing screen: 'Conversations Disabled Screen'", new Object[0]);
            RequestViewConversationsDisabled requestViewConversationsDisabled = this.disabledView;
            this.currentScreen = requestViewConversationsDisabled;
            displayView(requestViewConversationsDisabled, this.enabledView, this.loadingView);
            this.disabledView.init(this.component);
        } else if (i != 3) {
            if (i != 4) {
                return;
            }
            C33694Ix2.m101457b("RequestActivity", "Installing screen: 'Finish'", new Object[0]);
            this.activity.finish();
        } else {
            C33694Ix2.m101457b("RequestActivity", "Installing screen: 'Conversations Enabled Screen'", new Object[0]);
            RequestViewConversationsEnabled requestViewConversationsEnabled = this.enabledView;
            this.currentScreen = requestViewConversationsEnabled;
            displayView(requestViewConversationsEnabled, this.disabledView, this.loadingView);
            this.enabledView.init(this.component, this.isCleanStart);
        }
    }
}
