.class public final Lu84;
.super Lv0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00028\u0014X\u0094\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0014X\u0094\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0004\u001a\u0004\u0008\t\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u000b8\u0014X\u0094\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0014X\u0094\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u001d"
    }
    d2 = {
        "Lu84;",
        "Lv0;",
        "Landroid/widget/Button;",
        "b",
        "Landroid/widget/Button;",
        "Sl",
        "()Landroid/widget/Button;",
        "sendButton",
        "c",
        "Pl",
        "copyButton",
        "Landroid/widget/TextView;",
        "d",
        "Landroid/widget/TextView;",
        "Ql",
        "()Landroid/widget/TextView;",
        "pricingMessage",
        "",
        "e",
        "I",
        "Rl",
        "()I",
        "pricingStringRes",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "LMe2;",
        "binding",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;LMe2;)V",
        "promotions_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:Landroid/widget/Button;

.field public final c:Landroid/widget/Button;

.field public final d:Landroid/widget/TextView;

.field public final e:I


# direct methods
.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;LMe2;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lv0;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    iget-object p1, p2, LMe2;->d:Landroid/widget/Button;

    const-string v0, "binding.sendButton"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lu84;->b:Landroid/widget/Button;

    iget-object p1, p2, LMe2;->b:Landroid/widget/Button;

    const-string v0, "binding.copyButton"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lu84;->c:Landroid/widget/Button;

    iget-object p1, p2, LMe2;->c:Landroidx/appcompat/widget/AppCompatTextView;

    const-string p2, "binding.description"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lu84;->d:Landroid/widget/TextView;

    sget p1, Lnl4;->promo_center_coupon_empty_state_body:I

    iput p1, p0, Lu84;->e:I

    return-void
.end method


# virtual methods
.method public Pl()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lu84;->c:Landroid/widget/Button;

    return-object v0
.end method

.method public Ql()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lu84;->d:Landroid/widget/TextView;

    return-object v0
.end method

.method public Rl()I
    .locals 1

    iget v0, p0, Lu84;->e:I

    return v0
.end method

.method public Sl()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lu84;->b:Landroid/widget/Button;

    return-object v0
.end method
