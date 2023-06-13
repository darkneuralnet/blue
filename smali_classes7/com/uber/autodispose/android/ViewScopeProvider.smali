.class public final Lcom/uber/autodispose/android/ViewScopeProvider;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/uber/autodispose/ScopeProvider;


# instance fields
.field public final b:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/uber/autodispose/android/ViewScopeProvider;->b:Landroid/view/View;

    return-void
.end method

.method public static a(Landroid/view/View;)Lcom/uber/autodispose/ScopeProvider;
    .locals 1

    if-eqz p0, :cond_0

    new-instance v0, Lcom/uber/autodispose/android/ViewScopeProvider;

    invoke-direct {v0, p0}, Lcom/uber/autodispose/android/ViewScopeProvider;-><init>(Landroid/view/View;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "view == null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public T0()Lio/reactivex/h;
    .locals 2

    new-instance v0, Lcom/uber/autodispose/android/DetachEventCompletable;

    iget-object v1, p0, Lcom/uber/autodispose/android/ViewScopeProvider;->b:Landroid/view/View;

    invoke-direct {v0, v1}, Lcom/uber/autodispose/android/DetachEventCompletable;-><init>(Landroid/view/View;)V

    return-object v0
.end method
