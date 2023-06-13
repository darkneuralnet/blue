.class public final enum Ls32;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ls32;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Ls32;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "c",
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
.field public static final enum b:Ls32;

.field public static final enum c:Ls32;

.field public static final synthetic d:[Ls32;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Ls32;

    const-string v1, "SCAN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ls32;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls32;->b:Ls32;

    new-instance v0, Ls32;

    const-string v1, "MANUAL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ls32;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls32;->c:Ls32;

    invoke-static {}, Ls32;->a()[Ls32;

    move-result-object v0

    sput-object v0, Ls32;->d:[Ls32;

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

.method public static final synthetic a()[Ls32;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ls32;

    const/4 v1, 0x0

    sget-object v2, Ls32;->b:Ls32;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Ls32;->c:Ls32;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ls32;
    .locals 1

    const-class v0, Ls32;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ls32;

    return-object p0
.end method

.method public static values()[Ls32;
    .locals 1

    sget-object v0, Ls32;->d:[Ls32;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ls32;

    return-object v0
.end method
