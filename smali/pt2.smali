.class public final enum Lpt2;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lpt2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lpt2;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "c",
        "d",
        "paging-common"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final enum b:Lpt2;

.field public static final enum c:Lpt2;

.field public static final enum d:Lpt2;

.field public static final synthetic e:[Lpt2;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lpt2;

    const-string v1, "REFRESH"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lpt2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpt2;->b:Lpt2;

    new-instance v0, Lpt2;

    const-string v1, "PREPEND"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lpt2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpt2;->c:Lpt2;

    new-instance v0, Lpt2;

    const-string v1, "APPEND"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lpt2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpt2;->d:Lpt2;

    invoke-static {}, Lpt2;->a()[Lpt2;

    move-result-object v0

    sput-object v0, Lpt2;->e:[Lpt2;

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

.method public static final synthetic a()[Lpt2;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lpt2;

    const/4 v1, 0x0

    sget-object v2, Lpt2;->b:Lpt2;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lpt2;->c:Lpt2;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lpt2;->d:Lpt2;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lpt2;
    .locals 1

    const-class v0, Lpt2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lpt2;

    return-object p0
.end method

.method public static values()[Lpt2;
    .locals 1

    sget-object v0, Lpt2;->e:[Lpt2;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpt2;

    return-object v0
.end method
