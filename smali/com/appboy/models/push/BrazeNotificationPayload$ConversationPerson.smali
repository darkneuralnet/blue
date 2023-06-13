.class public final Lcom/appboy/models/push/BrazeNotificationPayload$ConversationPerson;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/appboy/models/push/BrazeNotificationPayload;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ConversationPerson"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0005\u001a\u0004\u0008\t\u0010\u0007R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0005\u001a\u0004\u0008\u000b\u0010\u0007R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\r\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u000e\u001a\u0004\u0008\u0010\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/appboy/models/push/BrazeNotificationPayload$ConversationPerson;",
        "",
        "",
        "toString",
        "personId",
        "Ljava/lang/String;",
        "getPersonId",
        "()Ljava/lang/String;",
        "name",
        "getName",
        "uri",
        "getUri",
        "",
        "isImportant",
        "Z",
        "()Z",
        "isBot",
        "LhS3;",
        "getPerson",
        "()LhS3;",
        "person",
        "Landroid/os/Bundle;",
        "notificationExtras",
        "",
        "index",
        "<init>",
        "(Landroid/os/Bundle;I)V",
        "android-sdk-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field private final isBot:Z

.field private final isImportant:Z

.field private final name:Ljava/lang/String;

.field private final personId:Ljava/lang/String;

.field private final uri:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/os/Bundle;I)V
    .locals 3

    const-string v0, "notificationExtras"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/appboy/models/push/BrazeNotificationPayload;->Companion:Lcom/appboy/models/push/BrazeNotificationPayload$Companion;

    const-string v1, "ab_c_pi*"

    invoke-virtual {v0, p2, p1, v1}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->getTemplateFieldAtIndex(ILandroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload$ConversationPerson;->personId:Ljava/lang/String;

    const-string v1, "ab_c_pn*"

    invoke-virtual {v0, p2, p1, v1}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->getTemplateFieldAtIndex(ILandroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload$ConversationPerson;->name:Ljava/lang/String;

    const-string v1, "ab_c_pu*"

    const/4 v2, 0x0

    invoke-virtual {v0, p2, p1, v1, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->getTemplateFieldAtIndex(ILandroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload$ConversationPerson;->uri:Ljava/lang/String;

    const-string v1, "ab_c_pt*"

    const/4 v2, 0x0

    invoke-virtual {v0, p2, p1, v1, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->getTemplateFieldAtIndex(ILandroid/os/Bundle;Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload$ConversationPerson;->isImportant:Z

    const-string v1, "ab_c_pb*"

    invoke-virtual {v0, p2, p1, v1, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->getTemplateFieldAtIndex(ILandroid/os/Bundle;Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/appboy/models/push/BrazeNotificationPayload$ConversationPerson;->isBot:Z

    return-void
.end method


# virtual methods
.method public final getPerson()LhS3;
    .locals 2

    new-instance v0, LhS3$b;

    invoke-direct {v0}, LhS3$b;-><init>()V

    iget-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload$ConversationPerson;->personId:Ljava/lang/String;

    invoke-virtual {v0, v1}, LhS3$b;->e(Ljava/lang/String;)LhS3$b;

    move-result-object v0

    iget-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload$ConversationPerson;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, LhS3$b;->f(Ljava/lang/CharSequence;)LhS3$b;

    move-result-object v0

    iget-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload$ConversationPerson;->uri:Ljava/lang/String;

    invoke-virtual {v0, v1}, LhS3$b;->g(Ljava/lang/String;)LhS3$b;

    move-result-object v0

    iget-boolean v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload$ConversationPerson;->isBot:Z

    invoke-virtual {v0, v1}, LhS3$b;->b(Z)LhS3$b;

    move-result-object v0

    iget-boolean v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload$ConversationPerson;->isImportant:Z

    invoke-virtual {v0, v1}, LhS3$b;->d(Z)LhS3$b;

    move-result-object v0

    invoke-virtual {v0}, LhS3$b;->a()LhS3;

    move-result-object v0

    const-string v1, "Builder()\n              \u2026\n                .build()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getPersonId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload$ConversationPerson;->personId:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/appboy/models/push/BrazeNotificationPayload;->Companion:Lcom/appboy/models/push/BrazeNotificationPayload$Companion;

    iget-object v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload$ConversationPerson;->personId:Ljava/lang/String;

    const-string v3, "PersonId"

    invoke-static {v1, v3, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->access$stringAndKey(Lcom/appboy/models/push/BrazeNotificationPayload$Companion;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload$ConversationPerson;->name:Ljava/lang/String;

    const-string v3, "Name"

    invoke-static {v1, v3, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->access$stringAndKey(Lcom/appboy/models/push/BrazeNotificationPayload$Companion;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload$ConversationPerson;->uri:Ljava/lang/String;

    const-string v3, "Uri"

    invoke-static {v1, v3, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->access$stringAndKey(Lcom/appboy/models/push/BrazeNotificationPayload$Companion;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload$ConversationPerson;->isImportant:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string v3, "IsImportant"

    invoke-static {v1, v3, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->access$stringAndKey(Lcom/appboy/models/push/BrazeNotificationPayload$Companion;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload$ConversationPerson;->isBot:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string v3, "IsBot"

    invoke-static {v1, v3, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->access$stringAndKey(Lcom/appboy/models/push/BrazeNotificationPayload$Companion;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
