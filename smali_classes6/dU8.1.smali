.class public final LdU8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Landroid/os/Bundle;

.field public final synthetic e:LfU8;


# direct methods
.method public constructor <init>(LfU8;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, LdU8;->e:LfU8;

    iput-object p2, p0, LdU8;->b:Ljava/lang/String;

    const-string p1, "_err"

    iput-object p1, p0, LdU8;->c:Ljava/lang/String;

    iput-object p4, p0, LdU8;->d:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    iget-object v0, p0, LdU8;->e:LfU8;

    iget-object v0, v0, LfU8;->a:LhV8;

    invoke-virtual {v0}, LhV8;->h0()LOW8;

    move-result-object v1

    iget-object v2, p0, LdU8;->b:Ljava/lang/String;

    iget-object v3, p0, LdU8;->c:Ljava/lang/String;

    iget-object v4, p0, LdU8;->d:Landroid/os/Bundle;

    iget-object v0, p0, LdU8;->e:LfU8;

    iget-object v0, v0, LfU8;->a:LhV8;

    invoke-virtual {v0}, LhV8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v6

    const-string v5, "auto"

    const/4 v8, 0x0

    const/4 v9, 0x1

    invoke-virtual/range {v1 .. v9}, LOW8;->y0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZZ)Lcom/google/android/gms/measurement/internal/zzaw;

    move-result-object v0

    iget-object v1, p0, LdU8;->e:LfU8;

    iget-object v1, v1, LfU8;->a:LhV8;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/measurement/internal/zzaw;

    iget-object v2, p0, LdU8;->b:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, LhV8;->h(Lcom/google/android/gms/measurement/internal/zzaw;Ljava/lang/String;)V

    return-void
.end method
