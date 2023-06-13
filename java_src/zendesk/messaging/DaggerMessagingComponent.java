package zendesk.messaging;

import android.content.Context;
import android.content.res.Resources;
import java.util.List;
import zendesk.belvedere.C31096a;
import zendesk.messaging.MessagingComponent;
/* loaded from: classes8.dex */
final class DaggerMessagingComponent implements MessagingComponent {
    private Y94<Context> appContextProvider;
    private Y94<BelvedereMediaHolder> belvedereMediaHolderProvider;
    private Y94<C31096a> belvedereProvider;
    private Y94<List<Engine>> enginesProvider;
    private final DaggerMessagingComponent messagingComponent;
    private final MessagingConfiguration messagingConfiguration;
    private Y94<MessagingConfiguration> messagingConfigurationProvider;
    private Y94<MessagingConversationLog> messagingConversationLogProvider;
    private Y94<MessagingEventSerializer> messagingEventSerializerProvider;
    private Y94<MessagingModel> messagingModelProvider;
    private Y94<MessagingViewModel> messagingViewModelProvider;
    private Y94<C42732iT3> picassoProvider;
    private Y94<Resources> resourcesProvider;
    private Y94<TimestampFactory> timestampFactoryProvider;

    /* loaded from: classes8.dex */
    public static final class Builder implements MessagingComponent.Builder {
        private Context appContext;
        private List<Engine> engines;
        private MessagingConfiguration messagingConfiguration;

        private Builder() {
        }

        @Override // zendesk.messaging.MessagingComponent.Builder
        public MessagingComponent build() {
            C51679xZ3.m5006a(this.appContext, Context.class);
            C51679xZ3.m5006a(this.engines, List.class);
            C51679xZ3.m5006a(this.messagingConfiguration, MessagingConfiguration.class);
            return new DaggerMessagingComponent(this.appContext, this.engines, this.messagingConfiguration);
        }

        @Override // zendesk.messaging.MessagingComponent.Builder
        public /* bridge */ /* synthetic */ MessagingComponent.Builder engines(List list) {
            return engines((List<Engine>) list);
        }

        @Override // zendesk.messaging.MessagingComponent.Builder
        public Builder appContext(Context context) {
            this.appContext = (Context) C51679xZ3.m5005b(context);
            return this;
        }

        @Override // zendesk.messaging.MessagingComponent.Builder
        public Builder engines(List<Engine> list) {
            this.engines = (List) C51679xZ3.m5005b(list);
            return this;
        }

        @Override // zendesk.messaging.MessagingComponent.Builder
        public Builder messagingConfiguration(MessagingConfiguration messagingConfiguration) {
            this.messagingConfiguration = (MessagingConfiguration) C51679xZ3.m5005b(messagingConfiguration);
            return this;
        }
    }

    public static MessagingComponent.Builder builder() {
        return new Builder();
    }

    private void initialize(Context context, List<Engine> list, MessagingConfiguration messagingConfiguration) {
        InterfaceC48812sj1 m44621a = C39546d52.m44621a(context);
        this.appContextProvider = m44621a;
        this.picassoProvider = V51.m80429b(MessagingModule_PicassoFactory.create(m44621a));
        this.resourcesProvider = V51.m80429b(MessagingModule_ResourcesFactory.create(this.appContextProvider));
        this.enginesProvider = C39546d52.m44621a(list);
        this.messagingConfigurationProvider = C39546d52.m44621a(messagingConfiguration);
        TimestampFactory_Factory create = TimestampFactory_Factory.create(this.appContextProvider);
        this.timestampFactoryProvider = create;
        Y94<MessagingEventSerializer> m80429b = V51.m80429b(MessagingEventSerializer_Factory.create(this.appContextProvider, create));
        this.messagingEventSerializerProvider = m80429b;
        Y94<MessagingConversationLog> m80429b2 = V51.m80429b(MessagingConversationLog_Factory.create(m80429b));
        this.messagingConversationLogProvider = m80429b2;
        Y94<MessagingModel> m80429b3 = V51.m80429b(MessagingModel_Factory.create(this.resourcesProvider, this.enginesProvider, this.messagingConfigurationProvider, m80429b2));
        this.messagingModelProvider = m80429b3;
        this.messagingViewModelProvider = V51.m80429b(MessagingViewModel_Factory.create(m80429b3));
        this.belvedereProvider = V51.m80429b(MessagingModule_BelvedereFactory.create(this.appContextProvider));
        this.belvedereMediaHolderProvider = V51.m80429b(BelvedereMediaHolder_Factory.create());
    }

    @Override // zendesk.messaging.MessagingComponent
    public C31096a belvedere() {
        return this.belvedereProvider.get();
    }

    @Override // zendesk.messaging.MessagingComponent
    public BelvedereMediaHolder belvedereMediaHolder() {
        return this.belvedereMediaHolderProvider.get();
    }

    @Override // zendesk.messaging.MessagingComponent
    public MessagingConfiguration messagingConfiguration() {
        return this.messagingConfiguration;
    }

    @Override // zendesk.messaging.MessagingComponent
    public MessagingViewModel messagingViewModel() {
        return this.messagingViewModelProvider.get();
    }

    @Override // zendesk.messaging.MessagingComponent
    public C42732iT3 picasso() {
        return this.picassoProvider.get();
    }

    @Override // zendesk.messaging.MessagingComponent
    public Resources resources() {
        return this.resourcesProvider.get();
    }

    private DaggerMessagingComponent(Context context, List<Engine> list, MessagingConfiguration messagingConfiguration) {
        this.messagingComponent = this;
        this.messagingConfiguration = messagingConfiguration;
        initialize(context, list, messagingConfiguration);
    }
}
