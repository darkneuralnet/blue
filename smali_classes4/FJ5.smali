.class public final enum LFJ5;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LFJ5;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0013\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "LFJ5;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "c",
        "d",
        "e",
        "f",
        "g",
        "h",
        "i",
        "j",
        "k",
        "l",
        "m",
        "n",
        "o",
        "p",
        "q",
        "impl_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum b:LFJ5;

.field public static final enum c:LFJ5;

.field public static final enum d:LFJ5;

.field public static final enum e:LFJ5;

.field public static final enum f:LFJ5;

.field public static final enum g:LFJ5;

.field public static final enum h:LFJ5;

.field public static final enum i:LFJ5;

.field public static final enum j:LFJ5;

.field public static final enum k:LFJ5;

.field public static final enum l:LFJ5;

.field public static final enum m:LFJ5;

.field public static final enum n:LFJ5;

.field public static final enum o:LFJ5;

.field public static final enum p:LFJ5;

.field public static final enum q:LFJ5;

.field public static final synthetic r:[LFJ5;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LFJ5;

    const-string v1, "UNINITIALIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LFJ5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LFJ5;->b:LFJ5;

    new-instance v0, LFJ5;

    const-string v1, "CONNECTING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LFJ5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LFJ5;->c:LFJ5;

    new-instance v0, LFJ5;

    const-string v1, "CONNECTED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LFJ5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LFJ5;->d:LFJ5;

    new-instance v0, LFJ5;

    const-string v1, "TOKEN_REQUESTED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LFJ5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LFJ5;->e:LFJ5;

    new-instance v0, LFJ5;

    const-string v1, "TOKEN_RESPONSE_RECEIVED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LFJ5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LFJ5;->f:LFJ5;

    new-instance v0, LFJ5;

    const-string v1, "LOCK_STATE_REQUESTED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, LFJ5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LFJ5;->g:LFJ5;

    new-instance v0, LFJ5;

    const-string v1, "LOCK_STATE_RESPONSE_RECEIVED"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, LFJ5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LFJ5;->h:LFJ5;

    new-instance v0, LFJ5;

    const-string v1, "UNLOCK_REQUESTED"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, LFJ5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LFJ5;->i:LFJ5;

    new-instance v0, LFJ5;

    const-string v1, "UNLOCK_RESPONSE_RECEIVED"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, LFJ5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LFJ5;->j:LFJ5;

    new-instance v0, LFJ5;

    const-string v1, "LOCK_REQUESTED"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, LFJ5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LFJ5;->k:LFJ5;

    new-instance v0, LFJ5;

    const-string v1, "LOCK_RESPONSE_RECEIVED"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, LFJ5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LFJ5;->l:LFJ5;

    new-instance v0, LFJ5;

    const-string v1, "LOCK_INSERTED_RESPONSE_RECEIVED"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, LFJ5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LFJ5;->m:LFJ5;

    new-instance v0, LFJ5;

    const-string v1, "DISCONNECTING"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, LFJ5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LFJ5;->n:LFJ5;

    new-instance v0, LFJ5;

    const-string v1, "DISCONNECTED"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2}, LFJ5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LFJ5;->o:LFJ5;

    new-instance v0, LFJ5;

    const-string v1, "UNKNOWN"

    const/16 v2, 0xe

    invoke-direct {v0, v1, v2}, LFJ5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LFJ5;->p:LFJ5;

    new-instance v0, LFJ5;

    const-string v1, "EXCEPTION"

    const/16 v2, 0xf

    invoke-direct {v0, v1, v2}, LFJ5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LFJ5;->q:LFJ5;

    invoke-static {}, LFJ5;->a()[LFJ5;

    move-result-object v0

    sput-object v0, LFJ5;->r:[LFJ5;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static final synthetic a()[LFJ5;
    .locals 3

    const/16 v0, 0x10

    new-array v0, v0, [LFJ5;

    const/4 v1, 0x0

    sget-object v2, LFJ5;->b:LFJ5;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LFJ5;->c:LFJ5;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LFJ5;->d:LFJ5;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LFJ5;->e:LFJ5;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, LFJ5;->f:LFJ5;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, LFJ5;->g:LFJ5;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, LFJ5;->h:LFJ5;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, LFJ5;->i:LFJ5;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, LFJ5;->j:LFJ5;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, LFJ5;->k:LFJ5;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, LFJ5;->l:LFJ5;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, LFJ5;->m:LFJ5;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, LFJ5;->n:LFJ5;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, LFJ5;->o:LFJ5;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, LFJ5;->p:LFJ5;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, LFJ5;->q:LFJ5;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LFJ5;
    .locals 1

    const-class v0, LFJ5;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LFJ5;

    return-object p0
.end method

.method public static values()[LFJ5;
    .locals 1

    sget-object v0, LFJ5;->r:[LFJ5;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LFJ5;

    return-object v0
.end method
