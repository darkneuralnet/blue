.class public final enum LLa4;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LLa4;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u000f\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0005j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "LLa4;",
        "",
        "",
        "b",
        "Ljava/lang/String;",
        "()Ljava/lang/String;",
        "key",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "c",
        "d",
        "e",
        "f",
        "g",
        "h",
        "i",
        "j",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum c:LLa4;

.field public static final enum d:LLa4;

.field public static final enum e:LLa4;

.field public static final enum f:LLa4;

.field public static final enum g:LLa4;

.field public static final enum h:LLa4;

.field public static final enum i:LLa4;

.field public static final enum j:LLa4;

.field public static final synthetic k:[LLa4;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, LLa4;

    const/4 v1, 0x0

    const-string v2, "deal"

    const-string v3, "DEAL"

    invoke-direct {v0, v3, v1, v2}, LLa4;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LLa4;->c:LLa4;

    new-instance v0, LLa4;

    const/4 v1, 0x1

    const-string v2, "bird_event"

    const-string v3, "BIRD_EVENT"

    invoke-direct {v0, v3, v1, v2}, LLa4;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LLa4;->d:LLa4;

    new-instance v0, LLa4;

    const/4 v1, 0x2

    const-string v2, "bluetooth_scan"

    const-string v3, "BLUETOOTH_SWEEP"

    invoke-direct {v0, v3, v1, v2}, LLa4;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LLa4;->e:LLa4;

    new-instance v0, LLa4;

    const/4 v1, 0x3

    const-string v2, "device_check"

    const-string v3, "DEVICE_CHECK"

    invoke-direct {v0, v3, v1, v2}, LLa4;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LLa4;->f:LLa4;

    new-instance v0, LLa4;

    const/4 v1, 0x4

    const-string v2, "dispatch"

    const-string v3, "DISPATCH"

    invoke-direct {v0, v3, v1, v2}, LLa4;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LLa4;->g:LLa4;

    new-instance v0, LLa4;

    const/4 v1, 0x5

    const-string v2, "coupons"

    const-string v3, "COUPONS"

    invoke-direct {v0, v3, v1, v2}, LLa4;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LLa4;->h:LLa4;

    new-instance v0, LLa4;

    const/4 v1, 0x6

    const-string v2, "shift-end"

    const-string v3, "SHIFT_END"

    invoke-direct {v0, v3, v1, v2}, LLa4;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LLa4;->i:LLa4;

    new-instance v0, LLa4;

    const/4 v1, 0x7

    const-string v2, "brain_swap"

    const-string v3, "BRAIN_SWAP"

    invoke-direct {v0, v3, v1, v2}, LLa4;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LLa4;->j:LLa4;

    invoke-static {}, LLa4;->a()[LLa4;

    move-result-object v0

    sput-object v0, LLa4;->k:[LLa4;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LLa4;->b:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic a()[LLa4;
    .locals 3

    const/16 v0, 0x8

    new-array v0, v0, [LLa4;

    const/4 v1, 0x0

    sget-object v2, LLa4;->c:LLa4;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LLa4;->d:LLa4;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LLa4;->e:LLa4;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LLa4;->f:LLa4;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, LLa4;->g:LLa4;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, LLa4;->h:LLa4;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, LLa4;->i:LLa4;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, LLa4;->j:LLa4;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LLa4;
    .locals 1

    const-class v0, LLa4;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LLa4;

    return-object p0
.end method

.method public static values()[LLa4;
    .locals 1

    sget-object v0, LLa4;->k:[LLa4;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LLa4;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LLa4;->b:Ljava/lang/String;

    return-object v0
.end method
