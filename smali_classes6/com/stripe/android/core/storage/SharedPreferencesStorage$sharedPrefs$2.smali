.class final Lcom/stripe/android/core/storage/SharedPreferencesStorage$sharedPrefs$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/core/storage/SharedPreferencesStorage;-><init>(Landroid/content/Context;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Landroid/content/SharedPreferences;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "Landroid/content/SharedPreferences;",
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


# instance fields
.field final synthetic this$0:Lcom/stripe/android/core/storage/SharedPreferencesStorage;


# direct methods
.method public constructor <init>(Lcom/stripe/android/core/storage/SharedPreferencesStorage;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/core/storage/SharedPreferencesStorage$sharedPrefs$2;->this$0:Lcom/stripe/android/core/storage/SharedPreferencesStorage;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Landroid/content/SharedPreferences;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/core/storage/SharedPreferencesStorage$sharedPrefs$2;->this$0:Lcom/stripe/android/core/storage/SharedPreferencesStorage;

    invoke-static {v0}, Lcom/stripe/android/core/storage/SharedPreferencesStorage;->access$getContext$p(Lcom/stripe/android/core/storage/SharedPreferencesStorage;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "stripe_shared_prefs"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/core/storage/SharedPreferencesStorage$sharedPrefs$2;->invoke()Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0
.end method
