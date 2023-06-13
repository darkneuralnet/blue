.class public final synthetic LyS5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic b:Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;

.field public final synthetic c:Lorg/json/JSONObject;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LyS5;->b:Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;

    iput-object p2, p0, LyS5;->c:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    iget-object v0, p0, LyS5;->b:Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;

    iget-object v1, p0, LyS5;->c:Lorg/json/JSONObject;

    invoke-static {v0, v1, p1}, Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;->w(Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;Lorg/json/JSONObject;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
