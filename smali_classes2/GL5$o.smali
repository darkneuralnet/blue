.class public final LGL5$o;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LGL5;-><init>(LhF5;LoI5;LYR4;Lde5;LEa;Lgl;LTq4;Llw0;LDQ3;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LWL5;Le13;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lco/bird/android/model/constant/MapMode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lco/bird/android/model/constant/MapMode;",
        "b",
        "()Lco/bird/android/model/constant/MapMode;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LGL5;


# direct methods
.method public constructor <init>(LGL5;)V
    .locals 0

    iput-object p1, p0, LGL5$o;->g:LGL5;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Lco/bird/android/model/constant/MapMode;
    .locals 1

    iget-object v0, p0, LGL5$o;->g:LGL5;

    invoke-static {v0}, LGL5;->access$getPreference$p(LGL5;)Lgl;

    move-result-object v0

    invoke-virtual {v0}, Lgl;->t0()Lco/bird/android/model/constant/MapMode;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LGL5$o;->b()Lco/bird/android/model/constant/MapMode;

    move-result-object v0

    return-object v0
.end method
