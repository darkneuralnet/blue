.class public final LO85$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO85;->a()V
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
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "",
        "it",
        "",
        "a",
        "(Lkotlin/Unit;)Ljava/lang/Boolean;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/wire/configs/RideConfig;

.field public final synthetic h:LO85;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/configs/RideConfig;LO85;)V
    .locals 0

    iput-object p1, p0, LO85$i;->g:Lco/bird/android/model/wire/configs/RideConfig;

    iput-object p2, p0, LO85$i;->h:LO85;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Unit;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LO85$i;->g:Lco/bird/android/model/wire/configs/RideConfig;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/RideConfig;->getEnableScannerCodeEntryTooltip()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LO85$i;->h:LO85;

    invoke-static {p1}, LO85;->access$getPreference$p(LO85;)Lgl;

    move-result-object p1

    invoke-virtual {p1}, Lgl;->u()I

    move-result p1

    iget-object v0, p0, LO85$i;->g:Lco/bird/android/model/wire/configs/RideConfig;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RideConfig;->getScannerCodeEntryTooltipMaxEntries()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object p1, p0, LO85$i;->h:LO85;

    invoke-static {p1}, LO85;->access$getPreference$p(LO85;)Lgl;

    move-result-object p1

    invoke-virtual {p1}, Lgl;->v()I

    move-result p1

    iget-object v0, p0, LO85$i;->g:Lco/bird/android/model/wire/configs/RideConfig;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RideConfig;->getScannerCodeEntryTooltipMaxViews()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object p1, p0, LO85$i;->h:LO85;

    invoke-static {p1}, LO85;->access$getScanEntryMode$p(LO85;)LAG;

    move-result-object p1

    invoke-virtual {p1}, LAG;->getValue()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lak5;->b:Lak5;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LO85$i;->a(Lkotlin/Unit;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
