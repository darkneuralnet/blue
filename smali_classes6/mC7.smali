.class public final LmC7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LhY7;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LhY7;

    invoke-direct {v0, p1}, LhY7;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, LmC7;->a:LhY7;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmd;Ljava/util/List;J)V
    .locals 0

    iget-object p2, p0, LmC7;->a:LhY7;

    sget-object p3, LIH8;->l2:LIH8;

    sget-object p4, LxH8;->c:LxH8;

    invoke-virtual {p2, p1, p3, p4}, LhY7;->a(Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;LIH8;LxH8;)V

    return-void
.end method

.method public final b(Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;Ljava/lang/String;J)V
    .locals 0

    iget-object p3, p0, LmC7;->a:LhY7;

    sget-object p4, LIH8;->j2:LIH8;

    if-eqz p2, :cond_0

    sget-object p2, LxH8;->J:LxH8;

    goto :goto_0

    :cond_0
    sget-object p2, LxH8;->c:LxH8;

    :goto_0
    invoke-virtual {p3, p1, p4, p2}, LhY7;->a(Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;LIH8;LxH8;)V

    return-void
.end method

.method public final c(Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;)V
    .locals 3

    iget-object v0, p0, LmC7;->a:LhY7;

    sget-object v1, LIH8;->k2:LIH8;

    sget-object v2, LxH8;->c:LxH8;

    invoke-virtual {v0, p1, v1, v2}, LhY7;->a(Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;LIH8;LxH8;)V

    return-void
.end method
