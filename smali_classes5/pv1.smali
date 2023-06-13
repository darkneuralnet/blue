.class public final enum Lpv1;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lpv1;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lpv1;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "c",
        "d",
        "e",
        "facebook-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final enum b:Lpv1;

.field public static final enum c:Lpv1;

.field public static final enum d:Lpv1;

.field public static final enum e:Lpv1;

.field public static final synthetic f:[Lpv1;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x4

    new-array v0, v0, [Lpv1;

    new-instance v1, Lpv1;

    const-string v2, "SUCCESS"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lpv1;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lpv1;->b:Lpv1;

    aput-object v1, v0, v3

    new-instance v1, Lpv1;

    const-string v2, "SERVER_ERROR"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lpv1;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lpv1;->c:Lpv1;

    aput-object v1, v0, v3

    new-instance v1, Lpv1;

    const-string v2, "NO_CONNECTIVITY"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lpv1;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lpv1;->d:Lpv1;

    aput-object v1, v0, v3

    new-instance v1, Lpv1;

    const-string v2, "UNKNOWN_ERROR"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Lpv1;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lpv1;->e:Lpv1;

    aput-object v1, v0, v3

    sput-object v0, Lpv1;->f:[Lpv1;

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

.method public static valueOf(Ljava/lang/String;)Lpv1;
    .locals 1

    const-class v0, Lpv1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lpv1;

    return-object p0
.end method

.method public static values()[Lpv1;
    .locals 1

    sget-object v0, Lpv1;->f:[Lpv1;

    invoke-virtual {v0}, [Lpv1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpv1;

    return-object v0
.end method
