.class public final Lco/bird/android/app/feature/privatebirds/PrivateBirdSmartlockUnlockActivity$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/privatebirds/PrivateBirdSmartlockUnlockActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Ll54;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Ll54;",
        "b",
        "()Ll54;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/app/feature/privatebirds/PrivateBirdSmartlockUnlockActivity;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/privatebirds/PrivateBirdSmartlockUnlockActivity;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/privatebirds/PrivateBirdSmartlockUnlockActivity$a;->g:Lco/bird/android/app/feature/privatebirds/PrivateBirdSmartlockUnlockActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Ll54;
    .locals 4

    new-instance v0, Ll54;

    iget-object v1, p0, Lco/bird/android/app/feature/privatebirds/PrivateBirdSmartlockUnlockActivity$a;->g:Lco/bird/android/app/feature/privatebirds/PrivateBirdSmartlockUnlockActivity;

    invoke-static {v1}, Lco/bird/android/app/feature/privatebirds/PrivateBirdSmartlockUnlockActivity;->access$getScopeProvider(Lco/bird/android/app/feature/privatebirds/PrivateBirdSmartlockUnlockActivity;)Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v1

    new-instance v2, LXL5;

    iget-object v3, p0, Lco/bird/android/app/feature/privatebirds/PrivateBirdSmartlockUnlockActivity$a;->g:Lco/bird/android/app/feature/privatebirds/PrivateBirdSmartlockUnlockActivity;

    invoke-direct {v2, v3}, LXL5;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    iget-object v3, p0, Lco/bird/android/app/feature/privatebirds/PrivateBirdSmartlockUnlockActivity$a;->g:Lco/bird/android/app/feature/privatebirds/PrivateBirdSmartlockUnlockActivity;

    invoke-virtual {v3}, Lco/bird/android/core/mvp/BaseActivity;->w()Le13;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Ll54;-><init>(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LWL5;Le13;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/privatebirds/PrivateBirdSmartlockUnlockActivity$a;->b()Ll54;

    move-result-object v0

    return-object v0
.end method
