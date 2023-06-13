.class public final enum LWT2;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LWT2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0010\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "LWT2;",
        "",
        "",
        "b",
        "Ljava/lang/String;",
        "a",
        "()Ljava/lang/String;",
        "value",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "c",
        "d",
        "e",
        "f",
        "g",
        "h",
        "i",
        "j",
        "fuel"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final enum c:LWT2;

.field public static final enum d:LWT2;

.field public static final enum e:LWT2;

.field public static final enum f:LWT2;

.field public static final enum g:LWT2;

.field public static final enum h:LWT2;

.field public static final enum i:LWT2;

.field public static final enum j:LWT2;

.field public static final synthetic k:[LWT2;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x8

    new-array v0, v0, [LWT2;

    new-instance v1, LWT2;

    const-string v2, "GET"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3, v2}, LWT2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, LWT2;->c:LWT2;

    aput-object v1, v0, v3

    new-instance v1, LWT2;

    const-string v2, "HEAD"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v2}, LWT2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, LWT2;->d:LWT2;

    aput-object v1, v0, v3

    new-instance v1, LWT2;

    const-string v2, "POST"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3, v2}, LWT2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, LWT2;->e:LWT2;

    aput-object v1, v0, v3

    new-instance v1, LWT2;

    const-string v2, "PUT"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3, v2}, LWT2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, LWT2;->f:LWT2;

    aput-object v1, v0, v3

    new-instance v1, LWT2;

    const-string v2, "DELETE"

    const/4 v3, 0x4

    invoke-direct {v1, v2, v3, v2}, LWT2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, LWT2;->g:LWT2;

    aput-object v1, v0, v3

    new-instance v1, LWT2;

    const-string v2, "OPTIONS"

    const/4 v3, 0x5

    invoke-direct {v1, v2, v3, v2}, LWT2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, LWT2;->h:LWT2;

    aput-object v1, v0, v3

    new-instance v1, LWT2;

    const-string v2, "TRACE"

    const/4 v3, 0x6

    invoke-direct {v1, v2, v3, v2}, LWT2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, LWT2;->i:LWT2;

    aput-object v1, v0, v3

    new-instance v1, LWT2;

    const-string v2, "PATCH"

    const/4 v3, 0x7

    invoke-direct {v1, v2, v3, v2}, LWT2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, LWT2;->j:LWT2;

    aput-object v1, v0, v3

    sput-object v0, LWT2;->k:[LWT2;

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

    iput-object p3, p0, LWT2;->b:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LWT2;
    .locals 1

    const-class v0, LWT2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LWT2;

    return-object p0
.end method

.method public static values()[LWT2;
    .locals 1

    sget-object v0, LWT2;->k:[LWT2;

    invoke-virtual {v0}, [LWT2;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LWT2;

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LWT2;->b:Ljava/lang/String;

    return-object v0
.end method
