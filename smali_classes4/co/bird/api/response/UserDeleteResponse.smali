.class public Lco/bird/api/response/UserDeleteResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lco/bird/api/response/UserDeleteResponse;",
        "",
        "status",
        "Lco/bird/android/model/UserDeletionStatus;",
        "(Lco/bird/android/model/UserDeletionStatus;)V",
        "getStatus",
        "()Lco/bird/android/model/UserDeletionStatus;",
        "co.bird.android.api"
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
.field private final status:Lco/bird/android/model/UserDeletionStatus;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "status"
    .end annotation

    .annotation runtime Lft5;
        value = "status"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lco/bird/api/response/UserDeleteResponse;-><init>(Lco/bird/android/model/UserDeletionStatus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/UserDeletionStatus;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/api/response/UserDeleteResponse;->status:Lco/bird/android/model/UserDeletionStatus;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/UserDeletionStatus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1}, Lco/bird/api/response/UserDeleteResponse;-><init>(Lco/bird/android/model/UserDeletionStatus;)V

    return-void
.end method


# virtual methods
.method public final getStatus()Lco/bird/android/model/UserDeletionStatus;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/UserDeleteResponse;->status:Lco/bird/android/model/UserDeletionStatus;

    return-object v0
.end method
