.class public final enum LWi5;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LWi5;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0082\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "LWi5;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "c",
        "d",
        "e",
        "f",
        "material_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum b:LWi5;

.field public static final enum c:LWi5;

.field public static final enum d:LWi5;

.field public static final enum e:LWi5;

.field public static final enum f:LWi5;

.field public static final synthetic g:[LWi5;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LWi5;

    const-string v1, "TopBar"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LWi5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LWi5;->b:LWi5;

    new-instance v0, LWi5;

    const-string v1, "MainContent"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LWi5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LWi5;->c:LWi5;

    new-instance v0, LWi5;

    const-string v1, "Snackbar"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LWi5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LWi5;->d:LWi5;

    new-instance v0, LWi5;

    const-string v1, "Fab"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LWi5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LWi5;->e:LWi5;

    new-instance v0, LWi5;

    const-string v1, "BottomBar"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LWi5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LWi5;->f:LWi5;

    invoke-static {}, LWi5;->a()[LWi5;

    move-result-object v0

    sput-object v0, LWi5;->g:[LWi5;

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

.method public static final synthetic a()[LWi5;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [LWi5;

    const/4 v1, 0x0

    sget-object v2, LWi5;->b:LWi5;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LWi5;->c:LWi5;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LWi5;->d:LWi5;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LWi5;->e:LWi5;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, LWi5;->f:LWi5;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LWi5;
    .locals 1

    const-class v0, LWi5;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LWi5;

    return-object p0
.end method

.method public static values()[LWi5;
    .locals 1

    sget-object v0, LWi5;->g:[LWi5;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LWi5;

    return-object v0
.end method
