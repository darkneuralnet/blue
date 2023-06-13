.class public final Lm33$d$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm33$d;-><init>(Lm33;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroid/widget/CompoundButton;",
        "Ljava/lang/Boolean;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Landroid/widget/CompoundButton;",
        "<anonymous parameter 0>",
        "",
        "isChecked",
        "",
        "a",
        "(Landroid/widget/CompoundButton;Z)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNestFlaggingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlaggingAdapter.kt\nco/bird/android/feature/nestflagging/adapters/NestFlaggingAdapter$ReasonViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n18#2:153\n9#3,4:154\n1#4:158\n*S KotlinDebug\n*F\n+ 1 NestFlaggingAdapter.kt\nco/bird/android/feature/nestflagging/adapters/NestFlaggingAdapter$ReasonViewHolder$1\n*L\n65#1:153\n65#1:154,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lm33$d;

.field public final synthetic h:Lm33;


# direct methods
.method public constructor <init>(Lm33$d;Lm33;)V
    .locals 0

    iput-object p1, p0, Lm33$d$a;->g:Lm33$d;

    iput-object p2, p0, Lm33$d$a;->h:Lm33;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/widget/CompoundButton;Z)V
    .locals 3

    iget-object p1, p0, Lm33$d$a;->g:Lm33$d;

    invoke-static {p1}, Lm33$d;->a(Lm33$d;)LKb2;

    move-result-object p1

    invoke-virtual {p1}, LKb2;->b()Landroid/widget/CheckBox;

    move-result-object p1

    xor-int/lit8 v0, p2, 0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    iget-object p1, p0, Lm33$d$a;->g:Lm33$d;

    invoke-static {p1}, Lm33$d;->b(Lm33$d;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    if-eqz p2, :cond_4

    iget-object p1, p0, Lm33$d$a;->h:Lm33;

    invoke-static {p1}, Lm33;->access$getAdapterData(Lm33;)LE6;

    move-result-object p1

    iget-object p2, p0, Lm33$d$a;->g:Lm33$d;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$D;->getBindingAdapterPosition()I

    move-result p2

    invoke-virtual {p1, p2}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Lkotlin/Pair;

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    move-object p1, v0

    :goto_0
    check-cast p1, Lkotlin/Pair;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/WireFlagNestReason;

    if-eqz p1, :cond_4

    iget-object p2, p0, Lm33$d$a;->h:Lm33;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireFlagNestReason;->getRequiresComment()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p2}, Lm33;->w()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-virtual {p1}, Lco/bird/android/model/wire/WireFlagNestReason;->getCode()Ljava/lang/String;

    move-result-object v1

    const-string v2, "incorrect_nest_size"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p2}, Lm33;->v()Lkotlin/jvm/functions/Function1;

    move-result-object p2

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget-object p2, p0, Lm33$d$a;->h:Lm33;

    invoke-virtual {p2}, Lm33;->x()Lkotlin/jvm/functions/Function1;

    move-result-object p2

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/widget/CompoundButton;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p0, p1, p2}, Lm33$d$a;->a(Landroid/widget/CompoundButton;Z)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
