.class public final Lcom/google/android/gms/internal/clearcut/n$b$a;
.super Lcom/google/android/gms/internal/clearcut/c$a;
.source "SourceFile"

# interfaces
.implements Lk38;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/clearcut/n$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/clearcut/c$a<",
        "Lcom/google/android/gms/internal/clearcut/n$b;",
        "Lcom/google/android/gms/internal/clearcut/n$b$a;",
        ">;",
        "Lk38;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/clearcut/n$b;->z()Lcom/google/android/gms/internal/clearcut/n$b;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/clearcut/c$a;-><init>(Lcom/google/android/gms/internal/clearcut/c;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/clearcut/o;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/clearcut/n$b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/String;)Lcom/google/android/gms/internal/clearcut/n$b$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/clearcut/c$a;->h()V

    iget-object v0, p0, Lcom/google/android/gms/internal/clearcut/c$a;->c:Lcom/google/android/gms/internal/clearcut/c;

    check-cast v0, Lcom/google/android/gms/internal/clearcut/n$b;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/clearcut/n$b;->r(Lcom/google/android/gms/internal/clearcut/n$b;Ljava/lang/String;)V

    return-object p0
.end method

.method public final r(J)Lcom/google/android/gms/internal/clearcut/n$b$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/clearcut/c$a;->h()V

    iget-object v0, p0, Lcom/google/android/gms/internal/clearcut/c$a;->c:Lcom/google/android/gms/internal/clearcut/c;

    check-cast v0, Lcom/google/android/gms/internal/clearcut/n$b;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/clearcut/n$b;->q(Lcom/google/android/gms/internal/clearcut/n$b;J)V

    return-object p0
.end method

.method public final t(J)Lcom/google/android/gms/internal/clearcut/n$b$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/clearcut/c$a;->h()V

    iget-object v0, p0, Lcom/google/android/gms/internal/clearcut/c$a;->c:Lcom/google/android/gms/internal/clearcut/c;

    check-cast v0, Lcom/google/android/gms/internal/clearcut/n$b;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/clearcut/n$b;->s(Lcom/google/android/gms/internal/clearcut/n$b;J)V

    return-object p0
.end method
