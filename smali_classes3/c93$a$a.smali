.class public final Lc93$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc93$a;-><init>(Lc93;Landroid/view/View;)V
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
        "checked",
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
        "SMAP\nNonRepairAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonRepairAdapter.kt\nco/bird/android/feature/repair/v3/issues/dialogs/nonrepair/adapters/NonRepairAdapter$NonRepairReasonViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n18#2:108\n9#3,4:109\n1#4:113\n*S KotlinDebug\n*F\n+ 1 NonRepairAdapter.kt\nco/bird/android/feature/repair/v3/issues/dialogs/nonrepair/adapters/NonRepairAdapter$NonRepairReasonViewHolder$1\n*L\n69#1:108\n69#1:109,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lc93$a;

.field public final synthetic h:Lc93;


# direct methods
.method public constructor <init>(Lc93$a;Lc93;)V
    .locals 0

    iput-object p1, p0, Lc93$a$a;->g:Lc93$a;

    iput-object p2, p0, Lc93$a$a;->h:Lc93;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/widget/CompoundButton;Z)V
    .locals 1

    iget-object p1, p0, Lc93$a$a;->g:Lc93$a;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result p1

    iget-object v0, p0, Lc93$a$a;->g:Lc93$a;

    invoke-static {v0}, Lc93$a;->a(Lc93$a;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    if-eqz p2, :cond_1

    iget-object p2, p0, Lc93$a$a;->h:Lc93;

    invoke-static {p2}, Lc93;->access$getAdapterData(Lc93;)LE6;

    move-result-object p2

    invoke-virtual {p2, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Lco/bird/android/model/NonRepairReason;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lco/bird/android/model/NonRepairReason;

    if-eqz p1, :cond_1

    iget-object p2, p0, Lc93$a$a;->h:Lc93;

    invoke-static {p2}, Lc93;->access$getNonRepairReasonSelectsSubject$p(Lc93;)Lio/reactivex/subjects/d;

    move-result-object p2

    invoke-virtual {p2, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/widget/CompoundButton;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p0, p1, p2}, Lc93$a$a;->a(Landroid/widget/CompoundButton;Z)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
