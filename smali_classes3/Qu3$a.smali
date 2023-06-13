.class public final LQu3$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQu3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\n"
    }
    d2 = {
        "LQu3$a;",
        "Lw1;",
        "Lde2;",
        "b",
        "Lde2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LQu3;Landroid/view/View;)V",
        "task-list_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:Lde2;

.field public final synthetic c:LQu3;


# direct methods
.method public constructor <init>(LQu3;Landroid/view/View;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LQu3$a;->c:LQu3;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lde2;->a(Landroid/view/View;)Lde2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LQu3$a;->b:Lde2;

    iget-object v0, p2, Lde2;->d:Landroid/widget/EditText;

    new-instance v1, LQu3$a$a;

    invoke-direct {v1, p0, p1}, LQu3$a$a;-><init>(LQu3$a;LQu3;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object p1, p2, Lde2;->b:Landroid/widget/ImageView;

    const-string p2, "binding.clear"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, LQu3$a$b;

    invoke-direct {p2, p0}, LQu3$a$b;-><init>(LQu3$a;)V

    invoke-static {p1, p2}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic a(LQu3$a;)Lde2;
    .locals 0

    iget-object p0, p0, LQu3$a;->b:Lde2;

    return-object p0
.end method
