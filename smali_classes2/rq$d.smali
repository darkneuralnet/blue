.class public final Lrq$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0002\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0005R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000e\u001a\u0004\u0008\u0008\u0010\u000f\u00a8\u0006\u0013"
    }
    d2 = {
        "Lrq$d;",
        "",
        "LNp;",
        "a",
        "LNp;",
        "()LNp;",
        "headerResult",
        "",
        "b",
        "Ljava/lang/String;",
        "c",
        "()Ljava/lang/String;",
        "shouldExchangeWithToken",
        "Lcom/auth0/android/jwt/JWT;",
        "Lcom/auth0/android/jwt/JWT;",
        "()Lcom/auth0/android/jwt/JWT;",
        "needsRefreshUsingJwt",
        "<init>",
        "(LNp;Ljava/lang/String;Lcom/auth0/android/jwt/JWT;)V",
        "auth_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:LNp;

.field public final b:Ljava/lang/String;

.field public final c:Lcom/auth0/android/jwt/JWT;


# direct methods
.method public constructor <init>(LNp;Ljava/lang/String;Lcom/auth0/android/jwt/JWT;)V
    .locals 1

    const-string v0, "headerResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrq$d;->a:LNp;

    iput-object p2, p0, Lrq$d;->b:Ljava/lang/String;

    iput-object p3, p0, Lrq$d;->c:Lcom/auth0/android/jwt/JWT;

    return-void
.end method

.method public synthetic constructor <init>(LNp;Ljava/lang/String;Lcom/auth0/android/jwt/JWT;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lrq$d;-><init>(LNp;Ljava/lang/String;Lcom/auth0/android/jwt/JWT;)V

    return-void
.end method


# virtual methods
.method public final a()LNp;
    .locals 1

    iget-object v0, p0, Lrq$d;->a:LNp;

    return-object v0
.end method

.method public final b()Lcom/auth0/android/jwt/JWT;
    .locals 1

    iget-object v0, p0, Lrq$d;->c:Lcom/auth0/android/jwt/JWT;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lrq$d;->b:Ljava/lang/String;

    return-object v0
.end method
