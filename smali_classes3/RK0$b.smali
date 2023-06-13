.class public final LRK0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LgU1$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LRK0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:LRK0$b;


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroid/content/DialogInterface;Lio/reactivex/Observable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlG2;",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "Landroid/content/DialogInterface;",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/identification/IdentificationManualEntryFormData;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LRK0$b;->b:LRK0$b;

    iput-object p1, p0, LRK0$b;->a:LlG2;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroid/content/DialogInterface;Lio/reactivex/Observable;LSK0;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, LRK0$b;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroid/content/DialogInterface;Lio/reactivex/Observable;)V

    return-void
.end method


# virtual methods
.method public a(LgU1;)V
    .locals 0

    invoke-virtual {p0, p1}, LRK0$b;->b(LgU1;)LgU1;

    return-void
.end method

.method public final b(LgU1;)LgU1;
    .locals 1

    iget-object v0, p0, LRK0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LlU1;->b(LgU1;Le13;)V

    return-object p1
.end method
