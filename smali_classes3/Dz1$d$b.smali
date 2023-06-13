.class public final LDz1$d$b;
.super LDz1$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDz1$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000c\u0012\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u0011"
    }
    d2 = {
        "LDz1$d$b;",
        "LDz1$d;",
        "LDz1$b;",
        "footer",
        "",
        "v",
        "Lgc2;",
        "e",
        "Lgc2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "LZt4;",
        "faqClicksRelay",
        "termsClicksRelay",
        "<init>",
        "(Landroid/view/View;LZt4;LZt4;)V",
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
.field public final e:Lgc2;


# direct methods
.method public constructor <init>(Landroid/view/View;LZt4;LZt4;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "LZt4<",
            "Lkotlin/Unit;",
            ">;",
            "LZt4<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "faqClicksRelay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "termsClicksRelay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LDz1$d;-><init>(Landroid/view/View;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1}, Lgc2;->a(Landroid/view/View;)Lgc2;

    move-result-object p1

    const-string v0, "bind(view)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LDz1$d$b;->e:Lgc2;

    iget-object v0, p1, Lgc2;->b:Landroid/widget/TextView;

    new-instance v1, LEz1;

    invoke-direct {v1, p2}, LEz1;-><init>(LZt4;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p1, Lgc2;->c:Landroid/widget/TextView;

    new-instance p2, LFz1;

    invoke-direct {p2, p3}, LFz1;-><init>(LZt4;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static synthetic q(LZt4;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, LDz1$d$b;->t(LZt4;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic r(LZt4;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, LDz1$d$b;->u(LZt4;Landroid/view/View;)V

    return-void
.end method

.method public static final t(LZt4;Landroid/view/View;)V
    .locals 0

    const-string p1, "$faqClicksRelay"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, LZt4;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public static final u(LZt4;Landroid/view/View;)V
    .locals 0

    const-string p1, "$termsClicksRelay"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, LZt4;->accept(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final v(LDz1$b;)V
    .locals 6

    const-string v0, "footer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LDz1$d$b;->e:Lgc2;

    iget-object v0, v0, Lgc2;->b:Landroid/widget/TextView;

    const-string v1, "binding.faq"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LDz1$b;->b()Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v0, v1, v3, v4, v5}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, LDz1$d$b;->e:Lgc2;

    iget-object v0, v0, Lgc2;->c:Landroid/widget/TextView;

    const-string v1, "binding.terms"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LDz1$b;->c()Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    invoke-static {v0, v2, v3, v4, v5}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    return-void
.end method
