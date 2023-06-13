.class public final synthetic LnX0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic b:Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;

.field public final synthetic c:LGX2;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;LGX2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LnX0;->b:Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;

    iput-object p2, p0, LnX0;->c:LGX2;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    iget-object v0, p0, LnX0;->b:Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;

    iget-object v1, p0, LnX0;->c:LGX2;

    invoke-static {v0, v1, p1}, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->a(Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;LGX2;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
