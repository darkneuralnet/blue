.class public final LJN4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LIN4;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/widget/RetakeablePhotoView;",
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
            "Lco/bird/android/widget/RetakeablePhotoView;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJN4;->a:LY94;

    return-void
.end method

.method public static a(LY94;)LJN4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lco/bird/android/widget/RetakeablePhotoView;",
            ">;)",
            "LJN4;"
        }
    .end annotation

    new-instance v0, LJN4;

    invoke-direct {v0, p0}, LJN4;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(Lco/bird/android/widget/RetakeablePhotoView;)LIN4;
    .locals 1

    new-instance v0, LIN4;

    invoke-direct {v0, p0}, LIN4;-><init>(Lco/bird/android/widget/RetakeablePhotoView;)V

    return-object v0
.end method


# virtual methods
.method public b()LIN4;
    .locals 1

    iget-object v0, p0, LJN4;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/widget/RetakeablePhotoView;

    invoke-static {v0}, LJN4;->c(Lco/bird/android/widget/RetakeablePhotoView;)LIN4;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LJN4;->b()LIN4;

    move-result-object v0

    return-object v0
.end method
