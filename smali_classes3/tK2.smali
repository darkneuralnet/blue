.class public final enum LtK2;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LtK2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\n\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "LtK2;",
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
        "rx_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum b:LtK2;

.field public static final enum c:LtK2;

.field public static final enum d:LtK2;

.field public static final enum e:LtK2;

.field public static final enum f:LtK2;

.field public static final enum g:LtK2;

.field public static final enum h:LtK2;

.field public static final synthetic i:[LtK2;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LtK2;

    const-string v1, "ON_CREATE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LtK2;-><init>(Ljava/lang/String;I)V

    sput-object v0, LtK2;->b:LtK2;

    new-instance v0, LtK2;

    const-string v1, "ON_MAP_READY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LtK2;-><init>(Ljava/lang/String;I)V

    sput-object v0, LtK2;->c:LtK2;

    new-instance v0, LtK2;

    const-string v1, "ON_START"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LtK2;-><init>(Ljava/lang/String;I)V

    sput-object v0, LtK2;->d:LtK2;

    new-instance v0, LtK2;

    const-string v1, "ON_RESUME"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LtK2;-><init>(Ljava/lang/String;I)V

    sput-object v0, LtK2;->e:LtK2;

    new-instance v0, LtK2;

    const-string v1, "ON_PAUSE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LtK2;-><init>(Ljava/lang/String;I)V

    sput-object v0, LtK2;->f:LtK2;

    new-instance v0, LtK2;

    const-string v1, "ON_STOP"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, LtK2;-><init>(Ljava/lang/String;I)V

    sput-object v0, LtK2;->g:LtK2;

    new-instance v0, LtK2;

    const-string v1, "ON_DESTROY"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, LtK2;-><init>(Ljava/lang/String;I)V

    sput-object v0, LtK2;->h:LtK2;

    invoke-static {}, LtK2;->a()[LtK2;

    move-result-object v0

    sput-object v0, LtK2;->i:[LtK2;

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

.method public static final synthetic a()[LtK2;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [LtK2;

    const/4 v1, 0x0

    sget-object v2, LtK2;->b:LtK2;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LtK2;->c:LtK2;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LtK2;->d:LtK2;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LtK2;->e:LtK2;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, LtK2;->f:LtK2;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, LtK2;->g:LtK2;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, LtK2;->h:LtK2;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LtK2;
    .locals 1

    const-class v0, LtK2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LtK2;

    return-object p0
.end method

.method public static values()[LtK2;
    .locals 1

    sget-object v0, LtK2;->i:[LtK2;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LtK2;

    return-object v0
.end method
