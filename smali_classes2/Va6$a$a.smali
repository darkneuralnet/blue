.class public final LVa6$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LVa6$a;-><init>(LVa6;Landroid/view/View;)V
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
        "SMAP\nTweaksAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TweaksAdapter.kt\nco/bird/android/app/feature/settings/tweaks/adapter/TweaksAdapter$BooleanTweakViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,247:1\n18#2:248\n9#3,4:249\n*S KotlinDebug\n*F\n+ 1 TweaksAdapter.kt\nco/bird/android/app/feature/settings/tweaks/adapter/TweaksAdapter$BooleanTweakViewHolder$1\n*L\n148#1:248\n148#1:249,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LVa6$a;

.field public final synthetic h:LVa6;


# direct methods
.method public constructor <init>(LVa6$a;LVa6;)V
    .locals 0

    iput-object p1, p0, LVa6$a$a;->g:LVa6$a;

    iput-object p2, p0, LVa6$a$a;->h:LVa6;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/widget/CompoundButton;Z)V
    .locals 10

    iget-object p1, p0, LVa6$a$a;->g:LVa6$a;

    invoke-static {p1}, LVa6$a;->a(LVa6$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, LVa6$a$a;->h:LVa6;

    invoke-static {p1}, LVa6;->access$getAdapterData(LVa6;)LE6;

    move-result-object p1

    invoke-virtual {p1}, LE6;->h()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, LVa6$a$a;->g:LVa6$a;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result v0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LZY;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    move-object p1, v1

    :goto_0
    check-cast p1, LZY;

    if-nez p1, :cond_2

    return-void

    :cond_2
    iget-object v0, p0, LVa6$a$a;->h:LVa6;

    invoke-static {v0}, LVa6;->access$getTweakEditsSubject$p(LVa6;)Lio/reactivex/subjects/d;

    move-result-object v0

    invoke-virtual {p1}, LZY;->b()LRa6;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz p2, :cond_3

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :cond_3
    move-object v7, v1

    const/16 v8, 0xf

    const/4 v9, 0x0

    invoke-static/range {v2 .. v9}, LRa6;->copy$default(LRa6;Ljava/lang/String;Lkotlin/reflect/KType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Ljava/lang/Object;ILjava/lang/Object;)LRa6;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    iget-object p1, p0, LVa6$a$a;->g:LVa6$a;

    invoke-static {p1}, LVa6$a;->b(LVa6$a;)LZf2;

    move-result-object p1

    iget-object p1, p1, LZf2;->c:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {p1, p2}, Landroid/view/View;->setEnabled(Z)V

    iget-object p1, p0, LVa6$a$a;->h:LVa6;

    iget-object p2, p0, LVa6$a$a;->g:LVa6$a;

    invoke-static {p2}, LVa6$a;->b(LVa6$a;)LZf2;

    move-result-object p2

    iget-object p2, p2, LZf2;->b:Landroidx/appcompat/widget/AppCompatCheckBox;

    const-string v0, "viewBinding.checkBox"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, LVa6;->access$updateTextColor(LVa6;Landroid/widget/CheckBox;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/widget/CompoundButton;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p0, p1, p2}, LVa6$a$a;->a(Landroid/widget/CompoundButton;Z)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
