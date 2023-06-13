.class public final Lq63;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lokhttp3/OkHttpClient;",
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
            "LOp;",
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
            "LOp;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq63;->a:LP43;

    iput-object p2, p0, Lq63;->b:LY94;

    iput-object p3, p0, Lq63;->c:LY94;

    return-void
.end method

.method public static a(LP43;LY94;LY94;)Lq63;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP43;",
            "LY94<",
            "Lokhttp3/OkHttpClient;",
            ">;",
            "LY94<",
            "LOp;",
            ">;)",
            "Lq63;"
        }
    .end annotation

    new-instance v0, Lq63;

    invoke-direct {v0, p0, p1, p2}, Lq63;-><init>(LP43;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LP43;Lokhttp3/OkHttpClient;LOp;)Lokhttp3/OkHttpClient;
    .locals 0

    invoke-virtual {p0, p1, p2}, LP43;->D0(Lokhttp3/OkHttpClient;LOp;)Lokhttp3/OkHttpClient;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lokhttp3/OkHttpClient;

    return-object p0
.end method


# virtual methods
.method public b()Lokhttp3/OkHttpClient;
    .locals 3

    iget-object v0, p0, Lq63;->a:LP43;

    iget-object v1, p0, Lq63;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lokhttp3/OkHttpClient;

    iget-object v2, p0, Lq63;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LOp;

    invoke-static {v0, v1, v2}, Lq63;->c(LP43;Lokhttp3/OkHttpClient;LOp;)Lokhttp3/OkHttpClient;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lq63;->b()Lokhttp3/OkHttpClient;

    move-result-object v0

    return-object v0
.end method
