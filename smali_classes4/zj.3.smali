.class public final Lzj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LbL;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lhj;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/persistence/bird/impl/BirdDatabase;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhj;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj;",
            "LY94<",
            "Lco/bird/android/persistence/bird/impl/BirdDatabase;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzj;->a:Lhj;

    iput-object p2, p0, Lzj;->b:LY94;

    return-void
.end method

.method public static a(Lhj;LY94;)Lzj;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj;",
            "LY94<",
            "Lco/bird/android/persistence/bird/impl/BirdDatabase;",
            ">;)",
            "Lzj;"
        }
    .end annotation

    new-instance v0, Lzj;

    invoke-direct {v0, p0, p1}, Lzj;-><init>(Lhj;LY94;)V

    return-object v0
.end method

.method public static c(Lhj;Lco/bird/android/persistence/bird/impl/BirdDatabase;)LbL;
    .locals 0

    invoke-virtual {p0, p1}, Lhj;->r(Lco/bird/android/persistence/bird/impl/BirdDatabase;)LbL;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LbL;

    return-object p0
.end method


# virtual methods
.method public b()LbL;
    .locals 2

    iget-object v0, p0, Lzj;->a:Lhj;

    iget-object v1, p0, Lzj;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/persistence/bird/impl/BirdDatabase;

    invoke-static {v0, v1}, Lzj;->c(Lhj;Lco/bird/android/persistence/bird/impl/BirdDatabase;)LbL;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzj;->b()LbL;

    move-result-object v0

    return-object v0
.end method
