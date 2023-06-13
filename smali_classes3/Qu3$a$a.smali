.class public final LQu3$a$a;
.super Ld36;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQu3$a;-><init>(LQu3;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016\u00a8\u0006\n"
    }
    d2 = {
        "Qu3$a$a",
        "Ld36;",
        "",
        "s",
        "",
        "start",
        "before",
        "count",
        "",
        "onTextChanged",
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
.field public final synthetic b:LQu3$a;

.field public final synthetic c:LQu3;


# direct methods
.method public constructor <init>(LQu3$a;LQu3;)V
    .locals 0

    iput-object p1, p0, LQu3$a$a;->b:LQu3$a;

    iput-object p2, p0, LQu3$a$a;->c:LQu3;

    invoke-direct {p0}, Ld36;-><init>()V

    return-void
.end method


# virtual methods
.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    const-string v0, "s"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3, p4}, Ld36;->onTextChanged(Ljava/lang/CharSequence;III)V

    iget-object p2, p0, LQu3$a$a;->b:LQu3$a;

    invoke-static {p2}, LQu3$a;->a(LQu3$a;)Lde2;

    move-result-object p2

    iget-object p2, p2, Lde2;->c:Landroid/widget/TextView;

    const-string p3, "binding.hint"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p3

    const/4 p4, 0x0

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p2, p3, p4, v0, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object p2, p0, LQu3$a$a;->b:LQu3$a;

    invoke-static {p2}, LQu3$a;->a(LQu3$a;)Lde2;

    move-result-object p2

    iget-object p2, p2, Lde2;->b:Landroid/widget/ImageView;

    const-string p3, "binding.clear"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p3

    xor-int/lit8 p3, p3, 0x1

    invoke-static {p2, p3, p4, v0, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object p2, p0, LQu3$a$a;->c:LQu3;

    invoke-static {p2}, LQu3;->access$getSearchPublisher$p(LQu3;)Lio/reactivex/subjects/d;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    return-void
.end method
