.class public final Lz21$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz21;->b(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/google/android/gms/recaptcha/RecaptchaHandle;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lcom/google/android/gms/recaptcha/RecaptchaHandle;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lcom/google/android/gms/recaptcha/RecaptchaHandle;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lz21;


# direct methods
.method public constructor <init>(Lz21;)V
    .locals 0

    iput-object p1, p0, Lz21$d;->g:Lz21;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/recaptcha/RecaptchaHandle;)V
    .locals 1

    iget-object v0, p0, Lz21$d;->g:Lz21;

    invoke-static {v0, p1}, Lz21;->access$setRecaptchaHandle$p(Lz21;Lcom/google/android/gms/recaptcha/RecaptchaHandle;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/android/gms/recaptcha/RecaptchaHandle;

    invoke-virtual {p0, p1}, Lz21$d;->a(Lcom/google/android/gms/recaptcha/RecaptchaHandle;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method