.class public Ls91;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrz0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lrz0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public a:Lrz0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lrz0<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lrz0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrz0<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Ls91;->a:Lrz0;

    return-void
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Ls91;->a:Lrz0;

    const-string v1, "Listener is not set."

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ls91;->a:Lrz0;

    invoke-interface {v0, p1}, Lrz0;->accept(Ljava/lang/Object;)V

    return-void
.end method
