.class public final enum Lo72;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lo72;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0080\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lo72;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "c",
        "d",
        "e",
        "runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum b:Lo72;

.field public static final enum c:Lo72;

.field public static final enum d:Lo72;

.field public static final enum e:Lo72;

.field public static final synthetic f:[Lo72;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lo72;

    const-string v1, "IGNORED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo72;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo72;->b:Lo72;

    new-instance v0, Lo72;

    const-string v1, "SCHEDULED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo72;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo72;->c:Lo72;

    new-instance v0, Lo72;

    const-string v1, "DEFERRED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo72;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo72;->d:Lo72;

    new-instance v0, Lo72;

    const-string v1, "IMMINENT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo72;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo72;->e:Lo72;

    invoke-static {}, Lo72;->a()[Lo72;

    move-result-object v0

    sput-object v0, Lo72;->f:[Lo72;

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

.method public static final synthetic a()[Lo72;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lo72;

    const/4 v1, 0x0

    sget-object v2, Lo72;->b:Lo72;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lo72;->c:Lo72;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lo72;->d:Lo72;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lo72;->e:Lo72;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lo72;
    .locals 1

    const-class v0, Lo72;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo72;

    return-object p0
.end method

.method public static values()[Lo72;
    .locals 1

    sget-object v0, Lo72;->f:[Lo72;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo72;

    return-object v0
.end method
