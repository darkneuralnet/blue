.class public LEW0$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LEW0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "j"
.end annotation


# instance fields
.field public final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "+",
            "LDl0<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public c:Ljava/lang/Runnable;

.field public d:LU74;

.field public e:LQN5;

.field public f:F

.field public final synthetic g:LEW0;


# direct methods
.method public constructor <init>(LEW0;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "LDl0<",
            "TT;>;>;)V"
        }
    .end annotation

    iput-object p1, p0, LEW0$j;->g:LEW0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LEW0$j;->b:Ljava/util/Set;

    return-void
.end method

.method public synthetic constructor <init>(LEW0;Ljava/util/Set;LJW0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LEW0$j;-><init>(LEW0;Ljava/util/Set;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, LEW0$j;->c:Ljava/lang/Runnable;

    return-void
.end method

.method public b(F)V
    .locals 5

    iput p1, p0, LEW0$j;->f:F

    new-instance v0, LQN5;

    iget-object v1, p0, LEW0$j;->g:LEW0;

    invoke-static {v1}, LEW0;->m(LEW0;)F

    move-result v1

    invoke-static {p1, v1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    float-to-double v1, p1

    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    const-wide/high16 v3, 0x4070000000000000L    # 256.0

    mul-double/2addr v1, v3

    invoke-direct {v0, v1, v2}, LQN5;-><init>(D)V

    iput-object v0, p0, LEW0$j;->e:LQN5;

    return-void
.end method

.method public c(LU74;)V
    .locals 0

    iput-object p1, p0, LEW0$j;->d:LU74;

    return-void
.end method

.method public run()V
    .locals 15
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    iget-object v0, p0, LEW0$j;->b:Ljava/util/Set;

    iget-object v1, p0, LEW0$j;->g:LEW0;

    invoke-static {v1}, LEW0;->e(LEW0;)Ljava/util/Set;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LEW0$j;->c:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_0
    new-instance v0, LEW0$h;

    iget-object v1, p0, LEW0$j;->g:LEW0;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LEW0$h;-><init>(LEW0;LHW0;)V

    iget v1, p0, LEW0$j;->f:F

    iget-object v3, p0, LEW0$j;->g:LEW0;

    invoke-static {v3}, LEW0;->m(LEW0;)F

    move-result v3

    cmpl-float v3, v1, v3

    const/4 v4, 0x1

    if-lez v3, :cond_1

    move v3, v4

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    iget-object v5, p0, LEW0$j;->g:LEW0;

    invoke-static {v5}, LEW0;->m(LEW0;)F

    move-result v5

    sub-float v5, v1, v5

    iget-object v6, p0, LEW0$j;->g:LEW0;

    invoke-static {v6}, LEW0;->l(LEW0;)Ljava/util/Set;

    move-result-object v6

    iget-object v7, p0, LEW0$j;->d:LU74;

    invoke-virtual {v7}, LU74;->b()Lcom/google/android/gms/maps/model/VisibleRegion;

    move-result-object v7

    iget-object v7, v7, Lcom/google/android/gms/maps/model/VisibleRegion;->f:Lcom/google/android/gms/maps/model/LatLngBounds;

    iget-object v8, p0, LEW0$j;->g:LEW0;

    invoke-static {v8}, LEW0;->e(LEW0;)Ljava/util/Set;

    move-result-object v8

    if-eqz v8, :cond_3

    invoke-static {}, LEW0;->r()Z

    move-result v8

    if-eqz v8, :cond_3

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iget-object v9, p0, LEW0$j;->g:LEW0;

    invoke-static {v9}, LEW0;->e(LEW0;)Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_2
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LDl0;

    iget-object v11, p0, LEW0$j;->g:LEW0;

    invoke-virtual {v11, v10}, LEW0;->shouldRenderAsCluster(LDl0;)Z

    move-result v11

    if-eqz v11, :cond_2

    invoke-interface {v10}, LDl0;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v11

    invoke-virtual {v7, v11}, Lcom/google/android/gms/maps/model/LatLngBounds;->u(Lcom/google/android/gms/maps/model/LatLng;)Z

    move-result v11

    if-eqz v11, :cond_2

    iget-object v11, p0, LEW0$j;->e:LQN5;

    invoke-interface {v10}, LDl0;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v10

    invoke-virtual {v11, v10}, LQN5;->b(Lcom/google/android/gms/maps/model/LatLng;)LEW3;

    move-result-object v10

    invoke-interface {v8, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    move-object v8, v2

    :cond_4
    new-instance v9, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v9}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    invoke-static {v9}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v9

    iget-object v10, p0, LEW0$j;->b:Ljava/util/Set;

    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_7

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LDl0;

    invoke-interface {v11}, LDl0;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v12

    invoke-virtual {v7, v12}, Lcom/google/android/gms/maps/model/LatLngBounds;->u(Lcom/google/android/gms/maps/model/LatLng;)Z

    move-result v12

    if-eqz v3, :cond_6

    if-eqz v12, :cond_6

    invoke-static {}, LEW0;->r()Z

    move-result v13

    if-eqz v13, :cond_6

    iget-object v12, p0, LEW0$j;->e:LQN5;

    invoke-interface {v11}, LDl0;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v13

    invoke-virtual {v12, v13}, LQN5;->b(Lcom/google/android/gms/maps/model/LatLng;)LEW3;

    move-result-object v12

    invoke-static {v8, v12}, LEW0;->s(Ljava/util/List;LGW3;)LGW3;

    move-result-object v12

    if-eqz v12, :cond_5

    iget-object v13, p0, LEW0$j;->g:LEW0;

    invoke-static {v13}, LEW0;->a(LEW0;)Z

    move-result v13

    if-eqz v13, :cond_5

    iget-object v13, p0, LEW0$j;->e:LQN5;

    invoke-virtual {v13, v12}, LQN5;->a(LGW3;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v12

    new-instance v13, LEW0$f;

    iget-object v14, p0, LEW0$j;->g:LEW0;

    invoke-direct {v13, v14, v11, v9, v12}, LEW0$f;-><init>(LEW0;LDl0;Ljava/util/Set;Lcom/google/android/gms/maps/model/LatLng;)V

    invoke-virtual {v0, v4, v13}, LEW0$h;->a(ZLEW0$f;)V

    goto :goto_2

    :cond_5
    new-instance v12, LEW0$f;

    iget-object v13, p0, LEW0$j;->g:LEW0;

    invoke-direct {v12, v13, v11, v9, v2}, LEW0$f;-><init>(LEW0;LDl0;Ljava/util/Set;Lcom/google/android/gms/maps/model/LatLng;)V

    invoke-virtual {v0, v4, v12}, LEW0$h;->a(ZLEW0$f;)V

    goto :goto_2

    :cond_6
    new-instance v13, LEW0$f;

    iget-object v14, p0, LEW0$j;->g:LEW0;

    invoke-direct {v13, v14, v11, v9, v2}, LEW0$f;-><init>(LEW0;LDl0;Ljava/util/Set;Lcom/google/android/gms/maps/model/LatLng;)V

    invoke-virtual {v0, v12, v13}, LEW0$h;->a(ZLEW0$f;)V

    goto :goto_2

    :cond_7
    invoke-virtual {v0}, LEW0$h;->h()V

    invoke-interface {v6, v9}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    invoke-static {}, LEW0;->r()Z

    move-result v8

    if-eqz v8, :cond_9

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v8, p0, LEW0$j;->b:Ljava/util/Set;

    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_8
    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_9

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LDl0;

    iget-object v11, p0, LEW0$j;->g:LEW0;

    invoke-virtual {v11, v10}, LEW0;->shouldRenderAsCluster(LDl0;)Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-interface {v10}, LDl0;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v11

    invoke-virtual {v7, v11}, Lcom/google/android/gms/maps/model/LatLngBounds;->u(Lcom/google/android/gms/maps/model/LatLng;)Z

    move-result v11

    if-eqz v11, :cond_8

    iget-object v11, p0, LEW0$j;->e:LQN5;

    invoke-interface {v10}, LDl0;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v10

    invoke-virtual {v11, v10}, LQN5;->b(Lcom/google/android/gms/maps/model/LatLng;)LEW3;

    move-result-object v10

    invoke-interface {v2, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_9
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LEW0$i;

    invoke-static {v8}, LEW0$i;->b(LEW0$i;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v10

    invoke-virtual {v7, v10}, Lcom/google/android/gms/maps/model/LatLngBounds;->u(Lcom/google/android/gms/maps/model/LatLng;)Z

    move-result v10

    if-nez v3, :cond_b

    const/high16 v11, -0x3fc00000    # -3.0f

    cmpl-float v11, v5, v11

    if-lez v11, :cond_b

    if-eqz v10, :cond_b

    invoke-static {}, LEW0;->r()Z

    move-result v11

    if-eqz v11, :cond_b

    iget-object v10, p0, LEW0$j;->e:LQN5;

    invoke-static {v8}, LEW0$i;->b(LEW0$i;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v11

    invoke-virtual {v10, v11}, LQN5;->b(Lcom/google/android/gms/maps/model/LatLng;)LEW3;

    move-result-object v10

    invoke-static {v2, v10}, LEW0;->s(Ljava/util/List;LGW3;)LGW3;

    move-result-object v10

    if-eqz v10, :cond_a

    iget-object v11, p0, LEW0$j;->g:LEW0;

    invoke-static {v11}, LEW0;->a(LEW0;)Z

    move-result v11

    if-eqz v11, :cond_a

    iget-object v11, p0, LEW0$j;->e:LQN5;

    invoke-virtual {v11, v10}, LQN5;->a(LGW3;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v10

    invoke-static {v8}, LEW0$i;->b(LEW0$i;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v11

    invoke-virtual {v0, v8, v11, v10}, LEW0$h;->c(LEW0$i;Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V

    goto :goto_4

    :cond_a
    invoke-static {v8}, LEW0$i;->a(LEW0$i;)LfM2;

    move-result-object v8

    invoke-virtual {v0, v4, v8}, LEW0$h;->f(ZLfM2;)V

    goto :goto_4

    :cond_b
    invoke-static {v8}, LEW0$i;->a(LEW0$i;)LfM2;

    move-result-object v8

    invoke-virtual {v0, v10, v8}, LEW0$h;->f(ZLfM2;)V

    goto :goto_4

    :cond_c
    invoke-virtual {v0}, LEW0$h;->h()V

    iget-object v0, p0, LEW0$j;->g:LEW0;

    invoke-static {v0, v9}, LEW0;->o(LEW0;Ljava/util/Set;)V

    iget-object v0, p0, LEW0$j;->g:LEW0;

    iget-object v2, p0, LEW0$j;->b:Ljava/util/Set;

    invoke-static {v0, v2}, LEW0;->n(LEW0;Ljava/util/Set;)V

    iget-object v0, p0, LEW0$j;->g:LEW0;

    invoke-static {v0, v1}, LEW0;->p(LEW0;F)V

    iget-object v0, p0, LEW0$j;->c:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method
