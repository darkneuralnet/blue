.class public final LO85$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO85;->P(Lco/bird/android/model/BirdScan;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
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
        "SMAP\nRiderBirdScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderBirdScanPresenter.kt\nco/bird/android/app/feature/scanner/RiderBirdScanPresenterImpl$handleExplicitError$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,945:1\n1#2:946\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/BirdScan;

.field public final synthetic h:LO85;


# direct methods
.method public constructor <init>(Lco/bird/android/model/BirdScan;LO85;)V
    .locals 0

    iput-object p1, p0, LO85$d;->g:Lco/bird/android/model/BirdScan;

    iput-object p2, p0, LO85$d;->h:LO85;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LO85$d;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    iget-object v0, p0, LO85$d;->g:Lco/bird/android/model/BirdScan;

    invoke-virtual {v0}, Lco/bird/android/model/BirdScan;->getError()Lco/bird/android/model/wire/WireError;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireError;->getButtonLink()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LO85$d;->h:LO85;

    invoke-static {v1}, LO85;->access$getNavigator$p(LO85;)Le13;

    move-result-object v1

    invoke-interface {v1, v0}, Le13;->m2(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
