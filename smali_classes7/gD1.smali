.class public final synthetic LgD1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt5;


# instance fields
.field public final synthetic b:Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ResultCallback;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ResultCallback;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LgD1;->b:Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ResultCallback;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LgD1;->b:Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ResultCallback;

    check-cast p1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;

    invoke-static {v0, p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher;->a(Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ResultCallback;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;)V

    return-void
.end method
