.class public Lcom/google/android/gms/internal/places/c$a;
.super Lg99;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/places/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/android/gms/internal/places/c<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lcom/google/android/gms/internal/places/c$a<",
        "TMessageType;TBuilderType;>;>",
        "Lg99<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# instance fields
.field public final b:Lcom/google/android/gms/internal/places/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TMessageType;"
        }
    .end annotation
.end field

.field public c:Lcom/google/android/gms/internal/places/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TMessageType;"
        }
    .end annotation
.end field

.field public d:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/places/c;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)V"
        }
    .end annotation

    invoke-direct {p0}, Lg99;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/places/c$a;->b:Lcom/google/android/gms/internal/places/c;

    sget v0, Lcom/google/android/gms/internal/places/c$d;->d:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, v1}, Lcom/google/android/gms/internal/places/c;->k(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/places/c;

    iput-object p1, p0, Lcom/google/android/gms/internal/places/c$a;->c:Lcom/google/android/gms/internal/places/c;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/places/c$a;->d:Z

    return-void
.end method

.method public static m(Lcom/google/android/gms/internal/places/c;Lcom/google/android/gms/internal/places/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;TMessageType;)V"
        }
    .end annotation

    invoke-static {}, LsW7;->a()LsW7;

    move-result-object v0

    invoke-virtual {v0, p0}, LsW7;->c(Ljava/lang/Object;)LLY7;

    move-result-object v0

    invoke-interface {v0, p0, p1}, LLY7;->zzd(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public synthetic clone()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/places/c$a;->b:Lcom/google/android/gms/internal/places/c;

    sget v1, Lcom/google/android/gms/internal/places/c$d;->e:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/places/c;->k(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/places/c$a;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/places/c$a;->v()LzT7;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/places/c;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/places/c$a;->l(Lcom/google/android/gms/internal/places/c;)Lcom/google/android/gms/internal/places/c$a;

    return-object v0
.end method

.method public final synthetic d()LzT7;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/places/c$a;->b:Lcom/google/android/gms/internal/places/c;

    return-object v0
.end method

.method public final synthetic j(Lcom/google/android/gms/internal/places/k;)Lg99;
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/places/c;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/places/c$a;->l(Lcom/google/android/gms/internal/places/c;)Lcom/google/android/gms/internal/places/c$a;

    move-result-object p1

    return-object p1
.end method

.method public synthetic j1()LzT7;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/places/c$a;->o()Lcom/google/android/gms/internal/places/c;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic k()Lg99;
    .locals 1

    invoke-virtual {p0}, Lg99;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/places/c$a;

    return-object v0
.end method

.method public final l(Lcom/google/android/gms/internal/places/c;)Lcom/google/android/gms/internal/places/c$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)TBuilderType;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/android/gms/internal/places/c$a;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/places/c$a;->c:Lcom/google/android/gms/internal/places/c;

    sget v1, Lcom/google/android/gms/internal/places/c$d;->d:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/places/c;->k(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/places/c;

    iget-object v1, p0, Lcom/google/android/gms/internal/places/c$a;->c:Lcom/google/android/gms/internal/places/c;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/places/c$a;->m(Lcom/google/android/gms/internal/places/c;Lcom/google/android/gms/internal/places/c;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/places/c$a;->c:Lcom/google/android/gms/internal/places/c;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/places/c$a;->d:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/places/c$a;->c:Lcom/google/android/gms/internal/places/c;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/places/c$a;->m(Lcom/google/android/gms/internal/places/c;Lcom/google/android/gms/internal/places/c;)V

    return-object p0
.end method

.method public n()Lcom/google/android/gms/internal/places/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/android/gms/internal/places/c$a;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/places/c$a;->c:Lcom/google/android/gms/internal/places/c;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/places/c$a;->c:Lcom/google/android/gms/internal/places/c;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/places/c;->c()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/places/c$a;->d:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/places/c$a;->c:Lcom/google/android/gms/internal/places/c;

    return-object v0
.end method

.method public final o()Lcom/google/android/gms/internal/places/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/places/c$a;->v()LzT7;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/places/c;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/places/c;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/places/zzdp;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/places/zzdp;-><init>(LzT7;)V

    throw v1
.end method

.method public synthetic v()LzT7;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/places/c$a;->n()Lcom/google/android/gms/internal/places/c;

    move-result-object v0

    return-object v0
.end method
