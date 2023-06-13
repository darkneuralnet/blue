.class public final enum LI1;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LI1;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0005j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "LI1;",
        "",
        "",
        "a",
        "b",
        "Z",
        "canExtendToken",
        "<init>",
        "(Ljava/lang/String;IZ)V",
        "c",
        "d",
        "e",
        "f",
        "g",
        "h",
        "i",
        "j",
        "k",
        "facebook-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final enum c:LI1;

.field public static final enum d:LI1;

.field public static final enum e:LI1;

.field public static final enum f:LI1;

.field public static final enum g:LI1;

.field public static final enum h:LI1;

.field public static final enum i:LI1;

.field public static final enum j:LI1;

.field public static final enum k:LI1;

.field public static final synthetic l:[LI1;


# instance fields
.field public final b:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const/16 v0, 0x9

    new-array v0, v0, [LI1;

    new-instance v1, LI1;

    const-string v2, "NONE"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3, v3}, LI1;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, LI1;->c:LI1;

    aput-object v1, v0, v3

    new-instance v1, LI1;

    const-string v2, "FACEBOOK_APPLICATION_WEB"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, LI1;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, LI1;->d:LI1;

    aput-object v1, v0, v3

    new-instance v1, LI1;

    const-string v2, "FACEBOOK_APPLICATION_NATIVE"

    const/4 v4, 0x2

    invoke-direct {v1, v2, v4, v3}, LI1;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, LI1;->e:LI1;

    aput-object v1, v0, v4

    new-instance v1, LI1;

    const-string v2, "FACEBOOK_APPLICATION_SERVICE"

    const/4 v4, 0x3

    invoke-direct {v1, v2, v4, v3}, LI1;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, LI1;->f:LI1;

    aput-object v1, v0, v4

    new-instance v1, LI1;

    const-string v2, "WEB_VIEW"

    const/4 v4, 0x4

    invoke-direct {v1, v2, v4, v3}, LI1;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, LI1;->g:LI1;

    aput-object v1, v0, v4

    new-instance v1, LI1;

    const-string v2, "CHROME_CUSTOM_TAB"

    const/4 v4, 0x5

    invoke-direct {v1, v2, v4, v3}, LI1;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, LI1;->h:LI1;

    aput-object v1, v0, v4

    new-instance v1, LI1;

    const-string v2, "TEST_USER"

    const/4 v4, 0x6

    invoke-direct {v1, v2, v4, v3}, LI1;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, LI1;->i:LI1;

    aput-object v1, v0, v4

    new-instance v1, LI1;

    const-string v2, "CLIENT_TOKEN"

    const/4 v4, 0x7

    invoke-direct {v1, v2, v4, v3}, LI1;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, LI1;->j:LI1;

    aput-object v1, v0, v4

    new-instance v1, LI1;

    const-string v2, "DEVICE_AUTH"

    const/16 v4, 0x8

    invoke-direct {v1, v2, v4, v3}, LI1;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, LI1;->k:LI1;

    aput-object v1, v0, v4

    sput-object v0, LI1;->l:[LI1;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, LI1;->b:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LI1;
    .locals 1

    const-class v0, LI1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LI1;

    return-object p0
.end method

.method public static values()[LI1;
    .locals 1

    sget-object v0, LI1;->l:[LI1;

    invoke-virtual {v0}, [LI1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LI1;

    return-object v0
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, LI1;->b:Z

    return v0
.end method
