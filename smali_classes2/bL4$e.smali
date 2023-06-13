.class public final LbL4$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LbL4;->l()Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/PaymentIntentStatus;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/PaymentIntentStatus;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lco/bird/android/model/PaymentIntentStatus;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LbL4;


# direct methods
.method public constructor <init>(LbL4;)V
    .locals 0

    iput-object p1, p0, LbL4$e;->g:LbL4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/PaymentIntentStatus;)V
    .locals 1

    sget-object v0, Lco/bird/android/model/REQUIRES_AUTHENTICATION;->INSTANCE:Lco/bird/android/model/REQUIRES_AUTHENTICATION;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, LbL4$e;->g:LbL4;

    invoke-static {p1}, LbL4;->access$getManager$p(LbL4;)LpM3;

    move-result-object p1

    iget-object v0, p0, LbL4$e;->g:LbL4;

    invoke-static {v0}, LbL4;->access$getActivity$p(LbL4;)Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    invoke-interface {p1, v0}, LpM3;->m(Landroidx/appcompat/app/AppCompatActivity;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lco/bird/android/model/UNEXPECTED;

    if-nez v0, :cond_1

    sget-object v0, Lco/bird/android/model/REQUIRES_PAYMENT_METHOD;->INSTANCE:Lco/bird/android/model/REQUIRES_PAYMENT_METHOD;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    iget-object p1, p0, LbL4$e;->g:LbL4;

    invoke-static {p1}, LbL4;->access$getUi$p(LbL4;)LGL4;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LGL4;->k(Z)V

    :cond_2
    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/PaymentIntentStatus;

    invoke-virtual {p0, p1}, LbL4$e;->a(Lco/bird/android/model/PaymentIntentStatus;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
