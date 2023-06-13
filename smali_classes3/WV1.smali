.class public final synthetic LWV1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCanceledListener;


# instance fields
.field public final synthetic a:Lio/reactivex/H;


# direct methods
.method public synthetic constructor <init>(Lio/reactivex/H;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LWV1;->a:Lio/reactivex/H;

    return-void
.end method


# virtual methods
.method public final onCanceled()V
    .locals 1

    iget-object v0, p0, LWV1;->a:Lio/reactivex/H;

    invoke-static {v0}, LTV1$d;->b(Lio/reactivex/H;)V

    return-void
.end method
