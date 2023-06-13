.class public final enum LfN1;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LfN1;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u001d\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\u0008\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0008\u0010\nj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001cj\u0002\u0008\u001dj\u0002\u0008\u001ej\u0002\u0008\u001fj\u0002\u0008 j\u0002\u0008!j\u0002\u0008\"j\u0002\u0008#\u00a8\u0006$"
    }
    d2 = {
        "LfN1;",
        "",
        "",
        "b",
        "Ljava/lang/String;",
        "()Ljava/lang/String;",
        "host",
        "",
        "c",
        "I",
        "()I",
        "port",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;I)V",
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
        "r",
        "s",
        "t",
        "u",
        "v",
        "w",
        "x",
        "y",
        "config_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum d:LfN1;

.field public static final enum e:LfN1;

.field public static final enum f:LfN1;

.field public static final enum g:LfN1;

.field public static final enum h:LfN1;

.field public static final enum i:LfN1;

.field public static final enum j:LfN1;

.field public static final enum k:LfN1;

.field public static final enum l:LfN1;

.field public static final enum m:LfN1;

.field public static final enum n:LfN1;

.field public static final enum o:LfN1;

.field public static final enum p:LfN1;

.field public static final enum q:LfN1;

.field public static final enum r:LfN1;

.field public static final enum s:LfN1;

.field public static final enum t:LfN1;

.field public static final enum u:LfN1;

.field public static final enum v:LfN1;

.field public static final enum w:LfN1;

.field public static final enum x:LfN1;

.field public static final enum y:LfN1;

.field public static final synthetic z:[LfN1;


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    new-instance v0, LfN1;

    const-string v1, "API_BIRD"

    const/4 v2, 0x0

    const-string v3, "api-bird"

    const/16 v4, 0x1f90

    invoke-direct {v0, v1, v2, v3, v4}, LfN1;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, LfN1;->d:LfN1;

    new-instance v0, LfN1;

    const/4 v1, 0x1

    const-string v2, "api-coupon"

    const-string v3, "API_COUPON"

    invoke-direct {v0, v3, v1, v2, v4}, LfN1;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, LfN1;->e:LfN1;

    new-instance v0, LfN1;

    const-string v1, "api-repair"

    const/16 v2, 0x2602

    const-string v3, "API_REPAIR"

    const/4 v5, 0x2

    invoke-direct {v0, v3, v5, v1, v2}, LfN1;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, LfN1;->f:LfN1;

    new-instance v0, LfN1;

    const-string v1, "api-inventory"

    const/16 v2, 0x1b58

    const-string v3, "API_INVENTORY"

    const/4 v5, 0x3

    invoke-direct {v0, v3, v5, v1, v2}, LfN1;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, LfN1;->g:LfN1;

    new-instance v0, LfN1;

    const-string v1, "api-asset"

    const/16 v2, 0x2328

    const-string v3, "API_ASSET"

    const/4 v5, 0x4

    invoke-direct {v0, v3, v5, v1, v2}, LfN1;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, LfN1;->h:LfN1;

    new-instance v0, LfN1;

    const-string v1, "pl"

    const/16 v2, 0x1f91

    const-string v3, "POWERLINE"

    const/4 v5, 0x5

    invoke-direct {v0, v3, v5, v1, v2}, LfN1;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, LfN1;->i:LfN1;

    new-instance v0, LfN1;

    const-string v1, "api-bluetoothtrace"

    const/16 v2, 0x1fa4

    const-string v3, "API_BLUETOOTHTRACE"

    const/4 v5, 0x6

    invoke-direct {v0, v3, v5, v1, v2}, LfN1;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, LfN1;->j:LfN1;

    new-instance v0, LfN1;

    const-string v1, "api-radar"

    const/16 v2, 0x2008

    const-string v3, "API_RADAR"

    const/4 v5, 0x7

    invoke-direct {v0, v3, v5, v1, v2}, LfN1;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, LfN1;->k:LfN1;

    new-instance v0, LfN1;

    const/16 v1, 0x8

    const-string v2, "api-rider"

    const-string v3, "API_RIDER"

    invoke-direct {v0, v3, v1, v2, v4}, LfN1;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, LfN1;->l:LfN1;

    new-instance v0, LfN1;

    const/16 v1, 0x9

    const-string v2, "api-analytics"

    const-string v3, "API_ANALYTICS"

    invoke-direct {v0, v3, v1, v2, v4}, LfN1;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, LfN1;->m:LfN1;

    new-instance v0, LfN1;

    const-string v1, "api-identification"

    const/16 v2, 0x1d1d

    const-string v3, "API_IDENTIFICATION"

    const/16 v5, 0xa

    invoke-direct {v0, v3, v5, v1, v2}, LfN1;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, LfN1;->n:LfN1;

    new-instance v0, LfN1;

    const/16 v1, 0xb

    const-string v2, "api-itemlease"

    const-string v3, "API_ITEM_LEASE"

    invoke-direct {v0, v3, v1, v2, v4}, LfN1;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, LfN1;->o:LfN1;

    new-instance v0, LfN1;

    const/16 v1, 0xc

    const-string v2, "api-localization"

    const-string v3, "API_LOCALIZATION"

    invoke-direct {v0, v3, v1, v2, v4}, LfN1;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, LfN1;->p:LfN1;

    new-instance v0, LfN1;

    const/16 v1, 0xd

    const-string v2, "api-payment"

    const-string v3, "API_PAYMENT"

    invoke-direct {v0, v3, v1, v2, v4}, LfN1;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, LfN1;->q:LfN1;

    new-instance v0, LfN1;

    const/16 v1, 0xe

    const-string v2, "api-subscription"

    const-string v3, "API_SUBSCRIPTION"

    invoke-direct {v0, v3, v1, v2, v4}, LfN1;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, LfN1;->r:LfN1;

    new-instance v0, LfN1;

    const/16 v1, 0xf

    const-string v2, "api-release"

    const-string v3, "API_RELEASE"

    invoke-direct {v0, v3, v1, v2, v4}, LfN1;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, LfN1;->s:LfN1;

    new-instance v0, LfN1;

    const/16 v1, 0x10

    const-string v2, "api-birdplus"

    const-string v3, "API_BIRDPLUS"

    invoke-direct {v0, v3, v1, v2, v4}, LfN1;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, LfN1;->t:LfN1;

    new-instance v0, LfN1;

    const-string v1, "api-assembly"

    const/16 v2, 0x1efa

    const-string v3, "API_ASSEMBLY"

    const/16 v5, 0x11

    invoke-direct {v0, v3, v5, v1, v2}, LfN1;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, LfN1;->u:LfN1;

    new-instance v0, LfN1;

    const/16 v1, 0x12

    const-string v2, "api-surplus"

    const-string v3, "API_SURPLUS"

    invoke-direct {v0, v3, v1, v2, v4}, LfN1;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, LfN1;->v:LfN1;

    new-instance v0, LfN1;

    const/16 v1, 0x13

    const-string v2, "api-bounty"

    const-string v3, "API_BOUNTY"

    invoke-direct {v0, v3, v1, v2, v4}, LfN1;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, LfN1;->w:LfN1;

    new-instance v0, LfN1;

    const-string v1, "API_COMPLAINT"

    const/16 v2, 0x14

    const-string v3, "api-complaint"

    const/16 v4, 0x145a

    invoke-direct {v0, v1, v2, v3, v4}, LfN1;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, LfN1;->x:LfN1;

    new-instance v0, LfN1;

    const/16 v1, 0x15

    const-string v2, "api-communication"

    const-string v3, "API_COMMUNICATION"

    invoke-direct {v0, v3, v1, v2, v4}, LfN1;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, LfN1;->y:LfN1;

    invoke-static {}, LfN1;->a()[LfN1;

    move-result-object v0

    sput-object v0, LfN1;->z:[LfN1;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LfN1;->b:Ljava/lang/String;

    iput p4, p0, LfN1;->c:I

    return-void
.end method

.method public static final synthetic a()[LfN1;
    .locals 3

    const/16 v0, 0x16

    new-array v0, v0, [LfN1;

    const/4 v1, 0x0

    sget-object v2, LfN1;->d:LfN1;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LfN1;->e:LfN1;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LfN1;->f:LfN1;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LfN1;->g:LfN1;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, LfN1;->h:LfN1;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, LfN1;->i:LfN1;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, LfN1;->j:LfN1;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, LfN1;->k:LfN1;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, LfN1;->l:LfN1;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, LfN1;->m:LfN1;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, LfN1;->n:LfN1;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, LfN1;->o:LfN1;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, LfN1;->p:LfN1;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, LfN1;->q:LfN1;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, LfN1;->r:LfN1;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, LfN1;->s:LfN1;

    aput-object v2, v0, v1

    const/16 v1, 0x10

    sget-object v2, LfN1;->t:LfN1;

    aput-object v2, v0, v1

    const/16 v1, 0x11

    sget-object v2, LfN1;->u:LfN1;

    aput-object v2, v0, v1

    const/16 v1, 0x12

    sget-object v2, LfN1;->v:LfN1;

    aput-object v2, v0, v1

    const/16 v1, 0x13

    sget-object v2, LfN1;->w:LfN1;

    aput-object v2, v0, v1

    const/16 v1, 0x14

    sget-object v2, LfN1;->x:LfN1;

    aput-object v2, v0, v1

    const/16 v1, 0x15

    sget-object v2, LfN1;->y:LfN1;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LfN1;
    .locals 1

    const-class v0, LfN1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LfN1;

    return-object p0
.end method

.method public static values()[LfN1;
    .locals 1

    sget-object v0, LfN1;->z:[LfN1;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LfN1;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LfN1;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, LfN1;->c:I

    return v0
.end method
