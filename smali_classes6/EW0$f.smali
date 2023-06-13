.class public LEW0$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LEW0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "f"
.end annotation


# instance fields
.field public final a:LDl0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LDl0<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "LEW0$i;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lcom/google/android/gms/maps/model/LatLng;

.field public final synthetic d:LEW0;


# direct methods
.method public constructor <init>(LEW0;LDl0;Ljava/util/Set;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LDl0<",
            "TT;>;",
            "Ljava/util/Set<",
            "LEW0$i;",
            ">;",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LEW0$f;->d:LEW0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LEW0$f;->a:LDl0;

    iput-object p3, p0, LEW0$f;->b:Ljava/util/Set;

    iput-object p4, p0, LEW0$f;->c:Lcom/google/android/gms/maps/model/LatLng;

    return-void
.end method

.method public static bridge synthetic a(LEW0$f;LEW0$h;)V
    .locals 0

    invoke-virtual {p0, p1}, LEW0$f;->b(LEW0$h;)V

    return-void
.end method


# virtual methods
.method public final b(LEW0$h;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEW0<",
            "TT;>.h;)V"
        }
    .end annotation

    iget-object v0, p0, LEW0$f;->d:LEW0;

    iget-object v1, p0, LEW0$f;->a:LDl0;

    invoke-virtual {v0, v1}, LEW0;->shouldRenderAsCluster(LDl0;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_7

    iget-object v0, p0, LEW0$f;->a:LDl0;

    invoke-interface {v0}, LDl0;->b()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LEl0;

    iget-object v3, p0, LEW0$f;->d:LEW0;

    invoke-static {v3}, LEW0;->j(LEW0;)LEW0$g;

    move-result-object v3

    invoke-virtual {v3, v2}, LEW0$g;->a(Ljava/lang/Object;)LfM2;

    move-result-object v3

    if-nez v3, :cond_4

    new-instance v3, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v3}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    iget-object v4, p0, LEW0$f;->c:Lcom/google/android/gms/maps/model/LatLng;

    if-eqz v4, :cond_0

    invoke-virtual {v3, v4}, Lcom/google/android/gms/maps/model/MarkerOptions;->u1(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    goto :goto_1

    :cond_0
    invoke-interface {v2}, LEl0;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/maps/model/MarkerOptions;->u1(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    :goto_1
    invoke-interface {v2}, LEl0;->getTitle()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, LEl0;->getSnippet()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, LEl0;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/maps/model/MarkerOptions;->L1(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-interface {v2}, LEl0;->getSnippet()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/maps/model/MarkerOptions;->J1(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    goto :goto_2

    :cond_1
    invoke-interface {v2}, LEl0;->getSnippet()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, LEl0;->getSnippet()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/maps/model/MarkerOptions;->L1(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    goto :goto_2

    :cond_2
    invoke-interface {v2}, LEl0;->getTitle()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, LEl0;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/maps/model/MarkerOptions;->L1(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    :cond_3
    :goto_2
    invoke-interface {v2}, LEl0;->getZIndex()F

    move-result v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/maps/model/MarkerOptions;->Y1(F)Lcom/google/android/gms/maps/model/MarkerOptions;

    iget-object v4, p0, LEW0$f;->d:LEW0;

    invoke-virtual {v4, v2, v3}, LEW0;->onBeforeClusterItemRendered(LEl0;Lcom/google/android/gms/maps/model/MarkerOptions;)V

    iget-object v4, p0, LEW0$f;->d:LEW0;

    invoke-static {v4}, LEW0;->c(LEW0;)LGl0;

    move-result-object v4

    invoke-virtual {v4}, LGl0;->m()LlM2$a;

    move-result-object v4

    invoke-virtual {v4, v3}, LlM2$a;->e(Lcom/google/android/gms/maps/model/MarkerOptions;)LfM2;

    move-result-object v3

    new-instance v4, LEW0$i;

    invoke-direct {v4, v3, v1}, LEW0$i;-><init>(LfM2;LIW0;)V

    iget-object v5, p0, LEW0$f;->d:LEW0;

    invoke-static {v5}, LEW0;->j(LEW0;)LEW0$g;

    move-result-object v5

    invoke-virtual {v5, v2, v3}, LEW0$g;->c(Ljava/lang/Object;LfM2;)V

    iget-object v5, p0, LEW0$f;->c:Lcom/google/android/gms/maps/model/LatLng;

    if-eqz v5, :cond_5

    invoke-interface {v2}, LEl0;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v6

    invoke-virtual {p1, v4, v5, v6}, LEW0$h;->b(LEW0$i;Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V

    goto :goto_3

    :cond_4
    new-instance v4, LEW0$i;

    invoke-direct {v4, v3, v1}, LEW0$i;-><init>(LfM2;LIW0;)V

    :cond_5
    :goto_3
    iget-object v5, p0, LEW0$f;->d:LEW0;

    invoke-virtual {v5, v2, v3}, LEW0;->onClusterItemRendered(LEl0;LfM2;)V

    iget-object v2, p0, LEW0$f;->b:Ljava/util/Set;

    invoke-interface {v2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_6
    return-void

    :cond_7
    iget-object v0, p0, LEW0$f;->d:LEW0;

    invoke-static {v0}, LEW0;->d(LEW0;)Ljava/util/Map;

    move-result-object v0

    iget-object v2, p0, LEW0$f;->a:LDl0;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LfM2;

    if-nez v0, :cond_9

    new-instance v0, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    iget-object v2, p0, LEW0$f;->c:Lcom/google/android/gms/maps/model/LatLng;

    if-nez v2, :cond_8

    iget-object v2, p0, LEW0$f;->a:LDl0;

    invoke-interface {v2}, LDl0;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v2

    :cond_8
    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->u1(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    iget-object v2, p0, LEW0$f;->d:LEW0;

    iget-object v3, p0, LEW0$f;->a:LDl0;

    invoke-virtual {v2, v3, v0}, LEW0;->onBeforeClusterRendered(LDl0;Lcom/google/android/gms/maps/model/MarkerOptions;)V

    iget-object v2, p0, LEW0$f;->d:LEW0;

    invoke-static {v2}, LEW0;->c(LEW0;)LGl0;

    move-result-object v2

    invoke-virtual {v2}, LGl0;->l()LlM2$a;

    move-result-object v2

    invoke-virtual {v2, v0}, LlM2$a;->e(Lcom/google/android/gms/maps/model/MarkerOptions;)LfM2;

    move-result-object v0

    iget-object v2, p0, LEW0$f;->d:LEW0;

    invoke-static {v2}, LEW0;->k(LEW0;)Ljava/util/Map;

    move-result-object v2

    iget-object v3, p0, LEW0$f;->a:LDl0;

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, LEW0$f;->d:LEW0;

    invoke-static {v2}, LEW0;->d(LEW0;)Ljava/util/Map;

    move-result-object v2

    iget-object v3, p0, LEW0$f;->a:LDl0;

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LEW0$i;

    invoke-direct {v2, v0, v1}, LEW0$i;-><init>(LfM2;LIW0;)V

    iget-object v1, p0, LEW0$f;->c:Lcom/google/android/gms/maps/model/LatLng;

    if-eqz v1, :cond_a

    iget-object v3, p0, LEW0$f;->a:LDl0;

    invoke-interface {v3}, LDl0;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v3

    invoke-virtual {p1, v2, v1, v3}, LEW0$h;->b(LEW0$i;Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V

    goto :goto_4

    :cond_9
    new-instance v2, LEW0$i;

    invoke-direct {v2, v0, v1}, LEW0$i;-><init>(LfM2;LIW0;)V

    :cond_a
    :goto_4
    iget-object p1, p0, LEW0$f;->d:LEW0;

    iget-object v1, p0, LEW0$f;->a:LDl0;

    invoke-virtual {p1, v1, v0}, LEW0;->onClusterRendered(LDl0;LfM2;)V

    iget-object p1, p0, LEW0$f;->b:Ljava/util/Set;

    invoke-interface {p1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method
