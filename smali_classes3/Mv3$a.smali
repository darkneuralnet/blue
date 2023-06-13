.class public final LMv3$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LMv3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0004\u001a\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\n\u00a8\u0006\u000e"
    }
    d2 = {
        "LMv3$a;",
        "Lw1;",
        "",
        "onAttachedToWindow",
        "b",
        "Landroid/view/View;",
        "Landroid/view/View;",
        "view",
        "Lee2;",
        "c",
        "Lee2;",
        "binding",
        "<init>",
        "(LMv3;Landroid/view/View;)V",
        "task-list-v2_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:Landroid/view/View;

.field public final c:Lee2;

.field public final synthetic d:LMv3;


# direct methods
.method public constructor <init>(LMv3;Landroid/view/View;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LMv3$a;->d:LMv3;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    iput-object p2, p0, LMv3$a;->b:Landroid/view/View;

    invoke-static {p2}, Lee2;->a(Landroid/view/View;)Lee2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LMv3$a;->c:Lee2;

    return-void
.end method

.method public static final synthetic a(LMv3$a;)Lee2;
    .locals 0

    iget-object p0, p0, LMv3$a;->c:Lee2;

    return-object p0
.end method


# virtual methods
.method public final b()V
    .locals 3

    iget-object v0, p0, LMv3$a;->c:Lee2;

    iget-object v0, v0, Lee2;->d:Landroid/widget/EditText;

    const-string v1, "binding.search"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LMv3$a$a;

    iget-object v2, p0, LMv3$a;->d:LMv3;

    invoke-direct {v1, v2, p0}, LMv3$a$a;-><init>(LMv3;LMv3$a;)V

    invoke-static {v0, v1}, LMs2;->x(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;)V

    iget-object v0, p0, LMv3$a;->c:Lee2;

    iget-object v0, v0, Lee2;->b:Landroid/widget/ImageView;

    const-string v1, "binding.clear"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LMv3$a$b;

    invoke-direct {v1, p0}, LMv3$a$b;-><init>(LMv3$a;)V

    invoke-static {v0, v1}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public onAttachedToWindow()V
    .locals 0

    invoke-super {p0}, Lw1;->onAttachedToWindow()V

    invoke-virtual {p0}, LMv3$a;->b()V

    return-void
.end method
