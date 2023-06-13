.class public final enum LsN2;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LsN2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "LsN2;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "c",
        "d",
        "mvrx-common"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final enum b:LsN2;

.field public static final enum c:LsN2;

.field public static final enum d:LsN2;

.field public static final synthetic e:[LsN2;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LsN2;

    const-string v1, "No"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LsN2;-><init>(Ljava/lang/String;I)V

    sput-object v0, LsN2;->b:LsN2;

    new-instance v0, LsN2;

    const-string v1, "Completely"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LsN2;-><init>(Ljava/lang/String;I)V

    sput-object v0, LsN2;->c:LsN2;

    new-instance v0, LsN2;

    const-string v1, "WithLoading"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LsN2;-><init>(Ljava/lang/String;I)V

    sput-object v0, LsN2;->d:LsN2;

    invoke-static {}, LsN2;->a()[LsN2;

    move-result-object v0

    sput-object v0, LsN2;->e:[LsN2;

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

.method public static final synthetic a()[LsN2;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [LsN2;

    const/4 v1, 0x0

    sget-object v2, LsN2;->b:LsN2;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LsN2;->c:LsN2;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LsN2;->d:LsN2;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LsN2;
    .locals 1

    const-class v0, LsN2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LsN2;

    return-object p0
.end method

.method public static values()[LsN2;
    .locals 1

    sget-object v0, LsN2;->e:[LsN2;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LsN2;

    return-object v0
.end method
