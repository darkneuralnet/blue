.class Lzendesk/support/RawTicketFormResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private ticketFields:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lzendesk/support/RawTicketField;",
            ">;"
        }
    .end annotation
.end field

.field private ticketForms:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lzendesk/support/RawTicketForm;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getTicketFields()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lzendesk/support/RawTicketField;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/support/RawTicketFormResponse;->ticketFields:Ljava/util/List;

    invoke-static {v0}, Ljm0;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getTicketForms()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lzendesk/support/RawTicketForm;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/support/RawTicketFormResponse;->ticketForms:Ljava/util/List;

    invoke-static {v0}, Ljm0;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
