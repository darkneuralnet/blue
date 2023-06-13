.class public final Lu40$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu40;-><init>(LXl3;Lom3;LpJ;Lbn;Lcom/uber/autodispose/ScopeProvider;Lv40;Le13;Lco/bird/android/model/constant/BulkScanPurpose;Let3;LEa;Lco/bird/android/model/wire/WireBatch;Lco/bird/android/core/mvp/BaseActivity;LTq4;LvW0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LDI3;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LDI3;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(LDI3;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lv40;


# direct methods
.method public constructor <init>(Lv40;)V
    .locals 0

    iput-object p1, p0, Lu40$d;->g:Lv40;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LDI3;)V
    .locals 1

    iget-object p1, p0, Lu40$d;->g:Lv40;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lv40;->Ve(Z)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LDI3;

    invoke-virtual {p0, p1}, Lu40$d;->a(LDI3;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
