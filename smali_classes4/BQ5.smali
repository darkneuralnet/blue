.class public final LBQ5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LAQ5;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/widget/adapter/ViewHolderSupplier<",
            "LeT0;",
            ">;>;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LG31;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/DialogInterface;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;",
            "LY94<",
            "Lco/bird/android/widget/adapter/ViewHolderSupplier<",
            "LeT0;",
            ">;>;",
            "LY94<",
            "LG31;",
            ">;",
            "LY94<",
            "Landroid/content/DialogInterface;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBQ5;->a:LY94;

    iput-object p2, p0, LBQ5;->b:LY94;

    iput-object p3, p0, LBQ5;->c:LY94;

    iput-object p4, p0, LBQ5;->d:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;)LBQ5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;",
            "LY94<",
            "Lco/bird/android/widget/adapter/ViewHolderSupplier<",
            "LeT0;",
            ">;>;",
            "LY94<",
            "LG31;",
            ">;",
            "LY94<",
            "Landroid/content/DialogInterface;",
            ">;)",
            "LBQ5;"
        }
    .end annotation

    new-instance v0, LBQ5;

    invoke-direct {v0, p0, p1, p2, p3}, LBQ5;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lco/bird/android/core/mvp/BaseActivity;Lco/bird/android/widget/adapter/ViewHolderSupplier;LG31;Landroid/content/DialogInterface;)LAQ5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Lco/bird/android/widget/adapter/ViewHolderSupplier<",
            "LeT0;",
            ">;",
            "LG31;",
            "Landroid/content/DialogInterface;",
            ")",
            "LAQ5;"
        }
    .end annotation

    new-instance v0, LAQ5;

    invoke-direct {v0, p0, p1, p2, p3}, LAQ5;-><init>(Lco/bird/android/core/mvp/BaseActivity;Lco/bird/android/widget/adapter/ViewHolderSupplier;LG31;Landroid/content/DialogInterface;)V

    return-object v0
.end method


# virtual methods
.method public b()LAQ5;
    .locals 4

    iget-object v0, p0, LBQ5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/core/mvp/BaseActivity;

    iget-object v1, p0, LBQ5;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/widget/adapter/ViewHolderSupplier;

    iget-object v2, p0, LBQ5;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LG31;

    iget-object v3, p0, LBQ5;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/DialogInterface;

    invoke-static {v0, v1, v2, v3}, LBQ5;->c(Lco/bird/android/core/mvp/BaseActivity;Lco/bird/android/widget/adapter/ViewHolderSupplier;LG31;Landroid/content/DialogInterface;)LAQ5;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LBQ5;->b()LAQ5;

    move-result-object v0

    return-object v0
.end method
