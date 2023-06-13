.class public final LW04$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW04;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LW04$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LEe2;",
        "b",
        "LEe2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LW04;Landroid/view/View;)V",
        "co.bird.android.feature.payment"
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
        "SMAP\nPreloadV2OptionsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadV2OptionsAdapter.kt\nco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsAdapter$AutoReloadSectionViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,110:1\n18#2:111\n9#3,4:112\n*S KotlinDebug\n*F\n+ 1 PreloadV2OptionsAdapter.kt\nco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsAdapter$AutoReloadSectionViewHolder\n*L\n85#1:111\n85#1:112,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LEe2;

.field public final synthetic c:LW04;


# direct methods
.method public constructor <init>(LW04;Landroid/view/View;)V
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

    iput-object p1, p0, LW04$a;->c:LW04;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LEe2;->a(Landroid/view/View;)LEe2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LW04$a;->b:LEe2;

    return-void
.end method

.method public static final synthetic a(LW04$a;)LEe2;
    .locals 0

    iget-object p0, p0, LW04$a;->b:LEe2;

    return-object p0
.end method


# virtual methods
.method public bind(I)V
    .locals 3

    iget-object v0, p0, LW04$a;->c:LW04;

    invoke-static {v0}, LW04;->access$getAdapterData(LW04;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LAs;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, LAs;

    if-eqz p1, :cond_3

    iget-object v0, p0, LW04$a;->c:LW04;

    invoke-virtual {v0}, LW04;->v()Ljava/lang/Boolean;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, LAs;->b()Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, LW04;->access$setAutoReloadToggle$p(LW04;Ljava/lang/Boolean;)V

    :cond_1
    iget-object v1, p0, LW04$a;->b:LEe2;

    iget-object v1, v1, LEe2;->c:Landroid/widget/Switch;

    const-string v2, "binding.autoReloadToggle"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, LW04$a$a;

    invoke-direct {v2, v0, p0, p1}, LW04$a$a;-><init>(LW04;LW04$a;LAs;)V

    invoke-static {v1, v2}, LMs2;->h(Landroid/widget/CompoundButton;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v0}, LW04;->v()Ljava/lang/Boolean;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v1, p0, LW04$a;->b:LEe2;

    iget-object v1, v1, LEe2;->c:Landroid/widget/Switch;

    invoke-virtual {v1, p1}, Landroid/widget/Switch;->setChecked(Z)V

    :cond_2
    iget-object p1, p0, LW04$a;->b:LEe2;

    iget-object p1, p1, LEe2;->b:Landroid/widget/TextView;

    const-string v1, "binding.autoReloadTitle"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LW04$a$b;

    invoke-direct {v1, v0}, LW04$a$b;-><init>(LW04;)V

    invoke-static {p1, v1}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    :cond_3
    return-void
.end method
