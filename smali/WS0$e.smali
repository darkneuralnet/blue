.class public final enum LWS0$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LWS0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LWS0$e;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0080\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "LWS0$e;",
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
.field public static final enum b:LWS0$e;

.field public static final enum c:LWS0$e;

.field public static final enum d:LWS0$e;

.field public static final synthetic e:[LWS0$e;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LWS0$e;

    const-string v1, "POSITIONAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LWS0$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LWS0$e;->b:LWS0$e;

    new-instance v0, LWS0$e;

    const-string v1, "PAGE_KEYED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LWS0$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LWS0$e;->c:LWS0$e;

    new-instance v0, LWS0$e;

    const-string v1, "ITEM_KEYED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LWS0$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LWS0$e;->d:LWS0$e;

    invoke-static {}, LWS0$e;->a()[LWS0$e;

    move-result-object v0

    sput-object v0, LWS0$e;->e:[LWS0$e;

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

.method public static final synthetic a()[LWS0$e;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [LWS0$e;

    const/4 v1, 0x0

    sget-object v2, LWS0$e;->b:LWS0$e;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LWS0$e;->c:LWS0$e;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LWS0$e;->d:LWS0$e;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LWS0$e;
    .locals 1

    const-class v0, LWS0$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LWS0$e;

    return-object p0
.end method

.method public static values()[LWS0$e;
    .locals 1

    sget-object v0, LWS0$e;->e:[LWS0$e;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LWS0$e;

    return-object v0
.end method
