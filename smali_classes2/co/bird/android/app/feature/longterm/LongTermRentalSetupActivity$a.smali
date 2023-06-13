.class public final Lco/bird/android/app/feature/longterm/LongTermRentalSetupActivity$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/longterm/LongTermRentalSetupActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lrz2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lrz2;",
        "b",
        "()Lrz2;"
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
        "SMAP\nLongTermRentalSetupActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongTermRentalSetupActivity.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupActivity$coordinator$2\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,22:1\n44#2:23\n*S KotlinDebug\n*F\n+ 1 LongTermRentalSetupActivity.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupActivity$coordinator$2\n*L\n15#1:23\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/app/feature/longterm/LongTermRentalSetupActivity;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/longterm/LongTermRentalSetupActivity;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/longterm/LongTermRentalSetupActivity$a;->g:Lco/bird/android/app/feature/longterm/LongTermRentalSetupActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Lrz2;
    .locals 3

    iget-object v0, p0, Lco/bird/android/app/feature/longterm/LongTermRentalSetupActivity$a;->g:Lco/bird/android/app/feature/longterm/LongTermRentalSetupActivity;

    invoke-virtual {v0}, Lco/bird/android/app/feature/longterm/LongTermRentalSetupActivity;->w0()Lsz2;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/app/feature/longterm/LongTermRentalSetupActivity$a;->g:Lco/bird/android/app/feature/longterm/LongTermRentalSetupActivity;

    invoke-static {v1}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v1

    const-string v2, "AndroidLifecycleScopeProvider.from(this)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lsz2;->a(Lcom/uber/autodispose/ScopeProvider;)Lrz2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/longterm/LongTermRentalSetupActivity$a;->b()Lrz2;

    move-result-object v0

    return-object v0
.end method
