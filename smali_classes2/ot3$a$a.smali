.class public final Lot3$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lot3$a;-><init>(Lot3;Landroid/view/View;)V
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
        "SMAP\nOperatorSettingsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorSettingsAdapter.kt\nco/bird/android/app/feature/settings/operator/adapters/OperatorSettingsAdapter$OperatorSettingViewHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,66:1\n1#2:67\n18#3:68\n9#4,4:69\n*S KotlinDebug\n*F\n+ 1 OperatorSettingsAdapter.kt\nco/bird/android/app/feature/settings/operator/adapters/OperatorSettingsAdapter$OperatorSettingViewHolder$1\n*L\n49#1:68\n49#1:69,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lot3$a;

.field public final synthetic h:Lot3;


# direct methods
.method public constructor <init>(Lot3$a;Lot3;)V
    .locals 0

    iput-object p1, p0, Lot3$a$a;->g:Lot3$a;

    iput-object p2, p0, Lot3$a$a;->h:Lot3;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/widget/CompoundButton;Z)V
    .locals 10

    iget-object p1, p0, Lot3$a$a;->g:Lot3$a;

    invoke-static {p1}, Lot3$a;->a(Lot3$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lot3$a$a;->g:Lot3$a;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    move-object p1, v1

    :goto_1
    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lot3$a$a;->h:Lot3;

    invoke-static {v0}, Lot3;->access$getAdapterData(Lot3;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lmt3;

    if-eqz v0, :cond_3

    move-object v1, p1

    :cond_3
    check-cast v1, Lmt3;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lmt3;->e()LRa6;

    move-result-object v2

    if-eqz v2, :cond_4

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    const/16 v8, 0xf

    const/4 v9, 0x0

    invoke-static/range {v2 .. v9}, LRa6;->copy$default(LRa6;Ljava/lang/String;Lkotlin/reflect/KType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Ljava/lang/Object;ILjava/lang/Object;)LRa6;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object p2, p0, Lot3$a$a;->h:Lot3;

    invoke-static {p2}, Lot3;->access$getTweakUpdatesRelay$p(Lot3;)Lma4;

    move-result-object p2

    invoke-virtual {p2, p1}, Lma4;->accept(Ljava/lang/Object;)V

    :cond_4
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/widget/CompoundButton;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p0, p1, p2}, Lot3$a$a;->a(Landroid/widget/CompoundButton;Z)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
