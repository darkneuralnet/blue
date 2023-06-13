.class public final LU53;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LdD1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LP43;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lokhttp3/OkHttpClient;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lwi2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LP43;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP43;",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Lokhttp3/OkHttpClient;",
            ">;",
            "LY94<",
            "Lwi2;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU53;->a:LP43;

    iput-object p2, p0, LU53;->b:LY94;

    iput-object p3, p0, LU53;->c:LY94;

    iput-object p4, p0, LU53;->d:LY94;

    return-void
.end method

.method public static a(LP43;LY94;LY94;LY94;)LU53;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP43;",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Lokhttp3/OkHttpClient;",
            ">;",
            "LY94<",
            "Lwi2;",
            ">;)",
            "LU53;"
        }
    .end annotation

    new-instance v0, LU53;

    invoke-direct {v0, p0, p1, p2, p3}, LU53;-><init>(LP43;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LP43;Landroid/content/Context;Lokhttp3/OkHttpClient;Lwi2;)LdD1;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LP43;->g0(Landroid/content/Context;Lokhttp3/OkHttpClient;Lwi2;)LdD1;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LdD1;

    return-object p0
.end method


# virtual methods
.method public b()LdD1;
    .locals 4

    iget-object v0, p0, LU53;->a:LP43;

    iget-object v1, p0, LU53;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, LU53;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lokhttp3/OkHttpClient;

    iget-object v3, p0, LU53;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwi2;

    invoke-static {v0, v1, v2, v3}, LU53;->c(LP43;Landroid/content/Context;Lokhttp3/OkHttpClient;Lwi2;)LdD1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LU53;->b()LdD1;

    move-result-object v0

    return-object v0
.end method
