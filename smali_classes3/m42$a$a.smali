.class public final Lm42$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm42$a;-><init>(Lm42;Landroid/view/View;)V
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
        "SMAP\nInspectionV3IssueAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionV3IssueAdapter.kt\nco/bird/android/feature/workorders/v3/adapters/InspectionV3IssueAdapter$IssueViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,67:1\n18#2:68\n9#3,4:69\n*S KotlinDebug\n*F\n+ 1 InspectionV3IssueAdapter.kt\nco/bird/android/feature/workorders/v3/adapters/InspectionV3IssueAdapter$IssueViewHolder$1\n*L\n43#1:68\n43#1:69,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lm42$a;

.field public final synthetic h:Lm42;


# direct methods
.method public constructor <init>(Lm42$a;Lm42;)V
    .locals 0

    iput-object p1, p0, Lm42$a$a;->g:Lm42$a;

    iput-object p2, p0, Lm42$a$a;->h:Lm42;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/widget/CompoundButton;Z)V
    .locals 4

    iget-object p1, p0, Lm42$a$a;->g:Lm42$a;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_2

    iget-object v0, p0, Lm42$a$a;->g:Lm42$a;

    invoke-static {v0}, Lm42$a;->a(Lm42$a;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lm42$a$a;->h:Lm42;

    invoke-static {v0}, Lm42;->access$getAdapterData(Lm42;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/InspectionIssue;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lco/bird/android/model/InspectionIssue;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lm42$a$a;->h:Lm42;

    invoke-static {v0}, Lm42;->access$getIssueListener$p(Lm42;)Lkotlin/jvm/functions/Function1;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/InspectionIssue;->getId()Ljava/lang/String;

    move-result-object v2

    xor-int/lit8 v3, p2, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-virtual {p1}, Lco/bird/android/model/InspectionIssue;->getWarningMessage()Ljava/lang/String;

    move-result-object v1

    if-nez p2, :cond_2

    if-eqz v1, :cond_2

    invoke-static {v0}, Lm42;->access$getWarningListener$p(Lm42;)Lkotlin/jvm/functions/Function1;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/InspectionIssue;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/widget/CompoundButton;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p0, p1, p2}, Lm42$a$a;->a(Landroid/widget/CompoundButton;Z)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
