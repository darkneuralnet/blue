.class public final Lco/bird/android/feature/suggestanest/SuggestNestActivity$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/suggestanest/SuggestNestActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Landroid/os/Handler;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Landroid/os/Handler;",
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


# instance fields
.field public final synthetic g:Lco/bird/android/feature/suggestanest/SuggestNestActivity;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity$c;->g:Lco/bird/android/feature/suggestanest/SuggestNestActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Landroid/os/Handler;
    .locals 2

    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity$c;->g:Lco/bird/android/feature/suggestanest/SuggestNestActivity;

    invoke-static {v1}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->access$getAsyncHandlerThread$p(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)Landroid/os/HandlerThread;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/suggestanest/SuggestNestActivity$c;->invoke()Landroid/os/Handler;

    move-result-object v0

    return-object v0
.end method
