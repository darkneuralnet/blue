.class public final Lwj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LXm;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lhj;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/persistence/area/impl/AreaDatabase;",
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
            "Lco/bird/android/persistence/area/impl/AreaDatabase;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwj;->a:Lhj;

    iput-object p2, p0, Lwj;->b:LY94;

    return-void
.end method

.method public static a(Lhj;LY94;)Lwj;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj;",
            "LY94<",
            "Lco/bird/android/persistence/area/impl/AreaDatabase;",
            ">;)",
            "Lwj;"
        }
    .end annotation

    new-instance v0, Lwj;

    invoke-direct {v0, p0, p1}, Lwj;-><init>(Lhj;LY94;)V

    return-object v0
.end method

.method public static c(Lhj;Lco/bird/android/persistence/area/impl/AreaDatabase;)LXm;
    .locals 0

    invoke-virtual {p0, p1}, Lhj;->o(Lco/bird/android/persistence/area/impl/AreaDatabase;)LXm;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LXm;

    return-object p0
.end method


# virtual methods
.method public b()LXm;
    .locals 2

    iget-object v0, p0, Lwj;->a:Lhj;

    iget-object v1, p0, Lwj;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/persistence/area/impl/AreaDatabase;

    invoke-static {v0, v1}, Lwj;->c(Lhj;Lco/bird/android/persistence/area/impl/AreaDatabase;)LXm;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lwj;->b()LXm;

    move-result-object v0

    return-object v0
.end method
