.class public final LdT0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LIS0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LdT0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Data:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LIS0<",
        "TData;>;"
    }
.end annotation


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:LdT0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LdT0$a<",
            "TData;>;"
        }
    .end annotation
.end field

.field public d:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TData;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;LdT0$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LdT0$a<",
            "TData;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LdT0$b;->b:Ljava/lang/String;

    iput-object p2, p0, LdT0$b;->c:LdT0$a;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TData;>;"
        }
    .end annotation

    iget-object v0, p0, LdT0$b;->c:LdT0$a;

    invoke-interface {v0}, LdT0$a;->a()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public b()LZS0;
    .locals 1

    sget-object v0, LZS0;->b:LZS0;

    return-object v0
.end method

.method public cancel()V
    .locals 0

    return-void
.end method

.method public cleanup()V
    .locals 2

    :try_start_0
    iget-object v0, p0, LdT0$b;->c:LdT0$a;

    iget-object v1, p0, LdT0$b;->d:Ljava/lang/Object;

    invoke-interface {v0, v1}, LdT0$a;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public e(LP24;LIS0$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP24;",
            "LIS0$a<",
            "-TData;>;)V"
        }
    .end annotation

    :try_start_0
    iget-object p1, p0, LdT0$b;->c:LdT0$a;

    iget-object v0, p0, LdT0$b;->b:Ljava/lang/String;

    invoke-interface {p1, v0}, LdT0$a;->decode(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, LdT0$b;->d:Ljava/lang/Object;

    invoke-interface {p2, p1}, LIS0$a;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-interface {p2, p1}, LIS0$a;->d(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method
