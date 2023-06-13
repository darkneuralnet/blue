.class public final enum LzT2;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LzT2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\t\u0008\u0087\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "LzT2;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "c",
        "d",
        "e",
        "f",
        "g",
        "android-sdk-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final enum b:LzT2;

.field public static final enum c:LzT2;

.field public static final enum d:LzT2;

.field public static final enum e:LzT2;

.field public static final enum f:LzT2;

.field public static final enum g:LzT2;

.field public static final synthetic h:[LzT2;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LzT2;

    const-string v1, "SLIDEUP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LzT2;-><init>(Ljava/lang/String;I)V

    sput-object v0, LzT2;->b:LzT2;

    new-instance v0, LzT2;

    const-string v1, "MODAL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LzT2;-><init>(Ljava/lang/String;I)V

    sput-object v0, LzT2;->c:LzT2;

    new-instance v0, LzT2;

    const-string v1, "FULL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LzT2;-><init>(Ljava/lang/String;I)V

    sput-object v0, LzT2;->d:LzT2;

    new-instance v0, LzT2;

    const-string v1, "HTML_FULL"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LzT2;-><init>(Ljava/lang/String;I)V

    sput-object v0, LzT2;->e:LzT2;

    new-instance v0, LzT2;

    const-string v1, "HTML"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LzT2;-><init>(Ljava/lang/String;I)V

    sput-object v0, LzT2;->f:LzT2;

    new-instance v0, LzT2;

    const-string v1, "CONTROL"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, LzT2;-><init>(Ljava/lang/String;I)V

    sput-object v0, LzT2;->g:LzT2;

    invoke-static {}, LzT2;->a()[LzT2;

    move-result-object v0

    sput-object v0, LzT2;->h:[LzT2;

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

.method public static final synthetic a()[LzT2;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [LzT2;

    sget-object v1, LzT2;->b:LzT2;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LzT2;->c:LzT2;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LzT2;->d:LzT2;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, LzT2;->e:LzT2;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, LzT2;->f:LzT2;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, LzT2;->g:LzT2;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LzT2;
    .locals 1

    const-class v0, LzT2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LzT2;

    return-object p0
.end method

.method public static values()[LzT2;
    .locals 1

    sget-object v0, LzT2;->h:[LzT2;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LzT2;

    return-object v0
.end method
