.class public final LDz1$d$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/material/tabs/TabLayout$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDz1$d$c;-><init>(Landroid/view/View;LAG;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Dz1$d$c$a",
        "Lcom/google/android/material/tabs/TabLayout$d;",
        "Lcom/google/android/material/tabs/TabLayout$g;",
        "tab",
        "",
        "a",
        "b",
        "c",
        "frequent-flyer_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic b:LDz1$d$c;


# direct methods
.method public constructor <init>(LDz1$d$c;)V
    .locals 0

    iput-object p1, p0, LDz1$d$c$a;->b:LDz1$d$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/material/tabs/TabLayout$g;)V
    .locals 2

    const-string v0, "tab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LDz1$d$c$a;->b:LDz1$d$c;

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, LDz1$d$c;->access$setTabColorSelected(LDz1$d$c;Lcom/google/android/material/tabs/TabLayout$g;Z)V

    iget-object v0, p0, LDz1$d$c$a;->b:LDz1$d$c;

    invoke-static {v0}, LDz1$d$c;->access$getShouldUpdateSelectedTabRelay$p(LDz1$d$c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LDz1$d$c$a;->b:LDz1$d$c;

    invoke-static {v0}, LDz1$d$c;->access$getSelectedTabRelay$p(LDz1$d$c;)LAG;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$g;->g()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, LAG;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public b(Lcom/google/android/material/tabs/TabLayout$g;)V
    .locals 2

    const-string v0, "tab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LDz1$d$c$a;->b:LDz1$d$c;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, LDz1$d$c;->access$setTabColorSelected(LDz1$d$c;Lcom/google/android/material/tabs/TabLayout$g;Z)V

    return-void
.end method

.method public c(Lcom/google/android/material/tabs/TabLayout$g;)V
    .locals 1

    const-string v0, "tab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
