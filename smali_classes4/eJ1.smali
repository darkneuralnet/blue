.class public final synthetic LeJ1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field public final synthetic a:Lio/reactivex/H;


# direct methods
.method public synthetic constructor <init>(Lio/reactivex/H;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LeJ1;->a:Lio/reactivex/H;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, LeJ1;->a:Lio/reactivex/H;

    invoke-static {v0, p1}, LcJ1$h;->b(Lio/reactivex/H;Ljava/lang/Exception;)V

    return-void
.end method
