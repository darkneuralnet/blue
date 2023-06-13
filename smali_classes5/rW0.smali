.class public final enum LrW0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LrW0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u000c\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\u0008\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "LrW0;",
        "",
        "",
        "b",
        "Ljava/lang/String;",
        "a",
        "()Ljava/lang/String;",
        "nativeProtocolAudience",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "c",
        "d",
        "e",
        "f",
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
.field public static final enum c:LrW0;

.field public static final enum d:LrW0;

.field public static final enum e:LrW0;

.field public static final enum f:LrW0;

.field public static final synthetic g:[LrW0;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x4

    new-array v0, v0, [LrW0;

    new-instance v1, LrW0;

    const-string v2, "NONE"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v2, v4, v3}, LrW0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, LrW0;->c:LrW0;

    aput-object v1, v0, v4

    new-instance v1, LrW0;

    const-string v2, "ONLY_ME"

    const-string v3, "only_me"

    const/4 v4, 0x1

    invoke-direct {v1, v2, v4, v3}, LrW0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, LrW0;->d:LrW0;

    aput-object v1, v0, v4

    new-instance v1, LrW0;

    const-string v2, "FRIENDS"

    const-string v3, "friends"

    const/4 v4, 0x2

    invoke-direct {v1, v2, v4, v3}, LrW0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, LrW0;->e:LrW0;

    aput-object v1, v0, v4

    new-instance v1, LrW0;

    const-string v2, "EVERYONE"

    const-string v3, "everyone"

    const/4 v4, 0x3

    invoke-direct {v1, v2, v4, v3}, LrW0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, LrW0;->f:LrW0;

    aput-object v1, v0, v4

    sput-object v0, LrW0;->g:[LrW0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LrW0;->b:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LrW0;
    .locals 1

    const-class v0, LrW0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LrW0;

    return-object p0
.end method

.method public static values()[LrW0;
    .locals 1

    sget-object v0, LrW0;->g:[LrW0;

    invoke-virtual {v0}, [LrW0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LrW0;

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LrW0;->b:Ljava/lang/String;

    return-object v0
.end method
