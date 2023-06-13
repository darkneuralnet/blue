.class public final LQE4$b$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQE4$b;-><init>(LQE4;Landroid/view/View;)V
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
        "SMAP\nRepairV3IssueRepairAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3IssueRepairAdapter.kt\nco/bird/android/feature/repair/v3/issues/adapters/RepairV3IssueRepairAdapter$RepairViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,110:1\n18#2:111\n9#3,4:112\n*S KotlinDebug\n*F\n+ 1 RepairV3IssueRepairAdapter.kt\nco/bird/android/feature/repair/v3/issues/adapters/RepairV3IssueRepairAdapter$RepairViewHolder$1\n*L\n60#1:111\n60#1:112,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LQE4$b;

.field public final synthetic h:LQE4;


# direct methods
.method public constructor <init>(LQE4$b;LQE4;)V
    .locals 0

    iput-object p1, p0, LQE4$b$a;->g:LQE4$b;

    iput-object p2, p0, LQE4$b$a;->h:LQE4;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/widget/CompoundButton;Z)V
    .locals 1

    iget-object p1, p0, LQE4$b$a;->g:LQE4$b;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    iget-object v0, p0, LQE4$b$a;->g:LQE4$b;

    invoke-static {v0}, LQE4$b;->a(LQE4$b;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LQE4$b$a;->h:LQE4;

    invoke-static {v0}, LQE4;->access$getAdapterData(LQE4;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LIF4;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, LIF4;

    if-eqz p1, :cond_1

    iget-object v0, p0, LQE4$b$a;->h:LQE4;

    invoke-static {v0}, LQE4;->access$getRepairListener$p(LQE4;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LIF4;->d()Lco/bird/android/model/Repair;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/widget/CompoundButton;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p0, p1, p2}, LQE4$b$a;->a(Landroid/widget/CompoundButton;Z)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
