.class public final enum LS73;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LS73;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\t\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "LS73;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "c",
        "d",
        "e",
        "f",
        "g",
        "work-runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final enum b:LS73;

.field public static final enum c:LS73;

.field public static final enum d:LS73;

.field public static final enum e:LS73;

.field public static final enum f:LS73;

.field public static final enum g:LS73;

.field public static final synthetic h:[LS73;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LS73;

    const-string v1, "NOT_REQUIRED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LS73;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS73;->b:LS73;

    new-instance v0, LS73;

    const-string v1, "CONNECTED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LS73;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS73;->c:LS73;

    new-instance v0, LS73;

    const-string v1, "UNMETERED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LS73;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS73;->d:LS73;

    new-instance v0, LS73;

    const-string v1, "NOT_ROAMING"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LS73;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS73;->e:LS73;

    new-instance v0, LS73;

    const-string v1, "METERED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LS73;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS73;->f:LS73;

    new-instance v0, LS73;

    const-string v1, "TEMPORARILY_UNMETERED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, LS73;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS73;->g:LS73;

    invoke-static {}, LS73;->a()[LS73;

    move-result-object v0

    sput-object v0, LS73;->h:[LS73;

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

.method public static final synthetic a()[LS73;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [LS73;

    const/4 v1, 0x0

    sget-object v2, LS73;->b:LS73;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LS73;->c:LS73;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LS73;->d:LS73;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LS73;->e:LS73;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, LS73;->f:LS73;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, LS73;->g:LS73;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LS73;
    .locals 1

    const-class v0, LS73;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LS73;

    return-object p0
.end method

.method public static values()[LS73;
    .locals 1

    sget-object v0, LS73;->h:[LS73;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LS73;

    return-object v0
.end method
