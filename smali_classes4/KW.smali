.class public final enum LKW;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LKW;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0005j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "LKW;",
        "",
        "Ljava/util/UUID;",
        "b",
        "Ljava/util/UUID;",
        "()Ljava/util/UUID;",
        "uuid",
        "<init>",
        "(Ljava/lang/String;ILjava/util/UUID;)V",
        "c",
        "d",
        "interface_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum c:LKW;

.field public static final enum d:LKW;

.field public static final synthetic e:[LKW;


# instance fields
.field public final b:Ljava/util/UUID;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    new-instance v0, LKW;

    const-string v1, "0000fee7-0000-1000-8000-00805f9b34fb"

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v2

    const-string v3, "fromString(\"0000fee7-0000-1000-8000-00805f9b34fb\")"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "NOKE_SERVICE_UUID"

    const/4 v5, 0x0

    invoke-direct {v0, v4, v5, v2}, LKW;-><init>(Ljava/lang/String;ILjava/util/UUID;)V

    sput-object v0, LKW;->c:LKW;

    new-instance v0, LKW;

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "SOLEBE_SERVICE_UUID"

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, LKW;-><init>(Ljava/lang/String;ILjava/util/UUID;)V

    sput-object v0, LKW;->d:LKW;

    invoke-static {}, LKW;->a()[LKW;

    move-result-object v0

    sput-object v0, LKW;->e:[LKW;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/util/UUID;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/UUID;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LKW;->b:Ljava/util/UUID;

    return-void
.end method

.method public static final synthetic a()[LKW;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [LKW;

    const/4 v1, 0x0

    sget-object v2, LKW;->c:LKW;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LKW;->d:LKW;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LKW;
    .locals 1

    const-class v0, LKW;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LKW;

    return-object p0
.end method

.method public static values()[LKW;
    .locals 1

    sget-object v0, LKW;->e:[LKW;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LKW;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, LKW;->b:Ljava/util/UUID;

    return-object v0
.end method
