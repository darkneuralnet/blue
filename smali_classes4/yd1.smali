.class public final Lyd1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lco/bird/android/manager/ride/EndRideManagerImpl;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LYR4;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lbn;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lpv0;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
            ">;"
        }
    .end annotation
.end field

.field public final g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ldr4;",
            ">;"
        }
    .end annotation
.end field

.field public final h:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LLifecycleOwner;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "LYR4;",
            ">;",
            "LY94<",
            "Lbn;",
            ">;",
            "LY94<",
            "Lpv0;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "Ldr4;",
            ">;",
            "LY94<",
            "LLifecycleOwner;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyd1;->a:LY94;

    iput-object p2, p0, Lyd1;->b:LY94;

    iput-object p3, p0, Lyd1;->c:LY94;

    iput-object p4, p0, Lyd1;->d:LY94;

    iput-object p5, p0, Lyd1;->e:LY94;

    iput-object p6, p0, Lyd1;->f:LY94;

    iput-object p7, p0, Lyd1;->g:LY94;

    iput-object p8, p0, Lyd1;->h:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)Lyd1;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "LYR4;",
            ">;",
            "LY94<",
            "Lbn;",
            ">;",
            "LY94<",
            "Lpv0;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "Ldr4;",
            ">;",
            "LY94<",
            "LLifecycleOwner;",
            ">;)",
            "Lyd1;"
        }
    .end annotation

    new-instance v9, Lyd1;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lyd1;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v9
.end method

.method public static c(Landroid/content/Context;LYR4;Lbn;Lpv0;LTq4;LEa;Ldr4;LLifecycleOwner;)Lco/bird/android/manager/ride/EndRideManagerImpl;
    .locals 10

    new-instance v9, Lco/bird/android/manager/ride/EndRideManagerImpl;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lco/bird/android/manager/ride/EndRideManagerImpl;-><init>(Landroid/content/Context;LYR4;Lbn;Lpv0;LTq4;LEa;Ldr4;LLifecycleOwner;)V

    return-object v9
.end method


# virtual methods
.method public b()Lco/bird/android/manager/ride/EndRideManagerImpl;
    .locals 9

    iget-object v0, p0, Lyd1;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    iget-object v0, p0, Lyd1;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LYR4;

    iget-object v0, p0, Lyd1;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lbn;

    iget-object v0, p0, Lyd1;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lpv0;

    iget-object v0, p0, Lyd1;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LTq4;

    iget-object v0, p0, Lyd1;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LEa;

    iget-object v0, p0, Lyd1;->g:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ldr4;

    iget-object v0, p0, Lyd1;->h:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, LLifecycleOwner;

    invoke-static/range {v1 .. v8}, Lyd1;->c(Landroid/content/Context;LYR4;Lbn;Lpv0;LTq4;LEa;Ldr4;LLifecycleOwner;)Lco/bird/android/manager/ride/EndRideManagerImpl;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lyd1;->b()Lco/bird/android/manager/ride/EndRideManagerImpl;

    move-result-object v0

    return-object v0
.end method
