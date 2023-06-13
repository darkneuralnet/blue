.class public final synthetic Lbq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field public final synthetic a:Lio/reactivex/e;


# direct methods
.method public synthetic constructor <init>(Lio/reactivex/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbq;->a:Lio/reactivex/e;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lbq;->a:Lio/reactivex/e;

    invoke-static {v0, p1}, LZp$f;->b(Lio/reactivex/e;Ljava/lang/Exception;)V

    return-void
.end method
