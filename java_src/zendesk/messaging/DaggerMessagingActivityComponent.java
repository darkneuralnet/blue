package zendesk.messaging;

import android.content.res.Resources;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import zendesk.belvedere.C31096a;
import zendesk.belvedere.C31098b;
import zendesk.messaging.MessagingActivityComponent;
import zendesk.messaging.components.DateProvider;
import zendesk.messaging.p061ui.AvatarStateFactory_Factory;
import zendesk.messaging.p061ui.AvatarStateRenderer_Factory;
import zendesk.messaging.p061ui.InputBoxAttachmentClickListener_Factory;
import zendesk.messaging.p061ui.InputBoxConsumer;
import zendesk.messaging.p061ui.InputBoxConsumer_Factory;
import zendesk.messaging.p061ui.MessagingCellFactory;
import zendesk.messaging.p061ui.MessagingCellFactory_Factory;
import zendesk.messaging.p061ui.MessagingCellPropsFactory;
import zendesk.messaging.p061ui.MessagingCellPropsFactory_Factory;
import zendesk.messaging.p061ui.MessagingComposer;
import zendesk.messaging.p061ui.MessagingComposer_Factory;
/* loaded from: classes8.dex */
final class DaggerMessagingActivityComponent implements MessagingActivityComponent {
    private Y94<AppCompatActivity> activityProvider;
    private Y94 avatarStateRendererProvider;
    private Y94<BelvedereMediaHolder> belvedereMediaHolderProvider;
    private Y94<BelvedereMediaResolverCallback> belvedereMediaResolverCallbackProvider;
    private Y94<C31096a> belvedereProvider;
    private Y94<C31098b> belvedereUiProvider;
    private Y94<DateProvider> dateProvider;
    private Y94<EventFactory> eventFactoryProvider;
    private Y94<Handler> handlerProvider;
    private Y94 inputBoxAttachmentClickListenerProvider;
    private Y94<InputBoxConsumer> inputBoxConsumerProvider;
    private final DaggerMessagingActivityComponent messagingActivityComponent;
    private Y94<MessagingCellFactory> messagingCellFactoryProvider;
    private Y94<MessagingCellPropsFactory> messagingCellPropsFactoryProvider;
    private final MessagingComponent messagingComponent;
    private Y94<MessagingComponent> messagingComponentProvider;
    private Y94<MessagingComposer> messagingComposerProvider;
    private Y94<MessagingDialog> messagingDialogProvider;
    private Y94<MessagingViewModel> messagingViewModelProvider;
    private Y94<Boolean> multilineResponseOptionsEnabledProvider;
    private Y94<C42732iT3> picassoProvider;
    private Y94<Resources> resourcesProvider;
    private Y94<TypingEventDispatcher> typingEventDispatcherProvider;

    /* loaded from: classes8.dex */
    public static final class Builder implements MessagingActivityComponent.Builder {
        private AppCompatActivity activity;
        private MessagingComponent messagingComponent;

        private Builder() {
        }

        @Override // zendesk.messaging.MessagingActivityComponent.Builder
        public MessagingActivityComponent build() {
            C51679xZ3.m5006a(this.activity, AppCompatActivity.class);
            C51679xZ3.m5006a(this.messagingComponent, MessagingComponent.class);
            return new DaggerMessagingActivityComponent(this.messagingComponent, this.activity);
        }

        @Override // zendesk.messaging.MessagingActivityComponent.Builder
        public Builder activity(AppCompatActivity appCompatActivity) {
            this.activity = (AppCompatActivity) C51679xZ3.m5005b(appCompatActivity);
            return this;
        }

        @Override // zendesk.messaging.MessagingActivityComponent.Builder
        public Builder messagingComponent(MessagingComponent messagingComponent) {
            this.messagingComponent = (MessagingComponent) C51679xZ3.m5005b(messagingComponent);
            return this;
        }
    }

    /* loaded from: classes8.dex */
    public static final class zendesk_messaging_MessagingComponent_belvedere implements Y94<C31096a> {
        private final MessagingComponent messagingComponent;

        public zendesk_messaging_MessagingComponent_belvedere(MessagingComponent messagingComponent) {
            this.messagingComponent = messagingComponent;
        }

        @Override // p000.Y94
        public C31096a get() {
            return (C31096a) C51679xZ3.m5003d(this.messagingComponent.belvedere());
        }
    }

    /* loaded from: classes8.dex */
    public static final class zendesk_messaging_MessagingComponent_belvedereMediaHolder implements Y94<BelvedereMediaHolder> {
        private final MessagingComponent messagingComponent;

        public zendesk_messaging_MessagingComponent_belvedereMediaHolder(MessagingComponent messagingComponent) {
            this.messagingComponent = messagingComponent;
        }

        @Override // p000.Y94
        public BelvedereMediaHolder get() {
            return (BelvedereMediaHolder) C51679xZ3.m5003d(this.messagingComponent.belvedereMediaHolder());
        }
    }

    /* loaded from: classes8.dex */
    public static final class zendesk_messaging_MessagingComponent_messagingViewModel implements Y94<MessagingViewModel> {
        private final MessagingComponent messagingComponent;

        public zendesk_messaging_MessagingComponent_messagingViewModel(MessagingComponent messagingComponent) {
            this.messagingComponent = messagingComponent;
        }

        @Override // p000.Y94
        public MessagingViewModel get() {
            return (MessagingViewModel) C51679xZ3.m5003d(this.messagingComponent.messagingViewModel());
        }
    }

    /* loaded from: classes8.dex */
    public static final class zendesk_messaging_MessagingComponent_picasso implements Y94<C42732iT3> {
        private final MessagingComponent messagingComponent;

        public zendesk_messaging_MessagingComponent_picasso(MessagingComponent messagingComponent) {
            this.messagingComponent = messagingComponent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.Y94
        public C42732iT3 get() {
            return (C42732iT3) C51679xZ3.m5003d(this.messagingComponent.picasso());
        }
    }

    /* loaded from: classes8.dex */
    public static final class zendesk_messaging_MessagingComponent_resources implements Y94<Resources> {
        private final MessagingComponent messagingComponent;

        public zendesk_messaging_MessagingComponent_resources(MessagingComponent messagingComponent) {
            this.messagingComponent = messagingComponent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.Y94
        public Resources get() {
            return (Resources) C51679xZ3.m5003d(this.messagingComponent.resources());
        }
    }

    public static MessagingActivityComponent.Builder builder() {
        return new Builder();
    }

    private void initialize(MessagingComponent messagingComponent, AppCompatActivity appCompatActivity) {
        zendesk_messaging_MessagingComponent_resources zendesk_messaging_messagingcomponent_resources = new zendesk_messaging_MessagingComponent_resources(messagingComponent);
        this.resourcesProvider = zendesk_messaging_messagingcomponent_resources;
        this.messagingCellPropsFactoryProvider = V51.m80429b(MessagingCellPropsFactory_Factory.create(zendesk_messaging_messagingcomponent_resources));
        this.dateProvider = V51.m80429b(MessagingActivityModule_DateProviderFactory.create());
        this.messagingViewModelProvider = new zendesk_messaging_MessagingComponent_messagingViewModel(messagingComponent);
        this.eventFactoryProvider = V51.m80429b(EventFactory_Factory.create(this.dateProvider));
        zendesk_messaging_MessagingComponent_picasso zendesk_messaging_messagingcomponent_picasso = new zendesk_messaging_MessagingComponent_picasso(messagingComponent);
        this.picassoProvider = zendesk_messaging_messagingcomponent_picasso;
        this.avatarStateRendererProvider = V51.m80429b(AvatarStateRenderer_Factory.create(zendesk_messaging_messagingcomponent_picasso));
        InterfaceC48812sj1 m44621a = C39546d52.m44621a(messagingComponent);
        this.messagingComponentProvider = m44621a;
        this.multilineResponseOptionsEnabledProvider = V51.m80429b(MessagingActivityModule_MultilineResponseOptionsEnabledFactory.create(m44621a));
        this.messagingCellFactoryProvider = V51.m80429b(MessagingCellFactory_Factory.create(this.messagingCellPropsFactoryProvider, this.dateProvider, this.messagingViewModelProvider, this.eventFactoryProvider, this.avatarStateRendererProvider, AvatarStateFactory_Factory.create(), this.multilineResponseOptionsEnabledProvider));
        InterfaceC48812sj1 m44621a2 = C39546d52.m44621a(appCompatActivity);
        this.activityProvider = m44621a2;
        this.belvedereUiProvider = V51.m80429b(MessagingActivityModule_BelvedereUiFactory.create(m44621a2));
        this.belvedereMediaHolderProvider = new zendesk_messaging_MessagingComponent_belvedereMediaHolder(messagingComponent);
        this.belvedereProvider = new zendesk_messaging_MessagingComponent_belvedere(messagingComponent);
        Y94<BelvedereMediaResolverCallback> m80429b = V51.m80429b(BelvedereMediaResolverCallback_Factory.create(this.messagingViewModelProvider, this.eventFactoryProvider));
        this.belvedereMediaResolverCallbackProvider = m80429b;
        this.inputBoxConsumerProvider = V51.m80429b(InputBoxConsumer_Factory.create(this.messagingViewModelProvider, this.eventFactoryProvider, this.belvedereUiProvider, this.belvedereProvider, this.belvedereMediaHolderProvider, m80429b));
        this.inputBoxAttachmentClickListenerProvider = InputBoxAttachmentClickListener_Factory.create(this.activityProvider, this.belvedereUiProvider, this.belvedereMediaHolderProvider);
        Y94<Handler> m80429b2 = V51.m80429b(MessagingActivityModule_HandlerFactory.create());
        this.handlerProvider = m80429b2;
        Y94<TypingEventDispatcher> m80429b3 = V51.m80429b(TypingEventDispatcher_Factory.create(this.messagingViewModelProvider, m80429b2, this.eventFactoryProvider));
        this.typingEventDispatcherProvider = m80429b3;
        this.messagingComposerProvider = V51.m80429b(MessagingComposer_Factory.create(this.activityProvider, this.messagingViewModelProvider, this.belvedereUiProvider, this.belvedereMediaHolderProvider, this.inputBoxConsumerProvider, this.inputBoxAttachmentClickListenerProvider, m80429b3));
        this.messagingDialogProvider = V51.m80429b(MessagingDialog_Factory.create(this.activityProvider, this.messagingViewModelProvider, this.dateProvider));
    }

    private MessagingActivity injectMessagingActivity(MessagingActivity messagingActivity) {
        MessagingActivity_MembersInjector.injectViewModel(messagingActivity, (MessagingViewModel) C51679xZ3.m5003d(this.messagingComponent.messagingViewModel()));
        MessagingActivity_MembersInjector.injectMessagingCellFactory(messagingActivity, this.messagingCellFactoryProvider.get());
        MessagingActivity_MembersInjector.injectPicasso(messagingActivity, (C42732iT3) C51679xZ3.m5003d(this.messagingComponent.picasso()));
        MessagingActivity_MembersInjector.injectEventFactory(messagingActivity, this.eventFactoryProvider.get());
        MessagingActivity_MembersInjector.injectMessagingComposer(messagingActivity, this.messagingComposerProvider.get());
        MessagingActivity_MembersInjector.injectMessagingDialog(messagingActivity, this.messagingDialogProvider.get());
        return messagingActivity;
    }

    @Override // zendesk.messaging.MessagingActivityComponent
    public void inject(MessagingActivity messagingActivity) {
        injectMessagingActivity(messagingActivity);
    }

    private DaggerMessagingActivityComponent(MessagingComponent messagingComponent, AppCompatActivity appCompatActivity) {
        this.messagingActivityComponent = this;
        this.messagingComponent = messagingComponent;
        initialize(messagingComponent, appCompatActivity);
    }
}
