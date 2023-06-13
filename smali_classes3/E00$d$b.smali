.class public final LE00$d$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE00$d;-><init>(LE00;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/view/View;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Landroid/view/View;",
        "it",
        "",
        "a",
        "(Landroid/view/View;)Ljava/lang/Boolean;"
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
        "SMAP\nBountyFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BountyFlightSheetAdapter.kt\nco/bird/android/flightsheet/BountyFlightSheetAdapter$BountyTextViewHolder$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,265:1\n1#2:266\n18#3:267\n9#4,4:268\n*S KotlinDebug\n*F\n+ 1 BountyFlightSheetAdapter.kt\nco/bird/android/flightsheet/BountyFlightSheetAdapter$BountyTextViewHolder$2\n*L\n140#1:267\n140#1:268,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LE00$d;

.field public final synthetic h:LE00;


# direct methods
.method public constructor <init>(LE00$d;LE00;)V
    .locals 0

    iput-object p1, p0, LE00$d$b;->g:LE00$d;

    iput-object p2, p0, LE00$d$b;->h:LE00;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)Ljava/lang/Boolean;
    .locals 2

    iget-object p1, p0, LE00$d$b;->g:LE00$d;

    invoke-virtual {p1}, Lw1;->getSafePosition()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p0, LE00$d$b;->h:LE00;

    invoke-static {v0}, LE00;->access$getAdapterData(LE00;)LE6;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionText;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionText;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionText;->getAutoDetectLinks()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionText;->getBody()Ljava/lang/String;

    move-result-object v1

    :cond_1
    if-eqz v1, :cond_2

    new-instance p1, Lco/bird/android/model/CopyTextButton;

    invoke-direct {p1, v1}, Lco/bird/android/model/CopyTextButton;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, LE00$d$b;->h:LE00;

    invoke-static {v0}, LE00;->access$getListener$p(LE00;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, LE00$d$b;->a(Landroid/view/View;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
