.class public final La06$n;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La06;->o0(Lco/bird/android/model/TaxInformationSource;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/TaxInformation;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/TaxInformation;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lco/bird/android/model/TaxInformation;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:La06;

.field public final synthetic h:Lco/bird/android/model/TaxInformationSource;


# direct methods
.method public constructor <init>(La06;Lco/bird/android/model/TaxInformationSource;)V
    .locals 0

    iput-object p1, p0, La06$n;->g:La06;

    iput-object p2, p0, La06$n;->h:Lco/bird/android/model/TaxInformationSource;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/TaxInformation;)V
    .locals 1

    iget-object p1, p0, La06$n;->g:La06;

    iget-object v0, p0, La06$n;->h:Lco/bird/android/model/TaxInformationSource;

    invoke-static {p1, v0}, La06;->access$getCloseOnSubmit(La06;Lco/bird/android/model/TaxInformationSource;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, La06$n;->g:La06;

    invoke-static {p1}, La06;->access$getNavigator$p(La06;)Le13;

    move-result-object p1

    const/4 v0, -0x1

    invoke-interface {p1, v0}, Le13;->b1(I)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, La06$n;->g:La06;

    invoke-static {p1}, La06;->access$getUi$p(La06;)Lf06;

    move-result-object p1

    invoke-interface {p1}, Lf06;->j3()V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/TaxInformation;

    invoke-virtual {p0, p1}, La06$n;->a(Lco/bird/android/model/TaxInformation;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
