.class public final enum LEH3;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LEH3$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LEH3;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004j\u0002\u0008\u0003j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "LEH3;",
        "",
        "",
        "b",
        "()Ljava/lang/String;",
        "stageName",
        "<init>",
        "(Ljava/lang/String;I)V",
        "c",
        "d",
        "co.bird.android.feature.ar-parking"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum b:LEH3;

.field public static final enum c:LEH3;

.field public static final enum d:LEH3;

.field public static final synthetic e:[LEH3;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LEH3;

    const-string v1, "SURROUNDINGS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LEH3;-><init>(Ljava/lang/String;I)V

    sput-object v0, LEH3;->b:LEH3;

    new-instance v0, LEH3;

    const-string v1, "FIND_PARKING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LEH3;-><init>(Ljava/lang/String;I)V

    sput-object v0, LEH3;->c:LEH3;

    new-instance v0, LEH3;

    const-string v1, "ANCHOR"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LEH3;-><init>(Ljava/lang/String;I)V

    sput-object v0, LEH3;->d:LEH3;

    invoke-static {}, LEH3;->a()[LEH3;

    move-result-object v0

    sput-object v0, LEH3;->e:[LEH3;

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

.method public static final synthetic a()[LEH3;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [LEH3;

    const/4 v1, 0x0

    sget-object v2, LEH3;->b:LEH3;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LEH3;->c:LEH3;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LEH3;->d:LEH3;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LEH3;
    .locals 1

    const-class v0, LEH3;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LEH3;

    return-object p0
.end method

.method public static values()[LEH3;
    .locals 1

    sget-object v0, LEH3;->e:[LEH3;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LEH3;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 2

    sget-object v0, LEH3$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const-string v0, "scan_bird"

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    const-string v0, "find_parking"

    goto :goto_0

    :cond_2
    const-string v0, "scan_surroundings"

    :goto_0
    return-object v0
.end method
