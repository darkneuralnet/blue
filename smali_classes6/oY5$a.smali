.class public final LoY5$a;
.super Lio/reactivex/android/a;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/material/tabs/TabLayout$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LoY5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/reactivex/android/a;",
        "Lcom/google/android/material/tabs/TabLayout$c<",
        "Lcom/google/android/material/tabs/TabLayout$g;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00030\u0002B\u001f\u0012\u0006\u0010\u000c\u001a\u00020\n\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0008\u0000\u0012\u00020\u00030\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0008\u0010\u0005\u001a\u00020\u0004H\u0014J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0016R\u0014\u0010\u000c\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000bR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0008\u0000\u0012\u00020\u00030\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u000e\u00a8\u0006\u0012"
    }
    d2 = {
        "LoY5$a;",
        "Lio/reactivex/android/a;",
        "Lcom/google/android/material/tabs/TabLayout$c;",
        "Lcom/google/android/material/tabs/TabLayout$g;",
        "",
        "d",
        "tab",
        "a",
        "b",
        "c",
        "Lcom/google/android/material/tabs/TabLayout;",
        "Lcom/google/android/material/tabs/TabLayout;",
        "tabLayout",
        "Lio/reactivex/D;",
        "Lio/reactivex/D;",
        "observer",
        "<init>",
        "(Lcom/google/android/material/tabs/TabLayout;Lio/reactivex/D;)V",
        "rxbinding-material_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field public final c:Lcom/google/android/material/tabs/TabLayout;

.field public final d:Lio/reactivex/D;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/D<",
            "-",
            "Lcom/google/android/material/tabs/TabLayout$g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/material/tabs/TabLayout;Lio/reactivex/D;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/material/tabs/TabLayout;",
            "Lio/reactivex/D<",
            "-",
            "Lcom/google/android/material/tabs/TabLayout$g;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/android/a;-><init>()V

    iput-object p1, p0, LoY5$a;->c:Lcom/google/android/material/tabs/TabLayout;

    iput-object p2, p0, LoY5$a;->d:Lio/reactivex/D;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/material/tabs/TabLayout$g;)V
    .locals 1

    invoke-virtual {p0}, Lio/reactivex/android/a;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LoY5$a;->d:Lio/reactivex/D;

    invoke-interface {v0, p1}, Lio/reactivex/D;->onNext(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public b(Lcom/google/android/material/tabs/TabLayout$g;)V
    .locals 0

    return-void
.end method

.method public c(Lcom/google/android/material/tabs/TabLayout$g;)V
    .locals 0

    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, LoY5$a;->c:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v0, p0}, Lcom/google/android/material/tabs/TabLayout;->P(Lcom/google/android/material/tabs/TabLayout$c;)V

    return-void
.end method
