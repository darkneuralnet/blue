.class public final LNm$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNm$a;-><init>(LNm;Landroid/view/View;)V
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
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Landroid/view/View;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAreaBottomSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaBottomSheetAdapter.kt\nco/bird/android/feature/bottomsheets/area/adapters/AreaBottomSheetAdapter$CapRestrictionViewHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LNm$a;

.field public final synthetic h:LNm;


# direct methods
.method public constructor <init>(LNm$a;LNm;)V
    .locals 0

    iput-object p1, p0, LNm$a$a;->g:LNm$a;

    iput-object p2, p0, LNm$a$a;->h:LNm;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, LNm$a$a;->invoke(Landroid/view/View;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 3

    iget-object p1, p0, LNm$a$a;->g:LNm$a;

    invoke-static {p1}, LNm$a;->a(LNm$a;)Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, LNm$a$a;->h:LNm;

    invoke-static {v0}, LNm;->access$getListener$p(LNm;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    new-instance v1, Lco/bird/android/model/AreaDirectionsButton;

    const-string v2, ""

    invoke-direct {v1, v2, p1}, Lco/bird/android/model/AreaDirectionsButton;-><init>(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/Geolocation;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
