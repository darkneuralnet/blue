.class public Lzendesk/messaging/MessagingConfiguration;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldx0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/messaging/MessagingConfiguration$Builder;
    }
.end annotation


# instance fields
.field private botAgentDetails:Lzendesk/messaging/AgentDetails;

.field private final botAvatarDrawable:I

.field private final botLabelString:Ljava/lang/String;

.field private final botLabelStringRes:I

.field private final configurations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ldx0;",
            ">;"
        }
    .end annotation
.end field

.field private final engineRegistryKey:Ljava/lang/String;

.field private final multilineResponseOptionsEnabled:Z

.field private final toolbarTitle:Ljava/lang/String;

.field private final toolbarTitleRes:I


# direct methods
.method private constructor <init>(Lzendesk/messaging/MessagingConfiguration$Builder;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lzendesk/messaging/MessagingConfiguration$Builder;->access$000(Lzendesk/messaging/MessagingConfiguration$Builder;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lzendesk/messaging/MessagingConfiguration;->configurations:Ljava/util/List;

    iput-object p2, p0, Lzendesk/messaging/MessagingConfiguration;->engineRegistryKey:Ljava/lang/String;

    invoke-static {p1}, Lzendesk/messaging/MessagingConfiguration$Builder;->access$100(Lzendesk/messaging/MessagingConfiguration$Builder;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lzendesk/messaging/MessagingConfiguration;->toolbarTitle:Ljava/lang/String;

    invoke-static {p1}, Lzendesk/messaging/MessagingConfiguration$Builder;->access$200(Lzendesk/messaging/MessagingConfiguration$Builder;)I

    move-result p2

    iput p2, p0, Lzendesk/messaging/MessagingConfiguration;->toolbarTitleRes:I

    invoke-static {p1}, Lzendesk/messaging/MessagingConfiguration$Builder;->access$300(Lzendesk/messaging/MessagingConfiguration$Builder;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lzendesk/messaging/MessagingConfiguration;->botLabelString:Ljava/lang/String;

    invoke-static {p1}, Lzendesk/messaging/MessagingConfiguration$Builder;->access$400(Lzendesk/messaging/MessagingConfiguration$Builder;)I

    move-result p2

    iput p2, p0, Lzendesk/messaging/MessagingConfiguration;->botLabelStringRes:I

    invoke-static {p1}, Lzendesk/messaging/MessagingConfiguration$Builder;->access$500(Lzendesk/messaging/MessagingConfiguration$Builder;)I

    move-result p2

    iput p2, p0, Lzendesk/messaging/MessagingConfiguration;->botAvatarDrawable:I

    invoke-static {p1}, Lzendesk/messaging/MessagingConfiguration$Builder;->access$600(Lzendesk/messaging/MessagingConfiguration$Builder;)Z

    move-result p1

    iput-boolean p1, p0, Lzendesk/messaging/MessagingConfiguration;->multilineResponseOptionsEnabled:Z

    return-void
.end method

.method public synthetic constructor <init>(Lzendesk/messaging/MessagingConfiguration$Builder;Ljava/lang/String;Lzendesk/messaging/MessagingConfiguration$1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lzendesk/messaging/MessagingConfiguration;-><init>(Lzendesk/messaging/MessagingConfiguration$Builder;Ljava/lang/String;)V

    return-void
.end method

.method private getBotLabelString(Landroid/content/res/Resources;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/MessagingConfiguration;->botLabelString:Ljava/lang/String;

    invoke-static {v0}, LlS5;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lzendesk/messaging/MessagingConfiguration;->botLabelString:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget v0, p0, Lzendesk/messaging/MessagingConfiguration;->botLabelStringRes:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method


# virtual methods
.method public getBotAgentDetails(Landroid/content/res/Resources;)Lzendesk/messaging/AgentDetails;
    .locals 4

    iget-object v0, p0, Lzendesk/messaging/MessagingConfiguration;->botAgentDetails:Lzendesk/messaging/AgentDetails;

    if-nez v0, :cond_0

    new-instance v0, Lzendesk/messaging/AgentDetails;

    invoke-direct {p0, p1}, Lzendesk/messaging/MessagingConfiguration;->getBotLabelString(Landroid/content/res/Resources;)Ljava/lang/String;

    move-result-object p1

    iget v1, p0, Lzendesk/messaging/MessagingConfiguration;->botAvatarDrawable:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "ANSWER_BOT"

    const/4 v3, 0x1

    invoke-direct {v0, p1, v2, v3, v1}, Lzendesk/messaging/AgentDetails;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;)V

    iput-object v0, p0, Lzendesk/messaging/MessagingConfiguration;->botAgentDetails:Lzendesk/messaging/AgentDetails;

    :cond_0
    iget-object p1, p0, Lzendesk/messaging/MessagingConfiguration;->botAgentDetails:Lzendesk/messaging/AgentDetails;

    return-object p1
.end method

.method public getConfigurations()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldx0;",
            ">;"
        }
    .end annotation

    invoke-static {}, LBx0;->h()LBx0;

    move-result-object v0

    iget-object v1, p0, Lzendesk/messaging/MessagingConfiguration;->configurations:Ljava/util/List;

    invoke-virtual {v0, v1, p0}, LBx0;->a(Ljava/util/List;Ldx0;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getEngines()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lzendesk/messaging/Engine;",
            ">;"
        }
    .end annotation

    sget-object v0, Lzendesk/messaging/EngineListRegistry;->INSTANCE:Lzendesk/messaging/EngineListRegistry;

    iget-object v1, p0, Lzendesk/messaging/MessagingConfiguration;->engineRegistryKey:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lzendesk/messaging/EngineListRegistry;->retrieveEngineList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getToolbarTitle(Landroid/content/res/Resources;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/MessagingConfiguration;->toolbarTitle:Ljava/lang/String;

    invoke-static {v0}, LlS5;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lzendesk/messaging/MessagingConfiguration;->toolbarTitle:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget v0, p0, Lzendesk/messaging/MessagingConfiguration;->toolbarTitleRes:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public isMultilineResponseOptionsEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lzendesk/messaging/MessagingConfiguration;->multilineResponseOptionsEnabled:Z

    return v0
.end method
