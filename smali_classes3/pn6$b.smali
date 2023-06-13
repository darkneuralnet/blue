.class public final Lpn6$b;
.super Landroidx/recyclerview/widget/RecyclerView$D;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpn6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "Lpn6$b;",
        "Landroidx/recyclerview/widget/RecyclerView$D;",
        "Lco/bird/android/model/VehiclePricing;",
        "vehiclePricing",
        "",
        "a",
        "Lmu6;",
        "b",
        "Lmu6;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Landroid/view/View;)V",
        "vehicle-pricing_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:Lmu6;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$D;-><init>(Landroid/view/View;)V

    invoke-static {p1}, Lmu6;->a(Landroid/view/View;)Lmu6;

    move-result-object p1

    const-string v0, "bind(view)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpn6$b;->b:Lmu6;

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/VehiclePricing;)V
    .locals 2

    const-string v0, "vehiclePricing"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpn6$b;->b:Lmu6;

    iget-object v0, v0, Lmu6;->d:Landroid/widget/ImageView;

    invoke-static {v0}, Lcom/bumptech/glide/a;->u(Landroid/view/View;)LUI4;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/VehiclePricing;->getImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LUI4;->k(Ljava/lang/String;)LrI4;

    move-result-object v0

    iget-object v1, p0, Lpn6$b;->b:Lmu6;

    iget-object v1, v1, Lmu6;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, LrI4;->R0(Landroid/widget/ImageView;)LIt6;

    iget-object v0, p0, Lpn6$b;->b:Lmu6;

    iget-object v0, v0, Lmu6;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/VehiclePricing;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lpn6$b;->b:Lmu6;

    iget-object v0, v0, Lmu6;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/VehiclePricing;->getDetails()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
