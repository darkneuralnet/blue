.class public final enum LeM5;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LeM5;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "LeM5;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "c",
        "d",
        "material_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum b:LeM5;

.field public static final enum c:LeM5;

.field public static final enum d:LeM5;

.field public static final synthetic e:[LeM5;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LeM5;

    const-string v1, "Short"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LeM5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LeM5;->b:LeM5;

    new-instance v0, LeM5;

    const-string v1, "Long"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LeM5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LeM5;->c:LeM5;

    new-instance v0, LeM5;

    const-string v1, "Indefinite"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LeM5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LeM5;->d:LeM5;

    invoke-static {}, LeM5;->a()[LeM5;

    move-result-object v0

    sput-object v0, LeM5;->e:[LeM5;

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

.method public static final synthetic a()[LeM5;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [LeM5;

    const/4 v1, 0x0

    sget-object v2, LeM5;->b:LeM5;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LeM5;->c:LeM5;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LeM5;->d:LeM5;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LeM5;
    .locals 1

    const-class v0, LeM5;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LeM5;

    return-object p0
.end method

.method public static values()[LeM5;
    .locals 1

    sget-object v0, LeM5;->e:[LeM5;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LeM5;

    return-object v0
.end method
