.class public final LSB1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LaM;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lbn;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LDB1;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LLifecycleOwner;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LaM;",
            ">;",
            "LY94<",
            "Lbn;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LDB1;",
            ">;",
            "LY94<",
            "LLifecycleOwner;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSB1;->a:LY94;

    iput-object p2, p0, LSB1;->b:LY94;

    iput-object p3, p0, LSB1;->c:LY94;

    iput-object p4, p0, LSB1;->d:LY94;

    iput-object p5, p0, LSB1;->e:LY94;

    iput-object p6, p0, LSB1;->f:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;)LSB1;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LaM;",
            ">;",
            "LY94<",
            "Lbn;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LDB1;",
            ">;",
            "LY94<",
            "LLifecycleOwner;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;)",
            "LSB1;"
        }
    .end annotation

    new-instance v7, LSB1;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, LSB1;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v7
.end method

.method public static c(LaM;Lbn;LTq4;LDB1;LLifecycleOwner;Lgl;Lvt4;)Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;
    .locals 9

    new-instance v8, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;-><init>(LaM;Lbn;LTq4;LDB1;LLifecycleOwner;Lgl;Lvt4;)V

    return-object v8
.end method


# virtual methods
.method public b(Lvt4;)Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;
    .locals 8

    iget-object v0, p0, LSB1;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LaM;

    iget-object v0, p0, LSB1;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lbn;

    iget-object v0, p0, LSB1;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LTq4;

    iget-object v0, p0, LSB1;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LDB1;

    iget-object v0, p0, LSB1;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LLifecycleOwner;

    iget-object v0, p0, LSB1;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lgl;

    move-object v7, p1

    invoke-static/range {v1 .. v7}, LSB1;->c(LaM;Lbn;LTq4;LDB1;LLifecycleOwner;Lgl;Lvt4;)Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;

    move-result-object p1

    return-object p1
.end method
