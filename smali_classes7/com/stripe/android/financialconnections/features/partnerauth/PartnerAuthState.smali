.class public final Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LAN2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$Payload;,
        Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;,
        Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ClickableText;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0080\u0008\u0018\u00002\u00020\u0001:\u0003$%&B3\u0012\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0002\u00a2\u0006\u0004\u0008\"\u0010#J\u000f\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000f\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0002H\u00c6\u0003J5\u0010\u000c\u001a\u00020\u00002\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0002H\u00c6\u0001J\t\u0010\r\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003R\u001d\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u001d\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0014\u001a\u0004\u0008\u001a\u0010\u0016R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001b8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001dR\u0011\u0010!\u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010 \u00a8\u0006\'"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;",
        "LAN2;",
        "Ldp;",
        "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$Payload;",
        "component1",
        "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;",
        "component2",
        "",
        "component3",
        "payload",
        "viewEffect",
        "authenticationStatus",
        "copy",
        "toString",
        "",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "Ldp;",
        "getPayload",
        "()Ldp;",
        "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;",
        "getViewEffect",
        "()Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;",
        "getAuthenticationStatus",
        "Lcom/stripe/android/financialconnections/model/DataAccessNotice;",
        "getDataAccess",
        "()Lcom/stripe/android/financialconnections/model/DataAccessNotice;",
        "dataAccess",
        "getCanNavigateBack",
        "()Z",
        "canNavigateBack",
        "<init>",
        "(Ldp;Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;Ldp;)V",
        "ClickableText",
        "Payload",
        "ViewEffect",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final authenticationStatus:Ldp;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldp<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final payload:Ldp;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldp<",
            "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$Payload;",
            ">;"
        }
    .end annotation
.end field

.field private final viewEffect:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;


# direct methods
.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;-><init>(Ldp;Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;Ldp;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ldp;Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;Ldp;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldp<",
            "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$Payload;",
            ">;",
            "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;",
            "Ldp<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "authenticationStatus"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;->payload:Ldp;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;->viewEffect:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;->authenticationStatus:Ldp;

    return-void
.end method

.method public synthetic constructor <init>(Ldp;Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;Ldp;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    sget-object p1, LMd6;->e:LMd6;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    sget-object p3, LMd6;->e:LMd6;

    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;-><init>(Ldp;Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;Ldp;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;Ldp;Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;Ldp;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;->payload:Ldp;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;->viewEffect:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;->authenticationStatus:Ldp;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;->copy(Ldp;Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;Ldp;)Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ldp;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldp<",
            "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$Payload;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;->payload:Ldp;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;->viewEffect:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;

    return-object v0
.end method

.method public final component3()Ldp;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldp<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;->authenticationStatus:Ldp;

    return-object v0
.end method

.method public final copy(Ldp;Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;Ldp;)Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldp<",
            "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$Payload;",
            ">;",
            "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;",
            "Ldp<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;"
        }
    .end annotation

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "authenticationStatus"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;-><init>(Ldp;Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;Ldp;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;->payload:Ldp;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;->payload:Ldp;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;->viewEffect:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;->viewEffect:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;->authenticationStatus:Ldp;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;->authenticationStatus:Ldp;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getAuthenticationStatus()Ldp;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldp<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;->authenticationStatus:Ldp;

    return-object v0
.end method

.method public final getCanNavigateBack()Z
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;->authenticationStatus:Ldp;

    instance-of v1, v0, LAt2;

    if-nez v1, :cond_0

    instance-of v0, v0, LwT5;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;->payload:Ldp;

    instance-of v0, v0, LCj1;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getDataAccess()Lcom/stripe/android/financialconnections/model/DataAccessNotice;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;->payload:Ldp;

    invoke-virtual {v0}, Ldp;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$Payload;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$Payload;->getAuthSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getDisplay()Lcom/stripe/android/financialconnections/domain/Display;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/domain/Display;->getText()Lcom/stripe/android/financialconnections/domain/Text;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/domain/Text;->getOauthPrepane()Lcom/stripe/android/financialconnections/domain/OauthPrepane;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->getDataAccessNotice()Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final getPayload()Ldp;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldp<",
            "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$Payload;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;->payload:Ldp;

    return-object v0
.end method

.method public final getViewEffect()Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;->viewEffect:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;->payload:Ldp;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;->viewEffect:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;->authenticationStatus:Ldp;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;->payload:Ldp;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;->viewEffect:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;->authenticationStatus:Ldp;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "PartnerAuthState(payload="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", viewEffect="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", authenticationStatus="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
