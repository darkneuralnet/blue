.class public LnM2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lcom/google/android/gms/maps/model/LatLng;

.field public b:F

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:LPT;

.field public f:F

.field public g:F

.field public h:F

.field public i:F

.field public j:Z

.field public k:Z

.field public l:Z

.field public m:F

.field public n:F

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:Z

.field public w:Z

.field public x:Z

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(FF)LnM2;
    .locals 0

    iput p1, p0, LnM2;->f:F

    iput p2, p0, LnM2;->g:F

    const/4 p1, 0x1

    iput-boolean p1, p0, LnM2;->t:Z

    return-object p0
.end method

.method public b(LfM2;)V
    .locals 2

    iget-boolean v0, p0, LnM2;->o:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LnM2;->a:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1, v0}, LfM2;->m(Lcom/google/android/gms/maps/model/LatLng;)V

    :cond_0
    iget-boolean v0, p0, LnM2;->p:Z

    if-eqz v0, :cond_1

    iget v0, p0, LnM2;->b:F

    invoke-virtual {p1, v0}, LfM2;->s(F)V

    :cond_1
    iget-boolean v0, p0, LnM2;->q:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, LnM2;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, LfM2;->q(Ljava/lang/String;)V

    :cond_2
    iget-boolean v0, p0, LnM2;->r:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, LnM2;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, LfM2;->o(Ljava/lang/String;)V

    :cond_3
    iget-boolean v0, p0, LnM2;->s:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, LnM2;->e:LPT;

    invoke-virtual {p1, v0}, LfM2;->k(LPT;)V

    :cond_4
    iget-boolean v0, p0, LnM2;->t:Z

    if-eqz v0, :cond_5

    iget v0, p0, LnM2;->f:F

    iget v1, p0, LnM2;->g:F

    invoke-virtual {p1, v0, v1}, LfM2;->h(FF)V

    :cond_5
    iget-boolean v0, p0, LnM2;->u:Z

    if-eqz v0, :cond_6

    iget v0, p0, LnM2;->h:F

    iget v1, p0, LnM2;->i:F

    invoke-virtual {p1, v0, v1}, LfM2;->l(FF)V

    :cond_6
    iget-boolean v0, p0, LnM2;->v:Z

    if-eqz v0, :cond_7

    iget-boolean v0, p0, LnM2;->j:Z

    invoke-virtual {p1, v0}, LfM2;->i(Z)V

    :cond_7
    iget-boolean v0, p0, LnM2;->w:Z

    if-eqz v0, :cond_8

    iget-boolean v0, p0, LnM2;->k:Z

    invoke-virtual {p1, v0}, LfM2;->r(Z)V

    :cond_8
    iget-boolean v0, p0, LnM2;->x:Z

    if-eqz v0, :cond_9

    iget-boolean v0, p0, LnM2;->l:Z

    invoke-virtual {p1, v0}, LfM2;->j(Z)V

    :cond_9
    iget-boolean v0, p0, LnM2;->y:Z

    if-eqz v0, :cond_a

    iget v0, p0, LnM2;->m:F

    invoke-virtual {p1, v0}, LfM2;->n(F)V

    :cond_a
    iget-boolean v0, p0, LnM2;->z:Z

    if-eqz v0, :cond_b

    iget v0, p0, LnM2;->n:F

    invoke-virtual {p1, v0}, LfM2;->g(F)V

    :cond_b
    return-void
.end method

.method public c(Lcom/google/android/gms/maps/model/MarkerOptions;)V
    .locals 2

    iget-boolean v0, p0, LnM2;->o:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LnM2;->a:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->u1(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    :cond_0
    iget-boolean v0, p0, LnM2;->p:Z

    if-eqz v0, :cond_1

    iget v0, p0, LnM2;->b:F

    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->Y1(F)Lcom/google/android/gms/maps/model/MarkerOptions;

    :cond_1
    iget-boolean v0, p0, LnM2;->q:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, LnM2;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->L1(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    :cond_2
    iget-boolean v0, p0, LnM2;->r:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, LnM2;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->J1(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    :cond_3
    iget-boolean v0, p0, LnM2;->s:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, LnM2;->e:LPT;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->N0(LPT;)Lcom/google/android/gms/maps/model/MarkerOptions;

    :cond_4
    iget-boolean v0, p0, LnM2;->t:Z

    if-eqz v0, :cond_5

    iget v0, p0, LnM2;->f:F

    iget v1, p0, LnM2;->g:F

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->u(FF)Lcom/google/android/gms/maps/model/MarkerOptions;

    :cond_5
    iget-boolean v0, p0, LnM2;->u:Z

    if-eqz v0, :cond_6

    iget v0, p0, LnM2;->h:F

    iget v1, p0, LnM2;->i:F

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->W0(FF)Lcom/google/android/gms/maps/model/MarkerOptions;

    :cond_6
    iget-boolean v0, p0, LnM2;->v:Z

    if-eqz v0, :cond_7

    iget-boolean v0, p0, LnM2;->j:Z

    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->v(Z)Lcom/google/android/gms/maps/model/MarkerOptions;

    :cond_7
    iget-boolean v0, p0, LnM2;->w:Z

    if-eqz v0, :cond_8

    iget-boolean v0, p0, LnM2;->k:Z

    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->R1(Z)Lcom/google/android/gms/maps/model/MarkerOptions;

    :cond_8
    iget-boolean v0, p0, LnM2;->x:Z

    if-eqz v0, :cond_9

    iget-boolean v0, p0, LnM2;->l:Z

    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->E(Z)Lcom/google/android/gms/maps/model/MarkerOptions;

    :cond_9
    iget-boolean v0, p0, LnM2;->y:Z

    if-eqz v0, :cond_a

    iget v0, p0, LnM2;->m:F

    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->y1(F)Lcom/google/android/gms/maps/model/MarkerOptions;

    :cond_a
    iget-boolean v0, p0, LnM2;->z:Z

    if-eqz v0, :cond_b

    iget v0, p0, LnM2;->n:F

    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->s(F)Lcom/google/android/gms/maps/model/MarkerOptions;

    :cond_b
    return-void
.end method

.method public d(LPT;)LnM2;
    .locals 0

    iput-object p1, p0, LnM2;->e:LPT;

    const/4 p1, 0x1

    iput-boolean p1, p0, LnM2;->s:Z

    return-object p0
.end method

.method public e(Ljava/lang/String;)LnM2;
    .locals 0

    iput-object p1, p0, LnM2;->c:Ljava/lang/String;

    const/4 p1, 0x1

    iput-boolean p1, p0, LnM2;->q:Z

    return-object p0
.end method

.method public f(F)LnM2;
    .locals 0

    iput p1, p0, LnM2;->b:F

    const/4 p1, 0x1

    iput-boolean p1, p0, LnM2;->p:Z

    return-object p0
.end method
