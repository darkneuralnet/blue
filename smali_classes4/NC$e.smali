.class public final LNC$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNC;->a(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/WorkOrder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Throwable;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "e",
        "",
        "kotlin.jvm.PlatformType",
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
        "SMAP\nBaseQualityControlPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseQualityControlPresenter.kt\nco/bird/android/qualitycontrol/base/BaseQualityControlPresenter$onCreate$10\n+ 2 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n9#2,4:139\n1#3:143\n*S KotlinDebug\n*F\n+ 1 BaseQualityControlPresenter.kt\nco/bird/android/qualitycontrol/base/BaseQualityControlPresenter$onCreate$10\n*L\n106#1:139,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LNC;


# direct methods
.method public constructor <init>(LNC;)V
    .locals 0

    iput-object p1, p0, LNC$e;->g:LNC;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LNC$e;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 2

    instance-of v0, p1, Lco/bird/api/exception/HttpException;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/api/exception/HttpException;

    if-eqz p1, :cond_1

    iget-object v0, p0, LNC$e;->g:LNC;

    invoke-static {v0}, LNC;->access$getUi$p(LNC;)LOC;

    move-result-object v0

    invoke-interface {v0, p1}, LaM5;->error(Ljava/lang/Throwable;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_1
    if-nez v1, :cond_2

    iget-object p1, p0, LNC$e;->g:LNC;

    invoke-static {p1}, LNC;->access$getUi$p(LNC;)LOC;

    move-result-object p1

    invoke-interface {p1}, LaM5;->errorGeneric()V

    :cond_2
    return-void
.end method
