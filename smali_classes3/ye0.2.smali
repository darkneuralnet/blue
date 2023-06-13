.class public final enum Lye0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lye0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lye0;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "c",
        "d",
        "e",
        "co.bird.android.feature.operator.bottomsheets"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum b:Lye0;

.field public static final enum c:Lye0;

.field public static final enum d:Lye0;

.field public static final enum e:Lye0;

.field public static final synthetic f:[Lye0;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lye0;

    const-string v1, "LIMITED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lye0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lye0;->b:Lye0;

    new-instance v0, Lye0;

    const-string v1, "LOCKED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lye0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lye0;->c:Lye0;

    new-instance v0, Lye0;

    const-string v1, "NO_DROPS"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lye0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lye0;->d:Lye0;

    new-instance v0, Lye0;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lye0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lye0;->e:Lye0;

    invoke-static {}, Lye0;->a()[Lye0;

    move-result-object v0

    sput-object v0, Lye0;->f:[Lye0;

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

.method public static final synthetic a()[Lye0;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lye0;

    const/4 v1, 0x0

    sget-object v2, Lye0;->b:Lye0;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lye0;->c:Lye0;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lye0;->d:Lye0;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lye0;->e:Lye0;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lye0;
    .locals 1

    const-class v0, Lye0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lye0;

    return-object p0
.end method

.method public static values()[Lye0;
    .locals 1

    sget-object v0, Lye0;->f:[Lye0;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lye0;

    return-object v0
.end method
