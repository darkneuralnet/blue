.class public final La06$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La06;->X(Lco/bird/android/model/TaxInformationSource;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/TaxInformation;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/TaxInformation;",
        "kotlin.jvm.PlatformType",
        "taxInformation",
        "",
        "a",
        "(Lco/bird/android/buava/Optional;)V"
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

    iput-object p1, p0, La06$c;->g:La06;

    iput-object p2, p0, La06$c;->h:Lco/bird/android/model/TaxInformationSource;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/buava/Optional;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/TaxInformation;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, La06$c;->g:La06;

    invoke-static {v0}, La06;->access$getUi$p(La06;)Lf06;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/TaxInformation;

    invoke-static {v1}, Lco/bird/android/model/TaxInformationKt;->isBlank(Lco/bird/android/model/TaxInformation;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iget-object v1, p0, La06$c;->g:La06;

    iget-object v3, p0, La06$c;->h:Lco/bird/android/model/TaxInformationSource;

    invoke-static {v1, v3}, La06;->access$isComplaintRelease(La06;Lco/bird/android/model/TaxInformationSource;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    invoke-interface {v0, v1}, Lf06;->x2(Z)V

    iget-object v0, p0, La06$c;->g:La06;

    invoke-static {v0}, La06;->access$getUi$p(La06;)Lf06;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/TaxInformation;

    iget-object v1, p0, La06$c;->g:La06;

    iget-object v3, p0, La06$c;->h:Lco/bird/android/model/TaxInformationSource;

    invoke-static {v1, v3}, La06;->access$getAlternativeTaxCodePrompt(La06;Lco/bird/android/model/TaxInformationSource;)Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, La06$c;->g:La06;

    invoke-static {v3}, La06;->access$getCountryName(La06;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, p1, v2, v1, v3}, Lf06;->v6(Lco/bird/android/model/TaxInformation;ZLjava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {p0, p1}, La06$c;->a(Lco/bird/android/buava/Optional;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
