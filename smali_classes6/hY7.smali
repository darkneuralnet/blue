.class public final LhY7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LGX8;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "optional-module-face"

    invoke-static {v0}, LwW8;->d(Ljava/lang/String;)LkW8;

    move-result-object v0

    invoke-virtual {v0}, LkW8;->c()LwW8;

    move-result-object v0

    new-instance v1, LGX8;

    new-instance v2, LZy5;

    invoke-direct {v2, p1}, LZy5;-><init>(Landroid/content/Context;)V

    new-instance v3, LHW8;

    invoke-direct {v3, p1, v0}, LHW8;-><init>(Landroid/content/Context;LwW8;)V

    invoke-virtual {v0}, LwW8;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, p1, v2, v3, v0}, LGX8;-><init>(Landroid/content/Context;LZy5;LwX8;Ljava/lang/String;)V

    iput-object v1, p0, LhY7;->a:LGX8;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;LIH8;LxH8;)V
    .locals 2

    sget-object v0, LIH8;->j2:LIH8;

    if-ne p2, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v1, LaQ7;

    invoke-direct {v1, p1, p3, v0}, LaQ7;-><init>(Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;LxH8;I)V

    iget-object p1, p0, LhY7;->a:LGX8;

    invoke-virtual {p1, v1, p2}, LGX8;->c(LaQ7;LIH8;)V

    return-void
.end method
