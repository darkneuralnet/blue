.class public final LVw5$C;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LVw5;->c(Landroid/content/Intent;LsJ4;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Unit;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lkotlin/Unit;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LVw5;


# direct methods
.method public constructor <init>(LVw5;)V
    .locals 0

    iput-object p1, p0, LVw5$C;->g:LVw5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LVw5$C;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 1

    iget-object p1, p0, LVw5$C;->g:LVw5;

    invoke-static {p1}, LVw5;->access$getComplaintReceiptsEnabled$p(LVw5;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LVw5$C;->g:LVw5;

    invoke-static {p1}, LVw5;->access$getTaxInformationEnabled$p(LVw5;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lco/bird/android/model/TaxInformationSource;->COMPLAINT_RECEIPTS_AND_TAX_ENABLED_MARKET:Lco/bird/android/model/TaxInformationSource;

    goto :goto_0

    :cond_0
    iget-object p1, p0, LVw5$C;->g:LVw5;

    invoke-static {p1}, LVw5;->access$getComplaintReceiptsEnabled$p(LVw5;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lco/bird/android/model/TaxInformationSource;->COMPLAINT_RECEIPTS_ONLY:Lco/bird/android/model/TaxInformationSource;

    goto :goto_0

    :cond_1
    sget-object p1, Lco/bird/android/model/TaxInformationSource;->SETTINGS:Lco/bird/android/model/TaxInformationSource;

    :goto_0
    iget-object v0, p0, LVw5$C;->g:LVw5;

    invoke-static {v0}, LVw5;->access$getNavigator$p(LVw5;)Le13;

    move-result-object v0

    invoke-interface {v0, p1}, Le13;->Y1(Lco/bird/android/model/TaxInformationSource;)V

    return-void
.end method
