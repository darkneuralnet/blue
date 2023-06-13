.class public final Lg73;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LMN4$b;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LP43;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lokhttp3/OkHttpClient;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lwi2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LP43;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP43;",
            "LY94<",
            "Lokhttp3/OkHttpClient;",
            ">;",
            "LY94<",
            "Lwi2;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg73;->a:LP43;

    iput-object p2, p0, Lg73;->b:LY94;

    iput-object p3, p0, Lg73;->c:LY94;

    return-void
.end method

.method public static a(LP43;LY94;LY94;)Lg73;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP43;",
            "LY94<",
            "Lokhttp3/OkHttpClient;",
            ">;",
            "LY94<",
            "Lwi2;",
            ">;)",
            "Lg73;"
        }
    .end annotation

    new-instance v0, Lg73;

    invoke-direct {v0, p0, p1, p2}, Lg73;-><init>(LP43;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LP43;Lokhttp3/OkHttpClient;Lwi2;)LMN4$b;
    .locals 0

    invoke-virtual {p0, p1, p2}, LP43;->v1(Lokhttp3/OkHttpClient;Lwi2;)LMN4$b;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LMN4$b;

    return-object p0
.end method


# virtual methods
.method public b()LMN4$b;
    .locals 3

    iget-object v0, p0, Lg73;->a:LP43;

    iget-object v1, p0, Lg73;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lokhttp3/OkHttpClient;

    iget-object v2, p0, Lg73;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwi2;

    invoke-static {v0, v1, v2}, Lg73;->c(LP43;Lokhttp3/OkHttpClient;Lwi2;)LMN4$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lg73;->b()LMN4$b;

    move-result-object v0

    return-object v0
.end method
