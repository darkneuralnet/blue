.class public final enum LYC0$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYC0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LYC0$d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "LYC0$d;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "c",
        "d",
        "e",
        "f",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final enum b:LYC0$d;

.field public static final enum c:LYC0$d;

.field public static final enum d:LYC0$d;

.field public static final enum e:LYC0$d;

.field public static final enum f:LYC0$d;

.field public static final synthetic g:[LYC0$d;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LYC0$d;

    const-string v1, "CPU_ACQUIRED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LYC0$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LYC0$d;->b:LYC0$d;

    new-instance v0, LYC0$d;

    const-string v1, "BLOCKING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LYC0$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LYC0$d;->c:LYC0$d;

    new-instance v0, LYC0$d;

    const-string v1, "PARKING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LYC0$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LYC0$d;->d:LYC0$d;

    new-instance v0, LYC0$d;

    const-string v1, "DORMANT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LYC0$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LYC0$d;->e:LYC0$d;

    new-instance v0, LYC0$d;

    const-string v1, "TERMINATED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LYC0$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LYC0$d;->f:LYC0$d;

    invoke-static {}, LYC0$d;->a()[LYC0$d;

    move-result-object v0

    sput-object v0, LYC0$d;->g:[LYC0$d;

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

.method public static final synthetic a()[LYC0$d;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [LYC0$d;

    const/4 v1, 0x0

    sget-object v2, LYC0$d;->b:LYC0$d;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LYC0$d;->c:LYC0$d;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LYC0$d;->d:LYC0$d;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LYC0$d;->e:LYC0$d;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, LYC0$d;->f:LYC0$d;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LYC0$d;
    .locals 1

    const-class v0, LYC0$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LYC0$d;

    return-object p0
.end method

.method public static values()[LYC0$d;
    .locals 1

    sget-object v0, LYC0$d;->g:[LYC0$d;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LYC0$d;

    return-object v0
.end method
