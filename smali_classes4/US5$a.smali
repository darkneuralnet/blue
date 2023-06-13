.class public final LUS5$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUS5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static a(LUS5;Ljava/lang/String;)V
    .locals 1

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LUS5;->b()LVS5;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, LUS5;->c()Landroid/widget/LinearLayout;

    move-result-object p0

    invoke-virtual {v0, p0, p1}, LVS5;->a(Landroid/widget/LinearLayout;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static b(LUS5;)V
    .locals 1

    invoke-interface {p0}, LUS5;->b()LVS5;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, LUS5;->c()Landroid/widget/LinearLayout;

    move-result-object p0

    invoke-virtual {v0, p0}, LVS5;->b(Landroid/widget/LinearLayout;)V

    :cond_0
    return-void
.end method
