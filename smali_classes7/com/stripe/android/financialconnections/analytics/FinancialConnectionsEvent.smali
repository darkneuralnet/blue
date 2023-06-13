.class public abstract Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$PaneLaunched;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$PaneLoaded;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ClickNavBarBack;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ClickNavBarClose;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Complete;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ClickLearnMoreDataAccess;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ClickDisconnectLink;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Click;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$InstitutionSelected;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$SearchSucceeded;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$PollAccountsSucceeded;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$PollAttachPaymentsSucceeded;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ClickLinkAccounts;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ClickLinkAnotherAccount;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ClickDone;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Error;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Exposure;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ConsentAgree;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00080\u0018\u00002\u00020\u0001:\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$B1\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0008\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0013\u0010\u000e\u001a\u00020\u00072\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0008\u0010\u0010\u001a\u00020\u0011H\u0016J\u0008\u0010\u0012\u001a\u00020\u0003H\u0016R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\r\u0082\u0001\u0012%&\'()*+,-./0123456\u00a8\u00067"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;",
        "",
        "name",
        "",
        "params",
        "",
        "includePrefix",
        "",
        "(Ljava/lang/String;Ljava/util/Map;Z)V",
        "eventName",
        "getEventName",
        "()Ljava/lang/String;",
        "getParams",
        "()Ljava/util/Map;",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "Click",
        "ClickDisconnectLink",
        "ClickDone",
        "ClickLearnMoreDataAccess",
        "ClickLinkAccounts",
        "ClickLinkAnotherAccount",
        "ClickNavBarBack",
        "ClickNavBarClose",
        "Complete",
        "ConsentAgree",
        "Error",
        "Exposure",
        "InstitutionSelected",
        "PaneLaunched",
        "PaneLoaded",
        "PollAccountsSucceeded",
        "PollAttachPaymentsSucceeded",
        "SearchSucceeded",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Click;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ClickDisconnectLink;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ClickDone;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ClickLearnMoreDataAccess;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ClickLinkAccounts;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ClickLinkAnotherAccount;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ClickNavBarBack;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ClickNavBarClose;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Complete;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ConsentAgree;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Error;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Exposure;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$InstitutionSelected;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$PaneLaunched;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$PaneLoaded;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$PollAccountsSucceeded;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$PollAttachPaymentsSucceeded;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$SearchSucceeded;",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final eventName:Ljava/lang/String;

.field private final includePrefix:Z

.field private final name:Ljava/lang/String;

.field private final params:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/util/Map;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;->name:Ljava/lang/String;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;->params:Ljava/util/Map;

    iput-boolean p3, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;->includePrefix:Z

    if-eqz p3, :cond_0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "linked_accounts."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;->eventName:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/Map;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x1

    :cond_1
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;-><init>(Ljava/lang/String;Ljava/util/Map;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/Map;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;-><init>(Ljava/lang/String;Ljava/util/Map;Z)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    return v2

    :cond_2
    const-string v1, "null cannot be cast to non-null type com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;->params:Ljava/util/Map;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;->params:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;->includePrefix:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;->includePrefix:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;->eventName:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;->eventName:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getEventName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;->eventName:Ljava/lang/String;

    return-object v0
.end method

.method public final getParams()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;->params:Ljava/util/Map;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;->name:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;->params:Ljava/util/Map;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;->includePrefix:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;->eventName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;->name:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;->params:Ljava/util/Map;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "FinancialConnectionsEvent(name=\'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\', params="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
