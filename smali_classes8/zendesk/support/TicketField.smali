.class public Lzendesk/support/TicketField;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private description:Ljava/lang/String;

.field private id:J

.field private regexpForValidation:Ljava/lang/String;

.field private ticketFieldOptions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lzendesk/support/TicketFieldOption;",
            ">;"
        }
    .end annotation
.end field

.field private ticketFieldSystemOptions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lzendesk/support/TicketFieldSystemOption;",
            ">;"
        }
    .end annotation
.end field

.field private title:Ljava/lang/String;

.field private titleInPortal:Ljava/lang/String;

.field private type:Lzendesk/support/TicketFieldType;


# direct methods
.method public constructor <init>(JLzendesk/support/TicketFieldType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lzendesk/support/TicketFieldType;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lzendesk/support/TicketFieldOption;",
            ">;",
            "Ljava/util/List<",
            "Lzendesk/support/TicketFieldSystemOption;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lzendesk/support/TicketField;->id:J

    iput-object p3, p0, Lzendesk/support/TicketField;->type:Lzendesk/support/TicketFieldType;

    iput-object p4, p0, Lzendesk/support/TicketField;->title:Ljava/lang/String;

    iput-object p5, p0, Lzendesk/support/TicketField;->titleInPortal:Ljava/lang/String;

    iput-object p6, p0, Lzendesk/support/TicketField;->description:Ljava/lang/String;

    iput-object p7, p0, Lzendesk/support/TicketField;->regexpForValidation:Ljava/lang/String;

    iput-object p8, p0, Lzendesk/support/TicketField;->ticketFieldOptions:Ljava/util/List;

    iput-object p9, p0, Lzendesk/support/TicketField;->ticketFieldSystemOptions:Ljava/util/List;

    return-void
.end method

.method public static create(Lzendesk/support/RawTicketField;)Lzendesk/support/TicketField;
    .locals 11

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lzendesk/support/RawTicketField;->getCustomFieldOptions()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzendesk/support/RawTicketFieldOption;

    invoke-static {v1}, Lzendesk/support/TicketFieldOption;->create(Lzendesk/support/RawTicketFieldOption;)Lzendesk/support/TicketFieldOption;

    move-result-object v1

    invoke-interface {v8, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lzendesk/support/RawTicketField;->getSystemFieldOptions()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzendesk/support/RawTicketFieldSystemOption;

    invoke-static {v1}, Lzendesk/support/TicketFieldSystemOption;->create(Lzendesk/support/RawTicketFieldSystemOption;)Lzendesk/support/TicketFieldSystemOption;

    move-result-object v1

    invoke-interface {v9, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lzendesk/support/RawTicketField;->getType()Lzendesk/support/TicketFieldType;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lzendesk/support/RawTicketField;->getType()Lzendesk/support/TicketFieldType;

    move-result-object v0

    goto :goto_2

    :cond_2
    sget-object v0, Lzendesk/support/TicketFieldType;->Unknown:Lzendesk/support/TicketFieldType;

    :goto_2
    move-object v3, v0

    new-instance v10, Lzendesk/support/TicketField;

    invoke-virtual {p0}, Lzendesk/support/RawTicketField;->getId()J

    move-result-wide v1

    invoke-virtual {p0}, Lzendesk/support/RawTicketField;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lzendesk/support/RawTicketField;->getTitleInPortal()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lzendesk/support/RawTicketField;->getDescription()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lzendesk/support/RawTicketField;->getRegexpForValidation()Ljava/lang/String;

    move-result-object v7

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Lzendesk/support/TicketField;-><init>(JLzendesk/support/TicketFieldType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    return-object v10
.end method


# virtual methods
.method public getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzendesk/support/TicketField;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getId()J
    .locals 2

    iget-wide v0, p0, Lzendesk/support/TicketField;->id:J

    return-wide v0
.end method

.method public getRegexpForValidation()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzendesk/support/TicketField;->regexpForValidation:Ljava/lang/String;

    return-object v0
.end method

.method public getTicketFieldOptions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lzendesk/support/TicketFieldOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/support/TicketField;->ticketFieldOptions:Ljava/util/List;

    invoke-static {v0}, Ljm0;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getTicketFieldSystemOptions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lzendesk/support/TicketFieldSystemOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/support/TicketField;->ticketFieldSystemOptions:Ljava/util/List;

    invoke-static {v0}, Ljm0;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzendesk/support/TicketField;->title:Ljava/lang/String;

    return-object v0
.end method

.method public getTitleInPortal()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzendesk/support/TicketField;->titleInPortal:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Lzendesk/support/TicketFieldType;
    .locals 1

    iget-object v0, p0, Lzendesk/support/TicketField;->type:Lzendesk/support/TicketFieldType;

    return-object v0
.end method
