.class public final LeU5$c$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LeU5$c$a;->a(LHJ6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LeU5$c$a$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function4<",
        "Ljava/lang/CharSequence;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "",
        "text",
        "",
        "<anonymous parameter 1>",
        "<anonymous parameter 2>",
        "<anonymous parameter 3>",
        "",
        "a",
        "(Ljava/lang/CharSequence;III)V"
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
        "SMAP\nSuggestNestAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestNestAdapter.kt\nco/bird/android/feature/suggestanest/bottomsheet/adapter/SuggestNestAdapter$DetailViewHolder$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,159:1\n1#2:160\n18#3:161\n9#4,4:162\n*S KotlinDebug\n*F\n+ 1 SuggestNestAdapter.kt\nco/bird/android/feature/suggestanest/bottomsheet/adapter/SuggestNestAdapter$DetailViewHolder$1$1\n*L\n68#1:161\n68#1:162,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LeU5$c;

.field public final synthetic h:LeU5;


# direct methods
.method public constructor <init>(LeU5$c;LeU5;)V
    .locals 0

    iput-object p1, p0, LeU5$c$a$a;->g:LeU5$c;

    iput-object p2, p0, LeU5$c$a$a;->h:LeU5;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/CharSequence;III)V
    .locals 1

    iget-object p2, p0, LeU5$c$a$a;->g:LeU5$c;

    invoke-virtual {p2}, Lw1;->getSafePosition()Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_5

    iget-object p3, p0, LeU5$c$a$a;->h:LeU5;

    invoke-static {p3}, LeU5;->access$getAdapterData(LeU5;)LE6;

    move-result-object p3

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p3, p2}, LE6;->e(I)LG6;

    move-result-object p2

    if-eqz p2, :cond_5

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of p3, p2, LjU5;

    const/4 p4, 0x0

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, p4

    :goto_0
    check-cast p2, LjU5;

    if-eqz p2, :cond_5

    iget-object p3, p0, LeU5$c$a$a;->h:LeU5;

    invoke-virtual {p2}, LjU5;->f()LkU5;

    move-result-object p2

    sget-object v0, LeU5$c$a$a$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_3

    const/4 v0, 0x2

    if-eq p2, v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p3}, LeU5;->x()Lkotlin/jvm/functions/Function1;

    move-result-object p2

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p4

    :cond_2
    invoke-interface {p2, p4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    invoke-virtual {p3}, LeU5;->w()Lkotlin/jvm/functions/Function1;

    move-result-object p2

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p4

    :cond_4
    invoke-interface {p2, p4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/CharSequence;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, LeU5$c$a$a;->a(Ljava/lang/CharSequence;III)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
