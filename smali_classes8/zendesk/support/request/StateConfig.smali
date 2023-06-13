.class Lzendesk/support/request/StateConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/support/request/StateConfig$Builder;
    }
.end annotation


# static fields
.field static final MAX_ATTACHMENTS_SIZE_UNAVAILABLE:J = -0x1L


# instance fields
.field private final settings:Lzendesk/support/request/StateSettings;

.field private final subject:Ljava/lang/String;

.field private final tags:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final ticketForm:Lzendesk/support/request/StateRequestTicketForm;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lzendesk/support/request/StateSettings;

    invoke-direct {v0}, Lzendesk/support/request/StateSettings;-><init>()V

    iput-object v0, p0, Lzendesk/support/request/StateConfig;->settings:Lzendesk/support/request/StateSettings;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lzendesk/support/request/StateConfig;->tags:Ljava/util/List;

    const-string v0, ""

    iput-object v0, p0, Lzendesk/support/request/StateConfig;->subject:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lzendesk/support/request/StateConfig;->ticketForm:Lzendesk/support/request/StateRequestTicketForm;

    return-void
.end method

.method private constructor <init>(Lzendesk/support/request/StateSettings;Ljava/util/List;Ljava/lang/String;Lzendesk/support/request/StateRequestTicketForm;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzendesk/support/request/StateSettings;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lzendesk/support/request/StateRequestTicketForm;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/request/StateConfig;->settings:Lzendesk/support/request/StateSettings;

    iput-object p2, p0, Lzendesk/support/request/StateConfig;->tags:Ljava/util/List;

    iput-object p3, p0, Lzendesk/support/request/StateConfig;->subject:Ljava/lang/String;

    iput-object p4, p0, Lzendesk/support/request/StateConfig;->ticketForm:Lzendesk/support/request/StateRequestTicketForm;

    return-void
.end method

.method public synthetic constructor <init>(Lzendesk/support/request/StateSettings;Ljava/util/List;Ljava/lang/String;Lzendesk/support/request/StateRequestTicketForm;Lzendesk/support/request/StateConfig$1;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lzendesk/support/request/StateConfig;-><init>(Lzendesk/support/request/StateSettings;Ljava/util/List;Ljava/lang/String;Lzendesk/support/request/StateRequestTicketForm;)V

    return-void
.end method

.method public static fromState(Lzendesk/support/suas/State;)Lzendesk/support/request/StateConfig;
    .locals 1

    const-class v0, Lzendesk/support/request/StateConfig;

    invoke-virtual {p0, v0}, Lzendesk/support/suas/State;->getState(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzendesk/support/request/StateConfig;

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Lzendesk/support/request/StateConfig;

    invoke-direct {p0}, Lzendesk/support/request/StateConfig;-><init>()V

    return-object p0
.end method


# virtual methods
.method public getSettings()Lzendesk/support/request/StateSettings;
    .locals 1

    iget-object v0, p0, Lzendesk/support/request/StateConfig;->settings:Lzendesk/support/request/StateSettings;

    return-object v0
.end method

.method public getSubject()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzendesk/support/request/StateConfig;->subject:Ljava/lang/String;

    return-object v0
.end method

.method public getTags()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/support/request/StateConfig;->tags:Ljava/util/List;

    return-object v0
.end method

.method public getTicketForm()Lzendesk/support/request/StateRequestTicketForm;
    .locals 1

    iget-object v0, p0, Lzendesk/support/request/StateConfig;->ticketForm:Lzendesk/support/request/StateRequestTicketForm;

    return-object v0
.end method

.method public newBuilder()Lzendesk/support/request/StateConfig$Builder;
    .locals 7

    new-instance v6, Lzendesk/support/request/StateConfig$Builder;

    iget-object v1, p0, Lzendesk/support/request/StateConfig;->settings:Lzendesk/support/request/StateSettings;

    iget-object v2, p0, Lzendesk/support/request/StateConfig;->tags:Ljava/util/List;

    iget-object v3, p0, Lzendesk/support/request/StateConfig;->subject:Ljava/lang/String;

    iget-object v4, p0, Lzendesk/support/request/StateConfig;->ticketForm:Lzendesk/support/request/StateRequestTicketForm;

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lzendesk/support/request/StateConfig$Builder;-><init>(Lzendesk/support/request/StateSettings;Ljava/util/List;Ljava/lang/String;Lzendesk/support/request/StateRequestTicketForm;Lzendesk/support/request/StateConfig$1;)V

    return-object v6
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Config{settings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lzendesk/support/request/StateConfig;->settings:Lzendesk/support/request/StateSettings;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", subject=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lzendesk/support/request/StateConfig;->subject:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", ticketForm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lzendesk/support/request/StateConfig;->ticketForm:Lzendesk/support/request/StateRequestTicketForm;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lzendesk/support/request/StateConfig;->tags:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
