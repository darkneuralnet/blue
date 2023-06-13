.class public final enum Lr12;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lr12;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lr12;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "c",
        "room-common"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final enum b:Lr12;

.field public static final enum c:Lr12;

.field public static final synthetic d:[Lr12;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lr12;

    const-string v1, "ASC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lr12;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr12;->b:Lr12;

    new-instance v0, Lr12;

    const-string v1, "DESC"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lr12;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr12;->c:Lr12;

    invoke-static {}, Lr12;->a()[Lr12;

    move-result-object v0

    sput-object v0, Lr12;->d:[Lr12;

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

.method public static final synthetic a()[Lr12;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lr12;

    const/4 v1, 0x0

    sget-object v2, Lr12;->b:Lr12;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lr12;->c:Lr12;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lr12;
    .locals 1

    const-class v0, Lr12;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lr12;

    return-object p0
.end method

.method public static values()[Lr12;
    .locals 1

    sget-object v0, Lr12;->d:[Lr12;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lr12;

    return-object v0
.end method
