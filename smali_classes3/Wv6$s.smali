.class public final LWv6$s;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWv6;->N(LYv6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/GravityVector;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/GravityVector;",
        "kotlin.jvm.PlatformType",
        "sensorReading",
        "",
        "a",
        "(Lco/bird/android/model/GravityVector;)V"
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
        "SMAP\nVpsResolvePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VpsResolvePresenter.kt\nco/bird/android/feature/ar/resolution/VpsResolvePresenter$consume$25\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,489:1\n1#2:490\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LWv6;


# direct methods
.method public constructor <init>(LWv6;)V
    .locals 0

    iput-object p1, p0, LWv6$s;->g:LWv6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/GravityVector;)V
    .locals 5

    invoke-virtual {p1}, Lco/bird/android/model/GravityVector;->getZ()F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-lez v0, :cond_2

    iget-object p1, p0, LWv6$s;->g:LWv6;

    invoke-static {p1}, LWv6;->access$getScanningState$p(LWv6;)LWv6$b;

    move-result-object p1

    sget-object v0, LWv6$b;->b:LWv6$b;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    if-eqz v3, :cond_1

    move-object v2, p1

    :cond_1
    if-eqz v2, :cond_5

    iget-object p1, p0, LWv6$s;->g:LWv6;

    sget-object v0, LWv6$b;->c:LWv6$b;

    invoke-static {p1, v0}, LWv6;->access$setScanningState$p(LWv6;LWv6$b;)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lco/bird/android/model/GravityVector;->getZ()F

    move-result p1

    cmpg-float p1, p1, v1

    if-gez p1, :cond_5

    iget-object p1, p0, LWv6$s;->g:LWv6;

    invoke-static {p1}, LWv6;->access$getScanningState$p(LWv6;)LWv6$b;

    move-result-object p1

    sget-object v0, LWv6$b;->c:LWv6$b;

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    move v3, v4

    :goto_1
    if-eqz v3, :cond_4

    move-object v2, p1

    :cond_4
    if-eqz v2, :cond_5

    iget-object p1, p0, LWv6$s;->g:LWv6;

    sget-object v0, LWv6$b;->d:LWv6$b;

    invoke-static {p1, v0}, LWv6;->access$setScanningState$p(LWv6;LWv6$b;)V

    :cond_5
    :goto_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/GravityVector;

    invoke-virtual {p0, p1}, LWv6$s;->a(Lco/bird/android/model/GravityVector;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
