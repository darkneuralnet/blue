.class public final Lfl3$e$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfl3$e;-><init>(Lfl3;Landroid/view/View;)V
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
        "<anonymous parameter 1>",
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
        "SMAP\nOperatorFilterV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorFilterV2Adapter.kt\nco/bird/android/feature/filters/operator/v2/adapters/OperatorFilterV2Adapter$ToggleSelectFilterViewHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,298:1\n1#2:299\n18#3:300\n9#4,4:301\n*S KotlinDebug\n*F\n+ 1 OperatorFilterV2Adapter.kt\nco/bird/android/feature/filters/operator/v2/adapters/OperatorFilterV2Adapter$ToggleSelectFilterViewHolder$1\n*L\n281#1:300\n281#1:301,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lfl3$e;

.field public final synthetic h:Lfl3;


# direct methods
.method public constructor <init>(Lfl3$e;Lfl3;)V
    .locals 0

    iput-object p1, p0, Lfl3$e$a;->g:Lfl3$e;

    iput-object p2, p0, Lfl3$e$a;->h:Lfl3;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/widget/CompoundButton;Z)V
    .locals 0

    iget-object p1, p0, Lfl3$e$a;->g:Lfl3$e;

    invoke-static {p1}, Lfl3$e;->a(Lfl3$e;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lfl3$e$a;->g:Lfl3$e;

    invoke-virtual {p1}, Lw1;->getSafePosition()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p2, p0, Lfl3$e$a;->h:Lfl3;

    invoke-static {p2}, Lfl3;->access$getAdapterData(Lfl3;)LE6;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p2, p1}, LE6;->e(I)LG6;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Lco/bird/android/model/persistence/OperatorToggleFilter;

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lco/bird/android/model/persistence/OperatorToggleFilter;

    if-eqz p1, :cond_2

    iget-object p2, p0, Lfl3$e$a;->h:Lfl3;

    invoke-static {p2}, Lfl3;->access$getFilterSubject$p(Lfl3;)Lio/reactivex/subjects/d;

    move-result-object p2

    invoke-virtual {p2, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/widget/CompoundButton;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p0, p1, p2}, Lfl3$e$a;->a(Landroid/widget/CompoundButton;Z)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
