.class public final enum LH2;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LH2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0004\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "LH2;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "core-interface_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum b:LH2;

.field public static final synthetic c:[LH2;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LH2;

    const-string v1, "PARKING_NEAR_TO_NEST_ACTION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LH2;-><init>(Ljava/lang/String;I)V

    sput-object v0, LH2;->b:LH2;

    invoke-static {}, LH2;->a()[LH2;

    move-result-object v0

    sput-object v0, LH2;->c:[LH2;

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

.method public static final synthetic a()[LH2;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [LH2;

    const/4 v1, 0x0

    sget-object v2, LH2;->b:LH2;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LH2;
    .locals 1

    const-class v0, LH2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LH2;

    return-object p0
.end method

.method public static values()[LH2;
    .locals 1

    sget-object v0, LH2;->c:[LH2;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LH2;

    return-object v0
.end method
