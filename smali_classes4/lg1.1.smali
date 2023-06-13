.class public final enum Llg1;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Llg1;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000b\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Llg1;",
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
        "vehiclescanner_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum b:Llg1;

.field public static final enum c:Llg1;

.field public static final enum d:Llg1;

.field public static final enum e:Llg1;

.field public static final enum f:Llg1;

.field public static final enum g:Llg1;

.field public static final enum h:Llg1;

.field public static final enum i:Llg1;

.field public static final synthetic j:[Llg1;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Llg1;

    const-string v1, "INVALID_INPUT_BIRD"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Llg1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg1;->b:Llg1;

    new-instance v0, Llg1;

    const-string v1, "INVALID_INPUT_PLATE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Llg1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg1;->c:Llg1;

    new-instance v0, Llg1;

    const-string v1, "INVALID_STICKER"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Llg1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg1;->d:Llg1;

    new-instance v0, Llg1;

    const-string v1, "INVALID_SERIAL"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Llg1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg1;->e:Llg1;

    new-instance v0, Llg1;

    const-string v1, "INVALID_PLATE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Llg1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg1;->f:Llg1;

    new-instance v0, Llg1;

    const-string v1, "INVALID_INPUT_PCM"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Llg1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg1;->g:Llg1;

    new-instance v0, Llg1;

    const-string v1, "INVALID_HELMET"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Llg1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg1;->h:Llg1;

    new-instance v0, Llg1;

    const-string v1, "INVALID_PHYSICAL_LOCK_STICKER"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Llg1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg1;->i:Llg1;

    invoke-static {}, Llg1;->a()[Llg1;

    move-result-object v0

    sput-object v0, Llg1;->j:[Llg1;

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

.method public static final synthetic a()[Llg1;
    .locals 3

    const/16 v0, 0x8

    new-array v0, v0, [Llg1;

    const/4 v1, 0x0

    sget-object v2, Llg1;->b:Llg1;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Llg1;->c:Llg1;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Llg1;->d:Llg1;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Llg1;->e:Llg1;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Llg1;->f:Llg1;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Llg1;->g:Llg1;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Llg1;->h:Llg1;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Llg1;->i:Llg1;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Llg1;
    .locals 1

    const-class v0, Llg1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Llg1;

    return-object p0
.end method

.method public static values()[Llg1;
    .locals 1

    sget-object v0, Llg1;->j:[Llg1;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llg1;

    return-object v0
.end method
