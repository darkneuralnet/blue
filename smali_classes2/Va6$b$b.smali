.class public final LVa6$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LVa6$b;-><init>(LVa6;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0003\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u0002H\u0016J0\u0010\u000c\u001a\u00020\u00042\u000c\u0010\u0003\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00022\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a8\u0006\r"
    }
    d2 = {
        "Va6$b$b",
        "Landroid/widget/AdapterView$OnItemSelectedListener;",
        "Landroid/widget/AdapterView;",
        "parent",
        "",
        "onNothingSelected",
        "Landroid/view/View;",
        "view",
        "",
        "position",
        "",
        "id",
        "onItemSelected",
        "app_birdRelease"
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
        "SMAP\nTweaksAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TweaksAdapter.kt\nco/bird/android/app/feature/settings/tweaks/adapter/TweaksAdapter$EnumTweakViewHolder$2\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,247:1\n18#2:248\n9#3,4:249\n*S KotlinDebug\n*F\n+ 1 TweaksAdapter.kt\nco/bird/android/app/feature/settings/tweaks/adapter/TweaksAdapter$EnumTweakViewHolder$2\n*L\n194#1:248\n194#1:249,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:LVa6$b;

.field public final synthetic c:LVa6;


# direct methods
.method public constructor <init>(LVa6$b;LVa6;)V
    .locals 0

    iput-object p1, p0, LVa6$b$b;->b:LVa6$b;

    iput-object p2, p0, LVa6$b$b;->c:LVa6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    iget-object p1, p0, LVa6$b$b;->b:LVa6$b;

    invoke-static {p1}, LVa6$b;->a(LVa6$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, LVa6$b$b;->c:LVa6;

    invoke-static {p1}, LVa6;->access$getAdapterData(LVa6;)LE6;

    move-result-object p1

    invoke-virtual {p1}, LE6;->h()Ljava/util/List;

    move-result-object p1

    iget-object p2, p0, LVa6$b$b;->b:LVa6$b;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result p2

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Lof1;

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lof1;

    if-nez p1, :cond_2

    return-void

    :cond_2
    iget-object p2, p0, LVa6$b$b;->c:LVa6;

    invoke-static {p2}, LVa6;->access$getTweakEditsSubject$p(LVa6;)Lio/reactivex/subjects/d;

    move-result-object p2

    invoke-virtual {p1}, Lof1;->e()LRa6;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {p1, p3}, Lof1;->b(I)Ljava/lang/Enum;

    move-result-object v5

    const/16 v6, 0xf

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, LRa6;->copy$default(LRa6;Ljava/lang/String;Lkotlin/reflect/KType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Ljava/lang/Object;ILjava/lang/Object;)LRa6;

    move-result-object p1

    invoke-virtual {p2, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;)V"
        }
    .end annotation

    return-void
.end method
