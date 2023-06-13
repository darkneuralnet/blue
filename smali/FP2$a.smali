.class public abstract LFP2$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LFP2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()LFP2;
.end method

.method public b(Lrz0;)LFP2$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrz0<",
            "Lwp6$a;",
            ">;)",
            "LFP2$a;"
        }
    .end annotation

    invoke-virtual {p0}, LFP2$a;->c()Lwp6;

    move-result-object v0

    invoke-virtual {v0}, Lwp6;->f()Lwp6$a;

    move-result-object v0

    invoke-interface {p1, v0}, Lrz0;->accept(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lwp6$a;->a()Lwp6;

    move-result-object p1

    invoke-virtual {p0, p1}, LFP2$a;->f(Lwp6;)LFP2$a;

    return-object p0
.end method

.method public abstract c()Lwp6;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "KotlinPropertyAccess"
        }
    .end annotation
.end method

.method public abstract d(LFp;)LFP2$a;
.end method

.method public abstract e(I)LFP2$a;
.end method

.method public abstract f(Lwp6;)LFP2$a;
.end method
