.class public final LZy3$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZy3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LZy3$b;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Luf2;",
        "b",
        "Luf2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LZy3;Landroid/view/View;)V",
        "co.bird.android.feature.transfer-order"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nOutboundScanAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutboundScanAdapter.kt\nco/bird/android/feature/transferorder/scanner/outbound/adapters/OutboundScanAdapter$VehicleViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,82:1\n18#2:83\n9#3,4:84\n1#4:88\n*S KotlinDebug\n*F\n+ 1 OutboundScanAdapter.kt\nco/bird/android/feature/transferorder/scanner/outbound/adapters/OutboundScanAdapter$VehicleViewHolder\n*L\n74#1:83\n74#1:84,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Luf2;

.field public final synthetic c:LZy3;


# direct methods
.method public constructor <init>(LZy3;Landroid/view/View;)V
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

    iput-object p1, p0, LZy3$b;->c:LZy3;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Luf2;->a(Landroid/view/View;)Luf2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LZy3$b;->b:Luf2;

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 4

    iget-object v0, p0, LZy3$b;->c:LZy3;

    invoke-static {v0}, LZy3;->access$getAdapterData(LZy3;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lkotlin/Pair;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lkotlin/Pair;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LPC5;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v2, p0, LZy3$b;->b:Luf2;

    iget-object v2, v2, Luf2;->g:Landroid/widget/TextView;

    invoke-virtual {v0}, LPC5;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, LZy3$b;->b:Luf2;

    iget-object v2, v2, Luf2;->h:Landroid/widget/TextView;

    invoke-virtual {v0}, LPC5;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LZy3$b;->b:Luf2;

    iget-object v0, v0, Luf2;->f:Landroid/widget/ImageView;

    const-string v2, "binding.check"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, p1, v2, v3, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    :cond_1
    return-void
.end method