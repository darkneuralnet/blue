.class public final enum LzI4;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LzI4;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0004\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "LzI4;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "ownedbirds_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum b:LzI4;

.field public static final synthetic c:[LzI4;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LzI4;

    const-string v1, "OWNED_BIRD_DETAILS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LzI4;-><init>(Ljava/lang/String;I)V

    sput-object v0, LzI4;->b:LzI4;

    invoke-static {}, LzI4;->a()[LzI4;

    move-result-object v0

    sput-object v0, LzI4;->c:[LzI4;

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

.method public static final synthetic a()[LzI4;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [LzI4;

    const/4 v1, 0x0

    sget-object v2, LzI4;->b:LzI4;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LzI4;
    .locals 1

    const-class v0, LzI4;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LzI4;

    return-object p0
.end method

.method public static values()[LzI4;
    .locals 1

    sget-object v0, LzI4;->c:[LzI4;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LzI4;

    return-object v0
.end method