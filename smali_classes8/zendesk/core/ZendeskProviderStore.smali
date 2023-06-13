.class Lzendesk/core/ZendeskProviderStore;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzendesk/core/ProviderStore;


# instance fields
.field private final pushRegistrationProvider:Lzendesk/core/PushRegistrationProvider;

.field private final userProvider:Lzendesk/core/UserProvider;


# direct methods
.method public constructor <init>(Lzendesk/core/UserProvider;Lzendesk/core/PushRegistrationProvider;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/core/ZendeskProviderStore;->userProvider:Lzendesk/core/UserProvider;

    iput-object p2, p0, Lzendesk/core/ZendeskProviderStore;->pushRegistrationProvider:Lzendesk/core/PushRegistrationProvider;

    return-void
.end method


# virtual methods
.method public pushRegistrationProvider()Lzendesk/core/PushRegistrationProvider;
    .locals 1

    iget-object v0, p0, Lzendesk/core/ZendeskProviderStore;->pushRegistrationProvider:Lzendesk/core/PushRegistrationProvider;

    return-object v0
.end method

.method public userProvider()Lzendesk/core/UserProvider;
    .locals 1

    iget-object v0, p0, Lzendesk/core/ZendeskProviderStore;->userProvider:Lzendesk/core/UserProvider;

    return-object v0
.end method
