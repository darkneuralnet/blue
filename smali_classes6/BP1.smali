.class public final enum LBP1;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LBP1;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "LBP1;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "c",
        "d",
        "e",
        "balloon_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final enum b:LBP1;

.field public static final enum c:LBP1;

.field public static final enum d:LBP1;

.field public static final enum e:LBP1;

.field public static final synthetic f:[LBP1;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LBP1;

    const-string v1, "START"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LBP1;-><init>(Ljava/lang/String;I)V

    sput-object v0, LBP1;->b:LBP1;

    new-instance v0, LBP1;

    const-string v1, "END"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LBP1;-><init>(Ljava/lang/String;I)V

    sput-object v0, LBP1;->c:LBP1;

    new-instance v0, LBP1;

    const-string v1, "TOP"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LBP1;-><init>(Ljava/lang/String;I)V

    sput-object v0, LBP1;->d:LBP1;

    new-instance v0, LBP1;

    const-string v1, "BOTTOM"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LBP1;-><init>(Ljava/lang/String;I)V

    sput-object v0, LBP1;->e:LBP1;

    invoke-static {}, LBP1;->a()[LBP1;

    move-result-object v0

    sput-object v0, LBP1;->f:[LBP1;

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

.method public static final synthetic a()[LBP1;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [LBP1;

    const/4 v1, 0x0

    sget-object v2, LBP1;->b:LBP1;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LBP1;->c:LBP1;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LBP1;->d:LBP1;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LBP1;->e:LBP1;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LBP1;
    .locals 1

    const-class v0, LBP1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LBP1;

    return-object p0
.end method

.method public static values()[LBP1;
    .locals 1

    sget-object v0, LBP1;->f:[LBP1;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LBP1;

    return-object v0
.end method
