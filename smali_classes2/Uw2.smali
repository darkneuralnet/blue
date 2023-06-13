.class public final enum LUw2;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LUw2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004j\u0002\u0008\u0003j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "LUw2;",
        "",
        "",
        "b",
        "()Z",
        "isArLocationSource",
        "<init>",
        "(Ljava/lang/String;I)V",
        "c",
        "d",
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
.field public static final enum b:LUw2;

.field public static final enum c:LUw2;

.field public static final enum d:LUw2;

.field public static final synthetic e:[LUw2;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LUw2;

    const-string v1, "GPS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LUw2;-><init>(Ljava/lang/String;I)V

    sput-object v0, LUw2;->b:LUw2;

    new-instance v0, LUw2;

    const-string v1, "MANUAL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LUw2;-><init>(Ljava/lang/String;I)V

    sput-object v0, LUw2;->c:LUw2;

    new-instance v0, LUw2;

    const-string v1, "VPS"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LUw2;-><init>(Ljava/lang/String;I)V

    sput-object v0, LUw2;->d:LUw2;

    invoke-static {}, LUw2;->a()[LUw2;

    move-result-object v0

    sput-object v0, LUw2;->e:[LUw2;

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

.method public static final synthetic a()[LUw2;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [LUw2;

    const/4 v1, 0x0

    sget-object v2, LUw2;->b:LUw2;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LUw2;->c:LUw2;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LUw2;->d:LUw2;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LUw2;
    .locals 1

    const-class v0, LUw2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LUw2;

    return-object p0
.end method

.method public static values()[LUw2;
    .locals 1

    sget-object v0, LUw2;->e:[LUw2;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LUw2;

    return-object v0
.end method


# virtual methods
.method public final b()Z
    .locals 1

    sget-object v0, LUw2;->d:LUw2;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
