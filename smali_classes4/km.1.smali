.class public final Lkm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lco/bird/android/runtime/logging/ApplicationVisibilityTracker;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lgl;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkm;->a:LY94;

    return-void
.end method

.method public static a(LY94;)Lkm;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lgl;",
            ">;)",
            "Lkm;"
        }
    .end annotation

    new-instance v0, Lkm;

    invoke-direct {v0, p0}, Lkm;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(Lgl;)Lco/bird/android/runtime/logging/ApplicationVisibilityTracker;
    .locals 1

    new-instance v0, Lco/bird/android/runtime/logging/ApplicationVisibilityTracker;

    invoke-direct {v0, p0}, Lco/bird/android/runtime/logging/ApplicationVisibilityTracker;-><init>(Lgl;)V

    return-object v0
.end method


# virtual methods
.method public b()Lco/bird/android/runtime/logging/ApplicationVisibilityTracker;
    .locals 1

    iget-object v0, p0, Lkm;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {v0}, Lkm;->c(Lgl;)Lco/bird/android/runtime/logging/ApplicationVisibilityTracker;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lkm;->b()Lco/bird/android/runtime/logging/ApplicationVisibilityTracker;

    move-result-object v0

    return-object v0
.end method
